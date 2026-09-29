package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda21 {
    private static final HashMap<String, Method> write = new HashMap<>();
    private static final HashMap<String, Class<?>> AudioAttributesCompatParcelizer = new HashMap<>();
    private static final String IconCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getPackageName();
    private static final SharedPreferences read = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences RemoteActionCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    static Object RemoteActionCompatParcelizer(Context context, IBinder iBinder) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            return AudioAttributesCompatParcelizer(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    static Map<String, String> read(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            Map<String, String> mapWrite = write(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (!mapWrite.containsKey(str)) {
                    arrayList2.add(str);
                }
            }
            mapWrite.putAll(RemoteActionCompatParcelizer(context, arrayList2, obj, z));
            return mapWrite;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    private static Map<String, String> RemoteActionCompatParcelizer(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, IconCompatParcelizer, z ? "subs" : "inapp", bundle});
                if (objAudioAttributesCompatParcelizer != null) {
                    Bundle bundle2 = (Bundle) objAudioAttributesCompatParcelizer;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                map.put(arrayList.get(i), stringArrayList.get(i));
                            }
                        }
                        AudioAttributesCompatParcelizer(map);
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    private static Map<String, String> write(ArrayList<String> arrayList) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : arrayList) {
                String string = read.getString(str, null);
                if (string != null) {
                    String[] strArrSplit = string.split(";", 2);
                    if (jCurrentTimeMillis - Long.parseLong(strArrSplit[0]) < 43200) {
                        map.put(str, strArrSplit[1]);
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    private static void AudioAttributesCompatParcelizer(Map<String, String> map) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = read.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                StringBuilder sb = new StringBuilder();
                sb.append(jCurrentTimeMillis);
                sb.append(";");
                sb.append(entry.getValue());
                editorEdit.putString(key, sb.toString());
            }
            editorEdit.apply();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
        }
    }

    private static Boolean RemoteActionCompatParcelizer(Context context, Object obj, String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            if (obj == null) {
                return Boolean.FALSE;
            }
            boolean z = false;
            Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, IconCompatParcelizer, str});
            if (objAudioAttributesCompatParcelizer != null && ((Integer) objAudioAttributesCompatParcelizer).intValue() == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    static ArrayList<String> IconCompatParcelizer(Context context, Object obj) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            return read(IconCompatParcelizer(context, obj, "inapp"));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    static ArrayList<String> AudioAttributesCompatParcelizer(Context context, Object obj) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            return read(IconCompatParcelizer(context, obj, "subs"));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<java.lang.String> IconCompatParcelizer(android.content.Context r10, java.lang.Object r11, java.lang.String r12) {
        /*
            java.lang.Class<o.DefaultAnalyticsCollectorExternalSyntheticLambda21> r0 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda21.class
            boolean r1 = kotlin.getMinWindowSequenceNumber.IconCompatParcelizer(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            if (r11 == 0) goto L64
            java.lang.Boolean r3 = RemoteActionCompatParcelizer(r10, r11, r12)     // Catch: java.lang.Throwable -> L65
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L64
            r3 = 0
            r4 = r2
            r5 = r3
        L1e:
            java.lang.String r6 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda21.IconCompatParcelizer     // Catch: java.lang.Throwable -> L65
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L65
            r8 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L65
            r7[r3] = r9     // Catch: java.lang.Throwable -> L65
            r9 = 1
            r7[r9] = r6     // Catch: java.lang.Throwable -> L65
            r6 = 2
            r7[r6] = r12     // Catch: java.lang.Throwable -> L65
            r7[r8] = r4     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r6 = "getPurchases"
            java.lang.Object r4 = AudioAttributesCompatParcelizer(r10, r4, r6, r11, r7)     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L5d
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = "RESPONSE_CODE"
            int r6 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L65
            if (r6 != 0) goto L5d
            java.lang.String r6 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r6 = r4.getStringArrayList(r6)     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L64
            int r7 = r6.size()     // Catch: java.lang.Throwable -> L65
            int r5 = r5 + r7
            r1.addAll(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r4 = r4.getString(r6)     // Catch: java.lang.Throwable -> L65
            goto L5e
        L5d:
            r4 = r2
        L5e:
            r6 = 30
            if (r5 >= r6) goto L64
            if (r4 != 0) goto L1e
        L64:
            return r1
        L65:
            r10 = move-exception
            kotlin.getMinWindowSequenceNumber.read(r10, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda21.IconCompatParcelizer(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public static boolean write(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return false;
        }
        try {
            String strOptString = new JSONObject(str).optString("freeTrialPeriod");
            if (strOptString != null) {
                if (!strOptString.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return false;
        }
    }

    static ArrayList<String> read(Context context, Object obj) {
        Class<?> clsRemoteActionCompatParcelizer;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && (clsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, "com.android.vending.billing.IInAppBillingService")) != null && IconCompatParcelizer(clsRemoteActionCompatParcelizer, "getPurchaseHistory") != null) {
                return read(AudioAttributesCompatParcelizer(context, obj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<java.lang.String> AudioAttributesCompatParcelizer(android.content.Context r20, java.lang.Object r21, java.lang.String r22) {
        /*
            java.lang.Class<o.DefaultAnalyticsCollectorExternalSyntheticLambda21> r1 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda21.class
            boolean r0 = kotlin.getMinWindowSequenceNumber.IconCompatParcelizer(r1)
            r2 = 0
            if (r0 == 0) goto La
            return r2
        La:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r3 = RemoteActionCompatParcelizer(r20, r21, r22)     // Catch: java.lang.Throwable -> L98
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto La6
            r3 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L1d:
            java.lang.String r7 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda21.IconCompatParcelizer     // Catch: java.lang.Throwable -> L98
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L98
            r8.<init>()     // Catch: java.lang.Throwable -> L98
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L98
            r10 = 6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L98
            r9[r3] = r10     // Catch: java.lang.Throwable -> L98
            r10 = 1
            r9[r10] = r7     // Catch: java.lang.Throwable -> L98
            r7 = 2
            r9[r7] = r22     // Catch: java.lang.Throwable -> L98
            r7 = 3
            r9[r7] = r4     // Catch: java.lang.Throwable -> L98
            r4 = 4
            r9[r4] = r8     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r7 = "getPurchaseHistory"
            r8 = r20
            r11 = r21
            java.lang.Object r4 = AudioAttributesCompatParcelizer(r8, r4, r7, r11, r9)     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L9a
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L98
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r14
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = "RESPONSE_CODE"
            int r7 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L98
            if (r7 != 0) goto L9a
            java.lang.String r7 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r7 = r4.getStringArrayList(r7)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L9a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L98
        L65:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r9 == 0) goto L90
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L98
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L98
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            r3.<init>(r9)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            java.lang.String r10 = "purchaseTime"
            long r16 = r3.getLong(r10)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            long r16 = r16 / r14
            long r16 = r12 - r16
            r18 = 1200(0x4b0, double:5.93E-321)
            int r3 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r3 <= 0) goto L88
            r5 = 1
            goto L90
        L88:
            r0.add(r9)     // Catch: org.json.JSONException -> L8d java.lang.Throwable -> L98
            int r6 = r6 + 1
        L8d:
            r3 = 0
            r10 = 1
            goto L65
        L90:
            java.lang.String r3 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L98
            r4 = r3
            goto L9b
        L98:
            r0 = move-exception
            goto La7
        L9a:
            r4 = r2
        L9b:
            r3 = 30
            if (r6 >= r3) goto La6
            if (r4 == 0) goto La6
            if (r5 != 0) goto La6
            r3 = 0
            goto L1d
        La6:
            return r0
        La7:
            kotlin.getMinWindowSequenceNumber.read(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda21.AudioAttributesCompatParcelizer(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    private static ArrayList<String> read(ArrayList<String> arrayList) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor editorEdit = RemoteActionCompatParcelizer.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j / 1000) <= 86400 && !RemoteActionCompatParcelizer.getString(string, "").equals(string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Method IconCompatParcelizer(java.lang.Class<?> r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda21.IconCompatParcelizer(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    private static Class<?> RemoteActionCompatParcelizer(Context context, String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = AudioAttributesCompatParcelizer;
            Class<?> clsLoadClass = map.get(str);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
            try {
                clsLoadClass = context.getClassLoader().loadClass(str);
                map.put(str, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException unused) {
                return clsLoadClass;
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    private static Object AudioAttributesCompatParcelizer(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodIconCompatParcelizer;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return null;
        }
        try {
            Class<?> clsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, str);
            if (clsRemoteActionCompatParcelizer == null || (methodIconCompatParcelizer = IconCompatParcelizer(clsRemoteActionCompatParcelizer, str2)) == null) {
                return null;
            }
            if (obj != null) {
                obj = clsRemoteActionCompatParcelizer.cast(obj);
            }
            try {
                return methodIconCompatParcelizer.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
            return null;
        }
    }

    static void IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda21.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = read;
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda21.class);
        }
    }
}
