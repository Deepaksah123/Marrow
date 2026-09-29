package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import in.juspay.hyper.constants.LogCategory;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\tH\u0016J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¨\u0006\u001b"}, d2 = {"Lcom/marrow/data/db/tables/video/VideoConfigTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/dataprovider/video/playbackconfig/local/models/VideoConfigDbModel;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "newArray", "", "size", "", "(I)[Lcom/marrow/data/dataprovider/video/playbackconfig/local/models/VideoConfigDbModel;", "getWhereClause", "getPrimaryKeys", "model", "(Lcom/marrow/data/dataprovider/video/playbackconfig/local/models/VideoConfigDbModel;)[Ljava/lang/String;", "getConfig", "videoId", "Landroid/content/ContentValues;", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultDashChunkSourceFactory extends getIntervalUntilNextManifestRefreshMs<DashChunkSource> {
    public static final write AudioAttributesCompatParcelizer = new write(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDashChunkSourceFactory(Context context) {
        super(context, "_vi_conf");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ String[] IconCompatParcelizer(DashChunkSource dashChunkSource) {
        return IconCompatParcelizer2(dashChunkSource);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ DashChunkSource RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ DashChunkSource[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(DashChunkSource dashChunkSource) {
        return RemoteActionCompatParcelizer(dashChunkSource);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put("_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMap2.put("_conf", "TEXT");
        return linkedHashMap;
    }

    private static DashChunkSource write(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        return new DashChunkSource(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "_id"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursor, "_conf"));
    }

    private static DashChunkSource[] AudioAttributesCompatParcelizer() {
        return new DashChunkSource[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static String[] IconCompatParcelizer2(DashChunkSource dashChunkSource) {
        toMagicModuleMetaRepoModel.write(dashChunkSource, "");
        return new String[]{dashChunkSource.AudioAttributesCompatParcelizer()};
    }

    public final DashChunkSource AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return AudioAttributesCompatParcelizer(MediaBrowserCompatSearchResultReceiver(), new String[]{str}, (String) null);
    }

    private static ContentValues RemoteActionCompatParcelizer(DashChunkSource dashChunkSource) {
        toMagicModuleMetaRepoModel.write(dashChunkSource, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("_conf", dashChunkSource.RemoteActionCompatParcelizer()), setAction.write("_id", dashChunkSource.AudioAttributesCompatParcelizer()));
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/DefaultDashChunkSourceFactory$write;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
