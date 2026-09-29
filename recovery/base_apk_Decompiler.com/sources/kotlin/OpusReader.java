package kotlin;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.OpusReader;

/* JADX INFO: loaded from: classes.dex */
public final class OpusReader implements OggExtractor, createThreadLabel {
    private static final onInputBufferAvailable<Set<Object>> write = new onInputBufferAvailable() { // from class: o.StreamReader
        @Override // kotlin.onInputBufferAvailable
        public final Object write() {
            return Collections.emptySet();
        }
    };
    private final AtomicReference<Boolean> AudioAttributesCompatParcelizer;
    private final Map<packetFinished<?>, onInputBufferAvailable<?>> AudioAttributesImplApi21Parcelizer;
    private final Map<packetFinished<?>, Ac3Extractor<?>> AudioAttributesImplApi26Parcelizer;
    private final getPageHeader IconCompatParcelizer;
    private final List<onInputBufferAvailable<ComponentRegistrar>> MediaBrowserCompatItemReceiver;
    private final Map<FlacReaderFlacOggSeeker<?>, onInputBufferAvailable<?>> RemoteActionCompatParcelizer;
    private final StreamReaderUnseekableOggSeeker read;

    /* synthetic */ OpusReader(Executor executor, Iterable iterable, Collection collection, getPageHeader getpageheader, byte b) {
        this(executor, iterable, collection, getpageheader);
    }

    public static write RemoteActionCompatParcelizer(Executor executor) {
        return new write(executor);
    }

    private OpusReader(Executor executor, Iterable<onInputBufferAvailable<ComponentRegistrar>> iterable, Collection<FlacReaderFlacOggSeeker<?>> collection, getPageHeader getpageheader) {
        this.RemoteActionCompatParcelizer = new HashMap();
        this.AudioAttributesImplApi21Parcelizer = new HashMap();
        this.AudioAttributesImplApi26Parcelizer = new HashMap();
        this.AudioAttributesCompatParcelizer = new AtomicReference<>();
        StreamReaderUnseekableOggSeeker streamReaderUnseekableOggSeeker = new StreamReaderUnseekableOggSeeker(executor);
        this.read = streamReaderUnseekableOggSeeker;
        this.IconCompatParcelizer = getpageheader;
        ArrayList arrayList = new ArrayList();
        arrayList.add(FlacReaderFlacOggSeeker.write(streamReaderUnseekableOggSeeker, StreamReaderUnseekableOggSeeker.class, AsynchronousMediaCodecBufferEnqueuerMessageParams.class, flushHandlerThread.class));
        arrayList.add(FlacReaderFlacOggSeeker.write(this, createThreadLabel.class, new Class[0]));
        for (FlacReaderFlacOggSeeker<?> flacReaderFlacOggSeeker : collection) {
            if (flacReaderFlacOggSeeker != null) {
                arrayList.add(flacReaderFlacOggSeeker);
            }
        }
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(iterable);
        AudioAttributesCompatParcelizer((List<FlacReaderFlacOggSeeker<?>>) arrayList);
    }

