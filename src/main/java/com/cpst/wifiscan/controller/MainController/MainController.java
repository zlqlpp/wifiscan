package com.cpst.wifiscan.controller.MainController;

import com.alibaba.fastjson.JSONObject;
import com.cpst.wifiscan.domain.WifiName;
import com.cpst.wifiscan.service.WifiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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


    @ApiOperation("保存wifi")
    @ResponseBody
    @PostMapping("/addWifi")
    public int addWifi(@RequestBody JSONObject jsonParam, HttpServletRequest request) {
        log.info("addWifi");
        // 直接将json信息打印出来
        System.out.println(jsonParam.toJSONString());

        String hotel = request.getParameter("hotelName");
        String wifiName =  request.getParameter("wifiName");
        String wifiPwd = request.getParameter("wifiPwd");

        WifiName wifi = new WifiName();
        wifi.setWifiName(jsonParam.get("wifiName").toString());
        wifi.setWifiPwd(jsonParam.get("wifiPwd").toString());

        return wifiService.saveWifi(wifi);
    }
}
