package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.request.sync.SyncParam;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.common.SchemaUserStatus;
import com.marrow.data.models.mcq.schema.SchemaQbankItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u001b¢\u0006\u0004\b\u000f\u0010\u001dJ\u001b\u0010\t\u001a\u00020\u001e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u001b¢\u0006\u0004\b\t\u0010\u001fJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b \u0010!"}, d2 = {"Lo/replaceManifestUri;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/common/SchemaUserStatus;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "IconCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/models/common/SchemaUserStatus;", "Landroid/content/ContentValues;", "read", "(Lcom/marrow/data/models/common/SchemaUserStatus;)Landroid/content/ContentValues;", "", "", "AudioAttributesCompatParcelizer", "()[Lcom/marrow/data/models/common/SchemaUserStatus;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "(Lcom/marrow/data/models/common/SchemaUserStatus;)[Ljava/lang/String;", "Lcom/marrow/data/api/models/request/sync/SyncParam;", "write", "()Lcom/marrow/data/api/models/request/sync/SyncParam;", "", "Lcom/marrow/data/models/mcq/schema/SchemaQbankItem;", "(Ljava/util/List;)Ljava/util/List;", "", "(Ljava/util/List;)V", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)Lcom/marrow/data/models/common/SchemaUserStatus;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class replaceManifestUri extends getIntervalUntilNextManifestRefreshMs<SchemaUserStatus> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public replaceManifestUri(Context context) {
        super(context, "_schema_status");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ String[] IconCompatParcelizer(SchemaUserStatus schemaUserStatus) {
        return IconCompatParcelizer2(schemaUserStatus);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ SchemaUserStatus RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ SchemaUserStatus[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(SchemaUserStatus schemaUserStatus) {
        return read(schemaUserStatus);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("schema_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("correctness", "REAL"), setAction.write("mcq_count", "INTEGER"), setAction.write("completeness", "REAL"), setAction.write("attempted", "INTEGER"), setAction.write("last_updated", "INTEGER"), setAction.write("since_id", "TEXT"), setAction.write("correct", "INTEGER"), setAction.write("wrong", "INTEGER"));
    }

    private static SchemaUserStatus IconCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strAudioAttributesImplBaseParcelizer = copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "schema_id");
        double dWrite = copyAdaptationSets.write(p0, "correctness");
        int iAudioAttributesCompatParcelizer = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "mcq_count");
        double dWrite2 = copyAdaptationSets.write(p0, "completeness");
        return new SchemaUserStatus(copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "since_id"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "attempted"), dWrite2, dWrite, strAudioAttributesImplBaseParcelizer, iAudioAttributesCompatParcelizer, copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "last_updated"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "correct"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "wrong"));
    }

    private static ContentValues read(SchemaUserStatus p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("schema_id", p0.getSchemaId()), setAction.write("correctness", Double.valueOf(p0.getCorrectnessScore())), setAction.write("mcq_count", Integer.valueOf(p0.getMcqCount())), setAction.write("completeness", Double.valueOf(p0.getCompletenessScore())), setAction.write("attempted", Integer.valueOf(p0.getAttemptedCount())), setAction.write("last_updated", Long.valueOf(p0.getLastUpdated())), setAction.write("since_id", p0.getId()), setAction.write("correct", Integer.valueOf(p0.getCorrectCount())), setAction.write("wrong", Integer.valueOf(p0.getWrongCount())));
    }

    private static SchemaUserStatus[] AudioAttributesCompatParcelizer() {
        return new SchemaUserStatus[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "schema_id =? ";
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static String[] IconCompatParcelizer2(SchemaUserStatus p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{"schema_id"};
    }

    public final SyncParam write() {
        SyncParam syncParam = new SyncParam();
        Cursor cursorQuery = this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), new String[]{"MAX(since_id) AS SINCE_ID", "MAX(last_updated) AS LAST_UPDATED"}, null, null, null);
        if (cursorQuery == null) {
            return syncParam;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            if (cursor2.moveToFirst()) {
                syncParam.sinceId = cursor2.getString(0);
                syncParam.lastUpdated = cursor2.getLong(1);
            }
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return syncParam;
        } finally {
        }
    }

    public final List<SchemaQbankItem> read(List<String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s.%s, %s.%s", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "title"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s, %s %s, %s %s", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject", "rs", "_subject", "ts"}, 5));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%s.%s", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        String str4 = String.format("%s.%s = %s.%s and %s.%s = %s.%s and %s.%s = %s.%s and %s", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "rs", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "subject_id", "ts", "_id", "ts", "parent_id", "rs", "_id", getIntervalUntilNextManifestRefreshMs.read(str3, (String[]) p0.toArray(new String[0]))}, 13));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("%s.%s, %s.%s, %s.%s, %s.%s, %s.%s", Arrays.copyOf(new Object[]{"rs", "sort_order", "rs", "_id", "ts", "sort_order", "ts", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number"}, 10));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
        String str6 = String.format(Locale.getDefault(), "SELECT  %s from %s where %s order by %s", Arrays.copyOf(new Object[]{str, str2, str4, str5}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str6);
        ArrayList arrayList = new ArrayList();
        if (cursorRemoteActionCompatParcelizer == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        while (cursorRemoteActionCompatParcelizer.moveToNext()) {
            arrayList.add(new SchemaQbankItem(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursorRemoteActionCompatParcelizer, "_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursorRemoteActionCompatParcelizer, "title")));
        }
        return arrayList;
    }

    public final void RemoteActionCompatParcelizer(List<String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String str = getIntervalUntilNextManifestRefreshMs.read("schema_id", (String[]) p0.toArray(new String[0]));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        RemoteActionCompatParcelizer("DELETE FROM _schema_status WHERE ".concat(String.valueOf(str)));
    }

    public final SchemaUserStatus AudioAttributesImplBaseParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (SchemaUserStatus) super.a_(p0);
    }
}
