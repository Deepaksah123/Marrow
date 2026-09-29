package kotlin;

import java.lang.ref.SoftReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0014¢\u0006\u0004\b\t\u0010\nR!\u0010\t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/timestampInvalid;", "V", "Ljava/lang/ClassValue;", "Ljava/lang/ref/SoftReference;", "Lkotlin/Function1;", "Ljava/lang/Class;", "p0", "<init>", "(Lo/getAnswerMap;)V", "IconCompatParcelizer", "(Ljava/lang/Class;)Ljava/lang/ref/SoftReference;", "AudioAttributesCompatParcelizer", "Lo/getAnswerMap;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class timestampInvalid<V> extends ClassValue<SoftReference<V>> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public final getAnswerMap<Class<?>, V> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public timestampInvalid(getAnswerMap<? super Class<?>, ? extends V> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.IconCompatParcelizer = getanswermap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ClassValue
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public SoftReference<V> computeValue(Class<?> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new SoftReference<>(this.IconCompatParcelizer.invoke(p0));
    }
}
