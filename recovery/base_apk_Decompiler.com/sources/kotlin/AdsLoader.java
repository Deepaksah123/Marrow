package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.MarrowResponseKt;
import com.marrow.data.api.models.response.common.RatingResponseBody;
import com.marrow.data.api.models.response.lesson.MarkCompleteResponseBody;
import com.marrow.data.api.models.response.lesson.MarkIncompleteResponseBody;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.StepIndex;
import com.marrow.data.models.lesson.tab.LessonTabItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class AdsLoader implements setSupportedContentTypes {
    private final resolveUtcTimingElementDirect AudioAttributesCompatParcelizer;
    private final DashMediaSourceExternalSyntheticLambda0 AudioAttributesImplApi21Parcelizer;
    private final onUtcTimestampLoadCompleted AudioAttributesImplApi26Parcelizer;
    private final newChunkExtractor AudioAttributesImplBaseParcelizer;
    private final onDashManifestPublishTimeExpired IconCompatParcelizer;
    private final DashMediaSourceExternalSyntheticLambda1 MediaBrowserCompatCustomActionResultReceiver;
    private final getAdjustedWindowDefaultStartPositionUs RemoteActionCompatParcelizer;
    private final DefaultDashChunkSource read;
    private final onInitializationFailed write;

    @setSdkPayload
    public AdsLoader(onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired, resolveUtcTimingElementDirect resolveutctimingelementdirect, onUtcTimestampLoadCompleted onutctimestamploadcompleted, newChunkExtractor newchunkextractor, onInitializationFailed oninitializationfailed, getAdjustedWindowDefaultStartPositionUs getadjustedwindowdefaultstartpositionus, DashMediaSourceExternalSyntheticLambda0 dashMediaSourceExternalSyntheticLambda0, DashMediaSourceExternalSyntheticLambda1 dashMediaSourceExternalSyntheticLambda1, DefaultDashChunkSource defaultDashChunkSource) {
        toMagicModuleMetaRepoModel.write(ondashmanifestpublishtimeexpired, "");
        toMagicModuleMetaRepoModel.write(resolveutctimingelementdirect, "");
        toMagicModuleMetaRepoModel.write(onutctimestamploadcompleted, "");
        toMagicModuleMetaRepoModel.write(newchunkextractor, "");
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        toMagicModuleMetaRepoModel.write(getadjustedwindowdefaultstartpositionus, "");
        toMagicModuleMetaRepoModel.write(dashMediaSourceExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(dashMediaSourceExternalSyntheticLambda1, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSource, "");
        this.IconCompatParcelizer = ondashmanifestpublishtimeexpired;
        this.AudioAttributesCompatParcelizer = resolveutctimingelementdirect;
        this.AudioAttributesImplApi26Parcelizer = onutctimestamploadcompleted;
        this.AudioAttributesImplBaseParcelizer = newchunkextractor;
        this.write = oninitializationfailed;
        this.RemoteActionCompatParcelizer = getadjustedwindowdefaultstartpositionus;
        this.AudioAttributesImplApi21Parcelizer = dashMediaSourceExternalSyntheticLambda0;
        this.MediaBrowserCompatCustomActionResultReceiver = dashMediaSourceExternalSyntheticLambda1;
        this.read = defaultDashChunkSource;
    }

    @Override // kotlin.setSupportedContentTypes
    public final LessonIndex write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonIndex lessonIndexIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(str);
        if (lessonIndexIconCompatParcelizer == null) {
            return null;
        }
        lessonIndexIconCompatParcelizer.setHighYieldIds(this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(str));
        return lessonIndexIconCompatParcelizer;
    }

    @Override // kotlin.setSupportedContentTypes
    public final LessonDynamicResponseBody<MarrowResponse<MarkCompleteResponseBody>> read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer.write(str, 2);
        LessonDynamicResponseBody<MarrowResponse<MarkCompleteResponseBody>> lessonDynamicResponseBodyRemoteActionCompatParcelizer = LessonDynamicResponseBody.RemoteActionCompatParcelizer(MarrowResponseKt.createDummyResponse(MarkCompleteResponseBody.newInstance()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    @Override // kotlin.setSupportedContentTypes
    public final LessonDynamicResponseBody<MarrowResponse<MarkIncompleteResponseBody>> AudioAttributesImplApi26Parcelizer(final String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonDynamicResponseBody<MarrowResponse<MarkIncompleteResponseBody>> lessonDynamicResponseBodyWrite = parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.AdsLoaderEventListener
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return AdsLoader.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, str);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, "");
        return lessonDynamicResponseBodyWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse AudioAttributesCompatParcelizer(AdsLoader adsLoader, String str) {
        adsLoader.IconCompatParcelizer.write(str, 0);
        MarkIncompleteResponseBody markIncompleteResponseBody = new MarkIncompleteResponseBody();
        markIncompleteResponseBody.id = str;
        markIncompleteResponseBody.isLessonReset = true;
        return MarrowResponseKt.createDummyResponse(markIncompleteResponseBody);
    }

    @Override // kotlin.setSupportedContentTypes
    public final accessgetEmptyStatecp<MarrowResponse<RatingResponseBody>> AudioAttributesCompatParcelizer(final String str, final int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        accessgetEmptyStatecp<MarrowResponse<RatingResponseBody>> accessgetemptystatecpAudioAttributesCompatParcelizer = parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.AdsLoaderProvider
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return AdsLoader.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str, i);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, "");
        return accessgetemptystatecpAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse RemoteActionCompatParcelizer(AdsLoader adsLoader, String str, int i) {
        adsLoader.IconCompatParcelizer.IconCompatParcelizer(str, i);
        return MarrowResponseKt.createDummyResponse(new RatingResponseBody(str, true));
    }

    @Override // kotlin.setSupportedContentTypes
    public final LessonDynamicResponseBody<LessonIndex> read(final String str, final boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonDynamicResponseBody<LessonIndex> lessonDynamicResponseBodyWrite = parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.handlePrepareComplete
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return AdsLoader.IconCompatParcelizer(this.RemoteActionCompatParcelizer, str, z);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, "");
        return lessonDynamicResponseBodyWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LessonIndex IconCompatParcelizer(AdsLoader adsLoader, String str, boolean z) {
        return adsLoader.IconCompatParcelizer.RemoteActionCompatParcelizer(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List write(AdsLoader adsLoader, String str) {
        return adsLoader.MediaBrowserCompatItemReceiver(str);
    }

    @Override // kotlin.setSupportedContentTypes
    public final accessgetEmptyStatecp<List<LessonTabItem<?>>> IconCompatParcelizer(final String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        accessgetEmptyStatecp<List<LessonTabItem<?>>> accessgetemptystatecpAudioAttributesCompatParcelizer = parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.handlePrepareError
            @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
            public final Object write() {
                return AdsLoader.write(this.RemoteActionCompatParcelizer, str);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, "");
        return accessgetemptystatecpAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setSupportedContentTypes
    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private final List<LessonTabItem<?>> MediaBrowserCompatItemReceiver(String str) {
        List<? extends LessonIndex> listRemoteActionCompatParcelizer;
        LessonIndex[] lessonIndexArrMediaBrowserCompatSearchResultReceiver = this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver(str);
        if (lessonIndexArrMediaBrowserCompatSearchResultReceiver == null || (listRemoteActionCompatParcelizer = getOrderDetails.onCommand(lessonIndexArrMediaBrowserCompatSearchResultReceiver)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<? extends LessonIndex> list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LessonIndex) it.next()).getId());
        }
        HashMap<String, int[]> mapWrite = this.AudioAttributesCompatParcelizer.write((String[]) arrayList.toArray(new String[0]));
        toMagicModuleMetaRepoModel.write(mapWrite);
        return RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer, mapWrite);
    }

    private final List<LessonTabItem<?>> RemoteActionCompatParcelizer(List<? extends LessonIndex> list, HashMap<String, int[]> map) {
        if (list.isEmpty()) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        for (LessonIndex lessonIndex : list) {
            LessonTabItem lessonTabItemNewInstance = LessonTabItem.newInstance(lessonIndex.getSubjectId(), lessonIndex);
            if (!lessonIndex.hasVideo()) {
                int[] iArrIconCompatParcelizer = buildAdaptationSet.IconCompatParcelizer(map.get(lessonIndex.getId()));
                lessonTabItemNewInstance.newMcqCount = iArrIconCompatParcelizer[0];
                lessonTabItemNewInstance.updatedMcqCount = iArrIconCompatParcelizer[1];
                int i = lessonTabItemNewInstance.mcqCount;
                StepIndex stepIndexIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(lessonIndex.getId(), 1);
                lessonTabItemNewInstance.lessonReadTimeText = buildAdaptationSet.IconCompatParcelizer(lessonIndex, i, stepIndexIconCompatParcelizer != null ? this.write.MediaMetadataCompat(stepIndexIconCompatParcelizer.getId()) : 0);
                lessonTabItemNewInstance.type = 4;
                String subjectId = lessonIndex.getSubjectId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectId, "");
                lessonTabItemNewInstance.isLessonUnlocked = AudioAttributesImplBaseParcelizer(subjectId);
            }
            if (lessonTabItemNewInstance != null) {
                arrayList.add(lessonTabItemNewInstance);
            }
        }
        return arrayList;
    }

    private final boolean AudioAttributesImplBaseParcelizer(String str) {
        return this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer("mcq") || this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer("mcq_subj", str);
    }

    @Override // kotlin.setSupportedContentTypes
    public final void write(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer.read(str, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.setSupportedContentTypes
    public final int RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonIndex lessonIndex = (LessonIndex) this.IconCompatParcelizer.AudioAttributesCompatParcelizer("_id =? ", new String[]{str}, (String) null);
        if (lessonIndex != null) {
            return lessonIndex.getStatus();
        }
        return 0;
    }

    @Override // kotlin.setSupportedContentTypes
    public final int AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem(str);
    }

    @Override // kotlin.setSupportedContentTypes
    public final int write(long j, long j2) {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(Long.valueOf(j), Long.valueOf(j2));
    }
}
