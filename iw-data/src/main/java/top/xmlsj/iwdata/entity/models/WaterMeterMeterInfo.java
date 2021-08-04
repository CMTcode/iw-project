package top.xmlsj.iwdata.entity.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "水表信息")
@Data
public class WaterMeterMeterInfo {
    @ApiModelProperty(value = "产品型号",required = true)
    private String productType;

    @ApiModelProperty(value = "设备编号，即设备通讯地址",required = true)
    private String devNo;

    @ApiModelProperty(value = "设备数据",required = true)
    private DeviceData deviceData;

}
