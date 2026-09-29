package kotlin;

import android.content.res.Resources;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import kotlin.getChildStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class addMessageBody extends setLabel {
    private final String IconCompatParcelizer;
    private final String write;

    private addMessageBody(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public final boolean equals(Object obj) {
        return read(obj);
    }

    public final int hashCode() {
        return findFormatFeature.write(this.IconCompatParcelizer, this.write);
    }

    private static String RemoteActionCompatParcelizer(InputStream inputStream) throws IOException {
        if (Build.VERSION.SDK_INT >= 33) {
            return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toString();
            }
        }
    }

    private static JSONObject AudioAttributesCompatParcelizer(InputStream inputStream) throws IOException {
        try {
            return new JSONObject(RemoteActionCompatParcelizer(inputStream)).getJSONObject("entries");
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    private static JSONObject read(Resources resources) {
        int identifier = resources.getIdentifier("android:string/vendor_required_attestation_revocation_list_url", null, null);
        if (identifier != 0) {
            String string = resources.getString(identifier);
            if (!"https://android.googleapis.com/attestation/status".equals(string) && string.toLowerCase(Locale.ROOT).startsWith("https")) {
                throw new RuntimeException("unknown status url: ".concat(String.valueOf(string)));
            }
        }
        try {
            InputStream inputStreamOpenRawResource = resources.openRawResource(getChildStream.read.status);
            try {
                JSONObject jSONObjectAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
                return jSONObjectAudioAttributesCompatParcelizer;
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse certificate revocation status", e);
        }
    }

    public static addMessageBody AudioAttributesCompatParcelizer(Resources resources, BigInteger bigInteger) {
        try {
            JSONObject jSONObject = read(resources).getJSONObject(bigInteger.toString(16).toLowerCase());
            try {
                return new addMessageBody(jSONObject.getString("status"), jSONObject.getString("reason"));
            } catch (JSONException unused) {
                return new addMessageBody("", "");
            }
        } catch (JSONException unused2) {
            return null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("status is ");
        sb.append(this.IconCompatParcelizer);
        sb.append(", reason is ");
        sb.append(this.write);
        return sb.toString();
    }

    private /* synthetic */ boolean read(Object obj) {
        if (!(obj instanceof addMessageBody)) {
            return false;
        }
        addMessageBody addmessagebody = (addMessageBody) obj;
        return Objects.equals(this.IconCompatParcelizer, addmessagebody.IconCompatParcelizer) && Objects.equals(this.write, addmessagebody.write);
    }
}
