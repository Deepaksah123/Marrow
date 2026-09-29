package kotlin;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
public final class removeMediaSources {
    private static final Format1.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("k", "x", "y");

    public static notifyTrackSelectionRebuffer AudioAttributesCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.BEGIN_ARRAY) {
            format1.read();
            while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                arrayList.add(getErrorMessage.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19));
            }
            format1.write();
            ExoPlayerImplInternalPositionUpdateForPlaylistChange.IconCompatParcelizer(arrayList);
        } else {
            arrayList.add(new setEncoderDelay(setPlayWhenReadyChangeReason.read(format1, setEncoderPadding.IconCompatParcelizer())));
        }
        return new notifyTrackSelectionRebuffer(arrayList);
    }

    static resolvePendingMessagePosition<PointF, PointF> RemoteActionCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        format1.AudioAttributesCompatParcelizer();
        notifyTrackSelectionRebuffer notifytrackselectionrebufferAudioAttributesCompatParcelizer = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = null;
        boolean z = false;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2 = null;
        while (format1.MediaBrowserCompatMediaItem() != Format1.IconCompatParcelizer.END_OBJECT) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == 0) {
                notifytrackselectionrebufferAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer != 1) {
                if (iAudioAttributesCompatParcelizer == 2) {
                    if (format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.STRING) {
                        format1.RatingCompat();
                        z = true;
                    } else {
                        mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    }
                } else {
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                }
            } else if (format1.MediaBrowserCompatMediaItem() == Format1.IconCompatParcelizer.STRING) {
                format1.RatingCompat();
                z = true;
            } else {
                mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2 = onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            }
        }
        format1.IconCompatParcelizer();
        if (z) {
            exoPlayerImplExternalSyntheticLambda19.write("Lottie doesn't support expressions.");
        }
        return notifytrackselectionrebufferAudioAttributesCompatParcelizer != null ? notifytrackselectionrebufferAudioAttributesCompatParcelizer : new prepareInternal(mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2, mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer);
    }
}
