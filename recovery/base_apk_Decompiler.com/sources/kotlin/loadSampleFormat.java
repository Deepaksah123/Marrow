package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.test.TestAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\nB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0014\u001a\u00020\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u001c¢\u0006\u0004\b\u0014\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/loadSampleFormat;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/test/TestAnalytics;", "Lo/ContainerMediaChunk;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "write", "(Landroid/database/Cursor;)Lcom/marrow/data/models/test/TestAnalytics;", "Landroid/content/ContentValues;", "read", "(Lcom/marrow/data/models/test/TestAnalytics;)Landroid/content/ContentValues;", "", "", "AudioAttributesCompatParcelizer", "()[Lcom/marrow/data/models/test/TestAnalytics;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/models/test/TestAnalytics;)[Ljava/lang/String;", "", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)V", "", "(Ljava/util/List;)V", "IconCompatParcelizer", "(Lcom/marrow/data/models/test/TestAnalytics;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class loadSampleFormat extends getIntervalUntilNextManifestRefreshMs<TestAnalytics> implements ContainerMediaChunk {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public loadSampleFormat(Context context) {
        super(context, "test_analytics");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(TestAnalytics testAnalytics) {
        return RemoteActionCompatParcelizer(testAnalytics);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ TestAnalytics RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ TestAnalytics[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(TestAnalytics testAnalytics) {
        return read(testAnalytics);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("test_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("change_correct", "INTEGER"), setAction.write("change_wrong", "INTEGER"), setAction.write("change_total", "INTEGER"), setAction.write("guess_stat", "TEXT"), setAction.write("neet_comparison", "TEXT"), setAction.write("first_attempt_time", "INTEGER"), setAction.write("review_attempt_time", "INTEGER"), setAction.write("avg_attempt_time", "INTEGER"), setAction.write("my_stat", "TEXT"), setAction.write("topper_stat", "TEXT"));
    }

    private static TestAnalytics write(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        TestAnalytics testAnalytics = new TestAnalytics();
        testAnalytics.testId = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "test_id");
        testAnalytics.changeCorrect = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "change_correct");
        testAnalytics.changeWrong = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "change_wrong");
        testAnalytics.changeTotal = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "change_total");
        testAnalytics.firstAttemptTimeSeconds = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "first_attempt_time");
        testAnalytics.averageTimeSeconds = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "avg_attempt_time");
        testAnalytics.reviewAttemptTimeSeconds = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "review_attempt_time");
        testAnalytics.myStat = buildRepresentation.AudioAttributesCompatParcelizer(copyAdaptationSets.IconCompatParcelizer(p0, "my_stat"));
        testAnalytics.topUserStat = buildRepresentation.AudioAttributesCompatParcelizer(copyAdaptationSets.IconCompatParcelizer(p0, "topper_stat"));
        testAnalytics.guessedStat = buildRepresentation.IconCompatParcelizer(copyAdaptationSets.MediaBrowserCompatCustomActionResultReceiver(p0, "guess_stat"));
        testAnalytics.neetRanks = buildRepresentation.RemoteActionCompatParcelizer(copyAdaptationSets.IconCompatParcelizer(p0, "neet_comparison"));
        return testAnalytics;
    }

    private static ContentValues read(TestAnalytics p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("test_id", p0.testId), setAction.write("change_correct", Integer.valueOf(p0.changeCorrect)), setAction.write("change_wrong", Integer.valueOf(p0.changeWrong)), setAction.write("change_total", Integer.valueOf(p0.changeTotal)), setAction.write("first_attempt_time", Integer.valueOf(p0.firstAttemptTimeSeconds)), setAction.write("review_attempt_time", Integer.valueOf(p0.reviewAttemptTimeSeconds)), setAction.write("avg_attempt_time", Integer.valueOf(p0.averageTimeSeconds)), setAction.write("guess_stat", buildRepresentation.RemoteActionCompatParcelizer(p0.guessedStat)), setAction.write("my_stat", buildRepresentation.AudioAttributesCompatParcelizer(p0.myStat)), setAction.write("topper_stat", buildRepresentation.AudioAttributesCompatParcelizer(p0.topUserStat)), setAction.write("neet_comparison", buildRepresentation.AudioAttributesCompatParcelizer(p0.neetRanks)));
    }

    private static TestAnalytics[] AudioAttributesCompatParcelizer() {
        return new TestAnalytics[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "test_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(TestAnalytics p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String str = p0.testId;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return new String[]{str};
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read("test_id", p0);
    }

    public final void AudioAttributesCompatParcelizer(List<String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isEmpty()) {
            return;
        }
        String str = getIntervalUntilNextManifestRefreshMs.read("test_id", (String[]) p0.toArray(new String[0]));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(str, (String[]) null);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    public final void IconCompatParcelizer2(TestAnalytics p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(p0);
    }
}
