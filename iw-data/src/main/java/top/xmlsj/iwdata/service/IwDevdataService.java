package top.xmlsj.iwdata.service;

import org.apache.ibatis.annotations.Param;
import top.xmlsj.iwdata.entity.IwDevdata;
import com.baomidou.mybatisplus.extension.service.IService;
import top.xmlsj.iwdata.entity.models.WaterMeterMeterInfo;

/**
 *
 */
public interface IwDevdataService extends IService<IwDevdata> {
    /**
     * 插入数据
     * @return
     * @param WaterMeterMeterInfo
     */
    boolean insertData(@Param("waterMeterMeterInfo") WaterMeterMeterInfo waterMeterMeterInfo);
}
