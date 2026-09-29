package com.marrow2.data.test.remote.model;

import android.os.Process;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.VideoTimelineResponseBody;
import kotlin.dropTable;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\"\u0010\u0017\u001a\u00020\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\"\u0010-\u001a\u00020\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\"\u00100\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020$8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010&\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R(\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R.\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<0\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010\b\u001a\u0004\b>\u0010\n\"\u0004\b?\u0010\f"}, d2 = {"Lcom/marrow2/data/test/remote/model/MarkTestCompleteRequestBody;", "", "<init>", "()V", "", "", "", "answersChanged", "Ljava/util/Map;", "getAnswersChanged", "()Ljava/util/Map;", "setAnswersChanged", "(Ljava/util/Map;)V", "courseId", "Ljava/lang/String;", "getCourseId", "()Ljava/lang/String;", "setCourseId", "(Ljava/lang/String;)V", "result", "getResult", "setResult", "", "timeTook", "J", "getTimeTook", "()J", "setTimeTook", "(J)V", "", "guessed", "Ljava/util/List;", "getGuessed", "()Ljava/util/List;", "setGuessed", "(Ljava/util/List;)V", "", "isDiscarded", "Z", "()Z", "setDiscarded", "(Z)V", "firstAttemptTimeSeconds", "getFirstAttemptTimeSeconds", "setFirstAttemptTimeSeconds", "reviewAttemptTimeSeconds", "getReviewAttemptTimeSeconds", "setReviewAttemptTimeSeconds", "ntr", "I", "getNtr", "()I", "setNtr", "(I)V", "forceSubmit", "getForceSubmit", "setForceSubmit", "starred", "getStarred", "setStarred", "Lcom/marrow2/data/test/remote/model/McqTimingRequestData;", "mcqTimingDetails", "getMcqTimingDetails", "setMcqTimingDetails", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarkTestCompleteRequestBody {

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private String courseId;

    @JsonProperty("time_taken_for_1st_attempt")
    private long firstAttemptTimeSeconds;

    @JsonProperty("force_submit")
    private boolean forceSubmit;

    @JsonProperty("is_discarded")
    private boolean isDiscarded;

    @JsonProperty("time_taken_for_review_attempt")
    private long reviewAttemptTimeSeconds;

    @JsonProperty("time_taken")
    private long timeTook;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JsonProperty("answer_changed")
    private Map<String, Integer> answersChanged = VideoTimelineResponseBody.read();

    @JsonProperty("result")
    private Map<String, Integer> result = VideoTimelineResponseBody.read();

    @JsonProperty("guessed")
    private List<String> guessed = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();

    @JsonProperty("ntr")
    private int ntr = 1;

    @JsonProperty("mark_reviewed")
    private List<String> starred = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();

    @JsonProperty("mcq_timing_data")
    private Map<String, McqTimingRequestData> mcqTimingDetails = VideoTimelineResponseBody.read();

    public final Map<String, Integer> getAnswersChanged() {
        return this.answersChanged;
    }

    public final void setAnswersChanged(Map<String, Integer> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.answersChanged = map;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final void setCourseId(String str) {
        this.courseId = str;
    }

    public final Map<String, Integer> getResult() {
        return this.result;
    }

    public final void setResult(Map<String, Integer> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.result = map;
    }

    public final long getTimeTook() {
        return this.timeTook;
    }

    public final void setTimeTook(long j) {
        this.timeTook = j;
    }

    public final List<String> getGuessed() {
        return this.guessed;
    }

    public final void setGuessed(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.guessed = list;
    }

    /* JADX INFO: renamed from: isDiscarded, reason: from getter */
    public final boolean getIsDiscarded() {
        return this.isDiscarded;
    }

    public final void setDiscarded(boolean z) {
        this.isDiscarded = z;
    }

    public final long getFirstAttemptTimeSeconds() {
        return this.firstAttemptTimeSeconds;
    }

    public final void setFirstAttemptTimeSeconds(long j) {
        this.firstAttemptTimeSeconds = j;
    }

    public final long getReviewAttemptTimeSeconds() {
        return this.reviewAttemptTimeSeconds;
    }

    public final void setReviewAttemptTimeSeconds(long j) {
        this.reviewAttemptTimeSeconds = j;
    }

    public final int getNtr() {
        return this.ntr;
    }

    public final void setNtr(int i) {
        this.ntr = i;
    }

    public final boolean getForceSubmit() {
        return this.forceSubmit;
    }

    public final void setForceSubmit(boolean z) {
        this.forceSubmit = z;
    }

    public final List<String> getStarred() {
        return this.starred;
    }

    public final void setStarred(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.starred = list;
    }

    public final Map<String, McqTimingRequestData> getMcqTimingDetails() {
        return this.mcqTimingDetails;
    }

    public final void setMcqTimingDetails(Map<String, McqTimingRequestData> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.mcqTimingDetails = map;
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0015\u001a\u00020\u00142\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/marrow2/data/test/remote/model/MarkTestCompleteRequestBody$Companion;", "", "<init>", "()V", "", "Lo/dropTable;", "p0", "", "p1", "", "p2", "p3", "", "p4", "p5", "p6", "", "", "Lcom/marrow2/data/test/remote/model/McqTimingRequestData;", "p7", "Lcom/marrow2/data/test/remote/model/MarkTestCompleteRequestBody;", "putAnswers", "(Ljava/util/List;IZZJJJLjava/util/Map;)Lcom/marrow2/data/test/remote/model/MarkTestCompleteRequestBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public static int IconCompatParcelizer;
        public static int RemoteActionCompatParcelizer;

        private Companion() {
        }

        public final MarkTestCompleteRequestBody putAnswers(List<dropTable> p0, int p1, boolean p2, boolean p3, long p4, long p5, long p6, Map<String, McqTimingRequestData> p7) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p7, "");
            MarkTestCompleteRequestBody markTestCompleteRequestBody = new MarkTestCompleteRequestBody();
            markTestCompleteRequestBody.setDiscarded(p2);
            markTestCompleteRequestBody.setForceSubmit(p3);
            markTestCompleteRequestBody.setTimeTook(p4);
            markTestCompleteRequestBody.setFirstAttemptTimeSeconds(p5);
            markTestCompleteRequestBody.setReviewAttemptTimeSeconds(p6);
            markTestCompleteRequestBody.setCourseId(String.valueOf(p1));
            markTestCompleteRequestBody.setMcqTimingDetails(p7);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (dropTable droptable : p0) {
                boolean z = droptable.getMediaBrowserCompatCustomActionResultReceiver() == 0;
                int mediaBrowserCompatCustomActionResultReceiver = droptable.getMediaBrowserCompatCustomActionResultReceiver();
                linkedHashMap.put(droptable.getMediaBrowserCompatItemReceiver(), Integer.valueOf(mediaBrowserCompatCustomActionResultReceiver));
                if (!z && droptable.getRead()) {
                    arrayList.add(droptable.getMediaBrowserCompatItemReceiver());
                }
                if (!z && droptable.getAudioAttributesImplBaseParcelizer()) {
                    arrayList2.add(droptable.getMediaBrowserCompatItemReceiver());
                }
                if (droptable.getRemoteActionCompatParcelizer() != 0 && droptable.getRemoteActionCompatParcelizer() != mediaBrowserCompatCustomActionResultReceiver) {
                    linkedHashMap2.put(droptable.getMediaBrowserCompatItemReceiver(), Integer.valueOf(droptable.getRemoteActionCompatParcelizer()));
                }
            }
            markTestCompleteRequestBody.setResult(linkedHashMap);
            markTestCompleteRequestBody.setGuessed(arrayList);
            markTestCompleteRequestBody.setStarred(arrayList2);
            markTestCompleteRequestBody.setAnswersChanged(linkedHashMap2);
            return markTestCompleteRequestBody;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static int write() {
            int i = RemoteActionCompatParcelizer;
            int i2 = i % 8533577;
            RemoteActionCompatParcelizer = i + 1;
            if (i2 != 0) {
                return IconCompatParcelizer;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            IconCompatParcelizer = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }
}
