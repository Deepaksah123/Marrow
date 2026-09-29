package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface setCacheWriteDataSinkFactory {
    void AudioAttributesCompatParcelizer(String str);

    int AudioAttributesImplApi21Parcelizer(String str);

    Object AudioAttributesImplApi26Parcelizer(String str);

    Object AudioAttributesImplBaseParcelizer(String str);

    Object IconCompatParcelizer();

    Object IconCompatParcelizer(String str);

    dropTable IconCompatParcelizer(String str, String str2);

    int MediaBrowserCompatCustomActionResultReceiver(String str);

    Object MediaBrowserCompatItemReceiver(String str);

    int MediaBrowserCompatMediaItem(String str);

    Object MediaDescriptionCompat(String str);

    Object MediaMetadataCompat(String str);

    int RemoteActionCompatParcelizer(String str);

    Object RemoteActionCompatParcelizer(String str, String str2);

    Object RemoteActionCompatParcelizer(CachedContentRange cachedContentRange);

    Object read(String str);

    Object read(dropTable droptable);

    Object write(String str);

    Object write(String str, SampleVideos<? super Integer> sampleVideos);

    void write(List<dropTable> list);
}
