package kotlin;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class continueRead implements OggExtractor {
    private final Set<packetFinished<?>> AudioAttributesCompatParcelizer;
    private final Set<packetFinished<?>> AudioAttributesImplApi21Parcelizer;
    private final OggExtractor AudioAttributesImplApi26Parcelizer;
    private final Set<packetFinished<?>> IconCompatParcelizer;
    private final Set<packetFinished<?>> RemoteActionCompatParcelizer;
    private final Set<packetFinished<?>> read;
    private final Set<Class<?>> write;

    continueRead(FlacReaderFlacOggSeeker<?> flacReaderFlacOggSeeker, OggExtractor oggExtractor) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (convertGranuleToTime convertgranuletotime : flacReaderFlacOggSeeker.write()) {
            if (convertgranuletotime.write()) {
                if (convertgranuletotime.read()) {
                    hashSet4.add(convertgranuletotime.AudioAttributesCompatParcelizer());
                } else {
                    hashSet.add(convertgranuletotime.AudioAttributesCompatParcelizer());
                }
            } else if (convertgranuletotime.IconCompatParcelizer()) {
                hashSet3.add(convertgranuletotime.AudioAttributesCompatParcelizer());
            } else if (convertgranuletotime.read()) {
                hashSet5.add(convertgranuletotime.AudioAttributesCompatParcelizer());
            } else {
                hashSet2.add(convertgranuletotime.AudioAttributesCompatParcelizer());
            }
        }
        if (!flacReaderFlacOggSeeker.AudioAttributesCompatParcelizer().isEmpty()) {
            hashSet.add(packetFinished.read(flushHandlerThread.class));
        }
        this.RemoteActionCompatParcelizer = Collections.unmodifiableSet(hashSet);
        this.read = Collections.unmodifiableSet(hashSet2);
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableSet(hashSet3);
        this.IconCompatParcelizer = Collections.unmodifiableSet(hashSet4);
        this.AudioAttributesImplApi21Parcelizer = Collections.unmodifiableSet(hashSet5);
        this.write = flacReaderFlacOggSeeker.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = oggExtractor;
    }

    @Override // kotlin.OggExtractor
    public final <T> T read(Class<T> cls) {
        if (!this.RemoteActionCompatParcelizer.contains(packetFinished.read(cls))) {
            throw new VorbisReader(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.AudioAttributesImplApi26Parcelizer.read(cls);
        return !cls.equals(flushHandlerThread.class) ? t : (T) new IconCompatParcelizer(this.write, (flushHandlerThread) t);
    }

    @Override // kotlin.OggExtractor
    public final <T> T AudioAttributesCompatParcelizer(packetFinished<T> packetfinished) {
        if (!this.RemoteActionCompatParcelizer.contains(packetfinished)) {
            throw new VorbisReader(String.format("Attempting to request an undeclared dependency %s.", packetfinished));
        }
        return (T) this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(packetfinished);
    }

    @Override // kotlin.OggExtractor
    public final <T> onInputBufferAvailable<T> write(Class<T> cls) {
        return write(packetFinished.read(cls));
    }

    @Override // kotlin.OggExtractor
    public final <T> onFlushCompleted<T> IconCompatParcelizer(Class<T> cls) {
        return RemoteActionCompatParcelizer(packetFinished.read(cls));
    }

    @Override // kotlin.OggExtractor
    public final <T> onInputBufferAvailable<T> write(packetFinished<T> packetfinished) {
        if (!this.read.contains(packetfinished)) {
            throw new VorbisReader(String.format("Attempting to request an undeclared dependency Provider<%s>.", packetfinished));
        }
        return this.AudioAttributesImplApi26Parcelizer.write(packetfinished);
    }

    @Override // kotlin.OggExtractor
    public final <T> onFlushCompleted<T> RemoteActionCompatParcelizer(packetFinished<T> packetfinished) {
        if (!this.AudioAttributesCompatParcelizer.contains(packetfinished)) {
            throw new VorbisReader(String.format("Attempting to request an undeclared dependency Deferred<%s>.", packetfinished));
        }
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(packetfinished);
    }

    @Override // kotlin.OggExtractor
    public final <T> onInputBufferAvailable<Set<T>> read(packetFinished<T> packetfinished) {
        if (!this.AudioAttributesImplApi21Parcelizer.contains(packetfinished)) {
            throw new VorbisReader(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", packetfinished));
        }
        return this.AudioAttributesImplApi26Parcelizer.read(packetfinished);
    }

    @Override // kotlin.OggExtractor
    public final <T> Set<T> IconCompatParcelizer(packetFinished<T> packetfinished) {
        if (!this.IconCompatParcelizer.contains(packetfinished)) {
            throw new VorbisReader(String.format("Attempting to request an undeclared dependency Set<%s>.", packetfinished));
        }
        return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(packetfinished);
    }

    static class IconCompatParcelizer implements flushHandlerThread {
        private final Set<Class<?>> AudioAttributesCompatParcelizer;
        private final flushHandlerThread read;

        public IconCompatParcelizer(Set<Class<?>> set, flushHandlerThread flushhandlerthread) {
            this.AudioAttributesCompatParcelizer = set;
            this.read = flushhandlerthread;
        }
    }
}
