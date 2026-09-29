package com.marrow2.ui.qbank.landing;

import com.marrow.R;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import com.marrow2.ui.qbank.landing.QBankLandingViewModel;
import java.util.Date;
import java.util.List;
import kotlin.AbstractC0251zzar;
import kotlin.AbstractC0252zzas;
import kotlin.AbstractC0255zzav;
import kotlin.Allocator;
import kotlin.AllocatorAllocationNode;
import kotlin.C0250zzaq;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.HlsSampleStream;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.ParsableNalUnitBitArray;
import kotlin.PlanDetailsCreator;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SurfaceInfo;
import kotlin.ThemeState;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.allocate;
import kotlin.getAnswerMap;
import kotlin.getArray;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.setScheme;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001c\u0010\u0016R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0014\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020.008\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0015\u00103R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002040-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u000204058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u00106R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208070-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020807008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b\u001c\u00103R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020:0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010/R \u00109\u001a\b\u0012\u0004\u0012\u00020:008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\b\u0018\u00103"}, d2 = {"Lcom/marrow2/ui/qbank/landing/QBankLandingViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/ParsableNalUnitBitArray;", "p0", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p1", "Lo/LogLogLevel;", "p2", "Lo/SurfaceInfo;", "p3", "Lo/isSeekPending;", "p4", "Lo/getArray;", "p5", "Lo/Allocator;", "p6", "<init>", "(Lo/ParsableNalUnitBitArray;Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/LogLogLevel;Lo/SurfaceInfo;Lo/isSeekPending;Lo/getArray;Lo/Allocator;)V", "", "AudioAttributesImplApi21Parcelizer", "()V", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/zzas;", "IconCompatParcelizer", "(Lo/zzas;)V", "MediaBrowserCompatItemReceiver", "Lo/zzar$AudioAttributesCompatParcelizer;", "read", "(Lo/zzar$AudioAttributesCompatParcelizer;)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatSearchResultReceiver", "Lo/ParsableNalUnitBitArray;", "write", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "AudioAttributesImplBaseParcelizer", "Lo/LogLogLevel;", "RemoteActionCompatParcelizer", "MediaDescriptionCompat", "Lo/SurfaceInfo;", "Lo/isSeekPending;", "Lo/getArray;", "MediaBrowserCompatMediaItem", "Lo/Allocator;", "Lo/getResolutionSize;", "Lo/zzav;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "MediaMetadataCompat", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "Lo/isDark;", "Lo/isDark;", "", "Lo/zzar;", "RatingCompat", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QBankLandingViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending read;
    private final getArray AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final LogLogLevel RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<List<AbstractC0251zzar>> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final isDark<String> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final NetworkTypeObserverApi31DisplayInfoCallback IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final Allocator AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final ParsableNalUnitBitArray write;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final SurfaceInfo AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<AbstractC0255zzav> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<List<AbstractC0251zzar>> MediaDescriptionCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<AbstractC0255zzav> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaBrowserCompatItemReceiver;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        /* synthetic */ Object MediaBrowserCompatMediaItem;
        int RemoteActionCompatParcelizer;
        int read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatMediaItem = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return QBankLandingViewModel.this.read(this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return QBankLandingViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public QBankLandingViewModel(ParsableNalUnitBitArray parsableNalUnitBitArray, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, LogLogLevel logLogLevel, SurfaceInfo surfaceInfo, isSeekPending isseekpending, getArray getarray, Allocator allocator) {
        toMagicModuleMetaRepoModel.write(parsableNalUnitBitArray, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(surfaceInfo, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getarray, "");
        toMagicModuleMetaRepoModel.write(allocator, "");
        this.write = parsableNalUnitBitArray;
        this.IconCompatParcelizer = networkTypeObserverApi31DisplayInfoCallback;
        this.RemoteActionCompatParcelizer = logLogLevel;
        this.AudioAttributesCompatParcelizer = surfaceInfo;
        this.read = isseekpending;
        this.AudioAttributesImplApi21Parcelizer = getarray;
        this.AudioAttributesImplApi26Parcelizer = allocator;
        getResolutionSize<AbstractC0255zzav> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(AbstractC0255zzav.AudioAttributesImplBaseParcelizer.INSTANCE);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaMetadataCompat = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<List<AbstractC0251zzar>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer4;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplApi21Parcelizer();
    }

    public final setUpdatedStatus<AbstractC0255zzav> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<List<AbstractC0251zzar>> read() {
        return this.MediaDescriptionCompat;
    }

    public final setUpdatedStatus<Boolean> IconCompatParcelizer() {
        return this.RatingCompat;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object[] objArr = {QBankLandingViewModel.this.AudioAttributesImplApi26Parcelizer};
                isDark isdark = (isDark) Allocator.IconCompatParcelizer(setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), 1850090459, setScheme.IconCompatParcelizer(), -1850090458, objArr, setScheme.IconCompatParcelizer());
                final QBankLandingViewModel qBankLandingViewModel = QBankLandingViewModel.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (isdark.write(new getValidationToken() { // from class: com.marrow2.ui.qbank.landing.QBankLandingViewModel.IconCompatParcelizer.5
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public Object IconCompatParcelizer(allocate allocateVar, SampleVideos<? super getShowPopup> sampleVideos) {
                        if (allocateVar instanceof allocate.RemoteActionCompatParcelizer) {
                            if (((AllocatorAllocationNode) allocate.RemoteActionCompatParcelizer.read(HlsSampleStream.write(), -92781229, HlsSampleStream.write(), 92781232, HlsSampleStream.write(), HlsSampleStream.write(), new Object[]{(allocate.RemoteActionCompatParcelizer) allocateVar})) == AllocatorAllocationNode.MediaBrowserCompatCustomActionResultReceiver) {
                                Object objAudioAttributesCompatParcelizer = qBankLandingViewModel.AudioAttributesCompatParcelizer(sampleVideos);
                                return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
                            }
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankLandingViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.TokenBindingUnsupportedTokenBindingStatusException
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankLandingViewModel.AudioAttributesCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.marrow2.ui.qbank.landing.QBankLandingViewModel.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            com.marrow2.ui.qbank.landing.QBankLandingViewModel$RemoteActionCompatParcelizer r0 = (com.marrow2.ui.qbank.landing.QBankLandingViewModel.RemoteActionCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.IconCompatParcelizer
            int r6 = r6 + r2
            r0.IconCompatParcelizer = r6
            goto L19
        L14:
            com.marrow2.ui.qbank.landing.QBankLandingViewModel$RemoteActionCompatParcelizer r0 = new com.marrow2.ui.qbank.landing.QBankLandingViewModel$RemoteActionCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L40
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.SurfaceInfo r6 = r5.AudioAttributesCompatParcelizer
            r0.IconCompatParcelizer = r3
            java.lang.Object r6 = r6.IconCompatParcelizer(r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            o.doubleCapacityIfFull r6 = (kotlin.doubleCapacityIfFull) r6
            o.zzar$AudioAttributesCompatParcelizer r6 = kotlin.C0253zzat.AudioAttributesCompatParcelizer(r6)
            o.getResolutionSize<java.util.List<o.zzar>> r5 = r5.MediaBrowserCompatMediaItem
        L48:
            java.lang.Object r0 = r5.IconCompatParcelizer()
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r1, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L62:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r1.next()
            o.zzar r3 = (kotlin.AbstractC0251zzar) r3
            boolean r4 = r3 instanceof kotlin.AbstractC0251zzar.AudioAttributesCompatParcelizer
            if (r4 == 0) goto L75
            r3 = r6
            o.zzar r3 = (kotlin.AbstractC0251zzar) r3
        L75:
            r2.add(r3)
            goto L62
        L79:
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r5.AudioAttributesCompatParcelizer(r0, r2)
            if (r0 == 0) goto L48
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.landing.QBankLandingViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    public final void IconCompatParcelizer(AbstractC0252zzas p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0252zzas.read.INSTANCE)) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (p0 instanceof AbstractC0252zzas.MediaDescriptionCompat) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(new AbstractC0255zzav.AudioAttributesImplApi26Parcelizer(((AbstractC0252zzas.MediaDescriptionCompat) p0).IconCompatParcelizer()));
            return;
        }
        if (p0 instanceof AbstractC0252zzas.MediaBrowserCompatCustomActionResultReceiver) {
            read(((AbstractC0252zzas.MediaBrowserCompatCustomActionResultReceiver) p0).AudioAttributesCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0252zzas.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        if (p0 instanceof AbstractC0252zzas.IconCompatParcelizer) {
            isSeekPending isseekpending = this.read;
            C0250zzaq c0250zzaq = C0250zzaq.INSTANCE;
            isseekpending.write(C0250zzaq.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0252zzas.RemoteActionCompatParcelizer.INSTANCE)) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(AbstractC0255zzav.AudioAttributesImplBaseParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0252zzas.RatingCompat.INSTANCE)) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(AbstractC0255zzav.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof AbstractC0252zzas.MediaBrowserCompatItemReceiver) {
            isSeekPending isseekpending2 = this.read;
            C0250zzaq c0250zzaq2 = C0250zzaq.INSTANCE;
            isseekpending2.write(C0250zzaq.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            isSeekPending isseekpending3 = this.read;
            C0250zzaq c0250zzaq3 = C0250zzaq.INSTANCE;
            AbstractC0252zzas.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (AbstractC0252zzas.MediaBrowserCompatItemReceiver) p0;
            isseekpending3.write(C0250zzaq.write(mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.MediaBrowserCompatCustomActionResultReceiver.write(new AbstractC0255zzav.IconCompatParcelizer(mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0252zzas.AudioAttributesCompatParcelizer.INSTANCE)) {
            isSeekPending isseekpending4 = this.read;
            C0250zzaq c0250zzaq4 = C0250zzaq.INSTANCE;
            isseekpending4.write(C0250zzaq.IconCompatParcelizer("qb_tab"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.MediaBrowserCompatCustomActionResultReceiver.write(AbstractC0255zzav.RemoteActionCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0252zzas.write.INSTANCE)) {
            AudioAttributesImplApi26Parcelizer();
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0252zzas.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(AbstractC0255zzav.MediaBrowserCompatItemReceiver.INSTANCE);
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0252zzas.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.MediaBrowserCompatCustomActionResultReceiver.write(AbstractC0255zzav.write.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                QBankLandingViewModel.this.MediaBrowserCompatSearchResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                this.AudioAttributesCompatParcelizer = 1;
                if (QBankLandingViewModel.this.read(this) == objIconCompatParcelizer) {
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

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankLandingViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.getTokenBindingId
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankLandingViewModel.IconCompatParcelizer(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(QBankLandingViewModel qBankLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankLandingViewModel.MediaBrowserCompatSearchResultReceiver.write(Boolean.FALSE);
        qBankLandingViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    private final void read(AbstractC0251zzar.AudioAttributesCompatParcelizer p0) {
        isSeekPending isseekpending = this.read;
        C0250zzaq c0250zzaq = C0250zzaq.INSTANCE;
        isseekpending.write(C0250zzaq.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        if (p0.read() == 0) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(new AbstractC0255zzav.MediaMetadataCompat(R.string.no_schema_found));
        } else if (p0.IconCompatParcelizer()) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(AbstractC0255zzav.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver.write(new AbstractC0255zzav.MediaMetadataCompat(R.string.schema_scync_progress));
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (QBankLandingViewModel.this.write.IconCompatParcelizer(new Date().getTime(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            QBankLandingViewModel.this.MediaBrowserCompatItemReceiver();
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankLandingViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.RequestOptions
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankLandingViewModel.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(QBankLandingViewModel qBankLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankLandingViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = QBankLandingViewModel.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CustomModuleUCModel customModuleUCModel = (CustomModuleUCModel) obj;
            if (customModuleUCModel != null) {
                isSeekPending isseekpending = QBankLandingViewModel.this.read;
                C0250zzaq c0250zzaq = C0250zzaq.INSTANCE;
                isseekpending.write(C0250zzaq.AudioAttributesCompatParcelizer("existing"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                QBankLandingViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(new AbstractC0255zzav.read(customModuleUCModel));
            } else {
                isSeekPending isseekpending2 = QBankLandingViewModel.this.read;
                C0250zzaq c0250zzaq2 = C0250zzaq.INSTANCE;
                isseekpending2.write(C0250zzaq.AudioAttributesCompatParcelizer(LessonIndex.TAG_TYPE_NEW), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                QBankLandingViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(AbstractC0255zzav.AudioAttributesCompatParcelizer.INSTANCE);
            }
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankLandingViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.toJsonObject
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankLandingViewModel.read(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(QBankLandingViewModel qBankLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankLandingViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107 A[PHI: r2 r7 r12
      0x0107: PHI (r2v11 java.util.List<com.marrow.data.models.common.CourseConfigV2$QbankItem>) = 
      (r2v8 java.util.List<com.marrow.data.models.common.CourseConfigV2$QbankItem>)
      (r2v14 java.util.List<com.marrow.data.models.common.CourseConfigV2$QbankItem>)
     binds: [B:34:0x0105, B:16:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r7v6 java.util.List<o.zzar>) = (r7v3 java.util.List<o.zzar>), (r7v8 java.util.List<o.zzar>) binds: [B:34:0x0105, B:16:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r12v16 java.lang.Object) = (r12v14 java.lang.Object), (r12v1 java.lang.Object) binds: [B:34:0x0105, B:16:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b A[PHI: r2 r7 r12
      0x012b: PHI (r2v15 java.util.List<com.marrow.data.models.common.CourseConfigV2$QbankItem>) = 
      (r2v11 java.util.List<com.marrow.data.models.common.CourseConfigV2$QbankItem>)
      (r2v20 java.util.List<com.marrow.data.models.common.CourseConfigV2$QbankItem>)
     binds: [B:39:0x0129, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r7v9 java.util.List<o.zzar>) = (r7v6 java.util.List<o.zzar>), (r7v11 java.util.List<o.zzar>) binds: [B:39:0x0129, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r12v21 java.lang.Object) = (r12v20 java.lang.Object), (r12v1 java.lang.Object) binds: [B:39:0x0129, B:15:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cc A[LOOP:0: B:62:0x01c6->B:64:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r12) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.landing.QBankLandingViewModel.read(o.SampleVideos):java.lang.Object");
    }
}
