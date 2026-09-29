package kotlin;

import com.marrow.data.models.LessonMcqUpdateInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setUpstreamPriorityTaskManager implements setUpstreamDataSourceFactory {
    private final resolveUtcTimingElementHttp IconCompatParcelizer;
    private final getPlatform read;

    @setSdkPayload
    public setUpstreamPriorityTaskManager(resolveUtcTimingElementHttp resolveutctimingelementhttp, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(resolveutctimingelementhttp, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.IconCompatParcelizer = resolveutctimingelementhttp;
        this.read = getplatform;
    }

    public final resolveUtcTimingElementHttp IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.setUpstreamDataSourceFactory
    public final Object write(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(str)[0]);
    }

    @Override // kotlin.setUpstreamDataSourceFactory
    public final Object AudioAttributesCompatParcelizer(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(str)[1]);
    }

    @Override // kotlin.setUpstreamDataSourceFactory
    public final Object read(String str) {
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(str);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setUpstreamDataSourceFactory
    public final Object AudioAttributesCompatParcelizer(List<? extends LessonMcqUpdateInfo> list) {
        this.IconCompatParcelizer.read((LessonMcqUpdateInfo[]) list.toArray(new LessonMcqUpdateInfo[0]));
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Map<String, ? extends List<? extends Integer>>>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ ArrayList<String> read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            HashMap<String, int[]> mapWrite = setUpstreamPriorityTaskManager.this.IconCompatParcelizer().write((String[]) this.read.toArray(new String[0]));
            HashMap map = new HashMap();
            toMagicModuleMetaRepoModel.write(mapWrite);
            for (Map.Entry<String, int[]> entry : mapWrite.entrySet()) {
                String key = entry.getKey();
                int[] value = entry.getValue();
                toMagicModuleMetaRepoModel.write(value);
                map.put(key, getOrderDetails.AudioAttributesImplApi26Parcelizer(value));
            }
            return VideoTimelineResponseBody.AudioAttributesCompatParcelizer(map);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(ArrayList<String> arrayList, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = arrayList;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setUpstreamPriorityTaskManager.this.new write(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Map<String, ? extends List<Integer>>> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.setUpstreamDataSourceFactory
    public final Object write(ArrayList<String> arrayList, SampleVideos<? super Map<String, ? extends List<Integer>>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new write(arrayList, null), sampleVideos);
    }
}
