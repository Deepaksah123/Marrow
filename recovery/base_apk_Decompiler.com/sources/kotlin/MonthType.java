package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class MonthType<T> implements isExpanded<T> {
    private final getTopRankers<T> AudioAttributesCompatParcelizer;
    private final int read;

    /* JADX WARN: Multi-variable type inference failed */
    public MonthType(getTopRankers<? extends T> gettoprankers, int i) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        this.AudioAttributesCompatParcelizer = gettoprankers;
        this.read = i;
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("count must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // kotlin.isExpanded
    public final getTopRankers<T> read(int i) {
        int i2 = this.read + i;
        return i2 < 0 ? new MonthType(this, i) : new MonthType(this.AudioAttributesCompatParcelizer, i2);
    }

    @Override // kotlin.isExpanded
    public final getTopRankers<T> IconCompatParcelizer(int i) {
        int i2 = this.read;
        int i3 = i2 + 5;
        return i3 < 0 ? new getIsRanked(this, 5) : new TestAttendeeData(this.AudioAttributesCompatParcelizer, i2, i3);
    }

    public static final class AudioAttributesCompatParcelizer implements Iterator<T>, getCurrentAnsweredMcqProgress {
        private int AudioAttributesCompatParcelizer;
        private final Iterator<T> write;

        AudioAttributesCompatParcelizer(MonthType<T> monthType) {
            this.write = ((MonthType) monthType).AudioAttributesCompatParcelizer.write();
            this.AudioAttributesCompatParcelizer = ((MonthType) monthType).read;
        }

        private final void read() {
            while (this.AudioAttributesCompatParcelizer > 0 && this.write.hasNext()) {
                this.write.next();
                this.AudioAttributesCompatParcelizer--;
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            read();
            return this.write.next();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            read();
            return this.write.hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.getTopRankers
    public final Iterator<T> write() {
        return new AudioAttributesCompatParcelizer(this);
    }
}
