package com.marrow2.ui.recent_updates;

import com.marrow2.ui.recent_updates.RecentUpdatesViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AndroidUtilsLight;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TimedValueQueue;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.blockUntilFinished;
import kotlin.blockUntilStarted;
import kotlin.getAnswerMap;
import kotlin.getElapsedRealtimeOffsetMs;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isCancelled;
import kotlin.isSeekPending;
import kotlin.listIterator;
import kotlin.ptsToUs;
import kotlin.readLittleEndianUnsignedShort;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zzfx;
import kotlin.zzhb;
import kotlin.zzhd;
import kotlin.zzhi;
import kotlin.zzhj;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJG\u0010\u0017\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00152\u001a\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001dJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u001dR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020(0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\"\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b1\u0010.R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R&\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203020+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b0\u0010.R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010*R&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206020+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b\u0017\u0010.R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010*R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b\u001b\u0010.R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00150'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b/\u0010.R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010*R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b)\u0010.R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b5\u0010.R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R \u00109\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b8\u0010.R\u0016\u0010\u001e\u001a\u00020=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010>"}, d2 = {"Lcom/marrow2/ui/recent_updates/RecentUpdatesViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/blockUntilFinished;", "p0", "Lo/readLittleEndianUnsignedShort;", "p1", "Lo/TimedValueQueue;", "p2", "Lo/isSeekPending;", "p3", "<init>", "(Lo/blockUntilFinished;Lo/readLittleEndianUnsignedShort;Lo/TimedValueQueue;Lo/isSeekPending;)V", "", "RatingCompat", "()V", "", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Integer;Ljava/lang/String;)V", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "", "Lkotlin/Function2;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;ZLo/MagicModuleSubmissionRequestBody;)V", "MediaBrowserCompatMediaItem", "Lo/listIterator;", "AudioAttributesCompatParcelizer", "(Lo/listIterator;)V", "(Ljava/lang/String;)V", "onFastForward", "Lo/blockUntilFinished;", "onAddQueueItem", "Lo/readLittleEndianUnsignedShort;", "read", "onMediaButtonEvent", "Lo/TimedValueQueue;", "write", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/zzhd;", "AudioAttributesImplApi21Parcelizer", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "onCustomAction", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "", "Lo/zzhb;", "onPlayFromMediaId", "AudioAttributesImplApi26Parcelizer", "Lo/zzhj;", "onCommand", "MediaMetadataCompat", "onPause", "handleMediaPlayPauseIfPendingOnHandler", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onPlay", "", "J"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecentUpdatesViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<zzhd> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Integer> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaMetadataCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> onMediaButtonEvent;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getResolutionSize<List<zzhj>> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getResolutionSize<String> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getResolutionSize<List<zzhb>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onCustomAction;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onPause;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onPlayFromMediaId;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> onPlay;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onAddQueueItem;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final readLittleEndianUnsignedShort read;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final setUpdatedStatus<List<zzhj>> RatingCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final setUpdatedStatus<zzhd> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final blockUntilFinished RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final TimedValueQueue write;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final setUpdatedStatus<Integer> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private long onFastForward;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final setUpdatedStatus<List<zzhb>> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> onCommand;

    @setSdkPayload
    public RecentUpdatesViewModel(blockUntilFinished blockuntilfinished, readLittleEndianUnsignedShort readlittleendianunsignedshort, TimedValueQueue timedValueQueue, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(blockuntilfinished, "");
        toMagicModuleMetaRepoModel.write(readlittleendianunsignedshort, "");
        toMagicModuleMetaRepoModel.write(timedValueQueue, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.RemoteActionCompatParcelizer = blockuntilfinished;
        this.read = readlittleendianunsignedshort;
        this.write = timedValueQueue;
        this.IconCompatParcelizer = isseekpending;
        getResolutionSize<zzhd> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(zzhd.write.INSTANCE);
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<List<zzhb>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<List<zzhj>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer4;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        this.MediaMetadataCompat = setStartTime.RemoteActionCompatParcelizer(null);
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(-1);
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        this.handleMediaPlayPauseIfPendingOnHandler = setStartTime.RemoteActionCompatParcelizer(null);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onCustomAction = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.onCommand = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.onMediaButtonEvent = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onPlayFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer8);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer9 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.onPlay = getresolutionsizeRemoteActionCompatParcelizer9;
        this.onPause = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer9);
        this.onFastForward = System.currentTimeMillis();
        MediaBrowserCompatMediaItem();
        RatingCompat();
    }

    public final setUpdatedStatus<zzhd> read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<List<zzhb>> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<List<zzhj>> IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public final setUpdatedStatus<Integer> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer() {
        return this.onCustomAction;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer() {
        return this.onAddQueueItem;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer() {
        return this.onPlayFromMediaId;
    }

    public final setUpdatedStatus<Boolean> MediaMetadataCompat() {
        return this.onPause;
    }

    private final void RatingCompat() {
        this.onCommand.write(Boolean.TRUE);
        IconCompatParcelizer(null, null, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzfh
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdatesViewModel.write(this.IconCompatParcelizer, (Integer) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(RecentUpdatesViewModel recentUpdatesViewModel, Integer num, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        recentUpdatesViewModel.onCommand.write(Boolean.FALSE);
        recentUpdatesViewModel.RemoteActionCompatParcelizer(num, str);
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(Integer p0, String p1) {
        if (p0 != null) {
            this.AudioAttributesCompatParcelizer.write(new zzhd.read(p1));
        }
    }

    private final void MediaDescriptionCompat() {
        this.onCommand.write(Boolean.TRUE);
        IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(), null, false, new MagicModuleSubmissionRequestBody() { // from class: o.zzfg
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdatesViewModel.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer, (Integer) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(RecentUpdatesViewModel recentUpdatesViewModel, Integer num, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        recentUpdatesViewModel.onCommand.write(Boolean.FALSE);
        recentUpdatesViewModel.RemoteActionCompatParcelizer(num, str);
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        if (this.onMediaButtonEvent.IconCompatParcelizer().booleanValue() || this.MediaMetadataCompat.IconCompatParcelizer() == null) {
            return;
        }
        this.onMediaButtonEvent.write(Boolean.TRUE);
        IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(), this.MediaMetadataCompat.IconCompatParcelizer(), true, new MagicModuleSubmissionRequestBody() { // from class: o.zzfp
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdatesViewModel.IconCompatParcelizer(this.write, (Integer) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(RecentUpdatesViewModel recentUpdatesViewModel, Integer num, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        recentUpdatesViewModel.onMediaButtonEvent.write(Boolean.FALSE);
        recentUpdatesViewModel.RemoteActionCompatParcelizer(num, str);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> read;
        private /* synthetic */ boolean write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                obj = RecentUpdatesViewModel.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getElapsedRealtimeOffsetMs getelapsedrealtimeoffsetms = (getElapsedRealtimeOffsetMs) obj;
            if (this.write) {
                getResolutionSize getresolutionsize = RecentUpdatesViewModel.this.MediaBrowserCompatMediaItem;
                List listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) RecentUpdatesViewModel.this.MediaBrowserCompatMediaItem.IconCompatParcelizer());
                List<isCancelled> list = getelapsedrealtimeoffsetms.read();
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzhi.AudioAttributesCompatParcelizer((isCancelled) it.next()));
                }
                listMediaBrowserCompatItemReceiver.addAll(arrayList);
                getresolutionsize.write(listMediaBrowserCompatItemReceiver);
            } else {
                List<zzhj> listWrite = zzhi.write(getelapsedrealtimeoffsetms.read());
                RecentUpdatesViewModel.this.MediaBrowserCompatMediaItem.write(listWrite);
                RecentUpdatesViewModel.this.onPlay.write(QBankStatsResponse.AudioAttributesCompatParcelizer(listWrite.isEmpty()));
            }
            RecentUpdatesViewModel.this.MediaMetadataCompat.write(getelapsedrealtimeoffsetms.RemoteActionCompatParcelizer());
            this.read.invoke(null, "");
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(String str, String str2, boolean z, MagicModuleSubmissionRequestBody<? super Integer, ? super String, getShowPopup> magicModuleSubmissionRequestBody, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = str2;
            this.write = z;
            this.read = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RecentUpdatesViewModel.this.new read(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(String p0, String p1, boolean p2, final MagicModuleSubmissionRequestBody<? super Integer, ? super String, getShowPopup> p3) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p1, p0, p2, p3, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzfj
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdatesViewModel.read(p3, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        magicModuleSubmissionRequestBody.invoke(Integer.valueOf(i), str);
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = RecentUpdatesViewModel.this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesCompatParcelizer = getresolutionsize2;
                this.write = 1;
                Object objRemoteActionCompatParcelizer = RecentUpdatesViewModel.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
                if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                getresolutionsize = getresolutionsize2;
                obj = objRemoteActionCompatParcelizer;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable<blockUntilStarted> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            for (blockUntilStarted blockuntilstarted : iterable) {
                arrayList.add(new zzhb(blockuntilstarted.IconCompatParcelizer(), blockuntilstarted.write()));
            }
            getresolutionsize.write(arrayList);
            RecentUpdatesViewModel.this.MediaDescriptionCompat.write(QBankStatsResponse.RemoteActionCompatParcelizer(0));
            RecentUpdatesViewModel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RecentUpdatesViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzfi
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdatesViewModel.IconCompatParcelizer(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(RecentUpdatesViewModel recentUpdatesViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        recentUpdatesViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(Boolean.FALSE);
        recentUpdatesViewModel.AudioAttributesCompatParcelizer.write(new zzhd.read(str));
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(listIterator p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof listIterator.RemoteActionCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.write(zzhd.write.INSTANCE);
            return;
        }
        if (p0 instanceof listIterator.read) {
            this.MediaBrowserCompatItemReceiver.write(Boolean.valueOf(!r2.IconCompatParcelizer().booleanValue()));
            return;
        }
        if (p0 instanceof listIterator.AudioAttributesCompatParcelizer) {
            listIterator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (listIterator.AudioAttributesCompatParcelizer) p0;
            if (this.MediaDescriptionCompat.IconCompatParcelizer().intValue() == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                return;
            }
            this.MediaBrowserCompatItemReceiver.write(Boolean.FALSE);
            this.MediaDescriptionCompat.write(Integer.valueOf(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()));
            this.handleMediaPlayPauseIfPendingOnHandler.write(audioAttributesCompatParcelizer.write());
            MediaDescriptionCompat();
            return;
        }
        if (p0 instanceof listIterator.write) {
            this.onCommand.write(Boolean.FALSE);
            return;
        }
        if (p0 instanceof listIterator.IconCompatParcelizer) {
            MediaBrowserCompatSearchResultReceiver();
            return;
        }
        if (p0 instanceof listIterator.AudioAttributesImplBaseParcelizer) {
            AudioAttributesCompatParcelizer(((listIterator.AudioAttributesImplBaseParcelizer) p0).AudioAttributesCompatParcelizer());
            return;
        }
        if (p0 instanceof listIterator.MediaBrowserCompatItemReceiver) {
            RemoteActionCompatParcelizer(((listIterator.MediaBrowserCompatItemReceiver) p0).write());
        } else {
            if (!(p0 instanceof listIterator.AudioAttributesImplApi26Parcelizer)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending = this.IconCompatParcelizer;
            zzfx zzfxVar = zzfx.INSTANCE;
            isseekpending.write(zzfx.IconCompatParcelizer(((listIterator.AudioAttributesImplApi26Parcelizer) p0).RemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = RecentUpdatesViewModel.this.write.IconCompatParcelizer(this.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            RecentUpdatesViewModel.this.AudioAttributesCompatParcelizer.write(new zzhd.IconCompatParcelizer(((ptsToUs) IntermediateLoginResponseBody.RatingCompat((List) obj)).getWrite()));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RecentUpdatesViewModel.this.new RemoteActionCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(String p0) {
        this.onCommand.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzfk
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdatesViewModel.write(this.write, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(RecentUpdatesViewModel recentUpdatesViewModel, int i, String str) {
        zzhd.read readVar;
        toMagicModuleMetaRepoModel.write(str, "");
        recentUpdatesViewModel.onCommand.write(Boolean.FALSE);
        getResolutionSize<zzhd> getresolutionsize = recentUpdatesViewModel.AudioAttributesCompatParcelizer;
        if (1409 == i) {
            readVar = zzhd.AudioAttributesCompatParcelizer.INSTANCE;
        } else {
            readVar = new zzhd.read(str);
        }
        getresolutionsize.write(readVar);
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = RecentUpdatesViewModel.this.read.IconCompatParcelizer(this.write, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            AndroidUtilsLight androidUtilsLight = (AndroidUtilsLight) obj;
            if (androidUtilsLight != null) {
                RecentUpdatesViewModel.this.AudioAttributesCompatParcelizer.write(new zzhd.RemoteActionCompatParcelizer(androidUtilsLight.AudioAttributesCompatParcelizer()));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RecentUpdatesViewModel.this.new write(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(String p0) {
        this.onCommand.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzfb
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdatesViewModel.write(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(RecentUpdatesViewModel recentUpdatesViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        recentUpdatesViewModel.onCommand.write(Boolean.FALSE);
        recentUpdatesViewModel.AudioAttributesCompatParcelizer.write(new zzhd.read(str));
        return getShowPopup.INSTANCE;
    }
}
