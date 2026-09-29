package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.common.SchemaExamMap;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001b¨\u0006\u001f"}, d2 = {"Lcom/marrow/data/db/tables/lesson/SchemaExamMapTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/common/SchemaExamMap;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "Landroid/content/ContentValues;", "model", "newArray", "", "size", "", "(I)[Lcom/marrow/data/models/common/SchemaExamMap;", "getWhereClause", "getPrimaryKeys", "(Lcom/marrow/data/models/common/SchemaExamMap;)[Ljava/lang/String;", "deleteAll", "", "subtopics", "", "getAllSchemaExamsWithCount", "Lcom/marrow/data/models/mcq/bookmark/FilterItemRecord;", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class onManifestLoadCompleted extends getIntervalUntilNextManifestRefreshMs<SchemaExamMap> {
    public static final read IconCompatParcelizer = new read(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onManifestLoadCompleted(Context context) {
        super(context, "schema_exam");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(SchemaExamMap schemaExamMap) {
        return write2(schemaExamMap);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ SchemaExamMap RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ SchemaExamMap[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(SchemaExamMap schemaExamMap) {
        return RemoteActionCompatParcelizer(schemaExamMap);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onManifestLoadCompleted$read;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("schema_id", "TEXT"), setAction.write("exam", "TEXT"));
    }

    private static SchemaExamMap AudioAttributesCompatParcelizer(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        return new SchemaExamMap(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "schema_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "exam"));
    }

    private static ContentValues RemoteActionCompatParcelizer(SchemaExamMap schemaExamMap) {
        toMagicModuleMetaRepoModel.write(schemaExamMap, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("schema_id", schemaExamMap.getSchemaId());
        contentValues.put("exam", schemaExamMap.getExamName());
        return contentValues;
    }

    private static SchemaExamMap[] AudioAttributesCompatParcelizer() {
        return new SchemaExamMap[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "schema_id =?  AND exam =? ";
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static String[] write2(SchemaExamMap schemaExamMap) {
        toMagicModuleMetaRepoModel.write(schemaExamMap, "");
        return new String[]{"schema_id", "exam"};
    }

    public final void IconCompatParcelizer(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        String str = getIntervalUntilNextManifestRefreshMs.read("schema_id", (String[]) list.toArray(new String[0]));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        RemoteActionCompatParcelizer("DELETE FROM schema_exam WHERE ".concat(String.valueOf(str)));
    }

    public final List<FilterItemRecord> write() {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s", Arrays.copyOf(new Object[]{"exam"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s, count(distinct(schema_id))", Arrays.copyOf(new Object[]{str}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%s", Arrays.copyOf(new Object[]{"schema_exam"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("%s", Arrays.copyOf(new Object[]{"exam"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("select %s from %s group by %s order by %s", Arrays.copyOf(new Object[]{str2, str3, str, str4}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str5);
        if (cursorRemoteActionCompatParcelizer == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            Cursor cursor2 = cursor;
            while (cursor2.moveToNext()) {
                String string = cursor2.getString(0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                String string2 = cursor2.getString(0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                arrayList.add(new FilterItemRecord(string, string2, cursor2.getInt(1), 0, 8, null));
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return arrayList;
        } finally {
        }
    }
}
