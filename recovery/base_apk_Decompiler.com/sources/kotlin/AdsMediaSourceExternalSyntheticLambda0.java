package kotlin;

import com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel;
import com.marrow.data.api.models.response.lesson.InteractiveVideoElementRSModel;
import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import com.marrow.data.api.models.response.lesson.StubResponseBody;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.lesson.VideoDeleteRecord;
import com.marrow.data.api.models.response.lesson.step.InteractiveVideoElementTransformerKt;
import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.McqHighYieldRecord;
import com.marrow.data.models.mcq.McqAnswer;
import com.marrow.data.models.mcq.McqParentInfo;
import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.video.Timeline;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AdsMediaSourceAdLoadException;

/* JADX INFO: loaded from: classes3.dex */
public final class AdsMediaSourceExternalSyntheticLambda0 implements AdsMediaSourceAdLoadException.write {
    private final onDashManifestPublishTimeExpired AudioAttributesCompatParcelizer;
    private final setManifestParser AudioAttributesImplApi21Parcelizer;
    private final DashMediaSourceExternalSyntheticLambda1 AudioAttributesImplApi26Parcelizer;
    private final onUtcTimestampLoadCompleted AudioAttributesImplBaseParcelizer;
    private final onInitializationFailed IconCompatParcelizer;
    private final setCompositeSequenceableLoaderFactory MediaBrowserCompatCustomActionResultReceiver;
    private final DashSegmentIndex MediaBrowserCompatItemReceiver;
    private final DefaultDashChunkSourceRepresentationHolder MediaBrowserCompatSearchResultReceiver;
    private final getLastAvailableSegmentNum MediaDescriptionCompat;
    private final copyWithNewRepresentation MediaMetadataCompat;
    private final updateSelectedBaseUrl RatingCompat;
    private final DefaultDashChunkSource RemoteActionCompatParcelizer;
    private final resolveUtcTimingElementHttp read;
    private final getAdjustedWindowDefaultStartPositionUs write;

    @setSdkPayload
    public AdsMediaSourceExternalSyntheticLambda0(onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired, resolveUtcTimingElementHttp resolveutctimingelementhttp, onUtcTimestampLoadCompleted onutctimestamploadcompleted, setCompositeSequenceableLoaderFactory setcompositesequenceableloaderfactory, setManifestParser setmanifestparser, onInitializationFailed oninitializationfailed, DashSegmentIndex dashSegmentIndex, copyWithNewRepresentation copywithnewrepresentation, getAdjustedWindowDefaultStartPositionUs getadjustedwindowdefaultstartpositionus, updateSelectedBaseUrl updateselectedbaseurl, DefaultDashChunkSourceRepresentationHolder defaultDashChunkSourceRepresentationHolder, DashMediaSourceExternalSyntheticLambda1 dashMediaSourceExternalSyntheticLambda1, getLastAvailableSegmentNum getlastavailablesegmentnum, DefaultDashChunkSource defaultDashChunkSource) {
        toMagicModuleMetaRepoModel.write(ondashmanifestpublishtimeexpired, "");
        toMagicModuleMetaRepoModel.write(resolveutctimingelementhttp, "");
        toMagicModuleMetaRepoModel.write(onutctimestamploadcompleted, "");
        toMagicModuleMetaRepoModel.write(setcompositesequenceableloaderfactory, "");
        toMagicModuleMetaRepoModel.write(setmanifestparser, "");
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        toMagicModuleMetaRepoModel.write(dashSegmentIndex, "");
        toMagicModuleMetaRepoModel.write(copywithnewrepresentation, "");
        toMagicModuleMetaRepoModel.write(getadjustedwindowdefaultstartpositionus, "");
        toMagicModuleMetaRepoModel.write(updateselectedbaseurl, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSourceRepresentationHolder, "");
        toMagicModuleMetaRepoModel.write(dashMediaSourceExternalSyntheticLambda1, "");
        toMagicModuleMetaRepoModel.write(getlastavailablesegmentnum, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSource, "");
        this.AudioAttributesCompatParcelizer = ondashmanifestpublishtimeexpired;
        this.read = resolveutctimingelementhttp;
        this.AudioAttributesImplBaseParcelizer = onutctimestamploadcompleted;
        this.MediaBrowserCompatCustomActionResultReceiver = setcompositesequenceableloaderfactory;
        this.AudioAttributesImplApi21Parcelizer = setmanifestparser;
        this.IconCompatParcelizer = oninitializationfailed;
        this.MediaBrowserCompatItemReceiver = dashSegmentIndex;
        this.MediaMetadataCompat = copywithnewrepresentation;
        this.write = getadjustedwindowdefaultstartpositionus;
        this.RatingCompat = updateselectedbaseurl;
        this.MediaBrowserCompatSearchResultReceiver = defaultDashChunkSourceRepresentationHolder;
        this.AudioAttributesImplApi26Parcelizer = dashMediaSourceExternalSyntheticLambda1;
        this.MediaDescriptionCompat = getlastavailablesegmentnum;
        this.RemoteActionCompatParcelizer = defaultDashChunkSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LessonIndex RemoteActionCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (LessonIndex) getanswermap.invoke(obj);
    }

