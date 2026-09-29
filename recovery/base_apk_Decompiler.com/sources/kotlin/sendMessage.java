package kotlin;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
public final class sendMessage {
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write(CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, TtmlNode.TAG_P, CmcdHeadersFactory.STREAMING_FORMAT_SS, "rz", "r", "o", "so", "eo", "sk", "sa");
    private static final Format1.AudioAttributesCompatParcelizer read = Format1.AudioAttributesCompatParcelizer.write("k");

    public static resetPendingPauseAtEndOfPeriod read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        boolean z;
        boolean z2 = false;
        boolean z3 = format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.BEGIN_OBJECT;
        if (z3) {
            format1.AudioAttributesCompatParcelizer();
        }
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal = null;
        notifyTrackSelectionRebuffer notifytrackselectionrebufferAudioAttributesCompatParcelizer = null;
        resolvePendingMessagePosition<PointF, PointF> resolvependingmessagepositionRemoteActionCompatParcelizer = null;
        releaseRenderers releaserenderersMediaBrowserCompatCustomActionResultReceiver = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2 = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal3 = null;
        notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychangedIconCompatParcelizer = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal4 = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal5 = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            switch (format1.AudioAttributesCompatParcelizer(write)) {
                case 0:
                    boolean z4 = z2;
                    format1.AudioAttributesCompatParcelizer();
                    while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                        if (format1.AudioAttributesCompatParcelizer(read) == 0) {
                            notifytrackselectionrebufferAudioAttributesCompatParcelizer = removeMediaSources.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                        } else {
                            format1.MediaDescriptionCompat();
                            format1.RatingCompat();
                        }
                    }
                    format1.IconCompatParcelizer();
                    z2 = z4;
                    continue;
                case 1:
                    resolvependingmessagepositionRemoteActionCompatParcelizer = removeMediaSources.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    continue;
                case 2:
                    releaserenderersMediaBrowserCompatCustomActionResultReceiver = onContinueLoadingRequested.MediaBrowserCompatCustomActionResultReceiver(format1, exoPlayerImplExternalSyntheticLambda19);
                    continue;
                case 3:
                    exoPlayerImplExternalSyntheticLambda19.write("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    notifytrackselectionplaywhenreadychangedIconCompatParcelizer = onContinueLoadingRequested.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    continue;
                case 6:
                    mediasourcelistupdaterequestedinternal4 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, z2);
                    continue;
                case 7:
                    mediasourcelistupdaterequestedinternal5 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, z2);
                    continue;
                case 8:
                    mediasourcelistupdaterequestedinternal2 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, z2);
                    continue;
                case 9:
                    mediasourcelistupdaterequestedinternal3 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, z2);
                    continue;
                default:
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                    continue;
            }
            mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal6 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, z2);
            if (mediasourcelistupdaterequestedinternal6.RemoteActionCompatParcelizer().isEmpty()) {
                mediasourcelistupdaterequestedinternal6.RemoteActionCompatParcelizer().add(new setEncoderDelay(exoPlayerImplExternalSyntheticLambda19, Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(BitmapDescriptorFactory.HUE_RED), (Interpolator) null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(exoPlayerImplExternalSyntheticLambda19.RemoteActionCompatParcelizer())));
            } else {
                if (((setEncoderDelay) mediasourcelistupdaterequestedinternal6.RemoteActionCompatParcelizer().get(0)).MediaBrowserCompatCustomActionResultReceiver == 0) {
                    z = false;
                    mediasourcelistupdaterequestedinternal6.RemoteActionCompatParcelizer().set(0, new setEncoderDelay(exoPlayerImplExternalSyntheticLambda19, Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(BitmapDescriptorFactory.HUE_RED), (Interpolator) null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(exoPlayerImplExternalSyntheticLambda19.RemoteActionCompatParcelizer())));
                }
                z2 = z;
                mediasourcelistupdaterequestedinternal = mediasourcelistupdaterequestedinternal6;
            }
            z = false;
            z2 = z;
            mediasourcelistupdaterequestedinternal = mediasourcelistupdaterequestedinternal6;
        }
        if (z3) {
            format1.IconCompatParcelizer();
        }
        notifyTrackSelectionRebuffer notifytrackselectionrebuffer = write(notifytrackselectionrebufferAudioAttributesCompatParcelizer) ? null : notifytrackselectionrebufferAudioAttributesCompatParcelizer;
        resolvePendingMessagePosition<PointF, PointF> resolvependingmessageposition = RemoteActionCompatParcelizer(resolvependingmessagepositionRemoteActionCompatParcelizer) ? null : resolvependingmessagepositionRemoteActionCompatParcelizer;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal7 = read(mediasourcelistupdaterequestedinternal) ? null : mediasourcelistupdaterequestedinternal;
        if (read(releaserenderersMediaBrowserCompatCustomActionResultReceiver)) {
            releaserenderersMediaBrowserCompatCustomActionResultReceiver = null;
        }
        return new resetPendingPauseAtEndOfPeriod(notifytrackselectionrebuffer, resolvependingmessageposition, releaserenderersMediaBrowserCompatCustomActionResultReceiver, mediasourcelistupdaterequestedinternal7, notifytrackselectionplaywhenreadychangedIconCompatParcelizer, mediasourcelistupdaterequestedinternal4, mediasourcelistupdaterequestedinternal5, AudioAttributesCompatParcelizer(mediasourcelistupdaterequestedinternal2) ? null : mediasourcelistupdaterequestedinternal2, IconCompatParcelizer(mediasourcelistupdaterequestedinternal3) ? null : mediasourcelistupdaterequestedinternal3);
    }

    private static boolean write(notifyTrackSelectionRebuffer notifytrackselectionrebuffer) {
        if (notifytrackselectionrebuffer != null) {
            return notifytrackselectionrebuffer.AudioAttributesCompatParcelizer() && notifytrackselectionrebuffer.RemoteActionCompatParcelizer().get(0).MediaBrowserCompatCustomActionResultReceiver.equals(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(resolvePendingMessagePosition<PointF, PointF> resolvependingmessageposition) {
        if (resolvependingmessageposition != null) {
            return !(resolvependingmessageposition instanceof prepareInternal) && resolvependingmessageposition.AudioAttributesCompatParcelizer() && resolvependingmessageposition.RemoteActionCompatParcelizer().get(0).MediaBrowserCompatCustomActionResultReceiver.equals(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean read(mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal) {
        if (mediasourcelistupdaterequestedinternal != null) {
            return mediasourcelistupdaterequestedinternal.AudioAttributesCompatParcelizer() && ((Float) ((setEncoderDelay) mediasourcelistupdaterequestedinternal.RemoteActionCompatParcelizer().get(0)).MediaBrowserCompatCustomActionResultReceiver).floatValue() == BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean read(releaseRenderers releaserenderers) {
        if (releaserenderers != null) {
            return releaserenderers.AudioAttributesCompatParcelizer() && ((setHeight) ((setEncoderDelay) releaserenderers.RemoteActionCompatParcelizer().get(0)).MediaBrowserCompatCustomActionResultReceiver).IconCompatParcelizer();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean AudioAttributesCompatParcelizer(mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal) {
        if (mediasourcelistupdaterequestedinternal != null) {
            return mediasourcelistupdaterequestedinternal.AudioAttributesCompatParcelizer() && ((Float) ((setEncoderDelay) mediasourcelistupdaterequestedinternal.RemoteActionCompatParcelizer().get(0)).MediaBrowserCompatCustomActionResultReceiver).floatValue() == BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean IconCompatParcelizer(mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal) {
        if (mediasourcelistupdaterequestedinternal != null) {
            return mediasourcelistupdaterequestedinternal.AudioAttributesCompatParcelizer() && ((Float) ((setEncoderDelay) mediasourcelistupdaterequestedinternal.RemoteActionCompatParcelizer().get(0)).MediaBrowserCompatCustomActionResultReceiver).floatValue() == BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }
}
