package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class updateWakeAndWifiLock implements Iterable<getMaxSeekToPreviousPosition> {
    private final setPresenter<getMaxSeekToPreviousPosition> AudioAttributesCompatParcelizer = new setPresenter<>();

    public final void write(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        this.AudioAttributesCompatParcelizer.write(getmaxseektopreviousposition.getItemId(), getmaxseektopreviousposition);
    }

    public final void RemoteActionCompatParcelizer(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getmaxseektopreviousposition.getItemId());
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer.write();
    }

    @Override // java.lang.Iterable
    public final Iterator<getMaxSeekToPreviousPosition> iterator() {
        return new write(this, (byte) 0);
    }

    class write implements Iterator<getMaxSeekToPreviousPosition> {
        private int RemoteActionCompatParcelizer;

        private write() {
            this.RemoteActionCompatParcelizer = 0;
        }

        /* synthetic */ write(updateWakeAndWifiLock updatewakeandwifilock, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer < updateWakeAndWifiLock.this.AudioAttributesCompatParcelizer.write();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getMaxSeekToPreviousPosition next() {
            if (hasNext()) {
                setPresenter setpresenter = updateWakeAndWifiLock.this.AudioAttributesCompatParcelizer;
                int i = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i + 1;
                return (getMaxSeekToPreviousPosition) setpresenter.IconCompatParcelizer(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
