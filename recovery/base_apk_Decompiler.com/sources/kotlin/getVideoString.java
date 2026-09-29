package kotlin;

import com.marrow.data.models.common.Editor;
import com.marrow.data.models.subject.Subject;
import com.marrow.data.models.subject.SubjectCompletionInfo;
import com.marrow2.data.subject.local.model.SubjectLSModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getVideoString implements getDecoderCountersBufferCountString {
    private final loadInitializationData IconCompatParcelizer;
    private final getSegmentUrl read;
    private final getPlatform write;

    @setSdkPayload
    public getVideoString(getSegmentUrl getsegmenturl, loadInitializationData loadinitializationdata, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(getsegmenturl, "");
        toMagicModuleMetaRepoModel.write(loadinitializationdata, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.read = getsegmenturl;
        this.IconCompatParcelizer = loadinitializationdata;
        this.write = getplatform;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super String>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            String strAudioAttributesImplBaseParcelizer = getVideoString.this.read.AudioAttributesImplBaseParcelizer(this.read);
            return strAudioAttributesImplBaseParcelizer == null ? "" : strAudioAttributesImplBaseParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getVideoString.this.new IconCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super String> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object read(String str, SampleVideos<? super String> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write, new IconCompatParcelizer(str, null), sampleVideos);
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object IconCompatParcelizer(List<String> list, boolean z) {
        Map<String, String> mapRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer((String[]) list.toArray(new String[0]), z);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer, "");
        return mapRemoteActionCompatParcelizer;
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object read(String str, int i) {
        ArrayList<Subject> arrayList = this.read.read(str, i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(arrayList, "");
        ArrayList<Subject> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
        for (Subject subject : arrayList2) {
            String id = subject.getId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
            String title = subject.getTitle();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
            int groupId = subject.getGroupId();
            String imageUrl = subject.getImageUrl();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageUrl, "");
            arrayList3.add(new SubjectLSModel(id, title, groupId, imageUrl));
        }
        return arrayList3;
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object IconCompatParcelizer() {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.read.MediaDescriptionCompat());
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object write() {
        List<String> listWrite = this.read.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        return listWrite;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends isCached>>, Object> {
        private /* synthetic */ List<CopyOnWriteMultiset> AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            getSegmentUrl getsegmenturl = getVideoString.this.read;
            List<CopyOnWriteMultiset> list = this.AudioAttributesCompatParcelizer;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(QBankStatsResponse.RemoteActionCompatParcelizer(((CopyOnWriteMultiset) it.next()).read()));
            }
            SubjectCompletionInfo[] subjectCompletionInfoArrWrite = getsegmenturl.write((List<Integer>) arrayList);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectCompletionInfoArrWrite, "");
            List<SubjectCompletionInfo> listOnCommand = getOrderDetails.onCommand(subjectCompletionInfoArrWrite);
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listOnCommand, 10));
            for (SubjectCompletionInfo subjectCompletionInfo : listOnCommand) {
                toMagicModuleMetaRepoModel.write(subjectCompletionInfo);
                arrayList2.add(removeResource.read(subjectCompletionInfo));
            }
            return arrayList2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(List<CopyOnWriteMultiset> list, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getVideoString.this.new AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<isCached>> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object read(List<CopyOnWriteMultiset> list, SampleVideos<? super List<isCached>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write, new AudioAttributesImplApi21Parcelizer(list, null), sampleVideos);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super removeSpan>, Object> {
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Editor editor;
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            Subject subjectMediaBrowserCompatCustomActionResultReceiver = getVideoString.this.read.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
            if (subjectMediaBrowserCompatCustomActionResultReceiver == null || (editor = subjectMediaBrowserCompatCustomActionResultReceiver.getEditor()) == null) {
                return null;
            }
            return startReadWrite.write(editor);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getVideoString.this.new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super removeSpan> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object write(String str, SampleVideos<? super removeSpan> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write, new RemoteActionCompatParcelizer(str, null), sampleVideos);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Long>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.RemoteActionCompatParcelizer(getVideoString.this.read.MediaBrowserCompatItemReceiver(this.read));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getVideoString.this.new AudioAttributesCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Long> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object IconCompatParcelizer(String str, SampleVideos<? super Long> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write, new AudioAttributesCompatParcelizer(str, null), sampleVideos);
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ long read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            getVideoString.this.read.read("_id", this.IconCompatParcelizer, this.read);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(String str, long j, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = str;
            this.read = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getVideoString.this.new AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object read(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write, new AudioAttributesImplApi26Parcelizer(str, j, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ long IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            getVideoString.this.read.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(String str, long j, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getVideoString.this.new MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object write(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write, new MediaBrowserCompatItemReceiver(str, j, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object AudioAttributesCompatParcelizer(List<String> list) {
        Subject[] subjectArrIconCompatParcelizer = this.read.IconCompatParcelizer(list);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectArrIconCompatParcelizer, "");
        Subject[] subjectArr = subjectArrIconCompatParcelizer;
        ArrayList arrayList = new ArrayList(subjectArr.length);
        for (Subject subject : subjectArr) {
            String id = subject.getId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
            String title = subject.getTitle();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
            int groupId = subject.getGroupId();
            String imageUrl = subject.getImageUrl();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageUrl, "");
            arrayList.add(new SubjectLSModel(id, title, groupId, imageUrl));
        }
        return arrayList;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super SubjectLSModel>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            Subject subjectMediaBrowserCompatCustomActionResultReceiver = getVideoString.this.read.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer);
            if (subjectMediaBrowserCompatCustomActionResultReceiver == null) {
                return null;
            }
            String id = subjectMediaBrowserCompatCustomActionResultReceiver.getId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
            String title = subjectMediaBrowserCompatCustomActionResultReceiver.getTitle();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
            int groupId = subjectMediaBrowserCompatCustomActionResultReceiver.getGroupId();
            String imageUrl = subjectMediaBrowserCompatCustomActionResultReceiver.getImageUrl();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageUrl, "");
            return new SubjectLSModel(id, title, groupId, imageUrl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getVideoString.this.new read(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super SubjectLSModel> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super SubjectLSModel> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write, new read(str, null), sampleVideos);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends loadFormatWithDrmInitData>>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return getVideoString.this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(this.read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getVideoString.this.new write(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<loadFormatWithDrmInitData>> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getDecoderCountersBufferCountString
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super List<loadFormatWithDrmInitData>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write, new write(str, null), sampleVideos);
    }
}
