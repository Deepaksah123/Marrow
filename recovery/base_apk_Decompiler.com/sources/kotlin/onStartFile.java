package kotlin;

import android.util.Pair;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.mcq.McqParentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class onStartFile implements setUpstreamPriority {
    private final getPlatform AudioAttributesCompatParcelizer;
    private final setManifestParser read;

    @setSdkPayload
    public onStartFile(setManifestParser setmanifestparser, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(setmanifestparser, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.read = setmanifestparser;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    @Override // kotlin.setUpstreamPriority
    public final Object write(List<C0162cache> list) {
        setManifestParser setmanifestparser = this.read;
        List<C0162cache> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(onRequestEndPosition.read((C0162cache) it.next()));
        }
        setmanifestparser.IconCompatParcelizer(arrayList.toArray(new McqParentInfo[0]));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setUpstreamPriority
    public final Object AudioAttributesImplApi21Parcelizer(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.read.AudioAttributesImplApi21Parcelizer(str));
    }

    @Override // kotlin.setUpstreamPriority
    public final Object AudioAttributesImplBaseParcelizer(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.read.AudioAttributesImplApi26Parcelizer(str));
    }

    @Override // kotlin.setUpstreamPriority
    public final Object IconCompatParcelizer(String str, long j) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(str, j));
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ onStartFile read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.RemoteActionCompatParcelizer(this.read.read.write("parent_id =? ", new String[]{this.IconCompatParcelizer}));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, onStartFile onstartfile, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = str;
            this.read = onstartfile;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.IconCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.setUpstreamPriority
    public final Object write(String str, SampleVideos<? super Integer> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new IconCompatParcelizer(str, this, null), sampleVideos);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends String>>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ onStartFile write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            String[] strArr = this.write.read.read(LessonMcqUpdateInfo.KEY_MCQ_ID, "parent_id =?  AND parent_mcq_id = mcq_id", new String[]{this.AudioAttributesCompatParcelizer}, "sort_order");
            if (strArr == null) {
                strArr = new String[0];
            }
            return getOrderDetails.onCommand(strArr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, onStartFile onstartfile, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.write = onstartfile;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<String>> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.setUpstreamPriority
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super List<String>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new AudioAttributesCompatParcelizer(str, this, null), sampleVideos);
    }

    @Override // kotlin.setUpstreamPriority
    public final Object read(String str) {
        Pair<Integer, Integer> pairMediaBrowserCompatSearchResultReceiver = this.read.MediaBrowserCompatSearchResultReceiver(str);
        toMagicModuleMetaRepoModel.write(pairMediaBrowserCompatSearchResultReceiver);
        Integer num = (Integer) pairMediaBrowserCompatSearchResultReceiver.first;
        Integer num2 = (Integer) pairMediaBrowserCompatSearchResultReceiver.second;
        return new requiresCacheSpanTouches(num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0);
    }

    @Override // kotlin.setUpstreamPriority
    public final Object write(String str) {
        this.read.AudioAttributesImplBaseParcelizer(str);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setUpstreamPriority
    public final Object IconCompatParcelizer(String str, String str2) {
        List listOnCommand;
        McqParentInfo[] mcqParentInfoArrRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer("parent_id =?  AND parent_mcq_id =?  AND parent_mcq_id != mcq_id", new String[]{str, str2}, "sort_order ASC");
        if (mcqParentInfoArrRemoteActionCompatParcelizer != null && (listOnCommand = getOrderDetails.onCommand(mcqParentInfoArrRemoteActionCompatParcelizer)) != null) {
            List list = listOnCommand;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((McqParentInfo) it.next()).getMCQId());
            }
            return arrayList;
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setUpstreamPriority
    public final Object MediaBrowserCompatCustomActionResultReceiver(String str) {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.read.write("parent_id =? ", new String[]{str}) > 0);
    }

    @Override // kotlin.setUpstreamPriority
    public final Object RemoteActionCompatParcelizer(String str) {
        this.read.MediaBrowserCompatCustomActionResultReceiver(str);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setUpstreamPriority
    public final Object IconCompatParcelizer(String str) {
        this.read.read("parent_id", str);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setUpstreamPriority
    public final Object AudioAttributesCompatParcelizer(String str) {
        this.read.read("parent_id", str);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setUpstreamPriority
    public final Object MediaBrowserCompatItemReceiver(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.read.MediaBrowserCompatItemReceiver(str));
    }
}
