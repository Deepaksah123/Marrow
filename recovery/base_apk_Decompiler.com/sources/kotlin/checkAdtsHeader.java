package kotlin;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class checkAdtsHeader<V> extends DateDeserializersDateDeserializer<V> implements ScheduledFuture<V> {
    private final ScheduledFuture<?> read;

    interface AudioAttributesCompatParcelizer<T> {
        void IconCompatParcelizer(Throwable th);

        void read(T t);
    }

    interface read<T> {
        ScheduledFuture<?> IconCompatParcelizer(AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer);
    }

    checkAdtsHeader(read<V> readVar) {
        this.read = readVar.IconCompatParcelizer(new AudioAttributesCompatParcelizer<V>() { // from class: o.checkAdtsHeader.3
            @Override // o.checkAdtsHeader.AudioAttributesCompatParcelizer
            public final void read(V v) {
                checkAdtsHeader.this.AudioAttributesCompatParcelizer(v);
            }

            @Override // o.checkAdtsHeader.AudioAttributesCompatParcelizer
            public final void IconCompatParcelizer(Throwable th) {
                checkAdtsHeader.this.RemoteActionCompatParcelizer(th);
            }
        });
    }

    @Override // kotlin.DateDeserializersDateDeserializer
    public final void write() {
        this.read.cancel(read());
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.read.getDelay(timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.read.compareTo(delayed);
    }
}
