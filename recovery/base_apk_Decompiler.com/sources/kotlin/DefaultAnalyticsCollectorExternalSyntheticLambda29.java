package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\f\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\u0015"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda29;", "", "<init>", "()V", "", "IconCompatParcelizer", "read", "", "p0", "", "RemoteActionCompatParcelizer", "([B)Ljava/lang/String;", "write", "()Ljava/lang/String;", "Landroid/app/Activity;", "Landroid/view/View;", "(Landroid/app/Activity;)Landroid/view/View;", "", "AudioAttributesCompatParcelizer", "()Z", "", "(Ljava/lang/String;)D"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda29 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda29 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda29();

    @getMagicModuleMeta
    public static final void IconCompatParcelizer() {
    }

    @getMagicModuleMeta
    public static final void read() {
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda29() {
    }

    @getMagicModuleMeta
    public static final double write(String p0) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(p0);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(byte[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : p0) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            stringBuffer.append(str);
        }
        String string = stringBuffer.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @getMagicModuleMeta
    public static final boolean AudioAttributesCompatParcelizer() {
        String str = Build.FINGERPRINT;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "generic")) {
            return true;
        }
        String str2 = Build.FINGERPRINT;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str2, "unknown")) {
            return true;
        }
        String str3 = Build.MODEL;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        if (TestGroupLSModel.write((CharSequence) str3, (CharSequence) "google_sdk", false)) {
            return true;
        }
        String str4 = Build.MODEL;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        if (TestGroupLSModel.write((CharSequence) str4, (CharSequence) "Emulator", false)) {
            return true;
        }
        String str5 = Build.MODEL;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        if (TestGroupLSModel.write((CharSequence) str5, (CharSequence) "Android SDK built for x86", false)) {
            return true;
        }
        String str6 = Build.MANUFACTURER;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        if (TestGroupLSModel.write((CharSequence) str6, (CharSequence) "Genymotion", false)) {
            return true;
        }
        String str7 = Build.BRAND;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str7, "generic")) {
            String str8 = Build.DEVICE;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str8, "");
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str8, "generic")) {
                return true;
            }
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "google_sdk", (Object) Build.PRODUCT);
    }

    @getMagicModuleMeta
    public static final String write() {
        Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
        try {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            String str = contextAudioAttributesCompatParcelizer.getPackageManager().getPackageInfo(contextAudioAttributesCompatParcelizer.getPackageName(), 0).versionName;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @getMagicModuleMeta
    public static final View read(Activity p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda29.class) || p0 == null) {
            return null;
        }
        try {
            Window window = p0.getWindow();
            if (window == null) {
                return null;
            }
            View decorView = window.getDecorView();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
            return decorView.getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda29.class);
            return null;
        }
    }
}
