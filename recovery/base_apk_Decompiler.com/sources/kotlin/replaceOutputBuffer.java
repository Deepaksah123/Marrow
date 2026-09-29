package kotlin;

import android.location.Location;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class replaceOutputBuffer {
    public final releaseInputBufferInternal AudioAttributesCompatParcelizer;
    public final MediaCodecAudioRenderer AudioAttributesImplApi21Parcelizer;
    public final getMeanTimeBetweenNonFatalErrors AudioAttributesImplApi26Parcelizer;
    public final onSessionCreated AudioAttributesImplBaseParcelizer;
    public final outputModeIsOffload IconCompatParcelizer;
    public final processOutputBuffer MediaBrowserCompatCustomActionResultReceiver;
    public final releaseOutputBuffer MediaBrowserCompatItemReceiver;
    public final onTearDown MediaBrowserCompatMediaItem;
    public final DefaultAudioSinkMediaPositionParameters MediaBrowserCompatSearchResultReceiver;
    public final playPendingData MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final isIdentity MediaDescriptionCompat;
    public final isSafeToMultiply MediaMetadataCompat;
    public final supportsEncoding RatingCompat;
    public final hasAdvancingTimestamp handleMediaPlayPauseIfPendingOnHandler;
    private isLittleEndianFrameHeader onAddQueueItem;
    public final newNoDataInstance onCustomAction;
    private getFinalOutputBufferIndex onFastForward;
    private isReadyState onMediaButtonEvent;
    private isPausedState onPause;
    private onOutputStreamOffsetUsChanged onPlay;
    private ChannelMappingAudioProcessor onPlayFromMediaId;
    private parseTrueHdSyncframeAudioSampleCount onPlayFromUri;
    private hasPendingData onPrepare;
    public final String read;
    public final onCodecReleased write;
    public final RenewEligible onCommand = getRenewExpiresOn.RemoteActionCompatParcelizer(new maybeSampleSyncParams(this));
    public final RenewEligible RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new setAudioTrack(this));

    public replaceOutputBuffer(outputModeIsOffload outputmodeisoffload, releaseInputBufferInternal releaseinputbufferinternal, onCodecReleased oncodecreleased, String str, processOutputBuffer processoutputbuffer, isLittleEndianFrameHeader islittleendianframeheader, releaseOutputBuffer releaseoutputbuffer, getMeanTimeBetweenNonFatalErrors getmeantimebetweennonfatalerrors, onSessionCreated onsessioncreated, MediaCodecAudioRenderer mediaCodecAudioRenderer, onTearDown onteardown, isSafeToMultiply issafetomultiply, supportsEncoding supportsencoding, isIdentity isidentity, DefaultAudioSinkMediaPositionParameters defaultAudioSinkMediaPositionParameters, newNoDataInstance newnodatainstance, ChannelMappingAudioProcessor channelMappingAudioProcessor, hasAdvancingTimestamp hasadvancingtimestamp, onOutputStreamOffsetUsChanged onoutputstreamoffsetuschanged, isPausedState ispausedstate, isReadyState isreadystate, getFinalOutputBufferIndex getfinaloutputbufferindex, playPendingData playpendingdata, parseTrueHdSyncframeAudioSampleCount parsetruehdsyncframeaudiosamplecount, hasPendingData haspendingdata) {
        this.IconCompatParcelizer = outputmodeisoffload;
        this.AudioAttributesCompatParcelizer = releaseinputbufferinternal;
        this.write = oncodecreleased;
        this.read = str;
        this.MediaBrowserCompatCustomActionResultReceiver = processoutputbuffer;
        this.onAddQueueItem = islittleendianframeheader;
        this.MediaBrowserCompatItemReceiver = releaseoutputbuffer;
        this.AudioAttributesImplApi26Parcelizer = getmeantimebetweennonfatalerrors;
        this.AudioAttributesImplBaseParcelizer = onsessioncreated;
        this.AudioAttributesImplApi21Parcelizer = mediaCodecAudioRenderer;
        this.MediaBrowserCompatMediaItem = onteardown;
        this.MediaMetadataCompat = issafetomultiply;
        this.RatingCompat = supportsencoding;
        this.MediaDescriptionCompat = isidentity;
        this.MediaBrowserCompatSearchResultReceiver = defaultAudioSinkMediaPositionParameters;
        this.onCustomAction = newnodatainstance;
        this.onPlayFromMediaId = channelMappingAudioProcessor;
        this.handleMediaPlayPauseIfPendingOnHandler = hasadvancingtimestamp;
        this.onPlay = onoutputstreamoffsetuschanged;
        this.onPause = ispausedstate;
        this.onMediaButtonEvent = isreadystate;
        this.onFastForward = getfinaloutputbufferindex;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = playpendingdata;
        this.onPlayFromUri = parsetruehdsyncframeaudiosamplecount;
        this.onPrepare = haspendingdata;
    }

    public final AudioSinkSinkFormatSupport AudioAttributesCompatParcelizer() {
        Object obj;
        AudioProcessorUnhandledAudioFormatException audioProcessorUnhandledAudioFormatException;
        hasPendingData haspendingdata = this.onPrepare;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            List list = (List) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(0L, new CryptoException(haspendingdata.IconCompatParcelizer), 7), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            if (list.isEmpty() || !haspendingdata.RemoteActionCompatParcelizer) {
                audioProcessorUnhandledAudioFormatException = new AudioProcessorUnhandledAudioFormatException(null, haspendingdata.RemoteActionCompatParcelizer, list, haspendingdata.write, new queueInputBuffer(0L, 0L));
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = haspendingdata.write;
                Location location = (Location) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(j, new AudioRendererEventListenerEventDispatcherExternalSyntheticLambda3(haspendingdata, j), 6), null);
                if (location != null) {
                    audioProcessorUnhandledAudioFormatException = new AudioProcessorUnhandledAudioFormatException(location, haspendingdata.RemoteActionCompatParcelizer, list, haspendingdata.write, new queueInputBuffer(jCurrentTimeMillis, System.currentTimeMillis()));
                } else {
                    long jCurrentTimeMillis2 = (haspendingdata.write + jCurrentTimeMillis) - System.currentTimeMillis();
                    audioProcessorUnhandledAudioFormatException = new AudioProcessorUnhandledAudioFormatException(jCurrentTimeMillis2 > 0 ? (Location) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(jCurrentTimeMillis2, new lambdainputFormatChanged2comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher(haspendingdata), 6), null) : null, haspendingdata.RemoteActionCompatParcelizer, list, haspendingdata.write, new queueInputBuffer(jCurrentTimeMillis, System.currentTimeMillis()));
                }
            }
            obj = C0177getRfBanners.read(new Ac4Util(audioProcessorUnhandledAudioFormatException));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        DefaultAudioSinkApi31 defaultAudioSinkApi31Write = DefaultAudioSinkConfiguration.write(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj));
        if (!(defaultAudioSinkApi31Write instanceof Ac4Util)) {
            if (!(defaultAudioSinkApi31Write instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            return new AudioSinkSinkFormatSupport(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
        }
        AudioProcessorUnhandledAudioFormatException audioProcessorUnhandledAudioFormatException2 = (AudioProcessorUnhandledAudioFormatException) ((Ac4Util) defaultAudioSinkApi31Write).RemoteActionCompatParcelizer;
        Location location2 = audioProcessorUnhandledAudioFormatException2.AudioAttributesCompatParcelizer;
        boolean z = audioProcessorUnhandledAudioFormatException2.IconCompatParcelizer;
        List list2 = audioProcessorUnhandledAudioFormatException2.RemoteActionCompatParcelizer;
        long j2 = audioProcessorUnhandledAudioFormatException2.write;
        queueInputBuffer queueinputbuffer = audioProcessorUnhandledAudioFormatException2.read;
        boolean zIsEmpty = list2.isEmpty();
        if (!z || zIsEmpty || location2 == null) {
            return (z && !zIsEmpty && location2 == null) ? new AudioSinkSinkFormatSupport(VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(getMediaDuration.AudioAttributesCompatParcelizer.write(), Integer.valueOf(!list2.contains(getWritableDatabase.IconCompatParcelizer) ? 1 : 0)), setAction.write(adjustRequestData.AudioAttributesCompatParcelizer.write(), Long.valueOf(j2)), setAction.write(newArray.write.write(), Long.valueOf(queueinputbuffer.read)), setAction.write(getMediaCodecConfiguration.IconCompatParcelizer.write(), Long.valueOf(queueinputbuffer.AudioAttributesCompatParcelizer))), AudioCapabilitiesReceiver.read) : (z || zIsEmpty) ? (z && zIsEmpty) ? new AudioSinkSinkFormatSupport(null, getExternalSurroundSoundGlobalSettingUri.write) : new AudioSinkSinkFormatSupport(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer) : new AudioSinkSinkFormatSupport(null, setSpatializationBehavior.read);
        }
        getPlaybackHeadPosition getplaybackheadposition = maybePollTimestamp.read(location2, list2, j2, queueinputbuffer);
        String strWrite = createAudioTrackV9.RemoteActionCompatParcelizer.write();
        StringBuilder sb = new StringBuilder();
        sb.append(getplaybackheadposition.IconCompatParcelizer);
        sb.append(',');
        sb.append(getplaybackheadposition.read);
        return new AudioSinkSinkFormatSupport(VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(strWrite, sb.toString()), setAction.write(applySkipSilenceEnabled.IconCompatParcelizer.write(), getplaybackheadposition.RemoteActionCompatParcelizer), setAction.write(getPendingInputBytes.read.write(), getplaybackheadposition.AudioAttributesCompatParcelizer), setAction.write(getWaitTimeRatio.IconCompatParcelizer.write(), getplaybackheadposition.write), setAction.write(isKeyFrame.write.write(), Boolean.valueOf(getplaybackheadposition.AudioAttributesImplApi21Parcelizer)), setAction.write(getMeanSingleRebufferTimeMs.RemoteActionCompatParcelizer.write(), Long.valueOf(getplaybackheadposition.AudioAttributesImplBaseParcelizer)), setAction.write(getMediaDuration.AudioAttributesCompatParcelizer.write(), Integer.valueOf(getplaybackheadposition.AudioAttributesImplApi26Parcelizer)), setAction.write(adjustRequestData.AudioAttributesCompatParcelizer.write(), Long.valueOf(getplaybackheadposition.MediaBrowserCompatItemReceiver)), setAction.write(newArray.write.write(), Long.valueOf(getplaybackheadposition.MediaBrowserCompatCustomActionResultReceiver.read)), setAction.write(getMediaCodecConfiguration.IconCompatParcelizer.write(), Long.valueOf(getplaybackheadposition.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer))), onAudioDevicesAdded.AudioAttributesCompatParcelizer);
    }

    public final PlayerIdLogSessionIdApi31 AudioAttributesImplApi21Parcelizer() {
        Object obj;
        isReadyState isreadystate = this.onMediaButtonEvent;
        DefaultAudioSinkApi31 defaultAudioSinkApi31RemoteActionCompatParcelizer = AudioRendererEventListenerEventDispatcherExternalSyntheticLambda0.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{DefaultAudioTrackBufferSizeProviderBuilder.IconCompatParcelizer.write(), AudioRendererEventListenerEventDispatcherExternalSyntheticLambda2.read.write()}));
        if (defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof Ac4Util) {
            String str = (String) ((Ac4Util) defaultAudioSinkApi31RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
            PlaybackStatsListenerCallback playbackStatsListenerCallback = isreadystate.AudioAttributesCompatParcelizer;
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                List<String> listAudioAttributesCompatParcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer((CharSequence) str);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
                while (it.hasNext()) {
                    getTotalSeekTimeMs gettotalseektimemsRemoteActionCompatParcelizer = PlaybackStatsListenerCallback.RemoteActionCompatParcelizer((String) it.next());
                    if (gettotalseektimemsRemoteActionCompatParcelizer != null) {
                        arrayList.add(gettotalseektimemsRemoteActionCompatParcelizer);
                    }
                }
                obj = C0177getRfBanners.read(arrayList);
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            defaultAudioSinkApi31RemoteActionCompatParcelizer = DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj);
        } else if (!(defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        if (!(defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof Ac4Util)) {
            if (!(defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            return new PlayerIdLogSessionIdApi31(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
        }
        List<getTotalSeekTimeMs> list = (List) ((Ac4Util) defaultAudioSinkApi31RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (getTotalSeekTimeMs gettotalseektimems : list) {
            arrayList2.add(VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(Buffer.write.write(), gettotalseektimems.AudioAttributesCompatParcelizer), setAction.write(getMediaDuration.AudioAttributesCompatParcelizer.write(), gettotalseektimems.read), setAction.write(adjustRequestData.AudioAttributesCompatParcelizer.write(), gettotalseektimems.RemoteActionCompatParcelizer)));
        }
        return new PlayerIdLogSessionIdApi31(arrayList2, onAudioDevicesAdded.AudioAttributesCompatParcelizer);
    }

    public final PlaybackStatsListener AudioAttributesImplApi26Parcelizer() {
        int i;
        DefaultAudioSinkApi31 defaultAudioSinkApi31 = onProcessedStreamChange.read(new AudioSink(this.handleMediaPlayPauseIfPendingOnHandler));
        if (!(defaultAudioSinkApi31 instanceof Ac4Util)) {
            if (!(defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            return new PlaybackStatsListener(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
        }
        getSeekTimeRatio getseektimeratio = (getSeekTimeRatio) ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getseektimeratio, getMeanRebufferCount.RemoteActionCompatParcelizer)) {
            i = 0;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getseektimeratio, getFatalErrorRate.IconCompatParcelizer)) {
            i = 1;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getseektimeratio, MediaMetricsListenerErrorInfo.read)) {
            i = 2;
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getseektimeratio, getMeanVideoFormatBitrate.write)) {
                throw new RenewEligibleCreator();
            }
            i = 3;
        }
        return new PlaybackStatsListener(Integer.valueOf(i), onAudioDevicesAdded.AudioAttributesCompatParcelizer);
    }

    public final getOutputChannelCount AudioAttributesImplBaseParcelizer() {
        Object obj;
        AudioProcessor audioProcessor;
        Collection collectionRemoteActionCompatParcelizer;
        Object ac4Util;
        ChannelMappingAudioProcessor channelMappingAudioProcessor = this.onPlayFromMediaId;
        releaseOutputBuffer releaseoutputbuffer = this.MediaBrowserCompatItemReceiver;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            if (((List) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(0L, new CryptoException(channelMappingAudioProcessor.AudioAttributesCompatParcelizer), 7), IntermediateLoginResponseBody.RemoteActionCompatParcelizer())).isEmpty()) {
                ac4Util = new codecNeedsDiscardChannelsWorkaround(getCurrentPositionUs.write);
            } else {
                maybePrepareFile maybepreparefile = channelMappingAudioProcessor.IconCompatParcelizer;
                if (!maybePrepareFile.IconCompatParcelizer()) {
                    ac4Util = new codecNeedsDiscardChannelsWorkaround(AudioRendererEventListenerEventDispatcherExternalSyntheticLambda7.RemoteActionCompatParcelizer);
                } else if (releaseoutputbuffer.AudioAttributesImplApi21Parcelizer) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    audioSinkError audiosinkerror = (audioSinkError) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(releaseoutputbuffer.MediaMetadataCompat, new onInvalidLatency(channelMappingAudioProcessor, releaseoutputbuffer.MediaDescriptionCompat), 6), null);
                    long jCurrentTimeMillis2 = (jCurrentTimeMillis + releaseoutputbuffer.MediaMetadataCompat) - System.currentTimeMillis();
                    if (jCurrentTimeMillis2 > 0) {
                        int i = releaseoutputbuffer.MediaDescriptionCompat;
                        ArrayList arrayList = new ArrayList();
                        onProcessedStreamChange.AudioAttributesCompatParcelizer(jCurrentTimeMillis2, new needsPassthroughWorkarounds(channelMappingAudioProcessor, i, arrayList), 6);
                        collectionRemoteActionCompatParcelizer = arrayList;
                    } else {
                        collectionRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    }
                    MagicModuleMetaUcModel magicModuleMetaUcModel = new MagicModuleMetaUcModel(2);
                    magicModuleMetaUcModel.read(audiosinkerror);
                    magicModuleMetaUcModel.write((Object) collectionRemoteActionCompatParcelizer.toArray(new audioSinkError[0]));
                    ac4Util = new Ac4Util(IntermediateLoginResponseBody.read(magicModuleMetaUcModel.write((Object[]) new audioSinkError[magicModuleMetaUcModel.RemoteActionCompatParcelizer()])));
                } else {
                    ac4Util = new codecNeedsDiscardChannelsWorkaround(lambdaunderrun4comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher.RemoteActionCompatParcelizer);
                }
            }
            obj = C0177getRfBanners.read(ac4Util);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        DefaultAudioSinkApi31 defaultAudioSinkApi31AudioAttributesCompatParcelizer = DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj);
        if (!(defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof Ac4Util)) {
            if (!(defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            defaultAudioSinkApi31AudioAttributesCompatParcelizer = new codecNeedsDiscardChannelsWorkaround(onOffloadBufferEmptying.RemoteActionCompatParcelizer);
        }
        DefaultAudioSinkApi31 defaultAudioSinkApi31Write = DefaultAudioSinkConfiguration.write(defaultAudioSinkApi31AudioAttributesCompatParcelizer);
        if (defaultAudioSinkApi31Write instanceof Ac4Util) {
            List<audioSinkError> list = (List) ((Ac4Util) defaultAudioSinkApi31Write).RemoteActionCompatParcelizer;
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (audioSinkError audiosinkerror2 : list) {
                arrayList2.add(VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(createAudioTrackV9.RemoteActionCompatParcelizer.write(), audiosinkerror2.write), setAction.write(Mp4LocationData1.AudioAttributesCompatParcelizer.write(), Boolean.valueOf(audiosinkerror2.read)), setAction.write(getMediaDuration.AudioAttributesCompatParcelizer.write(), audiosinkerror2.AudioAttributesCompatParcelizer), setAction.write(adjustRequestData.AudioAttributesCompatParcelizer.write(), Long.valueOf(audiosinkerror2.IconCompatParcelizer))));
            }
            return new getOutputChannelCount(arrayList2, onAudioDevicesAdded.AudioAttributesCompatParcelizer);
        }
        if (!(defaultAudioSinkApi31Write instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        hasTimestamp hastimestamp = (hasTimestamp) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi31Write).IconCompatParcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(hastimestamp, getCurrentPositionUs.write)) {
            audioProcessor = setSpatializationBehavior.read;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(hastimestamp, AudioRendererEventListenerEventDispatcherExternalSyntheticLambda7.RemoteActionCompatParcelizer)) {
            audioProcessor = getExternalSurroundSoundGlobalSettingUri.write;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(hastimestamp, lambdaunderrun4comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher.RemoteActionCompatParcelizer)) {
            audioProcessor = AudioCapabilitiesReceiver.read;
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(hastimestamp, onOffloadBufferEmptying.RemoteActionCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            audioProcessor = Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer;
        }
        return new getOutputChannelCount(null, audioProcessor);
    }

    public final String IconCompatParcelizer() {
        Object objWrite = r8lambdamCEi04OcFi8gu0FD463twzV2nG8.write(1000L, true, true, new processStreamInput(this.onAddQueueItem.IconCompatParcelizer));
        if (C0177getRfBanners.RemoteActionCompatParcelizer(objWrite)) {
            objWrite = "";
        }
        String str = (String) objWrite;
        return str == null ? "" : str;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        Object objWrite = r8lambdamCEi04OcFi8gu0FD463twzV2nG8.write(1000L, true, true, new adjustResponseData(this.onAddQueueItem.write));
        if (C0177getRfBanners.RemoteActionCompatParcelizer(objWrite)) {
            objWrite = null;
        }
        String str = (String) objWrite;
        return str == null ? "" : str;
    }

    public final DecoderReuseEvaluationDecoderDiscardReasons MediaBrowserCompatItemReceiver() {
        Object next;
        int i;
        DefaultAudioSinkApi31 defaultAudioSinkApi31RemoteActionCompatParcelizer = this.onPlay.RemoteActionCompatParcelizer();
        Long lValueOf = null;
        if (!(defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof Ac4Util)) {
            if (!(defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            return new DecoderReuseEvaluationDecoderDiscardReasons(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
        }
        List list = (List) ((Ac4Util) defaultAudioSinkApi31RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
        if (list.isEmpty()) {
            return new DecoderReuseEvaluationDecoderDiscardReasons(null, setSpatializationBehavior.read);
        }
        onAudioDevicesAdded onaudiodevicesadded = onAudioDevicesAdded.AudioAttributesCompatParcelizer;
        String strWrite = experimentalSetEnableKeepAudioTrackOnSeek.IconCompatParcelizer.write();
        Iterator it = list.iterator();
        long jLongValue = 0;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Long l = ((setPassthroughBufferDurationUs) next).MediaBrowserCompatItemReceiver;
                long jLongValue2 = l != null ? l.longValue() : 0L;
                do {
                    Object next2 = it.next();
                    Long l2 = ((setPassthroughBufferDurationUs) next2).MediaBrowserCompatItemReceiver;
                    long jLongValue3 = l2 != null ? l2.longValue() : 0L;
                    if (jLongValue2 < jLongValue3) {
                        next = next2;
                        jLongValue2 = jLongValue3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        setPassthroughBufferDurationUs setpassthroughbufferdurationus = (setPassthroughBufferDurationUs) next;
        if (setpassthroughbufferdurationus != null) {
            Long l3 = setpassthroughbufferdurationus.MediaBrowserCompatItemReceiver;
            if (l3 != null) {
                long jLongValue4 = l3.longValue();
                Long l4 = setpassthroughbufferdurationus.write;
                if (l4 != null) {
                    lValueOf = Long.valueOf(jLongValue4 - l4.longValue());
                }
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            }
        }
        Pair pairWrite = setAction.write(strWrite, Long.valueOf(jLongValue));
        String strWrite2 = isOffloadedPlayback.IconCompatParcelizer.write();
        if (list.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((setPassthroughBufferDurationUs) it2.next()).IconCompatParcelizer != null && (i = i + 1) < 0) {
                    IntermediateLoginResponseBody.write();
                }
            }
        }
        Pair pairWrite2 = setAction.write(strWrite2, Integer.valueOf(i));
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (Iterator it3 = list.iterator(); it3.hasNext(); it3 = it3) {
            setPassthroughBufferDurationUs setpassthroughbufferdurationus2 = (setPassthroughBufferDurationUs) it3.next();
            arrayList.add(VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(AudioTrackPositionTrackerListener.RemoteActionCompatParcelizer.write(), setpassthroughbufferdurationus2.AudioAttributesCompatParcelizer), setAction.write(checkCoefficientsValid.AudioAttributesCompatParcelizer.write(), setpassthroughbufferdurationus2.IconCompatParcelizer), setAction.write(onFlush.IconCompatParcelizer.write(), Integer.valueOf(setpassthroughbufferdurationus2.read)), setAction.write(isOpen.IconCompatParcelizer.write(), setpassthroughbufferdurationus2.RemoteActionCompatParcelizer), setAction.write(writeOggIdHeaderPage.read.write(), setpassthroughbufferdurationus2.write), setAction.write(lambdareleaseAudioTrackAsync0.RemoteActionCompatParcelizer.write(), setpassthroughbufferdurationus2.AudioAttributesImplApi26Parcelizer), setAction.write(buildAudioTrack.write.write(), setpassthroughbufferdurationus2.AudioAttributesImplApi21Parcelizer), setAction.write(findTrueHdSyncframeOffset.read.write(), setpassthroughbufferdurationus2.MediaBrowserCompatCustomActionResultReceiver), setAction.write(buildAudioSpecificConfig.IconCompatParcelizer.write(), setpassthroughbufferdurationus2.AudioAttributesImplBaseParcelizer), setAction.write(applyMediaPositionParameters.AudioAttributesCompatParcelizer.write(), setpassthroughbufferdurationus2.MediaBrowserCompatItemReceiver)));
        }
        return new DecoderReuseEvaluationDecoderDiscardReasons(VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, setAction.write("el", arrayList)), onaudiodevicesadded);
    }

    public final getMeanTimeBetweenRebuffers MediaBrowserCompatSearchResultReceiver() {
        DefaultAudioSinkApi31 defaultAudioSinkApi31 = onProcessedStreamChange.read(new onPositionAdvancing(this.handleMediaPlayPauseIfPendingOnHandler));
        if (defaultAudioSinkApi31 instanceof Ac4Util) {
            return new getMeanTimeBetweenRebuffers((String) ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer, onAudioDevicesAdded.AudioAttributesCompatParcelizer);
        }
        if (!(defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        return new getMeanTimeBetweenRebuffers(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
    }

    public final readVariableBits MediaDescriptionCompat() {
        DefaultAudioSinkApi31 defaultAudioSinkApi31 = onProcessedStreamChange.read(new AacUtil1(this.onPlayFromUri));
        if (defaultAudioSinkApi31 instanceof Ac4Util) {
            return new readVariableBits((Map) ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer, onAudioDevicesAdded.AudioAttributesCompatParcelizer);
        }
        if (!(defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        return new readVariableBits(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
    }

    public final AudioProcessorChain MediaMetadataCompat() {
        Object obj;
        getFinalOutputBufferIndex getfinaloutputbufferindex = this.onFastForward;
        DefaultAudioSinkApi31 defaultAudioSinkApi31RemoteActionCompatParcelizer = AudioRendererEventListenerEventDispatcherExternalSyntheticLambda0.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(DefaultAudioSinkStreamEventCallbackV29.read.write()));
        if (defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof Ac4Util) {
            String str = (String) ((Ac4Util) defaultAudioSinkApi31RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
            unregister unregisterVar = getfinaloutputbufferindex.AudioAttributesCompatParcelizer;
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(StateResult.MediaBrowserCompatItemReceiver(StateResult.AudioAttributesCompatParcelizer(StateResult.write(new newYearNameItem(get1xBufferSizeInBytes.IconCompatParcelizer.write()).read(str, 0), setAllowedCapturePolicy.RemoteActionCompatParcelizer), getEncodingAndChannelConfigForPassthrough.read)));
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            defaultAudioSinkApi31RemoteActionCompatParcelizer = DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj);
        } else if (!(defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        if (!(defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof Ac4Util)) {
            if (!(defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            return new AudioProcessorChain(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
        }
        List<decoderInitialized> list = (List) ((Ac4Util) defaultAudioSinkApi31RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10)), 16));
        for (decoderInitialized decoderinitialized : list) {
            Pair pairWrite = setAction.write(decoderinitialized.write, decoderinitialized.AudioAttributesCompatParcelizer);
            linkedHashMap.put(pairWrite.write(), pairWrite.IconCompatParcelizer());
        }
        return new AudioProcessorChain(linkedHashMap, onAudioDevicesAdded.AudioAttributesCompatParcelizer);
    }

    public final onFinished RatingCompat() {
        Object obj;
        List list = (List) this.onPause.read.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str = (String) obj2;
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(Boolean.valueOf(new File(str).exists()));
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            if (((Boolean) setForHeaderData.read(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj), Boolean.FALSE)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        return new onFinished(arrayList);
    }

    public final shouldUseFloatOutput RemoteActionCompatParcelizer() {
        DefaultAudioSinkApi31 defaultAudioSinkApi31 = onProcessedStreamChange.read(new setOffloadMode(this.MediaBrowserCompatMediaItem));
        if (defaultAudioSinkApi31 instanceof Ac4Util) {
            int iIntValue = ((Number) ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer).intValue();
            return new shouldUseFloatOutput(Integer.valueOf(iIntValue), onAudioDevicesAdded.AudioAttributesCompatParcelizer);
        }
        if (!(defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        return new shouldUseFloatOutput(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
    }

    public final String read() {
        Object objWrite = r8lambdamCEi04OcFi8gu0FD463twzV2nG8.write(1000L, true, true, new releaseDecoder(this.onAddQueueItem.RemoteActionCompatParcelizer));
        if (C0177getRfBanners.RemoteActionCompatParcelizer(objWrite)) {
            objWrite = "";
        }
        return (String) objWrite;
    }

    public final DefaultAudioSinkAudioDeviceInfoApi23 write() {
        int i;
        DefaultAudioSinkApi31 defaultAudioSinkApi31 = onProcessedStreamChange.read(new lambdadisabled6comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher(this.handleMediaPlayPauseIfPendingOnHandler));
        if (!(defaultAudioSinkApi31 instanceof Ac4Util)) {
            if (!(defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            return new DefaultAudioSinkAudioDeviceInfoApi23(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
        }
        useOffloadedPlayback useoffloadedplayback = (useOffloadedPlayback) ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(useoffloadedplayback, setAudioProcessorPlaybackParameters.write)) {
            i = 0;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(useoffloadedplayback, isZero.IconCompatParcelizer)) {
            i = 1;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(useoffloadedplayback, ChannelMixingMatrix.RemoteActionCompatParcelizer)) {
            i = 2;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(useoffloadedplayback, setAudioTrackPlaybackSpeed.IconCompatParcelizer)) {
            i = 3;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(useoffloadedplayback, getAudioCapabilities.write)) {
            i = 4;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(useoffloadedplayback, processFirstSampleOfStream.write)) {
            i = 5;
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(useoffloadedplayback, DecoderAudioRenderer1.RemoteActionCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            i = 6;
        }
        return new DefaultAudioSinkAudioDeviceInfoApi23(Integer.valueOf(i), onAudioDevicesAdded.AudioAttributesCompatParcelizer);
    }
}
