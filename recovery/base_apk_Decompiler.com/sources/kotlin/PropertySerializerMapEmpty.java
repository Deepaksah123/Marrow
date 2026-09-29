package kotlin;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public interface PropertySerializerMapEmpty {
    default void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar) {
    }

    default void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar, Exception exc) {
    }

    default void RemoteActionCompatParcelizer(int i, StdKeySerializers.write writeVar) {
    }

    default void read(int i, StdKeySerializers.write writeVar) {
    }

    default void read(int i, StdKeySerializers.write writeVar, int i2) {
    }

    default void write(int i, StdKeySerializers.write writeVar) {
    }

    public static class read {
        private final CopyOnWriteArrayList<write> AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final StdKeySerializers.write write;

        public read() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private read(CopyOnWriteArrayList<write> copyOnWriteArrayList, int i, StdKeySerializers.write writeVar) {
            this.AudioAttributesCompatParcelizer = copyOnWriteArrayList;
            this.RemoteActionCompatParcelizer = i;
            this.write = writeVar;
        }

        public final read AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            return new read(this.AudioAttributesCompatParcelizer, i, writeVar);
        }

        public final void read(Handler handler, PropertySerializerMapEmpty propertySerializerMapEmpty) {
            this.AudioAttributesCompatParcelizer.add(new write(handler, propertySerializerMapEmpty));
        }

        public final void IconCompatParcelizer(PropertySerializerMapEmpty propertySerializerMapEmpty) {
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                if (writeVar.AudioAttributesCompatParcelizer == propertySerializerMapEmpty) {
                    this.AudioAttributesCompatParcelizer.remove(writeVar);
                }
            }
        }

        public final void read(final int i) {
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                final PropertySerializerMapEmpty propertySerializerMapEmpty = writeVar.AudioAttributesCompatParcelizer;
                LaissezFaireSubTypeValidator.read(writeVar.read, new Runnable() { // from class: o.ReadOnlyClassToSerializerMap
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.write(propertySerializerMapEmpty, i);
                    }
                });
            }
        }

        final /* synthetic */ void write(PropertySerializerMapEmpty propertySerializerMapEmpty, int i) {
            propertySerializerMapEmpty.read(this.RemoteActionCompatParcelizer, this.write, i);
        }

        public final void IconCompatParcelizer() {
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                final PropertySerializerMapEmpty propertySerializerMapEmpty = writeVar.AudioAttributesCompatParcelizer;
                LaissezFaireSubTypeValidator.read(writeVar.read, new Runnable() { // from class: o.PropertySerializerMapTypeAndSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.AudioAttributesCompatParcelizer.read(propertySerializerMapEmpty);
                    }
                });
            }
        }

        final /* synthetic */ void read(PropertySerializerMapEmpty propertySerializerMapEmpty) {
            propertySerializerMapEmpty.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.write);
        }

        public final void AudioAttributesCompatParcelizer(final Exception exc) {
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                final PropertySerializerMapEmpty propertySerializerMapEmpty = writeVar.AudioAttributesCompatParcelizer;
                LaissezFaireSubTypeValidator.read(writeVar.read, new Runnable() { // from class: o.PropertySerializerMapSingle
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.IconCompatParcelizer(propertySerializerMapEmpty, exc);
                    }
                });
            }
        }

        final /* synthetic */ void IconCompatParcelizer(PropertySerializerMapEmpty propertySerializerMapEmpty, Exception exc) {
            propertySerializerMapEmpty.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, exc);
        }

        public final void RemoteActionCompatParcelizer() {
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                final PropertySerializerMapEmpty propertySerializerMapEmpty = writeVar.AudioAttributesCompatParcelizer;
                LaissezFaireSubTypeValidator.read(writeVar.read, new Runnable() { // from class: o.lambdanew0comfasterxmljacksondatabindserimplReadOnlyClassToSerializerMap
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.AudioAttributesCompatParcelizer.write(propertySerializerMapEmpty);
                    }
                });
            }
        }

        final /* synthetic */ void write(PropertySerializerMapEmpty propertySerializerMapEmpty) {
            propertySerializerMapEmpty.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.write);
        }

        public final void write() {
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                final PropertySerializerMapEmpty propertySerializerMapEmpty = writeVar.AudioAttributesCompatParcelizer;
                LaissezFaireSubTypeValidator.read(writeVar.read, new Runnable() { // from class: o.PropertySerializerMapSerializerAndMapResult
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(propertySerializerMapEmpty);
                    }
                });
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(PropertySerializerMapEmpty propertySerializerMapEmpty) {
            propertySerializerMapEmpty.read(this.RemoteActionCompatParcelizer, this.write);
        }

        public final void AudioAttributesCompatParcelizer() {
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                final PropertySerializerMapEmpty propertySerializerMapEmpty = writeVar.AudioAttributesCompatParcelizer;
                LaissezFaireSubTypeValidator.read(writeVar.read, new Runnable() { // from class: o.ReadOnlyClassToSerializerMapExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(propertySerializerMapEmpty);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(PropertySerializerMapEmpty propertySerializerMapEmpty) {
            propertySerializerMapEmpty.write(this.RemoteActionCompatParcelizer, this.write);
        }

        static final class write {
            public PropertySerializerMapEmpty AudioAttributesCompatParcelizer;
            public Handler read;

            public write(Handler handler, PropertySerializerMapEmpty propertySerializerMapEmpty) {
                this.read = handler;
                this.AudioAttributesCompatParcelizer = propertySerializerMapEmpty;
            }
        }
    }
}
