package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface NetworkTypeObserverApi31DisplayInfoCallback {
    Object AudioAttributesCompatParcelizer(String str, int i, RepeatModeUtil repeatModeUtil, SampleVideos<? super List<putInt>> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, String str2, SampleVideos<? super CachedContent> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, List<String> list, SampleVideos<? super List<readBytesAsString>> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesImplApi21Parcelizer(String str, SampleVideos<? super List<String>> sampleVideos);

    Object AudioAttributesImplBaseParcelizer(String str, SampleVideos<? super String> sampleVideos);

    Object IconCompatParcelizer();

    Object IconCompatParcelizer(String str, int i, SampleVideos<? super List<String>> sampleVideos);

    Object IconCompatParcelizer(String str, String str2, int i, SampleVideos<? super getShowPopup> sampleVideos);

    Object IconCompatParcelizer(String str, String str2, SampleVideos<? super CachedContent> sampleVideos);

    Object IconCompatParcelizer(String str, String str2, boolean z, SampleVideos<? super getShowPopup> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super List<OnInputFrameProcessedListener>> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super List<putInt>> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, String str2, int i, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, String str2, String str3, List<Integer> list, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, String str2, boolean z, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super String> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(List<String> list, SampleVideos<? super List<createNotificationChannel>> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super List<skipBytes>> sampleVideos);

    Object read(String str, int i, SampleVideos<? super List<String>> sampleVideos);

    Object read(String str, String str2, SampleVideos<? super dropTable> sampleVideos);

    Object read(String str, SampleVideos<? super List<dropTable>> sampleVideos);

    Object write();

    Object write(int i, SampleVideos<? super List<String>> sampleVideos);

    Object write(String str, String str2, int i, SampleVideos<? super getShowPopup> sampleVideos);

    Object write(String str, String str2, SampleVideos<? super ParsableByteArray> sampleVideos);

    Object write(String str, SampleVideos<? super onDisplayInfoChanged> sampleVideos);

    Object write(SampleVideos<? super Integer> sampleVideos);
}
