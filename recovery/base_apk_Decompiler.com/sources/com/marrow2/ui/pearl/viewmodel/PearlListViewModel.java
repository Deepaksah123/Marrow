package com.marrow2.ui.pearl.viewmodel;

import com.marrow.R;
import com.marrow.data.models.subject.Subject;
import com.marrow2.ui.pearl.viewmodel.PearlListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.GmsVersion;
import kotlin.InstallStatusListener;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.StatsEventTypes;
import kotlin.StatsUtils;
import kotlin.TestGroupLSModel;
import kotlin.ThemeState;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.WakeLockEvent;
import kotlin.WakeLockTracker;
import kotlin.getAnswerMap;
import kotlin.getEventKey;
import kotlin.getMagicModuleStats;
import kotlin.getModuleData;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getWrappedCursor;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.readLittleEndianUnsignedShort;
import kotlin.registerDeadlineEvent;
import kotlin.registerEvent;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0012\u0010\u0017J\u001d\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u0012\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e2\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u0015J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\f\u0010\u0017J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u0015J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0017J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0010J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010\u0017J\u000f\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010\u0015J\u000f\u0010'\u001a\u00020\u000bH\u0002¢\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010\u0015JI\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00162 \u0010,\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0+H\u0002¢\u0006\u0004\b\u0012\u0010-R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00104R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u000203058\u0007¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b\f\u00107R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u0018028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u00104R&\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u0018058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b$\u00107R&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180;028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u00104R,\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180;058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b#\u00107R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020?028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u00104R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020?058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\b>\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0016028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u00104R \u0010A\u001a\b\u0012\u0004\u0012\u00020\u0016058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u00107R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020D028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104R \u0010E\u001a\b\u0012\u0004\u0012\u00020D058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u00106\u001a\u0004\b%\u00107R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u0011028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u00104R \u00100\u001a\b\u0012\u0004\u0012\u00020\u0011058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00106\u001a\u0004\bG\u00107R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0018028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u00104R&\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0018058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bH\u00107R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u0016028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u00104R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u0016058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b\u001c\u00107R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u00104R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\bA\u00107R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u0011028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u00104R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u0011058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bF\u00107R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u0011028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u00104R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0011058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u00106\u001a\u0004\b<\u00107R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u00104R \u0010@\u001a\b\u0012\u0004\u0012\u00020M058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00106\u001a\u0004\bE\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0011028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u0011058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b0\u00107R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u0016028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u00104R \u0010J\u001a\b\u0012\u0004\u0012\u00020\u0016058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\b\u000f\u00107R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000e058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u00106R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020P028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u00104R \u0010T\u001a\b\u0012\u0004\u0012\u00020P0Q8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010R\u001a\u0004\b:\u0010S"}, d2 = {"Lcom/marrow2/ui/pearl/viewmodel/PearlListViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/readLittleEndianUnsignedShort;", "p0", "Lo/POJOPropertyBuilder5;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/readLittleEndianUnsignedShort;Lo/POJOPropertyBuilder5;Lo/isSeekPending;)V", "Lo/getEventKey;", "", "read", "(Lo/getEventKey;)V", "", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)V", "", "RemoteActionCompatParcelizer", "(Z)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()V", "", "(I)V", "", "Lo/registerDeadlineEvent;", "(Ljava/util/List;)V", "onPlayFromMediaId", "IconCompatParcelizer", "(II)Z", "", "(I)Ljava/util/List;", "handleMediaPlayPauseIfPendingOnHandler", "write", "onPlay", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "onPrepare", "onFastForward", "onMediaButtonEvent", "onPause", "Lo/registerDeadlineEvent$RemoteActionCompatParcelizer;", "Lkotlin/Function3;", "p3", "(Lo/registerDeadlineEvent$RemoteActionCompatParcelizer;IILo/getModuleData;)V", "onRemoveQueueItem", "Lo/readLittleEndianUnsignedShort;", "onCommand", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/WakeLockEvent;", "Lo/getResolutionSize;", "Lo/isDark;", "Lo/isDark;", "()Lo/isDark;", "Lo/registerEvent;", "onPlayFromSearch", "MediaBrowserCompatItemReceiver", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "MediaBrowserCompatSearchResultReceiver", "onPrepareFromSearch", "MediaBrowserCompatCustomActionResultReceiver", "Lo/WakeLockTracker;", "onPlayFromUri", "MediaBrowserCompatMediaItem", "onPrepareFromUri", "MediaDescriptionCompat", "Lo/getWrappedCursor;", "RatingCompat", "MediaMetadataCompat", "onCustomAction", "onAddQueueItem", "onSetRepeatMode", "onSeekTo", "onRewind", "onSetPlaybackSpeed", "Lo/StatsEventTypes;", "onPrepareFromMediaId", "onRemoveQueueItemAt", "Lo/StatsUtils;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "onSetShuffleMode"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PearlListViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<WakeLockEvent> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<List<registerEvent>> write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Integer> onRemoveQueueItemAt;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> onPrepareFromSearch;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getWrappedCursor> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<WakeLockTracker> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getResolutionSize<Integer> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<registerDeadlineEvent>>> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final isDark<WakeLockEvent> read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getResolutionSize<StatsEventTypes> onPrepareFromMediaId;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private getResolutionSize<StatsUtils> onRemoveQueueItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final getResolutionSize<String> onPlayFromMediaId;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> onMediaButtonEvent;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final getResolutionSize<List<String>> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> onPause;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final isDark<Boolean> onPrepare;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final isDark<getWrappedCursor> RatingCompat;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final isDark<String> onRewind;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final isDark<Boolean> onCommand;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final isDark<Integer> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final isDark<List<registerEvent>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final isDark<WakeLockTracker> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final isDark<Integer> onSeekTo;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final setUpdatedStatus<StatsUtils> onSetShuffleMode;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<List<registerDeadlineEvent>>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final isDark<Integer> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private final readLittleEndianUnsignedShort AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private final isDark<StatsEventTypes> onPlayFromUri;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final isDark<Boolean> onFastForward;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final isDark<String> onPlay;

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private final isDark<Boolean> onPlayFromSearch;

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private final isDark<List<String>> onCustomAction;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<String> onPrepareFromUri;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Integer> onAddQueueItem;

    private static boolean IconCompatParcelizer(int p0, int p1) {
        return p0 > 100 && p1 == -1;
    }

    @setSdkPayload
    public PearlListViewModel(readLittleEndianUnsignedShort readlittleendianunsignedshort, POJOPropertyBuilder5 pOJOPropertyBuilder5, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(readlittleendianunsignedshort, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesCompatParcelizer = readlittleendianunsignedshort;
        this.IconCompatParcelizer = isseekpending;
        WakeLockEvent.Companion companion = WakeLockEvent.INSTANCE;
        getResolutionSize<WakeLockEvent> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(WakeLockEvent.Companion.write(pOJOPropertyBuilder5));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.read = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<List<registerEvent>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<registerDeadlineEvent>>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<WakeLockTracker> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new WakeLockTracker("", true));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(-1);
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<getWrappedCursor> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(new getWrappedCursor(0, 0, 0, 0, 15, null));
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer6;
        this.RatingCompat = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(Boolean.valueOf(getresolutionsizeRemoteActionCompatParcelizer.IconCompatParcelizer().getIconCompatParcelizer()));
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onCommand = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<List<String>> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onCustomAction = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer8);
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer9 = setStartTime.RemoteActionCompatParcelizer(0);
        this.onAddQueueItem = getresolutionsizeRemoteActionCompatParcelizer9;
        this.handleMediaPlayPauseIfPendingOnHandler = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer9);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer10 = setStartTime.RemoteActionCompatParcelizer("");
        this.onPlayFromMediaId = getresolutionsizeRemoteActionCompatParcelizer10;
        this.onPlay = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer10);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer11 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.onPause = getresolutionsizeRemoteActionCompatParcelizer11;
        this.onFastForward = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer11);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer12 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.onMediaButtonEvent = getresolutionsizeRemoteActionCompatParcelizer12;
        this.onPlayFromSearch = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer12);
        getResolutionSize<StatsEventTypes> getresolutionsizeRemoteActionCompatParcelizer13 = setStartTime.RemoteActionCompatParcelizer(new StatsEventTypes(null, null, false, false, false, false, 63, null));
        this.onPrepareFromMediaId = getresolutionsizeRemoteActionCompatParcelizer13;
        this.onPlayFromUri = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer13);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer14 = setStartTime.RemoteActionCompatParcelizer(Boolean.valueOf(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getresolutionsizeRemoteActionCompatParcelizer.IconCompatParcelizer().getAudioAttributesCompatParcelizer(), (Object) Subject.ROOT_PARENT_ID)));
        this.onPrepareFromSearch = getresolutionsizeRemoteActionCompatParcelizer14;
        this.onPrepare = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer14);
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer15 = setStartTime.RemoteActionCompatParcelizer(-1);
        this.onRemoveQueueItemAt = getresolutionsizeRemoteActionCompatParcelizer15;
        this.onSeekTo = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer15);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer16 = setStartTime.RemoteActionCompatParcelizer("");
        this.onPrepareFromUri = getresolutionsizeRemoteActionCompatParcelizer16;
        this.onRewind = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer16);
        getResolutionSize<StatsUtils> getresolutionsizeRemoteActionCompatParcelizer17 = setStartTime.RemoteActionCompatParcelizer(StatsUtils.RemoteActionCompatParcelizer.INSTANCE);
        this.onRemoveQueueItem = getresolutionsizeRemoteActionCompatParcelizer17;
        this.onSetShuffleMode = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer17);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        onPrepare();
    }

    public final isDark<WakeLockEvent> read() {
        return this.read;
    }

    public final isDark<List<registerEvent>> AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<List<registerDeadlineEvent>>> AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final isDark<WakeLockTracker> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final isDark<Integer> MediaDescriptionCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final isDark<getWrappedCursor> AudioAttributesCompatParcelizer() {
        return this.RatingCompat;
    }

    public final isDark<Boolean> onCustomAction() {
        return this.onCommand;
    }

    public final isDark<List<String>> onAddQueueItem() {
        return this.onCustomAction;
    }

    public final isDark<Integer> IconCompatParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final isDark<String> MediaBrowserCompatMediaItem() {
        return this.onPlay;
    }

    public final isDark<Boolean> MediaMetadataCompat() {
        return this.onFastForward;
    }

    public final isDark<Boolean> MediaBrowserCompatSearchResultReceiver() {
        return this.onPlayFromSearch;
    }

    public final isDark<StatsEventTypes> RatingCompat() {
        return this.onPlayFromUri;
    }

    public final isDark<Boolean> onCommand() {
        return this.onPrepare;
    }

    public final isDark<Integer> AudioAttributesImplBaseParcelizer() {
        return this.onSeekTo;
    }

    public final setUpdatedStatus<StatsUtils> MediaBrowserCompatItemReceiver() {
        return this.onSetShuffleMode;
    }

    public final void read(getEventKey p0) throws Exception {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof getEventKey.RemoteActionCompatParcelizer) {
            isSeekPending isseekpending = this.IconCompatParcelizer;
            InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
            getEventKey.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (getEventKey.RemoteActionCompatParcelizer) p0;
            isseekpending.write(InstallStatusListener.write(remoteActionCompatParcelizer.IconCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            read(remoteActionCompatParcelizer.IconCompatParcelizer());
            return;
        }
        if (p0 instanceof getEventKey.AudioAttributesImplBaseParcelizer) {
            write(((getEventKey.AudioAttributesImplBaseParcelizer) p0).write());
            return;
        }
        if (p0 instanceof getEventKey.RatingCompat) {
            write(((getEventKey.RatingCompat) p0).IconCompatParcelizer());
            return;
        }
        if (p0 instanceof getEventKey.MediaBrowserCompatSearchResultReceiver) {
            AudioAttributesImplApi26Parcelizer(((getEventKey.MediaBrowserCompatSearchResultReceiver) p0).RemoteActionCompatParcelizer());
            return;
        }
        if (p0 instanceof getEventKey.MediaMetadataCompat) {
            isSeekPending isseekpending2 = this.IconCompatParcelizer;
            InstallStatusListener installStatusListener2 = InstallStatusListener.INSTANCE;
            isseekpending2.write(InstallStatusListener.write(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getRead()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            AudioAttributesImplApi21Parcelizer(((getEventKey.MediaMetadataCompat) p0).AudioAttributesCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getEventKey.AudioAttributesCompatParcelizer.INSTANCE)) {
            onFastForward();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getEventKey.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            onMediaButtonEvent();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getEventKey.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            onPause();
            return;
        }
        if (p0 instanceof getEventKey.read) {
            getEventKey.read readVar = (getEventKey.read) p0;
            RemoteActionCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), readVar.read(), readVar.IconCompatParcelizer(), readVar.RemoteActionCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getEventKey.MediaBrowserCompatItemReceiver.INSTANCE)) {
            onPlayFromMediaId();
            return;
        }
        if (p0 instanceof getEventKey.write) {
            getEventKey.write writeVar = (getEventKey.write) p0;
            if (writeVar.AudioAttributesCompatParcelizer()) {
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
            RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer());
            return;
        }
        if (p0 instanceof getEventKey.MediaBrowserCompatCustomActionResultReceiver) {
            AudioAttributesImplBaseParcelizer(((getEventKey.MediaBrowserCompatCustomActionResultReceiver) p0).IconCompatParcelizer());
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getEventKey.IconCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.onRemoveQueueItem.write(StatsUtils.RemoteActionCompatParcelizer.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer(String p0) {
        this.onRemoveQueueItem.write(new StatsUtils.AudioAttributesCompatParcelizer(p0));
    }

    private final void RemoteActionCompatParcelizer(boolean p0) {
        if (p0) {
            handleMediaPlayPauseIfPendingOnHandler();
        } else {
            getResolutionSize<WakeLockTracker> getresolutionsize = this.AudioAttributesImplApi21Parcelizer;
            getresolutionsize.write(WakeLockTracker.read(getresolutionsize.IconCompatParcelizer().RemoteActionCompatParcelizer, false));
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
        
            if (((kotlin.NewNumberOtpResendRequest) r11).write(new com.marrow2.ui.pearl.viewmodel.PearlListViewModel.AudioAttributesCompatParcelizer.AnonymousClass4(), r10) == r0) goto L20;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r10.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L88
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L1b:
                int r1 = r10.AudioAttributesCompatParcelizer
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L6f
            L21:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel r11 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.this
                o.getResolutionSize r11 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.AudioAttributesImplApi21Parcelizer(r11)
                java.lang.Object r11 = r11.IconCompatParcelizer()
                java.lang.Number r11 = (java.lang.Number) r11
                int r11 = r11.intValue()
                r1 = -1
                if (r11 != r1) goto L38
                r11 = 0
            L38:
                r1 = r11
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel r11 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.this
                o.readLittleEndianUnsignedShort r4 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.read(r11)
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel r11 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.this
                o.getResolutionSize r11 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.write(r11)
                java.lang.Object r11 = r11.IconCompatParcelizer()
                o.WakeLockEvent r11 = (kotlin.WakeLockEvent) r11
                java.lang.String r5 = r11.getAudioAttributesCompatParcelizer()
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel r11 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.this
                o.getResolutionSize r11 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.AudioAttributesImplApi26Parcelizer(r11)
                java.lang.Object r11 = r11.IconCompatParcelizer()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r6 = r11.booleanValue()
                r9 = r10
                o.SampleVideos r9 = (kotlin.SampleVideos) r9
                r10.AudioAttributesCompatParcelizer = r1
                r10.RemoteActionCompatParcelizer = r3
                java.lang.String r8 = ""
                r7 = r1
                java.lang.Object r11 = r4.AudioAttributesCompatParcelizer(r5, r6, r7, r8, r9)
                if (r11 == r0) goto L8b
            L6f:
                o.NewNumberOtpResendRequest r11 = (kotlin.NewNumberOtpResendRequest) r11
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel$AudioAttributesCompatParcelizer$4 r3 = new com.marrow2.ui.pearl.viewmodel.PearlListViewModel$AudioAttributesCompatParcelizer$4
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel r4 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.this
                r3.<init>()
                o.getValidationToken r3 = (kotlin.getValidationToken) r3
                r4 = r10
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r10.AudioAttributesCompatParcelizer = r1
                r10.RemoteActionCompatParcelizer = r2
                java.lang.Object r10 = r11.write(r3, r4)
                if (r10 != r0) goto L88
                goto L8b
            L88:
                o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
                return r10
            L8b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.viewmodel.PearlListViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlListViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.isAtLeastHoneycomb
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlListViewModel.read(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(PearlListViewModel pearlListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        pearlListViewModel.onPrepareFromUri.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int p0) {
        List<String> listIconCompatParcelizer = IconCompatParcelizer(p0, this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().intValue()) ? IconCompatParcelizer(p0) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer().size() == listIconCompatParcelizer.size()) {
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(listIconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<? extends registerDeadlineEvent> p0) {
        getResolutionSize<List<registerEvent>> getresolutionsize = this.write;
        ArrayList arrayList = new ArrayList();
        for (Object obj : p0) {
            if (obj instanceof registerDeadlineEvent.write) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(GmsVersion.RemoteActionCompatParcelizer((registerDeadlineEvent.write) it.next()));
        }
        getresolutionsize.write(arrayList3);
    }

    private final void onPlayFromMediaId() {
        getResolutionSize<Boolean> getresolutionsize = this.onMediaButtonEvent;
        Boolean bool = Boolean.FALSE;
        getresolutionsize.write(bool);
        this.onPause.write(bool);
    }

    private static List<String> IconCompatParcelizer(int p0) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < p0) {
            int i2 = i + 100;
            if (i2 > p0) {
                i2 = p0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i + 1);
            sb.append(" - ");
            sb.append(i2);
            arrayList.add(sb.toString());
            i = i2;
        }
        return arrayList;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = PearlListViewModel.this.AudioAttributesImplApi21Parcelizer;
                this.IconCompatParcelizer = getresolutionsize2;
                this.AudioAttributesCompatParcelizer = 1;
                Object obj2 = PearlListViewModel.this.AudioAttributesCompatParcelizer.read(this);
                if (obj2 == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = obj2;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getresolutionsize.write(new WakeLockTracker((String) obj, true));
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlListViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.murmurhash3_x86_32
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlListViewModel.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void read(int p0) {
        if (this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().intValue() == p0) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver.write(Integer.valueOf(p0));
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private final void write(boolean p0) {
        this.MediaMetadataCompat.write(Boolean.valueOf(p0));
        if (p0) {
            isSeekPending isseekpending = this.IconCompatParcelizer;
            InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
            isseekpending.write(InstallStatusListener.write(0), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            read(0);
            return;
        }
        read(-1);
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        
            if (((kotlin.NewNumberOtpResendRequest) r6).write(new com.marrow2.ui.pearl.viewmodel.PearlListViewModel.write.AnonymousClass4(), r5) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L59
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L42
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel r6 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.this
                o.readLittleEndianUnsignedShort r6 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.read(r6)
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel r1 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.this
                o.getResolutionSize r1 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.write(r1)
                java.lang.Object r1 = r1.IconCompatParcelizer()
                o.WakeLockEvent r1 = (kotlin.WakeLockEvent) r1
                java.lang.String r1 = r1.getAudioAttributesCompatParcelizer()
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.IconCompatParcelizer = r3
                java.lang.Object r6 = r6.read(r1, r4)
                if (r6 == r0) goto L5c
            L42:
                o.NewNumberOtpResendRequest r6 = (kotlin.NewNumberOtpResendRequest) r6
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel$write$4 r1 = new com.marrow2.ui.pearl.viewmodel.PearlListViewModel$write$4
                com.marrow2.ui.pearl.viewmodel.PearlListViewModel r3 = com.marrow2.ui.pearl.viewmodel.PearlListViewModel.this
                r1.<init>()
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r5.IconCompatParcelizer = r2
                java.lang.Object r5 = r6.write(r1, r3)
                if (r5 != r0) goto L59
                goto L5c
            L59:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L5c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.viewmodel.PearlListViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlListViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onPlay() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.isAtLeastIceCreamSandwich
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlListViewModel.AudioAttributesCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void write(int p0) throws Exception {
        AudioAttributesCompatParcelizer(p0);
        int i = p0 / 100;
        if (i != this.onAddQueueItem.IconCompatParcelizer().intValue()) {
            this.onAddQueueItem.write(Integer.valueOf(i));
        }
    }

    private final void AudioAttributesImplApi26Parcelizer(String p0) {
        this.onAddQueueItem.write(Integer.valueOf(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer().indexOf(p0)));
        this.onRemoveQueueItemAt.write(Integer.valueOf(Integer.parseInt((String) IntermediateLoginResponseBody.RatingCompat(TestGroupLSModel.write(p0, new String[]{" - "}, 0, 6))) - 1));
    }

    private final void AudioAttributesImplApi21Parcelizer(String p0) {
        this.onPlayFromMediaId.write(p0);
        this.onMediaButtonEvent.write(Boolean.FALSE);
    }

    private final void AudioAttributesCompatParcelizer(int p0) throws Exception {
        String strRemoteActionCompatParcelizer;
        List<registerDeadlineEvent> list = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().read();
        if (list.isEmpty() || list.size() <= p0 || p0 == -1) {
            return;
        }
        registerDeadlineEvent registerdeadlineevent = list.get(p0);
        if (registerdeadlineevent instanceof registerDeadlineEvent.write) {
            strRemoteActionCompatParcelizer = ((registerDeadlineEvent.write) registerdeadlineevent).read();
        } else {
            if (!(registerdeadlineevent instanceof registerDeadlineEvent.RemoteActionCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            strRemoteActionCompatParcelizer = ((registerDeadlineEvent.RemoteActionCompatParcelizer) registerdeadlineevent).RemoteActionCompatParcelizer();
        }
        AudioAttributesImplApi21Parcelizer(strRemoteActionCompatParcelizer);
    }

    private final void onPrepare() {
        StatsEventTypes statsEventTypes;
        if (this.onPrepareFromSearch.IconCompatParcelizer().booleanValue()) {
            statsEventTypes = new StatsEventTypes(null, Integer.valueOf(R.string.title_all_pearls), false, true, true, true, 1, null);
        } else {
            statsEventTypes = new StatsEventTypes(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getRead(), null, true, false, true, false, 2, null);
        }
        if (this.RemoteActionCompatParcelizer.IconCompatParcelizer().getIconCompatParcelizer()) {
            this.MediaBrowserCompatSearchResultReceiver.write(0);
        } else {
            this.MediaBrowserCompatSearchResultReceiver.write(-1);
        }
        this.onPrepareFromMediaId.write(statsEventTypes);
    }

    private final void onFastForward() {
        this.onMediaButtonEvent.write(Boolean.FALSE);
        this.onPause.write(Boolean.valueOf(!r0.IconCompatParcelizer().booleanValue()));
        if (this.onPause.IconCompatParcelizer().booleanValue()) {
            onPlay();
        }
    }

    private final void onMediaButtonEvent() {
        this.onPause.write(Boolean.FALSE);
        this.onMediaButtonEvent.write(Boolean.valueOf(!r2.IconCompatParcelizer().booleanValue()));
    }

    private final void onPause() {
        getResolutionSize<Boolean> getresolutionsize = this.onPause;
        Boolean bool = Boolean.FALSE;
        getresolutionsize.write(bool);
        this.onMediaButtonEvent.write(bool);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ registerDeadlineEvent.RemoteActionCompatParcelizer IconCompatParcelizer;
        private /* synthetic */ getModuleData<String, Integer, String, getShowPopup> RemoteActionCompatParcelizer;
        private /* synthetic */ int read;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = PearlListViewModel.this.IconCompatParcelizer;
                InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
                isseekpending.write(InstallStatusListener.IconCompatParcelizer(this.read), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.AudioAttributesCompatParcelizer = 1;
                obj = PearlListViewModel.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer.read(), this.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.read(), QBankStatsResponse.RemoteActionCompatParcelizer(this.write), null);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(int i, registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getModuleData<? super String, ? super Integer, ? super String, getShowPopup> getmoduledata, int i2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = i;
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = getmoduledata;
            this.write = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlListViewModel.this.new IconCompatParcelizer(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(final registerDeadlineEvent.RemoteActionCompatParcelizer p0, int p1, final int p2, final getModuleData<? super String, ? super Integer, ? super String, getShowPopup> p3) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(p1, p0, p3, p2, null), new MagicModuleSubmissionRequestBody() { // from class: o.MurmurHash3
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlListViewModel.write(p3, p0, p2, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getModuleData getmoduledata, registerDeadlineEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        getmoduledata.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.read(), Integer.valueOf(i), str);
        return getShowPopup.INSTANCE;
    }
}
