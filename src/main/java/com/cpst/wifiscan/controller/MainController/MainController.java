package com.cpst.wifiscan.controller.MainController;

import com.cpst.wifiscan.domain.WifiName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "wifi接口")
@RestController
@RequestMapping("/wifiscan")
public class MainController {

    @ApiOperation("查询所有wifi")
    //@RequestMapping("/findAll")
    @GetMapping("/findAll")
    public List<WifiName> findAll() {
        return new ArrayList<WifiName>();
    }
}
