package kotlin;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class FlacReaderFlacOggSeeker<T> {
    private final Set<convertGranuleToTime> AudioAttributesCompatParcelizer;
    private final Set<Class<?>> AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final Set<packetFinished<? super T>> read;
    private final OggPageHeader<T> write;

    static /* synthetic */ Object IconCompatParcelizer(Object obj) {
        return obj;
    }

    static /* synthetic */ Object read(Object obj) {
        return obj;
    }

    /* synthetic */ FlacReaderFlacOggSeeker(String str, Set set, Set set2, int i, int i2, OggPageHeader oggPageHeader, Set set3, byte b) {
        this(str, set, set2, i, i2, oggPageHeader, set3);
    }

    private FlacReaderFlacOggSeeker(String str, Set<packetFinished<? super T>> set, Set<convertGranuleToTime> set2, int i, int i2, OggPageHeader<T> oggPageHeader, Set<Class<?>> set3) {
        this.IconCompatParcelizer = str;
        this.read = Collections.unmodifiableSet(set);
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableSet(set2);
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.write = oggPageHeader;
        this.AudioAttributesImplApi21Parcelizer = Collections.unmodifiableSet(set3);
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final Set<packetFinished<? super T>> IconCompatParcelizer() {
        return this.read;
    }

    public final Set<convertGranuleToTime> write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final OggPageHeader<T> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final Set<Class<?>> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer == 1;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer == 2;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer == 0;
    }

    public final FlacReaderFlacOggSeeker<T> write(OggPageHeader<T> oggPageHeader) {
        return new FlacReaderFlacOggSeeker<>(this.IconCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, oggPageHeader, this.AudioAttributesImplApi21Parcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.read.toArray()));
        sb.append(">{");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", type=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.AudioAttributesCompatParcelizer.toArray()));
        sb.append("}");
        return sb.toString();
    }

    public static <T> read<T> read(Class<T> cls) {
        return new read<>((Class) cls, new Class[0], (byte) 0);
    }

    @SafeVarargs
    public static <T> read<T> RemoteActionCompatParcelizer(Class<T> cls, Class<? super T>... clsArr) {
        return new read<>((Class) cls, (Class[]) clsArr, (byte) 0);
    }

    public static <T> read<T> read(packetFinished<T> packetfinished) {
        return new read<>((packetFinished) packetfinished, new packetFinished[0], (byte) 0);
    }

    @SafeVarargs
    public static <T> read<T> RemoteActionCompatParcelizer(packetFinished<T> packetfinished, packetFinished<? super T>... packetfinishedArr) {
        return new read<>((packetFinished) packetfinished, (packetFinished[]) packetfinishedArr, (byte) 0);
    }

    @SafeVarargs
    public static <T> FlacReaderFlacOggSeeker<T> write(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return RemoteActionCompatParcelizer(cls, clsArr).write(new OggPageHeader() { // from class: o.OggExtractorExternalSyntheticLambda0
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return FlacReaderFlacOggSeeker.read(t);
            }
        }).read();
    }

    public static <T> read<T> IconCompatParcelizer(Class<T> cls) {
        return read((Class) cls).write();
    }

    public static <T> FlacReaderFlacOggSeeker<T> write(final T t, Class<T> cls) {
        return IconCompatParcelizer((Class) cls).write(new OggPageHeader() { // from class: o.readHeaders
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return FlacReaderFlacOggSeeker.IconCompatParcelizer(t);
            }
        }).read();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class read<T> {
        private final Set<packetFinished<? super T>> AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private final Set<Class<?>> AudioAttributesImplBaseParcelizer;
        private String IconCompatParcelizer;
        private OggPageHeader<T> RemoteActionCompatParcelizer;
        private int read;
        private final Set<convertGranuleToTime> write;

        /* synthetic */ read(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }

        /* synthetic */ read(packetFinished packetfinished, packetFinished[] packetfinishedArr, byte b) {
            this(packetfinished, packetfinishedArr);
        }

        @SafeVarargs
        private read(Class<T> cls, Class<? super T>... clsArr) {
            this.IconCompatParcelizer = null;
            HashSet hashSet = new HashSet();
            this.AudioAttributesCompatParcelizer = hashSet;
            this.write = new HashSet();
            this.read = 0;
            this.AudioAttributesImplApi21Parcelizer = 0;
            this.AudioAttributesImplBaseParcelizer = new HashSet();
            skipToNextSync.write(cls, "Null interface");
            hashSet.add(packetFinished.read(cls));
            for (Class<? super T> cls2 : clsArr) {
                skipToNextSync.write(cls2, "Null interface");
                this.AudioAttributesCompatParcelizer.add(packetFinished.read(cls2));
            }
        }

        @SafeVarargs
        private read(packetFinished<T> packetfinished, packetFinished<? super T>... packetfinishedArr) {
            this.IconCompatParcelizer = null;
            HashSet hashSet = new HashSet();
            this.AudioAttributesCompatParcelizer = hashSet;
            this.write = new HashSet();
            this.read = 0;
            this.AudioAttributesImplApi21Parcelizer = 0;
            this.AudioAttributesImplBaseParcelizer = new HashSet();
            skipToNextSync.write(packetfinished, "Null interface");
            hashSet.add(packetfinished);
            for (packetFinished<? super T> packetfinished2 : packetfinishedArr) {
                skipToNextSync.write(packetfinished2, "Null interface");
            }
            Collections.addAll(this.AudioAttributesCompatParcelizer, packetfinishedArr);
        }

        public final read<T> IconCompatParcelizer(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }

        public final read<T> RemoteActionCompatParcelizer(convertGranuleToTime convertgranuletotime) {
            skipToNextSync.write(convertgranuletotime, "Null dependency");
            AudioAttributesCompatParcelizer(convertgranuletotime.AudioAttributesCompatParcelizer());
            this.write.add(convertgranuletotime);
            return this;
        }

        public final read<T> AudioAttributesCompatParcelizer() {
            return RemoteActionCompatParcelizer(1);
        }

        public final read<T> IconCompatParcelizer() {
            return RemoteActionCompatParcelizer(2);
        }

        private read<T> RemoteActionCompatParcelizer(int i) {
            skipToNextSync.RemoteActionCompatParcelizer(this.read == 0, "Instantiation type has already been set.");
            this.read = i;
            return this;
        }

        private void AudioAttributesCompatParcelizer(packetFinished<?> packetfinished) {
            skipToNextSync.read(!this.AudioAttributesCompatParcelizer.contains(packetfinished), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final read<T> write(OggPageHeader<T> oggPageHeader) {
            this.RemoteActionCompatParcelizer = (OggPageHeader) skipToNextSync.write(oggPageHeader, "Null factory");
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public read<T> write() {
            this.AudioAttributesImplApi21Parcelizer = 1;
            return this;
        }

        public final FlacReaderFlacOggSeeker<T> read() {
            skipToNextSync.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer != null, "Missing required property: factory.");
            return new FlacReaderFlacOggSeeker<>(this.IconCompatParcelizer, new HashSet(this.AudioAttributesCompatParcelizer), new HashSet(this.write), this.read, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, (byte) 0);
        }
    }
}
