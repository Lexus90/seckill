package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by admin on 17/1/24.
 */
public class SeckillCloseException  extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
