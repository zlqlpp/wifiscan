package com.cpst.wifiscan.service;

import com.cpst.wifiscan.domain.WifiName;

import java.util.List;

public interface WifiService {
    List<WifiName> findWifiName();

    int saveWifi(WifiName wifiName);
}
