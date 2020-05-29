package com.example.dyupdate.configuration;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonAutoConfiguration {

    @Autowired
    private RedisProperties redisProperties;

    @Bean
    public RedissonClient redissonClient(){
        Config config = new Config();
        String[] addresses = redisProperties.getSentinel().getNodes().stream()
                .map(addr -> "redis://" + addr)
                .toArray(String[]::new);

        config.useSentinelServers()
                .setMasterName(redisProperties.getSentinel().getMaster())
                .addSentinelAddress(addresses)
                .setTimeout((int) redisProperties.getTimeout().toMillis())
                .setPassword(redisProperties.getPassword().equals("") ? null : redisProperties.getPassword())
                .setDatabase(redisProperties.getDatabase());

        return Redisson.create(config);
    }
}
