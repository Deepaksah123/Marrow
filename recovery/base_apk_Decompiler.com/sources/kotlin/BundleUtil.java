package kotlin;

import com.marrow.data.models.common.SchemaUserStatus;
import com.marrow.data.models.mcq.schema.SchemaItem;
import com.marrow2.data.schema.remote.model.SchemaUserStatusRSModel;

/* JADX INFO: loaded from: classes3.dex */
public final class BundleUtil {
    public static final SchemaUserStatus IconCompatParcelizer(loadBitmapFromMetadata loadbitmapfrommetadata) {
        toMagicModuleMetaRepoModel.write(loadbitmapfrommetadata, "");
        return new SchemaUserStatus(loadbitmapfrommetadata.getWrite(), loadbitmapfrommetadata.getRead(), loadbitmapfrommetadata.getIconCompatParcelizer(), loadbitmapfrommetadata.getRemoteActionCompatParcelizer(), loadbitmapfrommetadata.getAudioAttributesCompatParcelizer(), loadbitmapfrommetadata.getAudioAttributesImplApi21Parcelizer(), loadbitmapfrommetadata.getMediaBrowserCompatItemReceiver(), loadbitmapfrommetadata.getAudioAttributesImplApi26Parcelizer(), loadbitmapfrommetadata.getAudioAttributesImplBaseParcelizer());
    }

    public static final loadBitmapFromMetadata RemoteActionCompatParcelizer(SchemaUserStatus schemaUserStatus) {
        toMagicModuleMetaRepoModel.write(schemaUserStatus, "");
        return new loadBitmapFromMetadata(schemaUserStatus.getId(), schemaUserStatus.getAttemptedCount(), schemaUserStatus.getCompletenessScore(), schemaUserStatus.getCorrectnessScore(), schemaUserStatus.getSchemaId(), schemaUserStatus.getMcqCount(), schemaUserStatus.getLastUpdated(), schemaUserStatus.getCorrectCount(), schemaUserStatus.getWrongCount());
    }

    public static final loadBitmapFromMetadata read(SchemaUserStatusRSModel schemaUserStatusRSModel) {
        toMagicModuleMetaRepoModel.write(schemaUserStatusRSModel, "");
        return new loadBitmapFromMetadata(schemaUserStatusRSModel.getId(), schemaUserStatusRSModel.getAttemptedCount(), schemaUserStatusRSModel.getCompletenessScore(), schemaUserStatusRSModel.getCorrectnessScore(), schemaUserStatusRSModel.getSchemaId(), schemaUserStatusRSModel.getMcqCount(), schemaUserStatusRSModel.getLastUpdated(), schemaUserStatusRSModel.getCorrectCount(), schemaUserStatusRSModel.getWrongCount());
    }

    public static final endWrite IconCompatParcelizer(SchemaItem schemaItem) {
        toMagicModuleMetaRepoModel.write(schemaItem, "");
        return new endWrite(schemaItem.getId(), schemaItem.getTitle(), schemaItem.getCompletenessScore(), schemaItem.getAttempted(), schemaItem.getCorrectnessScore(), schemaItem.getMcqCount());
    }
}