    @Override // o.AdsMediaSourceAdLoadException.write
    public final accessgetEmptyStatecp<LessonIndex> IconCompatParcelizer(final String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        accessgetEmptyStatecp<T> accessgetemptystatecpRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.lambdareleaseSourceInternal1comgoogleandroidexoplayer2sourceadsAdsMediaSource
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return AdsMediaSourceExternalSyntheticLambda0.IconCompatParcelizer(this.RemoteActionCompatParcelizer, str, (LessonIndex) obj);
            }
        };
        accessgetEmptyStatecp<LessonIndex> accessgetemptystatecpRemoteActionCompatParcelizer2 = accessgetemptystatecpRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.getRuntimeExceptionForUnexpected
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return AdsMediaSourceExternalSyntheticLambda0.RemoteActionCompatParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer2, "");
        return accessgetemptystatecpRemoteActionCompatParcelizer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LessonIndex IconCompatParcelizer(AdsMediaSourceExternalSyntheticLambda0 adsMediaSourceExternalSyntheticLambda0, String str, LessonIndex lessonIndex) {
        toMagicModuleMetaRepoModel.write(lessonIndex, "");
        lessonIndex.setHighYieldIds(adsMediaSourceExternalSyntheticLambda0.write.AudioAttributesImplBaseParcelizer(str));
        return lessonIndex;
    }

    @Override // o.AdsMediaSourceAdLoadException.write
    public final boolean write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(str)) {
            return false;
        }
        return this.AudioAttributesImplBaseParcelizer.write("lesson_id =? ", new String[]{str}) > 0;
    }

    @Override // o.AdsMediaSourceAdLoadException.write
    public final void IconCompatParcelizer(LessonResponseBody lessonResponseBody) {
        Map<String, Long> mapAudioAttributesImplApi21Parcelizer;
        String videoId;
        String videoId2;
        toMagicModuleMetaRepoModel.write(lessonResponseBody, "");
        String id = lessonResponseBody.getId();
        LessonIndex lessonIndexAudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(id);
        toMagicModuleMetaRepoModel.write((Object) id);
        RemoteActionCompatParcelizer(id);
        String videoId3 = lessonResponseBody.getVideoId();
        if (videoId3 == null || videoId3.length() == 0) {
            mapAudioAttributesImplApi21Parcelizer = null;
        } else {
            updateSelectedBaseUrl updateselectedbaseurl = this.RatingCompat;
            String videoId4 = lessonResponseBody.getVideoId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(videoId4, "");
            mapAudioAttributesImplApi21Parcelizer = updateselectedbaseurl.AudioAttributesImplApi21Parcelizer(videoId4);
            this.RatingCompat.read("video_id", lessonResponseBody.getVideoId());
        }
        Map<String, Long> map = mapAudioAttributesImplApi21Parcelizer;
        if (!lessonResponseBody.isPublished()) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(id);
            if (!lessonResponseBody.hasVideo() || (videoId2 = lessonResponseBody.getVideoId()) == null || videoId2.length() == 0) {
                return;
            }
            DefaultDashChunkSourceRepresentationHolder defaultDashChunkSourceRepresentationHolder = this.MediaBrowserCompatSearchResultReceiver;
            String videoId5 = lessonResponseBody.getVideoId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(videoId5, "");
            defaultDashChunkSourceRepresentationHolder.AudioAttributesCompatParcelizer(new VideoDeleteRecord(videoId5, lessonResponseBody.getEditionValue()));
            return;
        }
        if (lessonResponseBody.hasVideo() && (videoId = lessonResponseBody.getVideoId()) != null && videoId.length() != 0) {
            DefaultDashChunkSourceRepresentationHolder defaultDashChunkSourceRepresentationHolder2 = this.MediaBrowserCompatSearchResultReceiver;
            String videoId6 = lessonResponseBody.getVideoId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(videoId6, "");
            defaultDashChunkSourceRepresentationHolder2.write(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new VideoDeleteRecord(videoId6, lessonResponseBody.getEditionValue())));
            StepResponseBody[] stepResponseBodyArr = lessonResponseBody.steps;
            if (stepResponseBodyArr != null) {
                for (StepResponseBody stepResponseBody : stepResponseBodyArr) {
                    getLastAvailableSegmentNum getlastavailablesegmentnum = this.MediaDescriptionCompat;
                    Timeline[] timelineArr = stepResponseBody.videoTimelines;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(timelineArr, "");
                    Timeline[] timelineArr2 = timelineArr;
                    ArrayList arrayList = new ArrayList(timelineArr2.length);
                    for (Timeline timeline : timelineArr2) {
                        arrayList.add(timeline.getTimelineId());
                    }
                    getlastavailablesegmentnum.read(arrayList);
                }
            }
        }
        boolean z = lessonResponseBody.getStatus() == 2;
        if (z) {
            lessonResponseBody.setLessonActivityStatus(2);
        } else {
            lessonResponseBody.setStatus(lessonIndexAudioAttributesImplApi21Parcelizer != null ? lessonIndexAudioAttributesImplApi21Parcelizer.getStatus() : 0);
        }
        StepResponseBody[] stepResponseBodyArr2 = lessonResponseBody.steps;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stepResponseBodyArr2, "");
        StepResponseBody[] stepResponseBodyArr3 = stepResponseBodyArr2;
        int length = stepResponseBodyArr3.length;
        int i = 0;
        while (i < length) {
            StepResponseBody stepResponseBody2 = stepResponseBodyArr3[i];
            toMagicModuleMetaRepoModel.write(stepResponseBody2);
            int i2 = i;
            int i3 = length;
            write(stepResponseBody2, z, lessonResponseBody.getCompletionTimeMs(), lessonResponseBody.getVideoId(), map);
            Timeline[] timelineArr3 = stepResponseBody2.videoTimelines;
            if (timelineArr3 != null) {
                for (Timeline timeline2 : timelineArr3) {
                    List<String> pytMcqIds = timeline2.getPytMcqIds();
                    if (pytMcqIds != null && !pytMcqIds.isEmpty()) {
                        getLastAvailableSegmentNum getlastavailablesegmentnum2 = this.MediaDescriptionCompat;
                        String timelineId = timeline2.getTimelineId();
                        List<String> pytMcqIds2 = timeline2.getPytMcqIds();
                        toMagicModuleMetaRepoModel.write(pytMcqIds2);
                        getlastavailablesegmentnum2.AudioAttributesImplApi21Parcelizer(timelineId, (String[]) pytMcqIds2.toArray(new String[0]));
                    }
                }
            }
            i = i2 + 1;
            length = i3;
        }
        List<InteractiveVideoElementRSModel> list = lessonResponseBody.interactiveVideoElementsList;
        if (list != null && !list.isEmpty()) {
            DefaultDashChunkSource defaultDashChunkSource = this.RemoteActionCompatParcelizer;
            List<InteractiveVideoElementRSModel> list2 = lessonResponseBody.interactiveVideoElementsList;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list2, "");
            String id2 = lessonResponseBody.getId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id2, "");
            defaultDashChunkSource.IconCompatParcelizer(InteractiveVideoElementTransformerKt.toLSModel(list2, id2).toArray(new InteractiveVideoElementLSModel[0]));
        }
        List<StubResponseBody> list3 = lessonResponseBody.stubsArticles;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list3, "");
        List<StubResponseBody> list4 = list3;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list4, 10));
        for (StubResponseBody stubResponseBody : list4) {
            arrayList2.add(new onUtcTimestampLoadError(stubResponseBody.getDeeplink(), stubResponseBody.getSno(), stubResponseBody.getTitle(), id));
        }
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(arrayList2.toArray(new onUtcTimestampLoadError[0]));
        lessonResponseBody.setDontConsider(true);
        lessonResponseBody.setServerContentUpdated(false);
        LessonIndex lessonIndexIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(id);
        if (lessonIndexIconCompatParcelizer != null) {
            boolean zIsDontConsider = lessonIndexIconCompatParcelizer.isDontConsider();
            long lastUpdated = lessonIndexIconCompatParcelizer.getLastUpdated();
            lessonResponseBody.setDontConsider(zIsDontConsider);
            lessonResponseBody.setLastUpdated(lastUpdated);
            lessonResponseBody.setPytMcqCount(lessonIndexIconCompatParcelizer.getPytMcqCount());
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((LessonIndex) lessonResponseBody);
        this.read.read(lessonResponseBody.getUpdates());
    }

    @Override // o.AdsMediaSourceAdLoadException.write
    public final List<InteractiveVideoElementLSModel> AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(str);
    }

    private final void RemoteActionCompatParcelizer(String str) {
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplBaseParcelizer(str);
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(str);
        this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(str);
        this.read.MediaBrowserCompatItemReceiver(str);
        this.write.IconCompatParcelizer(str);
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(str);
    }

    private final void write(StepResponseBody stepResponseBody, boolean z, long j, String str, Map<String, Long> map) {
        String id = stepResponseBody.getId();
        if (stepResponseBody.getStepType() != 1) {
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(stepResponseBody);
            if (str != null) {
                Timeline[] timelineArr = stepResponseBody.videoTimelines;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(timelineArr, "");
                List<VideoBookmarkTimeline> listIconCompatParcelizer = createForAd.IconCompatParcelizer(timelineArr, str, toMagicModuleStatsLSModel.write(map));
                this.RatingCompat.IconCompatParcelizer(listIconCompatParcelizer.toArray(new VideoBookmarkTimeline[0]));
                this.RatingCompat.AudioAttributesCompatParcelizer(listIconCompatParcelizer);
                return;
            }
            return;
        }
        if (z) {
            McqResponseBody[] mcqResponseBodyArr = stepResponseBody.questions;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mcqResponseBodyArr, "");
            for (McqResponseBody mcqResponseBody : mcqResponseBodyArr) {
                if (mcqResponseBody.getStatusUpdateStartTimeMs() > j) {
                    stepResponseBody.answerMap.remove(mcqResponseBody.getMcqId());
                }
            }
        }
        toMagicModuleMetaRepoModel.write((Object) id);
        McqResponseBody[] mcqResponseBodyArr2 = stepResponseBody.questions;
        if (mcqResponseBodyArr2 == null) {
            mcqResponseBodyArr2 = new McqResponseBody[0];
        }
        List<? extends McqResponseBody> listOnCommand = getOrderDetails.onCommand(mcqResponseBodyArr2);
        HashMap<String, Integer> map2 = stepResponseBody.answerMap;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(map2, "");
        String relatedLessonId = stepResponseBody.getRelatedLessonId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(relatedLessonId, "");
        AudioAttributesCompatParcelizer(id, listOnCommand, map2, relatedLessonId);
        this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(stepResponseBody);
    }

    private final void AudioAttributesCompatParcelizer(String str, List<? extends McqResponseBody> list, Map<String, Integer> map, String str2) {
        if (list.isEmpty()) {
            return;
        }
        List<? extends McqResponseBody> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ((McqResponseBody) it.next()).setDontConsider(true);
        }
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((McqResponseBody) it2.next()).getPearls());
        }
        List<Pearl> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList);
        List<McqParentInfo> listIconCompatParcelizer = DefaultDashChunkSourceRepresentationSegmentIterator.IconCompatParcelizer(list, McqParentInfo.PARENT_TYPE_STEP, str);
        List<McqAnswer> listAudioAttributesCompatParcelizer = DefaultDashChunkSourceRepresentationSegmentIterator.AudioAttributesCompatParcelizer(list, str, map);
        List<McqHighYieldRecord> list3 = DefaultDashChunkSourceRepresentationSegmentIterator.read(list, str, str2);
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(listRemoteActionCompatParcelizer);
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(listIconCompatParcelizer.toArray(new McqParentInfo[0]));
        this.IconCompatParcelizer.IconCompatParcelizer(listAudioAttributesCompatParcelizer.toArray(new McqAnswer[0]));
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(list.toArray(new McqResponseBody[0]));
        this.write.IconCompatParcelizer(list3.toArray(new McqHighYieldRecord[0]));
    }
}
