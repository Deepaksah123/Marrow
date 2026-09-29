package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class setDownloadingStatesToQueued {
    private List<isAfterLast> AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplApi26Parcelizer;
    private assertPreparedWithMedia AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private moveToLast MediaBrowserCompatItemReceiver;
    private setStopReason MediaBrowserCompatMediaItem;
    private List<isAfterLast> MediaBrowserCompatSearchResultReceiver;
    private getBytesDownloaded MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Map<Type, DefaultDownloadIndexDownloadCursorImpl<?>> MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private boolean RatingCompat;
    private List<isAfterLast> RemoteActionCompatParcelizer;
    private DownloadCursor handleMediaPlayPauseIfPendingOnHandler;
    private addTrackSelectionForSingleRenderer onAddQueueItem;
    private DownloadCursor onCommand;
    private boolean onCustomAction;
    private List<DownloadFailureReason> onFastForward;
    private ThreadLocal<Map<DownloadHelperExternalSyntheticLambda3<?>, isBeforeFirst<?>>> onMediaButtonEvent;
    private boolean onPause;
    private boolean onPlay;
    private boolean onPlayFromMediaId;
    private boolean onPrepare;
    private int onPrepareFromMediaId;
    private ConcurrentMap<DownloadHelperExternalSyntheticLambda3<?>, isBeforeFirst<?>> onPrepareFromSearch;
    private static setStopReason write = putDownload.IDENTITY;
    private static DownloadCursor IconCompatParcelizer = isTerminalState.DOUBLE;
    private static DownloadCursor read = isTerminalState.LAZILY_PARSED_NUMBER;

    public setDownloadingStatesToQueued() {
        this(assertPreparedWithMedia.write, write, Collections.emptyMap(), getBytesDownloaded.DEFAULT, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), IconCompatParcelizer, read, Collections.emptyList());
    }

    private setDownloadingStatesToQueued(assertPreparedWithMedia assertpreparedwithmedia, setStopReason setstopreason, Map<Type, DefaultDownloadIndexDownloadCursorImpl<?>> map, getBytesDownloaded getbytesdownloaded, String str, List<isAfterLast> list, List<isAfterLast> list2, List<isAfterLast> list3, DownloadCursor downloadCursor, DownloadCursor downloadCursor2, List<DownloadFailureReason> list4) {
        ArrayList arrayList = new ArrayList(list3);
        arrayList.add(new sendPauseDownloads());
        this.onMediaButtonEvent = new ThreadLocal<>();
        this.onPrepareFromSearch = new ConcurrentHashMap();
        this.AudioAttributesImplBaseParcelizer = assertpreparedwithmedia;
        this.MediaBrowserCompatMediaItem = setstopreason;
        this.MediaDescriptionCompat = map;
        moveToLast movetolast = new moveToLast(map, true, list4);
        this.MediaBrowserCompatItemReceiver = movetolast;
        this.onPlay = false;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.MediaMetadataCompat = false;
        this.RatingCompat = true;
        this.onPause = false;
        this.onCustomAction = false;
        this.onPlayFromMediaId = false;
        this.onPrepare = true;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getbytesdownloaded;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = 2;
        this.onPrepareFromMediaId = 2;
        this.AudioAttributesCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = list2;
        this.onCommand = downloadCursor;
        this.handleMediaPlayPauseIfPendingOnHandler = downloadCursor2;
        this.onFastForward = list4;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(replaceTrackSelections.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        arrayList2.add(clearTrackSelections.read(downloadCursor));
        arrayList2.add(assertpreparedwithmedia);
        arrayList2.addAll(arrayList);
        arrayList2.add(replaceTrackSelections.onPlayFromSearch);
        arrayList2.add(replaceTrackSelections.onAddQueueItem);
        arrayList2.add(replaceTrackSelections.AudioAttributesImplBaseParcelizer);
        arrayList2.add(replaceTrackSelections.AudioAttributesImplApi26Parcelizer);
        arrayList2.add(replaceTrackSelections.onPause);
        isBeforeFirst<Number> isbeforefirstWrite = write(getbytesdownloaded);
        arrayList2.add(replaceTrackSelections.RemoteActionCompatParcelizer(Long.TYPE, Long.class, isbeforefirstWrite));
        arrayList2.add(replaceTrackSelections.RemoteActionCompatParcelizer(Double.TYPE, Double.class, IconCompatParcelizer(false)));
        arrayList2.add(replaceTrackSelections.RemoteActionCompatParcelizer(Float.TYPE, Float.class, write(false)));
        arrayList2.add(addTextLanguagesToSelection.read(downloadCursor2));
        arrayList2.add(replaceTrackSelections.RemoteActionCompatParcelizer);
        arrayList2.add(replaceTrackSelections.AudioAttributesCompatParcelizer);
        arrayList2.add(replaceTrackSelections.read(AtomicLong.class, write(isbeforefirstWrite)));
        arrayList2.add(replaceTrackSelections.read(AtomicLongArray.class, read(isbeforefirstWrite)));
        arrayList2.add(replaceTrackSelections.write);
        arrayList2.add(replaceTrackSelections.RatingCompat);
        arrayList2.add(replaceTrackSelections.onPlayFromUri);
        arrayList2.add(replaceTrackSelections.onPlayFromMediaId);
        arrayList2.add(replaceTrackSelections.read(BigDecimal.class, replaceTrackSelections.IconCompatParcelizer));
        arrayList2.add(replaceTrackSelections.read(BigInteger.class, replaceTrackSelections.read));
        arrayList2.add(replaceTrackSelections.read(addTrackSelectionInternal.class, replaceTrackSelections.onPlay));
        arrayList2.add(replaceTrackSelections.onPrepare);
        arrayList2.add(replaceTrackSelections.onPrepareFromMediaId);
        arrayList2.add(replaceTrackSelections.onPrepareFromSearch);
        arrayList2.add(replaceTrackSelections.MediaDescriptionCompat);
        arrayList2.add(replaceTrackSelections.onFastForward);
        arrayList2.add(replaceTrackSelections.onCustomAction);
        arrayList2.add(replaceTrackSelections.MediaBrowserCompatCustomActionResultReceiver);
        arrayList2.add(lambdagetRendererCapabilities0.RemoteActionCompatParcelizer);
        arrayList2.add(replaceTrackSelections.AudioAttributesImplApi21Parcelizer);
        if (DownloadHelperExternalSyntheticLambda0.read) {
            arrayList2.add(DownloadHelperExternalSyntheticLambda0.write);
            arrayList2.add(DownloadHelperExternalSyntheticLambda0.IconCompatParcelizer);
            arrayList2.add(DownloadHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer);
        }
        arrayList2.add(onMediaPreparationFailed.AudioAttributesCompatParcelizer);
        arrayList2.add(replaceTrackSelections.MediaBrowserCompatMediaItem);
        arrayList2.add(new lambdagetRendererCapabilities1(movetolast));
        arrayList2.add(new setPreparedWithMedia(movetolast, false));
        addTrackSelectionForSingleRenderer addtrackselectionforsinglerenderer = new addTrackSelectionForSingleRenderer(movetolast);
        this.onAddQueueItem = addtrackselectionforsinglerenderer;
        arrayList2.add(addtrackselectionforsinglerenderer);
        arrayList2.add(replaceTrackSelections.MediaMetadataCompat);
        arrayList2.add(new getDownloadRequest(movetolast, setstopreason, assertpreparedwithmedia, addtrackselectionforsinglerenderer, list4));
        this.MediaBrowserCompatSearchResultReceiver = Collections.unmodifiableList(arrayList2);
    }

    private isBeforeFirst<Number> IconCompatParcelizer(boolean z) {
        return new isBeforeFirst<Number>() { // from class: o.setDownloadingStatesToQueued.3
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return write(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                write(downloadHelper2, number);
            }

            private static Double write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.NULL) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return null;
                }
                return Double.valueOf(downloadHelperExternalSyntheticLambda4.AudioAttributesImplBaseParcelizer());
            }

            private static void write(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                if (number == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                setDownloadingStatesToQueued.AudioAttributesCompatParcelizer(dDoubleValue);
                downloadHelper2.IconCompatParcelizer(dDoubleValue);
            }
        };
    }

    private isBeforeFirst<Number> write(boolean z) {
        return new isBeforeFirst<Number>() { // from class: o.setDownloadingStatesToQueued.2
            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ Number AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            }

            @Override // kotlin.isBeforeFirst
            public final /* synthetic */ void read(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                AudioAttributesCompatParcelizer(downloadHelper2, number);
            }

            private static Float RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
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
                float fFloatValue = number.floatValue();
                setDownloadingStatesToQueued.AudioAttributesCompatParcelizer(fFloatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(fFloatValue);
                }
                downloadHelper2.AudioAttributesCompatParcelizer(number);
            }
        };
    }

    static void AudioAttributesCompatParcelizer(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static isBeforeFirst<Number> write(getBytesDownloaded getbytesdownloaded) {
        if (getbytesdownloaded == getBytesDownloaded.DEFAULT) {
            return replaceTrackSelections.onMediaButtonEvent;
        }
        return new isBeforeFirst<Number>() { // from class: o.setDownloadingStatesToQueued.4
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
                return Long.valueOf(downloadHelperExternalSyntheticLambda4.RatingCompat());
            }

            private static void write(DownloadHelper2 downloadHelper2, Number number) throws IOException {
                if (number == null) {
                    downloadHelper2.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    downloadHelper2.AudioAttributesCompatParcelizer(number.toString());
                }
            }
        };
    }

    private static isBeforeFirst<AtomicLong> write(final isBeforeFirst<Number> isbeforefirst) {
        return new isBeforeFirst<AtomicLong>() { // from class: o.setDownloadingStatesToQueued.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.isBeforeFirst
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public void read(DownloadHelper2 downloadHelper2, AtomicLong atomicLong) throws IOException {
                isbeforefirst.read(downloadHelper2, Long.valueOf(atomicLong.get()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.isBeforeFirst
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public AtomicLong AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                return new AtomicLong(((Number) isbeforefirst.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue());
            }
        }.read();
    }

    private static isBeforeFirst<AtomicLongArray> read(final isBeforeFirst<Number> isbeforefirst) {
        return new isBeforeFirst<AtomicLongArray>() { // from class: o.setDownloadingStatesToQueued.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.isBeforeFirst
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public void read(DownloadHelper2 downloadHelper2, AtomicLongArray atomicLongArray) throws IOException {
                downloadHelper2.write();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    isbeforefirst.read(downloadHelper2, Long.valueOf(atomicLongArray.get(i)));
                }
                downloadHelper2.AudioAttributesCompatParcelizer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.isBeforeFirst
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                ArrayList arrayList = new ArrayList();
                downloadHelperExternalSyntheticLambda4.read();
                while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                    arrayList.add(Long.valueOf(((Number) isbeforefirst.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue()));
                }
                downloadHelperExternalSyntheticLambda4.IconCompatParcelizer();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.read();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.RemoteActionCompatParcelizer(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> kotlin.isBeforeFirst<T> IconCompatParcelizer(kotlin.DownloadHelperExternalSyntheticLambda3<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap<o.DownloadHelperExternalSyntheticLambda3<?>, o.isBeforeFirst<?>> r0 = r6.onPrepareFromSearch
            java.lang.Object r0 = r0.get(r7)
            o.isBeforeFirst r0 = (kotlin.isBeforeFirst) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal<java.util.Map<o.DownloadHelperExternalSyntheticLambda3<?>, o.isBeforeFirst<?>>> r0 = r6.onMediaButtonEvent
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<o.DownloadHelperExternalSyntheticLambda3<?>, o.isBeforeFirst<?>>> r1 = r6.onMediaButtonEvent
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            o.isBeforeFirst r1 = (kotlin.isBeforeFirst) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            o.setDownloadingStatesToQueued$write r2 = new o.setDownloadingStatesToQueued$write     // Catch: java.lang.Throwable -> L78
            r2.<init>()     // Catch: java.lang.Throwable -> L78
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L78
            java.util.List<o.isAfterLast> r3 = r6.MediaBrowserCompatSearchResultReceiver     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L78
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto L57
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L78
            o.isAfterLast r4 = (kotlin.isAfterLast) r4     // Catch: java.lang.Throwable -> L78
            o.isBeforeFirst r4 = r4.write(r6, r7)     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L3f
            r2.RemoteActionCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L78
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L78
        L57:
            if (r1 == 0) goto L5e
            java.lang.ThreadLocal<java.util.Map<o.DownloadHelperExternalSyntheticLambda3<?>, o.isBeforeFirst<?>>> r2 = r6.onMediaButtonEvent
            r2.remove()
        L5e:
            if (r4 == 0) goto L68
            if (r1 == 0) goto L67
            java.util.concurrent.ConcurrentMap<o.DownloadHelperExternalSyntheticLambda3<?>, o.isBeforeFirst<?>> r6 = r6.onPrepareFromSearch
            r6.putAll(r0)
        L67:
            return r4
        L68:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "GSON (2.10.1) cannot handle "
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
        L78:
            r7 = move-exception
            if (r1 == 0) goto L80
            java.lang.ThreadLocal<java.util.Map<o.DownloadHelperExternalSyntheticLambda3<?>, o.isBeforeFirst<?>>> r6 = r6.onMediaButtonEvent
            r6.remove()
        L80:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setDownloadingStatesToQueued.IconCompatParcelizer(o.DownloadHelperExternalSyntheticLambda3):o.isBeforeFirst");
    }

    public final <T> isBeforeFirst<T> AudioAttributesCompatParcelizer(isAfterLast isafterlast, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
        if (!this.MediaBrowserCompatSearchResultReceiver.contains(isafterlast)) {
            isafterlast = this.onAddQueueItem;
        }
        boolean z = false;
        for (isAfterLast isafterlast2 : this.MediaBrowserCompatSearchResultReceiver) {
            if (z) {
                isBeforeFirst<T> isbeforefirstWrite = isafterlast2.write(this, downloadHelperExternalSyntheticLambda3);
                if (isbeforefirstWrite != null) {
                    return isbeforefirstWrite;
                }
            } else if (isafterlast2 == isafterlast) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(downloadHelperExternalSyntheticLambda3)));
    }

    public final <T> isBeforeFirst<T> read(Class<T> cls) {
        return IconCompatParcelizer(DownloadHelperExternalSyntheticLambda3.IconCompatParcelizer(cls));
    }

    public final String AudioAttributesCompatParcelizer(Object obj) {
        if (obj == null) {
            return write(DefaultDownloaderFactory.read);
        }
        return write(obj, obj.getClass());
    }

    private String write(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        read(obj, type, stringWriter);
        return stringWriter.toString();
    }

    private void read(Object obj, Type type, Appendable appendable) throws getDownloaderConstructor {
        try {
            RemoteActionCompatParcelizer(obj, type, read(getDefaultTrackSelectorParameters.AudioAttributesCompatParcelizer(appendable)));
        } catch (IOException e) {
            throw new getDownloaderConstructor(e);
        }
    }

    private void RemoteActionCompatParcelizer(Object obj, Type type, DownloadHelper2 downloadHelper2) throws getDownloaderConstructor {
        isBeforeFirst isbeforefirstIconCompatParcelizer = IconCompatParcelizer(DownloadHelperExternalSyntheticLambda3.write(type));
        boolean zAudioAttributesImplBaseParcelizer = downloadHelper2.AudioAttributesImplBaseParcelizer();
        downloadHelper2.AudioAttributesCompatParcelizer(true);
        boolean zAudioAttributesImplApi26Parcelizer = downloadHelper2.AudioAttributesImplApi26Parcelizer();
        downloadHelper2.read(this.RatingCompat);
        boolean zAudioAttributesImplApi21Parcelizer = downloadHelper2.AudioAttributesImplApi21Parcelizer();
        downloadHelper2.RemoteActionCompatParcelizer(this.onPlay);
        try {
            try {
                isbeforefirstIconCompatParcelizer.read(downloadHelper2, obj);
            } catch (IOException e) {
                throw new getDownloaderConstructor(e);
            } catch (AssertionError e2) {
                StringBuilder sb = new StringBuilder("AssertionError (GSON 2.10.1): ");
                sb.append(e2.getMessage());
                throw new AssertionError(sb.toString(), e2);
            }
        } finally {
            downloadHelper2.AudioAttributesCompatParcelizer(zAudioAttributesImplBaseParcelizer);
            downloadHelper2.read(zAudioAttributesImplApi26Parcelizer);
            downloadHelper2.RemoteActionCompatParcelizer(zAudioAttributesImplApi21Parcelizer);
        }
    }

    private String write(getCount getcount) {
        StringWriter stringWriter = new StringWriter();
        IconCompatParcelizer(getcount, stringWriter);
        return stringWriter.toString();
    }

    private void IconCompatParcelizer(getCount getcount, Appendable appendable) throws getDownloaderConstructor {
        try {
            IconCompatParcelizer(getcount, read(getDefaultTrackSelectorParameters.AudioAttributesCompatParcelizer(appendable)));
        } catch (IOException e) {
            throw new getDownloaderConstructor(e);
        }
    }

    private DownloadHelper2 read(Writer writer) throws IOException {
        DownloadHelper2 downloadHelper2 = new DownloadHelper2(writer);
        downloadHelper2.read(this.RatingCompat);
        downloadHelper2.AudioAttributesCompatParcelizer(this.onCustomAction);
        downloadHelper2.RemoteActionCompatParcelizer(this.onPlay);
        return downloadHelper2;
    }

    private DownloadHelperExternalSyntheticLambda4 IconCompatParcelizer(Reader reader) {
        DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4 = new DownloadHelperExternalSyntheticLambda4(reader);
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer(this.onCustomAction);
        return downloadHelperExternalSyntheticLambda4;
    }

    private void IconCompatParcelizer(getCount getcount, DownloadHelper2 downloadHelper2) throws getDownloaderConstructor {
        boolean zAudioAttributesImplBaseParcelizer = downloadHelper2.AudioAttributesImplBaseParcelizer();
        downloadHelper2.AudioAttributesCompatParcelizer(true);
        boolean zAudioAttributesImplApi26Parcelizer = downloadHelper2.AudioAttributesImplApi26Parcelizer();
        downloadHelper2.read(this.RatingCompat);
        boolean zAudioAttributesImplApi21Parcelizer = downloadHelper2.AudioAttributesImplApi21Parcelizer();
        downloadHelper2.RemoteActionCompatParcelizer(this.onPlay);
        try {
            try {
                getDefaultTrackSelectorParameters.AudioAttributesCompatParcelizer(getcount, downloadHelper2);
            } catch (IOException e) {
                throw new getDownloaderConstructor(e);
            } catch (AssertionError e2) {
                StringBuilder sb = new StringBuilder("AssertionError (GSON 2.10.1): ");
                sb.append(e2.getMessage());
                throw new AssertionError(sb.toString(), e2);
            }
        } finally {
            downloadHelper2.AudioAttributesCompatParcelizer(zAudioAttributesImplBaseParcelizer);
            downloadHelper2.read(zAudioAttributesImplApi26Parcelizer);
            downloadHelper2.RemoteActionCompatParcelizer(zAudioAttributesImplApi21Parcelizer);
        }
    }

    public final <T> T IconCompatParcelizer(String str, Class<T> cls) throws getPercentDownloaded {
        return (T) lambdacreateMediaSourceInternal6.AudioAttributesCompatParcelizer(cls).cast(IconCompatParcelizer(str, DownloadHelperExternalSyntheticLambda3.IconCompatParcelizer(cls)));
    }

    private <T> T IconCompatParcelizer(String str, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) throws getPercentDownloaded {
        if (str == null) {
            return null;
        }
        return (T) RemoteActionCompatParcelizer(new StringReader(str), downloadHelperExternalSyntheticLambda3);
    }

    private <T> T RemoteActionCompatParcelizer(Reader reader, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) throws getDownloaderConstructor, getPercentDownloaded {
        DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4IconCompatParcelizer = IconCompatParcelizer(reader);
        T t = (T) read(downloadHelperExternalSyntheticLambda4IconCompatParcelizer, downloadHelperExternalSyntheticLambda3);
        AudioAttributesCompatParcelizer(t, downloadHelperExternalSyntheticLambda4IconCompatParcelizer);
        return t;
    }

    private static void AudioAttributesCompatParcelizer(Object obj, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) {
        if (obj != null) {
            try {
                if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.END_DOCUMENT) {
                } else {
                    throw new getPercentDownloaded("JSON document was not fully consumed.");
                }
            } catch (DownloadHelperExternalSyntheticLambda6 e) {
                throw new getPercentDownloaded(e);
            } catch (IOException e2) {
                throw new getDownloaderConstructor(e2);
            }
        }
    }

    private <T> T read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) throws getDownloaderConstructor, getPercentDownloaded {
        boolean zOnCommand = downloadHelperExternalSyntheticLambda4.onCommand();
        boolean z = true;
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer(true);
        try {
            try {
                try {
                    downloadHelperExternalSyntheticLambda4.onCustomAction();
                    z = false;
                    return IconCompatParcelizer(downloadHelperExternalSyntheticLambda3).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                } catch (EOFException e) {
                    if (!z) {
                        throw new getPercentDownloaded(e);
                    }
                    downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer(zOnCommand);
                    return null;
                } catch (AssertionError e2) {
                    StringBuilder sb = new StringBuilder("AssertionError (GSON 2.10.1): ");
                    sb.append(e2.getMessage());
                    throw new AssertionError(sb.toString(), e2);
                }
            } catch (IOException e3) {
                throw new getPercentDownloaded(e3);
            } catch (IllegalStateException e4) {
                throw new getPercentDownloaded(e4);
            }
        } finally {
            downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer(zOnCommand);
        }
    }

    public final <T> T RemoteActionCompatParcelizer(getCount getcount, Type type) throws getPercentDownloaded {
        return (T) write(getcount, DownloadHelperExternalSyntheticLambda3.write(type));
    }

    private <T> T write(getCount getcount, DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) throws getPercentDownloaded {
        if (getcount == null) {
            return null;
        }
        return (T) read(new addAudioLanguagesToSelection(getcount), downloadHelperExternalSyntheticLambda3);
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class write<T> extends getManifest<T> {
        private isBeforeFirst<T> RemoteActionCompatParcelizer = null;

        write() {
        }

        public final void RemoteActionCompatParcelizer(isBeforeFirst<T> isbeforefirst) {
            if (this.RemoteActionCompatParcelizer != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.RemoteActionCompatParcelizer = isbeforefirst;
        }

        private isBeforeFirst<T> write() {
            isBeforeFirst<T> isbeforefirst = this.RemoteActionCompatParcelizer;
            if (isbeforefirst != null) {
                return isbeforefirst;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // kotlin.getManifest
        public final isBeforeFirst<T> IconCompatParcelizer() {
            return write();
        }

        @Override // kotlin.isBeforeFirst
        public final T AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
            return write().AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        }

        @Override // kotlin.isBeforeFirst
        public final void read(DownloadHelper2 downloadHelper2, T t) throws IOException {
            write().read(downloadHelper2, t);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.onPlay);
        sb.append(",factories:");
        sb.append(this.MediaBrowserCompatSearchResultReceiver);
        sb.append(",instanceCreators:");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append("}");
        return sb.toString();
    }
}
