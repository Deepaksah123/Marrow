package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.plan.Subscription;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class newChunkExtractor extends r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc<Subscription> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return AudioAttributesCompatParcelizer((Subscription) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return write(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Object obj) {
        return IconCompatParcelizer((Subscription) obj);
    }

    public newChunkExtractor(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, "_subscription", getstreampositionusforcontent);
    }

    public final long MediaBrowserCompatCustomActionResultReceiver(String str) {
        String[] strArr = read("expires_on", "content_id =?  AND content_type =? ", new String[]{str, str}, null);
        if (strArr == null || strArr.length <= 0) {
            return 0L;
        }
        return Long.valueOf(strArr[0]).longValue();
    }

    @Override // kotlin.r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        linkedHashMapRemoteActionCompatParcelizer.put("_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMapRemoteActionCompatParcelizer.put("access_level", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put(DownloadService.KEY_CONTENT_ID, "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("content_type", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("expires_on", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("user_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("content_name_for_event", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("started_on", "INTEGER");
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    private static Subscription AudioAttributesCompatParcelizer(Cursor cursor) {
        Subscription subscription = new Subscription();
        subscription.setAccessLevel(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "access_level"));
        subscription.setContentId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, DownloadService.KEY_CONTENT_ID));
        subscription.setContentType(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "content_type"));
        subscription.setExpiresOn(getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "expires_on"));
        subscription.setUserId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "user_id"));
        subscription.setId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_id"));
        subscription.setContentNameForEvent(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "content_name_for_event"));
        subscription.setStartedOn(getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "started_on"));
        return subscription;
    }

    private static ContentValues IconCompatParcelizer(Subscription subscription) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_level", subscription.getAccessLevel());
        contentValues.put(DownloadService.KEY_CONTENT_ID, subscription.getContentId());
        contentValues.put("content_type", subscription.getContentType());
        contentValues.put("expires_on", Long.valueOf(subscription.getExpiresOn()));
        contentValues.put("user_id", subscription.getUserId());
        contentValues.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(subscription.getCourseId()));
        contentValues.put("_id", subscription.getId());
        contentValues.put("content_name_for_event", subscription.getContentNameForEvent());
        contentValues.put("started_on", Long.valueOf(subscription.getStartedOn()));
        return contentValues;
    }

    private static Subscription[] write(int i) {
        return new Subscription[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(Subscription subscription) {
        return new String[]{subscription.getId()};
    }

    public final boolean RemoteActionCompatParcelizer(long j) {
        return write("expires_on>=?", new String[]{String.valueOf(j)}) > 0;
    }

    public final int read(long j) {
        return write("expires_on>=?", new String[]{String.valueOf(j)});
    }

    public final boolean AudioAttributesImplApi26Parcelizer(String str) {
        return AudioAttributesCompatParcelizer("content_id =?  AND content_type =?  AND expires_on>=?", new String[]{str, str, String.valueOf(System.currentTimeMillis())}, (String) null) != null;
    }

    public final boolean AudioAttributesImplApi21Parcelizer(String str, String str2) {
        return AudioAttributesCompatParcelizer("content_id =?  AND content_type =?  AND expires_on>=?", new String[]{str2, str, String.valueOf(System.currentTimeMillis())}, (String) null) != null;
    }

    public final boolean MediaDescriptionCompat() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("SELECT count(content_type) from _subscription WHERE content_type not in ('video', 'test', 'mcq') and content_type like '%subj' and expires_on >".concat(String.valueOf(sb.toString())));
        if (cursorRemoteActionCompatParcelizer == null) {
            if (cursorRemoteActionCompatParcelizer != null) {
                cursorRemoteActionCompatParcelizer.close();
            }
            return false;
        }
        try {
            if (!cursorRemoteActionCompatParcelizer.moveToFirst()) {
                if (cursorRemoteActionCompatParcelizer != null) {
                    cursorRemoteActionCompatParcelizer.close();
                }
                return false;
            }
            boolean z = cursorRemoteActionCompatParcelizer.getInt(0) > 0;
            if (cursorRemoteActionCompatParcelizer != null) {
                cursorRemoteActionCompatParcelizer.close();
            }
            return z;
        } catch (Throwable th) {
            if (cursorRemoteActionCompatParcelizer != null) {
                try {
                    cursorRemoteActionCompatParcelizer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final String[][] AudioAttributesCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        return write(new String[]{DownloadService.KEY_CONTENT_ID, "content_type"}, "expires_on>=?", new String[]{sb.toString()}, null);
    }
}
