package kotlin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marrow2.data.pref.repo.model.UpgradePlanMiniRepoModel;
import com.marrow2.data.pref.repo.model.UpgradePlanRepoModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class upgradeFile {
    public static final UpgradePlanMiniRepoModel IconCompatParcelizer(String str) {
        String str2;
        String str3;
        String title;
        str2 = "";
        toMagicModuleMetaRepoModel.write(str, "");
        if (str.length() > 0) {
            UpgradePlanRepoModel upgradePlanRepoModel = (UpgradePlanRepoModel) new setDownloadingStatesToQueued().IconCompatParcelizer(str, UpgradePlanRepoModel.class);
            String id = upgradePlanRepoModel.getId();
            title = upgradePlanRepoModel.getCardContent().getTitle();
            if (title == null) {
                title = "";
            }
            String description = upgradePlanRepoModel.getCardContent().getDescription();
            str3 = description != null ? description : "";
            str2 = id;
        } else {
            str3 = "";
            title = str3;
        }
        return new UpgradePlanMiniRepoModel(str2, title, str3);
    }

    public static final <T> T RemoteActionCompatParcelizer(String str, Class<T> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        if (str == null) {
            return null;
        }
        try {
            return (T) new ObjectMapper().readValue(str, cls);
        } catch (IOException unused) {
            return null;
        }
    }
}
