package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes.dex */
public final class PlaylistTimeline {
    private final lambdaonAudioAttributesChanged55 AudioAttributesCompatParcelizer;
    private final getUids AudioAttributesImplApi21Parcelizer;
    private final addAllCommands AudioAttributesImplApi26Parcelizer;
    private final getPeriodIndexFromWindowPosition AudioAttributesImplBaseParcelizer;
    private final copyWithPlaybackState IconCompatParcelizer;
    private final copyWithPlaceholderTimeline MediaBrowserCompatCustomActionResultReceiver;
    private final CleverTapInstanceConfig MediaBrowserCompatItemReceiver;
    private final handleSetVideoOutput MediaBrowserCompatMediaItem;
    private final lambdasetTrackSelectionParameters14 MediaBrowserCompatSearchResultReceiver;
    private final lambdaupdateStateAndInformListeners37 MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final getChildTimelines MediaDescriptionCompat;
    private final lambdaprepare7 MediaMetadataCompat;
    private final isTypeSupported RatingCompat;
    private final lambdasetVideoSurface17 RemoteActionCompatParcelizer;
    private final PlayerDiscontinuityReason handleMediaPlayPauseIfPendingOnHandler;
    private final setPlaylist onAddQueueItem;
    private final lambdaupdateStateAndInformListeners45 onCommand;
    private final r8lambda3EoLwxJB4A25pAog2xOLUUC2nk onCustomAction;
    private final RendererCapabilitiesCapabilities onFastForward;
    private final getTrackSupport onMediaButtonEvent;
    private final getContentResumeOffsetUs onPause;
    private final getVolumeFromManager onPlay;
    private final lambdaonCues51 onPlayFromMediaId;
    private final lambdaonAudioCodecError11 onPlayFromSearch;
    private final RendererCapabilitiesTunnelingSupport onPlayFromUri;
    private final lambdaonCues52 onPrepare;
    private final handleRelease onPrepareFromMediaId;
    private final SimpleBasePlayerPeriodData onPrepareFromSearch;
    private final PlaybackParameters read;
    private final PlayerListener write;

