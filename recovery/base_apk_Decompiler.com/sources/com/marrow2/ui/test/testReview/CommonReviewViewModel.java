package com.marrow2.ui.test.testReview;

import com.marrow.data.models.test.TestIndex;
import com.marrow2.ui.test.testReview.CommonReviewViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.BottomNavigationMenuView;
import kotlin.BottomNavigationView;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.QBankStatsResponse;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.checkCleartextTrafficPermitted;
import kotlin.crc32;
import kotlin.getAnswerMap;
import kotlin.getCustomMimeTypeForCodec;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getMediaMimeType;
import kotlin.getMimeTypeFromMp4ObjectType;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.interceptEvent;
import kotlin.isSeekPending;
import kotlin.setMenuAlignmentMode;
import kotlin.setOnMaskChangedListener;
import kotlin.setOnNavigationItemSelectedListener;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStaticLayoutBuilderConfigurer;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zzhs;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0019J\u0006\u00103\u001a\u000201J\u000e\u00104\u001a\u0002012\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u000201J\b\u00108\u001a\u000201H\u0002J\b\u00109\u001a\u000201H\u0002J\u000e\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020<J\u0018\u0010=\u001a\u0002012\b\u0010>\u001a\u0004\u0018\u00010\u00152\u0006\u0010?\u001a\u00020\u0015J\u0006\u0010@\u001a\u000201J\u000e\u0010A\u001a\u0002012\u0006\u00105\u001a\u000206J\u000e\u0010B\u001a\u0002012\u0006\u0010;\u001a\u00020<J\u0010\u0010C\u001a\u0002012\b\u0010>\u001a\u0004\u0018\u00010\u0015J\u0006\u0010D\u001a\u000201R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u000e\u0010,\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u00060.j\u0002`/X\u0082.¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/marrow2/ui/test/testReview/CommonReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "testApiUseCase", "Lcom/marrow2/domain/test/TestApiUseCase;", "testUseCase", "Lcom/marrow2/domain/test/TestUseCase;", "mcqUseCase", "Lcom/marrow2/domain/mcq/McqUseCase;", "filterUseCase", "Lcom/marrow2/domain/filter/FilterUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/test/TestApiUseCase;Lcom/marrow2/domain/test/TestUseCase;Lcom/marrow2/domain/mcq/McqUseCase;Lcom/marrow2/domain/filter/FilterUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "commonReviewArgs", "Lcom/marrow2/ui/test/testReview/CommonReviewArgs;", "parentId", "", "getParentId", "()Ljava/lang/String;", "isTest", "", "isCustomModule", "_commonReviewUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/test/testReview/model/CommonReviewUIStates;", "commonReviewUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getCommonReviewUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_testFilterUiState", "Lcom/marrow2/ui/test/testReview/model/TestFilterUIState;", "testFilterUiState", "getTestFilterUiState", "_qBankFilterUiState", "Lcom/marrow2/ui/test/testReview/model/QBankFilterUIState;", "qBankFilterUiState", "getQBankFilterUiState", "_isLoading", "isLoading", "selectedSubjectFilterTitle", "test", "Lcom/marrow/data/models/test/TestIndex;", "Lcom/marrow2/domain/test/model/TestIndexUCModel;", "toggleShowAnswer", "", "check", "onVerticalFilterClicked", "onScreenModeChanged", "screenMode", "Lcom/marrow2/ui/test/testReview/ui/ScreenMode;", "onFilterClicked", "resetFilterData", "loadFilterData", "loadSubjectsForFilter", "filterType", "Lcom/marrow2/domain/filter/model/CommonFilterType;", "onTestSubjectSelected", "id", "subjectTitle", "onTestFilterReset", "onTestFilterApplied", "loadSchemasForFilter", "onQBankSchemaSelected", "onQBankFilterApplied", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommonReviewViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<BottomNavigationMenuView> AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<BottomNavigationMenuView> AudioAttributesImplApi26Parcelizer;
    private final setStaticLayoutBuilderConfigurer AudioAttributesImplBaseParcelizer;
    private final isSeekPending IconCompatParcelizer;
    private final getMimeTypeFromMp4ObjectType MediaBrowserCompatCustomActionResultReceiver;
    private final setUpdatedStatus<Boolean> MediaBrowserCompatItemReceiver;
    private final setUpdatedStatus<BottomNavigationView> MediaBrowserCompatMediaItem;
    private final boolean MediaBrowserCompatSearchResultReceiver;
    private TestIndex MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final NetworkTypeObserverApi31DisplayInfoCallback RatingCompat;
    private final getResolutionSize<Boolean> RemoteActionCompatParcelizer;
    private final setUpdatedStatus<setOnNavigationItemSelectedListener> handleMediaPlayPauseIfPendingOnHandler;
    private final checkCleartextTrafficPermitted onAddQueueItem;
    private final getDisplaySizeV17 onCommand;
    private final crc32 onCustomAction;
    private final getResolutionSize<setOnNavigationItemSelectedListener> read;
    private final getResolutionSize<BottomNavigationView> write;

    @setSdkPayload
    public CommonReviewViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, checkCleartextTrafficPermitted checkcleartexttrafficpermitted, crc32 crc32Var, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getMimeTypeFromMp4ObjectType getmimetypefrommp4objecttype, getDisplaySizeV17 getdisplaysizev17, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(checkcleartexttrafficpermitted, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getmimetypefrommp4objecttype, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.onAddQueueItem = checkcleartexttrafficpermitted;
        this.onCustomAction = crc32Var;
        this.RatingCompat = networkTypeObserverApi31DisplayInfoCallback;
        this.MediaBrowserCompatCustomActionResultReceiver = getmimetypefrommp4objecttype;
        this.onCommand = getdisplaysizev17;
        this.IconCompatParcelizer = isseekpending;
        setStaticLayoutBuilderConfigurer.Companion companion = setStaticLayoutBuilderConfigurer.INSTANCE;
        setStaticLayoutBuilderConfigurer setstaticlayoutbuilderconfigurer = setStaticLayoutBuilderConfigurer.Companion.read(pOJOPropertyBuilder5);
        this.AudioAttributesImplBaseParcelizer = setstaticlayoutbuilderconfigurer;
        this.MediaMetadataCompat = setstaticlayoutbuilderconfigurer.getWrite();
        this.MediaBrowserCompatSearchResultReceiver = setstaticlayoutbuilderconfigurer.getIconCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = setstaticlayoutbuilderconfigurer.getRemoteActionCompatParcelizer();
        getResolutionSize<BottomNavigationMenuView> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new BottomNavigationMenuView(null, false, false, false, null, false, null, null, 255, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<setOnNavigationItemSelectedListener> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new setOnNavigationItemSelectedListener(null, null, null, null, null, null, 63, null));
        this.read = getresolutionsizeRemoteActionCompatParcelizer2;
        this.handleMediaPlayPauseIfPendingOnHandler = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<BottomNavigationView> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new BottomNavigationView(null, null, null, null, null, null, 63, null));
        this.write = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(Boolean.TRUE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        this.MediaDescriptionCompat = "all";
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass1(null), new MagicModuleSubmissionRequestBody() { // from class: o.setTitleEllipsize
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.AudioAttributesCompatParcelizer(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<BottomNavigationMenuView> read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<setOnNavigationItemSelectedListener> MediaBrowserCompatItemReceiver() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final setUpdatedStatus<BottomNavigationView> IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.test.testReview.CommonReviewViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00e6, code lost:
        
            if (r2 != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0131, code lost:
        
            if (r2 != r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01ad  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 485
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testReview.CommonReviewViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AnonymousClass1(SampleVideos<? super AnonymousClass1> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new AnonymousClass1(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass1) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(CommonReviewViewModel commonReviewViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        commonReviewViewModel.RemoteActionCompatParcelizer.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ boolean RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (CommonReviewViewModel.this.onCommand.write(this.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatCustomActionResultReceiver(boolean z, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCustomAction(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(z, null), new MagicModuleSubmissionRequestBody() { // from class: o.setStatusBarScrimResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.onCustomAction((String) obj2);
            }
        });
        getResolutionSize<BottomNavigationMenuView> getresolutionsize = this.AudioAttributesCompatParcelizer;
        getresolutionsize.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, z, false, false, null, false, null, null, 253));
        if (this.AudioAttributesImplApi21Parcelizer) {
            isSeekPending isseekpending = this.IconCompatParcelizer;
            setMenuAlignmentMode setmenualignmentmode = setMenuAlignmentMode.INSTANCE;
            isseekpending.write("cm_toggle_answer", setMenuAlignmentMode.write(this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getAudioAttributesCompatParcelizer() == zzhs.write) {
            isSeekPending isseekpending2 = this.IconCompatParcelizer;
            setMenuAlignmentMode setmenualignmentmode2 = setMenuAlignmentMode.INSTANCE;
            isseekpending2.write("qb_toggle_answer", setMenuAlignmentMode.write(this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getAudioAttributesCompatParcelizer() == zzhs.IconCompatParcelizer) {
            isSeekPending isseekpending3 = this.IconCompatParcelizer;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            isseekpending3.write(interceptEvent.IconCompatParcelizer(z), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        getResolutionSize<BottomNavigationMenuView> getresolutionsize = this.AudioAttributesCompatParcelizer;
        getresolutionsize.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, false, !this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer(), false, null, false, null, null, 251));
        if (this.AudioAttributesImplApi21Parcelizer) {
            isSeekPending isseekpending = this.IconCompatParcelizer;
            setMenuAlignmentMode setmenualignmentmode = setMenuAlignmentMode.INSTANCE;
            isseekpending.write("cm_toggle_grid", setMenuAlignmentMode.RemoteActionCompatParcelizer(!this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getAudioAttributesCompatParcelizer() == zzhs.write) {
            isSeekPending isseekpending2 = this.IconCompatParcelizer;
            setMenuAlignmentMode setmenualignmentmode2 = setMenuAlignmentMode.INSTANCE;
            isseekpending2.write("qb_toggle_grid", setMenuAlignmentMode.RemoteActionCompatParcelizer(!this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getAudioAttributesCompatParcelizer() == zzhs.IconCompatParcelizer) {
            isSeekPending isseekpending3 = this.IconCompatParcelizer;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            isseekpending3.write(interceptEvent.read(!this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getAudioAttributesImplBaseParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    public final void IconCompatParcelizer(setOnMaskChangedListener setonmaskchangedlistener) {
        toMagicModuleMetaRepoModel.write(setonmaskchangedlistener, "");
        if (this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().getWrite() == setonmaskchangedlistener) {
            return;
        }
        getResolutionSize<BottomNavigationMenuView> getresolutionsize = this.AudioAttributesCompatParcelizer;
        getresolutionsize.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, false, false, false, null, false, setonmaskchangedlistener, null, 191));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (!((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer()).getAudioAttributesImplApi21Parcelizer()) {
                CommonReviewViewModel.this.RatingCompat();
            } else {
                CommonReviewViewModel.this.MediaMetadataCompat();
            }
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setTitleCollapseMode
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.RatingCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            CommonReviewViewModel.this.read.write(setOnNavigationItemSelectedListener.AudioAttributesCompatParcelizer((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer(), null, null, getMediaMimeType.AudioAttributesImplBaseParcelizer, null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 3));
            CommonReviewViewModel.this.write.write(BottomNavigationView.IconCompatParcelizer((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer(), null, null, getMediaMimeType.AudioAttributesImplBaseParcelizer, null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 3));
            CommonReviewViewModel.this.AudioAttributesCompatParcelizer.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), null, false, false, false, null, false, null, null, 247));
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaMetadataCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.setStatusBarScrim
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            List list;
            List listRemoteActionCompatParcelizer;
            List list2;
            List list3;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = CommonReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver.read(CommonReviewViewModel.this.getMediaMetadataCompat(), this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i == 2) {
                    list3 = (List) this.read;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    listRemoteActionCompatParcelizer = (List) obj;
                    list2 = list3;
                    CommonReviewViewModel.this.write.write(BottomNavigationView.IconCompatParcelizer(CommonReviewViewModel.this.IconCompatParcelizer().IconCompatParcelizer(), null, null, ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getIconCompatParcelizer(), ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getMediaBrowserCompatItemReceiver(), list2, listRemoteActionCompatParcelizer, 3));
                    CommonReviewViewModel.this.AudioAttributesCompatParcelizer.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), null, false, false, true, null, false, null, null, 247));
                    return getShowPopup.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list4 = (List) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
                list = list4;
                CommonReviewViewModel.this.read.write(setOnNavigationItemSelectedListener.AudioAttributesCompatParcelizer(CommonReviewViewModel.this.MediaBrowserCompatItemReceiver().IconCompatParcelizer(), null, null, ((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getWrite(), ((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getMediaBrowserCompatItemReceiver(), list, (List) obj, 3));
                CommonReviewViewModel.this.AudioAttributesCompatParcelizer.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), null, false, false, true, null, false, null, null, 247));
                return getShowPopup.INSTANCE;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            Map map = (Map) obj;
            ArrayList arrayList = new ArrayList();
            getMediaMimeType getmediamimetype = getMediaMimeType.AudioAttributesImplBaseParcelizer;
            Integer num = (Integer) map.get(getMediaMimeType.AudioAttributesImplBaseParcelizer);
            arrayList.add(new Pair(getmediamimetype, QBankStatsResponse.RemoteActionCompatParcelizer(num != null ? num.intValue() : 0)));
            getMediaMimeType getmediamimetype2 = getMediaMimeType.AudioAttributesCompatParcelizer;
            Integer num2 = (Integer) map.get(getMediaMimeType.AudioAttributesCompatParcelizer);
            arrayList.add(new Pair(getmediamimetype2, QBankStatsResponse.RemoteActionCompatParcelizer(num2 != null ? num2.intValue() : 0)));
            getMediaMimeType getmediamimetype3 = getMediaMimeType.AudioAttributesImplApi26Parcelizer;
            Integer num3 = (Integer) map.get(getMediaMimeType.AudioAttributesImplApi26Parcelizer);
            arrayList.add(new Pair(getmediamimetype3, QBankStatsResponse.RemoteActionCompatParcelizer(num3 != null ? num3.intValue() : 0)));
            getMediaMimeType getmediamimetype4 = getMediaMimeType.MediaMetadataCompat;
            Integer num4 = (Integer) map.get(getMediaMimeType.MediaMetadataCompat);
            arrayList.add(new Pair(getmediamimetype4, QBankStatsResponse.RemoteActionCompatParcelizer(num4 != null ? num4.intValue() : 0)));
            getMediaMimeType getmediamimetype5 = getMediaMimeType.MediaBrowserCompatItemReceiver;
            Integer num5 = (Integer) map.get(getMediaMimeType.MediaBrowserCompatItemReceiver);
            arrayList.add(new Pair(getmediamimetype5, QBankStatsResponse.RemoteActionCompatParcelizer(num5 != null ? num5.intValue() : 0)));
            getMediaMimeType getmediamimetype6 = getMediaMimeType.AudioAttributesImplApi21Parcelizer;
            Integer num6 = (Integer) map.get(getMediaMimeType.AudioAttributesImplApi21Parcelizer);
            arrayList.add(new Pair(getmediamimetype6, QBankStatsResponse.RemoteActionCompatParcelizer(num6 != null ? num6.intValue() : 0)));
            if (CommonReviewViewModel.this.read().IconCompatParcelizer().getAudioAttributesCompatParcelizer() != zzhs.write) {
                if (!CommonReviewViewModel.this.AudioAttributesImplApi21Parcelizer) {
                    getMediaMimeType getmediamimetype7 = getMediaMimeType.read;
                    Integer num7 = (Integer) map.get(getMediaMimeType.read);
                    arrayList.add(new Pair(getmediamimetype7, QBankStatsResponse.RemoteActionCompatParcelizer(num7 != null ? num7.intValue() : 0)));
                    getMediaMimeType getmediamimetype8 = getMediaMimeType.RemoteActionCompatParcelizer;
                    Integer num8 = (Integer) map.get(getMediaMimeType.RemoteActionCompatParcelizer);
                    arrayList.add(new Pair(getmediamimetype8, QBankStatsResponse.RemoteActionCompatParcelizer(num8 != null ? num8.intValue() : 0)));
                    getMediaMimeType getmediamimetype9 = getMediaMimeType.write;
                    Integer num9 = (Integer) map.get(getMediaMimeType.write);
                    arrayList.add(new Pair(getmediamimetype9, QBankStatsResponse.RemoteActionCompatParcelizer(num9 != null ? num9.intValue() : 0)));
                }
                getMimeTypeFromMp4ObjectType getmimetypefrommp4objecttype = CommonReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver;
                String mediaMetadataCompat = CommonReviewViewModel.this.getMediaMetadataCompat();
                getMediaMimeType write = CommonReviewViewModel.this.MediaBrowserCompatItemReceiver().IconCompatParcelizer().getWrite();
                this.AudioAttributesCompatParcelizer = null;
                this.read = arrayList;
                this.IconCompatParcelizer = 3;
                obj = getmimetypefrommp4objecttype.RemoteActionCompatParcelizer(mediaMetadataCompat, write);
                if (obj != objIconCompatParcelizer) {
                    list = arrayList;
                    CommonReviewViewModel.this.read.write(setOnNavigationItemSelectedListener.AudioAttributesCompatParcelizer(CommonReviewViewModel.this.MediaBrowserCompatItemReceiver().IconCompatParcelizer(), null, null, ((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getWrite(), ((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getMediaBrowserCompatItemReceiver(), list, (List) obj, 3));
                    CommonReviewViewModel.this.AudioAttributesCompatParcelizer.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), null, false, false, true, null, false, null, null, 247));
                    return getShowPopup.INSTANCE;
                }
            } else {
                getMediaMimeType getmediamimetype10 = getMediaMimeType.MediaBrowserCompatCustomActionResultReceiver;
                Integer num10 = (Integer) map.get(getMediaMimeType.MediaBrowserCompatCustomActionResultReceiver);
                arrayList.add(new Pair(getmediamimetype10, QBankStatsResponse.RemoteActionCompatParcelizer(num10 != null ? num10.intValue() : 0)));
                Integer num11 = (Integer) map.get(getMediaMimeType.IconCompatParcelizer);
                int iIntValue = num11 != null ? num11.intValue() : 0;
                if (iIntValue > 0) {
                    arrayList.add(new Pair(getMediaMimeType.IconCompatParcelizer, QBankStatsResponse.RemoteActionCompatParcelizer(iIntValue)));
                }
                if (CommonReviewViewModel.this.IconCompatParcelizer().IconCompatParcelizer().getIconCompatParcelizer() == getMediaMimeType.IconCompatParcelizer) {
                    this.AudioAttributesCompatParcelizer = null;
                    this.read = arrayList;
                    this.write = iIntValue;
                    this.IconCompatParcelizer = 2;
                    obj = CommonReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(CommonReviewViewModel.this.getMediaMetadataCompat(), this);
                    if (obj != objIconCompatParcelizer) {
                        list3 = arrayList;
                        listRemoteActionCompatParcelizer = (List) obj;
                        list2 = list3;
                        CommonReviewViewModel.this.write.write(BottomNavigationView.IconCompatParcelizer(CommonReviewViewModel.this.IconCompatParcelizer().IconCompatParcelizer(), null, null, ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getIconCompatParcelizer(), ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getMediaBrowserCompatItemReceiver(), list2, listRemoteActionCompatParcelizer, 3));
                        CommonReviewViewModel.this.AudioAttributesCompatParcelizer.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), null, false, false, true, null, false, null, null, 247));
                        return getShowPopup.INSTANCE;
                    }
                } else {
                    listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    list2 = arrayList;
                    CommonReviewViewModel.this.write.write(BottomNavigationView.IconCompatParcelizer(CommonReviewViewModel.this.IconCompatParcelizer().IconCompatParcelizer(), null, null, ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getIconCompatParcelizer(), ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getMediaBrowserCompatItemReceiver(), list2, listRemoteActionCompatParcelizer, 3));
                    CommonReviewViewModel.this.AudioAttributesCompatParcelizer.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), null, false, false, true, null, false, null, null, 247));
                    return getShowPopup.INSTANCE;
                }
            }
            return objIconCompatParcelizer;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.setRtlTextDirectionHeuristicsEnabled
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.MediaMetadataCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getMediaMimeType IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getMimeTypeFromMp4ObjectType getmimetypefrommp4objecttype = CommonReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver;
                String mediaMetadataCompat = CommonReviewViewModel.this.getMediaMetadataCompat();
                getMediaMimeType getmediamimetype = this.IconCompatParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                obj = getmimetypefrommp4objecttype.RemoteActionCompatParcelizer(mediaMetadataCompat, getmediamimetype);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CommonReviewViewModel.this.read.write(setOnNavigationItemSelectedListener.AudioAttributesCompatParcelizer((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer(), null, null, this.IconCompatParcelizer, null, null, (List) obj, 19));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getMediaMimeType getmediamimetype, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = getmediamimetype;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new IconCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void read(getMediaMimeType getmediamimetype) {
        toMagicModuleMetaRepoModel.write(getmediamimetype, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(getmediamimetype, null), new MagicModuleSubmissionRequestBody() { // from class: o.setStatusBarScrimColor
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.MediaDescriptionCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void write(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        getResolutionSize<setOnNavigationItemSelectedListener> getresolutionsize = this.read;
        getresolutionsize.write(setOnNavigationItemSelectedListener.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, null, null, str, null, null, 55));
        this.MediaDescriptionCompat = str2;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getMimeTypeFromMp4ObjectType getmimetypefrommp4objecttype = CommonReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver;
                String mediaMetadataCompat = CommonReviewViewModel.this.getMediaMetadataCompat();
                getMediaMimeType getmediamimetype = getMediaMimeType.AudioAttributesImplBaseParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                obj = getmimetypefrommp4objecttype.RemoteActionCompatParcelizer(mediaMetadataCompat, getmediamimetype);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CommonReviewViewModel.this.read.write(setOnNavigationItemSelectedListener.AudioAttributesCompatParcelizer(CommonReviewViewModel.this.MediaBrowserCompatItemReceiver().IconCompatParcelizer(), null, null, getMediaMimeType.AudioAttributesImplBaseParcelizer, null, null, (List) obj, 19));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setTitleEnabled
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.onAddQueueItem((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private /* synthetic */ setOnMaskChangedListener IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            isSeekPending isseekpending;
            String str;
            String str2;
            String str3;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                obj = CommonReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(CommonReviewViewModel.this.getMediaMetadataCompat(), ((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getRemoteActionCompatParcelizer(), ((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getAudioAttributesCompatParcelizer(), null, this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str4 = (String) this.MediaBrowserCompatItemReceiver;
                String str5 = (String) this.AudioAttributesCompatParcelizer;
                isSeekPending isseekpending2 = (isSeekPending) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                isseekpending = isseekpending2;
                str2 = str4;
                str = str5;
                String str6 = (String) obj;
                String str7 = CommonReviewViewModel.this.MediaDescriptionCompat;
                StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3 styledPlayerControlViewLayoutManagerExternalSyntheticLambda3 = StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.write;
                isseekpending.write(interceptEvent.read(str, str2, str6, str7, StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.IconCompatParcelizer(getCustomMimeTypeForCodec.read(((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getWrite())), this.IconCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                return getShowPopup.INSTANCE;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            List list = (List) obj;
            getResolutionSize getresolutionsize = CommonReviewViewModel.this.read;
            getresolutionsize.write(setOnNavigationItemSelectedListener.IconCompatParcelizer(((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getRemoteActionCompatParcelizer(), ((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getAudioAttributesCompatParcelizer(), getMediaMimeType.AudioAttributesImplBaseParcelizer, null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer()));
            CommonReviewViewModel.this.AudioAttributesCompatParcelizer.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), list, false, false, false, null, false, null, null, 246));
            if (CommonReviewViewModel.this.AudioAttributesImplApi21Parcelizer) {
                isSeekPending isseekpending3 = CommonReviewViewModel.this.IconCompatParcelizer;
                setMenuAlignmentMode setmenualignmentmode = setMenuAlignmentMode.INSTANCE;
                if (((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer()).getWrite() == setOnMaskChangedListener.write) {
                    str3 = "cm_review_list";
                } else {
                    str3 = "cm_review_detail";
                }
                StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3 styledPlayerControlViewLayoutManagerExternalSyntheticLambda32 = StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.write;
                isseekpending3.write(setMenuAlignmentMode.IconCompatParcelizer("cm_review_filter", str3, StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.IconCompatParcelizer(getCustomMimeTypeForCodec.read(((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getWrite())), CommonReviewViewModel.this.MediaDescriptionCompat), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            } else if (CommonReviewViewModel.this.MediaBrowserCompatSearchResultReceiver && CommonReviewViewModel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
                isSeekPending isseekpending4 = CommonReviewViewModel.this.IconCompatParcelizer;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                String mediaMetadataCompat = CommonReviewViewModel.this.getMediaMetadataCompat();
                TestIndex testIndex = CommonReviewViewModel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                if (testIndex == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex = null;
                }
                String testType = testIndex.getTestType();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testType, "");
                crc32 crc32Var = CommonReviewViewModel.this.onCustomAction;
                TestIndex testIndex2 = CommonReviewViewModel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                if (testIndex2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    testIndex2 = null;
                }
                this.write = null;
                this.RemoteActionCompatParcelizer = isseekpending4;
                this.read = interceptevent;
                this.AudioAttributesCompatParcelizer = mediaMetadataCompat;
                this.MediaBrowserCompatItemReceiver = testType;
                this.MediaBrowserCompatCustomActionResultReceiver = 2;
                Object objRemoteActionCompatParcelizer = crc32Var.RemoteActionCompatParcelizer(testIndex2.getStartTimestamp(), this);
                if (objRemoteActionCompatParcelizer != objIconCompatParcelizer) {
                    isseekpending = isseekpending4;
                    obj = objRemoteActionCompatParcelizer;
                    str = mediaMetadataCompat;
                    str2 = testType;
                    String str62 = (String) obj;
                    String str72 = CommonReviewViewModel.this.MediaDescriptionCompat;
                    StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3 styledPlayerControlViewLayoutManagerExternalSyntheticLambda33 = StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.write;
                    isseekpending.write(interceptEvent.read(str, str2, str62, str72, StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.IconCompatParcelizer(getCustomMimeTypeForCodec.read(((setOnNavigationItemSelectedListener) CommonReviewViewModel.this.read.IconCompatParcelizer()).getWrite())), this.IconCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                }
                return objIconCompatParcelizer;
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(setOnMaskChangedListener setonmaskchangedlistener, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = setonmaskchangedlistener;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesCompatParcelizer(setOnMaskChangedListener setonmaskchangedlistener) {
        toMagicModuleMetaRepoModel.write(setonmaskchangedlistener, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(setonmaskchangedlistener, null), new MagicModuleSubmissionRequestBody() { // from class: o.HeaderScrollingViewBehavior
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.handleMediaPlayPauseIfPendingOnHandler((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ getMediaMimeType write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            BottomNavigationView bottomNavigationView;
            List listRemoteActionCompatParcelizer;
            getResolutionSize getresolutionsize2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getresolutionsize = CommonReviewViewModel.this.write;
                bottomNavigationView = (BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer();
                if (this.write == getMediaMimeType.IconCompatParcelizer) {
                    this.RemoteActionCompatParcelizer = bottomNavigationView;
                    this.IconCompatParcelizer = getresolutionsize;
                    this.AudioAttributesCompatParcelizer = 1;
                    Object objIconCompatParcelizer2 = CommonReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(CommonReviewViewModel.this.getMediaMetadataCompat(), this);
                    if (objIconCompatParcelizer2 == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    getresolutionsize2 = getresolutionsize;
                    obj = objIconCompatParcelizer2;
                } else {
                    listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    getresolutionsize.write(BottomNavigationView.IconCompatParcelizer(bottomNavigationView, null, null, this.write, null, null, listRemoteActionCompatParcelizer, 19));
                    return getShowPopup.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize2 = (getResolutionSize) this.IconCompatParcelizer;
                bottomNavigationView = (BottomNavigationView) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            listRemoteActionCompatParcelizer = (List) obj;
            getresolutionsize = getresolutionsize2;
            getresolutionsize.write(BottomNavigationView.IconCompatParcelizer(bottomNavigationView, null, null, this.write, null, null, listRemoteActionCompatParcelizer, 19));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(getMediaMimeType getmediamimetype, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.write = getmediamimetype;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new write(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(getMediaMimeType getmediamimetype) {
        toMagicModuleMetaRepoModel.write(getmediamimetype, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(getmediamimetype, null), new MagicModuleSubmissionRequestBody() { // from class: o.setScrimVisibleHeightTrigger
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.MediaBrowserCompatSearchResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void MediaBrowserCompatMediaItem(String str) {
        getResolutionSize<BottomNavigationView> getresolutionsize = this.write;
        getresolutionsize.write(BottomNavigationView.IconCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, null, null, str, null, null, 55));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            String str;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = CommonReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(CommonReviewViewModel.this.getMediaMetadataCompat(), ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getWrite(), null, ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getRead(), this);
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
            getResolutionSize getresolutionsize = CommonReviewViewModel.this.write;
            getMediaMimeType write = ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getWrite();
            String read = ((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getRead();
            List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            getresolutionsize.write(BottomNavigationView.AudioAttributesCompatParcelizer(write, read, getMediaMimeType.AudioAttributesImplBaseParcelizer, null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), listRemoteActionCompatParcelizer));
            CommonReviewViewModel.this.AudioAttributesCompatParcelizer.write(BottomNavigationMenuView.AudioAttributesCompatParcelizer((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), list, false, false, false, null, false, null, null, 246));
            isSeekPending isseekpending = CommonReviewViewModel.this.IconCompatParcelizer;
            setMenuAlignmentMode setmenualignmentmode = setMenuAlignmentMode.INSTANCE;
            if (((BottomNavigationMenuView) CommonReviewViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer()).getWrite() == setOnMaskChangedListener.write) {
                str = "qb_review_list";
            } else {
                str = "qb_review_detail";
            }
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3 styledPlayerControlViewLayoutManagerExternalSyntheticLambda3 = StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.write;
            isseekpending.write(setMenuAlignmentMode.IconCompatParcelizer("qb_review_filter", str, StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.IconCompatParcelizer(getCustomMimeTypeForCodec.read(((BottomNavigationView) CommonReviewViewModel.this.write.IconCompatParcelizer()).getIconCompatParcelizer())), null), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CommonReviewViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.CollapsingToolbarLayoutLayoutParams
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CommonReviewViewModel.onCommand((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCommand(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
