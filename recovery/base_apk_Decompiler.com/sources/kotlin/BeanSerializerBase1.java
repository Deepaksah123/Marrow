package kotlin;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.hls.HlsMediaChunk;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.AsArraySerializerBase;
import kotlin.C0170format;
import kotlin.PropertySerializerMapEmpty;
import kotlin.StdKeySerializer;
import kotlin.UUIDSerializer;
import kotlin._deserializeWithNativeTypeId;
import kotlin._put;
import kotlin._resolveSuperClass;
import kotlin.constructCollectionType;
import kotlin.initExtraTracks;
import kotlin.nonNullString;
import kotlin.visitIntFormat;

/* JADX INFO: loaded from: classes2.dex */
final class BeanSerializerBase1 implements constructCollectionType.RemoteActionCompatParcelizer<CollectionLikeType>, constructCollectionType.read, UUIDSerializer, findRawSuperTypes, visitIntFormat.IconCompatParcelizer {
    private static final Set<Integer> AudioAttributesCompatParcelizer = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private nonNullString AudioAttributesImplApi21Parcelizer;
    private final matchesUntyped AudioAttributesImplApi26Parcelizer;
    private DrmInitData AudioAttributesImplBaseParcelizer;
    private C0170format MediaBrowserCompatCustomActionResultReceiver;
    private final PropertySerializerMapEmpty.read MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private final Handler MediaBrowserCompatSearchResultReceiver;
    private final _resolveSuperClass MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private long MediaDescriptionCompat;
    private final ArrayList<_typeIdDef> MediaMetadataCompat;
    private boolean MediaSessionCompatQueueItem;
    private final int MediaSessionCompatResultReceiverWrapper;
    private _writeAsBinary MediaSessionCompatToken;
    private int[] ParcelableVolumeInfo;
    private _isValuePresent PlaybackStateCompat;
    private final String PlaybackStateCompatCustomAction;
    private boolean RatingCompat;
    private final _findWellKnownSimple RemoteActionCompatParcelizer;
    private final Runnable handleMediaPlayPauseIfPendingOnHandler;
    private boolean onCommand;
    private CollectionLikeType onCustomAction;
    private final ArrayList<_isValuePresent> onFastForward;
    private final C0170format onMediaButtonEvent;
    private final StdKeySerializer.read onPlay;
    private final int onPlayFromMediaId;
    private Set<setName> onPlayFromSearch;
    private final Runnable onPlayFromUri;
    private boolean onPrepare;
    private long onPrepareFromMediaId;
    private final Map<String, DrmInitData> onPrepareFromSearch;
    private int onPrepareFromUri;
    private final List<_isValuePresent> onRemoveQueueItem;
    private int onRemoveQueueItemAt;
    private boolean onRewind;
    private int onSeekTo;
    private Set<Integer> onSetCaptioningEnabled;
    private boolean onSetPlaybackSpeed;
    private SparseIntArray onSetRating;
    private boolean[] onSetRepeatMode;
    private long onSetShuffleMode;
    private IconCompatParcelizer[] onSkipToNext;
    private boolean onSkipToPrevious;
    private boolean[] onStop;
    private C0170format r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private final AsArraySerializerBase read;
    private boolean setSessionImpl;
    private final write write;
    private final constructCollectionType onAddQueueItem = new constructCollectionType("Loader:HlsSampleStreamWrapper");
    private final AsArraySerializerBase.AudioAttributesCompatParcelizer onPause = new AsArraySerializerBase.AudioAttributesCompatParcelizer();
    private int[] onSkipToQueueItem = new int[0];

    public interface write extends UUIDSerializer.RemoteActionCompatParcelizer<BeanSerializerBase1> {
        void RemoteActionCompatParcelizer(Uri uri);

        void write();
    }

    private static int AudioAttributesImplApi21Parcelizer(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // kotlin.findRawSuperTypes
    public final void read(isCollectionMapOrArray iscollectionmaporarray) {
    }

    public BeanSerializerBase1(String str, int i, write writeVar, AsArraySerializerBase asArraySerializerBase, Map<String, DrmInitData> map, _findWellKnownSimple _findwellknownsimple, long j, C0170format c0170format, matchesUntyped matchesuntyped, PropertySerializerMapEmpty.read readVar, _resolveSuperClass _resolvesuperclass, StdKeySerializer.read readVar2, int i2) {
        this.PlaybackStateCompatCustomAction = str;
        this.MediaSessionCompatResultReceiverWrapper = i;
        this.write = writeVar;
        this.read = asArraySerializerBase;
        this.onPrepareFromSearch = map;
        this.RemoteActionCompatParcelizer = _findwellknownsimple;
        this.onMediaButtonEvent = c0170format;
        this.AudioAttributesImplApi26Parcelizer = matchesuntyped;
        this.MediaBrowserCompatItemReceiver = readVar;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = _resolvesuperclass;
        this.onPlay = readVar2;
        this.onPlayFromMediaId = i2;
        Set<Integer> set = AudioAttributesCompatParcelizer;
        this.onSetCaptioningEnabled = new HashSet(set.size());
        this.onSetRating = new SparseIntArray(set.size());
        this.onSkipToNext = new IconCompatParcelizer[0];
        this.onSetRepeatMode = new boolean[0];
        this.onStop = new boolean[0];
        ArrayList<_isValuePresent> arrayList = new ArrayList<>();
        this.onFastForward = arrayList;
        this.onRemoveQueueItem = Collections.unmodifiableList(arrayList);
        this.MediaMetadataCompat = new ArrayList<>();
        this.handleMediaPlayPauseIfPendingOnHandler = new Runnable() { // from class: o.serializeFieldsFiltered
            @Override // java.lang.Runnable
            public final void run() {
                this.read.onCustomAction();
            }
        };
        this.onPlayFromUri = new Runnable() { // from class: o._timestamp
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.onMediaButtonEvent();
            }
        };
        this.MediaBrowserCompatSearchResultReceiver = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer();
        this.MediaDescriptionCompat = j;
        this.onPrepareFromMediaId = j;
    }

    public final void write() {
        if (this.onRewind) {
            return;
        }
        RemoteActionCompatParcelizer(new _put.AudioAttributesCompatParcelizer().IconCompatParcelizer(this.MediaDescriptionCompat).write());
    }

