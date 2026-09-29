package kotlin;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.hls.HlsMediaChunk;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AsArraySerializerBase;
import kotlin.SubTypeValidator;
import kotlin._acceptJsonFormatVisitor;
import kotlin._fromVariable;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
final class _isValuePresent extends getSelfReferencedType {
    private static final AtomicInteger onCommand = new AtomicInteger();
    public final boolean AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    private _serializeObjectId MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final int RemoteActionCompatParcelizer;
    private final _getReferencedIfPresent handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private final DrmInitData onCustomAction;
    private final _hasTypeResolver onFastForward;
    private final constructUsingIndex onMediaButtonEvent;
    private final boolean onPause;
    private final SubTypeValidator onPlay;
    private boolean onPlayFromMediaId;
    private volatile boolean onPlayFromSearch;
    private final boolean onPlayFromUri;
    private boolean onPrepare;
    private final boolean onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private int onPrepareFromUri;
    private BeanSerializerBase1 onRemoveQueueItem;
    private final boolean onRemoveQueueItemAt;
    private final List<C0170format> onRewind;
    private final modifyArraySerializer onSeekTo;
    private final MinimalClassNameIdResolver onSetCaptioningEnabled;
    private final long onSetPlaybackSpeed;
    private final _serializeObjectId onSetRating;
    private initExtraTracks<Integer> onSetRepeatMode;
    private final AsPropertyTypeDeserializer onSetShuffleMode;
    public final int read;
    public final Uri write;

