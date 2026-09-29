package kotlin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
public final class readEsInfo {
    private final String IconCompatParcelizer;
    private final Map<String, String> read;
    private final Map<String, String> write = new HashMap();

    public readEsInfo(String str, Map<String, String> map) {
        this.IconCompatParcelizer = str;
        this.read = map;
    }

    public final readEsInfo RemoteActionCompatParcelizer(String str, String str2) {
        this.write.put(str, str2);
        return this;
    }

    public final TsPayloadReader read() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String strWrite = null;
        inputStream = null;
        try {
            String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.read);
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("GET Request URL: ");
            sb.append(strAudioAttributesCompatParcelizer);
            dvbSubtitleReader.AudioAttributesCompatParcelizer(sb.toString());
            httpsURLConnection = (HttpsURLConnection) new URL(strAudioAttributesCompatParcelizer).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.write.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strWrite = write(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return new TsPayloadReader(responseCode, strWrite);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    private static String AudioAttributesCompatParcelizer(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(map);
        if (strRemoteActionCompatParcelizer.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                strRemoteActionCompatParcelizer = "&".concat(String.valueOf(strRemoteActionCompatParcelizer));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(strRemoteActionCompatParcelizer);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("?");
        sb2.append(strRemoteActionCompatParcelizer);
        return sb2.toString();
    }

    private static String RemoteActionCompatParcelizer(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb.append(next.getKey());
        sb.append("=");
        sb.append(next.getValue() != null ? URLEncoder.encode(next.getValue(), CharsetNames.UTF_8) : "");
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb.append("&");
            sb.append(next2.getKey());
            sb.append("=");
            sb.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), CharsetNames.UTF_8) : "");
        }
        return sb.toString();
    }

    private static String write(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, CharsetNames.UTF_8));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i != -1) {
                sb.append(cArr, 0, i);
            } else {
                return sb.toString();
            }
        }
    }
}
