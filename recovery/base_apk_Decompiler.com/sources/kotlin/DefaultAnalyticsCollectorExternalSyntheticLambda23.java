package kotlin;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda58;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda23 {
    private static final AtomicBoolean AudioAttributesCompatParcelizer = new AtomicBoolean(false);

    public static void read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda23.class)) {
            return;
        }
        try {
            AudioAttributesCompatParcelizer.set(true);
            AudioAttributesCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda23.class);
        }
    }

    public static void AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda23.class)) {
            return;
        }
        try {
            if (AudioAttributesCompatParcelizer.get()) {
                if (write() && DefaultAnalyticsCollectorExternalSyntheticLambda58.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda58.RemoteActionCompatParcelizer.IapLoggingLib2)) {
                    DefaultAnalyticsCollectorExternalSyntheticLambda2.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());
                } else {
                    DefaultAnalyticsCollectorExternalSyntheticLambda19.RemoteActionCompatParcelizer();
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda23.class);
        }
    }

    private static boolean write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda23.class)) {
            return false;
        }
        try {
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            ApplicationInfo applicationInfo = contextAudioAttributesCompatParcelizer.getPackageManager().getApplicationInfo(contextAudioAttributesCompatParcelizer.getPackageName(), 128);
            if (applicationInfo != null) {
                if (Integer.parseInt(((PackageItemInfo) applicationInfo).metaData.getString("com.google.android.play.billingclient.version").split("\\.", 3)[0]) >= 2) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda23.class);
            return false;
        }
    }
}
