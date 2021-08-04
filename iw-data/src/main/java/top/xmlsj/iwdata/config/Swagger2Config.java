package top.xmlsj.iwdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2API文档的配置
 */
@Configuration //配置类
@EnableSwagger2// 开启Swagger2的自动配置
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
//        Profiles of = Profiles.of("dev", "test");
//        // 判断当前是否处于该环境
//        // 通过 enable() 接收此参数判断是否要显示
//        boolean b = environment.acceptsProfiles(of);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.xmlsj.iwdata.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("智能水务Swagger 文档")
                .description("智能水务接口文档")
                .contact(new Contact("YangYaoWei", null, null))
                .version("1.0")
                .build();
    }
}
