package kotlin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.marrow.R;
import com.marrow.TrainingApplication;

/* JADX INFO: loaded from: classes.dex */
public final class joinWithSeparator {
    public static final Intent RemoteActionCompatParcelizer = new Intent();

    public static boolean IconCompatParcelizer(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return AudioAttributesCompatParcelizer(str, context.getString(R.string.app_scheme));
    }

    private static boolean AudioAttributesCompatParcelizer(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("://");
        return str.startsWith(sb.toString());
    }

    public static boolean write(Context context, String str) {
        Intent intent = read(context, str);
        if (intent == null) {
            return false;
        }
        if (intent == RemoteActionCompatParcelizer) {
            return true;
        }
        context.startActivity(intent);
        return true;
    }

    public static boolean AudioAttributesCompatParcelizer(String str) {
        return AudioAttributesCompatParcelizer(str, "http") || AudioAttributesCompatParcelizer(str, "https");
    }

    public static Intent read(Context context, String str) {
        boolean zIconCompatParcelizer = IconCompatParcelizer(context, str);
        if (AudioAttributesCompatParcelizer(str)) {
            return write(context, "int_link", str);
        }
        if (!zIconCompatParcelizer) {
            return null;
        }
        String strSubstring = str.substring(str.indexOf("://") + 3);
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        int iIndexOf = strSubstring.indexOf(47);
        if (iIndexOf > 0) {
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            strSubstring = iIndexOf < strSubstring.length() + (-1) ? strSubstring.substring(iIndexOf + 1) : null;
            strSubstring = strSubstring2;
        }
        return write(context, strSubstring, strSubstring);
    }

    public static Intent RemoteActionCompatParcelizer(Context context, String str, String str2, String str3) {
        return RemoteActionCompatParcelizer(context, str, str2, 6, str3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.Intent RemoteActionCompatParcelizer(android.content.Context r17, java.lang.String r18, java.lang.String r19, int r20, java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.joinWithSeparator.RemoteActionCompatParcelizer(android.content.Context, java.lang.String, java.lang.String, int, java.lang.String):android.content.Intent");
    }

    private static Intent write(Context context) {
        return zadb.RemoteActionCompatParcelizer(context, new onDataRangeRemoved(DataBuffer.RemoteActionCompatParcelizer));
    }

    public static Intent write(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TrainingApplication trainingApplication = (TrainingApplication) context.getApplicationContext();
        getLatestBitrateEstimate.IconCompatParcelizer(str, str2);
        if (trainingApplication.MediaBrowserCompatItemReceiver().IconCompatParcelizer().getDeeplinks().contains(str)) {
            return write(context, trainingApplication, str, str2);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.Intent write(android.content.Context r17, com.marrow.TrainingApplication r18, java.lang.String r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.joinWithSeparator.write(android.content.Context, com.marrow.TrainingApplication, java.lang.String, java.lang.String):android.content.Intent");
    }

    private static Intent IconCompatParcelizer(Context context) {
        return read(read(context));
    }

    public static void AudioAttributesCompatParcelizer(Context context) {
        AudioAttributesCompatParcelizer(context, read(context));
    }

    public static void RemoteActionCompatParcelizer(Context context, String str) {
        AudioAttributesCompatParcelizer(context, write(str));
    }

    public static void AudioAttributesCompatParcelizer(Context context, String str) {
        context.startActivity(read(str));
    }

    private static Intent read(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        return intent;
    }

    public static String read(Context context) {
        return write(context.getPackageName());
    }

    private static String write(String str) {
        return "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str));
    }
}
