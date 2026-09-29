package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.test.TopUser;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class createFallbackOptions extends getIntervalUntilNextManifestRefreshMs<TopUser> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(TopUser topUser) {
        return RemoteActionCompatParcelizer(topUser);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ TopUser RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ TopUser[] RemoteActionCompatParcelizer(int i) {
        return read(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(TopUser topUser) {
        return read(topUser);
    }

    public createFallbackOptions(Context context) {
        super(context, "_top_user");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("test_id", "TEXT NOT NULL");
        linkedHashMap.put("_id", "TEXT");
        linkedHashMap.put(TopUser.KEY_RANK, "INTEGER");
        linkedHashMap.put("fname", "TEXT");
        linkedHashMap.put("lname", "TEXT");
        linkedHashMap.put("profile_pic", "TEXT");
        linkedHashMap.put("score", "REAL");
        linkedHashMap.put("skipped", "INTEGER");
        linkedHashMap.put("wrong", "INTEGER");
        linkedHashMap.put("correct", "INTEGER");
        linkedHashMap.put(TopUser.KEY_IS_ANONYMOUS, "INTEGER");
        linkedHashMap.put("state_id", "TEXT");
        return linkedHashMap;
    }

    private static TopUser AudioAttributesCompatParcelizer(Cursor cursor) {
        TopUser topUser = new TopUser();
        topUser.testId = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "test_id");
        topUser.id = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_id");
        topUser.rank = getPeriodDurationMs.write(cursor, TopUser.KEY_RANK);
        topUser.firstName = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "fname");
        topUser.lastName = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "lname");
        topUser.profilePic = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "profile_pic");
        topUser.score = getPeriodDurationMs.IconCompatParcelizer(cursor, "score");
        topUser.skipped = getPeriodDurationMs.write(cursor, "skipped");
        topUser.wrong = getPeriodDurationMs.write(cursor, "wrong");
        topUser.correct = getPeriodDurationMs.write(cursor, "correct");
        topUser.isAnonymous = getPeriodDurationMs.read(cursor, TopUser.KEY_IS_ANONYMOUS);
        topUser.stateId = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "state_id");
        return topUser;
    }

    private static ContentValues read(TopUser topUser) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("test_id", topUser.testId);
        contentValues.put("_id", topUser.id);
        contentValues.put(TopUser.KEY_RANK, Integer.valueOf(topUser.rank));
        contentValues.put("fname", topUser.firstName);
        contentValues.put("lname", topUser.lastName);
        contentValues.put("profile_pic", topUser.profilePic);
        contentValues.put("score", Double.valueOf(topUser.score));
        contentValues.put("skipped", Integer.valueOf(topUser.skipped));
        contentValues.put("wrong", Integer.valueOf(topUser.wrong));
        contentValues.put("correct", Integer.valueOf(topUser.correct));
        contentValues.put(TopUser.KEY_IS_ANONYMOUS, Integer.valueOf(topUser.isAnonymous ? 1 : 0));
        contentValues.put("state_id", topUser.stateId);
        return contentValues;
    }

    private static TopUser[] read(int i) {
        return new TopUser[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "test_id =?  AND rank =?  AND state_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(TopUser topUser) {
        return new String[]{topUser.testId, String.valueOf(topUser.rank), topUser.stateId};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final int read(String str, String str2) {
        return AudioAttributesCompatParcelizer("test_id =?  AND state_id =? ", new String[]{str, str2});
    }

    public final void AudioAttributesCompatParcelizer(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        AudioAttributesCompatParcelizer(read("test_id", (String[]) list.toArray(new String[0])), (String[]) null);
    }

    public final void IconCompatParcelizer(TopUser[] topUserArr) {
        IconCompatParcelizer((Object[]) topUserArr);
    }

    public final boolean MediaBrowserCompatItemReceiver(String str, String str2) {
        return write("test_id =?  AND state_id =? ", new String[]{str, str2}) > 0;
    }

    public final boolean AudioAttributesImplApi26Parcelizer(String str) {
        return write("test_id =? ", new String[]{str}) > 0;
    }

    public final TopUser[] AudioAttributesImplApi26Parcelizer(String str, String str2) {
        return RemoteActionCompatParcelizer("test_id =?  AND state_id =? ", new String[]{str, str2}, "rank ASC");
    }

    public final TopUser[] AudioAttributesImplBaseParcelizer(String str) {
        return AudioAttributesImplApi26Parcelizer(str, TestIndex.ALL_INDIA_ID);
    }
}
