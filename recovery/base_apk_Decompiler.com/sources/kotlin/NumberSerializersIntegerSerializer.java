package kotlin;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.PropertySerializerMapEmpty;
import kotlin.StdKeySerializer;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NumberSerializersIntegerSerializer<T> extends NumberSerializers1 {
    private final HashMap<T, write<T>> IconCompatParcelizer = new HashMap<>();
    private TypeNameIdResolver read;
    private Handler write;

    protected long AudioAttributesCompatParcelizer(T t, long j, StdKeySerializers.write writeVar) {
        return j;
    }

    protected StdKeySerializers.write IconCompatParcelizer(T t, StdKeySerializers.write writeVar) {
        return writeVar;
    }

    protected int read(T t, int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public abstract void RemoteActionCompatParcelizer(T t, StdKeySerializers stdKeySerializers, PolymorphicTypeValidator polymorphicTypeValidator);

    @Override // kotlin.NumberSerializers1
    public void prepareSourceInternal(TypeNameIdResolver typeNameIdResolver) {
        this.read = typeNameIdResolver;
        this.write = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.StdKeySerializers
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<write<T>> it = this.IconCompatParcelizer.values().iterator();
        while (it.hasNext()) {
            it.next().IconCompatParcelizer.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // kotlin.NumberSerializers1
    protected void enableInternal() {
        for (write<T> writeVar : this.IconCompatParcelizer.values()) {
            writeVar.IconCompatParcelizer.enable(writeVar.read);
        }
    }

    @Override // kotlin.NumberSerializers1
    protected void disableInternal() {
        for (write<T> writeVar : this.IconCompatParcelizer.values()) {
            writeVar.IconCompatParcelizer.disable(writeVar.read);
        }
    }

    @Override // kotlin.NumberSerializers1
    public void releaseSourceInternal() {
        for (write<T> writeVar : this.IconCompatParcelizer.values()) {
            writeVar.IconCompatParcelizer.releaseSource(writeVar.read);
            writeVar.IconCompatParcelizer.removeEventListener(writeVar.RemoteActionCompatParcelizer);
            writeVar.IconCompatParcelizer.removeDrmEventListener(writeVar.RemoteActionCompatParcelizer);
        }
        this.IconCompatParcelizer.clear();
    }

    public final void RemoteActionCompatParcelizer(final T t, StdKeySerializers stdKeySerializers) {
        buildTypeSerializer.IconCompatParcelizer(!this.IconCompatParcelizer.containsKey(t));
        StdKeySerializers.IconCompatParcelizer iconCompatParcelizer = new StdKeySerializers.IconCompatParcelizer() { // from class: o.RawSerializer
            @Override // o.StdKeySerializers.IconCompatParcelizer
            public final void IconCompatParcelizer(StdKeySerializers stdKeySerializers2, PolymorphicTypeValidator polymorphicTypeValidator) {
                this.read.RemoteActionCompatParcelizer(t, stdKeySerializers2, polymorphicTypeValidator);
            }
        };
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(t);
        this.IconCompatParcelizer.put(t, new write<>(stdKeySerializers, iconCompatParcelizer, audioAttributesCompatParcelizer));
        stdKeySerializers.addEventListener((Handler) buildTypeSerializer.IconCompatParcelizer(this.write), audioAttributesCompatParcelizer);
        stdKeySerializers.addDrmEventListener((Handler) buildTypeSerializer.IconCompatParcelizer(this.write), audioAttributesCompatParcelizer);
        stdKeySerializers.prepareSource(iconCompatParcelizer, this.read, getPlayerId());
        if (isEnabled()) {
            return;
        }
        stdKeySerializers.disable(iconCompatParcelizer);
    }

    static final class write<T> {
        public final StdKeySerializers IconCompatParcelizer;
        public final NumberSerializersIntegerSerializer<T>.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
        public final StdKeySerializers.IconCompatParcelizer read;

        public write(StdKeySerializers stdKeySerializers, StdKeySerializers.IconCompatParcelizer iconCompatParcelizer, NumberSerializersIntegerSerializer<T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.IconCompatParcelizer = stdKeySerializers;
            this.read = iconCompatParcelizer;
            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        }
    }

    final class AudioAttributesCompatParcelizer implements StdKeySerializer, PropertySerializerMapEmpty {
        private PropertySerializerMapEmpty.read AudioAttributesCompatParcelizer;
        private final T IconCompatParcelizer;
        private StdKeySerializer.read write;

        public AudioAttributesCompatParcelizer(T t) {
            this.write = NumberSerializersIntegerSerializer.this.createEventDispatcher(null);
            this.AudioAttributesCompatParcelizer = NumberSerializersIntegerSerializer.this.createDrmEventDispatcher(null);
            this.IconCompatParcelizer = t;
        }

        @Override // kotlin.StdKeySerializer
        public final void IconCompatParcelizer(int i, StdKeySerializers.write writeVar, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.write.AudioAttributesCompatParcelizer(stdDelegatingSerializer, read(stdArraySerializersShortArraySerializer, writeVar));
            }
        }

        @Override // kotlin.StdKeySerializer
        public final void read(int i, StdKeySerializers.write writeVar, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.write.write(stdDelegatingSerializer, read(stdArraySerializersShortArraySerializer, writeVar));
            }
        }

        @Override // kotlin.StdKeySerializer
        public final void write(int i, StdKeySerializers.write writeVar, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.write.RemoteActionCompatParcelizer(stdDelegatingSerializer, read(stdArraySerializersShortArraySerializer, writeVar));
            }
        }

        @Override // kotlin.StdKeySerializer
        public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer, IOException iOException, boolean z) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.write.read(stdDelegatingSerializer, read(stdArraySerializersShortArraySerializer, writeVar), iOException, z);
            }
        }

        @Override // kotlin.StdKeySerializer
        public final void RemoteActionCompatParcelizer(int i, StdKeySerializers.write writeVar, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.write.RemoteActionCompatParcelizer(read(stdArraySerializersShortArraySerializer, writeVar));
            }
        }

        @Override // kotlin.StdKeySerializer
        public final void IconCompatParcelizer(int i, StdKeySerializers.write writeVar, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.write.write(read(stdArraySerializersShortArraySerializer, writeVar));
            }
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void read(int i, StdKeySerializers.write writeVar, int i2) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.AudioAttributesCompatParcelizer.read(i2);
            }
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            }
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar, Exception exc) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(exc);
            }
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void RemoteActionCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void read(int i, StdKeySerializers.write writeVar) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.AudioAttributesCompatParcelizer.write();
            }
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void write(int i, StdKeySerializers.write writeVar) {
            if (IconCompatParcelizer(i, writeVar)) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        }

        private boolean IconCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            StdKeySerializers.write writeVarIconCompatParcelizer;
            if (writeVar != null) {
                writeVarIconCompatParcelizer = NumberSerializersIntegerSerializer.this.IconCompatParcelizer(this.IconCompatParcelizer, writeVar);
                if (writeVarIconCompatParcelizer == null) {
                    return false;
                }
            } else {
                writeVarIconCompatParcelizer = null;
            }
            int i2 = NumberSerializersIntegerSerializer.this.read(this.IconCompatParcelizer, i);
            if (this.write.write != i2 || !LaissezFaireSubTypeValidator.read(this.write.IconCompatParcelizer, writeVarIconCompatParcelizer)) {
                this.write = NumberSerializersIntegerSerializer.this.createEventDispatcher(i2, writeVarIconCompatParcelizer);
            }
            if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == i2 && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer.write, writeVarIconCompatParcelizer)) {
                return true;
            }
            this.AudioAttributesCompatParcelizer = NumberSerializersIntegerSerializer.this.createDrmEventDispatcher(i2, writeVarIconCompatParcelizer);
            return true;
        }

        private StdArraySerializersShortArraySerializer read(StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer, StdKeySerializers.write writeVar) {
            long jAudioAttributesCompatParcelizer = NumberSerializersIntegerSerializer.this.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, stdArraySerializersShortArraySerializer.write, writeVar);
            long jAudioAttributesCompatParcelizer2 = NumberSerializersIntegerSerializer.this.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, stdArraySerializersShortArraySerializer.IconCompatParcelizer, writeVar);
            return (jAudioAttributesCompatParcelizer == stdArraySerializersShortArraySerializer.write && jAudioAttributesCompatParcelizer2 == stdArraySerializersShortArraySerializer.IconCompatParcelizer) ? stdArraySerializersShortArraySerializer : new StdArraySerializersShortArraySerializer(stdArraySerializersShortArraySerializer.AudioAttributesCompatParcelizer, stdArraySerializersShortArraySerializer.AudioAttributesImplApi21Parcelizer, stdArraySerializersShortArraySerializer.read, stdArraySerializersShortArraySerializer.MediaBrowserCompatItemReceiver, stdArraySerializersShortArraySerializer.RemoteActionCompatParcelizer, jAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer2);
        }
    }
}
