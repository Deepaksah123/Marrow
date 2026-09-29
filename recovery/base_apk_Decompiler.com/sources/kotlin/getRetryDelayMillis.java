package kotlin;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.setMinRetryCount;

/* JADX INFO: loaded from: classes3.dex */
interface getRetryDelayMillis {

    public enum read {
        ASCENDING,
        DESCENDING
    }

    read AudioAttributesCompatParcelizer();

    @Deprecated
    void AudioAttributesCompatParcelizer(int i) throws IOException;

    void AudioAttributesCompatParcelizer(int i, float f) throws IOException;

    void AudioAttributesCompatParcelizer(int i, int i2) throws IOException;

    void AudioAttributesCompatParcelizer(int i, long j) throws IOException;

    void AudioAttributesCompatParcelizer(int i, Object obj, setNotMetRequirements setnotmetrequirements) throws IOException;

    void AudioAttributesCompatParcelizer(int i, List<Long> list, boolean z) throws IOException;

    void AudioAttributesImplApi21Parcelizer(int i, List<Long> list, boolean z) throws IOException;

    void AudioAttributesImplApi26Parcelizer(int i, List<Integer> list, boolean z) throws IOException;

    void AudioAttributesImplBaseParcelizer(int i, List<Integer> list, boolean z) throws IOException;

    void IconCompatParcelizer(int i, int i2) throws IOException;

    void IconCompatParcelizer(int i, long j) throws IOException;

    void IconCompatParcelizer(int i, List<Integer> list, boolean z) throws IOException;

    void IconCompatParcelizer(int i, DownloadIndex downloadIndex) throws IOException;

    void MediaBrowserCompatCustomActionResultReceiver(int i, int i2) throws IOException;

    void MediaBrowserCompatCustomActionResultReceiver(int i, List<Float> list, boolean z) throws IOException;

    void MediaBrowserCompatItemReceiver(int i, List<Long> list, boolean z) throws IOException;

    void MediaBrowserCompatMediaItem(int i, List<Integer> list, boolean z) throws IOException;

    void MediaBrowserCompatSearchResultReceiver(int i, List<Integer> list, boolean z) throws IOException;

    void MediaMetadataCompat(int i, List<Long> list, boolean z) throws IOException;

    void RatingCompat(int i, List<Long> list, boolean z) throws IOException;

    void RemoteActionCompatParcelizer(int i, int i2) throws IOException;

    void RemoteActionCompatParcelizer(int i, long j) throws IOException;

    @Deprecated
    void RemoteActionCompatParcelizer(int i, List<?> list, setNotMetRequirements setnotmetrequirements) throws IOException;

    void RemoteActionCompatParcelizer(int i, List<Double> list, boolean z) throws IOException;

    <K, V> void RemoteActionCompatParcelizer(int i, setMinRetryCount.read<K, V> readVar, Map<K, V> map) throws IOException;

    @Deprecated
    void read(int i) throws IOException;

    void read(int i, double d) throws IOException;

    void read(int i, int i2) throws IOException;

    void read(int i, long j) throws IOException;

    void read(int i, List<String> list) throws IOException;

    void read(int i, List<Boolean> list, boolean z) throws IOException;

    void write(int i, int i2) throws IOException;

    void write(int i, long j) throws IOException;

    void write(int i, Object obj) throws IOException;

    @Deprecated
    void write(int i, Object obj, setNotMetRequirements setnotmetrequirements) throws IOException;

    void write(int i, String str) throws IOException;

    void write(int i, List<DownloadIndex> list) throws IOException;

    void write(int i, List<?> list, setNotMetRequirements setnotmetrequirements) throws IOException;

    void write(int i, List<Integer> list, boolean z) throws IOException;

    void write(int i, boolean z) throws IOException;
}
