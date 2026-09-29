package kotlin;

import android.content.Context;
import kotlin.handleInputBufferSupplementalData;

/* JADX INFO: loaded from: classes3.dex */
public class maybeInitCodecOrBypass {
    private static final MediaCodecRendererDecoderInitializationException AudioAttributesCompatParcelizer = MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    private static volatile maybeInitCodecOrBypass read;
    private final onProcessedOutputBuffer IconCompatParcelizer = onProcessedOutputBuffer.write();
    private MediaCodecUtilExternalSyntheticLambda3 write = new MediaCodecUtilExternalSyntheticLambda3();
    private isBypassPossible RemoteActionCompatParcelizer = isBypassPossible.AudioAttributesCompatParcelizer();

    private static boolean AudioAttributesCompatParcelizer(long j) {
        return j > 0;
    }

    private static boolean IconCompatParcelizer(long j) {
        return j >= 0;
    }

    private static boolean RemoteActionCompatParcelizer(long j) {
        return j > 0;
    }

    private static boolean read(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    private static boolean write(long j) {
        return j >= 0;
    }

    private maybeInitCodecOrBypass() {
    }

    public static maybeInitCodecOrBypass IconCompatParcelizer() {
        maybeInitCodecOrBypass maybeinitcodecorbypass;
        synchronized (maybeInitCodecOrBypass.class) {
            if (read == null) {
                read = new maybeInitCodecOrBypass();
            }
            maybeinitcodecorbypass = read;
        }
        return maybeinitcodecorbypass;
    }

    public final void read(Context context) {
        AudioAttributesCompatParcelizer.write(secureDecodersExplicit.read(context));
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(context);
    }

    public final void AudioAttributesCompatParcelizer(MediaCodecUtilExternalSyntheticLambda3 mediaCodecUtilExternalSyntheticLambda3) {
        this.write = mediaCodecUtilExternalSyntheticLambda3;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        Boolean boolWrite = write();
        return (boolWrite == null || boolWrite.booleanValue()) && onMediaButtonEvent();
    }

    public final Boolean write() {
        if (onFastForward().booleanValue()) {
            return Boolean.FALSE;
        }
        handleInputBufferSupplementalData.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = handleInputBufferSupplementalData.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        MediaCodecUtilDecoderQueryException<Boolean> mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
            return mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        MediaCodecUtilDecoderQueryException<Boolean> mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer = IconCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer.RemoteActionCompatParcelizer()) {
            return mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        return null;
    }

    private Boolean onFastForward() {
        MediaCodecUtilDecoderQueryException<Boolean> mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer = IconCompatParcelizer(handleInputBufferSupplementalData.IconCompatParcelizer.RemoteActionCompatParcelizer());
        if (mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer.RemoteActionCompatParcelizer()) {
            return mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        return handleInputBufferSupplementalData.IconCompatParcelizer.write();
    }

    private boolean onMediaButtonEvent() {
        return onCommand() && !onPause();
    }

    private boolean onCommand() {
        handleInputBufferSupplementalData.MediaMetadataCompat mediaMetadataCompatAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.MediaMetadataCompat.AudioAttributesCompatParcelizer();
        MediaCodecUtilDecoderQueryException<Boolean> mediaCodecUtilDecoderQueryExceptionAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(mediaMetadataCompatAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer()) {
            if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer()) {
                return false;
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(mediaMetadataCompatAudioAttributesCompatParcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer().booleanValue());
            return mediaCodecUtilDecoderQueryExceptionAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer().booleanValue();
        }
        MediaCodecUtilDecoderQueryException<Boolean> mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaMetadataCompatAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
            return mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().booleanValue();
        }
        return handleInputBufferSupplementalData.MediaMetadataCompat.read().booleanValue();
    }

    private boolean onPause() {
        handleInputBufferSupplementalData.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = handleInputBufferSupplementalData.AudioAttributesImplApi26Parcelizer.read();
        MediaCodecUtilDecoderQueryException<String> mediaCodecUtilDecoderQueryExceptionRatingCompat = RatingCompat(audioAttributesImplApi26Parcelizer);
        if (mediaCodecUtilDecoderQueryExceptionRatingCompat.RemoteActionCompatParcelizer()) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(audioAttributesImplApi26Parcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionRatingCompat.AudioAttributesCompatParcelizer());
            return IconCompatParcelizer(mediaCodecUtilDecoderQueryExceptionRatingCompat.AudioAttributesCompatParcelizer());
        }
        MediaCodecUtilDecoderQueryException<String> mediaCodecUtilDecoderQueryException = read(audioAttributesImplApi26Parcelizer);
        if (mediaCodecUtilDecoderQueryException.RemoteActionCompatParcelizer()) {
            return IconCompatParcelizer(mediaCodecUtilDecoderQueryException.AudioAttributesCompatParcelizer());
        }
        return IconCompatParcelizer(handleInputBufferSupplementalData.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer());
    }

