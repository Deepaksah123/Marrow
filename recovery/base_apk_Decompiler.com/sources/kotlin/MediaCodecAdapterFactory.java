package kotlin;

import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaCodecAdapterFactory {
    private final FirebaseApp RemoteActionCompatParcelizer;
    private File read;

    public enum write {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public MediaCodecAdapterFactory(FirebaseApp firebaseApp) {
        this.RemoteActionCompatParcelizer = firebaseApp;
    }

    private File AudioAttributesCompatParcelizer() {
        if (this.read == null) {
            synchronized (this) {
                if (this.read == null) {
                    File filesDir = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().getFilesDir();
                    StringBuilder sb = new StringBuilder("PersistedInstallation.");
                    sb.append(this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
                    sb.append(".json");
                    this.read = new File(filesDir, sb.toString());
                }
            }
        }
        return this.read;
    }

    public final createForVideoDecoding read() {
        JSONObject jSONObjectIconCompatParcelizer = IconCompatParcelizer();
        String strOptString = jSONObjectIconCompatParcelizer.optString("Fid", null);
        int iOptInt = jSONObjectIconCompatParcelizer.optInt("Status", write.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectIconCompatParcelizer.optString("AuthToken", null);
        String strOptString3 = jSONObjectIconCompatParcelizer.optString("RefreshToken", null);
        long jOptLong = jSONObjectIconCompatParcelizer.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectIconCompatParcelizer.optLong("ExpiresInSecs", 0L);
        return createForVideoDecoding.MediaBrowserCompatCustomActionResultReceiver().read(strOptString).AudioAttributesCompatParcelizer(write.values()[iOptInt]).IconCompatParcelizer(strOptString2).write(strOptString3).RemoteActionCompatParcelizer(jOptLong).write(jOptLong2).RemoteActionCompatParcelizer(jSONObjectIconCompatParcelizer.optString("FisError", null)).AudioAttributesCompatParcelizer();
    }

    private JSONObject IconCompatParcelizer() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(AudioAttributesCompatParcelizer());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public final createForVideoDecoding RemoteActionCompatParcelizer(createForVideoDecoding createforvideodecoding) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", createforvideodecoding.write());
            jSONObject.put("Status", createforvideodecoding.AudioAttributesImplBaseParcelizer().ordinal());
            jSONObject.put("AuthToken", createforvideodecoding.read());
            jSONObject.put("RefreshToken", createforvideodecoding.IconCompatParcelizer());
            jSONObject.put("TokenCreationEpochInSecs", createforvideodecoding.AudioAttributesImplApi21Parcelizer());
            jSONObject.put("ExpiresInSecs", createforvideodecoding.AudioAttributesCompatParcelizer());
            jSONObject.put("FisError", createforvideodecoding.RemoteActionCompatParcelizer());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(CharsetNames.UTF_8));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(AudioAttributesCompatParcelizer())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return createforvideodecoding;
    }
}
