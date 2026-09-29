package com.marrow2.ui.video.notes.viewmodel;

import com.marrow2.ui.video.notes.viewmodel.VideoNotesViewModel;
import java.util.Map;
import kotlin.C0177getRfBanners;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.cs;
import kotlin.dispatchTouchEvent;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getPlaylistProtectionSchemes;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.indexOf;
import kotlin.moveItems;
import kotlin.normalizeLanguageCode;
import kotlin.onPageFinished;
import kotlin.onRebuffer;
import kotlin.onReceivedError;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setPassingYear;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.shouldInterceptRequest;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.withRequestHeaders;
import kotlin.zzoid;
import kotlin.zzscd;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u001c\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\n\u0010%\u001a\u00060&j\u0002`'H\u0002J\u0018\u0010(\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006,"}, d2 = {"Lcom/marrow2/ui/video/notes/viewmodel/VideoNotesViewModel;", "Landroidx/lifecycle/ViewModel;", "analyticPublisher", "Lcom/marrow/analytics/IAnalyticPublisher;", "videoNotesUseCase", "Lcom/marrow2/domain/video/notes/VideoNotesUseCase;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/marrow/analytics/IAnalyticPublisher;Lcom/marrow2/domain/video/notes/VideoNotesUseCase;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/SavedStateHandle;)V", "videoNotesArgsModel", "Lcom/marrow2/ui/video/notes/model/VideoNotesArgs;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/video/notes/model/VideoNotesUIState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_uiAction", "Lcom/marrow2/ui/video/notes/model/VideoNotesUIAction;", "uiAction", "getUiAction", "notifyEvent", "", "event", "Lcom/marrow2/ui/video/notes/model/VideoNotesUIEvent;", "getNotes", "Lkotlinx/coroutines/Job;", "lessonId", "", "rootSubjectId", "noteImageLoadFailed", "note", "Lcom/marrow2/ui/video/notes/model/VideoNoteUIModel;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "showFeedbackDialog", "currentMostVisibleItemPos", "", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoNotesViewModel extends POJOPropertyBuilderWithMember {
    public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer(null);
    private final getResolutionSize<zzscd> AudioAttributesCompatParcelizer;
    private final onPageFinished AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<zzscd> AudioAttributesImplApi26Parcelizer;
    private final moveItems AudioAttributesImplBaseParcelizer;
    private final getPlatform IconCompatParcelizer;
    private final setUpdatedStatus<shouldInterceptRequest> MediaBrowserCompatItemReceiver;
    private final onRebuffer RemoteActionCompatParcelizer;
    private final getResolutionSize<shouldInterceptRequest> write;

    @setSdkPayload
    public VideoNotesViewModel(onRebuffer onrebuffer, moveItems moveitems, getPlatform getplatform, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(onrebuffer, "");
        toMagicModuleMetaRepoModel.write(moveitems, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.RemoteActionCompatParcelizer = onrebuffer;
        this.AudioAttributesImplBaseParcelizer = moveitems;
        this.IconCompatParcelizer = getplatform;
        onPageFinished.Companion companion = onPageFinished.INSTANCE;
        this.AudioAttributesImplApi21Parcelizer = onPageFinished.Companion.AudioAttributesCompatParcelizer(pOJOPropertyBuilder5);
        read(onReceivedError.RemoteActionCompatParcelizer.INSTANCE);
        getResolutionSize<shouldInterceptRequest> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(shouldInterceptRequest.IconCompatParcelizer.INSTANCE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<zzscd> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(zzscd.read.INSTANCE);
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
    }

    public final setUpdatedStatus<shouldInterceptRequest> read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<zzscd> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void read(onReceivedError onreceivederror) {
        toMagicModuleMetaRepoModel.write(onreceivederror, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onreceivederror, onReceivedError.RemoteActionCompatParcelizer.INSTANCE)) {
            RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer(), this.AudioAttributesImplApi21Parcelizer.getRead());
            return;
        }
        if (onreceivederror instanceof onReceivedError.AudioAttributesCompatParcelizer) {
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(((onReceivedError.AudioAttributesCompatParcelizer) onreceivederror).RemoteActionCompatParcelizer());
            return;
        }
        if (onreceivederror instanceof onReceivedError.write) {
            onReceivedError.write writeVar = (onReceivedError.write) onreceivederror;
            RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer(), writeVar.RemoteActionCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onreceivederror, onReceivedError.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer(), this.AudioAttributesImplApi21Parcelizer.getWrite());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onreceivederror, onReceivedError.IconCompatParcelizer.INSTANCE)) {
            if (this.write.IconCompatParcelizer() instanceof shouldInterceptRequest.write) {
                this.AudioAttributesCompatParcelizer.write(new zzscd.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.getWrite()));
            }
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onreceivederror, onReceivedError.read.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.AudioAttributesCompatParcelizer.write(zzscd.read.INSTANCE);
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int write;

        /* JADX INFO: renamed from: com.marrow2.ui.video.notes.viewmodel.VideoNotesViewModel$AudioAttributesCompatParcelizer$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private Object AudioAttributesImplApi21Parcelizer;
            private Object AudioAttributesImplApi26Parcelizer;
            private Object AudioAttributesImplBaseParcelizer;
            private Object IconCompatParcelizer;
            private int MediaBrowserCompatCustomActionResultReceiver;
            private Object MediaBrowserCompatItemReceiver;
            private /* synthetic */ VideoNotesViewModel MediaMetadataCompat;
            private Object RemoteActionCompatParcelizer;
            private /* synthetic */ String read;
            private /* synthetic */ String write;

            /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 296
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.video.notes.viewmodel.VideoNotesViewModel.AudioAttributesCompatParcelizer.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(VideoNotesViewModel videoNotesViewModel, String str, String str2, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.MediaMetadataCompat = videoNotesViewModel;
                this.write = str;
                this.read = str2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.MediaMetadataCompat, this.write, this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(VideoNotesViewModel.this.IconCompatParcelizer, new AnonymousClass2(VideoNotesViewModel.this, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, null), this) == objIconCompatParcelizer) {
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
        AudioAttributesCompatParcelizer(String str, String str2, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoNotesViewModel.this.new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final setPassingYear RemoteActionCompatParcelizer(String str, String str2) {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(str, str2, null), new MagicModuleSubmissionRequestBody() { // from class: o.standardContainsValue
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoNotesViewModel.read(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(VideoNotesViewModel videoNotesViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoNotesViewModel.write.write(new shouldInterceptRequest.AudioAttributesCompatParcelizer(str));
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(cs csVar, Exception exc) {
        Exception exc2 = exc;
        Map<String, String> mapAudioAttributesCompatParcelizer = zzoid.AudioAttributesCompatParcelizer(csVar, this.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer(), exc, withRequestHeaders.AudioAttributesCompatParcelizer(exc2) ? "STATE_IMAGE_INTERNET" : "STATE_IMAGE_LOCAL");
        new getPlaylistProtectionSchemes(this.RemoteActionCompatParcelizer).read(exc2, "slides_failed_v2", mapAudioAttributesCompatParcelizer);
        indexOf.Companion companion = indexOf.INSTANCE;
        indexOf.Companion.AudioAttributesCompatParcelizer("slides_failed_v2", exc2, dispatchTouchEvent.AudioAttributesCompatParcelizer(mapAudioAttributesCompatParcelizer));
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int IconCompatParcelizer;
        private int read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objWrite;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                moveItems moveitems = VideoNotesViewModel.this.AudioAttributesImplBaseParcelizer;
                String str = this.write;
                this.read = 1;
                objWrite = moveitems.write(str);
                if (objWrite == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                objWrite = ((C0177getRfBanners) obj).getRemoteActionCompatParcelizer();
            }
            VideoNotesViewModel videoNotesViewModel = VideoNotesViewModel.this;
            int i2 = this.IconCompatParcelizer;
            if (C0177getRfBanners.write(objWrite)) {
                normalizeLanguageCode normalizelanguagecode = (normalizeLanguageCode) objWrite;
                videoNotesViewModel.AudioAttributesCompatParcelizer.write(new zzscd.write(normalizelanguagecode.write(), normalizelanguagecode.IconCompatParcelizer(), "notes ".concat(String.valueOf(i2))));
            }
            VideoNotesViewModel videoNotesViewModel2 = VideoNotesViewModel.this;
            if (C0177getRfBanners.IconCompatParcelizer(objWrite) != null) {
                videoNotesViewModel2.AudioAttributesCompatParcelizer.write(zzscd.RemoteActionCompatParcelizer.INSTANCE);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, int i, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.write = str;
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return VideoNotesViewModel.this.new IconCompatParcelizer(this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final setPassingYear IconCompatParcelizer(String str, int i) {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(str, i, null), new MagicModuleSubmissionRequestBody() { // from class: o.onLoadResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return VideoNotesViewModel.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(VideoNotesViewModel videoNotesViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        videoNotesViewModel.AudioAttributesCompatParcelizer.write(zzscd.RemoteActionCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/video/notes/viewmodel/VideoNotesViewModel$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
