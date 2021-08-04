package top.xmlsj.iwdata.util.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultUtil {

    private Integer state;

    private Object msg;

    private Object err;

    public static Object defaultSucceedResult(Object msg){
        return new ResultUtil(200,msg,null);
    }

    public static Object defaultFailResult(Object msg,Object err){
        return new ResultUtil(409,msg,err);
    }
}
