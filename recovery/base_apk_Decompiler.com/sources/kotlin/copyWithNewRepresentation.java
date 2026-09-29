package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import com.marrow.data.models.video.VideoSubtitle;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\t0\u001bj\b\u0012\u0004\u0012\u00020\t`\u001c¨\u0006\u001e"}, d2 = {"Lcom/marrow/data/db/tables/video/VideoSubtitleTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/video/VideoSubtitle;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "Landroid/content/ContentValues;", "model", "newArray", "", "size", "", "(I)[Lcom/marrow/data/models/video/VideoSubtitle;", "getWhereClause", "getPrimaryKeys", "(Lcom/marrow/data/models/video/VideoSubtitle;)[Ljava/lang/String;", "deleteAll", "", "lessonIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class copyWithNewRepresentation extends getIntervalUntilNextManifestRefreshMs<VideoSubtitle> {
    public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer(null);

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/copyWithNewRepresentation$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyWithNewRepresentation(Context context) {
        super(context, "video_subtitle_table");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(VideoSubtitle videoSubtitle) {
        return RemoteActionCompatParcelizer(videoSubtitle);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoSubtitle RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoSubtitle[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(VideoSubtitle videoSubtitle) {
        return read(videoSubtitle);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("lesson_id", "TEXT"), setAction.write(CourseResponseKeyConstantsKt.KEY_SUBTITLE, "TEXT"), setAction.write("last_updated", "INTEGER"), setAction.write("last_sync_time", "INTEGER"));
    }

    private static VideoSubtitle write(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        VideoSubtitle videoSubtitle = new VideoSubtitle(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, CourseResponseKeyConstantsKt.KEY_SUBTITLE), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "_id"), copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "last_updated"));
        videoSubtitle.setLessonId(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "lesson_id"));
        videoSubtitle.setLastSyncTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "last_sync_time"));
        return videoSubtitle;
    }

    private static ContentValues read(VideoSubtitle videoSubtitle) {
        toMagicModuleMetaRepoModel.write(videoSubtitle, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("lesson_id", videoSubtitle.getLessonId()), setAction.write(CourseResponseKeyConstantsKt.KEY_SUBTITLE, videoSubtitle.getSubtitleEnc()), setAction.write("_id", videoSubtitle.getSubtitleId()), setAction.write("last_updated", Long.valueOf(videoSubtitle.getRemoteLastUpdated())), setAction.write("last_sync_time", Long.valueOf(videoSubtitle.getLastSyncTimeMs())));
    }

    private static VideoSubtitle[] AudioAttributesCompatParcelizer() {
        return new VideoSubtitle[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "lesson_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(VideoSubtitle videoSubtitle) {
        toMagicModuleMetaRepoModel.write(videoSubtitle, "");
        return new String[]{"lesson_id"};
    }

    public final void RemoteActionCompatParcelizer(ArrayList<String> arrayList) {
        toMagicModuleMetaRepoModel.write(arrayList, "");
        String str = getIntervalUntilNextManifestRefreshMs.read("lesson_id", (String[]) arrayList.toArray(new String[0]));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        RemoteActionCompatParcelizer("DELETE FROM video_subtitle_table WHERE ".concat(String.valueOf(str)));
    }
}
