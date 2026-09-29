package com.marrow2.ui.custom_module.creation.viewmodel;

import com.google.android.exoplayer2.C;
import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleSubjectSelectionViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Ranim;
import kotlin.Ranimator;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.WorkAccountClient;
import kotlin.decodeBitmap;
import kotlin.getAnswerMap;
import kotlin.getArray;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\n\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\n\u0010 R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120#0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR,\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120#0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010 R&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00120#0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020'0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020'0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020%0\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001f"}, d2 = {"Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleSubjectSelectionViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getArray;", "p0", "Lo/getDisplaySizeV17;", "p1", "<init>", "(Lo/getArray;Lo/getDisplaySizeV17;)V", "Lo/WorkAccountClient;", "", "read", "(Lo/WorkAccountClient;)V", "MediaBrowserCompatCustomActionResultReceiver", "()V", "Lo/Ranim;", "write", "(Lo/Ranim;)V", "MediaBrowserCompatItemReceiver", "", "Lcom/marrow2/domain/custom_module/model/CustomModuleSubjectListModel;", "(Ljava/util/List;)Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "Lo/getArray;", "RemoteActionCompatParcelizer", "MediaDescriptionCompat", "Lo/getDisplaySizeV17;", "Lo/getResolutionSize;", "AudioAttributesCompatParcelizer", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "AudioAttributesImplApi21Parcelizer", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Ljava/util/List;", "IconCompatParcelizer", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "MediaMetadataCompat", "", "AudioAttributesImplApi26Parcelizer", "Lo/Ranimator;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleSubjectSelectionViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<WorkAccountClient> write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<WorkAccountClient> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<String> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getArray RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Ranimator> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private List<CustomModuleSubjectListModel> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Ranimator> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getDisplaySizeV17 read;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleSubjectListModel>>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleSubjectListModel>>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<String>>> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaMetadataCompat;

    @setSdkPayload
    public CustomModuleSubjectSelectionViewModel(getArray getarray, getDisplaySizeV17 getdisplaysizev17) {
        toMagicModuleMetaRepoModel.write(getarray, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        this.RemoteActionCompatParcelizer = getarray;
        this.read = getdisplaysizev17;
        getResolutionSize<WorkAccountClient> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new WorkAccountClient(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null));
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        this.IconCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleSubjectListModel>>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        this.AudioAttributesImplApi26Parcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        getResolutionSize<Ranimator> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Ranimator.IconCompatParcelizer.INSTANCE);
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
    }

    public final setUpdatedStatus<WorkAccountClient> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleSubjectListModel>>> IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<Ranimator> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void read(WorkAccountClient p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write.write(p0);
        MediaBrowserCompatCustomActionResultReceiver();
        MediaBrowserCompatItemReceiver();
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getResolutionSize getresolutionsize;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize2 = CustomModuleSubjectSelectionViewModel.this.AudioAttributesImplApi26Parcelizer;
                this.read = getresolutionsize2;
                this.AudioAttributesCompatParcelizer = 1;
                Object objOnFastForward = CustomModuleSubjectSelectionViewModel.this.read.onFastForward(this);
                if (objOnFastForward == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objOnFastForward;
                getresolutionsize = getresolutionsize2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getresolutionsize = (getResolutionSize) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, obj);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleSubjectSelectionViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.doExecute
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleSubjectSelectionViewModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(CustomModuleSubjectSelectionViewModel customModuleSubjectSelectionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleSubjectSelectionViewModel.MediaMetadataCompat.write(str);
        return getShowPopup.INSTANCE;
    }

    public final void write(Ranim p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = -1;
        int i2 = 0;
        if (p0 instanceof Ranim.AudioAttributesImplBaseParcelizer) {
            HashMap<String, List<String>> mapMediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
            List<CustomModuleSubjectListModel> listRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            ArrayList arrayList = new ArrayList(listRemoteActionCompatParcelizer);
            Iterator<CustomModuleSubjectListModel> it = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) it.next().getRead(), (Object) ((Ranim.AudioAttributesImplBaseParcelizer) p0).read())) {
                    i = i2;
                    break;
                }
                i2++;
            }
            Ranim.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (Ranim.AudioAttributesImplBaseParcelizer) p0;
            if (audioAttributesImplBaseParcelizer.IconCompatParcelizer()) {
                mapMediaBrowserCompatCustomActionResultReceiver.remove(audioAttributesImplBaseParcelizer.read());
                arrayList.set(i, CustomModuleSubjectListModel.write(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read().get(i), null, null, false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), false, 23));
            } else {
                mapMediaBrowserCompatCustomActionResultReceiver.put(audioAttributesImplBaseParcelizer.read(), audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
                arrayList.set(i, CustomModuleSubjectListModel.write(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read().get(i), null, null, false, audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), false, 23));
            }
            getResolutionSize<WorkAccountClient> getresolutionsize = this.write;
            WorkAccountClient workAccountClientIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            getresolutionsize.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer.MediaDescriptionCompat : mapMediaBrowserCompatCustomActionResultReceiver, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null));
            this.MediaBrowserCompatCustomActionResultReceiver.write(new decodeBitmap(arrayList));
            this.MediaBrowserCompatItemReceiver.write(Ranimator.IconCompatParcelizer.INSTANCE);
        } else if (p0 instanceof Ranim.read) {
            List<CustomModuleSubjectListModel> list = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!((CustomModuleSubjectListModel) obj).getWrite()) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = this.IconCompatParcelizer.iterator();
            while (it2.hasNext()) {
                arrayList3.add(CustomModuleSubjectListModel.write((CustomModuleSubjectListModel) it2.next(), null, null, true, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), false, 19));
            }
            this.MediaBrowserCompatCustomActionResultReceiver.write(new decodeBitmap(arrayList3));
            getResolutionSize<WorkAccountClient> getresolutionsize2 = this.write;
            WorkAccountClient workAccountClientIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
            getresolutionsize2.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer2.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer2.onCustomAction : arrayList3, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesCompatParcelizer : true, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer2.MediaDescriptionCompat : new HashMap(), (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer2.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer2.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer2.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer2.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : null));
            this.MediaBrowserCompatItemReceiver.write(Ranimator.IconCompatParcelizer.INSTANCE);
        } else if (p0 instanceof Ranim.write) {
            if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer() == null) {
                return;
            }
            List<CustomModuleSubjectListModel> list2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (!((CustomModuleSubjectListModel) obj2).getWrite()) {
                    arrayList4.add(obj2);
                }
            }
            if (!arrayList4.isEmpty()) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it3 = this.IconCompatParcelizer.iterator();
            while (it3.hasNext()) {
                arrayList5.add(CustomModuleSubjectListModel.write((CustomModuleSubjectListModel) it3.next(), null, null, false, null, false, 27));
            }
            this.MediaBrowserCompatCustomActionResultReceiver.write(new decodeBitmap(arrayList5));
            getResolutionSize<WorkAccountClient> getresolutionsize3 = this.write;
            WorkAccountClient workAccountClientIconCompatParcelizer3 = getresolutionsize3.IconCompatParcelizer();
            getresolutionsize3.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer3.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer3.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer3.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer3.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer3.onCustomAction : IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer3.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer3.MediaDescriptionCompat : new HashMap(), (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer3.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer3.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer3.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer3.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer3.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer3.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer3.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer3.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer3.AudioAttributesImplApi21Parcelizer : null));
            this.MediaBrowserCompatItemReceiver.write(Ranimator.IconCompatParcelizer.INSTANCE);
        } else if (p0 instanceof Ranim.RemoteActionCompatParcelizer) {
            List<CustomModuleSubjectListModel> listRemoteActionCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
            if (listRemoteActionCompatParcelizer2 == null) {
                listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            ArrayList arrayList6 = new ArrayList(listRemoteActionCompatParcelizer2);
            Iterator<CustomModuleSubjectListModel> it4 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) it4.next().getRead(), (Object) ((Ranim.RemoteActionCompatParcelizer) p0).RemoteActionCompatParcelizer().getRead())) {
                    i = i2;
                    break;
                }
                i2++;
            }
            Ranim.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (Ranim.RemoteActionCompatParcelizer) p0;
            arrayList6.set(i, CustomModuleSubjectListModel.write(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read().get(i), null, null, !remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), false, 19));
            if (!remoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
                HashMap<String, List<String>> mapMediaBrowserCompatCustomActionResultReceiver2 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
                mapMediaBrowserCompatCustomActionResultReceiver2.remove(remoteActionCompatParcelizer.RemoteActionCompatParcelizer().getRead());
                getResolutionSize<WorkAccountClient> getresolutionsize4 = this.write;
                WorkAccountClient workAccountClientIconCompatParcelizer4 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
                getresolutionsize4.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer4.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer4.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer4.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer4.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer4.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer4.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer4.MediaDescriptionCompat : mapMediaBrowserCompatCustomActionResultReceiver2, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer4.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer4.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer4.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer4.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer4.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer4.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer4.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer4.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer4.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer4.AudioAttributesImplApi21Parcelizer : null));
            }
            this.MediaBrowserCompatCustomActionResultReceiver.write(new decodeBitmap(arrayList6));
            getResolutionSize<WorkAccountClient> getresolutionsize5 = this.write;
            WorkAccountClient workAccountClientIconCompatParcelizer5 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : arrayList6) {
                if (((CustomModuleSubjectListModel) obj3).getWrite()) {
                    arrayList7.add(obj3);
                }
            }
            getresolutionsize5.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer5.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer5.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer5.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer5.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer5.onCustomAction : arrayList7, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer5.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer5.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer5.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer5.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer5.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer5.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer5.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer5.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer5.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer5.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer5.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer5.AudioAttributesImplApi21Parcelizer : null));
            this.MediaBrowserCompatItemReceiver.write(Ranimator.IconCompatParcelizer.INSTANCE);
        } else if (p0 instanceof Ranim.AudioAttributesCompatParcelizer) {
            getResolutionSize<WorkAccountClient> getresolutionsize6 = this.write;
            WorkAccountClient workAccountClientIconCompatParcelizer6 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            Ranim.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (Ranim.AudioAttributesCompatParcelizer) p0;
            getresolutionsize6.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer6.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer6.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer6.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer6.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer6.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer6.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer6.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer6.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer6.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer6.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer6.MediaBrowserCompatMediaItem : audioAttributesCompatParcelizer.read().getIconCompatParcelizer(), (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer6.RatingCompat : audioAttributesCompatParcelizer.read().getRead(), (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer6.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer6.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer6.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer6.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer6.AudioAttributesImplApi21Parcelizer : null));
            this.MediaBrowserCompatItemReceiver.write(new Ranimator.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer()));
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Ranim.IconCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.MediaBrowserCompatItemReceiver.write(Ranimator.IconCompatParcelizer.INSTANCE);
        }
        this.MediaBrowserCompatItemReceiver.write(Ranimator.IconCompatParcelizer.INSTANCE);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objAudioAttributesImplApi26Parcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                objAudioAttributesImplApi26Parcelizer = CustomModuleSubjectSelectionViewModel.this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(this);
                if (objAudioAttributesImplApi26Parcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                objAudioAttributesImplApi26Parcelizer = obj;
            }
            List list = (List) objAudioAttributesImplApi26Parcelizer;
            List<CustomModuleSubjectListModel> list2 = CustomModuleSubjectSelectionViewModel.this.read((List<CustomModuleSubjectListModel>) list);
            CustomModuleSubjectSelectionViewModel.this.IconCompatParcelizer = list2;
            if (!CustomModuleSubjectSelectionViewModel.this.read().IconCompatParcelizer().MediaBrowserCompatSearchResultReceiver().isEmpty()) {
                CustomModuleSubjectSelectionViewModel customModuleSubjectSelectionViewModel = CustomModuleSubjectSelectionViewModel.this;
                for (CustomModuleSubjectListModel customModuleSubjectListModel : list2) {
                    List<CustomModuleSubjectListModel> listMediaBrowserCompatSearchResultReceiver = customModuleSubjectSelectionViewModel.read().IconCompatParcelizer().MediaBrowserCompatSearchResultReceiver();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listMediaBrowserCompatSearchResultReceiver) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((CustomModuleSubjectListModel) obj2).getRead(), (Object) customModuleSubjectListModel.getRead())) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    customModuleSubjectListModel.RemoteActionCompatParcelizer(!arrayList2.isEmpty() && ((CustomModuleSubjectListModel) arrayList2.get(0)).getWrite());
                    if (customModuleSubjectSelectionViewModel.read().IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver().containsKey(customModuleSubjectListModel.getRead())) {
                        List<String> listRemoteActionCompatParcelizer = customModuleSubjectSelectionViewModel.read().IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver().get(customModuleSubjectListModel.getRead());
                        if (listRemoteActionCompatParcelizer == null) {
                            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                        }
                        customModuleSubjectListModel.read(listRemoteActionCompatParcelizer);
                    }
                }
            }
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(CustomModuleSubjectSelectionViewModel.this.MediaBrowserCompatCustomActionResultReceiver, list2);
            getResolutionSize getresolutionsize = CustomModuleSubjectSelectionViewModel.this.write;
            WorkAccountClient workAccountClient = (WorkAccountClient) CustomModuleSubjectSelectionViewModel.this.write.IconCompatParcelizer();
            getresolutionsize.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClient.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClient.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClient.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClient.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClient.onCustomAction : list2, (130991 & 32) != 0 ? workAccountClient.AudioAttributesCompatParcelizer : list.size() == CustomModuleSubjectSelectionViewModel.this.read().IconCompatParcelizer().MediaBrowserCompatSearchResultReceiver().size(), (130991 & 64) != 0 ? workAccountClient.MediaDescriptionCompat : CustomModuleSubjectSelectionViewModel.this.read().IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver(), (130991 & 128) != 0 ? workAccountClient.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClient.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClient.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClient.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClient.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClient.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClient.read : 0L, (130991 & 16384) != 0 ? workAccountClient.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClient.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClient.AudioAttributesImplApi21Parcelizer : null));
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleSubjectSelectionViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzk
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleSubjectSelectionViewModel.AudioAttributesCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(CustomModuleSubjectSelectionViewModel customModuleSubjectSelectionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleSubjectSelectionViewModel.MediaMetadataCompat.write(str);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CustomModuleSubjectListModel> read(List<CustomModuleSubjectListModel> p0) {
        List<String> listRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<CustomModuleSubjectListModel> list = p0;
        for (CustomModuleSubjectListModel customModuleSubjectListModel : list) {
            if (!listRemoteActionCompatParcelizer.isEmpty()) {
                if (listRemoteActionCompatParcelizer.indexOf(customModuleSubjectListModel.getRead()) >= 0) {
                    customModuleSubjectListModel.read(true);
                    customModuleSubjectListModel.RemoteActionCompatParcelizer(true);
                } else {
                    customModuleSubjectListModel.read(false);
                    customModuleSubjectListModel.RemoteActionCompatParcelizer(false);
                }
            } else {
                customModuleSubjectListModel.RemoteActionCompatParcelizer(true);
            }
        }
        if (listRemoteActionCompatParcelizer.isEmpty()) {
            return p0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (listRemoteActionCompatParcelizer.contains(((CustomModuleSubjectListModel) obj).getRead())) {
                arrayList.add(obj);
            }
        }
        return IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) arrayList);
    }
}
