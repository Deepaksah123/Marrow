package com.marrow2.ui.test.introduction;

import android.content.Context;
import com.marrow.data.models.test.TestIndex;
import com.marrow2.ui.test.introduction.TestIntroductionViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.binarySearchCeil;
import kotlin.checkCleartextTrafficPermitted;
import kotlin.crc32;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getWalletObjectsClient;
import kotlin.getYear;
import kotlin.interceptEvent;
import kotlin.isSeekPending;
import kotlin.setCurrencyCode;
import kotlin.setEnvironment;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001dH\u0002J\u000e\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/J\u0018\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u001dH\u0002J(\u00103\u001a\u00020+2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u001d2\u0006\u00102\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020+2\u0006\u00109\u001a\u000205H\u0082@¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020+H\u0002J\u000e\u0010<\u001a\u00020+H\u0082@¢\u0006\u0002\u0010=J\u000e\u0010>\u001a\u00020?H\u0082@¢\u0006\u0002\u0010=R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u000e\u0010%\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00060(j\u0002`)X\u0082.¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/marrow2/ui/test/introduction/TestIntroductionViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "testUseCase", "Lcom/marrow2/domain/test/TestUseCase;", "testApiUseCase", "Lcom/marrow2/domain/test/TestApiUseCase;", "subjectUseCase", "Lcom/marrow2/domain/subject/SubjectUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "courseConfigUseCase", "Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/test/TestUseCase;Lcom/marrow2/domain/test/TestApiUseCase;Lcom/marrow2/domain/subject/SubjectUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_navigateEvent", "Lcom/marrow2/ui/test/introduction/model/NavigateUiState;", "navigateEvent", "getNavigateEvent", "_error", "", "error", "getError", "_testUiState", "Lcom/marrow2/core/utils/VMState;", "Lcom/marrow2/ui/test/introduction/model/TestUiState;", "testUiState", "getTestUiState", "forceDownloadScoreData", "testId", "test", "Lcom/marrow/data/models/test/TestIndex;", "Lcom/marrow2/domain/test/model/TestIndexUCModel;", "sendTestOpened", "", "analyticsSource", "notifyEvent", "event", "Lcom/marrow2/ui/test/introduction/model/TestIntroEvent;", "handleStartTestEvent", "isAnonymous", "deviceId", "handleDeviceInfoRes", "testStatus", "", "activeDeviceId", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkStatusAndStartTest", "status", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDeviceInfoAndStartTest", "onStartTestConfirmed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTestStatusAnalytics", "Lcom/marrow2/ui/test/analytics/TestAnalytics$TestAnalyticsStatus;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestIntroductionViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setEnvironment>> AudioAttributesCompatParcelizer;
    private final setUpdatedStatus<String> AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<setCurrencyCode> AudioAttributesImplApi26Parcelizer;
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<String> IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final LogLogLevel MediaBrowserCompatItemReceiver;
    private String MediaBrowserCompatMediaItem;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setEnvironment>> MediaBrowserCompatSearchResultReceiver;
    private final getDisplaySizeV17 MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private TestIndex MediaDescriptionCompat;
    private final checkCleartextTrafficPermitted MediaMetadataCompat;
    private final binarySearchCeil RatingCompat;
    private final isSeekPending RemoteActionCompatParcelizer;
    private final crc32 onCustomAction;
    private final getResolutionSize<setCurrencyCode> read;
    private final getResolutionSize<Boolean> write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;
        /* synthetic */ Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return TestIntroductionViewModel.this.read(this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object read;
        int write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return TestIntroductionViewModel.this.IconCompatParcelizer(this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return TestIntroductionViewModel.this.write(0, null, null, this);
        }
    }

    @setSdkPayload
    public TestIntroductionViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, crc32 crc32Var, checkCleartextTrafficPermitted checkcleartexttrafficpermitted, binarySearchCeil binarysearchceil, getDisplaySizeV17 getdisplaysizev17, LogLogLevel logLogLevel, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(checkcleartexttrafficpermitted, "");
        toMagicModuleMetaRepoModel.write(binarysearchceil, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.onCustomAction = crc32Var;
        this.MediaMetadataCompat = checkcleartexttrafficpermitted;
        this.RatingCompat = binarysearchceil;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getdisplaysizev17;
        this.MediaBrowserCompatItemReceiver = logLogLevel;
        this.RemoteActionCompatParcelizer = isseekpending;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<setCurrencyCode> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(setCurrencyCode.AudioAttributesCompatParcelizer.INSTANCE);
        this.read = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer("");
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<setEnvironment>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        Object objWrite = pOJOPropertyBuilder5.write("key_id");
        if (objWrite == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.MediaBrowserCompatMediaItem = (String) objWrite;
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass5(pOJOPropertyBuilder5, null), new MagicModuleSubmissionRequestBody() { // from class: o.setTotalPriceStatus
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestIntroductionViewModel.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<setCurrencyCode> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<String> read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setEnvironment>> IconCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.test.introduction.TestIntroductionViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ POJOPropertyBuilder5 IconCompatParcelizer;
        private Object read;
        private boolean write;

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 289
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.introduction.TestIntroductionViewModel.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(POJOPropertyBuilder5 pOJOPropertyBuilder5, SampleVideos<? super AnonymousClass5> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = pOJOPropertyBuilder5;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestIntroductionViewModel.this.new AnonymousClass5(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass5) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(TestIntroductionViewModel testIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testIntroductionViewModel.write.write(Boolean.FALSE);
        testIntroductionViewModel.IconCompatParcelizer.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver(String str) {
        interceptEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        TestIndex testIndex = this.MediaDescriptionCompat;
        if (testIndex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            testIndex = null;
        }
        if (testIndex.getRank() == -2) {
            remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.write;
        } else {
            TestIndex testIndex2 = this.MediaDescriptionCompat;
            if (testIndex2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                testIndex2 = null;
            }
            int status = testIndex2.getStatus();
            if (status == 0) {
                remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.IconCompatParcelizer;
            } else if (status == 1) {
                remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            } else if (status == 2) {
                remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.read;
            } else {
                remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.read;
            }
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(remoteActionCompatParcelizer, str, null), new MagicModuleSubmissionRequestBody() { // from class: o.TransactionInfoBuilder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestIntroductionViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
            }
        });
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ interceptEvent.RemoteActionCompatParcelizer read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            isSeekPending isseekpending;
            interceptEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            getYear.IconCompatParcelizer();
            int i = this.AudioAttributesImplBaseParcelizer;
            TestIndex testIndex = null;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending2 = TestIntroductionViewModel.this.RemoteActionCompatParcelizer;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                interceptEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.read;
                crc32 crc32Var = TestIntroductionViewModel.this.onCustomAction;
                TestIndex testIndex2 = TestIntroductionViewModel.this.MediaDescriptionCompat;
                if (testIndex2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex2 = null;
                }
                long startTimestamp = testIndex2.getStartTimestamp();
                TestIndex testIndex3 = TestIntroductionViewModel.this.MediaDescriptionCompat;
                if (testIndex3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex3 = null;
                }
                long endTimestamp = testIndex3.getEndTimestamp();
                this.AudioAttributesCompatParcelizer = isseekpending2;
                this.write = interceptevent;
                this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                this.AudioAttributesImplBaseParcelizer = 1;
                isseekpending = isseekpending2;
                obj = crc32Var.read(startTimestamp, endTimestamp);
                remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                remoteActionCompatParcelizer = (interceptEvent.RemoteActionCompatParcelizer) this.RemoteActionCompatParcelizer;
                isseekpending = (isSeekPending) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            TestIndex testIndex4 = TestIntroductionViewModel.this.MediaDescriptionCompat;
            if (testIndex4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                testIndex4 = null;
            }
            String id = testIndex4.getId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
            TestIndex testIndex5 = TestIntroductionViewModel.this.MediaDescriptionCompat;
            if (testIndex5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                testIndex = testIndex5;
            }
            String testType = testIndex.getTestType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
            isseekpending.write(interceptEvent.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, iIntValue, id, testType, this.IconCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(interceptEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = remoteActionCompatParcelizer;
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestIntroductionViewModel.this.new AudioAttributesImplBaseParcelizer(this.read, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TestIntroductionViewModel.this.write.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                this.read = 1;
                if (TestIntroductionViewModel.this.IconCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            TestIntroductionViewModel.this.write.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestIntroductionViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void write(getWalletObjectsClient getwalletobjectsclient) {
        toMagicModuleMetaRepoModel.write(getwalletobjectsclient, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getwalletobjectsclient, getWalletObjectsClient.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.addAllowedCountryCode
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestIntroductionViewModel.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer, (String) obj2);
                }
            });
            return;
        }
        if (getwalletobjectsclient instanceof getWalletObjectsClient.IconCompatParcelizer) {
            getWalletObjectsClient.IconCompatParcelizer iconCompatParcelizer = (getWalletObjectsClient.IconCompatParcelizer) getwalletobjectsclient;
            IconCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer(), iconCompatParcelizer.write());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getwalletobjectsclient, getWalletObjectsClient.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getwalletobjectsclient, getWalletObjectsClient.write.INSTANCE)) {
            this.read.write(setCurrencyCode.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getwalletobjectsclient, getWalletObjectsClient.RemoteActionCompatParcelizer.INSTANCE)) {
            this.IconCompatParcelizer.write("");
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getwalletobjectsclient, getWalletObjectsClient.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            this.read.write(new setCurrencyCode.read(this.MediaBrowserCompatMediaItem, true));
            this.read.write(setCurrencyCode.AudioAttributesCompatParcelizer.INSTANCE);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getwalletobjectsclient, getWalletObjectsClient.read.INSTANCE)) {
            if (this.MediaDescriptionCompat != null) {
                CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.getCurrencyCode
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return TestIntroductionViewModel.AudioAttributesCompatParcelizer((String) obj2);
                    }
                });
            }
        } else {
            if (!(getwalletobjectsclient instanceof getWalletObjectsClient.AudioAttributesCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(getwalletobjectsclient, null), new MagicModuleSubmissionRequestBody() { // from class: o.getTotalPriceStatus
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return TestIntroductionViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(TestIntroductionViewModel testIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testIntroductionViewModel.write.write(Boolean.FALSE);
        testIntroductionViewModel.IconCompatParcelizer.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            isSeekPending isseekpending = TestIntroductionViewModel.this.RemoteActionCompatParcelizer;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            isseekpending.write(interceptEvent.MediaBrowserCompatItemReceiver(TestIntroductionViewModel.this.MediaBrowserCompatMediaItem), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestIntroductionViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        public static int AudioAttributesCompatParcelizer;
        public static int read;
        private /* synthetic */ getWalletObjectsClient IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (TestIntroductionViewModel.this.write(((getWalletObjectsClient.AudioAttributesCompatParcelizer) this.IconCompatParcelizer).AudioAttributesCompatParcelizer().write(), ((getWalletObjectsClient.AudioAttributesCompatParcelizer) this.IconCompatParcelizer).AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(), ((getWalletObjectsClient.AudioAttributesCompatParcelizer) this.IconCompatParcelizer).RemoteActionCompatParcelizer(), this) == objIconCompatParcelizer) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(getWalletObjectsClient getwalletobjectsclient, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = getwalletobjectsclient;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestIntroductionViewModel.this.new AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        public static int AudioAttributesCompatParcelizer() {
            int i = read;
            int i2 = i % 5964476;
            read = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            AudioAttributesCompatParcelizer = i3;
            return i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private boolean AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ boolean IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ String write;

        /* JADX WARN: Code restructure failed: missing block: B:48:0x01c1, code lost:
        
            if (r15.MediaBrowserCompatItemReceiver.write(r2.getTestStatus(), r2.getActiveDeviceId(), r15.write, r15) != r1) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[PHI: r2 r5
          0x009d: PHI (r2v7 com.marrow.data.models.test.TestIndex) = (r2v6 com.marrow.data.models.test.TestIndex), (r2v23 com.marrow.data.models.test.TestIndex) binds: [B:21:0x009b, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]
          0x009d: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v10 java.lang.Object) binds: [B:21:0x009b, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 469
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.introduction.TestIntroductionViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(boolean z, String str, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = z;
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestIntroductionViewModel.this.new IconCompatParcelizer(this.IconCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(boolean z, String str) {
        this.write.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(z, str, null), new MagicModuleSubmissionRequestBody() { // from class: o.getTotalPrice
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestIntroductionViewModel.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(TestIntroductionViewModel testIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testIntroductionViewModel.write.write(Boolean.FALSE);
        testIntroductionViewModel.IconCompatParcelizer.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r7.RemoteActionCompatParcelizer(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (IconCompatParcelizer(r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(int r6, java.lang.String r7, java.lang.String r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.test.introduction.TestIntroductionViewModel.read
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.test.introduction.TestIntroductionViewModel$read r0 = (com.marrow2.ui.test.introduction.TestIntroductionViewModel.read) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.AudioAttributesCompatParcelizer
            int r9 = r9 + r2
            r0.AudioAttributesCompatParcelizer = r9
            goto L19
        L14:
            com.marrow2.ui.test.introduction.TestIntroductionViewModel$read r0 = new com.marrow2.ui.test.introduction.TestIntroductionViewModel$read
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            int r5 = r0.write
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r5 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L93
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            int r6 = r0.write
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r6 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L63
        L45:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            if (r6 == 0) goto L96
            r9 = 0
            if (r6 == r4) goto L6b
            if (r6 != r3) goto L9d
            r5.MediaBrowserCompatCustomActionResultReceiver = r4
            o.checkCleartextTrafficPermitted r7 = r5.MediaMetadataCompat
            java.lang.String r8 = r5.MediaBrowserCompatMediaItem
            r0.read = r9
            r0.RemoteActionCompatParcelizer = r9
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r6 = r7.RemoteActionCompatParcelizer(r8, r0)
            if (r6 == r1) goto L92
        L63:
            o.getResolutionSize<o.setCurrencyCode> r5 = r5.read
            o.setCurrencyCode$AudioAttributesImplApi26Parcelizer r6 = o.setCurrencyCode.AudioAttributesImplApi26Parcelizer.INSTANCE
            r5.write(r6)
            goto L9d
        L6b:
            r2 = r7
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L84
            int r2 = r2.length()
            if (r2 == 0) goto L84
            boolean r7 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r7, r8)
            if (r7 != 0) goto L84
            o.getResolutionSize<o.setCurrencyCode> r5 = r5.read
            o.setCurrencyCode$write r6 = o.setCurrencyCode.write.INSTANCE
            r5.write(r6)
            goto L9d
        L84:
            r0.read = r9
            r0.RemoteActionCompatParcelizer = r9
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r5.IconCompatParcelizer(r0)
            if (r5 != r1) goto L93
        L92:
            return r1
        L93:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L96:
            o.getResolutionSize<o.setCurrencyCode> r5 = r5.read
            o.setCurrencyCode$MediaBrowserCompatItemReceiver r6 = o.setCurrencyCode.MediaBrowserCompatItemReceiver.INSTANCE
            r5.write(r6)
        L9d:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.introduction.TestIntroductionViewModel.write(int, java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object read(int i, SampleVideos<? super getShowPopup> sampleVideos) {
        if (i == 0) {
            this.read.write(setCurrencyCode.MediaBrowserCompatItemReceiver.INSTANCE);
            return getShowPopup.INSTANCE;
        }
        Object objIconCompatParcelizer = IconCompatParcelizer(sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Object read;

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
        
            if (r6.IconCompatParcelizer.read(r1.getStatus(), r6) == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.introduction.TestIntroductionViewModel.AudioAttributesImplApi21Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return TestIntroductionViewModel.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.TransactionInfo
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return TestIntroductionViewModel.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(TestIntroductionViewModel testIntroductionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        testIntroductionViewModel.write.write(Boolean.FALSE);
        testIntroductionViewModel.IconCompatParcelizer.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.test.introduction.TestIntroductionViewModel.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.test.introduction.TestIntroductionViewModel$MediaBrowserCompatItemReceiver r0 = (com.marrow2.ui.test.introduction.TestIntroductionViewModel.MediaBrowserCompatItemReceiver) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            com.marrow2.ui.test.introduction.TestIntroductionViewModel$MediaBrowserCompatItemReceiver r0 = new com.marrow2.ui.test.introduction.TestIntroductionViewModel$MediaBrowserCompatItemReceiver
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 3
            java.lang.String r4 = ""
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4e
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r0 = r0.read
            com.marrow.data.models.test.TestIndex r0 = (com.marrow.data.models.test.TestIndex) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L98
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L81
        L42:
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer
            o.interceptEvent r2 = (kotlin.interceptEvent) r2
            java.lang.Object r2 = r0.read
            o.isSeekPending r2 = (kotlin.isSeekPending) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L61
        L4e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.isSeekPending r2 = r7.RemoteActionCompatParcelizer
            o.interceptEvent r8 = kotlin.interceptEvent.INSTANCE
            r0.read = r2
            r0.AudioAttributesCompatParcelizer = r8
            r0.write = r6
            java.lang.Object r8 = r7.read(r0)
            if (r8 == r1) goto Lac
        L61:
            o.interceptEvent$write r8 = (o.interceptEvent.write) r8
            o.getSubscriptionExpiresOn r8 = kotlin.interceptEvent.IconCompatParcelizer(r8)
            o.updateLoadingFinished r6 = kotlin.updateLoadingFinished.IconCompatParcelizer
            java.util.List r6 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r6)
            r2.write(r8, r6)
            o.crc32 r8 = r7.onCustomAction
            java.lang.String r2 = r7.MediaBrowserCompatMediaItem
            r6 = 0
            r0.read = r6
            r0.AudioAttributesCompatParcelizer = r6
            r0.write = r5
            java.lang.Object r8 = r8.read(r2, r0)
            if (r8 == r1) goto Lac
        L81:
            com.marrow.data.models.test.TestIndex r8 = (com.marrow.data.models.test.TestIndex) r8
            o.checkCleartextTrafficPermitted r2 = r7.MediaMetadataCompat
            java.lang.String r5 = r8.getId()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r5, r4)
            r0.read = r8
            r0.write = r3
            java.lang.Object r0 = r2.AudioAttributesCompatParcelizer(r5, r0)
            if (r0 != r1) goto L97
            goto Lac
        L97:
            r0 = r8
        L98:
            o.getResolutionSize<o.setCurrencyCode> r7 = r7.read
            java.lang.String r8 = r0.getId()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8, r4)
            o.setCurrencyCode$MediaBrowserCompatCustomActionResultReceiver r0 = new o.setCurrencyCode$MediaBrowserCompatCustomActionResultReceiver
            r0.<init>(r8)
            r7.write(r0)
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.introduction.TestIntroductionViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super o.interceptEvent.write> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.marrow2.ui.test.introduction.TestIntroductionViewModel.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r14
            com.marrow2.ui.test.introduction.TestIntroductionViewModel$AudioAttributesCompatParcelizer r0 = (com.marrow2.ui.test.introduction.TestIntroductionViewModel.AudioAttributesCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.read
            int r14 = r14 + r2
            r0.read = r14
            goto L19
        L14:
            com.marrow2.ui.test.introduction.TestIntroductionViewModel$AudioAttributesCompatParcelizer r0 = new com.marrow2.ui.test.introduction.TestIntroductionViewModel$AudioAttributesCompatParcelizer
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            r5 = 0
            java.lang.String r6 = ""
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            int r13 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = r0.AudioAttributesCompatParcelizer
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.IconCompatParcelizer
            java.lang.String r0 = (java.lang.String) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto Lb3
        L3b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L43:
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.IconCompatParcelizer
            java.lang.String r4 = (java.lang.String) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto L8a
        L4f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            java.lang.String r14 = r13.MediaBrowserCompatMediaItem
            com.marrow.data.models.test.TestIndex r2 = r13.MediaDescriptionCompat
            if (r2 != 0) goto L5c
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r6)
            r2 = r5
        L5c:
            java.lang.String r2 = r2.getTestType()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, r6)
            o.crc32 r7 = r13.onCustomAction
            com.marrow.data.models.test.TestIndex r8 = r13.MediaDescriptionCompat
            if (r8 != 0) goto L6d
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r6)
            r8 = r5
        L6d:
            long r8 = r8.getStartTimestamp()
            com.marrow.data.models.test.TestIndex r10 = r13.MediaDescriptionCompat
            if (r10 != 0) goto L79
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r6)
            r10 = r5
        L79:
            long r10 = r10.getEndTimestamp()
            r0.IconCompatParcelizer = r14
            r0.AudioAttributesCompatParcelizer = r2
            r0.read = r4
            java.lang.Object r4 = r7.read(r8, r10)
            r12 = r4
            r4 = r14
            r14 = r12
        L8a:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            o.crc32 r7 = r13.onCustomAction
            com.marrow.data.models.test.TestIndex r13 = r13.MediaDescriptionCompat
            if (r13 != 0) goto L9a
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r6)
            goto L9b
        L9a:
            r5 = r13
        L9b:
            long r5 = r5.getStartTimestamp()
            r0.IconCompatParcelizer = r4
            r0.AudioAttributesCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r14
            r0.read = r3
            java.lang.Object r13 = r7.RemoteActionCompatParcelizer(r5, r0)
            if (r13 != r1) goto Lae
            return r1
        Lae:
            r1 = r2
            r0 = r4
            r12 = r14
            r14 = r13
            r13 = r12
        Lb3:
            java.lang.String r14 = (java.lang.String) r14
            o.interceptEvent$write r2 = new o.interceptEvent$write
            r2.<init>(r0, r1, r13, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.introduction.TestIntroductionViewModel.read(o.SampleVideos):java.lang.Object");
    }
}
