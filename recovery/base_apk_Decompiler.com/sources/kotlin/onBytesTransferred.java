package kotlin;

import com.marrow2.data.course_config.remote.model.ShareCopyRSModel;

/* JADX INFO: loaded from: classes3.dex */
public final class onBytesTransferred {
    public static final onTransferStart IconCompatParcelizer(ShareCopyRSModel shareCopyRSModel) {
        toMagicModuleMetaRepoModel.write(shareCopyRSModel, "");
        String title = shareCopyRSModel.getTitle();
        String shortDescription = shareCopyRSModel.getShortDescription();
        return new onTransferStart(title, shareCopyRSModel.getDescription(), shareCopyRSModel.getLongDescription(), shortDescription, shareCopyRSModel.getSubject());
    }
}
