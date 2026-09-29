package kotlin;

import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.common.FeaturedCard;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdacxeJ6djgVH5CZKEdmoij_s2DJ8 {
    public static final boolean AudioAttributesCompatParcelizer(FeaturedCard featuredCard) {
        toMagicModuleMetaRepoModel.write(featuredCard, "");
        return featuredCard.contentType != null && IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "qbank", "video"}).contains(featuredCard.contentType);
    }

    public static final boolean read(FeaturedCard featuredCard) {
        toMagicModuleMetaRepoModel.write(featuredCard, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "test", (Object) featuredCard.contentType);
    }

    public static final boolean write(FeaturedCard featuredCard) {
        toMagicModuleMetaRepoModel.write(featuredCard, "");
        return featuredCard.contentType != null && IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"pearl", "pearl_image"}).contains(featuredCard.contentType);
    }
}
