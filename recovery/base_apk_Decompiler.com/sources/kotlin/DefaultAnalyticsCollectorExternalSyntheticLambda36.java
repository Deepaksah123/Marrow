package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda68;
import kotlin.Metadata;
import kotlin.lambdaonVideoDisabled18;
import kotlin.lambdaonVideoFrameProcessingOffset20;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0012J\u000f\u0010\u000b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J+\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda36;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "write", "(Landroid/content/Context;)Ljava/lang/String;", "", "", "AudioAttributesCompatParcelizer", "(J)I", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda32;", "p1", "p2", "p3", "", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda35;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda35;Ljava/lang/String;)V", "", "[J", "read", "Ljava/lang/String;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda36 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda36 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda36();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final String write = DefaultAnalyticsCollectorExternalSyntheticLambda36.class.getCanonicalName();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final long[] read = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private DefaultAnalyticsCollectorExternalSyntheticLambda36() {
    }

    @getMagicModuleMeta
    public static final void write(String str, String str2, Context context) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda36.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(context, "");
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", INSTANCE.write(context));
            bundle.putString("fb_mobile_app_cert_hash", r8lambdaarw8y8gX8VbZnwUqj9SeLzE0xCg.read(context));
            lambdaonVideoFrameProcessingOffset20 lambdaonvideoframeprocessingoffset20 = new lambdaonVideoFrameProcessingOffset20(str, str2);
            lambdaonvideoframeprocessingoffset20.IconCompatParcelizer("fb_mobile_activate_app", bundle);
            lambdaonVideoFrameProcessingOffset20.Companion companion = lambdaonVideoFrameProcessingOffset20.INSTANCE;
            if (lambdaonVideoFrameProcessingOffset20.Companion.RemoteActionCompatParcelizer() != lambdaonVideoDisabled18.RemoteActionCompatParcelizer.EXPLICIT_ONLY) {
                lambdaonvideoframeprocessingoffset20.IconCompatParcelizer();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda36.class);
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(String p0, DefaultAnalyticsCollectorExternalSyntheticLambda35 p1, String p2) {
        long jLongValue;
        String string;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda36.class)) {
            return;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p1 == null) {
                return;
            }
            Long lRemoteActionCompatParcelizer = p1.RemoteActionCompatParcelizer();
            if (lRemoteActionCompatParcelizer != null) {
                jLongValue = lRemoteActionCompatParcelizer.longValue();
            } else {
                Long iconCompatParcelizer = p1.getIconCompatParcelizer();
                jLongValue = 0 - (iconCompatParcelizer != null ? iconCompatParcelizer.longValue() : 0L);
            }
            if (jLongValue < 0) {
                INSTANCE.AudioAttributesCompatParcelizer();
                jLongValue = 0;
            }
            long j = p1.read();
            if (j < 0) {
                INSTANCE.AudioAttributesCompatParcelizer();
                j = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", p1.getRead());
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(AudioAttributesCompatParcelizer(jLongValue))}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            bundle.putString("fb_mobile_time_between_sessions", str);
            DefaultAnalyticsCollectorExternalSyntheticLambda32 audioAttributesImplApi26Parcelizer = p1.getAudioAttributesImplApi26Parcelizer();
            if (audioAttributesImplApi26Parcelizer == null || (string = audioAttributesImplApi26Parcelizer.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long iconCompatParcelizer2 = p1.getIconCompatParcelizer();
            bundle.putLong("_logTime", (iconCompatParcelizer2 != null ? iconCompatParcelizer2.longValue() : 0L) / 1000);
            new lambdaonVideoFrameProcessingOffset20(p0, p2).read("fb_mobile_deactivate_app", j / 1000.0d, bundle);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda36.class);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
            lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.APP_EVENTS;
            String str = write;
            toMagicModuleMetaRepoModel.write((Object) str);
            readVar.IconCompatParcelizer(lambdaonpositiondiscontinuity43, str, "Clock skew detected");
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    @getMagicModuleMeta
    private static int AudioAttributesCompatParcelizer(long p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda36.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = read;
                if (i >= jArr.length || jArr[i] >= p0) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda36.class);
                return 0;
            }
        }
        return i;
    }

    private String write(Context p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                PackageManager packageManager = p0.getPackageManager();
                String str = packageManager.getPackageInfo(p0.getPackageName(), 0).versionName;
                StringBuilder sb = new StringBuilder("PCKGCHKSUM;");
                sb.append(str);
                String string = sb.toString();
                SharedPreferences sharedPreferences = p0.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                String string2 = sharedPreferences.getString(string, null);
                if (string2 != null && string2.length() == 32) {
                    return string2;
                }
                String strAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda34.AudioAttributesCompatParcelizer(p0);
                if (strAudioAttributesCompatParcelizer == null) {
                    strAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda34.AudioAttributesCompatParcelizer(packageManager.getApplicationInfo(p0.getPackageName(), 0).sourceDir);
                }
                sharedPreferences.edit().putString(string, strAudioAttributesCompatParcelizer).apply();
                return strAudioAttributesCompatParcelizer;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }
}
