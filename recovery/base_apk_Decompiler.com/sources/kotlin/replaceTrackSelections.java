package kotlin;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public final class replaceTrackSelections {
    public static final isAfterLast AudioAttributesCompatParcelizer;
    public static final isAfterLast AudioAttributesImplApi21Parcelizer;
    public static final isAfterLast AudioAttributesImplApi26Parcelizer;
    public static final isAfterLast AudioAttributesImplBaseParcelizer;
    public static final isBeforeFirst<BigDecimal> IconCompatParcelizer;
    public static final isBeforeFirst<Boolean> MediaBrowserCompatItemReceiver;
    public static final isBeforeFirst<Number> MediaBrowserCompatSearchResultReceiver;
    public static final isAfterLast MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public static final isAfterLast MediaDescriptionCompat;
    public static final isAfterLast MediaMetadataCompat;
    public static final isAfterLast RatingCompat;
    public static final isAfterLast RemoteActionCompatParcelizer;
    public static final isBeforeFirst<getCount> handleMediaPlayPauseIfPendingOnHandler;
    public static final isAfterLast onAddQueueItem;
    public static final isBeforeFirst<Number> onCommand;
    public static final isAfterLast onCustomAction;
    public static final isAfterLast onFastForward;
    public static final isBeforeFirst<Number> onMediaButtonEvent;
    public static final isAfterLast onPause;
    public static final isBeforeFirst<addTrackSelectionInternal> onPlay;
    public static final isAfterLast onPlayFromMediaId;
    public static final isAfterLast onPlayFromSearch;
    public static final isAfterLast onPlayFromUri;
    public static final isAfterLast onPrepare;
    public static final isAfterLast onPrepareFromMediaId;
    public static final isAfterLast onPrepareFromSearch;
    public static final isBeforeFirst<BigInteger> read;
    public static final isAfterLast write;
    public static final isAfterLast MediaBrowserCompatMediaItem = read(Class.class, new isBeforeFirst<Class>() { // from class: o.replaceTrackSelections.5
        @Override // kotlin.isBeforeFirst
        public final /* synthetic */ Class AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            return IconCompatParcelizer();
        }

        @Override // kotlin.isBeforeFirst
        public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Class cls) throws IOException {
            AudioAttributesCompatParcelizer(cls);
        }

        private static void AudioAttributesCompatParcelizer(Class cls) throws IOException {
            StringBuilder sb = new StringBuilder("Attempted to serialize java.lang.Class: ");
            sb.append(cls.getName());
            sb.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sb.toString());
        }

        private static Class IconCompatParcelizer() throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }.read());
    public static final isAfterLast MediaBrowserCompatCustomActionResultReceiver = read(BitSet.class, new isBeforeFirst<BitSet>() { // from class: o.replaceTrackSelections.14
        @Override // kotlin.isBeforeFirst
        public final /* synthetic */ BitSet AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            return RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        }

        @Override // kotlin.isBeforeFirst
        public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, BitSet bitSet) throws IOException {
            AudioAttributesCompatParcelizer(downloadHelper2, bitSet);
        }

        private static BitSet RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            BitSet bitSet = new BitSet();
            downloadHelperExternalSyntheticLambda4.read();
            DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = downloadHelperExternalSyntheticLambda4.onCustomAction();
            int i = 0;
            while (downloadHelperExternalSyntheticLambda2OnCustomAction != DownloadHelperExternalSyntheticLambda2.END_ARRAY) {
                int i2 = AnonymousClass30.AudioAttributesCompatParcelizer[downloadHelperExternalSyntheticLambda2OnCustomAction.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    int iMediaBrowserCompatItemReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                    if (iMediaBrowserCompatItemReceiver != 0) {
                        if (iMediaBrowserCompatItemReceiver != 1) {
                            StringBuilder sb = new StringBuilder("Invalid bitset value ");
                            sb.append(iMediaBrowserCompatItemReceiver);
                            sb.append(", expected 0 or 1; at path ");
                            sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                            throw new getPercentDownloaded(sb.toString());
                        }
                        bitSet.set(i);
                    } else {
                        continue;
                    }
                } else if (i2 == 3) {
                    if (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer()) {
                        bitSet.set(i);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid bitset value type: ");
                    sb2.append(downloadHelperExternalSyntheticLambda2OnCustomAction);
                    sb2.append("; at path ");
                    sb2.append(downloadHelperExternalSyntheticLambda4.write());
                    throw new getPercentDownloaded(sb2.toString());
                }
                i++;
                downloadHelperExternalSyntheticLambda2OnCustomAction = downloadHelperExternalSyntheticLambda4.onCustomAction();
            }
            downloadHelperExternalSyntheticLambda4.IconCompatParcelizer();
            return bitSet;
        }

        private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, BitSet bitSet) throws IOException {
            downloadHelper2.write();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                downloadHelper2.write(bitSet.get(i) ? 1L : 0L);
            }
            downloadHelper2.AudioAttributesCompatParcelizer();
        }
    }.read());

    static {
        isBeforeFirst<Boolean> isbeforefirst = new isBeforeFirst<Boolean>() { // from class: o.replaceTrackSelections.24
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Boolean AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return write(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* bridge */ /* synthetic */ void read(DownloadHelper2 downloadHelper2, Boolean bool) throws IOException {
                read2(downloadHelper2, bool);
            }

            private static Boolean write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = downloadHelperExternalSyntheticLambda4.onCustomAction();
                if (downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                if (downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver()));
                }
                return Boolean.valueOf(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
            }

            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            private static void read2(DownloadHelper2 downloadHelper2, Boolean bool) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(bool);
            }
        };
        MediaBrowserCompatItemReceiver = new isBeforeFirst<Boolean>() { // from class: o.replaceTrackSelections.26
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Boolean AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* bridge */ /* synthetic */ void read(DownloadHelper2 downloadHelper2, Boolean bool) throws IOException {
                read2(downloadHelper2, bool);
            }

            private static Boolean IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                return Boolean.valueOf(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver());
            }

            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            private static void read2(DownloadHelper2 downloadHelper2, Boolean bool) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(bool == null ? "null" : bool.toString());
            }
        };
        AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(Boolean.TYPE, Boolean.class, isbeforefirst);
        AudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer(Byte.TYPE, Byte.class, new isBeforeFirst<Number>() { // from class: o.replaceTrackSelections.29
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                write(downloadHelper2, number);
            }

            private static Number RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                try {
                    int iMediaBrowserCompatItemReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                    if (iMediaBrowserCompatItemReceiver > 255 || iMediaBrowserCompatItemReceiver < -128) {
                        StringBuilder sb = new StringBuilder("Lossy conversion from ");
                        sb.append(iMediaBrowserCompatItemReceiver);
                        sb.append(" to byte; at path ");
                        sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                        throw new getPercentDownloaded(sb.toString());
                    }
                    return Byte.valueOf((byte) iMediaBrowserCompatItemReceiver);
                } catch (NumberFormatException e) {
                    throw new getPercentDownloaded(e);
                }
            }

            private static void write(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                if (number == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    downloadHelper2.write(number.byteValue());
                }
            }
        });
        onPause = RemoteActionCompatParcelizer(Short.TYPE, Short.class, new isBeforeFirst<Number>() { // from class: o.replaceTrackSelections.35
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, number);
            }

            private static Number IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                try {
                    int iMediaBrowserCompatItemReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                    if (iMediaBrowserCompatItemReceiver > 65535 || iMediaBrowserCompatItemReceiver < -32768) {
                        StringBuilder sb = new StringBuilder("Lossy conversion from ");
                        sb.append(iMediaBrowserCompatItemReceiver);
                        sb.append(" to short; at path ");
                        sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                        throw new getPercentDownloaded(sb.toString());
                    }
                    return Short.valueOf((short) iMediaBrowserCompatItemReceiver);
                } catch (NumberFormatException e) {
                    throw new getPercentDownloaded(e);
                }
            }

            private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                if (number == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    downloadHelper2.write(number.shortValue());
                }
            }
        });
        onAddQueueItem = RemoteActionCompatParcelizer(Integer.TYPE, Integer.class, new isBeforeFirst<Number>() { // from class: o.replaceTrackSelections.33
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return write(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                write(downloadHelper2, number);
            }

            private static Number write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                try {
                    return Integer.valueOf(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver());
                } catch (NumberFormatException e) {
                    throw new getPercentDownloaded(e);
                }
            }

            private static void write(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                if (number == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    downloadHelper2.write(number.intValue());
                }
            }
        });
        RemoteActionCompatParcelizer = read(AtomicInteger.class, new isBeforeFirst<AtomicInteger>() { // from class: o.replaceTrackSelections.31
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ AtomicInteger AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return read(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, AtomicInteger atomicInteger) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, atomicInteger);
            }

            private static AtomicInteger read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                try {
                    return new AtomicInteger(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver());
                } catch (NumberFormatException e) {
                    throw new getPercentDownloaded(e);
                }
            }

            private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, AtomicInteger atomicInteger) throws IOException {
                downloadHelper2.write(atomicInteger.get());
            }
        }.read());
        AudioAttributesCompatParcelizer = read(AtomicBoolean.class, new isBeforeFirst<AtomicBoolean>() { // from class: o.replaceTrackSelections.32
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ AtomicBoolean AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return read(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, AtomicBoolean atomicBoolean) throws IOException {
                RemoteActionCompatParcelizer(downloadHelper2, atomicBoolean);
            }

            private static AtomicBoolean read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return new AtomicBoolean(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
            }

            private static void RemoteActionCompatParcelizer(DownloadHelper2 downloadHelper2, AtomicBoolean atomicBoolean) throws IOException {
                downloadHelper2.write(atomicBoolean.get());
            }
        }.read());
        write = read(AtomicIntegerArray.class, new isBeforeFirst<AtomicIntegerArray>() { // from class: o.replaceTrackSelections.1
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ AtomicIntegerArray AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return write(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, AtomicIntegerArray atomicIntegerArray) throws IOException {
                IconCompatParcelizer(downloadHelper2, atomicIntegerArray);
            }

            private static AtomicIntegerArray write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                ArrayList arrayList = new ArrayList();
                downloadHelperExternalSyntheticLambda4.read();
                while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                    try {
                        arrayList.add(Integer.valueOf(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver()));
                    } catch (NumberFormatException e) {
                        throw new getPercentDownloaded(e);
                    }
                }
                downloadHelperExternalSyntheticLambda4.IconCompatParcelizer();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            private static void IconCompatParcelizer(DownloadHelper2 downloadHelper2, AtomicIntegerArray atomicIntegerArray) throws IOException {
                downloadHelper2.write();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    downloadHelper2.write(atomicIntegerArray.get(i));
                }
                downloadHelper2.AudioAttributesCompatParcelizer();
            }
        }.read());
        onMediaButtonEvent = new isBeforeFirst<Number>() { // from class: o.replaceTrackSelections.4
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                write(downloadHelper2, number);
            }

            private static Number IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                try {
                    return Long.valueOf(downloadHelperExternalSyntheticLambda4.RatingCompat());
                } catch (NumberFormatException e) {
                    throw new getPercentDownloaded(e);
                }
            }

            private static void write(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                if (number == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    downloadHelper2.write(number.longValue());
                }
            }
        };
        onCommand = new isBeforeFirst<Number>() { // from class: o.replaceTrackSelections.2
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return write(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, number);
            }

            private static Number write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                return Float.valueOf((float) downloadHelperExternalSyntheticLambda4.AudioAttributesImplBaseParcelizer());
            }

            private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                if (number == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                downloadHelper2.AudioAttributesCompatParcelizer(number);
            }
        };
        MediaBrowserCompatSearchResultReceiver = new isBeforeFirst<Number>() { // from class: o.replaceTrackSelections.3
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return read(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, number);
            }

            private static Number read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                return Double.valueOf(downloadHelperExternalSyntheticLambda4.AudioAttributesImplBaseParcelizer());
            }

            private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                if (number == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    downloadHelper2.IconCompatParcelizer(number.doubleValue());
                }
            }
        };
        RatingCompat = RemoteActionCompatParcelizer(Character.TYPE, Character.class, new isBeforeFirst<Character>() { // from class: o.replaceTrackSelections.6
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Character AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Character ch) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, ch);
            }

            private static Character IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                if (strMediaBrowserCompatSearchResultReceiver.length() != 1) {
                    StringBuilder sb = new StringBuilder("Expecting character, got: ");
                    sb.append(strMediaBrowserCompatSearchResultReceiver);
                    sb.append("; at ");
                    sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                    throw new getPercentDownloaded(sb.toString());
                }
                return Character.valueOf(strMediaBrowserCompatSearchResultReceiver.charAt(0));
            }

            private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, Character ch) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(ch == null ? null : String.valueOf(ch));
            }
        });
        isBeforeFirst<String> isbeforefirst2 = new isBeforeFirst<String>() { // from class: o.replaceTrackSelections.10
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ String AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, String str) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, str);
            }

            private static String IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = downloadHelperExternalSyntheticLambda4.onCustomAction();
                if (downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                if (downloadHelperExternalSyntheticLambda2OnCustomAction == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    return Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                }
                return downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
            }

            private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, String str) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(str);
            }
        };
        IconCompatParcelizer = new isBeforeFirst<BigDecimal>() { // from class: o.replaceTrackSelections.8
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ BigDecimal AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return write(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, BigDecimal bigDecimal) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, bigDecimal);
            }

            private static BigDecimal write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                try {
                    return new BigDecimal(strMediaBrowserCompatSearchResultReceiver);
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder("Failed parsing '");
                    sb.append(strMediaBrowserCompatSearchResultReceiver);
                    sb.append("' as BigDecimal; at path ");
                    sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                    throw new getPercentDownloaded(sb.toString(), e);
                }
            }

            private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, BigDecimal bigDecimal) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(bigDecimal);
            }
        };
        read = new isBeforeFirst<BigInteger>() { // from class: o.replaceTrackSelections.9
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ BigInteger AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return write(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, BigInteger bigInteger) throws IOException {
                RemoteActionCompatParcelizer(downloadHelper2, bigInteger);
            }

            private static BigInteger write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                try {
                    return new BigInteger(strMediaBrowserCompatSearchResultReceiver);
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder("Failed parsing '");
                    sb.append(strMediaBrowserCompatSearchResultReceiver);
                    sb.append("' as BigInteger; at path ");
                    sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                    throw new getPercentDownloaded(sb.toString(), e);
                }
            }

            private static void RemoteActionCompatParcelizer(DownloadHelper2 downloadHelper2, BigInteger bigInteger) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(bigInteger);
            }
        };
        onPlay = new isBeforeFirst<addTrackSelectionInternal>() { // from class: o.replaceTrackSelections.7
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ addTrackSelectionInternal AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, addTrackSelectionInternal addtrackselectioninternal) throws IOException {
                write(downloadHelper2, addtrackselectioninternal);
            }

            private static addTrackSelectionInternal IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                return new addTrackSelectionInternal(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver());
            }

            private static void write(DownloadHelper2 downloadHelper2, addTrackSelectionInternal addtrackselectioninternal) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(addtrackselectioninternal);
            }
        };
        onPlayFromSearch = read(String.class, isbeforefirst2);
        onPlayFromUri = read(StringBuilder.class, new isBeforeFirst<StringBuilder>() { // from class: o.replaceTrackSelections.12
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ StringBuilder AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, StringBuilder sb) throws IOException {
                IconCompatParcelizer(downloadHelper2, sb);
            }

            private static StringBuilder IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                return new StringBuilder(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver());
            }

            private static void IconCompatParcelizer(DownloadHelper2 downloadHelper2, StringBuilder sb) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(sb == null ? null : sb.toString());
            }
        });
        onPlayFromMediaId = read(StringBuffer.class, new isBeforeFirst<StringBuffer>() { // from class: o.replaceTrackSelections.13
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ StringBuffer AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, StringBuffer stringBuffer) throws IOException {
                IconCompatParcelizer(downloadHelper2, stringBuffer);
            }

            private static StringBuffer RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                return new StringBuffer(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver());
            }

            private static void IconCompatParcelizer(DownloadHelper2 downloadHelper2, StringBuffer stringBuffer) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        onPrepare = read(URL.class, new isBeforeFirst<URL>() { // from class: o.replaceTrackSelections.15
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ URL AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return read(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, URL url) throws IOException {
                IconCompatParcelizer(downloadHelper2, url);
            }

            private static URL read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                if ("null".equals(strMediaBrowserCompatSearchResultReceiver)) {
                    return null;
                }
                return new URL(strMediaBrowserCompatSearchResultReceiver);
            }

            private static void IconCompatParcelizer(DownloadHelper2 downloadHelper2, URL url) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(url == null ? null : url.toExternalForm());
            }
        });
        onPrepareFromMediaId = read(URI.class, new isBeforeFirst<URI>() { // from class: o.replaceTrackSelections.11
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ URI AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return read(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, URI uri) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, uri);
            }

            private static URI read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                try {
                    String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                    if ("null".equals(strMediaBrowserCompatSearchResultReceiver)) {
                        return null;
                    }
                    return new URI(strMediaBrowserCompatSearchResultReceiver);
                } catch (URISyntaxException e) {
                    throw new getDownloaderConstructor(e);
                }
            }

            private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, URI uri) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(uri == null ? null : uri.toASCIIString());
            }
        });
        onCustomAction = RemoteActionCompatParcelizer(InetAddress.class, new isBeforeFirst<InetAddress>() { // from class: o.replaceTrackSelections.16
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ InetAddress AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return IconCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, InetAddress inetAddress) throws IOException {
                write(downloadHelper2, inetAddress);
            }

            private static InetAddress IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                return InetAddress.getByName(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver());
            }

            private static void write(DownloadHelper2 downloadHelper2, InetAddress inetAddress) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        });
        onPrepareFromSearch = read(UUID.class, new isBeforeFirst<UUID>() { // from class: o.replaceTrackSelections.19
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ UUID AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return read(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, UUID uuid) throws IOException {
                RemoteActionCompatParcelizer(downloadHelper2, uuid);
            }

            private static UUID read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                try {
                    return UUID.fromString(strMediaBrowserCompatSearchResultReceiver);
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder("Failed parsing '");
                    sb.append(strMediaBrowserCompatSearchResultReceiver);
                    sb.append("' as UUID; at path ");
                    sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                    throw new getPercentDownloaded(sb.toString(), e);
                }
            }

            private static void RemoteActionCompatParcelizer(DownloadHelper2 downloadHelper2, UUID uuid) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(uuid == null ? null : uuid.toString());
            }
        });
        MediaDescriptionCompat = read(Currency.class, new isBeforeFirst<Currency>() { // from class: o.replaceTrackSelections.17
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Currency AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Currency currency) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, currency);
            }

            private static Currency RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                try {
                    return Currency.getInstance(strMediaBrowserCompatSearchResultReceiver);
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder("Failed parsing '");
                    sb.append(strMediaBrowserCompatSearchResultReceiver);
                    sb.append("' as Currency; at path ");
                    sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                    throw new getPercentDownloaded(sb.toString(), e);
                }
            }

            private static void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, Currency currency) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(currency.getCurrencyCode());
            }
        }.read());
        AudioAttributesImplApi21Parcelizer = IconCompatParcelizer(Calendar.class, GregorianCalendar.class, new isBeforeFirst<Calendar>() { // from class: o.replaceTrackSelections.18
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Calendar AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return read(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Calendar calendar) throws IOException {
                write(downloadHelper2, calendar);
            }

            private static Calendar read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.END_OBJECT) {
                    String strMediaBrowserCompatMediaItem = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatMediaItem();
                    int iMediaBrowserCompatItemReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                    if ("year".equals(strMediaBrowserCompatMediaItem)) {
                        i = iMediaBrowserCompatItemReceiver;
                    } else if ("month".equals(strMediaBrowserCompatMediaItem)) {
                        i2 = iMediaBrowserCompatItemReceiver;
                    } else if ("dayOfMonth".equals(strMediaBrowserCompatMediaItem)) {
                        i3 = iMediaBrowserCompatItemReceiver;
                    } else if ("hourOfDay".equals(strMediaBrowserCompatMediaItem)) {
                        i4 = iMediaBrowserCompatItemReceiver;
                    } else if ("minute".equals(strMediaBrowserCompatMediaItem)) {
                        i5 = iMediaBrowserCompatItemReceiver;
                    } else if ("second".equals(strMediaBrowserCompatMediaItem)) {
                        i6 = iMediaBrowserCompatItemReceiver;
                    }
                }
                downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            private static void write(DownloadHelper2 downloadHelper2, Calendar calendar) throws IOException {
                if (calendar == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
                downloadHelper2.RemoteActionCompatParcelizer();
                downloadHelper2.read("year");
                downloadHelper2.write(calendar.get(1));
                downloadHelper2.read("month");
                downloadHelper2.write(calendar.get(2));
                downloadHelper2.read("dayOfMonth");
                downloadHelper2.write(calendar.get(5));
                downloadHelper2.read("hourOfDay");
                downloadHelper2.write(calendar.get(11));
                downloadHelper2.read("minute");
                downloadHelper2.write(calendar.get(12));
                downloadHelper2.read("second");
                downloadHelper2.write(calendar.get(13));
                downloadHelper2.IconCompatParcelizer();
            }
        });
        onFastForward = read(Locale.class, new isBeforeFirst<Locale>() { // from class: o.replaceTrackSelections.20
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Locale AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* bridge */ /* synthetic */ void read(DownloadHelper2 downloadHelper2, Locale locale) throws IOException {
                read2(downloadHelper2, locale);
            }

            private static Locale RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                if (strNextToken3 == null) {
                    return new Locale(strNextToken, strNextToken2);
                }
                return new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            private static void read2(DownloadHelper2 downloadHelper2, Locale locale) throws IOException {
                downloadHelper2.AudioAttributesCompatParcelizer(locale == null ? null : locale.toString());
            }
        });
        isBeforeFirst<getCount> isbeforefirst3 = new isBeforeFirst<getCount>() { // from class: o.replaceTrackSelections.23
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ getCount AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            private static getCount read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2) throws IOException {
                int i = AnonymousClass30.AudioAttributesCompatParcelizer[downloadHelperExternalSyntheticLambda2.ordinal()];
                if (i == 4) {
                    downloadHelperExternalSyntheticLambda4.read();
                    return new moveToPosition();
                }
                if (i != 5) {
                    return null;
                }
                downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
                return new createDownloader();
            }

            private static getCount RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2) throws IOException {
                int i = AnonymousClass30.AudioAttributesCompatParcelizer[downloadHelperExternalSyntheticLambda2.ordinal()];
                if (i == 1) {
                    return new createDownloaderConstructors(new addTrackSelectionInternal(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver()));
                }
                if (i == 2) {
                    return new createDownloaderConstructors(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver());
                }
                if (i == 3) {
                    return new createDownloaderConstructors(Boolean.valueOf(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer()));
                }
                if (i == 6) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return DefaultDownloaderFactory.read;
                }
                throw new IllegalStateException("Unexpected token: ".concat(String.valueOf(downloadHelperExternalSyntheticLambda2)));
            }

            private static getCount RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4 instanceof addAudioLanguagesToSelection) {
                    return ((addAudioLanguagesToSelection) downloadHelperExternalSyntheticLambda4).MediaMetadataCompat();
                }
                DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction = downloadHelperExternalSyntheticLambda4.onCustomAction();
                getCount getcount = read(downloadHelperExternalSyntheticLambda4, downloadHelperExternalSyntheticLambda2OnCustomAction);
                if (getcount == null) {
                    return RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4, downloadHelperExternalSyntheticLambda2OnCustomAction);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                        String strMediaBrowserCompatMediaItem = getcount instanceof createDownloader ? downloadHelperExternalSyntheticLambda4.MediaBrowserCompatMediaItem() : null;
                        DownloadHelperExternalSyntheticLambda2 downloadHelperExternalSyntheticLambda2OnCustomAction2 = downloadHelperExternalSyntheticLambda4.onCustomAction();
                        getCount getcount2 = read(downloadHelperExternalSyntheticLambda4, downloadHelperExternalSyntheticLambda2OnCustomAction2);
                        boolean z = getcount2 != null;
                        getCount getcountRemoteActionCompatParcelizer = getcount2 == null ? RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4, downloadHelperExternalSyntheticLambda2OnCustomAction2) : getcount2;
                        if (getcount instanceof moveToPosition) {
                            ((moveToPosition) getcount).IconCompatParcelizer(getcountRemoteActionCompatParcelizer);
                        } else {
                            ((createDownloader) getcount).RemoteActionCompatParcelizer(strMediaBrowserCompatMediaItem, getcountRemoteActionCompatParcelizer);
                        }
                        if (z) {
                            arrayDeque.addLast(getcount);
                            getcount = getcountRemoteActionCompatParcelizer;
                        }
                    } else {
                        if (getcount instanceof moveToPosition) {
                            downloadHelperExternalSyntheticLambda4.IconCompatParcelizer();
                        } else {
                            downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                        }
                        if (arrayDeque.isEmpty()) {
                            return getcount;
                        }
                        getcount = (getCount) arrayDeque.removeLast();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.isBeforeFirst
            public void read(DownloadHelper2 downloadHelper2, getCount getcount) throws IOException {
                if (getcount == null || getcount.MediaMetadataCompat()) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
                if (getcount.MediaBrowserCompatSearchResultReceiver()) {
                    createDownloaderConstructors createdownloaderconstructorsAudioAttributesImplApi21Parcelizer = getcount.AudioAttributesImplApi21Parcelizer();
                    if (createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.MediaDescriptionCompat()) {
                        downloadHelper2.AudioAttributesCompatParcelizer(createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.write());
                        return;
                    } else if (createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.RatingCompat()) {
                        downloadHelper2.write(createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.read());
                        return;
                    } else {
                        downloadHelper2.AudioAttributesCompatParcelizer(createdownloaderconstructorsAudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer());
                        return;
                    }
                }
                if (getcount.MediaBrowserCompatCustomActionResultReceiver()) {
                    downloadHelper2.write();
                    Iterator<getCount> it = getcount.MediaBrowserCompatItemReceiver().iterator();
                    while (it.hasNext()) {
                        read(downloadHelper2, it.next());
                    }
                    downloadHelper2.AudioAttributesCompatParcelizer();
                    return;
                }
                if (getcount.MediaBrowserCompatMediaItem()) {
                    downloadHelper2.RemoteActionCompatParcelizer();
                    for (Map.Entry<String, getCount> entry : getcount.AudioAttributesImplBaseParcelizer().RatingCompat()) {
                        downloadHelper2.read(entry.getKey());
                        read(downloadHelper2, entry.getValue());
                    }
                    downloadHelper2.IconCompatParcelizer();
                    return;
                }
                StringBuilder sb = new StringBuilder("Couldn't write ");
                sb.append(getcount.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        };
        handleMediaPlayPauseIfPendingOnHandler = isbeforefirst3;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = RemoteActionCompatParcelizer(getCount.class, isbeforefirst3);
        MediaMetadataCompat = new isAfterLast() { // from class: o.replaceTrackSelections.25
            @Override // kotlin.isAfterLast
            public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
                Class<? super T> clsAudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer();
                if (!Enum.class.isAssignableFrom(clsAudioAttributesCompatParcelizer) || clsAudioAttributesCompatParcelizer == Enum.class) {
                    return null;
                }
                if (!clsAudioAttributesCompatParcelizer.isEnum()) {
                    clsAudioAttributesCompatParcelizer = clsAudioAttributesCompatParcelizer.getSuperclass();
                }
                return new AudioAttributesCompatParcelizer(clsAudioAttributesCompatParcelizer);
            }
        };
    }

    /* JADX INFO: renamed from: o.replaceTrackSelections$30, reason: invalid class name */
    static /* synthetic */ class AnonymousClass30 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[DownloadHelperExternalSyntheticLambda2.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[DownloadHelperExternalSyntheticLambda2.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadHelperExternalSyntheticLambda2.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadHelperExternalSyntheticLambda2.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadHelperExternalSyntheticLambda2.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadHelperExternalSyntheticLambda2.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AudioAttributesCompatParcelizer[DownloadHelperExternalSyntheticLambda2.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static final class AudioAttributesCompatParcelizer<T extends Enum<T>> extends isBeforeFirst<T> {
        private final Map<String, T> write = new HashMap();
        private final Map<String, T> AudioAttributesCompatParcelizer = new HashMap();
        private final Map<T, String> read = new HashMap();

        public AudioAttributesCompatParcelizer(final Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new PrivilegedAction<Field[]>() { // from class: o.replaceTrackSelections.AudioAttributesCompatParcelizer.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.security.PrivilegedAction
                    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                    public Field[] run() {
                        Field[] declaredFields = cls.getDeclaredFields();
                        ArrayList arrayList = new ArrayList(declaredFields.length);
                        for (Field field2 : declaredFields) {
                            if (field2.isEnumConstant()) {
                                arrayList.add(field2);
                            }
                        }
                        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                        AccessibleObject.setAccessible(fieldArr, true);
                        return fieldArr;
                    }
                })) {
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    String string = r4.toString();
                    isFirst isfirst = (isFirst) field.getAnnotation(isFirst.class);
                    if (isfirst != null) {
                        strName = isfirst.RemoteActionCompatParcelizer();
                        for (String str : isfirst.read()) {
                            this.write.put(str, (T) r4);
                        }
                    }
                    this.write.put(strName, (T) r4);
                    this.AudioAttributesCompatParcelizer.put(string, (T) r4);
                    this.read.put((T) r4, strName);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.isBeforeFirst
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public T AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return null;
            }
            String strMediaBrowserCompatSearchResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
            T t = this.write.get(strMediaBrowserCompatSearchResultReceiver);
            return t == null ? this.AudioAttributesCompatParcelizer.get(strMediaBrowserCompatSearchResultReceiver) : t;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.isBeforeFirst
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void read(DownloadHelper2 downloadHelper2, T t) throws IOException {
            downloadHelper2.AudioAttributesCompatParcelizer(t == null ? null : this.read.get(t));
        }
    }

    public static <TT> isAfterLast read(final Class<TT> cls, final isBeforeFirst<TT> isbeforefirst) {
        return new isAfterLast() { // from class: o.replaceTrackSelections.21
            @Override // kotlin.isAfterLast
            public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
                if (downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer() == cls) {
                    return isbeforefirst;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(isbeforefirst);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <TT> isAfterLast RemoteActionCompatParcelizer(final Class<TT> cls, final Class<TT> cls2, final isBeforeFirst<? super TT> isbeforefirst) {
        return new isAfterLast() { // from class: o.replaceTrackSelections.22
            @Override // kotlin.isAfterLast
            public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
                Class<? super T> clsAudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer();
                if (clsAudioAttributesCompatParcelizer == cls || clsAudioAttributesCompatParcelizer == cls2) {
                    return isbeforefirst;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(isbeforefirst);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    private static <TT> isAfterLast IconCompatParcelizer(final Class<TT> cls, final Class<? extends TT> cls2, final isBeforeFirst<? super TT> isbeforefirst) {
        return new isAfterLast() { // from class: o.replaceTrackSelections.27
            @Override // kotlin.isAfterLast
            public final <T> isBeforeFirst<T> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
                Class<? super T> clsAudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer();
                if (clsAudioAttributesCompatParcelizer == cls || clsAudioAttributesCompatParcelizer == cls2) {
                    return isbeforefirst;
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append("+");
                sb.append(cls2.getName());
                sb.append(",adapter=");
                sb.append(isbeforefirst);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    private static <T1> isAfterLast RemoteActionCompatParcelizer(final Class<T1> cls, final isBeforeFirst<T1> isbeforefirst) {
        return new isAfterLast() { // from class: o.replaceTrackSelections.28
            @Override // kotlin.isAfterLast
            public final <T2> isBeforeFirst<T2> write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda3<T2> downloadHelperExternalSyntheticLambda3) {
                final Class<? super T2> clsAudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer();
                if (cls.isAssignableFrom(clsAudioAttributesCompatParcelizer)) {
                    return (isBeforeFirst<T2>) new isBeforeFirst<T1>() { // from class: o.replaceTrackSelections.28.5
                        @Override // kotlin.isBeforeFirst
                        public final void read(DownloadHelper2 downloadHelper2, T1 t1) throws IOException {
                            isbeforefirst.read(downloadHelper2, t1);
                        }

                        @Override // kotlin.isBeforeFirst
                        public final T1 AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                            T1 t1 = (T1) isbeforefirst.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                            if (t1 == null || clsAudioAttributesCompatParcelizer.isInstance(t1)) {
                                return t1;
                            }
                            StringBuilder sb = new StringBuilder("Expected a ");
                            sb.append(clsAudioAttributesCompatParcelizer.getName());
                            sb.append(" but was ");
                            sb.append(t1.getClass().getName());
                            sb.append("; at path ");
                            sb.append(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver());
                            throw new getPercentDownloaded(sb.toString());
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(isbeforefirst);
                sb.append("]");
                return sb.toString();
            }
        };
    }
}