    private void AudioAttributesCompatParcelizer(List<FlacReaderFlacOggSeeker<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<onInputBufferAvailable<ComponentRegistrar>> it = this.MediaBrowserCompatItemReceiver.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrarWrite = it.next().write();
                    if (componentRegistrarWrite != null) {
                        list.addAll(this.IconCompatParcelizer.write(componentRegistrarWrite));
                        it.remove();
                    }
                } catch (StreamReaderSetupData unused) {
                    it.remove();
                }
            }
            if (this.RemoteActionCompatParcelizer.isEmpty()) {
                convertTimeToGranule.AudioAttributesCompatParcelizer(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.RemoteActionCompatParcelizer.keySet());
                arrayList2.addAll(list);
                convertTimeToGranule.AudioAttributesCompatParcelizer(arrayList2);
            }
            for (final FlacReaderFlacOggSeeker<?> flacReaderFlacOggSeeker : list) {
                this.RemoteActionCompatParcelizer.put(flacReaderFlacOggSeeker, new appendNumberOfSamples(new onInputBufferAvailable() { // from class: o.skipToNextPage
                    @Override // kotlin.onInputBufferAvailable
                    public final Object write() {
                        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(flacReaderFlacOggSeeker);
                    }
                }));
            }
            arrayList.addAll(RemoteActionCompatParcelizer(list));
            arrayList.addAll(RemoteActionCompatParcelizer());
            read();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        IconCompatParcelizer();
    }

    final /* synthetic */ Object RemoteActionCompatParcelizer(FlacReaderFlacOggSeeker flacReaderFlacOggSeeker) {
        return flacReaderFlacOggSeeker.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(new continueRead(flacReaderFlacOggSeeker, this));
    }

    private void IconCompatParcelizer() {
        Boolean bool = this.AudioAttributesCompatParcelizer.get();
        if (bool != null) {
            AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, bool.booleanValue());
        }
    }

    private static <T> List<T> AudioAttributesCompatParcelizer(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private List<Runnable> RemoteActionCompatParcelizer(List<FlacReaderFlacOggSeeker<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (FlacReaderFlacOggSeeker<?> flacReaderFlacOggSeeker : list) {
            if (flacReaderFlacOggSeeker.AudioAttributesImplApi21Parcelizer()) {
                final onInputBufferAvailable<?> oninputbufferavailable = this.RemoteActionCompatParcelizer.get(flacReaderFlacOggSeeker);
                for (packetFinished<? super Object> packetfinished : flacReaderFlacOggSeeker.IconCompatParcelizer()) {
                    if (!this.AudioAttributesImplApi21Parcelizer.containsKey(packetfinished)) {
                        this.AudioAttributesImplApi21Parcelizer.put(packetfinished, oninputbufferavailable);
                    } else {
                        final Ac3ExtractorExternalSyntheticLambda0 ac3ExtractorExternalSyntheticLambda0 = (Ac3ExtractorExternalSyntheticLambda0) this.AudioAttributesImplApi21Parcelizer.get(packetfinished);
                        arrayList.add(new Runnable() { // from class: o.OggSeeker
                            @Override // java.lang.Runnable
                            public final void run() {
                                ac3ExtractorExternalSyntheticLambda0.IconCompatParcelizer(oninputbufferavailable);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<FlacReaderFlacOggSeeker<?>, onInputBufferAvailable<?>> entry : this.RemoteActionCompatParcelizer.entrySet()) {
            FlacReaderFlacOggSeeker<?> key = entry.getKey();
            if (!key.AudioAttributesImplApi21Parcelizer()) {
                onInputBufferAvailable<?> value = entry.getValue();
                for (packetFinished<? super Object> packetfinished : key.IconCompatParcelizer()) {
                    if (!map.containsKey(packetfinished)) {
                        map.put(packetfinished, new HashSet());
                    }
                    ((Set) map.get(packetfinished)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!this.AudioAttributesImplApi26Parcelizer.containsKey(entry2.getKey())) {
                this.AudioAttributesImplApi26Parcelizer.put((packetFinished) entry2.getKey(), Ac3Extractor.AudioAttributesCompatParcelizer((Collection<onInputBufferAvailable<?>>) entry2.getValue()));
            } else {
                final Ac3Extractor<?> ac3Extractor = this.AudioAttributesImplApi26Parcelizer.get(entry2.getKey());
                for (final onInputBufferAvailable oninputbufferavailable : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: o.readPayload
                        @Override // java.lang.Runnable
                        public final void run() {
                            ac3Extractor.AudioAttributesCompatParcelizer(oninputbufferavailable);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.OggExtractor
    public final <T> onInputBufferAvailable<T> write(packetFinished<T> packetfinished) {
        onInputBufferAvailable<T> oninputbufferavailable;
        synchronized (this) {
            skipToNextSync.write(packetfinished, "Null interface requested.");
            oninputbufferavailable = (onInputBufferAvailable) this.AudioAttributesImplApi21Parcelizer.get(packetfinished);
        }
        return oninputbufferavailable;
    }

    @Override // kotlin.OggExtractor
    public final <T> onFlushCompleted<T> RemoteActionCompatParcelizer(packetFinished<T> packetfinished) {
        onInputBufferAvailable<T> oninputbufferavailableWrite = write(packetfinished);
        if (oninputbufferavailableWrite == null) {
            return Ac3ExtractorExternalSyntheticLambda0.IconCompatParcelizer();
        }
        if (oninputbufferavailableWrite instanceof Ac3ExtractorExternalSyntheticLambda0) {
            return (Ac3ExtractorExternalSyntheticLambda0) oninputbufferavailableWrite;
        }
        return Ac3ExtractorExternalSyntheticLambda0.AudioAttributesCompatParcelizer(oninputbufferavailableWrite);
    }

    @Override // kotlin.OggExtractor
    public final <T> onInputBufferAvailable<Set<T>> read(packetFinished<T> packetfinished) {
        synchronized (this) {
            Ac3Extractor<?> ac3Extractor = this.AudioAttributesImplApi26Parcelizer.get(packetfinished);
            if (ac3Extractor != null) {
                return ac3Extractor;
            }
            return (onInputBufferAvailable<Set<T>>) write;
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        HashMap map;
        if (setBackInvokedCallbackEnabled.read(this.AudioAttributesCompatParcelizer, null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.RemoteActionCompatParcelizer);
            }
            AudioAttributesCompatParcelizer(map, z);
        }
    }

    private void AudioAttributesCompatParcelizer(Map<FlacReaderFlacOggSeeker<?>, onInputBufferAvailable<?>> map, boolean z) {
        for (Map.Entry<FlacReaderFlacOggSeeker<?>, onInputBufferAvailable<?>> entry : map.entrySet()) {
            FlacReaderFlacOggSeeker<?> key = entry.getKey();
            onInputBufferAvailable<?> value = entry.getValue();
            if (key.MediaBrowserCompatCustomActionResultReceiver() || (key.MediaBrowserCompatItemReceiver() && z)) {
                value.write();
            }
        }
        this.read.AudioAttributesCompatParcelizer();
    }

    private void read() {
        for (FlacReaderFlacOggSeeker<?> flacReaderFlacOggSeeker : this.RemoteActionCompatParcelizer.keySet()) {
            for (convertGranuleToTime convertgranuletotime : flacReaderFlacOggSeeker.write()) {
                if (convertgranuletotime.read() && !this.AudioAttributesImplApi26Parcelizer.containsKey(convertgranuletotime.AudioAttributesCompatParcelizer())) {
                    this.AudioAttributesImplApi26Parcelizer.put(convertgranuletotime.AudioAttributesCompatParcelizer(), Ac3Extractor.AudioAttributesCompatParcelizer(Collections.emptySet()));
                } else if (this.AudioAttributesImplApi21Parcelizer.containsKey(convertgranuletotime.AudioAttributesCompatParcelizer())) {
                    continue;
                } else {
                    if (convertgranuletotime.RemoteActionCompatParcelizer()) {
                        throw new VorbisReaderVorbisSetup(String.format("Unsatisfied dependency for component %s: %s", flacReaderFlacOggSeeker, convertgranuletotime.AudioAttributesCompatParcelizer()));
                    }
                    if (!convertgranuletotime.read()) {
                        this.AudioAttributesImplApi21Parcelizer.put(convertgranuletotime.AudioAttributesCompatParcelizer(), Ac3ExtractorExternalSyntheticLambda0.IconCompatParcelizer());
                    }
                }
            }
        }
    }

    public static final class write {
        private final Executor write;
        private final List<onInputBufferAvailable<ComponentRegistrar>> IconCompatParcelizer = new ArrayList();
        private final List<FlacReaderFlacOggSeeker<?>> read = new ArrayList();
        private getPageHeader RemoteActionCompatParcelizer = getPageHeader.RemoteActionCompatParcelizer;

        static /* synthetic */ ComponentRegistrar write(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        write(Executor executor) {
            this.write = executor;
        }

        public final write write(Collection<onInputBufferAvailable<ComponentRegistrar>> collection) {
            this.IconCompatParcelizer.addAll(collection);
            return this;
        }

        public final write read(final ComponentRegistrar componentRegistrar) {
            this.IconCompatParcelizer.add(new onInputBufferAvailable() { // from class: o.onSeekEnd
                @Override // kotlin.onInputBufferAvailable
                public final Object write() {
                    return OpusReader.write.write(componentRegistrar);
                }
            });
            return this;
        }

        public final write RemoteActionCompatParcelizer(FlacReaderFlacOggSeeker<?> flacReaderFlacOggSeeker) {
            this.read.add(flacReaderFlacOggSeeker);
            return this;
        }

        public final write RemoteActionCompatParcelizer(getPageHeader getpageheader) {
            this.RemoteActionCompatParcelizer = getpageheader;
            return this;
        }

        public final OpusReader IconCompatParcelizer() {
            return new OpusReader(this.write, this.IconCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }
}
