package kotlin;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import kotlin.PropertySerializerMapDouble;
import kotlin._ensureOverride;
import kotlin._find;
import kotlin.buildIndexedListSerializer;
import kotlin.serializeFilteredFields;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class serializeFieldsUsing extends findCollectionSerializer {
    private static final byte[] IconCompatParcelizer = {0, 0, 1, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, TarConstants.LF_LINK, -61, 39, 93, TarConstants.LF_PAX_EXTENDED_HEADER_LC};
    private final float AudioAttributesCompatParcelizer;
    private final isNaturalTypeWithStdHandling AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final _find MediaBrowserCompatItemReceiver;
    private _ensureOverride MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private _writeNullKeyedEntry MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private MediaCrypto MediaSessionCompatQueueItem;
    private final serializeFilteredAnyProperties MediaSessionCompatResultReceiverWrapper;
    private boolean MediaSessionCompatToken;
    private long ParcelableVolumeInfo;
    private long PlaybackStateCompat;
    private final ResolvableSerializer PlaybackStateCompatCustomAction;
    private final _ensureOverride.IconCompatParcelizer RatingCompat;
    private final _find RemoteActionCompatParcelizer;
    private C0170format ResultReceiver;
    private boolean _init_lambda2;
    private int _init_lambda3;
    private long _init_lambda4;
    private PropertySerializerMapDouble _init_lambda5;
    private boolean accessaddObserverForBackInvoker;
    private RemoteActionCompatParcelizer accessensureViewModelStore;
    private addNull accessgetReportFullyDrawnExecutorp;
    private buildIndexedListSerializer.IconCompatParcelizer addObserverForBackInvokerlambda7;
    private boolean createFullyDrawnExecutor;
    private float ensureViewModelStore;
    private long handleMediaPlayPauseIfPendingOnHandler;
    private PropertySerializerMapDouble onAddQueueItem;
    private C0170format onCommand;
    private boolean onCustomAction;
    private boolean onFastForward;
    private boolean onMediaButtonEvent;
    private boolean onPause;
    private boolean onPlay;
    private boolean onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private float onPlayFromUri;
    private boolean onPrepare;
    private boolean onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private boolean onPrepareFromUri;
    private int onRemoveQueueItem;
    private MediaFormat onRemoveQueueItemAt;
    private boolean onRewind;
    private boolean onSeekTo;
    private C0170format onSetCaptioningEnabled;
    private float onSetPlaybackSpeed;
    private boolean onSetRating;
    private boolean onSetRepeatMode;
    private final boolean onSetShuffleMode;
    private boolean onSkipToNext;
    private long onSkipToPrevious;
    private boolean onSkipToQueueItem;
    private int onStop;
    private final _find r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private final MediaCodec.BufferInfo r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private ByteBuffer r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final ArrayDeque<AudioAttributesCompatParcelizer> r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private boolean r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private AudioAttributesCompatParcelizer r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private ArrayDeque<_writeNullKeyedEntry> read;
    private boolean setSessionImpl;
    public _at write;

    protected abstract List<_writeNullKeyedEntry> AudioAttributesCompatParcelizer(serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format, boolean z) throws serializeFilteredFields.write;

    protected void AudioAttributesCompatParcelizer(String str, long j, long j2) {
    }

    protected void AudioAttributesCompatParcelizer(_find _findVar) throws addNull {
    }

    protected void AudioAttributesCompatParcelizer(C0170format c0170format, MediaFormat mediaFormat) throws addNull {
    }

    protected boolean AudioAttributesCompatParcelizer(C0170format c0170format) {
        return false;
    }

    protected int IconCompatParcelizer(_find _findVar) {
        return 0;
    }

    protected abstract int IconCompatParcelizer(serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format) throws serializeFilteredFields.write;

    protected void IconCompatParcelizer(Exception exc) {
    }

    protected void IconCompatParcelizer(String str) {
    }

    @Override // kotlin.findCollectionSerializer
    public void onFastForward() {
    }

    @Override // kotlin.findCollectionSerializer
    public void onPause() {
    }

    @Override // kotlin.findCollectionSerializer, kotlin.buildIterableSerializer
    public final int onPlayFromSearch() {
        return 8;
    }

    protected void onSetCaptioningEnabled() throws addNull {
    }

    public void onSetPlaybackSpeed() {
    }

    protected boolean onSkipToQueueItem() {
        return false;
    }

    protected float write(float f, C0170format[] c0170formatArr) {
        return -1.0f;
    }

    protected abstract _ensureOverride.write write(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format, MediaCrypto mediaCrypto, float f);

    protected void write(_find _findVar) throws addNull {
    }

    protected void write(C0170format c0170format) throws addNull {
    }

    protected abstract boolean write(long j, long j2, _ensureOverride _ensureoverride, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0170format c0170format) throws addNull;

    protected boolean write(_writeNullKeyedEntry _writenullkeyedentry) {
        return true;
    }

    public static class RemoteActionCompatParcelizer extends Exception {
        public final boolean AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        public final String RemoteActionCompatParcelizer;
        public final _writeNullKeyedEntry read;
        public final RemoteActionCompatParcelizer write;

        public RemoteActionCompatParcelizer(C0170format c0170format, Throwable th, boolean z, int i) {
            StringBuilder sb = new StringBuilder("Decoder init failed: [");
            sb.append(i);
            sb.append("], ");
            sb.append(c0170format);
            this(sb.toString(), th, c0170format.onPlayFromUri, z, null, AudioAttributesCompatParcelizer(i), null);
        }

        public RemoteActionCompatParcelizer(C0170format c0170format, Throwable th, boolean z, _writeNullKeyedEntry _writenullkeyedentry) {
            StringBuilder sb = new StringBuilder("Decoder init failed: ");
            sb.append(_writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver);
            sb.append(", ");
            sb.append(c0170format);
            this(sb.toString(), th, c0170format.onPlayFromUri, z, _writenullkeyedentry, LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 ? IconCompatParcelizer(th) : null, null);
        }

        private RemoteActionCompatParcelizer(String str, Throwable th, String str2, boolean z, _writeNullKeyedEntry _writenullkeyedentry, String str3, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super(str, th);
            this.RemoteActionCompatParcelizer = str2;
            this.AudioAttributesCompatParcelizer = z;
            this.read = _writenullkeyedentry;
            this.IconCompatParcelizer = str3;
            this.write = remoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RemoteActionCompatParcelizer read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return new RemoteActionCompatParcelizer(getMessage(), getCause(), this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.IconCompatParcelizer, remoteActionCompatParcelizer);
        }

        private static String IconCompatParcelizer(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static String AudioAttributesCompatParcelizer(int i) {
            String str = i < 0 ? "neg_" : "";
            StringBuilder sb = new StringBuilder("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_");
            sb.append(str);
            sb.append(Math.abs(i));
            return sb.toString();
        }
    }

    public serializeFieldsUsing(int i, _ensureOverride.IconCompatParcelizer iconCompatParcelizer, serializeFilteredAnyProperties serializefilteredanyproperties, boolean z, float f) {
        super(i);
        this.RatingCompat = iconCompatParcelizer;
        this.MediaSessionCompatResultReceiverWrapper = (serializeFilteredAnyProperties) buildTypeSerializer.IconCompatParcelizer(serializefilteredanyproperties);
        this.onSetShuffleMode = z;
        this.AudioAttributesCompatParcelizer = f;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = _find.AudioAttributesImplApi26Parcelizer();
        this.RemoteActionCompatParcelizer = new _find(0);
        this.MediaBrowserCompatItemReceiver = new _find(2);
        isNaturalTypeWithStdHandling isnaturaltypewithstdhandling = new isNaturalTypeWithStdHandling();
        this.AudioAttributesImplApi21Parcelizer = isnaturaltypewithstdhandling;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = new MediaCodec.BufferInfo();
        this.onSetPlaybackSpeed = 1.0f;
        this.ensureViewModelStore = 1.0f;
        this._init_lambda4 = C.TIME_UNSET;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new ArrayDeque<>();
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = AudioAttributesCompatParcelizer.read;
        isnaturaltypewithstdhandling.read(0);
        isnaturaltypewithstdhandling.read.order(ByteOrder.nativeOrder());
        this.PlaybackStateCompatCustomAction = new ResolvableSerializer();
        this.onPlayFromUri = -1.0f;
        this.MediaDescriptionCompat = 0;
        this.onRemoveQueueItem = 0;
        this.onStop = -1;
        this._init_lambda3 = -1;
        this.handleMediaPlayPauseIfPendingOnHandler = C.TIME_UNSET;
        this.onSkipToPrevious = C.TIME_UNSET;
        this.PlaybackStateCompat = C.TIME_UNSET;
        this.ParcelableVolumeInfo = C.TIME_UNSET;
        this.MediaMetadataCompat = 0;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.write = new _at();
    }

    @Override // kotlin.buildIterableSerializer
    public final int read(C0170format c0170format) throws addNull {
        try {
            return IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, c0170format);
        } catch (serializeFilteredFields.write e) {
            throw this.write(e, c0170format, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    @Override // kotlin.buildIndexedListSerializer
    public final long AudioAttributesCompatParcelizer(long j, long j2) {
        return read(this.onSetRepeatMode, j, j2);
    }

    public long read(boolean z, long j, long j2) {
        return super.AudioAttributesCompatParcelizer(j, j2);
    }

    protected final void ParcelableVolumeInfo() throws addNull {
        C0170format c0170format;
        if (this.MediaBrowserCompatMediaItem != null || this.AudioAttributesImplApi26Parcelizer || (c0170format = this.onSetCaptioningEnabled) == null) {
            return;
        }
        if (RemoteActionCompatParcelizer(c0170format)) {
            AudioAttributesImplBaseParcelizer(c0170format);
            return;
        }
        AudioAttributesCompatParcelizer(this._init_lambda5);
        if (this.onAddQueueItem == null || accessgetReportFullyDrawnExecutorp()) {
            try {
                PropertySerializerMapDouble propertySerializerMapDouble = this.onAddQueueItem;
                RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, propertySerializerMapDouble != null && propertySerializerMapDouble.AudioAttributesCompatParcelizer((String) buildTypeSerializer.AudioAttributesCompatParcelizer(c0170format.onPlayFromUri)));
            } catch (RemoteActionCompatParcelizer e) {
                throw write(e, c0170format, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
            }
        }
        MediaCrypto mediaCrypto = this.MediaSessionCompatQueueItem;
        if (mediaCrypto == null || this.MediaBrowserCompatMediaItem != null) {
            return;
        }
        mediaCrypto.release();
        this.MediaSessionCompatQueueItem = null;
    }

    protected final boolean RemoteActionCompatParcelizer(C0170format c0170format) {
        return this._init_lambda5 == null && AudioAttributesCompatParcelizer(c0170format);
    }

    protected final boolean MediaSessionCompatQueueItem() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void AudioAttributesCompatParcelizer(addNull addnull) {
        this.accessgetReportFullyDrawnExecutorp = addnull;
    }

    protected final void read(long j) throws addNull {
        C0170format c0170formatIconCompatParcelizer = this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.AudioAttributesCompatParcelizer.read(j);
        if (c0170formatIconCompatParcelizer == null && this.MediaSessionCompatToken && this.onRemoveQueueItemAt != null) {
            c0170formatIconCompatParcelizer = this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        }
        if (c0170formatIconCompatParcelizer != null) {
            this.ResultReceiver = c0170formatIconCompatParcelizer;
        } else if (!this.onSeekTo || this.ResultReceiver == null) {
            return;
        }
        AudioAttributesCompatParcelizer((C0170format) buildTypeSerializer.IconCompatParcelizer(this.ResultReceiver), this.onRemoveQueueItemAt);
        this.onSeekTo = false;
        this.MediaSessionCompatToken = false;
    }

    public final _ensureOverride onSetShuffleMode() {
        return this.MediaBrowserCompatMediaItem;
    }

    protected final MediaFormat setSessionImpl() {
        return this.onRemoveQueueItemAt;
    }

    protected final _writeNullKeyedEntry onSetRepeatMode() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.findCollectionSerializer
    public void write(boolean z, boolean z2) throws addNull {
        this.write = new _at();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // kotlin.findCollectionSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(kotlin.C0170format[] r13, long r14, long r16, o.StdKeySerializers.write r18) throws kotlin.addNull {
        /*
            r12 = this;
            r0 = r12
            o.serializeFieldsUsing$AudioAttributesCompatParcelizer r1 = r0.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0
            long r1 = r1.write
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            o.serializeFieldsUsing$AudioAttributesCompatParcelizer r1 = new o.serializeFieldsUsing$AudioAttributesCompatParcelizer
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.write(r1)
            return
        L20:
            java.util.ArrayDeque<o.serializeFieldsUsing$AudioAttributesCompatParcelizer> r1 = r0.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.onSkipToPrevious
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.ParcelableVolumeInfo
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            o.serializeFieldsUsing$AudioAttributesCompatParcelizer r1 = new o.serializeFieldsUsing$AudioAttributesCompatParcelizer
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.write(r1)
            o.serializeFieldsUsing$AudioAttributesCompatParcelizer r1 = r0.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0
            long r1 = r1.write
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.onSetPlaybackSpeed()
        L54:
            return
        L55:
            java.util.ArrayDeque<o.serializeFieldsUsing$AudioAttributesCompatParcelizer> r1 = r0.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
            o.serializeFieldsUsing$AudioAttributesCompatParcelizer r9 = new o.serializeFieldsUsing$AudioAttributesCompatParcelizer
            long r3 = r0.onSkipToPrevious
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeFieldsUsing.read(o.format[], long, long, o.StdKeySerializers$write):void");
    }

    @Override // kotlin.findCollectionSerializer
    public void read(long j, boolean z) throws addNull {
        this.onSkipToQueueItem = false;
        this._init_lambda2 = false;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = false;
        if (this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer.write();
            this.MediaBrowserCompatItemReceiver.write();
            this.AudioAttributesImplBaseParcelizer = false;
            this.PlaybackStateCompatCustomAction.AudioAttributesCompatParcelizer();
        } else {
            onSetRating();
        }
        if (this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.AudioAttributesCompatParcelizer.read() > 0) {
            this.createFullyDrawnExecutor = true;
        }
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.clear();
    }

    @Override // kotlin.buildIndexedListSerializer
    public void read(float f, float f2) throws addNull {
        this.onSetPlaybackSpeed = f;
        this.ensureViewModelStore = f2;
        MediaBrowserCompatCustomActionResultReceiver(this.onCommand);
    }

    @Override // kotlin.findCollectionSerializer
    public void handleMediaPlayPauseIfPendingOnHandler() {
        this.onSetCaptioningEnabled = null;
        write(AudioAttributesCompatParcelizer.read);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.clear();
        createFullyDrawnExecutor();
    }

    @Override // kotlin.findCollectionSerializer
    public void onMediaButtonEvent() {
        try {
            r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
            MediaSessionCompatResultReceiverWrapper();
        } finally {
            RemoteActionCompatParcelizer((PropertySerializerMapDouble) null);
        }
    }

    private void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.AudioAttributesImplApi21Parcelizer.write();
        this.MediaBrowserCompatItemReceiver.write();
        this.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.PlaybackStateCompatCustomAction.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void MediaSessionCompatResultReceiverWrapper() {
        try {
            _ensureOverride _ensureoverride = this.MediaBrowserCompatMediaItem;
            if (_ensureoverride != null) {
                _ensureoverride.IconCompatParcelizer();
                this.write.read++;
                IconCompatParcelizer(((_writeNullKeyedEntry) buildTypeSerializer.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)).MediaBrowserCompatCustomActionResultReceiver);
            }
            this.MediaBrowserCompatMediaItem = null;
            try {
                MediaCrypto mediaCrypto = this.MediaSessionCompatQueueItem;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.MediaBrowserCompatMediaItem = null;
            try {
                MediaCrypto mediaCrypto2 = this.MediaSessionCompatQueueItem;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // kotlin.findCollectionSerializer, o.buildMapEntrySerializer.write
    public void AudioAttributesCompatParcelizer(int i, Object obj) throws addNull {
        if (i == 11) {
            this.addObserverForBackInvokerlambda7 = (buildIndexedListSerializer.IconCompatParcelizer) obj;
        } else {
            super.AudioAttributesCompatParcelizer(i, obj);
        }
    }

    @Override // kotlin.buildIndexedListSerializer
    public void IconCompatParcelizer(long j, long j2) throws addNull {
        boolean z = false;
        if (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = false;
            accessaddObserverForBackInvoker();
        }
        addNull addnull = this.accessgetReportFullyDrawnExecutorp;
        if (addnull != null) {
            this.accessgetReportFullyDrawnExecutorp = null;
            throw addnull;
        }
        try {
            if (this._init_lambda2) {
                onSetCaptioningEnabled();
                return;
            }
            if (this.onSetCaptioningEnabled != null || MediaBrowserCompatItemReceiver(2)) {
                ParcelableVolumeInfo();
                if (this.AudioAttributesImplApi26Parcelizer) {
                    StdSubtypeResolver.write("bypassRender");
                    while (RemoteActionCompatParcelizer(j, j2)) {
                    }
                    StdSubtypeResolver.RemoteActionCompatParcelizer();
                } else if (this.MediaBrowserCompatMediaItem != null) {
                    long jRemoteActionCompatParcelizer = z_().RemoteActionCompatParcelizer();
                    StdSubtypeResolver.write("drainAndFeed");
                    while (read(j, j2) && AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer)) {
                    }
                    while (_init_lambda3() && AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer)) {
                    }
                    StdSubtypeResolver.RemoteActionCompatParcelizer();
                } else {
                    this.write.AudioAttributesImplApi26Parcelizer += write(j);
                    MediaBrowserCompatItemReceiver(1);
                }
                this.write.AudioAttributesCompatParcelizer();
            }
        } catch (IllegalStateException e) {
            if (RemoteActionCompatParcelizer(e)) {
                IconCompatParcelizer((Exception) e);
                if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 && IconCompatParcelizer(e)) {
                    z = true;
                }
                if (z) {
                    MediaSessionCompatResultReceiverWrapper();
                }
                _hasNullKey _hasnullkeyRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(e, onSetRepeatMode());
                throw write(_hasnullkeyRemoteActionCompatParcelizer, this.onSetCaptioningEnabled, z, _hasnullkeyRemoteActionCompatParcelizer.write == 1101 ? 4006 : PlaybackException.ERROR_CODE_DECODING_FAILED);
            }
            throw e;
        }
    }

    protected final boolean onSetRating() throws addNull {
        boolean zCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        if (zCreateFullyDrawnExecutor) {
            ParcelableVolumeInfo();
        }
        return zCreateFullyDrawnExecutor;
    }

    private boolean createFullyDrawnExecutor() {
        if (this.MediaBrowserCompatMediaItem == null) {
            return false;
        }
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i == 3 || this.onPrepareFromSearch || ((this.onPlayFromSearch && !this.onCustomAction) || (this.onPlayFromMediaId && this.onPrepareFromUri))) {
            MediaSessionCompatResultReceiverWrapper();
            return true;
        }
        if (i == 2) {
            buildTypeSerializer.write(LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23) {
                try {
                    ensureViewModelStore();
                } catch (addNull e) {
                    prune.write("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    MediaSessionCompatResultReceiverWrapper();
                    return true;
                }
            }
        }
        _init_lambda2();
        return false;
    }

    private void _init_lambda2() {
        try {
            ((_ensureOverride) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem)).read();
        } finally {
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
    }

    public void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        _init_lambda4();
        accessonBackPresseds1027565324();
        this.handleMediaPlayPauseIfPendingOnHandler = C.TIME_UNSET;
        this.onPrepareFromUri = false;
        this.onRewind = false;
        this.onPlay = false;
        this.accessaddObserverForBackInvoker = false;
        this.onSkipToNext = false;
        this.setSessionImpl = false;
        this.onSkipToPrevious = C.TIME_UNSET;
        this.PlaybackStateCompat = C.TIME_UNSET;
        this.ParcelableVolumeInfo = C.TIME_UNSET;
        this.MediaMetadataCompat = 0;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.onRemoveQueueItem = this.onSetRating ? 1 : 0;
    }

    private void addObserverForBackInvoker() {
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        this.accessgetReportFullyDrawnExecutorp = null;
        this.read = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.onCommand = null;
        this.onRemoveQueueItemAt = null;
        this.onSeekTo = false;
        this.onCustomAction = false;
        this.onPlayFromUri = -1.0f;
        this.MediaDescriptionCompat = 0;
        this.onMediaButtonEvent = false;
        this.onPrepareFromSearch = false;
        this.onPlayFromSearch = false;
        this.onPlayFromMediaId = false;
        this.onFastForward = false;
        this.onPause = false;
        this.onPrepare = false;
        this.onPrepareFromMediaId = false;
        this.onSetRepeatMode = false;
        this.onSetRating = false;
        this.onRemoveQueueItem = 0;
    }

    protected _hasNullKey RemoteActionCompatParcelizer(Throwable th, _writeNullKeyedEntry _writenullkeyedentry) {
        return new _hasNullKey(th, _writenullkeyedentry);
    }

    private boolean MediaBrowserCompatItemReceiver(int i) throws addNull {
        ObjectNode objectNodeMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.write();
        int i2 = read(objectNodeMediaBrowserCompatCustomActionResultReceiver, this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, i | 4);
        if (i2 == -5) {
            write(objectNodeMediaBrowserCompatCustomActionResultReceiver);
            return true;
        }
        if (i2 != -4 || !this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.AudioAttributesCompatParcelizer()) {
            return false;
        }
        this.onSkipToQueueItem = true;
        accessaddObserverForBackInvoker();
        return false;
    }

    private boolean accessgetReportFullyDrawnExecutorp() throws addNull {
        buildTypeSerializer.write(this.MediaSessionCompatQueueItem == null);
        PropertySerializerMapDouble propertySerializerMapDouble = this.onAddQueueItem;
        handleMissingId handlemissingidAudioAttributesCompatParcelizer = propertySerializerMapDouble.AudioAttributesCompatParcelizer();
        if (StringCollectionSerializer.read && (handlemissingidAudioAttributesCompatParcelizer instanceof StringCollectionSerializer)) {
            int iIconCompatParcelizer = propertySerializerMapDouble.IconCompatParcelizer();
            if (iIconCompatParcelizer == 1) {
                PropertySerializerMapDouble.IconCompatParcelizer iconCompatParcelizer = (PropertySerializerMapDouble.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(propertySerializerMapDouble.write());
                throw write(iconCompatParcelizer, this.onSetCaptioningEnabled, iconCompatParcelizer.RemoteActionCompatParcelizer);
            }
            if (iIconCompatParcelizer != 4) {
                return false;
            }
        }
        if (handlemissingidAudioAttributesCompatParcelizer == null) {
            return propertySerializerMapDouble.write() != null;
        }
        if (handlemissingidAudioAttributesCompatParcelizer instanceof StringCollectionSerializer) {
            StringCollectionSerializer stringCollectionSerializer = (StringCollectionSerializer) handlemissingidAudioAttributesCompatParcelizer;
            try {
                this.MediaSessionCompatQueueItem = new MediaCrypto(stringCollectionSerializer.RemoteActionCompatParcelizer, stringCollectionSerializer.IconCompatParcelizer);
            } catch (MediaCryptoException e) {
                throw write(e, this.onSetCaptioningEnabled, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        return true;
    }

    private void RemoteActionCompatParcelizer(MediaCrypto mediaCrypto, boolean z) throws RemoteActionCompatParcelizer {
        C0170format c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(this.onSetCaptioningEnabled);
        if (this.read == null) {
            try {
                List<_writeNullKeyedEntry> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(z);
                ArrayDeque<_writeNullKeyedEntry> arrayDeque = new ArrayDeque<>();
                this.read = arrayDeque;
                if (this.onSetShuffleMode) {
                    arrayDeque.addAll(listAudioAttributesCompatParcelizer);
                } else if (!listAudioAttributesCompatParcelizer.isEmpty()) {
                    this.read.add(listAudioAttributesCompatParcelizer.get(0));
                }
                this.accessensureViewModelStore = null;
            } catch (serializeFilteredFields.write e) {
                throw new RemoteActionCompatParcelizer(c0170format, e, z, -49998);
            }
        }
        if (this.read.isEmpty()) {
            throw new RemoteActionCompatParcelizer(c0170format, (Throwable) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) buildTypeSerializer.IconCompatParcelizer(this.read);
        while (this.MediaBrowserCompatMediaItem == null) {
            _writeNullKeyedEntry _writenullkeyedentry = (_writeNullKeyedEntry) buildTypeSerializer.IconCompatParcelizer((_writeNullKeyedEntry) arrayDeque2.peekFirst());
            if (!write(_writenullkeyedentry)) {
                return;
            }
            try {
                RemoteActionCompatParcelizer(_writenullkeyedentry, mediaCrypto);
            } catch (Exception e2) {
                prune.write("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(_writenullkeyedentry)), e2);
                arrayDeque2.removeFirst();
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(c0170format, e2, z, _writenullkeyedentry);
                IconCompatParcelizer(remoteActionCompatParcelizer);
                if (this.accessensureViewModelStore != null) {
                    this.accessensureViewModelStore = this.accessensureViewModelStore.read(remoteActionCompatParcelizer);
                } else {
                    this.accessensureViewModelStore = remoteActionCompatParcelizer;
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.accessensureViewModelStore;
                }
            }
        }
        this.read = null;
    }

    private List<_writeNullKeyedEntry> AudioAttributesCompatParcelizer(boolean z) throws serializeFilteredFields.write {
        C0170format c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(this.onSetCaptioningEnabled);
        List<_writeNullKeyedEntry> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, c0170format, z);
        if (!listAudioAttributesCompatParcelizer.isEmpty() || !z) {
            return listAudioAttributesCompatParcelizer;
        }
        List<_writeNullKeyedEntry> listAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, c0170format, false);
        if (!listAudioAttributesCompatParcelizer2.isEmpty()) {
            StringBuilder sb = new StringBuilder("Drm session requires secure decoder for ");
            sb.append(c0170format.onPlayFromUri);
            sb.append(", but no secure decoder available. Trying to proceed with ");
            sb.append(listAudioAttributesCompatParcelizer2);
            sb.append(".");
            prune.RemoteActionCompatParcelizer("MediaCodecRenderer", sb.toString());
        }
        return listAudioAttributesCompatParcelizer2;
    }

    private void AudioAttributesImplBaseParcelizer(C0170format c0170format) {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        String str = c0170format.onPlayFromUri;
        if (!MimeTypes.AUDIO_AAC.equals(str) && !MimeTypes.AUDIO_MPEG.equals(str) && !MimeTypes.AUDIO_OPUS.equals(str)) {
            this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver(1);
        } else {
            this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver(32);
        }
        this.AudioAttributesImplApi26Parcelizer = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void RemoteActionCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, MediaCrypto mediaCrypto) throws Exception {
        C0170format c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(this.onSetCaptioningEnabled);
        String str = _writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver;
        float fWrite = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 23 ? -1.0f : write(this.ensureViewModelStore, MediaDescriptionCompat());
        float f = fWrite > this.AudioAttributesCompatParcelizer ? fWrite : -1.0f;
        write(c0170format);
        long jRemoteActionCompatParcelizer = z_().RemoteActionCompatParcelizer();
        _ensureOverride.write writeVarWrite = write(_writenullkeyedentry, c0170format, mediaCrypto, f);
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 31) {
            IconCompatParcelizer.AudioAttributesCompatParcelizer(writeVarWrite, AudioAttributesImplApi21Parcelizer());
        }
        try {
            StringBuilder sb = new StringBuilder("createCodec:");
            sb.append(str);
            StdSubtypeResolver.write(sb.toString());
            this.MediaBrowserCompatMediaItem = this.RatingCompat.IconCompatParcelizer(writeVarWrite);
            this.onSetRepeatMode = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 && read.write(this.MediaBrowserCompatMediaItem, new write(this, 0 == true ? 1 : 0));
            StdSubtypeResolver.RemoteActionCompatParcelizer();
            long jRemoteActionCompatParcelizer2 = z_().RemoteActionCompatParcelizer();
            if (!_writenullkeyedentry.write(c0170format)) {
                prune.RemoteActionCompatParcelizer("MediaCodecRenderer", LaissezFaireSubTypeValidator.read("Format exceeds selected codec's capabilities [%s, %s]", C0170format.IconCompatParcelizer(c0170format), str));
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = _writenullkeyedentry;
            this.onPlayFromUri = f;
            this.onCommand = c0170format;
            this.MediaDescriptionCompat = write(str);
            this.onMediaButtonEvent = RemoteActionCompatParcelizer(str, (C0170format) buildTypeSerializer.IconCompatParcelizer(this.onCommand));
            this.onPrepareFromSearch = MediaBrowserCompatCustomActionResultReceiver(str);
            this.onPlayFromSearch = MediaBrowserCompatItemReceiver(str);
            this.onPlayFromMediaId = RemoteActionCompatParcelizer(str);
            this.onFastForward = AudioAttributesCompatParcelizer(str);
            this.onPause = read(str);
            this.onPrepare = false;
            this.onPrepareFromMediaId = AudioAttributesCompatParcelizer(_writenullkeyedentry) || onSkipToQueueItem();
            if (RatingCompat() == 2) {
                this.handleMediaPlayPauseIfPendingOnHandler = z_().RemoteActionCompatParcelizer() + 1000;
            }
            this.write.RemoteActionCompatParcelizer++;
            AudioAttributesCompatParcelizer(str, jRemoteActionCompatParcelizer2, jRemoteActionCompatParcelizer2 - jRemoteActionCompatParcelizer);
        } catch (Throwable th) {
            StdSubtypeResolver.RemoteActionCompatParcelizer();
            throw th;
        }
    }

    private boolean AudioAttributesCompatParcelizer(long j) {
        return this._init_lambda4 == C.TIME_UNSET || z_().RemoteActionCompatParcelizer() - j < this._init_lambda4;
    }

    private boolean r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        return this._init_lambda3 >= 0;
    }

    private void _init_lambda4() {
        this.onStop = -1;
        this.RemoteActionCompatParcelizer.read = null;
    }

    private void accessonBackPresseds1027565324() {
        this._init_lambda3 = -1;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
    }

    private void RemoteActionCompatParcelizer(PropertySerializerMapDouble propertySerializerMapDouble) {
        PropertySerializerMapDouble.RemoteActionCompatParcelizer(this._init_lambda5, propertySerializerMapDouble);
        this._init_lambda5 = propertySerializerMapDouble;
    }

    private void AudioAttributesCompatParcelizer(PropertySerializerMapDouble propertySerializerMapDouble) {
        PropertySerializerMapDouble.RemoteActionCompatParcelizer(this.onAddQueueItem, propertySerializerMapDouble);
        this.onAddQueueItem = propertySerializerMapDouble;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [o.findCollectionSerializer, o.serializeFieldsUsing] */
    /* JADX WARN: Type inference failed for: r11v1, types: [o.serializeFieldsUsing] */
    /* JADX WARN: Type inference failed for: r11v3, types: [o._at] */
    private boolean _init_lambda3() throws addNull {
        _ensureOverride _ensureoverride = this.MediaBrowserCompatMediaItem;
        if (_ensureoverride == null || this.MediaMetadataCompat == 2 || this.onSkipToQueueItem) {
            return false;
        }
        _ensureOverride _ensureoverride2 = (_ensureOverride) buildTypeSerializer.IconCompatParcelizer(_ensureoverride);
        if (this.onStop < 0) {
            int iAudioAttributesCompatParcelizer = _ensureoverride2.AudioAttributesCompatParcelizer();
            this.onStop = iAudioAttributesCompatParcelizer;
            if (iAudioAttributesCompatParcelizer < 0) {
                return false;
            }
            this.RemoteActionCompatParcelizer.read = _ensureoverride2.IconCompatParcelizer(iAudioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer.write();
        }
        if (this.MediaMetadataCompat == 1) {
            if (!this.onPrepareFromMediaId) {
                this.onPrepareFromUri = true;
                _ensureoverride2.read(this.onStop, 0, 0L, 4);
                _init_lambda4();
            }
            this.MediaMetadataCompat = 2;
            return false;
        }
        if (this.onPlay) {
            this.onPlay = false;
            ByteBuffer byteBuffer = (ByteBuffer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.read);
            byte[] bArr = IconCompatParcelizer;
            byteBuffer.put(bArr);
            _ensureoverride2.read(this.onStop, bArr.length, 0L, 0);
            _init_lambda4();
            this.onRewind = true;
            return true;
        }
        if (this.onRemoveQueueItem == 1) {
            for (int i = 0; i < ((C0170format) buildTypeSerializer.IconCompatParcelizer(this.onCommand)).onAddQueueItem.size(); i++) {
                ((ByteBuffer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.read)).put(this.onCommand.onAddQueueItem.get(i));
            }
            this.onRemoveQueueItem = 2;
        }
        int iPosition = ((ByteBuffer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.read)).position();
        ObjectNode objectNodeMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        try {
            int i2 = read(objectNodeMediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer, 0);
            if (i2 == -3) {
                if (MediaMetadataCompat()) {
                    this.PlaybackStateCompat = this.onSkipToPrevious;
                }
                return false;
            }
            if (i2 == -5) {
                if (this.onRemoveQueueItem == 2) {
                    this.RemoteActionCompatParcelizer.write();
                    this.onRemoveQueueItem = 1;
                }
                write(objectNodeMediaBrowserCompatCustomActionResultReceiver);
                return true;
            }
            if (this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
                this.PlaybackStateCompat = this.onSkipToPrevious;
                if (this.onRemoveQueueItem == 2) {
                    this.RemoteActionCompatParcelizer.write();
                    this.onRemoveQueueItem = 1;
                }
                this.onSkipToQueueItem = true;
                if (!this.onRewind) {
                    accessaddObserverForBackInvoker();
                    return false;
                }
                try {
                    if (!this.onPrepareFromMediaId) {
                        this.onPrepareFromUri = true;
                        _ensureoverride2.read(this.onStop, 0, 0L, 4);
                        _init_lambda4();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw write(e, this.onSetCaptioningEnabled, LaissezFaireSubTypeValidator.IconCompatParcelizer(e.getErrorCode()));
                }
            }
            if (!this.onRewind && !this.RemoteActionCompatParcelizer.read()) {
                this.RemoteActionCompatParcelizer.write();
                if (this.onRemoveQueueItem == 2) {
                    this.onRemoveQueueItem = 1;
                }
                return true;
            }
            boolean zMediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            if (zMediaBrowserCompatCustomActionResultReceiver) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer.read(iPosition);
            }
            if (this.onMediaButtonEvent && !zMediaBrowserCompatCustomActionResultReceiver) {
                noTypeInfoBuilder.write((ByteBuffer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.read));
                if (((ByteBuffer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.read)).position() == 0) {
                    return true;
                }
                this.onMediaButtonEvent = false;
            }
            long j = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            if (this.createFullyDrawnExecutor) {
                if (!this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.isEmpty()) {
                    this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.peekLast().AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(j, (C0170format) buildTypeSerializer.IconCompatParcelizer(this.onSetCaptioningEnabled));
                } else {
                    this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(j, (C0170format) buildTypeSerializer.IconCompatParcelizer(this.onSetCaptioningEnabled));
                }
                this.createFullyDrawnExecutor = false;
            }
            this.onSkipToPrevious = Math.max(this.onSkipToPrevious, j);
            if (MediaMetadataCompat() || this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer()) {
                this.PlaybackStateCompat = this.onSkipToPrevious;
            }
            this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            if (this.RemoteActionCompatParcelizer.H_()) {
                AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
            write(this.RemoteActionCompatParcelizer);
            int iIconCompatParcelizer = IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            try {
                if (zMediaBrowserCompatCustomActionResultReceiver) {
                    ((_ensureOverride) buildTypeSerializer.IconCompatParcelizer(_ensureoverride2)).RemoteActionCompatParcelizer(this.onStop, this.RemoteActionCompatParcelizer.IconCompatParcelizer, j, iIconCompatParcelizer);
                } else {
                    ((_ensureOverride) buildTypeSerializer.IconCompatParcelizer(_ensureoverride2)).read(this.onStop, ((ByteBuffer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.read)).limit(), j, iIconCompatParcelizer);
                }
                _init_lambda4();
                this.onRewind = true;
                this.onRemoveQueueItem = 0;
                this = this.write;
                this.AudioAttributesImplBaseParcelizer++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw this.write(e2, this.onSetCaptioningEnabled, LaissezFaireSubTypeValidator.IconCompatParcelizer(e2.getErrorCode()));
            }
        } catch (_find.IconCompatParcelizer e3) {
            IconCompatParcelizer(e3);
            MediaBrowserCompatItemReceiver(0);
            _init_lambda2();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.findMapLikeSerializer write(kotlin.ObjectNode r12) throws kotlin.addNull {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeFieldsUsing.write(o.ObjectNode):o.findMapLikeSerializer");
    }

    protected final long onStop() {
        return this.PlaybackStateCompat;
    }

    public void IconCompatParcelizer(long j) {
        this.ParcelableVolumeInfo = j;
        while (!this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.isEmpty() && j >= this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.peek().IconCompatParcelizer) {
            write((AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.poll()));
            onSetPlaybackSpeed();
        }
    }

    protected findMapLikeSerializer RemoteActionCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format, C0170format c0170format2) {
        return new findMapLikeSerializer(_writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver, c0170format, c0170format2, 0, 1);
    }

    @Override // kotlin.buildIndexedListSerializer
    public boolean onRemoveQueueItemAt() {
        return this._init_lambda2;
    }

    @Override // kotlin.buildIndexedListSerializer
    public boolean onRemoveQueueItem() {
        if (this.onSetCaptioningEnabled == null) {
            return false;
        }
        if (onCommand() || r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0()) {
            return true;
        }
        return this.handleMediaPlayPauseIfPendingOnHandler != C.TIME_UNSET && z_().RemoteActionCompatParcelizer() < this.handleMediaPlayPauseIfPendingOnHandler;
    }

    protected final float MediaSessionCompatToken() {
        return this.onSetPlaybackSpeed;
    }

    public final buildIndexedListSerializer.IconCompatParcelizer PlaybackStateCompat() {
        return this.addObserverForBackInvokerlambda7;
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver(C0170format c0170format) throws addNull {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && this.MediaBrowserCompatMediaItem != null && this.MediaBrowserCompatSearchResultReceiver != 3 && RatingCompat() != 0) {
            float f = this.ensureViewModelStore;
            float fWrite = write(f, MediaDescriptionCompat());
            float f2 = this.onPlayFromUri;
            if (f2 == fWrite) {
                return true;
            }
            if (fWrite == -1.0f) {
                r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                return false;
            }
            if (f2 == -1.0f && fWrite <= this.AudioAttributesCompatParcelizer) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fWrite);
            ((_ensureOverride) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatMediaItem)).read(bundle);
            this.onPlayFromUri = fWrite;
        }
        return true;
    }

    private boolean ResultReceiver() {
        if (this.onRewind) {
            this.MediaMetadataCompat = 1;
            if (this.onPrepareFromSearch || this.onPlayFromMediaId) {
                this.MediaBrowserCompatSearchResultReceiver = 3;
                return false;
            }
            this.MediaBrowserCompatSearchResultReceiver = 1;
        }
        return true;
    }

    private boolean r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() throws addNull {
        if (this.onRewind) {
            this.MediaMetadataCompat = 1;
            if (this.onPrepareFromSearch || this.onPlayFromMediaId) {
                this.MediaBrowserCompatSearchResultReceiver = 3;
                return false;
            }
            this.MediaBrowserCompatSearchResultReceiver = 2;
        } else {
            ensureViewModelStore();
        }
        return true;
    }

    private void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() throws addNull {
        if (this.onRewind) {
            this.MediaMetadataCompat = 1;
            this.MediaBrowserCompatSearchResultReceiver = 3;
        } else {
            accessensureViewModelStore();
        }
    }

    private boolean read(long j, long j2) throws addNull {
        boolean z;
        boolean zWrite;
        int iWrite;
        _ensureOverride _ensureoverride = (_ensureOverride) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        if (!r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0()) {
            if (this.onFastForward && this.onPrepareFromUri) {
                try {
                    iWrite = _ensureoverride.write(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
                } catch (IllegalStateException unused) {
                    accessaddObserverForBackInvoker();
                    if (this._init_lambda2) {
                        MediaSessionCompatResultReceiverWrapper();
                    }
                    return false;
                }
            } else {
                iWrite = _ensureoverride.write(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
            }
            if (iWrite < 0) {
                if (iWrite == -2) {
                    _init_lambda5();
                    return true;
                }
                if (this.onPrepareFromMediaId && (this.onSkipToQueueItem || this.MediaMetadataCompat == 2)) {
                    accessaddObserverForBackInvoker();
                }
                return false;
            }
            if (this.accessaddObserverForBackInvoker) {
                this.accessaddObserverForBackInvoker = false;
                _ensureoverride.write(iWrite, false);
                return true;
            }
            if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.size == 0 && (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.flags & 4) != 0) {
                accessaddObserverForBackInvoker();
                return false;
            }
            this._init_lambda3 = iWrite;
            ByteBuffer byteBufferWrite = _ensureoverride.write(iWrite);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = byteBufferWrite;
            if (byteBufferWrite != null) {
                byteBufferWrite.position(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.offset);
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.limit(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.offset + this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.size);
            }
            if (this.onPause && this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.presentationTimeUs == 0 && (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.flags & 4) != 0 && this.onSkipToPrevious != C.TIME_UNSET) {
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.presentationTimeUs = this.PlaybackStateCompat;
            }
            this.onSkipToNext = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.presentationTimeUs < AudioAttributesImplApi26Parcelizer();
            long j3 = this.PlaybackStateCompat;
            this.setSessionImpl = j3 != C.TIME_UNSET && j3 <= this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.presentationTimeUs;
            read(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.presentationTimeUs);
        }
        if (this.onFastForward && this.onPrepareFromUri) {
            try {
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                zWrite = write(j, j2, _ensureoverride, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, this._init_lambda3, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.flags, 1, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.presentationTimeUs, this.onSkipToNext, this.setSessionImpl, (C0170format) buildTypeSerializer.IconCompatParcelizer(this.ResultReceiver));
            } catch (IllegalStateException unused3) {
                accessaddObserverForBackInvoker();
                if (this._init_lambda2) {
                    MediaSessionCompatResultReceiverWrapper();
                }
                return z;
            }
        } else {
            z = false;
            zWrite = write(j, j2, _ensureoverride, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, this._init_lambda3, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.flags, 1, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.presentationTimeUs, this.onSkipToNext, this.setSessionImpl, (C0170format) buildTypeSerializer.IconCompatParcelizer(this.ResultReceiver));
        }
        if (zWrite) {
            IconCompatParcelizer(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.presentationTimeUs);
            boolean z2 = (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.flags & 4) != 0 ? true : z;
            accessonBackPresseds1027565324();
            if (!z2) {
                return true;
            }
            accessaddObserverForBackInvoker();
        }
        return z;
    }

    private void _init_lambda5() {
        this.onCustomAction = true;
        MediaFormat mediaFormatRemoteActionCompatParcelizer = ((_ensureOverride) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatMediaItem)).RemoteActionCompatParcelizer();
        if (this.MediaDescriptionCompat != 0 && mediaFormatRemoteActionCompatParcelizer.getInteger("width") == 32 && mediaFormatRemoteActionCompatParcelizer.getInteger("height") == 32) {
            this.accessaddObserverForBackInvoker = true;
        } else {
            this.onRemoveQueueItemAt = mediaFormatRemoteActionCompatParcelizer;
            this.onSeekTo = true;
        }
    }

    private void accessaddObserverForBackInvoker() throws addNull {
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i == 1) {
            _init_lambda2();
            return;
        }
        if (i == 2) {
            _init_lambda2();
            ensureViewModelStore();
        } else if (i == 3) {
            accessensureViewModelStore();
        } else {
            this._init_lambda2 = true;
            onSetCaptioningEnabled();
        }
    }

    protected final void PlaybackStateCompatCustomAction() {
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = true;
    }

    protected final long onSkipToNext() {
        return this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.write;
    }

    protected final long onSkipToPrevious() {
        return this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.RemoteActionCompatParcelizer;
    }

    private void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = audioAttributesCompatParcelizer;
        if (audioAttributesCompatParcelizer.write != C.TIME_UNSET) {
            this.MediaSessionCompatToken = true;
            long j = audioAttributesCompatParcelizer.write;
        }
    }

    protected static boolean IconCompatParcelizer(C0170format c0170format) {
        return c0170format.MediaBrowserCompatCustomActionResultReceiver == 0 || c0170format.MediaBrowserCompatCustomActionResultReceiver == 2;
    }

    private static boolean IconCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format, PropertySerializerMapDouble propertySerializerMapDouble, PropertySerializerMapDouble propertySerializerMapDouble2) throws addNull {
        handleMissingId handlemissingidAudioAttributesCompatParcelizer;
        handleMissingId handlemissingidAudioAttributesCompatParcelizer2;
        if (propertySerializerMapDouble == propertySerializerMapDouble2) {
            return false;
        }
        if (propertySerializerMapDouble2 != null && propertySerializerMapDouble != null && (handlemissingidAudioAttributesCompatParcelizer = propertySerializerMapDouble2.AudioAttributesCompatParcelizer()) != null && (handlemissingidAudioAttributesCompatParcelizer2 = propertySerializerMapDouble.AudioAttributesCompatParcelizer()) != null && handlemissingidAudioAttributesCompatParcelizer.getClass().equals(handlemissingidAudioAttributesCompatParcelizer2.getClass())) {
            if (!(handlemissingidAudioAttributesCompatParcelizer instanceof StringCollectionSerializer)) {
                return false;
            }
            if (propertySerializerMapDouble2.read().equals(propertySerializerMapDouble.read()) && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && !JsonMapFormatVisitor.RemoteActionCompatParcelizer.equals(propertySerializerMapDouble.read()) && !JsonMapFormatVisitor.RemoteActionCompatParcelizer.equals(propertySerializerMapDouble2.read())) {
                return !_writenullkeyedentry.AudioAttributesImplApi26Parcelizer && propertySerializerMapDouble2.AudioAttributesCompatParcelizer((String) buildTypeSerializer.IconCompatParcelizer(c0170format.onPlayFromUri));
            }
        }
        return true;
    }

    private void accessensureViewModelStore() throws addNull {
        MediaSessionCompatResultReceiverWrapper();
        ParcelableVolumeInfo();
    }

    private void ensureViewModelStore() throws addNull {
        handleMissingId handlemissingidAudioAttributesCompatParcelizer = ((PropertySerializerMapDouble) buildTypeSerializer.IconCompatParcelizer(this._init_lambda5)).AudioAttributesCompatParcelizer();
        if (handlemissingidAudioAttributesCompatParcelizer instanceof StringCollectionSerializer) {
            try {
                ((MediaCrypto) buildTypeSerializer.IconCompatParcelizer(this.MediaSessionCompatQueueItem)).setMediaDrmSession(((StringCollectionSerializer) handlemissingidAudioAttributesCompatParcelizer).IconCompatParcelizer);
            } catch (MediaCryptoException e) {
                throw write(e, this.onSetCaptioningEnabled, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        AudioAttributesCompatParcelizer(this._init_lambda5);
        this.MediaMetadataCompat = 0;
        this.MediaBrowserCompatSearchResultReceiver = 0;
    }

    private boolean RemoteActionCompatParcelizer(long j, long j2) throws addNull {
        boolean z;
        buildTypeSerializer.write(!this._init_lambda2);
        if (!this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver()) {
            z = false;
        } else {
            if (!write(j, j2, null, this.AudioAttributesImplApi21Parcelizer.read, this._init_lambda3, 0, this.AudioAttributesImplApi21Parcelizer.MediaMetadataCompat(), this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver(), write(AudioAttributesImplApi26Parcelizer(), this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem()), this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), (C0170format) buildTypeSerializer.IconCompatParcelizer(this.ResultReceiver))) {
                return false;
            }
            IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem());
            this.AudioAttributesImplApi21Parcelizer.write();
            z = false;
        }
        if (this.onSkipToQueueItem) {
            this._init_lambda2 = true;
            return z;
        }
        if (this.AudioAttributesImplBaseParcelizer) {
            buildTypeSerializer.write(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver));
            this.AudioAttributesImplBaseParcelizer = z;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            if (this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver()) {
                return true;
            }
            r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            ParcelableVolumeInfo();
            if (!this.AudioAttributesImplApi26Parcelizer) {
                return z;
            }
        }
        onPrepareFromUri();
        if (this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver()) {
            this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
        }
        if (this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver() || this.onSkipToQueueItem || this.MediaBrowserCompatCustomActionResultReceiver) {
            return true;
        }
        return z;
    }

    private void onPrepareFromUri() throws addNull {
        buildTypeSerializer.write(!this.onSkipToQueueItem);
        ObjectNode objectNodeMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatItemReceiver.write();
        do {
            this.MediaBrowserCompatItemReceiver.write();
            int i = read(objectNodeMediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, 0);
            if (i == -5) {
                write(objectNodeMediaBrowserCompatCustomActionResultReceiver);
                return;
            }
            if (i == -4) {
                if (this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()) {
                    this.onSkipToQueueItem = true;
                    this.PlaybackStateCompat = this.onSkipToPrevious;
                    return;
                }
                this.onSkipToPrevious = Math.max(this.onSkipToPrevious, this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer);
                if (MediaMetadataCompat() || this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer()) {
                    this.PlaybackStateCompat = this.onSkipToPrevious;
                }
                if (this.createFullyDrawnExecutor) {
                    C0170format c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(this.onSetCaptioningEnabled);
                    this.ResultReceiver = c0170format;
                    if (Objects.equals(c0170format.onPlayFromUri, MimeTypes.AUDIO_OPUS) && !this.ResultReceiver.onAddQueueItem.isEmpty()) {
                        this.ResultReceiver = ((C0170format) buildTypeSerializer.IconCompatParcelizer(this.ResultReceiver)).write().MediaBrowserCompatCustomActionResultReceiver(isObjectOrPrimitive.read(this.ResultReceiver.onAddQueueItem.get(0))).IconCompatParcelizer();
                    }
                    AudioAttributesCompatParcelizer(this.ResultReceiver, (MediaFormat) null);
                    this.createFullyDrawnExecutor = false;
                }
                this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
                C0170format c0170format2 = this.ResultReceiver;
                if (c0170format2 != null && Objects.equals(c0170format2.onPlayFromUri, MimeTypes.AUDIO_OPUS)) {
                    if (this.MediaBrowserCompatItemReceiver.H_()) {
                        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer = this.ResultReceiver;
                        AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
                    }
                    if (isObjectOrPrimitive.write(AudioAttributesImplApi26Parcelizer(), this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer)) {
                        this.PlaybackStateCompatCustomAction.read(this.MediaBrowserCompatItemReceiver, ((C0170format) buildTypeSerializer.IconCompatParcelizer(this.ResultReceiver)).onAddQueueItem);
                    }
                }
                if (!r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()) {
                    break;
                }
            } else {
                if (i == -3) {
                    if (MediaMetadataCompat()) {
                        this.PlaybackStateCompat = this.onSkipToPrevious;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        } while (this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver));
        this.AudioAttributesImplBaseParcelizer = true;
    }

    private boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        if (!this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver()) {
            return true;
        }
        long jAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        return write(jAudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem()) == write(jAudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer);
    }

    private boolean write(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C0170format c0170format = this.ResultReceiver;
        return (c0170format != null && Objects.equals(c0170format.onPlayFromUri, MimeTypes.AUDIO_OPUS) && isObjectOrPrimitive.write(j, j2)) ? false : true;
    }

    private static boolean RemoteActionCompatParcelizer(IllegalStateException illegalStateException) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 && AudioAttributesCompatParcelizer(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean AudioAttributesCompatParcelizer(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean IconCompatParcelizer(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver(String str) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 19 && LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    private static int write(String str) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver.startsWith("SM-T585") || LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver.startsWith("SM-A510") || LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver.startsWith("SM-A520") || LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver.startsWith("SM-J700"))) {
            return 2;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) || "flounder_lte".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) || "grouper".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) || "tilapia".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer)) ? 1 : 0;
        }
        return 0;
    }

    private static boolean RemoteActionCompatParcelizer(String str, C0170format c0170format) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 && c0170format.onAddQueueItem.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean MediaBrowserCompatItemReceiver(String str) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 29 && "c2.android.aac.decoder".equals(str);
    }

    private static boolean AudioAttributesCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry) {
        String str = _writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(LaissezFaireSubTypeValidator.read) && "AFTS".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) && _writenullkeyedentry.AudioAttributesImplApi26Parcelizer;
        }
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(String str) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver != 19) {
            return false;
        }
        if ("hb2000".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) || "stvm8".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer)) {
            return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
        }
        return false;
    }

    private static boolean read(String str) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(LaissezFaireSubTypeValidator.read)) {
            return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("baffin") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("grand") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("fortuna") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("gprimelte") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("j2y18lte") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("ms01");
        }
        return false;
    }

    private static boolean AudioAttributesCompatParcelizer(String str) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 21 && "OMX.google.aac.decoder".equals(str);
    }

    static final class AudioAttributesCompatParcelizer {
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET);
        public final ClassNameIdResolver<C0170format> AudioAttributesCompatParcelizer = new ClassNameIdResolver<>();
        public final long IconCompatParcelizer;
        public final long RemoteActionCompatParcelizer;
        public final long write;

        public AudioAttributesCompatParcelizer(long j, long j2, long j3) {
            this.IconCompatParcelizer = j;
            this.RemoteActionCompatParcelizer = j2;
            this.write = j3;
        }
    }

    static final class read {
        public static boolean write(_ensureOverride _ensureoverride, write writeVar) {
            return _ensureoverride.IconCompatParcelizer(writeVar);
        }
    }

    static final class IconCompatParcelizer {
        public static void AudioAttributesCompatParcelizer(_ensureOverride.write writeVar, modifyArraySerializer modifyarrayserializer) {
            LogSessionId logSessionIdCJ_ = modifyarrayserializer.cJ_();
            if (logSessionIdCJ_.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            writeVar.IconCompatParcelizer.setString("log-session-id", logSessionIdCJ_.getStringId());
        }
    }

    final class write implements _ensureOverride.AudioAttributesCompatParcelizer {
        private write() {
        }

        /* synthetic */ write(serializeFieldsUsing serializefieldsusing, byte b) {
            this();
        }

        @Override // o._ensureOverride.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            if (serializeFieldsUsing.this.addObserverForBackInvokerlambda7 != null) {
                serializeFieldsUsing.this.addObserverForBackInvokerlambda7.AudioAttributesCompatParcelizer();
            }
        }

        @Override // o._ensureOverride.AudioAttributesCompatParcelizer
        public final void read() {
            if (serializeFieldsUsing.this.addObserverForBackInvokerlambda7 != null) {
                serializeFieldsUsing.this.addObserverForBackInvokerlambda7.AudioAttributesCompatParcelizer();
            }
        }
    }
}
