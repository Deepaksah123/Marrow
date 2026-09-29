package com.marrow2.ui.custom_module.creation.viewmodel;

import com.google.android.exoplayer2.C;
import com.marrow2.data.tag.local.model.TagLSModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleTagsViewModel;
import java.util.List;
import kotlin.AccountTransfer;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.WorkAccountClient;
import kotlin.binarySearchFloor;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.notifyCompletion;
import kotlin.retrieveData;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\b\u0010\u0019R \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b\"\u0010\u0019R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\"\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001d\u0010\u0019"}, d2 = {"Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTagsViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/binarySearchFloor;", "p0", "<init>", "(Lo/binarySearchFloor;)V", "Lo/WorkAccountClient;", "", "IconCompatParcelizer", "(Lo/WorkAccountClient;)V", "MediaBrowserCompatCustomActionResultReceiver", "()V", "Lo/retrieveData;", "RemoteActionCompatParcelizer", "(Lo/retrieveData;)V", "Lo/AccountTransfer;", "write", "(Lo/AccountTransfer;)V", "Lo/binarySearchFloor;", "Lo/getResolutionSize;", "Lo/getResolutionSize;", "read", "Lo/setUpdatedStatus;", "MediaBrowserCompatItemReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "Lcom/marrow2/data/tag/local/model/TagLSModel;", "MediaDescriptionCompat", "AudioAttributesCompatParcelizer", "", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleTagsViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<retrieveData> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<String> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<retrieveData> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final binarySearchFloor IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<WorkAccountClient> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<List<TagLSModel>> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<WorkAccountClient> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<List<TagLSModel>> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaBrowserCompatItemReceiver;

    @setSdkPayload
    public CustomModuleTagsViewModel(binarySearchFloor binarysearchfloor) {
        toMagicModuleMetaRepoModel.write(binarysearchfloor, "");
        this.IconCompatParcelizer = binarysearchfloor;
        getResolutionSize<WorkAccountClient> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new WorkAccountClient(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null));
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<List<TagLSModel>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<retrieveData> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(null);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
    }

    public final setUpdatedStatus<WorkAccountClient> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<List<TagLSModel>> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<retrieveData> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void IconCompatParcelizer(WorkAccountClient p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesImplApi21Parcelizer.write(Boolean.TRUE);
        this.read.write(p0);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            boolean z = true;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                obj = CustomModuleTagsViewModel.this.IconCompatParcelizer.RemoteActionCompatParcelizer("mcq", this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            List<TagLSModel> listMediaBrowserCompatMediaItem = (List) obj;
            CustomModuleTagsViewModel.this.AudioAttributesImplApi21Parcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            CustomModuleTagsViewModel.this.write.write(listMediaBrowserCompatMediaItem);
            Object objIconCompatParcelizer2 = CustomModuleTagsViewModel.this.read.IconCompatParcelizer();
            CustomModuleTagsViewModel customModuleTagsViewModel = CustomModuleTagsViewModel.this;
            WorkAccountClient workAccountClient = (WorkAccountClient) objIconCompatParcelizer2;
            if (listMediaBrowserCompatMediaItem.size() != workAccountClient.MediaBrowserCompatMediaItem().size() && !workAccountClient.MediaBrowserCompatMediaItem().isEmpty()) {
                z = false;
            }
            getResolutionSize getresolutionsize = customModuleTagsViewModel.MediaBrowserCompatCustomActionResultReceiver;
            notifyCompletion notifycompletion = z ? notifyCompletion.AudioAttributesCompatParcelizer : notifyCompletion.IconCompatParcelizer;
            if (!z) {
                listMediaBrowserCompatMediaItem = workAccountClient.MediaBrowserCompatMediaItem();
            }
            getresolutionsize.write(new retrieveData(notifycompletion, listMediaBrowserCompatMediaItem, workAccountClient.getAudioAttributesImplBaseParcelizer()));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleTagsViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzl
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleTagsViewModel.RemoteActionCompatParcelizer(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(CustomModuleTagsViewModel customModuleTagsViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleTagsViewModel.MediaBrowserCompatItemReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(retrieveData p0) {
        if (p0 == null) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.write(p0);
        getResolutionSize<WorkAccountClient> getresolutionsize = this.read;
        WorkAccountClient workAccountClientIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : p0.read(), (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer.IconCompatParcelizer : p0.IconCompatParcelizer() == notifyCompletion.AudioAttributesCompatParcelizer, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplBaseParcelizer : p0.AudioAttributesCompatParcelizer(), (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null));
    }

    public final void write(AccountTransfer p0) {
        List<TagLSModel> listRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof AccountTransfer.IconCompatParcelizer) {
            retrieveData retrievedataIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            RemoteActionCompatParcelizer(retrievedataIconCompatParcelizer != null ? retrievedataIconCompatParcelizer.read(((AccountTransfer.IconCompatParcelizer) p0).AudioAttributesCompatParcelizer(), this.write.IconCompatParcelizer().size()) : null);
            return;
        }
        if (p0 instanceof AccountTransfer.AudioAttributesCompatParcelizer) {
            RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer() != null ? retrieveData.write(IntermediateLoginResponseBody.RemoteActionCompatParcelizer()) : null);
            return;
        }
        if (p0 instanceof AccountTransfer.write) {
            RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer() != null ? retrieveData.RemoteActionCompatParcelizer(this.write.IconCompatParcelizer()) : null);
            return;
        }
        if (p0 instanceof AccountTransfer.RemoteActionCompatParcelizer) {
            retrieveData retrievedataIconCompatParcelizer2 = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            RemoteActionCompatParcelizer(retrievedataIconCompatParcelizer2 != null ? retrievedataIconCompatParcelizer2.RemoteActionCompatParcelizer() : null);
        } else {
            if (!(p0 instanceof AccountTransfer.read)) {
                throw new RenewEligibleCreator();
            }
            getResolutionSize<WorkAccountClient> getresolutionsize = this.read;
            WorkAccountClient workAccountClientIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            retrieveData retrievedataIconCompatParcelizer3 = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            if (retrievedataIconCompatParcelizer3 == null || (listRemoteActionCompatParcelizer = retrievedataIconCompatParcelizer3.read()) == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            getresolutionsize.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : listRemoteActionCompatParcelizer, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null));
        }
    }
}
