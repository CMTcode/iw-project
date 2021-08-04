package top.xmlsj.iwdata.service;

import org.apache.ibatis.annotations.Param;
import top.xmlsj.iwdata.entity.IwData;
import top.xmlsj.iwdata.entity.IwDevinfo;
import com.baomidou.mybatisplus.extension.service.IService;
import top.xmlsj.iwdata.entity.models.WaterMeterMeterInfo;

/**
 *
 */
public interface IwDevinfoService extends IService<IwDevinfo> {

    /**
     * 插入数据
     * @return
     * @param waterMeterMeterInfo
     */
    boolean insertData(@Param("waterMeterMeterInfo") WaterMeterMeterInfo waterMeterMeterInfo);
}
