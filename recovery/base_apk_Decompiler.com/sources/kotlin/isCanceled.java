package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.access6100;
import kotlin.getTimelineChangeReason;
import kotlin.handleRelease;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0015\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/isCanceled;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p1", "", "p2", "Lo/PlaylistTimeline;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/lang/String;)Lo/PlaylistTimeline;", "Lo/getUids;", "Lo/getChildTimelines;", "p3", "Lo/addAllCommands;", "p4", "Lo/PlaybackParameters;", "p5", "", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/getUids;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lo/getChildTimelines;Lo/addAllCommands;Lo/PlaybackParameters;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isCanceled {
    public static final isCanceled INSTANCE = new isCanceled();

    private isCanceled() {
    }

    @getMagicModuleMeta
    public static final PlaylistTimeline AudioAttributesCompatParcelizer(final Context p0, CleverTapInstanceConfig p1, String p2) {
        if (p0 == null || p1 == null) {
            throw new RuntimeException("This is invalid case and will not happen. Context/Config is null");
        }
        final RendererCapabilitiesDecoderSupport rendererCapabilitiesDecoderSupportWrite = RendererCapabilitiesDecoderSupport.read.write();
        String strWrite = p1.write();
        toMagicModuleMetaRepoModel.write((Object) strWrite);
        final SimpleBasePlayerPeriodData simpleBasePlayerPeriodData = new SimpleBasePlayerPeriodData(rendererCapabilitiesDecoderSupportWrite.RemoteActionCompatParcelizer(p0, strWrite), rendererCapabilitiesDecoderSupportWrite.write(p0, strWrite), rendererCapabilitiesDecoderSupportWrite.read(p0, strWrite));
        copyWithPlaceholderTimeline copywithplaceholdertimeline = new copyWithPlaceholderTimeline();
        lambdaonAudioDecoderInitialized4 lambdaonaudiodecoderinitialized4 = new lambdaonAudioDecoderInitialized4();
        lambdaonAudioCodecError11 lambdaonaudiocodecerror11 = new lambdaonAudioCodecError11();
        PlayerListener playerListener = new PlayerListener();
        getTrackSupport gettracksupport = new getTrackSupport();
        final CleverTapInstanceConfig cleverTapInstanceConfig = new CleverTapInstanceConfig(p1);
        getMutedFromManager getmutedfrommanager = new getMutedFromManager(p0, cleverTapInstanceConfig, null, null, 12, null);
        getMaxStars getmaxstars = new getMaxStars(cleverTapInstanceConfig);
        final isTypeSupported istypesupportedAudioAttributesCompatParcelizer = TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(cleverTapInstanceConfig);
        istypesupportedAudioAttributesCompatParcelizer.IconCompatParcelizer().read("initFileResourceProvider", new Callable() { // from class: o.getPayload
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return isCanceled.read(p0, cleverTapInstanceConfig);
            }
        });
        final lambdasetDeviceMuted28 lambdasetdevicemuted28 = new lambdasetDeviceMuted28(cleverTapInstanceConfig, playerListener, getmaxstars, new RemoteActionCompatParcelizer(getmutedfrommanager), new read(getmutedfrommanager));
        String strWrite2 = cleverTapInstanceConfig.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite2, "");
        final getSurfaceHolderSize getsurfaceholdersize = new getSurfaceHolderSize(p0, strWrite2);
        getCurrentPeriodOrAdPositionMs getcurrentperiodoradpositionms = new getCurrentPeriodOrAdPositionMs(getsurfaceholdersize);
        String strWrite3 = cleverTapInstanceConfig.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite3, "");
        getMediaMetadataInternal getmediametadatainternal = new getMediaMetadataInternal(strWrite3, getcurrentperiodoradpositionms);
        getTimelineChangeReason.Companion companion = getTimelineChangeReason.INSTANCE;
        getTimelineChangeReason gettimelinechangereasonRemoteActionCompatParcelizer = getTimelineChangeReason.Companion.RemoteActionCompatParcelizer(cleverTapInstanceConfig.AudioAttributesImplBaseParcelizer());
        String strWrite4 = cleverTapInstanceConfig.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite4, "");
        final getPeriodIndexFromWindowPosition getperiodindexfromwindowposition = new getPeriodIndexFromWindowPosition(gettimelinechangereasonRemoteActionCompatParcelizer, strWrite4, getsurfaceholdersize, getmediametadatainternal);
        istypesupportedAudioAttributesCompatParcelizer.read().read("migratingEncryption", new Callable() { // from class: o.markAsProcessed
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return isCanceled.RemoteActionCompatParcelizer(p0, cleverTapInstanceConfig, lambdasetdevicemuted28, getperiodindexfromwindowposition, getsurfaceholdersize);
            }
        });
        final getChildTimelines getchildtimelines = new getChildTimelines(p0, cleverTapInstanceConfig, copywithplaceholdertimeline);
        getchildtimelines.write(p2);
        lambdasetDeviceMuted28 lambdasetdevicemuted282 = lambdasetdevicemuted28;
        r8lambda3EoLwxJB4A25pAog2xOLUUC2nk r8lambda3eolwxjb4a25paog2xoluuc2nk = new r8lambda3EoLwxJB4A25pAog2xOLUUC2nk(p0, cleverTapInstanceConfig, getperiodindexfromwindowposition, getchildtimelines, lambdasetdevicemuted282);
        RendererCapabilitiesCapabilities rendererCapabilitiesCapabilities = new RendererCapabilitiesCapabilities(lambdaonaudiodecoderinitialized4, lambdaonaudiocodecerror11);
        lambdasetTrackSelectionParameters14 lambdasettrackselectionparameters14 = new lambdasetTrackSelectionParameters14(cleverTapInstanceConfig, copywithplaceholdertimeline, r8lambda3eolwxjb4a25paog2xoluuc2nk, rendererCapabilitiesCapabilities, getmutedfrommanager);
        PlayerEvent.INSTANCE.write(p0, cleverTapInstanceConfig);
        final PlayerRepeatMode playerRepeatMode = new PlayerRepeatMode(cleverTapInstanceConfig, getchildtimelines);
        RendererCapabilitiesTunnelingSupport rendererCapabilitiesTunnelingSupport = new RendererCapabilitiesTunnelingSupport(cleverTapInstanceConfig, copywithplaceholdertimeline, lambdaonaudiodecoderinitialized4, r8lambda3eolwxjb4a25paog2xoluuc2nk);
        final getUids getuids = new getUids(p0, cleverTapInstanceConfig, playerListener, playerRepeatMode, getchildtimelines, lambdasetdevicemuted282);
        SimpleBasePlayerExternalSyntheticLambda15 simpleBasePlayerExternalSyntheticLambda15 = new SimpleBasePlayerExternalSyntheticLambda15(r8lambda3eolwxjb4a25paog2xoluuc2nk);
        String strWrite5 = cleverTapInstanceConfig.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite5, "");
        lambdaupdateStateAndInformListeners59 lambdaupdatestateandinformlisteners59 = new lambdaupdateStateAndInformListeners59(p0, strWrite5, getchildtimelines);
        final lambdaupdateStateAndInformListeners37 lambdaupdatestateandinformlisteners37 = new lambdaupdateStateAndInformListeners37(simpleBasePlayerPeriodData, null, null, 6, null);
        lambdaupdateStateForPendingOperation61comgoogleandroidexoplayer2SimpleBasePlayer lambdaupdatestateforpendingoperation61comgoogleandroidexoplayer2simplebaseplayer = new lambdaupdateStateForPendingOperation61comgoogleandroidexoplayer2SimpleBasePlayer(lambdaupdatestateandinformlisteners37, lambdaupdatestateandinformlisteners59);
        lambdaupdateStateAndInformListeners39 lambdaupdatestateandinformlisteners39 = new lambdaupdateStateAndInformListeners39(p0, cleverTapInstanceConfig, new getTunnelingSupport(cleverTapInstanceConfig, playerRepeatMode.AudioAttributesImplBaseParcelizer(), null, null, null, 28, null), null, 8, null);
        handleSetShuffleModeEnabled handlesetshufflemodeenabled = handleSetShuffleModeEnabled.INSTANCE;
        Set<updateStateAndInformListeners> set = handleSetShuffleModeEnabled.read(lambdaupdatestateandinformlisteners39);
        handleRelease.Companion companion2 = handleRelease.INSTANCE;
        handleRelease handlereleaseIconCompatParcelizer = handleRelease.Companion.IconCompatParcelizer(cleverTapInstanceConfig, set);
        final handleSetVideoOutput handlesetvideooutput = new handleSetVideoOutput(simpleBasePlayerExternalSyntheticLambda15, lambdaupdatestateandinformlisteners59, lambdaupdatestateforpendingoperation61comgoogleandroidexoplayer2simplebaseplayer, simpleBasePlayerPeriodData, handlereleaseIconCompatParcelizer);
        istypesupportedAudioAttributesCompatParcelizer.IconCompatParcelizer().read("initStores", new Callable() { // from class: o.getTarget
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return isCanceled.write(getchildtimelines, simpleBasePlayerPeriodData, rendererCapabilitiesDecoderSupportWrite, p0, getperiodindexfromwindowposition, cleverTapInstanceConfig, handlesetvideooutput, playerRepeatMode);
            }
        });
        istypesupportedAudioAttributesCompatParcelizer.IconCompatParcelizer().read("initFCManager", new Callable() { // from class: o.getPositionMs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return isCanceled.AudioAttributesCompatParcelizer(getchildtimelines, getuids, cleverTapInstanceConfig, p0, simpleBasePlayerPeriodData, lambdaupdatestateandinformlisteners37, istypesupportedAudioAttributesCompatParcelizer);
            }
        });
        access6100.Companion companion3 = access6100.INSTANCE;
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver, "");
        lambdaonCues52 lambdaoncues52 = new lambdaonCues52(cleverTapInstanceConfig, p0, access6100.Companion.RemoteActionCompatParcelizer(p0, rendererWakeupListenerMediaBrowserCompatItemReceiver, simpleBasePlayerPeriodData));
        final lambdaonAudioAttributesChanged55 lambdaonaudioattributeschanged55 = new lambdaonAudioAttributesChanged55(lambdaoncues52);
        getuids.IconCompatParcelizer(lambdaonaudioattributeschanged55);
        lambdaonCues51 lambdaoncues51 = new lambdaonCues51(lambdaonaudioattributeschanged55);
        istypesupportedAudioAttributesCompatParcelizer.IconCompatParcelizer().read("initCTVariables", new Callable() { // from class: o.PlayerMessageSender
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return isCanceled.read(lambdaonaudioattributeschanged55);
            }
        });
        getDefaultPositionUs getdefaultpositionus = new getDefaultPositionUs(cleverTapInstanceConfig, getuids, false, simpleBasePlayerPeriodData, lambdaupdatestateandinformlisteners59, handlereleaseIconCompatParcelizer, copywithplaceholdertimeline);
        setMuted setmuted = new setMuted(getmutedfrommanager, cleverTapInstanceConfig, getchildtimelines);
        blockUntilConstructorFinished blockuntilconstructorfinished = new blockUntilConstructorFinished(getcurrentperiodoradpositionms, getmediametadatainternal.AudioAttributesCompatParcelizer());
        String strWrite6 = cleverTapInstanceConfig.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite6, "");
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver2, "");
        setVideoSize setvideosize = new setVideoSize(strWrite6, rendererWakeupListenerMediaBrowserCompatItemReceiver2, getchildtimelines);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(getmutedfrommanager);
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(getmutedfrommanager);
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver3 = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver3, "");
        increaseVolume increasevolume = new increaseVolume(p0, cleverTapInstanceConfig, copywithplaceholdertimeline, getuids, getchildtimelines, setvideosize, getmaxstars, lambdasetdevicemuted282, lambdaonaudiocodecerror11, iconCompatParcelizer, audioAttributesCompatParcelizer, rendererWakeupListenerMediaBrowserCompatItemReceiver3);
        isServerSideInsertedAdGroup isserversideinsertedadgroup = new isServerSideInsertedAdGroup(cleverTapInstanceConfig, lambdaonaudiodecoderinitialized4, getuids, setvideosize);
        setSurfaceSize setsurfacesize = new setSurfaceSize(cleverTapInstanceConfig, copywithplaceholdertimeline, increasevolume, setmuted, 0, null, null, 112, null);
        r8lambdayqk5n84OlDC9DTin4ovqV23B95c r8lambdayqk5n84oldc9dtin4ovqv23b95c = new r8lambdayqk5n84OlDC9DTin4ovqV23B95c(p0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new getPositionInWindowUs[]{getdefaultpositionus, new isTypeSelected(cleverTapInstanceConfig, getchildtimelines, getmaxstars), isserversideinsertedadgroup, new TimelineWindow(cleverTapInstanceConfig), new getDefaultPositionMs(cleverTapInstanceConfig, playerListener, playerRepeatMode, getuids), new Tracks(p0, cleverTapInstanceConfig, lambdasetdevicemuted282, playerRepeatMode, getuids), new getPositionInFirstPeriodMs(cleverTapInstanceConfig, getuids, playerRepeatMode), new TimelineRemotableTimeline(cleverTapInstanceConfig, playerRepeatMode, getuids), new getPositionInFirstPeriodUs(cleverTapInstanceConfig, getuids), new getGroups(cleverTapInstanceConfig, copywithplaceholdertimeline, getuids), new isLive(cleverTapInstanceConfig, playerRepeatMode), new getCurrentUnixTimeMs(cleverTapInstanceConfig, setsurfacesize)}));
        setsurfacesize.write(r8lambdayqk5n84oldc9dtin4ovqv23b95c);
        getVolumeFromManager getvolumefrommanager = new getVolumeFromManager(p0, cleverTapInstanceConfig, getchildtimelines, copywithplaceholdertimeline, getuids, lambdasetdevicemuted282, playerRepeatMode, setmuted, blockuntilconstructorfinished, isserversideinsertedadgroup, getmutedfrommanager, increasevolume, r8lambdayqk5n84oldc9dtin4ovqv23b95c, null, 8192, null);
        setPlayerError setplayererror = new setPlayerError(p0, cleverTapInstanceConfig, getperiodindexfromwindowposition);
        lambdasetRepeatMode8 lambdasetrepeatmode8 = new lambdasetRepeatMode8(lambdasetdevicemuted282, p0, cleverTapInstanceConfig, lambdasettrackselectionparameters14, rendererCapabilitiesTunnelingSupport, playerRepeatMode, gettracksupport, getchildtimelines, lambdaonaudiocodecerror11, getvolumefrommanager, copywithplaceholdertimeline, playerListener, r8lambda3eolwxjb4a25paog2xoluuc2nk, getuids, setplayererror);
        final PlaybackParameters playbackParameters = new PlaybackParameters(p0, cleverTapInstanceConfig, lambdasetrepeatmode8, lambdaonaudiodecoderinitialized4, lambdaonaudiocodecerror11, copywithplaceholdertimeline, getchildtimelines, playerRepeatMode, getuids, playerListener, new getDefaultPositionUs(cleverTapInstanceConfig, getuids, true, simpleBasePlayerPeriodData, lambdaupdatestateandinformlisteners59, handlereleaseIconCompatParcelizer, copywithplaceholdertimeline), onDroppedVideoFrames.IconCompatParcelizer, istypesupportedAudioAttributesCompatParcelizer);
        lambdaupdateStateAndInformListeners52 lambdaupdatestateandinformlisteners52 = new lambdaupdateStateAndInformListeners52(simpleBasePlayerPeriodData, handlereleaseIconCompatParcelizer, istypesupportedAudioAttributesCompatParcelizer, new getCreatedOnDateMs() { // from class: o.send
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isCanceled.IconCompatParcelizer(p0, cleverTapInstanceConfig);
            }
        }, false, 16, null);
        getvolumefrommanager.IconCompatParcelizer(handlesetvideooutput);
        RendererState rendererStateIconCompatParcelizer = RendererState.IconCompatParcelizer(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererStateIconCompatParcelizer, "");
        String strWrite7 = cleverTapInstanceConfig.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite7, "");
        lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45 = new lambdaupdateStateAndInformListeners45(p0, cleverTapInstanceConfig, istypesupportedAudioAttributesCompatParcelizer, getuids, playerRepeatMode, playbackParameters, copywithplaceholdertimeline, rendererStateIconCompatParcelizer, getchildtimelines, new postOrRunOnApplicationHandler(simpleBasePlayerPeriodData, strWrite7), handlesetvideooutput, handlereleaseIconCompatParcelizer, lambdaupdatestateandinformlisteners39, lambdaupdatestateandinformlisteners52, onDroppedVideoFrames.IconCompatParcelizer);
        getuids.write(lambdaupdatestateandinformlisteners45);
        setPlaybackSuppressionReason setplaybacksuppressionreason = new setPlaybackSuppressionReason();
        setplaybacksuppressionreason.write(lambdaupdatestateandinformlisteners45.IconCompatParcelizer());
        setTimedMetadata settimedmetadata = new setTimedMetadata();
        settimedmetadata.IconCompatParcelizer(setplaybacksuppressionreason);
        settimedmetadata.IconCompatParcelizer(new SimpleExoPlayerBuilder(playerRepeatMode));
        playerRepeatMode.RemoteActionCompatParcelizer(settimedmetadata);
        istypesupportedAudioAttributesCompatParcelizer.IconCompatParcelizer().read("initFeatureFlags", new Callable() { // from class: o.setDeleteAfterDelivery
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return isCanceled.IconCompatParcelizer(p0, getuids, cleverTapInstanceConfig, getchildtimelines, playerRepeatMode, playbackParameters);
            }
        });
        getAdaptiveSupport getadaptivesupport = new getAdaptiveSupport(p0, cleverTapInstanceConfig, copywithplaceholdertimeline, lambdasetrepeatmode8);
        getContentResumeOffsetUs getcontentresumeoffsetus = getContentResumeOffsetUs.read(p0, cleverTapInstanceConfig, lambdasetdevicemuted282, lambdaonaudiocodecerror11, playbackParameters, getuids, new getRemovedAdGroupCount(p0, cleverTapInstanceConfig));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getcontentresumeoffsetus, "");
        return new PlaylistTimeline(getadaptivesupport, cleverTapInstanceConfig, copywithplaceholdertimeline, lambdasetdevicemuted282, getchildtimelines, lambdasettrackselectionparameters14, r8lambda3eolwxjb4a25paog2xoluuc2nk, new copyWithPlaybackState(p0, cleverTapInstanceConfig, playbackParameters, copywithplaceholdertimeline, rendererCapabilitiesTunnelingSupport, getcontentresumeoffsetus, playerRepeatMode, lambdaupdatestateandinformlisteners45, lambdasetrepeatmode8, istypesupportedAudioAttributesCompatParcelizer, onDroppedVideoFrames.IconCompatParcelizer), playbackParameters, lambdasetrepeatmode8, playerListener, playerRepeatMode, getuids, lambdaupdatestateandinformlisteners45, handlesetvideooutput, lambdaupdatestateandinformlisteners37, new setPlaylist(p0, cleverTapInstanceConfig, getchildtimelines, lambdaonaudiocodecerror11, lambdasetrepeatmode8, playbackParameters, copywithplaceholdertimeline, getuids, rendererCapabilitiesTunnelingSupport, r8lambda3eolwxjb4a25paog2xoluuc2nk, playerRepeatMode, lambdasetdevicemuted28, playerListener, setplayererror, setsurfacesize), rendererCapabilitiesTunnelingSupport, lambdaonaudiocodecerror11, gettracksupport, getvolumefrommanager, getcontentresumeoffsetus, lambdaoncues52, lambdaoncues51, getperiodindexfromwindowposition, simpleBasePlayerPeriodData, handlereleaseIconCompatParcelizer, rendererCapabilitiesCapabilities, lambdaonaudioattributeschanged55, istypesupportedAudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        SimpleBasePlayerExternalSyntheticLambda6.INSTANCE.read(context, cleverTapInstanceConfig.MediaBrowserCompatItemReceiver());
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        public final void IconCompatParcelizer() {
            ((getMutedFromManager) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(Object obj) {
            super(0, obj, getMutedFromManager.class, "IconCompatParcelizer", "IconCompatParcelizer()V", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        public final void RemoteActionCompatParcelizer() {
            ((getMutedFromManager) this.AudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        read(Object obj) {
            super(0, obj, getMutedFromManager.class, "AudioAttributesCompatParcelizer", "AudioAttributesCompatParcelizer()V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, lambdasetDeviceMuted28 lambdasetdevicemuted28, getPeriodIndexFromWindowPosition getperiodindexfromwindowposition, getSurfaceHolderSize getsurfaceholdersize) {
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(lambdasetdevicemuted28, "");
        toMagicModuleMetaRepoModel.write(getperiodindexfromwindowposition, "");
        toMagicModuleMetaRepoModel.write(getsurfaceholdersize, "");
        lambdaclearVideoOutput21 lambdaclearvideooutput21 = new lambdaclearVideoOutput21(context, cleverTapInstanceConfig, lambdasetdevicemuted28.AudioAttributesCompatParcelizer(context));
        String strWrite = cleverTapInstanceConfig.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        int iAudioAttributesImplBaseParcelizer = cleverTapInstanceConfig.AudioAttributesImplBaseParcelizer();
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver, "");
        new getPositionDiscontinuityReason(strWrite, iAudioAttributesImplBaseParcelizer, rendererWakeupListenerMediaBrowserCompatItemReceiver, getperiodindexfromwindowposition, getsurfaceholdersize, lambdaclearvideooutput21).read();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getChildTimelines getchildtimelines, SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, RendererCapabilitiesDecoderSupport rendererCapabilitiesDecoderSupport, Context context, getPeriodIndexFromWindowPosition getperiodindexfromwindowposition, CleverTapInstanceConfig cleverTapInstanceConfig, handleSetVideoOutput handlesetvideooutput, addAllCommands addallcommands) {
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerPeriodData, "");
        toMagicModuleMetaRepoModel.write(rendererCapabilitiesDecoderSupport, "");
        toMagicModuleMetaRepoModel.write(getperiodindexfromwindowposition, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(handlesetvideooutput, "");
        toMagicModuleMetaRepoModel.write(addallcommands, "");
        if (getchildtimelines.MediaBrowserCompatCustomActionResultReceiver() != null) {
            if (simpleBasePlayerPeriodData.getWrite() == null) {
                String strMediaBrowserCompatCustomActionResultReceiver = getchildtimelines.MediaBrowserCompatCustomActionResultReceiver();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strMediaBrowserCompatCustomActionResultReceiver, "");
                String strWrite = cleverTapInstanceConfig.write();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
                access6500 access6500VarIconCompatParcelizer = RendererCapabilitiesDecoderSupport.IconCompatParcelizer(context, getperiodindexfromwindowposition, strMediaBrowserCompatCustomActionResultReceiver, strWrite);
                simpleBasePlayerPeriodData.RemoteActionCompatParcelizer(access6500VarIconCompatParcelizer);
                handlesetvideooutput.AudioAttributesCompatParcelizer();
                addallcommands.IconCompatParcelizer(access6500VarIconCompatParcelizer);
            }
            if (simpleBasePlayerPeriodData.getAudioAttributesCompatParcelizer() == null) {
                String strMediaBrowserCompatCustomActionResultReceiver2 = getchildtimelines.MediaBrowserCompatCustomActionResultReceiver();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strMediaBrowserCompatCustomActionResultReceiver2, "");
                String strWrite2 = cleverTapInstanceConfig.write();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite2, "");
                setTracks settracks = RendererCapabilitiesDecoderSupport.read(context, strMediaBrowserCompatCustomActionResultReceiver2, strWrite2);
                simpleBasePlayerPeriodData.IconCompatParcelizer(settracks);
                addallcommands.IconCompatParcelizer(settracks);
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getChildTimelines getchildtimelines, getUids getuids, CleverTapInstanceConfig cleverTapInstanceConfig, Context context, SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, lambdaupdateStateAndInformListeners37 lambdaupdatestateandinformlisteners37, isTypeSupported istypesupported) {
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        toMagicModuleMetaRepoModel.write(getuids, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerPeriodData, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners37, "");
        toMagicModuleMetaRepoModel.write(istypesupported, "");
        String strMediaBrowserCompatCustomActionResultReceiver = getchildtimelines.MediaBrowserCompatCustomActionResultReceiver();
        if (strMediaBrowserCompatCustomActionResultReceiver != null && getuids.MediaBrowserCompatItemReceiver() == null) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
            StringBuilder sb = new StringBuilder();
            sb.append(cleverTapInstanceConfig.write());
            sb.append(":async_deviceID");
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(sb.toString(), "Initializing InAppFC with device Id = ".concat(String.valueOf(strMediaBrowserCompatCustomActionResultReceiver)));
            getuids.write(new Rfont(context, cleverTapInstanceConfig, strMediaBrowserCompatCustomActionResultReceiver, simpleBasePlayerPeriodData, lambdaupdatestateandinformlisteners37, istypesupported, onDroppedVideoFrames.IconCompatParcelizer));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(lambdaonAudioAttributesChanged55 lambdaonaudioattributeschanged55) {
        toMagicModuleMetaRepoModel.write(lambdaonaudioattributeschanged55, "");
        lambdaonaudioattributeschanged55.read();
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<Integer> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(((getMutedFromManager) this.AudioAttributesImplApi26Parcelizer).write());
        }

        IconCompatParcelizer(Object obj) {
            super(0, obj, getMutedFromManager.class, "write", "write()I", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<Integer> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(((getMutedFromManager) this.AudioAttributesImplApi26Parcelizer).MediaBrowserCompatCustomActionResultReceiver());
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(0, obj, getMutedFromManager.class, "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatCustomActionResultReceiver()I", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleBasePlayerExternalSyntheticLambda6 IconCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        return SimpleBasePlayerExternalSyntheticLambda6.INSTANCE.read(context, cleverTapInstanceConfig.MediaBrowserCompatItemReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(Context context, getUids getuids, CleverTapInstanceConfig cleverTapInstanceConfig, getChildTimelines getchildtimelines, addAllCommands addallcommands, PlaybackParameters playbackParameters) {
        toMagicModuleMetaRepoModel.write(getuids, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        toMagicModuleMetaRepoModel.write(addallcommands, "");
        toMagicModuleMetaRepoModel.write(playbackParameters, "");
        RemoteActionCompatParcelizer(context, getuids, cleverTapInstanceConfig, getchildtimelines, addallcommands, playbackParameters);
        return getShowPopup.INSTANCE;
    }

    private static void RemoteActionCompatParcelizer(Context p0, getUids p1, CleverTapInstanceConfig p2, getChildTimelines p3, addAllCommands p4, PlaybackParameters p5) {
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = p2.MediaBrowserCompatItemReceiver();
        StringBuilder sb = new StringBuilder();
        sb.append(p2.write());
        sb.append(":async_deviceID");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("Initializing Feature Flags with device Id = ");
        sb2.append(p3.MediaBrowserCompatCustomActionResultReceiver());
        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(string, sb2.toString());
        if (p2.MediaMetadataCompat()) {
            p2.MediaBrowserCompatItemReceiver().IconCompatParcelizer(p2.write(), "Feature Flag is not enabled for this instance");
            return;
        }
        p1.RemoteActionCompatParcelizer(lambdastop12.IconCompatParcelizer(p0, p3.MediaBrowserCompatCustomActionResultReceiver(), p2, p4, p5));
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = p2.MediaBrowserCompatItemReceiver();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(p2.write());
        sb3.append(":async_deviceID");
        rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(sb3.toString(), "Feature Flags initialized");
    }
}
