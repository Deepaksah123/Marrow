package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Date;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda68;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013"}, d2 = {"Lo/lambdaonPlaybackParametersChanged44;", "", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "read", "()V", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "write", "()Landroid/os/Bundle;", "Landroid/content/SharedPreferences;", "AudioAttributesCompatParcelizer", "Landroid/content/SharedPreferences;", "IconCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class lambdaonPlaybackParametersChanged44 {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final SharedPreferences IconCompatParcelizer;
    private final String read;

    private lambdaonPlaybackParametersChanged44(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        str = (str == null || str.length() == 0) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        this.read = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sharedPreferences, "");
        this.IconCompatParcelizer = sharedPreferences;
    }

    public /* synthetic */ lambdaonPlaybackParametersChanged44(Context context, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i & 2) != 0 ? null : str);
    }

    public final Bundle write() {
        Bundle bundle = new Bundle();
        for (String str : this.IconCompatParcelizer.getAll().keySet()) {
            try {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                read(str, bundle);
            } catch (JSONException e) {
                DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
                lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.CACHE;
                String str2 = write;
                StringBuilder sb = new StringBuilder("Error reading cached value for key: '");
                sb.append(str);
                sb.append("' -- ");
                sb.append(e);
                readVar.read(lambdaonpositiondiscontinuity43, str2, sb.toString());
                return null;
            }
        }
        return bundle;
    }

    public final void read() {
        this.IconCompatParcelizer.edit().clear().apply();
    }

    private final void read(String p0, Bundle p1) throws JSONException {
        String str;
        String string = this.IconCompatParcelizer.getString(p0, "{}");
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        JSONObject jSONObject = new JSONObject(string);
        String string2 = jSONObject.getString("valueType");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "bool")) {
            p1.putBoolean(p0, jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            return;
        }
        int i = 0;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "bool[]")) {
            JSONArray jSONArray = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int length = jSONArray.length();
            boolean[] zArr = new boolean[length];
            while (i < length) {
                zArr[i] = jSONArray.getBoolean(i);
                i++;
            }
            p1.putBooleanArray(p0, zArr);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "byte")) {
            p1.putByte(p0, (byte) jSONObject.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "byte[]")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int length2 = jSONArray2.length();
            byte[] bArr = new byte[length2];
            while (i < length2) {
                bArr[i] = (byte) jSONArray2.getInt(i);
                i++;
            }
            p1.putByteArray(p0, bArr);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "short")) {
            p1.putShort(p0, (short) jSONObject.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "short[]")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int length3 = jSONArray3.length();
            short[] sArr = new short[length3];
            while (i < length3) {
                sArr[i] = (short) jSONArray3.getInt(i);
                i++;
            }
            p1.putShortArray(p0, sArr);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "int")) {
            p1.putInt(p0, jSONObject.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "int[]")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int length4 = jSONArray4.length();
            int[] iArr = new int[length4];
            while (i < length4) {
                iArr[i] = jSONArray4.getInt(i);
                i++;
            }
            p1.putIntArray(p0, iArr);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "long")) {
            p1.putLong(p0, jSONObject.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "long[]")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int length5 = jSONArray5.length();
            long[] jArr = new long[length5];
            while (i < length5) {
                jArr[i] = jSONArray5.getLong(i);
                i++;
            }
            p1.putLongArray(p0, jArr);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "float")) {
            p1.putFloat(p0, (float) jSONObject.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "float[]")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int length6 = jSONArray6.length();
            float[] fArr = new float[length6];
            while (i < length6) {
                fArr[i] = (float) jSONArray6.getDouble(i);
                i++;
            }
            p1.putFloatArray(p0, fArr);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "double")) {
            p1.putDouble(p0, jSONObject.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "double[]")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int length7 = jSONArray7.length();
            double[] dArr = new double[length7];
            while (i < length7) {
                dArr[i] = jSONArray7.getDouble(i);
                i++;
            }
            p1.putDoubleArray(p0, dArr);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "char")) {
            String string3 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (string3 == null || string3.length() != 1) {
                return;
            }
            p1.putChar(p0, string3.charAt(0));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "char[]")) {
            JSONArray jSONArray8 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int length8 = jSONArray8.length();
            char[] cArr = new char[length8];
            for (int i2 = 0; i2 < length8; i2++) {
                String string4 = jSONArray8.getString(i2);
                if (string4 != null && string4.length() == 1) {
                    cArr[i2] = string4.charAt(0);
                }
            }
            p1.putCharArray(p0, cArr);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "string")) {
            p1.putString(p0, jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "stringList")) {
            JSONArray jSONArray9 = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            int length9 = jSONArray9.length();
            ArrayList<String> arrayList = new ArrayList<>(length9);
            while (i < length9) {
                Object obj = jSONArray9.get(i);
                if (obj == JSONObject.NULL) {
                    str = null;
                } else {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str = (String) obj;
                }
                arrayList.add(i, str);
                i++;
            }
            p1.putStringArrayList(p0, arrayList);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string2, (Object) "enum")) {
            try {
                Class<?> cls = Class.forName(jSONObject.getString("enumType"));
                if (cls == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
                }
                p1.putSerializable(p0, Enum.valueOf(cls, jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
            } catch (ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: o.lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\bJ\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016"}, d2 = {"Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/os/Bundle;)Ljava/lang/String;", "p1", "Ljava/util/Date;", "read", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;", "(Landroid/os/Bundle;)Ljava/util/Date;", "write", "Lo/lambdaonIsLoadingChanged32;", "IconCompatParcelizer", "(Landroid/os/Bundle;)Lo/lambdaonIsLoadingChanged32;", "AudioAttributesCompatParcelizer", "", "AudioAttributesImplApi26Parcelizer", "(Landroid/os/Bundle;)Z", "Ljava/lang/String;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public static boolean AudioAttributesImplApi26Parcelizer(Bundle p0) {
            String string;
            return (p0 == null || (string = p0.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || p0.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }

        @getMagicModuleMeta
        public static String AudioAttributesCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getString("com.facebook.TokenCachingStrategy.Token");
        }

        @getMagicModuleMeta
        public final Date read(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return read(p0, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        @getMagicModuleMeta
        public static lambdaonIsLoadingChanged32 IconCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p0.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (lambdaonIsLoadingChanged32) p0.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            return p0.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? lambdaonIsLoadingChanged32.FACEBOOK_APPLICATION_WEB : lambdaonIsLoadingChanged32.WEB_VIEW;
        }

        @getMagicModuleMeta
        public final Date write(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return read(p0, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        @getMagicModuleMeta
        public static String RemoteActionCompatParcelizer(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        private static Date read(Bundle p0, String p1) {
            if (p0 == null) {
                return null;
            }
            long j = p0.getLong(p1, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("LegacyTokenHelper", "");
        write = "LegacyTokenHelper";
    }
}
