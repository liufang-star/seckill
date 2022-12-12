package cn.tycoding.exception;

/**
 * 秒杀相关的异常
 *
 * @auther lf
 * @date 2022/12/12
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
