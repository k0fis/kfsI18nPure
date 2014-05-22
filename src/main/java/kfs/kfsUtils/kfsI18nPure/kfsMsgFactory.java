package kfs.kfsUtils.kfsI18nPure;

import java.util.HashMap;
import java.util.Locale;

/**
 *
 * @author pavedrim
 */
public class kfsMsgFactory {

    private static final boolean throwable = true;
    private static final String bundle = "MessagesBundle";
    private static final HashMap<Locale, kfsMsg> instances = new HashMap<Locale, kfsMsg>();

    public static kfsMsg get() {
        return get(Locale.getDefault(), bundle, throwable);
    }

    public static kfsMsg get(Locale loc) {
        return get(loc, bundle, throwable);
    }

    public static kfsMsg get(Locale loc, String bundle) {
        return get(loc, bundle, throwable);
    }

    public static synchronized kfsMsg get(Locale loc, String bundle, boolean throwable) {
        kfsMsg ret = instances.get(loc);
        if (ret == null) {
            ret = new kfsMsg(loc, throwable, bundle);
            if (ret.isInit()) {
                instances.put(loc, ret);
            } else {
                return null;
            }
        }
        return ret;
    }

}
