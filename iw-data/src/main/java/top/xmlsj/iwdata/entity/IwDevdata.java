package top.xmlsj.iwdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName iw_devdata
 */
@TableName(value ="iw_devdata")
@Data
public class IwDevdata implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 设备编号
     */
    @TableField(value = "devNo")
    private String devNo;

    /**
     * 摄像图片文件名称URL
     */
    @TableField(value = "fileName")
    private String fileName;

    /**
     * 实时抄表值 1（累计用水量， 单位吨）
     */
    @TableField(value = "dataValue")
    private Double dataValue;

    /**
     * 电池电量（单位: %
     */
    @TableField(value = "batteryLevel")
    private String batteryLevel;

    /**
     * 信号强度（单位：dB）
     */
    @TableField(value = "signalStrength")
    private String signalStrength;

    /**
     * 数据更新时间，例如：“2019-10-25 14:19:48”
     */
    @TableField(value = "updateDateTime")
    private Date updateDateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}