    public PlaylistTimeline(PlayerDiscontinuityReason playerDiscontinuityReason, CleverTapInstanceConfig cleverTapInstanceConfig, copyWithPlaceholderTimeline copywithplaceholdertimeline, lambdaprepare7 lambdaprepare7Var, getChildTimelines getchildtimelines, lambdasetTrackSelectionParameters14 lambdasettrackselectionparameters14, r8lambda3EoLwxJB4A25pAog2xOLUUC2nk r8lambda3eolwxjb4a25paog2xoluuc2nk, copyWithPlaybackState copywithplaybackstate, PlaybackParameters playbackParameters, lambdasetVideoSurface17 lambdasetvideosurface17, PlayerListener playerListener, addAllCommands addallcommands, getUids getuids, lambdaupdateStateAndInformListeners45 lambdaupdatestateandinformlisteners45, handleSetVideoOutput handlesetvideooutput, lambdaupdateStateAndInformListeners37 lambdaupdatestateandinformlisteners37, setPlaylist setplaylist, RendererCapabilitiesTunnelingSupport rendererCapabilitiesTunnelingSupport, lambdaonAudioCodecError11 lambdaonaudiocodecerror11, getTrackSupport gettracksupport, getVolumeFromManager getvolumefrommanager, getContentResumeOffsetUs getcontentresumeoffsetus, lambdaonCues52 lambdaoncues52, lambdaonCues51 lambdaoncues51, getPeriodIndexFromWindowPosition getperiodindexfromwindowposition, SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, handleRelease handlerelease, RendererCapabilitiesCapabilities rendererCapabilitiesCapabilities, lambdaonAudioAttributesChanged55 lambdaonaudioattributeschanged55, isTypeSupported istypesupported) {
        toMagicModuleMetaRepoModel.write(playerDiscontinuityReason, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(copywithplaceholdertimeline, "");
        toMagicModuleMetaRepoModel.write(lambdaprepare7Var, "");
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        toMagicModuleMetaRepoModel.write(lambdasettrackselectionparameters14, "");
        toMagicModuleMetaRepoModel.write(r8lambda3eolwxjb4a25paog2xoluuc2nk, "");
        toMagicModuleMetaRepoModel.write(copywithplaybackstate, "");
        toMagicModuleMetaRepoModel.write(playbackParameters, "");
        toMagicModuleMetaRepoModel.write(lambdasetvideosurface17, "");
        toMagicModuleMetaRepoModel.write(playerListener, "");
        toMagicModuleMetaRepoModel.write(addallcommands, "");
        toMagicModuleMetaRepoModel.write(getuids, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners45, "");
        toMagicModuleMetaRepoModel.write(handlesetvideooutput, "");
        toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners37, "");
        toMagicModuleMetaRepoModel.write(setplaylist, "");
        toMagicModuleMetaRepoModel.write(rendererCapabilitiesTunnelingSupport, "");
        toMagicModuleMetaRepoModel.write(lambdaonaudiocodecerror11, "");
        toMagicModuleMetaRepoModel.write(gettracksupport, "");
        toMagicModuleMetaRepoModel.write(getvolumefrommanager, "");
        toMagicModuleMetaRepoModel.write(getcontentresumeoffsetus, "");
        toMagicModuleMetaRepoModel.write(lambdaoncues52, "");
        toMagicModuleMetaRepoModel.write(lambdaoncues51, "");
        toMagicModuleMetaRepoModel.write(getperiodindexfromwindowposition, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerPeriodData, "");
        toMagicModuleMetaRepoModel.write(handlerelease, "");
        toMagicModuleMetaRepoModel.write(rendererCapabilitiesCapabilities, "");
        toMagicModuleMetaRepoModel.write(lambdaonaudioattributeschanged55, "");
        toMagicModuleMetaRepoModel.write(istypesupported, "");
        this.handleMediaPlayPauseIfPendingOnHandler = playerDiscontinuityReason;
        this.MediaBrowserCompatItemReceiver = cleverTapInstanceConfig;
        this.MediaBrowserCompatCustomActionResultReceiver = copywithplaceholdertimeline;
        this.MediaMetadataCompat = lambdaprepare7Var;
        this.MediaDescriptionCompat = getchildtimelines;
        this.MediaBrowserCompatSearchResultReceiver = lambdasettrackselectionparameters14;
        this.onCustomAction = r8lambda3eolwxjb4a25paog2xoluuc2nk;
        this.IconCompatParcelizer = copywithplaybackstate;
        this.read = playbackParameters;
        this.RemoteActionCompatParcelizer = lambdasetvideosurface17;
        this.write = playerListener;
        this.AudioAttributesImplApi26Parcelizer = addallcommands;
        this.AudioAttributesImplApi21Parcelizer = getuids;
        this.onCommand = lambdaupdatestateandinformlisteners45;
        this.MediaBrowserCompatMediaItem = handlesetvideooutput;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = lambdaupdatestateandinformlisteners37;
        this.onAddQueueItem = setplaylist;
        this.onPlayFromUri = rendererCapabilitiesTunnelingSupport;
        this.onPlayFromSearch = lambdaonaudiocodecerror11;
        this.onMediaButtonEvent = gettracksupport;
        this.onPlay = getvolumefrommanager;
        this.onPause = getcontentresumeoffsetus;
        this.onPrepare = lambdaoncues52;
        this.onPlayFromMediaId = lambdaoncues51;
        this.AudioAttributesImplBaseParcelizer = getperiodindexfromwindowposition;
        this.onPrepareFromSearch = simpleBasePlayerPeriodData;
        this.onPrepareFromMediaId = handlerelease;
        this.onFastForward = rendererCapabilitiesCapabilities;
        this.AudioAttributesCompatParcelizer = lambdaonaudioattributeschanged55;
        this.RatingCompat = istypesupported;
    }

    public final CleverTapInstanceConfig AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final copyWithPlaceholderTimeline AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final getChildTimelines AudioAttributesImplApi21Parcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final r8lambda3EoLwxJB4A25pAog2xOLUUC2nk MediaBrowserCompatSearchResultReceiver() {
        return this.onCustomAction;
    }

    public final copyWithPlaybackState AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final PlaybackParameters RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final lambdasetVideoSurface17 IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final PlayerListener write() {
        return this.write;
    }

    public final addAllCommands read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final getUids MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final lambdaupdateStateAndInformListeners45 RatingCompat() {
        return this.onCommand;
    }

    public final handleSetVideoOutput MediaMetadataCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final lambdaupdateStateAndInformListeners37 MediaDescriptionCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final setPlaylist onCustomAction() {
        return this.onAddQueueItem;
    }

    public final RendererCapabilitiesTunnelingSupport onCommand() {
        return this.onPlayFromUri;
    }

    public final getContentResumeOffsetUs MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onPause;
    }

    public final getPeriodIndexFromWindowPosition MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final SimpleBasePlayerPeriodData onAddQueueItem() {
        return this.onPrepareFromSearch;
    }

    public final isTypeSupported MediaBrowserCompatMediaItem() {
        return this.RatingCompat;
    }
}
