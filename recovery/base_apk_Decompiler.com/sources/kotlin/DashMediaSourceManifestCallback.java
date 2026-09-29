package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.mcq.McqTimerAnalyticsModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0016J\u0015\u0010\f\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0018J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lo/DashMediaSourceManifestCallback;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/mcq/McqTimerAnalyticsModel;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "IconCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/models/mcq/McqTimerAnalyticsModel;", "Landroid/content/ContentValues;", "AudioAttributesCompatParcelizer", "(Lcom/marrow/data/models/mcq/McqTimerAnalyticsModel;)Landroid/content/ContentValues;", "", "", "()[Lcom/marrow/data/models/mcq/McqTimerAnalyticsModel;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/models/mcq/McqTimerAnalyticsModel;)[Ljava/lang/String;", "", "(Lcom/marrow/data/models/mcq/McqTimerAnalyticsModel;)V", "", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/String;)Ljava/util/List;", "p1", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/mcq/McqTimerAnalyticsModel;", "MediaBrowserCompatItemReceiver", "(Ljava/lang/String;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DashMediaSourceManifestCallback extends getIntervalUntilNextManifestRefreshMs<McqTimerAnalyticsModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashMediaSourceManifestCallback(Context context) {
        super(context, "mcq_timer_analytics");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(McqTimerAnalyticsModel mcqTimerAnalyticsModel) {
        return RemoteActionCompatParcelizer(mcqTimerAnalyticsModel);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqTimerAnalyticsModel RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqTimerAnalyticsModel[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(McqTimerAnalyticsModel mcqTimerAnalyticsModel) {
        return AudioAttributesCompatParcelizer(mcqTimerAnalyticsModel);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write(LessonMcqUpdateInfo.KEY_MCQ_ID, "TEXT NOT NULL"), setAction.write("test_id", "TEXT NOT NULL"), setAction.write("first_attempt_time", "INTEGER"), setAction.write("change_answer_time", "INTEGER"), setAction.write("review_time", "INTEGER"), setAction.write("has_been_answered", "INTEGER"));
    }

    private static McqTimerAnalyticsModel IconCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new McqTimerAnalyticsModel(copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, LessonMcqUpdateInfo.KEY_MCQ_ID), copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "test_id"), copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "first_attempt_time"), copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "change_answer_time"), copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "review_time"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "has_been_answered") == 1);
    }

    private static ContentValues AudioAttributesCompatParcelizer(McqTimerAnalyticsModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write(LessonMcqUpdateInfo.KEY_MCQ_ID, p0.getMcqId()), setAction.write("test_id", p0.getParentId()), setAction.write("first_attempt_time", Long.valueOf(p0.getFirstAttemptTime())), setAction.write("change_answer_time", Long.valueOf(p0.getChangeAnswerTime())), setAction.write("review_time", Long.valueOf(p0.getReviewTime())), setAction.write("has_been_answered", Integer.valueOf(p0.getHasBeenAnswered() ? 1 : 0)));
    }

    private static McqTimerAnalyticsModel[] AudioAttributesCompatParcelizer() {
        return new McqTimerAnalyticsModel[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "mcq_id = ? AND test_id = ?";
    }

    private static String[] RemoteActionCompatParcelizer(McqTimerAnalyticsModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.getMcqId(), p0.getParentId()};
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    public final void IconCompatParcelizer2(McqTimerAnalyticsModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(p0);
    }

    public final List<McqTimerAnalyticsModel> AudioAttributesImplApi21Parcelizer(String p0) {
        List<McqTimerAnalyticsModel> listOnCommand;
        toMagicModuleMetaRepoModel.write(p0, "");
        McqTimerAnalyticsModel[] mcqTimerAnalyticsModelArrIconCompatParcelizer = IconCompatParcelizer("test_id", p0);
        return (mcqTimerAnalyticsModelArrIconCompatParcelizer == null || (listOnCommand = getOrderDetails.onCommand(mcqTimerAnalyticsModelArrIconCompatParcelizer)) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listOnCommand;
    }

    public final McqTimerAnalyticsModel AudioAttributesImplApi26Parcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return a_(p1, p0);
    }

    public final void MediaBrowserCompatItemReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read("test_id", p0);
    }
}
