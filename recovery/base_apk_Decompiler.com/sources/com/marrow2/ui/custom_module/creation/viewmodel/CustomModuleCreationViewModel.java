package com.marrow2.ui.custom_module.creation.viewmodel;

import com.google.android.exoplayer2.C;
import com.marrow.data.dataprovider.magic_module.usecase.MagicModuleParentType;
import com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleMetaUcModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleCreationViewModel;
import java.util.HashMap;
import kotlin.AbstractC0287zzf;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SphericalGLSurfaceViewVideoSurfaceListener;
import kotlin.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.WorkAccountClient;
import kotlin.getAnswerMap;
import kotlin.getCodecsCorrespondingToMimeType;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.onConnectionFailed;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001d8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020!0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020#0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020#0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001e\u0010 R\"\u0010\u0013\u001a\u00020!8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010$\u001a\u0004\b\u000e\u0010%\"\u0004\b\u000e\u0010&"}, d2 = {"Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCase;", "p0", "Lo/POJOPropertyBuilder5;", "p1", "Lo/getCodecsCorrespondingToMimeType;", "p2", "Lo/isSeekPending;", "p3", "<init>", "(Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCase;Lo/POJOPropertyBuilder5;Lo/getCodecsCorrespondingToMimeType;Lo/isSeekPending;)V", "Lo/zzf;", "", "read", "(Lo/zzf;)V", "AudioAttributesImplApi21Parcelizer", "()V", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCase;", "AudioAttributesCompatParcelizer", "Lo/getCodecsCorrespondingToMimeType;", "Lo/isSeekPending;", "IconCompatParcelizer", "Lo/getResolutionSize;", "RemoteActionCompatParcelizer", "Lo/getResolutionSize;", "write", "Lo/setUpdatedStatus;", "AudioAttributesImplBaseParcelizer", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "AudioAttributesImplApi26Parcelizer", "Lo/WorkAccountClient;", "I", "()I", "(I)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleCreationViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getCodecsCorrespondingToMimeType read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<WorkAccountClient> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<AbstractC0287zzf> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Integer> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final MagicModuleUseCase AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<AbstractC0287zzf> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setUpdatedStatus<Integer> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<WorkAccountClient> AudioAttributesImplBaseParcelizer;

    @setSdkPayload
    public CustomModuleCreationViewModel(MagicModuleUseCase magicModuleUseCase, POJOPropertyBuilder5 pOJOPropertyBuilder5, getCodecsCorrespondingToMimeType getcodecscorrespondingtomimetype, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(magicModuleUseCase, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(getcodecscorrespondingtomimetype, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesCompatParcelizer = magicModuleUseCase;
        this.read = getcodecscorrespondingtomimetype;
        this.IconCompatParcelizer = isseekpending;
        getResolutionSize<AbstractC0287zzf> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(AbstractC0287zzf.RemoteActionCompatParcelizer.INSTANCE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Integer> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(0);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        WorkAccountClient.IconCompatParcelizer iconCompatParcelizer = WorkAccountClient.write;
        getResolutionSize<WorkAccountClient> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(WorkAccountClient.IconCompatParcelizer.read(pOJOPropertyBuilder5));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        MediaBrowserCompatItemReceiver();
    }

    public final setUpdatedStatus<AbstractC0287zzf> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<Integer> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<WorkAccountClient> AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void read(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    public final void read(AbstractC0287zzf p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof AbstractC0287zzf.MediaBrowserCompatItemReceiver) {
            this.AudioAttributesImplApi21Parcelizer.write(Integer.valueOf(((AbstractC0287zzf.MediaBrowserCompatItemReceiver) p0).AudioAttributesCompatParcelizer()));
            this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().intValue();
            return;
        }
        if (p0 instanceof AbstractC0287zzf.AudioAttributesImplBaseParcelizer) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (p0 instanceof AbstractC0287zzf.MediaMetadataCompat) {
            this.AudioAttributesImplBaseParcelizer.write(((AbstractC0287zzf.MediaMetadataCompat) p0).AudioAttributesCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0287zzf.write.INSTANCE)) {
            isSeekPending isseekpending = this.IconCompatParcelizer;
            SphericalGLSurfaceViewVideoSurfaceListener sphericalGLSurfaceViewVideoSurfaceListener = SphericalGLSurfaceViewVideoSurfaceListener.write;
            StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3 styledPlayerControlViewLayoutManagerExternalSyntheticLambda3 = StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.write;
            isseekpending.write(SphericalGLSurfaceViewVideoSurfaceListener.AudioAttributesCompatParcelizer(StyledPlayerControlViewLayoutManagerExternalSyntheticLambda3.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer())), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0287zzf.IconCompatParcelizer.INSTANCE)) {
            this.write.write(AbstractC0287zzf.AudioAttributesImplApi21Parcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0287zzf.RemoteActionCompatParcelizer.INSTANCE)) {
            this.write.write(AbstractC0287zzf.RemoteActionCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AbstractC0287zzf.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            getResolutionSize<WorkAccountClient> getresolutionsize = this.AudioAttributesImplBaseParcelizer;
            WorkAccountClient workAccountClientIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            getresolutionsize.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer.onCustomAction : IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer.MediaDescriptionCompat : new HashMap(), (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null));
        } else if (p0 instanceof AbstractC0287zzf.AudioAttributesCompatParcelizer) {
            AudioAttributesImplApi21Parcelizer();
            isSeekPending isseekpending2 = this.IconCompatParcelizer;
            onConnectionFailed onconnectionfailed = onConnectionFailed.INSTANCE;
            isseekpending2.write(onConnectionFailed.read(((AbstractC0287zzf.AudioAttributesCompatParcelizer) p0).read()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (CustomModuleCreationViewModel.this.read.AudioAttributesImplApi26Parcelizer(this) == objIconCompatParcelizer) {
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleCreationViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getStatusCodeString
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleCreationViewModel.AudioAttributesCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatItemReceiver() {
        MagicModuleMetaUcModel magicModuleMetaData = this.AudioAttributesCompatParcelizer.getMagicModuleMetaData(MagicModuleParentType.CUSTOM_MODULE);
        if (magicModuleMetaData != null && magicModuleMetaData.isFirstModule() && magicModuleMetaData.getStatus() != 2) {
            isSeekPending isseekpending = this.IconCompatParcelizer;
            onConnectionFailed onconnectionfailed = onConnectionFailed.INSTANCE;
            isseekpending.write(onConnectionFailed.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.write.write(AbstractC0287zzf.AudioAttributesImplApi26Parcelizer.INSTANCE);
            return;
        }
        if (magicModuleMetaData != null && !magicModuleMetaData.isFirstModule() && magicModuleMetaData.getStatus() != 2) {
            this.write.write(new AbstractC0287zzf.MediaBrowserCompatSearchResultReceiver(magicModuleMetaData.getName()));
        } else {
            this.write.write(AbstractC0287zzf.read.INSTANCE);
        }
    }
}
