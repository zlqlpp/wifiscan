package com.cpst.wifiscan.service.impl;

import com.cpst.wifiscan.domain.WifiName;
import com.cpst.wifiscan.mapper.WifiNameMapper;
import com.cpst.wifiscan.service.WifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WifiServiceImpl   implements WifiService {

    @Autowired
    private WifiNameMapper wifiNameMapper;

    @Override
    public List<WifiName> findWifiName(){

        return wifiNameMapper.findWifiName();
    }

    @Override
    public int saveWifi(WifiName wifiName){

        return wifiNameMapper.insert(wifiName);
    }

}
