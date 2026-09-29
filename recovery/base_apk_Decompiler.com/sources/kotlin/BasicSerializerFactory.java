package kotlin;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.StdKeySerializers;
import kotlin.ToStringSerializerBase;

/* JADX INFO: loaded from: classes2.dex */
final class BasicSerializerFactory {
    private final read AudioAttributesImplApi21Parcelizer;
    private TypeNameIdResolver AudioAttributesImplApi26Parcelizer;
    private boolean IconCompatParcelizer;
    private final modifyArraySerializer MediaBrowserCompatMediaItem;
    private final _usesExternalId RemoteActionCompatParcelizer;
    private final findSerializerByPrimaryType write;
    private ToStringSerializerBase MediaDescriptionCompat = new ToStringSerializerBase.RemoteActionCompatParcelizer();
    private final IdentityHashMap<StdJdkSerializersAtomicIntegerSerializer, AudioAttributesCompatParcelizer> MediaBrowserCompatItemReceiver = new IdentityHashMap<>();
    private final Map<Object, AudioAttributesCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver = new HashMap();
    private final List<AudioAttributesCompatParcelizer> AudioAttributesImplBaseParcelizer = new ArrayList();
    private final HashMap<AudioAttributesCompatParcelizer, write> read = new HashMap<>();
    private final Set<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer = new HashSet();

    public interface read {
        void read();
    }

    public BasicSerializerFactory(read readVar, findSerializerByPrimaryType findserializerbyprimarytype, _usesExternalId _usesexternalid, modifyArraySerializer modifyarrayserializer) {
        this.MediaBrowserCompatMediaItem = modifyarrayserializer;
        this.AudioAttributesImplApi21Parcelizer = readVar;
        this.write = findserializerbyprimarytype;
        this.RemoteActionCompatParcelizer = _usesexternalid;
    }

