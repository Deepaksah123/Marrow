package kotlin;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.BasicClassIntrospector;

/* JADX INFO: loaded from: classes4.dex */
interface getGetter {
    <T> T AudioAttributesCompatParcelizer(Class<T> cls, asAnnotations asannotations) throws IOException;

    AnnotatedWithParams AudioAttributesCompatParcelizer() throws IOException;

    void AudioAttributesCompatParcelizer(List<AnnotatedWithParams> list) throws IOException;

    @Deprecated
    <T> void AudioAttributesCompatParcelizer(List<T> list, getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException;

    int AudioAttributesImplApi21Parcelizer() throws IOException;

    void AudioAttributesImplApi21Parcelizer(List<Long> list) throws IOException;

    int AudioAttributesImplApi26Parcelizer() throws IOException;

    void AudioAttributesImplApi26Parcelizer(List<Float> list) throws IOException;

    int AudioAttributesImplBaseParcelizer() throws IOException;

    void AudioAttributesImplBaseParcelizer(List<Long> list) throws IOException;

    int IconCompatParcelizer() throws IOException;

    void IconCompatParcelizer(List<Double> list) throws IOException;

    long MediaBrowserCompatCustomActionResultReceiver() throws IOException;

    void MediaBrowserCompatCustomActionResultReceiver(List<Integer> list) throws IOException;

    float MediaBrowserCompatItemReceiver() throws IOException;

    void MediaBrowserCompatItemReceiver(List<Integer> list) throws IOException;

    long MediaBrowserCompatMediaItem() throws IOException;

    void MediaBrowserCompatMediaItem(List<String> list) throws IOException;

    long MediaBrowserCompatSearchResultReceiver() throws IOException;

    void MediaBrowserCompatSearchResultReceiver(List<Long> list) throws IOException;

    String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException;

    int MediaDescriptionCompat() throws IOException;

    void MediaDescriptionCompat(List<Integer> list) throws IOException;

    long MediaMetadataCompat() throws IOException;

    void MediaMetadataCompat(List<Long> list) throws IOException;

    int RatingCompat() throws IOException;

    void RatingCompat(List<String> list) throws IOException;

    double RemoteActionCompatParcelizer() throws IOException;

    <T> T RemoteActionCompatParcelizer(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException;

    void RemoteActionCompatParcelizer(List<Integer> list) throws IOException;

    long handleMediaPlayPauseIfPendingOnHandler() throws IOException;

    void handleMediaPlayPauseIfPendingOnHandler(List<Integer> list) throws IOException;

    int onAddQueueItem() throws IOException;

    void onCommand(List<Long> list) throws IOException;

    boolean onCommand() throws IOException;

    String onCustomAction() throws IOException;

    int read();

    @Deprecated
    <T> T read(getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException;

    void read(List<Integer> list) throws IOException;

    <T> void read(List<T> list, getPrimaryMember<T> getprimarymember, asAnnotations asannotations) throws IOException;

    @Deprecated
    <T> T write(Class<T> cls, asAnnotations asannotations) throws IOException;

    void write(List<Boolean> list) throws IOException;

    <K, V> void write(Map<K, V> map, BasicClassIntrospector.AudioAttributesCompatParcelizer<K, V> audioAttributesCompatParcelizer, asAnnotations asannotations) throws IOException;

    boolean write() throws IOException;
}
