package kotlin;

import android.graphics.Bitmap;
import android.view.View;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.access1202;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b"}, d2 = {"Lo/buildUpdatedMediaMetadata;", "", "Lo/setSurfaceTextureInternal;", "p0", "<init>", "(Lo/setSurfaceTextureInternal;)V", "Lo/lambdamaybeNotifySurfaceSizeChanged27;", "", "p1", "Lo/handlePlaybackInfo;", "AudioAttributesCompatParcelizer", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Ljava/lang/Throwable;)Lo/handlePlaybackInfo;", "Landroid/graphics/Bitmap$Config;", "", "read", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Landroid/graphics/Bitmap$Config;)Z", "Lcoil/size/Size;", "RemoteActionCompatParcelizer", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Lcoil/size/Size;)Z", "IconCompatParcelizer", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;)Z", "p2", "Lo/ExoPlayerBuilderExternalSyntheticLambda4;", "write", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Lcoil/size/Size;Z)Lo/ExoPlayerBuilderExternalSyntheticLambda4;", "Lo/access1202;", "Lo/access1202;", "Lo/setSurfaceTextureInternal;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class buildUpdatedMediaMetadata {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final access1202 read;
    private final setSurfaceTextureInternal IconCompatParcelizer;
    public static final Bitmap.Config[] RemoteActionCompatParcelizer = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    public buildUpdatedMediaMetadata(setSurfaceTextureInternal setsurfacetextureinternal) {
        this.IconCompatParcelizer = setsurfacetextureinternal;
        access1202.Companion companion = access1202.INSTANCE;
        this.read = access1202.Companion.write();
    }

    public static handlePlaybackInfo AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0, Throwable p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new handlePlaybackInfo(p1 instanceof lambdasetAudioAttributes8 ? p0.MediaDescriptionCompat() : p0.MediaBrowserCompatSearchResultReceiver(), p0, p1);
    }

    public final ExoPlayerBuilderExternalSyntheticLambda4 write(lambdamaybeNotifySurfaceSizeChanged27 p0, Size p1, boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Bitmap.Config audioAttributesCompatParcelizer = (IconCompatParcelizer(p0) && RemoteActionCompatParcelizer(p0, p1)) ? p0.getAudioAttributesCompatParcelizer() : Bitmap.Config.ARGB_8888;
        getPlayWhenReadyChangeReason onPlay = p2 ? p0.getOnPlay() : getPlayWhenReadyChangeReason.DISABLED;
        return new ExoPlayerBuilderExternalSyntheticLambda4(p0.getMediaBrowserCompatCustomActionResultReceiver(), audioAttributesCompatParcelizer, p0.getWrite(), p0.getOnPrepare(), periodPositionUsToWindowPositionUs.RemoteActionCompatParcelizer(p0), p0.getRemoteActionCompatParcelizer() && p0.onPrepareFromSearch().isEmpty() && audioAttributesCompatParcelizer != Bitmap.Config.ALPHA_8, p0.getOnPlayFromUri(), p0.getOnCustomAction(), p0.getOnFastForward(), p0.getOnPause(), p0.getMediaMetadataCompat(), onPlay);
    }

    public static boolean read(lambdamaybeNotifySurfaceSizeChanged27 p0, Bitmap.Config p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (!maybeNotifySurfaceSizeChanged.read(p1)) {
            return true;
        }
        if (!p0.getIconCompatParcelizer()) {
            return false;
        }
        lambdaupdatePlaybackInfo17 onRemoveQueueItemAt = p0.getOnRemoveQueueItemAt();
        if (onRemoveQueueItemAt instanceof lambdaupdatePlaybackInfo21) {
            View viewIconCompatParcelizer = ((lambdaupdatePlaybackInfo21) onRemoveQueueItemAt).IconCompatParcelizer();
            if (InvalidTypeIdException.onPlayFromSearch(viewIconCompatParcelizer) && !viewIconCompatParcelizer.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    private final boolean RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0, Size p1) {
        return read(p0, p0.getAudioAttributesCompatParcelizer()) && this.read.RemoteActionCompatParcelizer(p1);
    }

    private static boolean IconCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0) {
        return p0.onPrepareFromSearch().isEmpty() || getOrderDetails.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer, p0.getAudioAttributesCompatParcelizer());
    }
}
