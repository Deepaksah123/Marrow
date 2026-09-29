package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.video.ThemeState;
import com.marrow.data.models.video.cache.VideoCacheInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaChunkIterator1 implements getDataSpec {
    private final newInitializationChunk AudioAttributesCompatParcelizer;
    private final newMediaChunk RemoteActionCompatParcelizer;

    @setSdkPayload
    public MediaChunkIterator1(newMediaChunk newmediachunk, newInitializationChunk newinitializationchunk) {
        toMagicModuleMetaRepoModel.write(newmediachunk, "");
        toMagicModuleMetaRepoModel.write(newinitializationchunk, "");
        this.RemoteActionCompatParcelizer = newmediachunk;
        this.AudioAttributesCompatParcelizer = newinitializationchunk;
    }

    @Override // kotlin.getDataSpec
    public final VideoCacheInfo read() {
        return this.RemoteActionCompatParcelizer.onCommand();
    }

    @Override // kotlin.getDataSpec
    public final VideoCacheInfo write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.a_(str);
    }

    @Override // kotlin.getDataSpec
    public final VideoCacheInfo AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str);
    }

    @Override // kotlin.getDataSpec
    public final void RemoteActionCompatParcelizer(String str, float f) {
        toMagicModuleMetaRepoModel.write(str, "");
        VideoCacheInfo videoCacheInfoWrite = write(str);
        if (videoCacheInfoWrite == null) {
            throw new RuntimeException("Video cache not found for id :".concat(String.valueOf(str)));
        }
        videoCacheInfoWrite.setDownloadPercent(f);
        videoCacheInfoWrite.setLastUpdatedMs(System.currentTimeMillis());
        videoCacheInfoWrite.setLastQueuedTimeMs(0L);
        videoCacheInfoWrite.setDownloadStatus(-2);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(videoCacheInfoWrite);
    }

    @Override // kotlin.getDataSpec
    public final void read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(jCurrentTimeMillis, jCurrentTimeMillis, str);
    }

    @Override // kotlin.getDataSpec
    public final VideoCacheInfo AudioAttributesCompatParcelizer(String str, String str2, int i, String str3, ThemeState themeState, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(themeState, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoCacheInfo videoCacheInfo = new VideoCacheInfo();
        videoCacheInfo.setId(str2);
        videoCacheInfo.setPixelRate(i);
        videoCacheInfo.setDownloadPercent(BitmapDescriptorFactory.HUE_RED);
        videoCacheInfo.setDownloadStartedTimeMs(jCurrentTimeMillis);
        videoCacheInfo.setLastUpdatedMs(jCurrentTimeMillis);
        videoCacheInfo.setLastQueuedTimeMs(jCurrentTimeMillis);
        videoCacheInfo.setReferenceId(str);
        videoCacheInfo.setDownloadStatus(-1);
        videoCacheInfo.setDownloadSessionId(str3);
        videoCacheInfo.setDownloadedThemeState(themeState.getValue());
        videoCacheInfo.setCourseId(i2);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(videoCacheInfo);
        return videoCacheInfo;
    }

    @Override // kotlin.getDataSpec
    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getDataSpec
    public final void IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(str);
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str);
    }

    @Override // kotlin.getDataSpec
    public final void RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        String[] strArrAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(new String[]{str});
        this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(str);
        for (String str2 : strArrAudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str2);
        }
    }

    @Override // kotlin.getDataSpec
    public final void IconCompatParcelizer(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i, System.currentTimeMillis(), str);
    }

    @Override // kotlin.getDataSpec
    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // kotlin.getDataSpec
    public final void RemoteActionCompatParcelizer$36360dc2(String str, String str2, Enum r4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(r4, "");
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer$36360dc2(str, str2, r4);
    }
}
