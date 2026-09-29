package com.marrow2.ui.test.landing;

import com.marrow.data.models.common.CourseConfigV2;
import com.marrow2.ui.test.landing.HomeTestViewModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Predicate;
import kotlin.C0178getStartTimestamp;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.LoyaltyPointsBalanceBuilder;
import kotlin.LoyaltyPointsBalanceType;
import kotlin.LoyaltyPointsBuilder;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TextModuleData;
import kotlin.TypeResolutionContextBasic;
import kotlin.UriData;
import kotlin.VerifyNewNumberRequest;
import kotlin.crc32;
import kotlin.getActionUri;
import kotlin.getAnswerMap;
import kotlin.getBigEndianInt;
import kotlin.getBody;
import kotlin.getCurrencyMicros;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.interceptEvent;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setBalance;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u00020GH\u0002J\b\u0010K\u001a\u00020GH\u0002J\b\u0010L\u001a\u00020GH\u0002J\u0012\u0010M\u001a\u00020G2\b\b\u0002\u0010N\u001a\u00020\u0013H\u0002J\u0012\u0010O\u001a\u00020G2\b\b\u0002\u0010P\u001a\u00020\u0013H\u0002J\u0014\u0010Q\u001a\u00020G2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J\u0014\u0010U\u001a\u00020G2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J\u001c\u0010V\u001a\u00020G2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020X0-H\u0082@¢\u0006\u0002\u0010YJ\u0016\u0010Z\u001a\u00020\u00132\f\u0010W\u001a\b\u0012\u0004\u0012\u00020X0-H\u0002J\u0016\u0010[\u001a\u00020\u00132\f\u0010W\u001a\b\u0012\u0004\u0012\u00020X0-H\u0002J\u0016\u0010\\\u001a\u00020\u00132\f\u0010W\u001a\b\u0012\u0004\u0012\u00020X0-H\u0002J\u0014\u0010]\u001a\u00020G2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J\b\u0010^\u001a\u00020GH\u0002J\b\u0010_\u001a\u00020GH\u0002J\u0018\u0010`\u001a\u00020G2\u0006\u0010a\u001a\u0002012\u0006\u0010H\u001a\u000201H\u0002J\b\u0010b\u001a\u00020GH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u000e\u0010#\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u0017¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020 0\u0017¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u001e\u0010,\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001bj\u0002`\u001c0-0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010.\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u001bj\u0002`\u001c0-0\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0017¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0019R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0019R\u0014\u00108\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010=\u001a\f\u0012\b\u0012\u00060\u001bj\u0002`\u001c0>X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010?\u001a\f\u0012\b\u0012\u00060\u001bj\u0002`\u001c0>X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u0017¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0019R\u001e\u0010D\u001a\u0012\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\u0004\u0012\u00020\u00130EX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/marrow2/ui/test/landing/HomeTestViewModel;", "Landroidx/lifecycle/ViewModel;", "courseConfigUseCase", "Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;", "testUseCase", "Lcom/marrow2/domain/test/TestUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "testListTransformer", "Lcom/marrow2/ui/test/landing/model/transformer/TestListTransformer;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/marrow2/domain/courseConfig/CourseConfigUseCase;Lcom/marrow2/domain/test/TestUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow2/ui/test/landing/model/transformer/TestListTransformer;Lcom/marrow/dranalytics/base/AnalyticPublisher;Landroidx/lifecycle/SavedStateHandle;)V", "args", "Lcom/marrow2/ui/test/landing/model/HomeTestArgument;", "currentSelectedYear", "", "_currentTabPosition", "Lkotlinx/coroutines/flow/MutableStateFlow;", "currentTabPosition", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentTabPosition", "()Lkotlinx/coroutines/flow/StateFlow;", "currentTab", "Lcom/marrow/data/models/common/CourseConfigV2$TestTabItem;", "Lcom/marrow2/domain/courseConfig/model/TestTabItemUCModel;", "getCurrentTab", "()Lcom/marrow/data/models/common/CourseConfigV2$TestTabItem;", "_showToolbar", "", "showToolbar", "getShowToolbar", "isGTBannerDismissed", "_testUiState", "Lcom/marrow2/core/utils/VMState;", "Lcom/marrow2/ui/test/landing/model/TestTabUiModel;", "testListState", "getTestListState", "_hasSubscriptionState", "hasSubscriptionState", "getHasSubscriptionState", "_tabsState", "", "tabsState", "getTabsState", "_error", "", "error", "getError", "_navigateUiState", "Lcom/marrow2/ui/test/landing/model/TestLandingNavigateUiState;", "navigateUiState", "getNavigateUiState", "isCurrentYearSelected", "()Z", "_nudgeUIState", "Lcom/marrow2/ui/test/landing/model/GTNudgeContentVMModel;", "isOtherBannerVisible", "expandedAllTabState", "", "initialLoadedTabState", "_gtAnalyticsCardUiState", "Lcom/marrow2/ui/test/landing/model/GTAnalyticsCardUiModel;", "gtAnalyticsCardUiState", "getGtAnalyticsCardUiState", "_scrolledIndexForTabs", "Ljava/util/EnumMap;", "notifyEvent", "", "event", "Lcom/marrow2/ui/test/landing/model/TestLandingEvent;", "onGTNudgeDismissed", "removeNudge", "initialLoad", "setCurrentTab", "position", "loadData", "tabPosition", "onTestSelect", "test", "Lcom/marrow2/domain/test/model/TestMiniUCModel;", "Lcom/marrow2/ui/test/landing/model/TestMiniVMModel;", "sendTestEvent", "checkSetForExpandCollapse", "models", "Lcom/marrow2/ui/test/landing/model/TestListAdapterItemTypeModel;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTestItemInitialScrollPosition", "getCurrentMonthPosition", "getLastExpiredTestPosition", "sendEventBasedOnTestTime", "processMaybeLaterClick", "processStartTestClick", "processEvent", "eventSource", "expandAllTheItems", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeTestViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<TextModuleData> AudioAttributesCompatParcelizer;
    private final getResolutionSize<List<CourseConfigV2.TestTabItem>> AudioAttributesImplApi21Parcelizer;
    private final getResolutionSize<getCurrencyMicros> AudioAttributesImplApi26Parcelizer;
    private final EnumMap<CourseConfigV2.TestTabItem, Integer> AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<LoyaltyPointsBuilder> IconCompatParcelizer;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<C0178getStartTimestamp>> MediaBrowserCompatCustomActionResultReceiver;
    private final getResolutionSize<Boolean> MediaBrowserCompatItemReceiver;
    private final LogLogLevel MediaBrowserCompatMediaItem;
    private final setUpdatedStatus<Integer> MediaBrowserCompatSearchResultReceiver;
    private final List<CourseConfigV2.TestTabItem> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final isSeekPending MediaDescriptionCompat;
    private final setBalance MediaMetadataCompat;
    private int RatingCompat;
    private final getResolutionSize<Boolean> RemoteActionCompatParcelizer;
    private final List<CourseConfigV2.TestTabItem> handleMediaPlayPauseIfPendingOnHandler;
    private final setUpdatedStatus<Boolean> onAddQueueItem;
    private final setUpdatedStatus<LoyaltyPointsBuilder> onCommand;
    private final setUpdatedStatus<String> onCustomAction;
    private boolean onFastForward;
    private final setUpdatedStatus<TextModuleData> onMediaButtonEvent;
    private final setUpdatedStatus<List<CourseConfigV2.TestTabItem>> onPause;
    private final setUpdatedStatus<Boolean> onPlay;
    private boolean onPlayFromMediaId;
    private final UriData onPlayFromSearch;
    private final crc32 onPlayFromUri;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<C0178getStartTimestamp>> onPrepare;
    private final getDisplaySizeV17 onPrepareFromMediaId;
    private final getResolutionSize<String> read;
    private final getResolutionSize<Integer> write;

    static final class write extends getTotalMcq {
        int RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return HomeTestViewModel.this.AudioAttributesCompatParcelizer((List<? extends getBody>) null, this);
        }
    }

    @setSdkPayload
    public HomeTestViewModel(LogLogLevel logLogLevel, crc32 crc32Var, getDisplaySizeV17 getdisplaysizev17, UriData uriData, isSeekPending isseekpending, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(uriData, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.MediaBrowserCompatMediaItem = logLogLevel;
        this.onPlayFromUri = crc32Var;
        this.onPrepareFromMediaId = getdisplaysizev17;
        this.onPlayFromSearch = uriData;
        this.MediaDescriptionCompat = isseekpending;
        setBalance.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = setBalance.read;
        setBalance setbalance = setBalance.AudioAttributesCompatParcelizer.read(pOJOPropertyBuilder5);
        this.MediaMetadataCompat = setbalance;
        this.RatingCompat = setbalance.getAudioAttributesCompatParcelizer();
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(-1);
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.valueOf(setbalance.getWrite()));
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.onPlay = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<C0178getStartTimestamp>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.onPrepare = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<List<CourseConfigV2.TestTabItem>> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onPause = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer("");
        this.read = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onCustomAction = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<TextModuleData> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(TextModuleData.read.INSTANCE);
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onMediaButtonEvent = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        this.AudioAttributesImplApi26Parcelizer = setStartTime.RemoteActionCompatParcelizer(new getCurrencyMicros(null, null, null, 0, 0, false, 0, 127, null));
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new ArrayList();
        this.handleMediaPlayPauseIfPendingOnHandler = new ArrayList();
        getResolutionSize<LoyaltyPointsBuilder> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer(new LoyaltyPointsBuilder(false, null, null, null, 15, null));
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onCommand = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer8);
        this.AudioAttributesImplBaseParcelizer = new EnumMap<>(CourseConfigV2.TestTabItem.class);
        RatingCompat();
    }

    public final setUpdatedStatus<Integer> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    private final CourseConfigV2.TestTabItem MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().get(this.write.IconCompatParcelizer().intValue());
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer() {
        return this.onPlay;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<C0178getStartTimestamp>> AudioAttributesImplApi21Parcelizer() {
        return this.onPrepare;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onAddQueueItem;
    }

    public final setUpdatedStatus<List<CourseConfigV2.TestTabItem>> AudioAttributesImplBaseParcelizer() {
        return this.onPause;
    }

    public final setUpdatedStatus<String> read() {
        return this.onCustomAction;
    }

    public final setUpdatedStatus<TextModuleData> MediaBrowserCompatItemReceiver() {
        return this.onMediaButtonEvent;
    }

    private final boolean MediaMetadataCompat() {
        return this.RatingCompat == Calendar.getInstance().get(1);
    }

    public final setUpdatedStatus<LoyaltyPointsBuilder> IconCompatParcelizer() {
        return this.onCommand;
    }

    public final void read(LoyaltyPointsBalanceType loyaltyPointsBalanceType) {
        toMagicModuleMetaRepoModel.write(loyaltyPointsBalanceType, "");
        if (loyaltyPointsBalanceType instanceof LoyaltyPointsBalanceType.AudioAttributesImplApi26Parcelizer) {
            read(((LoyaltyPointsBalanceType.AudioAttributesImplApi26Parcelizer) loyaltyPointsBalanceType).IconCompatParcelizer());
            return;
        }
        if (loyaltyPointsBalanceType instanceof LoyaltyPointsBalanceType.AudioAttributesImplApi21Parcelizer) {
            AudioAttributesCompatParcelizer(((LoyaltyPointsBalanceType.AudioAttributesImplApi21Parcelizer) loyaltyPointsBalanceType).read());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loyaltyPointsBalanceType, LoyaltyPointsBalanceType.MediaBrowserCompatMediaItem.INSTANCE)) {
            RatingCompat(this);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loyaltyPointsBalanceType, LoyaltyPointsBalanceType.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            this.AudioAttributesCompatParcelizer.write(TextModuleData.read.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loyaltyPointsBalanceType, LoyaltyPointsBalanceType.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loyaltyPointsBalanceType, LoyaltyPointsBalanceType.RatingCompat.INSTANCE)) {
            onCommand();
            return;
        }
        if (loyaltyPointsBalanceType instanceof LoyaltyPointsBalanceType.RemoteActionCompatParcelizer) {
            LoyaltyPointsBalanceType.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (LoyaltyPointsBalanceType.RemoteActionCompatParcelizer) loyaltyPointsBalanceType;
            AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer.write());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loyaltyPointsBalanceType, LoyaltyPointsBalanceType.AudioAttributesCompatParcelizer.INSTANCE)) {
            MediaDescriptionCompat();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loyaltyPointsBalanceType, LoyaltyPointsBalanceType.write.INSTANCE)) {
            if (this.handleMediaPlayPauseIfPendingOnHandler.contains(MediaBrowserCompatSearchResultReceiver())) {
                return;
            }
            this.handleMediaPlayPauseIfPendingOnHandler.add(MediaBrowserCompatSearchResultReceiver());
            return;
        }
        if (loyaltyPointsBalanceType instanceof LoyaltyPointsBalanceType.MediaMetadataCompat) {
            this.AudioAttributesImplBaseParcelizer.put(MediaBrowserCompatSearchResultReceiver(), Integer.valueOf(((LoyaltyPointsBalanceType.MediaMetadataCompat) loyaltyPointsBalanceType).RemoteActionCompatParcelizer()));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loyaltyPointsBalanceType, LoyaltyPointsBalanceType.IconCompatParcelizer.INSTANCE)) {
            isSeekPending isseekpending = this.MediaDescriptionCompat;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            isseekpending.write(interceptEvent.RemoteActionCompatParcelizer("test_tab"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.AudioAttributesCompatParcelizer.write(TextModuleData.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (loyaltyPointsBalanceType instanceof LoyaltyPointsBalanceType.MediaBrowserCompatItemReceiver) {
            isSeekPending isseekpending2 = this.MediaDescriptionCompat;
            interceptEvent interceptevent2 = interceptEvent.INSTANCE;
            isseekpending2.write(interceptEvent.IconCompatParcelizer(((LoyaltyPointsBalanceType.MediaBrowserCompatItemReceiver) loyaltyPointsBalanceType).write()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else {
            if (!(loyaltyPointsBalanceType instanceof LoyaltyPointsBalanceType.read)) {
                throw new RenewEligibleCreator();
            }
            MediaBrowserCompatMediaItem();
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (HomeTestViewModel.this.onPlayFromUri.MediaBrowserCompatItemReceiver(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            HomeTestViewModel.this.onCustomAction();
            isSeekPending isseekpending = HomeTestViewModel.this.MediaDescriptionCompat;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            isseekpending.write(interceptEvent.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeTestViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        this.onPlayFromMediaId = true;
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getCallbackType
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeTestViewModel.MediaBrowserCompatItemReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomAction() {
        C0178getStartTimestamp c0178getStartTimestampRemoteActionCompatParcelizer = this.onPrepare.IconCompatParcelizer().RemoteActionCompatParcelizer();
        if (c0178getStartTimestampRemoteActionCompatParcelizer != null) {
            List listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) c0178getStartTimestampRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.onRunTask
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(HomeTestViewModel.RemoteActionCompatParcelizer((getBody) obj));
                }
            };
            listMediaBrowserCompatItemReceiver.removeIf(new Predicate() { // from class: o.deserializeRequest
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return HomeTestViewModel.AudioAttributesCompatParcelizer(getanswermap, obj);
                }
            });
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, new C0178getStartTimestamp(c0178getStartTimestampRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer(), listMediaBrowserCompatItemReceiver, c0178getStartTimestampRemoteActionCompatParcelizer.getRead(), c0178getStartTimestampRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        return ((Boolean) getanswermap.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(getBody getbody) {
        toMagicModuleMetaRepoModel.write(getbody, "");
        return getbody instanceof getBody.IconCompatParcelizer;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private Object read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = HomeTestViewModel.this.AudioAttributesImplApi21Parcelizer;
                this.read = getresolutionsize2;
                this.RemoteActionCompatParcelizer = 1;
                Object objWrite = HomeTestViewModel.this.MediaBrowserCompatMediaItem.write(this);
                if (objWrite == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                getresolutionsize = getresolutionsize2;
                obj = objWrite;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getresolutionsize.write(((CourseConfigV2) obj).getTestTabItems());
            HomeTestViewModel homeTestViewModel = HomeTestViewModel.this;
            homeTestViewModel.read(new LoyaltyPointsBalanceType.AudioAttributesImplApi21Parcelizer(homeTestViewModel.MediaMetadataCompat.getIconCompatParcelizer()));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeTestViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.BasePaymentDataCallbacksService
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeTestViewModel.read(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(HomeTestViewModel homeTestViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        homeTestViewModel.read.write(str);
        return getShowPopup.INSTANCE;
    }

    private static /* synthetic */ void RatingCompat(HomeTestViewModel homeTestViewModel) {
        homeTestViewModel.AudioAttributesCompatParcelizer(homeTestViewModel.write.IconCompatParcelizer().intValue());
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        if (this.write.IconCompatParcelizer().intValue() != i) {
            this.write.write(Integer.valueOf(i));
        }
        IconCompatParcelizer(i);
    }

    private final void IconCompatParcelizer(int i) {
        if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().isEmpty() || i == -1) {
            return;
        }
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(i, null), new MagicModuleSubmissionRequestBody() { // from class: o.onPaymentDataChanged
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeTestViewModel.write(this.write, (String) obj2);
            }
        });
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private boolean MediaBrowserCompatSearchResultReceiver;
        private Object MediaDescriptionCompat;
        private boolean RatingCompat;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private long read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:58:0x02db, code lost:
        
            if (r5.AudioAttributesCompatParcelizer((java.util.List<? extends kotlin.getBody>) r0, r24) != r12) goto L60;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0138 A[PHI: r0
          0x0138: PHI (r0v9 java.lang.Object) = (r0v6 java.lang.Object), (r0v11 java.lang.Object) binds: [B:17:0x0136, B:12:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x021e A[PHI: r0 r1 r2 r3 r4 r5 r6 r7 r8 r9 r10 r13
          0x021e: PHI (r0v19 int) = (r0v16 int), (r0v21 int) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r1v17 int) = (r1v13 int), (r1v19 int) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r2v17 boolean) = (r2v13 boolean), (r2v19 boolean) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r3v16 boolean) = (r3v12 boolean), (r3v18 boolean) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r4v13 int) = (r4v8 int), (r4v14 int) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r5v21 java.util.List<o.getBigEndianInt>) = (r5v17 java.util.ArrayList), (r5v23 java.util.List<o.getBigEndianInt>) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r6v9 o.UriData) = (r6v5 o.UriData), (r6v11 o.UriData) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r7v7 o.durationUsToSampleCount) = (r7v3 o.durationUsToSampleCount), (r7v10 o.durationUsToSampleCount) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v7 java.lang.String) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r9v3 java.util.List<o.getBigEndianInt>) = (r9v1 java.util.List<o.getBigEndianInt>), (r9v6 java.util.List<o.getBigEndianInt>) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r10v6 java.lang.Object) = (r10v2 java.lang.Object), (r10v10 java.lang.Object) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x021e: PHI (r13v3 com.marrow2.ui.test.landing.HomeTestViewModel) = (r13v1 com.marrow2.ui.test.landing.HomeTestViewModel), (r13v8 com.marrow2.ui.test.landing.HomeTestViewModel) binds: [B:43:0x021c, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0261  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0294  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x02a1  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 760
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.landing.HomeTestViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(int i, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeTestViewModel.this.new IconCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(HomeTestViewModel homeTestViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        homeTestViewModel.read.write(str);
        return getShowPopup.INSTANCE;
    }

    private final void read(getBigEndianInt getbigendianint) {
        write(getbigendianint);
        RemoteActionCompatParcelizer(getbigendianint);
        if (getbigendianint.getAudioAttributesImplApi21Parcelizer() == 2) {
            this.AudioAttributesCompatParcelizer.write(new TextModuleData.write(getbigendianint.getWrite()));
        } else {
            this.AudioAttributesCompatParcelizer.write(new TextModuleData.RemoteActionCompatParcelizer(getbigendianint.getWrite()));
        }
    }

    private final void RemoteActionCompatParcelizer(getBigEndianInt getbigendianint) {
        interceptEvent.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (getbigendianint.getAudioAttributesImplBaseParcelizer() == -2) {
            remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.write;
        } else {
            int audioAttributesImplApi21Parcelizer = getbigendianint.getAudioAttributesImplApi21Parcelizer();
            if (audioAttributesImplApi21Parcelizer == 0) {
                remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.IconCompatParcelizer;
            } else if (audioAttributesImplApi21Parcelizer == 1) {
                remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            } else if (audioAttributesImplApi21Parcelizer == 2) {
                remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.read;
            } else {
                remoteActionCompatParcelizer = interceptEvent.RemoteActionCompatParcelizer.read;
            }
        }
        isSeekPending isseekpending = this.MediaDescriptionCompat;
        interceptEvent interceptevent = interceptEvent.INSTANCE;
        isseekpending.write(interceptEvent.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, getbigendianint.getOnAddQueueItem(), getbigendianint.getWrite(), getbigendianint.getAudioAttributesCompatParcelizer(), "test_tab"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.util.List<? extends kotlin.getBody> r12, kotlin.SampleVideos<? super kotlin.getShowPopup> r13) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.landing.HomeTestViewModel.AudioAttributesCompatParcelizer(java.util.List, o.SampleVideos):java.lang.Object");
    }

    private static int IconCompatParcelizer(List<? extends getBody> list) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(list);
        return iRemoteActionCompatParcelizer != -1 ? iRemoteActionCompatParcelizer : AudioAttributesCompatParcelizer(list);
    }

    private static int AudioAttributesCompatParcelizer(List<? extends getBody> list) {
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            getBody getbody = (getBody) obj;
            if ((getbody instanceof getBody.AudioAttributesCompatParcelizer) && ((getBody.AudioAttributesCompatParcelizer) getbody).getAudioAttributesCompatParcelizer() == LoyaltyPointsBalanceBuilder.RemoteActionCompatParcelizer) {
                return i - 2;
            }
            i++;
        }
        return -1;
    }

    private static int RemoteActionCompatParcelizer(List<? extends getBody> list) {
        int i = -1;
        int i2 = 0;
        for (Object obj : list) {
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            getBody getbody = (getBody) obj;
            if ((getbody instanceof getBody.MediaBrowserCompatItemReceiver) && ((getBody.MediaBrowserCompatItemReceiver) getbody).IconCompatParcelizer().getOnAddQueueItem() == 2) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    private final void write(getBigEndianInt getbigendianint) {
        String str = getActionUri.read(MediaBrowserCompatSearchResultReceiver());
        if (MediaMetadataCompat()) {
            if (getbigendianint.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                isSeekPending isseekpending = this.MediaDescriptionCompat;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                isseekpending.write(interceptEvent.AudioAttributesImplApi26Parcelizer(str), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
                return;
            } else if (getbigendianint.MediaDescriptionCompat()) {
                isSeekPending isseekpending2 = this.MediaDescriptionCompat;
                interceptEvent interceptevent2 = interceptEvent.INSTANCE;
                isseekpending2.write(interceptEvent.AudioAttributesImplApi26Parcelizer(str), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
                return;
            } else {
                if (getbigendianint.onAddQueueItem()) {
                    isSeekPending isseekpending3 = this.MediaDescriptionCompat;
                    interceptEvent interceptevent3 = interceptEvent.INSTANCE;
                    isseekpending3.write(interceptEvent.read(str), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
                    return;
                }
                return;
            }
        }
        isSeekPending isseekpending4 = this.MediaDescriptionCompat;
        interceptEvent interceptevent4 = interceptEvent.INSTANCE;
        isseekpending4.write(interceptEvent.AudioAttributesCompatParcelizer(str, String.valueOf(this.RatingCompat)), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = HomeTestViewModel.this.MediaDescriptionCompat;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                isseekpending.write(interceptEvent.IconCompatParcelizer(((getCurrencyMicros) HomeTestViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()).getRemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new updateLoadingFinished[]{updateLoadingFinished.AudioAttributesCompatParcelizer, updateLoadingFinished.RemoteActionCompatParcelizer}));
                this.IconCompatParcelizer = 1;
                if (HomeTestViewModel.this.onPlayFromUri.MediaBrowserCompatItemReceiver(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getResolutionSize getresolutionsize = HomeTestViewModel.this.AudioAttributesImplApi26Parcelizer;
            getCurrencyMicros getcurrencymicros = (getCurrencyMicros) HomeTestViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            getresolutionsize.write(getCurrencyMicros.AudioAttributesCompatParcelizer(getcurrencymicros.read, getcurrencymicros.write, getcurrencymicros.IconCompatParcelizer, getcurrencymicros.AudioAttributesImplApi26Parcelizer, getcurrencymicros.MediaBrowserCompatCustomActionResultReceiver, false, getcurrencymicros.RemoteActionCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeTestViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.CallbackInput
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeTestViewModel.AudioAttributesImplApi21Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (((getCurrencyMicros) HomeTestViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()).getIconCompatParcelizer().length() > 0) {
                    HomeTestViewModel.this.AudioAttributesCompatParcelizer.write(new TextModuleData.RemoteActionCompatParcelizer(((getCurrencyMicros) HomeTestViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()).getIconCompatParcelizer()));
                    isSeekPending isseekpending = HomeTestViewModel.this.MediaDescriptionCompat;
                    interceptEvent interceptevent = interceptEvent.INSTANCE;
                    isseekpending.write(interceptEvent.AudioAttributesImplApi26Parcelizer(((getCurrencyMicros) HomeTestViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()).getRemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new updateLoadingFinished[]{updateLoadingFinished.AudioAttributesCompatParcelizer, updateLoadingFinished.RemoteActionCompatParcelizer}));
                    this.write = 1;
                    if (HomeTestViewModel.this.onPlayFromUri.MediaBrowserCompatItemReceiver(this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return getShowPopup.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            getResolutionSize getresolutionsize = HomeTestViewModel.this.AudioAttributesImplApi26Parcelizer;
            getCurrencyMicros getcurrencymicros = (getCurrencyMicros) HomeTestViewModel.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            getresolutionsize.write(getCurrencyMicros.AudioAttributesCompatParcelizer(getcurrencymicros.read, getcurrencymicros.write, getcurrencymicros.IconCompatParcelizer, getcurrencymicros.AudioAttributesImplApi26Parcelizer, getcurrencymicros.MediaBrowserCompatCustomActionResultReceiver, false, getcurrencymicros.RemoteActionCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeTestViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onCommand() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setRequestBytes
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeTestViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ HomeTestViewModel read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) "show_gt_nudge")) {
                    this.read.onFastForward = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) "false");
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) "false")) {
                        getResolutionSize getresolutionsize = this.read.AudioAttributesImplApi26Parcelizer;
                        getCurrencyMicros getcurrencymicros = (getCurrencyMicros) this.read.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
                        getresolutionsize.write(getCurrencyMicros.AudioAttributesCompatParcelizer(getcurrencymicros.read, getcurrencymicros.write, getcurrencymicros.IconCompatParcelizer, getcurrencymicros.AudioAttributesImplApi26Parcelizer, getcurrencymicros.MediaBrowserCompatCustomActionResultReceiver, false, getcurrencymicros.RemoteActionCompatParcelizer));
                    } else {
                        this.IconCompatParcelizer = 1;
                        obj = this.read.onPlayFromUri.AudioAttributesCompatParcelizer(this);
                        if (obj == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    }
                }
                return getShowPopup.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            if (((Boolean) obj).booleanValue()) {
                getResolutionSize getresolutionsize2 = this.read.AudioAttributesImplApi26Parcelizer;
                getCurrencyMicros getcurrencymicros2 = (getCurrencyMicros) this.read.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
                getresolutionsize2.write(getCurrencyMicros.AudioAttributesCompatParcelizer(getcurrencymicros2.read, getcurrencymicros2.write, getcurrencymicros2.IconCompatParcelizer, getcurrencymicros2.AudioAttributesImplApi26Parcelizer, getcurrencymicros2.MediaBrowserCompatCustomActionResultReceiver, true, getcurrencymicros2.RemoteActionCompatParcelizer));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, HomeTestViewModel homeTestViewModel, String str2, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.read = homeTestViewModel;
            this.write = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new read(this.RemoteActionCompatParcelizer, this.read, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(String str, String str2) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(str, this, str2, null), new MagicModuleSubmissionRequestBody() { // from class: o.CallbackInputBuilder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeTestViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void MediaDescriptionCompat() {
        List<getBody> listAudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().read().AudioAttributesCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(MediaBrowserCompatSearchResultReceiver());
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, new C0178getStartTimestamp(MediaMetadataCompat(), getActionUri.write(listAudioAttributesCompatParcelizer), -1, false, 8, null));
    }
}
