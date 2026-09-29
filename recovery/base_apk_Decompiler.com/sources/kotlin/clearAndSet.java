package kotlin;

import com.marrow.data.models.common.FeaturedCard;
import java.util.List;
import kotlin.HttpDataSourceRequestProperties;

/* JADX INFO: loaded from: classes3.dex */
public final class clearAndSet {
    public static final HttpDataSourceInvalidResponseCodeException read(FeaturedCard featuredCard) {
        HttpDataSourceRequestProperties httpDataSourceRequestPropertiesAudioAttributesCompatParcelizer;
        List listRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(featuredCard, "");
        String str = featuredCard._id;
        String str2 = str == null ? "" : str;
        String str3 = featuredCard.contentType;
        String str4 = str3 == null ? "" : str3;
        String str5 = featuredCard.contentId;
        String str6 = str5 == null ? "" : str5;
        String str7 = featuredCard.subContentId;
        String str8 = str7 == null ? "" : str7;
        String str9 = featuredCard.subContentType;
        String str10 = str9 == null ? "" : str9;
        String str11 = featuredCard.contentTitle;
        String str12 = str11 == null ? "" : str11;
        String str13 = featuredCard.subTitle;
        String str14 = str13 == null ? "" : str13;
        String str15 = featuredCard.publishedStatus;
        String str16 = str15 == null ? "" : str15;
        String str17 = featuredCard.thumbnail;
        String str18 = str17 == null ? "" : str17;
        String str19 = featuredCard.courseId;
        String str20 = str19 == null ? "" : str19;
        FeaturedCard.Label label = featuredCard.label;
        if (label != null) {
            httpDataSourceRequestPropertiesAudioAttributesCompatParcelizer = getSnapshot.IconCompatParcelizer(label);
        } else {
            HttpDataSourceRequestProperties.Companion companion = HttpDataSourceRequestProperties.INSTANCE;
            httpDataSourceRequestPropertiesAudioAttributesCompatParcelizer = HttpDataSourceRequestProperties.Companion.AudioAttributesCompatParcelizer();
        }
        HttpDataSourceRequestProperties httpDataSourceRequestProperties = httpDataSourceRequestPropertiesAudioAttributesCompatParcelizer;
        String[] strArr = featuredCard.contentStepIds;
        if (strArr == null || (listRemoteActionCompatParcelizer = getOrderDetails.onCommand(strArr)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return new HttpDataSourceInvalidResponseCodeException(str2, str4, str6, str8, str10, str12, str14, str16, str18, str20, httpDataSourceRequestProperties, listRemoteActionCompatParcelizer, featuredCard.sortOrder);
    }
}