    public static _isValuePresent IconCompatParcelizer(_getReferencedIfPresent _getreferencedifpresent, _hasTypeResolver _hastyperesolver, C0170format c0170format, long j, _acceptJsonFormatVisitor _acceptjsonformatvisitor, AsArraySerializerBase.IconCompatParcelizer iconCompatParcelizer, Uri uri, List<C0170format> list, int i, Object obj, boolean z, BooleanSerializerAsNumber booleanSerializerAsNumber, long j2, _isValuePresent _isvaluepresent, byte[] bArr, byte[] bArr2, boolean z2, modifyArraySerializer modifyarrayserializer, _fromVariable.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        _hasTypeResolver _hastyperesolverWrite;
        SubTypeValidator subTypeValidatorWrite;
        boolean z3;
        constructUsingIndex constructusingindex;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer;
        _serializeObjectId _serializeobjectid;
        _acceptJsonFormatVisitor.RemoteActionCompatParcelizer remoteActionCompatParcelizer = iconCompatParcelizer.write;
        SubTypeValidator subTypeValidatorWrite2 = new SubTypeValidator.write().IconCompatParcelizer(_idFrom.read(_acceptjsonformatvisitor.handleMediaPlayPauseIfPendingOnHandler, remoteActionCompatParcelizer.MediaDescriptionCompat)).IconCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer).write(remoteActionCompatParcelizer.write).read(iconCompatParcelizer.IconCompatParcelizer ? 8 : 0).write();
        if (audioAttributesCompatParcelizer != null) {
            subTypeValidatorWrite2 = audioAttributesCompatParcelizer.read(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer).IconCompatParcelizer().read(subTypeValidatorWrite2);
        }
        SubTypeValidator subTypeValidator = subTypeValidatorWrite2;
        boolean z4 = bArr != null;
        _hasTypeResolver _hastyperesolverWrite2 = write(_hastyperesolver, bArr, z4 ? IconCompatParcelizer((String) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer)) : null);
        _acceptJsonFormatVisitor.write writeVar = remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
        if (writeVar != null) {
            boolean z5 = bArr2 != null;
            byte[] bArrIconCompatParcelizer = z5 ? IconCompatParcelizer((String) buildTypeSerializer.IconCompatParcelizer(writeVar.AudioAttributesImplBaseParcelizer)) : null;
            boolean z6 = z5;
            subTypeValidatorWrite = new SubTypeValidator.write().IconCompatParcelizer(_idFrom.read(_acceptjsonformatvisitor.handleMediaPlayPauseIfPendingOnHandler, writeVar.MediaDescriptionCompat)).IconCompatParcelizer(writeVar.IconCompatParcelizer).write(writeVar.write).write();
            if (audioAttributesCompatParcelizer != null) {
                subTypeValidatorWrite = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT).IconCompatParcelizer().read(subTypeValidatorWrite);
            }
            _hastyperesolverWrite = write(_hastyperesolver, bArr2, bArrIconCompatParcelizer);
            z3 = z6;
        } else {
            _hastyperesolverWrite = null;
            subTypeValidatorWrite = null;
            z3 = false;
        }
        long j3 = j + remoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
        long j4 = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        int i2 = _acceptjsonformatvisitor.write + remoteActionCompatParcelizer.MediaMetadataCompat;
        if (_isvaluepresent != null) {
            SubTypeValidator subTypeValidator2 = _isvaluepresent.onPlay;
            boolean z7 = subTypeValidatorWrite == subTypeValidator2 || (subTypeValidatorWrite != null && subTypeValidator2 != null && subTypeValidatorWrite.AudioAttributesImplBaseParcelizer.equals(_isvaluepresent.onPlay.AudioAttributesImplBaseParcelizer) && subTypeValidatorWrite.AudioAttributesImplApi21Parcelizer == _isvaluepresent.onPlay.AudioAttributesImplApi21Parcelizer);
            boolean z8 = uri.equals(_isvaluepresent.write) && _isvaluepresent.onPrepareFromSearch;
            constructUsingIndex constructusingindex2 = _isvaluepresent.onMediaButtonEvent;
            AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = _isvaluepresent.onSetShuffleMode;
            _serializeobjectid = (z7 && z8 && !_isvaluepresent.onAddQueueItem && _isvaluepresent.IconCompatParcelizer == i2) ? _isvaluepresent.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null;
            constructusingindex = constructusingindex2;
            asPropertyTypeDeserializer = asPropertyTypeDeserializer2;
        } else {
            constructusingindex = new constructUsingIndex();
            asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(10);
            _serializeobjectid = null;
        }
        return new _isValuePresent(_getreferencedifpresent, _hastyperesolverWrite2, subTypeValidator, c0170format, z4, _hastyperesolverWrite, subTypeValidatorWrite, z3, uri, list, i, obj, j3, j3 + j4, iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer.read, !iconCompatParcelizer.IconCompatParcelizer, i2, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer, z, booleanSerializerAsNumber.read(i2), j2, remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver, _serializeobjectid, constructusingindex, asPropertyTypeDeserializer, z2, modifyarrayserializer);
    }

    public static boolean IconCompatParcelizer(_isValuePresent _isvaluepresent, Uri uri, _acceptJsonFormatVisitor _acceptjsonformatvisitor, AsArraySerializerBase.IconCompatParcelizer iconCompatParcelizer, long j) {
        if (_isvaluepresent == null) {
            return false;
        }
        if (uri.equals(_isvaluepresent.write) && _isvaluepresent.onPrepareFromSearch) {
            return false;
        }
        return !read(iconCompatParcelizer, _acceptjsonformatvisitor) || j + iconCompatParcelizer.write.MediaBrowserCompatMediaItem < _isvaluepresent.AudioAttributesImplApi21Parcelizer;
    }

    private _isValuePresent(_getReferencedIfPresent _getreferencedifpresent, _hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, C0170format c0170format, boolean z, _hasTypeResolver _hastyperesolver2, SubTypeValidator subTypeValidator2, boolean z2, Uri uri, List<C0170format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, MinimalClassNameIdResolver minimalClassNameIdResolver, long j4, DrmInitData drmInitData, _serializeObjectId _serializeobjectid, constructUsingIndex constructusingindex, AsPropertyTypeDeserializer asPropertyTypeDeserializer, boolean z6, modifyArraySerializer modifyarrayserializer) {
        super(_hastyperesolver, subTypeValidator, c0170format, i, obj, j, j2, j3);
        this.onRemoveQueueItemAt = z;
        this.RemoteActionCompatParcelizer = i2;
        this.onPrepare = z3;
        this.IconCompatParcelizer = i3;
        this.onPlay = subTypeValidator2;
        this.onFastForward = _hastyperesolver2;
        this.onPlayFromMediaId = subTypeValidator2 != null;
        this.onPlayFromUri = z2;
        this.write = uri;
        this.onPrepareFromMediaId = z5;
        this.onSetCaptioningEnabled = minimalClassNameIdResolver;
        this.onSetPlaybackSpeed = j4;
        this.onPause = z4;
        this.handleMediaPlayPauseIfPendingOnHandler = _getreferencedifpresent;
        this.onRewind = list;
        this.onCustomAction = drmInitData;
        this.onSetRating = _serializeobjectid;
        this.onMediaButtonEvent = constructusingindex;
        this.onSetShuffleMode = asPropertyTypeDeserializer;
        this.AudioAttributesCompatParcelizer = z6;
        this.onSeekTo = modifyarrayserializer;
        this.onSetRepeatMode = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        this.read = onCommand.getAndIncrement();
    }

    public final void AudioAttributesCompatParcelizer(BeanSerializerBase1 beanSerializerBase1, initExtraTracks<Integer> initextratracks) {
        this.onRemoveQueueItem = beanSerializerBase1;
        this.onSetRepeatMode = initextratracks;
    }

    public final int IconCompatParcelizer(int i) {
        buildTypeSerializer.write(!this.AudioAttributesCompatParcelizer);
        if (i >= this.onSetRepeatMode.size()) {
            return 0;
        }
        return this.onSetRepeatMode.get(i).intValue();
    }

    public final void read() {
        this.onAddQueueItem = true;
    }

    @Override // kotlin.getSelfReferencedType
    public final boolean write() {
        return this.onPrepareFromSearch;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void B_() {
        this.onPlayFromSearch = true;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() throws IOException {
        _serializeObjectId _serializeobjectid;
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null && (_serializeobjectid = this.onSetRating) != null && _serializeobjectid.read()) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.onSetRating;
            this.onPlayFromMediaId = false;
        }
        MediaDescriptionCompat();
        if (this.onPlayFromSearch) {
            return;
        }
        if (!this.onPause) {
            MediaMetadataCompat();
        }
        this.onPrepareFromSearch = !this.onPlayFromSearch;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.onPrepare;
    }

    public final void AudioAttributesImplBaseParcelizer() {
        this.onPrepare = true;
    }

    private void MediaDescriptionCompat() throws IOException {
        if (this.onPlayFromMediaId) {
            write(this.onFastForward, this.onPlay, this.onPlayFromUri, false);
            this.onPrepareFromUri = 0;
            this.onPlayFromMediaId = false;
        }
    }

    private void MediaMetadataCompat() throws IOException {
        write(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, this.onRemoveQueueItemAt, true);
    }

    private void write(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, boolean z, boolean z2) throws IOException {
        SubTypeValidator subTypeValidatorIconCompatParcelizer;
        long jIconCompatParcelizer;
        if (z) {
            z = this.onPrepareFromUri != 0;
            subTypeValidatorIconCompatParcelizer = subTypeValidator;
        } else {
            subTypeValidatorIconCompatParcelizer = subTypeValidator.IconCompatParcelizer(this.onPrepareFromUri);
        }
        try {
            classOf classofAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_hastyperesolver, subTypeValidatorIconCompatParcelizer, z2);
            if (z) {
                classofAudioAttributesCompatParcelizer.IconCompatParcelizer(this.onPrepareFromUri);
            }
            while (!this.onPlayFromSearch && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(classofAudioAttributesCompatParcelizer)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.MediaDescriptionCompat.onPrepare & 16384) != 0) {
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
                            jIconCompatParcelizer = classofAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    this.onPrepareFromUri = (int) (classofAudioAttributesCompatParcelizer.IconCompatParcelizer() - subTypeValidator.AudioAttributesImplApi21Parcelizer);
                    throw th;
                }
            }
            jIconCompatParcelizer = classofAudioAttributesCompatParcelizer.IconCompatParcelizer();
            this.onPrepareFromUri = (int) (jIconCompatParcelizer - subTypeValidator.AudioAttributesImplApi21Parcelizer);
        } finally {
            StdTypeResolverBuilder1.IconCompatParcelizer(_hastyperesolver);
        }
    }

    private classOf AudioAttributesCompatParcelizer(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, boolean z) throws IOException {
        _serializeObjectId _serializeobjectidAudioAttributesCompatParcelizer;
        long jWrite;
        long jRemoteActionCompatParcelizer = _hastyperesolver.RemoteActionCompatParcelizer(subTypeValidator);
        if (z) {
            try {
                this.onSetCaptioningEnabled.read(this.onPrepareFromMediaId, this.MediaBrowserCompatItemReceiver, this.onSetPlaybackSpeed);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        classOf classof = new classOf(_hastyperesolver, subTypeValidator.AudioAttributesImplApi21Parcelizer, jRemoteActionCompatParcelizer);
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            long j = read(classof);
            classof.RemoteActionCompatParcelizer();
            _serializeObjectId _serializeobjectid = this.onSetRating;
            if (_serializeobjectid != null) {
                _serializeobjectidAudioAttributesCompatParcelizer = _serializeobjectid.IconCompatParcelizer();
            } else {
                _serializeobjectidAudioAttributesCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(subTypeValidator.AudioAttributesImplBaseParcelizer, this.MediaDescriptionCompat, this.onRewind, this.onSetCaptioningEnabled, _hastyperesolver.read(), classof);
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = _serializeobjectidAudioAttributesCompatParcelizer;
            if (_serializeobjectidAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
                BeanSerializerBase1 beanSerializerBase1 = this.onRemoveQueueItem;
                if (j != C.TIME_UNSET) {
                    jWrite = this.onSetCaptioningEnabled.write(j);
                } else {
                    jWrite = this.MediaBrowserCompatItemReceiver;
                }
                beanSerializerBase1.write(jWrite);
            } else {
                this.onRemoveQueueItem.write(0L);
            }
            this.onRemoveQueueItem.MediaMetadataCompat();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer(this.onRemoveQueueItem);
        }
        this.onRemoveQueueItem.write(this.onCustomAction);
        return classof;
    }

    private long read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        try {
            this.onSetShuffleMode.write(10);
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.onSetShuffleMode.RemoteActionCompatParcelizer(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.onSetShuffleMode.onPause() != 4801587) {
            return C.TIME_UNSET;
        }
        this.onSetShuffleMode.AudioAttributesImplBaseParcelizer(3);
        int iOnPlay = this.onSetShuffleMode.onPlay();
        int i = iOnPlay + 10;
        if (i > this.onSetShuffleMode.AudioAttributesCompatParcelizer()) {
            byte[] bArrRemoteActionCompatParcelizer = this.onSetShuffleMode.RemoteActionCompatParcelizer();
            this.onSetShuffleMode.write(i);
            System.arraycopy(bArrRemoteActionCompatParcelizer, 0, this.onSetShuffleMode.RemoteActionCompatParcelizer(), 0, 10);
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.onSetShuffleMode.RemoteActionCompatParcelizer(), 10, iOnPlay);
        androidx.media3.common.Metadata metadataWrite = this.onMediaButtonEvent.write(this.onSetShuffleMode.RemoteActionCompatParcelizer(), iOnPlay);
        if (metadataWrite == null) {
            return C.TIME_UNSET;
        }
        int iWrite = metadataWrite.write();
        for (int i2 = 0; i2 < iWrite; i2++) {
            Metadata.Entry entryIconCompatParcelizer = metadataWrite.IconCompatParcelizer(i2);
            if (entryIconCompatParcelizer instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entryIconCompatParcelizer;
                if (HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.AudioAttributesCompatParcelizer)) {
                    System.arraycopy(privFrame.RemoteActionCompatParcelizer, 0, this.onSetShuffleMode.RemoteActionCompatParcelizer(), 0, 8);
                    this.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(0);
                    this.onSetShuffleMode.AudioAttributesCompatParcelizer(8);
                    return this.onSetShuffleMode.handleMediaPlayPauseIfPendingOnHandler() & TarConstants.MAXSIZE;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private static byte[] IconCompatParcelizer(String str) {
        if (parseMdhd.read(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static _hasTypeResolver write(_hasTypeResolver _hastyperesolver, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new writeAsField(_hastyperesolver, bArr, bArr2) : _hastyperesolver;
    }

    private static boolean read(AsArraySerializerBase.IconCompatParcelizer iconCompatParcelizer, _acceptJsonFormatVisitor _acceptjsonformatvisitor) {
        if (iconCompatParcelizer.write instanceof _acceptJsonFormatVisitor.read) {
            if (((_acceptJsonFormatVisitor.read) iconCompatParcelizer.write).RemoteActionCompatParcelizer) {
                return true;
            }
            return iconCompatParcelizer.read == 0 && _acceptjsonformatvisitor.onPlayFromMediaId;
        }
        return _acceptjsonformatvisitor.onPlayFromMediaId;
    }
}
