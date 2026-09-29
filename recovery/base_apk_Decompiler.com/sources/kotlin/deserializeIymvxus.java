package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.onMediaButtonEvent;
import java.util.List;
import kotlin.ReflectionCacheBooleanTriStateTrue;
import kotlin.ReflectionCacheCompanion;
import kotlin.SequenceSerializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class deserializeIymvxus<T, VH extends RecyclerView.onMediaButtonEvent> extends RecyclerView.IconCompatParcelizer<VH> {
    final ReflectionCacheBooleanTriStateTrue<T> AudioAttributesCompatParcelizer;
    private final ReflectionCacheBooleanTriStateTrue.RemoteActionCompatParcelizer<T> write;

    public deserializeIymvxus(SequenceSerializer.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        ReflectionCacheBooleanTriStateTrue.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer2 = new ReflectionCacheBooleanTriStateTrue.RemoteActionCompatParcelizer<T>() { // from class: o.deserializeIymvxus.3
        };
        this.write = remoteActionCompatParcelizer2;
        ReflectionCacheBooleanTriStateTrue<T> reflectionCacheBooleanTriStateTrue = new ReflectionCacheBooleanTriStateTrue<>(new ReflectionCacheBooleanTriStateEmpty(this), new ReflectionCacheCompanion.RemoteActionCompatParcelizer(remoteActionCompatParcelizer).AudioAttributesCompatParcelizer());
        this.AudioAttributesCompatParcelizer = reflectionCacheBooleanTriStateTrue;
        reflectionCacheBooleanTriStateTrue.IconCompatParcelizer(remoteActionCompatParcelizer2);
    }

    public final void read(List<T> list) {
        this.AudioAttributesCompatParcelizer.read(list);
    }

    protected final T read(int i) {
        return this.AudioAttributesCompatParcelizer.write().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public int getItemCount() {
        return this.AudioAttributesCompatParcelizer.write().size();
    }

    public final List<T> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.write();
    }
}
