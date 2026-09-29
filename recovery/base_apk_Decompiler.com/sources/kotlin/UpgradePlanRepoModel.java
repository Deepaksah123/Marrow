package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class UpgradePlanRepoModel {
    private final Map<String, getMcqFaq<?>> AudioAttributesCompatParcelizer;
    private final Map<Integer, Object<?>> RemoteActionCompatParcelizer;
    private final resetBookmarks write;

    public UpgradePlanRepoModel(resetBookmarks resetbookmarks) {
        toMagicModuleMetaRepoModel.write(resetbookmarks, "");
        this.write = resetbookmarks;
        SchemaDetailLessonV2 schemaDetailLessonV2 = SchemaDetailLessonV2.read;
        this.AudioAttributesCompatParcelizer = SchemaDetailLessonV2.write();
        SchemaDetailLessonV2 schemaDetailLessonV22 = SchemaDetailLessonV2.read;
        this.RemoteActionCompatParcelizer = SchemaDetailLessonV2.write();
    }

    public final void RemoteActionCompatParcelizer(RecentUpdatesFilterResponse recentUpdatesFilterResponse) {
        toMagicModuleMetaRepoModel.write(recentUpdatesFilterResponse, "");
        getMcqFaq[] getmcqfaqArr = (getMcqFaq[]) this.AudioAttributesCompatParcelizer.values().toArray(new getMcqFaq[0]);
        ArrayList arrayList = new ArrayList();
        for (getMcqFaq getmcqfaq : getmcqfaqArr) {
            if (getmcqfaq instanceof getPearlRelatedMcq) {
                arrayList.add(getmcqfaq);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((getPearlRelatedMcq) it.next()).write(recentUpdatesFilterResponse);
        }
    }
}
