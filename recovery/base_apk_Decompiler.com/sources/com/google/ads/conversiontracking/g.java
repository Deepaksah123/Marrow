package com.google.ads.conversiontracking;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.ads.conversiontracking.i;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hypersdk.core.PaymentConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    private static final Map<String, String> a = new HashMap();
    private static boolean b = false;
    private static long c = -1;
    private static boolean d = true;
    private static boolean e = false;
    private static final Object f = new Object();
    private static e g = null;
    private static boolean h = false;

    public enum d {
        DOUBLECLICK_AUDIENCE,
        DOUBLECLICK_CONVERSION,
        GOOGLE_CONVERSION,
        IAP_CONVERSION
    }

    public static <T> T a(T t) {
        return t;
    }

    public static e a(Context context) {
        e eVar;
        synchronized (f) {
            if (g == null) {
                g = new e(context);
            }
            eVar = g;
        }
        return eVar;
    }

    public static boolean a(Context context, c cVar, boolean z) {
        return a(context, a(cVar), b(cVar), z);
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        if (b && e) {
            return d;
        }
        if (z) {
            return true;
        }
        return !context.getSharedPreferences(str, 0).getBoolean(str2, false);
    }

    public static long b(Context context) {
        return context.getSharedPreferences("google_conversion", 0).getLong("last_retry_time", 0L);
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putBoolean(str2, true);
        editorEdit.commit();
    }

    public static void c(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("google_conversion", 0).edit();
        editorEdit.putLong("last_retry_time", a());
        editorEdit.commit();
    }

    public static String a(Context context, c cVar) throws NoSuchAlgorithmException {
        return a(context, cVar, new com.google.ads.conversiontracking.a(context).a());
    }

    public static String a(Context context, c cVar, i.a aVar) throws NoSuchAlgorithmException {
        String str;
        String packageName = context.getPackageName();
        try {
            str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        String strE = aVar == null ? e(context) : null;
        if (!cVar.c && cVar.d == d.DOUBLECLICK_CONVERSION) {
            return a(cVar, packageName, str, aVar, strE);
        }
        if (cVar.d == d.DOUBLECLICK_AUDIENCE) {
            return a(cVar, aVar);
        }
        if (cVar.d == d.IAP_CONVERSION) {
            return c(cVar, packageName, str, aVar, strE);
        }
        return b(cVar, packageName, str, aVar, strE);
    }

    private static void a(Uri.Builder builder, boolean z, Map<String, ?> map) {
        if (!z || map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            if (entry.getValue() instanceof String) {
                String strValueOf = String.valueOf(entry.getKey());
                builder.appendQueryParameter(strValueOf.length() != 0 ? "data.".concat(strValueOf) : new String("data."), (String) entry.getValue());
            } else if (entry.getValue() instanceof String[]) {
                for (String str : (String[]) entry.getValue()) {
                    String strValueOf2 = String.valueOf(entry.getKey());
                    builder.appendQueryParameter(strValueOf2.length() != 0 ? "data.".concat(strValueOf2) : new String("data."), str);
                }
            }
        }
    }

    public static b a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String strValueOf = String.valueOf(queryParameter);
        Uri uri2 = Uri.parse(strValueOf.length() != 0 ? "http://hostname/?".concat(strValueOf) : new String("http://hostname/?"));
        String queryParameter2 = uri2.getQueryParameter("conv");
        String queryParameter3 = uri2.getQueryParameter("gclid");
        if (TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter3)) {
            return null;
        }
        String queryParameter4 = uri2.getQueryParameter("ai");
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        return new b(queryParameter2, new a(queryParameter3, queryParameter4));
    }

    public static String a(a aVar) {
        if (aVar == null) {
            return "";
        }
        if (TextUtils.isEmpty(aVar.b)) {
            String strValueOf = String.valueOf(aVar.a);
            return strValueOf.length() != 0 ? "&gclid=".concat(strValueOf) : new String("&gclid=");
        }
        String str = aVar.a;
        String str2 = aVar.b;
        StringBuilder sb = new StringBuilder("&gclid=".length() + 2 + String.valueOf(str).length() + "ai".length() + String.valueOf(str2).length());
        sb.append("&gclid=");
        sb.append(str);
        sb.append("&");
        sb.append("ai");
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    private static List<String> a(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (a.a((String) entry.getValue()) == null) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public static boolean a(Context context, final b bVar) {
        if (bVar == null) {
            return false;
        }
        final SharedPreferences sharedPreferences = context.getSharedPreferences("google_conversion_click_referrer", 0);
        final List<String> listA = a(sharedPreferences);
        if (sharedPreferences.getString(bVar.a, null) == null && sharedPreferences.getAll().size() == 100 && listA.isEmpty()) {
            return false;
        }
        String str = bVar.b.a;
        String str2 = bVar.b.b;
        long j = bVar.b.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + " ".length() + String.valueOf(str2).length() + " ".length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(j);
        final String string = sb.toString();
        synchronized (a) {
            Iterator<String> it = listA.iterator();
            while (it.hasNext()) {
                a.remove(it.next());
            }
            a.put(bVar.a, string);
        }
        new Thread(new Runnable() { // from class: com.google.ads.conversiontracking.g.1
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    editorEdit.remove((String) it2.next());
                }
                editorEdit.putString(bVar.a, string);
                editorEdit.commit();
            }
        }).start();
        return true;
    }

    public static a a(Context context, String str) {
        String string;
        Map<String, String> map = a;
        synchronized (map) {
            string = map.get(str);
        }
        if (string == null) {
            string = context.getSharedPreferences("google_conversion_click_referrer", 0).getString(str, "");
        }
        return a.a(string);
    }

    static String a(long j) {
        return String.format(Locale.US, "%d.%03d", Long.valueOf(j / 1000), Long.valueOf(j % 1000));
    }

    private static String a(i.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.b() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION;
    }

    private static void a(StringBuilder sb, i.a aVar, String str) {
        String strA = a(aVar);
        if (strA != null) {
            String strValueOf = String.valueOf(strA);
            sb.append(strValueOf.length() != 0 ? ";dc_lat=".concat(strValueOf) : new String(";dc_lat="));
        }
        if (aVar == null) {
            String strValueOf2 = String.valueOf(str);
            sb.append(strValueOf2.length() != 0 ? ";isu=".concat(strValueOf2) : new String(";isu="));
        } else {
            String strValueOf3 = String.valueOf(aVar.a());
            sb.append(strValueOf3.length() != 0 ? ";dc_rdid=".concat(strValueOf3) : new String(";dc_rdid="));
        }
    }

    private static void a(Uri.Builder builder, i.a aVar, String str) {
        if (a(aVar) != null) {
            builder.appendQueryParameter("lat", a(aVar));
        }
        if (aVar != null) {
            builder.appendQueryParameter("rdid", aVar.a());
        } else {
            builder.appendQueryParameter("muid", str);
        }
    }

    public static String a(c cVar, String str, String str2, i.a aVar, String str3) {
        String str4 = cVar.a;
        String strValueOf = String.valueOf(Build.VERSION.RELEASE);
        String strA = a(a());
        StringBuilder sb = new StringBuilder("https://pubads.g.doubleclick.net/activity;xsp=".length() + 13 + String.valueOf(str4).length() + "ait".length() + "bundleid".length() + String.valueOf(str).length() + "appversion".length() + String.valueOf(str2).length() + "osversion".length() + String.valueOf(strValueOf).length() + "sdkversion".length() + "ct-sdk-a-v2.2.4".length() + PaymentConstants.TIMESTAMP.length() + String.valueOf(strA).length());
        sb.append("https://pubads.g.doubleclick.net/activity;xsp=");
        sb.append(str4);
        sb.append(";");
        sb.append("ait");
        sb.append("=1;");
        sb.append("bundleid");
        sb.append("=");
        sb.append(str);
        sb.append(";");
        sb.append("appversion");
        sb.append("=");
        sb.append(str2);
        sb.append(";");
        sb.append("osversion");
        sb.append("=");
        sb.append(strValueOf);
        sb.append(";");
        sb.append("sdkversion");
        sb.append("=");
        sb.append("ct-sdk-a-v2.2.4");
        sb.append(";");
        sb.append(PaymentConstants.TIMESTAMP);
        sb.append("=");
        sb.append(strA);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        a(sb2, aVar, str3);
        return sb2.toString();
    }

    public static String a(c cVar, i.a aVar) {
        if (aVar == null) {
            return null;
        }
        String strValueOf = String.valueOf(cVar.f);
        StringBuilder sb = new StringBuilder(strValueOf.length() != 0 ? "https://pubads.g.doubleclick.net/activity;dc_iu=".concat(strValueOf) : new String("https://pubads.g.doubleclick.net/activity;dc_iu="));
        a(sb, aVar, (String) null);
        if (cVar.i != null) {
            for (Map.Entry entry : cVar.i.entrySet()) {
                String strEncode = Uri.encode((String) entry.getKey());
                String strEncode2 = Uri.encode(entry.getValue().toString());
                StringBuilder sb2 = new StringBuilder(String.valueOf(strEncode).length() + 2 + String.valueOf(strEncode2).length());
                sb2.append(";");
                sb2.append(strEncode);
                sb2.append("=");
                sb2.append(strEncode2);
                sb.append(sb2.toString());
            }
        }
        return sb.toString();
    }

    public static String b(c cVar, String str, String str2, i.a aVar, String str3) {
        String strA = a(cVar.h);
        Uri.Builder builderAppendQueryParameter = Uri.parse("https://www.googleadservices.com/pagead/conversion/").buildUpon().appendEncodedPath(String.valueOf(cVar.a).concat("/")).appendQueryParameter("bundleid", str).appendQueryParameter("appversion", str2).appendQueryParameter("osversion", Build.VERSION.RELEASE).appendQueryParameter("sdkversion", "ct-sdk-a-v2.2.4").appendQueryParameter("gms", aVar != null ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : SessionDescription.SUPPORTED_SDP_VERSION);
        a(builderAppendQueryParameter, aVar, str3);
        if (cVar.e != null && cVar.f != null) {
            builderAppendQueryParameter.appendQueryParameter("label", cVar.e).appendQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE, cVar.f);
        }
        if (cVar.k != 0) {
            builderAppendQueryParameter.appendQueryParameter(PaymentConstants.TIMESTAMP, a(cVar.k));
        } else {
            builderAppendQueryParameter.appendQueryParameter(PaymentConstants.TIMESTAMP, a(a()));
        }
        if (cVar.c) {
            builderAppendQueryParameter.appendQueryParameter("remarketing_only", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (cVar.l) {
            builderAppendQueryParameter.appendQueryParameter(TtmlNode.TEXT_EMPHASIS_AUTO, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (cVar.b) {
            builderAppendQueryParameter.appendQueryParameter("usage_tracking_enabled", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } else {
            builderAppendQueryParameter.appendQueryParameter("usage_tracking_enabled", SessionDescription.SUPPORTED_SDP_VERSION);
        }
        if (cVar.g != null) {
            builderAppendQueryParameter.appendQueryParameter("currency_code", cVar.g);
        }
        a(builderAppendQueryParameter, cVar.c, (Map<String, ?>) cVar.i);
        String strValueOf = String.valueOf(builderAppendQueryParameter.build());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + String.valueOf(strA).length());
        sb.append(strValueOf);
        sb.append(strA);
        return sb.toString();
    }

    public static String c(c cVar, String str, String str2, i.a aVar, String str3) {
        Uri.Builder builderAppendQueryParameter = Uri.parse("https://www.googleadservices.com/pagead/conversion/").buildUpon().appendQueryParameter("sku", cVar.j).appendQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE, cVar.f).appendQueryParameter("bundleid", str).appendQueryParameter("appversion", str2).appendQueryParameter("osversion", Build.VERSION.RELEASE).appendQueryParameter("sdkversion", "ct-sdk-a-v2.2.4").appendQueryParameter(PaymentConstants.TIMESTAMP, a(a()));
        a(builderAppendQueryParameter, aVar, str3);
        return builderAppendQueryParameter.build().toString();
    }

    /* JADX INFO: renamed from: com.google.ads.conversiontracking.g$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.DOUBLECLICK_CONVERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.IAP_CONVERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.GOOGLE_CONVERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(c cVar) {
        int i = AnonymousClass2.a[cVar.d.ordinal()];
        if (i == 1) {
            return "doubleclick_nonrepeatable_conversion";
        }
        if (i == 2) {
            return "iap_nonrepeatable_conversion";
        }
        return "google_nonrepeatable_conversion";
    }

    public static String b(c cVar) {
        int i = AnonymousClass2.a[cVar.d.ordinal()];
        if (i != 1) {
            return i != 2 ? cVar.e : String.format("google_iap_ping:%s", cVar.j);
        }
        return cVar.a;
    }

    static long a() {
        if (b) {
            long j = c;
            if (j >= 0) {
                return j;
            }
        }
        return System.currentTimeMillis();
    }

    private static String e(Context context) throws NoSuchAlgorithmException {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            string = "null";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(string.getBytes());
        return s.a(messageDigest.digest(), false);
    }

    public static boolean d(Context context) {
        if (b) {
            return h;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static String a(String str) {
        if (((String) a(str)).length() != 0) {
            return str;
        }
        throw new IllegalStateException("Parameter cannot be empty string");
    }

    public static class b {
        private final String a;
        private final a b;

        public b(String str, a aVar) {
            this.a = str;
            this.b = aVar;
        }
    }

    public static class a {
        private final String a;
        private final String b;
        private final long c;

        private a(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public a(String str, String str2) {
            this(str, str2, g.a());
        }

        public boolean a() {
            return this.c + 7776000000L < g.a();
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length != 3) {
                return null;
            }
            try {
                a aVar = new a(strArrSplit[0], strArrSplit[1], Long.parseLong(strArrSplit[2]));
                if (aVar.a()) {
                    return null;
                }
                return aVar;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }

    public static class c {
        private String a;
        private boolean b;
        private boolean c;
        private d d;
        private String e;
        private String f;
        private String g;
        private a h;
        private Map<String, ?> i;
        private String j;
        private long k;
        private boolean l;

        public c a(String str) {
            this.a = str;
            return this;
        }

        public c a() {
            this.c = true;
            return this;
        }

        public c a(d dVar) {
            this.d = dVar;
            return this;
        }

        public c b(String str) {
            this.e = str;
            return this;
        }

        public c c(String str) {
            this.f = str;
            return this;
        }

        public c d(String str) {
            this.g = str;
            return this;
        }

        public c a(a aVar) {
            this.h = aVar;
            return this;
        }

        public c a(Map<String, ?> map) {
            this.i = map;
            return this;
        }

        public c e(String str) {
            this.j = str;
            return this;
        }

        public c a(boolean z) {
            this.b = z;
            return this;
        }

        public c a(long j) {
            this.k = TimeUnit.MILLISECONDS.toSeconds(j);
            return this;
        }

        public c b() {
            this.l = true;
            return this;
        }
    }
}
