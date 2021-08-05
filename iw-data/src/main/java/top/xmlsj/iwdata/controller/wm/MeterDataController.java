package top.xmlsj.iwdata.controller.wm;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.xmlsj.iwdata.entity.IwData;
import top.xmlsj.iwdata.entity.IwDevinfo;
import top.xmlsj.iwdata.entity.models.WaterMeterMeterInfo;
import top.xmlsj.iwdata.mapper.IwDataMapper;
import top.xmlsj.iwdata.mapper.IwDevinfoMapper;
import top.xmlsj.iwdata.service.impl.IwDataServiceImpl;
import top.xmlsj.iwdata.service.impl.IwDevdataServiceImpl;
import top.xmlsj.iwdata.service.impl.IwDevinfoServiceImpl;
import top.xmlsj.iwdata.util.numUtil.NumUtils;
import top.xmlsj.iwdata.util.result.ResultUtil;

import java.util.Date;

/**
 * 水表数据接收端
 *
 * @author YaoWei
 */
@Slf4j
@Api(tags = "水表数据接收端", description = "处理水表设备数据")
@RestController
@RequestMapping(value = "/wm")
public class MeterDataController {
    @Autowired
    IwDataServiceImpl iw;
    @Autowired
    IwDevinfoServiceImpl iwds;
    @Autowired
    IwDevdataServiceImpl iwdds;

    @ApiOperation("接收水表设备数据")
    @PostMapping("/data/receive")
    public ResultUtil receiveWaterMeterData(@RequestBody WaterMeterMeterInfo waterMeterMeterInfo) {
//        判断 DataValue1数据是否格式正确
        if (NumUtils.isNumeric(waterMeterMeterInfo.getDeviceData().getDataValue1())){
            //        把接收数据入库
            iw.insertData(new IwData(JSON.toJSONString(waterMeterMeterInfo)));
//        当有新表时插入
            if (iwds.insertData(waterMeterMeterInfo)) {
                log.debug("新设备增加" + " : " + waterMeterMeterInfo.getDevNo());
            }
//            插入Dev数据表
            iwdds.insertData(waterMeterMeterInfo);
            return new ResultUtil(200, "数据传入成功", null);
        }
        return new ResultUtil(409,"传入参数错误",null);
    }


}
