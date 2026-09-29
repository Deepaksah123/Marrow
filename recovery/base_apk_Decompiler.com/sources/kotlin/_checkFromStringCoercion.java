package kotlin;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class _checkFromStringCoercion {
    @Deprecated
    public static IBinder read(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    @Deprecated
    public static void AudioAttributesCompatParcelizer(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
