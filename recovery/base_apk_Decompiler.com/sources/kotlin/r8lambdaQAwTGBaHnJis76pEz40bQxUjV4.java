package kotlin;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaQAwTGBaHnJis76pEz40bQxUjV4 {
    private static int IconCompatParcelizer = -1;
    private static long read;

    public static JSONObject AudioAttributesCompatParcelizer(Context context) {
        getSort getsort = new getSort(context);
        getsort.AudioAttributesImplApi26Parcelizer();
        boolean zAudioAttributesImplApi21Parcelizer = getsort.AudioAttributesImplApi21Parcelizer();
        boolean zAudioAttributesImplBaseParcelizer = getsort.AudioAttributesImplBaseParcelizer();
        boolean zMediaBrowserCompatCustomActionResultReceiver = getsort.MediaBrowserCompatCustomActionResultReceiver();
        boolean z = getsort.read();
        boolean zRemoteActionCompatParcelizer = getSort.RemoteActionCompatParcelizer("su");
        boolean zRemoteActionCompatParcelizer2 = getSort.RemoteActionCompatParcelizer("busybox");
        boolean zIconCompatParcelizer = getSort.IconCompatParcelizer();
        boolean zWrite = getSort.write();
        boolean zAudioAttributesCompatParcelizer = getSort.AudioAttributesCompatParcelizer();
        boolean zRemoteActionCompatParcelizer3 = getsort.RemoteActionCompatParcelizer();
        boolean zMediaBrowserCompatItemReceiver = getSort.MediaBrowserCompatItemReceiver();
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "basic_check", Boolean.valueOf(new RtspMediaSourceRtspPlaybackException(context).AudioAttributesCompatParcelizer()));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "soft_check", Boolean.valueOf(zAudioAttributesImplBaseParcelizer));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "hard_check", Boolean.valueOf(zAudioAttributesImplApi21Parcelizer));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "root_management_apps_exist", Boolean.valueOf(zMediaBrowserCompatCustomActionResultReceiver));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "dangerous_apps_installed", Boolean.valueOf(z));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "busy_box_exist", Boolean.valueOf(zRemoteActionCompatParcelizer2));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "su_binary_exist", Boolean.valueOf(zRemoteActionCompatParcelizer));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "su_exist", Boolean.valueOf(zAudioAttributesCompatParcelizer));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "dangerous_properties_set", Boolean.valueOf(zIconCompatParcelizer));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "has_test_keys", Boolean.valueOf(zMediaBrowserCompatItemReceiver));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "read_only_path_revoked", Boolean.valueOf(zWrite));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "root_native_check", Boolean.valueOf(zRemoteActionCompatParcelizer3));
        return jSONObject;
    }

    public static int RemoteActionCompatParcelizer(Context context) {
        if (write()) {
            return IconCompatParcelizer;
        }
        getSort getsort = new getSort(context);
        getsort.AudioAttributesImplApi26Parcelizer();
        getsort.AudioAttributesImplApi21Parcelizer();
        boolean zAudioAttributesImplBaseParcelizer = getsort.AudioAttributesImplBaseParcelizer();
        int iMediaBrowserCompatCustomActionResultReceiver = getsort.MediaBrowserCompatCustomActionResultReceiver();
        int i = getsort.read();
        int iRemoteActionCompatParcelizer = getSort.RemoteActionCompatParcelizer("su");
        boolean zRemoteActionCompatParcelizer = getSort.RemoteActionCompatParcelizer("busybox");
        int iIconCompatParcelizer = getSort.IconCompatParcelizer();
        int iWrite = getSort.write();
        int iAudioAttributesCompatParcelizer = getSort.AudioAttributesCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = getsort.RemoteActionCompatParcelizer();
        int iMediaBrowserCompatItemReceiver = getSort.MediaBrowserCompatItemReceiver();
        int i2 = ((zAudioAttributesImplBaseParcelizer ? 1 : 0) * 500) + (zRemoteActionCompatParcelizer ? 1 : 0);
        int[] iArr = {iMediaBrowserCompatCustomActionResultReceiver, i, iRemoteActionCompatParcelizer, iIconCompatParcelizer, iWrite, iAudioAttributesCompatParcelizer, iRemoteActionCompatParcelizer2, iMediaBrowserCompatItemReceiver};
        for (int i3 = 0; i3 < 8; i3++) {
            i2 += iArr[i3] * 50;
        }
        read = System.currentTimeMillis();
        IconCompatParcelizer = i2;
        return i2;
    }

    private static boolean write() {
        return IconCompatParcelizer != -1 && read + 900000 > System.currentTimeMillis();
    }
}
