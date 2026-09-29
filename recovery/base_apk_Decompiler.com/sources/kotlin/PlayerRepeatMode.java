package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerRepeatMode extends addAllCommands {
    private final getChildTimelines AudioAttributesCompatParcelizer;
    private RatingExternalSyntheticLambda0 AudioAttributesImplApi21Parcelizer;
    private lambdaupdateStateAndInformListeners57 AudioAttributesImplApi26Parcelizer;
    private Rdimen AudioAttributesImplBaseParcelizer;
    private WeakReference<Object> IconCompatParcelizer;
    private getWindowCount MediaBrowserCompatCustomActionResultReceiver;
    private lambdaonDeviceInfoChanged58 MediaBrowserCompatItemReceiver;
    private setCurrentMediaItemIndex MediaBrowserCompatSearchResultReceiver;
    private setTotalBufferedDurationMs RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig read;
    private final List<getFormatSupport> MediaDescriptionCompat = new ArrayList();
    private final List<setCurrentCues> RatingCompat = Collections.synchronizedList(new ArrayList());
    private getAdResumePositionUs MediaBrowserCompatMediaItem = null;
    private r8lambdar5_vvqa8cJhSPTKK5g5S1F0sadY MediaMetadataCompat = null;
    private RendererCapabilitiesHardwareAccelerationSupport onCommand = null;
    private final List<setMaxSeekToPreviousPositionMs> write = Collections.synchronizedList(new ArrayList());

    public PlayerRepeatMode(CleverTapInstanceConfig cleverTapInstanceConfig, getChildTimelines getchildtimelines) {
        this.read = cleverTapInstanceConfig;
        this.AudioAttributesCompatParcelizer = getchildtimelines;
    }

    @Override // kotlin.addAllCommands
    public final List<setMaxSeekToPreviousPositionMs> RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.addAllCommands
    public final void IconCompatParcelizer(setMaxSeekToPreviousPositionMs setmaxseektopreviouspositionms) {
        this.write.add(setmaxseektopreviouspositionms);
    }

    @Override // kotlin.addAllCommands
    public final getWindowCount read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.addAllCommands
    public final void write(getWindowCount getwindowcount) {
        this.MediaBrowserCompatCustomActionResultReceiver = getwindowcount;
    }

    @Override // kotlin.addAllCommands
    public final Rdimen MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.addAllCommands
    public final setCurrentMediaItemIndex RatingCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.addAllCommands
    public final RatingExternalSyntheticLambda0 MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.addAllCommands
    public final List<getFormatSupport> AudioAttributesImplBaseParcelizer() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.addAllCommands
    public final getAdResumePositionUs AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.addAllCommands
    public final r8lambdar5_vvqa8cJhSPTKK5g5S1F0sadY AudioAttributesImplApi21Parcelizer() {
        return this.MediaMetadataCompat;
    }

    private RendererCapabilitiesHardwareAccelerationSupport MediaBrowserCompatMediaItem() {
        return this.onCommand;
    }

    @Override // kotlin.addAllCommands
    public final void MediaMetadataCompat() {
        synchronized (this.RatingCompat) {
            for (setCurrentCues setcurrentcues : this.RatingCompat) {
            }
        }
    }

    @Override // kotlin.addAllCommands
    public final void AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            str = this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (str != null) {
            try {
                MediaBrowserCompatMediaItem();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // kotlin.addAllCommands
    public final void AudioAttributesCompatParcelizer(ArrayList<CleverTapDisplayUnit> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.read.MediaBrowserCompatItemReceiver().write(this.read.write(), "DisplayUnit : No registered listener, failed to notify");
        } else {
            this.read.MediaBrowserCompatItemReceiver().write(this.read.write(), "DisplayUnit : No Display Units found");
        }
    }

    @Override // kotlin.addAllCommands
    public final lambdaonDeviceInfoChanged58 write() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.addAllCommands
    public final void MediaDescriptionCompat() {
        this.MediaBrowserCompatItemReceiver = null;
    }

    @Override // kotlin.addAllCommands
    public final lambdaupdateStateAndInformListeners57 IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.addAllCommands
    public final setTotalBufferedDurationMs AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addAllCommands
    public final void RemoteActionCompatParcelizer(setTotalBufferedDurationMs settotalbuffereddurationms) {
        this.RemoteActionCompatParcelizer = settotalbuffereddurationms;
    }
}
