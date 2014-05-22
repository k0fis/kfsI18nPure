package kfs.kfsI18nPure;

/**
 *
 * @author pavedrim
 */
public class kfsMsgException extends RuntimeException {

    public kfsMsgException(String msg) {
        super(msg);
    }
    
    public kfsMsgException(String msg, Throwable t) {
        super(msg, t);
    }
}
