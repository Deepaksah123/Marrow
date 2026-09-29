package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class getUpdatedStatus extends setSearchTimes {
    public static final getUpdatedStatus RemoteActionCompatParcelizer = new getUpdatedStatus();

    @Override // kotlin.setSearchTimes
    public final /* synthetic */ Object AudioAttributesCompatParcelizer(int i) {
        return null;
    }

    @Override // kotlin.setSearchTimes
    public final int RemoteActionCompatParcelizer() {
        return 0;
    }

    private getUpdatedStatus() {
        super((byte) 0);
    }

    @Override // kotlin.setSearchTimes
    public final /* synthetic */ void AudioAttributesCompatParcelizer(int i, Object obj) {
        RemoteActionCompatParcelizer((Void) obj);
    }

    private static void RemoteActionCompatParcelizer(Void r1) {
        toMagicModuleMetaRepoModel.write(r1, "");
        throw new IllegalStateException();
    }

    public static final class write implements Iterator, getCurrentAnsweredMcqProgress {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        write() {
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            return RemoteActionCompatParcelizer();
        }

        private static Void RemoteActionCompatParcelizer() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.setSearchTimes, java.lang.Iterable
    public final Iterator iterator() {
        return new write();
    }
}
