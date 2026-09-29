package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.video.TimelinePYTMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\f\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\u0017J#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\f\u001a\u00020\u00192\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0004\b\f\u0010\u001d"}, d2 = {"Lo/getLastAvailableSegmentNum;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/video/TimelinePYTMap;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "read", "(Landroid/database/Cursor;)Lcom/marrow/data/models/video/TimelinePYTMap;", "", "", "AudioAttributesCompatParcelizer", "()[Lcom/marrow/data/models/video/TimelinePYTMap;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "IconCompatParcelizer", "(Lcom/marrow/data/models/video/TimelinePYTMap;)[Ljava/lang/String;", "Landroid/content/ContentValues;", "(Lcom/marrow/data/models/video/TimelinePYTMap;)Landroid/content/ContentValues;", "p1", "", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "(Ljava/util/List;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getLastAvailableSegmentNum extends getIntervalUntilNextManifestRefreshMs<TimelinePYTMap> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLastAvailableSegmentNum(Context context) {
        super(context, "video_timeline_pyt_mapping_table");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ String[] IconCompatParcelizer(TimelinePYTMap timelinePYTMap) {
        return IconCompatParcelizer2(timelinePYTMap);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ TimelinePYTMap RemoteActionCompatParcelizer(Cursor cursor) {
        return read(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ TimelinePYTMap[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(TimelinePYTMap timelinePYTMap) {
        return read(timelinePYTMap);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("timeline_id", "TEXT NOT NULL"), setAction.write("pyt_mcq_id", "TEXT NOT NULL"));
    }

    private static TimelinePYTMap read(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "timeline_id");
        if (strMediaBrowserCompatItemReceiver == null) {
            strMediaBrowserCompatItemReceiver = "";
        }
        String strMediaBrowserCompatItemReceiver2 = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "pyt_mcq_id");
        return new TimelinePYTMap(strMediaBrowserCompatItemReceiver, strMediaBrowserCompatItemReceiver2 != null ? strMediaBrowserCompatItemReceiver2 : "");
    }

    private static TimelinePYTMap[] AudioAttributesCompatParcelizer() {
        return new TimelinePYTMap[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "timeline_id =?  AND pyt_mcq_id =? ";
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static String[] IconCompatParcelizer2(TimelinePYTMap p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{"timeline_id", "pyt_mcq_id"};
    }

    private static ContentValues read(TimelinePYTMap p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("timeline_id", p0.getTimelineId()), setAction.write("pyt_mcq_id", p0.getPytMcqId()));
    }

    public final void read(List<String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(getIntervalUntilNextManifestRefreshMs.read("timeline_id", p0), (String[]) p0.toArray(new String[0]));
    }

    public final void AudioAttributesImplApi21Parcelizer(String p0, String[] p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        for (String str : p1) {
            AudioAttributesCompatParcelizer(new TimelinePYTMap(p0, str));
        }
    }
}
