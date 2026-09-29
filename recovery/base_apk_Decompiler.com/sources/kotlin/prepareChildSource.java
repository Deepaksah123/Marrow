package kotlin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class prepareChildSource<T, Y> {
    private final long AudioAttributesCompatParcelizer;
    private long IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;
    private final Map<T, RemoteActionCompatParcelizer<Y>> read = new LinkedHashMap(100, 0.75f, true);

    public int IconCompatParcelizer(Y y) {
        return 1;
    }

    protected void read(T t, Y y) {
    }

    public prepareChildSource(long j) {
        this.AudioAttributesCompatParcelizer = j;
        this.IconCompatParcelizer = j;
    }

    public final long IconCompatParcelizer() {
        long j;
        synchronized (this) {
            j = this.IconCompatParcelizer;
        }
        return j;
    }

    public final Y RemoteActionCompatParcelizer(T t) {
        Y y;
        synchronized (this) {
            RemoteActionCompatParcelizer<Y> remoteActionCompatParcelizer = this.read.get(t);
            y = remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.AudioAttributesCompatParcelizer : null;
        }
        return y;
    }

    public final Y IconCompatParcelizer(T t, Y y) {
        synchronized (this) {
            int iIconCompatParcelizer = IconCompatParcelizer(y);
            long j = iIconCompatParcelizer;
            if (j >= this.IconCompatParcelizer) {
                read(t, y);
                return null;
            }
            if (y != null) {
                this.RemoteActionCompatParcelizer += j;
            }
            RemoteActionCompatParcelizer<Y> remoteActionCompatParcelizerPut = this.read.put(t, y == null ? null : new RemoteActionCompatParcelizer<>(y, iIconCompatParcelizer));
            if (remoteActionCompatParcelizerPut != null) {
                this.RemoteActionCompatParcelizer -= (long) remoteActionCompatParcelizerPut.IconCompatParcelizer;
                if (!remoteActionCompatParcelizerPut.AudioAttributesCompatParcelizer.equals(y)) {
                    read(t, remoteActionCompatParcelizerPut.AudioAttributesCompatParcelizer);
                }
            }
            AudioAttributesCompatParcelizer();
            return remoteActionCompatParcelizerPut != null ? remoteActionCompatParcelizerPut.AudioAttributesCompatParcelizer : null;
        }
    }

    public final Y write(T t) {
        synchronized (this) {
            RemoteActionCompatParcelizer<Y> remoteActionCompatParcelizerRemove = this.read.remove(t);
            if (remoteActionCompatParcelizerRemove == null) {
                return null;
            }
            this.RemoteActionCompatParcelizer -= (long) remoteActionCompatParcelizerRemove.IconCompatParcelizer;
            return remoteActionCompatParcelizerRemove.AudioAttributesCompatParcelizer;
        }
    }

    public final void write() {
        RemoteActionCompatParcelizer(0L);
    }

    protected final void RemoteActionCompatParcelizer(long j) {
        synchronized (this) {
            while (this.RemoteActionCompatParcelizer > j) {
                Iterator<Map.Entry<T, RemoteActionCompatParcelizer<Y>>> it = this.read.entrySet().iterator();
                Map.Entry<T, RemoteActionCompatParcelizer<Y>> next = it.next();
                RemoteActionCompatParcelizer<Y> value = next.getValue();
                this.RemoteActionCompatParcelizer -= (long) value.IconCompatParcelizer;
                T key = next.getKey();
                it.remove();
                read(key, value.AudioAttributesCompatParcelizer);
            }
        }
    }

    private void AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    static final class RemoteActionCompatParcelizer<Y> {
        final Y AudioAttributesCompatParcelizer;
        final int IconCompatParcelizer;

        RemoteActionCompatParcelizer(Y y, int i) {
            this.AudioAttributesCompatParcelizer = y;
            this.IconCompatParcelizer = i;
        }
    }
}
