package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda2 {
    static /* synthetic */ void read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda2.class)) {
            return;
        }
        try {
            IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda2.class);
        }
    }

    public static void AudioAttributesCompatParcelizer(Context context) {
        DefaultAnalyticsCollectorExternalSyntheticLambda22 defaultAnalyticsCollectorExternalSyntheticLambda22;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda2.class)) {
            return;
        }
        try {
            if (DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.Purchase") == null || (defaultAnalyticsCollectorExternalSyntheticLambda22 = DefaultAnalyticsCollectorExternalSyntheticLambda22.read(context)) == null || !DefaultAnalyticsCollectorExternalSyntheticLambda22.write.get()) {
                return;
            }
            if (DefaultAnalyticsCollectorExternalSyntheticLambda24.read()) {
                defaultAnalyticsCollectorExternalSyntheticLambda22.IconCompatParcelizer("inapp", new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            DefaultAnalyticsCollectorExternalSyntheticLambda2.read();
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    }
                });
            } else {
                defaultAnalyticsCollectorExternalSyntheticLambda22.AudioAttributesCompatParcelizer("inapp", new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda2.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            DefaultAnalyticsCollectorExternalSyntheticLambda2.read();
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda2.class);
        }
    }

    private static void IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda2.class)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda24.write(DefaultAnalyticsCollectorExternalSyntheticLambda22.read, DefaultAnalyticsCollectorExternalSyntheticLambda22.AudioAttributesCompatParcelizer);
            DefaultAnalyticsCollectorExternalSyntheticLambda22.read.clear();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda2.class);
        }
    }
}
