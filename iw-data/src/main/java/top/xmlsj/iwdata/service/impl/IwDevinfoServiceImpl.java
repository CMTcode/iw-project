package top.xmlsj.iwdata.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import top.xmlsj.iwdata.entity.IwDevinfo;
import top.xmlsj.iwdata.entity.models.WaterMeterMeterInfo;
import top.xmlsj.iwdata.service.IwDevinfoService;
import top.xmlsj.iwdata.mapper.IwDevinfoMapper;
import org.springframework.stereotype.Service;
import top.xmlsj.iwdata.util.result.ResultUtil;

/**
 *
 */
@Service
public class IwDevinfoServiceImpl extends ServiceImpl<IwDevinfoMapper, IwDevinfo>
    implements IwDevinfoService{
    @Autowired
    private IwDevinfoMapper iwDM;

    /**
     * 插入数据
     * @return
     * @param waterMeterMeterInfo
     */
    @Override
    public boolean insertData(WaterMeterMeterInfo waterMeterMeterInfo) {
        QueryWrapper<IwDevinfo> wrapper = new QueryWrapper<>();
        wrapper.eq("devNo", waterMeterMeterInfo.getDevNo());
        if (iwDM.selectOne(wrapper) == null){
            iwDM.insert(new IwDevinfo(waterMeterMeterInfo.getProductType(), waterMeterMeterInfo.getDevNo()));
            return true;
        }
        return false;
    }
}




