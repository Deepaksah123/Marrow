package kotlin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class setPeakBitrate {
    private final Map<Class<?>, Object> RemoteActionCompatParcelizer;

    setPeakBitrate(write writeVar) {
        this.RemoteActionCompatParcelizer = Collections.unmodifiableMap(new HashMap(writeVar.IconCompatParcelizer));
    }

    public final boolean IconCompatParcelizer(Class<? extends Object> cls) {
        return this.RemoteActionCompatParcelizer.containsKey(cls);
    }

    static final class write {
        private final Map<Class<?>, Object> IconCompatParcelizer = new HashMap();

        write() {
        }

        final setPeakBitrate read() {
            return new setPeakBitrate(this);
        }
    }
}
