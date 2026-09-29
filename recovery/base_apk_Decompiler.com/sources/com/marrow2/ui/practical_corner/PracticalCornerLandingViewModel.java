package com.marrow2.ui.practical_corner;

import com.marrow.data.models.common.CourseConfigV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ApiClientKey;
import kotlin.BrowserPublicKeyCredentialCreationOptions;
import kotlin.C0250zzaq;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleRepositoryImpl_Factory;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.MimeTypesCustomMimeType;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.canReadBits;
import kotlin.doUnregisterEventListener;
import kotlin.enqueue;
import kotlin.getAnswerMap;
import kotlin.getApiFallbackAttributionTag;
import kotlin.getClientDataHash;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getOrigin;
import kotlin.getPlatform;
import kotlin.getPublicKeyCredentialCreationOptions;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTopLevelType;
import kotlin.getTrackTypeOfCodec;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.proceedNonBlocking;
import kotlin.setMapper;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zaq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020!H\u0002¢\u0006\u0004\b\u001e\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010\u0014R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00102R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u000201038\u0007¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b&\u00105R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020706008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u00102R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020706038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\b \u00105R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020806008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u00102R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020806038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b.\u00105R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u0010008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b\u001b\u00105R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020;008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u00102R \u0010<\u001a\b\u0012\u0004\u0012\u00020;038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\b,\u00105R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020=\u0018\u0001068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010>"}, d2 = {"Lcom/marrow2/ui/practical_corner/PracticalCornerLandingViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p0", "Lo/getDisplaySizeV17;", "p1", "Lo/LogLogLevel;", "p2", "Lo/canReadBits;", "p3", "Lo/isSeekPending;", "p4", "Lo/getPlatform;", "p5", "<init>", "(Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/getDisplaySizeV17;Lo/LogLogLevel;Lo/canReadBits;Lo/isSeekPending;Lo/getPlatform;)V", "", "", "", "MediaDescriptionCompat", "()V", "AudioAttributesImplApi26Parcelizer", "write", "(Lo/SampleVideos;)Ljava/lang/Object;", "RatingCompat", "MediaBrowserCompatItemReceiver", "Lo/BrowserPublicKeyCredentialCreationOptions;", "read", "(Lo/BrowserPublicKeyCredentialCreationOptions;)V", "Lo/zaq;", "RemoteActionCompatParcelizer", "(Lo/zaq;)V", "IconCompatParcelizer", "Lo/setMapper;", "(Lo/setMapper;)V", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "AudioAttributesCompatParcelizer", "onCustomAction", "Lo/getDisplaySizeV17;", "Lo/LogLogLevel;", "MediaMetadataCompat", "Lo/canReadBits;", "AudioAttributesImplBaseParcelizer", "Lo/isSeekPending;", "AudioAttributesImplApi21Parcelizer", "Lo/getPlatform;", "Lo/getResolutionSize;", "Lo/getClientDataHash;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "Lo/getApiFallbackAttributionTag;", "Lo/getPublicKeyCredentialCreationOptions$read;", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatSearchResultReceiver", "", "onAddQueueItem", "Lcom/marrow/data/models/common/CourseConfigV2$PracticalItems;", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PracticalCornerLandingViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getClientDataHash> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getPlatform MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Integer> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final isSeekPending RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<List<getPublicKeyCredentialCreationOptions.read>> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final LogLogLevel IconCompatParcelizer;
    private final setUpdatedStatus<List<getApiFallbackAttributionTag>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final NetworkTypeObserverApi31DisplayInfoCallback AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private List<? extends CourseConfigV2.PracticalItems> onCustomAction;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<getClientDataHash> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final canReadBits write;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onAddQueueItem;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Integer> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final setUpdatedStatus<List<getPublicKeyCredentialCreationOptions.read>> MediaMetadataCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final getDisplaySizeV17 read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<List<getApiFallbackAttributionTag>> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> RatingCompat;

    @setSdkPayload
    public PracticalCornerLandingViewModel(NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getDisplaySizeV17 getdisplaysizev17, LogLogLevel logLogLevel, canReadBits canreadbits, isSeekPending isseekpending, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(canreadbits, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.AudioAttributesCompatParcelizer = networkTypeObserverApi31DisplayInfoCallback;
        this.read = getdisplaysizev17;
        this.IconCompatParcelizer = logLogLevel;
        this.write = canreadbits;
        this.RemoteActionCompatParcelizer = isseekpending;
        this.MediaBrowserCompatCustomActionResultReceiver = getplatform;
        getResolutionSize<getClientDataHash> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(getClientDataHash.read.INSTANCE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<List<getApiFallbackAttributionTag>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<List<getPublicKeyCredentialCreationOptions.read>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(0);
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.RatingCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass5(null), new AnonymousClass3(this));
    }

    public final setUpdatedStatus<getClientDataHash> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<List<getApiFallbackAttributionTag>> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<List<getPublicKeyCredentialCreationOptions.read>> AudioAttributesImplApi21Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<Integer> read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (PracticalCornerLandingViewModel.this.write(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            PracticalCornerLandingViewModel.this.AudioAttributesImplApi26Parcelizer();
            return getShowPopup.INSTANCE;
        }

        AnonymousClass5(SampleVideos<? super AnonymousClass5> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PracticalCornerLandingViewModel.this.new AnonymousClass5(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass5) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class AnonymousClass3 extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> {
        public final void RemoteActionCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((PracticalCornerLandingViewModel) this.AudioAttributesImplApi26Parcelizer).MediaDescriptionCompat();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, String str) {
            RemoteActionCompatParcelizer(num.intValue(), str);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass3(Object obj) {
            super(2, obj, PracticalCornerLandingViewModel.class, "MediaDescriptionCompat", "MediaDescriptionCompat()V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaDescriptionCompat() {
        this.RatingCompat.write(Boolean.FALSE);
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (kotlin.setCountry.IconCompatParcelizer(1000, r4) == r0) goto L20;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L48
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L32
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel r5 = com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel.this
                o.getDisplaySizeV17 r5 = com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel.AudioAttributesImplBaseParcelizer(r5)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.IconCompatParcelizer = r3
                java.lang.Object r5 = r5.onPrepareFromUri(r1)
                if (r5 == r0) goto L56
            L32:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L53
                r5 = r4
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r4.IconCompatParcelizer = r2
                r1 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r5 = kotlin.setCountry.IconCompatParcelizer(r1, r5)
                if (r5 != r0) goto L48
                goto L56
            L48:
                com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel r4 = com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel.this
                o.getResolutionSize r4 = com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel.MediaDescriptionCompat(r4)
                o.getClientDataHash$IconCompatParcelizer r5 = o.getClientDataHash.IconCompatParcelizer.INSTANCE
                r4.write(r5)
            L53:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PracticalCornerLandingViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new AudioAttributesCompatParcelizer(this));
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> {
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, String str) {
            write(num.intValue(), str);
            return getShowPopup.INSTANCE;
        }

        public final void write(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((PracticalCornerLandingViewModel) this.AudioAttributesImplApi26Parcelizer).MediaDescriptionCompat();
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(2, obj, PracticalCornerLandingViewModel.class, "MediaDescriptionCompat", "MediaDescriptionCompat()V", 0);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
        
            if (r10 != r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
        
            if (r0.AudioAttributesCompatParcelizer(r9) != r1) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel.AudioAttributesImplApi26Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int RemoteActionCompatParcelizer;
            private /* synthetic */ PracticalCornerLandingViewModel read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read.MediaBrowserCompatCustomActionResultReceiver();
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IconCompatParcelizer(PracticalCornerLandingViewModel practicalCornerLandingViewModel, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.read = practicalCornerLandingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new IconCompatParcelizer(this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int IconCompatParcelizer;
            private /* synthetic */ PracticalCornerLandingViewModel RemoteActionCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer.RatingCompat();
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            RemoteActionCompatParcelizer(PracticalCornerLandingViewModel practicalCornerLandingViewModel, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = practicalCornerLandingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ PracticalCornerLandingViewModel AudioAttributesCompatParcelizer;
            private int read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(PracticalCornerLandingViewModel practicalCornerLandingViewModel, SampleVideos<? super write> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = practicalCornerLandingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new write(this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = PracticalCornerLandingViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
            audioAttributesImplApi26Parcelizer.read = obj;
            return audioAttributesImplApi26Parcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object write(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, new AudioAttributesImplApi26Parcelizer(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = PracticalCornerLandingViewModel.this.MediaDescriptionCompat;
                this.write = getresolutionsize2;
                this.AudioAttributesCompatParcelizer = 1;
                Object objWrite = PracticalCornerLandingViewModel.this.write.write(this);
                if (objWrite == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objWrite;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(getOrigin.read((proceedNonBlocking) it.next()));
            }
            getresolutionsize.write(arrayList);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PracticalCornerLandingViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MediaBrowserCompatCustomActionResultReceiver(this));
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class MediaBrowserCompatCustomActionResultReceiver extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> {
        public final void RemoteActionCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((PracticalCornerLandingViewModel) this.AudioAttributesImplApi26Parcelizer).MediaDescriptionCompat();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, String str) {
            RemoteActionCompatParcelizer(num.intValue(), str);
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(Object obj) {
            super(2, obj, PracticalCornerLandingViewModel.class, "MediaDescriptionCompat", "MediaDescriptionCompat()V", 0);
        }
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = PracticalCornerLandingViewModel.this.MediaBrowserCompatMediaItem;
                this.AudioAttributesCompatParcelizer = getresolutionsize2;
                this.RemoteActionCompatParcelizer = 1;
                Object obj2 = PracticalCornerLandingViewModel.this.write.read(this);
                if (obj2 == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = obj2;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getresolutionsize.write(obj);
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PracticalCornerLandingViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new IconCompatParcelizer(this));
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> {
        public final void AudioAttributesCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((PracticalCornerLandingViewModel) this.AudioAttributesImplApi26Parcelizer).MediaDescriptionCompat();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, String str) {
            AudioAttributesCompatParcelizer(num.intValue(), str);
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(Object obj) {
            super(2, obj, PracticalCornerLandingViewModel.class, "MediaDescriptionCompat", "MediaDescriptionCompat()V", 0);
        }
    }

    public final void read(BrowserPublicKeyCredentialCreationOptions p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof BrowserPublicKeyCredentialCreationOptions.AudioAttributesImplApi21Parcelizer) {
            isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
            C0250zzaq c0250zzaq = C0250zzaq.INSTANCE;
            isseekpending.write(C0250zzaq.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending2 = this.RemoteActionCompatParcelizer;
            C0250zzaq c0250zzaq2 = C0250zzaq.INSTANCE;
            BrowserPublicKeyCredentialCreationOptions.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (BrowserPublicKeyCredentialCreationOptions.AudioAttributesImplApi21Parcelizer) p0;
            isseekpending2.write(C0250zzaq.write(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesImplApi21Parcelizer.write(new getClientDataHash.write(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), audioAttributesImplApi21Parcelizer.IconCompatParcelizer()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, BrowserPublicKeyCredentialCreationOptions.IconCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaMetadataCompat(null), new RatingCompat(this));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, BrowserPublicKeyCredentialCreationOptions.AudioAttributesCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatMediaItem(null), new MediaDescriptionCompat(this));
            return;
        }
        if (p0 instanceof BrowserPublicKeyCredentialCreationOptions.RemoteActionCompatParcelizer) {
            BrowserPublicKeyCredentialCreationOptions.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (BrowserPublicKeyCredentialCreationOptions.RemoteActionCompatParcelizer) p0;
            RemoteActionCompatParcelizer(remoteActionCompatParcelizer.write());
            this.AudioAttributesImplApi21Parcelizer.write(new getClientDataHash.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.write()));
        } else if (p0 instanceof BrowserPublicKeyCredentialCreationOptions.read) {
            RemoteActionCompatParcelizer(((BrowserPublicKeyCredentialCreationOptions.read) p0).AudioAttributesCompatParcelizer());
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, BrowserPublicKeyCredentialCreationOptions.write.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.AudioAttributesImplApi21Parcelizer.write(getClientDataHash.read.INSTANCE);
        }
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (PracticalCornerLandingViewModel.this.write(this) == objIconCompatParcelizer) {
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

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PracticalCornerLandingViewModel.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class RatingCompat extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> {
        public final void AudioAttributesCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((PracticalCornerLandingViewModel) this.AudioAttributesImplApi26Parcelizer).MediaDescriptionCompat();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, String str) {
            AudioAttributesCompatParcelizer(num.intValue(), str);
            return getShowPopup.INSTANCE;
        }

        RatingCompat(Object obj) {
            super(2, obj, PracticalCornerLandingViewModel.class, "MediaDescriptionCompat", "MediaDescriptionCompat()V", 0);
        }
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (PracticalCornerLandingViewModel.this.read.onSkipToNext(this) == objIconCompatParcelizer) {
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

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PracticalCornerLandingViewModel.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class MediaDescriptionCompat extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> {
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, String str) {
            read(num.intValue(), str);
            return getShowPopup.INSTANCE;
        }

        public final void read(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((PracticalCornerLandingViewModel) this.AudioAttributesImplApi26Parcelizer).MediaDescriptionCompat();
        }

        MediaDescriptionCompat(Object obj) {
            super(2, obj, PracticalCornerLandingViewModel.class, "MediaDescriptionCompat", "MediaDescriptionCompat()V", 0);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ zaq read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (PracticalCornerLandingViewModel.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(), this.read.write(), this.read.IconCompatParcelizer(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            PracticalCornerLandingViewModel.this.MediaBrowserCompatCustomActionResultReceiver();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(zaq zaqVar, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = zaqVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PracticalCornerLandingViewModel.this.new AudioAttributesImplApi21Parcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(zaq p0) {
        IconCompatParcelizer(p0);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(p0, null), new MediaBrowserCompatSearchResultReceiver(this));
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class MediaBrowserCompatSearchResultReceiver extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> {
        public final void IconCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((PracticalCornerLandingViewModel) this.AudioAttributesImplApi26Parcelizer).MediaDescriptionCompat();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, String str) {
            IconCompatParcelizer(num.intValue(), str);
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatSearchResultReceiver(Object obj) {
            super(2, obj, PracticalCornerLandingViewModel.class, "MediaDescriptionCompat", "MediaDescriptionCompat()V", 0);
        }
    }

    private final void IconCompatParcelizer(zaq p0) {
        isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
        ApiClientKey apiClientKey = ApiClientKey.INSTANCE;
        isseekpending.write(ApiClientKey.AudioAttributesCompatParcelizer(p0.AudioAttributesCompatParcelizer(), "answer"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        isSeekPending isseekpending2 = this.RemoteActionCompatParcelizer;
        ApiClientKey apiClientKey2 = ApiClientKey.INSTANCE;
        isseekpending2.write(ApiClientKey.AudioAttributesCompatParcelizer(p0.read()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        isSeekPending isseekpending3 = this.RemoteActionCompatParcelizer;
        ApiClientKey apiClientKey3 = ApiClientKey.INSTANCE;
        isseekpending3.write(ApiClientKey.IconCompatParcelizer(p0.read()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    private final void RemoteActionCompatParcelizer(setMapper p0) {
        isSeekPending isseekpending = this.RemoteActionCompatParcelizer;
        ApiClientKey apiClientKey = ApiClientKey.INSTANCE;
        isseekpending.write(ApiClientKey.AudioAttributesCompatParcelizer(p0.AudioAttributesCompatParcelizer(), "explanation"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        isSeekPending isseekpending2 = this.RemoteActionCompatParcelizer;
        ApiClientKey apiClientKey2 = ApiClientKey.INSTANCE;
        isseekpending2.write(ApiClientKey.write(p0.MediaBrowserCompatCustomActionResultReceiver()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        isSeekPending isseekpending3 = this.RemoteActionCompatParcelizer;
        ApiClientKey apiClientKey3 = ApiClientKey.INSTANCE;
        isseekpending3.write(ApiClientKey.read(p0.MediaBrowserCompatCustomActionResultReceiver()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        public static final /* synthetic */ class IconCompatParcelizer {
            public static final /* synthetic */ int[] write;

            static {
                int[] iArr = new int[getTrackTypeOfCodec.values().length];
                try {
                    iArr[getTrackTypeOfCodec.AudioAttributesImplBaseParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                write = iArr;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            enqueue enqueueVarWrite;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = PracticalCornerLandingViewModel.this.write.AudioAttributesCompatParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            List list = (List) obj;
            if (list != null) {
                PracticalCornerLandingViewModel practicalCornerLandingViewModel = PracticalCornerLandingViewModel.this;
                getResolutionSize getresolutionsize = practicalCornerLandingViewModel.AudioAttributesImplApi26Parcelizer;
                List<getTopLevelType> listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((Iterable) list);
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesImplApi26Parcelizer, 10));
                for (getTopLevelType gettopleveltype : listAudioAttributesImplApi26Parcelizer) {
                    if (IconCompatParcelizer.write[gettopleveltype.IconCompatParcelizer().ordinal()] == 1) {
                        toMagicModuleMetaRepoModel.read(gettopleveltype, "");
                        enqueueVarWrite = doUnregisterEventListener.write((MimeTypesCustomMimeType) gettopleveltype);
                    } else {
                        enqueueVarWrite = doUnregisterEventListener.write(gettopleveltype);
                    }
                    arrayList.add(enqueueVarWrite);
                }
                getresolutionsize.write(arrayList);
                practicalCornerLandingViewModel.RatingCompat.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            }
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PracticalCornerLandingViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MediaBrowserCompatItemReceiver(this));
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class MediaBrowserCompatItemReceiver extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, String, getShowPopup> {
        public final void RemoteActionCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((PracticalCornerLandingViewModel) this.AudioAttributesImplApi26Parcelizer).MediaDescriptionCompat();
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, String str) {
            RemoteActionCompatParcelizer(num.intValue(), str);
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatItemReceiver(Object obj) {
            super(2, obj, PracticalCornerLandingViewModel.class, "MediaDescriptionCompat", "MediaDescriptionCompat()V", 0);
        }
    }
}
