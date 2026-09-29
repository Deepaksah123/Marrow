package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import java.util.Collections;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
public final class onTrackSelectionsInvalidated {
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write(CmcdHeadersFactory.STREAMING_FORMAT_SS, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY);
    private static final Format1.AudioAttributesCompatParcelizer IconCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write(CmcdHeadersFactory.STREAMING_FORMAT_SS, "e", "o", "r");
    private static final Format1.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("fc", "sc", "sw", "t", "o");

    public static reselectTracksInternalAndSeek write(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        format1.AudioAttributesCompatParcelizer();
        resolvePendingMessageEndOfStreamPosition resolvependingmessageendofstreampositionRemoteActionCompatParcelizer = null;
        reselectTracksInternal reselecttracksinternalIconCompatParcelizer = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(write);
            if (iAudioAttributesCompatParcelizer == 0) {
                reselecttracksinternalIconCompatParcelizer = IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 1) {
                resolvependingmessageendofstreampositionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        format1.IconCompatParcelizer();
        return new reselectTracksInternalAndSeek(resolvependingmessageendofstreampositionRemoteActionCompatParcelizer, reselecttracksinternalIconCompatParcelizer);
    }

    private static reselectTracksInternal IconCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        format1.AudioAttributesCompatParcelizer();
        notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged = null;
        notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychangedIconCompatParcelizer = null;
        setShuffleOrderInternal setshuffleorderinternal = null;
        notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychangedIconCompatParcelizer2 = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(IconCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == 0) {
                notifytrackselectionplaywhenreadychanged = onContinueLoadingRequested.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 1) {
                notifytrackselectionplaywhenreadychangedIconCompatParcelizer = onContinueLoadingRequested.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 2) {
                notifytrackselectionplaywhenreadychangedIconCompatParcelizer2 = onContinueLoadingRequested.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 3) {
                int iAudioAttributesImplBaseParcelizer = format1.AudioAttributesImplBaseParcelizer();
                if (iAudioAttributesImplBaseParcelizer != 1 && iAudioAttributesImplBaseParcelizer != 2) {
                    exoPlayerImplExternalSyntheticLambda19.write("Unsupported text range units: ".concat(String.valueOf(iAudioAttributesImplBaseParcelizer)));
                    setshuffleorderinternal = setShuffleOrderInternal.INDEX;
                } else {
                    setshuffleorderinternal = iAudioAttributesImplBaseParcelizer == 1 ? setShuffleOrderInternal.PERCENT : setShuffleOrderInternal.INDEX;
                }
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        format1.IconCompatParcelizer();
        if (notifytrackselectionplaywhenreadychanged == null && notifytrackselectionplaywhenreadychangedIconCompatParcelizer != null) {
            notifytrackselectionplaywhenreadychanged = new notifyTrackSelectionPlayWhenReadyChanged(Collections.singletonList(new setEncoderDelay(0)));
        }
        return new reselectTracksInternal(notifytrackselectionplaywhenreadychanged, notifytrackselectionplaywhenreadychangedIconCompatParcelizer, notifytrackselectionplaywhenreadychangedIconCompatParcelizer2, setshuffleorderinternal);
    }

    private static resolvePendingMessageEndOfStreamPosition RemoteActionCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        format1.AudioAttributesCompatParcelizer();
        maybeUpdateReadingRenderers maybeupdatereadingrenderersAudioAttributesCompatParcelizer = null;
        maybeUpdateReadingRenderers maybeupdatereadingrenderersAudioAttributesCompatParcelizer2 = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2 = null;
        notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychangedIconCompatParcelizer = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == 0) {
                maybeupdatereadingrenderersAudioAttributesCompatParcelizer = onContinueLoadingRequested.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 1) {
                maybeupdatereadingrenderersAudioAttributesCompatParcelizer2 = onContinueLoadingRequested.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 2) {
                mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 3) {
                mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2 = onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 4) {
                notifytrackselectionplaywhenreadychangedIconCompatParcelizer = onContinueLoadingRequested.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        format1.IconCompatParcelizer();
        return new resolvePendingMessageEndOfStreamPosition(maybeupdatereadingrenderersAudioAttributesCompatParcelizer, maybeupdatereadingrenderersAudioAttributesCompatParcelizer2, mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer, mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2, notifytrackselectionplaywhenreadychangedIconCompatParcelizer);
    }
}
