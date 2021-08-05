package top.xmlsj.iwdata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.xmlsj.iwdata.util.numUtil.NumUtils;

@SpringBootTest
class IwDataApplicationTests {

    @Test
    void contextLoads() {
        String str = "2.01";
        System.err.println(NumUtils.isNumeric(str));
    }

}
