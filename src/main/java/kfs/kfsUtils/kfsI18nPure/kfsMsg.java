package kfs.kfsUtils.kfsI18nPure;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author pavedrim
 */
public class kfsMsg {

    private final boolean throwable;
    private final String bundle;
    private final ResourceBundle messages;

    kfsMsg(Locale loc, boolean throwable, String bundle) {
        this.throwable = throwable;
        this.bundle = bundle;
        messages = ResourceBundle.getBundle(bundle, loc);
        if (messages == null) {
            throw new kfsMsgException("Cannot load messages for locales: " + loc.getCountry() + " " + loc.getLanguage());
        }
    }

    boolean isInit() {
        return messages != null;
    }
    
    public String msg(String id) {
        String ret = null;
        try {
            ret = messages.getString(id);
        } catch (Exception ex) {
            if (throwable) {
                throw new kfsMsgException("Msg not defined for id: " + id);
            }
        }
        if (ret == null) {
            ret = id;
        }
        return ret;
    }

    public String msg(String id, String subst) {
        String ret = msg(id);
        if (ret != null) {
            ret = ret.replaceAll("%s", subst);
        }
        return ret;
    }
}
