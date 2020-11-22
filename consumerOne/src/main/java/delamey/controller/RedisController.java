package delamey.controller;

import delamey.model.UserEntity;
import delamey.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author xuyiming
 * @description
 * @date 2020-09-06 15:46
 */
@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {
    /**
     *  redis中存储的过期时间60s
     */
    private static int ExpireTime = 60;

    @Resource
    private RedisUtils redisUtil;

    @RequestMapping("set")
    public boolean redisSet(@RequestParam("key") String key, @RequestParam("value") String value){
        UserEntity userEntity =new UserEntity();
        userEntity.setId(Long.valueOf(1));
        userEntity.setGuid(String.valueOf(1));
        userEntity.setName("zhangsan");
        userEntity.setAge(String.valueOf(20));
        userEntity.setCreateTime(new Date());

        //return redisUtil.set(key,userEntity,ExpireTime);

        return redisUtil.set(key,value);
    }

    @RequestMapping("get")
    public Object redisGet(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }
}

