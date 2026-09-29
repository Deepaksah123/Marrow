package kotlin;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 22\u00020\u0001:\u00012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\t*\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u0015J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u0015J\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0015J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010&2\u0006\u0010\u0003\u001a\u00020%H\u0002¢\u0006\u0004\b\u0016\u0010'J\u000f\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\tH\u0000¢\u0006\u0004\b*\u0010\u0015J\u000f\u0010+\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010\u0015J\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u0015J\u000f\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010\u0015J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020%¢\u0006\u0004\b\u0012\u0010-J%\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020.2\u0006\u0010\b\u001a\u00020/2\u0006\u0010\u000e\u001a\u000200¢\u0006\u0004\b\u001a\u00101J\u001d\u00102\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020.2\u0006\u0010\b\u001a\u00020/¢\u0006\u0004\b2\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010;\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010BR\u0016\u00109\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010BR\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u00103\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010HR\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010@R\u0018\u00107\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010KR\u0018\u0010*\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010MR\u0016\u0010G\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010O\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010RR$\u0010T\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bO\u0010SR$\u0010X\u001a\u00020U2\u0006\u0010\u0003\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010V\"\u0004\b2\u0010WR*\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010B\u001a\u0004\bG\u0010Y\"\u0004\b\n\u0010ZR*\u0010+\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00078\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010B\u001a\u0004\bI\u0010Y\"\u0004\b2\u0010ZR$\u0010(\u001a\u0002002\u0006\u0010\u0003\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010[\"\u0004\b\u0016\u0010\\R$\u0010$\u001a\u00020]2\u0006\u0010\u0003\u001a\u00020]8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010V\"\u0004\b\n\u0010WR(\u0010\u001f\u001a\u0004\u0018\u00010^2\b\u0010\u0003\u001a\u0004\u0018\u00010^8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010_\"\u0004\b\u0012\u0010`R*\u0010a\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020.8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010B\u001a\u0004\b;\u0010Y\"\u0004\b\u0016\u0010ZR$\u0010,\u001a\u0002002\u0006\u0010\u0003\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010[\"\u0004\b5\u0010\\R$\u0010\u0014\u001a\u0002002\u0006\u0010\u0003\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010[\"\u0004\b;\u0010\\R$\u0010\u001c\u001a\u0002002\u0006\u0010\u0003\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010[\"\u0004\bA\u0010\\R$\u0010 \u001a\u0002002\u0006\u0010\u0003\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010[\"\u0004\b=\u0010\\R$\u0010b\u001a\u0002002\u0006\u0010\u0003\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010[\"\u0004\b9\u0010\\R$\u0010c\u001a\u0002002\u0006\u0010\u0003\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010[\"\u0004\b\u0012\u0010\\R$\u0010d\u001a\u0002002\u0006\u0010\u0003\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010[\"\u0004\b2\u0010\\R$\u0010e\u001a\u0002002\u0006\u0010\u0003\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010[\"\u0004\b\n\u0010\\R\u001e\u0010f\u001a\u0002002\u0006\u0010\u0003\u001a\u0002008F@GX\u0086\u000e¢\u0006\u0006\"\u0004\b\u001a\u0010\\R*\u0010h\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010@\u001a\u0004\b\u0012\u0010S\"\u0004\b2\u0010gR\"\u0010k\u001a\u0004\u0018\u00010i2\b\u0010\u0003\u001a\u0004\u0018\u00010i8F@GX\u0086\u000e¢\u0006\u0006\"\u0004\b\u001a\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010lR\u0011\u0010o\u001a\u00020D8G¢\u0006\u0006\u001a\u0004\b5\u0010nR\u001e\u0010q\u001a\u00020p2\u0006\u0010\u0003\u001a\u00020p8F@GX\u0086\u000e¢\u0006\u0006\"\u0004\b\u001a\u0010ZR\u001e\u0010r\u001a\u00020p2\u0006\u0010\u0003\u001a\u00020p8F@GX\u0086\u000e¢\u0006\u0006\"\u0004\b\u0012\u0010Z"}, d2 = {"Lo/hasAnyGetter;", "", "Lo/hasAsKey;", "p0", "<init>", "(Lo/hasAsKey;)V", "Lo/hasReferringProperties;", "Lo/getKey;", "p1", "", "AudioAttributesCompatParcelizer", "(JJ)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "p2", "Lkotlin/Function1;", "Lo/findSetterInfo;", "p3", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;JLo/getAnswerMap;)V", "onPlayFromUri", "()V", "write", "(Lo/findSetterInfo;)V", "(Lo/hasAnyGetter;)V", "Landroid/graphics/Canvas;", "IconCompatParcelizer", "(Landroid/graphics/Canvas;)V", "onPlayFromSearch", "Lo/JsonParserDelegate;", "(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V", "onPlay", "onPrepareFromMediaId", "Landroid/graphics/RectF;", "onFastForward", "()Landroid/graphics/RectF;", "onMediaButtonEvent", "Lo/removeSoftRefsClearedByGc;", "Landroid/graphics/Outline;", "(Lo/removeSoftRefsClearedByGc;)Landroid/graphics/Outline;", "onPlayFromMediaId", "()Landroid/graphics/Outline;", "onAddQueueItem", "onPause", "onPrepare", "(Lo/removeSoftRefsClearedByGc;)V", "Lo/getReferencedType;", "Lo/calloc;", "", "(JJF)V", "read", "RatingCompat", "Lo/hasAsKey;", "AudioAttributesImplApi26Parcelizer", "Lo/bufferMapProperty;", "MediaMetadataCompat", "Lo/tryToResolveUnresolved;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getAnswerMap;", "AudioAttributesImplApi21Parcelizer", "Landroid/graphics/Outline;", "AudioAttributesImplBaseParcelizer", "", "MediaDescriptionCompat", "Z", "MediaBrowserCompatItemReceiver", "J", "F", "Lo/resetWithString;", "MediaBrowserCompatSearchResultReceiver", "Lo/resetWithString;", "onCustomAction", "Lo/removeSoftRefsClearedByGc;", "MediaBrowserCompatMediaItem", "Lo/findRenameByField;", "Lo/findRenameByField;", "Lo/releaseBuffers;", "Lo/releaseBuffers;", "", "onCommand", "I", "Lo/hasAnyGetterAnnotation;", "Lo/hasAnyGetterAnnotation;", "()Z", "handleMediaPlayPauseIfPendingOnHandler", "Lo/hasAnySetter;", "()I", "(I)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()J", "(J)V", "()F", "(F)V", "Lo/createInstance;", "Lo/switchAndReturnNext;", "()Lo/switchAndReturnNext;", "(Lo/switchAndReturnNext;)V", "onPrepareFromSearch", "onRemoveQueueItem", "onSeekTo", "onRewind", "onRemoveQueueItemAt", "onPrepareFromUri", "(Z)V", "onSetRating", "Lo/parseVersionPart;", "(Lo/parseVersionPart;)V", "onSetPlaybackSpeed", "Landroid/graphics/RectF;", "onSetRepeatMode", "()Lo/resetWithString;", "onSetShuffleMode", "Lo/switchToNext;", "onSetCaptioningEnabled", "onSkipToQueueItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasAnyGetter {
    private static final hasAsValue AudioAttributesCompatParcelizer;
    private static final boolean write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean onSetRating;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private resetWithString MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private long onPrepareFromSearch;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final hasAsKey write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Outline AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private RectF onSetRepeatMode;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc RatingCompat;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private int onCustomAction;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private long onPause;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private findRenameByField MediaMetadataCompat;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private releaseBuffers onAddQueueItem;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private long onFastForward;
    public static final int IconCompatParcelizer = 8;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private bufferMapProperty IconCompatParcelizer = findSerializationSortAlphabetically.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private tryToResolveUnresolved RemoteActionCompatParcelizer = tryToResolveUnresolved.write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private getAnswerMap<? super findSetterInfo, getShowPopup> read = AnonymousClass1.IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getAnswerMap<findSetterInfo, getShowPopup> AudioAttributesCompatParcelizer = new AnonymousClass2();

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver = true;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private long AudioAttributesImplApi21Parcelizer = getReferencedType.INSTANCE.write();

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private long MediaBrowserCompatCustomActionResultReceiver = calloc.INSTANCE.IconCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final hasAnyGetterAnnotation onCommand = new hasAnyGetterAnnotation();

    public hasAnyGetter(hasAsKey hasaskey) {
        this.write = hasaskey;
        hasaskey.write(false);
        this.onFastForward = hasReferringProperties.INSTANCE.write();
        this.onPause = getKey.INSTANCE.RemoteActionCompatParcelizer();
        this.onPrepareFromSearch = getReferencedType.INSTANCE.read();
    }

    /* JADX INFO: renamed from: o.hasAnyGetter$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findSetterInfo;", "", "AudioAttributesCompatParcelizer", "(Lo/findSetterInfo;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<findSetterInfo, getShowPopup> {
        public static final AnonymousClass1 IconCompatParcelizer = new AnonymousClass1();

        public final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(findSetterInfo findsetterinfo) {
            AudioAttributesCompatParcelizer(findsetterinfo);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.hasAnyGetter$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findSetterInfo;", "", "write", "(Lo/findSetterInfo;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<findSetterInfo, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(findSetterInfo findsetterinfo) {
            write(findsetterinfo);
            return getShowPopup.INSTANCE;
        }

        public final void write(findSetterInfo findsetterinfo) {
            removeSoftRefsClearedByGc removesoftrefsclearedbygc = hasAnyGetter.this.MediaBrowserCompatMediaItem;
            if (!hasAnyGetter.this.MediaDescriptionCompat || !hasAnyGetter.this.getOnSetRating() || removesoftrefsclearedbygc == null) {
                hasAnyGetter.this.write(findsetterinfo);
                return;
            }
            hasAnyGetter hasanygetter = hasAnyGetter.this;
            int iIconCompatParcelizer = ReadConstrainedTextBuffer.INSTANCE.IconCompatParcelizer();
            findSerializationTyping iconCompatParcelizer = findsetterinfo.getIconCompatParcelizer();
            long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
            iconCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
            try {
                iconCompatParcelizer.getRemoteActionCompatParcelizer().write(removesoftrefsclearedbygc, iIconCompatParcelizer);
                hasanygetter.write(findsetterinfo);
            } finally {
                iconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
                iconCompatParcelizer.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            }
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.write.getOnPrepare();
    }

    public final void read(int i) {
        if (hasAnySetter.read(this.write.getOnPrepare(), i)) {
            return;
        }
        this.write.write(i);
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final long getOnFastForward() {
        return this.onFastForward;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        if (hasReferringProperties.write(this.onFastForward, j)) {
            return;
        }
        this.onFastForward = j;
        AudioAttributesCompatParcelizer(j, this.onPause);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final long getOnPause() {
        return this.onPause;
    }

    private final void read(long j) {
        if (getKey.AudioAttributesCompatParcelizer(this.onPause, j)) {
            return;
        }
        this.onPause = j;
        AudioAttributesCompatParcelizer(this.onFastForward, j);
        if (this.MediaBrowserCompatCustomActionResultReceiver == 9205357640488583168L) {
            this.MediaBrowserCompatItemReceiver = true;
            onMediaButtonEvent();
        }
    }

    public final float IconCompatParcelizer() {
        return this.write.getMediaBrowserCompatCustomActionResultReceiver();
    }

    public final void write(float f) {
        if (this.write.getMediaBrowserCompatCustomActionResultReceiver() == f) {
            return;
        }
        this.write.read(f);
    }

    public final int write() {
        return this.write.getMediaBrowserCompatItemReceiver();
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        if (createInstance.IconCompatParcelizer(this.write.getMediaBrowserCompatItemReceiver(), i)) {
            return;
        }
        this.write.IconCompatParcelizer(i);
    }

    public final switchAndReturnNext read() {
        return this.write.getMediaMetadataCompat();
    }

    public final void RemoteActionCompatParcelizer(switchAndReturnNext switchandreturnnext) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write.getMediaMetadataCompat(), switchandreturnnext)) {
            return;
        }
        this.write.IconCompatParcelizer(switchandreturnnext);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final long getOnPrepareFromSearch() {
        return this.onPrepareFromSearch;
    }

    public final void write(long j) {
        if (getReferencedType.IconCompatParcelizer(this.onPrepareFromSearch, j)) {
            return;
        }
        this.onPrepareFromSearch = j;
        this.write.IconCompatParcelizer(j);
    }

    public final float MediaBrowserCompatSearchResultReceiver() {
        return this.write.getMediaBrowserCompatMediaItem();
    }

    public final void AudioAttributesImplApi26Parcelizer(float f) {
        if (this.write.getMediaBrowserCompatMediaItem() == f) {
            return;
        }
        this.write.AudioAttributesImplBaseParcelizer(f);
    }

    public final float MediaDescriptionCompat() {
        return this.write.getMediaDescriptionCompat();
    }

    public final void AudioAttributesImplApi21Parcelizer(float f) {
        if (this.write.getMediaDescriptionCompat() == f) {
            return;
        }
        this.write.MediaBrowserCompatItemReceiver(f);
    }

    public final float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.write.getRatingCompat();
    }

    public final void MediaBrowserCompatItemReceiver(float f) {
        if (this.write.getRatingCompat() == f) {
            return;
        }
        this.write.AudioAttributesImplApi26Parcelizer(f);
    }

    public final float handleMediaPlayPauseIfPendingOnHandler() {
        return this.write.getOnCustomAction();
    }

    public final void AudioAttributesImplBaseParcelizer(float f) {
        if (this.write.getOnCustomAction() == f) {
            return;
        }
        this.write.MediaBrowserCompatCustomActionResultReceiver(f);
    }

    public final float MediaMetadataCompat() {
        return this.write.getOnCommand();
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
        if (this.write.getOnCommand() == f) {
            return;
        }
        this.write.AudioAttributesImplApi21Parcelizer(f);
        this.MediaBrowserCompatItemReceiver = true;
        onMediaButtonEvent();
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.write.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    public final void RemoteActionCompatParcelizer(float f) {
        if (this.write.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() == f) {
            return;
        }
        this.write.AudioAttributesCompatParcelizer(f);
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.write.getOnMediaButtonEvent();
    }

    public final void read(float f) {
        if (this.write.getOnMediaButtonEvent() == f) {
            return;
        }
        this.write.IconCompatParcelizer(f);
    }

    public final float RatingCompat() {
        return this.write.getOnFastForward();
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        if (this.write.getOnFastForward() == f) {
            return;
        }
        this.write.RemoteActionCompatParcelizer(f);
    }

    public final void IconCompatParcelizer(float f) {
        if (this.write.getOnPause() == f) {
            return;
        }
        this.write.write(f);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getOnSetRating() {
        return this.onSetRating;
    }

    public final void read(boolean z) {
        if (this.onSetRating != z) {
            this.onSetRating = z;
            this.MediaBrowserCompatItemReceiver = true;
            onMediaButtonEvent();
        }
    }

    public final void IconCompatParcelizer(parseVersionPart parseversionpart) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write.getOnPlayFromSearch(), parseversionpart)) {
            return;
        }
        this.write.RemoteActionCompatParcelizer(parseversionpart);
    }

    private final void AudioAttributesCompatParcelizer(long p0, long p1) {
        this.write.write(hasReferringProperties.IconCompatParcelizer(p0), hasReferringProperties.AudioAttributesCompatParcelizer(p0), p1);
    }

    public final void RemoteActionCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1, long p2, getAnswerMap<? super findSetterInfo, getShowPopup> p3) {
        read(p2);
        this.IconCompatParcelizer = p0;
        this.RemoteActionCompatParcelizer = p1;
        this.read = p3;
        this.write.read(true);
        onPlayFromUri();
    }

    private final void onPlayFromUri() {
        this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this, this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(kotlin.findSetterInfo r14) {
        /*
            r13 = this;
            o.hasAnyGetterAnnotation r0 = r13.onCommand
            o.hasAnyGetter r1 = kotlin.hasAnyGetterAnnotation.RemoteActionCompatParcelizer(r0)
            kotlin.hasAnyGetterAnnotation.write(r0, r1)
            o.setEmojiCompatEnabled r1 = kotlin.hasAnyGetterAnnotation.read(r0)
            if (r1 == 0) goto L2b
            boolean r2 = r1.AudioAttributesImplApi21Parcelizer()
            if (r2 == 0) goto L2b
            o.setEmojiCompatEnabled r2 = kotlin.hasAnyGetterAnnotation.write(r0)
            if (r2 != 0) goto L22
            o.setEmojiCompatEnabled r2 = kotlin.setSupportAllCaps.AudioAttributesCompatParcelizer()
            kotlin.hasAnyGetterAnnotation.AudioAttributesCompatParcelizer(r0, r2)
        L22:
            r3 = r1
            o.setButtonDrawable r3 = (kotlin.setButtonDrawable) r3
            r2.AudioAttributesCompatParcelizer(r3)
            r1.RemoteActionCompatParcelizer()
        L2b:
            r1 = 1
            kotlin.hasAnyGetterAnnotation.read(r0, r1)
            o.getAnswerMap<? super o.findSetterInfo, o.getShowPopup> r13 = r13.read
            r13.invoke(r14)
            r13 = 0
            kotlin.hasAnyGetterAnnotation.read(r0, r13)
            o.hasAnyGetter r14 = kotlin.hasAnyGetterAnnotation.IconCompatParcelizer(r0)
            if (r14 == 0) goto L41
            r14.onPrepareFromMediaId()
        L41:
            o.setEmojiCompatEnabled r14 = kotlin.hasAnyGetterAnnotation.write(r0)
            if (r14 == 0) goto L97
            boolean r0 = r14.AudioAttributesImplApi21Parcelizer()
            if (r0 == 0) goto L97
            r0 = r14
            o.setButtonDrawable r0 = (kotlin.setButtonDrawable) r0
            java.lang.Object[] r1 = r0.write
            long[] r0 = r0.AudioAttributesCompatParcelizer
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L94
            r3 = r13
        L5a:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L8f
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r13
        L74:
            if (r8 >= r6) goto L8d
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L89
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            o.hasAnyGetter r9 = (kotlin.hasAnyGetter) r9
            r9.onPrepareFromMediaId()
        L89:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L74
        L8d:
            if (r6 != r7) goto L94
        L8f:
            if (r3 == r2) goto L94
            int r3 = r3 + 1
            goto L5a
        L94:
            r14.RemoteActionCompatParcelizer()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasAnyGetter.write(o.findSetterInfo):void");
    }

    private final void write(hasAnyGetter p0) {
        if (this.onCommand.RemoteActionCompatParcelizer(p0)) {
            p0.onPlay();
        }
    }

    private final void IconCompatParcelizer(Canvas p0) {
        float fIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(this.onFastForward);
        float fAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(this.onFastForward);
        float fIconCompatParcelizer2 = hasReferringProperties.IconCompatParcelizer(this.onFastForward);
        float f = (int) (this.onPause >> 32);
        float fAudioAttributesCompatParcelizer2 = hasReferringProperties.AudioAttributesCompatParcelizer(this.onFastForward);
        float f2 = (int) this.onPause;
        float fIconCompatParcelizer3 = IconCompatParcelizer();
        switchAndReturnNext switchandreturnnext = read();
        int iWrite = write();
        if (fIconCompatParcelizer3 < 1.0f || !createInstance.IconCompatParcelizer(iWrite, createInstance.INSTANCE.onPrepare()) || switchandreturnnext != null || hasAnySetter.read(MediaBrowserCompatCustomActionResultReceiver(), hasAnySetter.INSTANCE.AudioAttributesCompatParcelizer())) {
            releaseBuffers releasebuffersAudioAttributesCompatParcelizer = this.onAddQueueItem;
            if (releasebuffersAudioAttributesCompatParcelizer == null) {
                releasebuffersAudioAttributesCompatParcelizer = fromInitial.AudioAttributesCompatParcelizer();
                this.onAddQueueItem = releasebuffersAudioAttributesCompatParcelizer;
            }
            releasebuffersAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(fIconCompatParcelizer3);
            releasebuffersAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iWrite);
            releasebuffersAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(switchandreturnnext);
            p0.saveLayer(fIconCompatParcelizer, fAudioAttributesCompatParcelizer, fIconCompatParcelizer2 + f, fAudioAttributesCompatParcelizer2 + f2, releasebuffersAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer());
        } else {
            p0.save();
        }
        p0.translate(fIconCompatParcelizer, fAudioAttributesCompatParcelizer);
        p0.concat(this.write.IconCompatParcelizer());
    }

    private final void onPlayFromSearch() {
        if (this.write.AudioAttributesImplApi26Parcelizer()) {
            return;
        }
        try {
            onPlayFromUri();
        } catch (Throwable unused) {
        }
    }

    public final void write(JsonParserDelegate p0, hasAnyGetter p1) {
        Canvas canvas;
        boolean z;
        if (this.handleMediaPlayPauseIfPendingOnHandler) {
            return;
        }
        onMediaButtonEvent();
        onPlayFromSearch();
        boolean z2 = MediaMetadataCompat() > BitmapDescriptorFactory.HUE_RED;
        if (z2) {
            p0.write();
        }
        Canvas canvasRemoteActionCompatParcelizer = balloc.RemoteActionCompatParcelizer(p0);
        boolean zIsHardwareAccelerated = canvasRemoteActionCompatParcelizer.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            IconCompatParcelizer(canvasRemoteActionCompatParcelizer);
        }
        boolean z3 = !zIsHardwareAccelerated && this.onSetRating;
        if (z3) {
            p0.IconCompatParcelizer();
            resetWithString resetwithstringAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (resetwithstringAudioAttributesImplApi26Parcelizer instanceof resetWithString.read) {
                JsonParserDelegate.RemoteActionCompatParcelizer$default(p0, ((resetWithString.read) resetwithstringAudioAttributesImplApi26Parcelizer).getRead(), 0, 2, null);
            } else if (resetwithstringAudioAttributesImplApi26Parcelizer instanceof resetWithString.RemoteActionCompatParcelizer) {
                removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = this.RatingCompat;
                if (removesoftrefsclearedbygcWrite != null) {
                    removesoftrefsclearedbygcWrite.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    removesoftrefsclearedbygcWrite = writeIndentation.write();
                    this.RatingCompat = removesoftrefsclearedbygcWrite;
                }
                removeSoftRefsClearedByGc.RemoteActionCompatParcelizer$default(removesoftrefsclearedbygcWrite, ((resetWithString.RemoteActionCompatParcelizer) resetwithstringAudioAttributesImplApi26Parcelizer).getRead(), null, 2, null);
                JsonParserDelegate.AudioAttributesCompatParcelizer$default(p0, removesoftrefsclearedbygcWrite, 0, 2, null);
            } else {
                if (!(resetwithstringAudioAttributesImplApi26Parcelizer instanceof resetWithString.AudioAttributesCompatParcelizer)) {
                    throw new RenewEligibleCreator();
                }
                JsonParserDelegate.AudioAttributesCompatParcelizer$default(p0, ((resetWithString.AudioAttributesCompatParcelizer) resetwithstringAudioAttributesImplApi26Parcelizer).getIconCompatParcelizer(), 0, 2, null);
            }
        }
        if (p1 != null) {
            p1.write(this);
        }
        if (balloc.RemoteActionCompatParcelizer(p0).isHardwareAccelerated() || this.write.onCustomAction()) {
            canvas = canvasRemoteActionCompatParcelizer;
            z = zIsHardwareAccelerated;
            this.write.AudioAttributesCompatParcelizer(p0);
        } else {
            findRenameByField findrenamebyfield = this.MediaMetadataCompat;
            if (findrenamebyfield == null) {
                findrenamebyfield = new findRenameByField();
                this.MediaMetadataCompat = findrenamebyfield;
            }
            findRenameByField findrenamebyfield2 = findrenamebyfield;
            bufferMapProperty buffermapproperty = this.IconCompatParcelizer;
            tryToResolveUnresolved trytoresolveunresolved = this.RemoteActionCompatParcelizer;
            long jAudioAttributesCompatParcelizer = SetterlessProperty.AudioAttributesCompatParcelizer(this.onPause);
            bufferMapProperty buffermapproperty2 = findrenamebyfield2.getIconCompatParcelizer().read();
            tryToResolveUnresolved trytoresolveunresolvedWrite = findrenamebyfield2.getIconCompatParcelizer().write();
            JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findrenamebyfield2.getIconCompatParcelizer().IconCompatParcelizer();
            long jAudioAttributesCompatParcelizer2 = findrenamebyfield2.getIconCompatParcelizer().AudioAttributesCompatParcelizer();
            canvas = canvasRemoteActionCompatParcelizer;
            hasAnyGetter audioAttributesImplApi26Parcelizer = findrenamebyfield2.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer();
            z = zIsHardwareAccelerated;
            findSerializationTyping iconCompatParcelizer = findrenamebyfield2.getIconCompatParcelizer();
            iconCompatParcelizer.AudioAttributesCompatParcelizer(buffermapproperty);
            iconCompatParcelizer.AudioAttributesCompatParcelizer(trytoresolveunresolved);
            iconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
            iconCompatParcelizer.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            iconCompatParcelizer.write(this);
            p0.IconCompatParcelizer();
            try {
                write(findrenamebyfield2);
            } finally {
                p0.AudioAttributesCompatParcelizer();
                findSerializationTyping iconCompatParcelizer2 = findrenamebyfield2.getIconCompatParcelizer();
                iconCompatParcelizer2.AudioAttributesCompatParcelizer(buffermapproperty2);
                iconCompatParcelizer2.AudioAttributesCompatParcelizer(trytoresolveunresolvedWrite);
                iconCompatParcelizer2.AudioAttributesCompatParcelizer(jsonParserDelegateIconCompatParcelizer);
                iconCompatParcelizer2.IconCompatParcelizer(jAudioAttributesCompatParcelizer2);
                iconCompatParcelizer2.write(audioAttributesImplApi26Parcelizer);
            }
        }
        if (z3) {
            p0.AudioAttributesCompatParcelizer();
        }
        if (z2) {
            p0.RemoteActionCompatParcelizer();
        }
        if (z) {
            return;
        }
        canvas.restore();
    }

    private final void onPlay() {
        this.onCustomAction++;
    }

    private final void onPrepareFromMediaId() {
        this.onCustomAction--;
        onPause();
    }

    private final RectF onFastForward() {
        RectF rectF = this.onSetRepeatMode;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.onSetRepeatMode = rectF2;
        return rectF2;
    }

    private final void onMediaButtonEvent() {
        if (this.MediaBrowserCompatItemReceiver) {
            Outline outline = null;
            if (!this.onSetRating && MediaMetadataCompat() <= BitmapDescriptorFactory.HUE_RED) {
                this.write.write(false);
                this.write.AudioAttributesCompatParcelizer(null, getKey.INSTANCE.RemoteActionCompatParcelizer());
            } else {
                removeSoftRefsClearedByGc removesoftrefsclearedbygc = this.MediaBrowserCompatMediaItem;
                if (removesoftrefsclearedbygc != null) {
                    RectF rectFOnFastForward = onFastForward();
                    if (removesoftrefsclearedbygc instanceof getCurrentSegment) {
                        ((getCurrentSegment) removesoftrefsclearedbygc).getRemoteActionCompatParcelizer().computeBounds(rectFOnFastForward, false);
                        Outline outlineWrite = write(removesoftrefsclearedbygc);
                        if (outlineWrite != null) {
                            outlineWrite.setAlpha(IconCompatParcelizer());
                            outline = outlineWrite;
                        }
                        long j = -1;
                        this.write.AudioAttributesCompatParcelizer(outline, getKey.read((((long) Math.round(rectFOnFastForward.width())) << 32) | (((long) Math.round(rectFOnFastForward.height())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
                        if (this.MediaDescriptionCompat && this.onSetRating) {
                            this.write.write(false);
                            this.write.read();
                        } else {
                            this.write.write(this.onSetRating);
                        }
                    } else {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                } else {
                    this.write.write(this.onSetRating);
                    calloc.INSTANCE.AudioAttributesCompatParcelizer();
                    Outline outlineOnPlayFromMediaId = onPlayFromMediaId();
                    long jAudioAttributesCompatParcelizer = SetterlessProperty.AudioAttributesCompatParcelizer(this.onPause);
                    long j2 = this.AudioAttributesImplApi21Parcelizer;
                    long j3 = this.MediaBrowserCompatCustomActionResultReceiver;
                    long j4 = j3 != 9205357640488583168L ? j3 : jAudioAttributesCompatParcelizer;
                    int i = (int) (j2 >> 32);
                    int i2 = (int) j2;
                    outlineOnPlayFromMediaId.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j4 >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) j4)), this.AudioAttributesImplApi26Parcelizer);
                    outlineOnPlayFromMediaId.setAlpha(IconCompatParcelizer());
                    this.write.AudioAttributesCompatParcelizer(outlineOnPlayFromMediaId, SetterlessProperty.RemoteActionCompatParcelizer(j4));
                }
            }
        }
        this.MediaBrowserCompatItemReceiver = false;
    }

    private final Outline write(removeSoftRefsClearedByGc p0) {
        Outline outlineOnPlayFromMediaId = onPlayFromMediaId();
        if (Build.VERSION.SDK_INT >= 30) {
            hasRequiredMarker.INSTANCE.write(outlineOnPlayFromMediaId, p0);
        } else if (p0 instanceof getCurrentSegment) {
            outlineOnPlayFromMediaId.setConvexPath(((getCurrentSegment) p0).getRemoteActionCompatParcelizer());
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.MediaDescriptionCompat = !outlineOnPlayFromMediaId.canClip();
        this.MediaBrowserCompatMediaItem = p0;
        return outlineOnPlayFromMediaId;
    }

    private final Outline onPlayFromMediaId() {
        Outline outline = this.AudioAttributesImplBaseParcelizer;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.AudioAttributesImplBaseParcelizer = outline2;
        return outline2;
    }

    public final void onAddQueueItem() {
        if (this.handleMediaPlayPauseIfPendingOnHandler) {
            return;
        }
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        onPause();
    }

    private final void onPause() {
        if (this.handleMediaPlayPauseIfPendingOnHandler && this.onCustomAction == 0) {
            AudioAttributesCompatParcelizer();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer() {
        /*
            r15 = this;
            o.hasAnyGetterAnnotation r0 = r15.onCommand
            o.hasAnyGetter r1 = kotlin.hasAnyGetterAnnotation.RemoteActionCompatParcelizer(r0)
            if (r1 == 0) goto Lf
            r1.onPrepareFromMediaId()
            r1 = 0
            kotlin.hasAnyGetterAnnotation.IconCompatParcelizer(r0, r1)
        Lf:
            o.setEmojiCompatEnabled r0 = kotlin.hasAnyGetterAnnotation.read(r0)
            if (r0 == 0) goto L60
            r1 = r0
            o.setButtonDrawable r1 = (kotlin.setButtonDrawable) r1
            java.lang.Object[] r2 = r1.write
            long[] r1 = r1.AudioAttributesCompatParcelizer
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5d
            r4 = 0
            r5 = r4
        L23:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L58
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3d:
            if (r10 >= r8) goto L56
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L52
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            o.hasAnyGetter r11 = (kotlin.hasAnyGetter) r11
            r11.onPrepareFromMediaId()
        L52:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3d
        L56:
            if (r8 != r9) goto L5d
        L58:
            if (r5 == r3) goto L5d
            int r5 = r5 + 1
            goto L23
        L5d:
            r0.RemoteActionCompatParcelizer()
        L60:
            o.hasAsKey r15 = r15.write
            r15.read()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasAnyGetter.AudioAttributesCompatParcelizer():void");
    }

    public final resetWithString AudioAttributesImplApi26Parcelizer() {
        resetWithString.read readVar;
        resetWithString resetwithstring = this.MediaBrowserCompatSearchResultReceiver;
        removeSoftRefsClearedByGc removesoftrefsclearedbygc = this.MediaBrowserCompatMediaItem;
        if (resetwithstring != null) {
            return resetwithstring;
        }
        if (removesoftrefsclearedbygc != null) {
            resetWithString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new resetWithString.AudioAttributesCompatParcelizer(removesoftrefsclearedbygc);
            this.MediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer;
            return audioAttributesCompatParcelizer;
        }
        long jAudioAttributesCompatParcelizer = SetterlessProperty.AudioAttributesCompatParcelizer(this.onPause);
        long j = this.AudioAttributesImplApi21Parcelizer;
        long j2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (j2 != 9205357640488583168L) {
            jAudioAttributesCompatParcelizer = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer);
        float f = this.AudioAttributesImplApi26Parcelizer;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            readVar = new resetWithString.read(new WritableTypeIdInclusion(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        } else {
            long j3 = -1;
            readVar = new resetWithString.RemoteActionCompatParcelizer(allocByteBuffer.AudioAttributesCompatParcelizer(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f)) << 32) | (((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) Float.floatToRawIntBits(f))))));
        }
        this.MediaBrowserCompatSearchResultReceiver = readVar;
        return readVar;
    }

    private final void onPrepare() {
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaBrowserCompatCustomActionResultReceiver = calloc.INSTANCE.IconCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = getReferencedType.INSTANCE.write();
        this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatItemReceiver = true;
        this.MediaDescriptionCompat = false;
    }

    public final void RemoteActionCompatParcelizer(removeSoftRefsClearedByGc p0) {
        onPrepare();
        this.MediaBrowserCompatMediaItem = p0;
        onMediaButtonEvent();
    }

    public final void IconCompatParcelizer(long p0, long p1, float p2) {
        if (getReferencedType.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, p0) && calloc.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, p1) && this.AudioAttributesImplApi26Parcelizer == p2 && this.MediaBrowserCompatMediaItem == null) {
            return;
        }
        onPrepare();
        this.AudioAttributesImplApi21Parcelizer = p0;
        this.MediaBrowserCompatCustomActionResultReceiver = p1;
        this.AudioAttributesImplApi26Parcelizer = p2;
        onMediaButtonEvent();
    }

    public final void read(long p0, long p1) {
        IconCompatParcelizer(p0, p1, BitmapDescriptorFactory.HUE_RED);
    }

    public final void IconCompatParcelizer(long j) {
        if (switchToNext.RemoteActionCompatParcelizer(j, this.write.getHandleMediaPlayPauseIfPendingOnHandler())) {
            return;
        }
        this.write.write(j);
    }

    public final void RemoteActionCompatParcelizer(long j) {
        if (switchToNext.RemoteActionCompatParcelizer(j, this.write.getOnAddQueueItem())) {
            return;
        }
        this.write.read(j);
    }

    static {
        hasCreatorAnnotation hascreatorannotation;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lowerCase, (Object) "robolectric");
        write = zRemoteActionCompatParcelizer;
        if (zRemoteActionCompatParcelizer) {
            hascreatorannotation = hasAsValueAnnotation.INSTANCE;
        } else {
            hascreatorannotation = hasCreatorAnnotation.INSTANCE;
        }
        AudioAttributesCompatParcelizer = hascreatorannotation;
    }
}
