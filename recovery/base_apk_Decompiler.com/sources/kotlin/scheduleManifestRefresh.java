package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.lesson.ConcisedLessonParentInfo;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\f\u001a\u00020\u00182\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\f\u0010\u0019"}, d2 = {"Lo/scheduleManifestRefresh;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/lesson/ConcisedLessonParentInfo;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "read", "(Landroid/database/Cursor;)Lcom/marrow/data/models/lesson/ConcisedLessonParentInfo;", "Landroid/content/ContentValues;", "(Lcom/marrow/data/models/lesson/ConcisedLessonParentInfo;)Landroid/content/ContentValues;", "", "", "write", "()[Lcom/marrow/data/models/lesson/ConcisedLessonParentInfo;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "(Lcom/marrow/data/models/lesson/ConcisedLessonParentInfo;)[Ljava/lang/String;", "", "([Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class scheduleManifestRefresh extends getIntervalUntilNextManifestRefreshMs<ConcisedLessonParentInfo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scheduleManifestRefresh(Context context) {
        super(context, "concise_parent_info");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(ConcisedLessonParentInfo concisedLessonParentInfo) {
        return AudioAttributesCompatParcelizer(concisedLessonParentInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ConcisedLessonParentInfo RemoteActionCompatParcelizer(Cursor cursor) {
        return read(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ConcisedLessonParentInfo[] RemoteActionCompatParcelizer(int i) {
        return write();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(ConcisedLessonParentInfo concisedLessonParentInfo) {
        return RemoteActionCompatParcelizer(concisedLessonParentInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put("concise_id", "TEXT");
        linkedHashMap2.put("parent_video_id", "TEXT");
        linkedHashMap2.put("sort_order", "INTEGER");
        linkedHashMap2.put("is_intern_module", "INTEGER");
        linkedHashMap2.put("is_related_module", "INTEGER");
        return linkedHashMap;
    }

    private static ConcisedLessonParentInfo read(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new ConcisedLessonParentInfo(copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "concise_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "parent_video_id"), copyAdaptationSets.RemoteActionCompatParcelizer(p0, "is_intern_module"), copyAdaptationSets.RemoteActionCompatParcelizer(p0, "is_related_module"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "sort_order"));
    }

    private static ContentValues RemoteActionCompatParcelizer(ConcisedLessonParentInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("concise_id", p0.getConciseId());
        contentValues.put("parent_video_id", p0.getParentId());
        contentValues.put("is_intern_module", Boolean.valueOf(p0.isInternModule()));
        contentValues.put("is_related_module", Boolean.valueOf(p0.isRelatedModule()));
        contentValues.put("sort_order", Integer.valueOf(p0.getSortOrder()));
        return contentValues;
    }

    private static ConcisedLessonParentInfo[] write() {
        return new ConcisedLessonParentInfo[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "concise_id =?  AND parent_video_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(ConcisedLessonParentInfo p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{"concise_id", "parent_video_id"};
    }

    public final void read(String[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strAudioAttributesCompatParcelizer = getIntervalUntilNextManifestRefreshMs.AudioAttributesCompatParcelizer(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        String strConcat = "parent_video_id ".concat(String.valueOf(strAudioAttributesCompatParcelizer));
        String strConcat2 = "concise_id ".concat(String.valueOf(strAudioAttributesCompatParcelizer));
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat);
        sb.append(" OR ");
        sb.append(strConcat2);
        RemoteActionCompatParcelizer("DELETE FROM concise_parent_info WHERE ".concat(String.valueOf(sb.toString())));
    }
}