    public final void AudioAttributesCompatParcelizer(setName[] setnameArr, int... iArr) {
        this.MediaSessionCompatToken = write(setnameArr);
        this.onPlayFromSearch = new HashSet();
        for (int i : iArr) {
            this.onPlayFromSearch.add(this.MediaSessionCompatToken.RemoteActionCompatParcelizer(i));
        }
        this.onSeekTo = 0;
        Handler handler = this.MediaBrowserCompatSearchResultReceiver;
        final write writeVar = this.write;
        Objects.requireNonNull(writeVar);
        handler.post(new Runnable() { // from class: o.CalendarSerializer
            @Override // java.lang.Runnable
            public final void run() {
                writeVar.write();
            }
        });
        onPlayFromMediaId();
    }

    public final void AudioAttributesImplApi21Parcelizer() throws IOException {
        MediaBrowserCompatCustomActionResultReceiver();
        if (this.onCommand && !this.onRewind) {
            throw SchemaAware.RemoteActionCompatParcelizer("Loading finished before preparation is complete.", null);
        }
    }

    public final _writeAsBinary MediaBrowserCompatItemReceiver() {
        RatingCompat();
        return this.MediaSessionCompatToken;
    }

    public final int AudioAttributesCompatParcelizer(int i) {
        RatingCompat();
        int i2 = this.ParcelableVolumeInfo[i];
        if (i2 == -1) {
            return this.onPlayFromSearch.contains(this.MediaSessionCompatToken.RemoteActionCompatParcelizer(i)) ? -3 : -2;
        }
        boolean[] zArr = this.onStop;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    public final void read(int i) {
        RatingCompat();
        int i2 = this.ParcelableVolumeInfo[i];
        buildTypeSerializer.write(this.onStop[i2]);
        this.onStop[i2] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(kotlin._verifyAndResolvePlaceholders[] r20, boolean[] r21, kotlin.visitStringFormat[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BeanSerializerBase1.read(o._verifyAndResolvePlaceholders[], boolean[], o.visitStringFormat[], boolean[], long, boolean):boolean");
    }

    public final void RemoteActionCompatParcelizer(long j, boolean z) {
        if (!this.onSkipToPrevious || onCommand()) {
            return;
        }
        int length = this.onSkipToNext.length;
        for (int i = 0; i < length; i++) {
            this.onSkipToNext[i].RemoteActionCompatParcelizer(j, z, this.onStop[i]);
        }
    }

    public final boolean write(long j, boolean z) {
        _isValuePresent _isvaluepresent;
        this.MediaDescriptionCompat = j;
        if (onCommand()) {
            this.onPrepareFromMediaId = j;
            return true;
        }
        if (this.read.read()) {
            for (int i = 0; i < this.onFastForward.size(); i++) {
                _isvaluepresent = this.onFastForward.get(i);
                if (_isvaluepresent.MediaBrowserCompatItemReceiver == j) {
                    break;
                }
            }
            _isvaluepresent = null;
        } else {
            _isvaluepresent = null;
        }
        if (this.onSkipToPrevious && !z && AudioAttributesCompatParcelizer(j, _isvaluepresent)) {
            return false;
        }
        this.onPrepareFromMediaId = j;
        this.onCommand = false;
        this.onFastForward.clear();
        if (this.onAddQueueItem.RemoteActionCompatParcelizer()) {
            if (this.onSkipToPrevious) {
                for (IconCompatParcelizer iconCompatParcelizer : this.onSkipToNext) {
                    iconCompatParcelizer.read();
                }
            }
            this.onAddQueueItem.AudioAttributesCompatParcelizer();
        } else {
            this.onAddQueueItem.write();
            onFastForward();
        }
        return true;
    }

    public final void MediaBrowserCompatMediaItem() {
        if (this.onFastForward.isEmpty()) {
            return;
        }
        final _isValuePresent _isvaluepresent = (_isValuePresent) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(this.onFastForward);
        int iAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(_isvaluepresent);
        if (iAudioAttributesCompatParcelizer == 1) {
            _isvaluepresent.AudioAttributesImplBaseParcelizer();
            return;
        }
        if (iAudioAttributesCompatParcelizer == 0) {
            this.MediaBrowserCompatSearchResultReceiver.post(new Runnable() { // from class: o.serializeFields
                @Override // java.lang.Runnable
                public final void run() {
                    this.AudioAttributesCompatParcelizer.write(_isvaluepresent);
                }
            });
        } else if (iAudioAttributesCompatParcelizer == 2 && !this.onCommand && this.onAddQueueItem.RemoteActionCompatParcelizer()) {
            this.onAddQueueItem.AudioAttributesCompatParcelizer();
        }
    }

    final /* synthetic */ void write(_isValuePresent _isvaluepresent) {
        this.write.RemoteActionCompatParcelizer(_isvaluepresent.write);
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        if (this.onRewind) {
            for (IconCompatParcelizer iconCompatParcelizer : this.onSkipToNext) {
                iconCompatParcelizer.RatingCompat();
            }
        }
        this.read.RemoteActionCompatParcelizer();
        this.onAddQueueItem.read(this);
        this.MediaBrowserCompatSearchResultReceiver.removeCallbacksAndMessages(null);
        this.onSetPlaybackSpeed = true;
        this.MediaMetadataCompat.clear();
    }

    @Override // o.constructCollectionType.read
    public final void AudioAttributesImplBaseParcelizer() {
        for (IconCompatParcelizer iconCompatParcelizer : this.onSkipToNext) {
            iconCompatParcelizer.onAddQueueItem();
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        this.read.IconCompatParcelizer(z);
    }

    public final boolean IconCompatParcelizer(Uri uri, _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
        _resolveSuperClass.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (!this.read.IconCompatParcelizer(uri)) {
            return true;
        }
        long j = (z || (remoteActionCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(_fromAny.write(this.read.IconCompatParcelizer()), audioAttributesCompatParcelizer)) == null || remoteActionCompatParcelizer.RemoteActionCompatParcelizer != 2) ? -9223372036854775807L : remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        return this.read.write(uri, j) && j != C.TIME_UNSET;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.onPrepareFromUri == 2;
    }

    public final long RemoteActionCompatParcelizer(long j, createKeySerializer createkeyserializer) {
        return this.read.RemoteActionCompatParcelizer(j, createkeyserializer);
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        return !onCommand() && this.onSkipToNext[i].write(this.onCommand);
    }

    public final void write(int i) throws IOException {
        MediaBrowserCompatCustomActionResultReceiver();
        this.onSkipToNext[i].MediaMetadataCompat();
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() throws IOException {
        this.onAddQueueItem.read();
        this.read.write();
    }

    public final int read(int i, ObjectNode objectNode, _find _findVar, int i2) {
        C0170format c0170format;
        if (onCommand()) {
            return -3;
        }
        int i3 = 0;
        if (!this.onFastForward.isEmpty()) {
            int i4 = 0;
            while (i4 < this.onFastForward.size() - 1 && AudioAttributesCompatParcelizer(this.onFastForward.get(i4))) {
                i4++;
            }
            LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.onFastForward, 0, i4);
            _isValuePresent _isvaluepresent = this.onFastForward.get(0);
            C0170format c0170format2 = _isvaluepresent.MediaDescriptionCompat;
            if (!c0170format2.equals(this.MediaBrowserCompatCustomActionResultReceiver)) {
                this.onPlay.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, c0170format2, _isvaluepresent.RatingCompat, _isvaluepresent.MediaMetadataCompat, _isvaluepresent.MediaBrowserCompatItemReceiver);
            }
            this.MediaBrowserCompatCustomActionResultReceiver = c0170format2;
        }
        if (!this.onFastForward.isEmpty() && !this.onFastForward.get(0).RemoteActionCompatParcelizer()) {
            return -3;
        }
        int i5 = this.onSkipToNext[i].read(objectNode, _findVar, i2, this.onCommand);
        if (i5 == -5) {
            C0170format c0170format3 = (C0170format) buildTypeSerializer.IconCompatParcelizer(objectNode.write);
            if (i == this.onRemoveQueueItemAt) {
                int iRemoteActionCompatParcelizer = parseTextAttribute.RemoteActionCompatParcelizer(this.onSkipToNext[i].MediaDescriptionCompat());
                while (i3 < this.onFastForward.size() && this.onFastForward.get(i3).read != iRemoteActionCompatParcelizer) {
                    i3++;
                }
                if (i3 < this.onFastForward.size()) {
                    c0170format = this.onFastForward.get(i3).MediaDescriptionCompat;
                } else {
                    c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
                }
                c0170format3 = c0170format3.read(c0170format);
            }
            objectNode.write = c0170format3;
        }
        return i5;
    }

    public final int RemoteActionCompatParcelizer(int i, long j) {
        if (onCommand()) {
            return 0;
        }
        IconCompatParcelizer iconCompatParcelizer = this.onSkipToNext[i];
        int iIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer(j, this.onCommand);
        _isValuePresent _isvaluepresent = (_isValuePresent) onMoofContainerAtomRead.read(this.onFastForward);
        if (_isvaluepresent != null && !_isvaluepresent.RemoteActionCompatParcelizer()) {
            iIconCompatParcelizer = Math.min(iIconCompatParcelizer, _isvaluepresent.IconCompatParcelizer(i) - iconCompatParcelizer.AudioAttributesImplApi26Parcelizer());
        }
        iconCompatParcelizer.write(iIconCompatParcelizer);
        return iIconCompatParcelizer;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    @Override // kotlin.UUIDSerializer
    public final long read() {
        /*
            r6 = this;
            boolean r0 = r6.onCommand
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r6.onCommand()
            if (r0 == 0) goto L10
            long r0 = r6.onPrepareFromMediaId
            return r0
        L10:
            long r0 = r6.MediaDescriptionCompat
            o._isValuePresent r2 = r6.onAddQueueItem()
            boolean r3 = r2.write()
            if (r3 != 0) goto L35
            java.util.ArrayList<o._isValuePresent> r2 = r6.onFastForward
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L34
            java.util.ArrayList<o._isValuePresent> r2 = r6.onFastForward
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            o._isValuePresent r2 = (kotlin._isValuePresent) r2
            goto L35
        L34:
            r2 = 0
        L35:
            if (r2 == 0) goto L3d
            long r2 = r2.AudioAttributesImplApi21Parcelizer
            long r0 = java.lang.Math.max(r0, r2)
        L3d:
            boolean r2 = r6.onSkipToPrevious
            if (r2 == 0) goto L54
            o.BeanSerializerBase1$IconCompatParcelizer[] r6 = r6.onSkipToNext
            int r2 = r6.length
            r3 = 0
        L45:
            if (r3 >= r2) goto L54
            r4 = r6[r3]
            long r4 = r4.MediaBrowserCompatCustomActionResultReceiver()
            long r0 = java.lang.Math.max(r0, r4)
            int r3 = r3 + 1
            goto L45
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BeanSerializerBase1.read():long");
    }

    @Override // kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        if (onCommand()) {
            return this.onPrepareFromMediaId;
        }
        if (this.onCommand) {
            return Long.MIN_VALUE;
        }
        return onAddQueueItem().AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        List<_isValuePresent> listEmptyList;
        long jMax;
        if (this.onCommand || this.onAddQueueItem.RemoteActionCompatParcelizer() || this.onAddQueueItem.IconCompatParcelizer()) {
            return false;
        }
        if (onCommand()) {
            listEmptyList = Collections.emptyList();
            jMax = this.onPrepareFromMediaId;
            for (IconCompatParcelizer iconCompatParcelizer : this.onSkipToNext) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer(this.onPrepareFromMediaId);
            }
        } else {
            listEmptyList = this.onRemoveQueueItem;
            _isValuePresent _isvaluepresentOnAddQueueItem = onAddQueueItem();
            if (_isvaluepresentOnAddQueueItem.write()) {
                jMax = _isvaluepresentOnAddQueueItem.AudioAttributesImplApi21Parcelizer;
            } else {
                jMax = Math.max(this.MediaDescriptionCompat, _isvaluepresentOnAddQueueItem.MediaBrowserCompatItemReceiver);
            }
        }
        List<_isValuePresent> list = listEmptyList;
        long j = jMax;
        this.onPause.RemoteActionCompatParcelizer();
        this.read.RemoteActionCompatParcelizer(_putVar, j, list, this.onRewind || !list.isEmpty(), this.onPause);
        boolean z = this.onPause.write;
        CollectionLikeType collectionLikeType = this.onPause.RemoteActionCompatParcelizer;
        Uri uri = this.onPause.IconCompatParcelizer;
        if (z) {
            this.onPrepareFromMediaId = C.TIME_UNSET;
            this.onCommand = true;
            return true;
        }
        if (collectionLikeType == null) {
            if (uri != null) {
                this.write.RemoteActionCompatParcelizer(uri);
            }
            return false;
        }
        if (AudioAttributesCompatParcelizer(collectionLikeType)) {
            IconCompatParcelizer((_isValuePresent) collectionLikeType);
        }
        this.onCustomAction = collectionLikeType;
        this.onPlay.write(new StdDelegatingSerializer(collectionLikeType.MediaBrowserCompatCustomActionResultReceiver, collectionLikeType.AudioAttributesImplApi26Parcelizer, this.onAddQueueItem.read(collectionLikeType, this, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(collectionLikeType.MediaBrowserCompatSearchResultReceiver))), collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.MediaSessionCompatResultReceiverWrapper, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, collectionLikeType.MediaBrowserCompatItemReceiver, collectionLikeType.AudioAttributesImplApi21Parcelizer);
        return true;
    }

    @Override // kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return this.onAddQueueItem.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
        if (this.onAddQueueItem.IconCompatParcelizer() || onCommand()) {
            return;
        }
        if (this.onAddQueueItem.RemoteActionCompatParcelizer()) {
            if (this.read.write(j, this.onCustomAction, this.onRemoveQueueItem)) {
                this.onAddQueueItem.AudioAttributesCompatParcelizer();
                return;
            }
            return;
        }
        int size = this.onRemoveQueueItem.size();
        while (size > 0 && this.read.AudioAttributesCompatParcelizer(this.onRemoveQueueItem.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.onRemoveQueueItem.size()) {
            MediaBrowserCompatCustomActionResultReceiver(size);
        }
        int iWrite = this.read.write(j, this.onRemoveQueueItem);
        if (iWrite < this.onFastForward.size()) {
            MediaBrowserCompatCustomActionResultReceiver(iWrite);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(CollectionLikeType collectionLikeType, long j, long j2) {
        this.onCustomAction = null;
        this.read.write(collectionLikeType);
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(collectionLikeType.MediaBrowserCompatCustomActionResultReceiver, collectionLikeType.AudioAttributesImplApi26Parcelizer, collectionLikeType.AudioAttributesImplApi26Parcelizer(), collectionLikeType.AudioAttributesImplApi21Parcelizer(), j, j2, collectionLikeType.MediaBrowserCompatCustomActionResultReceiver());
        long j3 = collectionLikeType.MediaBrowserCompatCustomActionResultReceiver;
        this.onPlay.RemoteActionCompatParcelizer(stdDelegatingSerializer, collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.MediaSessionCompatResultReceiverWrapper, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, collectionLikeType.MediaBrowserCompatItemReceiver, collectionLikeType.AudioAttributesImplApi21Parcelizer);
        if (!this.onRewind) {
            RemoteActionCompatParcelizer(new _put.AudioAttributesCompatParcelizer().IconCompatParcelizer(this.MediaDescriptionCompat).write());
        } else {
            this.write.RemoteActionCompatParcelizer(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void read(CollectionLikeType collectionLikeType, long j, long j2, boolean z) {
        this.onCustomAction = null;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(collectionLikeType.MediaBrowserCompatCustomActionResultReceiver, collectionLikeType.AudioAttributesImplApi26Parcelizer, collectionLikeType.AudioAttributesImplApi26Parcelizer(), collectionLikeType.AudioAttributesImplApi21Parcelizer(), j, j2, collectionLikeType.MediaBrowserCompatCustomActionResultReceiver());
        long j3 = collectionLikeType.MediaBrowserCompatCustomActionResultReceiver;
        this.onPlay.AudioAttributesCompatParcelizer(stdDelegatingSerializer, collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.MediaSessionCompatResultReceiverWrapper, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, collectionLikeType.MediaBrowserCompatItemReceiver, collectionLikeType.AudioAttributesImplApi21Parcelizer);
        if (z) {
            return;
        }
        if (onCommand() || this.MediaBrowserCompatMediaItem == 0) {
            onFastForward();
        }
        if (this.MediaBrowserCompatMediaItem > 0) {
            this.write.RemoteActionCompatParcelizer(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public constructCollectionType.write AudioAttributesCompatParcelizer(CollectionLikeType collectionLikeType, long j, long j2, IOException iOException, int i) {
        constructCollectionType.write writeVarRemoteActionCompatParcelizer;
        int i2;
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(collectionLikeType);
        if (zAudioAttributesCompatParcelizer && !((_isValuePresent) collectionLikeType).RemoteActionCompatParcelizer() && (iOException instanceof _deserializeWithNativeTypeId.write) && ((i2 = ((_deserializeWithNativeTypeId.write) iOException).AudioAttributesImplApi26Parcelizer) == 410 || i2 == 404)) {
            return constructCollectionType.AudioAttributesCompatParcelizer;
        }
        long jMediaBrowserCompatCustomActionResultReceiver = collectionLikeType.MediaBrowserCompatCustomActionResultReceiver();
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(collectionLikeType.MediaBrowserCompatCustomActionResultReceiver, collectionLikeType.AudioAttributesImplApi26Parcelizer, collectionLikeType.AudioAttributesImplApi26Parcelizer(), collectionLikeType.AudioAttributesImplApi21Parcelizer(), j, j2, jMediaBrowserCompatCustomActionResultReceiver);
        _resolveSuperClass.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new _resolveSuperClass.AudioAttributesCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.MediaSessionCompatResultReceiverWrapper, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(collectionLikeType.MediaBrowserCompatItemReceiver), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(collectionLikeType.AudioAttributesImplApi21Parcelizer)), iOException, i);
        _resolveSuperClass.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(_fromAny.write(this.read.IconCompatParcelizer()), audioAttributesCompatParcelizer);
        boolean zWrite = (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer.RemoteActionCompatParcelizer != 2) ? false : this.read.write(collectionLikeType, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        if (zWrite) {
            if (zAudioAttributesCompatParcelizer && jMediaBrowserCompatCustomActionResultReceiver == 0) {
                ArrayList<_isValuePresent> arrayList = this.onFastForward;
                buildTypeSerializer.write(arrayList.remove(arrayList.size() - 1) == collectionLikeType);
                if (this.onFastForward.isEmpty()) {
                    this.onPrepareFromMediaId = this.MediaDescriptionCompat;
                } else {
                    ((_isValuePresent) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(this.onFastForward)).read();
                }
            }
            writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer;
        } else {
            long jWrite = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(audioAttributesCompatParcelizer);
            if (jWrite != C.TIME_UNSET) {
                writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer(false, jWrite);
            } else {
                writeVarRemoteActionCompatParcelizer = constructCollectionType.IconCompatParcelizer;
            }
        }
        constructCollectionType.write writeVar = writeVarRemoteActionCompatParcelizer;
        boolean z = writeVar.read();
        this.onPlay.RemoteActionCompatParcelizer(stdDelegatingSerializer, collectionLikeType.MediaBrowserCompatSearchResultReceiver, this.MediaSessionCompatResultReceiverWrapper, collectionLikeType.MediaDescriptionCompat, collectionLikeType.RatingCompat, collectionLikeType.MediaMetadataCompat, collectionLikeType.MediaBrowserCompatItemReceiver, collectionLikeType.AudioAttributesImplApi21Parcelizer, iOException, !z);
        if (!z) {
            this.onCustomAction = null;
            long j3 = collectionLikeType.MediaBrowserCompatCustomActionResultReceiver;
        }
        if (zWrite) {
            if (!this.onRewind) {
                RemoteActionCompatParcelizer(new _put.AudioAttributesCompatParcelizer().IconCompatParcelizer(this.MediaDescriptionCompat).write());
                return writeVar;
            }
            this.write.RemoteActionCompatParcelizer(this);
        }
        return writeVar;
    }

    private void IconCompatParcelizer(_isValuePresent _isvaluepresent) {
        this.PlaybackStateCompat = _isvaluepresent;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = _isvaluepresent.MediaDescriptionCompat;
        this.onPrepareFromMediaId = C.TIME_UNSET;
        this.onFastForward.add(_isvaluepresent);
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        for (IconCompatParcelizer iconCompatParcelizer : this.onSkipToNext) {
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(Integer.valueOf(iconCompatParcelizer.AudioAttributesImplBaseParcelizer()));
        }
        _isvaluepresent.AudioAttributesCompatParcelizer(this, iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer());
        for (IconCompatParcelizer iconCompatParcelizer2 : this.onSkipToNext) {
            iconCompatParcelizer2.IconCompatParcelizer(_isvaluepresent);
            if (_isvaluepresent.AudioAttributesCompatParcelizer) {
                iconCompatParcelizer2.handleMediaPlayPauseIfPendingOnHandler();
            }
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(int i) {
        buildTypeSerializer.write(!this.onAddQueueItem.RemoteActionCompatParcelizer());
        while (true) {
            if (i >= this.onFastForward.size()) {
                i = -1;
                break;
            } else if (IconCompatParcelizer(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = onAddQueueItem().AudioAttributesImplApi21Parcelizer;
        _isValuePresent _isvaluepresentAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
        if (this.onFastForward.isEmpty()) {
            this.onPrepareFromMediaId = this.MediaDescriptionCompat;
        } else {
            ((_isValuePresent) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(this.onFastForward)).read();
        }
        this.onCommand = false;
        this.onPlay.write(this.onPrepareFromUri, _isvaluepresentAudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver, j);
    }

    @Override // kotlin.findRawSuperTypes
    public final nonNullString IconCompatParcelizer(int i, int i2) {
        nonNullString nonnullstringWrite;
        if (!AudioAttributesCompatParcelizer.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                nonNullString[] nonnullstringArr = this.onSkipToNext;
                if (i3 >= nonnullstringArr.length) {
                    nonnullstringWrite = null;
                    break;
                }
                if (this.onSkipToQueueItem[i3] == i) {
                    nonnullstringWrite = nonnullstringArr[i3];
                    break;
                }
                i3++;
            }
        } else {
            nonnullstringWrite = read(i, i2);
        }
        if (nonnullstringWrite == null) {
            if (this.MediaSessionCompatQueueItem) {
                return AudioAttributesCompatParcelizer(i, i2);
            }
            nonnullstringWrite = write(i, i2);
        }
        if (i2 != 5) {
            return nonnullstringWrite;
        }
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            this.AudioAttributesImplApi21Parcelizer = new AudioAttributesCompatParcelizer(nonnullstringWrite, this.onPlayFromMediaId);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private nonNullString read(int i, int i2) {
        buildTypeSerializer.IconCompatParcelizer(AudioAttributesCompatParcelizer.contains(Integer.valueOf(i2)));
        int i3 = this.onSetRating.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.onSetCaptioningEnabled.add(Integer.valueOf(i2))) {
            this.onSkipToQueueItem[i3] = i;
        }
        if (this.onSkipToQueueItem[i3] == i) {
            return this.onSkipToNext[i3];
        }
        return AudioAttributesCompatParcelizer(i, i2);
    }

    private visitIntFormat write(int i, int i2) {
        int length = this.onSkipToNext.length;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver, this.onPrepareFromSearch, (byte) 0);
        iconCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat);
        if (z) {
            iconCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer);
        }
        iconCompatParcelizer.write(this.onSetShuffleMode);
        _isValuePresent _isvaluepresent = this.PlaybackStateCompat;
        if (_isvaluepresent != null) {
            iconCompatParcelizer.IconCompatParcelizer(_isvaluepresent);
        }
        iconCompatParcelizer.RemoteActionCompatParcelizer(this);
        int i3 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.onSkipToQueueItem, i3);
        this.onSkipToQueueItem = iArrCopyOf;
        iArrCopyOf[length] = i;
        this.onSkipToNext = (IconCompatParcelizer[]) LaissezFaireSubTypeValidator.read(this.onSkipToNext, iconCompatParcelizer);
        boolean[] zArrCopyOf = Arrays.copyOf(this.onSetRepeatMode, i3);
        this.onSetRepeatMode = zArrCopyOf;
        zArrCopyOf[length] = z;
        this.RatingCompat |= z;
        this.onSetCaptioningEnabled.add(Integer.valueOf(i2));
        this.onSetRating.append(i2, length);
        if (AudioAttributesImplApi21Parcelizer(i2) > AudioAttributesImplApi21Parcelizer(this.onPrepareFromUri)) {
            this.onRemoveQueueItemAt = length;
            this.onPrepareFromUri = i2;
        }
        this.onStop = Arrays.copyOf(this.onStop, i3);
        return iconCompatParcelizer;
    }

    @Override // kotlin.findRawSuperTypes
    public final void RemoteActionCompatParcelizer() {
        this.MediaSessionCompatQueueItem = true;
        this.MediaBrowserCompatSearchResultReceiver.post(this.onPlayFromUri);
    }

    @Override // o.visitIntFormat.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        this.MediaBrowserCompatSearchResultReceiver.post(this.handleMediaPlayPauseIfPendingOnHandler);
    }

    public final void MediaMetadataCompat() {
        this.onSetCaptioningEnabled.clear();
    }

    public final void write(long j) {
        if (this.onSetShuffleMode != j) {
            this.onSetShuffleMode = j;
            for (IconCompatParcelizer iconCompatParcelizer : this.onSkipToNext) {
                iconCompatParcelizer.write(j);
            }
        }
    }

    public final void write(DrmInitData drmInitData) {
        if (LaissezFaireSubTypeValidator.read(this.AudioAttributesImplBaseParcelizer, drmInitData)) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = drmInitData;
        int i = 0;
        while (true) {
            IconCompatParcelizer[] iconCompatParcelizerArr = this.onSkipToNext;
            if (i >= iconCompatParcelizerArr.length) {
                return;
            }
            if (this.onSetRepeatMode[i]) {
                iconCompatParcelizerArr[i].write(drmInitData);
            }
            i++;
        }
    }

    private void write(visitStringFormat[] visitstringformatArr) {
        this.MediaMetadataCompat.clear();
        for (visitStringFormat visitstringformat : visitstringformatArr) {
            if (visitstringformat != null) {
                this.MediaMetadataCompat.add((_typeIdDef) visitstringformat);
            }
        }
    }

    private boolean AudioAttributesCompatParcelizer(_isValuePresent _isvaluepresent) {
        int i = _isvaluepresent.read;
        int length = this.onSkipToNext.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.onStop[i2] && this.onSkipToNext[i2].MediaDescriptionCompat() == i) {
                return false;
            }
        }
        return true;
    }

    private boolean IconCompatParcelizer(int i) {
        for (int i2 = i; i2 < this.onFastForward.size(); i2++) {
            if (this.onFastForward.get(i2).AudioAttributesCompatParcelizer) {
                return false;
            }
        }
        _isValuePresent _isvaluepresent = this.onFastForward.get(i);
        for (int i3 = 0; i3 < this.onSkipToNext.length; i3++) {
            if (this.onSkipToNext[i3].AudioAttributesImplApi26Parcelizer() > _isvaluepresent.IconCompatParcelizer(i3)) {
                return false;
            }
        }
        return true;
    }

    private _isValuePresent AudioAttributesImplBaseParcelizer(int i) {
        _isValuePresent _isvaluepresent = this.onFastForward.get(i);
        ArrayList<_isValuePresent> arrayList = this.onFastForward;
        LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.onSkipToNext.length; i2++) {
            this.onSkipToNext[i2].IconCompatParcelizer(_isvaluepresent.IconCompatParcelizer(i2));
        }
        return _isvaluepresent;
    }

    private void onFastForward() {
        for (IconCompatParcelizer iconCompatParcelizer : this.onSkipToNext) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(this.onPrepare);
        }
        this.onPrepare = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaButtonEvent() {
        this.onSkipToPrevious = true;
        onCustomAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCustomAction() {
        if (!this.onSetPlaybackSpeed && this.ParcelableVolumeInfo == null && this.onSkipToPrevious) {
            for (IconCompatParcelizer iconCompatParcelizer : this.onSkipToNext) {
                if (iconCompatParcelizer.MediaBrowserCompatItemReceiver() == null) {
                    return;
                }
            }
            if (this.MediaSessionCompatToken != null) {
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                return;
            }
            handleMediaPlayPauseIfPendingOnHandler();
            onPlayFromMediaId();
            this.write.write();
        }
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = this.MediaSessionCompatToken.RemoteActionCompatParcelizer;
        int[] iArr = new int[i];
        this.ParcelableVolumeInfo = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                IconCompatParcelizer[] iconCompatParcelizerArr = this.onSkipToNext;
                if (i3 >= iconCompatParcelizerArr.length) {
                    break;
                }
                if (read((C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(iconCompatParcelizerArr[i3].MediaBrowserCompatItemReceiver()), this.MediaSessionCompatToken.RemoteActionCompatParcelizer(i2).AudioAttributesCompatParcelizer(0))) {
                    this.ParcelableVolumeInfo[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        Iterator<_typeIdDef> it = this.MediaMetadataCompat.iterator();
        while (it.hasNext()) {
            it.next().read();
        }
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        C0170format c0170format;
        C0170format c0170format2;
        int length = this.onSkipToNext.length;
        int i = 0;
        int i2 = -2;
        int i3 = -1;
        while (true) {
            int i4 = 2;
            if (i >= length) {
                break;
            }
            String str = ((C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onSkipToNext[i].MediaBrowserCompatItemReceiver())).onPlayFromUri;
            if (!DefaultBaseTypeLimitingValidator.MediaBrowserCompatItemReceiver(str)) {
                if (DefaultBaseTypeLimitingValidator.AudioAttributesImplApi21Parcelizer(str)) {
                    i4 = 1;
                } else {
                    i4 = DefaultBaseTypeLimitingValidator.AudioAttributesImplApi26Parcelizer(str) ? 3 : -2;
                }
            }
            if (AudioAttributesImplApi21Parcelizer(i4) > AudioAttributesImplApi21Parcelizer(i2)) {
                i3 = i;
                i2 = i4;
            } else if (i4 == i2 && i3 != -1) {
                i3 = -1;
            }
            i++;
        }
        setName setnameAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer();
        int i5 = setnameAudioAttributesCompatParcelizer.write;
        this.onSeekTo = -1;
        this.ParcelableVolumeInfo = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.ParcelableVolumeInfo[i6] = i6;
        }
        setName[] setnameArr = new setName[length];
        int i7 = 0;
        while (i7 < length) {
            C0170format c0170format3 = (C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onSkipToNext[i7].MediaBrowserCompatItemReceiver());
            if (i7 == i3) {
                C0170format[] c0170formatArr = new C0170format[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    C0170format c0170formatAudioAttributesCompatParcelizer = setnameAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i8);
                    if (i2 == 1 && (c0170format2 = this.onMediaButtonEvent) != null) {
                        c0170formatAudioAttributesCompatParcelizer = c0170formatAudioAttributesCompatParcelizer.read(c0170format2);
                    }
                    if (i5 == 1) {
                        c0170format = c0170format3.read(c0170formatAudioAttributesCompatParcelizer);
                    } else {
                        c0170format = read(c0170formatAudioAttributesCompatParcelizer, c0170format3, true);
                    }
                    c0170formatArr[i8] = c0170format;
                }
                setnameArr[i7] = new setName(this.PlaybackStateCompatCustomAction, c0170formatArr);
                this.onSeekTo = i7;
            } else {
                C0170format c0170format4 = (i2 == 2 && DefaultBaseTypeLimitingValidator.AudioAttributesImplApi21Parcelizer(c0170format3.onPlayFromUri)) ? this.onMediaButtonEvent : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.PlaybackStateCompatCustomAction);
                sb.append(":muxed:");
                sb.append(i7 < i3 ? i7 : i7 - 1);
                setnameArr[i7] = new setName(sb.toString(), read(c0170format4, c0170format3, false));
            }
            i7++;
        }
        this.MediaSessionCompatToken = write(setnameArr);
        buildTypeSerializer.write(this.onPlayFromSearch == null);
        this.onPlayFromSearch = Collections.emptySet();
    }

    private _writeAsBinary write(setName[] setnameArr) {
        for (int i = 0; i < setnameArr.length; i++) {
            setName setname = setnameArr[i];
            C0170format[] c0170formatArr = new C0170format[setname.write];
            for (int i2 = 0; i2 < setname.write; i2++) {
                C0170format c0170formatAudioAttributesCompatParcelizer = setname.AudioAttributesCompatParcelizer(i2);
                c0170formatArr[i2] = c0170formatAudioAttributesCompatParcelizer.read(this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(c0170formatAudioAttributesCompatParcelizer));
            }
            setnameArr[i] = new setName(setname.read, c0170formatArr);
        }
        return new _writeAsBinary(setnameArr);
    }

    private _isValuePresent onAddQueueItem() {
        return this.onFastForward.get(r1.size() - 1);
    }

    private boolean onCommand() {
        return this.onPrepareFromMediaId != C.TIME_UNSET;
    }

    private boolean AudioAttributesCompatParcelizer(long j, _isValuePresent _isvaluepresent) {
        boolean zRemoteActionCompatParcelizer;
        int length = this.onSkipToNext.length;
        for (int i = 0; i < length; i++) {
            IconCompatParcelizer iconCompatParcelizer = this.onSkipToNext[i];
            if (_isvaluepresent != null) {
                zRemoteActionCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer(_isvaluepresent.IconCompatParcelizer(i));
            } else {
                zRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer(j, false);
            }
            if (!zRemoteActionCompatParcelizer && (this.onSetRepeatMode[i] || !this.RatingCompat)) {
                return false;
            }
        }
        return true;
    }

    private void onPlayFromMediaId() {
        this.onRewind = true;
    }

    private void RatingCompat() {
        buildTypeSerializer.write(this.onRewind);
    }

    private static C0170format read(C0170format c0170format, C0170format c0170format2, boolean z) {
        String strWrite;
        String strWrite2;
        if (c0170format == null) {
            return c0170format2;
        }
        int iIconCompatParcelizer = DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170format2.onPlayFromUri);
        if (LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(c0170format.RemoteActionCompatParcelizer, iIconCompatParcelizer) == 1) {
            strWrite = LaissezFaireSubTypeValidator.IconCompatParcelizer(c0170format.RemoteActionCompatParcelizer, iIconCompatParcelizer);
            strWrite2 = DefaultBaseTypeLimitingValidator.write(strWrite);
        } else {
            strWrite = DefaultBaseTypeLimitingValidator.write(c0170format.RemoteActionCompatParcelizer, c0170format2.onPlayFromUri);
            strWrite2 = c0170format2.onPlayFromUri;
        }
        C0170format.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = c0170format2.write().AudioAttributesCompatParcelizer(c0170format.handleMediaPlayPauseIfPendingOnHandler).write(c0170format.onCustomAction).IconCompatParcelizer(c0170format.onCommand).read(c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).handleMediaPlayPauseIfPendingOnHandler(c0170format.onRewind).MediaBrowserCompatSearchResultReceiver(c0170format.onPrepare).write(z ? c0170format.IconCompatParcelizer : -1).MediaDescriptionCompat(z ? c0170format.onFastForward : -1).RemoteActionCompatParcelizer(strWrite);
        if (iIconCompatParcelizer == 2) {
            RemoteActionCompatParcelizer.onFastForward(c0170format.onSetCaptioningEnabled).MediaBrowserCompatItemReceiver(c0170format.MediaMetadataCompat).RemoteActionCompatParcelizer(c0170format.RatingCompat);
        }
        if (strWrite2 != null) {
            RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(strWrite2);
        }
        if (c0170format.AudioAttributesCompatParcelizer != -1 && iIconCompatParcelizer == 1) {
            RemoteActionCompatParcelizer.read(c0170format.AudioAttributesCompatParcelizer);
        }
        if (c0170format.onPlay != null) {
            androidx.media3.common.Metadata metadataRemoteActionCompatParcelizer = c0170format.onPlay;
            if (c0170format2.onPlay != null) {
                metadataRemoteActionCompatParcelizer = c0170format2.onPlay.RemoteActionCompatParcelizer(metadataRemoteActionCompatParcelizer);
            }
            RemoteActionCompatParcelizer.read(metadataRemoteActionCompatParcelizer);
        }
        return RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    private static boolean AudioAttributesCompatParcelizer(CollectionLikeType collectionLikeType) {
        return collectionLikeType instanceof _isValuePresent;
    }

    private static boolean read(C0170format c0170format, C0170format c0170format2) {
        String str = c0170format.onPlayFromUri;
        String str2 = c0170format2.onPlayFromUri;
        int iIconCompatParcelizer = DefaultBaseTypeLimitingValidator.IconCompatParcelizer(str);
        if (iIconCompatParcelizer != 3) {
            return iIconCompatParcelizer == DefaultBaseTypeLimitingValidator.IconCompatParcelizer(str2);
        }
        if (LaissezFaireSubTypeValidator.read(str, str2)) {
            return !(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str)) || c0170format.write == c0170format2.write;
        }
        return false;
    }

    private static exceptionMessage AudioAttributesCompatParcelizer(int i, int i2) {
        StringBuilder sb = new StringBuilder("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        prune.RemoteActionCompatParcelizer("HlsSampleStreamWrapper", sb.toString());
        return new exceptionMessage();
    }

    static final class IconCompatParcelizer extends visitIntFormat {
        private DrmInitData IconCompatParcelizer;
        private final Map<String, DrmInitData> RemoteActionCompatParcelizer;

        /* synthetic */ IconCompatParcelizer(_findWellKnownSimple _findwellknownsimple, matchesUntyped matchesuntyped, PropertySerializerMapEmpty.read readVar, Map map, byte b) {
            this(_findwellknownsimple, matchesuntyped, readVar, map);
        }

        private IconCompatParcelizer(_findWellKnownSimple _findwellknownsimple, matchesUntyped matchesuntyped, PropertySerializerMapEmpty.read readVar, Map<String, DrmInitData> map) {
            super(_findwellknownsimple, matchesuntyped, readVar);
            this.RemoteActionCompatParcelizer = map;
        }

        public final void IconCompatParcelizer(_isValuePresent _isvaluepresent) {
            RemoteActionCompatParcelizer(_isvaluepresent.read);
        }

        public final void write(DrmInitData drmInitData) {
            this.IconCompatParcelizer = drmInitData;
            MediaBrowserCompatSearchResultReceiver();
        }

        @Override // kotlin.visitIntFormat
        public final C0170format IconCompatParcelizer(C0170format c0170format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.IconCompatParcelizer;
            if (drmInitData2 == null) {
                drmInitData2 = c0170format.MediaBrowserCompatMediaItem;
            }
            if (drmInitData2 != null && (drmInitData = this.RemoteActionCompatParcelizer.get(drmInitData2.AudioAttributesCompatParcelizer)) != null) {
                drmInitData2 = drmInitData;
            }
            androidx.media3.common.Metadata metadata = read(c0170format.onPlay);
            if (drmInitData2 != c0170format.MediaBrowserCompatMediaItem || metadata != c0170format.onPlay) {
                c0170format = c0170format.write().AudioAttributesCompatParcelizer(drmInitData2).read(metadata).IconCompatParcelizer();
            }
            return super.IconCompatParcelizer(c0170format);
        }

        private static androidx.media3.common.Metadata read(androidx.media3.common.Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int iWrite = metadata.write();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iWrite) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry entryIconCompatParcelizer = metadata.IconCompatParcelizer(i2);
                if ((entryIconCompatParcelizer instanceof PrivFrame) && HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(((PrivFrame) entryIconCompatParcelizer).AudioAttributesCompatParcelizer)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (iWrite == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[iWrite - 1];
            while (i < iWrite) {
                if (i != i2) {
                    entryArr[i < i2 ? i : i - 1] = metadata.IconCompatParcelizer(i);
                }
                i++;
            }
            return new androidx.media3.common.Metadata(entryArr);
        }

        @Override // kotlin.visitIntFormat, kotlin.nonNullString
        public final void IconCompatParcelizer(long j, int i, int i2, int i3, nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super.IconCompatParcelizer(j, i, i2, i3, audioAttributesCompatParcelizer);
        }
    }

    static class AudioAttributesCompatParcelizer implements nonNullString {
        private final constructLookup AudioAttributesImplApi21Parcelizer = new constructLookup();
        private final C0170format AudioAttributesImplApi26Parcelizer;
        private C0170format MediaBrowserCompatCustomActionResultReceiver;
        private byte[] RemoteActionCompatParcelizer;
        private final nonNullString read;
        private int write;
        private static final C0170format IconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_ID3).IconCompatParcelizer();
        private static final C0170format AudioAttributesCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_EMSG).IconCompatParcelizer();

        public AudioAttributesCompatParcelizer(nonNullString nonnullstring, int i) {
            this.read = nonnullstring;
            if (i == 1) {
                this.AudioAttributesImplApi26Parcelizer = IconCompatParcelizer;
            } else if (i == 3) {
                this.AudioAttributesImplApi26Parcelizer = AudioAttributesCompatParcelizer;
            } else {
                throw new IllegalArgumentException("Unknown metadataType: ".concat(String.valueOf(i)));
            }
            this.RemoteActionCompatParcelizer = new byte[0];
            this.write = 0;
        }

        @Override // kotlin.nonNullString
        public final void write(C0170format c0170format) {
            this.MediaBrowserCompatCustomActionResultReceiver = c0170format;
            this.read.write(this.AudioAttributesImplApi26Parcelizer);
        }

        @Override // kotlin.nonNullString
        public final int AudioAttributesCompatParcelizer(JsonNullFormatVisitor jsonNullFormatVisitor, int i, boolean z, int i2) throws IOException {
            AudioAttributesCompatParcelizer(this.write + i);
            int iAudioAttributesCompatParcelizer = jsonNullFormatVisitor.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, i);
            if (iAudioAttributesCompatParcelizer != -1) {
                this.write += iAudioAttributesCompatParcelizer;
                return iAudioAttributesCompatParcelizer;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // kotlin.nonNullString
        public final void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) {
            AudioAttributesCompatParcelizer(this.write + i);
            asPropertyTypeDeserializer.write(this.RemoteActionCompatParcelizer, this.write, i);
            this.write += i;
        }

        @Override // kotlin.nonNullString
        public final void IconCompatParcelizer(long j, int i, int i2, int i3, nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = read(i2, i3);
            if (!LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatCustomActionResultReceiver.onPlayFromUri, this.AudioAttributesImplApi26Parcelizer.onPlayFromUri)) {
                if (MimeTypes.APPLICATION_EMSG.equals(this.MediaBrowserCompatCustomActionResultReceiver.onPlayFromUri)) {
                    EventMessage eventMessage = constructLookup.read(asPropertyTypeDeserializer);
                    if (!RemoteActionCompatParcelizer(eventMessage)) {
                        prune.RemoteActionCompatParcelizer("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.AudioAttributesImplApi26Parcelizer.onPlayFromUri, eventMessage.read()));
                        return;
                    }
                    asPropertyTypeDeserializer = new AsPropertyTypeDeserializer((byte[]) buildTypeSerializer.IconCompatParcelizer(eventMessage.RemoteActionCompatParcelizer()));
                } else {
                    StringBuilder sb = new StringBuilder("Ignoring sample for unsupported format: ");
                    sb.append(this.MediaBrowserCompatCustomActionResultReceiver.onPlayFromUri);
                    prune.RemoteActionCompatParcelizer("HlsSampleStreamWrapper", sb.toString());
                    return;
                }
            }
            int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer();
            this.read.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iIconCompatParcelizer);
            this.read.IconCompatParcelizer(j, i, iIconCompatParcelizer, 0, audioAttributesCompatParcelizer);
        }

        private boolean RemoteActionCompatParcelizer(EventMessage eventMessage) {
            C0170format c0170format = eventMessage.read();
            return c0170format != null && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi26Parcelizer.onPlayFromUri, c0170format.onPlayFromUri);
        }

        private void AudioAttributesCompatParcelizer(int i) {
            byte[] bArr = this.RemoteActionCompatParcelizer;
            if (bArr.length < i) {
                this.RemoteActionCompatParcelizer = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        private AsPropertyTypeDeserializer read(int i, int i2) {
            int i3 = this.write - i2;
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(Arrays.copyOfRange(this.RemoteActionCompatParcelizer, i3 - i, i3));
            byte[] bArr = this.RemoteActionCompatParcelizer;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.write = i2;
            return asPropertyTypeDeserializer;
        }
    }
}
