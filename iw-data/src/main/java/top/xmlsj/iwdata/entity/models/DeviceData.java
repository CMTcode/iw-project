package top.xmlsj.iwdata.entity.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Auto-generated: 2021-08-04 14:4:42
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@ApiModel(description = "设备数据")
@Data
public class DeviceData {
    @ApiModelProperty(value = "摄像图片文件名称 URL",required = true)
    private String fileName;

    @ApiModelProperty(value = "实时抄表值 1（累计用水量， 单位吨）",required = true)
    private String dataValue1;

    @ApiModelProperty(value = "电池电量（单位: %")
    private String batteryLevel;

    @ApiModelProperty(value = "信号强度（单位：dB） ")
    private String signalStrength;

    @ApiModelProperty(value = "数据更新时间，例如：“2019-10-25 14:19:48”",required = true)
    private Date updateDateTime;


}