package kotlin;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public interface Annotations {
    default void AudioAttributesCompatParcelizer(Exception exc) {
    }

    default void AudioAttributesCompatParcelizer(String str) {
    }

    default void AudioAttributesCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject) {
    }

    default void IconCompatParcelizer(Object obj, long j) {
    }

    default void IconCompatParcelizer(_at _atVar) {
    }

    default void RemoteActionCompatParcelizer(long j, int i) {
    }

    default void RemoteActionCompatParcelizer(_at _atVar) {
    }

    default void read(int i, long j) {
    }

    default void read(C0170format c0170format, findMapLikeSerializer findmaplikeserializer) {
    }

    default void write(String str, long j, long j2) {
    }

    public static final class RemoteActionCompatParcelizer {
        private final Handler read;
        private final Annotations write;

        public RemoteActionCompatParcelizer(Handler handler, Annotations annotations) {
            this.read = annotations != null ? (Handler) buildTypeSerializer.IconCompatParcelizer(handler) : null;
            this.write = annotations;
        }

        public final void read(final _at _atVar) {
            Handler handler = this.read;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.getShortBuilder
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.IconCompatParcelizer(_atVar);
                    }
                });
            }
        }

        final /* synthetic */ void IconCompatParcelizer(_at _atVar) {
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).IconCompatParcelizer(_atVar);
        }

        public final void read(final String str, final long j, final long j2) {
            Handler handler = this.read;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.AccessPattern
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.RemoteActionCompatParcelizer(str, j, j2);
                    }
                });
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(String str, long j, long j2) {
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).write(str, j, j2);
        }

        public final void IconCompatParcelizer(final C0170format c0170format, final findMapLikeSerializer findmaplikeserializer) {
            Handler handler = this.read;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.ArrayBuildersBooleanBuilder
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.write(c0170format, findmaplikeserializer);
                    }
                });
            }
        }

        final /* synthetic */ void write(C0170format c0170format, findMapLikeSerializer findmaplikeserializer) {
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).read(c0170format, findmaplikeserializer);
        }

        public final void write(final int i, final long j) {
            Handler handler = this.read;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.getBooleanBuilder
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i, j);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(int i, long j) {
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).read(i, j);
        }

        public final void AudioAttributesCompatParcelizer(final long j, final int i) {
            Handler handler = this.read;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.getDoubleBuilder
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.read(j, i);
                    }
                });
            }
        }

        final /* synthetic */ void read(long j, int i) {
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).RemoteActionCompatParcelizer(j, i);
        }

        public final void read(final deserializeTypedFromObject deserializetypedfromobject) {
            Handler handler = this.read;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.getByteBuilder
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.RemoteActionCompatParcelizer(deserializetypedfromobject);
                    }
                });
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject) {
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).AudioAttributesCompatParcelizer(deserializetypedfromobject);
        }

        public final void RemoteActionCompatParcelizer(final Object obj) {
            if (this.read != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.read.post(new Runnable() { // from class: o.insertInListNoDup
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.read(obj, jElapsedRealtime);
                    }
                });
            }
        }

        final /* synthetic */ void read(Object obj, long j) {
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).IconCompatParcelizer(obj, j);
        }

        public final void RemoteActionCompatParcelizer(final String str) {
            Handler handler = this.read;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.getIntBuilder
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(String str) {
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).AudioAttributesCompatParcelizer(str);
        }

        public final void AudioAttributesCompatParcelizer(final _at _atVar) {
            _atVar.AudioAttributesCompatParcelizer();
            Handler handler = this.read;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.getLongBuilder
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.write(_atVar);
                    }
                });
            }
        }

        final /* synthetic */ void write(_at _atVar) {
            _atVar.AudioAttributesCompatParcelizer();
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).RemoteActionCompatParcelizer(_atVar);
        }

        public final void RemoteActionCompatParcelizer(final Exception exc) {
            Handler handler = this.read;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.getFloatBuilder
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.AudioAttributesCompatParcelizer.read(exc);
                    }
                });
            }
        }

        final /* synthetic */ void read(Exception exc) {
            ((Annotations) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).AudioAttributesCompatParcelizer(exc);
        }
    }
}
