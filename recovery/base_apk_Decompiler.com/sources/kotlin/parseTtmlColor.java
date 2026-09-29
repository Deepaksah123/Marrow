package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class parseTtmlColor {
    public static final parseCssColor write(List<getSpan> list, String str, boolean z) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (getSpan getspan : list) {
            String audioAttributesCompatParcelizer = getspan.getAudioAttributesCompatParcelizer();
            if (getspan.getWrite().getWrite().length() > 0) {
                arrayList.add(audioAttributesCompatParcelizer);
            } else {
                arrayList2.add(audioAttributesCompatParcelizer);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.size() > 0) {
            arrayList3.addAll(arrayList);
        }
        if (arrayList2.size() > 0) {
            arrayList3.addAll(arrayList2);
        }
        if (z) {
            size--;
        }
        if (size >= list.size()) {
            size = list.size() - 1;
        }
        return new parseCssColor(str, arrayList3, size, z);
    }
}
