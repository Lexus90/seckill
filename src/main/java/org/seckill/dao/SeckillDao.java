package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 17/1/21.
 */
public interface SeckillDao {
    /**
     * 减库存,
     * @param seckillId
     * @param  killTime
     * @return 如果影响行数为1,标示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据ID查询秒杀对象
     * @Param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /*
    * 根据偏移量查询秒杀商品列表
    * @param offset
    * @param limit
    * @return
    * */
    //    java 没有保存形参的记录
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
