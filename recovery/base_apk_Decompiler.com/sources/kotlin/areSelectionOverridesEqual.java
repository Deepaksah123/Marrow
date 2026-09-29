package kotlin;

import com.marrow.data.models.video.DownloadableResolution;
import com.marrow.data.models.video.PixelInfo;
import java.util.NoSuchElementException;
import kotlin.areRendererDisabledFlagsEqual;
import kotlin.buildFormat;
import kotlin.isWebvttHeaderLine;
import kotlin.readFromInput;

/* JADX INFO: loaded from: classes3.dex */
public final class areSelectionOverridesEqual implements areRendererDisabledFlagsEqual.IconCompatParcelizer {
    private final int AudioAttributesCompatParcelizer;
    private DownloadableResolution AudioAttributesImplApi26Parcelizer;
    private final getStreamPositionUsForContent AudioAttributesImplBaseParcelizer;
    private final areRendererDisabledFlagsEqual.write IconCompatParcelizer;
    private final areRendererDisabledFlagsEqual.RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver;
    private final getDataSpec RemoteActionCompatParcelizer;
    private final PixelInfo[] read;
    private final isWebvttHeaderLine.AudioAttributesCompatParcelizer write;

    public areSelectionOverridesEqual(PixelInfo[] pixelInfoArr, isWebvttHeaderLine.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, getStreamPositionUsForContent getstreampositionusforcontent, getDataSpec getdataspec, areRendererDisabledFlagsEqual.write writeVar, int i, areRendererDisabledFlagsEqual.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(pixelInfoArr, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(getdataspec, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.read = pixelInfoArr;
        this.write = audioAttributesCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = getstreampositionusforcontent;
        this.RemoteActionCompatParcelizer = getdataspec;
        this.IconCompatParcelizer = writeVar;
        this.AudioAttributesCompatParcelizer = i;
        this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer;
        audioAttributesCompatParcelizer.write(new readFromInput.RemoteActionCompatParcelizer() { // from class: o.putSelectionOverridesToBundle
            @Override // o.readFromInput.RemoteActionCompatParcelizer
            public final void read(int i2, Object obj) {
                areSelectionOverridesEqual.read(this.RemoteActionCompatParcelizer, (PixelInfo) obj);
            }
        });
    }

    @Override // o.areRendererDisabledFlagsEqual.IconCompatParcelizer
    public final void IconCompatParcelizer() {
        DownloadableResolution downloadableResolution = this.AudioAttributesImplApi26Parcelizer;
        if (downloadableResolution == null) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer.write(downloadableResolution.getResolutionHeight());
        this.IconCompatParcelizer.IconCompatParcelizer(downloadableResolution);
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer(PixelInfo pixelInfo) {
        if (pixelInfo.isSupported()) {
            this.AudioAttributesImplApi26Parcelizer = pixelInfo.downloadableResolution;
            this.write.RemoteActionCompatParcelizer(pixelInfo);
        } else {
            this.MediaBrowserCompatItemReceiver.read(pixelInfo.downloadableResolution.getUnavailableErrorMessage(), pixelInfo.pixelResolutionCategory);
        }
    }

    @Override // o.areRendererDisabledFlagsEqual.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer() {
        PixelInfo pixelInfo;
        buildFormat.Companion companion = buildFormat.INSTANCE;
        getChunkEndTimeUs getchunkendtimeusIconCompatParcelizer = buildFormat.Companion.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.onSetPlaybackSpeed());
        PixelInfo[] pixelInfoArr = this.read;
        int length = pixelInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                pixelInfo = null;
                break;
            }
            pixelInfo = pixelInfoArr[i];
            if (pixelInfo.pixelResolutionCategory == getchunkendtimeusIconCompatParcelizer) {
                break;
            } else {
                i++;
            }
        }
        if (pixelInfo != null && pixelInfo.isSupported()) {
            this.write.RemoteActionCompatParcelizer(pixelInfo);
            this.AudioAttributesImplApi26Parcelizer = pixelInfo.downloadableResolution;
        } else {
            for (PixelInfo pixelInfo2 : this.read) {
                if (pixelInfo2.isSupported()) {
                    this.AudioAttributesImplApi26Parcelizer = pixelInfo2.downloadableResolution;
                    this.write.RemoteActionCompatParcelizer(pixelInfo2);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        this.write.AudioAttributesCompatParcelizer(this.read);
        if (this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer() >= this.AudioAttributesCompatParcelizer) {
            this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
            this.MediaBrowserCompatItemReceiver.read(this.AudioAttributesCompatParcelizer);
        } else {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(areSelectionOverridesEqual areselectionoverridesequal, PixelInfo pixelInfo) {
        toMagicModuleMetaRepoModel.write(pixelInfo, "");
        areselectionoverridesequal.AudioAttributesCompatParcelizer(pixelInfo);
    }
}
