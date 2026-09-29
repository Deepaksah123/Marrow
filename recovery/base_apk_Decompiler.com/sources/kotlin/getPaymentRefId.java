package kotlin;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.PaymentStatusResponse;

/* JADX INFO: loaded from: classes.dex */
public final class getPaymentRefId<T, R> extends LessonDynamicResponseBody<R> {
    final getSubjectTitle<? super Object[], ? extends R> RemoteActionCompatParcelizer;
    private setRootSubjectId<? extends T>[] read;

    public getPaymentRefId(setRootSubjectId<? extends T>[] setrootsubjectidArr, getSubjectTitle<? super Object[], ? extends R> getsubjecttitle) {
        this.read = setrootsubjectidArr;
        this.RemoteActionCompatParcelizer = getsubjecttitle;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super R> markCompleteResponseBody) {
        setRootSubjectId<? extends T>[] setrootsubjectidArr = this.read;
        int length = setrootsubjectidArr.length;
        if (length == 1) {
            setrootsubjectidArr[0].read(new PaymentStatusResponse.write(markCompleteResponseBody, new read()));
            return;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(markCompleteResponseBody, length, this.RemoteActionCompatParcelizer);
        markCompleteResponseBody.IconCompatParcelizer(remoteActionCompatParcelizer);
        for (int i = 0; i < length && !remoteActionCompatParcelizer.write(); i++) {
            setRootSubjectId<? extends T> setrootsubjectid = setrootsubjectidArr[i];
            if (setrootsubjectid == null) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer((Throwable) new NullPointerException("One of the sources is null"), i);
                return;
            }
            setrootsubjectid.read(remoteActionCompatParcelizer.write[i]);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer<T, R> extends AtomicInteger implements MarkIncompleteResponseBody {
        private MarkCompleteResponseBody<? super R> AudioAttributesCompatParcelizer;
        private getSubjectTitle<? super Object[], ? extends R> IconCompatParcelizer;
        private Object[] read;
        final AudioAttributesCompatParcelizer<T>[] write;

        RemoteActionCompatParcelizer(MarkCompleteResponseBody<? super R> markCompleteResponseBody, int i, getSubjectTitle<? super Object[], ? extends R> getsubjecttitle) {
            super(i);
            this.AudioAttributesCompatParcelizer = markCompleteResponseBody;
            this.IconCompatParcelizer = getsubjecttitle;
            AudioAttributesCompatParcelizer<T>[] audioAttributesCompatParcelizerArr = new AudioAttributesCompatParcelizer[i];
            for (int i2 = 0; i2 < i; i2++) {
                audioAttributesCompatParcelizerArr[i2] = new AudioAttributesCompatParcelizer<>(this, i2);
            }
            this.write = audioAttributesCompatParcelizerArr;
            this.read = new Object[i];
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return get() <= 0;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            if (getAndSet(0) > 0) {
                for (AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer : this.write) {
                    audioAttributesCompatParcelizer.write();
                }
            }
        }

        final void AudioAttributesCompatParcelizer(T t, int i) {
            this.read[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(setHasPyt.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.apply(this.read), "The zipper returned a null value"));
                } catch (Throwable th) {
                    getEndTimeMs.RemoteActionCompatParcelizer(th);
                    this.AudioAttributesCompatParcelizer.IconCompatParcelizer(th);
                }
            }
        }

        private void read(int i) {
            AudioAttributesCompatParcelizer<T>[] audioAttributesCompatParcelizerArr = this.write;
            int length = audioAttributesCompatParcelizerArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                audioAttributesCompatParcelizerArr[i2].write();
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                } else {
                    audioAttributesCompatParcelizerArr[i].write();
                }
            }
        }

        final void AudioAttributesCompatParcelizer(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                read(i);
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(th);
            } else {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer<T> extends AtomicReference<MarkIncompleteResponseBody> implements MarkCompleteResponseBody<T> {
        private RemoteActionCompatParcelizer<T, ?> RemoteActionCompatParcelizer;
        private int write;

        AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer<T, ?> remoteActionCompatParcelizer, int i) {
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            this.write = i;
        }

        public final void write() {
            getSubjectId.RemoteActionCompatParcelizer(this);
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody);
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void AudioAttributesCompatParcelizer(T t) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(t, this.write);
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(Throwable th) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(th, this.write);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    final class read implements getSubjectTitle<T, R> {
        read() {
        }

        @Override // kotlin.getSubjectTitle
        public final R apply(T t) throws Exception {
            return (R) setHasPyt.AudioAttributesCompatParcelizer(getPaymentRefId.this.RemoteActionCompatParcelizer.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }
}
