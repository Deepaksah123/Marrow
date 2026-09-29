package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin._assertNotNull;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001-B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u0010\u0010\u001eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0010\u0010 J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u0015\u0010!J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u001d¢\u0006\u0004\b\u0018\u0010\"J5\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020#2\u0006\u0010%\u001a\u00020$2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0015\u0010(J'\u0010*\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J?\u0010-\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020#2\u0006\u0010%\u001a\u00020$2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t\u0018\u00010\u00172\b\u0010,\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b-\u0010.J\u0018\u0010-\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0004\b-\u0010/J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u00100J\u0017\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0010\u00100J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u00100J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u00100J\u000f\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u0010\u000bJ\u0015\u0010*\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\u0011J\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u000bJ\r\u00103\u001a\u00020\u000f¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0000¢\u0006\u0004\b5\u0010\u000bJ\u000f\u00106\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010\u000bJ\u000f\u00107\u001a\u00020\tH\u0002¢\u0006\u0004\b7\u0010\u000bJ\u000f\u00108\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u0010\u000bJ\r\u00109\u001a\u00020\t¢\u0006\u0004\b9\u0010\u000bJ\r\u0010:\u001a\u00020\t¢\u0006\u0004\b:\u0010\u000bJ\r\u0010;\u001a\u00020\t¢\u0006\u0004\b;\u0010\u000bR\u0014\u0010*\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8B@CX\u0082\u000e¢\u0006\u0006\"\u0004\b>\u0010\u0011R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b?\u00104\"\u0004\b\u001a\u0010\u0011R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b@\u00104\"\u0004\bA\u0010\u0011R\u0014\u0010-\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010DR\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010ER*\u0010>\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00148\u0017@QX\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010E\u001a\u0004\bA\u0010F\"\u0004\b\u0015\u0010GR\"\u0010\r\u001a\u00020H8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\b\u0010\u0010MR\u0014\u0010A\u001a\u00020N8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010OR\u0014\u0010S\u001a\u00020P8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR$\u0010<\u001a\u00020T2\u0006\u0010\u0006\u001a\u00020T8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\b-\u0010WR\u0016\u0010X\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010DR\u001c\u0010Z\u001a\u00020\u000f8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bY\u00104R\u0016\u0010[\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010DR\u0013\u0010]\u001a\u0004\u0018\u00010\u001d8G¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0018\u0010Y\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010^R\u0016\u0010K\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010_R\u0016\u0010I\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010`R$\u0010b\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010cR\u0014\u0010\f\u001a\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u00104R\u0016\u0010\u001c\u001a\u00020e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010fR\u0014\u00102\u001a\u00020P8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010RR\u001a\u0010\n\u001a\u00020g8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010h\u001a\u0004\b\u0018\u0010iR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00000j8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010kR\u0011\u0010:\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\bb\u00104R\u001c\u00103\u001a\u00020\u000f8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b*\u0010D\"\u0004\b-\u0010\u0011R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00000l8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010mR$\u0010;\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bZ\u0010D\u001a\u0004\b]\u00104R\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\t0n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010oR\u0014\u0010\u000e\u001a\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u00104R\u0016\u0010B\u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010qR\u0016\u0010?\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010DR(\u00106\u001a\u0004\u0018\u00010r2\b\u0010\u0006\u001a\u0004\u0018\u00010r8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bY\u0010s\u001a\u0004\bt\u0010uR\u0016\u00107\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bd\u0010_R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\t0n8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b2\u0010oR\u001c\u0010Q\u001a\u00020\u000f8\u0016@\u0017X\u0097\u000e¢\u0006\f\n\u0004\b\u001a\u0010D\"\u0004\b\u0015\u0010\u0011R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\t0n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010oR\u0014\u0010@\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010FR\u0014\u0010v\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010FR\u0016\u0010w\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010D"}, d2 = {"Lo/setPropertyNamingStrategy;", "Lo/_parser;", "Lo/isTypeOrSuperTypeOf;", "Lo/KeyDeserializer;", "Lo/ObjectMapper1;", "Lo/addMixIn;", "p0", "<init>", "(Lo/addMixIn;)V", "", "onPause", "()V", "onMediaButtonEvent", "MediaBrowserCompatCustomActionResultReceiver", "onRemoveQueueItem", "", "write", "(Z)V", "", "Lo/weirdNumberException;", "", "RemoteActionCompatParcelizer", "()Ljava/util/Map;", "Lkotlin/Function1;", "IconCompatParcelizer", "(Lo/getAnswerMap;)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "onPlayFromMediaId", "Lo/PropertyValueAny;", "(J)Lo/_parser;", "Lo/_assertNotNull;", "(Lo/_assertNotNull;)V", "(J)V", "(J)Z", "Lo/hasReferringProperties;", "", "p1", "Lo/validateAppend;", "p2", "(JFLo/getAnswerMap;)V", "Lo/hasAnyGetter;", "read", "(JFLo/hasAnyGetter;)V", "p3", "AudioAttributesCompatParcelizer", "(JFLo/getAnswerMap;Lo/hasAnyGetter;)V", "(Lo/weirdNumberException;)I", "(I)I", "onSkipToQueueItem", "onPlay", "onPrepareFromSearch", "()Z", "onPrepareFromMediaId", "onPrepareFromUri", "onSetCaptioningEnabled", "onSetRepeatMode", "onPlayFromSearch", "onPlayFromUri", "onPrepare", "RatingCompat", "Lo/addMixIn;", "AudioAttributesImplBaseParcelizer", "onRewind", "onSetShuffleMode", "AudioAttributesImplApi26Parcelizer", "onRemoveQueueItemAt", "()Lo/_assertNotNull;", "Z", "I", "()I", "(I)V", "Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "onCustomAction", "()Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "(Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;)V", "Lo/getSubtypeResolver;", "()Lo/getSubtypeResolver;", "Lo/_bindAndClose;", "onSetRating", "()Lo/_bindAndClose;", "MediaBrowserCompatSearchResultReceiver", "Lo/_assertNotNull$RemoteActionCompatParcelizer;", "onSetPlaybackSpeed", "()Lo/_assertNotNull$RemoteActionCompatParcelizer;", "(Lo/_assertNotNull$RemoteActionCompatParcelizer;)V", "MediaDescriptionCompat", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "()Lo/PropertyValueAny;", "onCommand", "Lo/PropertyValueAny;", "J", "F", "Lo/getAnswerMap;", "onAddQueueItem", "Lo/hasAnyGetter;", "onFastForward", "Lo/setPropertyNamingStrategy$AudioAttributesCompatParcelizer;", "Lo/setPropertyNamingStrategy$AudioAttributesCompatParcelizer;", "Lo/properties;", "Lo/properties;", "()Lo/properties;", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "", "()Ljava/util/List;", "Lkotlin/Function0;", "Lo/getCreatedOnDateMs;", "onSeekTo", "()Lo/KeyDeserializer;", "", "Ljava/lang/Object;", "q_", "()Ljava/lang/Object;", "onStop", "onSkipToNext"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setPropertyNamingStrategy extends _parser implements KeyDeserializer, ObjectMapper1 {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean onSetRating;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private hasAnyGetter onFastForward;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private getAnswerMap<? super validateAppend, getShowPopup> onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean onPrepare;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private PropertyValueAny handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final addMixIn read;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private boolean onSkipToNext;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private _assertNotNull.MediaBrowserCompatCustomActionResultReceiver MediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long onCustomAction = hasReferringProperties.INSTANCE.write();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private AudioAttributesCompatParcelizer onPlayFromMediaId = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final properties onPause = new defaultClassIntrospector(this);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<setPropertyNamingStrategy> onPrepareFromMediaId = new UTF32Reader<>(new setPropertyNamingStrategy[16], 0);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean onPrepareFromSearch = true;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> onSeekTo = new AnonymousClass3();

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private boolean onRewind = true;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private Object onPrepareFromUri = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getOnAddQueueItem();

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private long onSetCaptioningEnabled = PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> onSetRepeatMode = new AnonymousClass4();

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> onSetPlaybackSpeed = new AnonymousClass1();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[_assertNotNull.RemoteActionCompatParcelizer.values().length];
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr;
            int[] iArr2 = new int[_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.values().length];
            try {
                iArr2[_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            read = iArr2;
        }
    }

    public setPropertyNamingStrategy(addMixIn addmixin) {
        this.read = addmixin;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/setPropertyNamingStrategy$AudioAttributesCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        private static final /* synthetic */ AudioAttributesCompatParcelizer[] IconCompatParcelizer;
        private static final /* synthetic */ getMagicModuleSavedMcqCount write;
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer("IsPlacedInLookahead", 0);
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer("IsPlacedInApproach", 1);
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer("IsNotPlaced", 2);

        private AudioAttributesCompatParcelizer(String str, int i) {
        }

        static {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            IconCompatParcelizer = audioAttributesCompatParcelizerArrRemoteActionCompatParcelizer;
            write = getMagicModuleTimeline.IconCompatParcelizer(audioAttributesCompatParcelizerArrRemoteActionCompatParcelizer);
        }

        private static final /* synthetic */ AudioAttributesCompatParcelizer[] RemoteActionCompatParcelizer() {
            return new AudioAttributesCompatParcelizer[]{RemoteActionCompatParcelizer, read, AudioAttributesCompatParcelizer};
        }

        public static AudioAttributesCompatParcelizer valueOf(String str) {
            return (AudioAttributesCompatParcelizer) Enum.valueOf(AudioAttributesCompatParcelizer.class, str);
        }

        public static AudioAttributesCompatParcelizer[] values() {
            return (AudioAttributesCompatParcelizer[]) IconCompatParcelizer.clone();
        }
    }

    private final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.read.AudioAttributesImplApi21Parcelizer(z);
    }

    private final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.read.AudioAttributesImplBaseParcelizer(z);
    }

    private final boolean onRewind() {
        return this.read.getMediaMetadataCompat();
    }

    private final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.read.MediaBrowserCompatCustomActionResultReceiver(z);
    }

    private final boolean onSetShuffleMode() {
        return this.read.getMediaBrowserCompatSearchResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final _assertNotNull onRemoveQueueItemAt() {
        return this.read.getAudioAttributesCompatParcelizer();
    }

    public final void onPause() {
        AudioAttributesImplApi21Parcelizer(true);
        AudioAttributesImplApi26Parcelizer(true);
    }

    @Override // kotlin.KeyDeserializer
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getWrite() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.AudioAttributesImplBaseParcelizer = i;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final _assertNotNull.MediaBrowserCompatCustomActionResultReceiver getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void write(_assertNotNull.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        this.MediaBrowserCompatCustomActionResultReceiver = mediaBrowserCompatCustomActionResultReceiver;
    }

    public final getSubtypeResolver MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.read.getOnFastForward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final _bindAndClose onSetRating() {
        return this.read.onPrepareFromSearch();
    }

    private final void AudioAttributesCompatParcelizer(_assertNotNull.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.read.IconCompatParcelizer(remoteActionCompatParcelizer);
    }

    private final _assertNotNull.RemoteActionCompatParcelizer onSetPlaybackSpeed() {
        return this.read.getAudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final PropertyValueAny getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final boolean onFastForward() {
        return this.onPlayFromMediaId != AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.KeyDeserializer
    public final _bindAndClose write() {
        return onRemoveQueueItemAt().onPrepareFromUri();
    }

    @Override // kotlin.KeyDeserializer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final properties getOnPlayFromSearch() {
        return this.onPause;
    }

    public final void onMediaButtonEvent() {
        if (this.onPlayFromMediaId != AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer || configure.write(onRemoveQueueItemAt())) {
            return;
        }
        this.read.AudioAttributesCompatParcelizer(true);
    }

    public final boolean onAddQueueItem() {
        return configure.write(onRemoveQueueItemAt()) || onSeekTo();
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.onPrepareFromSearch = z;
    }

    public final List<setPropertyNamingStrategy> RatingCompat() {
        onRemoveQueueItemAt().onPause();
        if (!this.onPrepareFromSearch) {
            return this.onPrepareFromMediaId.read();
        }
        _assertNotNull _assertnotnullOnRemoveQueueItemAt = onRemoveQueueItemAt();
        UTF32Reader<setPropertyNamingStrategy> uTF32Reader = this.onPrepareFromMediaId;
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = _assertnotnullOnRemoveQueueItemAt.addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (uTF32Reader.getAudioAttributesCompatParcelizer() <= i) {
                setPropertyNamingStrategy onPrepareFromMediaId = _assertnotnull.getAccessaddObserverForBackInvoker().getOnPrepareFromMediaId();
                toMagicModuleMetaRepoModel.write(onPrepareFromMediaId);
                uTF32Reader.read(onPrepareFromMediaId);
            } else {
                setPropertyNamingStrategy onPrepareFromMediaId2 = _assertnotnull.getAccessaddObserverForBackInvoker().getOnPrepareFromMediaId();
                toMagicModuleMetaRepoModel.write(onPrepareFromMediaId2);
                uTF32Reader.AudioAttributesCompatParcelizer(i, onPrepareFromMediaId2);
            }
        }
        uTF32Reader.read(_assertnotnullOnRemoveQueueItemAt.onPause().size(), uTF32Reader.getAudioAttributesCompatParcelizer());
        this.onPrepareFromSearch = false;
        return this.onPrepareFromMediaId.read();
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getOnPrepare() {
        return this.onPrepare;
    }

    /* JADX INFO: renamed from: o.setPropertyNamingStrategy$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.setPropertyNamingStrategy$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/KeyDeserializer;", "p0", "", "write", "(Lo/KeyDeserializer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<KeyDeserializer, getShowPopup> {
            public static final AnonymousClass1 RemoteActionCompatParcelizer = new AnonymousClass1();

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(KeyDeserializer keyDeserializer) {
                write(keyDeserializer);
                return getShowPopup.INSTANCE;
            }

            public final void write(KeyDeserializer keyDeserializer) {
                keyDeserializer.getOnPlayFromSearch().RemoteActionCompatParcelizer(false);
            }

            AnonymousClass1() {
                super(1);
            }
        }

        public final void AudioAttributesCompatParcelizer() {
            setPropertyNamingStrategy.this.onPrepareFromUri();
            setPropertyNamingStrategy.this.IconCompatParcelizer(AnonymousClass1.RemoteActionCompatParcelizer);
            readerFor write = setPropertyNamingStrategy.this.write().getAudioAttributesCompatParcelizer();
            if (write != null) {
                boolean mediaBrowserCompatMediaItem = write.getMediaBrowserCompatMediaItem();
                List<_assertNotNull> listOnPause = setPropertyNamingStrategy.this.onRemoveQueueItemAt().onPause();
                int size = listOnPause.size();
                for (int i = 0; i < size; i++) {
                    readerFor write2 = listOnPause.get(i).r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().getAudioAttributesCompatParcelizer();
                    if (write2 != null) {
                        write2.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem);
                    }
                }
            }
            readerFor write3 = setPropertyNamingStrategy.this.write().getAudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(write3);
            write3.onMediaButtonEvent().onMediaButtonEvent();
            readerFor write4 = setPropertyNamingStrategy.this.write().getAudioAttributesCompatParcelizer();
            if (write4 != null) {
                write4.getMediaBrowserCompatMediaItem();
                List<_assertNotNull> listOnPause2 = setPropertyNamingStrategy.this.onRemoveQueueItemAt().onPause();
                int size2 = listOnPause2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    readerFor write5 = listOnPause2.get(i2).r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().getAudioAttributesCompatParcelizer();
                    if (write5 != null) {
                        write5.RemoteActionCompatParcelizer(false);
                    }
                }
            }
            setPropertyNamingStrategy.this.onRemoveQueueItem();
            setPropertyNamingStrategy.this.IconCompatParcelizer(AnonymousClass4.IconCompatParcelizer);
        }

        /* JADX INFO: renamed from: o.setPropertyNamingStrategy$3$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/KeyDeserializer;", "p0", "", "read", "(Lo/KeyDeserializer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<KeyDeserializer, getShowPopup> {
            public static final AnonymousClass4 IconCompatParcelizer = new AnonymousClass4();

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(KeyDeserializer keyDeserializer) {
                read(keyDeserializer);
                return getShowPopup.INSTANCE;
            }

            public final void read(KeyDeserializer keyDeserializer) {
                keyDeserializer.getOnPlayFromSearch().IconCompatParcelizer(keyDeserializer.getOnPlayFromSearch().getRemoteActionCompatParcelizer());
            }

            AnonymousClass4() {
                super(1);
            }
        }

        AnonymousClass3() {
            super(0);
        }
    }

    @Override // kotlin.KeyDeserializer
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.onPrepare = true;
        getOnPlayFromSearch().MediaBrowserCompatCustomActionResultReceiver();
        if (onRewind()) {
            onSetRepeatMode();
        }
        readerFor write = write().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write);
        if (onSetShuffleMode() || (!this.MediaDescriptionCompat && !write.getMediaBrowserCompatMediaItem() && onRewind())) {
            AudioAttributesImplApi21Parcelizer(false);
            _assertNotNull.RemoteActionCompatParcelizer remoteActionCompatParcelizerOnSetPlaybackSpeed = onSetPlaybackSpeed();
            AudioAttributesCompatParcelizer(_assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
            this.read.AudioAttributesImplApi26Parcelizer(false);
            PropertyMetadata addOnNewIntentListener = _serializerProvider.AudioAttributesCompatParcelizer(onRemoveQueueItemAt()).getAddOnNewIntentListener();
            _assertNotNull _assertnotnullOnRemoveQueueItemAt = onRemoveQueueItemAt();
            getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.onSeekTo;
            getAnswerMap getanswermap = addOnNewIntentListener.AudioAttributesImplBaseParcelizer;
            addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(_assertnotnullOnRemoveQueueItemAt, (getAnswerMap<? super _assertNotNull, getShowPopup>) getanswermap, getcreatedondatems);
            AudioAttributesCompatParcelizer(remoteActionCompatParcelizerOnSetPlaybackSpeed);
            if (this.read.getOnPause() && write.getMediaBrowserCompatMediaItem()) {
                AudioAttributesImplApi21Parcelizer();
            }
            AudioAttributesImplApi26Parcelizer(false);
        }
        if (getOnPlayFromSearch().getRemoteActionCompatParcelizer()) {
            getOnPlayFromSearch().IconCompatParcelizer(true);
        }
        if (getOnPlayFromSearch().getIconCompatParcelizer() && getOnPlayFromSearch().AudioAttributesCompatParcelizer()) {
            getOnPlayFromSearch().AudioAttributesImplApi26Parcelizer();
        }
        this.onPrepare = false;
    }

    private final boolean onSeekTo() {
        return this.read.getMediaBrowserCompatItemReceiver();
    }

    public final void write(boolean p0) {
        if (p0 && onAddQueueItem()) {
            return;
        }
        if (p0 || onAddQueueItem()) {
            this.onPlayFromMediaId = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onRemoveQueueItemAt().addObserverForBackInvoker();
            _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
            int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                setPropertyNamingStrategy onPrepareFromMediaId = _assertnotnullArr[i].getAccessaddObserverForBackInvoker().getOnPrepareFromMediaId();
                toMagicModuleMetaRepoModel.write(onPrepareFromMediaId);
                onPrepareFromMediaId.write(true);
            }
        }
    }

    @Override // kotlin.KeyDeserializer
    public final Map<weirdNumberException, Integer> RemoteActionCompatParcelizer() {
        if (!this.MediaDescriptionCompat) {
            if (onSetPlaybackSpeed() == _assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
                getOnPlayFromSearch().read(true);
                if (getOnPlayFromSearch().getIconCompatParcelizer()) {
                    this.read.onSeekTo();
                }
            } else {
                getOnPlayFromSearch().AudioAttributesCompatParcelizer(true);
            }
        }
        readerFor write = write().getAudioAttributesCompatParcelizer();
        if (write != null) {
            write.RemoteActionCompatParcelizer(true);
        }
        MediaBrowserCompatCustomActionResultReceiver();
        readerFor write2 = write().getAudioAttributesCompatParcelizer();
        if (write2 != null) {
            write2.RemoteActionCompatParcelizer(false);
        }
        return getOnPlayFromSearch().read();
    }

    @Override // kotlin.KeyDeserializer
    public final KeyDeserializer AudioAttributesCompatParcelizer() {
        addMixIn accessaddObserverForBackInvoker;
        _assertNotNull _assertnotnull_init_lambda4 = onRemoveQueueItemAt()._init_lambda4();
        if (_assertnotnull_init_lambda4 == null || (accessaddObserverForBackInvoker = _assertnotnull_init_lambda4.getAccessaddObserverForBackInvoker()) == null) {
            return null;
        }
        return accessaddObserverForBackInvoker.MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.KeyDeserializer
    public final void IconCompatParcelizer(getAnswerMap<? super KeyDeserializer, getShowPopup> p0) {
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onRemoveQueueItemAt().addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            KeyDeserializer keyDeserializerMediaBrowserCompatMediaItem = _assertnotnullArr[i].getAccessaddObserverForBackInvoker().MediaBrowserCompatMediaItem();
            toMagicModuleMetaRepoModel.write(keyDeserializerMediaBrowserCompatMediaItem);
            p0.invoke(keyDeserializerMediaBrowserCompatMediaItem);
        }
    }

    @Override // kotlin.KeyDeserializer
    public final void AudioAttributesImplApi21Parcelizer() {
        _assertNotNull.write$default(onRemoveQueueItemAt(), false, 1, null);
    }

    @Override // kotlin.KeyDeserializer
    public final void MediaBrowserCompatItemReceiver() {
        _assertNotNull.IconCompatParcelizer$default(onRemoveQueueItemAt(), false, false, false, 7, null);
    }

    public final void onPlayFromMediaId() {
        if (this.read.getOnPlay() > 0) {
            UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onRemoveQueueItemAt().addObserverForBackInvoker();
            _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
            int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                _assertNotNull _assertnotnull = _assertnotnullArr[i];
                addMixIn accessaddObserverForBackInvoker = _assertnotnull.getAccessaddObserverForBackInvoker();
                if ((accessaddObserverForBackInvoker.getOnPause() || accessaddObserverForBackInvoker.getOnMediaButtonEvent()) && !accessaddObserverForBackInvoker.getMediaMetadataCompat()) {
                    _assertNotNull.write$default(_assertnotnull, false, 1, null);
                }
                setPropertyNamingStrategy onPrepareFromMediaId = accessaddObserverForBackInvoker.getOnPrepareFromMediaId();
                if (onPrepareFromMediaId != null) {
                    onPrepareFromMediaId.onPlayFromMediaId();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // kotlin.isTypeOrSuperTypeOf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin._parser write(long r4) {
        /*
            r3 = this;
            o._assertNotNull r0 = r3.onRemoveQueueItemAt()
            o._assertNotNull r0 = r0._init_lambda4()
            r1 = 0
            if (r0 == 0) goto L10
            o._assertNotNull$RemoteActionCompatParcelizer r0 = r0.onSkipToQueueItem()
            goto L11
        L10:
            r0 = r1
        L11:
            o._assertNotNull$RemoteActionCompatParcelizer r2 = o._assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer
            if (r0 == r2) goto L27
            o._assertNotNull r0 = r3.onRemoveQueueItemAt()
            o._assertNotNull r0 = r0._init_lambda4()
            if (r0 == 0) goto L23
            o._assertNotNull$RemoteActionCompatParcelizer r1 = r0.onSkipToQueueItem()
        L23:
            o._assertNotNull$RemoteActionCompatParcelizer r0 = o._assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer
            if (r1 != r0) goto L2d
        L27:
            o.addMixIn r0 = r3.read
            r1 = 0
            r0.RemoteActionCompatParcelizer(r1)
        L2d:
            o._assertNotNull r0 = r3.onRemoveQueueItemAt()
            r3.write(r0)
            o._assertNotNull r0 = r3.onRemoveQueueItemAt()
            o._assertNotNull$MediaBrowserCompatCustomActionResultReceiver r0 = r0.get_init_lambda3()
            o._assertNotNull$MediaBrowserCompatCustomActionResultReceiver r1 = o._assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer
            if (r0 != r1) goto L47
            o._assertNotNull r0 = r3.onRemoveQueueItemAt()
            r0.onCommand()
        L47:
            r3.IconCompatParcelizer(r4)
            o._parser r3 = (kotlin._parser) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPropertyNamingStrategy.write(long):o._parser");
    }

    private final void write(_assertNotNull p0) {
        _assertNotNull.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
        _assertNotNull _assertnotnull_init_lambda4 = p0._init_lambda4();
        if (_assertnotnull_init_lambda4 != null) {
            if (this.MediaBrowserCompatCustomActionResultReceiver != _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer && !p0.getR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()) {
                reportWrongTokenException.read("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = WhenMappings.AudioAttributesCompatParcelizer[_assertnotnull_init_lambda4.onSkipToQueueItem().ordinal()];
            if (i == 1 || i == 2) {
                mediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
            } else if (i == 3 || i == 4) {
                mediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
            } else {
                StringBuilder sb = new StringBuilder("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                sb.append(_assertnotnull_init_lambda4.onSkipToQueueItem());
                throw new IllegalStateException(sb.toString());
            }
            this.MediaBrowserCompatCustomActionResultReceiver = mediaBrowserCompatCustomActionResultReceiver;
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
    }

    @Override // kotlin.withStaticTyping, kotlin.hasHandlers
    /* JADX INFO: renamed from: q_, reason: from getter */
    public final Object getOnAddQueueItem() {
        return this.onPrepareFromUri;
    }

    /* JADX INFO: renamed from: o.setPropertyNamingStrategy$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer() {
            readerFor write = setPropertyNamingStrategy.this.onSetRating().getAudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(write);
            write.write(setPropertyNamingStrategy.this.onSetCaptioningEnabled);
        }

        AnonymousClass4() {
            super(0);
        }
    }

    public final void RemoteActionCompatParcelizer(long p0) {
        AudioAttributesCompatParcelizer(_assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        AudioAttributesImplBaseParcelizer(false);
        this.onSetCaptioningEnabled = p0;
        PropertyMetadata addOnNewIntentListener = _serializerProvider.AudioAttributesCompatParcelizer(onRemoveQueueItemAt()).getAddOnNewIntentListener();
        _assertNotNull _assertnotnullOnRemoveQueueItemAt = onRemoveQueueItemAt();
        getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.onSetRepeatMode;
        getAnswerMap getanswermap = addOnNewIntentListener.read;
        addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(_assertnotnullOnRemoveQueueItemAt, (getAnswerMap<? super _assertNotNull, getShowPopup>) getanswermap, getcreatedondatems);
        onPause();
        if (configure.write(onRemoveQueueItemAt())) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPlayFromSearch();
        } else {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPrepare();
        }
        AudioAttributesCompatParcelizer(_assertNotNull.RemoteActionCompatParcelizer.IconCompatParcelizer);
    }

    public final boolean IconCompatParcelizer(long p0) throws Throwable {
        PropertyValueAny propertyValueAny;
        _assertNotNull _assertnotnullOnRemoveQueueItemAt = onRemoveQueueItemAt();
        try {
            if (onRemoveQueueItemAt().getAddOnUserLeaveHintListener()) {
                reportWrongTokenException.AudioAttributesCompatParcelizer("measure is called on a deactivated node");
            }
            _assertNotNull _assertnotnull_init_lambda4 = onRemoveQueueItemAt()._init_lambda4();
            onRemoveQueueItemAt().read(onRemoveQueueItemAt().getR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() || (_assertnotnull_init_lambda4 != null && _assertnotnull_init_lambda4.getR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()));
            if (!onRemoveQueueItemAt().PlaybackStateCompat() && (propertyValueAny = this.handleMediaPlayPauseIfPendingOnHandler) != null && PropertyValueAny.write(propertyValueAny.getRead(), p0)) {
                _configureGenerator onMediaButtonEvent = onRemoveQueueItemAt().getOnMediaButtonEvent();
                if (onMediaButtonEvent != null) {
                    onMediaButtonEvent.RemoteActionCompatParcelizer(onRemoveQueueItemAt(), true);
                }
                onRemoveQueueItemAt().getLifecycle();
                return false;
            }
            this.handleMediaPlayPauseIfPendingOnHandler = PropertyValueAny.read(p0);
            AudioAttributesImplApi26Parcelizer(p0);
            getOnPlayFromSearch().read(false);
            IconCompatParcelizer(AnonymousClass2.write);
            long jV_ = this.MediaMetadataCompat ? getIconCompatParcelizer() : getKey.read(-9223372034707292160L);
            this.MediaMetadataCompat = true;
            readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
            if (write == null) {
                reportWrongTokenException.read("Lookahead result from lookaheadRemeasure cannot be null");
            }
            this.read.IconCompatParcelizer(p0);
            long j = -1;
            MediaBrowserCompatItemReceiver(getKey.read((((long) write.getRemoteActionCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) write.getRead()) << 32)));
            return (((int) (jV_ >> 32)) == write.getRead() && ((int) jV_) == write.getRemoteActionCompatParcelizer()) ? false : true;
        } catch (Throwable th) {
            _assertnotnullOnRemoveQueueItemAt.IconCompatParcelizer(th);
            throw new PlanDetailsCreator();
        }
    }

    /* JADX INFO: renamed from: o.setPropertyNamingStrategy$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/KeyDeserializer;", "p0", "", "IconCompatParcelizer", "(Lo/KeyDeserializer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<KeyDeserializer, getShowPopup> {
        public static final AnonymousClass2 write = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(KeyDeserializer keyDeserializer) {
            IconCompatParcelizer(keyDeserializer);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(KeyDeserializer keyDeserializer) {
            keyDeserializer.getOnPlayFromSearch().write(false);
        }

        AnonymousClass2() {
            super(1);
        }
    }

    @Override // kotlin._parser
    public final void RemoteActionCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2) throws Throwable {
        AudioAttributesCompatParcelizer(p0, p1, p2, null);
    }

    @Override // kotlin._parser
    public final void read(long p0, float p1, hasAnyGetter p2) throws Throwable {
        AudioAttributesCompatParcelizer(p0, p1, null, p2);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.onSetRating = z;
    }

    @Override // kotlin.ObjectMapper1
    public final void IconCompatParcelizer(boolean p0) {
        readerFor write;
        readerFor write2 = onSetRating().getAudioAttributesCompatParcelizer();
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Boolean.valueOf(p0), write2 != null ? Boolean.valueOf(write2.getMediaBrowserCompatItemReceiver()) : null) && (write = onSetRating().getAudioAttributesCompatParcelizer()) != null) {
            write.AudioAttributesCompatParcelizer(p0);
        }
        RemoteActionCompatParcelizer(p0);
    }

    /* JADX INFO: renamed from: o.setPropertyNamingStrategy$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        public final void write() {
            readerFor write;
            _parser.IconCompatParcelizer mediaDescriptionCompat = null;
            if (configure.write(setPropertyNamingStrategy.this.onRemoveQueueItemAt()) || setPropertyNamingStrategy.this.read.getMediaBrowserCompatItemReceiver()) {
                _bindAndClose audioAttributesImplApi26Parcelizer = setPropertyNamingStrategy.this.onSetRating().getAudioAttributesImplApi26Parcelizer();
                if (audioAttributesImplApi26Parcelizer != null) {
                    mediaDescriptionCompat = audioAttributesImplApi26Parcelizer.getMediaDescriptionCompat();
                }
            } else {
                _bindAndClose audioAttributesImplApi26Parcelizer2 = setPropertyNamingStrategy.this.onSetRating().getAudioAttributesImplApi26Parcelizer();
                if (audioAttributesImplApi26Parcelizer2 != null && (write = audioAttributesImplApi26Parcelizer2.getAudioAttributesCompatParcelizer()) != null) {
                    mediaDescriptionCompat = write.getMediaDescriptionCompat();
                }
            }
            if (mediaDescriptionCompat == null) {
                mediaDescriptionCompat = _serializerProvider.AudioAttributesCompatParcelizer(setPropertyNamingStrategy.this.onRemoveQueueItemAt()).onPause();
            }
            setPropertyNamingStrategy setpropertynamingstrategy = setPropertyNamingStrategy.this;
            readerFor write2 = setpropertynamingstrategy.onSetRating().getAudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(write2);
            _parser.IconCompatParcelizer.write$default(mediaDescriptionCompat, write2, setpropertynamingstrategy.onCustomAction, BitmapDescriptorFactory.HUE_RED, 2, null);
        }

        AnonymousClass1() {
            super(0);
        }
    }

    private final void AudioAttributesCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2, hasAnyGetter p3) throws Throwable {
        _assertNotNull _assertnotnullOnRemoveQueueItemAt = onRemoveQueueItemAt();
        try {
            _assertNotNull _assertnotnull_init_lambda4 = onRemoveQueueItemAt()._init_lambda4();
            if ((_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.onSkipToQueueItem() : null) == _assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
                this.read.AudioAttributesCompatParcelizer(false);
            }
            if (onRemoveQueueItemAt().getAddOnUserLeaveHintListener()) {
                reportWrongTokenException.AudioAttributesCompatParcelizer("place is called on a deactivated node");
            }
            AudioAttributesCompatParcelizer(_assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
            this.MediaBrowserCompatMediaItem = true;
            this.onSkipToNext = false;
            if (!hasReferringProperties.write(p0, this.onCustomAction)) {
                if (this.read.getOnMediaButtonEvent() || this.read.getOnPause()) {
                    AudioAttributesImplApi21Parcelizer(true);
                }
                onPlayFromMediaId();
            }
            _configureGenerator _configuregeneratorAudioAttributesCompatParcelizer = _serializerProvider.AudioAttributesCompatParcelizer(onRemoveQueueItemAt());
            this.onCustomAction = p0;
            if (!onRewind() && onFastForward()) {
                readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.write(write);
                write.AudioAttributesImplApi21Parcelizer(p0);
                onPrepareFromMediaId();
            } else {
                this.read.read(false);
                getOnPlayFromSearch().AudioAttributesCompatParcelizer(false);
                PropertyMetadata addOnNewIntentListener = _configuregeneratorAudioAttributesCompatParcelizer.getAddOnNewIntentListener();
                _assertNotNull _assertnotnullOnRemoveQueueItemAt2 = onRemoveQueueItemAt();
                getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.onSetPlaybackSpeed;
                addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(_assertnotnullOnRemoveQueueItemAt2, (getAnswerMap<? super _assertNotNull, getShowPopup>) addOnNewIntentListener.MediaBrowserCompatItemReceiver, getcreatedondatems);
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p1;
            this.onAddQueueItem = p2;
            this.onFastForward = p3;
            AudioAttributesCompatParcelizer(_assertNotNull.RemoteActionCompatParcelizer.IconCompatParcelizer);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } catch (Throwable th) {
            _assertnotnullOnRemoveQueueItemAt.IconCompatParcelizer(th);
            throw new PlanDetailsCreator();
        }
    }

    @Override // kotlin._parser
    public final int MediaBrowserCompatSearchResultReceiver() {
        readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write);
        return write.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin._parser
    public final int AudioAttributesImplBaseParcelizer() {
        readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write);
        return write.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.withStaticTyping
    public final int AudioAttributesCompatParcelizer(weirdNumberException p0) {
        _assertNotNull _assertnotnull_init_lambda4 = onRemoveQueueItemAt()._init_lambda4();
        if ((_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.onSkipToQueueItem() : null) == _assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
            getOnPlayFromSearch().write(true);
        } else {
            _assertNotNull _assertnotnull_init_lambda42 = onRemoveQueueItemAt()._init_lambda4();
            if ((_assertnotnull_init_lambda42 != null ? _assertnotnull_init_lambda42.onSkipToQueueItem() : null) == _assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
                getOnPlayFromSearch().RemoteActionCompatParcelizer(true);
            }
        }
        this.MediaDescriptionCompat = true;
        readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write);
        int iAudioAttributesCompatParcelizer = write.AudioAttributesCompatParcelizer(p0);
        this.MediaDescriptionCompat = false;
        return iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.hasHandlers
    public final int AudioAttributesCompatParcelizer(int p0) {
        onSkipToQueueItem();
        readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write);
        return write.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.hasHandlers
    public final int write(int p0) {
        onSkipToQueueItem();
        readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write);
        return write.write(p0);
    }

    @Override // kotlin.hasHandlers
    public final int read(int p0) {
        onSkipToQueueItem();
        readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write);
        return write.read(p0);
    }

    @Override // kotlin.hasHandlers
    public final int IconCompatParcelizer(int p0) {
        onSkipToQueueItem();
        readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write);
        return write.IconCompatParcelizer(p0);
    }

    private final void onSkipToQueueItem() {
        _assertNotNull.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
        _assertNotNull.IconCompatParcelizer$default(onRemoveQueueItemAt(), false, false, false, 7, null);
        _assertNotNull _assertnotnull_init_lambda4 = onRemoveQueueItemAt()._init_lambda4();
        if (_assertnotnull_init_lambda4 == null || onRemoveQueueItemAt().get_init_lambda3() != _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
            return;
        }
        _assertNotNull _assertnotnullOnRemoveQueueItemAt = onRemoveQueueItemAt();
        int i = WhenMappings.AudioAttributesCompatParcelizer[_assertnotnull_init_lambda4.onSkipToQueueItem().ordinal()];
        if (i == 2) {
            mediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
        } else if (i == 3) {
            mediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        } else {
            mediaBrowserCompatCustomActionResultReceiver = _assertnotnull_init_lambda4.get_init_lambda3();
        }
        _assertnotnullOnRemoveQueueItemAt.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
    }

    public final void read(boolean p0) {
        _assertNotNull _assertnotnull;
        _assertNotNull _assertnotnull_init_lambda4 = onRemoveQueueItemAt()._init_lambda4();
        _assertNotNull.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = onRemoveQueueItemAt().get_init_lambda3();
        if (_assertnotnull_init_lambda4 == null || mediaBrowserCompatCustomActionResultReceiver == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
            return;
        }
        do {
            _assertnotnull = _assertnotnull_init_lambda4;
            if (_assertnotnull.get_init_lambda3() != mediaBrowserCompatCustomActionResultReceiver) {
                break;
            } else {
                _assertnotnull_init_lambda4 = _assertnotnull._init_lambda4();
            }
        } while (_assertnotnull_init_lambda4 != null);
        int i = WhenMappings.read[mediaBrowserCompatCustomActionResultReceiver.ordinal()];
        if (i == 1) {
            if (_assertnotnull.getMediaBrowserCompatSearchResultReceiver() != null) {
                _assertNotNull.IconCompatParcelizer$default(_assertnotnull, p0, false, false, 6, null);
                return;
            } else {
                _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull, p0, false, false, 6, null);
                return;
            }
        }
        if (i == 2) {
            if (_assertnotnull.getMediaBrowserCompatSearchResultReceiver() != null) {
                _assertnotnull.write(p0);
                return;
            } else {
                _assertnotnull.AudioAttributesCompatParcelizer(p0);
                return;
            }
        }
        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
    }

    public final void onPlay() {
        this.onRewind = true;
    }

    public final boolean onPrepareFromSearch() {
        if (getOnAddQueueItem() == null) {
            readerFor write = onSetRating().getAudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(write);
            if (write.getOnAddQueueItem() == null) {
                return false;
            }
        }
        if (!this.onRewind) {
            return false;
        }
        this.onRewind = false;
        readerFor write2 = onSetRating().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(write2);
        this.onPrepareFromUri = write2.getOnAddQueueItem();
        return true;
    }

    public final void onPrepareFromMediaId() {
        this.onSkipToNext = true;
        _assertNotNull _assertnotnull_init_lambda4 = onRemoveQueueItemAt()._init_lambda4();
        if ((this.onPlayFromMediaId != AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer && !onSeekTo()) || (this.onPlayFromMediaId != AudioAttributesCompatParcelizer.read && onSeekTo())) {
            onSetCaptioningEnabled();
            if (this.AudioAttributesImplApi21Parcelizer && _assertnotnull_init_lambda4 != null) {
                _assertNotNull.write$default(_assertnotnull_init_lambda4, false, 1, null);
            }
        }
        if (_assertnotnull_init_lambda4 != null) {
            if (!this.AudioAttributesImplApi21Parcelizer && (_assertnotnull_init_lambda4.onSkipToQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.read || _assertnotnull_init_lambda4.onSkipToQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer)) {
                if (getWrite() != Integer.MAX_VALUE) {
                    reportWrongTokenException.read("Place was called on a node which was placed already");
                }
                RemoteActionCompatParcelizer(_assertnotnull_init_lambda4.getAccessaddObserverForBackInvoker().getMediaDescriptionCompat());
                addMixIn accessaddObserverForBackInvoker = _assertnotnull_init_lambda4.getAccessaddObserverForBackInvoker();
                accessaddObserverForBackInvoker.IconCompatParcelizer(accessaddObserverForBackInvoker.getMediaDescriptionCompat() + 1);
            }
        } else {
            RemoteActionCompatParcelizer(0);
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrepareFromUri() {
        this.read.IconCompatParcelizer(0);
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onRemoveQueueItemAt().addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            setPropertyNamingStrategy onPrepareFromMediaId = _assertnotnullArr[i].getAccessaddObserverForBackInvoker().getOnPrepareFromMediaId();
            toMagicModuleMetaRepoModel.write(onPrepareFromMediaId);
            onPrepareFromMediaId.MediaBrowserCompatItemReceiver = onPrepareFromMediaId.getWrite();
            onPrepareFromMediaId.RemoteActionCompatParcelizer(Integer.MAX_VALUE);
            if (onPrepareFromMediaId.MediaBrowserCompatCustomActionResultReceiver == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
                onPrepareFromMediaId.MediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            }
        }
    }

    private final void onSetCaptioningEnabled() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onPlayFromMediaId;
        if (onSeekTo()) {
            this.onPlayFromMediaId = AudioAttributesCompatParcelizer.read;
        } else {
            this.onPlayFromMediaId = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        }
        if (audioAttributesCompatParcelizer != AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer && this.read.getRatingCompat()) {
            _assertNotNull.IconCompatParcelizer$default(onRemoveQueueItemAt(), true, false, false, 6, null);
        }
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onRemoveQueueItemAt().addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer2 = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer2; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = _assertnotnull.MediaSessionCompatToken();
            if (setpropertynamingstrategyMediaSessionCompatToken == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.".toString());
            }
            if (setpropertynamingstrategyMediaSessionCompatToken.getWrite() != Integer.MAX_VALUE) {
                setpropertynamingstrategyMediaSessionCompatToken.onSetCaptioningEnabled();
                _assertnotnull.write(_assertnotnull);
            }
        }
    }

    private final void onSetRepeatMode() {
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onRemoveQueueItemAt().addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (_assertnotnull.PlaybackStateCompat() && _assertnotnull.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer) {
                setPropertyNamingStrategy onPrepareFromMediaId = _assertnotnull.getAccessaddObserverForBackInvoker().getOnPrepareFromMediaId();
                toMagicModuleMetaRepoModel.write(onPrepareFromMediaId);
                PropertyValueAny propertyValueAnyMediaBrowserCompatSearchResultReceiver = _assertnotnull.getAccessaddObserverForBackInvoker().MediaBrowserCompatSearchResultReceiver();
                toMagicModuleMetaRepoModel.write(propertyValueAnyMediaBrowserCompatSearchResultReceiver);
                if (onPrepareFromMediaId.IconCompatParcelizer(propertyValueAnyMediaBrowserCompatSearchResultReceiver.getRead())) {
                    _assertNotNull.IconCompatParcelizer$default(onRemoveQueueItemAt(), false, false, false, 7, null);
                }
            }
        }
    }

    public final void onPlayFromSearch() {
        _assertNotNull _assertnotnull_init_lambda4;
        try {
            this.AudioAttributesImplApi21Parcelizer = true;
            if (!this.MediaBrowserCompatMediaItem) {
                reportWrongTokenException.read("replace() called on item that was not placed");
            }
            this.onSkipToNext = false;
            boolean zOnFastForward = onFastForward();
            AudioAttributesCompatParcelizer(this.onCustomAction, BitmapDescriptorFactory.HUE_RED, this.onAddQueueItem, this.onFastForward);
            if (zOnFastForward && !this.onSkipToNext && (_assertnotnull_init_lambda4 = onRemoveQueueItemAt()._init_lambda4()) != null) {
                _assertNotNull.write$default(_assertnotnull_init_lambda4, false, 1, null);
            }
        } finally {
            this.AudioAttributesImplApi21Parcelizer = false;
        }
    }

    public final void onPlayFromUri() {
        RemoteActionCompatParcelizer(Integer.MAX_VALUE);
        this.MediaBrowserCompatItemReceiver = Integer.MAX_VALUE;
        this.onPlayFromMediaId = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    public final void onPrepare() {
        this.onPlayFromMediaId = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoveQueueItem() {
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onRemoveQueueItemAt().addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            setPropertyNamingStrategy onPrepareFromMediaId = _assertnotnullArr[i].getAccessaddObserverForBackInvoker().getOnPrepareFromMediaId();
            toMagicModuleMetaRepoModel.write(onPrepareFromMediaId);
            if (onPrepareFromMediaId.MediaBrowserCompatItemReceiver != onPrepareFromMediaId.getWrite() && onPrepareFromMediaId.getWrite() == Integer.MAX_VALUE) {
                onPrepareFromMediaId.write(true);
            }
        }
    }
}
