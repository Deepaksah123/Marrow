package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.models.search.RecentSearch;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getFirstSegmentNum extends getIntervalUntilNextManifestRefreshMs<RecentSearch> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(RecentSearch recentSearch) {
        return write2(recentSearch);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ RecentSearch RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ RecentSearch[] RemoteActionCompatParcelizer(int i) {
        return read(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(RecentSearch recentSearch) {
        return read(recentSearch);
    }

    public getFirstSegmentNum(Context context) {
        super(context, "_search");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(DownloadService.KEY_CONTENT_ID, "TEXT PRIMARY KEY NOT NULL");
        linkedHashMap.put("content_type", "TEXT");
        linkedHashMap.put("sub_content_id", "TEXT");
        linkedHashMap.put("content_title", "TEXT");
        linkedHashMap.put("sub_title", "TEXT");
        linkedHashMap.put("desc_text", "TEXT");
        linkedHashMap.put("hit_count", "INTEGER");
        linkedHashMap.put("last_updated", "INTEGER");
        linkedHashMap.put("vid_start_time", "INTEGER");
        return linkedHashMap;
    }

    private static RecentSearch AudioAttributesCompatParcelizer(Cursor cursor) {
        return new RecentSearch(getPeriodDurationMs.write(cursor, "hit_count"), getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "last_updated"), getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, DownloadService.KEY_CONTENT_ID), getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "sub_content_id"), getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "content_type"), getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "content_title"), getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "sub_title"), getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "desc_text"), getPeriodDurationMs.write(cursor, "vid_start_time"));
    }

    private static ContentValues read(RecentSearch recentSearch) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DownloadService.KEY_CONTENT_ID, recentSearch.getId());
        contentValues.put("content_type", recentSearch.getItemType());
        contentValues.put("sub_content_id", recentSearch.getVideoLessonId());
        contentValues.put("content_title", recentSearch.getItemTitle());
        contentValues.put("sub_title", recentSearch.getItemSubTitle());
        contentValues.put("desc_text", recentSearch.getBulletDescText());
        contentValues.put("vid_start_time", Integer.valueOf(recentSearch.getVideoStartTime()));
        contentValues.put("hit_count", Integer.valueOf(recentSearch.getSearchTimes()));
        contentValues.put("last_updated", Long.valueOf(recentSearch.getLastUpdated()));
        return contentValues;
    }

    private static RecentSearch[] read(int i) {
        return new RecentSearch[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "content_id =? ";
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static String[] write2(RecentSearch recentSearch) {
        return new String[]{recentSearch.getId()};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final RecentSearch a_(String... strArr) {
        return (RecentSearch) super.a_(strArr);
    }

    public final RecentSearch[] AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer((String) null, (String[]) null, "last_updated DESC , hit_count DESC LIMIT 10");
    }
}
