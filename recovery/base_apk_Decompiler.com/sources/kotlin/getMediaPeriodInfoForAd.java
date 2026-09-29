package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaPeriodInfoForAd {
    private final List<write<?>> AudioAttributesCompatParcelizer = new ArrayList();

    public final <T> onShuffleModeEnabledChanged<T> IconCompatParcelizer(Class<T> cls) {
        synchronized (this) {
            for (write<?> writeVar : this.AudioAttributesCompatParcelizer) {
                if (writeVar.IconCompatParcelizer(cls)) {
                    return (onShuffleModeEnabledChanged<T>) writeVar.RemoteActionCompatParcelizer;
                }
            }
            return null;
        }
    }

    public final <T> void IconCompatParcelizer(Class<T> cls, onShuffleModeEnabledChanged<T> onshufflemodeenabledchanged) {
        synchronized (this) {
            this.AudioAttributesCompatParcelizer.add(new write<>(cls, onshufflemodeenabledchanged));
        }
    }

    static final class write<T> {
        private final Class<T> AudioAttributesCompatParcelizer;
        final onShuffleModeEnabledChanged<T> RemoteActionCompatParcelizer;

        write(Class<T> cls, onShuffleModeEnabledChanged<T> onshufflemodeenabledchanged) {
            this.AudioAttributesCompatParcelizer = cls;
            this.RemoteActionCompatParcelizer = onshufflemodeenabledchanged;
        }

        final boolean IconCompatParcelizer(Class<?> cls) {
            return this.AudioAttributesCompatParcelizer.isAssignableFrom(cls);
        }
    }
}
