package top.xmlsj.iwdata.service;

import org.apache.ibatis.annotations.Param;
import top.xmlsj.iwdata.entity.IwData;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author YaoWei
 */
public interface IwDataService extends IService<IwData> {

    /**
     * 插入数据
     * @return
     * @param iwData
     */
    Object insertData(@Param("iwData")IwData iwData);

    /**
     * 批量插入数据
     * @param iwData
     * @return
     */
    Integer bulkInsertData(@Param("iwData") Collection<IwData> iwData);
}
