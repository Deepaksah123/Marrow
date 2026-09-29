package kotlin;

import java.util.List;
import kotlin.HomeLessonIndexV2;

/* JADX INFO: loaded from: classes4.dex */
public final class setTagLabel {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends HomeLessonIndexV2.read<M>, T> T read(HomeLessonIndexV2.read<M> readVar, HomeLessonIndexV2.IconCompatParcelizer<M, T> iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        if (readVar.write(iconCompatParcelizer)) {
            return (T) readVar.IconCompatParcelizer(iconCompatParcelizer);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends HomeLessonIndexV2.read<M>, T> T AudioAttributesCompatParcelizer(HomeLessonIndexV2.read<M> readVar, HomeLessonIndexV2.IconCompatParcelizer<M, List<T>> iconCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        if (i < readVar.AudioAttributesCompatParcelizer(iconCompatParcelizer)) {
            return (T) readVar.write(iconCompatParcelizer, i);
        }
        return null;
    }
}
