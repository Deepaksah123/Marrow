package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin._assertNotNull;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001bH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001dJ5\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0018\u00010!H\u0014¢\u0006\u0004\b\u0016\u0010$J'\u0010&\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)J?\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0018\u00010!2\b\u0010*\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b\u0019\u0010+J?\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0018\u00010!2\b\u0010*\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b\u0013\u0010+J\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010\u000bJ\u0017\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u0019\u0010-J\u0017\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u0013\u0010-J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010-J\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001cH\u0016¢\u0006\u0004\b(\u0010-J\u000f\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010\u000bJ\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\u0015¢\u0006\u0004\b0\u00101J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c02H\u0016¢\u0006\u0004\b\u0016\u00103J#\u0010(\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0!H\u0016¢\u0006\u0004\b(\u00104J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u000bJ\u000f\u00106\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u0010\u000bJ\r\u00107\u001a\u00020\t¢\u0006\u0004\b7\u0010\u000bJ\u000f\u00108\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010)J\r\u00109\u001a\u00020\t¢\u0006\u0004\b9\u0010\u000bJ\r\u0010:\u001a\u00020\t¢\u0006\u0004\b:\u0010\u000bJ\u000f\u0010;\u001a\u00020\tH\u0000¢\u0006\u0004\b;\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010(\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010>R\u001e\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010?R$\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001c8\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010>R\u001e\u00106\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00158\u0006@BX\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u0013\u00105\u001a\u0004\u0018\u00010\u00128G¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010\f\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\bE\u0010FR\"\u0010M\u001a\u00020G8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\b\u0016\u0010LR\u0016\u0010@\u001a\u00020\u00158\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u0019\u0010>R\u001e\u0010O\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u001e8\u0000@BX\u0081\u000e¢\u0006\u0006\n\u0004\b&\u0010NR$\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010S\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010>R(\u0010H\u001a\u0004\u0018\u00010W2\b\u0010\u0006\u001a\u0004\u0018\u00010W8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b/\u0010X\u001a\u0004\bY\u0010ZR\u0016\u0010E\u001a\u0004\u0018\u00010[8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\"\u0010_\u001a\u00020\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b6\u0010>\u001a\u0004\b^\u00101\"\u0004\b&\u0010)R\u001c\u0010a\u001a\u00020\u00158\u0007@@X\u0087\f¢\u0006\f\n\u0004\bM\u0010>\u001a\u0004\b`\u00101R$\u0010<\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00158\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\b<\u00101R$\u0010J\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00158\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b_\u0010>\u001a\u0004\ba\u00101R\u0016\u0010b\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010>R$\u0010V\u001a\u00020c2\u0006\u0010\u0006\u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010d\"\u0004\b\u0013\u0010eR\u0011\u0010B\u001a\u00020f8G¢\u0006\u0006\u001a\u0004\bV\u0010gR\u0014\u0010/\u001a\u00020f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010gR\u001a\u0010:\u001a\u00020h8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b@\u0010i\u001a\u0004\b(\u0010jR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000k8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010lR\u001c\u0010`\u001a\u00020\u00158\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\f\u0010>\"\u0004\b\u0016\u0010)R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000m8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010nR$\u0010;\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00158\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bU\u0010>\u001a\u0004\b_\u00101R\u0016\u0010,\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010NR \u00100\u001a\b\u0012\u0004\u0012\u00020\t0o8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b^\u0010p\u001a\u0004\bb\u0010qR\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\t0o8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010pR$\u0010\u0010\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u001f8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b,\u0010T\u001a\u0004\bB\u0010rR\u0016\u00107\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010>R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010PR\u0018\u0010\u000e\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010RR\u0016\u0010\\\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010NR\u0016\u0010\r\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010TR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0o8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b`\u0010pR\u0014\u0010s\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010AR\u0014\u0010t\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010AR\u0016\u0010u\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010>R\u001c\u00108\u001a\u00020\u00158\u0016@\u0017X\u0097\u000e¢\u0006\f\n\u0004\b5\u0010>\"\u0004\b\u0019\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010v"}, d2 = {"Lo/getSubtypeResolver;", "Lo/isTypeOrSuperTypeOf;", "Lo/_parser;", "Lo/KeyDeserializer;", "Lo/ObjectMapper1;", "Lo/addMixIn;", "p0", "<init>", "(Lo/addMixIn;)V", "", "onPrepareFromSearch", "()V", "MediaBrowserCompatCustomActionResultReceiver", "onSetShuffleMode", "onSetCaptioningEnabled", "onSetRating", "onSeekTo", "onSetRepeatMode", "Lo/PropertyValueAny;", "write", "(J)Lo/_parser;", "", "RemoteActionCompatParcelizer", "(J)Z", "Lo/_assertNotNull;", "AudioAttributesCompatParcelizer", "(Lo/_assertNotNull;)V", "Lo/weirdNumberException;", "", "(Lo/weirdNumberException;)I", "Lo/hasReferringProperties;", "", "p1", "Lkotlin/Function1;", "Lo/validateAppend;", "p2", "(JFLo/getAnswerMap;)V", "Lo/hasAnyGetter;", "read", "(JFLo/hasAnyGetter;)V", "IconCompatParcelizer", "(Z)V", "p3", "(JFLo/getAnswerMap;Lo/hasAnyGetter;)V", "onRewind", "(I)I", "onSkipToNext", "onFastForward", "onRemoveQueueItem", "()Z", "", "()Ljava/util/Map;", "(Lo/getAnswerMap;)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "onPrepareFromUri", "onSkipToQueueItem", "onRemoveQueueItemAt", "onPlayFromSearch", "onPrepare", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/addMixIn;", "Z", "I", "AudioAttributesImplApi26Parcelizer", "()I", "onPause", "MediaMetadataCompat", "()Lo/PropertyValueAny;", "onCustomAction", "()Lo/_assertNotNull;", "Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "onAddQueueItem", "Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "onMediaButtonEvent", "()Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "(Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;)V", "AudioAttributesImplBaseParcelizer", "J", "MediaBrowserCompatMediaItem", "Lo/getAnswerMap;", "MediaBrowserCompatSearchResultReceiver", "Lo/hasAnyGetter;", "RatingCompat", "F", "MediaDescriptionCompat", "onPlay", "", "Ljava/lang/Object;", "q_", "()Ljava/lang/Object;", "Lo/setPropertyNamingStrategy;", "onSetPlaybackSpeed", "()Lo/setPropertyNamingStrategy;", "onPrepareFromMediaId", "onCommand", "onPlayFromUri", "handleMediaPlayPauseIfPendingOnHandler", "onPlayFromMediaId", "Lo/_assertNotNull$RemoteActionCompatParcelizer;", "()Lo/_assertNotNull$RemoteActionCompatParcelizer;", "(Lo/_assertNotNull$RemoteActionCompatParcelizer;)V", "Lo/_bindAndClose;", "()Lo/_bindAndClose;", "Lo/properties;", "Lo/properties;", "()Lo/properties;", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "", "()Ljava/util/List;", "Lkotlin/Function0;", "Lo/getCreatedOnDateMs;", "()Lo/getCreatedOnDateMs;", "()F", "onSkipToPrevious", "onStop", "setSessionImpl", "()Lo/KeyDeserializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSubtypeResolver extends _parser implements KeyDeserializer, ObjectMapper1 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean onSkipToQueueItem;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean onCommand;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private getAnswerMap<? super validateAppend, getShowPopup> MediaMetadataCompat;
    private hasAnyGetter MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final addMixIn RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private boolean onPrepare;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private float MediaDescriptionCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private boolean onPlayFromMediaId;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private boolean onMediaButtonEvent;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private Object onAddQueueItem;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private boolean onPrepareFromUri;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private boolean setSessionImpl;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private hasAnyGetter onSetCaptioningEnabled;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private getAnswerMap<? super validateAppend, getShowPopup> onSetRating;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private float onSeekTo;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private float onSetShuffleMode;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public int AudioAttributesCompatParcelizer = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private int write = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private _assertNotNull.MediaBrowserCompatCustomActionResultReceiver AudioAttributesImplBaseParcelizer = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public long MediaBrowserCompatMediaItem = hasReferringProperties.INSTANCE.write();

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private boolean RatingCompat = true;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final properties onPlayFromSearch = new _writeValueAndClose(this);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<getSubtypeResolver> onPrepareFromSearch = new UTF32Reader<>(new getSubtypeResolver[16], 0);

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean onPlayFromUri = true;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private long onRewind = PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> onRemoveQueueItem = new AnonymousClass3();

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> onRemoveQueueItemAt = new AnonymousClass5();

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private long onSetPlaybackSpeed = hasReferringProperties.INSTANCE.write();

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> onSetRepeatMode = new AnonymousClass1();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[_assertNotNull.RemoteActionCompatParcelizer.values().length];
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_assertNotNull.RemoteActionCompatParcelizer.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            RemoteActionCompatParcelizer = iArr;
            int[] iArr2 = new int[_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.values().length];
            try {
                iArr2[_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr2;
        }
    }

    public getSubtypeResolver(addMixIn addmixin) {
        this.RemoteActionCompatParcelizer = addmixin;
    }

    @Override // kotlin.KeyDeserializer
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.write;
    }

    public final PropertyValueAny MediaMetadataCompat() {
        if (this.read) {
            return PropertyValueAny.read(getAudioAttributesImplApi21Parcelizer());
        }
        return null;
    }

    public final _assertNotNull onCustomAction() {
        return this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(_assertNotNull.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        this.AudioAttributesImplBaseParcelizer = mediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final _assertNotNull.MediaBrowserCompatCustomActionResultReceiver getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.withStaticTyping, kotlin.hasHandlers
    /* JADX INFO: renamed from: q_, reason: from getter */
    public final Object getOnPrepareFromUri() {
        return this.onAddQueueItem;
    }

    private final setPropertyNamingStrategy onSetPlaybackSpeed() {
        return this.RemoteActionCompatParcelizer.getOnPrepareFromMediaId();
    }

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
    public final boolean getOnCommand() {
        return this.onCommand;
    }

    public final void read(boolean z) {
        this.onCommand = z;
    }

    /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
    public final boolean getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final boolean getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    public final _assertNotNull.RemoteActionCompatParcelizer onAddQueueItem() {
        return this.RemoteActionCompatParcelizer.getAudioAttributesImplApi21Parcelizer();
    }

    public final void write(_assertNotNull.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(remoteActionCompatParcelizer);
    }

    public final _bindAndClose onPlay() {
        return this.RemoteActionCompatParcelizer.onPrepareFromSearch();
    }

    @Override // kotlin.KeyDeserializer
    public final _bindAndClose write() {
        return onCustomAction().onPrepareFromUri();
    }

    @Override // kotlin.KeyDeserializer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final properties getOnPause() {
        return this.onPlayFromSearch;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.onPlayFromUri = z;
    }

    public final List<getSubtypeResolver> RatingCompat() {
        onCustomAction().getViewModelStore();
        if (!this.onPlayFromUri) {
            return this.onPrepareFromSearch.read();
        }
        _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
        UTF32Reader<getSubtypeResolver> uTF32Reader = this.onPrepareFromSearch;
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = _assertnotnullOnCustomAction.addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (uTF32Reader.getAudioAttributesCompatParcelizer() <= i) {
                uTF32Reader.read(_assertnotnull.getAccessaddObserverForBackInvoker().getOnFastForward());
            } else {
                uTF32Reader.AudioAttributesCompatParcelizer(i, _assertnotnull.getAccessaddObserverForBackInvoker().getOnFastForward());
            }
        }
        uTF32Reader.read(_assertnotnullOnCustomAction.onPause().size(), uTF32Reader.getAudioAttributesCompatParcelizer());
        this.onPlayFromUri = false;
        return this.onPrepareFromSearch.read();
    }

    public final void onPrepareFromSearch() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(true);
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getOnPrepare() {
        return this.onPrepare;
    }

    /* JADX INFO: renamed from: o.getSubtypeResolver$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer() {
            getSubtypeResolver.this.onPlay().write(getSubtypeResolver.this.onRewind);
        }

        AnonymousClass3() {
            super(0);
        }
    }

    public final getCreatedOnDateMs<getShowPopup> onPlayFromMediaId() {
        return this.onRemoveQueueItem;
    }

    /* JADX INFO: renamed from: o.getSubtypeResolver$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.getSubtypeResolver$5$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/KeyDeserializer;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/KeyDeserializer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<KeyDeserializer, getShowPopup> {
            public static final AnonymousClass3 AudioAttributesCompatParcelizer = new AnonymousClass3();

            public final void AudioAttributesCompatParcelizer(KeyDeserializer keyDeserializer) {
                keyDeserializer.getOnPause().RemoteActionCompatParcelizer(false);
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(KeyDeserializer keyDeserializer) {
                AudioAttributesCompatParcelizer(keyDeserializer);
                return getShowPopup.INSTANCE;
            }

            AnonymousClass3() {
                super(1);
            }
        }

        public final void AudioAttributesCompatParcelizer() {
            getSubtypeResolver.this.onSetRepeatMode();
            getSubtypeResolver.this.IconCompatParcelizer(AnonymousClass3.AudioAttributesCompatParcelizer);
            if (getSubtypeResolver.this.write().getMediaBrowserCompatMediaItem()) {
                List<_assertNotNull> listOnPause = getSubtypeResolver.this.onCustomAction().onPause();
                int size = listOnPause.size();
                for (int i = 0; i < size; i++) {
                    listOnPause.get(i).r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().RemoteActionCompatParcelizer(true);
                }
            }
            getSubtypeResolver.this.write().onMediaButtonEvent().onMediaButtonEvent();
            if (getSubtypeResolver.this.write().getMediaBrowserCompatMediaItem()) {
                List<_assertNotNull> listOnPause2 = getSubtypeResolver.this.onCustomAction().onPause();
                int size2 = listOnPause2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    listOnPause2.get(i2).r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().RemoteActionCompatParcelizer(false);
                }
            }
            getSubtypeResolver.this.onSetShuffleMode();
            getSubtypeResolver.this.IconCompatParcelizer(C01075.write);
        }

        /* JADX INFO: renamed from: o.getSubtypeResolver$5$5, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/KeyDeserializer;", "p0", "", "read", "(Lo/KeyDeserializer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C01075 extends MagicModuleUseCase implements getAnswerMap<KeyDeserializer, getShowPopup> {
            public static final C01075 write = new C01075();

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(KeyDeserializer keyDeserializer) {
                read(keyDeserializer);
                return getShowPopup.INSTANCE;
            }

            public final void read(KeyDeserializer keyDeserializer) {
                keyDeserializer.getOnPause().IconCompatParcelizer(keyDeserializer.getOnPause().getRemoteActionCompatParcelizer());
            }

            C01075() {
                super(1);
            }
        }

        AnonymousClass5() {
            super(0);
        }
    }

    @Override // kotlin.KeyDeserializer
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.onPrepare = true;
        getOnPause().MediaBrowserCompatCustomActionResultReceiver();
        if (this.onMediaButtonEvent) {
            onSkipToQueueItem();
        }
        if (this.onPlayFromMediaId || (!this.AudioAttributesImplApi26Parcelizer && !write().getMediaBrowserCompatMediaItem() && this.onMediaButtonEvent)) {
            this.onMediaButtonEvent = false;
            _assertNotNull.RemoteActionCompatParcelizer remoteActionCompatParcelizerOnAddQueueItem = onAddQueueItem();
            write(_assertNotNull.RemoteActionCompatParcelizer.read);
            this.RemoteActionCompatParcelizer.write(false);
            _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
            PropertyMetadata addOnNewIntentListener = _serializerProvider.AudioAttributesCompatParcelizer(_assertnotnullOnCustomAction).getAddOnNewIntentListener();
            getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.onRemoveQueueItemAt;
            getAnswerMap getanswermap = addOnNewIntentListener.write;
            addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(_assertnotnullOnCustomAction, (getAnswerMap<? super _assertNotNull, getShowPopup>) getanswermap, getcreatedondatems);
            write(remoteActionCompatParcelizerOnAddQueueItem);
            this.onPlayFromMediaId = false;
        }
        if (getOnPause().getRemoteActionCompatParcelizer()) {
            getOnPause().IconCompatParcelizer(true);
        }
        if (getOnPause().getIconCompatParcelizer() && getOnPause().AudioAttributesCompatParcelizer()) {
            getOnPause().AudioAttributesImplApi26Parcelizer();
        }
        this.onPrepare = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetShuffleMode() {
        _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = _assertnotnullOnCustomAction.addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (_assertnotnull.ParcelableVolumeInfo().AudioAttributesCompatParcelizer != _assertnotnull.accessaddObserverForBackInvoker()) {
                _assertnotnullOnCustomAction.getOnBackPressedDispatcher();
                _assertnotnullOnCustomAction.ensureViewModelStore();
                if (_assertnotnull.accessaddObserverForBackInvoker() == Integer.MAX_VALUE) {
                    if (_assertnotnull.getAccessaddObserverForBackInvoker().getMediaBrowserCompatItemReceiver() || configure.write(_assertnotnull)) {
                        setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = _assertnotnull.MediaSessionCompatToken();
                        toMagicModuleMetaRepoModel.write(setpropertynamingstrategyMediaSessionCompatToken);
                        setpropertynamingstrategyMediaSessionCompatToken.write(false);
                    }
                    _assertnotnull.ParcelableVolumeInfo().onSetCaptioningEnabled();
                }
            }
        }
    }

    private final void onSetCaptioningEnabled() {
        if (this.onCommand) {
            this.onCommand = false;
            _serializerProvider.AudioAttributesCompatParcelizer(onCustomAction()).getAddObserverForBackInvokerlambda7().IconCompatParcelizer(onCustomAction());
            _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
            _bindAndClose read = _assertnotnullOnCustomAction.onPrepareFromUri().getRead();
            for (_bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _assertnotnullOnCustomAction.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(); !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, read) && _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != null; _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getRead()) {
                _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8._init_lambda3();
                _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onCustomAction().addObserverForBackInvoker();
            _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
            int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                _assertnotnullArr[i].ParcelableVolumeInfo().onSetCaptioningEnabled();
            }
        }
    }

    private final void onSetRating() {
        boolean z = this.onCommand;
        this.onCommand = true;
        _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
        if (!z) {
            _assertnotnullOnCustomAction.onPrepareFromUri()._init_lambda2();
            _serializerProvider.AudioAttributesCompatParcelizer(_assertnotnullOnCustomAction).getAddObserverForBackInvokerlambda7().RemoteActionCompatParcelizer(onCustomAction(), true);
            if (_assertnotnullOnCustomAction.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnullOnCustomAction, true, false, false, 6, null);
            } else if (_assertnotnullOnCustomAction.PlaybackStateCompat()) {
                _assertNotNull.IconCompatParcelizer$default(_assertnotnullOnCustomAction, true, false, false, 6, null);
            }
        }
        _bindAndClose read = _assertnotnullOnCustomAction.onPrepareFromUri().getRead();
        for (_bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _assertnotnullOnCustomAction.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(); !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, read) && _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != null; _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getRead()) {
            if (_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getOnStop()) {
                _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
            }
        }
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = _assertnotnullOnCustomAction.addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (_assertnotnull.accessaddObserverForBackInvoker() != Integer.MAX_VALUE) {
                _assertnotnull.ParcelableVolumeInfo().onSetRating();
                _assertnotnullOnCustomAction.write(_assertnotnull);
            }
        }
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final float getOnSeekTo() {
        return this.onSeekTo;
    }

    /* JADX INFO: renamed from: o.getSubtypeResolver$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            _parser.IconCompatParcelizer iconCompatParcelizerOnPause;
            _bindAndClose audioAttributesImplApi26Parcelizer = getSubtypeResolver.this.onPlay().getAudioAttributesImplApi26Parcelizer();
            if (audioAttributesImplApi26Parcelizer == null || (iconCompatParcelizerOnPause = audioAttributesImplApi26Parcelizer.getMediaDescriptionCompat()) == null) {
                iconCompatParcelizerOnPause = _serializerProvider.AudioAttributesCompatParcelizer(getSubtypeResolver.this.onCustomAction()).onPause();
            }
            _parser.IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerOnPause;
            getSubtypeResolver getsubtyperesolver = getSubtypeResolver.this;
            getAnswerMap<? super validateAppend, getShowPopup> getanswermap = getsubtyperesolver.onSetRating;
            hasAnyGetter hasanygetter = getsubtyperesolver.onSetCaptioningEnabled;
            if (hasanygetter != null) {
                iconCompatParcelizer.IconCompatParcelizer(getsubtyperesolver.onPlay(), getsubtyperesolver.onSetPlaybackSpeed, hasanygetter, getsubtyperesolver.onSetShuffleMode);
            } else if (getanswermap == null) {
                iconCompatParcelizer.write(getsubtyperesolver.onPlay(), getsubtyperesolver.onSetPlaybackSpeed, getsubtyperesolver.onSetShuffleMode);
            } else {
                iconCompatParcelizer.read(getsubtyperesolver.onPlay(), getsubtyperesolver.onSetPlaybackSpeed, getsubtyperesolver.onSetShuffleMode, getanswermap);
            }
        }

        AnonymousClass1() {
            super(0);
        }
    }

    public final void onSeekTo() {
        this.onPrepareFromUri = true;
        _assertNotNull _assertnotnull_init_lambda4 = onCustomAction()._init_lambda4();
        float onPlayFromUri = write().getOnPlayFromUri();
        _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
        _bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _assertnotnullOnCustomAction.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        _bindAndClose _bindandcloseOnPrepareFromUri = _assertnotnullOnCustomAction.onPrepareFromUri();
        while (_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != _bindandcloseOnPrepareFromUri) {
            toMagicModuleMetaRepoModel.read(_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, "");
            _findRootDeserializer _findrootdeserializer = (_findRootDeserializer) _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
            onPlayFromUri += _findrootdeserializer.getOnPlayFromUri();
            _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _findrootdeserializer.getRead();
        }
        if (onPlayFromUri != this.onSeekTo) {
            this.onSeekTo = onPlayFromUri;
            if (_assertnotnull_init_lambda4 != null) {
                _assertnotnull_init_lambda4.getOnBackPressedDispatcher();
            }
            if (_assertnotnull_init_lambda4 != null) {
                _assertnotnull_init_lambda4.ensureViewModelStore();
            }
        }
        if (!write().getMediaBrowserCompatMediaItem()) {
            boolean z = this.onCommand;
            if (!z || getOnPause().write()) {
                onSetRating();
            }
            if (!z) {
                if (_assertnotnull_init_lambda4 != null) {
                    _assertnotnull_init_lambda4.ensureViewModelStore();
                }
                if (this.IconCompatParcelizer && _assertnotnull_init_lambda4 != null) {
                    _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull_init_lambda4, false, 1, null);
                }
            } else {
                onCustomAction().onPrepareFromUri()._init_lambda2();
            }
        }
        if (_assertnotnull_init_lambda4 != null) {
            if (!this.IconCompatParcelizer && _assertnotnull_init_lambda4.onSkipToQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.read) {
                if (getAudioAttributesImplBaseParcelizer() != Integer.MAX_VALUE) {
                    reportWrongTokenException.read("Place was called on a node which was placed already");
                }
                this.write = _assertnotnull_init_lambda4.getAccessaddObserverForBackInvoker().getOnCommand();
                addMixIn accessaddObserverForBackInvoker = _assertnotnull_init_lambda4.getAccessaddObserverForBackInvoker();
                accessaddObserverForBackInvoker.RemoteActionCompatParcelizer(accessaddObserverForBackInvoker.getOnCommand() + 1);
            }
        } else {
            this.write = 0;
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetRepeatMode() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0);
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onCustomAction().addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            getSubtypeResolver getsubtyperesolverParcelableVolumeInfo = _assertnotnullArr[i].ParcelableVolumeInfo();
            getsubtyperesolverParcelableVolumeInfo.AudioAttributesCompatParcelizer = getsubtyperesolverParcelableVolumeInfo.getAudioAttributesImplBaseParcelizer();
            getsubtyperesolverParcelableVolumeInfo.write = Integer.MAX_VALUE;
            getsubtyperesolverParcelableVolumeInfo.handleMediaPlayPauseIfPendingOnHandler = false;
            if (getsubtyperesolverParcelableVolumeInfo.AudioAttributesImplBaseParcelizer == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
                getsubtyperesolverParcelableVolumeInfo.AudioAttributesImplBaseParcelizer = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            }
        }
    }

    @Override // kotlin.isTypeOrSuperTypeOf
    public final _parser write(long p0) throws Throwable {
        if (onCustomAction().get_init_lambda3() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
            onCustomAction().onCommand();
        }
        if (configure.write(onCustomAction())) {
            setPropertyNamingStrategy setpropertynamingstrategyOnSetPlaybackSpeed = onSetPlaybackSpeed();
            toMagicModuleMetaRepoModel.write(setpropertynamingstrategyOnSetPlaybackSpeed);
            setpropertynamingstrategyOnSetPlaybackSpeed.write(_assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
            setpropertynamingstrategyOnSetPlaybackSpeed.write(p0);
        }
        AudioAttributesCompatParcelizer(onCustomAction());
        RemoteActionCompatParcelizer(p0);
        return this;
    }

    public final boolean RemoteActionCompatParcelizer(long p0) throws Throwable {
        _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
        try {
            if (onCustomAction().getAddOnUserLeaveHintListener()) {
                reportWrongTokenException.AudioAttributesCompatParcelizer("measure is called on a deactivated node");
            }
            _configureGenerator _configuregeneratorAudioAttributesCompatParcelizer = _serializerProvider.AudioAttributesCompatParcelizer(onCustomAction());
            _assertNotNull _assertnotnull_init_lambda4 = onCustomAction()._init_lambda4();
            boolean z = true;
            onCustomAction().read(onCustomAction().getR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() || (_assertnotnull_init_lambda4 != null && _assertnotnull_init_lambda4.getR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()));
            if (!onCustomAction().r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() && PropertyValueAny.write(getAudioAttributesImplApi21Parcelizer(), p0)) {
                _configureGenerator.RemoteActionCompatParcelizer$default(_configuregeneratorAudioAttributesCompatParcelizer, onCustomAction(), false, 2, null);
                onCustomAction().getLifecycle();
                return false;
            }
            getOnPause().read(false);
            IconCompatParcelizer(AnonymousClass4.IconCompatParcelizer);
            this.read = true;
            long jWrite = onPlay().write();
            AudioAttributesImplApi26Parcelizer(p0);
            if (onAddQueueItem() != _assertNotNull.RemoteActionCompatParcelizer.IconCompatParcelizer) {
                reportWrongTokenException.read("layout state is not idle before measure starts");
            }
            this.onRewind = p0;
            write(_assertNotNull.RemoteActionCompatParcelizer.write);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
            PropertyMetadata addOnNewIntentListener = _serializerProvider.AudioAttributesCompatParcelizer(onCustomAction()).getAddOnNewIntentListener();
            addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(onCustomAction(), (getAnswerMap<? super _assertNotNull, getShowPopup>) addOnNewIntentListener.AudioAttributesCompatParcelizer, onPlayFromMediaId());
            if (onAddQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.write) {
                onPlayFromSearch();
                write(_assertNotNull.RemoteActionCompatParcelizer.IconCompatParcelizer);
            }
            if (getKey.AudioAttributesCompatParcelizer(onPlay().write(), jWrite) && onPlay().getRead() == getRead() && onPlay().getRemoteActionCompatParcelizer() == getRemoteActionCompatParcelizer()) {
                z = false;
            }
            long j = -1;
            MediaBrowserCompatItemReceiver(getKey.read((((long) onPlay().getRemoteActionCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) onPlay().getRead()) << 32)));
            return z;
        } catch (Throwable th) {
            _assertnotnullOnCustomAction.IconCompatParcelizer(th);
            throw new PlanDetailsCreator();
        }
    }

    /* JADX INFO: renamed from: o.getSubtypeResolver$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/KeyDeserializer;", "p0", "", "read", "(Lo/KeyDeserializer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<KeyDeserializer, getShowPopup> {
        public static final AnonymousClass4 IconCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(KeyDeserializer keyDeserializer) {
            read(keyDeserializer);
            return getShowPopup.INSTANCE;
        }

        public final void read(KeyDeserializer keyDeserializer) {
            keyDeserializer.getOnPause().write(false);
        }

        AnonymousClass4() {
            super(1);
        }
    }

    private final void AudioAttributesCompatParcelizer(_assertNotNull p0) {
        _assertNotNull.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
        _assertNotNull _assertnotnull_init_lambda4 = p0._init_lambda4();
        if (_assertnotnull_init_lambda4 != null) {
            if (this.AudioAttributesImplBaseParcelizer != _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer && !p0.getR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()) {
                reportWrongTokenException.read("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = WhenMappings.RemoteActionCompatParcelizer[_assertnotnull_init_lambda4.onSkipToQueueItem().ordinal()];
            if (i == 1) {
                mediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
            } else if (i == 2) {
                mediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
            } else {
                StringBuilder sb = new StringBuilder("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                sb.append(_assertnotnull_init_lambda4.onSkipToQueueItem());
                throw new IllegalStateException(sb.toString());
            }
            this.AudioAttributesImplBaseParcelizer = mediaBrowserCompatCustomActionResultReceiver;
            return;
        }
        this.AudioAttributesImplBaseParcelizer = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
    }

    @Override // kotlin._parser
    public final int MediaBrowserCompatSearchResultReceiver() {
        return onPlay().MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin._parser
    public final int AudioAttributesImplBaseParcelizer() {
        return onPlay().AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.withStaticTyping
    public final int AudioAttributesCompatParcelizer(weirdNumberException p0) {
        _assertNotNull _assertnotnull_init_lambda4 = onCustomAction()._init_lambda4();
        if ((_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.onSkipToQueueItem() : null) == _assertNotNull.RemoteActionCompatParcelizer.write) {
            getOnPause().write(true);
        } else {
            _assertNotNull _assertnotnull_init_lambda42 = onCustomAction()._init_lambda4();
            if ((_assertnotnull_init_lambda42 != null ? _assertnotnull_init_lambda42.onSkipToQueueItem() : null) == _assertNotNull.RemoteActionCompatParcelizer.read) {
                getOnPause().RemoteActionCompatParcelizer(true);
            }
        }
        this.AudioAttributesImplApi26Parcelizer = true;
        int iAudioAttributesCompatParcelizer = onPlay().AudioAttributesCompatParcelizer(p0);
        this.AudioAttributesImplApi26Parcelizer = false;
        return iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin._parser
    public final void RemoteActionCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2) throws Throwable {
        AudioAttributesCompatParcelizer(p0, p1, p2, null);
    }

    @Override // kotlin._parser
    public final void read(long p0, float p1, hasAnyGetter p2) throws Throwable {
        AudioAttributesCompatParcelizer(p0, p1, null, p2);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.onSkipToQueueItem = z;
    }

    @Override // kotlin.ObjectMapper1
    public final void IconCompatParcelizer(boolean p0) {
        if (p0 != onPlay().getMediaBrowserCompatItemReceiver()) {
            onPlay().AudioAttributesCompatParcelizer(p0);
            this.setSessionImpl = true;
        }
        AudioAttributesCompatParcelizer(p0);
    }

    private final void AudioAttributesCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2, hasAnyGetter p3) throws Throwable {
        _parser.IconCompatParcelizer iconCompatParcelizerOnPause;
        _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
        try {
            this.handleMediaPlayPauseIfPendingOnHandler = true;
            if (!hasReferringProperties.write(p0, this.MediaBrowserCompatMediaItem) || this.setSessionImpl) {
                if (this.RemoteActionCompatParcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() || this.RemoteActionCompatParcelizer.getHandleMediaPlayPauseIfPendingOnHandler() || this.setSessionImpl) {
                    this.onMediaButtonEvent = true;
                    this.setSessionImpl = false;
                }
                onPrepareFromUri();
            }
            setPropertyNamingStrategy setpropertynamingstrategyOnSetPlaybackSpeed = onSetPlaybackSpeed();
            if (setpropertynamingstrategyOnSetPlaybackSpeed != null) {
                setpropertynamingstrategyOnSetPlaybackSpeed.onMediaButtonEvent();
            }
            setPropertyNamingStrategy setpropertynamingstrategyOnSetPlaybackSpeed2 = onSetPlaybackSpeed();
            if (setpropertynamingstrategyOnSetPlaybackSpeed2 != null && setpropertynamingstrategyOnSetPlaybackSpeed2.onAddQueueItem()) {
                _bindAndClose audioAttributesImplApi26Parcelizer = onPlay().getAudioAttributesImplApi26Parcelizer();
                if (audioAttributesImplApi26Parcelizer == null || (iconCompatParcelizerOnPause = audioAttributesImplApi26Parcelizer.getMediaDescriptionCompat()) == null) {
                    iconCompatParcelizerOnPause = _serializerProvider.AudioAttributesCompatParcelizer(onCustomAction()).onPause();
                }
                _parser.IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerOnPause;
                setPropertyNamingStrategy setpropertynamingstrategyOnSetPlaybackSpeed3 = onSetPlaybackSpeed();
                toMagicModuleMetaRepoModel.write(setpropertynamingstrategyOnSetPlaybackSpeed3);
                _assertNotNull _assertnotnull_init_lambda4 = onCustomAction()._init_lambda4();
                if (_assertnotnull_init_lambda4 != null) {
                    _assertnotnull_init_lambda4.getAccessaddObserverForBackInvoker().IconCompatParcelizer(0);
                }
                setpropertynamingstrategyOnSetPlaybackSpeed3.RemoteActionCompatParcelizer(Integer.MAX_VALUE);
                _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, setpropertynamingstrategyOnSetPlaybackSpeed3, hasReferringProperties.IconCompatParcelizer(p0), hasReferringProperties.AudioAttributesCompatParcelizer(p0), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            }
            setPropertyNamingStrategy setpropertynamingstrategyOnSetPlaybackSpeed4 = onSetPlaybackSpeed();
            if (setpropertynamingstrategyOnSetPlaybackSpeed4 != null && !setpropertynamingstrategyOnSetPlaybackSpeed4.getMediaBrowserCompatMediaItem()) {
                reportWrongTokenException.read("Error: Placement happened before lookahead.");
            }
            write(p0, p1, p2, p3);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } catch (Throwable th) {
            _assertnotnullOnCustomAction.IconCompatParcelizer(th);
            throw new PlanDetailsCreator();
        }
    }

    private final void write(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2, hasAnyGetter p3) {
        if (onCustomAction().getAddOnUserLeaveHintListener()) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("place is called on a deactivated node");
        }
        write(_assertNotNull.RemoteActionCompatParcelizer.read);
        this.MediaBrowserCompatMediaItem = p0;
        this.MediaDescriptionCompat = p1;
        this.MediaMetadataCompat = p2;
        this.MediaBrowserCompatSearchResultReceiver = p3;
        this.onPrepareFromUri = false;
        _configureGenerator _configuregeneratorAudioAttributesCompatParcelizer = _serializerProvider.AudioAttributesCompatParcelizer(onCustomAction());
        if (!this.onMediaButtonEvent && this.onCommand) {
            onPlay().AudioAttributesCompatParcelizer(p0, p1, p2, p3);
            onSeekTo();
        } else {
            getOnPause().AudioAttributesCompatParcelizer(false);
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(false);
            this.onSetRating = p2;
            this.onSetPlaybackSpeed = p0;
            this.onSetShuffleMode = p1;
            this.onSetCaptioningEnabled = p3;
            PropertyMetadata addOnNewIntentListener = _configuregeneratorAudioAttributesCompatParcelizer.getAddOnNewIntentListener();
            _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
            getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.onSetRepeatMode;
            getAnswerMap getanswermap = addOnNewIntentListener.AudioAttributesImplApi26Parcelizer;
            addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(_assertnotnullOnCustomAction, (getAnswerMap<? super _assertNotNull, getShowPopup>) getanswermap, getcreatedondatems);
        }
        write(_assertNotNull.RemoteActionCompatParcelizer.IconCompatParcelizer);
        if (onPlay().getMediaBrowserCompatMediaItem() && (this.RemoteActionCompatParcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() || this.RemoteActionCompatParcelizer.getHandleMediaPlayPauseIfPendingOnHandler())) {
            AudioAttributesImplApi21Parcelizer();
        }
        this.MediaBrowserCompatItemReceiver = true;
    }

    public final void onRewind() {
        _assertNotNull _assertnotnull_init_lambda4;
        try {
            this.IconCompatParcelizer = true;
            if (!this.MediaBrowserCompatItemReceiver) {
                reportWrongTokenException.read("replace called on unplaced item");
            }
            boolean z = this.onCommand;
            write(this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver);
            if (z && !this.onPrepareFromUri && (_assertnotnull_init_lambda4 = onCustomAction()._init_lambda4()) != null) {
                _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull_init_lambda4, false, 1, null);
            }
        } finally {
        }
    }

    @Override // kotlin.hasHandlers
    public final int AudioAttributesCompatParcelizer(int p0) {
        if (configure.write(onCustomAction())) {
            setPropertyNamingStrategy setpropertynamingstrategyOnSetPlaybackSpeed = onSetPlaybackSpeed();
            toMagicModuleMetaRepoModel.write(setpropertynamingstrategyOnSetPlaybackSpeed);
            return setpropertynamingstrategyOnSetPlaybackSpeed.AudioAttributesCompatParcelizer(p0);
        }
        onSkipToNext();
        return onPlay().AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.hasHandlers
    public final int write(int p0) {
        if (configure.write(onCustomAction())) {
            setPropertyNamingStrategy setpropertynamingstrategyOnSetPlaybackSpeed = onSetPlaybackSpeed();
            toMagicModuleMetaRepoModel.write(setpropertynamingstrategyOnSetPlaybackSpeed);
            return setpropertynamingstrategyOnSetPlaybackSpeed.write(p0);
        }
        onSkipToNext();
        return onPlay().write(p0);
    }

    @Override // kotlin.hasHandlers
    public final int read(int p0) {
        if (configure.write(onCustomAction())) {
            setPropertyNamingStrategy setpropertynamingstrategyOnSetPlaybackSpeed = onSetPlaybackSpeed();
            toMagicModuleMetaRepoModel.write(setpropertynamingstrategyOnSetPlaybackSpeed);
            return setpropertynamingstrategyOnSetPlaybackSpeed.read(p0);
        }
        onSkipToNext();
        return onPlay().read(p0);
    }

    @Override // kotlin.hasHandlers
    public final int IconCompatParcelizer(int p0) {
        if (configure.write(onCustomAction())) {
            setPropertyNamingStrategy setpropertynamingstrategyOnSetPlaybackSpeed = onSetPlaybackSpeed();
            toMagicModuleMetaRepoModel.write(setpropertynamingstrategyOnSetPlaybackSpeed);
            return setpropertynamingstrategyOnSetPlaybackSpeed.IconCompatParcelizer(p0);
        }
        onSkipToNext();
        return onPlay().IconCompatParcelizer(p0);
    }

    private final void onSkipToNext() {
        _assertNotNull.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
        _assertNotNull.AudioAttributesCompatParcelizer$default(onCustomAction(), false, false, false, 7, null);
        _assertNotNull _assertnotnull_init_lambda4 = onCustomAction()._init_lambda4();
        if (_assertnotnull_init_lambda4 == null || onCustomAction().get_init_lambda3() != _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
            return;
        }
        _assertNotNull _assertnotnullOnCustomAction = onCustomAction();
        int i = WhenMappings.RemoteActionCompatParcelizer[_assertnotnull_init_lambda4.onSkipToQueueItem().ordinal()];
        if (i == 1) {
            mediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
        } else if (i == 2) {
            mediaBrowserCompatCustomActionResultReceiver = _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        } else {
            mediaBrowserCompatCustomActionResultReceiver = _assertnotnull_init_lambda4.get_init_lambda3();
        }
        _assertnotnullOnCustomAction.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
    }

    public final void onFastForward() {
        this.RatingCompat = true;
    }

    public final boolean onRemoveQueueItem() {
        if ((getOnPrepareFromUri() == null && onPlay().getOnPrepareFromUri() == null) || !this.RatingCompat) {
            return false;
        }
        this.RatingCompat = false;
        this.onAddQueueItem = onPlay().getOnPrepareFromUri();
        return true;
    }

    @Override // kotlin.KeyDeserializer
    public final Map<weirdNumberException, Integer> RemoteActionCompatParcelizer() {
        if (!this.AudioAttributesImplApi26Parcelizer) {
            if (onAddQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.write) {
                getOnPause().read(true);
                if (getOnPause().getIconCompatParcelizer()) {
                    onPlayFromSearch();
                }
            } else {
                getOnPause().AudioAttributesCompatParcelizer(true);
            }
        }
        _bindAndClose _bindandcloseWrite = write();
        boolean mediaBrowserCompatMediaItem = _bindandcloseWrite.getMediaBrowserCompatMediaItem();
        _bindandcloseWrite.RemoteActionCompatParcelizer(true);
        MediaBrowserCompatCustomActionResultReceiver();
        _bindandcloseWrite.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem);
        return getOnPause().read();
    }

    @Override // kotlin.KeyDeserializer
    public final KeyDeserializer AudioAttributesCompatParcelizer() {
        addMixIn accessaddObserverForBackInvoker;
        _assertNotNull _assertnotnull_init_lambda4 = onCustomAction()._init_lambda4();
        if (_assertnotnull_init_lambda4 == null || (accessaddObserverForBackInvoker = _assertnotnull_init_lambda4.getAccessaddObserverForBackInvoker()) == null) {
            return null;
        }
        return accessaddObserverForBackInvoker.read();
    }

    @Override // kotlin.KeyDeserializer
    public final void IconCompatParcelizer(getAnswerMap<? super KeyDeserializer, getShowPopup> p0) {
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onCustomAction().addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            p0.invoke(_assertnotnullArr[i].getAccessaddObserverForBackInvoker().read());
        }
    }

    @Override // kotlin.KeyDeserializer
    public final void AudioAttributesImplApi21Parcelizer() {
        _assertNotNull.AudioAttributesCompatParcelizer$default(onCustomAction(), false, 1, null);
    }

    @Override // kotlin.KeyDeserializer
    public final void MediaBrowserCompatItemReceiver() {
        _assertNotNull.AudioAttributesCompatParcelizer$default(onCustomAction(), false, false, false, 7, null);
    }

    public final void onPrepareFromUri() {
        if (this.RemoteActionCompatParcelizer.getOnPlayFromMediaId() > 0) {
            UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onCustomAction().addObserverForBackInvoker();
            _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
            int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                _assertNotNull _assertnotnull = _assertnotnullArr[i];
                addMixIn accessaddObserverForBackInvoker = _assertnotnull.getAccessaddObserverForBackInvoker();
                if ((accessaddObserverForBackInvoker.getHandleMediaPlayPauseIfPendingOnHandler() || accessaddObserverForBackInvoker.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) && !accessaddObserverForBackInvoker.RatingCompat()) {
                    _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull, false, 1, null);
                }
                accessaddObserverForBackInvoker.getOnFastForward().onPrepareFromUri();
            }
        }
    }

    private final void onSkipToQueueItem() {
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = onCustomAction().addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (_assertnotnull.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() && _assertnotnull.ResultReceiver() == _assertNotNull.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer && _assertNotNull.read$default(_assertnotnull, null, 1, null)) {
                _assertNotNull.AudioAttributesCompatParcelizer$default(onCustomAction(), false, false, false, 7, null);
            }
        }
    }

    public final void write(boolean p0) {
        _assertNotNull _assertnotnull;
        _assertNotNull _assertnotnull_init_lambda4 = onCustomAction()._init_lambda4();
        _assertNotNull.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = onCustomAction().get_init_lambda3();
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
        int i = WhenMappings.AudioAttributesCompatParcelizer[mediaBrowserCompatCustomActionResultReceiver.ordinal()];
        if (i == 1) {
            _assertNotNull.AudioAttributesCompatParcelizer$default(_assertnotnull, p0, false, false, 6, null);
        } else {
            if (i == 2) {
                _assertnotnull.AudioAttributesCompatParcelizer(p0);
                return;
            }
            throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
        }
    }

    public final void onRemoveQueueItemAt() {
        this.write = Integer.MAX_VALUE;
        this.AudioAttributesCompatParcelizer = Integer.MAX_VALUE;
        this.onCommand = false;
    }

    public final void onPlayFromSearch() {
        this.onMediaButtonEvent = true;
        this.onPlayFromMediaId = true;
    }

    public final void onPrepare() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
    }
}
