package kotlin;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.BasicClassIntrospector;

/* JADX INFO: loaded from: classes4.dex */
interface CollectorBase {

    public enum IconCompatParcelizer {
        ASCENDING,
        DESCENDING
    }

    void AudioAttributesCompatParcelizer(int i, int i2) throws IOException;

    void AudioAttributesCompatParcelizer(int i, long j) throws IOException;

    @Deprecated
    void AudioAttributesCompatParcelizer(int i, Object obj, getPrimaryMember getprimarymember) throws IOException;

    void AudioAttributesCompatParcelizer(int i, List<?> list, getPrimaryMember getprimarymember) throws IOException;

    void AudioAttributesCompatParcelizer(int i, List<Integer> list, boolean z) throws IOException;

    void AudioAttributesImplApi21Parcelizer(int i, List<Float> list, boolean z) throws IOException;

    void AudioAttributesImplApi26Parcelizer(int i, List<Integer> list, boolean z) throws IOException;

    void AudioAttributesImplBaseParcelizer(int i, int i2) throws IOException;

    void AudioAttributesImplBaseParcelizer(int i, List<Long> list, boolean z) throws IOException;

    @Deprecated
    void IconCompatParcelizer(int i) throws IOException;

    void IconCompatParcelizer(int i, int i2) throws IOException;

    void IconCompatParcelizer(int i, long j) throws IOException;

    void IconCompatParcelizer(int i, Object obj, getPrimaryMember getprimarymember) throws IOException;

    void IconCompatParcelizer(int i, String str) throws IOException;

    void IconCompatParcelizer(int i, List<Long> list, boolean z) throws IOException;

    void IconCompatParcelizer(int i, AnnotatedWithParams annotatedWithParams) throws IOException;

    void IconCompatParcelizer(int i, boolean z) throws IOException;

    void MediaBrowserCompatCustomActionResultReceiver(int i, List<Integer> list, boolean z) throws IOException;

    void MediaBrowserCompatItemReceiver(int i, List<Long> list, boolean z) throws IOException;

    void MediaBrowserCompatSearchResultReceiver(int i, List<Integer> list, boolean z) throws IOException;

    void MediaDescriptionCompat(int i, List<Integer> list, boolean z) throws IOException;

    void MediaMetadataCompat(int i, List<Long> list, boolean z) throws IOException;

    void RatingCompat(int i, List<Long> list, boolean z) throws IOException;

    void RemoteActionCompatParcelizer(int i, float f) throws IOException;

    void RemoteActionCompatParcelizer(int i, int i2) throws IOException;

    void RemoteActionCompatParcelizer(int i, long j) throws IOException;

    void RemoteActionCompatParcelizer(int i, List<AnnotatedWithParams> list) throws IOException;

    void RemoteActionCompatParcelizer(int i, List<Integer> list, boolean z) throws IOException;

    @Deprecated
    void read(int i) throws IOException;

    void read(int i, int i2) throws IOException;

    void read(int i, long j) throws IOException;

    void read(int i, Object obj) throws IOException;

    @Deprecated
    void read(int i, List<?> list, getPrimaryMember getprimarymember) throws IOException;

    void read(int i, List<Double> list, boolean z) throws IOException;

    IconCompatParcelizer write();

    void write(int i, double d) throws IOException;

    void write(int i, int i2) throws IOException;

    void write(int i, long j) throws IOException;

    void write(int i, List<String> list) throws IOException;

    void write(int i, List<Boolean> list, boolean z) throws IOException;

    <K, V> void write(int i, BasicClassIntrospector.AudioAttributesCompatParcelizer<K, V> audioAttributesCompatParcelizer, Map<K, V> map) throws IOException;
}
