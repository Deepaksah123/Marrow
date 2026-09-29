package com.marrow2.ui.custom_module.creation.viewmodel;

import com.google.android.exoplayer2.C;
import com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleModeViewModel;
import kotlin.Auth;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.WorkAccountClient;
import kotlin.getAccountTransferClient;
import kotlin.getAnswerMap;
import kotlin.getArray;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getMagicModuleTimeline;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\f\u001a\u00020\u00122\u000e\u0010\u0003\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0082@¢\u0006\u0004\b\f\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0007¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\f\u0010 R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020!0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020!0\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120#0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120#0\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\u0018\u0010 "}, d2 = {"Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleModeViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getArray;", "p0", "Lo/getDisplaySizeV17;", "p1", "Lo/POJOPropertyBuilder5;", "p2", "<init>", "(Lo/getArray;Lo/getDisplaySizeV17;Lo/POJOPropertyBuilder5;)V", "Lo/WorkAccountClient;", "", "IconCompatParcelizer", "(Lo/WorkAccountClient;)V", "read", "()V", "Lcom/marrow/data/api/models/response/custommodule/CustomModuleQuotaResponseBody;", "Lcom/marrow2/data/custom_module/remote/model/CustomModuleQuotaModel;", "Lo/Auth;", "(Lcom/marrow/data/api/models/response/custommodule/CustomModuleQuotaResponseBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getAccountTransferClient;", "RemoteActionCompatParcelizer", "(Lo/getAccountTransferClient;)V", "Lo/getArray;", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/getDisplaySizeV17;", "Lo/getResolutionSize;", "write", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "AudioAttributesImplBaseParcelizer", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleModeViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Auth>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<Auth>> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getDisplaySizeV17 read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<String> AudioAttributesImplApi26Parcelizer;
    private final setUpdatedStatus<WorkAccountClient> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getArray AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<WorkAccountClient> RemoteActionCompatParcelizer;

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return CustomModuleModeViewModel.this.IconCompatParcelizer(null, this);
        }
    }

    @setSdkPayload
    public CustomModuleModeViewModel(getArray getarray, getDisplaySizeV17 getdisplaysizev17, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(getarray, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.AudioAttributesCompatParcelizer = getarray;
        this.read = getdisplaysizev17;
        getResolutionSize<WorkAccountClient> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new WorkAccountClient(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.IconCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer("");
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Auth>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
    }

    public final setUpdatedStatus<WorkAccountClient> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<Auth>> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void IconCompatParcelizer(WorkAccountClient p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer.write(p0);
        read();
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                obj = CustomModuleModeViewModel.this.AudioAttributesCompatParcelizer.write(this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, obj);
                return getShowPopup.INSTANCE;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            getResolutionSize getresolutionsize2 = CustomModuleModeViewModel.this.MediaBrowserCompatCustomActionResultReceiver;
            CustomModuleModeViewModel customModuleModeViewModel = CustomModuleModeViewModel.this;
            this.AudioAttributesCompatParcelizer = null;
            this.IconCompatParcelizer = getresolutionsize2;
            this.RemoteActionCompatParcelizer = 2;
            obj = customModuleModeViewModel.IconCompatParcelizer((CustomModuleQuotaResponseBody) obj, this);
            if (obj != objIconCompatParcelizer) {
                getresolutionsize = getresolutionsize2;
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, obj);
                return getShowPopup.INSTANCE;
            }
            return objIconCompatParcelizer;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleModeViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzh
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleModeViewModel.RemoteActionCompatParcelizer(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(CustomModuleModeViewModel customModuleModeViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleModeViewModel.write.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody r24, kotlin.SampleVideos<? super kotlin.Auth> r25) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleModeViewModel.IconCompatParcelizer(com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody, o.SampleVideos):java.lang.Object");
    }

    public final void RemoteActionCompatParcelizer(getAccountTransferClient p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof getAccountTransferClient.AudioAttributesCompatParcelizer) {
            getResolutionSize<WorkAccountClient> getresolutionsize = this.RemoteActionCompatParcelizer;
            WorkAccountClient workAccountClientIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            getresolutionsize.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null));
        } else if (p0 instanceof getAccountTransferClient.read) {
            getResolutionSize<WorkAccountClient> getresolutionsize2 = this.RemoteActionCompatParcelizer;
            WorkAccountClient workAccountClientIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
            getresolutionsize2.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer2.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer2.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer2.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer2.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : 1, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer2.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer2.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer2.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : null));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleModeViewModel$write;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "write", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private static final /* synthetic */ write[] AudioAttributesImplApi26Parcelizer;
        public static final write AudioAttributesCompatParcelizer = new write("PRO_USER_0_MONTHLY_CREATED", 0);
        public static final write IconCompatParcelizer = new write("PRO_USER_MONTHLY_LIMIT_NOT_REACHED", 1);
        public static final write AudioAttributesImplApi21Parcelizer = new write("PRO_USER_MONTHLY_LIMIT_REACHED", 2);
        public static final write write = new write("FREE_USER_0_COMPLETED", 3);
        public static final write read = new write("FREE_USER_LIMIT_NOT_REACHED", 4);
        public static final write RemoteActionCompatParcelizer = new write("FREE_USER_LIMIT_LIMIT_REACHED", 5);

        private write(String str, int i) {
        }

        static {
            write[] writeVarArrIconCompatParcelizer = IconCompatParcelizer();
            AudioAttributesImplApi26Parcelizer = writeVarArrIconCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(writeVarArrIconCompatParcelizer);
        }

        private static final /* synthetic */ write[] IconCompatParcelizer() {
            return new write[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, AudioAttributesImplApi21Parcelizer, write, read, RemoteActionCompatParcelizer};
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) AudioAttributesImplApi26Parcelizer.clone();
        }
    }
}
