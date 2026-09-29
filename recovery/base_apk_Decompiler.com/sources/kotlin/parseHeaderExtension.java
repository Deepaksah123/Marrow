package kotlin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class parseHeaderExtension {
    private final int RemoteActionCompatParcelizer;
    private final Map<String, String> AudioAttributesCompatParcelizer = new HashMap();
    private final int read = 64;

    public parseHeaderExtension(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final Map<String, String> read() {
        Map<String, String> mapUnmodifiableMap;
        synchronized (this) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(this.AudioAttributesCompatParcelizer));
        }
        return mapUnmodifiableMap;
    }

    public final boolean read(String str, String str2) {
        synchronized (this) {
            String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str);
            if (this.AudioAttributesCompatParcelizer.size() >= this.read && !this.AudioAttributesCompatParcelizer.containsKey(strAudioAttributesCompatParcelizer)) {
                DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                StringBuilder sb = new StringBuilder("Ignored entry \"");
                sb.append(str);
                sb.append("\" when adding custom keys. Maximum allowable: ");
                sb.append(this.read);
                dvbSubtitleReader.read(sb.toString());
                return false;
            }
            String strIconCompatParcelizer = IconCompatParcelizer(str2, this.RemoteActionCompatParcelizer);
            if (putSps.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.get(strAudioAttributesCompatParcelizer), strIconCompatParcelizer)) {
                return false;
            }
            Map<String, String> map = this.AudioAttributesCompatParcelizer;
            if (str2 == null) {
                strIconCompatParcelizer = "";
            }
            map.put(strAudioAttributesCompatParcelizer, strIconCompatParcelizer);
            return true;
        }
    }

    public final void write(Map<String, String> map) {
        synchronized (this) {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(entry.getKey());
                if (this.AudioAttributesCompatParcelizer.size() < this.read || this.AudioAttributesCompatParcelizer.containsKey(strAudioAttributesCompatParcelizer)) {
                    String value = entry.getValue();
                    this.AudioAttributesCompatParcelizer.put(strAudioAttributesCompatParcelizer, value == null ? "" : IconCompatParcelizer(value, this.RemoteActionCompatParcelizer));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                StringBuilder sb = new StringBuilder();
                sb.append("Ignored ");
                sb.append(i);
                sb.append(" entries when adding custom keys. Maximum allowable: ");
                sb.append(this.read);
                dvbSubtitleReader.read(sb.toString());
            }
        }
    }

    private String AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        return IconCompatParcelizer(str, this.RemoteActionCompatParcelizer);
    }

    public static String IconCompatParcelizer(String str, int i) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }
}
