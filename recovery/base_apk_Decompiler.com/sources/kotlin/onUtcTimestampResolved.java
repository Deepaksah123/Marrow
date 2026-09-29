package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.common.ImageUpload;
import in.juspay.hyper.constants.LogCategory;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nH\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\tJ\u0016\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013J\u001b\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014¨\u0006#"}, d2 = {"Lcom/marrow/data/db/tables/common/ImageUploadTable;", "Lcom/marrow/data/db/tables/BaseTable;", "Lcom/marrow/data/models/common/ImageUpload;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getDefinedColumns", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "convert", "cursor", "Landroid/database/Cursor;", "Landroid/content/ContentValues;", "model", "newArray", "", "size", "", "(I)[Lcom/marrow/data/models/common/ImageUpload;", "getWhereClause", "getPrimaryKeys", "(Lcom/marrow/data/models/common/ImageUpload;)[Ljava/lang/String;", "updateEntry", "", "upload", "getBase64Image", "filename", "deleteImage", "imageSide", "subType", "getAllImageUploads", "type", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class onUtcTimestampResolved extends getIntervalUntilNextManifestRefreshMs<ImageUpload> {
    public static final write AudioAttributesCompatParcelizer = new write(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onUtcTimestampResolved(Context context) {
        super(context, "image");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(ImageUpload imageUpload) {
        return AudioAttributesCompatParcelizer(imageUpload);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ImageUpload RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ImageUpload[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(ImageUpload imageUpload) {
        return RemoteActionCompatParcelizer(imageUpload);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put("_id", "INTEGER PRIMARY KEY NOT NULL");
        linkedHashMap2.put("f_name", "TEXT");
        linkedHashMap2.put("_status", "INTEGER");
        linkedHashMap2.put("_type", "INTEGER");
        linkedHashMap2.put("_subtype", "INTEGER");
        linkedHashMap2.put("group_id", "TEXT");
        linkedHashMap2.put("doc_type", "INTEGER");
        return linkedHashMap;
    }

    private static ImageUpload write(Cursor cursor) {
        toMagicModuleMetaRepoModel.write(cursor, "");
        boolean zRemoteActionCompatParcelizer = copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "_status");
        int iAudioAttributesCompatParcelizer = copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "_type");
        long jAudioAttributesImplApi21Parcelizer = copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "_id");
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "f_name");
        String str = strMediaBrowserCompatItemReceiver == null ? "" : strMediaBrowserCompatItemReceiver;
        int iAudioAttributesCompatParcelizer2 = copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "_subtype");
        String strMediaBrowserCompatItemReceiver2 = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "group_id");
        return new ImageUpload(zRemoteActionCompatParcelizer, iAudioAttributesCompatParcelizer, jAudioAttributesImplApi21Parcelizer, str, iAudioAttributesCompatParcelizer2, strMediaBrowserCompatItemReceiver2 == null ? "" : strMediaBrowserCompatItemReceiver2, copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "doc_type"));
    }

    private static ContentValues RemoteActionCompatParcelizer(ImageUpload imageUpload) {
        toMagicModuleMetaRepoModel.write(imageUpload, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Long.valueOf(imageUpload.getId()));
        contentValues.put("_type", Integer.valueOf(imageUpload.getType()));
        contentValues.put("_subtype", Integer.valueOf(imageUpload.getDocSideType()));
        contentValues.put("f_name", imageUpload.getFilename());
        contentValues.put("group_id", imageUpload.getDocGroupId());
        contentValues.put("doc_type", Integer.valueOf(imageUpload.getDocType()));
        contentValues.put("_status", Integer.valueOf(imageUpload.isUploaded() ? 1 : 0));
        return contentValues;
    }

    private static ImageUpload[] AudioAttributesCompatParcelizer() {
        return new ImageUpload[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(ImageUpload imageUpload) {
        toMagicModuleMetaRepoModel.write(imageUpload, "");
        return new String[]{String.valueOf(imageUpload.getId())};
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public final void write2(ImageUpload imageUpload) {
        toMagicModuleMetaRepoModel.write(imageUpload, "");
        read(imageUpload, "_type =?  AND _subtype =? ", new String[]{String.valueOf(imageUpload.getType()), String.valueOf(imageUpload.getDocSideType())});
    }

    public final String MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, "");
        return lambdanew0comgoogleandroidexoplayer2uiDefaultTimeBar.AudioAttributesCompatParcelizer(contextMediaBrowserCompatCustomActionResultReceiver, str);
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        AudioAttributesCompatParcelizer("_type =?  AND _subtype =? ", new String[]{String.valueOf(i), String.valueOf(i2)});
    }

    public final ImageUpload[] IconCompatParcelizer(int i) {
        return IconCompatParcelizer("_type", String.valueOf(i));
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/onUtcTimestampResolved$write;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
