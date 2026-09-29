package kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\bJ,\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/_defaultOrOverride;", "Lo/withFieldVisibility;", "", "Lo/withFieldVisibility$read;", "", "p0", "<init>", "(Ljava/util/Map;)V", "(Lo/withFieldVisibility;)V", "T", "p1", "", "AudioAttributesCompatParcelizer", "(Lo/withFieldVisibility$read;Ljava/lang/Object;)V", "read", "(Lo/withFieldVisibility$read;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _defaultOrOverride extends withFieldVisibility {
    private _defaultOrOverride(Map<withFieldVisibility.read<?>, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        AudioAttributesCompatParcelizer().putAll(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public _defaultOrOverride(withFieldVisibility withfieldvisibility) {
        this((Map<withFieldVisibility.read<?>, ? extends Object>) withfieldvisibility.AudioAttributesCompatParcelizer());
        toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
    }

    public /* synthetic */ _defaultOrOverride(withFieldVisibility.write writeVar, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? withFieldVisibility.write.INSTANCE : writeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void AudioAttributesCompatParcelizer(withFieldVisibility.read<T> p0, T p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer().put(p0, p1);
    }

    @Override // kotlin.withFieldVisibility
    public final <T> T read(withFieldVisibility.read<T> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (T) AudioAttributesCompatParcelizer().get(p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public _defaultOrOverride() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
