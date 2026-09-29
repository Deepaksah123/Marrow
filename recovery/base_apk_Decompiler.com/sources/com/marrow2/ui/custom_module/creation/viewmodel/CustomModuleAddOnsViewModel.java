package com.marrow2.ui.custom_module.creation.viewmodel;

import com.google.android.exoplayer2.C;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleAddOnsViewModel;
import java.util.List;
import kotlin.AuthProxy;
import kotlin.AuthProxyOptions;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.RepeatModeUtil;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.WorkAccountClient;
import kotlin.buildClient;
import kotlin.getAnswerMap;
import kotlin.getArray;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.putInt;
import kotlin.removeWorkAccount;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.setWorkAuthenticatorEnabledWithResult;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\n\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0007¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\n\u0010\u001cR&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001e0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001e0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020$0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020)0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b!\u0010\u001c"}, d2 = {"Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleAddOnsViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getArray;", "p0", "Lo/LogLogLevel;", "p1", "<init>", "(Lo/getArray;Lo/LogLogLevel;)V", "Lo/WorkAccountClient;", "", "read", "(Lo/WorkAccountClient;)V", "MediaBrowserCompatCustomActionResultReceiver", "()V", "AudioAttributesImplApi21Parcelizer", "", "MediaBrowserCompatItemReceiver", "Lo/removeWorkAccount;", "(Lo/removeWorkAccount;)V", "AudioAttributesImplApi26Parcelizer", "Lo/getArray;", "IconCompatParcelizer", "Lo/LogLogLevel;", "write", "Lo/getResolutionSize;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "RemoteActionCompatParcelizer", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "", "Lo/putInt;", "AudioAttributesCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", "Lo/setWorkAuthenticatorEnabledWithResult;", "AudioAttributesImplBaseParcelizer", "RatingCompat", "", "MediaDescriptionCompat", "Lo/buildClient;", "MediaMetadataCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleAddOnsViewModel extends POJOPropertyBuilderWithMember {
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<putInt>>> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<buildClient> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getArray IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<setWorkAuthenticatorEnabledWithResult> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<WorkAccountClient> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final LogLogLevel write;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<putInt>>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<String> RatingCompat;
    private final setUpdatedStatus<buildClient> MediaMetadataCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<setWorkAuthenticatorEnabledWithResult> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaDescriptionCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<WorkAccountClient> read;

    @setSdkPayload
    public CustomModuleAddOnsViewModel(getArray getarray, LogLogLevel logLogLevel) {
        toMagicModuleMetaRepoModel.write(getarray, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        this.IconCompatParcelizer = getarray;
        this.write = logLogLevel;
        getResolutionSize<WorkAccountClient> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new WorkAccountClient(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null));
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<putInt>>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<setWorkAuthenticatorEnabledWithResult> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(setWorkAuthenticatorEnabledWithResult.read.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer5;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        getResolutionSize<buildClient> getresolutionsizeRemoteActionCompatParcelizer6 = setStartTime.RemoteActionCompatParcelizer(new buildClient(null, null, null, 7, null));
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer6;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer6);
    }

    public final setUpdatedStatus<WorkAccountClient> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean>> AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<setWorkAuthenticatorEnabledWithResult> IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<buildClient> AudioAttributesCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final void read(WorkAccountClient p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read.write(p0);
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi21Parcelizer();
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            List<Integer> listRemoteActionCompatParcelizer;
            List<AuthProxyOptions> list;
            getResolutionSize getresolutionsize;
            List<Integer> list2;
            List<CourseConfigV2.CustomModuleQuestionSource> questionSource;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                obj = CustomModuleAddOnsViewModel.this.write.write(this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.read;
                list2 = (List) this.AudioAttributesCompatParcelizer;
                getresolutionsize = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                getresolutionsize.write(buildClient.write(list2, list, (List) obj));
                return getShowPopup.INSTANCE;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            CourseConfigV2.CustomModuleConfig customModuleConfig = ((CourseConfigV2) obj).getCustomModuleConfig();
            getResolutionSize getresolutionsize2 = CustomModuleAddOnsViewModel.this.MediaBrowserCompatSearchResultReceiver;
            buildClient buildclient = (buildClient) CustomModuleAddOnsViewModel.this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer();
            if (customModuleConfig == null || (listRemoteActionCompatParcelizer = customModuleConfig.getQuestionLimit()) == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List<AuthProxyOptions> listRemoteActionCompatParcelizer2 = (customModuleConfig == null || (questionSource = customModuleConfig.getQuestionSource()) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : AuthProxy.write(questionSource);
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = getresolutionsize2;
            this.write = buildclient;
            this.AudioAttributesCompatParcelizer = listRemoteActionCompatParcelizer;
            this.read = listRemoteActionCompatParcelizer2;
            this.MediaBrowserCompatCustomActionResultReceiver = 2;
            Object objRemoteActionCompatParcelizer = CustomModuleAddOnsViewModel.this.IconCompatParcelizer.RemoteActionCompatParcelizer(RepeatModeUtil.IconCompatParcelizer, this);
            if (objRemoteActionCompatParcelizer != objIconCompatParcelizer) {
                list = listRemoteActionCompatParcelizer2;
                obj = objRemoteActionCompatParcelizer;
                getresolutionsize = getresolutionsize2;
                list2 = listRemoteActionCompatParcelizer;
                getresolutionsize.write(buildClient.write(list2, list, (List) obj));
                return getShowPopup.INSTANCE;
            }
            return objIconCompatParcelizer;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleAddOnsViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.AccountTransferException
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleAddOnsViewModel.read(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(CustomModuleAddOnsViewModel customModuleAddOnsViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleAddOnsViewModel.MediaDescriptionCompat.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = CustomModuleAddOnsViewModel.this.MediaBrowserCompatCustomActionResultReceiver;
                this.write = getresolutionsize2;
                this.IconCompatParcelizer = 1;
                Object objRemoteActionCompatParcelizer = CustomModuleAddOnsViewModel.this.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
                if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objRemoteActionCompatParcelizer;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, obj);
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleAddOnsViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.AuthenticatorTransferCompletionStatus
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleAddOnsViewModel.RemoteActionCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(CustomModuleAddOnsViewModel customModuleAddOnsViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleAddOnsViewModel.MediaDescriptionCompat.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (CustomModuleAddOnsViewModel.this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(CustomModuleAddOnsViewModel.this.MediaBrowserCompatCustomActionResultReceiver, QBankStatsResponse.AudioAttributesCompatParcelizer(true));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(boolean z, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleAddOnsViewModel.this.new IconCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(true, null), new MagicModuleSubmissionRequestBody() { // from class: o.sendData
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleAddOnsViewModel.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(CustomModuleAddOnsViewModel customModuleAddOnsViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleAddOnsViewModel.MediaDescriptionCompat.write(str);
        return getShowPopup.INSTANCE;
    }

    public final void read(removeWorkAccount p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof removeWorkAccount.MediaBrowserCompatCustomActionResultReceiver) {
            this.read.write(((removeWorkAccount.MediaBrowserCompatCustomActionResultReceiver) p0).AudioAttributesCompatParcelizer());
        } else if (p0 instanceof removeWorkAccount.AudioAttributesImplApi21Parcelizer) {
            MediaBrowserCompatItemReceiver();
        } else if (!(p0 instanceof removeWorkAccount.RemoteActionCompatParcelizer)) {
            if (p0 instanceof removeWorkAccount.IconCompatParcelizer) {
                getResolutionSize<WorkAccountClient> getresolutionsize = this.read;
                WorkAccountClient workAccountClientIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
                Integer num = ((removeWorkAccount.IconCompatParcelizer) p0).read();
                getresolutionsize.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatItemReceiver : num != null ? num.intValue() : 10, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null));
            } else if (p0 instanceof removeWorkAccount.read) {
                getResolutionSize<WorkAccountClient> getresolutionsize2 = this.read;
                WorkAccountClient workAccountClientIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
                getresolutionsize2.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer2.RemoteActionCompatParcelizer : ((removeWorkAccount.read) p0).RemoteActionCompatParcelizer(), (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer2.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer2.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer2.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer2.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer2.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer2.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer2.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : null));
            } else if (p0 instanceof removeWorkAccount.write) {
                getResolutionSize<WorkAccountClient> getresolutionsize3 = this.read;
                WorkAccountClient workAccountClientIconCompatParcelizer3 = getresolutionsize3.IconCompatParcelizer();
                removeWorkAccount.write writeVar = (removeWorkAccount.write) p0;
                getresolutionsize3.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer3.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer3.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer3.MediaBrowserCompatSearchResultReceiver : writeVar.read(), (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer3.MediaMetadataCompat : writeVar.IconCompatParcelizer(), (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer3.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer3.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer3.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer3.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer3.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer3.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer3.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer3.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer3.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer3.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer3.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer3.AudioAttributesImplApi21Parcelizer : null));
            } else if (p0 instanceof removeWorkAccount.AudioAttributesImplApi26Parcelizer) {
                this.AudioAttributesImplApi26Parcelizer.write(new setWorkAuthenticatorEnabledWithResult.RemoteActionCompatParcelizer(((removeWorkAccount.AudioAttributesImplApi26Parcelizer) p0).IconCompatParcelizer()));
                return;
            } else {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, removeWorkAccount.AudioAttributesCompatParcelizer.INSTANCE)) {
                    throw new RenewEligibleCreator();
                }
                this.AudioAttributesImplApi26Parcelizer.write(setWorkAuthenticatorEnabledWithResult.read.INSTANCE);
            }
        }
        this.AudioAttributesImplApi26Parcelizer.write(setWorkAuthenticatorEnabledWithResult.read.INSTANCE);
    }
}
