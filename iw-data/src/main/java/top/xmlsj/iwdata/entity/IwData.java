package top.xmlsj.iwdata.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author YaoWei
 * @TableName iw_data
 */
@TableName(value ="iw_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IwData implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 接收数据
     */
    @TableField(value = "data_json")
    private String dataJson;

    /**
     * 创建时间
     */
    @TableField(value = "createTime",fill = FieldFill.INSERT)
    private Date createTime;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public IwData(String dataJson) {
        this.dataJson = dataJson;
    }

}
