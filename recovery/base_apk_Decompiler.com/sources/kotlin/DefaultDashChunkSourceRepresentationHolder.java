package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.response.lesson.VideoDeleteRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0014¢\u0006\u0004\b\u000e\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001a\u001a\u00020\u00192\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001d"}, d2 = {"Lo/DefaultDashChunkSourceRepresentationHolder;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/api/models/response/lesson/VideoDeleteRecord;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "", "AudioAttributesCompatParcelizer", "()[Lcom/marrow/data/api/models/response/lesson/VideoDeleteRecord;", "", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "(Lcom/marrow/data/api/models/response/lesson/VideoDeleteRecord;)[Ljava/lang/String;", "Ljava/util/LinkedHashMap;", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "IconCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/api/models/response/lesson/VideoDeleteRecord;", "Landroid/content/ContentValues;", "read", "(Lcom/marrow/data/api/models/response/lesson/VideoDeleteRecord;)Landroid/content/ContentValues;", "(I)I", "", "write", "(I)V", "", "(Ljava/util/List;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultDashChunkSourceRepresentationHolder extends getIntervalUntilNextManifestRefreshMs<VideoDeleteRecord> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDashChunkSourceRepresentationHolder(Context context) {
        super(context, "video_delete");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(VideoDeleteRecord videoDeleteRecord) {
        return RemoteActionCompatParcelizer(videoDeleteRecord);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoDeleteRecord RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoDeleteRecord[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(VideoDeleteRecord videoDeleteRecord) {
        return read(videoDeleteRecord);
    }

    private static VideoDeleteRecord[] AudioAttributesCompatParcelizer() {
        return new VideoDeleteRecord[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(VideoDeleteRecord p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.getVideoIdEditionId()};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("video_id", "TEXT"), setAction.write("edition", "INTEGER"), setAction.write("shown", "INTEGER"));
    }

    private static VideoDeleteRecord IconCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        VideoDeleteRecord videoDeleteRecord = new VideoDeleteRecord(copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "video_id"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "edition"));
        videoDeleteRecord.setShown(copyAdaptationSets.RemoteActionCompatParcelizer(p0, "shown"));
        return videoDeleteRecord;
    }

    private static ContentValues read(VideoDeleteRecord p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("_id", p0.getVideoIdEditionId()), setAction.write("video_id", p0.getVideoId()), setAction.write("edition", Integer.valueOf(p0.getEditionId())));
    }

    public final int IconCompatParcelizer(int p0) {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s.%s = %s.%s", Arrays.copyOf(new Object[]{"video_delete", "video_id", "video_bookmark_timeline", "video_id"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s = %d AND %s AND %s = %d", Arrays.copyOf(new Object[]{"edition", Integer.valueOf(p0), "(shown  IS NULL  OR shown != 1)", "is_active", 1}, 5));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("select %s from %s where %s AND %s", Arrays.copyOf(new Object[]{"count(distinct(video_delete._id))", "video_delete, video_bookmark_timeline", str, str2}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str3);
        if (cursorRemoteActionCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("Wrong ");
            sb.append(str3);
            sb.append(" -> cursor returned null");
            throw new RuntimeException(sb.toString());
        }
        if (cursorRemoteActionCompatParcelizer.moveToNext()) {
            return cursorRemoteActionCompatParcelizer.getInt(0);
        }
        return 0;
    }

    public final void write(int p0) {
        RemoteActionCompatParcelizer("update video_delete set shown  =  1 where edition = ".concat(String.valueOf(p0)));
    }

    public final void write(List<VideoDeleteRecord> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        List<VideoDeleteRecord> list = p0;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((VideoDeleteRecord) it.next()).getVideoIdEditionId());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        AudioAttributesCompatParcelizer(getIntervalUntilNextManifestRefreshMs.RemoteActionCompatParcelizer("_id", strArr), strArr);
    }
}
