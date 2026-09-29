package com.marrow2.ui.pearl.viewmodel;

import com.marrow.data.models.test.TestIndex;
import com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel;
import java.util.List;
import kotlin.AndroidUtilsLight;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.ConnectionTracker;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.DtsReader;
import kotlin.InstallStatusListener;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LoggingConstants;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.StatsEvent;
import kotlin.ThemeState;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.decodeBitmap;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.readLittleEndianUnsignedShort;
import kotlin.setCountry;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.unbindServiceSafe;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020.H\u0002J\u0012\u00102\u001a\u00020.2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u00103\u001a\u00020.H\u0002J\b\u00104\u001a\u00020.H\u0002J\b\u00105\u001a\u00020.H\u0002J\u0010\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020\u001dH\u0002J\b\u00108\u001a\u00020.H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00120\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00120\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020!0\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0017¨\u00069"}, d2 = {"Lcom/marrow2/ui/pearl/viewmodel/PearlDetailInnerViewModel;", "Landroidx/lifecycle/ViewModel;", "pearlUseCase", "Lcom/marrow2/domain/pearl/PearlUseCase;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "analyticPublisher", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Lcom/marrow2/domain/pearl/PearlUseCase;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/SavedStateHandle;Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "getAnalyticPublisher", "()Lcom/marrow/dranalytics/base/AnalyticPublisher;", "_args", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/pearl/model/PearlDetailArgs;", "_pearl", "Lcom/marrow2/core/utils/VMState;", "Lcom/marrow2/ui/pearl/model/PearlUIModel;", "pearl", "Lkotlinx/coroutines/flow/SharedFlow;", "getPearl", "()Lkotlinx/coroutines/flow/SharedFlow;", "_bookmarkType", "", "bookmarkType", "getBookmarkType", "_error", "", "error", "getError", "_shareButtonState", "", "shareButtonState", "getShareButtonState", "_pearlHeaderUIModel", "Lcom/marrow2/ui/pearl/model/PearlHeader;", "pearlHeaderUIModel", "getPearlHeaderUIModel", "_navigationState", "Lcom/marrow2/ui/pearl/model/PearlDetailNavigateUiState;", "navigationState", "getNavigationState", "isPreviewMode", "notifyEvent", "", "event", "Lcom/marrow2/ui/pearl/model/PearlDetailNavigateEvent;", "loadPearl", "onBookmarkClicked", "onShare", "onRelatedMcqClicked", "getHeaderInfo", "onFeedbackSubmit", "message", "onReportError", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PearlDetailInnerViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<ConnectionTracker> AudioAttributesCompatParcelizer;
    private final isDark<String> AudioAttributesImplApi21Parcelizer;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean>> AudioAttributesImplApi26Parcelizer;
    private final isSeekPending AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<Integer> IconCompatParcelizer;
    private final isDark<Integer> MediaBrowserCompatCustomActionResultReceiver;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<StatsEvent>> MediaBrowserCompatItemReceiver;
    private final isDark<unbindServiceSafe> MediaBrowserCompatMediaItem;
    private final isDark<Boolean> MediaBrowserCompatSearchResultReceiver;
    private final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<AndroidUtilsLight>> MediaDescriptionCompat;
    private final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<StatsEvent>> MediaMetadataCompat;
    private final getPlatform RatingCompat;
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<AndroidUtilsLight>> RemoteActionCompatParcelizer;
    private final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean>> onAddQueueItem;
    private final readLittleEndianUnsignedShort onCustomAction;
    private final getResolutionSize<unbindServiceSafe> read;
    private final getResolutionSize<String> write;

    @setSdkPayload
    public PearlDetailInnerViewModel(readLittleEndianUnsignedShort readlittleendianunsignedshort, getPlatform getplatform, POJOPropertyBuilder5 pOJOPropertyBuilder5, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(readlittleendianunsignedshort, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.onCustomAction = readlittleendianunsignedshort;
        this.RatingCompat = getplatform;
        this.AudioAttributesImplBaseParcelizer = isseekpending;
        ConnectionTracker.IconCompatParcelizer iconCompatParcelizer = ConnectionTracker.RemoteActionCompatParcelizer;
        getResolutionSize<ConnectionTracker> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(ConnectionTracker.IconCompatParcelizer.read(pOJOPropertyBuilder5));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<AndroidUtilsLight>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(-1);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer("");
        this.write = getresolutionsizeRemoteActionCompatParcelizer4;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean>> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(new decodeBitmap(Boolean.TRUE));
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onAddQueueItem = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<StatsEvent>> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer6;
        this.MediaMetadataCompat = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<unbindServiceSafe> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(unbindServiceSafe.write.INSTANCE);
        this.read = getresolutionsizeRemoteActionCompatParcelizer7;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer7);
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) setStartTime.RemoteActionCompatParcelizer(Boolean.valueOf(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getresolutionsizeRemoteActionCompatParcelizer.IconCompatParcelizer().getRead(), (Object) TestIndex.ALL_INDIA_ID))));
        MediaDescriptionCompat();
    }

    public final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<AndroidUtilsLight>> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final isDark<Integer> IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final isDark<String> read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean>> MediaBrowserCompatItemReceiver() {
        return this.onAddQueueItem;
    }

    public final isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<StatsEvent>> AudioAttributesImplApi21Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final isDark<unbindServiceSafe> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final isDark<Boolean> AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(LoggingConstants loggingConstants) {
        toMagicModuleMetaRepoModel.write(loggingConstants, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loggingConstants, LoggingConstants.read.INSTANCE)) {
            if (loggingConstants instanceof LoggingConstants.AudioAttributesCompatParcelizer) {
                AudioAttributesCompatParcelizer(((LoggingConstants.AudioAttributesCompatParcelizer) loggingConstants).IconCompatParcelizer());
                return;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loggingConstants, LoggingConstants.RemoteActionCompatParcelizer.INSTANCE)) {
                MediaBrowserCompatMediaItem();
                return;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loggingConstants, LoggingConstants.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                MediaMetadataCompat();
                return;
            }
            if (loggingConstants instanceof LoggingConstants.write) {
                RemoteActionCompatParcelizer(((LoggingConstants.write) loggingConstants).AudioAttributesCompatParcelizer());
                return;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loggingConstants, LoggingConstants.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                MediaBrowserCompatSearchResultReceiver();
                return;
            }
            if (loggingConstants instanceof LoggingConstants.MediaBrowserCompatItemReceiver) {
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, Boolean.TRUE);
                AndroidUtilsLight androidUtilsLightRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
                if (androidUtilsLightRemoteActionCompatParcelizer != null) {
                    CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(androidUtilsLightRemoteActionCompatParcelizer, loggingConstants, null), new MagicModuleSubmissionRequestBody() { // from class: o.areJsonValuesEquivalent
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return PearlDetailInnerViewModel.write((String) obj2);
                        }
                    });
                    return;
                }
                return;
            }
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(loggingConstants, LoggingConstants.IconCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending = this.AudioAttributesImplBaseParcelizer;
            InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
            isseekpending.write(InstallStatusListener.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.read.write(unbindServiceSafe.IconCompatParcelizer.INSTANCE);
            return;
        }
        AudioAttributesCompatParcelizer(-1);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ LoggingConstants AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ AndroidUtilsLight read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                PearlDetailInnerViewModel.this.read.write(new unbindServiceSafe.RemoteActionCompatParcelizer(this.read.MediaDescriptionCompat(), ((LoggingConstants.MediaBrowserCompatItemReceiver) this.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer()));
                this.RemoteActionCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(100L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            PearlDetailInnerViewModel.this.read.write(unbindServiceSafe.write.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(AndroidUtilsLight androidUtilsLight, LoggingConstants loggingConstants, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = androidUtilsLight;
            this.AudioAttributesCompatParcelizer = loggingConstants;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlDetailInnerViewModel.this.new IconCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel$RemoteActionCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int read;
            private /* synthetic */ PearlDetailInnerViewModel write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.read = 1;
                    obj = this.write.onCustomAction.write(((ConnectionTracker) this.write.AudioAttributesCompatParcelizer.IconCompatParcelizer()).getRead(), this);
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
                if (androidUtilsLight == null) {
                    this.write.write.write("Pearl Not Found");
                    DtsReader.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(new Exception("Pearl Not Found ".concat(String.valueOf(((ConnectionTracker) this.write.AudioAttributesCompatParcelizer.IconCompatParcelizer()).getRead()))));
                } else {
                    lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.write.RemoteActionCompatParcelizer, androidUtilsLight);
                    this.write.IconCompatParcelizer.write(QBankStatsResponse.RemoteActionCompatParcelizer(androidUtilsLight.IconCompatParcelizer()));
                    this.write.AudioAttributesImplBaseParcelizer();
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PearlDetailInnerViewModel pearlDetailInnerViewModel, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.write = pearlDetailInnerViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(PearlDetailInnerViewModel.this.RatingCompat, new AnonymousClass3(PearlDetailInnerViewModel.this, null), this) == objIconCompatParcelizer) {
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlDetailInnerViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaDescriptionCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.HttpUtils
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlDetailInnerViewModel.write(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(PearlDetailInnerViewModel pearlDetailInnerViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        pearlDetailInnerViewModel.write.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(int i) {
        if (((Boolean) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) this.MediaBrowserCompatSearchResultReceiver.bm_())).booleanValue()) {
            return;
        }
        final int iIntValue = this.IconCompatParcelizer.IconCompatParcelizer().intValue();
        if (i == -1) {
            i = iIntValue > 0 ? 0 : 1;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(i, iIntValue, null), new MagicModuleSubmissionRequestBody() { // from class: o.HexDumpUtils
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlDetailInnerViewModel.write(this.write, iIntValue, (String) obj2);
            }
        });
        isSeekPending isseekpending = this.AudioAttributesImplBaseParcelizer;
        InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
        isseekpending.write(InstallStatusListener.IconCompatParcelizer(i), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ int IconCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int i;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i2 = this.read;
            if (i2 == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                PearlDetailInnerViewModel.this.IconCompatParcelizer.write(QBankStatsResponse.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
                this.read = 1;
                obj = PearlDetailInnerViewModel.this.onCustomAction.RemoteActionCompatParcelizer(((ConnectionTracker) PearlDetailInnerViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer()).getRead(), this.AudioAttributesCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            getResolutionSize getresolutionsize = PearlDetailInnerViewModel.this.IconCompatParcelizer;
            if (zBooleanValue) {
                i = this.AudioAttributesCompatParcelizer;
            } else {
                i = this.IconCompatParcelizer;
            }
            getresolutionsize.write(QBankStatsResponse.RemoteActionCompatParcelizer(i));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(int i, int i2, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlDetailInnerViewModel.this.new read(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(PearlDetailInnerViewModel pearlDetailInnerViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        pearlDetailInnerViewModel.IconCompatParcelizer.write(Integer.valueOf(i));
        pearlDetailInnerViewModel.write.write(str);
        return getShowPopup.INSTANCE;
    }

    private final void MediaMetadataCompat() {
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, null);
        AndroidUtilsLight androidUtilsLightRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
        if (androidUtilsLightRemoteActionCompatParcelizer != null) {
            isSeekPending isseekpending = this.AudioAttributesImplBaseParcelizer;
            InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
            isseekpending.write(InstallStatusListener.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.read.write(new unbindServiceSafe.AudioAttributesCompatParcelizer(androidUtilsLightRemoteActionCompatParcelizer));
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        isSeekPending isseekpending = this.AudioAttributesImplBaseParcelizer;
        InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
        isseekpending.write(InstallStatusListener.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        this.read.write(new unbindServiceSafe.read(this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getRead()));
        this.read.write(unbindServiceSafe.write.INSTANCE);
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel$write$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private Object AudioAttributesImplApi21Parcelizer;
            private Object AudioAttributesImplApi26Parcelizer;
            private Object AudioAttributesImplBaseParcelizer;
            private Object IconCompatParcelizer;
            private Object MediaBrowserCompatCustomActionResultReceiver;
            private Object MediaBrowserCompatItemReceiver;
            private Object MediaBrowserCompatMediaItem;
            private Object MediaBrowserCompatSearchResultReceiver;
            private int MediaDescriptionCompat;
            private Object MediaMetadataCompat;
            private Object RatingCompat;
            private int RemoteActionCompatParcelizer;
            private /* synthetic */ PearlDetailInnerViewModel handleMediaPlayPauseIfPendingOnHandler;
            private Object read;
            private int write;

            /* JADX WARN: Removed duplicated region for block: B:20:0x018e  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x01c3  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x01f7  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0206  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0220  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0263  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0297  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x02cf  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 778
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.write.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PearlDetailInnerViewModel pearlDetailInnerViewModel, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.handleMediaPlayPauseIfPendingOnHandler = pearlDetailInnerViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.handleMediaPlayPauseIfPendingOnHandler, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(PearlDetailInnerViewModel.this.RatingCompat, new AnonymousClass2(PearlDetailInnerViewModel.this, null), this) == objIconCompatParcelizer) {
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
            return PearlDetailInnerViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.stringToBytes
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlDetailInnerViewModel.read(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(PearlDetailInnerViewModel pearlDetailInnerViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        pearlDetailInnerViewModel.write.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (PearlDetailInnerViewModel.this.onCustomAction.IconCompatParcelizer(((ConnectionTracker) PearlDetailInnerViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer()).getRead(), this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            PearlDetailInnerViewModel.this.read.write(new unbindServiceSafe.MediaBrowserCompatCustomActionResultReceiver(true));
            PearlDetailInnerViewModel.this.read.write(unbindServiceSafe.write.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlDetailInnerViewModel.this.new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(String str) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(str, null), new MagicModuleSubmissionRequestBody() { // from class: o.isGzipByteBuffer
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlDetailInnerViewModel.AudioAttributesImplApi21Parcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(PearlDetailInnerViewModel pearlDetailInnerViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        pearlDetailInnerViewModel.write.write(str);
        pearlDetailInnerViewModel.read.write(new unbindServiceSafe.MediaBrowserCompatCustomActionResultReceiver(false));
        pearlDetailInnerViewModel.read.write(unbindServiceSafe.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        isSeekPending isseekpending = this.AudioAttributesImplBaseParcelizer;
        InstallStatusListener installStatusListener = InstallStatusListener.INSTANCE;
        isseekpending.write(InstallStatusListener.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.copyStream
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PearlDetailInnerViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
            }
        });
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.write
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L81
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1d:
                java.lang.Object r1 = r5.RemoteActionCompatParcelizer
                o.getResolutionSize r1 = (kotlin.getResolutionSize) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L5a
            L25:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L3b
            L29:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel r6 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.this
                o.readLittleEndianUnsignedShort r6 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.AudioAttributesCompatParcelizer(r6)
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.write = r4
                java.lang.Object r6 = r6.read()
            L3b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L65
                com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel r6 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.this
                o.getResolutionSize r1 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.AudioAttributesImplBaseParcelizer(r6)
                com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel r6 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.this
                o.readLittleEndianUnsignedShort r6 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.AudioAttributesCompatParcelizer(r6)
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.RemoteActionCompatParcelizer = r1
                r5.write = r3
                java.lang.Object r6 = r6.RemoteActionCompatParcelizer()
            L5a:
                o.unbindServiceSafe$AudioAttributesImplApi26Parcelizer r3 = new o.unbindServiceSafe$AudioAttributesImplApi26Parcelizer
                java.lang.String r6 = (java.lang.String) r6
                r3.<init>(r6)
                r1.write(r3)
                goto L70
            L65:
                com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel r6 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.this
                o.getResolutionSize r6 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.AudioAttributesImplBaseParcelizer(r6)
                o.unbindServiceSafe$MediaBrowserCompatItemReceiver r1 = o.unbindServiceSafe.MediaBrowserCompatItemReceiver.INSTANCE
                r6.write(r1)
            L70:
                r6 = r5
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r1 = 0
                r5.RemoteActionCompatParcelizer = r1
                r5.write = r2
                r1 = 100
                java.lang.Object r6 = kotlin.setCountry.IconCompatParcelizer(r1, r6)
                if (r6 != r0) goto L81
                return r0
            L81:
                com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel r5 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.this
                o.getResolutionSize r5 = com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.AudioAttributesImplBaseParcelizer(r5)
                o.unbindServiceSafe$write r6 = o.unbindServiceSafe.write.INSTANCE
                r5.write(r6)
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel.AudioAttributesImplBaseParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PearlDetailInnerViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
