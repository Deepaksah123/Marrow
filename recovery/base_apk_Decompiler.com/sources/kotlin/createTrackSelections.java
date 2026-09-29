package kotlin;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.marrow.data.models.ResponseError;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class createTrackSelections {
    private read<String, Pattern> AudioAttributesCompatParcelizer = new read<>(100);

    public final Pattern read(String str) {
        Pattern patternRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str);
        if (patternRemoteActionCompatParcelizer != null) {
            return patternRemoteActionCompatParcelizer;
        }
        Pattern patternCompile = Pattern.compile(str);
        this.AudioAttributesCompatParcelizer.read(str, patternCompile);
        return patternCompile;
    }

    static class read<K, V> {
        private LinkedHashMap<K, V> AudioAttributesCompatParcelizer;
        private int write = 100;

        public read(int i) {
            int i2 = ResponseError.NO_INTERNET_ERROR / 3;
            this.AudioAttributesCompatParcelizer = new LinkedHashMap<K, V>(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO) { // from class: o.createTrackSelections.read.4
                @Override // java.util.LinkedHashMap
                protected final boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    return size() > read.this.write;
                }
            };
        }

        public final V RemoteActionCompatParcelizer(K k) {
            V v;
            synchronized (this) {
                v = this.AudioAttributesCompatParcelizer.get(k);
            }
            return v;
        }

        public final void read(K k, V v) {
            synchronized (this) {
                this.AudioAttributesCompatParcelizer.put(k, v);
            }
        }
    }
}
