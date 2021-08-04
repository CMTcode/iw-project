package top.xmlsj.iwdata.config;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author YaoWie
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert 填充 ....");
        this.fillStrategy(metaObject, "createTime", DateUtil.date());
        this.fillStrategy(metaObject, "updateTime", DateUtil.date());
        // 起始版本 3.3.3(推荐)

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update 填充 ....");
        this.fillStrategy(metaObject, "updateTime", DateUtil.date());
        // 起始版本 3.3.3(推荐)

    }
}
