package com.marrow2.ui.schema.listing;

import com.marrow2.ui.schema.listing.SchemaListViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SurfaceInfo;
import kotlin.SystemHandlerWrapper1;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getConfigExpirySeconds;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.recycleMessage;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zzpt;
import kotlin.zzpu;
import kotlin.zzpw;
import kotlin.zzpx;
import kotlin.zzpy;
import kotlin.zzpz;
import kotlin.zzqa;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\fH\u0002J\b\u0010\"\u001a\u00020 H\u0002J\u000e\u0010#\u001a\u00020 H\u0082@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'J\u0012\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0014\u0010+\u001a\u00020 2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010*H\u0002J\u001c\u0010-\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010*2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000f¨\u00060"}, d2 = {"Lcom/marrow2/ui/schema/listing/SchemaListViewModel;", "Landroidx/lifecycle/ViewModel;", "schemaUseCase", "Lcom/marrow2/domain/schema/SchemaUseCase;", "analyticsPublisher", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Lcom/marrow2/domain/schema/SchemaUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "getSchemaUseCase", "()Lcom/marrow2/domain/schema/SchemaUseCase;", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_filterState", "Lcom/marrow2/ui/schema/listing/model/SchemaFilterState;", "filterState", "getFilterState", "_uiState", "Lcom/marrow2/ui/schema/listing/model/SchemaListUIState;", "uiState", "getUiState", "_scrollToTopRequired", "scrollToTopRequired", "getScrollToTopRequired", "_navigationState", "Lcom/marrow2/ui/schema/listing/model/NavigationUIState;", "navigationUIState", "getNavigationUIState", "refreshListAndPerformSorting", "", "withLoader", "refreshListAndPerformSortingLocal", "performSortingAndMapping", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyEvent", "event", "Lcom/marrow2/ui/schema/listing/model/SchemaListEvents;", "updateSubjectSelection", "subjectId", "", "updateExamFilterList", "examName", "showFilterOverlay", "applyFilterToList", "hideFilterOverlay", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SchemaListViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<zzpx> AudioAttributesCompatParcelizer;
    private final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<zzpu> AudioAttributesImplApi26Parcelizer;
    private final SurfaceInfo AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<zzpu> IconCompatParcelizer;
    private final setUpdatedStatus<zzpx> MediaBrowserCompatCustomActionResultReceiver;
    private final isSeekPending MediaBrowserCompatItemReceiver;
    private final setUpdatedStatus<Boolean> MediaBrowserCompatSearchResultReceiver;
    private final setUpdatedStatus<zzqa> MediaMetadataCompat;
    private final getResolutionSize<Boolean> RemoteActionCompatParcelizer;
    private final getResolutionSize<Boolean> read;
    private final getResolutionSize<zzqa> write;

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[zzpy.values().length];
            try {
                iArr[zzpy.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zzpy.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zzpy.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zzpy.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zzpy.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            read = iArr;
        }
    }

    static final class MediaMetadataCompat extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return SchemaListViewModel.this.write(this);
        }
    }

    @setSdkPayload
    public SchemaListViewModel(SurfaceInfo surfaceInfo, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(surfaceInfo, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesImplBaseParcelizer = surfaceInfo;
        this.MediaBrowserCompatItemReceiver = isseekpending;
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(bool);
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<zzpx> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new zzpx(false, null, null, null, null, null, null, 127, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<zzqa> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new zzqa(false, false, null, null, null, 31, null));
        this.write = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<zzpu> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(zzpu.write.INSTANCE);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer5;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        RemoteActionCompatParcelizer(true);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final SurfaceInfo getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<zzpx> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<zzqa> AudioAttributesImplApi21Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<zzpu> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r4.read.write(r4) == r0) goto L17;
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
                int r1 = r4.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L40
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
                com.marrow2.ui.schema.listing.SchemaListViewModel r5 = com.marrow2.ui.schema.listing.SchemaListViewModel.this
                o.SurfaceInfo r5 = r5.getAudioAttributesImplBaseParcelizer()
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.RemoteActionCompatParcelizer = r3
                java.lang.Object r5 = r5.read(r1)
                if (r5 == r0) goto L43
            L32:
                com.marrow2.ui.schema.listing.SchemaListViewModel r5 = com.marrow2.ui.schema.listing.SchemaListViewModel.this
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.RemoteActionCompatParcelizer = r2
                java.lang.Object r4 = com.marrow2.ui.schema.listing.SchemaListViewModel.AudioAttributesCompatParcelizer(r5, r1)
                if (r4 != r0) goto L40
                goto L43
            L40:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L43:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.schema.listing.SchemaListViewModel.RatingCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaListViewModel.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(boolean z) {
        if (z) {
            this.read.write(Boolean.TRUE);
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzpp
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaListViewModel.IconCompatParcelizer(this.read, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(SchemaListViewModel schemaListViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        schemaListViewModel.read.write(Boolean.valueOf(i == 502 && schemaListViewModel.write.IconCompatParcelizer().IconCompatParcelizer().isEmpty()));
        schemaListViewModel.IconCompatParcelizer.write(new zzpu.AudioAttributesCompatParcelizer(str));
        return getShowPopup.INSTANCE;
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (SchemaListViewModel.this.write(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            SchemaListViewModel.this.RemoteActionCompatParcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
            return getShowPopup.INSTANCE;
        }

        handleMediaPlayPauseIfPendingOnHandler(SampleVideos<? super handleMediaPlayPauseIfPendingOnHandler> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaListViewModel.this.new handleMediaPlayPauseIfPendingOnHandler(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((handleMediaPlayPauseIfPendingOnHandler) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        this.read.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new handleMediaPlayPauseIfPendingOnHandler(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzpq
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaListViewModel.IconCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(SchemaListViewModel schemaListViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        schemaListViewModel.IconCompatParcelizer.write(new zzpu.AudioAttributesCompatParcelizer(str));
        schemaListViewModel.read.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r12) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.schema.listing.SchemaListViewModel.write(o.SampleVideos):java.lang.Object");
    }

    public static final class AudioAttributesImplBaseParcelizer<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            char cCharValue = ((Character) t).charValue();
            Integer numValueOf = Character.isLetter(cCharValue) ? Integer.valueOf(cCharValue) : (Comparable) 256;
            char cCharValue2 = ((Character) t2).charValue();
            return getConfigExpirySeconds.read(numValueOf, Character.isLetter(cCharValue2) ? Integer.valueOf(cCharValue2) : (Comparable) 256);
        }
    }

    public static final class IconCompatParcelizer<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(-((SystemHandlerWrapper1) t).RemoteActionCompatParcelizer()), Integer.valueOf(-((SystemHandlerWrapper1) t2).RemoteActionCompatParcelizer()));
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String upperCase = ((SystemHandlerWrapper1) t).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            String upperCase2 = ((SystemHandlerWrapper1) t2).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase2, "");
            return getConfigExpirySeconds.read(upperCase, upperCase2);
        }
    }

    public static final class RemoteActionCompatParcelizer<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(-((SystemHandlerWrapper1) t).IconCompatParcelizer()), Integer.valueOf(-((SystemHandlerWrapper1) t2).IconCompatParcelizer()));
        }
    }

    public static final class read<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(-((SystemHandlerWrapper1) t).RemoteActionCompatParcelizer()), Integer.valueOf(-((SystemHandlerWrapper1) t2).RemoteActionCompatParcelizer()));
        }
    }

    public static final class write<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(((SystemHandlerWrapper1) t).IconCompatParcelizer()), Integer.valueOf(((SystemHandlerWrapper1) t2).IconCompatParcelizer()));
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer<T> implements Comparator {
        private /* synthetic */ Comparator RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.RemoteActionCompatParcelizer.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            String upperCase = ((SystemHandlerWrapper1) t).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            String upperCase2 = ((SystemHandlerWrapper1) t2).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase2, "");
            return getConfigExpirySeconds.read(upperCase, upperCase2);
        }

        public AudioAttributesImplApi21Parcelizer(Comparator comparator) {
            this.RemoteActionCompatParcelizer = comparator;
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer<T> implements Comparator {
        private /* synthetic */ Comparator AudioAttributesCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.AudioAttributesCompatParcelizer.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            String upperCase = ((SystemHandlerWrapper1) t).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            String upperCase2 = ((SystemHandlerWrapper1) t2).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase2, "");
            return getConfigExpirySeconds.read(upperCase, upperCase2);
        }

        public AudioAttributesImplApi26Parcelizer(Comparator comparator) {
            this.AudioAttributesCompatParcelizer = comparator;
        }
    }

    public static final class MediaBrowserCompatItemReceiver<T> implements Comparator {
        private /* synthetic */ Comparator read;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.read.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            String upperCase = ((SystemHandlerWrapper1) t).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            String upperCase2 = ((SystemHandlerWrapper1) t2).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase2, "");
            return getConfigExpirySeconds.read(upperCase, upperCase2);
        }

        public MediaBrowserCompatItemReceiver(Comparator comparator) {
            this.read = comparator;
        }
    }

    public static final class MediaBrowserCompatMediaItem<T> implements Comparator {
        private /* synthetic */ Comparator AudioAttributesCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.AudioAttributesCompatParcelizer.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            String upperCase = ((SystemHandlerWrapper1) t).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            String upperCase2 = ((SystemHandlerWrapper1) t2).AudioAttributesImplBaseParcelizer().toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase2, "");
            return getConfigExpirySeconds.read(upperCase, upperCase2);
        }

        public MediaBrowserCompatMediaItem(Comparator comparator) {
            this.AudioAttributesCompatParcelizer = comparator;
        }
    }

    public static final class MediaBrowserCompatSearchResultReceiver<T> implements Comparator {
        private /* synthetic */ Comparator write;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.write.compare(t, t2);
            return iCompare != 0 ? iCompare : getConfigExpirySeconds.read(Integer.valueOf(((SystemHandlerWrapper1) t).read()), Integer.valueOf(((SystemHandlerWrapper1) t2).read()));
        }

        public MediaBrowserCompatSearchResultReceiver(Comparator comparator) {
            this.write = comparator;
        }
    }

    public final void read(zzpz zzpzVar) {
        toMagicModuleMetaRepoModel.write(zzpzVar, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzpzVar, zzpz.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            getResolutionSize<zzqa> getresolutionsize = this.write;
            getresolutionsize.write(zzqa.IconCompatParcelizer(getresolutionsize.IconCompatParcelizer(), !this.MediaMetadataCompat.IconCompatParcelizer().getWrite(), false, null, null, null, 30));
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (zzpzVar instanceof zzpz.RatingCompat) {
            isSeekPending isseekpending = this.MediaBrowserCompatItemReceiver;
            zzpt zzptVar = zzpt.INSTANCE;
            zzpz.RatingCompat ratingCompat = (zzpz.RatingCompat) zzpzVar;
            String lowerCase = ratingCompat.write().name().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            isseekpending.write(zzpt.RemoteActionCompatParcelizer(lowerCase), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.write.write(zzqa.IconCompatParcelizer(this.MediaMetadataCompat.IconCompatParcelizer(), false, false, ratingCompat.write(), null, null, 25));
            RatingCompat();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzpzVar, zzpz.MediaBrowserCompatMediaItem.INSTANCE)) {
            getResolutionSize<zzqa> getresolutionsize2 = this.write;
            getresolutionsize2.write(zzqa.IconCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), false, !this.MediaMetadataCompat.IconCompatParcelizer().getRemoteActionCompatParcelizer(), null, null, null, 29));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzpzVar, zzpz.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            if (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getAudioAttributesImplApi26Parcelizer()) {
                AudioAttributesImplApi26Parcelizer();
                return;
            } else {
                read(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getRead(), this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getWrite());
                return;
            }
        }
        if (zzpzVar instanceof zzpz.read) {
            read(((zzpz.read) zzpzVar).AudioAttributesCompatParcelizer());
            return;
        }
        if (zzpzVar instanceof zzpz.write) {
            AudioAttributesImplApi26Parcelizer(((zzpz.write) zzpzVar).RemoteActionCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzpzVar, zzpz.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            read(null, null);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzpzVar, zzpz.IconCompatParcelizer.INSTANCE)) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzpzVar, zzpz.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            RemoteActionCompatParcelizer(false);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzpzVar, zzpz.RemoteActionCompatParcelizer.INSTANCE)) {
            this.IconCompatParcelizer.write(zzpu.write.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzpzVar, zzpz.MediaBrowserCompatItemReceiver.INSTANCE)) {
            this.RemoteActionCompatParcelizer.write(Boolean.FALSE);
        } else {
            if (!(zzpzVar instanceof zzpz.AudioAttributesCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending2 = this.MediaBrowserCompatItemReceiver;
            zzpt zzptVar2 = zzpt.INSTANCE;
            zzpz.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (zzpz.AudioAttributesCompatParcelizer) zzpzVar;
            isseekpending2.write(zzpt.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), audioAttributesCompatParcelizer.write()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    public static final class MediaDescriptionCompat<T> implements Comparator {
        private /* synthetic */ Comparator read;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.read.compare(t, t2);
            return iCompare != 0 ? iCompare : getConfigExpirySeconds.read(Integer.valueOf(((SystemHandlerWrapper1) t2).read()), Integer.valueOf(((SystemHandlerWrapper1) t).read()));
        }

        public MediaDescriptionCompat(Comparator comparator) {
            this.read = comparator;
        }
    }

    private final void AudioAttributesImplApi26Parcelizer(String str) {
        getResolutionSize<zzpx> getresolutionsize = this.AudioAttributesCompatParcelizer;
        getresolutionsize.write(zzpx.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), false, null, null, null, str, null, null, 111));
    }

    public static final class onCommand extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        public static int IconCompatParcelizer;
        public static int read;
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = SchemaListViewModel.this.getAudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable<recycleMessage> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            for (recycleMessage recyclemessage : iterable) {
                arrayList.add(new zzpw(recyclemessage.read(), recyclemessage.write(), recyclemessage.IconCompatParcelizer()));
            }
            SchemaListViewModel.this.AudioAttributesCompatParcelizer.write(zzpx.AudioAttributesCompatParcelizer((zzpx) SchemaListViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), false, null, null, this.RemoteActionCompatParcelizer, null, null, arrayList, 39));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onCommand(String str, SampleVideos<? super onCommand> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaListViewModel.this.new onCommand(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCommand) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        public static int read() {
            int i = IconCompatParcelizer;
            int i2 = i % 6117176;
            IconCompatParcelizer = i + 1;
            if (i2 != 0) {
                return read;
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            read = iMaxMemory;
            return iMaxMemory;
        }
    }

    private final void read(String str) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onCommand(str, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzpo
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaListViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class onCustomAction extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String read;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[LOOP:0: B:21:0x0097->B:23:0x009d, LOOP_END] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.schema.listing.SchemaListViewModel.onCustomAction.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onCustomAction(String str, String str2, SampleVideos<? super onCustomAction> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
            this.read = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaListViewModel.this.new onCustomAction(this.IconCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCustomAction) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(String str, String str2) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onCustomAction(str, str2, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzpn
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaListViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatItemReceiver() {
        Object next;
        Object next2;
        String audioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getAudioAttributesCompatParcelizer();
        String iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getIconCompatParcelizer();
        Iterator<T> it = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((zzpw) next).AudioAttributesCompatParcelizer(), (Object) audioAttributesCompatParcelizer)) {
                    break;
                }
            }
        }
        zzpw zzpwVar = (zzpw) next;
        String strWrite = zzpwVar != null ? zzpwVar.write() : null;
        Iterator<T> it2 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().MediaBrowserCompatItemReceiver().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((zzpw) next2).AudioAttributesCompatParcelizer(), (Object) iconCompatParcelizer)) {
                    break;
                }
            }
        }
        zzpw zzpwVar2 = (zzpw) next2;
        String strWrite2 = zzpwVar2 != null ? zzpwVar2.write() : null;
        isSeekPending isseekpending = this.MediaBrowserCompatItemReceiver;
        zzpt zzptVar = zzpt.INSTANCE;
        isseekpending.write(zzpt.RemoteActionCompatParcelizer(strWrite, strWrite2), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        getResolutionSize<zzpx> getresolutionsize = this.AudioAttributesCompatParcelizer;
        getresolutionsize.write(zzpx.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), false, iconCompatParcelizer, audioAttributesCompatParcelizer, null, null, null, null, 121));
        AudioAttributesImplApi26Parcelizer();
        RatingCompat();
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        getResolutionSize<zzpx> getresolutionsize = this.AudioAttributesCompatParcelizer;
        getresolutionsize.write(zzpx.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), false, null, null, null, null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 6));
    }
}
