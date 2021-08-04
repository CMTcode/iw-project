package top.xmlsj.iwdata.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.xmlsj.iwdata.util.mybatisUtils.EasySqlInjector;


/**
 * mybatisPls 配置文件
 * @author YaoWei
 */
@Configuration
@MapperScan("top.xmlsj.iwdata.mapper")
public class MybatisPlusConfig {



    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        分页插件
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.H2));
        return interceptor;
    }


    @Bean
    public EasySqlInjector easySqlInjector() {
        return new EasySqlInjector();
    }
}
