package top.xmlsj.iwdata.util.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultUtil {

    private Integer state;

    private String msg;

    private Object err;

    public static ResultUtil defaultSucceedResult(String msg){
        return new ResultUtil(200,msg,null);
    }

    public static ResultUtil defaultFailResult(String msg,Object err){
        return new ResultUtil(409,msg,err);
    }
}
