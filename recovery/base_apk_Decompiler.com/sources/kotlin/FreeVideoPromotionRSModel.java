package kotlin;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class FreeVideoPromotionRSModel {
    private static final ThreadLocal IconCompatParcelizer = new ThreadLocal();

    private static String RemoteActionCompatParcelizer(final String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: o.FreeVideoPromotionRSModel.4
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return Security.getProperty(str);
            }
        });
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) IconCompatParcelizer.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: o.FreeVideoPromotionRSModel.1
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return System.getProperty(str);
            }
        }) : str2;
    }

    public static boolean AudioAttributesCompatParcelizer(String str) {
        try {
            return write(RemoteActionCompatParcelizer(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    private static boolean write(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        return (str.charAt(0) == 't' || str.charAt(0) == 'T') && (str.charAt(1) == 'r' || str.charAt(1) == 'R') && ((str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E'));
    }
}
