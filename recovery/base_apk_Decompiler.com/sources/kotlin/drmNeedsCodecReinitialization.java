package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class drmNeedsCodecReinitialization {
    private SharedPreferences IconCompatParcelizer;

    public drmNeedsCodecReinitialization(Context context) {
        this.IconCompatParcelizer = context.getSharedPreferences("com.google.android.gms.appid", 0);
        RemoteActionCompatParcelizer(context, "com.google.android.gms.appid-no-backup");
    }

    private void RemoteActionCompatParcelizer(Context context, String str) {
        File file = new File(_isNaN.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || RemoteActionCompatParcelizer()) {
                return;
            }
            read();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    private boolean RemoteActionCompatParcelizer() {
        boolean zIsEmpty;
        synchronized (this) {
            zIsEmpty = this.IconCompatParcelizer.getAll().isEmpty();
        }
        return zIsEmpty;
    }

    private static String IconCompatParcelizer(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    private void read() {
        synchronized (this) {
            this.IconCompatParcelizer.edit().clear().commit();
        }
    }

    public final IconCompatParcelizer AudioAttributesCompatParcelizer(String str, String str2) {
        IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer;
        synchronized (this) {
            iconCompatParcelizerRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer.getString(IconCompatParcelizer(str, str2), null));
        }
        return iconCompatParcelizerRemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(String str, String str2, String str3, String str4) {
        synchronized (this) {
            String strRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(str3, str4, System.currentTimeMillis());
            if (strRemoteActionCompatParcelizer == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = this.IconCompatParcelizer.edit();
            editorEdit.putString(IconCompatParcelizer(str, str2), strRemoteActionCompatParcelizer);
            editorEdit.commit();
        }
    }

    static class IconCompatParcelizer {
        private static final long IconCompatParcelizer = TimeUnit.DAYS.toMillis(7);
        final String AudioAttributesCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private long read;

        private IconCompatParcelizer(String str, String str2, long j) {
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
            this.read = j;
        }

        static IconCompatParcelizer RemoteActionCompatParcelizer(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new IconCompatParcelizer(jSONObject.getString(LoggedUserResponse.KEY_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(PaymentConstants.TIMESTAMP));
                } catch (JSONException e) {
                    e.toString();
                    return null;
                }
            }
            return new IconCompatParcelizer(str, null, 0L);
        }

        static String RemoteActionCompatParcelizer(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LoggedUserResponse.KEY_TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(PaymentConstants.TIMESTAMP, j);
                return jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                return null;
            }
        }

        final boolean read(String str) {
            return System.currentTimeMillis() > this.read + IconCompatParcelizer || !str.equals(this.RemoteActionCompatParcelizer);
        }
    }
}
