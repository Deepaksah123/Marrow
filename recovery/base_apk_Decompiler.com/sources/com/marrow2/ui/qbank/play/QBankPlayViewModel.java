package com.marrow2.ui.qbank.play;

import android.os.CountDownTimer;
import com.marrow2.ui.qbank.play.QBankPlayViewModel;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import kotlin.CachedContent;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.ParsableNalUnitBitArray;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TestGroupLSModel;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.allSamplesAreSyncSamples;
import kotlin.buildResolutionString;
import kotlin.getAddress1;
import kotlin.getAddress2;
import kotlin.getAddress3;
import kotlin.getAnswerMap;
import kotlin.getColorInfo;
import kotlin.getCompanyName;
import kotlin.getLocality;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.lambdanewSingleThreadScheduledExecutor4;
import kotlin.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver;
import kotlin.onConnectionFailed;
import kotlin.readBlockToCache;
import kotlin.readBytesAsString;
import kotlin.resetForTests;
import kotlin.setCountry;
import kotlin.setDouble;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010e\u001a\u00020fH\u0082@¢\u0006\u0002\u0010gJ\u000e\u0010h\u001a\u00020fH\u0082@¢\u0006\u0002\u0010gJ\u000e\u0010i\u001a\u00020f2\u0006\u0010j\u001a\u00020kJ\b\u0010l\u001a\u00020fH\u0002J\b\u0010m\u001a\u00020fH\u0002J\u000e\u0010n\u001a\u00020fH\u0082@¢\u0006\u0002\u0010gJ\b\u0010o\u001a\u00020fH\u0002J \u0010p\u001a\u00020f2\u0006\u0010q\u001a\u00020+2\u0006\u0010r\u001a\u00020+2\u0006\u0010s\u001a\u00020\u0017H\u0002J\u0018\u0010t\u001a\u00020f2\u0006\u0010s\u001a\u00020\u00172\u0006\u0010u\u001a\u00020\"H\u0002J\b\u0010v\u001a\u00020fH\u0002J\u0010\u0010w\u001a\u00020f2\u0006\u0010x\u001a\u00020+H\u0002J\u0010\u0010r\u001a\u00020+2\u0006\u0010y\u001a\u00020zH\u0002J\u0010\u0010{\u001a\u00020f2\u0006\u0010|\u001a\u00020\"H\u0002J\u0018\u0010}\u001a\u00020f2\u0006\u0010s\u001a\u00020\u00172\u0006\u0010u\u001a\u00020\"H\u0002J\u001d\u0010~\u001a\u00020f2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u001708H\u0082@¢\u0006\u0003\u0010\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u00020f2\u0007\u0010\u0082\u0001\u001a\u00020+H\u0002J\u0007\u0010\u0083\u0001\u001a\u00020\"J\t\u0010\u0084\u0001\u001a\u00020fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-¢\u0006\b\n\u0000\u001a\u0004\b,\u0010.R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002000-¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002040*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002040-¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080-¢\u0006\b\n\u0000\u001a\u0004\b;\u0010.R\u000e\u0010<\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\"X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\"X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\"X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\"X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\"X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020F0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020F0-¢\u0006\b\n\u0000\u001a\u0004\bH\u0010.R:\u0010I\u001a.\u0012*\u0012(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\"0Kj\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\"`L0J0*X\u0082\u0004¢\u0006\u0002\n\u0000R=\u0010M\u001a.\u0012*\u0012(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\"0Kj\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\"`L0J0-¢\u0006\b\n\u0000\u001a\u0004\bN\u0010.R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020P0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0-¢\u0006\b\n\u0000\u001a\u0004\bR\u0010.R\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020+0-¢\u0006\b\n\u0000\u001a\u0004\bU\u0010.R\u001c\u0010V\u001a\u0004\u0018\u00010WX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u000e\u0010`\u001a\u00020aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010b\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010$\"\u0004\bd\u0010&¨\u0006\u0085\u0001"}, d2 = {"Lcom/marrow2/ui/qbank/play/QBankPlayViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "qBankUseCase", "Lcom/marrow2/domain/qbank/QBankUseCase;", "mcqUseCase", "Lcom/marrow2/domain/mcq/McqUseCase;", "customModuleApiUseCase", "Lcom/marrow2/domain/custom_module/CustomModuleApiUseCase;", "magicModuleUseCase", "Lcom/marrow2/domain/magic_module/MagicModuleUseCase;", "magicModuleAPIUseCase", "Lcom/marrow2/domain/magic_module/MagicModuleAPIUseCase;", "videoListUseCase", "Lcom/marrow2/domain/video/lesson_list/VideoListUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "fileCacheUseCase", "Lcom/marrow2/domain/fileCache/FileCacheUseCase;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/qbank/QBankUseCase;Lcom/marrow2/domain/mcq/McqUseCase;Lcom/marrow2/domain/custom_module/CustomModuleApiUseCase;Lcom/marrow2/domain/magic_module/MagicModuleUseCase;Lcom/marrow2/domain/magic_module/MagicModuleAPIUseCase;Lcom/marrow2/domain/video/lesson_list/VideoListUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lcom/marrow2/domain/fileCache/FileCacheUseCase;)V", "TAG", "", "stepId", "getStepId", "()Ljava/lang/String;", "lessonTitle", "getLessonTitle", "parentType", "Lcom/marrow2/data/mcq/local/model/McqParentType;", "getParentType", "()Lcom/marrow2/data/mcq/local/model/McqParentType;", "bookmarkStartIndex", "", "getBookmarkStartIndex", "()I", "setBookmarkStartIndex", "(I)V", "bookmarkStartMcqId", "getBookmarkStartMcqId", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_steakData", "Lcom/marrow2/ui/qbank/play/model/QBankSteakInfoModel;", "steakData", "getSteakData", "_qBankUIState", "Lcom/marrow2/ui/qbank/play/model/QBankUIState;", "qBankUIState", "getQBankUIState", "_qBankAnswersUIState", "", "Lcom/marrow2/domain/mcq/model/QBankAnswerUCModel;", "qBankAnswersUIState", "getQBankAnswersUIState", "streakCount", "random", "Ljava/util/Random;", "firstStarCount", "totalStarCount", "steakLimit", "firstStarSize", "secondStarSize", "thirdStartSize", "_navigateState", "Lcom/marrow2/ui/qbank/play/model/NavigationQBankPlayUIEvent;", "navigateState", "getNavigateState", "_mcqAnswerList", "Lcom/marrow2/core/utils/VMState;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mcqAnswerList", "getMcqAnswerList", "_mcqTimer", "", "mcqTimer", "getMcqTimer", "_mcqTimerVisibility", "mcqTimerVisibility", "getMcqTimerVisibility", "timer", "Landroid/os/CountDownTimer;", "getTimer", "()Landroid/os/CountDownTimer;", "setTimer", "(Landroid/os/CountDownTimer;)V", "isTimerRunning", "()Z", "setTimerRunning", "(Z)V", "timerMax", "", "lastPosition", "getLastPosition", "setLastPosition", "getInitialBookmarkData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInitialData", "notifyEvent", "event", "Lcom/marrow2/ui/qbank/play/model/QBankPlayEvents;", "submitMagicModule", "handleDuplicateSubmission", "downloadMagicModuleDetail", "stopTimer", "startTimer", "isAnswered", "isTimeDouble", "mcqId", "updateMap", "position", "onQBankCompleteClick", "onCustomModuleCompleteClick", "isPartial", "mcq", "Lcom/marrow2/data/mcq/local/model/McqUCModel;", "jumpToPage", "newPagerPosition", "notifyOptionSelected", "getAnswersList", "mcqIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performStreakAnim", "isCorrect", "getStartIndex", "performSteakAnimation", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QBankPlayViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<HashMap<String, Integer>>> AudioAttributesCompatParcelizer;
    private final getResolutionSize<List<readBytesAsString>> AudioAttributesImplApi21Parcelizer;
    private final getResolutionSize<getAddress1> AudioAttributesImplApi26Parcelizer;
    private final getResolutionSize<getCompanyName> AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<Boolean> IconCompatParcelizer;
    private final getResolutionSize<getLocality> MediaBrowserCompatCustomActionResultReceiver;
    private final isSeekPending MediaBrowserCompatItemReceiver;
    private final allSamplesAreSyncSamples MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final getColorInfo MediaMetadataCompat;
    private final int RatingCompat;
    private final getResolutionSize<Float> RemoteActionCompatParcelizer;
    private final setUpdatedStatus<Boolean> handleMediaPlayPauseIfPendingOnHandler;
    private final String onAddQueueItem;
    private final int onCommand;
    private boolean onCustomAction;
    private final setUpdatedStatus<Float> onFastForward;
    private final lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver onMediaButtonEvent;
    private final resetForTests onPause;
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<HashMap<String, Integer>>> onPlay;
    private final setUpdatedStatus<Boolean> onPlayFromMediaId;
    private final setUpdatedStatus<List<readBytesAsString>> onPlayFromSearch;
    private final setUpdatedStatus<getLocality> onPlayFromUri;
    private final readBlockToCache onPrepare;
    private final setUpdatedStatus<getAddress1> onPrepareFromMediaId;
    private final NetworkTypeObserverApi31DisplayInfoCallback onPrepareFromSearch;
    private final ParsableNalUnitBitArray onPrepareFromUri;
    private final int onRemoveQueueItem;
    private final int onRemoveQueueItemAt;
    private final Random onRewind;
    private final setUpdatedStatus<getCompanyName> onSeekTo;
    private final int onSetCaptioningEnabled;
    private CountDownTimer onSetPlaybackSpeed;
    private int onSetRating;
    private long onSetRepeatMode;
    private final String onSetShuffleMode;
    private final int onSkipToPrevious;
    private final String read;
    private final lambdanewSingleThreadScheduledExecutor4 setSessionImpl;
    private final getResolutionSize<Boolean> write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return QBankPlayViewModel.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        boolean AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return QBankPlayViewModel.this.write(this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return QBankPlayViewModel.this.read(this);
        }
    }

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[readBlockToCache.values().length];
            try {
                iArr[readBlockToCache.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[readBlockToCache.AudioAttributesImplBaseParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[readBlockToCache.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[readBlockToCache.AudioAttributesCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[readBlockToCache.RemoteActionCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            write = iArr;
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return QBankPlayViewModel.this.read((List<String>) null, this);
        }
    }

    @setSdkPayload
    public QBankPlayViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, ParsableNalUnitBitArray parsableNalUnitBitArray, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getColorInfo getcolorinfo, lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, resetForTests resetfortests, lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4, isSeekPending isseekpending, allSamplesAreSyncSamples allsamplesaresyncsamples) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(parsableNalUnitBitArray, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getcolorinfo, "");
        toMagicModuleMetaRepoModel.write(lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver, "");
        toMagicModuleMetaRepoModel.write(resetfortests, "");
        toMagicModuleMetaRepoModel.write(lambdanewsinglethreadscheduledexecutor4, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(allsamplesaresyncsamples, "");
        this.onPrepareFromUri = parsableNalUnitBitArray;
        this.onPrepareFromSearch = networkTypeObserverApi31DisplayInfoCallback;
        this.MediaMetadataCompat = getcolorinfo;
        this.onMediaButtonEvent = lambdaregister0comgoogleandroidexoplayer2utilnetworktypeobserver;
        this.onPause = resetfortests;
        this.setSessionImpl = lambdanewsinglethreadscheduledexecutor4;
        this.MediaBrowserCompatItemReceiver = isseekpending;
        this.MediaBrowserCompatMediaItem = allsamplesaresyncsamples;
        this.read = "QBankPlayViewModel";
        Object objWrite = pOJOPropertyBuilder5.write("step_id");
        if (objWrite == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.onSetShuffleMode = (String) objWrite;
        Object objWrite2 = pOJOPropertyBuilder5.write("lesson_title");
        if (objWrite2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.onAddQueueItem = (String) objWrite2;
        Object objWrite3 = pOJOPropertyBuilder5.write("parent_type");
        if (objWrite3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        readBlockToCache readblocktocache = (readBlockToCache) objWrite3;
        this.onPrepare = readblocktocache;
        Object objWrite4 = pOJOPropertyBuilder5.write("bookmark_start_index");
        if (objWrite4 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.MediaBrowserCompatSearchResultReceiver = ((Number) objWrite4).intValue();
        Object objWrite5 = pOJOPropertyBuilder5.write("bookmark_start_mcq_id");
        if (objWrite5 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.MediaDescriptionCompat = (String) objWrite5;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.handleMediaPlayPauseIfPendingOnHandler = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<getCompanyName> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new getCompanyName(0, null, 0, 0, false, 31, null));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.onSeekTo = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<getLocality> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new getLocality(null, null, 0, 0, false, false, null, 127, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.onPlayFromUri = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<List<readBytesAsString>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.onPlayFromSearch = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        this.onRewind = new Random();
        this.RatingCompat = 3;
        this.onSkipToPrevious = 5;
        this.onRemoveQueueItemAt = 8;
        this.onCommand = 2;
        this.onRemoveQueueItem = 6;
        this.onSetCaptioningEnabled = 2;
        getResolutionSize<getAddress1> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(getAddress1.AudioAttributesCompatParcelizer.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onPrepareFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<HashMap<String, Integer>>> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onPlay = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<Float> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer(Float.valueOf(100.0f));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer7;
        this.onFastForward = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer8 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer8;
        this.onPlayFromMediaId = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer8);
        this.onSetRepeatMode = 30000L;
        buildResolutionString.IconCompatParcelizer("QBankPlayViewModel", "parentType ".concat(String.valueOf(readblocktocache)));
        getresolutionsizeRemoteActionCompatParcelizer.write(Boolean.TRUE);
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsizeRemoteActionCompatParcelizer6, new HashMap());
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass5(null), new MagicModuleSubmissionRequestBody() { // from class: o.UserAddressRequest
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankPlayViewModel.read(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final String getOnSetShuffleMode() {
        return this.onSetShuffleMode;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final readBlockToCache getOnPrepare() {
        return this.onPrepare;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatMediaItem() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final setUpdatedStatus<getCompanyName> MediaBrowserCompatSearchResultReceiver() {
        return this.onSeekTo;
    }

    public final setUpdatedStatus<getLocality> AudioAttributesImplApi26Parcelizer() {
        return this.onPlayFromUri;
    }

    public final setUpdatedStatus<List<readBytesAsString>> AudioAttributesImplApi21Parcelizer() {
        return this.onPlayFromSearch;
    }

    public final setUpdatedStatus<getAddress1> AudioAttributesImplBaseParcelizer() {
        return this.onPrepareFromMediaId;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<HashMap<String, Integer>>> read() {
        return this.onPlay;
    }

    public final setUpdatedStatus<Float> AudioAttributesCompatParcelizer() {
        return this.onFastForward;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onPlayFromMediaId;
    }

    public final void RatingCompat() {
        this.onSetPlaybackSpeed = null;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.onCustomAction = z;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.qbank.play.QBankPlayViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private int write;

        /* JADX INFO: renamed from: com.marrow2.ui.qbank.play.QBankPlayViewModel$5$write */
        public static final /* synthetic */ class write {
            public static final /* synthetic */ int[] IconCompatParcelizer;

            static {
                int[] iArr = new int[readBlockToCache.values().length];
                try {
                    iArr[readBlockToCache.RemoteActionCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                IconCompatParcelizer = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
        
            if (r17.AudioAttributesImplBaseParcelizer.read(r17) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
        
            if (r17.AudioAttributesImplBaseParcelizer.write(r17) == r1) goto L24;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.AudioAttributesImplApi26Parcelizer
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2f
                if (r2 == r5) goto L21
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r18)
                goto Lab
            L21:
                java.lang.Object r2 = r0.RemoteActionCompatParcelizer
                o.getLocality r2 = (kotlin.getLocality) r2
                java.lang.Object r6 = r0.IconCompatParcelizer
                o.getResolutionSize r6 = (kotlin.getResolutionSize) r6
                kotlin.SdkPayloadData.IconCompatParcelizer(r18)
                r7 = r18
                goto L60
            L2f:
                kotlin.SdkPayloadData.IconCompatParcelizer(r18)
                com.marrow2.ui.qbank.play.QBankPlayViewModel r2 = com.marrow2.ui.qbank.play.QBankPlayViewModel.this
                o.getResolutionSize r6 = com.marrow2.ui.qbank.play.QBankPlayViewModel.MediaBrowserCompatSearchResultReceiver(r2)
                com.marrow2.ui.qbank.play.QBankPlayViewModel r2 = com.marrow2.ui.qbank.play.QBankPlayViewModel.this
                o.getResolutionSize r2 = com.marrow2.ui.qbank.play.QBankPlayViewModel.MediaBrowserCompatSearchResultReceiver(r2)
                java.lang.Object r2 = r2.IconCompatParcelizer()
                o.getLocality r2 = (kotlin.getLocality) r2
                com.marrow2.ui.qbank.play.QBankPlayViewModel r7 = com.marrow2.ui.qbank.play.QBankPlayViewModel.this
                o.ParsableNalUnitBitArray r7 = com.marrow2.ui.qbank.play.QBankPlayViewModel.AudioAttributesImplBaseParcelizer(r7)
                r8 = r0
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                r0.IconCompatParcelizer = r6
                r0.RemoteActionCompatParcelizer = r2
                r9 = 0
                r0.write = r9
                r0.AudioAttributesCompatParcelizer = r9
                r0.read = r9
                r0.AudioAttributesImplApi26Parcelizer = r5
                java.lang.Object r7 = r7.IconCompatParcelizer(r8)
                if (r7 == r1) goto Lae
            L60:
                r8 = r2
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r14 = r7.booleanValue()
                r15 = 0
                r16 = 95
                o.getLocality r2 = kotlin.getLocality.AudioAttributesCompatParcelizer(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r6.write(r2)
                com.marrow2.ui.qbank.play.QBankPlayViewModel r2 = com.marrow2.ui.qbank.play.QBankPlayViewModel.this
                o.readBlockToCache r2 = r2.getOnPrepare()
                int[] r6 = com.marrow2.ui.qbank.play.QBankPlayViewModel.AnonymousClass5.write.IconCompatParcelizer
                int r2 = r2.ordinal()
                r2 = r6[r2]
                r6 = 0
                if (r2 != r5) goto L99
                com.marrow2.ui.qbank.play.QBankPlayViewModel r2 = com.marrow2.ui.qbank.play.QBankPlayViewModel.this
                r3 = r0
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r0.IconCompatParcelizer = r6
                r0.RemoteActionCompatParcelizer = r6
                r0.AudioAttributesImplApi26Parcelizer = r4
                java.lang.Object r0 = com.marrow2.ui.qbank.play.QBankPlayViewModel.AudioAttributesCompatParcelizer(r2, r3)
                if (r0 != r1) goto Lab
                goto Lae
            L99:
                com.marrow2.ui.qbank.play.QBankPlayViewModel r2 = com.marrow2.ui.qbank.play.QBankPlayViewModel.this
                r4 = r0
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r0.IconCompatParcelizer = r6
                r0.RemoteActionCompatParcelizer = r6
                r0.AudioAttributesImplApi26Parcelizer = r3
                java.lang.Object r0 = com.marrow2.ui.qbank.play.QBankPlayViewModel.RemoteActionCompatParcelizer(r2, r4)
                if (r0 != r1) goto Lab
                goto Lae
            Lab:
                o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
                return r0
            Lae:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankPlayViewModel.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AnonymousClass5(SampleVideos<? super AnonymousClass5> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new AnonymousClass5(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass5) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(QBankPlayViewModel qBankPlayViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (i == 899) {
            qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(getAddress1.read.INSTANCE);
        } else {
            qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.marrow2.ui.qbank.play.QBankPlayViewModel.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r10
            com.marrow2.ui.qbank.play.QBankPlayViewModel$RemoteActionCompatParcelizer r0 = (com.marrow2.ui.qbank.play.QBankPlayViewModel.RemoteActionCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.read
            int r10 = r10 + r2
            r0.read = r10
            goto L19
        L14:
            com.marrow2.ui.qbank.play.QBankPlayViewModel$RemoteActionCompatParcelizer r0 = new com.marrow2.ui.qbank.play.QBankPlayViewModel$RemoteActionCompatParcelizer
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L40
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            o.allSamplesAreSyncSamples r10 = r9.MediaBrowserCompatMediaItem
            r0.read = r3
            java.lang.Object r10 = r10.AudioAttributesCompatParcelizer(r0)
            if (r10 != r1) goto L40
            return r1
        L40:
            r2 = r10
            java.util.List r2 = (java.util.List) r2
            java.lang.String r10 = r9.MediaDescriptionCompat
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            int r10 = r10.length()
            if (r10 <= 0) goto L58
            java.lang.String r10 = r9.MediaDescriptionCompat
            int r10 = r2.indexOf(r10)
            r0 = -1
            if (r10 == r0) goto L58
            r9.MediaBrowserCompatSearchResultReceiver = r10
        L58:
            o.getResolutionSize<o.getLocality> r10 = r9.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r0 = r10.IconCompatParcelizer()
            o.getLocality r0 = (kotlin.getLocality) r0
            java.lang.String r1 = r9.onSetShuffleMode
            int r3 = r9.MediaBrowserCompatSearchResultReceiver
            int r4 = r2.size()
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 96
            o.getLocality r0 = kotlin.getLocality.AudioAttributesCompatParcelizer(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r10.write(r0)
            o.getResolutionSize<java.lang.Boolean> r10 = r9.IconCompatParcelizer
            r0 = 0
            java.lang.Boolean r0 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r0)
            r10.write(r0)
            int r10 = r9.MediaBrowserCompatSearchResultReceiver
            r9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r10
            o.getShowPopup r9 = kotlin.getShowPopup.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankPlayViewModel.read(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0120, code lost:
    
        if (read(r1, r2) != r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r19) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankPlayViewModel.write(o.SampleVideos):java.lang.Object");
    }

    public final void IconCompatParcelizer(getAddress3 getaddress3) {
        toMagicModuleMetaRepoModel.write(getaddress3, "");
        if (getaddress3 instanceof getAddress3.write) {
            getAddress3.write writeVar = (getAddress3.write) getaddress3;
            read(writeVar.AudioAttributesCompatParcelizer(), writeVar.RemoteActionCompatParcelizer());
            write(writeVar.AudioAttributesCompatParcelizer(), writeVar.RemoteActionCompatParcelizer());
            IconCompatParcelizer(writeVar.RemoteActionCompatParcelizer() + 1 == writeVar.read());
            return;
        }
        if (getaddress3 instanceof getAddress3.RemoteActionCompatParcelizer) {
            getAddress3.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (getAddress3.RemoteActionCompatParcelizer) getaddress3;
            if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer() > this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            } else {
                this.write.write(Boolean.FALSE);
            }
            if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer() + 1 == this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().RemoteActionCompatParcelizer().size()) {
                getResolutionSize<getLocality> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
                getresolutionsize.write(getLocality.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, null, 0, 0, false, false, setDouble.read, 63));
            } else {
                getResolutionSize<getLocality> getresolutionsize2 = this.MediaBrowserCompatCustomActionResultReceiver;
                getresolutionsize2.write(getLocality.AudioAttributesCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), null, null, 0, 0, false, false, setDouble.IconCompatParcelizer, 63));
            }
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(getaddress3, null), new MagicModuleSubmissionRequestBody() { // from class: o.AddressConstantsThemes
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return QBankPlayViewModel.MediaBrowserCompatSearchResultReceiver(this.AudioAttributesCompatParcelizer, (String) obj2);
                }
            });
            AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            return;
        }
        if (getaddress3 instanceof getAddress3.AudioAttributesCompatParcelizer) {
            int iWrite = ((getAddress3.AudioAttributesCompatParcelizer) getaddress3).write() + 1;
            if (iWrite < this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().RemoteActionCompatParcelizer().size()) {
                CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.AddressConstantsResultCodes
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return QBankPlayViewModel.MediaMetadataCompat(this.IconCompatParcelizer, (String) obj2);
                    }
                });
                AudioAttributesCompatParcelizer(iWrite);
                return;
            }
            int i = read.write[this.onPrepare.ordinal()];
            if (i == 1 || i == 2) {
                handleMediaPlayPauseIfPendingOnHandler();
                return;
            }
            if (i == 3) {
                AudioAttributesCompatParcelizer(false);
                return;
            } else if (i == 4) {
                onCommand();
                return;
            } else {
                if (i == 5) {
                    this.AudioAttributesImplApi26Parcelizer.write(getAddress1.read.INSTANCE);
                    return;
                }
                return;
            }
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getaddress3, getAddress3.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.addAllowedCountrySpecifications
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return QBankPlayViewModel.MediaBrowserCompatMediaItem(this.AudioAttributesCompatParcelizer, (String) obj2);
                }
            });
            return;
        }
        if (getaddress3 instanceof getAddress3.IconCompatParcelizer) {
            getAddress3.IconCompatParcelizer iconCompatParcelizer = (getAddress3.IconCompatParcelizer) getaddress3;
            read(iconCompatParcelizer.RemoteActionCompatParcelizer(), iconCompatParcelizer.write());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getaddress3, getAddress3.read.INSTANCE)) {
            this.AudioAttributesImplApi26Parcelizer.write(getAddress1.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getaddress3, getAddress3.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            this.AudioAttributesImplApi26Parcelizer.write(getAddress1.MediaBrowserCompatItemReceiver.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getaddress3, getAddress3.MediaBrowserCompatItemReceiver.INSTANCE)) {
            this.AudioAttributesImplApi26Parcelizer.write(getAddress1.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getaddress3, getAddress3.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            AudioAttributesCompatParcelizer(false);
            return;
        }
        if (getaddress3 instanceof getAddress3.MediaBrowserCompatMediaItem) {
            if (((getAddress3.MediaBrowserCompatMediaItem) getaddress3).IconCompatParcelizer() != readBlockToCache.AudioAttributesCompatParcelizer) {
                isSeekPending isseekpending = this.MediaBrowserCompatItemReceiver;
                getAddress2 getaddress2 = getAddress2.INSTANCE;
                isseekpending.write(getAddress2.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            }
            AudioAttributesCompatParcelizer(true);
            return;
        }
        if (!(getaddress3 instanceof getAddress3.MediaBrowserCompatCustomActionResultReceiver)) {
            throw new RenewEligibleCreator();
        }
        if (((getAddress3.MediaBrowserCompatCustomActionResultReceiver) getaddress3).write() != readBlockToCache.AudioAttributesCompatParcelizer) {
            isSeekPending isseekpending2 = this.MediaBrowserCompatItemReceiver;
            getAddress2 getaddress22 = getAddress2.INSTANCE;
            isseekpending2.write(getAddress2.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ getAddress3 read;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankPlayViewModel.MediaBrowserCompatCustomActionResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(getAddress3 getaddress3, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.read = getaddress3;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(QBankPlayViewModel qBankPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (QBankPlayViewModel.this.onPrepareFromUri.RemoteActionCompatParcelizer(QBankPlayViewModel.this.getOnSetShuffleMode(), false, this) == objIconCompatParcelizer) {
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(QBankPlayViewModel qBankPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
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
                QBankPlayViewModel qBankPlayViewModel = QBankPlayViewModel.this;
                this.write = 1;
                if (qBankPlayViewModel.read(((getLocality) qBankPlayViewModel.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()).RemoteActionCompatParcelizer(), this) == objIconCompatParcelizer) {
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

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(QBankPlayViewModel qBankPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
        return getShowPopup.INSTANCE;
    }

    static final class onCustomAction extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = QBankPlayViewModel.this.MediaBrowserCompatItemReceiver;
                onConnectionFailed onconnectionfailed = onConnectionFailed.INSTANCE;
                isseekpending.write(onConnectionFailed.RemoteActionCompatParcelizer(false), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.IconCompatParcelizer = 1;
                if (QBankPlayViewModel.this.onPause.AudioAttributesCompatParcelizer(QBankPlayViewModel.this.getOnSetShuffleMode(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            QBankPlayViewModel.this.AudioAttributesImplApi26Parcelizer.write(getAddress1.AudioAttributesImplBaseParcelizer.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        onCustomAction(SampleVideos<? super onCustomAction> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new onCustomAction(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCustomAction) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommand() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onCustomAction(null), new MagicModuleSubmissionRequestBody() { // from class: o.Addresszza
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankPlayViewModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(QBankPlayViewModel qBankPlayViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (i == 405) {
            qBankPlayViewModel.onAddQueueItem();
        } else {
            qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
        }
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (QBankPlayViewModel.this.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            QBankPlayViewModel.this.AudioAttributesImplApi26Parcelizer.write(getAddress1.write.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onAddQueueItem() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.AddressConstants
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankPlayViewModel.AudioAttributesImplApi21Parcelizer(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(QBankPlayViewModel qBankPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r6.IconCompatParcelizer(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.qbank.play.QBankPlayViewModel.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.qbank.play.QBankPlayViewModel$AudioAttributesCompatParcelizer r0 = (com.marrow2.ui.qbank.play.QBankPlayViewModel.AudioAttributesCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            com.marrow2.ui.qbank.play.QBankPlayViewModel$AudioAttributesCompatParcelizer r0 = new com.marrow2.ui.qbank.play.QBankPlayViewModel$AudioAttributesCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            int r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r6 = r0.write
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L7c
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L65
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L53
        L46:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r7 = r6.onMediaButtonEvent
            r0.read = r5
            java.lang.Object r7 = r7.AudioAttributesImplApi21Parcelizer(r0)
            if (r7 == r1) goto L7f
        L53:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            o.lambdaregister0comgoogleandroidexoplayer2utilNetworkTypeObserver r7 = r6.onMediaButtonEvent
            r0.read = r4
            java.lang.Object r7 = r7.read(r0)
            if (r7 == r1) goto L7f
        L65:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L7c
            o.resetForTests r6 = r6.onPause
            r2 = 0
            r0.AudioAttributesCompatParcelizer = r2
            r0.write = r2
            r2 = 0
            r0.RemoteActionCompatParcelizer = r2
            r0.read = r3
            java.lang.Object r6 = r6.IconCompatParcelizer(r7, r0)
            if (r6 != r1) goto L7c
            goto L7f
        L7c:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankPlayViewModel.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    private final void onCustomAction() {
        CountDownTimer countDownTimer = this.onSetPlaybackSpeed;
        if (countDownTimer != null) {
            this.onCustomAction = false;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.onSetPlaybackSpeed = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(boolean z, boolean z2, String str) {
        if (this.onSetPlaybackSpeed != null || this.onCustomAction) {
            return;
        }
        this.RemoteActionCompatParcelizer.write(Float.valueOf(100.0f));
        long j = ((long) (z2 ? 2 : 1)) * 30000;
        this.onSetRepeatMode = j;
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(str, j);
        this.onSetPlaybackSpeed = mediaDescriptionCompat;
        mediaDescriptionCompat.start();
    }

    public static final class MediaDescriptionCompat extends CountDownTimer {
        private /* synthetic */ String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(String str, long j) {
            super(j, 20L);
            this.IconCompatParcelizer = str;
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            QBankPlayViewModel.this.write.write(Boolean.TRUE);
            QBankPlayViewModel.this.RemoteActionCompatParcelizer(true);
            QBankPlayViewModel.this.RemoteActionCompatParcelizer.write(Float.valueOf((j * 100.0f) / QBankPlayViewModel.this.onSetRepeatMode));
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            QBankPlayViewModel.this.write.write(Boolean.FALSE);
            QBankPlayViewModel.this.RemoteActionCompatParcelizer(false);
            QBankPlayViewModel.this.write(this.IconCompatParcelizer, -1);
            QBankPlayViewModel.this.RatingCompat();
            TopUserCompanion topUserCompanionWrite = TypeResolutionContextBasic.write(QBankPlayViewModel.this);
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(QBankPlayViewModel.this, null);
            final QBankPlayViewModel qBankPlayViewModel = QBankPlayViewModel.this;
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(topUserCompanionWrite, iconCompatParcelizer, new MagicModuleSubmissionRequestBody() { // from class: o.CountrySpecification
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return QBankPlayViewModel.MediaDescriptionCompat.read(qBankPlayViewModel, (String) obj2);
                }
            });
            QBankPlayViewModel.this.AudioAttributesImplApi26Parcelizer.write(getAddress1.IconCompatParcelizer.INSTANCE);
        }

        static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ QBankPlayViewModel write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    QBankPlayViewModel qBankPlayViewModel = this.write;
                    this.AudioAttributesCompatParcelizer = 1;
                    if (qBankPlayViewModel.read(((getLocality) qBankPlayViewModel.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()).RemoteActionCompatParcelizer(), this) == objIconCompatParcelizer) {
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
            IconCompatParcelizer(QBankPlayViewModel qBankPlayViewModel, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(1, sampleVideos);
                this.write = qBankPlayViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
                return new IconCompatParcelizer(this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
                return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(QBankPlayViewModel qBankPlayViewModel, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
            return getShowPopup.INSTANCE;
        }
    }

    private final void read(String str, int i) throws Exception {
        HashMap<String, Integer> map = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().read();
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
        }
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, map);
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:37:0x015d, code lost:
        
            if (r11 == r0) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x011b  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 468
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankPlayViewModel.MediaBrowserCompatSearchResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatSearchResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.AddressAddressOptions
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankPlayViewModel.MediaDescriptionCompat(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(QBankPlayViewModel qBankPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ boolean IconCompatParcelizer;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        
            if (r5.AudioAttributesCompatParcelizer.onMediaButtonEvent.read(java.lang.System.currentTimeMillis(), r5) != r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        
            if (r6 == r0) goto L20;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankPlayViewModel.MediaBrowserCompatMediaItem.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatMediaItem(boolean z, SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new MediaBrowserCompatMediaItem(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(final boolean z) {
        this.IconCompatParcelizer.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatMediaItem(z, null), new MagicModuleSubmissionRequestBody() { // from class: o.AddressConstantsExtras
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankPlayViewModel.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, z, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(QBankPlayViewModel qBankPlayViewModel, boolean z, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankPlayViewModel.IconCompatParcelizer.write(Boolean.FALSE);
        if (z && i == 502) {
            qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(getAddress1.read.INSTANCE);
        } else {
            qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean read(CachedContent cachedContent) {
        String write2 = cachedContent.getWrite();
        for (int i = 0; i < 10; i++) {
            if (TestGroupLSModel.write((CharSequence) write2, (CharSequence) String.valueOf(i), false)) {
                return true;
            }
        }
        return write2.length() >= 60;
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        if (i == this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getRemoteActionCompatParcelizer()) {
            return;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(i, null), new MagicModuleSubmissionRequestBody() { // from class: o.requestUserAddress
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankPlayViewModel.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            QBankPlayViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(getLocality.AudioAttributesCompatParcelizer((getLocality) QBankPlayViewModel.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), null, null, this.write, 0, false, false, null, 123));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(int i, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.write = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new MediaBrowserCompatItemReceiver(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(QBankPlayViewModel qBankPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
        return getShowPopup.INSTANCE;
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private Object read;
        private /* synthetic */ int write;

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0165, code lost:
        
            if (r15.read(r15.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().RemoteActionCompatParcelizer(), r14) != r0) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00fd A[PHI: r1
          0x00fd: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v3 java.lang.String), (r1v6 java.lang.String) binds: [B:20:0x00fb, B:17:0x00c1, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0149  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankPlayViewModel.RatingCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat(String str, int i, SampleVideos<? super RatingCompat> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.write = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new RatingCompat(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String str, int i) {
        onCustomAction();
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(str, i, null), new MagicModuleSubmissionRequestBody() { // from class: o.UserAddressRequestBuilder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankPlayViewModel.RatingCompat(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(QBankPlayViewModel qBankPlayViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        qBankPlayViewModel.AudioAttributesImplApi26Parcelizer.write(new getAddress1.RatingCompat(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.util.List<java.lang.String> r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.qbank.play.QBankPlayViewModel.write
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.qbank.play.QBankPlayViewModel$write r0 = (com.marrow2.ui.qbank.play.QBankPlayViewModel.write) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.write
            int r7 = r7 + r2
            r0.write = r7
            goto L19
        L14:
            com.marrow2.ui.qbank.play.QBankPlayViewModel$write r0 = new com.marrow2.ui.qbank.play.QBankPlayViewModel$write
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L50
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.readBlockToCache r7 = r5.onPrepare
            o.readBlockToCache r2 = kotlin.readBlockToCache.RemoteActionCompatParcelizer
            if (r7 != r2) goto L40
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L40:
            o.NetworkTypeObserverApi31DisplayInfoCallback r7 = r5.onPrepareFromSearch
            java.lang.String r2 = r5.onSetShuffleMode
            r4 = 0
            r0.RemoteActionCompatParcelizer = r4
            r0.write = r3
            java.lang.Object r7 = r7.AudioAttributesCompatParcelizer(r2, r6, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            java.util.List r7 = (java.util.List) r7
            o.getResolutionSize<java.util.List<o.readBytesAsString>> r5 = r5.AudioAttributesImplApi21Parcelizer
            r5.write(r7)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankPlayViewModel.read(java.util.List, o.SampleVideos):java.lang.Object");
    }

    private final void IconCompatParcelizer(boolean z) {
        getCompanyName getcompanyname;
        if (z) {
            int i = this.onSetRating + 1;
            this.onSetRating = i;
            int i2 = this.onRemoveQueueItemAt;
            if (i % i2 == 0) {
                this.onSetRating = 1;
            }
            int i3 = this.onSetRating;
            int i4 = i3 % i2;
            if (i4 != 0) {
                i2 = i4;
            }
            int i5 = this.RatingCompat;
            int i6 = (i2 - i5) + 1;
            if (i3 == i5) {
                getcompanyname = new getCompanyName(i6, null, 1, this.onRewind.nextInt(this.onCommand), false, 18, null);
            } else if (i3 == i5 + 1 || i3 == i5 + 2 || i3 == i5 + 3) {
                getcompanyname = new getCompanyName(i6, null, 2, this.onRewind.nextInt(this.onRemoveQueueItem), false, 18, null);
            } else if (i3 == i5 + 4) {
                getcompanyname = new getCompanyName(i6, null, 3, this.onRewind.nextInt(this.onSetCaptioningEnabled), false, 18, null);
            } else {
                getcompanyname = new getCompanyName(0, null, 0, 0, false, 31, null);
            }
            if (this.onSetRating >= this.RatingCompat) {
                this.AudioAttributesImplBaseParcelizer.write(getcompanyname);
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                return;
            }
            return;
        }
        this.onSetRating = 0;
    }

    public final int MediaMetadataCompat() {
        return this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getRemoteActionCompatParcelizer();
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize = QBankPlayViewModel.this.AudioAttributesImplBaseParcelizer;
                getCompanyName getcompanyname = (getCompanyName) QBankPlayViewModel.this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
                getresolutionsize.write(getCompanyName.AudioAttributesCompatParcelizer(getcompanyname.RemoteActionCompatParcelizer, getcompanyname.AudioAttributesCompatParcelizer, getcompanyname.write, getcompanyname.IconCompatParcelizer, true));
                this.RemoteActionCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(2000L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getResolutionSize getresolutionsize2 = QBankPlayViewModel.this.AudioAttributesImplBaseParcelizer;
            getCompanyName getcompanyname2 = (getCompanyName) QBankPlayViewModel.this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
            getresolutionsize2.write(getCompanyName.AudioAttributesCompatParcelizer(getcompanyname2.RemoteActionCompatParcelizer, getcompanyname2.AudioAttributesCompatParcelizer, getcompanyname2.write, getcompanyname2.IconCompatParcelizer, false));
            return getShowPopup.INSTANCE;
        }

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankPlayViewModel.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaMetadataCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.AddressConstantsErrorCodes
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankPlayViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
