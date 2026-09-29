package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.common.SchemaSubjectMap;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u0019¨\u0006 "}, d2 = {"Lcom/marrow/data/db/tables/lesson/SchemaSubjectMapTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/common/SchemaSubjectMap;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "Landroid/content/ContentValues;", "model", "newArray", "", "size", "", "(I)[Lcom/marrow/data/models/common/SchemaSubjectMap;", "getWhereClause", "getPrimaryKeys", "(Lcom/marrow/data/models/common/SchemaSubjectMap;)[Ljava/lang/String;", "getAllSchemaSubjectsWithCount", "", "Lcom/marrow/data/models/mcq/bookmark/FilterItemRecord;", "examName", "deleteAll", "", "subtopics", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class onManifestLoadError extends getIntervalUntilNextManifestRefreshMs<SchemaSubjectMap> {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onManifestLoadError(Context context) {
        super(context, "schema_subj");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ String[] IconCompatParcelizer(SchemaSubjectMap schemaSubjectMap) {
        return IconCompatParcelizer2(schemaSubjectMap);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ SchemaSubjectMap RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ SchemaSubjectMap[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(SchemaSubjectMap schemaSubjectMap) {
        return read(schemaSubjectMap);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onManifestLoadError$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("schema_id", "TEXT"), setAction.write("rs_id", "TEXT"));
    }

    private static SchemaSubjectMap AudioAttributesCompatParcelizer(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        return new SchemaSubjectMap(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "schema_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "rs_id"));
    }

    private static ContentValues read(SchemaSubjectMap schemaSubjectMap) {
        toMagicModuleMetaRepoModel.write(schemaSubjectMap, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("schema_id", schemaSubjectMap.getSchemaId());
        contentValues.put("rs_id", schemaSubjectMap.getRootSubjectId());
        return contentValues;
    }

    private static SchemaSubjectMap[] AudioAttributesCompatParcelizer() {
        return new SchemaSubjectMap[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "schema_id =?  AND rs_id =? ";
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static String[] IconCompatParcelizer2(SchemaSubjectMap schemaSubjectMap) {
        toMagicModuleMetaRepoModel.write(schemaSubjectMap, "");
        return new String[]{"schema_id", "rs_id"};
    }

    public final List<FilterItemRecord> AudioAttributesImplApi21Parcelizer(String str) {
        String str2;
        String str3;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("%s.%s, %s", Arrays.copyOf(new Object[]{"_subject", "_id", "title"}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("%s, count(*)", Arrays.copyOf(new Object[]{str4}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        String str6 = str;
        if (str6 == null || str6.length() == 0) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
            str2 = String.format("%s, %s", Arrays.copyOf(new Object[]{"_subject", "schema_subj"}, 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        } else {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
            str2 = String.format("%s, %s, %s", Arrays.copyOf(new Object[]{"_subject", "schema_subj", "schema_exam"}, 3));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        }
        if (str6 == null || str6.length() == 0) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
            str3 = String.format("%s.%s = %s.%s", Arrays.copyOf(new Object[]{"_subject", "_id", "schema_subj", "rs_id"}, 4));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        } else {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
            str3 = String.format("%s.%s = %s.%s AND %s.%s = %s.%s", Arrays.copyOf(new Object[]{"_subject", "_id", "schema_subj", "rs_id", "schema_subj", "schema_id", "schema_exam", "schema_id"}, 8));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        }
        if (str6 != null && str6.length() != 0) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel7 = toMagicModuleStatusUcModel.INSTANCE;
            str3 = String.format("%s AND %s.%s = '%s'", Arrays.copyOf(new Object[]{str3, "schema_exam", "exam", str}, 4));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel8 = toMagicModuleStatusUcModel.INSTANCE;
        String str7 = String.format("%s.%s", Arrays.copyOf(new Object[]{"_subject", "sort_order"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel9 = toMagicModuleStatusUcModel.INSTANCE;
        String str8 = String.format("select %s from %s where %s group by %s order by %s", Arrays.copyOf(new Object[]{str5, str2, str3, str4, str7}, 5));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str8, "");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str8);
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
                String string2 = cursor2.getString(1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                arrayList.add(new FilterItemRecord(string, string2, cursor2.getInt(2), 0, 8, null));
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return arrayList;
        } finally {
        }
    }

    public final void AudioAttributesCompatParcelizer(List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        String str = getIntervalUntilNextManifestRefreshMs.read("schema_id", (String[]) list.toArray(new String[0]));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        RemoteActionCompatParcelizer("DELETE FROM schema_subj WHERE ".concat(String.valueOf(str)));
    }
}
