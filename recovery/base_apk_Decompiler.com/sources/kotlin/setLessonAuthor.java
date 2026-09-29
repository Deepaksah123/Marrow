package kotlin;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setLessonAuthor;", "", "<init>", "()V", "T", "Landroid/content/Context;", "p0", "Ljava/lang/Class;", "p1", "write", "(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setLessonAuthor {
    public static final setLessonAuthor INSTANCE = new setLessonAuthor();

    private setLessonAuthor() {
    }

    @getMagicModuleMeta
    public static final <T> T write(Context p0, Class<T> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return (T) FreeVideoListResponseLesson.RemoteActionCompatParcelizer(FreeVideoPromotionResponse.RemoteActionCompatParcelizer(p0.getApplicationContext()), p1);
    }
}
