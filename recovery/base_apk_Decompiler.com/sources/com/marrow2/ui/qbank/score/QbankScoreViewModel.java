package com.marrow2.ui.qbank.score;

import android.os.Process;
import com.marrow2.ui.qbank.score.QbankScoreViewModel;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.C0272zzbl;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.ContentDataSourceContentDataSourceException;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.ParsableNalUnitBitArray;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SurfaceInfo;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAlgorithmIdAsInteger;
import kotlin.getAnswerMap;
import kotlin.getConfigExpirySeconds;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.lambdanewSingleThreadScheduledExecutor4;
import kotlin.onPlaybackSpeed;
import kotlin.readBlockToCache;
import kotlin.readSignedExpGolombCodedInt;
import kotlin.recycle;
import kotlin.setMbbsVerificationYear;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setPassingYear;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.skipH265ScalingList;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.traverseForText;
import kotlin.updateLoadingFinished;
import kotlin.zzdx;
import kotlin.zzdy;
import kotlin.zzdz;
import kotlin.zzea;
import kotlin.zzed;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\"H\u0082@¢\u0006\u0004\b%\u0010&R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0014\u00106\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010=R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020<0>8\u0007¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b+\u0010AR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020C0;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010=R \u0010D\u001a\b\u0012\u0004\u0012\u00020C0>8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\b#\u0010AR\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\"\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0>8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010@\u001a\u0004\b%\u0010AR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020G0;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010=R \u0010'\u001a\b\u0012\u0004\u0012\u00020G0>8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\b8\u0010AR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010=R \u00100\u001a\b\u0012\u0004\u0012\u00020G0>8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\b:\u0010AR\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010KR\u0016\u0010M\u001a\u00020G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010LR\u0016\u0010)\u001a\u0004\u0018\u00010\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010N"}, d2 = {"Lcom/marrow2/ui/qbank/score/QbankScoreViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/ParsableNalUnitBitArray;", "p1", "Lo/lambdanewSingleThreadScheduledExecutor4;", "p2", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p3", "Lo/skipH265ScalingList;", "p4", "Lo/SurfaceInfo;", "p5", "Lo/getDisplaySizeV17;", "p6", "Lo/isSeekPending;", "p7", "Lo/getPlatform;", "p8", "<init>", "(Lo/POJOPropertyBuilder5;Lo/ParsableNalUnitBitArray;Lo/lambdanewSingleThreadScheduledExecutor4;Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/skipH265ScalingList;Lo/SurfaceInfo;Lo/getDisplaySizeV17;Lo/isSeekPending;Lo/getPlatform;)V", "", "MediaBrowserCompatItemReceiver", "()V", "Lo/zzea;", "write", "(Lo/zzea;)V", "Lo/setPassingYear;", "AudioAttributesImplApi26Parcelizer", "()Lo/setPassingYear;", "Lo/zzdz;", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/readSignedExpGolombCodedInt;", "IconCompatParcelizer", "(Lo/readSignedExpGolombCodedInt;)V", "read", "(Lo/readSignedExpGolombCodedInt;Lo/SampleVideos;)Ljava/lang/Object;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/ParsableNalUnitBitArray;", "onPlayFromMediaId", "Lo/lambdanewSingleThreadScheduledExecutor4;", "AudioAttributesCompatParcelizer", "MediaMetadataCompat", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "RatingCompat", "Lo/skipH265ScalingList;", "onCustomAction", "Lo/SurfaceInfo;", "onAddQueueItem", "Lo/getDisplaySizeV17;", "Lo/isSeekPending;", "Lo/getPlatform;", "AudioAttributesImplApi21Parcelizer", "Lo/zzbl;", "AudioAttributesImplBaseParcelizer", "Lo/zzbl;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getResolutionSize;", "Lo/zzed;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "onCommand", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "MediaDescriptionCompat", "Lo/zzdx;", "MediaBrowserCompatMediaItem", "Lo/zzdy;", "MediaBrowserCompatSearchResultReceiver", "", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "", "", "Ljava/util/List;", "Z", "onPause", "()Lo/zzdz;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QbankScoreViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onCustomAction;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final isSeekPending MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final C0272zzbl MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<zzdy> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean onPause;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getPlatform AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<zzdx> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<zzdy> RatingCompat;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private List<String> onAddQueueItem;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final NetworkTypeObserverApi31DisplayInfoCallback write;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final skipH265ScalingList IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<zzdx> MediaMetadataCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final ParsableNalUnitBitArray RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final getDisplaySizeV17 AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final setUpdatedStatus<zzed> MediaDescriptionCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final SurfaceInfo read;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final lambdanewSingleThreadScheduledExecutor4 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> onCommand;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<zzed> AudioAttributesImplBaseParcelizer;

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        boolean AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return QbankScoreViewModel.this.read((readSignedExpGolombCodedInt) null, this);
        }
    }

    @setSdkPayload
    public QbankScoreViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, ParsableNalUnitBitArray parsableNalUnitBitArray, lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, skipH265ScalingList skiph265scalinglist, SurfaceInfo surfaceInfo, getDisplaySizeV17 getdisplaysizev17, isSeekPending isseekpending, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(parsableNalUnitBitArray, "");
        toMagicModuleMetaRepoModel.write(lambdanewsinglethreadscheduledexecutor4, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(skiph265scalinglist, "");
        toMagicModuleMetaRepoModel.write(surfaceInfo, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = parsableNalUnitBitArray;
        this.AudioAttributesCompatParcelizer = lambdanewsinglethreadscheduledexecutor4;
        this.write = networkTypeObserverApi31DisplayInfoCallback;
        this.IconCompatParcelizer = skiph265scalinglist;
        this.read = surfaceInfo;
        this.AudioAttributesImplApi26Parcelizer = getdisplaysizev17;
        this.MediaBrowserCompatItemReceiver = isseekpending;
        this.AudioAttributesImplApi21Parcelizer = getplatform;
        C0272zzbl.write writeVar = C0272zzbl.read;
        this.MediaBrowserCompatCustomActionResultReceiver = C0272zzbl.write.read(pOJOPropertyBuilder5);
        getResolutionSize<zzed> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(zzed.IconCompatParcelizer.INSTANCE);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<zzdx> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(zzdx.AudioAttributesCompatParcelizer.INSTANCE);
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<zzdy> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(null);
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.onCommand = getresolutionsizeRemoteActionCompatParcelizer4;
        this.handleMediaPlayPauseIfPendingOnHandler = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onCustomAction = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        this.onAddQueueItem = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        MediaBrowserCompatItemReceiver();
    }

    public final setUpdatedStatus<zzed> AudioAttributesCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final setUpdatedStatus<zzdx> IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<zzdy> read() {
        return this.RatingCompat;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onCustomAction;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            QbankScoreViewModel qbankScoreViewModel;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                QbankScoreViewModel qbankScoreViewModel2 = QbankScoreViewModel.this;
                this.read = qbankScoreViewModel2;
                this.AudioAttributesCompatParcelizer = 1;
                Object objAudioAttributesCompatParcelizer = qbankScoreViewModel2.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objAudioAttributesCompatParcelizer;
                qbankScoreViewModel = qbankScoreViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qbankScoreViewModel = (QbankScoreViewModel) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            qbankScoreViewModel.onAddQueueItem = (List) obj;
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankScoreViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzbw
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QbankScoreViewModel.read((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void write(zzea p0) {
        zzdx.read readVar;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzea.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            this.MediaMetadataCompat.write(new zzdx.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.getAudioAttributesImplBaseParcelizer()));
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzbz
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return QbankScoreViewModel.RemoteActionCompatParcelizer((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzea.IconCompatParcelizer.INSTANCE)) {
            zzdy zzdyVarIconCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer();
            if (zzdyVarIconCompatParcelizer != null) {
                this.MediaBrowserCompatItemReceiver.write("solve_next_module", getAlgorithmIdAsInteger.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
                onPlaybackSpeed.Companion companion = onPlaybackSpeed.INSTANCE;
                onPlaybackSpeed.Companion.write();
                getResolutionSize<zzdx> getresolutionsize = this.MediaMetadataCompat;
                if (this.MediaBrowserCompatCustomActionResultReceiver.getIconCompatParcelizer() == readBlockToCache.write) {
                    if (zzdyVarIconCompatParcelizer.getRemoteActionCompatParcelizer()) {
                        readVar = new zzdx.AudioAttributesImplBaseParcelizer(zzdyVarIconCompatParcelizer.getIconCompatParcelizer(), this.MediaBrowserCompatCustomActionResultReceiver.getWrite());
                    } else {
                        readVar = zzdx.MediaBrowserCompatItemReceiver.INSTANCE;
                    }
                } else {
                    readVar = new zzdx.read(zzdyVarIconCompatParcelizer.getIconCompatParcelizer(), this.MediaBrowserCompatCustomActionResultReceiver.getWrite());
                }
                getresolutionsize.write(readVar);
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzea.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.MediaMetadataCompat.write(zzdx.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzea.read.INSTANCE)) {
            this.onCommand.write(Boolean.valueOf(!r4.IconCompatParcelizer().booleanValue()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzea.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            this.MediaMetadataCompat.write(new zzdx.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver.getRemoteActionCompatParcelizer(), this.MediaBrowserCompatCustomActionResultReceiver.getAudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatCustomActionResultReceiver.getWrite(), this.MediaBrowserCompatCustomActionResultReceiver.getIconCompatParcelizer()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzea.write.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzbx
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return QbankScoreViewModel.write(this.write, (String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof zzea.AudioAttributesImplApi26Parcelizer) {
            this.MediaMetadataCompat.write(new zzdx.write(this.MediaBrowserCompatCustomActionResultReceiver.getAudioAttributesImplBaseParcelizer(), ((zzea.AudioAttributesImplApi26Parcelizer) p0).read()));
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzea.RemoteActionCompatParcelizer.INSTANCE)) {
            this.MediaMetadataCompat.write(zzdx.RemoteActionCompatParcelizer.INSTANCE);
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzea.MediaBrowserCompatItemReceiver.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            AudioAttributesImplApi26Parcelizer();
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        /* JADX INFO: renamed from: com.marrow2.ui.qbank.score.QbankScoreViewModel$AudioAttributesCompatParcelizer$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private Object AudioAttributesCompatParcelizer;
            private /* synthetic */ QbankScoreViewModel AudioAttributesImplApi21Parcelizer;
            private int IconCompatParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            private Object write;

            /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 257
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.score.QbankScoreViewModel.AudioAttributesCompatParcelizer.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(QbankScoreViewModel qbankScoreViewModel, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi21Parcelizer = qbankScoreViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.AudioAttributesImplApi21Parcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AnonymousClass4(QbankScoreViewModel.this, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankScoreViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super zzdz>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        public static final class IconCompatParcelizer<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return getConfigExpirySeconds.read(Integer.valueOf(((recycle) t2).IconCompatParcelizer()), Integer.valueOf(((recycle) t).IconCompatParcelizer()));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00bf A[PHI: r2 r5
          0x00bf: PHI (r2v7 o.readSignedExpGolombCodedInt) = (r2v6 o.readSignedExpGolombCodedInt), (r2v16 o.readSignedExpGolombCodedInt) binds: [B:25:0x00bd, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x00bf: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v7 java.lang.Object) binds: [B:25:0x00bd, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 375
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.score.QbankScoreViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return QbankScoreViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super zzdz> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = QbankScoreViewModel.this.RemoteActionCompatParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            QbankScoreViewModel.this.AudioAttributesImplBaseParcelizer.write(new zzed.AudioAttributesCompatParcelizer((zzdz) obj));
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankScoreViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(QbankScoreViewModel qbankScoreViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qbankScoreViewModel.AudioAttributesImplBaseParcelizer.write(new zzed.write(str));
        return getShowPopup.INSTANCE;
    }

    public static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        public static int AudioAttributesCompatParcelizer;
        public static int IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[PHI: r8
          0x00a9: PHI (r8v19 java.lang.Object) = (r8v18 java.lang.Object), (r8v0 java.lang.Object) binds: [B:26:0x00a7, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[PHI: r1 r8
          0x00c4: PHI (r1v9 o.zzdz) = (r1v8 o.zzdz), (r1v11 o.zzdz) binds: [B:28:0x00c2, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00c4: PHI (r8v23 java.lang.Object) = (r8v22 java.lang.Object), (r8v0 java.lang.Object) binds: [B:28:0x00c2, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 342
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.score.QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankScoreViewModel.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        public static int AudioAttributesCompatParcelizer() {
            int i = IconCompatParcelizer;
            int i2 = i % 8937878;
            IconCompatParcelizer = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int iMyTid = Process.myTid();
            AudioAttributesCompatParcelizer = iMyTid;
            return iMyTid;
        }
    }

    private final setPassingYear AudioAttributesImplApi26Parcelizer() {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzby
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QbankScoreViewModel.AudioAttributesCompatParcelizer(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(QbankScoreViewModel qbankScoreViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qbankScoreViewModel.AudioAttributesImplBaseParcelizer.write(new zzed.write(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdz AudioAttributesImplApi21Parcelizer() {
        zzed zzedVarIconCompatParcelizer = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
        if (zzedVarIconCompatParcelizer instanceof zzed.AudioAttributesCompatParcelizer) {
            return ((zzed.AudioAttributesCompatParcelizer) zzedVarIconCompatParcelizer).IconCompatParcelizer();
        }
        if (zzedVarIconCompatParcelizer instanceof zzed.read) {
            return ((zzed.read) zzedVarIconCompatParcelizer).RemoteActionCompatParcelizer();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super zzdz> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, new write(null), sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(readSignedExpGolombCodedInt p0) {
        Pair<String, HashMap<String, Object>> pairWrite;
        ContentDataSourceContentDataSourceException contentDataSourceContentDataSourceException = ContentDataSourceContentDataSourceException.INSTANCE;
        float fIconCompatParcelizer = ContentDataSourceContentDataSourceException.IconCompatParcelizer(Integer.valueOf(p0.MediaBrowserCompatMediaItem()), Integer.valueOf(p0.MediaBrowserCompatCustomActionResultReceiver()));
        if (this.MediaBrowserCompatCustomActionResultReceiver.getIconCompatParcelizer() == readBlockToCache.write) {
            traverseForText.Companion companion = traverseForText.INSTANCE;
            pairWrite = traverseForText.Companion.AudioAttributesCompatParcelizer(p0.write(), p0.MediaDescriptionCompat(), fIconCompatParcelizer, p0.AudioAttributesImplApi26Parcelizer());
        } else {
            getAlgorithmIdAsInteger getalgorithmidasinteger = getAlgorithmIdAsInteger.read;
            pairWrite = getAlgorithmIdAsInteger.write(p0.write(), p0.MediaDescriptionCompat(), fIconCompatParcelizer, p0.AudioAttributesImplApi26Parcelizer());
        }
        this.MediaBrowserCompatItemReceiver.write(pairWrite, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e4, code lost:
    
        if (r1 == r3) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r13v0, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.readSignedExpGolombCodedInt r19, kotlin.SampleVideos<? super kotlin.getShowPopup> r20) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.score.QbankScoreViewModel.read(o.readSignedExpGolombCodedInt, o.SampleVideos):java.lang.Object");
    }
}
