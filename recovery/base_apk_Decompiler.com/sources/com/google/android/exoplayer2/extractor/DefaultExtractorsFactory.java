package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.jpeg.JpegExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.Ac4Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final ExtensionLoader FLAC_EXTENSION_LOADER = new ExtensionLoader(new ExtensionLoader.ConstructorSupplier() { // from class: com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final Constructor getConstructor() {
            return DefaultExtractorsFactory.getFlacExtractorConstructor();
        }
    });
    private static final ExtensionLoader MIDI_EXTENSION_LOADER = new ExtensionLoader(new ExtensionLoader.ConstructorSupplier() { // from class: com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda1
        @Override // com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final Constructor getConstructor() {
            return DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    });
    private int adtsFlags;
    private int amrFlags;
    private boolean constantBitrateSeekingAlwaysEnabled;
    private boolean constantBitrateSeekingEnabled;
    private int flacFlags;
    private int fragmentedMp4Flags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private int tsFlags;
    private initExtraTracks<Format> tsSubtitleFormats;
    private int tsMode = 1;
    private int tsTimestampSearchBytes = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;

    public final DefaultExtractorsFactory setConstantBitrateSeekingEnabled(boolean z) {
        synchronized (this) {
            this.constantBitrateSeekingEnabled = z;
        }
        return this;
    }

    public final DefaultExtractorsFactory setConstantBitrateSeekingAlwaysEnabled(boolean z) {
        synchronized (this) {
            this.constantBitrateSeekingAlwaysEnabled = z;
        }
        return this;
    }

    public final DefaultExtractorsFactory setAdtsExtractorFlags(int i) {
        synchronized (this) {
            this.adtsFlags = i;
        }
        return this;
    }

    public final DefaultExtractorsFactory setAmrExtractorFlags(int i) {
        synchronized (this) {
            this.amrFlags = i;
        }
        return this;
    }

    public final DefaultExtractorsFactory setFlacExtractorFlags(int i) {
        synchronized (this) {
            this.flacFlags = i;
        }
        return this;
    }

    public final DefaultExtractorsFactory setMatroskaExtractorFlags(int i) {
        synchronized (this) {
            this.matroskaFlags = i;
        }
        return this;
    }

    public final DefaultExtractorsFactory setMp4ExtractorFlags(int i) {
        synchronized (this) {
            this.mp4Flags = i;
        }
        return this;
    }

    public final DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int i) {
        synchronized (this) {
            this.fragmentedMp4Flags = i;
        }
        return this;
    }

    public final DefaultExtractorsFactory setMp3ExtractorFlags(int i) {
        synchronized (this) {
            this.mp3Flags = i;
        }
        return this;
    }

    public final DefaultExtractorsFactory setTsExtractorMode(int i) {
        synchronized (this) {
            this.tsMode = i;
        }
        return this;
    }

    public final DefaultExtractorsFactory setTsExtractorFlags(int i) {
        synchronized (this) {
            this.tsFlags = i;
        }
        return this;
    }

    public final DefaultExtractorsFactory setTsSubtitleFormats(List<Format> list) {
        synchronized (this) {
            this.tsSubtitleFormats = initExtraTracks.write(list);
        }
        return this;
    }

    public final DefaultExtractorsFactory setTsExtractorTimestampSearchBytes(int i) {
        synchronized (this) {
            this.tsTimestampSearchBytes = i;
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] extractorArrCreateExtractors;
        synchronized (this) {
            extractorArrCreateExtractors = createExtractors(Uri.EMPTY, new HashMap());
        }
        return extractorArrCreateExtractors;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public final Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        Extractor[] extractorArr;
        synchronized (this) {
            int[] iArr = DEFAULT_EXTRACTOR_ORDER;
            ArrayList arrayList = new ArrayList(iArr.length);
            int iInferFileTypeFromResponseHeaders = FileTypes.inferFileTypeFromResponseHeaders(map);
            if (iInferFileTypeFromResponseHeaders != -1) {
                addExtractorsForFileType(iInferFileTypeFromResponseHeaders, arrayList);
            }
            int iInferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
            if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
                addExtractorsForFileType(iInferFileTypeFromUri, arrayList);
            }
            for (int i : iArr) {
                if (i != iInferFileTypeFromResponseHeaders && i != iInferFileTypeFromUri) {
                    addExtractorsForFileType(i, arrayList);
                }
            }
            extractorArr = (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
        }
        return extractorArr;
    }

    private void addExtractorsForFileType(int i, List<Extractor> list) {
        switch (i) {
            case 0:
                list.add(new Ac3Extractor());
                break;
            case 1:
                list.add(new Ac4Extractor());
                break;
            case 2:
                list.add(new AdtsExtractor(this.adtsFlags | (this.constantBitrateSeekingEnabled ? 1 : 0) | (this.constantBitrateSeekingAlwaysEnabled ? 2 : 0)));
                break;
            case 3:
                list.add(new AmrExtractor(this.amrFlags | (this.constantBitrateSeekingEnabled ? 1 : 0) | (this.constantBitrateSeekingAlwaysEnabled ? 2 : 0)));
                break;
            case 4:
                Extractor extractor = FLAC_EXTENSION_LOADER.getExtractor(Integer.valueOf(this.flacFlags));
                if (extractor != null) {
                    list.add(extractor);
                } else {
                    list.add(new FlacExtractor(this.flacFlags));
                }
                break;
            case 5:
                list.add(new FlvExtractor());
                break;
            case 6:
                list.add(new MatroskaExtractor(this.matroskaFlags));
                break;
            case 7:
                list.add(new Mp3Extractor(this.mp3Flags | (this.constantBitrateSeekingEnabled ? 1 : 0) | (this.constantBitrateSeekingAlwaysEnabled ? 2 : 0)));
                break;
            case 8:
                list.add(new FragmentedMp4Extractor(this.fragmentedMp4Flags));
                list.add(new Mp4Extractor(this.mp4Flags));
                break;
            case 9:
                list.add(new OggExtractor());
                break;
            case 10:
                list.add(new PsExtractor());
                break;
            case 11:
                if (this.tsSubtitleFormats == null) {
                    this.tsSubtitleFormats = initExtraTracks.AudioAttributesImplApi26Parcelizer();
                }
                list.add(new TsExtractor(this.tsMode, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(this.tsFlags, this.tsSubtitleFormats), this.tsTimestampSearchBytes));
                break;
            case 12:
                list.add(new WavExtractor());
                break;
            case 14:
                list.add(new JpegExtractor());
                break;
            case 15:
                Extractor extractor2 = MIDI_EXTENSION_LOADER.getExtractor(new Object[0]);
                if (extractor2 != null) {
                    list.add(extractor2);
                }
                break;
            case 16:
                list.add(new AviExtractor());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends Extractor> getMidiExtractorConstructor() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(Extractor.class).getConstructor(new Class[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends Extractor> getFlacExtractorConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    static final class ExtensionLoader {
        private final ConstructorSupplier constructorSupplier;
        private final AtomicBoolean extensionLoaded = new AtomicBoolean(false);
        private Constructor<? extends Extractor> extractorConstructor;

        public interface ConstructorSupplier {
            Constructor<? extends Extractor> getConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public ExtensionLoader(ConstructorSupplier constructorSupplier) {
            this.constructorSupplier = constructorSupplier;
        }

        public final Extractor getExtractor(Object... objArr) {
            Constructor<? extends Extractor> constructorMaybeLoadExtractorConstructor = maybeLoadExtractorConstructor();
            if (constructorMaybeLoadExtractorConstructor == null) {
                return null;
            }
            try {
                return constructorMaybeLoadExtractorConstructor.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        private Constructor<? extends Extractor> maybeLoadExtractorConstructor() {
            synchronized (this.extensionLoaded) {
                if (this.extensionLoaded.get()) {
                    return this.extractorConstructor;
                }
                try {
                    return this.constructorSupplier.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.extensionLoaded.set(true);
                    return this.extractorConstructor;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }
}
