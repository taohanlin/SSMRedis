package org.thl.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.thl.service.IRedisService;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import javax.annotation.Resource;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:13
 */
@Component
@Transactional(readOnly = true)
public class RedisServiceImpl implements IRedisService {

    @Resource
    private ShardedJedisPool shardedJedisPool;

    @Override
    public void setValue(String key, String val) {
        ShardedJedis jedis = null;
        try {
            jedis = shardedJedisPool.getResource();
            jedis.set(key, val);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null)
                jedis.close();
        }
    }

    @Override
    public String getValue(String key) {
        ShardedJedis jedis = null;
        
        jedis = shardedJedisPool.getResource();
        return jedis.get(key);
    }
}
