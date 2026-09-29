package kotlin;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.C0170format;
import kotlin.PropertySerializerMapEmpty;
import kotlin.StdJdkSerializersAtomicBooleanSerializer;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;
import kotlin.StdKeySerializer;
import kotlin.SubTypeValidator;
import kotlin._resolveSuperClass;
import kotlin.constructCollectionType;
import kotlin.isCollectionMapOrArray;
import kotlin.visitIntFormat;

/* JADX INFO: loaded from: classes2.dex */
final class _nonEmpty implements StdJdkSerializersAtomicIntegerSerializer, findRawSuperTypes, constructCollectionType.RemoteActionCompatParcelizer<write>, constructCollectionType.read, visitIntFormat.IconCompatParcelizer {
    private final String AudioAttributesImplApi21Parcelizer;
    private final _hasTypeResolver AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final PropertySerializerMapEmpty.read MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatMediaItem;
    private final matchesUntyped MediaBrowserCompatSearchResultReceiver;
    private IcyHeaders MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private boolean onCommand;
    private boolean onCustomAction;
    private long onFastForward;
    private final _resolveSuperClass onPause;
    private final IconCompatParcelizer onPlayFromMediaId;
    private final StdKeySerializer.read onPlayFromSearch;
    private boolean onPlayFromUri;
    private boolean onPrepare;
    private final findAnnotatedContentSerializer onPrepareFromUri;
    private boolean onRemoveQueueItem;
    private boolean onRewind;
    private boolean onSeekTo;
    private boolean onSetPlaybackSpeed;
    private boolean onSetRating;
    private isCollectionMapOrArray onSetShuffleMode;
    private read onSkipToNext;
    private final long onSkipToQueueItem;
    private final Uri onStop;
    private final _findWellKnownSimple read;
    private StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer write;
    private static final Map<String, String> RemoteActionCompatParcelizer = MediaBrowserCompatSearchResultReceiver();
    private static final C0170format AudioAttributesCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer("icy").AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_ICY).IconCompatParcelizer();
    private final constructCollectionType onPlay = new constructCollectionType("ProgressiveMediaPeriod");
    private final typeIdVisibility onMediaButtonEvent = new typeIdVisibility();
    private final Runnable onPrepareFromSearch = new Runnable() { // from class: o.isDefaultSerializer
        @Override // java.lang.Runnable
        public final void run() {
            this.read.onAddQueueItem();
        }
    };
    private final Runnable onPrepareFromMediaId = new Runnable() { // from class: o.visitArrayFormat
        @Override // java.lang.Runnable
        public final void run() {
            this.read.MediaBrowserCompatCustomActionResultReceiver();
        }
    };
    private final Handler RatingCompat = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer();
    private AudioAttributesCompatParcelizer[] onSetCaptioningEnabled = new AudioAttributesCompatParcelizer[0];
    private visitIntFormat[] onSetRepeatMode = new visitIntFormat[0];
    private long onRemoveQueueItemAt = C.TIME_UNSET;
    private int MediaBrowserCompatItemReceiver = 1;

    interface IconCompatParcelizer {
        void IconCompatParcelizer(long j, boolean z, boolean z2);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
    }

    static /* synthetic */ long read(_nonEmpty _nonempty) {
        return _nonempty.read(true);
    }

    public _nonEmpty(Uri uri, _hasTypeResolver _hastyperesolver, findAnnotatedContentSerializer findannotatedcontentserializer, matchesUntyped matchesuntyped, PropertySerializerMapEmpty.read readVar, _resolveSuperClass _resolvesuperclass, StdKeySerializer.read readVar2, IconCompatParcelizer iconCompatParcelizer, _findWellKnownSimple _findwellknownsimple, String str, int i, long j) {
        this.onStop = uri;
        this.AudioAttributesImplApi26Parcelizer = _hastyperesolver;
        this.MediaBrowserCompatSearchResultReceiver = matchesuntyped;
        this.MediaBrowserCompatCustomActionResultReceiver = readVar;
        this.onPause = _resolvesuperclass;
        this.onPlayFromSearch = readVar2;
        this.onPlayFromMediaId = iconCompatParcelizer;
        this.read = _findwellknownsimple;
        this.AudioAttributesImplApi21Parcelizer = str;
        this.AudioAttributesImplBaseParcelizer = i;
        this.onPrepareFromUri = findannotatedcontentserializer;
        this.onSkipToQueueItem = j;
    }

    final /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.onSeekTo) {
            return;
        }
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.write)).RemoteActionCompatParcelizer(this);
    }

    public final void MediaMetadataCompat() {
        if (this.onRemoveQueueItem) {
            for (visitIntFormat visitintformat : this.onSetRepeatMode) {
                visitintformat.RatingCompat();
            }
        }
        this.onPlay.read(this);
        this.RatingCompat.removeCallbacksAndMessages(null);
        this.write = null;
        this.onSeekTo = true;
    }

    @Override // o.constructCollectionType.read
    public final void AudioAttributesImplBaseParcelizer() {
        for (visitIntFormat visitintformat : this.onSetRepeatMode) {
            visitintformat.onAddQueueItem();
        }
        this.onPrepareFromUri.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        this.write = audioAttributesCompatParcelizer;
        this.onMediaButtonEvent.read();
        onCommand();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void write() throws IOException {
        onFastForward();
        if (this.onPlayFromUri && !this.onRemoveQueueItem) {
            throw SchemaAware.RemoteActionCompatParcelizer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final _writeAsBinary D_() {
        RatingCompat();
        return this.onSkipToNext.IconCompatParcelizer;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, boolean[] zArr, visitStringFormat[] visitstringformatArr, boolean[] zArr2, long j) {
        _verifyAndResolvePlaceholders _verifyandresolveplaceholders;
        RatingCompat();
        _writeAsBinary _writeasbinary = this.onSkipToNext.IconCompatParcelizer;
        boolean[] zArr3 = this.onSkipToNext.read;
        int i = this.MediaDescriptionCompat;
        int i2 = 0;
        for (int i3 = 0; i3 < _verifyandresolveplaceholdersArr.length; i3++) {
            visitStringFormat visitstringformat = visitstringformatArr[i3];
            if (visitstringformat != null && (_verifyandresolveplaceholdersArr[i3] == null || !zArr[i3])) {
                int i4 = ((RemoteActionCompatParcelizer) visitstringformat).AudioAttributesCompatParcelizer;
                buildTypeSerializer.write(zArr3[i4]);
                this.MediaDescriptionCompat--;
                zArr3[i4] = false;
                visitstringformatArr[i3] = null;
            }
        }
        boolean z = !this.onSetPlaybackSpeed ? j == 0 || this.onAddQueueItem : i != 0;
        for (int i5 = 0; i5 < _verifyandresolveplaceholdersArr.length; i5++) {
            if (visitstringformatArr[i5] == null && (_verifyandresolveplaceholders = _verifyandresolveplaceholdersArr[i5]) != null) {
                buildTypeSerializer.write(_verifyandresolveplaceholders.MediaBrowserCompatCustomActionResultReceiver() == 1);
                buildTypeSerializer.write(_verifyandresolveplaceholders.IconCompatParcelizer(0) == 0);
                int iRemoteActionCompatParcelizer = _writeasbinary.RemoteActionCompatParcelizer(_verifyandresolveplaceholders.AudioAttributesImplBaseParcelizer());
                buildTypeSerializer.write(!zArr3[iRemoteActionCompatParcelizer]);
                this.MediaDescriptionCompat++;
                zArr3[iRemoteActionCompatParcelizer] = true;
                visitstringformatArr[i5] = new RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
                zArr2[i5] = true;
                if (!z) {
                    visitIntFormat visitintformat = this.onSetRepeatMode[iRemoteActionCompatParcelizer];
                    z = (visitintformat.AudioAttributesImplApi26Parcelizer() == 0 || visitintformat.RemoteActionCompatParcelizer(j, true)) ? false : true;
                }
            }
        }
        if (this.MediaDescriptionCompat == 0) {
            this.onRewind = false;
            this.onPrepare = false;
            if (this.onPlay.RemoteActionCompatParcelizer()) {
                visitIntFormat[] visitintformatArr = this.onSetRepeatMode;
                int length = visitintformatArr.length;
                while (i2 < length) {
                    visitintformatArr[i2].read();
                    i2++;
                }
                this.onPlay.AudioAttributesCompatParcelizer();
            } else {
                this.onPlayFromUri = false;
                visitIntFormat[] visitintformatArr2 = this.onSetRepeatMode;
                int length2 = visitintformatArr2.length;
                while (i2 < length2) {
                    visitintformatArr2[i2].MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    i2++;
                }
            }
        } else if (z) {
            j = write(j);
            while (i2 < visitstringformatArr.length) {
                if (visitstringformatArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.onSetPlaybackSpeed = true;
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(long j, boolean z) {
        if (this.onAddQueueItem) {
            return;
        }
        RatingCompat();
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            return;
        }
        boolean[] zArr = this.onSkipToNext.read;
        int length = this.onSetRepeatMode.length;
        for (int i = 0; i < length; i++) {
            this.onSetRepeatMode[i].RemoteActionCompatParcelizer(j, z, zArr[i]);
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        if (this.onPlayFromUri || this.onPlay.IconCompatParcelizer() || this.onRewind) {
            return false;
        }
        if (this.onRemoveQueueItem && this.MediaDescriptionCompat == 0) {
            return false;
        }
        boolean z = this.onMediaButtonEvent.read();
        if (this.onPlay.RemoteActionCompatParcelizer()) {
            return z;
        }
        onCommand();
        return true;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return this.onPlay.RemoteActionCompatParcelizer() && this.onMediaButtonEvent.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        return read();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long E_() {
        if (!this.onPrepare) {
            return C.TIME_UNSET;
        }
        if (!this.onPlayFromUri && MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() <= this.MediaMetadataCompat) {
            return C.TIME_UNSET;
        }
        this.onPrepare = false;
        return this.onFastForward;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long read() {
        long jMin;
        RatingCompat();
        if (this.onPlayFromUri || this.MediaDescriptionCompat == 0) {
            return Long.MIN_VALUE;
        }
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            return this.onRemoveQueueItemAt;
        }
        if (this.onCommand) {
            int length = this.onSetRepeatMode.length;
            jMin = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (this.onSkipToNext.write[i] && this.onSkipToNext.read[i] && !this.onSetRepeatMode[i].MediaBrowserCompatMediaItem()) {
                    jMin = Math.min(jMin, this.onSetRepeatMode[i].MediaBrowserCompatCustomActionResultReceiver());
                }
            }
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = read(false);
        }
        return jMin == Long.MIN_VALUE ? this.onFastForward : jMin;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long write(long j) {
        RatingCompat();
        boolean[] zArr = this.onSkipToNext.write;
        if (!this.onSetShuffleMode.IconCompatParcelizer()) {
            j = 0;
        }
        int i = 0;
        this.onPrepare = false;
        this.onFastForward = j;
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            this.onRemoveQueueItemAt = j;
            return j;
        }
        if (this.MediaBrowserCompatItemReceiver == 7 || ((!this.onPlayFromUri && !this.onPlay.RemoteActionCompatParcelizer()) || !read(zArr, j))) {
            this.onRewind = false;
            this.onRemoveQueueItemAt = j;
            this.onPlayFromUri = false;
            if (this.onPlay.RemoteActionCompatParcelizer()) {
                visitIntFormat[] visitintformatArr = this.onSetRepeatMode;
                int length = visitintformatArr.length;
                while (i < length) {
                    visitintformatArr[i].read();
                    i++;
                }
                this.onPlay.AudioAttributesCompatParcelizer();
                return j;
            }
            this.onPlay.write();
            visitIntFormat[] visitintformatArr2 = this.onSetRepeatMode;
            int length2 = visitintformatArr2.length;
            while (i < length2) {
                visitintformatArr2[i].MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                i++;
            }
        }
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(long j, createKeySerializer createkeyserializer) {
        RatingCompat();
        if (!this.onSetShuffleMode.IconCompatParcelizer()) {
            return 0L;
        }
        isCollectionMapOrArray.read readVarWrite = this.onSetShuffleMode.write(j);
        return createkeyserializer.write(j, readVarWrite.AudioAttributesCompatParcelizer.IconCompatParcelizer, readVarWrite.IconCompatParcelizer.IconCompatParcelizer);
    }

    final boolean write(int i) {
        return !onPause() && this.onSetRepeatMode[i].write(this.onPlayFromUri);
    }

    final void IconCompatParcelizer(int i) throws IOException {
        this.onSetRepeatMode[i].MediaMetadataCompat();
        onFastForward();
    }

    private void onFastForward() throws IOException {
        this.onPlay.AudioAttributesCompatParcelizer(this.onPause.write(this.MediaBrowserCompatItemReceiver));
    }

    final int AudioAttributesCompatParcelizer(int i, ObjectNode objectNode, _find _findVar, int i2) {
        if (onPause()) {
            return -3;
        }
        RemoteActionCompatParcelizer(i);
        int i3 = this.onSetRepeatMode[i].read(objectNode, _findVar, i2, this.onPlayFromUri);
        if (i3 == -3) {
            read(i);
        }
        return i3;
    }

    final int IconCompatParcelizer(int i, long j) {
        if (onPause()) {
            return 0;
        }
        RemoteActionCompatParcelizer(i);
        visitIntFormat visitintformat = this.onSetRepeatMode[i];
        int iIconCompatParcelizer = visitintformat.IconCompatParcelizer(j, this.onPlayFromUri);
        visitintformat.write(iIconCompatParcelizer);
        if (iIconCompatParcelizer == 0) {
            read(i);
        }
        return iIconCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer(int i) {
        RatingCompat();
        boolean[] zArr = this.onSkipToNext.RemoteActionCompatParcelizer;
        if (zArr[i]) {
            return;
        }
        C0170format c0170formatAudioAttributesCompatParcelizer = this.onSkipToNext.IconCompatParcelizer.RemoteActionCompatParcelizer(i).AudioAttributesCompatParcelizer(0);
        this.onPlayFromSearch.RemoteActionCompatParcelizer(DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170formatAudioAttributesCompatParcelizer.onPlayFromUri), c0170formatAudioAttributesCompatParcelizer, 0, null, this.onFastForward);
        zArr[i] = true;
    }

    private void read(int i) {
        RatingCompat();
        boolean[] zArr = this.onSkipToNext.write;
        if (this.onRewind && zArr[i]) {
            if (this.onSetRepeatMode[i].write(false)) {
                return;
            }
            this.onRemoveQueueItemAt = 0L;
            this.onRewind = false;
            this.onPrepare = true;
            this.onFastForward = 0L;
            this.MediaMetadataCompat = 0;
            for (visitIntFormat visitintformat : this.onSetRepeatMode) {
                visitintformat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
            ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.write)).RemoteActionCompatParcelizer(this);
        }
    }

    private boolean onPause() {
        return this.onPrepare || handleMediaPlayPauseIfPendingOnHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    public void RemoteActionCompatParcelizer(write writeVar, long j, long j2) {
        isCollectionMapOrArray iscollectionmaporarray;
        if (this.MediaBrowserCompatMediaItem == C.TIME_UNSET && (iscollectionmaporarray = this.onSetShuffleMode) != null) {
            boolean zIconCompatParcelizer = iscollectionmaporarray.IconCompatParcelizer();
            long j3 = read(true);
            long j4 = j3 == Long.MIN_VALUE ? 0L : j3 + 10000;
            this.MediaBrowserCompatMediaItem = j4;
            this.onPlayFromMediaId.IconCompatParcelizer(j4, zIconCompatParcelizer, this.onCustomAction);
        }
        _handleUnknownTypeId _handleunknowntypeid = writeVar.AudioAttributesCompatParcelizer;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(writeVar.AudioAttributesImplBaseParcelizer, writeVar.write, _handleunknowntypeid.RemoteActionCompatParcelizer(), _handleunknowntypeid.AudioAttributesImplApi26Parcelizer(), j, j2, _handleunknowntypeid.write());
        long unused = writeVar.AudioAttributesImplBaseParcelizer;
        this.onPlayFromSearch.RemoteActionCompatParcelizer(stdDelegatingSerializer, 1, -1, null, 0, null, writeVar.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatMediaItem);
        this.onPlayFromUri = true;
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.write)).RemoteActionCompatParcelizer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void read(write writeVar, long j, long j2, boolean z) {
        _handleUnknownTypeId _handleunknowntypeid = writeVar.AudioAttributesCompatParcelizer;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(writeVar.AudioAttributesImplBaseParcelizer, writeVar.write, _handleunknowntypeid.RemoteActionCompatParcelizer(), _handleunknowntypeid.AudioAttributesImplApi26Parcelizer(), j, j2, _handleunknowntypeid.write());
        long unused = writeVar.AudioAttributesImplBaseParcelizer;
        this.onPlayFromSearch.AudioAttributesCompatParcelizer(stdDelegatingSerializer, 1, -1, null, 0, null, writeVar.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatMediaItem);
        if (z) {
            return;
        }
        for (visitIntFormat visitintformat : this.onSetRepeatMode) {
            visitintformat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (this.MediaDescriptionCompat > 0) {
            ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.write)).RemoteActionCompatParcelizer(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    public constructCollectionType.write AudioAttributesCompatParcelizer(write writeVar, long j, long j2, IOException iOException, int i) {
        constructCollectionType.write writeVarRemoteActionCompatParcelizer;
        _handleUnknownTypeId _handleunknowntypeid = writeVar.AudioAttributesCompatParcelizer;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(writeVar.AudioAttributesImplBaseParcelizer, writeVar.write, _handleunknowntypeid.RemoteActionCompatParcelizer(), _handleunknowntypeid.AudioAttributesImplApi26Parcelizer(), j, j2, _handleunknowntypeid.write());
        long jWrite = this.onPause.write(new _resolveSuperClass.AudioAttributesCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(1, -1, null, 0, null, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(writeVar.MediaBrowserCompatSearchResultReceiver), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem)), iOException, i));
        if (jWrite == C.TIME_UNSET) {
            writeVarRemoteActionCompatParcelizer = constructCollectionType.IconCompatParcelizer;
        } else {
            int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            boolean z = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver > this.MediaMetadataCompat;
            if (RemoteActionCompatParcelizer(writeVar, iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer(z, jWrite);
            } else {
                writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer;
            }
        }
        boolean z2 = writeVarRemoteActionCompatParcelizer.read();
        this.onPlayFromSearch.RemoteActionCompatParcelizer(stdDelegatingSerializer, 1, -1, null, 0, null, writeVar.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatMediaItem, iOException, !z2);
        if (!z2) {
            long unused = writeVar.AudioAttributesImplBaseParcelizer;
        }
        return writeVarRemoteActionCompatParcelizer;
    }

    @Override // kotlin.findRawSuperTypes
    public final nonNullString IconCompatParcelizer(int i, int i2) {
        return RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer(i, false));
    }

    @Override // kotlin.findRawSuperTypes
    public final void RemoteActionCompatParcelizer() {
        this.onSetRating = true;
        this.RatingCompat.post(this.onPrepareFromSearch);
    }

    @Override // kotlin.findRawSuperTypes
    public final void read(final isCollectionMapOrArray iscollectionmaporarray) {
        this.RatingCompat.post(new Runnable() { // from class: o.findIncludeOverrides
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(iscollectionmaporarray);
            }
        });
    }

    final nonNullString AudioAttributesImplApi21Parcelizer() {
        return RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer(0, true));
    }

    @Override // o.visitIntFormat.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        this.RatingCompat.post(this.onPrepareFromSearch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCustomAction() {
        this.RatingCompat.post(new Runnable() { // from class: o.findConvertingContentSerializer
            @Override // java.lang.Runnable
            public final void run() {
                this.write.MediaBrowserCompatMediaItem();
            }
        });
    }

    final /* synthetic */ void MediaBrowserCompatMediaItem() {
        this.handleMediaPlayPauseIfPendingOnHandler = true;
    }

    private nonNullString RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        int length = this.onSetRepeatMode.length;
        for (int i = 0; i < length; i++) {
            if (audioAttributesCompatParcelizer.equals(this.onSetCaptioningEnabled[i])) {
                return this.onSetRepeatMode[i];
            }
        }
        if (this.onSetRating) {
            StringBuilder sb = new StringBuilder("Extractor added new track (id=");
            sb.append(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
            sb.append(") after finishing tracks.");
            prune.RemoteActionCompatParcelizer("ProgressiveMediaPeriod", sb.toString());
            return new exceptionMessage();
        }
        visitIntFormat visitintformatRemoteActionCompatParcelizer = visitIntFormat.RemoteActionCompatParcelizer(this.read, this.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatCustomActionResultReceiver);
        visitintformatRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
        int i2 = length + 1;
        AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = (AudioAttributesCompatParcelizer[]) Arrays.copyOf(this.onSetCaptioningEnabled, i2);
        audioAttributesCompatParcelizerArr[length] = audioAttributesCompatParcelizer;
        this.onSetCaptioningEnabled = (AudioAttributesCompatParcelizer[]) LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerArr);
        visitIntFormat[] visitintformatArr = (visitIntFormat[]) Arrays.copyOf(this.onSetRepeatMode, i2);
        visitintformatArr[length] = visitintformatRemoteActionCompatParcelizer;
        this.onSetRepeatMode = (visitIntFormat[]) LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(visitintformatArr);
        return visitintformatRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(isCollectionMapOrArray iscollectionmaporarray) {
        this.onSetShuffleMode = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null ? iscollectionmaporarray : new isCollectionMapOrArray.write(C.TIME_UNSET);
        this.MediaBrowserCompatMediaItem = iscollectionmaporarray.read();
        boolean z = !this.handleMediaPlayPauseIfPendingOnHandler && iscollectionmaporarray.read() == C.TIME_UNSET;
        this.onCustomAction = z;
        this.MediaBrowserCompatItemReceiver = z ? 7 : 1;
        if (this.onRemoveQueueItem) {
            this.onPlayFromMediaId.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, iscollectionmaporarray.IconCompatParcelizer(), this.onCustomAction);
        } else {
            onAddQueueItem();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAddQueueItem() {
        androidx.media3.common.Metadata metadata;
        if (this.onSeekTo || this.onRemoveQueueItem || !this.onSetRating || this.onSetShuffleMode == null) {
            return;
        }
        for (visitIntFormat visitintformat : this.onSetRepeatMode) {
            if (visitintformat.MediaBrowserCompatItemReceiver() == null) {
                return;
            }
        }
        this.onMediaButtonEvent.IconCompatParcelizer();
        int length = this.onSetRepeatMode.length;
        setName[] setnameArr = new setName[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C0170format c0170formatIconCompatParcelizer = (C0170format) buildTypeSerializer.IconCompatParcelizer(this.onSetRepeatMode[i].MediaBrowserCompatItemReceiver());
            String str = c0170formatIconCompatParcelizer.onPlayFromUri;
            boolean zAudioAttributesImplApi21Parcelizer = DefaultBaseTypeLimitingValidator.AudioAttributesImplApi21Parcelizer(str);
            boolean z = zAudioAttributesImplApi21Parcelizer || DefaultBaseTypeLimitingValidator.MediaBrowserCompatItemReceiver(str);
            zArr[i] = z;
            this.onCommand = z | this.onCommand;
            this.onAddQueueItem = this.onSkipToQueueItem != C.TIME_UNSET && length == 1 && DefaultBaseTypeLimitingValidator.AudioAttributesImplBaseParcelizer(str);
            IcyHeaders icyHeaders = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (icyHeaders != null) {
                if (zAudioAttributesImplApi21Parcelizer || this.onSetCaptioningEnabled[i].read) {
                    androidx.media3.common.Metadata metadata2 = c0170formatIconCompatParcelizer.onPlay;
                    if (metadata2 == null) {
                        metadata = new androidx.media3.common.Metadata(icyHeaders);
                    } else {
                        metadata = metadata2.read(icyHeaders);
                    }
                    c0170formatIconCompatParcelizer = c0170formatIconCompatParcelizer.write().read(metadata).IconCompatParcelizer();
                }
                if (zAudioAttributesImplApi21Parcelizer && c0170formatIconCompatParcelizer.IconCompatParcelizer == -1 && c0170formatIconCompatParcelizer.onFastForward == -1 && icyHeaders.read != -1) {
                    c0170formatIconCompatParcelizer = c0170formatIconCompatParcelizer.write().write(icyHeaders.read).IconCompatParcelizer();
                }
            }
            setnameArr[i] = new setName(Integer.toString(i), c0170formatIconCompatParcelizer.read(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(c0170formatIconCompatParcelizer)));
        }
        this.onSkipToNext = new read(new _writeAsBinary(setnameArr), zArr);
        if (this.onAddQueueItem && this.MediaBrowserCompatMediaItem == C.TIME_UNSET) {
            this.MediaBrowserCompatMediaItem = this.onSkipToQueueItem;
            this.onSetShuffleMode = new getOuterClass(this.onSetShuffleMode) { // from class: o._nonEmpty.3
                @Override // kotlin.getOuterClass, kotlin.isCollectionMapOrArray
                public final long read() {
                    return _nonEmpty.this.MediaBrowserCompatMediaItem;
                }
            };
        }
        this.onPlayFromMediaId.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, this.onSetShuffleMode.IconCompatParcelizer(), this.onCustomAction);
        this.onRemoveQueueItem = true;
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.write)).write(this);
    }

    private void onCommand() {
        write writeVar = new write(this.onStop, this.AudioAttributesImplApi26Parcelizer, this.onPrepareFromUri, this, this.onMediaButtonEvent);
        if (this.onRemoveQueueItem) {
            buildTypeSerializer.write(handleMediaPlayPauseIfPendingOnHandler());
            long j = this.MediaBrowserCompatMediaItem;
            if (j != C.TIME_UNSET && this.onRemoveQueueItemAt > j) {
                this.onPlayFromUri = true;
                this.onRemoveQueueItemAt = C.TIME_UNSET;
                return;
            }
            writeVar.read(((isCollectionMapOrArray) buildTypeSerializer.IconCompatParcelizer(this.onSetShuffleMode)).write(this.onRemoveQueueItemAt).AudioAttributesCompatParcelizer.write, this.onRemoveQueueItemAt);
            for (visitIntFormat visitintformat : this.onSetRepeatMode) {
                visitintformat.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt);
            }
            this.onRemoveQueueItemAt = C.TIME_UNSET;
        }
        this.MediaMetadataCompat = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.onPlayFromSearch.write(new StdDelegatingSerializer(writeVar.AudioAttributesImplBaseParcelizer, writeVar.write, this.onPlay.read(writeVar, this, this.onPause.write(this.MediaBrowserCompatItemReceiver))), 1, -1, null, 0, null, writeVar.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatMediaItem);
    }

    private boolean RemoteActionCompatParcelizer(write writeVar, int i) {
        isCollectionMapOrArray iscollectionmaporarray;
        if (this.handleMediaPlayPauseIfPendingOnHandler || ((iscollectionmaporarray = this.onSetShuffleMode) != null && iscollectionmaporarray.read() != C.TIME_UNSET)) {
            this.MediaMetadataCompat = i;
            return true;
        }
        if (this.onRemoveQueueItem && !onPause()) {
            this.onRewind = true;
            return false;
        }
        this.onPrepare = this.onRemoveQueueItem;
        this.onFastForward = 0L;
        this.MediaMetadataCompat = 0;
        for (visitIntFormat visitintformat : this.onSetRepeatMode) {
            visitintformat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        writeVar.read(0L, 0L);
        return true;
    }

    private boolean read(boolean[] zArr, long j) {
        boolean zRemoteActionCompatParcelizer;
        int length = this.onSetRepeatMode.length;
        for (int i = 0; i < length; i++) {
            visitIntFormat visitintformat = this.onSetRepeatMode[i];
            if (this.onAddQueueItem) {
                zRemoteActionCompatParcelizer = visitintformat.AudioAttributesCompatParcelizer(visitintformat.IconCompatParcelizer());
            } else {
                zRemoteActionCompatParcelizer = visitintformat.RemoteActionCompatParcelizer(j, false);
            }
            if (!zRemoteActionCompatParcelizer && (zArr[i] || !this.onCommand)) {
                return false;
            }
        }
        return true;
    }

    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int iAudioAttributesImplBaseParcelizer = 0;
        for (visitIntFormat visitintformat : this.onSetRepeatMode) {
            iAudioAttributesImplBaseParcelizer += visitintformat.AudioAttributesImplBaseParcelizer();
        }
        return iAudioAttributesImplBaseParcelizer;
    }

    private long read(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.onSetRepeatMode.length; i++) {
            if (z || ((read) buildTypeSerializer.IconCompatParcelizer(this.onSkipToNext)).read[i]) {
                jMax = Math.max(jMax, this.onSetRepeatMode[i].MediaBrowserCompatCustomActionResultReceiver());
            }
        }
        return jMax;
    }

    private boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.onRemoveQueueItemAt != C.TIME_UNSET;
    }

    private void RatingCompat() {
        buildTypeSerializer.write(this.onRemoveQueueItem);
    }

    final class RemoteActionCompatParcelizer implements visitStringFormat {
        private final int AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // kotlin.visitStringFormat
        public final boolean F_() {
            return _nonEmpty.this.write(this.AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.visitStringFormat
        public final void G_() throws IOException {
            _nonEmpty.this.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.visitStringFormat
        public final int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, int i) {
            return _nonEmpty.this.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, objectNode, _findVar, i);
        }

        @Override // kotlin.visitStringFormat
        public final int IconCompatParcelizer(long j) {
            return _nonEmpty.this.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, j);
        }
    }

    final class write implements constructCollectionType.AudioAttributesCompatParcelizer, StdJdkSerializersAtomicBooleanSerializer.read {
        private final _handleUnknownTypeId AudioAttributesCompatParcelizer;
        private final typeIdVisibility AudioAttributesImplApi21Parcelizer;
        private volatile boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatMediaItem;
        private long MediaBrowserCompatSearchResultReceiver;
        private final findAnnotatedContentSerializer MediaDescriptionCompat;
        private final Uri RatingCompat;
        private final findRawSuperTypes RemoteActionCompatParcelizer;
        private nonNullString read;
        private final isJacksonStdImpl AudioAttributesImplApi26Parcelizer = new isJacksonStdImpl();
        private boolean MediaBrowserCompatItemReceiver = true;
        private final long AudioAttributesImplBaseParcelizer = StdDelegatingSerializer.AudioAttributesCompatParcelizer();
        private SubTypeValidator write = write(0);

        public write(Uri uri, _hasTypeResolver _hastyperesolver, findAnnotatedContentSerializer findannotatedcontentserializer, findRawSuperTypes findrawsupertypes, typeIdVisibility typeidvisibility) {
            this.RatingCompat = uri;
            this.AudioAttributesCompatParcelizer = new _handleUnknownTypeId(_hastyperesolver);
            this.MediaDescriptionCompat = findannotatedcontentserializer;
            this.RemoteActionCompatParcelizer = findrawsupertypes;
            this.AudioAttributesImplApi21Parcelizer = typeidvisibility;
        }

        @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
        public final void B_() {
            this.MediaBrowserCompatCustomActionResultReceiver = true;
        }

        @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer() throws IOException {
            int iRemoteActionCompatParcelizer = 0;
            while (iRemoteActionCompatParcelizer == 0 && !this.MediaBrowserCompatCustomActionResultReceiver) {
                try {
                    long j = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer;
                    SubTypeValidator subTypeValidatorWrite = write(j);
                    this.write = subTypeValidatorWrite;
                    long jRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(subTypeValidatorWrite);
                    if (!this.MediaBrowserCompatCustomActionResultReceiver) {
                        if (jRemoteActionCompatParcelizer != -1) {
                            jRemoteActionCompatParcelizer += j;
                            _nonEmpty.this.onCustomAction();
                        }
                        long j2 = jRemoteActionCompatParcelizer;
                        _nonEmpty.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = IcyHeaders.write(this.AudioAttributesCompatParcelizer.read());
                        JsonNullFormatVisitor stdJdkSerializersAtomicBooleanSerializer = this.AudioAttributesCompatParcelizer;
                        if (_nonEmpty.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null && _nonEmpty.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer != -1) {
                            stdJdkSerializersAtomicBooleanSerializer = new StdJdkSerializersAtomicBooleanSerializer(this.AudioAttributesCompatParcelizer, _nonEmpty.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer, this);
                            nonNullString nonnullstringAudioAttributesImplApi21Parcelizer = _nonEmpty.this.AudioAttributesImplApi21Parcelizer();
                            this.read = nonnullstringAudioAttributesImplApi21Parcelizer;
                            nonnullstringAudioAttributesImplApi21Parcelizer.write(_nonEmpty.AudioAttributesCompatParcelizer);
                        }
                        long jWrite = j;
                        this.MediaDescriptionCompat.read(stdJdkSerializersAtomicBooleanSerializer, this.RatingCompat, this.AudioAttributesCompatParcelizer.read(), j, j2, this.RemoteActionCompatParcelizer);
                        if (_nonEmpty.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
                            this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
                        }
                        if (this.MediaBrowserCompatItemReceiver) {
                            this.MediaDescriptionCompat.read(jWrite, this.MediaBrowserCompatSearchResultReceiver);
                            this.MediaBrowserCompatItemReceiver = false;
                        }
                        while (true) {
                            long j3 = jWrite;
                            while (iRemoteActionCompatParcelizer == 0 && !this.MediaBrowserCompatCustomActionResultReceiver) {
                                try {
                                    this.AudioAttributesImplApi21Parcelizer.write();
                                    iRemoteActionCompatParcelizer = this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
                                    jWrite = this.MediaDescriptionCompat.write();
                                    if (jWrite > _nonEmpty.this.AudioAttributesImplBaseParcelizer + j3) {
                                        break;
                                    }
                                } catch (InterruptedException unused) {
                                    throw new InterruptedIOException();
                                }
                            }
                            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
                            _nonEmpty.this.RatingCompat.post(_nonEmpty.this.onPrepareFromMediaId);
                        }
                        if (iRemoteActionCompatParcelizer == 1) {
                            iRemoteActionCompatParcelizer = 0;
                        } else if (this.MediaDescriptionCompat.write() != -1) {
                            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = this.MediaDescriptionCompat.write();
                        }
                        StdTypeResolverBuilder1.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
                    } else {
                        if (iRemoteActionCompatParcelizer != 1 && this.MediaDescriptionCompat.write() != -1) {
                            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = this.MediaDescriptionCompat.write();
                        }
                        StdTypeResolverBuilder1.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
                        return;
                    }
                } catch (Throwable th) {
                    if (iRemoteActionCompatParcelizer != 1 && this.MediaDescriptionCompat.write() != -1) {
                        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = this.MediaDescriptionCompat.write();
                    }
                    StdTypeResolverBuilder1.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
                    throw th;
                }
            }
        }

        @Override // o.StdJdkSerializersAtomicBooleanSerializer.read
        public final void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
            long jMax;
            if (!this.MediaBrowserCompatMediaItem) {
                jMax = this.MediaBrowserCompatSearchResultReceiver;
            } else {
                jMax = Math.max(_nonEmpty.read(_nonEmpty.this), this.MediaBrowserCompatSearchResultReceiver);
            }
            int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer();
            nonNullString nonnullstring = (nonNullString) buildTypeSerializer.IconCompatParcelizer(this.read);
            nonnullstring.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iIconCompatParcelizer);
            nonnullstring.IconCompatParcelizer(jMax, 1, iIconCompatParcelizer, 0, null);
            this.MediaBrowserCompatMediaItem = true;
        }

        private SubTypeValidator write(long j) {
            return new SubTypeValidator.write().IconCompatParcelizer(this.RatingCompat).IconCompatParcelizer(j).RemoteActionCompatParcelizer(_nonEmpty.this.AudioAttributesImplApi21Parcelizer).read(6).read(_nonEmpty.RemoteActionCompatParcelizer).write();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read(long j, long j2) {
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = j;
            this.MediaBrowserCompatSearchResultReceiver = j2;
            this.MediaBrowserCompatItemReceiver = true;
            this.MediaBrowserCompatMediaItem = false;
        }
    }

    static final class read {
        public final _writeAsBinary IconCompatParcelizer;
        public final boolean[] RemoteActionCompatParcelizer;
        public final boolean[] read;
        public final boolean[] write;

        public read(_writeAsBinary _writeasbinary, boolean[] zArr) {
            this.IconCompatParcelizer = _writeasbinary;
            this.write = zArr;
            this.read = new boolean[_writeasbinary.RemoteActionCompatParcelizer];
            this.RemoteActionCompatParcelizer = new boolean[_writeasbinary.RemoteActionCompatParcelizer];
        }
    }

    static final class AudioAttributesCompatParcelizer {
        public final int RemoteActionCompatParcelizer;
        public final boolean read;

        public AudioAttributesCompatParcelizer(int i, boolean z) {
            this.RemoteActionCompatParcelizer = i;
            this.read = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer && this.read == audioAttributesCompatParcelizer.read;
        }

        public final int hashCode() {
            return (this.RemoteActionCompatParcelizer * 31) + (this.read ? 1 : 0);
        }
    }

    private static Map<String, String> MediaBrowserCompatSearchResultReceiver() {
        HashMap map = new HashMap();
        map.put(com.google.android.exoplayer2.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, com.google.android.exoplayer2.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        return Collections.unmodifiableMap(map);
    }
}
