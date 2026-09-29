package kotlin;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class mapArray {
    @Deprecated
    public static int write(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @Deprecated
    public static int RemoteActionCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @Deprecated
    public static void AudioAttributesCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }

    @Deprecated
    public static void RemoteActionCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }
}
