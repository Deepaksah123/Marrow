package kotlin;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import in.juspay.hypersdk.core.Constants;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class capacity {
    private static final String[] RemoteActionCompatParcelizer = {"*", "FCM", CodePackage.GCM, ""};
    private final String AudioAttributesCompatParcelizer;
    private final SharedPreferences IconCompatParcelizer;

    public capacity(FirebaseApp firebaseApp) {
        this.IconCompatParcelizer = firebaseApp.AudioAttributesCompatParcelizer().getSharedPreferences("com.google.android.gms.appid", 0);
        this.AudioAttributesCompatParcelizer = read(firebaseApp);
    }

    private static String read(FirebaseApp firebaseApp) {
        String strIconCompatParcelizer = firebaseApp.read().IconCompatParcelizer();
        if (strIconCompatParcelizer != null) {
            return strIconCompatParcelizer;
        }
        String strRemoteActionCompatParcelizer = firebaseApp.read().RemoteActionCompatParcelizer();
        if (!strRemoteActionCompatParcelizer.startsWith("1:") && !strRemoteActionCompatParcelizer.startsWith("2:")) {
            return strRemoteActionCompatParcelizer;
        }
        String[] strArrSplit = strRemoteActionCompatParcelizer.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String IconCompatParcelizer(String str, String str2) {
        StringBuilder sb = new StringBuilder("|T|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return sb.toString();
    }

    public final String write() {
        synchronized (this.IconCompatParcelizer) {
            for (String str : RemoteActionCompatParcelizer) {
                String string = this.IconCompatParcelizer.getString(IconCompatParcelizer(this.AudioAttributesCompatParcelizer, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = read(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    private static String read(String str) {
        try {
            return new JSONObject(str).getString(LoggedUserResponse.KEY_TOKEN);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String IconCompatParcelizer() {
        synchronized (this.IconCompatParcelizer) {
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer != null) {
                return strRemoteActionCompatParcelizer;
            }
            return read();
        }
    }

    private String RemoteActionCompatParcelizer() {
        String string;
        synchronized (this.IconCompatParcelizer) {
            string = this.IconCompatParcelizer.getString("|S|id", null);
        }
        return string;
    }

    private String read() {
        synchronized (this.IconCompatParcelizer) {
            String string = this.IconCompatParcelizer.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey publicKeyAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(string);
            if (publicKeyAudioAttributesCompatParcelizer == null) {
                return null;
            }
            return write(publicKeyAudioAttributesCompatParcelizer);
        }
    }

    private static String write(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + 112);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static PublicKey AudioAttributesCompatParcelizer(String str) {
        try {
            return KeyFactory.getInstance(Constants.ALG_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.toString();
            return null;
        }
    }
}
