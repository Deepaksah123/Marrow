package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import in.juspay.hyper.constants.LogCategory;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/marrow/data/db/tables/lesson/StubTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/db/tables/lesson/StubBody;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "Landroid/content/ContentValues;", "stub", "newArray", "", "size", "", "(I)[Lcom/marrow/data/db/tables/lesson/StubBody;", "getWhereClause", "getPrimaryKeys", "model", "(Lcom/marrow/data/db/tables/lesson/StubBody;)[Ljava/lang/String;", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DashMediaSourceExternalSyntheticLambda1 extends getIntervalUntilNextManifestRefreshMs<onUtcTimestampLoadError> {
    public static final write RemoteActionCompatParcelizer = new write(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashMediaSourceExternalSyntheticLambda1(Context context) {
        super(context, "_stub");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(onUtcTimestampLoadError onutctimestamploaderror) {
        return write2(onutctimestamploaderror);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ onUtcTimestampLoadError RemoteActionCompatParcelizer(Cursor cursor) {
        return read(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ onUtcTimestampLoadError[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(onUtcTimestampLoadError onutctimestamploaderror) {
        return read(onutctimestamploaderror);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("lesson_id", "TEXT"), setAction.write("_sno", "INTEGER"), setAction.write("_title", "TEXT"), setAction.write("_deeplink", "TEXT"));
    }

    private static onUtcTimestampLoadError read(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        return new onUtcTimestampLoadError(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_deeplink"), copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "_sno"), copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_title"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "lesson_id"));
    }

    private static ContentValues read(onUtcTimestampLoadError onutctimestamploaderror) {
        toMagicModuleMetaRepoModel.write(onutctimestamploaderror, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("lesson_id", onutctimestamploaderror.read()), setAction.write("_title", onutctimestamploaderror.AudioAttributesCompatParcelizer()), setAction.write("_sno", Integer.valueOf(onutctimestamploaderror.RemoteActionCompatParcelizer())), setAction.write("_deeplink", onutctimestamploaderror.IconCompatParcelizer()));
    }

    private static onUtcTimestampLoadError[] AudioAttributesCompatParcelizer() {
        return new onUtcTimestampLoadError[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "lesson_id =?  AND _sno =? ";
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DashMediaSourceExternalSyntheticLambda1$write;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static String[] write2(onUtcTimestampLoadError onutctimestamploaderror) {
        toMagicModuleMetaRepoModel.write(onutctimestamploaderror, "");
        return new String[]{onutctimestamploaderror.read(), String.valueOf(onutctimestamploaderror.RemoteActionCompatParcelizer())};
    }
}
