package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001a2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/DefaultDashChunkSource;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementLSModel;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "AudioAttributesCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementLSModel;", "", "", "()[Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementLSModel;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementLSModel;)[Ljava/lang/String;", "Landroid/content/ContentValues;", "IconCompatParcelizer", "(Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementLSModel;)Landroid/content/ContentValues;", "", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)Ljava/util/List;", "", "MediaBrowserCompatItemReceiver", "(Ljava/lang/String;)V", "read", "([Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultDashChunkSource extends getIntervalUntilNextManifestRefreshMs<InteractiveVideoElementLSModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDashChunkSource(Context context) {
        super(context, "interactive_video_element_table");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(InteractiveVideoElementLSModel interactiveVideoElementLSModel) {
        return AudioAttributesCompatParcelizer(interactiveVideoElementLSModel);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ InteractiveVideoElementLSModel RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ InteractiveVideoElementLSModel[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(InteractiveVideoElementLSModel interactiveVideoElementLSModel) {
        return IconCompatParcelizer2(interactiveVideoElementLSModel);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("lesson_id", "TEXT NOT NULL"), setAction.write("start_time", "INTEGER NOT NULL"), setAction.write("end_time", "INTEGER NOT NULL"), setAction.write("answer", "TEXT NOT NULL"));
    }

    private static InteractiveVideoElementLSModel AudioAttributesCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new InteractiveVideoElementLSModel(copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "lesson_id"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "start_time"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "end_time"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "answer"));
    }

    private static InteractiveVideoElementLSModel[] AudioAttributesCompatParcelizer() {
        return new InteractiveVideoElementLSModel[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(InteractiveVideoElementLSModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.getId()};
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static ContentValues IconCompatParcelizer2(InteractiveVideoElementLSModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("_id", p0.getId()), setAction.write("lesson_id", p0.getLessonId()), setAction.write("start_time", Integer.valueOf(p0.getStartTime())), setAction.write("end_time", Integer.valueOf(p0.getEndTime())), setAction.write("answer", p0.getAnswer()));
    }

    public final List<InteractiveVideoElementLSModel> AudioAttributesImplBaseParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        InteractiveVideoElementLSModel[] interactiveVideoElementLSModelArr = read("lesson_id =? ", new String[]{p0}, "start_time");
        if (interactiveVideoElementLSModelArr == null) {
            interactiveVideoElementLSModelArr = new InteractiveVideoElementLSModel[0];
        }
        return getOrderDetails.onCommand(interactiveVideoElementLSModelArr);
    }

    public final void MediaBrowserCompatItemReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read("lesson_id", p0);
    }

    public final void read(String[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatItemReceiver("lesson_id", p0);
    }
}
