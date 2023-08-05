package com.cpst.wifiscan.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "wifi信息")
@TableName(value = "wifi_name")
public class WifiName {

    @ApiModelProperty("wifi账号")
    private String wifiName;
    @ApiModelProperty("wifi密码")
    private String wifiPwd;
}
