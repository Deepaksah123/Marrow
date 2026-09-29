package kotlin;

import com.marrow.data.models.common.FeaturedCard;

/* JADX INFO: loaded from: classes3.dex */
public final class getSnapshot {
    public static final HttpDataSourceRequestProperties IconCompatParcelizer(FeaturedCard.Label label) {
        toMagicModuleMetaRepoModel.write(label, "");
        String str = label.text;
        if (str == null) {
            str = "";
        }
        String str2 = label.color;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = label.bgColor;
        return new HttpDataSourceRequestProperties(str, str2, str3 != null ? str3 : "");
    }
}