    private static boolean IconCompatParcelizer(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(setOutputStreamInfo.RemoteActionCompatParcelizer)) {
                return true;
            }
        }
        return false;
    }

    public final double onAddQueueItem() {
        handleInputBufferSupplementalData.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() && read(mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesCompatParcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue());
            return mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue();
        }
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiverAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer() && read(mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().doubleValue())) {
            return mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().doubleValue();
        }
        if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer()) {
            return handleInputBufferSupplementalData.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplApi26Parcelizer().doubleValue();
        }
        return handleInputBufferSupplementalData.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read().doubleValue();
    }

    public final double AudioAttributesImplApi26Parcelizer() {
        handleInputBufferSupplementalData.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = handleInputBufferSupplementalData.MediaBrowserCompatCustomActionResultReceiver.read();
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(mediaBrowserCompatCustomActionResultReceiver);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() && read(mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.ad_(), mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue());
            return mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue();
        }
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        if (mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer() && read(mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().doubleValue())) {
            return mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().doubleValue();
        }
        if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer()) {
            return handleInputBufferSupplementalData.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer().doubleValue();
        }
        return handleInputBufferSupplementalData.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().doubleValue();
    }

    public final double MediaBrowserCompatSearchResultReceiver() {
        handleInputBufferSupplementalData.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandlerAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer();
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(handlemediaplaypauseifpendingonhandlerAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer()) {
            double dDoubleValue = mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().doubleValue() / 100.0d;
            if (read(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(handlemediaplaypauseifpendingonhandlerAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() && read(mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(handlemediaplaypauseifpendingonhandlerAudioAttributesCompatParcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue());
            return mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue();
        }
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(handlemediaplaypauseifpendingonhandlerAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer() && read(mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().doubleValue())) {
            return mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().doubleValue();
        }
        if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer()) {
            return handleInputBufferSupplementalData.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi26Parcelizer().doubleValue();
        }
        return handleInputBufferSupplementalData.handleMediaPlayPauseIfPendingOnHandler.read().doubleValue();
    }

    public final long MediaBrowserCompatMediaItem() {
        handleInputBufferSupplementalData.RatingCompat ratingCompat = handleInputBufferSupplementalData.RatingCompat.read();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(ratingCompat);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(ratingCompat);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(ratingCompat.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(ratingCompat);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer()) {
            return handleInputBufferSupplementalData.RatingCompat.AudioAttributesImplApi26Parcelizer().longValue();
        }
        return handleInputBufferSupplementalData.RatingCompat.AudioAttributesCompatParcelizer().longValue();
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        handleInputBufferSupplementalData.MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(mediaBrowserCompatSearchResultReceiverAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        return handleInputBufferSupplementalData.MediaBrowserCompatSearchResultReceiver.read().longValue();
    }

    public final long MediaMetadataCompat() {
        handleInputBufferSupplementalData.onCustomAction oncustomaction = handleInputBufferSupplementalData.onCustomAction.read();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(oncustomaction);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(oncustomaction);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(oncustomaction.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(oncustomaction);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer()) {
            return handleInputBufferSupplementalData.onCustomAction.AudioAttributesImplApi21Parcelizer().longValue();
        }
        return handleInputBufferSupplementalData.onCustomAction.AudioAttributesCompatParcelizer().longValue();
    }

    public final long MediaDescriptionCompat() {
        handleInputBufferSupplementalData.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = handleInputBufferSupplementalData.MediaBrowserCompatMediaItem.read();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(mediaBrowserCompatMediaItem);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(mediaBrowserCompatMediaItem);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(mediaBrowserCompatMediaItem.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(mediaBrowserCompatMediaItem);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && write(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        return handleInputBufferSupplementalData.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer().longValue();
    }

    public final long RatingCompat() {
        handleInputBufferSupplementalData.MediaDescriptionCompat mediaDescriptionCompatAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(mediaDescriptionCompatAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer() && AudioAttributesCompatParcelizer(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(mediaDescriptionCompatAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && AudioAttributesCompatParcelizer(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(mediaDescriptionCompatAudioAttributesCompatParcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(mediaDescriptionCompatAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && AudioAttributesCompatParcelizer(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        return handleInputBufferSupplementalData.MediaDescriptionCompat.read().longValue();
    }

    public final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        handleInputBufferSupplementalData.onAddQueueItem onaddqueueitem = handleInputBufferSupplementalData.onAddQueueItem.read();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(onaddqueueitem);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && IconCompatParcelizer(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(onaddqueueitem.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(onaddqueueitem);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && IconCompatParcelizer(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        return handleInputBufferSupplementalData.onAddQueueItem.AudioAttributesCompatParcelizer().longValue();
    }

    public final long onCustomAction() {
        handleInputBufferSupplementalData.onCommand oncommand = handleInputBufferSupplementalData.onCommand.read();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(oncommand);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && IconCompatParcelizer(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(oncommand.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(oncommand);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && IconCompatParcelizer(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        return handleInputBufferSupplementalData.onCommand.AudioAttributesCompatParcelizer().longValue();
    }

    public final long AudioAttributesImplBaseParcelizer() {
        handleInputBufferSupplementalData.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && IconCompatParcelizer(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(mediaBrowserCompatItemReceiverAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && IconCompatParcelizer(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        return handleInputBufferSupplementalData.MediaBrowserCompatItemReceiver.read().longValue();
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        handleInputBufferSupplementalData.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = handleInputBufferSupplementalData.AudioAttributesImplBaseParcelizer.read();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(audioAttributesImplBaseParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && IconCompatParcelizer(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(audioAttributesImplBaseParcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(audioAttributesImplBaseParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && IconCompatParcelizer(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        return handleInputBufferSupplementalData.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer().longValue();
    }

    public final long MediaBrowserCompatItemReceiver() {
        handleInputBufferSupplementalData.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() && RemoteActionCompatParcelizer(mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue());
            return mediaCodecUtilDecoderQueryExceptionMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().longValue();
        }
        MediaCodecUtilDecoderQueryException<Long> mediaCodecUtilDecoderQueryExceptionWrite = write(audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionWrite.RemoteActionCompatParcelizer() && RemoteActionCompatParcelizer(mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue())) {
            return mediaCodecUtilDecoderQueryExceptionWrite.AudioAttributesCompatParcelizer().longValue();
        }
        return handleInputBufferSupplementalData.AudioAttributesImplApi21Parcelizer.read().longValue();
    }

    public final String AudioAttributesCompatParcelizer() {
        String strAudioAttributesCompatParcelizer;
        handleInputBufferSupplementalData.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (setOutputStreamInfo.write.booleanValue()) {
            return handleInputBufferSupplementalData.RemoteActionCompatParcelizer.read();
        }
        String strAe_ = remoteActionCompatParcelizerAudioAttributesCompatParcelizer.ae_();
        long jLongValue = strAe_ != null ? ((Long) this.IconCompatParcelizer.read(strAe_, -1L)).longValue() : -1L;
        String strAd_ = remoteActionCompatParcelizerAudioAttributesCompatParcelizer.ad_();
        if (handleInputBufferSupplementalData.RemoteActionCompatParcelizer.IconCompatParcelizer(jLongValue) && (strAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(jLongValue)) != null) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(strAd_, strAudioAttributesCompatParcelizer);
            return strAudioAttributesCompatParcelizer;
        }
        MediaCodecUtilDecoderQueryException<String> mediaCodecUtilDecoderQueryException = read(remoteActionCompatParcelizerAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryException.RemoteActionCompatParcelizer()) {
            return mediaCodecUtilDecoderQueryException.AudioAttributesCompatParcelizer();
        }
        return handleInputBufferSupplementalData.RemoteActionCompatParcelizer.read();
    }

    public final double RemoteActionCompatParcelizer() {
        handleInputBufferSupplementalData.write writeVarAudioAttributesCompatParcelizer = handleInputBufferSupplementalData.write.AudioAttributesCompatParcelizer();
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(writeVarAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer()) {
            double dDoubleValue = mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().doubleValue() / 100.0d;
            if (read(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(writeVarAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() && read(mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue())) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(writeVarAudioAttributesCompatParcelizer.ad_(), mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue());
            return mediaCodecUtilDecoderQueryExceptionAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer().doubleValue();
        }
        MediaCodecUtilDecoderQueryException<Double> mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(writeVarAudioAttributesCompatParcelizer);
        if (mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer() && read(mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().doubleValue())) {
            return mediaCodecUtilDecoderQueryExceptionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().doubleValue();
        }
        return handleInputBufferSupplementalData.write.read().doubleValue();
    }

    public final boolean read() {
        handleInputBufferSupplementalData.read readVar = handleInputBufferSupplementalData.read.read();
        MediaCodecUtilDecoderQueryException<Boolean> mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer = IconCompatParcelizer(readVar);
        if (mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer.RemoteActionCompatParcelizer()) {
            return mediaCodecUtilDecoderQueryExceptionIconCompatParcelizer.AudioAttributesCompatParcelizer().booleanValue();
        }
        MediaCodecUtilDecoderQueryException<Boolean> mediaCodecUtilDecoderQueryExceptionAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(readVar);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer()) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(readVar.ad_(), mediaCodecUtilDecoderQueryExceptionAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer().booleanValue());
            return mediaCodecUtilDecoderQueryExceptionAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer().booleanValue();
        }
        MediaCodecUtilDecoderQueryException<Boolean> mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(readVar);
        if (mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
            return mediaCodecUtilDecoderQueryExceptionAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().booleanValue();
        }
        return handleInputBufferSupplementalData.read.AudioAttributesCompatParcelizer().booleanValue();
    }

    private MediaCodecUtilDecoderQueryException<Boolean> IconCompatParcelizer(getOutputStreamOffsetUs<Boolean> getoutputstreamoffsetus) {
        return this.write.IconCompatParcelizer(getoutputstreamoffsetus.IconCompatParcelizer());
    }

    private MediaCodecUtilDecoderQueryException<Double> AudioAttributesImplApi21Parcelizer(getOutputStreamOffsetUs<Double> getoutputstreamoffsetus) {
        return this.write.write(getoutputstreamoffsetus.IconCompatParcelizer());
    }

    private MediaCodecUtilDecoderQueryException<Long> MediaBrowserCompatItemReceiver(getOutputStreamOffsetUs<Long> getoutputstreamoffsetus) {
        return this.write.RemoteActionCompatParcelizer(getoutputstreamoffsetus.IconCompatParcelizer());
    }

    private MediaCodecUtilDecoderQueryException<Double> AudioAttributesImplApi26Parcelizer(getOutputStreamOffsetUs<Double> getoutputstreamoffsetus) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(getoutputstreamoffsetus.ae_());
    }

    private MediaCodecUtilDecoderQueryException<Long> MediaBrowserCompatCustomActionResultReceiver(getOutputStreamOffsetUs<Long> getoutputstreamoffsetus) {
        return this.IconCompatParcelizer.read(getoutputstreamoffsetus.ae_());
    }

    private MediaCodecUtilDecoderQueryException<Boolean> AudioAttributesImplBaseParcelizer(getOutputStreamOffsetUs<Boolean> getoutputstreamoffsetus) {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(getoutputstreamoffsetus.ae_());
    }

    private MediaCodecUtilDecoderQueryException<String> RatingCompat(getOutputStreamOffsetUs<String> getoutputstreamoffsetus) {
        return this.IconCompatParcelizer.IconCompatParcelizer(getoutputstreamoffsetus.ae_());
    }

    private MediaCodecUtilDecoderQueryException<Double> RemoteActionCompatParcelizer(getOutputStreamOffsetUs<Double> getoutputstreamoffsetus) {
        return this.RemoteActionCompatParcelizer.write(getoutputstreamoffsetus.ad_());
    }

    private MediaCodecUtilDecoderQueryException<Long> write(getOutputStreamOffsetUs<Long> getoutputstreamoffsetus) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getoutputstreamoffsetus.ad_());
    }

    private MediaCodecUtilDecoderQueryException<Boolean> AudioAttributesCompatParcelizer(getOutputStreamOffsetUs<Boolean> getoutputstreamoffsetus) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(getoutputstreamoffsetus.ad_());
    }

    private MediaCodecUtilDecoderQueryException<String> read(getOutputStreamOffsetUs<String> getoutputstreamoffsetus) {
        return this.RemoteActionCompatParcelizer.read(getoutputstreamoffsetus.ad_());
    }
}
