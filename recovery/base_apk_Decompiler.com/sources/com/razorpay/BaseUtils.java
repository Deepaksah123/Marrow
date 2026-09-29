package com.razorpay;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.marrow.data.models.mcq.McqParentInfo;
import com.razorpay.AdvertisingIdUtil;
import in.juspay.hypersdk.core.Constants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import kotlin._isNegInf;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class BaseUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ExecutorService $l$I1I11I1;
    private static char AudioAttributesCompatParcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static BaseUtils I__1l = null;
    private static final boolean __l1_;
    private static boolean _l_1l__ = false;
    private static boolean _llI = false;
    static String apiKey = null;
    static String ipAddress = null;
    private static final String l$1_I$l$ = "permission disabled";
    private static long read;
    private static int write;
    private String $I__I;
    private String _1__;
    private static final byte[] $$a = {93, -80, 87, TarConstants.LF_DIR};
    private static final int $$b = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = com.razorpay.BaseUtils.$$a
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
        L27:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseUtils.$$c(byte, short, byte):java.lang.String");
    }

    private static void a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 81;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), 22748 - KeyEvent.keyCodeFromString(""), ExpandableListView.getPackedPositionChild(0L) + 37, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - TextUtils.getOffsetBefore("", 0)), View.MeasureSpec.getMode(0) + 2721, (KeyEvent.getMaxKeyCode() >> 16) + 38, 1895162189, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 15713 - Color.alpha(0), TextUtils.indexOf((CharSequence) "", '0') + 65, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40975 - TextUtils.indexOf((CharSequence) "", '0', 0)), 6121 - TextUtils.lastIndexOf("", '0', 0), 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (read ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) write) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 69;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    BaseUtils() {
    }

    static /* synthetic */ JSONObject access$000(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            l$1_I$l$(httpsURLConnection);
            obj.hashCode();
            throw null;
        }
        JSONObject jSONObjectL$1_I$l$ = l$1_I$l$(httpsURLConnection);
        int i3 = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return jSONObjectL$1_I$l$;
        }
        obj.hashCode();
        throw null;
    }

    static {
        AudioAttributesImplBaseParcelizer = 1;
        write();
        __l1_ = ConfigDroid.ENABLE_WEBVIEW_DEBUGGING.booleanValue();
        _llI = true;
        _l_1l__ = false;
        $l$I1I11I1 = Executors.newCachedThreadPool();
        int i = MediaBrowserCompatItemReceiver + 69;
        AudioAttributesImplBaseParcelizer = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static BaseUtils getInstance() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            BaseUtils baseUtils = I__1l;
            if (baseUtils == null) {
                BaseUtils baseUtils2 = new BaseUtils();
                I__1l = baseUtils2;
                return baseUtils2;
            }
            int i4 = i3 + 65;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            return baseUtils;
        }
        throw null;
    }

    public void setDeeplinkEnabled(Context context, boolean z) {
        int i;
        int i2 = 2 % 2;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, (Class<?>) DeeplinkActivity.class);
            if (z) {
                int i3 = RemoteActionCompatParcelizer + 45;
                int i4 = i3 % 128;
                IconCompatParcelizer = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 69;
                RemoteActionCompatParcelizer = i6 % 128;
                int i7 = i6 % 2;
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            int i8 = RemoteActionCompatParcelizer + 103;
            IconCompatParcelizer = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 36 / 0;
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
    }

    public static boolean canHandleUpiPayment(Activity activity, String str) {
        int i = 2 % 2;
        if (activity == null) {
            return false;
        }
        int i2 = IconCompatParcelizer + 85;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (str == null) {
            return false;
        }
        int i5 = i3 + 27;
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        if (str.isEmpty()) {
            return false;
        }
        new Intent("android.intent.action.VIEW", Uri.parse("upi://pay")).setPackage(str);
        return !activity.getPackageManager().queryIntentActivities(r0, C.DEFAULT_BUFFER_SEGMENT_SIZE).isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<java.lang.String> getAppsWithPackageNames(android.content.Context r6, java.util.ArrayList<java.lang.String> r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r7 == 0) goto L67
            int r2 = com.razorpay.BaseUtils.IconCompatParcelizer
            int r2 = r2 + 73
            int r3 = r2 % 128
            com.razorpay.BaseUtils.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 1
            if (r2 != 0) goto L22
            boolean r2 = r7.isEmpty()
            r4 = 8
            int r4 = r4 / 0
            r2 = r2 ^ r3
            if (r2 == r3) goto L28
            goto L67
        L22:
            boolean r2 = r7.isEmpty()
            if (r2 == r3) goto L67
        L28:
            int r2 = com.razorpay.BaseUtils.RemoteActionCompatParcelizer
            int r2 = r2 + 115
            int r4 = r2 % 128
            com.razorpay.BaseUtils.IconCompatParcelizer = r4
            int r2 = r2 % r0
            java.util.Iterator r7 = r7.iterator()
            int r2 = com.razorpay.BaseUtils.RemoteActionCompatParcelizer
            int r2 = r2 + 103
            int r4 = r2 % 128
            com.razorpay.BaseUtils.IconCompatParcelizer = r4
            int r2 = r2 % r0
        L3e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L3e
            int r4 = com.razorpay.BaseUtils.RemoteActionCompatParcelizer
            int r4 = r4 + 113
            int r5 = r4 % 128
            com.razorpay.BaseUtils.IconCompatParcelizer = r5
            int r4 = r4 % r0
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L5c
            goto L3e
        L5c:
            boolean r4 = isAppInstalled(r6, r2)
            if (r4 == r3) goto L63
            goto L3e
        L63:
            r1.add(r2)
            goto L3e
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseUtils.getAppsWithPackageNames(android.content.Context, java.util.ArrayList):java.util.ArrayList");
    }

    public void setPaymentId(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 123;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        this._1__ = str;
        if (i4 != 0) {
            int i5 = 48 / 0;
        }
        int i6 = i2 + 7;
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setOrderId(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        this.$I__I = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 33;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getMetadata() {
        int i = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("payment_id", this._1__);
            jSONObject.put(PaymentConstants.ORDER_ID, this.$I__I);
            String string = jSONObject.toString();
            int i2 = RemoteActionCompatParcelizer + 51;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            return string;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void clearMetadata() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 103;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        this._1__ = null;
        this.$I__I = null;
        int i5 = i2 + 117;
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    static String constructBasicAuth(String str) throws UnsupportedEncodingException {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        String strEncodeToString = Base64.encodeToString(sb.toString().getBytes(CharsetNames.UTF_8), 2);
        int i2 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return strEncodeToString;
    }

    static boolean hasPermission(Context context, String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (context.checkCallingOrSelfPermission(str) != 0) {
                return false;
            }
            int i4 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            return true;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
            return false;
        }
    }

    static String getKeyId(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 27;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        try {
            String str = apiKey;
            if (str == null) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (((PackageItemInfo) applicationInfo).metaData == null) {
                    return null;
                }
                Bundle bundle = ((PackageItemInfo) applicationInfo).metaData;
                Object[] objArr = new Object[1];
                a(TextUtils.indexOf((CharSequence) "", '0') - 1948096032, new char[]{51586, 57911, 17412, 60745, 29323, 55608, 45659, 56901, 62229, 24880, 29328, 17262, 40327, 42087, 3473, 4775, 16536, 12778, 34328, 49731, 30915, 59656, 48653}, new char[]{57247, 57961, 4491, 59967}, (char) Color.argb(0, 0, 0, 0), new char[]{53044, 42502, 23118, 23800}, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Logger.d(strIntern);
                return strIntern;
            }
            int i5 = i2 + 111;
            RemoteActionCompatParcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        } catch (PackageManager.NameNotFoundException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
            return null;
        }
    }

    static HashMap<String, String> getAllPluginsFromManifest(Context context) {
        ApplicationInfo applicationInfo;
        int i = 2 % 2;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
            return null;
        }
        if (((PackageItemInfo) applicationInfo).metaData == null) {
            int i2 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        for (String str : ((PackageItemInfo) applicationInfo).metaData.keySet()) {
            if (str.contains("com.razorpay.plugin.")) {
                int i4 = IconCompatParcelizer + 11;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    ((PackageItemInfo) applicationInfo).metaData.getString(str).equalsIgnoreCase("com.razorpay.RzpGpayMerged");
                    throw null;
                }
                if (((PackageItemInfo) applicationInfo).metaData.getString(str).equalsIgnoreCase("com.razorpay.RzpGpayMerged")) {
                    int i5 = RemoteActionCompatParcelizer + 15;
                    IconCompatParcelizer = i5 % 128;
                    if (i5 % 2 != 0) {
                        try {
                            try {
                                int i6 = 85 / 0;
                                if (Class.forName("com.google.android.apps.nbu.paisa.inapp.client.api.PaymentsClient").newInstance() != null) {
                                    map.put(str, ((PackageItemInfo) applicationInfo).metaData.getString(str));
                                }
                            } catch (ClassNotFoundException e2) {
                                AnalyticsUtil.reportError(e2.getMessage(), "S2", "GooglePay SDK is not included");
                            }
                        } catch (IllegalAccessException | InstantiationException e3) {
                            e3.printStackTrace();
                        }
                    } else if (Class.forName("com.google.android.apps.nbu.paisa.inapp.client.api.PaymentsClient").newInstance() != null) {
                        map.put(str, ((PackageItemInfo) applicationInfo).metaData.getString(str));
                    }
                }
                AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
                return null;
            }
            if (str.contains("com.razorpay.plugin.") && ((PackageItemInfo) applicationInfo).metaData.getString(str).equalsIgnoreCase("com.razorpay.RzpGooglePay")) {
                int i7 = RemoteActionCompatParcelizer + 87;
                IconCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
                try {
                    if (Class.forName("com.google.android.apps.nbu.paisa.inapp.client.api.PaymentsClient").newInstance() != null) {
                        map.put(str, ((PackageItemInfo) applicationInfo).metaData.getString(str));
                    }
                } catch (ClassNotFoundException e4) {
                    AnalyticsUtil.reportError(e4.getMessage(), "S2", "GooglePay SDK is not included");
                } catch (IllegalAccessException | InstantiationException e5) {
                    e5.printStackTrace();
                }
            } else if (str.contains("com.razorpay.plugin.") && ((PackageItemInfo) applicationInfo).metaData.getString(str) != null) {
                int i9 = IconCompatParcelizer + 113;
                RemoteActionCompatParcelizer = i9 % 128;
                int i10 = i9 % 2;
                map.put(str, ((PackageItemInfo) applicationInfo).metaData.getString(str));
            }
        }
        return map;
    }

    private static void l$1_I$l$() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        WebView.setWebContentsDebuggingEnabled(__l1_);
        int i4 = IconCompatParcelizer + 81;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void l$1_I$l$(WebView webView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        webView.getSettings().setJavaScriptEnabled(true);
        int i4 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void setWebViewSettings(final Context context, final WebView webView, boolean z) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        l$1_I$l$();
        l$1_I$l$(webView);
        CookieManager.getInstance().setAcceptCookie(true);
        webView.setTag("razorpay");
        WebSettings settings = webView.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setTextZoom(100);
        context.getApplicationContext().getDir("database", 0).getPath();
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        settings.setCacheMode(-1);
        if (z) {
            settings.setCacheMode(2);
            int i4 = IconCompatParcelizer + 91;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        settings.setSaveFormData(false);
        webView.addJavascriptInterface(new StorageBridge(context), "StorageBridge");
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowContentAccess(false);
        webView.post(new Runnable() { // from class: com.razorpay.BaseUtils.1
            @Override // java.lang.Runnable
            public void run() {
                GpuInfoUtil.extractGpuInfo(webView, context);
            }
        });
    }

    static boolean hasFeature(Context context, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature(str);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        int i5 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return zHasSystemFeature;
    }

    static <T> T getSystemService(Context context, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        T t = (T) context.getApplicationContext().getSystemService(str);
        int i4 = IconCompatParcelizer + 25;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return t;
    }

    static int getNetworkType(Context context) {
        int i = 2 % 2;
        NetworkType dataNetworkType = getDataNetworkType(context);
        if (dataNetworkType == NetworkType.WIFI) {
            return 0;
        }
        if (dataNetworkType == NetworkType.BLUETOOTH) {
            return 1;
        }
        if (dataNetworkType == NetworkType.CELLULAR) {
            int i2 = RemoteActionCompatParcelizer + 107;
            IconCompatParcelizer = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                getCellularNetworkType(context).equalsIgnoreCase("2G");
                obj.hashCode();
                throw null;
            }
            String cellularNetworkType = getCellularNetworkType(context);
            if (!(!cellularNetworkType.equalsIgnoreCase("2G"))) {
                int i3 = RemoteActionCompatParcelizer + 117;
                IconCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                return 2;
            }
            if (cellularNetworkType.equalsIgnoreCase("3G")) {
                int i5 = RemoteActionCompatParcelizer + 1;
                IconCompatParcelizer = i5 % 128;
                if (i5 % 2 == 0) {
                    return 3;
                }
                throw null;
            }
            if (cellularNetworkType.equalsIgnoreCase("4G")) {
                return 4;
            }
        }
        int i6 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        return -1;
    }

    static String getCellularNetworkType(Context context) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String strL$1_I$l$ = l$1_I$l$(telephonyManager.getDataNetworkType());
                int i4 = RemoteActionCompatParcelizer + 41;
                IconCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 37 / 0;
                }
                return strL$1_I$l$;
            }
            int i6 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            return "NA";
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getLocalizedMessage());
            return "NA";
        }
    }

    private static String l$1_I$l$(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 7;
        IconCompatParcelizer = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                int i5 = i3 + 115;
                IconCompatParcelizer = i5 % 128;
                if (i5 % 2 == 0) {
                    return "2G";
                }
                obj.hashCode();
                throw null;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "LTE";
            default:
                return "NA";
        }
    }

    private static String l$1_I$l$(Context context) {
        NetworkInfo activeNetworkInfo;
        int i = 2 % 2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                int i2 = RemoteActionCompatParcelizer + 97;
                IconCompatParcelizer = i2 % 128;
                if (i2 % 2 != 0) {
                    activeNetworkInfo.isConnected();
                    throw null;
                }
                if (activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getType() == 0) {
                        return l$1_I$l$(activeNetworkInfo.getSubtype());
                    }
                    int i3 = RemoteActionCompatParcelizer + 41;
                    IconCompatParcelizer = i3 % 128;
                    int i4 = i3 % 2;
                    return "NA";
                }
            }
            return "NA";
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getLocalizedMessage());
            return "NA";
        }
    }

    static String getCellularNetworkProviderName(Context context) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            TelephonyManager telephonyManager = (TelephonyManager) getSystemService(context, "phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                int i3 = RemoteActionCompatParcelizer + 81;
                IconCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                return networkOperatorName;
            }
            return "unknown";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static NetworkType getDataNetworkType(Context context) {
        int i = 2 % 2;
        if (hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            int i2 = RemoteActionCompatParcelizer + 1;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(context, "connectivity");
            if (connectivityManager != null) {
                int i4 = IconCompatParcelizer + 29;
                RemoteActionCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo != null) {
                    int i6 = IconCompatParcelizer + 59;
                    RemoteActionCompatParcelizer = i6 % 128;
                    if (i6 % 2 == 0) {
                        networkInfo.isConnected();
                        throw null;
                    }
                    if (networkInfo.isConnected()) {
                        return NetworkType.WIFI;
                    }
                }
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(7);
                if (networkInfo2 != null && networkInfo2.isConnected()) {
                    int i7 = RemoteActionCompatParcelizer + 33;
                    IconCompatParcelizer = i7 % 128;
                    int i8 = i7 % 2;
                    return NetworkType.BLUETOOTH;
                }
                NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
                if (networkInfo3 != null) {
                    int i9 = IconCompatParcelizer + 51;
                    RemoteActionCompatParcelizer = i9 % 128;
                    int i10 = i9 % 2;
                    if (networkInfo3.isConnected()) {
                        int i11 = IconCompatParcelizer + 35;
                        RemoteActionCompatParcelizer = i11 % 128;
                        int i12 = i11 % 2;
                        return NetworkType.CELLULAR;
                    }
                }
            }
        }
        return NetworkType.UNKNOWN;
    }

    static String getLocale() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(Locale.getDefault().getLanguage());
        sb.append("-");
        sb.append(Locale.getDefault().getCountry());
        String string = sb.toString();
        int i2 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    static ArrayList<String> jsonStringArrayToArrayList(JSONArray jSONArray) throws Exception {
        int i = 2 % 2;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int i3 = RemoteActionCompatParcelizer + 13;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(jSONArray.getString(i2));
        }
        int i5 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static String getAppBuildType(Context context) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return "development";
        }
        int i4 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return "production";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static CharSequence getWebViewUserAgent(Context context) {
        int i = 2 % 2;
        try {
            CharSequence charSequenceReturnUndefinedIfNull = AnalyticsUtil.returnUndefinedIfNull(new WebView(context).getSettings().getUserAgentString());
            int i2 = IconCompatParcelizer + 53;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                return charSequenceReturnUndefinedIfNull;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return "undefined";
        }
    }

    static boolean isDeviceHaveCorrectTlsVersion() {
        int i = 2 % 2;
        try {
            String[] protocols = SSLContext.getDefault().getDefaultSSLParameters().getProtocols();
            if (protocols == null) {
                int i2 = IconCompatParcelizer + 121;
                RemoteActionCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = RemoteActionCompatParcelizer + 109;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            for (String str : protocols) {
                int i6 = IconCompatParcelizer + 33;
                RemoteActionCompatParcelizer = i6 % 128;
                int i7 = i6 % 2;
                if (str.startsWith("TLS") && (!r5.equalsIgnoreCase("TLSv1"))) {
                    int i8 = RemoteActionCompatParcelizer + 71;
                    IconCompatParcelizer = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 97 / 0;
                    }
                    return true;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
        return false;
    }

    static void setup() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        AnalyticsUtil.reset();
        int i4 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static double round(double d, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        double dDoubleValue = new BigDecimal(d).setScale(i, RoundingMode.HALF_UP).doubleValue();
        int i4 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return dDoubleValue;
    }

    public static String nanoTimeToSecondsString(long j, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        String strConcat = "".concat(String.valueOf(round(j / 1.0E9d, i)));
        int i5 = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return strConcat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static boolean isMerchantAppDebuggable(Context context) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if ((context.getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        int i4 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i4 % 128;
        return i4 % 2 != 0;
    }

    static Certificate getX509Certificate(SslCertificate sslCertificate) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray != null) {
            try {
                return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
            } catch (CertificateException e) {
                AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
                return null;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return null;
    }

    static String makeErrorPayload(String str, String str2) {
        int i = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", str);
            jSONObject2.put("description", str2);
            jSONObject.put("error", jSONObject2);
            String string = jSONObject.toString();
            int i2 = IconCompatParcelizer + 83;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 73 / 0;
            }
            return string;
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", e.getMessage());
            e.printStackTrace();
            return "{\"error\":{\"code\": \"BAD_REQUEST_ERROR\", \"description\": \"An unknown error occurred.\"}}";
        }
    }

    static PublicKey constructPublicKey(String str) {
        int i = 2 % 2;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(Constants.ALG_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 0)));
            int i2 = IconCompatParcelizer + 109;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                return publicKeyGeneratePublic;
            }
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static Boolean __l1_(Context context) {
        int i = 2 % 2;
        try {
            boolean z = true;
            if (context.getPackageManager().getComponentEnabledSetting(new ComponentName("com.truecaller", "com.truecaller.truepay.UserRegistered")) != 1) {
                int i2 = IconCompatParcelizer + 111;
                RemoteActionCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            e.printStackTrace();
            AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
            return Boolean.FALSE;
        }
    }

    static boolean checkUpiRegisteredApp(Context context, String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        str.hashCode();
        if (!str.equals("com.google.android.apps.nbu.paisa.user")) {
            int i4 = RemoteActionCompatParcelizer + 89;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        boolean z = _llI;
        int i6 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static HashSet<String> getSetOfPackageNamesSupportingUpi(Context context) {
        Iterator<ResolveInfo> it;
        int i = 2 % 2;
        List<ResolveInfo> listOfAppsWhichHandleDeepLink = getListOfAppsWhichHandleDeepLink(context, "upi://pay");
        HashSet<String> hashSet = new HashSet<>();
        if (listOfAppsWhichHandleDeepLink != null) {
            int i2 = IconCompatParcelizer + 103;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            if (listOfAppsWhichHandleDeepLink.size() > 0) {
                int i4 = IconCompatParcelizer + 71;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    it = listOfAppsWhichHandleDeepLink.iterator();
                    int i5 = 86 / 0;
                } else {
                    it = listOfAppsWhichHandleDeepLink.iterator();
                }
                while (it.hasNext()) {
                    int i6 = RemoteActionCompatParcelizer + 1;
                    IconCompatParcelizer = i6 % 128;
                    if (i6 % 2 != 0) {
                        hashSet.add(((PackageItemInfo) it.next().activityInfo).packageName);
                        throw null;
                    }
                    try {
                        hashSet.add(((PackageItemInfo) it.next().activityInfo).packageName);
                    } catch (Exception e) {
                        AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
                    }
                    AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
                }
            }
        }
        if (hashSet.size() > 0 && !checkUpiRegisteredApp(context, "com.google.android.apps.nbu.paisa.user")) {
            hashSet.remove("com.google.android.apps.nbu.paisa.user");
        }
        if (hashSet.size() > 0 && !checkUpiRegisteredApp(context, "com.truecaller")) {
            hashSet.remove("com.truecaller");
        }
        return hashSet;
    }

    static HashSet<String> getSetOfPackageNamesSupportingUpiAutopay(Context context) {
        int i = 2 % 2;
        List<ResolveInfo> listOfAppsWhichHandleDeepLink = getListOfAppsWhichHandleDeepLink(context, "upi://mandate");
        HashSet<String> hashSet = new HashSet<>();
        if (listOfAppsWhichHandleDeepLink != null && listOfAppsWhichHandleDeepLink.size() > 0) {
            int i2 = RemoteActionCompatParcelizer + 31;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Iterator<ResolveInfo> it = listOfAppsWhichHandleDeepLink.iterator();
            int i4 = IconCompatParcelizer + 57;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                try {
                    hashSet.add(((PackageItemInfo) it.next().activityInfo).packageName);
                } catch (Exception e) {
                    AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
                }
            }
        }
        int i6 = RemoteActionCompatParcelizer + 33;
        IconCompatParcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            return hashSet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static List<ResolveInfo> getListOfAppsWhichHandleDeepLink(Context context, String str) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("url", str);
        AnalyticsUtil.trackEvent(AnalyticsEvent.DEVICE_UPI_APPS_DISCOVERY_START, AnalyticsUtil.getJSONResponse(map));
        Intent intent = new Intent();
        intent.setData(Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
        map.put("deviceApps", getAppPackageNames(listQueryIntentActivities));
        AnalyticsUtil.trackEvent(AnalyticsEvent.DEVICE_UPI_APPS_DISCOVERY_SUCCESS, AnalyticsUtil.getJSONResponse(map));
        int i2 = RemoteActionCompatParcelizer + 45;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return listQueryIntentActivities;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static List<String> getAppPackageNames(List<ResolveInfo> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = list.iterator();
        while (it.hasNext()) {
            int i2 = RemoteActionCompatParcelizer + 119;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                arrayList.add(((PackageItemInfo) it.next().activityInfo).packageName);
            } catch (Exception e) {
                AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            }
        }
        int i4 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    static String getAppNameOfResolveInfo(ResolveInfo resolveInfo, Context context) throws Exception {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String str = ((PackageItemInfo) resolveInfo.activityInfo).packageName;
        if (i3 != 0) {
            getAppNameOfPackageName(str, context);
            throw null;
        }
        String appNameOfPackageName = getAppNameOfPackageName(str, context);
        int i4 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return appNameOfPackageName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if ("my.com.tngdigital.ewallet".equalsIgnoreCase(r11) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if ("my.com.tngdigital.ewallet".equalsIgnoreCase(r11) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        com.razorpay.AnalyticsUtil.trackEvent(com.razorpay.AnalyticsEvent.SDK_INTENT_WALLET_APP_REDIRECT);
        com.razorpay.AnalyticsUtil.addProperty("url", new com.razorpay.AnalyticsProperty(r10, com.razorpay.AnalyticsProperty.Scope.PAYMENT));
        com.razorpay.AnalyticsUtil.addProperty("wallet_app_package_name", new com.razorpay.AnalyticsProperty(r11, com.razorpay.AnalyticsProperty.Scope.PAYMENT));
        com.razorpay.AnalyticsUtil.trackEvent(com.razorpay.AnalyticsEvent.SDK_TNG_WALLET_APP_FLOW_START);
        r12.startActivity(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void startActivityForResult(java.lang.String r10, java.lang.String r11, android.app.Activity r12) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseUtils.startActivityForResult(java.lang.String, java.lang.String, android.app.Activity):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r5.startsWith("upi://mandate") != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean l$1_I$l$(java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r1 != 0) goto L41
            int r1 = com.razorpay.BaseUtils.RemoteActionCompatParcelizer
            int r1 = r1 + 99
            int r3 = r1 % 128
            com.razorpay.BaseUtils.IconCompatParcelizer = r3
            int r1 = r1 % r0
            java.lang.String r3 = "upi://pay"
            r4 = 1
            if (r1 == 0) goto L22
            boolean r1 = r5.startsWith(r3)
            r3 = 2
            int r3 = r3 / r2
            r1 = r1 ^ r4
            if (r1 == r4) goto L28
            goto L30
        L22:
            boolean r1 = r5.startsWith(r3)
            if (r1 != 0) goto L30
        L28:
            java.lang.String r1 = "upi://mandate"
            boolean r5 = r5.startsWith(r1)
            if (r5 == 0) goto L41
        L30:
            int r5 = com.razorpay.BaseUtils.RemoteActionCompatParcelizer
            int r5 = r5 + 29
            int r1 = r5 % 128
            com.razorpay.BaseUtils.IconCompatParcelizer = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L3c
            return r4
        L3c:
            r5 = 0
            r5.hashCode()
            throw r5
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseUtils.l$1_I$l$(java.lang.String):boolean");
    }

    private static Intent l$1_I$l$(Intent intent, String str, Activity activity) {
        int i = 2 % 2;
        try {
            List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 131072);
            int size = listQueryIntentActivities == null ? 0 : listQueryIntentActivities.size();
            if (size != 0) {
                return Intent.createChooser(intent, null, PendingIntent.getBroadcast(activity, 104, new Intent(activity, (Class<?>) UpiChooserSelectionReceiver.class).putExtra("razorpay_upi_chooser_url", str).putExtra("razorpay_upi_chooser_candidate_count", size), __l1_() | C.BUFFER_FLAG_FIRST_SAMPLE).getIntentSender());
            }
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 3;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 107;
            IconCompatParcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 19 / 0;
            }
            return intent;
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            return intent;
        }
    }

    private static int __l1_() {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 31) {
            int i2 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 8 / 0;
            }
            return 0;
        }
        int i4 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return 33554432;
        }
        int i5 = 49 / 0;
        return 33554432;
    }

    static JSONObject getJSONFromIntentData(Intent intent) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            int i2 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                intent.getExtras();
                obj.hashCode();
                throw null;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Iterator<String> it = extras.keySet().iterator();
                int i3 = RemoteActionCompatParcelizer + 27;
                IconCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                while (it.hasNext()) {
                    int i5 = RemoteActionCompatParcelizer + 85;
                    IconCompatParcelizer = i5 % 128;
                    if (i5 % 2 != 0) {
                        String next = it.next();
                        jSONObject.put(next, extras.get(next));
                        obj.hashCode();
                        throw null;
                    }
                    String next2 = it.next();
                    try {
                        jSONObject.put(next2, extras.get(next2));
                        int i6 = RemoteActionCompatParcelizer + 49;
                        IconCompatParcelizer = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 5 % 2;
                        }
                    } catch (JSONException e) {
                        AnalyticsUtil.reportError(e.getMessage(), "error:exception", e.getLocalizedMessage());
                    }
                    AnalyticsUtil.reportError(e.getMessage(), "error:exception", e.getLocalizedMessage());
                }
            }
        }
        return jSONObject;
    }

    private static /* synthetic */ String l$1_I$l$(Context context, String str) throws Exception {
        ApplicationInfo applicationInfo;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 33) {
                int i4 = RemoteActionCompatParcelizer + 31;
                IconCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                applicationInfo = packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(0L));
            } else {
                applicationInfo = packageManager.getApplicationInfo(str, 128);
            }
            String base64FromDrawable = getBase64FromDrawable(packageManager.getResourcesForApplication(applicationInfo), packageManager.getApplicationIcon(str));
            int i6 = IconCompatParcelizer + 61;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            return base64FromDrawable;
        } catch (PackageManager.NameNotFoundException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder("Error loading app icon for ");
            sb.append(str);
            sb.append(": ");
            sb.append(e.getLocalizedMessage());
            AnalyticsUtil.reportError(message, "S0", sb.toString());
            return null;
        }
    }

    static String getBase64FromOtherAppsResource(final Context context, final String str) {
        int i = 2 % 2;
        Future futureSubmit = $l$I1I11I1.submit(new Callable() { // from class: com.razorpay.BaseUtils$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BaseUtils.$r8$lambda$7eBLhikLioR61KUr66lz_tpTZxk(context, str);
            }
        });
        try {
            String str2 = (String) futureSubmit.get(2L, TimeUnit.SECONDS);
            int i2 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            return str2;
        } catch (Exception e) {
            futureSubmit.cancel(true);
            Thread.currentThread().interrupt();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder("Execution error while loading icon for ");
            sb.append(str);
            sb.append(": ");
            sb.append(e.getLocalizedMessage());
            AnalyticsUtil.reportError(message, "S0", sb.toString());
            return null;
        }
    }

    static String getAppNameOfPackageName(String str, Context context) throws Exception {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            int i4 = ((PackageItemInfo) applicationInfo).labelRes;
            Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
            if (i4 != 0) {
                return resourcesForApplication.getString(i4);
            }
            int i5 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return ((PackageItemInfo) applicationInfo).nonLocalizedLabel.toString();
        } catch (PackageManager.NameNotFoundException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder("Error loading app name for ");
            sb.append(str);
            sb.append(": ");
            sb.append(e.getLocalizedMessage());
            AnalyticsUtil.reportError(message, "S0", sb.toString());
            return null;
        }
    }

    static String getBase64FromDrawable(Resources resources, Drawable drawable) {
        int i = 2 % 2;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, R.drawable.rzp_logo);
        Boolean bool = Boolean.FALSE;
        if (drawable != null) {
            int i2 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            if (drawable instanceof BitmapDrawable) {
                bitmapDecodeResource = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmapDecodeResource = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapDecodeResource);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bool = Boolean.TRUE;
            }
        }
        if (bitmapDecodeResource == null) {
            if (bitmapDecodeResource != null && !bitmapDecodeResource.isRecycled() && bool.booleanValue()) {
                bitmapDecodeResource.recycle();
            }
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            StringBuilder sb = new StringBuilder("data:image/png;base64,");
            sb.append(Base64.encodeToString(byteArray, 2));
            String string = sb.toString();
            if (bitmapDecodeResource != null && !bitmapDecodeResource.isRecycled() && bool.booleanValue()) {
                bitmapDecodeResource.recycle();
            }
            int i4 = IconCompatParcelizer + 27;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return string;
        } catch (Exception unused) {
            if (bitmapDecodeResource != null && !bitmapDecodeResource.isRecycled()) {
                int i6 = IconCompatParcelizer + 71;
                RemoteActionCompatParcelizer = i6 % 128;
                int i7 = i6 % 2;
                if (bool.booleanValue()) {
                    bitmapDecodeResource.recycle();
                }
            }
            return null;
        } catch (Throwable th) {
            if (bitmapDecodeResource != null && !bitmapDecodeResource.isRecycled()) {
                int i8 = IconCompatParcelizer + 63;
                RemoteActionCompatParcelizer = i8 % 128;
                int i9 = i8 % 2;
                if (bool.booleanValue()) {
                    bitmapDecodeResource.recycle();
                }
            }
            throw th;
        }
    }

    static String getBase64FromResource(Resources resources, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i);
        if (bitmapDecodeResource == null) {
            int i5 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            Drawable drawable = resources.getDrawable(i);
            if (drawable != null) {
                int i7 = RemoteActionCompatParcelizer + 95;
                IconCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
                if (drawable instanceof BitmapDrawable) {
                    bitmapDecodeResource = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    bitmapDecodeResource = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapDecodeResource);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                }
            }
        }
        String string = null;
        if (bitmapDecodeResource != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                StringBuilder sb = new StringBuilder("data:image/png;base64,");
                sb.append(Base64.encodeToString(byteArray, 2));
                string = sb.toString();
            } catch (Exception unused) {
            }
        }
        int i9 = RemoteActionCompatParcelizer + 115;
        IconCompatParcelizer = i9 % 128;
        int i10 = i9 % 2;
        return string;
    }

    static Object getJsonValue(String str, JSONObject jSONObject, Object obj) {
        int i = 2 % 2;
        try {
            Object objL$1_I$l$ = l$1_I$l$(str.split("\\."), jSONObject, 0);
            if (objL$1_I$l$ != null) {
                int i2 = RemoteActionCompatParcelizer + 81;
                IconCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
                return objL$1_I$l$;
            }
        } catch (Exception unused) {
        }
        int i4 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String getType(java.lang.String r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r4.hashCode()
            int r1 = r4.hashCode()
            r2 = 3
            r3 = 1
            switch(r1) {
                case 102340: goto L49;
                case 105441: goto L36;
                case 111145: goto L23;
                case 3268712: goto L19;
                default: goto Lf;
            }
        Lf:
            int r4 = com.razorpay.BaseUtils.RemoteActionCompatParcelizer
            int r4 = r4 + 81
            int r1 = r4 % 128
            com.razorpay.BaseUtils.IconCompatParcelizer = r1
            int r4 = r4 % r0
            goto L5c
        L19:
            java.lang.String r1 = "jpeg"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L5c
            r4 = r2
            goto L5d
        L23:
            java.lang.String r1 = "png"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L5c
            int r4 = com.razorpay.BaseUtils.RemoteActionCompatParcelizer
            int r4 = r4 + 109
            int r1 = r4 % 128
            com.razorpay.BaseUtils.IconCompatParcelizer = r1
            int r4 = r4 % r0
            r4 = r0
            goto L5d
        L36:
            java.lang.String r1 = "jpg"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L5c
            int r4 = com.razorpay.BaseUtils.RemoteActionCompatParcelizer
            int r4 = r4 + 19
            int r1 = r4 % 128
            com.razorpay.BaseUtils.IconCompatParcelizer = r1
            int r4 = r4 % r0
            r4 = r3
            goto L5d
        L49:
            java.lang.String r1 = "gif"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L5c
            int r4 = com.razorpay.BaseUtils.IconCompatParcelizer
            int r4 = r4 + 27
            int r1 = r4 % 128
            com.razorpay.BaseUtils.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r0
            r4 = 0
            goto L5d
        L5c:
            r4 = -1
        L5d:
            if (r4 == 0) goto L6e
            if (r4 == r3) goto L6b
            if (r4 == r0) goto L68
            if (r4 == r2) goto L6b
            java.lang.String r4 = "application/octet-stream"
            return r4
        L68:
            java.lang.String r4 = "image/png"
            return r4
        L6b:
            java.lang.String r4 = "image/jpeg"
            return r4
        L6e:
            java.lang.String r4 = "image/gif"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseUtils.getType(java.lang.String):java.lang.String");
    }

    static void openPdfFile(Activity activity, Uri uri) {
        int i = 2 % 2;
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, "application/pdf");
            intent.setFlags(1);
            if (activity.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
                Toast.makeText(activity, "No app found to open PDF", 1).show();
                return;
            }
            int i2 = IconCompatParcelizer + 61;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            activity.startActivity(intent);
            int i4 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        } catch (ActivityNotFoundException e) {
            Logger.e(e.getMessage());
        }
    }

    static void openFile(Activity activity, Uri uri) {
        int i = 2 % 2;
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setFlags(1);
            Object obj = null;
            if (activity.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                Toast.makeText(activity, "No app found to open PDF", 1).show();
                int i2 = IconCompatParcelizer + 65;
                RemoteActionCompatParcelizer = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i3 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                activity.startActivity(intent);
            } else {
                activity.startActivity(intent);
                throw null;
            }
        } catch (ActivityNotFoundException e) {
            Logger.e(e.getMessage());
        }
    }

    static void pdfDownloadHelper(Activity activity, String str, String str2) {
        FileOutputStream fileOutputStreamOpenFileOutput;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                fileOutputStreamOpenFileOutput = activity.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(Base64.decode(str2, 1));
            } else {
                fileOutputStreamOpenFileOutput = activity.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(Base64.decode(str2, 0));
            }
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getFilesDir().toString());
        sb.append("/");
        sb.append(str);
        sb.append(".pdf");
        try {
            Uri uriAudioAttributesCompatParcelizer = _isNegInf.AudioAttributesCompatParcelizer(activity, activity.getApplicationContext().getPackageName(), new File(sb.toString()));
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.setDataAndType(uriAudioAttributesCompatParcelizer, "application/pdf");
            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse("/Documents"));
            activity.startActivityForResult(intent, 77);
            int i3 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static Object l$1_I$l$(String[] strArr, Object obj, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 125;
        int i4 = i3 % 128;
        IconCompatParcelizer = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            if (i != strArr.length) {
                String str = strArr[i];
                if (!(!(obj instanceof JSONObject))) {
                    return l$1_I$l$(strArr, ((JSONObject) obj).opt(str), i + 1);
                }
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (TextUtils.isDigitsOnly(str)) {
                        int i5 = IconCompatParcelizer + 21;
                        RemoteActionCompatParcelizer = i5 % 128;
                        int i6 = i5 % 2;
                        return l$1_I$l$(strArr, jSONArray.opt(Integer.parseInt(str)), i + 1);
                    }
                }
                return null;
            }
            int i7 = i4 + 123;
            RemoteActionCompatParcelizer = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 84 / 0;
            }
            return obj;
        }
        int length = strArr.length;
        obj2.hashCode();
        throw null;
    }

    static String getRandomString() {
        int i = 2 % 2;
        String string = new BigInteger(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, new SecureRandom()).toString(32);
        int i2 = IconCompatParcelizer + 21;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    static String getFileFromInternal(Activity activity, String str, String str2) throws Exception {
        int i = 2 % 2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(activity.openFileInput(getVersionedAssetName(getLocalVersion(activity, str2).toString(), str)), CharsetNames.UTF_8));
        StringBuilder sb = new StringBuilder();
        int i2 = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return decryptFile(sb.toString());
            }
            int i4 = RemoteActionCompatParcelizer + 41;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                sb.append(line);
                int i5 = 49 / 0;
            } else {
                sb.append(line);
            }
        }
    }

    static String decryptFile(String str) {
        int i = 2 % 2;
        try {
            String strDecrypt = new CryptLib().decrypt(str, CryptLib.SHA256("rzpisunitedred", 32), "glorygloryunited");
            int i2 = RemoteActionCompatParcelizer + 95;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                return strDecrypt;
            }
            throw null;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getLocalizedMessage());
            StringBuilder sb = new StringBuilder("Unable to decrypt file, ");
            sb.append(e.getMessage());
            Logger.d(sb.toString());
            return null;
        }
    }

    static String getVersionedAssetName(String str, String str2) {
        int i = 2 % 2;
        String strReplaceAll = str.replaceAll("\\.", "-");
        StringBuilder sb = new StringBuilder();
        sb.append(strReplaceAll);
        sb.append("-");
        sb.append(str2);
        String string = sb.toString();
        int i2 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static String getLocalVersion(Activity activity, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            String value = SharedPreferenceUtil.getValue(activity, str);
            if (value != null) {
                return value;
            }
            int i3 = IconCompatParcelizer + 47;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                return getVersionFromJsonString("{\n  \"hash\" : \"c4171614448e750850bd4daca2c7e8d1\",\n  \"magic_hash\": \"e1ff492228196aa72f4892db1e05624e\"\n}\n", str);
            }
            String versionFromJsonString = getVersionFromJsonString("{\n  \"hash\" : \"c4171614448e750850bd4daca2c7e8d1\",\n  \"magic_hash\": \"e1ff492228196aa72f4892db1e05624e\"\n}\n", str);
            int i4 = 30 / 0;
            return versionFromJsonString;
        }
        SharedPreferenceUtil.getValue(activity, str);
        throw null;
    }

    static String getVersionFromJsonString(String str, String str2) {
        int i = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str2.equalsIgnoreCase("otpelf_version")) {
                String string = jSONObject.getString("hash");
                int i2 = RemoteActionCompatParcelizer + 55;
                IconCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
                return string;
            }
            if (!str2.equalsIgnoreCase("magic_version")) {
                return null;
            }
            int i4 = RemoteActionCompatParcelizer + 49;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            return jSONObject.getString("magic_hash");
        } catch (Exception unused) {
            return null;
        }
    }

    static void updateLocalVersion(Activity activity, String str, String str2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferenceUtil.setValue(activity, str, str2);
        int i4 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    static boolean storeFileInInternal(Activity activity, String str, String str2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = activity.openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(str2.getBytes());
            fileOutputStreamOpenFileOutput.close();
            int i4 = RemoteActionCompatParcelizer + 103;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S1", "Error in saving file: ".concat(String.valueOf(str)));
            Logger.e("Error in saving file: ".concat(String.valueOf(str)));
            return false;
        }
    }

    static void checkForLatestVersion(Context context, int i) {
        int i2 = 2 % 2;
        if (CoreConfig.getInstance().isSDKUpdateAlertEnabled()) {
            int i3 = IconCompatParcelizer + 89;
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            if (isMerchantAppDebuggable(context)) {
                int i5 = RemoteActionCompatParcelizer + 17;
                IconCompatParcelizer = i5 % 128;
                if (i5 % 2 != 0) {
                    CoreConfig.getInstance().getLatestSDKVersionCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i < CoreConfig.getInstance().getLatestSDKVersionCode()) {
                    Toast.makeText(context, CoreConfig.getInstance().getUpdateSDKMsg(), 1).show();
                    int i6 = IconCompatParcelizer + 55;
                    RemoteActionCompatParcelizer = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
    }

    static int dpToPixels(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int iApplyDimension = (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
        int i5 = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return iApplyDimension;
        }
        throw null;
    }

    static int getDisplayWidth(Context context) {
        int i = 2 % 2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return i2;
    }

    static int getDisplayHeight(Context context) {
        int i = 2 % 2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        int i3 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    static HashMap<String, String> getMapFromJSONObject(JSONObject jSONObject) {
        int i = 2 % 2;
        HashMap<String, String> map = new HashMap<>();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            int i2 = IconCompatParcelizer + 21;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            while (!(!itKeys.hasNext())) {
                int i4 = IconCompatParcelizer + 99;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                } else {
                    String next2 = itKeys.next();
                    map.put(next2, jSONObject.getString(next2));
                    throw null;
                }
            }
            return map;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", e.getMessage());
            return map;
        }
    }

    static void setCompatibleWithGooglePay(boolean z) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        _llI = z;
        if (i3 != 0) {
            throw null;
        }
    }

    static String makeUrlEncodedPayload(JSONObject jSONObject) throws JSONException {
        String str;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i2 = IconCompatParcelizer + 15;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                String next = itKeys.next();
                String strEncode = Uri.encode(jSONObject.getString(next));
                Object[] objArr = new Object[3];
                objArr[1] = next;
                objArr[1] = strEncode;
                str = String.format("%s=%s&", objArr);
            } else {
                String next2 = itKeys.next();
                str = String.format("%s=%s&", next2, Uri.encode(jSONObject.getString(next2)));
            }
            sb.append(str);
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    static String installedApps(Context context) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        try {
            for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(0)) {
                int i2 = RemoteActionCompatParcelizer + 11;
                IconCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
                if ((applicationInfo.flags & 1) == 0) {
                    int i4 = RemoteActionCompatParcelizer + 101;
                    IconCompatParcelizer = i4 % 128;
                    int i5 = i4 % 2;
                    if (sb.length() != 0) {
                        int i6 = IconCompatParcelizer + 9;
                        RemoteActionCompatParcelizer = i6 % 128;
                        if (i6 % 2 == 0) {
                            sb.append(",");
                            int i7 = 31 / 0;
                        } else {
                            sb.append(",");
                        }
                    }
                    sb.append(((PackageItemInfo) applicationInfo).packageName);
                }
            }
            String string = sb.toString();
            int i8 = RemoteActionCompatParcelizer + 119;
            IconCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            return string;
        } catch (Throwable unused) {
            return "Apps not available";
        }
    }

    static String getAndroidId(Context context) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return string;
    }

    static String getDisplayResolution(Context context) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        String str = String.format(Locale.ENGLISH, "%dx%dx%d", Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.densityDpi));
        int i4 = IconCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return str;
    }

    static long getTotalRamMB(Context context) {
        int i = 2 % 2;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem / 1048576;
            int i2 = RemoteActionCompatParcelizer + 71;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                return j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", "Error getting total RAM");
            return -1L;
        }
    }

    static long getFreeRamMB(Context context) {
        int i = 2 % 2;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.availMem / 1048576;
            int i2 = RemoteActionCompatParcelizer + 89;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 21 / 0;
            }
            return j;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", "Error getting free RAM");
            return -1L;
        }
    }

    static int getCpuCores() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        try {
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            int i4 = RemoteActionCompatParcelizer + 89;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                return iAvailableProcessors;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", "Error getting CPU cores");
            return -1;
        }
    }

    static boolean isPowerSaveMode(Context context) {
        boolean zIsPowerSaveMode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        RemoteActionCompatParcelizer = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                zIsPowerSaveMode = ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
                int i3 = 57 / 0;
            } else {
                zIsPowerSaveMode = ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
            }
            return zIsPowerSaveMode;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", "Error checking power save mode");
            return false;
        }
    }

    static int getBatteryLevel(Context context) {
        int i = 2 % 2;
        try {
            Object obj = null;
            if (context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
                int i2 = IconCompatParcelizer + 77;
                RemoteActionCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
                return (int) ((r4.getIntExtra("level", -1) / r4.getIntExtra("scale", -1)) * 100.0f);
            }
            int i4 = RemoteActionCompatParcelizer + 15;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                return -1;
            }
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", "Error getting battery level");
            return -1;
        }
    }

    static boolean isCharging(Context context) {
        int intExtra;
        int i = 2 % 2;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                return false;
            }
            int i2 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra == 4) {
                    return true;
                }
            } else {
                intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra == 2) {
                    return true;
                }
            }
            int i3 = RemoteActionCompatParcelizer + 119;
            int i4 = i3 % 128;
            IconCompatParcelizer = i4;
            if (i3 % 2 != 0) {
                if (intExtra == 4) {
                    return true;
                }
            } else if (intExtra == 5) {
                return true;
            }
            int i5 = i4 + 87;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return false;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", "Error checking charging status");
            return false;
        }
    }

    String getSystemFontSize(Context context) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(context.getResources().getConfiguration().fontScale);
        int i4 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return strValueOf;
    }

    private boolean l$1_I$l$(Context context, Location location) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return location.isFromMockProvider();
        }
        location.isFromMockProvider();
        throw null;
    }

    static boolean isNetworkRoaming(Context context) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            int i4 = RemoteActionCompatParcelizer + 37;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            return telephonyManager.isNetworkRoaming();
        }
        telephonyManager.isNetworkRoaming();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return r3.getNetworkOperatorName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r3 = com.razorpay.BaseUtils.IconCompatParcelizer + 83;
        com.razorpay.BaseUtils.RemoteActionCompatParcelizer = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if ((r3 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        return com.razorpay.BaseUtils.l$1_I$l$;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r3 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String getCarrierOperatorName(android.content.Context r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.razorpay.BaseUtils.IconCompatParcelizer
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.razorpay.BaseUtils.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            java.lang.String r2 = "phone"
            if (r1 != 0) goto L1d
            java.lang.Object r3 = r3.getSystemService(r2)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            r1 = 26
            int r1 = r1 / 0
            if (r3 == 0) goto L2a
            goto L25
        L1d:
            java.lang.Object r3 = r3.getSystemService(r2)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            if (r3 == 0) goto L2a
        L25:
            java.lang.String r3 = r3.getNetworkOperatorName()
            return r3
        L2a:
            int r3 = com.razorpay.BaseUtils.IconCompatParcelizer
            int r3 = r3 + 83
            int r1 = r3 % 128
            com.razorpay.BaseUtils.RemoteActionCompatParcelizer = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L38
            java.lang.String r3 = "permission disabled"
            return r3
        L38:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseUtils.getCarrierOperatorName(android.content.Context):java.lang.String");
    }

    static Map<String, String> getDeviceAttributes(Context context) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        Object obj = null;
        if (context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            map.put("device_id", l$1_I$l$);
            map.put("sim_serial_number", l$1_I$l$);
        } else {
            int i2 = RemoteActionCompatParcelizer + 49;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("device_id", BaseConfig.getAdvertisingId(context));
                map.put("sim_serial_number", l$1_I$l$);
                map.put("build_unique_id", UUID.randomUUID().toString());
            } else {
                map.put("device_id", BaseConfig.getAdvertisingId(context));
                map.put("sim_serial_number", l$1_I$l$);
                map.put("build_unique_id", UUID.randomUUID().toString());
                obj.hashCode();
                throw null;
            }
        }
        map.put("device_manufacturer", Build.MANUFACTURER);
        map.put("device_model", Build.MODEL);
        int i3 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }

    static String getWifiSSID(Context context) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0) {
            return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getSSID();
        }
        int i4 = RemoteActionCompatParcelizer + 115;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return l$1_I$l$;
    }

    static String buildSerial() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String str = Build.SERIAL;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void fetchIP(final RzpJSONCallback rzpJSONCallback) {
        int i = 2 % 2;
        new Thread(new Runnable() { // from class: com.razorpay.BaseUtils.2
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
            
                if (r2 == 0) goto L34;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v15 */
            /* JADX WARN: Type inference failed for: r2v16 */
            /* JADX WARN: Type inference failed for: r2v17 */
            /* JADX WARN: Type inference failed for: r2v18 */
            /* JADX WARN: Type inference failed for: r2v19 */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v20 */
            /* JADX WARN: Type inference failed for: r2v21 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r2v5 */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
            /* JADX WARN: Type inference failed for: r3v7, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() throws java.lang.Throwable {
                /*
                    r5 = this;
                    java.lang.String r0 = "S2"
                    java.lang.String r1 = "error"
                    r2 = 0
                    java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56 java.net.SocketTimeoutException -> L65
                    java.lang.String r4 = "https://approvals-api.getsimpl.com/my-ip"
                    r3.<init>(r4)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56 java.net.SocketTimeoutException -> L65
                    java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56 java.net.SocketTimeoutException -> L65
                    java.lang.Object r3 = kotlin.getAvcProfileAndLevel.read(r3)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56 java.net.SocketTimeoutException -> L65
                    java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56 java.net.SocketTimeoutException -> L65
                    javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56 java.net.SocketTimeoutException -> L65
                    java.lang.String r2 = "GET"
                    r3.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    r2 = 150(0x96, float:2.1E-43)
                    r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    r2 = 250(0xfa, float:3.5E-43)
                    r3.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    r4 = 200(0xc8, float:2.8E-43)
                    if (r2 != r4) goto L39
                    org.json.JSONObject r2 = com.razorpay.BaseUtils.access$000(r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    com.razorpay.RzpJSONCallback r4 = r1     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    r4.onResponse(r2)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    goto L47
                L39:
                    com.razorpay.RzpJSONCallback r2 = r1     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    r4.<init>()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    org.json.JSONObject r4 = r4.put(r1, r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                    r2.onResponse(r4)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f java.net.SocketTimeoutException -> L52
                L47:
                    if (r3 == 0) goto L8e
                    r3.disconnect()     // Catch: java.lang.Exception -> L82
                    return
                L4d:
                    r5 = move-exception
                    goto L7c
                L4f:
                    r5 = move-exception
                    r2 = r3
                    goto L57
                L52:
                    r2 = r3
                    goto L65
                L54:
                    r5 = move-exception
                    goto L7b
                L56:
                    r5 = move-exception
                L57:
                    java.lang.String r1 = r5.getMessage()     // Catch: java.lang.Throwable -> L54
                    java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L54
                    com.razorpay.AnalyticsUtil.reportError(r1, r0, r5)     // Catch: java.lang.Throwable -> L54
                    if (r2 == 0) goto L8e
                    goto L77
                L65:
                    com.razorpay.RzpJSONCallback r5 = r1     // Catch: java.lang.Throwable -> L54
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L54
                    r3.<init>()     // Catch: java.lang.Throwable -> L54
                    java.lang.String r4 = "timeout"
                    org.json.JSONObject r1 = r3.put(r1, r4)     // Catch: java.lang.Throwable -> L54
                    r5.onResponse(r1)     // Catch: java.lang.Throwable -> L54
                    if (r2 == 0) goto L8e
                L77:
                    r2.disconnect()     // Catch: java.lang.Exception -> L82
                    return
                L7b:
                    r3 = r2
                L7c:
                    if (r3 == 0) goto L81
                    r3.disconnect()     // Catch: java.lang.Exception -> L82
                L81:
                    throw r5     // Catch: java.lang.Exception -> L82
                L82:
                    r5 = move-exception
                    java.lang.String r1 = r5.getMessage()
                    java.lang.String r5 = r5.getMessage()
                    com.razorpay.AnalyticsUtil.reportError(r1, r0, r5)
                L8e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseUtils.AnonymousClass2.run():void");
            }
        }).start();
        int i2 = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void getDeviceParamValues(final Context context, final RzpJSONCallback rzpJSONCallback) {
        int i = 2 % 2;
        final JSONObject jSONObject = new JSONObject();
        try {
            fetchIP(new RzpJSONCallback() { // from class: com.razorpay.BaseUtils.3
                @Override // com.razorpay.RzpJSONCallback
                public void onResponse(JSONObject jSONObject2) {
                    try {
                        if (jSONObject2.getString("ip") != null) {
                            BaseUtils.ipAddress = jSONObject2.getString("ip");
                        }
                    } catch (JSONException unused) {
                    }
                }
            });
            AdvertisingIdUtil.getId(context, new AdvertisingIdUtil.AdvertisingIdCallback() { // from class: com.razorpay.BaseUtils.4
                @Override // com.razorpay.AdvertisingIdUtil.AdvertisingIdCallback
                public void onResult(String str) {
                    try {
                        jSONObject.put("advertising_id", str);
                        jSONObject.put("is_roming", BaseUtils.isNetworkRoaming(context));
                        jSONObject.put("carrier_network", BaseUtils.getCarrierOperatorName(context));
                        jSONObject.put("carrier_id", "null");
                        Map<String, String> deviceAttributes = BaseUtils.getDeviceAttributes(context);
                        jSONObject.put("device_Id", deviceAttributes.get("device_Id"));
                        jSONObject.put("device_manufacturer", deviceAttributes.get("device_manufacturer"));
                        jSONObject.put("device_model", deviceAttributes.get("device_model"));
                        jSONObject.put("serial_number", BaseUtils.buildSerial());
                        jSONObject.put("ip_address", BaseUtils.ipAddress);
                        jSONObject.put("wifi_ssid", BaseUtils.getWifiSSID(context));
                        jSONObject.put("android_id", BaseUtils.getAndroidId(context));
                        jSONObject.put("safety_net basic_integrity", "true");
                        jSONObject.put("safety_net_cts_profile_match", "null");
                        rzpJSONCallback.onResponse(jSONObject);
                    } catch (JSONException e) {
                        AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
                    }
                }
            });
            int i2 = IconCompatParcelizer + 115;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    static void getSignalStrength(Context context) {
        int i = 2 % 2;
        ((TelephonyManager) context.getSystemService("phone")).listen(new MyPhoneStateListener(), 256);
        int i2 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class MyPhoneStateListener extends PhoneStateListener {
        public int signalStrengthValue;

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            if (signalStrength.isGsm()) {
                if (signalStrength.getGsmSignalStrength() != 99) {
                    this.signalStrengthValue = (signalStrength.getGsmSignalStrength() << 1) - 113;
                    return;
                } else {
                    this.signalStrengthValue = signalStrength.getGsmSignalStrength();
                    return;
                }
            }
            this.signalStrengthValue = signalStrength.getCdmaDbm();
        }
    }

    private static JSONObject l$1_I$l$(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        int i = 2 % 2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
        StringBuilder sb = new StringBuilder();
        int i2 = IconCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return new JSONObject(sb.toString());
            }
            int i4 = RemoteActionCompatParcelizer + 69;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            sb.append(line);
        }
    }

    static String getGenericPaymentErrorResponse(String str) {
        int i = 2 % 2;
        Object obj = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "BAD_REQUEST_ERROR");
            jSONObject.put("description", str);
            jSONObject.put("source", "customer");
            jSONObject.put(McqParentInfo.PARENT_TYPE_STEP, "payment_authentication");
            jSONObject.put("reason", "payload_error");
            String string = new JSONObject().put("error", jSONObject).toString();
            int i2 = IconCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return null;
        }
    }

    static String getGenericPaymentErrorResponse(String str, String str2, String str3) {
        int i = 2 % 2;
        Object obj = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "BAD_REQUEST_ERROR");
            jSONObject.put("description", str2);
            jSONObject.put("source", "customer");
            jSONObject.put(McqParentInfo.PARENT_TYPE_STEP, "payment_authentication");
            jSONObject.put("reason", new JSONObject().put("code", str).put("description", str2));
            if (str3 != null) {
                jSONObject.put(TtmlNode.TAG_METADATA, new JSONObject(str3));
                int i2 = IconCompatParcelizer + 15;
                RemoteActionCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
            }
            String string = new JSONObject().put("error", jSONObject).toString();
            int i4 = RemoteActionCompatParcelizer + 117;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return null;
        }
    }

    static String getGenericPaymentErrorResponse(String str, String str2) {
        int i = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "BAD_REQUEST_ERROR");
            jSONObject.put("description", str);
            jSONObject.put("source", "customer");
            jSONObject.put(McqParentInfo.PARENT_TYPE_STEP, "payment_authentication");
            jSONObject.put("reason", "payment_error");
            if (str2 != null) {
                jSONObject.put(TtmlNode.TAG_METADATA, new JSONObject(str2));
                int i2 = RemoteActionCompatParcelizer + 27;
                IconCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
            }
            String string = new JSONObject().put("error", jSONObject).toString();
            int i4 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            return string;
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return null;
        }
    }

    static String getPaymentCancelledResponse(String str) {
        int i = 2 % 2;
        Object obj = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "BAD_REQUEST_ERROR");
            jSONObject.put("description", "You may have cancelled the payment or there was a delay in response from the UPI app");
            jSONObject.put("source", "customer");
            jSONObject.put(McqParentInfo.PARENT_TYPE_STEP, "payment_authentication");
            jSONObject.put("reason", "payment_cancelled");
            if (str != null) {
                int i2 = IconCompatParcelizer + 57;
                RemoteActionCompatParcelizer = i2 % 128;
                if (i2 % 2 == 0) {
                    str.startsWith("pay");
                    obj.hashCode();
                    throw null;
                }
                if (str.startsWith("pay")) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("payment_id", str);
                    jSONObject.put(TtmlNode.TAG_METADATA, jSONObject2);
                } else {
                    jSONObject.put(TtmlNode.TAG_METADATA, new JSONObject(str));
                    int i3 = IconCompatParcelizer + 79;
                    RemoteActionCompatParcelizer = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            return new JSONObject().put("error", jSONObject).toString();
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return null;
        }
    }

    public static boolean checkGpayCardsUpiRegistered(Activity activity, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            return _l_1l__;
        }
        boolean z = false;
        try {
            String string = new JSONObject(str).getString("code");
            if (string.hashCode() == -1534821982 && string.equals("google_pay")) {
                int i3 = RemoteActionCompatParcelizer + 19;
                int i4 = i3 % 128;
                IconCompatParcelizer = i4;
                int i5 = i3 % 2;
                z = _l_1l__;
                int i6 = i4 + 17;
                RemoteActionCompatParcelizer = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 % 4;
                }
            }
        } catch (JSONException unused) {
        }
        return z;
    }

    static void setIsGpayCardsUpiRegistered(boolean z) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        _l_1l__ = z;
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean isAppInstalled(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.razorpay.BaseUtils.IconCompatParcelizer
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.razorpay.BaseUtils.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            r3 = 4
            if (r1 < r3) goto L2d
            goto L23
        L19:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            r3 = 33
            if (r1 < r3) goto L2d
        L23:
            r0 = 0
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            r4.getPackageInfo(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            goto L39
        L2d:
            r4.getPackageInfo(r5, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r4 = com.razorpay.BaseUtils.IconCompatParcelizer
            int r4 = r4 + 7
            int r5 = r4 % 128
            com.razorpay.BaseUtils.RemoteActionCompatParcelizer = r5
            int r4 = r4 % r0
        L39:
            r4 = 1
            return r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseUtils.isAppInstalled(android.content.Context, java.lang.String):boolean");
    }

    public static /* synthetic */ String $r8$lambda$7eBLhikLioR61KUr66lz_tpTZxk(Context context, String str) throws Exception {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String strL$1_I$l$ = l$1_I$l$(context, str);
        int i4 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return strL$1_I$l$;
    }

    static void write() {
        read = -7815508646643426800L;
        write = -136981212;
        AudioAttributesCompatParcelizer = (char) 54564;
    }
}
