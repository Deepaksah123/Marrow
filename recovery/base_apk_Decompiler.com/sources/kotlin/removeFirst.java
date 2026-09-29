package kotlin;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.isCollectionMapOrArray;
import kotlin.removeFirstOccurrence;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class removeFirst implements findConstructor {
    private boolean AudioAttributesCompatParcelizer;
    private removeFirstOccurrence AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final removeFirstOccurrence.AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final pollLast IconCompatParcelizer;
    private findRawSuperTypes MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final withTimeZone.IconCompatParcelizer MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private final SparseBooleanArray MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private final List<MinimalClassNameIdResolver> RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private pop handleMediaPlayPauseIfPendingOnHandler;
    private final AsPropertyTypeDeserializer onAddQueueItem;
    private final SparseBooleanArray onCommand;
    private boolean onCustomAction;
    private final SparseArray<removeFirstOccurrence> onPause;
    private int read;
    private final SparseIntArray write;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static /* synthetic */ int read(removeFirst removefirst) {
        int i = removefirst.MediaBrowserCompatSearchResultReceiver;
        removefirst.MediaBrowserCompatSearchResultReceiver = i + 1;
        return i;
    }

    static /* synthetic */ boolean write(removeFirst removefirst) {
        removefirst.onCustomAction = true;
        return true;
    }

    static {
        new getClassDescription() { // from class: o.removeAll
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return removeFirst.read();
            }
        };
    }

    static /* synthetic */ findConstructor[] read() {
        return new findConstructor[]{new removeFirst(withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer)};
    }

    @Deprecated
    public removeFirst() {
        this(1, 1, withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer, new MinimalClassNameIdResolver(0L), new setPrevious((byte) 0), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    private removeFirst(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        this(1, 1, iconCompatParcelizer, new MinimalClassNameIdResolver(0L), new setPrevious((byte) 0), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public removeFirst(int i, int i2, withTimeZone.IconCompatParcelizer iconCompatParcelizer, MinimalClassNameIdResolver minimalClassNameIdResolver, removeFirstOccurrence.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i3) {
        this.AudioAttributesImplBaseParcelizer = (removeFirstOccurrence.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer);
        this.MediaDescriptionCompat = i3;
        this.MediaBrowserCompatItemReceiver = i;
        this.RemoteActionCompatParcelizer = i2;
        this.MediaBrowserCompatMediaItem = iconCompatParcelizer;
        if (i == 1 || i == 2) {
            this.RatingCompat = Collections.singletonList(minimalClassNameIdResolver);
        } else {
            ArrayList arrayList = new ArrayList();
            this.RatingCompat = arrayList;
            arrayList.add(minimalClassNameIdResolver);
        }
        this.onAddQueueItem = new AsPropertyTypeDeserializer(new byte[9400], 0);
        this.onCommand = new SparseBooleanArray();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new SparseBooleanArray();
        this.onPause = new SparseArray<>();
        this.write = new SparseIntArray();
        this.IconCompatParcelizer = new pollLast(i3);
        this.MediaBrowserCompatCustomActionResultReceiver = findRawSuperTypes.IconCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = -1;
        MediaBrowserCompatItemReceiver();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r0 = r0 + 1;
     */
    @Override // kotlin.findConstructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(kotlin.closeOnFailAndThrowAsIOE r6) throws java.io.IOException {
        /*
            r5 = this;
            o.AsPropertyTypeDeserializer r5 = r5.onAddQueueItem
            byte[] r5 = r5.RemoteActionCompatParcelizer()
            r0 = 940(0x3ac, float:1.317E-42)
            r1 = 0
            r6.RemoteActionCompatParcelizer(r5, r1, r0)
            r0 = r1
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r0 >= r2) goto L29
            r2 = r1
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r0
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r0 = r0 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.IconCompatParcelizer(r0)
            r5 = 1
            return r5
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.removeFirst.read(o.closeOnFailAndThrowAsIOE):boolean");
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        if ((this.RemoteActionCompatParcelizer & 1) == 0) {
            findrawsupertypes = new _appendNativeIds(findrawsupertypes, this.MediaBrowserCompatMediaItem);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = findrawsupertypes;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // kotlin.findConstructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(long r10, long r12) {
        /*
            r9 = this;
            int r10 = r9.MediaBrowserCompatItemReceiver
            r11 = 2
            r0 = 1
            r1 = 0
            if (r10 == r11) goto L9
            r10 = r0
            goto La
        L9:
            r10 = r1
        La:
            kotlin.buildTypeSerializer.write(r10)
            java.util.List<o.MinimalClassNameIdResolver> r10 = r9.RatingCompat
            int r10 = r10.size()
            r11 = r1
        L14:
            r2 = 0
            if (r11 >= r10) goto L4b
            java.util.List<o.MinimalClassNameIdResolver> r4 = r9.RatingCompat
            java.lang.Object r4 = r4.get(r11)
            o.MinimalClassNameIdResolver r4 = (kotlin.MinimalClassNameIdResolver) r4
            long r5 = r4.write()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L2f
            r5 = r0
            goto L30
        L2f:
            r5 = r1
        L30:
            if (r5 != 0) goto L43
            long r5 = r4.AudioAttributesCompatParcelizer()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L48
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L48
            goto L45
        L43:
            if (r5 == 0) goto L48
        L45:
            r4.MediaBrowserCompatCustomActionResultReceiver(r12)
        L48:
            int r11 = r11 + 1
            goto L14
        L4b:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L56
            o.pop r10 = r9.handleMediaPlayPauseIfPendingOnHandler
            if (r10 == 0) goto L56
            r10.RemoteActionCompatParcelizer(r12)
        L56:
            o.AsPropertyTypeDeserializer r10 = r9.onAddQueueItem
            r10.write(r1)
            android.util.SparseIntArray r10 = r9.write
            r10.clear()
            r10 = r1
        L61:
            android.util.SparseArray<o.removeFirstOccurrence> r11 = r9.onPause
            int r11 = r11.size()
            if (r10 >= r11) goto L77
            android.util.SparseArray<o.removeFirstOccurrence> r11 = r9.onPause
            java.lang.Object r11 = r11.valueAt(r10)
            o.removeFirstOccurrence r11 = (kotlin.removeFirstOccurrence) r11
            r11.IconCompatParcelizer()
            int r10 = r10 + 1
            goto L61
        L77:
            r9.read = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.removeFirst.write(long, long):void");
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        long j = closeonfailandthrowasioe.read();
        boolean z = this.MediaBrowserCompatItemReceiver == 2;
        if (this.onCustomAction) {
            if (j != -1 && !z && !this.IconCompatParcelizer.read()) {
                return this.IconCompatParcelizer.RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl, this.AudioAttributesImplApi26Parcelizer);
            }
            read(j);
            if (this.MediaMetadataCompat) {
                this.MediaMetadataCompat = false;
                write(0L, 0L);
                if (closeonfailandthrowasioe.IconCompatParcelizer() != 0) {
                    isjacksonstdimpl.AudioAttributesCompatParcelizer = 0L;
                    return 1;
                }
            }
            pop popVar = this.handleMediaPlayPauseIfPendingOnHandler;
            if (popVar != null && popVar.read()) {
                return this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
            }
        }
        if (!write(closeonfailandthrowasioe)) {
            for (int i = 0; i < this.onPause.size(); i++) {
                removeFirstOccurrence removefirstoccurrenceValueAt = this.onPause.valueAt(i);
                if (removefirstoccurrenceValueAt instanceof offerFirst) {
                    offerFirst offerfirst = (offerFirst) removefirstoccurrenceValueAt;
                    if (offerfirst.IconCompatParcelizer(z)) {
                        offerfirst.IconCompatParcelizer(new AsPropertyTypeDeserializer(), 1);
                    }
                }
            }
            return -1;
        }
        int iIconCompatParcelizer = IconCompatParcelizer();
        int i2 = this.onAddQueueItem.read();
        if (iIconCompatParcelizer > i2) {
            return 0;
        }
        int iMediaBrowserCompatItemReceiver = this.onAddQueueItem.MediaBrowserCompatItemReceiver();
        if ((8388608 & iMediaBrowserCompatItemReceiver) != 0) {
            this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer);
            return 0;
        }
        int i3 = (4194304 & iMediaBrowserCompatItemReceiver) != 0 ? 1 : 0;
        int i4 = (2096896 & iMediaBrowserCompatItemReceiver) >> 8;
        boolean z2 = (iMediaBrowserCompatItemReceiver & 32) != 0;
        removeFirstOccurrence removefirstoccurrence = (iMediaBrowserCompatItemReceiver & 16) != 0 ? this.onPause.get(i4) : null;
        if (removefirstoccurrence == null) {
            this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer);
            return 0;
        }
        if (this.MediaBrowserCompatItemReceiver != 2) {
            int i5 = iMediaBrowserCompatItemReceiver & 15;
            int i6 = this.write.get(i4, i5 - 1);
            this.write.put(i4, i5);
            if (i6 == i5) {
                this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer);
                return 0;
            }
            if (i5 != ((i6 + 1) & 15)) {
                removefirstoccurrence.IconCompatParcelizer();
            }
        }
        if (z2) {
            int iOnPlayFromMediaId = this.onAddQueueItem.onPlayFromMediaId();
            i3 |= (this.onAddQueueItem.onPlayFromMediaId() & 64) != 0 ? 2 : 0;
            this.onAddQueueItem.AudioAttributesImplBaseParcelizer(iOnPlayFromMediaId - 1);
        }
        boolean z3 = this.onCustomAction;
        if (IconCompatParcelizer(i4)) {
            this.onAddQueueItem.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
            removefirstoccurrence.IconCompatParcelizer(this.onAddQueueItem, i3);
            this.onAddQueueItem.AudioAttributesCompatParcelizer(i2);
        }
        if (this.MediaBrowserCompatItemReceiver != 2 && !z3 && this.onCustomAction && j != -1) {
            this.MediaMetadataCompat = true;
        }
        this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer);
        return 0;
    }

    private void read(long j) {
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer = true;
        if (this.IconCompatParcelizer.RemoteActionCompatParcelizer() != C.TIME_UNSET) {
            pop popVar = new pop(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(), this.IconCompatParcelizer.RemoteActionCompatParcelizer(), j, this.AudioAttributesImplApi26Parcelizer, this.MediaDescriptionCompat);
            this.handleMediaPlayPauseIfPendingOnHandler = popVar;
            this.MediaBrowserCompatCustomActionResultReceiver.read(popVar.AudioAttributesCompatParcelizer());
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.read(new isCollectionMapOrArray.write(this.IconCompatParcelizer.RemoteActionCompatParcelizer()));
    }

    private boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        byte[] bArrRemoteActionCompatParcelizer = this.onAddQueueItem.RemoteActionCompatParcelizer();
        if (9400 - this.onAddQueueItem.write() < 188) {
            int iIconCompatParcelizer = this.onAddQueueItem.IconCompatParcelizer();
            if (iIconCompatParcelizer > 0) {
                System.arraycopy(bArrRemoteActionCompatParcelizer, this.onAddQueueItem.write(), bArrRemoteActionCompatParcelizer, 0, iIconCompatParcelizer);
            }
            this.onAddQueueItem.IconCompatParcelizer(bArrRemoteActionCompatParcelizer, iIconCompatParcelizer);
        }
        while (this.onAddQueueItem.IconCompatParcelizer() < 188) {
            int i = this.onAddQueueItem.read();
            int iAudioAttributesCompatParcelizer = closeonfailandthrowasioe.AudioAttributesCompatParcelizer(bArrRemoteActionCompatParcelizer, i, 9400 - i);
            if (iAudioAttributesCompatParcelizer == -1) {
                return false;
            }
            this.onAddQueueItem.AudioAttributesCompatParcelizer(i + iAudioAttributesCompatParcelizer);
        }
        return true;
    }

    private int IconCompatParcelizer() throws SchemaAware {
        int iWrite = this.onAddQueueItem.write();
        int i = this.onAddQueueItem.read();
        int iIconCompatParcelizer = unlinkFirst.IconCompatParcelizer(this.onAddQueueItem.RemoteActionCompatParcelizer(), iWrite, i);
        this.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer);
        int i2 = iIconCompatParcelizer + TsExtractor.TS_PACKET_SIZE;
        if (i2 > i) {
            int i3 = this.read + (iIconCompatParcelizer - iWrite);
            this.read = i3;
            if (this.MediaBrowserCompatItemReceiver != 2 || i3 <= 376) {
                return i2;
            }
            throw SchemaAware.RemoteActionCompatParcelizer("Cannot find sync byte. Most likely not a Transport Stream.", null);
        }
        this.read = 0;
        return i2;
    }

    private boolean IconCompatParcelizer(int i) {
        return this.MediaBrowserCompatItemReceiver == 2 || this.onCustomAction || !this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(i, false);
    }

    private void MediaBrowserCompatItemReceiver() {
        this.onCommand.clear();
        this.onPause.clear();
        SparseArray<removeFirstOccurrence> sparseArray = this.AudioAttributesImplBaseParcelizer.read();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            this.onPause.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        this.onPause.put(0, new offerLast(new IconCompatParcelizer()));
        this.AudioAttributesImplApi21Parcelizer = null;
    }

    class IconCompatParcelizer implements poll {
        private final AsExternalTypeSerializer read = new AsExternalTypeSerializer(new byte[4]);

        @Override // kotlin.poll
        public final void read(MinimalClassNameIdResolver minimalClassNameIdResolver, findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        }

        public IconCompatParcelizer() {
        }

        @Override // kotlin.poll
        public final void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
            if (asPropertyTypeDeserializer.onPlayFromMediaId() != 0 || (asPropertyTypeDeserializer.onPlayFromMediaId() & 128) == 0) {
                return;
            }
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(6);
            int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer() / 4;
            for (int i = 0; i < iIconCompatParcelizer; i++) {
                asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(this.read, 4);
                int iIconCompatParcelizer2 = this.read.IconCompatParcelizer(16);
                this.read.write(3);
                if (iIconCompatParcelizer2 == 0) {
                    this.read.write(13);
                } else {
                    int iIconCompatParcelizer3 = this.read.IconCompatParcelizer(13);
                    if (removeFirst.this.onPause.get(iIconCompatParcelizer3) == null) {
                        removeFirst.this.onPause.put(iIconCompatParcelizer3, new offerLast(removeFirst.this.new read(iIconCompatParcelizer3)));
                        removeFirst.read(removeFirst.this);
                    }
                }
            }
            if (removeFirst.this.MediaBrowserCompatItemReceiver != 2) {
                removeFirst.this.onPause.remove(0);
            }
        }
    }

    class read implements poll {
        private final int IconCompatParcelizer;
        private final AsExternalTypeSerializer write = new AsExternalTypeSerializer(new byte[5]);
        private final SparseArray<removeFirstOccurrence> read = new SparseArray<>();
        private final SparseIntArray RemoteActionCompatParcelizer = new SparseIntArray();

        @Override // kotlin.poll
        public final void read(MinimalClassNameIdResolver minimalClassNameIdResolver, findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        }

        public read(int i) {
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.poll
        public final void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
            MinimalClassNameIdResolver minimalClassNameIdResolver;
            if (asPropertyTypeDeserializer.onPlayFromMediaId() == 2) {
                if (removeFirst.this.MediaBrowserCompatItemReceiver == 1 || removeFirst.this.MediaBrowserCompatItemReceiver == 2 || removeFirst.this.MediaBrowserCompatSearchResultReceiver == 1) {
                    minimalClassNameIdResolver = (MinimalClassNameIdResolver) removeFirst.this.RatingCompat.get(0);
                } else {
                    minimalClassNameIdResolver = new MinimalClassNameIdResolver(((MinimalClassNameIdResolver) removeFirst.this.RatingCompat.get(0)).AudioAttributesCompatParcelizer());
                    removeFirst.this.RatingCompat.add(minimalClassNameIdResolver);
                }
                if ((asPropertyTypeDeserializer.onPlayFromMediaId() & 128) != 0) {
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
                    int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
                    int i = 3;
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(3);
                    asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(this.write, 2);
                    this.write.write(3);
                    int i2 = 13;
                    removeFirst.this.AudioAttributesImplApi26Parcelizer = this.write.IconCompatParcelizer(13);
                    asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(this.write, 2);
                    int i3 = 4;
                    this.write.write(4);
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(this.write.IconCompatParcelizer(12));
                    if (removeFirst.this.MediaBrowserCompatItemReceiver == 2 && removeFirst.this.AudioAttributesImplApi21Parcelizer == null) {
                        removeFirstOccurrence.read readVar = new removeFirstOccurrence.read(21, null, 0, null, LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer);
                        removeFirst removefirst = removeFirst.this;
                        removefirst.AudioAttributesImplApi21Parcelizer = removefirst.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(21, readVar);
                        if (removeFirst.this.AudioAttributesImplApi21Parcelizer != null) {
                            removeFirst.this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(minimalClassNameIdResolver, removeFirst.this.MediaBrowserCompatCustomActionResultReceiver, new removeFirstOccurrence.write(iOnPrepare, 21, 8192));
                        }
                    }
                    this.read.clear();
                    this.RemoteActionCompatParcelizer.clear();
                    int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer();
                    while (iIconCompatParcelizer > 0) {
                        asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(this.write, 5);
                        int iIconCompatParcelizer2 = this.write.IconCompatParcelizer(8);
                        this.write.write(i);
                        int iIconCompatParcelizer3 = this.write.IconCompatParcelizer(i2);
                        this.write.write(i3);
                        int iIconCompatParcelizer4 = this.write.IconCompatParcelizer(12);
                        removeFirstOccurrence.read readVar2 = read(asPropertyTypeDeserializer, iIconCompatParcelizer4);
                        if (iIconCompatParcelizer2 == 6 || iIconCompatParcelizer2 == 5) {
                            iIconCompatParcelizer2 = readVar2.RemoteActionCompatParcelizer;
                        }
                        iIconCompatParcelizer -= iIconCompatParcelizer4 + 5;
                        int i4 = removeFirst.this.MediaBrowserCompatItemReceiver == 2 ? iIconCompatParcelizer2 : iIconCompatParcelizer3;
                        if (!removeFirst.this.onCommand.get(i4)) {
                            removeFirstOccurrence removefirstoccurrenceAudioAttributesCompatParcelizer = (removeFirst.this.MediaBrowserCompatItemReceiver == 2 && iIconCompatParcelizer2 == 21) ? removeFirst.this.AudioAttributesImplApi21Parcelizer : removeFirst.this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(iIconCompatParcelizer2, readVar2);
                            if (removeFirst.this.MediaBrowserCompatItemReceiver != 2 || iIconCompatParcelizer3 < this.RemoteActionCompatParcelizer.get(i4, 8192)) {
                                this.RemoteActionCompatParcelizer.put(i4, iIconCompatParcelizer3);
                                this.read.put(i4, removefirstoccurrenceAudioAttributesCompatParcelizer);
                            }
                        }
                        i = 3;
                        i3 = 4;
                        i2 = 13;
                    }
                    int size = this.RemoteActionCompatParcelizer.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        int iKeyAt = this.RemoteActionCompatParcelizer.keyAt(i5);
                        int iValueAt = this.RemoteActionCompatParcelizer.valueAt(i5);
                        removeFirst.this.onCommand.put(iKeyAt, true);
                        removeFirst.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.put(iValueAt, true);
                        removeFirstOccurrence removefirstoccurrenceValueAt = this.read.valueAt(i5);
                        if (removefirstoccurrenceValueAt != null) {
                            if (removefirstoccurrenceValueAt != removeFirst.this.AudioAttributesImplApi21Parcelizer) {
                                removefirstoccurrenceValueAt.RemoteActionCompatParcelizer(minimalClassNameIdResolver, removeFirst.this.MediaBrowserCompatCustomActionResultReceiver, new removeFirstOccurrence.write(iOnPrepare, iKeyAt, 8192));
                            }
                            removeFirst.this.onPause.put(iValueAt, removefirstoccurrenceValueAt);
                        }
                    }
                    if (removeFirst.this.MediaBrowserCompatItemReceiver == 2) {
                        if (removeFirst.this.onCustomAction) {
                            return;
                        }
                        removeFirst.this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
                        removeFirst.this.MediaBrowserCompatSearchResultReceiver = 0;
                        removeFirst.write(removeFirst.this);
                        return;
                    }
                    removeFirst.this.onPause.remove(this.IconCompatParcelizer);
                    removeFirst removefirst2 = removeFirst.this;
                    removefirst2.MediaBrowserCompatSearchResultReceiver = removefirst2.MediaBrowserCompatItemReceiver == 1 ? 0 : removeFirst.this.MediaBrowserCompatSearchResultReceiver - 1;
                    if (removeFirst.this.MediaBrowserCompatSearchResultReceiver == 0) {
                        removeFirst.this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
                        removeFirst.write(removeFirst.this);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static o.removeFirstOccurrence.read read(kotlin.AsPropertyTypeDeserializer r12, int r13) {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.removeFirst.read.read(o.AsPropertyTypeDeserializer, int):o.removeFirstOccurrence$read");
        }
    }
}
