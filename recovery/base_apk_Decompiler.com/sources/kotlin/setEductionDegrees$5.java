package kotlin;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
/* synthetic */ class setEductionDegrees$5 {
    static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[setEductionDegrees$AudioAttributesCompatParcelizer.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[setEductionDegrees$AudioAttributesCompatParcelizer.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[setEductionDegrees$AudioAttributesCompatParcelizer.READY_PLAYBACK_URL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[setEductionDegrees$AudioAttributesCompatParcelizer.READY_LICENSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(596416660);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) Color.red(0), 24556 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 24, 1573215233, false, "values", new Class[0]);
            }
            int[] iArr2 = new int[((Object[]) ((Method) objRemoteActionCompatParcelizer).invoke(null, null)).length];
            IconCompatParcelizer = iArr2;
            try {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(668301142);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.green(0) + 24556, 24 - TextUtils.getOffsetAfter("", 0), 1503441859, false, "write", null);
                }
                iArr2[((Enum) ((Field) objRemoteActionCompatParcelizer2).get(null)).ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
