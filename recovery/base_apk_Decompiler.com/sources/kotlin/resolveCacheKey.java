package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.actions.SearchIntents;
import com.marrow.data.models.tag.Tag;
import in.juspay.hyper.constants.LogCategory;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\bJ$\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\rj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\nH\u0016J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/marrow/data/db/tables/tags/TagTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/tag/Tag;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", SearchIntents.EXTRA_QUERY, "", "conditionColumn", "", "inValues", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "Landroid/content/ContentValues;", "tag", "newArray", "", "size", "", "(I)[Lcom/marrow/data/models/tag/Tag;", "getWhereClause", "getPrimaryKeys", "model", "(Lcom/marrow/data/models/tag/Tag;)[Ljava/lang/String;", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class resolveCacheKey extends getIntervalUntilNextManifestRefreshMs<Tag> {
    public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resolveCacheKey(Context context) {
        super(context, "_tag");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Tag tag) {
        return read(tag);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Tag RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Tag[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Tag tag) {
        return IconCompatParcelizer2(tag);
    }

    public final List<Tag> AudioAttributesCompatParcelizer(String str, List<String> list) {
        List<Tag> listOnCommand;
        toMagicModuleMetaRepoModel.write(list, "");
        Tag[] tagArr = (Tag[]) super.MediaBrowserCompatCustomActionResultReceiver(str, (String[]) list.toArray(new String[0]));
        return (tagArr == null || (listOnCommand = getOrderDetails.onCommand(tagArr)) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listOnCommand;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("_group", "TEXT"), setAction.write("_title", "TEXT"), setAction.write("_order", "INTEGER"));
    }

    private static Tag write(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        Tag tag = new Tag();
        tag.sortOrder = copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "_order");
        tag.id = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_id");
        tag.group = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_group");
        tag.title = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_title");
        return tag;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static ContentValues IconCompatParcelizer2(Tag tag) {
        toMagicModuleMetaRepoModel.write(tag, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("_order", Integer.valueOf(tag.sortOrder)), setAction.write("_id", tag.id), setAction.write("_group", tag.group), setAction.write("_title", tag.title));
    }

    private static Tag[] AudioAttributesCompatParcelizer() {
        return new Tag[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] read(Tag tag) {
        toMagicModuleMetaRepoModel.write(tag, "");
        String str = tag.id;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return new String[]{str};
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/resolveCacheKey$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
