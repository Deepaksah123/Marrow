package kotlin;

import com.marrow.data.models.lesson.AssociatedLessonIndex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getKeys {
    private static getCacheSpace AudioAttributesCompatParcelizer(AssociatedLessonIndex associatedLessonIndex) {
        toMagicModuleMetaRepoModel.write(associatedLessonIndex, "");
        return new getCacheSpace(associatedLessonIndex.getLessonId(), associatedLessonIndex.isInternMode(), associatedLessonIndex.isRelatedModule());
    }

    public static final List<getCacheSpace> IconCompatParcelizer(List<AssociatedLessonIndex> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<AssociatedLessonIndex> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(AudioAttributesCompatParcelizer((AssociatedLessonIndex) it.next()));
        }
        return arrayList;
    }
}
