package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by admin on 17/1/21.
 */
public interface SuccessKilledDao {
    /*
    * 插入购买明细,可过滤重复
    * @param seckillId
    * @param userPhone
    * @return
    * 插入的行数
    * */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据ID查询SuccessKilled并携带seckill实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}