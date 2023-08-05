package com.cpst.wifiscan.controller.MainController;

import com.cpst.wifiscan.domain.WifiName;
import com.cpst.wifiscan.service.WifiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "wifi接口")
@RestController
@RequestMapping("/wifiscan")
@Slf4j
public class MainController {

    @Autowired
    private WifiService wifiService;
    @ApiOperation("查询所有wifi")
    //@RequestMapping("/findAll")
    @GetMapping("/findAll")
    public List<WifiName> findAll() {
        log.info("findAll");
        return wifiService.findWifiName();
    }
}
