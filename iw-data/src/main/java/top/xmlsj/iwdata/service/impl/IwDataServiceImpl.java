package top.xmlsj.iwdata.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import top.xmlsj.iwdata.entity.IwData;
import top.xmlsj.iwdata.service.IwDataService;
import top.xmlsj.iwdata.mapper.IwDataMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author YaoWei
 */
@Service
public class IwDataServiceImpl extends ServiceImpl<IwDataMapper, IwData>
    implements IwDataService{

    @Autowired
    private IwDataMapper iwDataMapper;

    /**
     * 插入数据
     * @return
     * @param iwData
     */
    @Override
    public Object insertData(IwData iwData) {
        return iwDataMapper.insert(iwData);
    }

    /**
     * 批量插入数据
     * @param iwData
     * @return
     */
    @Override
    public Integer bulkInsertData(Collection<IwData> iwData) {
        return iwDataMapper.insertBatchSomeColumn(iwData);
    }


}