    public final PolymorphicTypeValidator read(List<AudioAttributesCompatParcelizer> list, ToStringSerializerBase toStringSerializerBase) {
        write(0, this.AudioAttributesImplBaseParcelizer.size());
        return RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.size(), list, toStringSerializerBase);
    }

    public final PolymorphicTypeValidator RemoteActionCompatParcelizer(int i, List<AudioAttributesCompatParcelizer> list, ToStringSerializerBase toStringSerializerBase) {
        if (!list.isEmpty()) {
            this.MediaDescriptionCompat = toStringSerializerBase;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = list.get(i2 - i);
                if (i2 > 0) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer.get(i2 - 1);
                    audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer2.IconCompatParcelizer + audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer());
                } else {
                    audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(0);
                }
                RemoteActionCompatParcelizer(i2, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer());
                this.AudioAttributesImplBaseParcelizer.add(i2, audioAttributesCompatParcelizer);
                this.MediaBrowserCompatCustomActionResultReceiver.put(audioAttributesCompatParcelizer.write, audioAttributesCompatParcelizer);
                if (this.IconCompatParcelizer) {
                    write(audioAttributesCompatParcelizer);
                    if (this.MediaBrowserCompatItemReceiver.isEmpty()) {
                        this.AudioAttributesCompatParcelizer.add(audioAttributesCompatParcelizer);
                    } else {
                        RemoteActionCompatParcelizer(audioAttributesCompatParcelizer);
                    }
                }
            }
        }
        return write();
    }

    public final PolymorphicTypeValidator AudioAttributesCompatParcelizer(int i, int i2, ToStringSerializerBase toStringSerializerBase) {
        buildTypeSerializer.IconCompatParcelizer(i >= 0 && i <= i2 && i2 <= read());
        this.MediaDescriptionCompat = toStringSerializerBase;
        write(i, i2);
        return write();
    }

    public final PolymorphicTypeValidator write(int i, int i2, int i3, ToStringSerializerBase toStringSerializerBase) {
        buildTypeSerializer.IconCompatParcelizer(i >= 0 && i <= i2 && i2 <= read() && i3 >= 0);
        this.MediaDescriptionCompat = toStringSerializerBase;
        if (i == i2 || i == i3) {
            return write();
        }
        int iMin = Math.min(i, i3);
        int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int iAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.get(iMin).IconCompatParcelizer;
        LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, i, i2, i3);
        while (iMin <= iMax) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.get(iMin);
            audioAttributesCompatParcelizer.IconCompatParcelizer = iAudioAttributesCompatParcelizer;
            iAudioAttributesCompatParcelizer += audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
            iMin++;
        }
        return write();
    }

    public final PolymorphicTypeValidator write(int i, int i2, List<JsonSerializableSchema> list) {
        buildTypeSerializer.IconCompatParcelizer(i >= 0 && i <= i2 && i2 <= read());
        buildTypeSerializer.IconCompatParcelizer(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            this.AudioAttributesImplBaseParcelizer.get(i3).AudioAttributesCompatParcelizer.updateMediaItem(list.get(i3 - i));
        }
        return write();
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int read() {
        return this.AudioAttributesImplBaseParcelizer.size();
    }

    public final PolymorphicTypeValidator write(ToStringSerializerBase toStringSerializerBase) {
        int i = read();
        if (toStringSerializerBase.write() != i) {
            toStringSerializerBase = toStringSerializerBase.read().RemoteActionCompatParcelizer(0, i);
        }
        this.MediaDescriptionCompat = toStringSerializerBase;
        return write();
    }

    public final void read(TypeNameIdResolver typeNameIdResolver) {
        buildTypeSerializer.write(!this.IconCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer = typeNameIdResolver;
        for (int i = 0; i < this.AudioAttributesImplBaseParcelizer.size(); i++) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.get(i);
            write(audioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer.add(audioAttributesCompatParcelizer);
        }
        this.IconCompatParcelizer = true;
    }

    public final StdJdkSerializersAtomicIntegerSerializer RemoteActionCompatParcelizer(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(writeVar.AudioAttributesCompatParcelizer);
        StdKeySerializers.write writeVarRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer(IconCompatParcelizer(writeVar.AudioAttributesCompatParcelizer));
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.get(objAudioAttributesCompatParcelizer));
        AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.add(writeVarRemoteActionCompatParcelizer);
        StdJdkSerializers stdJdkSerializersCreatePeriod = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.createPeriod(writeVarRemoteActionCompatParcelizer, _findwellknownsimple, j);
        this.MediaBrowserCompatItemReceiver.put(stdJdkSerializersCreatePeriod, audioAttributesCompatParcelizer);
        MediaBrowserCompatItemReceiver();
        return stdJdkSerializersCreatePeriod;
    }

    public final void write(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.remove(stdJdkSerializersAtomicIntegerSerializer));
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.releasePeriod(stdJdkSerializersAtomicIntegerSerializer);
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.remove(((StdJdkSerializers) stdJdkSerializersAtomicIntegerSerializer).write);
        if (!this.MediaBrowserCompatItemReceiver.isEmpty()) {
            MediaBrowserCompatItemReceiver();
        }
        read(audioAttributesCompatParcelizer);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        for (write writeVar : this.read.values()) {
            try {
                writeVar.RemoteActionCompatParcelizer.releaseSource(writeVar.IconCompatParcelizer);
            } catch (RuntimeException e) {
                prune.read("MediaSourceList", "Failed to release child source.", e);
            }
            writeVar.RemoteActionCompatParcelizer.removeEventListener(writeVar.read);
            writeVar.RemoteActionCompatParcelizer.removeDrmEventListener(writeVar.read);
        }
        this.read.clear();
        this.AudioAttributesCompatParcelizer.clear();
        this.IconCompatParcelizer = false;
    }

    public final PolymorphicTypeValidator write() {
        if (this.AudioAttributesImplBaseParcelizer.isEmpty()) {
            return PolymorphicTypeValidator.RemoteActionCompatParcelizer;
        }
        int iAudioAttributesCompatParcelizer = 0;
        for (int i = 0; i < this.AudioAttributesImplBaseParcelizer.size(); i++) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.get(i);
            audioAttributesCompatParcelizer.IconCompatParcelizer = iAudioAttributesCompatParcelizer;
            iAudioAttributesCompatParcelizer += audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
        }
        return new buildMapSerializer(this.AudioAttributesImplBaseParcelizer, this.MediaDescriptionCompat);
    }

    public final ToStringSerializerBase IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    private void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesCompatParcelizer.add(audioAttributesCompatParcelizer);
        write writeVar = this.read.get(audioAttributesCompatParcelizer);
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer.enable(writeVar.IconCompatParcelizer);
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        Iterator<AudioAttributesCompatParcelizer> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer next = it.next();
            if (next.RemoteActionCompatParcelizer.isEmpty()) {
                RemoteActionCompatParcelizer(next);
                it.remove();
            }
        }
    }

    private void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        write writeVar = this.read.get(audioAttributesCompatParcelizer);
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer.disable(writeVar.IconCompatParcelizer);
        }
    }

    private void write(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemove = this.AudioAttributesImplBaseParcelizer.remove(i2);
            this.MediaBrowserCompatCustomActionResultReceiver.remove(audioAttributesCompatParcelizerRemove.write);
            RemoteActionCompatParcelizer(i2, -audioAttributesCompatParcelizerRemove.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer());
            audioAttributesCompatParcelizerRemove.read = true;
            if (this.IconCompatParcelizer) {
                read(audioAttributesCompatParcelizerRemove);
            }
        }
    }

    private void RemoteActionCompatParcelizer(int i, int i2) {
        while (i < this.AudioAttributesImplBaseParcelizer.size()) {
            this.AudioAttributesImplBaseParcelizer.get(i).IconCompatParcelizer += i2;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StdKeySerializers.write RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, StdKeySerializers.write writeVar) {
        for (int i = 0; i < audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.size(); i++) {
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.get(i).RemoteActionCompatParcelizer == writeVar.RemoteActionCompatParcelizer) {
                return writeVar.RemoteActionCompatParcelizer(read(audioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
        return i + audioAttributesCompatParcelizer.IconCompatParcelizer;
    }

    private void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        StdArraySerializersTypedPrimitiveArraySerializer stdArraySerializersTypedPrimitiveArraySerializer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        StdKeySerializers.IconCompatParcelizer iconCompatParcelizer = new StdKeySerializers.IconCompatParcelizer() { // from class: o.getAndSerialize
            @Override // o.StdKeySerializers.IconCompatParcelizer
            public final void IconCompatParcelizer(StdKeySerializers stdKeySerializers, PolymorphicTypeValidator polymorphicTypeValidator) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
        };
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(audioAttributesCompatParcelizer);
        this.read.put(audioAttributesCompatParcelizer, new write(stdArraySerializersTypedPrimitiveArraySerializer, iconCompatParcelizer, iconCompatParcelizer2));
        stdArraySerializersTypedPrimitiveArraySerializer.addEventListener(LaissezFaireSubTypeValidator.read(), iconCompatParcelizer2);
        stdArraySerializersTypedPrimitiveArraySerializer.addDrmEventListener(LaissezFaireSubTypeValidator.read(), iconCompatParcelizer2);
        stdArraySerializersTypedPrimitiveArraySerializer.prepareSource(iconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatMediaItem);
    }

    final /* synthetic */ void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.read();
    }

    private void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (audioAttributesCompatParcelizer.read && audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.isEmpty()) {
            write writeVar = (write) buildTypeSerializer.IconCompatParcelizer(this.read.remove(audioAttributesCompatParcelizer));
            writeVar.RemoteActionCompatParcelizer.releaseSource(writeVar.IconCompatParcelizer);
            writeVar.RemoteActionCompatParcelizer.removeEventListener(writeVar.read);
            writeVar.RemoteActionCompatParcelizer.removeDrmEventListener(writeVar.read);
            this.AudioAttributesCompatParcelizer.remove(audioAttributesCompatParcelizer);
        }
    }

    private static Object AudioAttributesCompatParcelizer(Object obj) {
        return buildMapSerializer.RemoteActionCompatParcelizer(obj);
    }

    private static Object IconCompatParcelizer(Object obj) {
        return buildMapSerializer.IconCompatParcelizer(obj);
    }

    private static Object read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Object obj) {
        return buildMapSerializer.read(audioAttributesCompatParcelizer.write, obj);
    }

    static final class AudioAttributesCompatParcelizer implements putObject {
        public final StdArraySerializersTypedPrimitiveArraySerializer AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public boolean read;
        public final List<StdKeySerializers.write> RemoteActionCompatParcelizer = new ArrayList();
        public final Object write = new Object();

        public AudioAttributesCompatParcelizer(StdKeySerializers stdKeySerializers, boolean z) {
            this.AudioAttributesCompatParcelizer = new StdArraySerializersTypedPrimitiveArraySerializer(stdKeySerializers, z);
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
            this.read = false;
            this.RemoteActionCompatParcelizer.clear();
        }

        @Override // kotlin.putObject
        public final Object AudioAttributesCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.putObject
        public final PolymorphicTypeValidator IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    static final class write {
        public final StdKeySerializers.IconCompatParcelizer IconCompatParcelizer;
        public final StdKeySerializers RemoteActionCompatParcelizer;
        public final IconCompatParcelizer read;

        public write(StdKeySerializers stdKeySerializers, StdKeySerializers.IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2) {
            this.RemoteActionCompatParcelizer = stdKeySerializers;
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.read = iconCompatParcelizer2;
        }
    }

    final class IconCompatParcelizer implements StdKeySerializer, PropertySerializerMapEmpty {
        private final AudioAttributesCompatParcelizer read;

        public IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.read = audioAttributesCompatParcelizer;
        }

        @Override // kotlin.StdKeySerializer
        public final void IconCompatParcelizer(int i, StdKeySerializers.write writeVar, final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o.buildAtomicReferenceSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.RemoteActionCompatParcelizer(pairIconCompatParcelizer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(Pair pair, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            BasicSerializerFactory.this.write.IconCompatParcelizer(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
        }

        @Override // kotlin.StdKeySerializer
        public final void read(int i, StdKeySerializers.write writeVar, final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o.AnyGetterWriter
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.write(pairIconCompatParcelizer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void write(Pair pair, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            BasicSerializerFactory.this.write.read(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
        }

        @Override // kotlin.StdKeySerializer
        public final void write(int i, StdKeySerializers.write writeVar, final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o._findKeySerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.IconCompatParcelizer(pairIconCompatParcelizer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void IconCompatParcelizer(Pair pair, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            BasicSerializerFactory.this.write.write(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second, stdDelegatingSerializer, stdArraySerializersShortArraySerializer);
        }

        @Override // kotlin.StdKeySerializer
        public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar, final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer, final IOException iOException, final boolean z) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o._checkMapContentInclusion
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.AudioAttributesCompatParcelizer(pairIconCompatParcelizer, stdDelegatingSerializer, stdArraySerializersShortArraySerializer, iOException, z);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(Pair pair, StdDelegatingSerializer stdDelegatingSerializer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer, IOException iOException, boolean z) {
            BasicSerializerFactory.this.write.AudioAttributesCompatParcelizer(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second, stdDelegatingSerializer, stdArraySerializersShortArraySerializer, iOException, z);
        }

        @Override // kotlin.StdKeySerializer
        public final void RemoteActionCompatParcelizer(int i, StdKeySerializers.write writeVar, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o.getAndFilter
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(pairIconCompatParcelizer, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(Pair pair, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            BasicSerializerFactory.this.write.RemoteActionCompatParcelizer(((Integer) pair.first).intValue(), (StdKeySerializers.write) buildTypeSerializer.IconCompatParcelizer((StdKeySerializers.write) pair.second), stdArraySerializersShortArraySerializer);
        }

        @Override // kotlin.StdKeySerializer
        public final void IconCompatParcelizer(int i, StdKeySerializers.write writeVar, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o.buildCollectionSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.write(pairIconCompatParcelizer, stdArraySerializersShortArraySerializer);
                    }
                });
            }
        }

        final /* synthetic */ void write(Pair pair, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
            BasicSerializerFactory.this.write.IconCompatParcelizer(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second, stdArraySerializersShortArraySerializer);
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void read(int i, StdKeySerializers.write writeVar, final int i2) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o._findInclusionWithContent
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.write(pairIconCompatParcelizer, i2);
                    }
                });
            }
        }

        final /* synthetic */ void write(Pair pair, int i) {
            BasicSerializerFactory.this.write.read(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second, i);
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o.ValueNode
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.IconCompatParcelizer(pairIconCompatParcelizer);
                    }
                });
            }
        }

        final /* synthetic */ void IconCompatParcelizer(Pair pair) {
            BasicSerializerFactory.this.write.AudioAttributesCompatParcelizer(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second);
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar, final Exception exc) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o.buildArraySerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.RemoteActionCompatParcelizer(pairIconCompatParcelizer, exc);
                    }
                });
            }
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(Pair pair, Exception exc) {
            BasicSerializerFactory.this.write.AudioAttributesCompatParcelizer(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second, exc);
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void RemoteActionCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o.buildContainerSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.AudioAttributesCompatParcelizer(pairIconCompatParcelizer);
                    }
                });
            }
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer(Pair pair) {
            BasicSerializerFactory.this.write.RemoteActionCompatParcelizer(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second);
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void read(int i, StdKeySerializers.write writeVar) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o._findContentSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.AudioAttributesCompatParcelizer.write(pairIconCompatParcelizer);
                    }
                });
            }
        }

        final /* synthetic */ void write(Pair pair) {
            BasicSerializerFactory.this.write.read(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second);
        }

        @Override // kotlin.PropertySerializerMapEmpty
        public final void write(int i, StdKeySerializers.write writeVar) {
            final Pair<Integer, StdKeySerializers.write> pairIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
            if (pairIconCompatParcelizer != null) {
                BasicSerializerFactory.this.RemoteActionCompatParcelizer.IconCompatParcelizer(new Runnable() { // from class: o.buildEnumSerializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.read(pairIconCompatParcelizer);
                    }
                });
            }
        }

        final /* synthetic */ void read(Pair pair) {
            BasicSerializerFactory.this.write.write(((Integer) pair.first).intValue(), (StdKeySerializers.write) pair.second);
        }

        private Pair<Integer, StdKeySerializers.write> IconCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            StdKeySerializers.write writeVar2 = null;
            if (writeVar != null) {
                StdKeySerializers.write writeVarRemoteActionCompatParcelizer = BasicSerializerFactory.RemoteActionCompatParcelizer(this.read, writeVar);
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return null;
                }
                writeVar2 = writeVarRemoteActionCompatParcelizer;
            }
            return Pair.create(Integer.valueOf(BasicSerializerFactory.write(this.read, i)), writeVar2);
        }
    }
}
