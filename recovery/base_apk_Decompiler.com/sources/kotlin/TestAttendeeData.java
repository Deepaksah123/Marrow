package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class TestAttendeeData<T> implements isExpanded<T> {
    private final int IconCompatParcelizer;
    private final getTopRankers<T> RemoteActionCompatParcelizer;
    private final int read;

    /* JADX WARN: Multi-variable type inference failed */
    public TestAttendeeData(getTopRankers<? extends T> gettoprankers, int i, int i2) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        this.RemoteActionCompatParcelizer = gettoprankers;
        this.IconCompatParcelizer = i;
        this.read = i2;
        if (i < 0) {
            throw new IllegalArgumentException("startIndex should be non-negative, but is ".concat(String.valueOf(i)).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("endIndex should be non-negative, but is ".concat(String.valueOf(i2)).toString());
        }
        if (i2 >= i) {
            return;
        }
        StringBuilder sb = new StringBuilder("endIndex should be not less than startIndex, but was ");
        sb.append(i2);
        sb.append(" < ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    private final int read() {
        return this.read - this.IconCompatParcelizer;
    }

    @Override // kotlin.isExpanded
    public final getTopRankers<T> read(int i) {
        return i >= read() ? StateResult.AudioAttributesCompatParcelizer() : new TestAttendeeData(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer + i, this.read);
    }

    @Override // kotlin.isExpanded
    public final getTopRankers<T> IconCompatParcelizer(int i) {
        if (5 >= read()) {
            return this;
        }
        getTopRankers<T> gettoprankers = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        return new TestAttendeeData(gettoprankers, i2, i2 + 5);
    }

    public static final class read implements Iterator<T>, getCurrentAnsweredMcqProgress {
        private /* synthetic */ TestAttendeeData<T> AudioAttributesCompatParcelizer;
        private final Iterator<T> RemoteActionCompatParcelizer;
        private int read;

        read(TestAttendeeData<T> testAttendeeData) {
            this.AudioAttributesCompatParcelizer = testAttendeeData;
            this.RemoteActionCompatParcelizer = ((TestAttendeeData) testAttendeeData).RemoteActionCompatParcelizer.write();
        }

        private final void read() {
            while (this.read < ((TestAttendeeData) this.AudioAttributesCompatParcelizer).IconCompatParcelizer && this.RemoteActionCompatParcelizer.hasNext()) {
                this.RemoteActionCompatParcelizer.next();
                this.read++;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            read();
            return this.read < ((TestAttendeeData) this.AudioAttributesCompatParcelizer).read && this.RemoteActionCompatParcelizer.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            read();
            if (this.read >= ((TestAttendeeData) this.AudioAttributesCompatParcelizer).read) {
                throw new NoSuchElementException();
            }
            this.read++;
            return this.RemoteActionCompatParcelizer.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.getTopRankers
    public final Iterator<T> write() {
        return new read(this);
    }
}
