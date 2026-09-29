package kotlin;

import androidx.media3.common.DrmInitData;
import java.io.IOException;
import kotlin.PropertySerializerMapDouble;
import kotlin.PropertySerializerMapEmpty;
import kotlin.matchesUntyped;
import kotlin.nonNullString;
import kotlin.visitIntFormat;

/* JADX INFO: loaded from: classes2.dex */
public class visitIntFormat implements nonNullString {
    private final matchesUntyped AudioAttributesImplApi21Parcelizer;
    private C0170format AudioAttributesImplApi26Parcelizer;
    private final PropertySerializerMapEmpty.read MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private int RatingCompat;
    private PropertySerializerMapDouble RemoteActionCompatParcelizer;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private final visitFloatFormat onAddQueueItem;
    private int onCommand;
    private int onCustomAction;
    private long onMediaButtonEvent;
    private boolean onPlayFromSearch;
    private C0170format onPlayFromUri;
    private C0170format onPrepare;
    private IconCompatParcelizer onPrepareFromMediaId;
    private long onRewind;
    private int write;
    private final AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = new AudioAttributesCompatParcelizer();
    private int IconCompatParcelizer = 1000;
    private long[] onPlay = new long[1000];
    private long[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new long[1000];
    private long[] onPrepareFromSearch = new long[1000];
    private int[] AudioAttributesImplBaseParcelizer = new int[1000];
    private int[] onPlayFromMediaId = new int[1000];
    private nonNullString.AudioAttributesCompatParcelizer[] AudioAttributesCompatParcelizer = new nonNullString.AudioAttributesCompatParcelizer[1000];
    private final _appendShort<write> onFastForward = new _appendShort<>(new TypeSerializer() { // from class: o.TimeZoneSerializer
        @Override // kotlin.TypeSerializer
        public final void read(Object obj) {
            ((visitIntFormat.write) obj).IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    });
    private long onPause = Long.MIN_VALUE;
    private long MediaMetadataCompat = Long.MIN_VALUE;
    private long MediaDescriptionCompat = Long.MIN_VALUE;
    private boolean onRemoveQueueItemAt = true;
    private boolean onSeekTo = true;
    private boolean read = true;

    public interface IconCompatParcelizer {
        void MediaDescriptionCompat();
    }

    public static visitIntFormat write(_findWellKnownSimple _findwellknownsimple) {
        return new visitIntFormat(_findwellknownsimple, null, null);
    }

    public static visitIntFormat RemoteActionCompatParcelizer(_findWellKnownSimple _findwellknownsimple, matchesUntyped matchesuntyped, PropertySerializerMapEmpty.read readVar) {
        return new visitIntFormat(_findwellknownsimple, (matchesUntyped) buildTypeSerializer.IconCompatParcelizer(matchesuntyped), (PropertySerializerMapEmpty.read) buildTypeSerializer.IconCompatParcelizer(readVar));
    }

    public visitIntFormat(_findWellKnownSimple _findwellknownsimple, matchesUntyped matchesuntyped, PropertySerializerMapEmpty.read readVar) {
        this.AudioAttributesImplApi21Parcelizer = matchesuntyped;
        this.MediaBrowserCompatItemReceiver = readVar;
        this.onAddQueueItem = new visitFloatFormat(_findwellknownsimple);
    }

    public void onAddQueueItem() {
        RemoteActionCompatParcelizer(true);
        onMediaButtonEvent();
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        RemoteActionCompatParcelizer(false);
    }

    public void RemoteActionCompatParcelizer(boolean z) {
        this.onAddQueueItem.write();
        this.RatingCompat = 0;
        this.write = 0;
        this.onCustomAction = 0;
        this.onCommand = 0;
        this.onSeekTo = true;
        this.onPause = Long.MIN_VALUE;
        this.MediaMetadataCompat = Long.MIN_VALUE;
        this.MediaDescriptionCompat = Long.MIN_VALUE;
        this.MediaBrowserCompatSearchResultReceiver = false;
        this.onFastForward.AudioAttributesCompatParcelizer();
        if (z) {
            this.onPrepare = null;
            this.onPlayFromUri = null;
            this.onRemoveQueueItemAt = true;
            this.read = true;
        }
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.onPause = j;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.onRewind = j;
    }

    public final void handleMediaPlayPauseIfPendingOnHandler() {
        this.handleMediaPlayPauseIfPendingOnHandler = true;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.write + this.RatingCompat;
    }

    public final void IconCompatParcelizer(int i) {
        this.onAddQueueItem.read(RemoteActionCompatParcelizer(i));
    }

    public void RatingCompat() {
        read();
        onMediaButtonEvent();
    }

    public void MediaMetadataCompat() throws IOException {
        PropertySerializerMapDouble propertySerializerMapDouble = this.RemoteActionCompatParcelizer;
        if (propertySerializerMapDouble != null && propertySerializerMapDouble.IconCompatParcelizer() == 1) {
            throw ((PropertySerializerMapDouble.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.write()));
        }
    }

    public final int IconCompatParcelizer() {
        return this.write;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.write + this.onCommand;
    }

    public final long MediaDescriptionCompat() {
        long j;
        synchronized (this) {
            j = onCommand() ? this.onPlay[MediaBrowserCompatItemReceiver(this.onCommand)] : this.onRewind;
        }
        return j;
    }

    public final C0170format MediaBrowserCompatItemReceiver() {
        C0170format c0170format;
        synchronized (this) {
            c0170format = this.onRemoveQueueItemAt ? null : this.onPlayFromUri;
        }
        return c0170format;
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        long j;
        synchronized (this) {
            j = this.MediaDescriptionCompat;
        }
        return j;
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        long jMax;
        synchronized (this) {
            jMax = Math.max(this.MediaMetadataCompat, AudioAttributesImplApi26Parcelizer(this.onCommand));
        }
        return jMax;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        boolean z;
        synchronized (this) {
            z = this.MediaBrowserCompatSearchResultReceiver;
        }
        return z;
    }

    public final long AudioAttributesCompatParcelizer() {
        long j;
        synchronized (this) {
            j = this.RatingCompat == 0 ? Long.MIN_VALUE : this.onPrepareFromSearch[this.onCustomAction];
        }
        return j;
    }

    public boolean write(boolean z) {
        C0170format c0170format;
        synchronized (this) {
            boolean z2 = true;
            if (!onCommand()) {
                if (!z && !this.MediaBrowserCompatSearchResultReceiver && ((c0170format = this.onPlayFromUri) == null || c0170format == this.AudioAttributesImplApi26Parcelizer)) {
                    z2 = false;
                }
                return z2;
            }
            if (this.onFastForward.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer()).RemoteActionCompatParcelizer != this.AudioAttributesImplApi26Parcelizer) {
                return true;
            }
            return AudioAttributesImplBaseParcelizer(MediaBrowserCompatItemReceiver(this.onCommand));
        }
    }

    public int read(ObjectNode objectNode, _find _findVar, int i, boolean z) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(objectNode, _findVar, (i & 2) != 0, z, this.MediaBrowserCompatCustomActionResultReceiver);
        if (iAudioAttributesCompatParcelizer == -4 && !_findVar.AudioAttributesCompatParcelizer()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.onAddQueueItem.read(_findVar, this.MediaBrowserCompatCustomActionResultReceiver);
                } else {
                    this.onAddQueueItem.RemoteActionCompatParcelizer(_findVar, this.MediaBrowserCompatCustomActionResultReceiver);
                }
            }
            if (!z2) {
                this.onCommand++;
            }
        }
        return iAudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer(int i) {
        synchronized (this) {
            onFastForward();
            int i2 = this.write;
            if (i >= i2 && i <= this.RatingCompat + i2) {
                this.onPause = Long.MIN_VALUE;
                this.onCommand = i - i2;
                return true;
            }
            return false;
        }
    }

    public final boolean RemoteActionCompatParcelizer(long j, boolean z) {
        int iWrite;
        synchronized (this) {
            onFastForward();
            int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(this.onCommand);
            if (!onCommand() || j < this.onPrepareFromSearch[iMediaBrowserCompatItemReceiver] || (j > this.MediaDescriptionCompat && !z)) {
                return false;
            }
            if (this.read) {
                iWrite = write(iMediaBrowserCompatItemReceiver, this.RatingCompat - this.onCommand, j, z);
            } else {
                iWrite = read(iMediaBrowserCompatItemReceiver, this.RatingCompat - this.onCommand, j, true);
            }
            if (iWrite == -1) {
                return false;
            }
            this.onPause = j;
            this.onCommand += iWrite;
            return true;
        }
    }

    public final int IconCompatParcelizer(long j, boolean z) {
        synchronized (this) {
            int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(this.onCommand);
            if (onCommand() && j >= this.onPrepareFromSearch[iMediaBrowserCompatItemReceiver]) {
                if (j > this.MediaDescriptionCompat && z) {
                    return this.RatingCompat - this.onCommand;
                }
                int i = read(iMediaBrowserCompatItemReceiver, this.RatingCompat - this.onCommand, j, true);
                if (i == -1) {
                    return 0;
                }
                return i;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.onCommand     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.RatingCompat     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            kotlin.buildTypeSerializer.IconCompatParcelizer(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.onCommand     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.onCommand = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.visitIntFormat.write(int):void");
    }

    public final void RemoteActionCompatParcelizer(long j, boolean z, boolean z2) {
        this.onAddQueueItem.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(j, z, z2));
    }

    public final void RemoteActionCompatParcelizer() {
        this.onAddQueueItem.AudioAttributesCompatParcelizer(write());
    }

    public final void read() {
        this.onAddQueueItem.AudioAttributesCompatParcelizer(onCustomAction());
    }

    public final void write(long j) {
        if (this.onMediaButtonEvent != j) {
            this.onMediaButtonEvent = j;
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public final void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        this.onPrepareFromMediaId = iconCompatParcelizer;
    }

    @Override // kotlin.nonNullString
    public final void write(C0170format c0170format) {
        C0170format c0170formatIconCompatParcelizer = IconCompatParcelizer(c0170format);
        this.onPlayFromSearch = false;
        this.onPrepare = c0170format;
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(c0170formatIconCompatParcelizer);
        IconCompatParcelizer iconCompatParcelizer = this.onPrepareFromMediaId;
        if (iconCompatParcelizer == null || !zRemoteActionCompatParcelizer) {
            return;
        }
        iconCompatParcelizer.MediaDescriptionCompat();
    }

    @Override // kotlin.nonNullString
    public final int AudioAttributesCompatParcelizer(JsonNullFormatVisitor jsonNullFormatVisitor, int i, boolean z, int i2) throws IOException {
        return this.onAddQueueItem.write(jsonNullFormatVisitor, i, z);
    }

    @Override // kotlin.nonNullString
    public final void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) {
        this.onAddQueueItem.read(asPropertyTypeDeserializer, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // kotlin.nonNullString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void IconCompatParcelizer(long r13, int r15, int r16, int r17, o.nonNullString.AudioAttributesCompatParcelizer r18) {
        /*
            r12 = this;
            r0 = r12
            boolean r1 = r0.onPlayFromSearch
            if (r1 == 0) goto L10
            o.format r1 = r0.onPrepare
            java.lang.Object r1 = kotlin.buildTypeSerializer.AudioAttributesCompatParcelizer(r1)
            o.format r1 = (kotlin.C0170format) r1
            r12.write(r1)
        L10:
            r1 = r15 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            r4 = r3
            goto L19
        L18:
            r4 = r2
        L19:
            boolean r5 = r0.onSeekTo
            if (r5 == 0) goto L21
            if (r4 == 0) goto L5f
            r0.onSeekTo = r2
        L21:
            long r5 = r0.onMediaButtonEvent
            long r5 = r5 + r13
            boolean r7 = r0.read
            if (r7 == 0) goto L4f
            long r7 = r0.onPause
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 < 0) goto L5f
            if (r1 != 0) goto L4f
            boolean r1 = r0.MediaBrowserCompatMediaItem
            if (r1 != 0) goto L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.<init>(r7)
            o.format r7 = r0.onPlayFromUri
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            kotlin.prune.RemoteActionCompatParcelizer(r7, r1)
            r0.MediaBrowserCompatMediaItem = r3
        L4b:
            r1 = r15 | 1
            r3 = r1
            goto L50
        L4f:
            r3 = r15
        L50:
            boolean r1 = r0.handleMediaPlayPauseIfPendingOnHandler
            if (r1 == 0) goto L60
            if (r4 == 0) goto L5f
            boolean r1 = r12.read(r5)
            if (r1 == 0) goto L5f
            r0.handleMediaPlayPauseIfPendingOnHandler = r2
            goto L60
        L5f:
            return
        L60:
            o.visitFloatFormat r1 = r0.onAddQueueItem
            long r1 = r1.RemoteActionCompatParcelizer()
            r7 = r16
            long r8 = (long) r7
            r4 = r17
            long r10 = (long) r4
            long r1 = r1 - r8
            long r8 = r1 - r10
            r0 = r12
            r1 = r5
            r4 = r8
            r6 = r16
            r7 = r18
            r0.read(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.visitIntFormat.IconCompatParcelizer(long, int, int, int, o.nonNullString$AudioAttributesCompatParcelizer):void");
    }

    protected final void MediaBrowserCompatSearchResultReceiver() {
        this.onPlayFromSearch = true;
    }

    public C0170format IconCompatParcelizer(C0170format c0170format) {
        return (this.onMediaButtonEvent == 0 || c0170format.onSeekTo == Long.MAX_VALUE) ? c0170format : c0170format.write().write(c0170format.onSeekTo + this.onMediaButtonEvent).IconCompatParcelizer();
    }

    private void onFastForward() {
        synchronized (this) {
            this.onCommand = 0;
            this.onAddQueueItem.IconCompatParcelizer();
        }
    }

    private int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, boolean z, boolean z2, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this) {
            _findVar.AudioAttributesImplBaseParcelizer = false;
            if (!onCommand()) {
                if (!z2 && !this.MediaBrowserCompatSearchResultReceiver) {
                    C0170format c0170format = this.onPlayFromUri;
                    if (c0170format == null || (!z && c0170format == this.AudioAttributesImplApi26Parcelizer)) {
                        return -3;
                    }
                    write((C0170format) buildTypeSerializer.IconCompatParcelizer(c0170format), objectNode);
                    return -5;
                }
                _findVar.c_(4);
                _findVar.RemoteActionCompatParcelizer = Long.MIN_VALUE;
                return -4;
            }
            C0170format c0170format2 = this.onFastForward.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer()).RemoteActionCompatParcelizer;
            if (!z && c0170format2 == this.AudioAttributesImplApi26Parcelizer) {
                int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(this.onCommand);
                if (!AudioAttributesImplBaseParcelizer(iMediaBrowserCompatItemReceiver)) {
                    _findVar.AudioAttributesImplBaseParcelizer = true;
                    return -3;
                }
                _findVar.c_(this.AudioAttributesImplBaseParcelizer[iMediaBrowserCompatItemReceiver]);
                if (this.onCommand == this.RatingCompat - 1 && (z2 || this.MediaBrowserCompatSearchResultReceiver)) {
                    _findVar.IconCompatParcelizer(536870912);
                }
                _findVar.RemoteActionCompatParcelizer = this.onPrepareFromSearch[iMediaBrowserCompatItemReceiver];
                audioAttributesCompatParcelizer.IconCompatParcelizer = this.onPlayFromMediaId[iMediaBrowserCompatItemReceiver];
                audioAttributesCompatParcelizer.read = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver[iMediaBrowserCompatItemReceiver];
                audioAttributesCompatParcelizer.write = this.AudioAttributesCompatParcelizer[iMediaBrowserCompatItemReceiver];
                return -4;
            }
            write(c0170format2, objectNode);
            return -5;
        }
    }

    private boolean RemoteActionCompatParcelizer(C0170format c0170format) {
        synchronized (this) {
            this.onRemoveQueueItemAt = false;
            if (LaissezFaireSubTypeValidator.read(c0170format, this.onPlayFromUri)) {
                return false;
            }
            if (!this.onFastForward.IconCompatParcelizer() && this.onFastForward.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.equals(c0170format)) {
                this.onPlayFromUri = this.onFastForward.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
            } else {
                this.onPlayFromUri = c0170format;
            }
            this.read &= DefaultBaseTypeLimitingValidator.IconCompatParcelizer(this.onPlayFromUri.onPlayFromUri, this.onPlayFromUri.RemoteActionCompatParcelizer);
            this.MediaBrowserCompatMediaItem = false;
            return true;
        }
    }

    private long AudioAttributesCompatParcelizer(long j, boolean z, boolean z2) {
        int i;
        synchronized (this) {
            try {
                int i2 = this.RatingCompat;
                if (i2 != 0) {
                    long[] jArr = this.onPrepareFromSearch;
                    int i3 = this.onCustomAction;
                    if (j >= jArr[i3]) {
                        if (z2 && (i = this.onCommand) != i2) {
                            i2 = i + 1;
                        }
                        int i4 = read(i3, i2, j, z);
                        if (i4 == -1) {
                            return -1L;
                        }
                        return read(i4);
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long write() {
        synchronized (this) {
            int i = this.onCommand;
            if (i == 0) {
                return -1L;
            }
            return read(i);
        }
    }

    private long onCustomAction() {
        synchronized (this) {
            int i = this.RatingCompat;
            if (i == 0) {
                return -1L;
            }
            return read(i);
        }
    }

    private void onMediaButtonEvent() {
        PropertySerializerMapDouble propertySerializerMapDouble = this.RemoteActionCompatParcelizer;
        if (propertySerializerMapDouble != null) {
            propertySerializerMapDouble.read(this.MediaBrowserCompatItemReceiver);
            this.RemoteActionCompatParcelizer = null;
            this.AudioAttributesImplApi26Parcelizer = null;
        }
    }

    private void read(long j, int i, long j2, int i2, nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        matchesUntyped.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer;
        synchronized (this) {
            int i3 = this.RatingCompat;
            byte b = 0;
            if (i3 > 0) {
                int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i3 - 1);
                buildTypeSerializer.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver[iMediaBrowserCompatItemReceiver] + ((long) this.onPlayFromMediaId[iMediaBrowserCompatItemReceiver]) <= j2);
            }
            this.MediaBrowserCompatSearchResultReceiver = (536870912 & i) != 0;
            this.MediaDescriptionCompat = Math.max(this.MediaDescriptionCompat, j);
            int iMediaBrowserCompatItemReceiver2 = MediaBrowserCompatItemReceiver(this.RatingCompat);
            this.onPrepareFromSearch[iMediaBrowserCompatItemReceiver2] = j;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver[iMediaBrowserCompatItemReceiver2] = j2;
            this.onPlayFromMediaId[iMediaBrowserCompatItemReceiver2] = i2;
            this.AudioAttributesImplBaseParcelizer[iMediaBrowserCompatItemReceiver2] = i;
            this.AudioAttributesCompatParcelizer[iMediaBrowserCompatItemReceiver2] = audioAttributesCompatParcelizer;
            this.onPlay[iMediaBrowserCompatItemReceiver2] = this.onRewind;
            if (this.onFastForward.IconCompatParcelizer() || !this.onFastForward.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.equals(this.onPlayFromUri)) {
                C0170format c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(this.onPlayFromUri);
                matchesUntyped matchesuntyped = this.AudioAttributesImplApi21Parcelizer;
                if (matchesuntyped != null) {
                    audioAttributesCompatParcelizerIconCompatParcelizer = matchesuntyped.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, c0170format);
                } else {
                    audioAttributesCompatParcelizerIconCompatParcelizer = matchesUntyped.AudioAttributesCompatParcelizer.read;
                }
                this.onFastForward.IconCompatParcelizer(AudioAttributesImplBaseParcelizer(), new write(c0170format, audioAttributesCompatParcelizerIconCompatParcelizer, b));
            }
            int i4 = this.RatingCompat + 1;
            this.RatingCompat = i4;
            int i5 = this.IconCompatParcelizer;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                nonNullString.AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = new nonNullString.AudioAttributesCompatParcelizer[i6];
                int i7 = this.onCustomAction;
                int i8 = i5 - i7;
                System.arraycopy(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i7, jArr2, 0, i8);
                System.arraycopy(this.onPrepareFromSearch, this.onCustomAction, jArr3, 0, i8);
                System.arraycopy(this.AudioAttributesImplBaseParcelizer, this.onCustomAction, iArr, 0, i8);
                System.arraycopy(this.onPlayFromMediaId, this.onCustomAction, iArr2, 0, i8);
                System.arraycopy(this.AudioAttributesCompatParcelizer, this.onCustomAction, audioAttributesCompatParcelizerArr, 0, i8);
                System.arraycopy(this.onPlay, this.onCustomAction, jArr, 0, i8);
                int i9 = this.onCustomAction;
                System.arraycopy(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, 0, jArr2, i8, i9);
                System.arraycopy(this.onPrepareFromSearch, 0, jArr3, i8, i9);
                System.arraycopy(this.AudioAttributesImplBaseParcelizer, 0, iArr, i8, i9);
                System.arraycopy(this.onPlayFromMediaId, 0, iArr2, i8, i9);
                System.arraycopy(this.AudioAttributesCompatParcelizer, 0, audioAttributesCompatParcelizerArr, i8, i9);
                System.arraycopy(this.onPlay, 0, jArr, i8, i9);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = jArr2;
                this.onPrepareFromSearch = jArr3;
                this.AudioAttributesImplBaseParcelizer = iArr;
                this.onPlayFromMediaId = iArr2;
                this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizerArr;
                this.onPlay = jArr;
                this.onCustomAction = 0;
                this.IconCompatParcelizer = i6;
            }
        }
    }

    private boolean read(long j) {
        synchronized (this) {
            if (this.RatingCompat == 0) {
                return j > this.MediaMetadataCompat;
            }
            if (AudioAttributesImplApi21Parcelizer() >= j) {
                return false;
            }
            RemoteActionCompatParcelizer(this.write + IconCompatParcelizer(j));
            return true;
        }
    }

    private long RemoteActionCompatParcelizer(int i) {
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer() - i;
        boolean z = false;
        buildTypeSerializer.IconCompatParcelizer(iAudioAttributesImplBaseParcelizer >= 0 && iAudioAttributesImplBaseParcelizer <= this.RatingCompat - this.onCommand);
        int i2 = this.RatingCompat - iAudioAttributesImplBaseParcelizer;
        this.RatingCompat = i2;
        this.MediaDescriptionCompat = Math.max(this.MediaMetadataCompat, AudioAttributesImplApi26Parcelizer(i2));
        if (iAudioAttributesImplBaseParcelizer == 0 && this.MediaBrowserCompatSearchResultReceiver) {
            z = true;
        }
        this.MediaBrowserCompatSearchResultReceiver = z;
        this.onFastForward.write(i);
        int i3 = this.RatingCompat;
        if (i3 == 0) {
            return 0L;
        }
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i3 - 1);
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver[iMediaBrowserCompatItemReceiver] + ((long) this.onPlayFromMediaId[iMediaBrowserCompatItemReceiver]);
    }

    private boolean onCommand() {
        return this.onCommand != this.RatingCompat;
    }

    private void write(C0170format c0170format, ObjectNode objectNode) {
        C0170format c0170format2 = this.AudioAttributesImplApi26Parcelizer;
        boolean z = c0170format2 == null;
        DrmInitData drmInitData = c0170format2 == null ? null : c0170format2.MediaBrowserCompatMediaItem;
        this.AudioAttributesImplApi26Parcelizer = c0170format;
        DrmInitData drmInitData2 = c0170format.MediaBrowserCompatMediaItem;
        matchesUntyped matchesuntyped = this.AudioAttributesImplApi21Parcelizer;
        objectNode.write = matchesuntyped != null ? c0170format.read(matchesuntyped.AudioAttributesCompatParcelizer(c0170format)) : c0170format;
        objectNode.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            if (z || !LaissezFaireSubTypeValidator.read(drmInitData, drmInitData2)) {
                PropertySerializerMapDouble propertySerializerMapDouble = this.RemoteActionCompatParcelizer;
                PropertySerializerMapDouble propertySerializerMapDoubleAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, c0170format);
                this.RemoteActionCompatParcelizer = propertySerializerMapDoubleAudioAttributesCompatParcelizer;
                objectNode.IconCompatParcelizer = propertySerializerMapDoubleAudioAttributesCompatParcelizer;
                if (propertySerializerMapDouble != null) {
                    propertySerializerMapDouble.read(this.MediaBrowserCompatItemReceiver);
                }
            }
        }
    }

    private boolean AudioAttributesImplBaseParcelizer(int i) {
        PropertySerializerMapDouble propertySerializerMapDouble = this.RemoteActionCompatParcelizer;
        if (propertySerializerMapDouble == null || propertySerializerMapDouble.IconCompatParcelizer() == 4) {
            return true;
        }
        return (this.AudioAttributesImplBaseParcelizer[i] & 1073741824) == 0 && this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    private int read(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.onPrepareFromSearch[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.AudioAttributesImplBaseParcelizer[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.IconCompatParcelizer) {
                i = 0;
            }
        }
        return i3;
    }

    private int write(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.onPrepareFromSearch[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.IconCompatParcelizer) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    private int IconCompatParcelizer(long j) {
        int i = this.RatingCompat;
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i - 1);
        while (i > this.onCommand && this.onPrepareFromSearch[iMediaBrowserCompatItemReceiver] >= j) {
            i--;
            iMediaBrowserCompatItemReceiver--;
            if (iMediaBrowserCompatItemReceiver == -1) {
                iMediaBrowserCompatItemReceiver = this.IconCompatParcelizer - 1;
            }
        }
        return i;
    }

    private long read(int i) {
        this.MediaMetadataCompat = Math.max(this.MediaMetadataCompat, AudioAttributesImplApi26Parcelizer(i));
        this.RatingCompat -= i;
        int i2 = this.write + i;
        this.write = i2;
        int i3 = this.onCustomAction + i;
        this.onCustomAction = i3;
        int i4 = this.IconCompatParcelizer;
        if (i3 >= i4) {
            this.onCustomAction = i3 - i4;
        }
        int i5 = this.onCommand - i;
        this.onCommand = i5;
        if (i5 < 0) {
            this.onCommand = 0;
        }
        this.onFastForward.IconCompatParcelizer(i2);
        if (this.RatingCompat == 0) {
            int i6 = this.onCustomAction;
            if (i6 == 0) {
                i6 = this.IconCompatParcelizer;
            }
            int i7 = i6 - 1;
            return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver[i7] + ((long) this.onPlayFromMediaId[i7]);
        }
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver[this.onCustomAction];
    }

    private long AudioAttributesImplApi26Parcelizer(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.onPrepareFromSearch[iMediaBrowserCompatItemReceiver]);
            if ((this.AudioAttributesImplBaseParcelizer[iMediaBrowserCompatItemReceiver] & 1) != 0) {
                return jMax;
            }
            iMediaBrowserCompatItemReceiver--;
            if (iMediaBrowserCompatItemReceiver == -1) {
                iMediaBrowserCompatItemReceiver = this.IconCompatParcelizer - 1;
            }
        }
        return jMax;
    }

    private int MediaBrowserCompatItemReceiver(int i) {
        int i2 = this.onCustomAction + i;
        int i3 = this.IconCompatParcelizer;
        return i2 < i3 ? i2 : i2 - i3;
    }

    static final class AudioAttributesCompatParcelizer {
        public int IconCompatParcelizer;
        public long read;
        public nonNullString.AudioAttributesCompatParcelizer write;

        AudioAttributesCompatParcelizer() {
        }
    }

    static final class write {
        public final matchesUntyped.AudioAttributesCompatParcelizer IconCompatParcelizer;
        public final C0170format RemoteActionCompatParcelizer;

        /* synthetic */ write(C0170format c0170format, matchesUntyped.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
            this(c0170format, audioAttributesCompatParcelizer);
        }

        private write(C0170format c0170format, matchesUntyped.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.RemoteActionCompatParcelizer = c0170format;
            this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        }
    }
}
