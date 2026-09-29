package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.magicModule.MagicModuleTimeline;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DashMediaSource1 extends getIntervalUntilNextManifestRefreshMs<MagicModuleTimeline> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(MagicModuleTimeline magicModuleTimeline) {
        return write2(magicModuleTimeline);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ MagicModuleTimeline RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ MagicModuleTimeline[] RemoteActionCompatParcelizer(int i) {
        return write(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(MagicModuleTimeline magicModuleTimeline) {
        return IconCompatParcelizer2(magicModuleTimeline);
    }

    public DashMediaSource1(Context context) {
        super(context, "_smart_recall_timeline");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMap.put("title", "TEXT NOT NULL");
        linkedHashMap.put("correct_count", "INTEGER NOT NULL");
        linkedHashMap.put("mcq_count", "INTEGER NOT NULL");
        linkedHashMap.put("submitted_on", "INTEGER NOT NULL");
        return linkedHashMap;
    }

    private static MagicModuleTimeline IconCompatParcelizer(Cursor cursor) {
        return new MagicModuleTimeline(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_id"), getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "title"), getPeriodDurationMs.write(cursor, "correct_count"), getPeriodDurationMs.write(cursor, "mcq_count"), getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "submitted_on"));
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static ContentValues IconCompatParcelizer2(MagicModuleTimeline magicModuleTimeline) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", magicModuleTimeline.getId());
        contentValues.put("title", magicModuleTimeline.getTitle());
        contentValues.put("correct_count", Integer.valueOf(magicModuleTimeline.getCorrectCount()));
        contentValues.put("mcq_count", Integer.valueOf(magicModuleTimeline.getMcqCount()));
        contentValues.put("submitted_on", Long.valueOf(magicModuleTimeline.getSubmittedOn()));
        return contentValues;
    }

    private static MagicModuleTimeline[] write(int i) {
        return new MagicModuleTimeline[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static String[] write2(MagicModuleTimeline magicModuleTimeline) {
        return new String[]{magicModuleTimeline.getId()};
    }

    public final List<MagicModuleTimeline> write() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("SELECT * FROM _smart_recall_timeline ORDER BY submitted_on ASC");
        if (cursorRemoteActionCompatParcelizer == null) {
            return arrayList;
        }
        while (cursorRemoteActionCompatParcelizer.moveToNext()) {
            try {
                arrayList.add(IconCompatParcelizer(cursorRemoteActionCompatParcelizer));
            } finally {
                cursorRemoteActionCompatParcelizer.close();
            }
        }
        return arrayList;
    }
}
