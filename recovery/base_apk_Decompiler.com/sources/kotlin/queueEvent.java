package kotlin;

import com.marrow.data.models.video.cache.VideoCacheInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class queueEvent implements r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc {
    private final getPlatform AudioAttributesCompatParcelizer;
    private final newMediaChunk IconCompatParcelizer;

    @setSdkPayload
    public queueEvent(newMediaChunk newmediachunk, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(newmediachunk, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.IconCompatParcelizer = newmediachunk;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.RemoteActionCompatParcelizer(queueEvent.this.IconCompatParcelizer.AudioAttributesCompatParcelizer());
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return queueEvent.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super HashMap<String, VideoCacheInfo>>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            VideoCacheInfo[] videoCacheInfoArrRatingCompat = queueEvent.this.IconCompatParcelizer.RatingCompat();
            HashMap map = new HashMap();
            if (videoCacheInfoArrRatingCompat != null) {
                ArrayList arrayList = new ArrayList(videoCacheInfoArrRatingCompat.length);
                for (VideoCacheInfo videoCacheInfo : videoCacheInfoArrRatingCompat) {
                    if (videoCacheInfo != null) {
                        map.put(videoCacheInfo.getLessonId(), videoCacheInfo);
                    }
                    arrayList.add(getShowPopup.INSTANCE);
                }
            }
            return map;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return queueEvent.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super HashMap<String, VideoCacheInfo>> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super Integer> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new IconCompatParcelizer(null), sampleVideos);
    }

    @Override // kotlin.r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super Map<String, ? extends VideoCacheInfo>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new RemoteActionCompatParcelizer(null), sampleVideos);
    }

    @Override // kotlin.r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc
    public final Object AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.MediaDescriptionCompat();
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends String>>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return queueEvent.this.IconCompatParcelizer.onAddQueueItem();
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return queueEvent.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<String>> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc
    public final Object read(SampleVideos<? super List<String>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new read(null), sampleVideos);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.RemoteActionCompatParcelizer(queueEvent.this.IconCompatParcelizer.write());
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return queueEvent.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc
    public final Object write(SampleVideos<? super Integer> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new AudioAttributesCompatParcelizer(null), sampleVideos);
    }

    @Override // kotlin.r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc
    public final Object AudioAttributesCompatParcelizer(String str) {
        this.IconCompatParcelizer.IconCompatParcelizer(str);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc
    public final Object IconCompatParcelizer(List<String> list) {
        this.IconCompatParcelizer.read((String[]) list.toArray(new String[0]));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc
    public final Object write(String str) {
        VideoCacheInfo videoCacheInfoMediaBrowserCompatCustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str);
        if (videoCacheInfoMediaBrowserCompatCustomActionResultReceiver != null) {
            return flushEvents.write(videoCacheInfoMediaBrowserCompatCustomActionResultReceiver);
        }
        return null;
    }
}
