package kotlin;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import com.marrow.data.models.video.VideoPlaybackConfiguration;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Annotations;
import kotlin.ArrayBuilders1;
import kotlin._ensureOverride;
import kotlin.getArrayComparator;
import kotlin.getClassLoader;
import kotlin.serializeFilteredFields;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public class getAllInput extends serializeFieldsUsing implements getArrayComparator.AudioAttributesCompatParcelizer {
    private static boolean AudioAttributesCompatParcelizer;
    private static boolean IconCompatParcelizer;
    private static final int[] read = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private boolean AudioAttributesImplApi21Parcelizer;
    private AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final boolean MediaBrowserCompatMediaItem;
    private Surface MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private deserializeTypedFromObject MediaDescriptionCompat;
    private long MediaMetadataCompat;
    private final Context RatingCompat;
    read RemoteActionCompatParcelizer;
    private getRemainingInput handleMediaPlayPauseIfPendingOnHandler;
    private final Annotations.RemoteActionCompatParcelizer onAddQueueItem;
    private boolean onCommand;
    private int onCustomAction;
    private final boolean onFastForward;
    private PlaceholderSurface onMediaButtonEvent;
    private AsWrapperTypeSerializer onPause;
    private final int onPlay;
    private long onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private int onPlayFromUri;
    private deserializeTypedFromObject onPrepare;
    private int onPrepareFromMediaId;
    private long onPrepareFromSearch;
    private List<JsonValueFormat> onPrepareFromUri;
    private final getArrayComparator onRemoveQueueItem;
    private int onRemoveQueueItemAt;
    private final getArrayComparator.RemoteActionCompatParcelizer onRewind;
    private int onSeekTo;
    private final ArrayBuildersFloatBuilder onSetRating;
    private ArrayBuilders1 onSetRepeatMode;

    private static boolean IconCompatParcelizer(long j, boolean z) {
        return j < -30000 && !z;
    }

    private static boolean RemoteActionCompatParcelizer(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    private static boolean write(long j, boolean z) {
        return j < -500000 && !z;
    }

    public getAllInput(Context context, _ensureOverride.IconCompatParcelizer iconCompatParcelizer, serializeFilteredAnyProperties serializefilteredanyproperties, long j, boolean z, Handler handler, Annotations annotations) {
        this(context, iconCompatParcelizer, serializefilteredanyproperties, j, z, handler, annotations, 50);
    }

    private getAllInput(Context context, _ensureOverride.IconCompatParcelizer iconCompatParcelizer, serializeFilteredAnyProperties serializefilteredanyproperties, long j, boolean z, Handler handler, Annotations annotations, int i) {
        this(context, iconCompatParcelizer, serializefilteredanyproperties, j, z, handler, annotations, 50, 30.0f);
    }

    private getAllInput(Context context, _ensureOverride.IconCompatParcelizer iconCompatParcelizer, serializeFilteredAnyProperties serializefilteredanyproperties, long j, boolean z, Handler handler, Annotations annotations, int i, float f) {
        super(2, iconCompatParcelizer, serializefilteredanyproperties, z, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.RatingCompat = applicationContext;
        this.onPlay = i;
        this.onSetRating = null;
        this.onAddQueueItem = new Annotations.RemoteActionCompatParcelizer(handler, annotations);
        this.onFastForward = true;
        this.onRemoveQueueItem = new getArrayComparator(applicationContext, this, j);
        this.onRewind = new getArrayComparator.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatMediaItem = r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        this.onPause = AsWrapperTypeSerializer.read;
        this.onPrepareFromMediaId = 1;
        this.MediaDescriptionCompat = deserializeTypedFromObject.read;
        this.onRemoveQueueItemAt = 0;
        this.onPrepare = null;
        this.onPlayFromUri = -1000;
    }

    @Override // o.getArrayComparator.AudioAttributesCompatParcelizer
    public final boolean write(long j, long j2) {
        return RemoteActionCompatParcelizer(j, j2);
    }

    @Override // o.getArrayComparator.AudioAttributesCompatParcelizer
    public final boolean RemoteActionCompatParcelizer(long j, boolean z) {
        return IconCompatParcelizer(j, z);
    }

    @Override // o.getArrayComparator.AudioAttributesCompatParcelizer
    public final boolean RemoteActionCompatParcelizer(long j, long j2, boolean z, boolean z2) throws addNull {
        return write(j, z) && AudioAttributesCompatParcelizer(j2, z2);
    }

    @Override // kotlin.buildIndexedListSerializer, kotlin.buildIterableSerializer
    public final String onSeekTo() {
        return "MediaCodecVideoRenderer";
    }

    @Override // kotlin.serializeFieldsUsing
    public final int IconCompatParcelizer(serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format) throws serializeFilteredFields.write {
        boolean z;
        int i = 0;
        if (!DefaultBaseTypeLimitingValidator.MediaBrowserCompatItemReceiver(c0170format.onPlayFromUri)) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(0);
        }
        boolean z2 = c0170format.MediaBrowserCompatMediaItem != null;
        List<_writeNullKeyedEntry> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.RatingCompat, serializefilteredanyproperties, c0170format, z2, false);
        if (z2 && listRemoteActionCompatParcelizer.isEmpty()) {
            listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.RatingCompat, serializefilteredanyproperties, c0170format, false, false);
        }
        if (listRemoteActionCompatParcelizer.isEmpty()) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(1);
        }
        if (!IconCompatParcelizer(c0170format)) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(2);
        }
        _writeNullKeyedEntry _writenullkeyedentry = listRemoteActionCompatParcelizer.get(0);
        boolean zWrite = _writenullkeyedentry.write(c0170format);
        if (zWrite) {
            z = true;
        } else {
            for (int i2 = 1; i2 < listRemoteActionCompatParcelizer.size(); i2++) {
                _writeNullKeyedEntry _writenullkeyedentry2 = listRemoteActionCompatParcelizer.get(i2);
                if (_writenullkeyedentry2.write(c0170format)) {
                    z = false;
                    zWrite = true;
                    _writenullkeyedentry = _writenullkeyedentry2;
                    break;
                }
            }
            z = true;
        }
        int i3 = zWrite ? 4 : 3;
        int i4 = _writenullkeyedentry.RemoteActionCompatParcelizer(c0170format) ? 16 : 8;
        int i5 = _writenullkeyedentry.IconCompatParcelizer ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(c0170format.onPlayFromUri) && !RemoteActionCompatParcelizer.read(this.RatingCompat)) {
            i6 = 256;
        }
        if (zWrite) {
            List<_writeNullKeyedEntry> listRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.RatingCompat, serializefilteredanyproperties, c0170format, z2, true);
            if (!listRemoteActionCompatParcelizer2.isEmpty()) {
                _writeNullKeyedEntry _writenullkeyedentry3 = serializeFilteredFields.read(listRemoteActionCompatParcelizer2, c0170format).get(0);
                if (_writenullkeyedentry3.write(c0170format) && _writenullkeyedentry3.RemoteActionCompatParcelizer(c0170format)) {
                    i = 32;
                }
            }
        }
        return buildIterableSerializer.IconCompatParcelizer(i3, i4, i, i5, i6);
    }

    @Override // kotlin.serializeFieldsUsing
    public final List<_writeNullKeyedEntry> AudioAttributesCompatParcelizer(serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format, boolean z) throws serializeFilteredFields.write {
        return serializeFilteredFields.read(RemoteActionCompatParcelizer(this.RatingCompat, serializefilteredanyproperties, c0170format, z, this.onPlayFromSearch), c0170format);
    }

    private static List<_writeNullKeyedEntry> RemoteActionCompatParcelizer(Context context, serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format, boolean z, boolean z2) throws serializeFilteredFields.write {
        if (c0170format.onPlayFromUri == null) {
            return initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(c0170format.onPlayFromUri) && !RemoteActionCompatParcelizer.read(context)) {
            List<_writeNullKeyedEntry> listIconCompatParcelizer = serializeFilteredFields.IconCompatParcelizer(serializefilteredanyproperties, c0170format, z, z2);
            if (!listIconCompatParcelizer.isEmpty()) {
                return listIconCompatParcelizer;
            }
        }
        return serializeFilteredFields.write(serializefilteredanyproperties, c0170format, z, z2);
    }

    static final class RemoteActionCompatParcelizer {
        public static boolean read(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void write(boolean z, boolean z2) throws addNull {
        super.write(z, z2);
        boolean z3 = A_().RemoteActionCompatParcelizer;
        buildTypeSerializer.write((z3 && this.onRemoveQueueItemAt == 0) ? false : true);
        if (this.onPlayFromSearch != z3) {
            this.onPlayFromSearch = z3;
            MediaSessionCompatResultReceiverWrapper();
        }
        this.onAddQueueItem.read(((serializeFieldsUsing) this).write);
        if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            if ((this.onPrepareFromUri != null || !this.onFastForward) && this.onSetRepeatMode == null) {
                ArrayBuildersFloatBuilder arrayBuildersFloatBuilder = this.onSetRating;
                if (arrayBuildersFloatBuilder == null) {
                    arrayBuildersFloatBuilder = new getClassLoader.read(this.RatingCompat, this.onRemoveQueueItem).AudioAttributesCompatParcelizer(z_()).read();
                }
                this.onSetRepeatMode = arrayBuildersFloatBuilder.write();
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        }
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.write(new ArrayBuilders1.IconCompatParcelizer() { // from class: o.getAllInput.5
                @Override // o.ArrayBuilders1.IconCompatParcelizer
                public final void RemoteActionCompatParcelizer() {
                    buildTypeSerializer.AudioAttributesCompatParcelizer(getAllInput.this.MediaBrowserCompatSearchResultReceiver);
                    getAllInput.this._init_lambda5();
                }

                @Override // o.ArrayBuilders1.IconCompatParcelizer
                public final void AudioAttributesCompatParcelizer() {
                    getAllInput.this.RemoteActionCompatParcelizer(0, 1);
                }
            }, buildPsshAtom.IconCompatParcelizer());
            getRemainingInput getremaininginput = this.handleMediaPlayPauseIfPendingOnHandler;
            if (getremaininginput != null) {
                this.onSetRepeatMode.read(getremaininginput);
            }
            if (this.MediaBrowserCompatSearchResultReceiver != null && !this.onPause.equals(AsWrapperTypeSerializer.read)) {
                this.onSetRepeatMode.read(this.MediaBrowserCompatSearchResultReceiver, this.onPause);
            }
            this.onSetRepeatMode.RemoteActionCompatParcelizer(MediaSessionCompatToken());
            List<JsonValueFormat> list = this.onPrepareFromUri;
            if (list != null) {
                this.onSetRepeatMode.AudioAttributesCompatParcelizer(list);
            }
            this.onSetRepeatMode.AudioAttributesCompatParcelizer(z2);
            return;
        }
        this.onRemoveQueueItem.RemoteActionCompatParcelizer(z_());
        this.onRemoveQueueItem.AudioAttributesCompatParcelizer(z2);
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void onRewind() {
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.AudioAttributesCompatParcelizer();
        } else {
            this.onRemoveQueueItem.write();
        }
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void read(long j, boolean z) throws addNull {
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.RemoteActionCompatParcelizer(true);
            this.onSetRepeatMode.RemoteActionCompatParcelizer(onSkipToNext(), 0L);
        }
        super.read(j, z);
        if (this.onSetRepeatMode == null) {
            this.onRemoveQueueItem.MediaBrowserCompatItemReceiver();
        }
        if (z) {
            this.onRemoveQueueItem.write(false);
        }
        _init_lambda3();
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItemAt() {
        if (!super.onRemoveQueueItemAt()) {
            return false;
        }
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        return arrayBuilders1 == null || arrayBuilders1.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItem() {
        PlaceholderSurface placeholderSurface;
        ArrayBuilders1 arrayBuilders1;
        boolean z = super.onRemoveQueueItem() && ((arrayBuilders1 = this.onSetRepeatMode) == null || arrayBuilders1.MediaBrowserCompatItemReceiver());
        if (z && (((placeholderSurface = this.onMediaButtonEvent) != null && this.MediaBrowserCompatSearchResultReceiver == placeholderSurface) || onSetShuffleMode() == null || this.onPlayFromSearch)) {
            return true;
        }
        return this.onRemoveQueueItem.read(z);
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void onPause() {
        super.onPause();
        this.onCustomAction = 0;
        this.MediaMetadataCompat = z_().RemoteActionCompatParcelizer();
        this.onPrepareFromSearch = 0L;
        this.onSeekTo = 0;
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.MediaDescriptionCompat();
        } else {
            this.onRemoveQueueItem.AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void onFastForward() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.RatingCompat();
        } else {
            this.onRemoveQueueItem.AudioAttributesImplApi26Parcelizer();
        }
        super.onFastForward();
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        this.onPrepare = null;
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.AudioAttributesImplApi26Parcelizer();
        } else {
            this.onRemoveQueueItem.RemoteActionCompatParcelizer();
        }
        _init_lambda3();
        this.onCommand = false;
        this.RemoteActionCompatParcelizer = null;
        try {
            super.handleMediaPlayPauseIfPendingOnHandler();
        } finally {
            this.onAddQueueItem.AudioAttributesCompatParcelizer(((serializeFieldsUsing) this).write);
            this.onAddQueueItem.read(deserializeTypedFromObject.read);
        }
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void onMediaButtonEvent() {
        try {
            super.onMediaButtonEvent();
        } finally {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
            if (this.onMediaButtonEvent != null) {
                accessensureViewModelStore();
            }
        }
    }

    @Override // kotlin.findCollectionSerializer
    public final void onCustomAction() {
        super.onCustomAction();
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 == null || !this.onFastForward) {
            return;
        }
        arrayBuilders1.MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer, o.buildMapEntrySerializer.write
    public final void AudioAttributesCompatParcelizer(int i, Object obj) throws addNull {
        if (i == 1) {
            write(obj);
            return;
        }
        if (i == 7) {
            getRemainingInput getremaininginput = (getRemainingInput) buildTypeSerializer.IconCompatParcelizer(obj);
            this.handleMediaPlayPauseIfPendingOnHandler = getremaininginput;
            ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
            if (arrayBuilders1 != null) {
                arrayBuilders1.read(getremaininginput);
                return;
            }
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) buildTypeSerializer.IconCompatParcelizer(obj)).intValue();
            if (this.onRemoveQueueItemAt != iIntValue) {
                this.onRemoveQueueItemAt = iIntValue;
                if (this.onPlayFromSearch) {
                    MediaSessionCompatResultReceiverWrapper();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            this.onPlayFromUri = ((Integer) buildTypeSerializer.IconCompatParcelizer(obj)).intValue();
            _init_lambda4();
            return;
        }
        if (i == 4) {
            this.onPrepareFromMediaId = ((Integer) buildTypeSerializer.IconCompatParcelizer(obj)).intValue();
            _ensureOverride _ensureoverrideOnSetShuffleMode = onSetShuffleMode();
            if (_ensureoverrideOnSetShuffleMode != null) {
                _ensureoverrideOnSetShuffleMode.AudioAttributesCompatParcelizer(this.onPrepareFromMediaId);
                return;
            }
            return;
        }
        if (i == 5) {
            this.onRemoveQueueItem.write(((Integer) buildTypeSerializer.IconCompatParcelizer(obj)).intValue());
            return;
        }
        if (i == 13) {
            read((List<JsonValueFormat>) buildTypeSerializer.IconCompatParcelizer(obj));
            return;
        }
        if (i == 14) {
            AsWrapperTypeSerializer asWrapperTypeSerializer = (AsWrapperTypeSerializer) buildTypeSerializer.IconCompatParcelizer(obj);
            if (asWrapperTypeSerializer.RemoteActionCompatParcelizer() == 0 || asWrapperTypeSerializer.IconCompatParcelizer() == 0) {
                return;
            }
            this.onPause = asWrapperTypeSerializer;
            ArrayBuilders1 arrayBuilders12 = this.onSetRepeatMode;
            if (arrayBuilders12 != null) {
                arrayBuilders12.read((Surface) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver), asWrapperTypeSerializer);
                return;
            }
            return;
        }
        super.AudioAttributesCompatParcelizer(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.getArrayComparator] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.media3.exoplayer.video.PlaceholderSurface] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void write(Object obj) throws addNull {
        ?? Write = obj instanceof Surface ? (Surface) obj : 0;
        if (Write == 0) {
            PlaceholderSurface placeholderSurface = this.onMediaButtonEvent;
            if (placeholderSurface == null) {
                _writeNullKeyedEntry _writenullkeyedentryOnSetRepeatMode = onSetRepeatMode();
                if (_writenullkeyedentryOnSetRepeatMode != null && IconCompatParcelizer(_writenullkeyedentryOnSetRepeatMode)) {
                    Write = PlaceholderSurface.write(this.RatingCompat, _writenullkeyedentryOnSetRepeatMode.AudioAttributesImplApi26Parcelizer);
                    this.onMediaButtonEvent = Write;
                }
            } else {
                Write = placeholderSurface;
            }
        }
        if (this.MediaBrowserCompatSearchResultReceiver != Write) {
            this.MediaBrowserCompatSearchResultReceiver = Write;
            if (this.onSetRepeatMode == null) {
                this.onRemoveQueueItem.AudioAttributesCompatParcelizer(Write);
            }
            this.onCommand = false;
            int iRatingCompat = RatingCompat();
            _ensureOverride _ensureoverrideOnSetShuffleMode = onSetShuffleMode();
            if (_ensureoverrideOnSetShuffleMode != null && this.onSetRepeatMode == null) {
                if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && Write != 0 && !this.MediaBrowserCompatItemReceiver) {
                    IconCompatParcelizer(_ensureoverrideOnSetShuffleMode, (Surface) Write);
                } else {
                    MediaSessionCompatResultReceiverWrapper();
                    ParcelableVolumeInfo();
                }
            }
            if (Write != 0 && Write != this.onMediaButtonEvent) {
                r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
                if (iRatingCompat == 2) {
                    this.onRemoveQueueItem.write(true);
                }
            } else {
                this.onPrepare = null;
                ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
                if (arrayBuilders1 != null) {
                    arrayBuilders1.RemoteActionCompatParcelizer();
                }
            }
            _init_lambda3();
            return;
        }
        if (Write == 0 || Write == this.onMediaButtonEvent) {
            return;
        }
        r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
        _init_lambda2();
    }

    @Override // kotlin.serializeFieldsUsing
    public final boolean write(_writeNullKeyedEntry _writenullkeyedentry) {
        return this.MediaBrowserCompatSearchResultReceiver != null || IconCompatParcelizer(_writenullkeyedentry);
    }

    @Override // kotlin.serializeFieldsUsing
    public final boolean onSkipToQueueItem() {
        return this.onPlayFromSearch && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 23;
    }

    @Override // kotlin.serializeFieldsUsing
    public final _ensureOverride.write write(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format, MediaCrypto mediaCrypto, float f) {
        PlaceholderSurface placeholderSurface = this.onMediaButtonEvent;
        if (placeholderSurface != null && placeholderSurface.AudioAttributesCompatParcelizer != _writenullkeyedentry.AudioAttributesImplApi26Parcelizer) {
            accessensureViewModelStore();
        }
        String str = _writenullkeyedentry.read;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = read(_writenullkeyedentry, c0170format, MediaDescriptionCompat());
        this.AudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer;
        MediaFormat mediaFormatRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(c0170format, str, audioAttributesCompatParcelizer, f, this.MediaBrowserCompatMediaItem, this.onPlayFromSearch ? this.onRemoveQueueItemAt : 0);
        if (this.MediaBrowserCompatSearchResultReceiver == null) {
            if (!IconCompatParcelizer(_writenullkeyedentry)) {
                throw new IllegalStateException();
            }
            if (this.onMediaButtonEvent == null) {
                this.onMediaButtonEvent = PlaceholderSurface.write(this.RatingCompat, _writenullkeyedentry.AudioAttributesImplApi26Parcelizer);
            }
            this.MediaBrowserCompatSearchResultReceiver = this.onMediaButtonEvent;
        }
        read(mediaFormatRemoteActionCompatParcelizer);
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        return _ensureOverride.write.AudioAttributesCompatParcelizer(_writenullkeyedentry, mediaFormatRemoteActionCompatParcelizer, c0170format, arrayBuilders1 != null ? arrayBuilders1.write() : this.MediaBrowserCompatSearchResultReceiver, mediaCrypto);
    }

    private void read(MediaFormat mediaFormat) {
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 == null || arrayBuilders1.MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    @Override // kotlin.serializeFieldsUsing
    public final findMapLikeSerializer RemoteActionCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format, C0170format c0170format2) {
        findMapLikeSerializer findmaplikeserializerAudioAttributesCompatParcelizer = _writenullkeyedentry.AudioAttributesCompatParcelizer(c0170format, c0170format2);
        int i = findmaplikeserializerAudioAttributesCompatParcelizer.IconCompatParcelizer;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        if (c0170format2.onSetCaptioningEnabled > audioAttributesCompatParcelizer.write || c0170format2.MediaMetadataCompat > audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) {
            i |= 256;
        }
        if (read(_writenullkeyedentry, c0170format2) > audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
            i |= 64;
        }
        int i2 = i;
        return new findMapLikeSerializer(_writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver, c0170format, c0170format2, i2 != 0 ? 0 : findmaplikeserializerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, i2);
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.buildIndexedListSerializer
    public final void IconCompatParcelizer(long j, long j2) throws addNull {
        super.IconCompatParcelizer(j, j2);
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            try {
                arrayBuilders1.write(j, j2);
            } catch (ArrayBuilders1.read e) {
                throw write(e, e.RemoteActionCompatParcelizer, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        }
    }

    @Override // kotlin.serializeFieldsUsing
    public final void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        super.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.buildIndexedListSerializer
    public final void read(float f, float f2) throws addNull {
        super.read(f, f2);
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.RemoteActionCompatParcelizer(f);
        } else {
            this.onRemoveQueueItem.write(f);
        }
    }

    private static int write(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format) {
        int iIntValue;
        int i = c0170format.onSetCaptioningEnabled;
        int i2 = c0170format.MediaMetadataCompat;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = (String) buildTypeSerializer.IconCompatParcelizer(c0170format.onPlayFromUri);
        byte b = 1;
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
            Pair<Integer, Integer> pairWrite = serializeFilteredFields.write(c0170format);
            str = (pairWrite == null || !((iIntValue = ((Integer) pairWrite.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? MimeTypes.VIDEO_H265 : MimeTypes.VIDEO_H264;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1664118616:
                b = !str.equals(MimeTypes.VIDEO_H263) ? (byte) -1 : (byte) 0;
                break;
            case -1662735862:
                if (!str.equals(MimeTypes.VIDEO_AV1)) {
                    b = -1;
                }
                break;
            case -1662541442:
                b = !str.equals(MimeTypes.VIDEO_H265) ? (byte) -1 : (byte) 2;
                break;
            case 1187890754:
                b = !str.equals(MimeTypes.VIDEO_MP4V) ? (byte) -1 : (byte) 3;
                break;
            case 1331836730:
                b = !str.equals(MimeTypes.VIDEO_H264) ? (byte) -1 : (byte) 4;
                break;
            case 1599127256:
                b = !str.equals(MimeTypes.VIDEO_VP8) ? (byte) -1 : (byte) 5;
                break;
            case 1599127257:
                b = !str.equals(MimeTypes.VIDEO_VP9) ? (byte) -1 : (byte) 6;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 3:
            case 5:
                return write(i * i2, 2);
            case 2:
                return Math.max(2097152, write(i * i2, 2));
            case 4:
                if ("BRAVIA 4K 2015".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) || ("Amazon".equals(LaissezFaireSubTypeValidator.read) && ("KFSOWI".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) || ("AFTS".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) && _writenullkeyedentry.AudioAttributesImplApi26Parcelizer)))) {
                    return -1;
                }
                return write((LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i, 16) * LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i2, 16)) << 8, 2);
            case 6:
                return write(i * i2, 4);
            default:
                return -1;
        }
    }

    @Override // kotlin.serializeFieldsUsing
    public final float write(float f, C0170format[] c0170formatArr) {
        float fMax = -1.0f;
        for (C0170format c0170format : c0170formatArr) {
            float f2 = c0170format.RatingCompat;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // kotlin.serializeFieldsUsing
    public final void write(C0170format c0170format) throws addNull {
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 == null || arrayBuilders1.AudioAttributesImplApi21Parcelizer()) {
            return;
        }
        try {
            this.onSetRepeatMode.AudioAttributesCompatParcelizer(c0170format);
        } catch (ArrayBuilders1.read e) {
            throw write(e, c0170format, 7000);
        }
    }

    private void read(List<JsonValueFormat> list) {
        this.onPrepareFromUri = list;
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.AudioAttributesCompatParcelizer(list);
        }
    }

    @Override // kotlin.serializeFieldsUsing
    public final void AudioAttributesCompatParcelizer(String str, long j, long j2) {
        this.onAddQueueItem.read(str, j, j2);
        this.MediaBrowserCompatItemReceiver = write(str);
        this.AudioAttributesImplApi21Parcelizer = ((_writeNullKeyedEntry) buildTypeSerializer.IconCompatParcelizer(onSetRepeatMode())).write();
        _init_lambda3();
    }

    @Override // kotlin.serializeFieldsUsing
    public final void IconCompatParcelizer(String str) {
        this.onAddQueueItem.RemoteActionCompatParcelizer(str);
    }

    @Override // kotlin.serializeFieldsUsing
    public final void IconCompatParcelizer(Exception exc) {
        prune.read("MediaCodecVideoRenderer", "Video codec error", exc);
        this.onAddQueueItem.RemoteActionCompatParcelizer(exc);
    }

    @Override // kotlin.serializeFieldsUsing
    public final findMapLikeSerializer write(ObjectNode objectNode) throws addNull {
        findMapLikeSerializer findmaplikeserializerWrite = super.write(objectNode);
        this.onAddQueueItem.IconCompatParcelizer((C0170format) buildTypeSerializer.IconCompatParcelizer(objectNode.write), findmaplikeserializerWrite);
        return findmaplikeserializerWrite;
    }

    @Override // kotlin.serializeFieldsUsing
    public final void write(_find _findVar) throws addNull {
        if (!this.onPlayFromSearch) {
            this.AudioAttributesImplBaseParcelizer++;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 || !this.onPlayFromSearch) {
            return;
        }
        AudioAttributesCompatParcelizer(_findVar.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.serializeFieldsUsing
    public final int IconCompatParcelizer(_find _findVar) {
        return (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 34 || !this.onPlayFromSearch || _findVar.RemoteActionCompatParcelizer >= AudioAttributesImplApi26Parcelizer()) ? 0 : 32;
    }

    @Override // kotlin.serializeFieldsUsing
    public final void AudioAttributesCompatParcelizer(C0170format c0170format, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        int i2;
        _ensureOverride _ensureoverrideOnSetShuffleMode = onSetShuffleMode();
        if (_ensureoverrideOnSetShuffleMode != null) {
            _ensureoverrideOnSetShuffleMode.AudioAttributesCompatParcelizer(this.onPrepareFromMediaId);
        }
        int i3 = 0;
        if (this.onPlayFromSearch) {
            i2 = c0170format.onSetCaptioningEnabled;
            i = c0170format.MediaMetadataCompat;
        } else {
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i4 = integer;
            i = integer2;
            i2 = i4;
        }
        float f = c0170format.onPrepareFromSearch;
        if (onPrepareFromUri()) {
            if (c0170format.onPlayFromSearch == 90 || c0170format.onPlayFromSearch == 270) {
                f = 1.0f / f;
                int i5 = i;
                i = i2;
                i2 = i5;
            }
        } else if (this.onSetRepeatMode == null) {
            i3 = c0170format.onPlayFromSearch;
        }
        this.MediaDescriptionCompat = new deserializeTypedFromObject(i2, i, i3, f);
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.IconCompatParcelizer(c0170format.write().onFastForward(i2).MediaBrowserCompatItemReceiver(i).MediaBrowserCompatMediaItem(i3).write(f).IconCompatParcelizer());
        } else {
            this.onRemoveQueueItem.RemoteActionCompatParcelizer(c0170format.RatingCompat);
        }
    }

    @Override // kotlin.serializeFieldsUsing
    public final void AudioAttributesCompatParcelizer(_find _findVar) throws addNull {
        if (this.AudioAttributesImplApi21Parcelizer) {
            ByteBuffer byteBuffer = (ByteBuffer) buildTypeSerializer.IconCompatParcelizer(_findVar.write);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        IconCompatParcelizer((_ensureOverride) buildTypeSerializer.IconCompatParcelizer(onSetShuffleMode()), bArr);
                    }
                }
            }
        }
    }

    @Override // kotlin.serializeFieldsUsing
    public final boolean write(long j, long j2, _ensureOverride _ensureoverride, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0170format c0170format) throws addNull {
        long jOnSkipToNext = j3 - onSkipToNext();
        int i4 = this.onRemoveQueueItem.read(j3, j, j2, onSkipToPrevious(), z2, this.onRewind);
        if (i4 == 4) {
            return false;
        }
        if (z && !z2) {
            read(_ensureoverride, i);
            return true;
        }
        if (this.MediaBrowserCompatSearchResultReceiver == this.onMediaButtonEvent && this.onSetRepeatMode == null) {
            if (this.onRewind.AudioAttributesCompatParcelizer() >= 30000) {
                return false;
            }
            read(_ensureoverride, i);
            AudioAttributesImplApi21Parcelizer(this.onRewind.AudioAttributesCompatParcelizer());
            return true;
        }
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            try {
                arrayBuilders1.write(j, j2);
                long jRemoteActionCompatParcelizer = this.onSetRepeatMode.RemoteActionCompatParcelizer(j3, z2);
                if (jRemoteActionCompatParcelizer == C.TIME_UNSET) {
                    return false;
                }
                read(_ensureoverride, i, jRemoteActionCompatParcelizer);
                return true;
            } catch (ArrayBuilders1.read e) {
                throw write(e, e.RemoteActionCompatParcelizer, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        }
        if (i4 == 0) {
            long j4 = z_().read();
            write(jOnSkipToNext, j4, c0170format);
            read(_ensureoverride, i, j4);
            AudioAttributesImplApi21Parcelizer(this.onRewind.AudioAttributesCompatParcelizer());
            return true;
        }
        if (i4 == 1) {
            return write((_ensureOverride) buildTypeSerializer.AudioAttributesCompatParcelizer(_ensureoverride), i, jOnSkipToNext, c0170format);
        }
        if (i4 == 2) {
            write(_ensureoverride, i);
            AudioAttributesImplApi21Parcelizer(this.onRewind.AudioAttributesCompatParcelizer());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(i4));
        }
        read(_ensureoverride, i);
        AudioAttributesImplApi21Parcelizer(this.onRewind.AudioAttributesCompatParcelizer());
        return true;
    }

    private boolean write(_ensureOverride _ensureoverride, int i, long j, C0170format c0170format) {
        long jIconCompatParcelizer = this.onRewind.IconCompatParcelizer();
        long jAudioAttributesCompatParcelizer = this.onRewind.AudioAttributesCompatParcelizer();
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
            if (jIconCompatParcelizer == this.onPlayFromMediaId) {
                read(_ensureoverride, i);
            } else {
                write(j, jIconCompatParcelizer, c0170format);
                RemoteActionCompatParcelizer(_ensureoverride, i, jIconCompatParcelizer);
            }
            AudioAttributesImplApi21Parcelizer(jAudioAttributesCompatParcelizer);
            this.onPlayFromMediaId = jIconCompatParcelizer;
            return true;
        }
        if (jAudioAttributesCompatParcelizer >= 30000) {
            return false;
        }
        if (jAudioAttributesCompatParcelizer > 11000) {
            try {
                Thread.sleep((jAudioAttributesCompatParcelizer - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        write(j, jIconCompatParcelizer, c0170format);
        AudioAttributesCompatParcelizer(_ensureoverride, i);
        AudioAttributesImplApi21Parcelizer(jAudioAttributesCompatParcelizer);
        return true;
    }

    private void write(long j, long j2, C0170format c0170format) {
        getRemainingInput getremaininginput = this.handleMediaPlayPauseIfPendingOnHandler;
        if (getremaininginput != null) {
            getremaininginput.RemoteActionCompatParcelizer(j, j2, c0170format, setSessionImpl());
        }
    }

    protected final void AudioAttributesCompatParcelizer(long j) throws addNull {
        read(j);
        RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
        ((serializeFieldsUsing) this).write.AudioAttributesImplApi21Parcelizer++;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        IconCompatParcelizer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void accessgetReportFullyDrawnExecutorp() {
        PlaybackStateCompatCustomAction();
    }

    @Override // kotlin.serializeFieldsUsing
    public final void IconCompatParcelizer(long j) {
        super.IconCompatParcelizer(j);
        if (this.onPlayFromSearch) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer--;
    }

    @Override // kotlin.serializeFieldsUsing
    public final void onSetPlaybackSpeed() {
        super.onSetPlaybackSpeed();
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.RemoteActionCompatParcelizer(onSkipToNext(), 0L);
        } else {
            this.onRemoveQueueItem.IconCompatParcelizer();
        }
        _init_lambda3();
    }

    private void read(_ensureOverride _ensureoverride, int i) {
        StdSubtypeResolver.write("skipVideoBuffer");
        _ensureoverride.write(i, false);
        StdSubtypeResolver.RemoteActionCompatParcelizer();
        ((serializeFieldsUsing) this).write.MediaBrowserCompatCustomActionResultReceiver++;
    }

    private void write(_ensureOverride _ensureoverride, int i) {
        StdSubtypeResolver.write("dropVideoBuffer");
        _ensureoverride.write(i, false);
        StdSubtypeResolver.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(0, 1);
    }

    private boolean AudioAttributesCompatParcelizer(long j, boolean z) throws addNull {
        int iWrite = write(j);
        if (iWrite == 0) {
            return false;
        }
        if (z) {
            ((serializeFieldsUsing) this).write.AudioAttributesImplApi26Parcelizer += iWrite;
            ((serializeFieldsUsing) this).write.MediaBrowserCompatCustomActionResultReceiver += this.AudioAttributesImplBaseParcelizer;
        } else {
            ((serializeFieldsUsing) this).write.IconCompatParcelizer++;
            RemoteActionCompatParcelizer(iWrite, this.AudioAttributesImplBaseParcelizer);
        }
        onSetRating();
        ArrayBuilders1 arrayBuilders1 = this.onSetRepeatMode;
        if (arrayBuilders1 != null) {
            arrayBuilders1.RemoteActionCompatParcelizer(false);
        }
        return true;
    }

    protected final void RemoteActionCompatParcelizer(int i, int i2) {
        ((serializeFieldsUsing) this).write.write += i;
        int i3 = i + i2;
        ((serializeFieldsUsing) this).write.AudioAttributesCompatParcelizer += i3;
        this.onCustomAction += i3;
        this.MediaBrowserCompatCustomActionResultReceiver += i3;
        ((serializeFieldsUsing) this).write.MediaBrowserCompatItemReceiver = Math.max(this.MediaBrowserCompatCustomActionResultReceiver, ((serializeFieldsUsing) this).write.MediaBrowserCompatItemReceiver);
        int i4 = this.onPlay;
        if (i4 <= 0 || this.onCustomAction < i4) {
            return;
        }
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    private void AudioAttributesImplApi21Parcelizer(long j) {
        ((serializeFieldsUsing) this).write.IconCompatParcelizer(j);
        this.onPrepareFromSearch += j;
        this.onSeekTo++;
    }

    private void read(_ensureOverride _ensureoverride, int i, long j) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
            RemoteActionCompatParcelizer(_ensureoverride, i, j);
        } else {
            AudioAttributesCompatParcelizer(_ensureoverride, i);
        }
    }

    private void AudioAttributesCompatParcelizer(_ensureOverride _ensureoverride, int i) {
        StdSubtypeResolver.write("releaseOutputBuffer");
        _ensureoverride.write(i, true);
        StdSubtypeResolver.RemoteActionCompatParcelizer();
        ((serializeFieldsUsing) this).write.AudioAttributesImplApi21Parcelizer++;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        if (this.onSetRepeatMode == null) {
            RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }
    }

    private void RemoteActionCompatParcelizer(_ensureOverride _ensureoverride, int i, long j) {
        StdSubtypeResolver.write("releaseOutputBuffer");
        _ensureoverride.read(i, j);
        StdSubtypeResolver.RemoteActionCompatParcelizer();
        ((serializeFieldsUsing) this).write.AudioAttributesImplApi21Parcelizer++;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        if (this.onSetRepeatMode == null) {
            RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }
    }

    private boolean IconCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 23 || this.onPlayFromSearch || write(_writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver)) {
            return false;
        }
        return !_writenullkeyedentry.AudioAttributesImplApi26Parcelizer || PlaceholderSurface.AudioAttributesCompatParcelizer(this.RatingCompat);
    }

    private void accessensureViewModelStore() {
        Surface surface = this.MediaBrowserCompatSearchResultReceiver;
        PlaceholderSurface placeholderSurface = this.onMediaButtonEvent;
        if (surface == placeholderSurface) {
            this.MediaBrowserCompatSearchResultReceiver = null;
        }
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.onMediaButtonEvent = null;
        }
    }

    private void _init_lambda3() {
        _ensureOverride _ensureoverrideOnSetShuffleMode;
        if (!this.onPlayFromSearch || LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 23 || (_ensureoverrideOnSetShuffleMode = onSetShuffleMode()) == null) {
            return;
        }
        this.RemoteActionCompatParcelizer = new read(_ensureoverrideOnSetShuffleMode);
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            _ensureoverrideOnSetShuffleMode.read(bundle);
        }
    }

    private void _init_lambda4() {
        _ensureOverride _ensureoverrideOnSetShuffleMode = onSetShuffleMode();
        if (_ensureoverrideOnSetShuffleMode == null || LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 35) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("importance", Math.max(0, -this.onPlayFromUri));
        _ensureoverrideOnSetShuffleMode.read(bundle);
    }

    private void r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        if (!this.onRemoveQueueItem.read() || this.MediaBrowserCompatSearchResultReceiver == null) {
            return;
        }
        _init_lambda5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _init_lambda5() {
        this.onAddQueueItem.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
        this.onCommand = true;
    }

    private void _init_lambda2() {
        Surface surface = this.MediaBrowserCompatSearchResultReceiver;
        if (surface == null || !this.onCommand) {
            return;
        }
        this.onAddQueueItem.RemoteActionCompatParcelizer(surface);
    }

    private void RemoteActionCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject) {
        if (deserializetypedfromobject.equals(deserializeTypedFromObject.read) || deserializetypedfromobject.equals(this.onPrepare)) {
            return;
        }
        this.onPrepare = deserializetypedfromobject;
        this.onAddQueueItem.read(deserializetypedfromobject);
    }

    private void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        deserializeTypedFromObject deserializetypedfromobject = this.onPrepare;
        if (deserializetypedfromobject != null) {
            this.onAddQueueItem.read(deserializetypedfromobject);
        }
    }

    private void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        if (this.onCustomAction > 0) {
            long jRemoteActionCompatParcelizer = z_().RemoteActionCompatParcelizer();
            this.onAddQueueItem.write(this.onCustomAction, jRemoteActionCompatParcelizer - this.MediaMetadataCompat);
            this.onCustomAction = 0;
            this.MediaMetadataCompat = jRemoteActionCompatParcelizer;
        }
    }

    private void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        int i = this.onSeekTo;
        if (i != 0) {
            this.onAddQueueItem.AudioAttributesCompatParcelizer(this.onPrepareFromSearch, i);
            this.onPrepareFromSearch = 0L;
            this.onSeekTo = 0;
        }
    }

    private static void IconCompatParcelizer(_ensureOverride _ensureoverride, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        _ensureoverride.read(bundle);
    }

    private static void IconCompatParcelizer(_ensureOverride _ensureoverride, Surface surface) {
        _ensureoverride.read(surface);
    }

    private static void write(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    private MediaFormat RemoteActionCompatParcelizer(C0170format c0170format, String str, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, float f, boolean z, int i) {
        Pair<Integer, Integer> pairWrite;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c0170format.onSetCaptioningEnabled);
        mediaFormat.setInteger("height", c0170format.MediaMetadataCompat);
        _deserializeTypedForId.read(mediaFormat, c0170format.onAddQueueItem);
        _deserializeTypedForId.read(mediaFormat, "frame-rate", c0170format.RatingCompat);
        _deserializeTypedForId.RemoteActionCompatParcelizer(mediaFormat, "rotation-degrees", c0170format.onPlayFromSearch);
        _deserializeTypedForId.write(mediaFormat, c0170format.AudioAttributesImplBaseParcelizer);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(c0170format.onPlayFromUri) && (pairWrite = serializeFilteredFields.write(c0170format)) != null) {
            _deserializeTypedForId.RemoteActionCompatParcelizer(mediaFormat, Scopes.PROFILE, ((Integer) pairWrite.first).intValue());
        }
        mediaFormat.setInteger("max-width", audioAttributesCompatParcelizer.write);
        mediaFormat.setInteger("max-height", audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        _deserializeTypedForId.RemoteActionCompatParcelizer(mediaFormat, "max-input-size", audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            write(mediaFormat, i);
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.onPlayFromUri));
        }
        return mediaFormat;
    }

    private static AudioAttributesCompatParcelizer read(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format, C0170format[] c0170formatArr) {
        int iWrite;
        int iMax = c0170format.onSetCaptioningEnabled;
        int iMax2 = c0170format.MediaMetadataCompat;
        int iMax3 = read(_writenullkeyedentry, c0170format);
        if (c0170formatArr.length == 1) {
            if (iMax3 != -1 && (iWrite = write(_writenullkeyedentry, c0170format)) != -1) {
                iMax3 = Math.min((int) (iMax3 * 1.5f), iWrite);
            }
            return new AudioAttributesCompatParcelizer(iMax, iMax2, iMax3);
        }
        int length = c0170formatArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            C0170format c0170formatIconCompatParcelizer = c0170formatArr[i];
            if (c0170format.AudioAttributesImplBaseParcelizer != null && c0170formatIconCompatParcelizer.AudioAttributesImplBaseParcelizer == null) {
                c0170formatIconCompatParcelizer = c0170formatIconCompatParcelizer.write().IconCompatParcelizer(c0170format.AudioAttributesImplBaseParcelizer).IconCompatParcelizer();
            }
            if (_writenullkeyedentry.AudioAttributesCompatParcelizer(c0170format, c0170formatIconCompatParcelizer).RemoteActionCompatParcelizer != 0) {
                z |= c0170formatIconCompatParcelizer.onSetCaptioningEnabled == -1 || c0170formatIconCompatParcelizer.MediaMetadataCompat == -1;
                iMax = Math.max(iMax, c0170formatIconCompatParcelizer.onSetCaptioningEnabled);
                iMax2 = Math.max(iMax2, c0170formatIconCompatParcelizer.MediaMetadataCompat);
                iMax3 = Math.max(iMax3, read(_writenullkeyedentry, c0170formatIconCompatParcelizer));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder("Resolutions unknown. Codec max resolution: ");
            sb.append(iMax);
            sb.append("x");
            sb.append(iMax2);
            prune.RemoteActionCompatParcelizer("MediaCodecVideoRenderer", sb.toString());
            Point pointAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_writenullkeyedentry, c0170format);
            if (pointAudioAttributesCompatParcelizer != null) {
                iMax = Math.max(iMax, pointAudioAttributesCompatParcelizer.x);
                iMax2 = Math.max(iMax2, pointAudioAttributesCompatParcelizer.y);
                iMax3 = Math.max(iMax3, write(_writenullkeyedentry, c0170format.write().onFastForward(iMax).MediaBrowserCompatItemReceiver(iMax2).IconCompatParcelizer()));
                StringBuilder sb2 = new StringBuilder("Codec max resolution adjusted to: ");
                sb2.append(iMax);
                sb2.append("x");
                sb2.append(iMax2);
                prune.RemoteActionCompatParcelizer("MediaCodecVideoRenderer", sb2.toString());
            }
        }
        return new AudioAttributesCompatParcelizer(iMax, iMax2, iMax3);
    }

    @Override // kotlin.serializeFieldsUsing
    public final _hasNullKey RemoteActionCompatParcelizer(Throwable th, _writeNullKeyedEntry _writenullkeyedentry) {
        return new hasMoreTokens(th, _writenullkeyedentry, this.MediaBrowserCompatSearchResultReceiver);
    }

    private static Point AudioAttributesCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format) {
        boolean z = c0170format.MediaMetadataCompat > c0170format.onSetCaptioningEnabled;
        int i = z ? c0170format.MediaMetadataCompat : c0170format.onSetCaptioningEnabled;
        int i2 = z ? c0170format.onSetCaptioningEnabled : c0170format.MediaMetadataCompat;
        float f = i2 / i;
        for (int i3 : read) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                return null;
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point pointWrite = _writenullkeyedentry.write(i5, i3);
                float f2 = c0170format.RatingCompat;
                if (pointWrite != null && _writenullkeyedentry.read(pointWrite.x, pointWrite.y, f2)) {
                    return pointWrite;
                }
            } else {
                try {
                    int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i3, 16) << 4;
                    int iRemoteActionCompatParcelizer2 = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i4, 16) << 4;
                    if (iRemoteActionCompatParcelizer * iRemoteActionCompatParcelizer2 <= serializeFilteredFields.write()) {
                        int i6 = z ? iRemoteActionCompatParcelizer2 : iRemoteActionCompatParcelizer;
                        if (!z) {
                            iRemoteActionCompatParcelizer = iRemoteActionCompatParcelizer2;
                        }
                        return new Point(i6, iRemoteActionCompatParcelizer);
                    }
                } catch (serializeFilteredFields.write unused) {
                    return null;
                }
            }
        }
        return null;
    }

    private static int read(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format) {
        if (c0170format.onPause != -1) {
            int size = c0170format.onAddQueueItem.size();
            int length = 0;
            for (int i = 0; i < size; i++) {
                length += c0170format.onAddQueueItem.get(i).length;
            }
            return c0170format.onPause + length;
        }
        return write(_writenullkeyedentry, c0170format);
    }

    private static boolean onPrepareFromUri() {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21;
    }

    private static boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        return "NVIDIA".equals(LaissezFaireSubTypeValidator.read);
    }

    private static boolean write(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (getAllInput.class) {
            if (!AudioAttributesCompatParcelizer) {
                IconCompatParcelizer = ResultReceiver();
                AudioAttributesCompatParcelizer = true;
            }
        }
        return IconCompatParcelizer;
    }

    protected static final class AudioAttributesCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final int write;

        public AudioAttributesCompatParcelizer(int i, int i2, int i3) {
            this.write = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.RemoteActionCompatParcelizer = i3;
        }
    }

    private static int write(int i, int i2) {
        return (i * 3) / (i2 << 1);
    }

    private static boolean ResultReceiver() {
        byte b;
        byte b2;
        byte b3 = 7;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 28) {
            String str = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer;
            str.hashCode();
            switch (str.hashCode()) {
                case -1339091551:
                    b2 = !str.equals("dangal") ? (byte) -1 : (byte) 0;
                    break;
                case -1220081023:
                    b2 = !str.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                    break;
                case -1220066608:
                    b2 = !str.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                    break;
                case -1012436106:
                    b2 = !str.equals("oneday") ? (byte) -1 : (byte) 3;
                    break;
                case -760312546:
                    b2 = !str.equals("aquaman") ? (byte) -1 : (byte) 4;
                    break;
                case -64886864:
                    b2 = !str.equals("magnolia") ? (byte) -1 : (byte) 5;
                    break;
                case 3415681:
                    b2 = !str.equals("once") ? (byte) -1 : (byte) 6;
                    break;
                case 825323514:
                    b2 = !str.equals("machuca") ? (byte) -1 : (byte) 7;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
            }
            return true;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 27 && "HWEML".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer)) {
            return true;
        }
        String str2 = LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver;
        str2.hashCode();
        switch (str2.hashCode()) {
            case -349662828:
                b = !str2.equals("AFTJMST12") ? (byte) -1 : (byte) 0;
                break;
            case -321033677:
                b = !str2.equals("AFTKMST12") ? (byte) -1 : (byte) 1;
                break;
            case 2006354:
                b = !str2.equals("AFTA") ? (byte) -1 : (byte) 2;
                break;
            case 2006367:
                b = !str2.equals("AFTN") ? (byte) -1 : (byte) 3;
                break;
            case 2006371:
                b = !str2.equals("AFTR") ? (byte) -1 : (byte) 4;
                break;
            case 1785421873:
                b = !str2.equals("AFTEU011") ? (byte) -1 : (byte) 5;
                break;
            case 1785421876:
                b = !str2.equals("AFTEU014") ? (byte) -1 : (byte) 6;
                break;
            case 1798172390:
                b = !str2.equals("AFTSO001") ? (byte) -1 : (byte) 7;
                break;
            case 2119412532:
                b = !str2.equals("AFTEUFF014") ? (byte) -1 : (byte) 8;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 26) {
                    String str3 = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b3 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b3 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b3 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b3 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b3 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b3 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b3 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b3 = -1;
                            }
                            break;
                        case -1936688066:
                            b3 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b3 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b3 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b3 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b3 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b3 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b3 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b3 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b3 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b3 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b3 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b3 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b3 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b3 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b3 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b3 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b3 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b3 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b3 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b3 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b3 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b3 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b3 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b3 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b3 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b3 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b3 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b3 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b3 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b3 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b3 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b3 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b3 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b3 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b3 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b3 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b3 = !str3.equals(VideoPlaybackConfiguration._C1) ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b3 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b3 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b3 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b3 = !str3.equals("b5") ? (byte) -1 : TarConstants.LF_NORMAL;
                            break;
                        case 3483:
                            b3 = !str3.equals("mh") ? (byte) -1 : TarConstants.LF_LINK;
                            break;
                        case 73405:
                            b3 = !str3.equals("JGZ") ? (byte) -1 : TarConstants.LF_SYMLINK;
                            break;
                        case 75537:
                            b3 = !str3.equals("M04") ? (byte) -1 : TarConstants.LF_CHR;
                            break;
                        case 75739:
                            b3 = !str3.equals("M5c") ? (byte) -1 : TarConstants.LF_BLK;
                            break;
                        case 76779:
                            b3 = !str3.equals("MX6") ? (byte) -1 : TarConstants.LF_DIR;
                            break;
                        case 78669:
                            b3 = !str3.equals("P85") ? (byte) -1 : TarConstants.LF_FIFO;
                            break;
                        case 79305:
                            b3 = !str3.equals("PLE") ? (byte) -1 : TarConstants.LF_CONTIG;
                            break;
                        case 80618:
                            b3 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b3 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b3 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b3 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b3 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b3 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b3 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b3 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b3 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b3 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b3 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b3 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b3 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b3 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b3 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b3 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b3 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b3 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b3 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b3 = !str3.equals("fugu") ? (byte) -1 : TarConstants.LF_GNUTYPE_LONGLINK;
                            break;
                        case 3284551:
                            b3 = !str3.equals("kate") ? (byte) -1 : TarConstants.LF_GNUTYPE_LONGNAME;
                            break;
                        case 3351335:
                            b3 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b3 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b3 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b3 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b3 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b3 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b3 = !str3.equals("A1601") ? (byte) -1 : TarConstants.LF_GNUTYPE_SPARSE;
                            break;
                        case 65355429:
                            b3 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b3 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b3 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b3 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b3 = !str3.equals("F3211") ? (byte) -1 : TarConstants.LF_PAX_EXTENDED_HEADER_UC;
                            break;
                        case 66215431:
                            b3 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b3 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b3 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b3 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b3 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b3 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b3 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b3 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b3 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b3 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b3 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b3 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b3 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b3 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b3 = !str3.equals("griffin") ? (byte) -1 : TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER;
                            break;
                        case 307593612:
                            b3 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b3 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b3 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b3 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b3 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b3 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b3 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b3 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b3 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b3 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b3 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b3 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b3 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b3 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b3 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b3 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b3 = !str3.equals("itel_S41") ? (byte) -1 : TarConstants.LF_PAX_EXTENDED_HEADER_LC;
                            break;
                        case 1280332038:
                            b3 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b3 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b3 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b3 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b3 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b3 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b3 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b3 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b3 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b3 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b3 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b3 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b3 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b3 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b3 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b3 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b3 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b3 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b3 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    switch (b3) {
                        default:
                            String str4 = LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver;
                            str4.hashCode();
                            if (str4.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                        case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                        case TarConstants.PREFIXLEN_XSTAR /* 131 */:
                        case 132:
                        case 133:
                        case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                        case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                        case 136:
                        case 137:
                        case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                        case 139:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    final class read implements _ensureOverride.RemoteActionCompatParcelizer, Handler.Callback {
        private final Handler RemoteActionCompatParcelizer;

        public read(_ensureOverride _ensureoverride) {
            Handler handler = LaissezFaireSubTypeValidator.read(this);
            this.RemoteActionCompatParcelizer = handler;
            _ensureoverride.write(this, handler);
        }

        @Override // o._ensureOverride.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(_ensureOverride _ensureoverride, long j, long j2) {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 30) {
                this.RemoteActionCompatParcelizer.sendMessageAtFrontOfQueue(Message.obtain(this.RemoteActionCompatParcelizer, 0, (int) (j >> 32), (int) j));
            } else {
                IconCompatParcelizer(j);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            IconCompatParcelizer(LaissezFaireSubTypeValidator.IconCompatParcelizer(message.arg1, message.arg2));
            return true;
        }

        private void IconCompatParcelizer(long j) {
            if (this != getAllInput.this.RemoteActionCompatParcelizer || getAllInput.this.onSetShuffleMode() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                getAllInput.this.accessgetReportFullyDrawnExecutorp();
                return;
            }
            try {
                getAllInput.this.AudioAttributesCompatParcelizer(j);
            } catch (addNull e) {
                getAllInput.this.AudioAttributesCompatParcelizer(e);
            }
        }
    }
}
