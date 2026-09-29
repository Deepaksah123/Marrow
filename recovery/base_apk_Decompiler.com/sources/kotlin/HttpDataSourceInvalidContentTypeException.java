package kotlin;

import com.marrow.data.models.common.FeaturedCard;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpDataSourceInvalidContentTypeException implements assignErrorCode {
    private final isIndexExplicit RemoteActionCompatParcelizer;

    @setSdkPayload
    public HttpDataSourceInvalidContentTypeException(isIndexExplicit isindexexplicit) {
        toMagicModuleMetaRepoModel.write(isindexexplicit, "");
        this.RemoteActionCompatParcelizer = isindexexplicit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.assignErrorCode
    public final Object IconCompatParcelizer() {
        FeaturedCard[] featuredCardArr = (FeaturedCard[]) this.RemoteActionCompatParcelizer.a_("SELECT * FROM featured_card ORDER BY sort_order ASC");
        if (featuredCardArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(featuredCardArr.length);
        for (FeaturedCard featuredCard : featuredCardArr) {
            toMagicModuleMetaRepoModel.write(featuredCard);
            arrayList.add(clearAndSet.read(featuredCard));
        }
        return arrayList;
    }
}
