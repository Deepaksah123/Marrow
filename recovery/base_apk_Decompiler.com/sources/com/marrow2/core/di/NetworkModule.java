package com.marrow2.core.di;

import com.marrow2.data.mcq.remote.McqService;
import kotlin.CodecSpecificDataUtil;
import kotlin.EGLSurfaceTextureSecureMode;
import kotlin.GlProgram;
import kotlin.InterfaceC0166createEglContext;
import kotlin.LoadErrorHandlingPolicyFallbackOptions;
import kotlin.Metadata;
import kotlin.ResolvingDataSourceResolver;
import kotlin.ThemeKtExternalSyntheticLambda3;
import kotlin.TrackSelectionViewTrackInfo;
import kotlin.buildNalUnit;
import kotlin.chooseEGLConfig;
import kotlin.convertAlignmentToCss;
import kotlin.createCacheDirectories;
import kotlin.focusPlaceholderEglSurface;
import kotlin.getBinder;
import kotlin.getBytesRead;
import kotlin.getKeyForId;
import kotlin.getPlanOldPrice;
import kotlin.isReadingFromCache;
import kotlin.r8lambda9q_is_UzaTpbA9Go4su0OSFqF4M;
import kotlin.readContentMetadata;
import kotlin.removeValues;
import kotlin.setBufferSize;
import kotlin.setSlidingWindowMaxWeight;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateInPlace;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u0002092\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020?2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bC\u0010DJ\u001f\u00101\u001a\u00020G2\u0006\u0010\u0005\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010H"}, d2 = {"Lcom/marrow2/core/di/NetworkModule;", "", "<init>", "()V", "Lo/TrackSelectionViewTrackInfo;", "p0", "Lo/GlProgram;", "handleMediaPlayPauseIfPendingOnHandler", "(Lo/TrackSelectionViewTrackInfo;)Lo/GlProgram;", "Lo/focusPlaceholderEglSurface;", "onFastForward", "(Lo/TrackSelectionViewTrackInfo;)Lo/focusPlaceholderEglSurface;", "Lo/buildNalUnit;", "onCustomAction", "(Lo/TrackSelectionViewTrackInfo;)Lo/buildNalUnit;", "Lcom/marrow2/data/mcq/remote/McqService;", "write", "(Lo/TrackSelectionViewTrackInfo;)Lcom/marrow2/data/mcq/remote/McqService;", "Lo/getBytesRead;", "MediaBrowserCompatItemReceiver", "(Lo/TrackSelectionViewTrackInfo;)Lo/getBytesRead;", "Lo/removeValues;", "MediaMetadataCompat", "(Lo/TrackSelectionViewTrackInfo;)Lo/removeValues;", "Lo/LoadErrorHandlingPolicyFallbackOptions;", "IconCompatParcelizer", "(Lo/TrackSelectionViewTrackInfo;)Lo/LoadErrorHandlingPolicyFallbackOptions;", "Lo/createEglContext;", "AudioAttributesCompatParcelizer", "(Lo/TrackSelectionViewTrackInfo;)Lo/createEglContext;", "Lo/setBufferSize;", "AudioAttributesImplApi26Parcelizer", "(Lo/TrackSelectionViewTrackInfo;)Lo/setBufferSize;", "Lo/setSlidingWindowMaxWeight;", "read", "(Lo/TrackSelectionViewTrackInfo;)Lo/setSlidingWindowMaxWeight;", "Lo/EGLSurfaceTextureSecureMode;", "onCommand", "(Lo/TrackSelectionViewTrackInfo;)Lo/EGLSurfaceTextureSecureMode;", "Lo/CodecSpecificDataUtil;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "(Lo/TrackSelectionViewTrackInfo;)Lo/CodecSpecificDataUtil;", "Lo/createCacheDirectories;", "RatingCompat", "(Lo/TrackSelectionViewTrackInfo;)Lo/createCacheDirectories;", "Lo/chooseEGLConfig;", "onAddQueueItem", "(Lo/TrackSelectionViewTrackInfo;)Lo/chooseEGLConfig;", "Lo/r8lambda9q_is_UzaTpbA9Go4su0OSFqF4M;", "RemoteActionCompatParcelizer", "(Lo/TrackSelectionViewTrackInfo;)Lo/r8lambda9q_is_UzaTpbA9Go4su0OSFqF4M;", "Lo/getBinder;", "MediaBrowserCompatSearchResultReceiver", "(Lo/TrackSelectionViewTrackInfo;)Lo/getBinder;", "Lo/updateInPlace;", "MediaDescriptionCompat", "(Lo/TrackSelectionViewTrackInfo;)Lo/updateInPlace;", "Lo/isReadingFromCache;", "AudioAttributesImplApi21Parcelizer", "(Lo/TrackSelectionViewTrackInfo;)Lo/isReadingFromCache;", "Lo/readContentMetadata;", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/TrackSelectionViewTrackInfo;)Lo/readContentMetadata;", "Lo/getKeyForId;", "MediaBrowserCompatMediaItem", "(Lo/TrackSelectionViewTrackInfo;)Lo/getKeyForId;", "Lo/ResolvingDataSourceResolver;", "AudioAttributesImplBaseParcelizer", "(Lo/TrackSelectionViewTrackInfo;)Lo/ResolvingDataSourceResolver;", "Lo/convertAlignmentToCss;", "p1", "Lo/ThemeKtExternalSyntheticLambda3;", "(Lo/convertAlignmentToCss;Lo/TrackSelectionViewTrackInfo;)Lo/ThemeKtExternalSyntheticLambda3;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkModule {
    public final GlProgram handleMediaPlayPauseIfPendingOnHandler(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.onFastForward();
    }

    public final focusPlaceholderEglSurface onFastForward(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.onPlay();
    }

    public final buildNalUnit onCustomAction(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.onPlayFromMediaId();
    }

    public final McqService write(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.RatingCompat();
    }

    public final getBytesRead MediaBrowserCompatItemReceiver(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.AudioAttributesImplBaseParcelizer();
    }

    public final removeValues MediaMetadataCompat(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.MediaMetadataCompat();
    }

    public final LoadErrorHandlingPolicyFallbackOptions IconCompatParcelizer(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.AudioAttributesImplApi26Parcelizer();
    }

    public final InterfaceC0166createEglContext AudioAttributesCompatParcelizer(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.MediaBrowserCompatItemReceiver();
    }

    public final setBufferSize AudioAttributesImplApi26Parcelizer(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final setSlidingWindowMaxWeight read(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.write();
    }

    public final EGLSurfaceTextureSecureMode onCommand(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.onPause();
    }

    public final CodecSpecificDataUtil MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.onCommand();
    }

    public final createCacheDirectories RatingCompat(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.handleMediaPlayPauseIfPendingOnHandler();
    }

    public final chooseEGLConfig onAddQueueItem(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.onMediaButtonEvent();
    }

    public final r8lambda9q_is_UzaTpbA9Go4su0OSFqF4M RemoteActionCompatParcelizer(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.AudioAttributesCompatParcelizer();
    }

    public final getBinder MediaBrowserCompatSearchResultReceiver(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    public final updateInPlace MediaDescriptionCompat(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.onAddQueueItem();
    }

    public final isReadingFromCache AudioAttributesImplApi21Parcelizer(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.MediaBrowserCompatMediaItem();
    }

    public final readContentMetadata MediaBrowserCompatCustomActionResultReceiver(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.MediaDescriptionCompat();
    }

    public final getKeyForId MediaBrowserCompatMediaItem(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.MediaBrowserCompatSearchResultReceiver();
    }

    public final ResolvingDataSourceResolver AudioAttributesImplBaseParcelizer(TrackSelectionViewTrackInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.AudioAttributesImplApi21Parcelizer();
    }

    @getPlanOldPrice
    public final ThemeKtExternalSyntheticLambda3 RemoteActionCompatParcelizer(convertAlignmentToCss p0, TrackSelectionViewTrackInfo p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer().IconCompatParcelizer(p1.read()).IconCompatParcelizer(p1.onCustomAction()).IconCompatParcelizer(p0).IconCompatParcelizer(p1.IconCompatParcelizer()).RemoteActionCompatParcelizer();
    }
}
