package com.example.dyupdate.dao;

import com.example.dyupdate.entity.Update;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UpdateDao {

    Update getUpdateDetail(@Param("gameId") Integer gameId,@Param("platform") Integer platform,@Param("channelId") String channelId);
}
