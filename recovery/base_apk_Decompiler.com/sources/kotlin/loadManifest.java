package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.test.TestGroupLSModel;
import in.juspay.hyper.constants.LogCategory;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\tH\u0016J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0016J\u0010\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0002H\u0014J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\t¨\u0006!"}, d2 = {"Lcom/marrow/data/db/tables/test/TestGroupTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/test/TestGroupLSModel;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "newArray", "", "size", "", "(I)[Lcom/marrow/data/models/test/TestGroupLSModel;", "getWhereClause", "getPrimaryKeys", "model", "(Lcom/marrow/data/models/test/TestGroupLSModel;)[Ljava/lang/String;", "Landroid/content/ContentValues;", "updateSectionSkippedTimestamp", "", "groupId", "skippedTimestampMs", "", "getGroups", "", "parentId", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class loadManifest extends getIntervalUntilNextManifestRefreshMs<TestGroupLSModel> {
    public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public loadManifest(Context context) {
        super(context, "_test_group");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(TestGroupLSModel testGroupLSModel) {
        return read(testGroupLSModel);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ TestGroupLSModel RemoteActionCompatParcelizer(Cursor cursor) {
        return read(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ TestGroupLSModel[] RemoteActionCompatParcelizer(int i) {
        return write();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ ContentValues write(TestGroupLSModel testGroupLSModel) {
        return write2(testGroupLSModel);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/loadManifest$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT NOT NULL"), setAction.write("parent_id", "TEXT NOT NULL"), setAction.write("name", "TEXT NOT NULL"), setAction.write("question_count", "INTEGER NOT NULL"), setAction.write("section_time", "INTEGER NOT NULL"), setAction.write("type", "INTEGER NOT NULL"), setAction.write("cut_off_time", "INTEGER NOT NULL"), setAction.write("section_skipped_timestamp", "INTEGER"));
    }

    private static TestGroupLSModel read(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        return new TestGroupLSModel(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "parent_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "name"), copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "type"), copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "question_count"), copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "section_time"), copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "cut_off_time"), Long.valueOf(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "section_skipped_timestamp")));
    }

    private static TestGroupLSModel[] write() {
        return new TestGroupLSModel[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "parent_id =?  AND _id =? ";
    }

    private static String[] read(TestGroupLSModel testGroupLSModel) {
        toMagicModuleMetaRepoModel.write(testGroupLSModel, "");
        return new String[]{testGroupLSModel.getParentId(), testGroupLSModel.getId()};
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static ContentValues write2(TestGroupLSModel testGroupLSModel) {
        toMagicModuleMetaRepoModel.write(testGroupLSModel, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("_id", testGroupLSModel.getId()), setAction.write("parent_id", testGroupLSModel.getParentId()), setAction.write("name", testGroupLSModel.getName()), setAction.write("question_count", Integer.valueOf(testGroupLSModel.getQuestionCount())), setAction.write("section_time", Integer.valueOf(testGroupLSModel.getSectionTimeInSec())), setAction.write("type", Integer.valueOf(testGroupLSModel.getType())), setAction.write("cut_off_time", Integer.valueOf(testGroupLSModel.getCutOffTimeInSec())), setAction.write("section_skipped_timestamp", testGroupLSModel.getSkippedTimestampMs()));
    }

    public final void read(String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        write(copyAdaptationSets.IconCompatParcelizer(setAction.write("section_skipped_timestamp", Long.valueOf(j))), "_id =? ", new String[]{str});
    }

    public final List<TestGroupLSModel> MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        TestGroupLSModel[] testGroupLSModelArrIconCompatParcelizer = IconCompatParcelizer("parent_id", str);
        if (testGroupLSModelArrIconCompatParcelizer == null) {
            testGroupLSModelArrIconCompatParcelizer = new TestGroupLSModel[0];
        }
        return getOrderDetails.onCommand(testGroupLSModelArrIconCompatParcelizer);
    }
}
