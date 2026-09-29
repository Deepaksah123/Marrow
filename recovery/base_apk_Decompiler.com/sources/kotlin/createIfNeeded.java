package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin._verifyAndResolvePlaceholders;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
public final class createIfNeeded extends emptyBindings {
    private getSelfReferencedType AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private final float AudioAttributesImplBaseParcelizer;
    private final _fromWellKnownInterface MediaBrowserCompatCustomActionResultReceiver;
    private final buildTypeDeserializer MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatMediaItem;
    private final int MediaBrowserCompatSearchResultReceiver;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final long MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final long RatingCompat;
    private final float RemoteActionCompatParcelizer;
    private int onAddQueueItem;
    private int onCommand;
    private final long onCustomAction;
    private final initExtraTracks<AudioAttributesCompatParcelizer> write;

    private static boolean IconCompatParcelizer(int i, long j) {
        return ((long) i) <= j;
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final Object AudioAttributesCompatParcelizer() {
        return null;
    }

    public static class read implements _verifyAndResolvePlaceholders.AudioAttributesCompatParcelizer {
        private final int AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplApi26Parcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private final int IconCompatParcelizer;
        private final int MediaBrowserCompatCustomActionResultReceiver;
        private final buildTypeDeserializer RemoteActionCompatParcelizer;
        private final float read;
        private final float write;

        public read() {
            this((byte) 0);
        }

        private read(byte b) {
            this(10000, 25000, 25000, 0.7f, buildTypeDeserializer.write);
        }

        private read(int i, int i2, int i3, float f, buildTypeDeserializer buildtypedeserializer) {
            this.AudioAttributesImplBaseParcelizer = 10000;
            this.IconCompatParcelizer = 25000;
            this.MediaBrowserCompatCustomActionResultReceiver = 25000;
            this.AudioAttributesImplApi26Parcelizer = AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD;
            this.AudioAttributesCompatParcelizer = AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD;
            this.read = 0.7f;
            this.write = 0.75f;
            this.RemoteActionCompatParcelizer = buildtypedeserializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o._verifyAndResolvePlaceholders.AudioAttributesCompatParcelizer
        public final _verifyAndResolvePlaceholders[] write(_verifyAndResolvePlaceholders.write[] writeVarArr, _fromWellKnownInterface _fromwellknowninterface) {
            _verifyAndResolvePlaceholders _verifyandresolveplaceholdersWrite;
            initExtraTracks initextratracksRemoteActionCompatParcelizer = createIfNeeded.RemoteActionCompatParcelizer(writeVarArr);
            _verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr = new _verifyAndResolvePlaceholders[writeVarArr.length];
            for (int i = 0; i < writeVarArr.length; i++) {
                _verifyAndResolvePlaceholders.write writeVar = writeVarArr[i];
                if (writeVar != null && writeVar.IconCompatParcelizer.length != 0) {
                    if (writeVar.IconCompatParcelizer.length == 1) {
                        _verifyandresolveplaceholdersWrite = new _applyModifiers(writeVar.read, writeVar.IconCompatParcelizer[0], writeVar.write);
                    } else {
                        _verifyandresolveplaceholdersWrite = write(writeVar.read, writeVar.IconCompatParcelizer, writeVar.write, _fromwellknowninterface, (initExtraTracks) initextratracksRemoteActionCompatParcelizer.get(i));
                    }
                    _verifyandresolveplaceholdersArr[i] = _verifyandresolveplaceholdersWrite;
                }
            }
            return _verifyandresolveplaceholdersArr;
        }

        private createIfNeeded write(setName setname, int[] iArr, int i, _fromWellKnownInterface _fromwellknowninterface, initExtraTracks<AudioAttributesCompatParcelizer> initextratracks) {
            return new createIfNeeded(setname, iArr, i, _fromwellknowninterface, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, this.read, this.write, initextratracks, this.RemoteActionCompatParcelizer);
        }
    }

    protected createIfNeeded(setName setname, int[] iArr, int i, _fromWellKnownInterface _fromwellknowninterface, long j, long j2, long j3, int i2, int i3, float f, float f2, List<AudioAttributesCompatParcelizer> list, buildTypeDeserializer buildtypedeserializer) {
        _fromWellKnownInterface _fromwellknowninterface2;
        long j4;
        super(setname, iArr, i);
        if (j3 < j) {
            prune.RemoteActionCompatParcelizer("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            _fromwellknowninterface2 = _fromwellknowninterface;
            j4 = j;
        } else {
            _fromwellknowninterface2 = _fromwellknowninterface;
            j4 = j3;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = _fromwellknowninterface2;
        this.MediaDescriptionCompat = j * 1000;
        this.RatingCompat = j2 * 1000;
        this.onCustomAction = j4 * 1000;
        this.MediaMetadataCompat = i2;
        this.MediaBrowserCompatSearchResultReceiver = i3;
        this.RemoteActionCompatParcelizer = f;
        this.AudioAttributesImplBaseParcelizer = f2;
        this.write = initExtraTracks.write(list);
        this.MediaBrowserCompatItemReceiver = buildtypedeserializer;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1.0f;
        this.onCommand = 0;
        this.AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;
        this.MediaBrowserCompatMediaItem = -2147483647L;
    }

    @Override // kotlin.emptyBindings, kotlin._verifyAndResolvePlaceholders
    public final void IconCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;
        this.AudioAttributesImplApi21Parcelizer = null;
    }

    @Override // kotlin.emptyBindings, kotlin._verifyAndResolvePlaceholders
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = null;
    }

    @Override // kotlin.emptyBindings, kotlin._verifyAndResolvePlaceholders
    public final void write(float f) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f;
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final void RemoteActionCompatParcelizer(long j, long j2, long j3, List<? extends getSelfReferencedType> list, ResolvedRecursiveType[] resolvedRecursiveTypeArr) {
        long jRemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(resolvedRecursiveTypeArr, list);
        int i = this.onCommand;
        if (i == 0) {
            this.onCommand = 1;
            this.onAddQueueItem = RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer, jAudioAttributesCompatParcelizer);
            return;
        }
        int i2 = this.onAddQueueItem;
        int iRemoteActionCompatParcelizer = list.isEmpty() ? -1 : RemoteActionCompatParcelizer(((getSelfReferencedType) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list)).MediaDescriptionCompat);
        if (iRemoteActionCompatParcelizer != -1) {
            i = ((getSelfReferencedType) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list)).RatingCompat;
            i2 = iRemoteActionCompatParcelizer;
        }
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer, jAudioAttributesCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 != i2 && !write(i2, jRemoteActionCompatParcelizer)) {
            C0170format c0170format = read(i2);
            C0170format c0170format2 = read(iRemoteActionCompatParcelizer2);
            long jIconCompatParcelizer = IconCompatParcelizer(j3, jAudioAttributesCompatParcelizer);
            if ((c0170format2.read > c0170format.read && j2 < jIconCompatParcelizer) || (c0170format2.read < c0170format.read && j2 >= this.RatingCompat)) {
                iRemoteActionCompatParcelizer2 = i2;
            }
        }
        if (iRemoteActionCompatParcelizer2 != i2) {
            i = 3;
        }
        this.onCommand = i;
        this.onAddQueueItem = iRemoteActionCompatParcelizer2;
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final int read() {
        return this.onAddQueueItem;
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final int write() {
        return this.onCommand;
    }

    @Override // kotlin.emptyBindings, kotlin._verifyAndResolvePlaceholders
    public final int AudioAttributesCompatParcelizer(long j, List<? extends getSelfReferencedType> list) {
        long jRemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
        if (!read(jRemoteActionCompatParcelizer, list)) {
            return list.size();
        }
        this.AudioAttributesImplApi26Parcelizer = jRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = list.isEmpty() ? null : (getSelfReferencedType) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(list.get(size - 1).MediaBrowserCompatItemReceiver - j, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (jIconCompatParcelizer >= jMediaBrowserCompatMediaItem) {
            C0170format c0170format = read(RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer, IconCompatParcelizer(list)));
            for (int i = 0; i < size; i++) {
                getSelfReferencedType getselfreferencedtype = list.get(i);
                C0170format c0170format2 = getselfreferencedtype.MediaDescriptionCompat;
                if (LaissezFaireSubTypeValidator.IconCompatParcelizer(getselfreferencedtype.MediaBrowserCompatItemReceiver - j, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) >= jMediaBrowserCompatMediaItem && c0170format2.read < c0170format.read && c0170format2.MediaMetadataCompat != -1 && c0170format2.MediaMetadataCompat <= this.MediaBrowserCompatSearchResultReceiver && c0170format2.onSetCaptioningEnabled != -1 && c0170format2.onSetCaptioningEnabled <= this.MediaMetadataCompat && c0170format2.MediaMetadataCompat < c0170format.MediaMetadataCompat) {
                    return i;
                }
            }
        }
        return size;
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final long AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    private boolean read(long j, List<? extends getSelfReferencedType> list) {
        long j2 = this.AudioAttributesImplApi26Parcelizer;
        if (j2 == C.TIME_UNSET || j - j2 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((getSelfReferencedType) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list)).equals(this.AudioAttributesImplApi21Parcelizer)) ? false : true;
    }

    private long MediaBrowserCompatMediaItem() {
        return this.onCustomAction;
    }

    private int RemoteActionCompatParcelizer(long j, long j2) {
        long j3 = read(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.AudioAttributesCompatParcelizer; i2++) {
            if (j == Long.MIN_VALUE || !write(i2, j)) {
                if (IconCompatParcelizer(read(i2).read, j3)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    private long IconCompatParcelizer(long j, long j2) {
        if (j == C.TIME_UNSET) {
            return this.MediaDescriptionCompat;
        }
        if (j2 != C.TIME_UNSET) {
            j -= j2;
        }
        return Math.min((long) (j * this.AudioAttributesImplBaseParcelizer), this.MediaDescriptionCompat);
    }

    private long AudioAttributesCompatParcelizer(ResolvedRecursiveType[] resolvedRecursiveTypeArr, List<? extends getSelfReferencedType> list) {
        int i = this.onAddQueueItem;
        if (i < resolvedRecursiveTypeArr.length && resolvedRecursiveTypeArr[i].read()) {
            ResolvedRecursiveType resolvedRecursiveType = resolvedRecursiveTypeArr[this.onAddQueueItem];
            return resolvedRecursiveType.AudioAttributesCompatParcelizer() - resolvedRecursiveType.RemoteActionCompatParcelizer();
        }
        for (ResolvedRecursiveType resolvedRecursiveType2 : resolvedRecursiveTypeArr) {
            if (resolvedRecursiveType2.read()) {
                return resolvedRecursiveType2.AudioAttributesCompatParcelizer() - resolvedRecursiveType2.RemoteActionCompatParcelizer();
            }
        }
        return IconCompatParcelizer(list);
    }

    private static long IconCompatParcelizer(List<? extends getSelfReferencedType> list) {
        if (list.isEmpty()) {
            return C.TIME_UNSET;
        }
        getSelfReferencedType getselfreferencedtype = (getSelfReferencedType) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list);
        return (getselfreferencedtype.MediaBrowserCompatItemReceiver == C.TIME_UNSET || getselfreferencedtype.AudioAttributesImplApi21Parcelizer == C.TIME_UNSET) ? C.TIME_UNSET : getselfreferencedtype.AudioAttributesImplApi21Parcelizer - getselfreferencedtype.MediaBrowserCompatItemReceiver;
    }

    private long read(long j) {
        long jWrite = write(j);
        if (this.write.isEmpty()) {
            return jWrite;
        }
        int i = 1;
        while (i < this.write.size() - 1 && this.write.get(i).write < jWrite) {
            i++;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write.get(i - 1);
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.write.get(i);
        return audioAttributesCompatParcelizer.read + ((long) (((jWrite - audioAttributesCompatParcelizer.write) / (audioAttributesCompatParcelizer2.write - audioAttributesCompatParcelizer.write)) * (audioAttributesCompatParcelizer2.read - audioAttributesCompatParcelizer.read)));
    }

    private long write(long j) {
        this.MediaBrowserCompatMediaItem = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        return (long) (((long) (r1 * this.RemoteActionCompatParcelizer)) / this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static initExtraTracks<initExtraTracks<AudioAttributesCompatParcelizer>> RemoteActionCompatParcelizer(_verifyAndResolvePlaceholders.write[] writeVarArr) {
        ArrayList arrayList = new ArrayList();
        for (_verifyAndResolvePlaceholders.write writeVar : writeVarArr) {
            if (writeVar != null && writeVar.IconCompatParcelizer.length > 1) {
                initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new AudioAttributesCompatParcelizer(0L, 0L));
                arrayList.add(iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver);
            } else {
                arrayList.add(null);
            }
        }
        long[][] jArrWrite = write(writeVarArr);
        int[] iArr = new int[jArrWrite.length];
        long[] jArr = new long[jArrWrite.length];
        for (int i = 0; i < jArrWrite.length; i++) {
            long[] jArr2 = jArrWrite[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        read(arrayList, jArr);
        initExtraTracks<Integer> initextratracksAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jArrWrite);
        for (int i2 = 0; i2 < initextratracksAudioAttributesCompatParcelizer.size(); i2++) {
            int iIntValue = initextratracksAudioAttributesCompatParcelizer.get(i2).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = jArrWrite[iIntValue][i3];
            read(arrayList, jArr);
        }
        for (int i4 = 0; i4 < writeVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] << 1;
            }
        }
        read(arrayList, jArr);
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver2 = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            initExtraTracks.IconCompatParcelizer iconCompatParcelizer = (initExtraTracks.IconCompatParcelizer) arrayList.get(i5);
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver2.read(iconCompatParcelizer == null ? initExtraTracks.AudioAttributesImplApi26Parcelizer() : iconCompatParcelizer.IconCompatParcelizer());
        }
        return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver2.IconCompatParcelizer();
    }

    private static long[][] write(_verifyAndResolvePlaceholders.write[] writeVarArr) {
        long[][] jArr = new long[writeVarArr.length][];
        for (int i = 0; i < writeVarArr.length; i++) {
            _verifyAndResolvePlaceholders.write writeVar = writeVarArr[i];
            if (writeVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[writeVar.IconCompatParcelizer.length];
                for (int i2 = 0; i2 < writeVar.IconCompatParcelizer.length; i2++) {
                    long j = writeVar.read.AudioAttributesCompatParcelizer(writeVar.IconCompatParcelizer[i2]).read;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i2] = j;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static initExtraTracks<Integer> AudioAttributesCompatParcelizer(long[][] jArr) {
        outputPendingMetadataSamples outputpendingmetadatasamplesRemoteActionCompatParcelizer = parseSidx.IconCompatParcelizer().RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double dLog = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    outputpendingmetadatasamplesRemoteActionCompatParcelizer.read(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return initExtraTracks.write(outputpendingmetadatasamplesRemoteActionCompatParcelizer.onAddQueueItem());
    }

    private static void read(List<initExtraTracks.IconCompatParcelizer<AudioAttributesCompatParcelizer>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            initExtraTracks.IconCompatParcelizer<AudioAttributesCompatParcelizer> iconCompatParcelizer = list.get(i);
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.read(new AudioAttributesCompatParcelizer(j, jArr[i]));
            }
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        public final long read;
        public final long write;

        public AudioAttributesCompatParcelizer(long j, long j2) {
            this.write = j;
            this.read = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.write == audioAttributesCompatParcelizer.write && this.read == audioAttributesCompatParcelizer.read;
        }

        public final int hashCode() {
            return (((int) this.write) * 31) + ((int) this.read);
        }
    }
}
