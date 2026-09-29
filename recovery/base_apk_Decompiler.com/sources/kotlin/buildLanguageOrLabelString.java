package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012"}, d2 = {"Lo/buildLanguageOrLabelString;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/buildLanguageString;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Lo/buildLanguageString;", "", "read", "(Landroid/content/Context;)Z", "AudioAttributesCompatParcelizer", "()Z", "write", "IconCompatParcelizer", "", "", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class buildLanguageOrLabelString {
    public static final buildLanguageOrLabelString INSTANCE = new buildLanguageOrLabelString();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final List<String> RemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"arc-", "arc.", "arc-bridge", "crosvm", "garcon"});

    private buildLanguageOrLabelString() {
    }

    public static buildLanguageString RemoteActionCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new buildLanguageString(read(p0), AudioAttributesCompatParcelizer(), write(), read(), IconCompatParcelizer(), IconCompatParcelizer(p0));
    }

    private static boolean read(Context p0) {
        PackageManager packageManager = p0.getPackageManager();
        return packageManager.hasSystemFeature("org.chromium.arc") || packageManager.hasSystemFeature("org.chromium.arc.device_management");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean AudioAttributesCompatParcelizer() {
        /*
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = ""
            if (r0 == 0) goto L11
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r2)
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r1)
            if (r0 != 0) goto L12
        L11:
            r0 = r1
        L12:
            java.lang.String r2 = android.os.Build.MODEL
            if (r2 != 0) goto L17
            r2 = r1
        L17:
            java.lang.String r3 = android.os.Build.BRAND
            if (r3 == 0) goto L26
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r3, r1)
            if (r3 != 0) goto L27
        L26:
            r3 = r1
        L27:
            java.lang.String r4 = android.os.Build.MANUFACTURER
            if (r4 == 0) goto L38
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r4, r1)
            if (r4 != 0) goto L37
            goto L38
        L37:
            r1 = r4
        L38:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r4 = "cheets"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r0 = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(r0, r4)
            if (r0 != 0) goto L65
            java.lang.String r0 = "sdk_gpc_"
            boolean r0 = kotlin.TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(r2, r0)
            if (r0 != 0) goto L65
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r0 = "chromium"
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(r3, r2)
            if (r2 != 0) goto L65
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(r1, r0)
            if (r0 != 0) goto L65
            r0 = 0
            return r0
        L65:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildLanguageOrLabelString.AudioAttributesCompatParcelizer():boolean");
    }

    private static boolean read() {
        return new File("/dev/.arc").exists() || new File("/system/bin/crosvm").exists();
    }

    private static boolean write() {
        try {
            List<String> listRemoteActionCompatParcelizer = downloadMagicModuleDetail.RemoteActionCompatParcelizer(new File("/proc/cpuinfo"), getSubmissionTimestamp.IconCompatParcelizer);
            if ((listRemoteActionCompatParcelizer instanceof Collection) && listRemoteActionCompatParcelizer.isEmpty()) {
                return false;
            }
            for (String str : listRemoteActionCompatParcelizer) {
                if (TestGroupLSModel.write((CharSequence) str, (CharSequence) "vmx", false) || TestGroupLSModel.write((CharSequence) str, (CharSequence) "svm", false)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean IconCompatParcelizer() {
        try {
            String strWrite = getMagicModuleDetail.write(new InputStreamReader(Runtime.getRuntime().exec("ps -A").getInputStream()));
            String strWrite2 = getMagicModuleDetail.write(new InputStreamReader(Runtime.getRuntime().exec("service list").getInputStream()));
            List<String> list = RemoteActionCompatParcelizer;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (String str : list) {
                if (TestGroupLSModel.write((CharSequence) strWrite, (CharSequence) str, false) || TestGroupLSModel.write((CharSequence) strWrite2, (CharSequence) str, false)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean IconCompatParcelizer(Context p0) {
        Configuration configuration = p0.getResources().getConfiguration();
        PackageManager packageManager = p0.getPackageManager();
        return ((configuration.keyboard == 2) && !packageManager.hasSystemFeature("android.hardware.telephony")) || packageManager.hasSystemFeature("android.hardware.type.pc");
    }
}
