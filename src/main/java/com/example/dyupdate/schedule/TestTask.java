package com.example.dyupdate.schedule;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.example.dyupdate.annotation.ElasticJob;


@ElasticJob(cron = "0/10 * * * * ?")
public class TestTask implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {

        System.out.println("Elastic Job Test Success " + Thread.currentThread().getName() + ", id:" + shardingContext.getShardingItem() + ", total:"
                + shardingContext.getShardingTotalCount() + ", P:" + shardingContext.getShardingParameter());
    }
}
