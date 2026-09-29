package com.marrow2.ui.custom_module.done;

import com.marrow.data.models.custommodule.CustomModule;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import com.marrow2.ui.custom_module.done.CustomModuleScoreViewModel;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.ContentDataSource;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SubtitleViewOutput;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getArray;
import kotlin.getFieldValue;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isFieldSet;
import kotlin.isSeekPending;
import kotlin.onScrollChange;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zba;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0011\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R)\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100#0'8\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020+0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R \u0010!\u001a\b\u0012\u0004\u0012\u00020+0'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b$\u0010*R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\"\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b!\u0010*R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010%R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b\u0018\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001e0'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b\u001b\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u0002010\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R \u0010,\u001a\b\u0012\u0004\u0012\u0002010'8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b\u0014\u0010*R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u001c\u0010(\u001a\u00020+8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b\u001f\u00104"}, d2 = {"Lcom/marrow2/ui/custom_module/done/CustomModuleScoreViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/getArray;", "p1", "Lo/SubtitleViewOutput;", "p2", "Lo/isSeekPending;", "p3", "<init>", "(Lo/POJOPropertyBuilder5;Lo/getArray;Lo/SubtitleViewOutput;Lo/isSeekPending;)V", "", "AudioAttributesImplApi21Parcelizer", "()V", "MediaBrowserCompatSearchResultReceiver", "", "RemoteActionCompatParcelizer", "(II)V", "Lo/isFieldSet;", "AudioAttributesCompatParcelizer", "(Lo/isFieldSet;)V", "MediaDescriptionCompat", "Lo/getArray;", "IconCompatParcelizer", "MediaMetadataCompat", "Lo/SubtitleViewOutput;", "read", "Lo/isSeekPending;", "write", "", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Lo/getResolutionSize;", "Lo/getSubscriptionExpiresOn;", "MediaBrowserCompatItemReceiver", "Lo/getResolutionSize;", "AudioAttributesImplBaseParcelizer", "Lo/setUpdatedStatus;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "onAddQueueItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCustomAction", "MediaBrowserCompatMediaItem", "RatingCompat", "Lo/getFieldValue;", "onCommand", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleScoreViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final isSeekPending write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Integer> MediaDescriptionCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getResolutionSize<Pair<Integer, Integer>> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<String> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getArray IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<String> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final SubtitleViewOutput read;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getFieldValue> onCustomAction;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final setUpdatedStatus<Pair<Integer, Integer>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final setUpdatedStatus<getFieldValue> onAddQueueItem;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final setUpdatedStatus<Integer> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getResolutionSize<String> onCommand;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatItemReceiver;

    @setSdkPayload
    public CustomModuleScoreViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, getArray getarray, SubtitleViewOutput subtitleViewOutput, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(getarray, "");
        toMagicModuleMetaRepoModel.write(subtitleViewOutput, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.IconCompatParcelizer = getarray;
        this.read = subtitleViewOutput;
        this.write = isseekpending;
        String str = (String) pOJOPropertyBuilder5.write("LessonDoneContract_cm_id");
        this.AudioAttributesCompatParcelizer = str == null ? "" : str;
        String str2 = (String) pOJOPropertyBuilder5.write("owner_category");
        this.RemoteActionCompatParcelizer = str2 == null ? CustomModule.DEFAULT_MODULE_OWNER : str2;
        getResolutionSize<Pair<Integer, Integer>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new Pair(0, 0));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(null);
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(0);
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer("");
        this.RatingCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        setUpdatedStatus<String> setupdatedstatus = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        this.MediaBrowserCompatSearchResultReceiver = setupdatedstatus;
        getResolutionSize<getFieldValue> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(getFieldValue.write.INSTANCE);
        this.onCustomAction = getresolutionsizeRemoteActionCompatParcelizer6;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer7 = setStartTime.RemoteActionCompatParcelizer("");
        this.onCommand = getresolutionsizeRemoteActionCompatParcelizer7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer7);
        AudioAttributesImplApi21Parcelizer();
        if (setupdatedstatus.IconCompatParcelizer().length() == 0) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass3(null), new MagicModuleSubmissionRequestBody() { // from class: o.getRequestedScopes
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return CustomModuleScoreViewModel.read((String) obj2);
                }
            });
        }
    }

    public final setUpdatedStatus<Pair<Integer, Integer>> AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final setUpdatedStatus<Integer> IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<String> read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<getFieldValue> AudioAttributesCompatParcelizer() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.custom_module.done.CustomModuleScoreViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                obj = CustomModuleScoreViewModel.this.IconCompatParcelizer.write(CustomModuleScoreViewModel.this.AudioAttributesCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            String str = (String) obj;
            if (str.length() > 0) {
                CustomModuleScoreViewModel.this.RatingCompat.write(str);
            }
            return getShowPopup.INSTANCE;
        }

        AnonymousClass3(SampleVideos<? super AnonymousClass3> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleScoreViewModel.this.new AnonymousClass3(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass3) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
                audioAttributesCompatParcelizer2.IconCompatParcelizer = !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) CustomModuleScoreViewModel.this.RemoteActionCompatParcelizer, (Object) CustomModule.MODULE_OWNER_FACULTY);
                this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                this.read = 1;
                Object objIconCompatParcelizer2 = CustomModuleScoreViewModel.this.IconCompatParcelizer.IconCompatParcelizer(this);
                if (objIconCompatParcelizer2 == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                obj = objIconCompatParcelizer2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                audioAttributesCompatParcelizer = (MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer) this.AudioAttributesCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CustomModuleUCModel customModuleUCModel = (CustomModuleUCModel) obj;
            if (customModuleUCModel != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) customModuleUCModel.getAudioAttributesImplApi21Parcelizer(), (Object) CustomModule.MODULE_OWNER_FACULTY) && customModuleUCModel.getIconCompatParcelizer() != 0) {
                audioAttributesCompatParcelizer.IconCompatParcelizer = customModuleUCModel.getIconCompatParcelizer() < System.currentTimeMillis();
            }
            CustomModuleScoreViewModel.this.MediaBrowserCompatItemReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleScoreViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzy
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleScoreViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = CustomModuleScoreViewModel.this.IconCompatParcelizer.read(CustomModuleScoreViewModel.this.AudioAttributesCompatParcelizer, this);
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
            if (list.isEmpty()) {
                CustomModuleScoreViewModel.this.onCommand.write("Unable to load mcq information");
            } else {
                int size = list.size();
                CustomModuleScoreViewModel.this.RemoteActionCompatParcelizer(ContentDataSource.write(list), size);
            }
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleScoreViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.AuthorizationRequest
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleScoreViewModel.AudioAttributesImplApi21Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int p0, int p1) {
        this.AudioAttributesImplBaseParcelizer.write(new Pair<>(Integer.valueOf(p0), Integer.valueOf(p1)));
    }

    public final void AudioAttributesCompatParcelizer(isFieldSet p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof isFieldSet.AudioAttributesImplApi26Parcelizer) {
            isSeekPending isseekpending = this.write;
            onScrollChange onscrollchange = onScrollChange.INSTANCE;
            isseekpending.write(onScrollChange.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.onCustomAction.write(new getFieldValue.IconCompatParcelizer(this.AudioAttributesCompatParcelizer));
            return;
        }
        if (p0 instanceof isFieldSet.AudioAttributesCompatParcelizer) {
            MediaDescriptionCompat();
            return;
        }
        if (p0 instanceof isFieldSet.RemoteActionCompatParcelizer) {
            MediaBrowserCompatSearchResultReceiver();
            return;
        }
        if (p0 instanceof isFieldSet.read) {
            int iFloatValue = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().IconCompatParcelizer().intValue() > 0 ? (int) ((this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().write().floatValue() * 100.0f) / this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().IconCompatParcelizer().floatValue()) : 0;
            isSeekPending isseekpending2 = this.write;
            onScrollChange onscrollchange2 = onScrollChange.INSTANCE;
            isseekpending2.write(onScrollChange.RemoteActionCompatParcelizer(iFloatValue), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.MediaDescriptionCompat.write(Integer.valueOf(iFloatValue));
            this.handleMediaPlayPauseIfPendingOnHandler = true;
            return;
        }
        if (p0 instanceof isFieldSet.AudioAttributesImplApi21Parcelizer) {
            String strIconCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer();
            isSeekPending isseekpending3 = this.write;
            onScrollChange onscrollchange3 = onScrollChange.INSTANCE;
            isseekpending3.write(onScrollChange.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            SubtitleViewOutput subtitleViewOutput = this.read;
            ((isFieldSet.AudioAttributesImplApi21Parcelizer) p0).write();
            subtitleViewOutput.RemoteActionCompatParcelizer(strIconCompatParcelizer, "join_custom_module", new zba(this, strIconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, isFieldSet.IconCompatParcelizer.INSTANCE)) {
            this.onCustomAction.write(getFieldValue.write.INSTANCE);
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, isFieldSet.write.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending4 = this.write;
            onScrollChange onscrollchange4 = onScrollChange.INSTANCE;
            isseekpending4.write(onScrollChange.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(CustomModuleScoreViewModel customModuleScoreViewModel, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        if (str2.length() == 0) {
            customModuleScoreViewModel.onCommand.write("There was a problem creating a share link. Please try again later");
        } else {
            customModuleScoreViewModel.onCustomAction.write(new getFieldValue.RemoteActionCompatParcelizer(str2, str));
        }
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (CustomModuleScoreViewModel.this.AudioAttributesCompatParcelizer.length() > 0) {
                    isSeekPending isseekpending = CustomModuleScoreViewModel.this.write;
                    onScrollChange onscrollchange = onScrollChange.INSTANCE;
                    isseekpending.write(onScrollChange.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                    this.read = 1;
                    if (CustomModuleScoreViewModel.this.IconCompatParcelizer.read(this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return getShowPopup.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            CustomModuleScoreViewModel.this.onCustomAction.write(getFieldValue.read.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleScoreViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaDescriptionCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.authorize
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleScoreViewModel.IconCompatParcelizer(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(CustomModuleScoreViewModel customModuleScoreViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleScoreViewModel.onCommand.write(str);
        return getShowPopup.INSTANCE;
    }
}
