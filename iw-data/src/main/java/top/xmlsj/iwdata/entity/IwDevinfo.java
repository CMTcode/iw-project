package top.xmlsj.iwdata.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName iw_devinfo
 */
@TableName(value ="iw_devinfo")
@Data
@NoArgsConstructor
public class IwDevinfo implements Serializable {
    /**
     * 采用雪花算法
     */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 产品型号
     */
    @TableField(value = "productType")
    private String productType;

    /**
     * 设备编号，即设备通讯地址
     */
    @TableField(value = "devNo")
    private String devNo;

    /**
     * 区域名
     */
    @TableField(value = "areaName")
    private String areaName;

    /**
     * 区域内分组
     */
    @TableField(value = "intraRegionGrouping")
    private String intraRegionGrouping;

    /**
     * 设备地址
     */
    @TableField(value = "devAdd")
    private String devAdd;

    /**
     * 创建时间
     */
    @TableField(value = "createTime",fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public IwDevinfo(String productType, String devNo) {
        this.productType = productType;
        this.devNo = devNo;
    }
}