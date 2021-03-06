package top.xmlsj.iwdata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import top.xmlsj.iwdata.entity.IwDevdata;
import top.xmlsj.iwdata.entity.models.DeviceData;
import top.xmlsj.iwdata.entity.models.WaterMeterMeterInfo;
import top.xmlsj.iwdata.service.IwDevdataService;
import top.xmlsj.iwdata.mapper.IwDevdataMapper;
import org.springframework.stereotype.Service;
import top.xmlsj.iwdata.util.numUtil.NumUtils;

/**
 *
 */
@Service
public class IwDevdataServiceImpl extends ServiceImpl<IwDevdataMapper, IwDevdata>
    implements IwDevdataService{

    @Autowired
    IwDevdataMapper iwDevdataMapper;

    @Override
    public boolean insertData(WaterMeterMeterInfo waterMeterMeterInfo) {
//        判断DataValue1是否是数字 是数字才能转
        if (NumUtils.isNumeric(waterMeterMeterInfo.getDeviceData().getDataValue1())) {
            DeviceData deviceData = waterMeterMeterInfo.getDeviceData();
            IwDevdata devData = new IwDevdata();
            devData.setDevNo(waterMeterMeterInfo.getDevNo());
            devData.setDataValue(Double.valueOf(deviceData.getDataValue1()));
            devData.setBatteryLevel(deviceData.getBatteryLevel());
            devData.setSignalStrength(deviceData.getSignalStrength());
            devData.setFileName(deviceData.getFileName());
            devData.setUpdateDateTime(deviceData.getUpdateDateTime());
            return iwDevdataMapper.insert(devData) > 0;
        }
        return false;
    }
}




