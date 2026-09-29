package kotlin;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class McqContentBodyCompanion {
    public static final getTestHeaderTitle RemoteActionCompatParcelizer(Collection<? extends getTestHeaderTitle> collection) {
        Integer numIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(collection, "");
        collection.isEmpty();
        getTestHeaderTitle gettestheadertitle = null;
        for (getTestHeaderTitle gettestheadertitle2 : collection) {
            if (gettestheadertitle == null || ((numIconCompatParcelizer = CourseConfigV2NavDrawerItemFaq.IconCompatParcelizer(gettestheadertitle.onCustomAction(), gettestheadertitle2.onCustomAction())) != null && numIconCompatParcelizer.intValue() < 0)) {
                gettestheadertitle = gettestheadertitle2;
            }
        }
        toMagicModuleMetaRepoModel.write(gettestheadertitle);
        return gettestheadertitle;
    }
}
