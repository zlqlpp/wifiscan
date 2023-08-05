package com.cpst.wifiscan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cpst.wifiscan.domain.WifiName;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WifiNameMapper extends BaseMapper<WifiName> {

    public List<WifiName> findWifiName();
}