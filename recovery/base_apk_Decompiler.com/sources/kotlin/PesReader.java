package kotlin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class PesReader {
    private static final Charset AudioAttributesCompatParcelizer = Charset.forName(CharsetNames.UTF_8);
    private final isStartOfTsPacket IconCompatParcelizer;

    public PesReader(isStartOfTsPacket isstartoftspacket) {
        this.IconCompatParcelizer = isstartoftspacket;
    }

    public final void IconCompatParcelizer(String str, String str2) throws Throwable {
        BufferedWriter bufferedWriter;
        String strWrite;
        File fileAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strWrite = write(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAudioAttributesImplBaseParcelizer), AudioAttributesCompatParcelizer));
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
            bufferedWriter = bufferedWriter2;
        }
        try {
            bufferedWriter.write(strWrite);
            bufferedWriter.flush();
            putSps.AudioAttributesCompatParcelizer(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            DvbSubtitleReader.read().RemoteActionCompatParcelizer();
            putSps.AudioAttributesCompatParcelizer(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            putSps.AudioAttributesCompatParcelizer(bufferedWriter, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final String AudioAttributesCompatParcelizer(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(str);
        FileInputStream fileInputStream2 = null;
        if (!fileAudioAttributesImplBaseParcelizer.exists() || fileAudioAttributesImplBaseParcelizer.length() == 0) {
            DvbSubtitleReader.read().IconCompatParcelizer("No userId set for session ".concat(String.valueOf(str)));
            IconCompatParcelizer(fileAudioAttributesImplBaseParcelizer);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileAudioAttributesImplBaseParcelizer);
            try {
                try {
                    String strIconCompatParcelizer = IconCompatParcelizer(putSps.read(fileInputStream));
                    DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                    StringBuilder sb = new StringBuilder("Loaded userId ");
                    sb.append(strIconCompatParcelizer);
                    sb.append(" for session ");
                    sb.append(str);
                    dvbSubtitleReader.IconCompatParcelizer(sb.toString());
                    putSps.AudioAttributesCompatParcelizer(fileInputStream, "Failed to close user metadata file.");
                    return strIconCompatParcelizer;
                } catch (Exception unused) {
                    DvbSubtitleReader.read().RemoteActionCompatParcelizer();
                    IconCompatParcelizer(fileAudioAttributesImplBaseParcelizer);
                    putSps.AudioAttributesCompatParcelizer(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                putSps.AudioAttributesCompatParcelizer(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            putSps.AudioAttributesCompatParcelizer(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final void write(String str, Map<String, String> map, boolean z) throws Throwable {
        String strWrite;
        BufferedWriter bufferedWriter;
        File fileRemoteActionCompatParcelizer = z ? RemoteActionCompatParcelizer(str) : AudioAttributesImplApi21Parcelizer(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strWrite = write(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileRemoteActionCompatParcelizer), AudioAttributesCompatParcelizer));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused) {
        }
        try {
            bufferedWriter.write(strWrite);
            bufferedWriter.flush();
            putSps.AudioAttributesCompatParcelizer(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            DvbSubtitleReader.read().RemoteActionCompatParcelizer();
            IconCompatParcelizer(fileRemoteActionCompatParcelizer);
            putSps.AudioAttributesCompatParcelizer(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            putSps.AudioAttributesCompatParcelizer(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    final Map<String, String> AudioAttributesCompatParcelizer(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        File fileRemoteActionCompatParcelizer = z ? RemoteActionCompatParcelizer(str) : AudioAttributesImplApi21Parcelizer(str);
        if (!fileRemoteActionCompatParcelizer.exists() || fileRemoteActionCompatParcelizer.length() == 0) {
            IconCompatParcelizer(fileRemoteActionCompatParcelizer);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileRemoteActionCompatParcelizer);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused) {
        }
        try {
            Map<String, String> map = read(putSps.read(fileInputStream));
            putSps.AudioAttributesCompatParcelizer(fileInputStream, "Failed to close user metadata file.");
            return map;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            DvbSubtitleReader.read().RemoteActionCompatParcelizer();
            IconCompatParcelizer(fileRemoteActionCompatParcelizer);
            putSps.AudioAttributesCompatParcelizer(fileInputStream2, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            putSps.AudioAttributesCompatParcelizer(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    private File AudioAttributesImplBaseParcelizer(String str) {
        return this.IconCompatParcelizer.read(str, "user-data");
    }

    private File AudioAttributesImplApi21Parcelizer(String str) {
        return this.IconCompatParcelizer.read(str, "keys");
    }

    private File RemoteActionCompatParcelizer(String str) {
        return this.IconCompatParcelizer.read(str, "internal-keys");
    }

    private static String IconCompatParcelizer(String str) throws JSONException {
        return RemoteActionCompatParcelizer(new JSONObject(str), "userId");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.PesReader$2] */
    private static String write(String str) throws JSONException {
        return new JSONObject(str) { // from class: o.PesReader.2
            private /* synthetic */ String write;

            {
                this.write = str;
                put("userId", str);
            }
        }.toString();
    }

    private static Map<String, String> read(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, RemoteActionCompatParcelizer(jSONObject, next));
        }
        return map;
    }

    private static String write(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String RemoteActionCompatParcelizer(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    private static void IconCompatParcelizer(File file) {
        if (file.exists() && file.delete()) {
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Deleted corrupt file: ");
            sb.append(file.getAbsolutePath());
            dvbSubtitleReader.write(sb.toString());
        }
    }
}
