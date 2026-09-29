package com.marrow2.ui.custom_module.creation.viewmodel;

import com.google.android.exoplayer2.C;
import com.marrow2.domain.custom_module.model.CustomModuleTopicListModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleTopicSelectionViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.WorkAccountClient;
import kotlin.decodeBitmap;
import kotlin.getAnswerMap;
import kotlin.getArray;
import kotlin.getDeviceMetaData;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.showUserChallenge;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\r\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R,\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d0\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020#0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0016\u0010&\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010%"}, d2 = {"Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTopicSelectionViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getArray;", "p0", "Lo/POJOPropertyBuilder5;", "p1", "<init>", "(Lo/getArray;Lo/POJOPropertyBuilder5;)V", "", "MediaBrowserCompatItemReceiver", "()V", "AudioAttributesImplApi21Parcelizer", "Lo/getDeviceMetaData;", "IconCompatParcelizer", "(Lo/getDeviceMetaData;)V", "AudioAttributesImplApi26Parcelizer", "Lo/getArray;", "read", "Lo/getResolutionSize;", "Lo/WorkAccountClient;", "AudioAttributesCompatParcelizer", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "RemoteActionCompatParcelizer", "", "write", "MediaBrowserCompatMediaItem", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "", "Lcom/marrow2/domain/custom_module/model/CustomModuleTopicListModel;", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "Lo/showUserChallenge;", "MediaDescriptionCompat", "Ljava/lang/String;", "MediaMetadataCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleTopicSelectionViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<WorkAccountClient> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<WorkAccountClient> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getArray read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private String MediaMetadataCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<showUserChallenge> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<String> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<showUserChallenge> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<String> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleTopicListModel>>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleTopicListModel>>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaBrowserCompatCustomActionResultReceiver;
    private final getResolutionSize<String> write;

    @setSdkPayload
    public CustomModuleTopicSelectionViewModel(getArray getarray, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(getarray, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.read = getarray;
        WorkAccountClient.IconCompatParcelizer iconCompatParcelizer = WorkAccountClient.write;
        getResolutionSize<WorkAccountClient> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(WorkAccountClient.IconCompatParcelizer.read(pOJOPropertyBuilder5));
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        setUpdatedStatus<WorkAccountClient> setupdatedstatus = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = setupdatedstatus;
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer("");
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleTopicListModel>>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer4;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<showUserChallenge> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(showUserChallenge.write.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        this.MediaMetadataCompat = "";
        this.MediaMetadataCompat = setupdatedstatus.IconCompatParcelizer().getRatingCompat();
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatItemReceiver();
    }

    public final setUpdatedStatus<WorkAccountClient> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<String> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleTopicListModel>>> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<showUserChallenge> read() {
        return this.MediaDescriptionCompat;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = CustomModuleTopicSelectionViewModel.this.read.RemoteActionCompatParcelizer(((WorkAccountClient) CustomModuleTopicSelectionViewModel.this.IconCompatParcelizer.IconCompatParcelizer()).getRatingCompat(), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            List<CustomModuleTopicListModel> list = (List) obj;
            List<String> list2 = CustomModuleTopicSelectionViewModel.this.IconCompatParcelizer().IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver().get(CustomModuleTopicSelectionViewModel.this.MediaMetadataCompat);
            if (list2 != null) {
                for (CustomModuleTopicListModel customModuleTopicListModel : list) {
                    customModuleTopicListModel.AudioAttributesCompatParcelizer(list2.contains(customModuleTopicListModel.getRemoteActionCompatParcelizer()));
                }
            }
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(CustomModuleTopicSelectionViewModel.this.MediaBrowserCompatItemReceiver, list);
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CustomModuleTopicSelectionViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzn
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CustomModuleTopicSelectionViewModel.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(CustomModuleTopicSelectionViewModel customModuleTopicSelectionViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        customModuleTopicSelectionViewModel.MediaBrowserCompatCustomActionResultReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        this.write.write(this.IconCompatParcelizer.IconCompatParcelizer().getMediaBrowserCompatMediaItem());
    }

    public final void IconCompatParcelizer(getDeviceMetaData p0) throws Exception {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = 0;
        if (p0 instanceof getDeviceMetaData.RemoteActionCompatParcelizer) {
            List<CustomModuleTopicListModel> list = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CustomModuleTopicListModel) it.next()).getRemoteActionCompatParcelizer());
            }
            ArrayList arrayList2 = arrayList;
            List<String> list2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver().get(this.MediaMetadataCompat);
            if (list2 == null) {
                list2 = arrayList2;
            }
            this.AudioAttributesImplApi26Parcelizer.write(new showUserChallenge.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, list2, list2.size() == arrayList2.size()));
            return;
        }
        if (p0 instanceof getDeviceMetaData.IconCompatParcelizer) {
            AudioAttributesImplApi26Parcelizer();
            this.AudioAttributesImplApi26Parcelizer.write(showUserChallenge.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof getDeviceMetaData.AudioAttributesImplApi21Parcelizer) {
            List<CustomModuleTopicListModel> listRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            ArrayList arrayList3 = new ArrayList(listRemoteActionCompatParcelizer);
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((CustomModuleTopicListModel) it2.next()).getRemoteActionCompatParcelizer(), (Object) ((getDeviceMetaData.AudioAttributesImplApi21Parcelizer) p0).write().getRemoteActionCompatParcelizer())) {
                    break;
                } else {
                    i++;
                }
            }
            Object obj = arrayList3.get(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            CustomModuleTopicListModel customModuleTopicListModel = (CustomModuleTopicListModel) obj;
            arrayList3.set(i, CustomModuleTopicListModel.IconCompatParcelizer(customModuleTopicListModel.RemoteActionCompatParcelizer, customModuleTopicListModel.write, customModuleTopicListModel.AudioAttributesCompatParcelizer, !((getDeviceMetaData.AudioAttributesImplApi21Parcelizer) p0).RemoteActionCompatParcelizer()));
            this.MediaBrowserCompatItemReceiver.write(new decodeBitmap(arrayList3));
            HashMap<String, List<String>> mapMediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
            HashMap<String, List<String>> map = mapMediaBrowserCompatCustomActionResultReceiver;
            String str = this.MediaMetadataCompat;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((CustomModuleTopicListModel) obj2).getRead()) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = arrayList4;
            ArrayList arrayList6 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(((CustomModuleTopicListModel) it3.next()).getRemoteActionCompatParcelizer());
            }
            map.put(str, arrayList6);
            getResolutionSize<WorkAccountClient> getresolutionsize = this.IconCompatParcelizer;
            WorkAccountClient workAccountClientIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            getresolutionsize.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer.MediaDescriptionCompat : mapMediaBrowserCompatCustomActionResultReceiver, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null));
            return;
        }
        if (p0 instanceof getDeviceMetaData.AudioAttributesCompatParcelizer) {
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (!(p0 instanceof getDeviceMetaData.read)) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getDeviceMetaData.write.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            return;
        }
        List<CustomModuleTopicListModel> list3 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : list3) {
            if (!((CustomModuleTopicListModel) obj3).getRead()) {
                arrayList7.add(obj3);
            }
        }
        if (arrayList7.isEmpty()) {
            List<CustomModuleTopicListModel> list4 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read();
            ArrayList arrayList8 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list4, 10));
            for (CustomModuleTopicListModel customModuleTopicListModel2 : list4) {
                arrayList8.add(CustomModuleTopicListModel.IconCompatParcelizer(customModuleTopicListModel2.RemoteActionCompatParcelizer, customModuleTopicListModel2.write, customModuleTopicListModel2.AudioAttributesCompatParcelizer, false));
            }
            this.MediaBrowserCompatItemReceiver.write(new decodeBitmap(arrayList8));
            HashMap<String, List<String>> mapMediaBrowserCompatCustomActionResultReceiver2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
            String str2 = this.MediaMetadataCompat;
            List<CustomModuleTopicListModel> list5 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read();
            ArrayList arrayList9 = new ArrayList();
            for (Object obj4 : list5) {
                if (((CustomModuleTopicListModel) obj4).getRead()) {
                    arrayList9.add(obj4);
                }
            }
            ArrayList arrayList10 = arrayList9;
            ArrayList arrayList11 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList10, 10));
            Iterator it4 = arrayList10.iterator();
            while (it4.hasNext()) {
                arrayList11.add(((CustomModuleTopicListModel) it4.next()).getRemoteActionCompatParcelizer());
            }
            mapMediaBrowserCompatCustomActionResultReceiver2.put(str2, arrayList11);
            getResolutionSize<WorkAccountClient> getresolutionsize2 = this.IconCompatParcelizer;
            WorkAccountClient workAccountClientIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
            getresolutionsize2.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer2.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer2.onCustomAction : IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer2.MediaDescriptionCompat : null, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer2.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer2.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer2.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer2.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : null));
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() throws Exception {
        List<CustomModuleTopicListModel> list = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((CustomModuleTopicListModel) obj).getRead()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (CustomModuleTopicListModel customModuleTopicListModel : this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read()) {
            arrayList2.add(CustomModuleTopicListModel.IconCompatParcelizer(customModuleTopicListModel.RemoteActionCompatParcelizer, customModuleTopicListModel.write, customModuleTopicListModel.AudioAttributesCompatParcelizer, true));
        }
        this.MediaBrowserCompatItemReceiver.write(new decodeBitmap(arrayList2));
        HashMap<String, List<String>> mapMediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
        HashMap<String, List<String>> map = mapMediaBrowserCompatCustomActionResultReceiver;
        String str = this.MediaMetadataCompat;
        List<CustomModuleTopicListModel> list2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (((CustomModuleTopicListModel) obj2).getRead()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(((CustomModuleTopicListModel) it.next()).getRemoteActionCompatParcelizer());
        }
        map.put(str, arrayList5);
        getResolutionSize<WorkAccountClient> getresolutionsize = this.IconCompatParcelizer;
        WorkAccountClient workAccountClientIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(WorkAccountClient.read((130991 & 1) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatItemReceiver : 0, (130991 & 2) != 0 ? workAccountClientIconCompatParcelizer.RemoteActionCompatParcelizer : null, (130991 & 4) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (130991 & 8) != 0 ? workAccountClientIconCompatParcelizer.MediaMetadataCompat : null, (130991 & 16) != 0 ? workAccountClientIconCompatParcelizer.onCustomAction : null, (130991 & 32) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (130991 & 64) != 0 ? workAccountClientIconCompatParcelizer.MediaDescriptionCompat : mapMediaBrowserCompatCustomActionResultReceiver, (130991 & 128) != 0 ? workAccountClientIconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (130991 & 256) != 0 ? workAccountClientIconCompatParcelizer.IconCompatParcelizer : false, (130991 & 512) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : 0, (130991 & 1024) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatMediaItem : null, (130991 & 2048) != 0 ? workAccountClientIconCompatParcelizer.RatingCompat : null, (130991 & 4096) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (130991 & 8192) != 0 ? workAccountClientIconCompatParcelizer.read : 0L, (130991 & 16384) != 0 ? workAccountClientIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : 0L, (130991 & 32768) != 0 ? workAccountClientIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (130991 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? workAccountClientIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null));
    }
}
