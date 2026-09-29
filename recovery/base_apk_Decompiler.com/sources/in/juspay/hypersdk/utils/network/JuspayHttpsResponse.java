package in.juspay.hypersdk.utils.network;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.C0156TypeKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JuspayHttpsResponse {
    private static final String LOG_TAG = "JuspayHttpsResponse";
    public final Map<String, List<String>> headers;
    public final int responseCode;
    public final byte[] responsePayload;

    public JuspayHttpsResponse(int i, byte[] bArr, Map<String, List<String>> map) {
        this.responseCode = i;
        this.responsePayload = bArr;
        this.headers = map;
    }

    private static byte[] decodeGZip(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr);
                if (i < 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    gZIPInputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
                gZIPInputStream.close();
                throw th;
            }
        } finally {
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("responseCode", this.responseCode);
            jSONObject.put("responsePayload", this.responsePayload);
            jSONObject.put("headers", this.headers);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public JuspayHttpsResponse(HttpsURLConnection httpsURLConnection) throws IOException {
        InputStream errorStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int responseCode = httpsURLConnection.getResponseCode();
        this.responseCode = responseCode;
        this.headers = httpsURLConnection.getHeaderFields();
        if ((responseCode >= 200 && responseCode < 300) || responseCode == 302) {
            errorStream = httpsURLConnection.getInputStream();
        } else {
            errorStream = httpsURLConnection.getErrorStream();
        }
        String contentEncoding = httpsURLConnection.getContentEncoding();
        if (contentEncoding != null && contentEncoding.equals("gzip")) {
            this.responsePayload = decodeGZip(errorStream);
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(errorStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[1024];
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = bufferedInputStream.read(bArr, 0, 1024);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                this.responsePayload = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                return;
            }
            bufferedInputStream.close();
            throw th;
        }
    }

    public JuspayHttpsResponse(C0156TypeKt c0156TypeKt) {
        this.responseCode = c0156TypeKt.getCode();
        this.headers = c0156TypeKt.getHeaders().read();
        if (c0156TypeKt.getBody() != null) {
            String str = c0156TypeKt.read("content-encoding");
            if (str != null && str.equalsIgnoreCase("gzip")) {
                this.responsePayload = decodeGZip(c0156TypeKt.getBody().IconCompatParcelizer());
            } else {
                this.responsePayload = c0156TypeKt.getBody().AudioAttributesImplApi26Parcelizer();
            }
        } else {
            this.responsePayload = null;
        }
        if (c0156TypeKt.getBody() != null) {
            c0156TypeKt.getBody().close();
        }
    }
}
