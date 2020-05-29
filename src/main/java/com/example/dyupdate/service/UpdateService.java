package com.example.dyupdate.service;

import com.example.dyupdate.dao.UpdateDao;
import com.example.dyupdate.entity.Update;
import com.example.dyupdate.utils.RedisUtils;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {

    @Autowired
    private UpdateDao updateDao;

    @Autowired
    private RedissonClient redissonClient;

    public Update getUpdateDetail(Integer gameId, Integer platform, String channelId) {

        String key = RedisUtils.keySplice(gameId, platform, channelId);
        RBucket<Update> updateRBucket = redissonClient.getBucket(key);
        Update updateDetail = updateRBucket.get();
        if (updateDetail == null) {
            updateDetail = updateDao.getUpdateDetail(gameId, platform, channelId);
            updateRBucket.set(updateDetail);
        }
        return updateDetail;
    }
}
