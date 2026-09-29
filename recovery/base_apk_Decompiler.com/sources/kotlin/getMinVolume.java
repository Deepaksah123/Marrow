package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getMinVolume;", "", "<init>", "()V", "Lo/getMutedFromManager;", "p0", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p1", "Lo/getChildTimelines;", "p2", "Lo/updateVolumeAndNotifyIfChanged;", "AudioAttributesCompatParcelizer", "(Lo/getMutedFromManager;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lo/getChildTimelines;)Lo/updateVolumeAndNotifyIfChanged;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMinVolume {
    public static final getMinVolume INSTANCE = new getMinVolume();

    private getMinVolume() {
    }

    public static updateVolumeAndNotifyIfChanged AudioAttributesCompatParcelizer(getMutedFromManager p0, CleverTapInstanceConfig p1, getChildTimelines p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        boolean zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p1.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = p1.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver, "");
        String strWrite = p1.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        ThumbRatingExternalSyntheticLambda0 thumbRatingExternalSyntheticLambda0 = new ThumbRatingExternalSyntheticLambda0(zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, rendererWakeupListenerMediaBrowserCompatItemReceiver, strWrite);
        String str = p0.read();
        String strAudioAttributesImplApi26Parcelizer = p0.AudioAttributesImplApi26Parcelizer();
        String strAudioAttributesCompatParcelizer = p1.AudioAttributesCompatParcelizer();
        String strAudioAttributesImplApi21Parcelizer = p1.AudioAttributesImplApi21Parcelizer();
        String strMediaBrowserCompatMediaItem = p1.MediaBrowserCompatMediaItem();
        String strRemoteActionCompatParcelizer = p1.RemoteActionCompatParcelizer();
        String strWrite2 = p1.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite2, "");
        String strIconCompatParcelizer = p1.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strIconCompatParcelizer, "");
        int iOnMediaButtonEvent = p2.onMediaButtonEvent();
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = p1.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver2, "");
        String strWrite3 = p1.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite3, "");
        return new updateVolumeAndNotifyIfChanged(thumbRatingExternalSyntheticLambda0, "clevertap-prod.com", str, strAudioAttributesImplApi26Parcelizer, strAudioAttributesCompatParcelizer, strAudioAttributesImplApi21Parcelizer, strMediaBrowserCompatMediaItem, strRemoteActionCompatParcelizer, strWrite2, strIconCompatParcelizer, String.valueOf(iOnMediaButtonEvent), rendererWakeupListenerMediaBrowserCompatItemReceiver2, strWrite3);
    }
}
