package kotlin;

import com.marrow.data.models.common.ApplicationData;

/* JADX INFO: loaded from: classes5.dex */
public final class setObjectDurationMs {
    public static final String AudioAttributesCompatParcelizer(ApplicationData applicationData) {
        toMagicModuleMetaRepoModel.write(applicationData, "");
        String userId = applicationData.requireLoggedUser().getUser().getUserId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(userId, "");
        return userId;
    }
}
