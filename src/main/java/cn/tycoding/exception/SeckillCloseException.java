package cn.tycoding.exception;

/**
 * 秒杀关闭异常
 * @auther lf
 * @date 2022/12/12
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
