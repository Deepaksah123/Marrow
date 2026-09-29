package kotlin;

import android.content.ContentResolver;
import android.hardware.SensorManager;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class playToEndOfStream extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ DefaultPlaybackSessionManagerExternalSyntheticLambda0 AudioAttributesCompatParcelizer;
    private /* synthetic */ onUnderrun IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public playToEndOfStream(onUnderrun onunderrun, DefaultPlaybackSessionManagerExternalSyntheticLambda0 defaultPlaybackSessionManagerExternalSyntheticLambda0) {
        super(0);
        this.IconCompatParcelizer = onunderrun;
        this.AudioAttributesCompatParcelizer = defaultPlaybackSessionManagerExternalSyntheticLambda0;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        AudioRendererEventListenerEventDispatcherExternalSyntheticLambda4 audioRendererEventListenerEventDispatcherExternalSyntheticLambda4 = new AudioRendererEventListenerEventDispatcherExternalSyntheticLambda4(this.IconCompatParcelizer.write, IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.getRead()), (Iterable) this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()), this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer(), this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(), this.AudioAttributesCompatParcelizer.getWrite(), this.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer());
        List list = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer;
        String str = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.AudioAttributesImplBaseParcelizer;
        boolean z = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver;
        List list2 = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver;
        String str2 = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onCommand;
        isInvalidJoinTransition isinvalidjointransition = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onAddQueueItem;
        DefaultAudioTrackBufferSizeProvider defaultAudioTrackBufferSizeProvider = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onPause;
        getFrameworkCryptoInfo getframeworkcryptoinfo = new getFrameworkCryptoInfo(new releaseOutputBufferInternal(isinvalidjointransition, new base64ToBase64Url(defaultAudioTrackBufferSizeProvider, defaultAudioTrackBufferSizeProvider, true)), z);
        String str3 = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onCustomAction;
        addFlag addflag = new addFlag(getframeworkcryptoinfo, list, str, str3, str2, z, list2);
        ContentResolver contentResolver = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.MediaMetadataCompat;
        getMeanTimeBetweenNonFatalErrors getmeantimebetweennonfatalerrors = new getMeanTimeBetweenNonFatalErrors(new getTotalElapsedTimeMs());
        onSessionCreated onsessioncreated = new onSessionCreated(contentResolver);
        MediaCodecAudioRenderer mediaCodecAudioRenderer = new MediaCodecAudioRenderer();
        onTearDown onteardown = new onTearDown(contentResolver);
        outputModeIsOffload outputmodeisoffload = new outputModeIsOffload(audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.RatingCompat);
        SensorManager sensorManager = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.MediaDescriptionCompat;
        releaseOutputBuffer releaseoutputbuffer = audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onFastForward;
        return new DecoderAudioRendererAudioSinkListener(addflag, new getTimestampSystemTimeUs(outputmodeisoffload, new VersionTable(sensorManager, releaseoutputbuffer), new onCodecReleased(audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.MediaBrowserCompatMediaItem), str2, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onPlay, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onPlayFromMediaId, getmeantimebetweennonfatalerrors, onsessioncreated, mediaCodecAudioRenderer, onteardown, releaseoutputbuffer, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onPlayFromSearch, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onPrepare, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onPrepareFromMediaId, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onPlayFromUri, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onPrepareFromSearch, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onPrepareFromUri, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onRewind, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.AudioAttributesCompatParcelizer, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.RemoteActionCompatParcelizer, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.write, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.read, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.MediaBrowserCompatItemReceiver, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onRemoveQueueItemAt), new getMeanElapsedTimeMs(new getPacketDurationUs(new releaseOutputBufferInternal(isinvalidjointransition, null), new previousPeriodBetter(audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, str, str3, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler)), audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.IconCompatParcelizer, new maybeUpdateTextFormat(new parseAc3SyncframeInfo(defaultAudioTrackBufferSizeProvider)), audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onFastForward, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onMediaButtonEvent), audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.onAddQueueItem, audioRendererEventListenerEventDispatcherExternalSyntheticLambda4.AudioAttributesCompatParcelizer);
    }
}
