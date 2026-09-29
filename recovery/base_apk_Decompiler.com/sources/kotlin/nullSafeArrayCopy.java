package kotlin;

import com.marrow.data.models.content.ImageInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class nullSafeArrayCopy {
    public static final nullSafeArrayConcatenation write(ImageInfo imageInfo) {
        toMagicModuleMetaRepoModel.write(imageInfo, "");
        String encryptKey = imageInfo.getEncryptKey();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(encryptKey, "");
        String fileName = imageInfo.getFileName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fileName, "");
        String imageUrl = imageInfo.getImageUrl();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageUrl, "");
        return new nullSafeArrayConcatenation(imageUrl, encryptKey, fileName, imageInfo.getTimeStamp(), imageInfo.getHeight() / imageInfo.getWidth());
    }
}
