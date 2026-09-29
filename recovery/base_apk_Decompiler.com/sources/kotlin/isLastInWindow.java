package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class isLastInWindow {
    private final List<RemoteActionCompatParcelizer<?>> IconCompatParcelizer = new ArrayList();

    public final <Z> void AudioAttributesCompatParcelizer(Class<Z> cls, LoadControl<Z> loadControl) {
        synchronized (this) {
            this.IconCompatParcelizer.add(new RemoteActionCompatParcelizer<>(cls, loadControl));
        }
    }

    public final <Z> LoadControl<Z> IconCompatParcelizer(Class<Z> cls) {
        synchronized (this) {
            int size = this.IconCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer = this.IconCompatParcelizer.get(i);
                if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(cls)) {
                    return (LoadControl<Z>) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
                }
            }
            return null;
        }
    }

    static final class RemoteActionCompatParcelizer<T> {
        final LoadControl<T> AudioAttributesCompatParcelizer;
        private final Class<T> read;

        RemoteActionCompatParcelizer(Class<T> cls, LoadControl<T> loadControl) {
            this.read = cls;
            this.AudioAttributesCompatParcelizer = loadControl;
        }

        final boolean AudioAttributesCompatParcelizer(Class<?> cls) {
            return this.read.isAssignableFrom(cls);
        }
    }
}
