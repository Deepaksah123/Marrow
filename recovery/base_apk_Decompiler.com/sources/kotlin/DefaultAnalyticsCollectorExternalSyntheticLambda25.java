package kotlin;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda25 {
    private static DefaultAnalyticsCollectorExternalSyntheticLambda25 RemoteActionCompatParcelizer;
    private static final AtomicBoolean write = new AtomicBoolean(false);
    private final Method AudioAttributesCompatParcelizer;
    private final Class<?> AudioAttributesImplApi26Parcelizer;
    private final Method AudioAttributesImplBaseParcelizer;
    private final Class<?> IconCompatParcelizer;
    private final Method MediaBrowserCompatCustomActionResultReceiver;
    private final Method read;

    private DefaultAnalyticsCollectorExternalSyntheticLambda25(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.AudioAttributesImplApi26Parcelizer = cls;
        this.IconCompatParcelizer = cls2;
        this.AudioAttributesCompatParcelizer = method;
        this.AudioAttributesImplBaseParcelizer = method2;
        this.MediaBrowserCompatCustomActionResultReceiver = method3;
        this.read = method4;
    }

    public static DefaultAnalyticsCollectorExternalSyntheticLambda25 write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda25.class)) {
            return null;
        }
        try {
            AtomicBoolean atomicBoolean = write;
            if (atomicBoolean.get()) {
                return RemoteActionCompatParcelizer;
            }
            RemoteActionCompatParcelizer();
            atomicBoolean.set(true);
            return RemoteActionCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda25.class);
            return null;
        }
    }

    private static void RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda25.class)) {
            return;
        }
        try {
            Class<?> clsAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.SkuDetailsParams");
            Class<?> clsAudioAttributesCompatParcelizer2 = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsAudioAttributesCompatParcelizer == null || clsAudioAttributesCompatParcelizer2 == null) {
                return;
            }
            Method methodWrite = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, "newBuilder", new Class[0]);
            Method methodWrite2 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer2, "setType", String.class);
            Method methodWrite3 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer2, "setSkusList", List.class);
            Method methodWrite4 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer2, "build", new Class[0]);
            if (methodWrite == null || methodWrite2 == null || methodWrite3 == null || methodWrite4 == null) {
                return;
            }
            RemoteActionCompatParcelizer = new DefaultAnalyticsCollectorExternalSyntheticLambda25(clsAudioAttributesCompatParcelizer, clsAudioAttributesCompatParcelizer2, methodWrite, methodWrite2, methodWrite3, methodWrite4);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda25.class);
        }
    }

    public final Class<?> read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            return this.AudioAttributesImplApi26Parcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    public final Object write(String str, List<String> list) {
        Object objWrite;
        Object objWrite2;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            Object objWrite3 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, null, new Object[0]);
            if (objWrite3 == null || (objWrite = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, objWrite3, str)) == null || (objWrite2 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, objWrite, list)) == null) {
                return null;
            }
            return DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.IconCompatParcelizer, this.read, objWrite2, new Object[0]);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }
}
