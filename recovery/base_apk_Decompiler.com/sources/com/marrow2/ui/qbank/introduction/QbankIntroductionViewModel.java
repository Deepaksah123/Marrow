package com.marrow2.ui.qbank.introduction;

import com.marrow2.ui.qbank.introduction.QbankIntroductionViewModel;
import java.util.Comparator;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.ParsableNalUnitBitArray;
import kotlin.PublicKeyCredentialRequestOptionsBuilder;
import kotlin.PublicKeyCredentialType;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligible;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SurfaceInfo;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.binarySearchCeil;
import kotlin.getAnswerMap;
import kotlin.getConfigExpirySeconds;
import kotlin.getCreatedOnDateMs;
import kotlin.getDisplaySizeV17;
import kotlin.getIcon;
import kotlin.getMagicModuleStats;
import kotlin.getRenewExpiresOn;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.pollFloor;
import kotlin.recycle;
import kotlin.setMbbsVerificationYear;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.skipH265ScalingList;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.traverseForText;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0018\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010/R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020.018\u0007¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b0\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R \u00106\u001a\b\u0012\u0004\u0012\u000204018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b\u0018\u00103R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208070-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020807018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b(\u00103R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010/R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u0017018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b\u001d\u00103R\u0014\u0010<\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010;R\u0014\u0010)\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010&\u001a\u0004\u0018\u0001048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010;R\u001b\u0010 \u001a\u00020.8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b+\u0010@\u001a\u0004\b5\u0010A"}, d2 = {"Lcom/marrow2/ui/qbank/introduction/QbankIntroductionViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/skipH265ScalingList;", "p1", "Lo/ParsableNalUnitBitArray;", "p2", "Lo/binarySearchCeil;", "p3", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p4", "Lo/getDisplaySizeV17;", "p5", "Lo/SurfaceInfo;", "p6", "Lo/isSeekPending;", "p7", "<init>", "(Lo/POJOPropertyBuilder5;Lo/skipH265ScalingList;Lo/ParsableNalUnitBitArray;Lo/binarySearchCeil;Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/getDisplaySizeV17;Lo/SurfaceInfo;Lo/isSeekPending;)V", "", "AudioAttributesImplApi26Parcelizer", "()V", "Lo/PublicKeyCredentialType;", "AudioAttributesCompatParcelizer", "(Lo/PublicKeyCredentialType;)V", "(Lo/SampleVideos;)Ljava/lang/Object;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/skipH265ScalingList;", "IconCompatParcelizer", "MediaBrowserCompatMediaItem", "Lo/ParsableNalUnitBitArray;", "onAddQueueItem", "Lo/binarySearchCeil;", "RemoteActionCompatParcelizer", "RatingCompat", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "write", "onCustomAction", "Lo/getDisplaySizeV17;", "read", "handleMediaPlayPauseIfPendingOnHandler", "Lo/SurfaceInfo;", "AudioAttributesImplBaseParcelizer", "Lo/isSeekPending;", "Lo/getResolutionSize;", "", "Lo/getResolutionSize;", "AudioAttributesImplApi21Parcelizer", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "MediaBrowserCompatItemReceiver", "MediaMetadataCompat", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "Lo/getIcon;", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "Ljava/lang/String;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "", "onCommand", "I", "Lo/RenewEligible;", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QbankIntroductionViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<String> MediaMetadataCompat;
    private final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final RenewEligible onAddQueueItem;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final skipH265ScalingList IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String onCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final ParsableNalUnitBitArray AudioAttributesCompatParcelizer;
    private final setUpdatedStatus<PublicKeyCredentialType> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<getIcon>> RatingCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final NetworkTypeObserverApi31DisplayInfoCallback write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<getIcon>> MediaDescriptionCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final SurfaceInfo AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final binarySearchCeil RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final int handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final getDisplaySizeV17 read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<PublicKeyCredentialType> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplApi21Parcelizer;

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.AudioAttributesImplBaseParcelizer |= Integer.MIN_VALUE;
            return QbankIntroductionViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public QbankIntroductionViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, skipH265ScalingList skiph265scalinglist, ParsableNalUnitBitArray parsableNalUnitBitArray, binarySearchCeil binarysearchceil, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getDisplaySizeV17 getdisplaysizev17, SurfaceInfo surfaceInfo, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(skiph265scalinglist, "");
        toMagicModuleMetaRepoModel.write(parsableNalUnitBitArray, "");
        toMagicModuleMetaRepoModel.write(binarysearchceil, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(surfaceInfo, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.IconCompatParcelizer = skiph265scalinglist;
        this.AudioAttributesCompatParcelizer = parsableNalUnitBitArray;
        this.RemoteActionCompatParcelizer = binarysearchceil;
        this.write = networkTypeObserverApi31DisplayInfoCallback;
        this.read = getdisplaysizev17;
        this.AudioAttributesImplBaseParcelizer = surfaceInfo;
        this.MediaBrowserCompatCustomActionResultReceiver = isseekpending;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.TRUE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<getIcon>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer3;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<PublicKeyCredentialType> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(PublicKeyCredentialType.read.INSTANCE);
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        Object objWrite = pOJOPropertyBuilder5.write("lesson_id");
        if (objWrite != null) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (String) objWrite;
            Integer num = (Integer) pOJOPropertyBuilder5.write("source");
            this.handleMediaPlayPauseIfPendingOnHandler = num != null ? num.intValue() : 0;
            this.onCustomAction = (String) pOJOPropertyBuilder5.write("analytics_source");
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass1(null), new MagicModuleSubmissionRequestBody() { // from class: o.PublicKeyCredentialParameters
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return QbankIntroductionViewModel.AudioAttributesCompatParcelizer(this.read, (String) obj2);
                }
            });
            this.onAddQueueItem = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getTypeAsString
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return Boolean.valueOf(QbankIntroductionViewModel.AudioAttributesImplBaseParcelizer(this.write));
                }
            });
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<String> AudioAttributesCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<getIcon>> read() {
        return this.RatingCompat;
    }

    public final setUpdatedStatus<PublicKeyCredentialType> IconCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.qbank.introduction.QbankIntroductionViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (QbankIntroductionViewModel.this.AudioAttributesCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            QbankIntroductionViewModel.this.AudioAttributesImplApi26Parcelizer();
            QbankIntroductionViewModel.this.AudioAttributesImplApi21Parcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            return getShowPopup.INSTANCE;
        }

        AnonymousClass1(SampleVideos<? super AnonymousClass1> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankIntroductionViewModel.this.new AnonymousClass1(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass1) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(QbankIntroductionViewModel qbankIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qbankIntroductionViewModel.AudioAttributesImplApi21Parcelizer.write(Boolean.FALSE);
        qbankIntroductionViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return ((Boolean) this.onAddQueueItem.RemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplBaseParcelizer(QbankIntroductionViewModel qbankIntroductionViewModel) {
        return qbankIntroductionViewModel.handleMediaPlayPauseIfPendingOnHandler == 11;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getIcon geticon = (getIcon) ((DataSourceBitmapLoaderExternalSyntheticLambda0) QbankIntroductionViewModel.this.MediaDescriptionCompat.IconCompatParcelizer()).RemoteActionCompatParcelizer();
                String write = geticon != null ? geticon.getWrite() : null;
                if (write == null) {
                    write = "";
                }
                getIcon geticon2 = (getIcon) ((DataSourceBitmapLoaderExternalSyntheticLambda0) QbankIntroductionViewModel.this.MediaDescriptionCompat.IconCompatParcelizer()).RemoteActionCompatParcelizer();
                String audioAttributesCompatParcelizer = geticon2 != null ? geticon2.getAudioAttributesCompatParcelizer() : null;
                String str = audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer : "";
                this.RemoteActionCompatParcelizer = null;
                this.read = null;
                this.write = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AnonymousClass4(QbankIntroductionViewModel.this, write, str, null), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: com.marrow2.ui.qbank.introduction.QbankIntroductionViewModel$AudioAttributesCompatParcelizer$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ QbankIntroductionViewModel AudioAttributesCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private /* synthetic */ String read;
            private /* synthetic */ String write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                        this.RemoteActionCompatParcelizer = 1;
                        obj = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.write(this.write, this);
                        if (obj == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        isSeekPending isseekpending = this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                        PublicKeyCredentialRequestOptionsBuilder publicKeyCredentialRequestOptionsBuilder = PublicKeyCredentialRequestOptionsBuilder.INSTANCE;
                        isseekpending.write(PublicKeyCredentialRequestOptionsBuilder.RemoteActionCompatParcelizer(this.write, this.read, this.AudioAttributesCompatParcelizer.onCustomAction), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                        return getShowPopup.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                pollFloor pollfloor = (pollFloor) obj;
                isSeekPending isseekpending2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                traverseForText.Companion companion = traverseForText.INSTANCE;
                String str = pollfloor.read();
                String strRemoteActionCompatParcelizer = pollfloor.RemoteActionCompatParcelizer();
                isseekpending2.write(traverseForText.Companion.AudioAttributesCompatParcelizer(this.write, str, pollfloor.IconCompatParcelizer(), strRemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer.onCustomAction), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(QbankIntroductionViewModel qbankIntroductionViewModel, String str, String str2, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = qbankIntroductionViewModel;
                this.write = str;
                this.read = str2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.AudioAttributesCompatParcelizer, this.write, this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankIntroductionViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.PublicKeyCredentialRequestOptions
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QbankIntroductionViewModel.write((String) obj2);
            }
        });
    }

    public static final class IconCompatParcelizer<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(((recycle) t2).IconCompatParcelizer()), Integer.valueOf(((recycle) t).IconCompatParcelizer()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(PublicKeyCredentialType p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, PublicKeyCredentialType.IconCompatParcelizer.INSTANCE)) {
            this.MediaBrowserCompatMediaItem.write(PublicKeyCredentialType.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, PublicKeyCredentialType.read.INSTANCE)) {
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, PublicKeyCredentialType.RemoteActionCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.getAlgorithm
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return QbankIntroductionViewModel.read(this.write, (String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof PublicKeyCredentialType.AudioAttributesImplApi26Parcelizer) {
            isSeekPending isseekpending = this.MediaBrowserCompatCustomActionResultReceiver;
            PublicKeyCredentialRequestOptionsBuilder publicKeyCredentialRequestOptionsBuilder = PublicKeyCredentialRequestOptionsBuilder.INSTANCE;
            isseekpending.write(PublicKeyCredentialRequestOptionsBuilder.write(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.handleMediaPlayPauseIfPendingOnHandler), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.PublicKeyCredentialDescriptorUnsupportedPubKeyCredDescriptorException
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return QbankIntroductionViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof PublicKeyCredentialType.MediaBrowserCompatCustomActionResultReceiver) {
            isSeekPending isseekpending2 = this.MediaBrowserCompatCustomActionResultReceiver;
            PublicKeyCredentialRequestOptionsBuilder publicKeyCredentialRequestOptionsBuilder2 = PublicKeyCredentialRequestOptionsBuilder.INSTANCE;
            isseekpending2.write(PublicKeyCredentialRequestOptionsBuilder.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.PublicKeyCredentialDescriptor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return QbankIntroductionViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof PublicKeyCredentialType.AudioAttributesCompatParcelizer) {
            PublicKeyCredentialType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (PublicKeyCredentialType.AudioAttributesCompatParcelizer) p0;
            this.MediaBrowserCompatMediaItem.write(new PublicKeyCredentialType.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer(), audioAttributesCompatParcelizer.RemoteActionCompatParcelizer()));
            this.MediaBrowserCompatMediaItem.write(PublicKeyCredentialType.read.INSTANCE);
        } else {
            if (!(p0 instanceof PublicKeyCredentialType.write)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending3 = this.MediaBrowserCompatCustomActionResultReceiver;
            PublicKeyCredentialRequestOptionsBuilder publicKeyCredentialRequestOptionsBuilder3 = PublicKeyCredentialRequestOptionsBuilder.INSTANCE;
            getIcon geticonRemoteActionCompatParcelizer = this.RatingCompat.IconCompatParcelizer().RemoteActionCompatParcelizer();
            String write2 = geticonRemoteActionCompatParcelizer != null ? geticonRemoteActionCompatParcelizer.getWrite() : null;
            if (write2 == null) {
                write2 = "";
            }
            getIcon geticonRemoteActionCompatParcelizer2 = this.RatingCompat.IconCompatParcelizer().RemoteActionCompatParcelizer();
            String audioAttributesCompatParcelizer2 = geticonRemoteActionCompatParcelizer2 != null ? geticonRemoteActionCompatParcelizer2.getAudioAttributesCompatParcelizer() : null;
            isseekpending3.write(PublicKeyCredentialRequestOptionsBuilder.IconCompatParcelizer(write2, audioAttributesCompatParcelizer2 != null ? audioAttributesCompatParcelizer2 : ""), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (QbankIntroductionViewModel.this.AudioAttributesCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            QbankIntroductionViewModel.this.MediaBrowserCompatMediaItem.write(PublicKeyCredentialType.read.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankIntroductionViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(QbankIntroductionViewModel qbankIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qbankIntroductionViewModel.AudioAttributesImplApi21Parcelizer.write(Boolean.FALSE);
        qbankIntroductionViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.qbank.introduction.QbankIntroductionViewModel$write$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private Object AudioAttributesCompatParcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private Object IconCompatParcelizer;
            private /* synthetic */ QbankIntroductionViewModel MediaBrowserCompatCustomActionResultReceiver;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            private int write;

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
            
                if (r10 != r0) goto L14;
             */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 292
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.introduction.QbankIntroductionViewModel.write.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(QbankIntroductionViewModel qbankIntroductionViewModel, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.MediaBrowserCompatCustomActionResultReceiver = qbankIntroductionViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.MediaBrowserCompatCustomActionResultReceiver, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AnonymousClass4(QbankIntroductionViewModel.this, null), this) == objIconCompatParcelizer) {
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

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankIntroductionViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.qbank.introduction.QbankIntroductionViewModel$MediaBrowserCompatCustomActionResultReceiver$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ QbankIntroductionViewModel AudioAttributesImplApi26Parcelizer;
            private Object IconCompatParcelizer;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            private Object write;

            /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
            
                if (r9 != r0) goto L14;
             */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 238
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.introduction.QbankIntroductionViewModel.MediaBrowserCompatCustomActionResultReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(QbankIntroductionViewModel qbankIntroductionViewModel, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi26Parcelizer = qbankIntroductionViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.AudioAttributesImplApi26Parcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AnonymousClass1(QbankIntroductionViewModel.this, null), this) == objIconCompatParcelizer) {
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

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankIntroductionViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
    
        if (r13 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[PHI: r13
      0x00b1: PHI (r13v6 java.lang.Object) = (r13v5 java.lang.Object), (r13v1 java.lang.Object) binds: [B:23:0x00af, B:18:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5 A[PHI: r2 r13
      0x00c5: PHI (r2v5 o.readSignedExpGolombCodedInt) = (r2v4 o.readSignedExpGolombCodedInt), (r2v8 o.readSignedExpGolombCodedInt) binds: [B:25:0x00c3, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r13v9 java.lang.Object) = (r13v8 java.lang.Object), (r13v1 java.lang.Object) binds: [B:25:0x00c3, B:17:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124 A[PHI: r2 r5 r6 r13
      0x0124: PHI (r2v21 int) = (r2v16 int), (r2v22 int) binds: [B:42:0x0122, B:14:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r5v16 java.lang.String) = (r5v11 java.lang.String), (r5v19 java.lang.String) binds: [B:42:0x0122, B:14:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r6v6 o.readSignedExpGolombCodedInt) = (r6v4 o.readSignedExpGolombCodedInt), (r6v8 o.readSignedExpGolombCodedInt) binds: [B:42:0x0122, B:14:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r13v24 java.lang.Object) = (r13v20 java.lang.Object), (r13v1 java.lang.Object) binds: [B:42:0x0122, B:14:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r13) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.introduction.QbankIntroductionViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }
}
