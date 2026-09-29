package kotlin;

import android.os.Handler;
import kotlin.serializePolymorphic;

/* JADX INFO: loaded from: classes2.dex */
public interface modifyMapLikeSerializer {
    default void AudioAttributesCompatParcelizer(_at _atVar) {
    }

    default void AudioAttributesCompatParcelizer(C0170format c0170format, findMapLikeSerializer findmaplikeserializer) {
    }

    default void AudioAttributesCompatParcelizer(serializePolymorphic.read readVar) {
    }

    default void IconCompatParcelizer(String str, long j, long j2) {
    }

    default void IconCompatParcelizer(boolean z) {
    }

    default void RemoteActionCompatParcelizer(serializePolymorphic.read readVar) {
    }

    default void read(long j) {
    }

    default void read(Exception exc) {
    }

    default void read(String str) {
    }

    default void read(_at _atVar) {
    }

    default void write(int i, long j, long j2) {
    }

    default void write(Exception exc) {
    }

    public static final class AudioAttributesCompatParcelizer {
        private final modifyMapLikeSerializer read;
        private final Handler write;

        public AudioAttributesCompatParcelizer(Handler handler, modifyMapLikeSerializer modifymaplikeserializer) {
            this.write = modifymaplikeserializer != null ? (Handler) buildTypeSerializer.IconCompatParcelizer(handler) : null;
            this.read = modifymaplikeserializer;
        }

        public final void IconCompatParcelizer(final _at _atVar) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.hasSingleElement
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(_atVar);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(_at _atVar) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).read(_atVar);
        }

        public final void RemoteActionCompatParcelizer(final String str, final long j, final long j2) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.withValueTypeSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(str, j, j2);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(String str, long j, long j2) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).IconCompatParcelizer(str, j, j2);
        }

        public final void AudioAttributesCompatParcelizer(final C0170format c0170format, final findMapLikeSerializer findmaplikeserializer) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o._serializeNull
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.RemoteActionCompatParcelizer(c0170format, findmaplikeserializer);
                    }
                });
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(C0170format c0170format, findMapLikeSerializer findmaplikeserializer) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).AudioAttributesCompatParcelizer(c0170format, findmaplikeserializer);
        }

        public final void IconCompatParcelizer(final long j) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o._withValueTypeSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(j);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(long j) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).read(j);
        }

        public final void write(final int i, final long j, final long j2) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.DefaultSerializerProvider
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.read(i, j, j2);
                    }
                });
            }
        }

        final /* synthetic */ void read(int i, long j, long j2) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).write(i, j, j2);
        }

        public final void AudioAttributesCompatParcelizer(final String str) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.orderProperties
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.read(str);
                    }
                });
            }
        }

        final /* synthetic */ void read(String str) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).read(str);
        }

        public final void read(final _at _atVar) {
            _atVar.AudioAttributesCompatParcelizer();
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.ContainerSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.RemoteActionCompatParcelizer(_atVar);
                    }
                });
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(_at _atVar) {
            _atVar.AudioAttributesCompatParcelizer();
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).AudioAttributesCompatParcelizer(_atVar);
        }

        public final void IconCompatParcelizer(final boolean z) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.serializeValue
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.AudioAttributesCompatParcelizer(z);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(boolean z) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).IconCompatParcelizer(z);
        }

        public final void IconCompatParcelizer(final Exception exc) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o._wrapAsIOE
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(exc);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(Exception exc) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).write(exc);
        }

        public final void RemoteActionCompatParcelizer(final Exception exc) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o._createObjectIdMap
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.read(exc);
                    }
                });
            }
        }

        final /* synthetic */ void read(Exception exc) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).read(exc);
        }

        public final void AudioAttributesCompatParcelizer(final serializePolymorphic.read readVar) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o._serialize
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(readVar);
                    }
                });
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(serializePolymorphic.read readVar) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).RemoteActionCompatParcelizer(readVar);
        }

        public final void read(final serializePolymorphic.read readVar) {
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.ContextualSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.write(readVar);
                    }
                });
            }
        }

        final /* synthetic */ void write(serializePolymorphic.read readVar) {
            ((modifyMapLikeSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).AudioAttributesCompatParcelizer(readVar);
        }
    }
}
