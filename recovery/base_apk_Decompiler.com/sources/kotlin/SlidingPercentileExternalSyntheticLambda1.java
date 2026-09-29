package kotlin;

import com.marrow.data.models.common.ImageUpload;

/* JADX INFO: loaded from: classes3.dex */
public final class SlidingPercentileExternalSyntheticLambda1 {
    public static final ImageUpload write(addSample addsample) {
        toMagicModuleMetaRepoModel.write(addsample, "");
        return new ImageUpload(addsample.AudioAttributesImplApi26Parcelizer(), addsample.MediaBrowserCompatItemReceiver(), addsample.read(), addsample.RemoteActionCompatParcelizer(), addsample.IconCompatParcelizer(), addsample.AudioAttributesCompatParcelizer(), addsample.write());
    }

    public static final addSample IconCompatParcelizer(ImageUpload imageUpload) {
        toMagicModuleMetaRepoModel.write(imageUpload, "");
        return new addSample(imageUpload.isUploaded(), imageUpload.getType(), imageUpload.getId(), imageUpload.getFilename(), imageUpload.getDocSideType(), imageUpload.getDocGroupId(), imageUpload.getDocType());
    }
}
