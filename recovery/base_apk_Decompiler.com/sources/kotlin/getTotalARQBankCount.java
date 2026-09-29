package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.toHomeLessonIndex;

/* JADX INFO: loaded from: classes4.dex */
public final class getTotalARQBankCount {
    public static final List<toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer> read(List<toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (toHomeLessonIndex.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : list) {
            int iWrite = audioAttributesCompatParcelizer.write();
            for (int i = 0; i < iWrite; i++) {
                arrayList.add(audioAttributesCompatParcelizer);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
