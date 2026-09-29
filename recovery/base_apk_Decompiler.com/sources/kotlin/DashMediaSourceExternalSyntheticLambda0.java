package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.marrow.data.models.common.Schema;
import com.marrow.data.models.mcq.schema.SchemaItem;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\u0010!J'\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u00112\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001b2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tJ\u000e\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\tJ\u000e\u0010,\u001a\u00020-2\u0006\u0010+\u001a\u00020\tJ\u000e\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\t¨\u00061"}, d2 = {"Lcom/marrow/data/db/tables/lesson/SchemaTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/common/Schema;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "Landroid/content/ContentValues;", "model", "newArray", "", "size", "", "(I)[Lcom/marrow/data/models/common/Schema;", "getWhereClause", "getPrimaryKeys", "(Lcom/marrow/data/models/common/Schema;)[Ljava/lang/String;", "deleteAll", "", "subtopics", "", "getNextSyncParams", "Lcom/marrow/data/api/models/request/sync/SyncParam;", "getSubTopicList", "Lio/reactivex/Flowable;", "highYieldIds", "([Ljava/lang/String;)Lio/reactivex/Flowable;", "getHighYieldIdTitleMap", "([Ljava/lang/String;)[[Ljava/lang/String;", "getHighYieldTitlesSync", "([Ljava/lang/String;)[Ljava/lang/String;", "getAllSchemaListWithStatus", "Lcom/marrow/data/models/mcq/schema/SchemaItem;", "examName", "rsId", "setServerContentUpdated", "schemaId", "isServerContentUpdated", "", "getSchemaCountOfSelectedExam", "selectedExam", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DashMediaSourceExternalSyntheticLambda0 extends getIntervalUntilNextManifestRefreshMs<Schema> {
    public static final read read = new read(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashMediaSourceExternalSyntheticLambda0(Context context) {
        super(context, "_schema");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Schema schema) {
        return write2(schema);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Schema RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Schema[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Schema schema) {
        return AudioAttributesCompatParcelizer(schema);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DashMediaSourceExternalSyntheticLambda0$read;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("is_hyt", "INTEGER"), setAction.write("mcq_count", "INTEGER"), setAction.write("last_updated", "INTEGER"), setAction.write("title", "TEXT"), setAction.write("published_status", "TEXT"), setAction.write("is_server_updated", "INTEGER"));
    }

    private static Schema write(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        String strAudioAttributesImplBaseParcelizer = copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "_id");
        String strAudioAttributesImplBaseParcelizer2 = copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "title");
        boolean zRemoteActionCompatParcelizer = copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "is_hyt");
        int iAudioAttributesCompatParcelizer = copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "mcq_count");
        long jAudioAttributesImplApi21Parcelizer = copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "last_updated");
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "published_status");
        Schema schema = new Schema(strAudioAttributesImplBaseParcelizer, null, strAudioAttributesImplBaseParcelizer2, jAudioAttributesImplApi21Parcelizer, zRemoteActionCompatParcelizer, iAudioAttributesCompatParcelizer, strMediaBrowserCompatItemReceiver == null ? "" : strMediaBrowserCompatItemReceiver, null, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, null);
        schema.setServerContentUpdated(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "is_server_updated"));
        return schema;
    }

    private static ContentValues AudioAttributesCompatParcelizer(Schema schema) {
        toMagicModuleMetaRepoModel.write(schema, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", schema.getId());
        contentValues.put("is_hyt", Boolean.valueOf(schema.isHyt()));
        contentValues.put("mcq_count", Integer.valueOf(schema.getMcqCount()));
        contentValues.put("last_updated", Long.valueOf(schema.getLastUpdated()));
        contentValues.put("title", schema.getTitle());
        contentValues.put("published_status", schema.getPublishedStatus());
        contentValues.put("is_server_updated", Boolean.valueOf(schema.getIsServerContentUpdated()));
        return contentValues;
    }

    private static Schema[] AudioAttributesCompatParcelizer() {
        return new Schema[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static String[] write2(Schema schema) {
        toMagicModuleMetaRepoModel.write(schema, "");
        return new String[]{"_id"};
    }

    public final void IconCompatParcelizer(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        String str = getIntervalUntilNextManifestRefreshMs.read("_id", (String[]) list.toArray(new String[0]));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        RemoteActionCompatParcelizer("DELETE FROM _schema WHERE ".concat(String.valueOf(str)));
    }

    public final String[][] read(String[] strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        String strRemoteActionCompatParcelizer = getIntervalUntilNextManifestRefreshMs.RemoteActionCompatParcelizer("_id", strArr);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        return write(new String[]{"_id", "title"}, strRemoteActionCompatParcelizer, strArr, null);
    }

    public final String[] AudioAttributesImplApi21Parcelizer(String[] strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        String strRemoteActionCompatParcelizer = getIntervalUntilNextManifestRefreshMs.RemoteActionCompatParcelizer("_id", strArr);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        String[] strArr2 = read("title", strRemoteActionCompatParcelizer, strArr, null);
        return strArr2 == null ? new String[0] : strArr2;
    }

    public final List<SchemaItem> AudioAttributesImplApi21Parcelizer(String str, String str2) {
        Triple triple;
        String strConcat;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        String str3 = str;
        if (str3.length() > 0 && str2.length() > 0) {
            StringBuilder sb = new StringBuilder("schema_subj.rs_id = '");
            sb.append(str2);
            sb.append("' AND schema_exam.exam = '");
            sb.append(str);
            sb.append("'");
            triple = new Triple("_schema LEFT OUTER JOIN _schema_status ON _schema._id = _schema_status.schema_id, schema_subj, schema_exam", "schema_subj.schema_id = _schema._id AND schema_exam.schema_id = _schema._id", sb.toString());
        } else if (str3.length() > 0) {
            StringBuilder sb2 = new StringBuilder("schema_exam.exam = '");
            sb2.append(str);
            sb2.append("'");
            triple = new Triple("_schema LEFT OUTER JOIN _schema_status ON _schema._id = _schema_status.schema_id, schema_exam", "schema_exam.schema_id = _schema._id", sb2.toString());
        } else if (str2.length() > 0) {
            StringBuilder sb3 = new StringBuilder("schema_subj.rs_id = '");
            sb3.append(str2);
            sb3.append("'");
            triple = new Triple("_schema LEFT OUTER JOIN _schema_status ON _schema._id = _schema_status.schema_id, schema_subj", "schema_subj.schema_id = _schema._id", sb3.toString());
        } else {
            triple = new Triple("_schema LEFT OUTER JOIN _schema_status ON _schema._id = _schema_status.schema_id", "", "");
        }
        String str4 = (String) triple.AudioAttributesCompatParcelizer();
        String string = (String) triple.read();
        String str5 = (String) triple.RemoteActionCompatParcelizer();
        String str6 = string;
        if (str6.length() == 0 && str5.length() == 0) {
            strConcat = "";
        } else {
            if (str6.length() > 0 && str5.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" AND ");
                sb4.append(str5);
                string = sb4.toString();
            } else if (str6.length() <= 0) {
                string = str5;
            }
            strConcat = "where ".concat(String.valueOf(string));
        }
        StringBuilder sb5 = new StringBuilder("select _schema._id, _schema.title, _schema.mcq_count, _schema_status.completeness, _schema_status.attempted, _schema_status.correctness from ");
        sb5.append(str4);
        sb5.append(" ");
        sb5.append(strConcat);
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb5.toString());
        if (cursorRemoteActionCompatParcelizer == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            Cursor cursor2 = cursor;
            while (cursor2.moveToNext()) {
                String string2 = cursor2.getString(0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                String string3 = cursor2.getString(1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                arrayList.add(new SchemaItem(string2, string3, cursor2.getInt(3), cursor2.getInt(4), getOnline.read(cursor2.getDouble(5)), cursor2.getInt(2)));
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return arrayList;
        } finally {
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_server_updated", (Integer) 0);
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    public final boolean MediaBrowserCompatItemReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        StringBuilder sb = new StringBuilder("select is_server_updated from _schema where _id = '");
        sb.append(str);
        sb.append("'");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb.toString());
        if (cursorRemoteActionCompatParcelizer == null) {
            throw new RuntimeException("Invalid query");
        }
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            Cursor cursor2 = cursor;
            if (cursor2.moveToFirst()) {
                boolean z = cursor2.getInt(0) == 0;
                MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                return z;
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            throw new RuntimeException("No Schema Found");
        } finally {
        }
    }

    public final int AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        StringBuilder sb = new StringBuilder("select count(distinct(_id)) from _schema, schema_exam where schema_id = _id AND exam = '");
        sb.append(str);
        sb.append("'");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb.toString());
        if (cursorRemoteActionCompatParcelizer == null) {
            throw new RuntimeException("Invalid query");
        }
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            Cursor cursor2 = cursor;
            if (cursor2.moveToFirst()) {
                int i = cursor2.getInt(0);
                MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                return i;
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            throw new RuntimeException("No Schema Found");
        } finally {
        }
    }
}
