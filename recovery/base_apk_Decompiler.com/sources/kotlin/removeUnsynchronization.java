package kotlin;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class removeUnsynchronization {
    private static final Map<String, removeUnsynchronization> RemoteActionCompatParcelizer = new HashMap();
    private final String AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;

    private removeUnsynchronization(Context context, String str) {
        this.IconCompatParcelizer = context;
        this.AudioAttributesCompatParcelizer = str;
    }

    public final Void RemoteActionCompatParcelizer(decodeGeobFrame decodegeobframe) throws IOException {
        synchronized (this) {
            FileOutputStream fileOutputStreamOpenFileOutput = this.IconCompatParcelizer.openFileOutput(this.AudioAttributesCompatParcelizer, 0);
            try {
                fileOutputStreamOpenFileOutput.write(decodegeobframe.toString().getBytes(CharsetNames.UTF_8));
            } finally {
                fileOutputStreamOpenFileOutput.close();
            }
        }
        return null;
    }

    public final decodeGeobFrame AudioAttributesCompatParcelizer() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        synchronized (this) {
            FileInputStream fileInputStream = null;
            try {
                fileInputStreamOpenFileInput = this.IconCompatParcelizer.openFileInput(this.AudioAttributesCompatParcelizer);
            } catch (FileNotFoundException | JSONException unused) {
                fileInputStreamOpenFileInput = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                int iAvailable = fileInputStreamOpenFileInput.available();
                byte[] bArr = new byte[iAvailable];
                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                decodeGeobFrame decodegeobframeWrite = decodeGeobFrame.write(new JSONObject(new String(bArr, CharsetNames.UTF_8)));
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                return decodegeobframeWrite;
            } catch (FileNotFoundException | JSONException unused2) {
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStreamOpenFileInput;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }
    }

    public final Void write() {
        synchronized (this) {
            this.IconCompatParcelizer.deleteFile(this.AudioAttributesCompatParcelizer);
        }
        return null;
    }

    public static removeUnsynchronization read(Context context, String str) {
        removeUnsynchronization removeunsynchronization;
        synchronized (removeUnsynchronization.class) {
            Map<String, removeUnsynchronization> map = RemoteActionCompatParcelizer;
            if (!map.containsKey(str)) {
                map.put(str, new removeUnsynchronization(context, str));
            }
            removeunsynchronization = map.get(str);
        }
        return removeunsynchronization;
    }

    final String read() {
        return this.AudioAttributesCompatParcelizer;
    }
}
