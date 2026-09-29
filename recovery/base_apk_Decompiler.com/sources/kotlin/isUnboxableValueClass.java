package kotlin;

import android.os.Messenger;

/* JADX INFO: loaded from: classes4.dex */
abstract class isUnboxableValueClass {
    public static boolean AudioAttributesCompatParcelizer(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
