package kotlin;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumDeserializer {

    public interface write<T> {
        Object AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) throws Exception;
    }

    public static <T> Mp4ExtractorExternalSyntheticLambda0<T> AudioAttributesCompatParcelizer(write<T> writeVar) {
        RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer = new RemoteActionCompatParcelizer<>();
        IconCompatParcelizer<T> iconCompatParcelizer = new IconCompatParcelizer<>(remoteActionCompatParcelizer);
        remoteActionCompatParcelizer.write = iconCompatParcelizer;
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = writeVar.getClass();
        try {
            Object objAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
            if (objAudioAttributesCompatParcelizer != null) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer = objAudioAttributesCompatParcelizer;
            }
            return iconCompatParcelizer;
        } catch (Exception e) {
            iconCompatParcelizer.read(e);
            return iconCompatParcelizer;
        }
    }

    static final class IconCompatParcelizer<T> implements Mp4ExtractorExternalSyntheticLambda0<T> {
        final WeakReference<RemoteActionCompatParcelizer<T>> read;
        private final DateDeserializersDateDeserializer<T> write = new DateDeserializersDateDeserializer<T>() { // from class: o.EnumDeserializer.IconCompatParcelizer.4
            @Override // kotlin.DateDeserializersDateDeserializer
            protected final String AudioAttributesCompatParcelizer() {
                RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer = IconCompatParcelizer.this.read.get();
                if (remoteActionCompatParcelizer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                StringBuilder sb = new StringBuilder("tag=[");
                sb.append(remoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                sb.append("]");
                return sb.toString();
            }
        };

        IconCompatParcelizer(RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
            this.read = new WeakReference<>(remoteActionCompatParcelizer);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer = this.read.get();
            boolean zCancel = this.write.cancel(z);
            if (zCancel && remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.read();
            }
            return zCancel;
        }

        final boolean RemoteActionCompatParcelizer() {
            return this.write.cancel(true);
        }

        final boolean write(T t) {
            return this.write.AudioAttributesCompatParcelizer(t);
        }

        final boolean read(Throwable th) {
            return this.write.RemoteActionCompatParcelizer(th);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.write.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.write.isDone();
        }

        @Override // java.util.concurrent.Future
        public final T get() throws ExecutionException, InterruptedException {
            return this.write.get();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.write.get(j, timeUnit);
        }

        @Override // kotlin.Mp4ExtractorExternalSyntheticLambda0
        public final void IconCompatParcelizer(Runnable runnable, Executor executor) {
            this.write.IconCompatParcelizer(runnable, executor);
        }

        public final String toString() {
            return this.write.toString();
        }
    }

    public static final class RemoteActionCompatParcelizer<T> {
        private _fromInteger<Void> AudioAttributesCompatParcelizer = _fromInteger.RemoteActionCompatParcelizer();
        Object RemoteActionCompatParcelizer;
        private boolean read;
        IconCompatParcelizer<T> write;

        RemoteActionCompatParcelizer() {
        }

        public final boolean AudioAttributesCompatParcelizer(T t) {
            this.read = true;
            IconCompatParcelizer<T> iconCompatParcelizer = this.write;
            boolean z = iconCompatParcelizer != null && iconCompatParcelizer.write(t);
            if (z) {
                write();
            }
            return z;
        }

        public final boolean IconCompatParcelizer(Throwable th) {
            this.read = true;
            IconCompatParcelizer<T> iconCompatParcelizer = this.write;
            boolean z = iconCompatParcelizer != null && iconCompatParcelizer.read(th);
            if (z) {
                write();
            }
            return z;
        }

        public final boolean IconCompatParcelizer() {
            this.read = true;
            IconCompatParcelizer<T> iconCompatParcelizer = this.write;
            boolean z = iconCompatParcelizer != null && iconCompatParcelizer.RemoteActionCompatParcelizer();
            if (z) {
                write();
            }
            return z;
        }

        public final void write(Runnable runnable, Executor executor) {
            _fromInteger<Void> _frominteger = this.AudioAttributesCompatParcelizer;
            if (_frominteger != null) {
                _frominteger.IconCompatParcelizer(runnable, executor);
            }
        }

        final void read() {
            this.RemoteActionCompatParcelizer = null;
            this.write = null;
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((Void) null);
        }

        private void write() {
            this.RemoteActionCompatParcelizer = null;
            this.write = null;
            this.AudioAttributesCompatParcelizer = null;
        }

        protected final void finalize() {
            _fromInteger<Void> _frominteger;
            IconCompatParcelizer<T> iconCompatParcelizer = this.write;
            if (iconCompatParcelizer != null && !iconCompatParcelizer.isDone()) {
                StringBuilder sb = new StringBuilder("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                sb.append(this.RemoteActionCompatParcelizer);
                iconCompatParcelizer.read(new read(sb.toString()));
            }
            if (this.read || (_frominteger = this.AudioAttributesCompatParcelizer) == null) {
                return;
            }
            _frominteger.AudioAttributesCompatParcelizer((Void) null);
        }
    }

    static final class read extends Throwable {
        read(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            synchronized (this) {
            }
            return this;
        }
    }
}
