package com.marrow2.ui.video.revision_video.completed.viewmodel;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.marrow2.ui.video.revision_video.completed.viewmodel.RevisionCompletedViewModel;
import java.util.List;
import kotlin.CmcdConfigurationRequestConfig;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.asMarrowResponse;
import kotlin.errorIf;
import kotlin.errorIflambda1;
import kotlin.executeSync;
import kotlin.getAnswerMap;
import kotlin.getCodecsCorrespondingToMimeType;
import kotlin.getMagicModuleStats;
import kotlin.getMagicModuleTimeline;
import kotlin.getResolutionSize;
import kotlin.getRetryPredicate;
import kotlin.getShowPopup;
import kotlin.getTestPattern;
import kotlin.getUserSubmissionTimestamp;
import kotlin.getYear;
import kotlin.isAnonymous;
import kotlin.isSeekPending;
import kotlin.lambdanewSingleThreadScheduledExecutor4;
import kotlin.r8lambdaRTx1izlilDmlyBaYsirhR7M98MU;
import kotlin.r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk;
import kotlin.r8lambdaeUjbdMLtxuENSTQFzrQsjYjNrI;
import kotlin.r8lambdafirD8q3VfW_fV4cnoFCk8FsND60;
import kotlin.r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY;
import kotlin.setCountry;
import kotlin.setPassingYear;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.unregisterConnectionCallbacks;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002BCB3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020%H\u0002J*\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020(H\u0002J0\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(H\u0002J\u0010\u0010:\u001a\u00020(2\u0006\u00104\u001a\u000205H\u0003J\u0010\u0010;\u001a\u00020(2\u0006\u00104\u001a\u000205H\u0003J8\u0010<\u001a\u00020=2\u0006\u00104\u001a\u0002052\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u0010>\u001a\u00020\u0010H\u0002J\b\u0010?\u001a\u00020 H\u0002J\b\u0010@\u001a\u00020%H\u0002J\b\u0010A\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006D"}, d2 = {"Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "videoListUseCase", "Lcom/marrow2/domain/video/lesson_list/VideoListUseCase;", "homeUseCase", "Lcom/marrow2/domain/home/HomeUseCase;", "analyticsPublisher", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "appContext", "Landroid/content/Context;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/marrow2/domain/video/lesson_list/VideoListUseCase;Lcom/marrow2/domain/home/HomeUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;Landroid/content/Context;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedUIState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "args", "Lcom/marrow2/ui/video/revision_video/completed/model/RevisionCompletedArgs;", "_content", "Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedUIModel;", "content", "getContent", "_uiAction", "Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedUIAction;", "uiAction", "getUiAction", "notifyEvent", "", "event", "Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedUIEvent;", "handleContinue", "loadRemainingData", "Lkotlinx/coroutines/Job;", "buildContent", "score", "", "grandTests", "", "Lcom/marrow2/ui/home/model/TestSuggestionVMModel;", "previousYearPapers", "Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionBottomContent$PreviousYearPapers;", "progressOf", "", "completed", "total", "buildTopStat", "Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionTopStat;", FilterParams.KEY_MODE, "Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletionMode;", "videosCompletedCount", "videosTotalCount", "arqCompletedCount", "arqTotalCount", "revealTitleRes", "headerDescRes", "buildBottomContent", "Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionBottomContent;", "restoreState", "handleRevealed", "handleRingsCollapsed", "handleTextRevealed", "RevealPhase", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevisionCompletedViewModel extends POJOPropertyBuilderWithMember {
    public static final read AudioAttributesCompatParcelizer = new read(null);
    private final POJOPropertyBuilder5 AudioAttributesImplApi21Parcelizer;
    private final r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk AudioAttributesImplApi26Parcelizer;
    private final Context AudioAttributesImplBaseParcelizer;
    private final isSeekPending IconCompatParcelizer;
    private final setUpdatedStatus<asMarrowResponse> MediaBrowserCompatCustomActionResultReceiver;
    private final getCodecsCorrespondingToMimeType MediaBrowserCompatItemReceiver;
    private final lambdanewSingleThreadScheduledExecutor4 MediaBrowserCompatMediaItem;
    private final setUpdatedStatus<r8lambdaRTx1izlilDmlyBaYsirhR7M98MU> MediaBrowserCompatSearchResultReceiver;
    private final setUpdatedStatus<errorIf> MediaDescriptionCompat;
    private final getResolutionSize<r8lambdaRTx1izlilDmlyBaYsirhR7M98MU> RemoteActionCompatParcelizer;
    private final getResolutionSize<asMarrowResponse> read;
    private final getResolutionSize<errorIf> write;

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;
        public static final /* synthetic */ int[] read;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[errorIflambda1.values().length];
            try {
                iArr[errorIflambda1.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[errorIflambda1.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[errorIflambda1.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
            int[] iArr2 = new int[r8lambdaeUjbdMLtxuENSTQFzrQsjYjNrI.values().length];
            try {
                iArr2[r8lambdaeUjbdMLtxuENSTQFzrQsjYjNrI.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[r8lambdaeUjbdMLtxuENSTQFzrQsjYjNrI.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            read = iArr2;
            int[] iArr3 = new int[AudioAttributesCompatParcelizer.values().length];
            try {
                iArr3[AudioAttributesCompatParcelizer.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[AudioAttributesCompatParcelizer.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            write = iArr3;
        }
    }

    private static float RemoteActionCompatParcelizer(int i, int i2) {
        return i2 > 0 ? i / i2 : BitmapDescriptorFactory.HUE_RED;
    }

    @setSdkPayload
    public RevisionCompletedViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4, getCodecsCorrespondingToMimeType getcodecscorrespondingtomimetype, isSeekPending isseekpending, Context context) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(lambdanewsinglethreadscheduledexecutor4, "");
        toMagicModuleMetaRepoModel.write(getcodecscorrespondingtomimetype, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesImplApi21Parcelizer = pOJOPropertyBuilder5;
        this.MediaBrowserCompatMediaItem = lambdanewsinglethreadscheduledexecutor4;
        this.MediaBrowserCompatItemReceiver = getcodecscorrespondingtomimetype;
        this.IconCompatParcelizer = isseekpending;
        this.AudioAttributesImplBaseParcelizer = context;
        getResolutionSize<errorIf> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(MediaBrowserCompatMediaItem());
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk.Companion companion = r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk.INSTANCE;
        this.AudioAttributesImplApi26Parcelizer = r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk.Companion.write(pOJOPropertyBuilder5);
        getResolutionSize<asMarrowResponse> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(this, IntermediateLoginResponseBody.RemoteActionCompatParcelizer()));
        this.read = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<r8lambdaRTx1izlilDmlyBaYsirhR7M98MU> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.IconCompatParcelizer.INSTANCE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        AudioAttributesImplApi26Parcelizer();
    }

    public final setUpdatedStatus<errorIf> IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final setUpdatedStatus<asMarrowResponse> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<r8lambdaRTx1izlilDmlyBaYsirhR7M98MU> read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY r8lambdaigcgiyohcxxn4uishkrpmnmebwy) {
        toMagicModuleMetaRepoModel.write(r8lambdaigcgiyohcxxn4uishkrpmnmebwy, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r8lambdaigcgiyohcxxn4uishkrpmnmebwy, r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r8lambdaigcgiyohcxxn4uishkrpmnmebwy, r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r8lambdaigcgiyohcxxn4uishkrpmnmebwy, r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.MediaBrowserCompatItemReceiver.INSTANCE)) {
            AudioAttributesImplBaseParcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r8lambdaigcgiyohcxxn4uishkrpmnmebwy, r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.write.INSTANCE)) {
            this.RemoteActionCompatParcelizer.write(r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.AudioAttributesImplApi26Parcelizer.INSTANCE);
            return;
        }
        if (r8lambdaigcgiyohcxxn4uishkrpmnmebwy instanceof r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.read) {
            r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.read readVar = (r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.read) r8lambdaigcgiyohcxxn4uishkrpmnmebwy;
            this.RemoteActionCompatParcelizer.write(new r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.write(readVar.read(), readVar.AudioAttributesCompatParcelizer()));
            isSeekPending isseekpending = this.IconCompatParcelizer;
            getRetryPredicate getretrypredicate = getRetryPredicate.INSTANCE;
            isseekpending.write(getRetryPredicate.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (r8lambdaigcgiyohcxxn4uishkrpmnmebwy instanceof r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.IconCompatParcelizer) {
            this.RemoteActionCompatParcelizer.write(new r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.read(((r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.IconCompatParcelizer) r8lambdaigcgiyohcxxn4uishkrpmnmebwy).write()));
            isSeekPending isseekpending2 = this.IconCompatParcelizer;
            getRetryPredicate getretrypredicate2 = getRetryPredicate.INSTANCE;
            isseekpending2.write(getRetryPredicate.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r8lambdaigcgiyohcxxn4uishkrpmnmebwy, r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.AudioAttributesCompatParcelizer.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r8lambdaigcgiyohcxxn4uishkrpmnmebwy, r8lambdaigcgiYOHCxXn4UishKRPMNmeBWY.RemoteActionCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.RemoteActionCompatParcelizer.write(r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.IconCompatParcelizer.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        getResolutionSize<r8lambdaRTx1izlilDmlyBaYsirhR7M98MU> getresolutionsize = this.RemoteActionCompatParcelizer;
        if (this.AudioAttributesImplApi26Parcelizer.getIconCompatParcelizer() == r8lambdaeUjbdMLtxuENSTQFzrQsjYjNrI.IconCompatParcelizer) {
            audioAttributesCompatParcelizer = r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.RemoteActionCompatParcelizer.INSTANCE;
        } else {
            audioAttributesCompatParcelizer = new r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.AudioAttributesCompatParcelizer(this.read.IconCompatParcelizer().getWrite() == errorIflambda1.RemoteActionCompatParcelizer);
        }
        getresolutionsize.write(audioAttributesCompatParcelizer);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private Object read;

        /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.revision_video.completed.viewmodel.RevisionCompletedViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RevisionCompletedViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final setPassingYear AudioAttributesImplApi26Parcelizer() {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.r8lambdazXQ5WyXnCqZMfr3DwDrc_sMIC2M
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RevisionCompletedViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private static /* synthetic */ asMarrowResponse AudioAttributesCompatParcelizer(RevisionCompletedViewModel revisionCompletedViewModel, List list) {
        return revisionCompletedViewModel.RemoteActionCompatParcelizer(0, list, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final asMarrowResponse RemoteActionCompatParcelizer(int i, List<unregisterConnectionCallbacks> list, r8lambdafirD8q3VfW_fV4cnoFCk8FsND60.write writeVar) {
        errorIflambda1 erroriflambda1;
        int write2 = this.AudioAttributesImplApi26Parcelizer.getWrite();
        int audioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer();
        int audioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi26Parcelizer.getAudioAttributesImplApi21Parcelizer();
        int audioAttributesImplBaseParcelizer = this.AudioAttributesImplApi26Parcelizer.getAudioAttributesImplBaseParcelizer();
        boolean z = write2 == audioAttributesCompatParcelizer;
        boolean z2 = audioAttributesImplApi21Parcelizer == audioAttributesImplBaseParcelizer;
        if (z && z2) {
            erroriflambda1 = errorIflambda1.RemoteActionCompatParcelizer;
        } else if (z2) {
            erroriflambda1 = errorIflambda1.IconCompatParcelizer;
        } else {
            erroriflambda1 = errorIflambda1.write;
        }
        errorIflambda1 erroriflambda12 = erroriflambda1;
        return new asMarrowResponse(erroriflambda12, write(erroriflambda12, write2, audioAttributesCompatParcelizer, audioAttributesImplApi21Parcelizer, audioAttributesImplBaseParcelizer), AudioAttributesCompatParcelizer(erroriflambda12, audioAttributesImplApi21Parcelizer, audioAttributesImplBaseParcelizer, list, writeVar), read(erroriflambda12), AudioAttributesCompatParcelizer(erroriflambda12), erroriflambda12 != errorIflambda1.write && i < 40, RemoteActionCompatParcelizer(write2, audioAttributesCompatParcelizer), RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer, audioAttributesImplBaseParcelizer), write2, audioAttributesImplApi21Parcelizer);
    }

    private final executeSync write(errorIflambda1 erroriflambda1, int i, int i2, int i3, int i4) {
        int i5 = RemoteActionCompatParcelizer.IconCompatParcelizer[erroriflambda1.ordinal()];
        if (i5 == 1) {
            return new executeSync.write(this.AudioAttributesImplApi26Parcelizer.getIconCompatParcelizer() == r8lambdaeUjbdMLtxuENSTQFzrQsjYjNrI.IconCompatParcelizer, i, i2, i3, i4);
        }
        if (i5 == 2) {
            return new executeSync.AudioAttributesCompatParcelizer(i, i2);
        }
        if (i5 != 3) {
            throw new RenewEligibleCreator();
        }
        return new executeSync.IconCompatParcelizer(i3, i4);
    }

    private final int read(errorIflambda1 erroriflambda1) {
        int i = RemoteActionCompatParcelizer.IconCompatParcelizer[erroriflambda1.ordinal()];
        if (i == 1) {
            return CmcdConfigurationRequestConfig.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplBaseParcelizer) ? R.string.you_ve_completed_world_of_revision_tablet : R.string.you_ve_completed_world_of_revision;
        }
        if (i == 2) {
            return R.string.all_revision_videos_completed;
        }
        if (i == 3) {
            return R.string.all_active_recall_completed;
        }
        throw new RenewEligibleCreator();
    }

    private static int AudioAttributesCompatParcelizer(errorIflambda1 erroriflambda1) {
        int i = RemoteActionCompatParcelizer.IconCompatParcelizer[erroriflambda1.ordinal()];
        if (i == 1) {
            return R.string.keep_solving_gt_desc;
        }
        if (i == 2) {
            return R.string.keep_solving_active_recall_desc;
        }
        if (i == 3) {
            return R.string.keep_solving_pyq_desc;
        }
        throw new RenewEligibleCreator();
    }

    private final r8lambdafirD8q3VfW_fV4cnoFCk8FsND60 AudioAttributesCompatParcelizer(errorIflambda1 erroriflambda1, int i, int i2, List<unregisterConnectionCallbacks> list, r8lambdafirD8q3VfW_fV4cnoFCk8FsND60.write writeVar) {
        int i3 = RemoteActionCompatParcelizer.read[this.AudioAttributesImplApi26Parcelizer.getIconCompatParcelizer().ordinal()];
        if (i3 == 1) {
            if (RemoteActionCompatParcelizer.IconCompatParcelizer[erroriflambda1.ordinal()] == 2) {
                return new r8lambdafirD8q3VfW_fV4cnoFCk8FsND60.IconCompatParcelizer(i, i2);
            }
            return new r8lambdafirD8q3VfW_fV4cnoFCk8FsND60.RemoteActionCompatParcelizer(list);
        }
        if (i3 != 2) {
            throw new RenewEligibleCreator();
        }
        if (RemoteActionCompatParcelizer.IconCompatParcelizer[erroriflambda1.ordinal()] == 3) {
            return writeVar != null ? writeVar : r8lambdafirD8q3VfW_fV4cnoFCk8FsND60.AudioAttributesCompatParcelizer.INSTANCE;
        }
        return new r8lambdafirD8q3VfW_fV4cnoFCk8FsND60.RemoteActionCompatParcelizer(list);
    }

    private final errorIf MediaBrowserCompatMediaItem() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) this.AudioAttributesImplApi21Parcelizer.write(NotesDispatchAddressRequestKt.KEY_STATE);
        if (audioAttributesCompatParcelizer == null) {
            audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer;
        }
        int i = RemoteActionCompatParcelizer.write[audioAttributesCompatParcelizer.ordinal()];
        if (i == 1) {
            return errorIf.IconCompatParcelizer.INSTANCE;
        }
        if (i == 2) {
            return errorIf.write.INSTANCE;
        }
        if (i == 3) {
            return errorIf.AudioAttributesCompatParcelizer.INSTANCE;
        }
        if (i != 4) {
            throw new RenewEligibleCreator();
        }
        return errorIf.RemoteActionCompatParcelizer.INSTANCE;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(NotesDispatchAddressRequestKt.KEY_STATE, AudioAttributesCompatParcelizer.write);
        this.write.write(errorIf.IconCompatParcelizer.INSTANCE);
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
                this.AudioAttributesCompatParcelizer = 1;
                if (setCountry.RemoteActionCompatParcelizer(getUserSubmissionTimestamp.IconCompatParcelizer(200, isAnonymous.RemoteActionCompatParcelizer), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            RevisionCompletedViewModel.this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(NotesDispatchAddressRequestKt.KEY_STATE, AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
            RevisionCompletedViewModel.this.write.write(errorIf.write.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RevisionCompletedViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final setPassingYear MediaBrowserCompatItemReceiver() {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.errorIflambda00
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RevisionCompletedViewModel.read((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplBaseParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(NotesDispatchAddressRequestKt.KEY_STATE, AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        this.write.write(errorIf.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedViewModel$AudioAttributesCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        private static final /* synthetic */ AudioAttributesCompatParcelizer[] read;
        public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer("REVEALING", 0);
        public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer("RINGS_PLAYING", 1);
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer("LOTTIE_PLAYING", 2);
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer("SPLITTING", 3);

        private AudioAttributesCompatParcelizer(String str, int i) {
        }

        static {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = read();
            read = audioAttributesCompatParcelizerArr;
            getMagicModuleTimeline.IconCompatParcelizer(audioAttributesCompatParcelizerArr);
        }

        private static final /* synthetic */ AudioAttributesCompatParcelizer[] read() {
            return new AudioAttributesCompatParcelizer[]{IconCompatParcelizer, write, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer};
        }

        public static AudioAttributesCompatParcelizer valueOf(String str) {
            return (AudioAttributesCompatParcelizer) Enum.valueOf(AudioAttributesCompatParcelizer.class, str);
        }

        public static AudioAttributesCompatParcelizer[] values() {
            return (AudioAttributesCompatParcelizer[]) read.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedViewModel$read;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
