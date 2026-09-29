package kotlin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class linearlyInterpolate {
    private static final getTrackTypeForHdlr AudioAttributesCompatParcelizer = new getTrackTypeForHdlr("PhoneskyVerificationUtils");

    public static int RemoteActionCompatParcelizer(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled && RemoteActionCompatParcelizer(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean write(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (RemoteActionCompatParcelizer(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    AudioAttributesCompatParcelizer.IconCompatParcelizer("Play Store package is not found.", new Object[0]);
                }
            } else {
                AudioAttributesCompatParcelizer.IconCompatParcelizer("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            AudioAttributesCompatParcelizer.IconCompatParcelizer("Play Store package is not found.", new Object[0]);
        }
        return false;
    }

    private static boolean RemoteActionCompatParcelizer(Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            AudioAttributesCompatParcelizer.IconCompatParcelizer("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            String strWrite = maybeAddSeekPoint.write(signature.toByteArray());
            arrayList.add(strWrite);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strWrite)) {
                return true;
            }
            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strWrite)) {
                return true;
            }
        }
        getTrackTypeForHdlr gettracktypeforhdlr = AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ", ");
            }
        }
        gettracktypeforhdlr.IconCompatParcelizer(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb.toString()), new Object[0]);
        return false;
    }
}
