package kotlin;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.DoubleToDecimal;
import kotlin.Metadata;
import kotlin.reportInvalidNumber;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\u00102\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u0015\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u001c2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010 J\u001d\u0010&\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010'\u001a\u00020\u0010H\u0000¢\u0006\u0004\b'\u0010 J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010 J\u001d\u0010\u0017\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016¢\u0006\u0004\b\u0017\u0010*J\u001d\u0010\u0013\u001a\u00020\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016¢\u0006\u0004\b\u0013\u0010+J\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010,J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0013\u0010-J%\u0010\u0011\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0011\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u0010 J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020)H\u0016¢\u0006\u0004\b\u0011\u00100J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020)H\u0002¢\u0006\u0004\b\u0015\u00100J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020)H\u0016¢\u0006\u0004\b\u0017\u00100J\u000f\u00101\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010\"J+\u0010\u0015\u001a\u00020\u00102\u001a\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u0001040302H\u0016¢\u0006\u0004\b\u0015\u00105J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\b\u001a\u000206H\u0016¢\u0006\u0004\b\u0015\u00107J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u000208H\u0002¢\u0006\u0004\b\u0013\u00109J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010 J\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010 J\u000f\u0010:\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010 J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010 J\u000f\u0010;\u001a\u00020\u0010H\u0016¢\u0006\u0004\b;\u0010 J5\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010<2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020=2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010>J\u001b\u0010\u0011\u001a\u0004\u0018\u00010?2\b\u0010\b\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b\u0011\u0010@J!\u0010&\u001a\u00020B2\u0006\u0010\b\u001a\u00020A2\b\u0010\n\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b&\u0010CJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020AH\u0016¢\u0006\u0004\b\u0015\u0010DJ!\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020A2\b\u0010\n\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b\u0013\u0010EJ)\u0010&\u001a\u00020B2\u0006\u0010\b\u001a\u00020A2\u0006\u0010\n\u001a\u00020F2\b\u0010\f\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b&\u0010GJ\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020)2\u0006\u0010\n\u001a\u00020AH\u0000¢\u0006\u0004\b\u0013\u0010HJ\u001b\u0010&\u001a\u00020\u00102\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030IH\u0000¢\u0006\u0004\b&\u0010JJ\u001b\u0010L\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020)0KH\u0002¢\u0006\u0004\bL\u0010MJ\u0011\u0010O\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010 R\u0017\u0010&\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b$\u0010R\u001a\u0004\bS\u0010TR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010UR(\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010)0Vj\n\u0012\u0006\u0012\u0004\u0018\u00010)`W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010XR\u0018\u0010\u0015\u001a\u00060)j\u0002`Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010ZR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010]R\u001a\u0010:\u001a\u00020^8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020A0K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020A0d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u0010eR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020A0d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bf\u0010eR$\u0010f\u001a\u0012\u0012\u0004\u0012\u00020)\u0012\b\u0012\u0006\u0012\u0002\b\u00030I0K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010cR\u0014\u0010S\u001a\u0002088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010gR\u0014\u0010h\u001a\u0002088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010gR \u0010;\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020A0K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010cR\"\u0010a\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020)0K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010cR\u0016\u00101\u001a\u00020\u001c8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u0013\u0010iR\u0018\u0010'\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010jR\u0018\u0010/\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010lR\u0018\u0010$\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010mR\u0016\u0010#\u001a\u00020=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bh\u0010nR\u001a\u0010!\u001a\u00020o8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010p\u001a\u0004\b\u001e\u0010qR\u0014\u0010O\u001a\u00020r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010sR\u001a\u0010L\u001a\u00020t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010u\u001a\u0004\bf\u0010vR\u0016\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010wR\u0014\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010iR\u0016\u0010_\u001a\u00020=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bx\u0010nR\u0014\u0010y\u001a\u00020\u001c8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\"R\u001c\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010zR\u0014\u0010{\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\"R\u0014\u0010|\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\"R\u0014\u0010}\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\""}, d2 = {"Lo/getTokenLineNr;", "Lo/_reportMissingRootWS;", "Lo/contentReference;", "Lo/_append;", "Lo/_reportInputCoercion;", "Lo/toBigDecimalRec;", "Lo/_matchTrue;", "Lo/convertNumberToLong;", "p0", "Lo/_closeInput;", "p1", "Lo/CurrentQuery;", "p2", "<init>", "(Lo/convertNumberToLong;Lo/_closeInput;Lo/CurrentQuery;)V", "Lkotlin/Function0;", "", "IconCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;)V", "read", "Lo/getInputCodeLatin1;", "RemoteActionCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;)Lo/getInputCodeLatin1;", "write", "Lo/setButtonDrawable;", "Lo/constructReadConstrainedTextBuffer;", "(Lo/setButtonDrawable;)V", "AudioAttributesImplApi26Parcelizer", "", "(ZLo/MagicModuleSubmissionRequestBody;)Lo/getInputCodeLatin1;", "AudioAttributesImplApi21Parcelizer", "onPause", "()V", "onCommand", "()Z", "onAddQueueItem", "handleMediaPlayPauseIfPendingOnHandler", "onPlayFromMediaId", "AudioAttributesCompatParcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "", "", "(Ljava/util/Set;)V", "(Ljava/util/Set;)Z", "(Lo/getCreatedOnDateMs;)V", "(Ljava/lang/Object;Z)V", "(Ljava/util/Set;Z)V", "onCustomAction", "(Ljava/lang/Object;)V", "MediaBrowserCompatMediaItem", "", "Lo/getSubscriptionExpiresOn;", "Lo/getFilter;", "(Ljava/util/List;)V", "Lo/checkValue;", "(Lo/checkValue;)V", "Lo/_full3;", "(Lo/_full3;)V", "AudioAttributesImplBaseParcelizer", "RatingCompat", "R", "", "(Lo/_reportMissingRootWS;ILo/getCreatedOnDateMs;)Ljava/lang/Object;", "Lo/isResourceManaged;", "(Lo/isResourceManaged;)Lo/isResourceManaged;", "Lo/rawReference;", "Lo/_includeScalar;", "(Lo/rawReference;Ljava/lang/Object;)Lo/_includeScalar;", "(Lo/rawReference;)V", "(Lo/rawReference;Ljava/lang/Object;)Z", "Lo/_parseSlowFloat;", "(Lo/rawReference;Lo/_parseSlowFloat;Ljava/lang/Object;)Lo/_includeScalar;", "(Ljava/lang/Object;Lo/rawReference;)V", "Lo/reportInvalidNumber;", "(Lo/reportInvalidNumber;)V", "Lo/getAndClear;", "onMediaButtonEvent", "()Lo/setKeyListener;", "Lo/_matchNull;", "onFastForward", "()Lo/_matchNull;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/convertNumberToLong;", "MediaBrowserCompatSearchResultReceiver", "()Lo/convertNumberToLong;", "Lo/_closeInput;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/read;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/SynchronizedObject;", "Ljava/lang/Object;", "", "Lo/allocReadIOBuffer;", "Ljava/util/Set;", "Lo/releaseTokenBuffer;", "onPlay", "Lo/releaseTokenBuffer;", "MediaDescriptionCompat", "()Lo/releaseTokenBuffer;", "Lo/setKeyListener;", "Lo/setEmojiCompatEnabled;", "Lo/setEmojiCompatEnabled;", "MediaBrowserCompatItemReceiver", "Lo/_full3;", "MediaMetadataCompat", "Z", "Lo/isResourceManaged;", "Lo/copyHexChars;", "Lo/copyHexChars;", "Lo/getTokenLineNr;", "I", "Lo/resetFloat;", "Lo/resetFloat;", "()Lo/resetFloat;", "Lo/toFftVector;", "Lo/toFftVector;", "Lo/_parseIntValue;", "Lo/_parseIntValue;", "()Lo/_parseIntValue;", "Lo/CurrentQuery;", "onPlayFromUri", "onPrepareFromMediaId", "Lo/MagicModuleSubmissionRequestBody;", "onPrepare", "onPlayFromSearch", "onPrepareFromSearch"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTokenLineNr implements _reportMissingRootWS, _append, _reportInputCoercion, toBigDecimalRec, _matchTrue {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final _closeInput<?> read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final _full3 MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final _parseIntValue onMediaButtonEvent;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setKeyListener<Object, Object> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Set<allocReadIOBuffer> write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setEmojiCompatEnabled<rawReference> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setEmojiCompatEnabled<rawReference> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private getTokenLineNr handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private setKeyListener<Object, Object> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final setKeyListener<Object, Object> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean onPause;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private int onAddQueueItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final _full3 MediaMetadataCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> onPlayFromUri;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final convertNumberToLong AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final setKeyListener<Object, Object> RatingCompat;
    private final resetFloat onCommand;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final Object RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private isResourceManaged MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final toFftVector onFastForward;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private copyHexChars onCustomAction;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final releaseTokenBuffer AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final AtomicReference<Object> IconCompatParcelizer;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private int onPlay;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final CurrentQuery onPlayFromMediaId;

    public getTokenLineNr(convertNumberToLong convertnumbertolong, _closeInput<?> _closeinput, CurrentQuery currentQuery) {
        this.AudioAttributesCompatParcelizer = convertnumbertolong;
        this.read = _closeinput;
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        this.IconCompatParcelizer = new AtomicReference<>(null);
        this.RemoteActionCompatParcelizer = new Object();
        int i = 0;
        int i2 = 1;
        Set<allocReadIOBuffer> setAudioAttributesCompatParcelizer = new setEmojiCompatEnabled(i, i2, magicModuleRepositoryImplExternalSyntheticLambda0).AudioAttributesCompatParcelizer();
        this.write = setAudioAttributesCompatParcelizer;
        releaseTokenBuffer releasetokenbuffer = new releaseTokenBuffer();
        if (convertnumbertolong.write()) {
            releasetokenbuffer.IconCompatParcelizer();
        }
        if (convertnumbertolong.getAudioAttributesCompatParcelizer()) {
            releasetokenbuffer.write();
        }
        this.AudioAttributesImplBaseParcelizer = releasetokenbuffer;
        this.AudioAttributesImplApi26Parcelizer = getAndClear.IconCompatParcelizer((setKeyListener) null, 1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        this.AudioAttributesImplApi21Parcelizer = new setEmojiCompatEnabled<>(i, i2, magicModuleRepositoryImplExternalSyntheticLambda0);
        this.MediaBrowserCompatCustomActionResultReceiver = new setEmojiCompatEnabled<>(i, i2, magicModuleRepositoryImplExternalSyntheticLambda0);
        this.MediaBrowserCompatItemReceiver = getAndClear.IconCompatParcelizer((setKeyListener) null, 1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        _full3 _full3Var = new _full3();
        this.MediaBrowserCompatSearchResultReceiver = _full3Var;
        _full3 _full3Var2 = new _full3();
        this.MediaMetadataCompat = _full3Var2;
        this.RatingCompat = getAndClear.IconCompatParcelizer((setKeyListener) null, 1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        this.MediaDescriptionCompat = getAndClear.IconCompatParcelizer((setKeyListener) null, 1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        resetFloat resetfloat = new resetFloat(null, false, convertnumbertolong, 3, null);
        this.onCommand = resetfloat;
        this.onFastForward = new toFftVector();
        _parseIntValue _parseintvalue = new _parseIntValue(_closeinput, convertnumbertolong, releasetokenbuffer, setAudioAttributesCompatParcelizer, _full3Var, _full3Var2, resetfloat, this);
        convertnumbertolong.RemoteActionCompatParcelizer(_parseintvalue);
        this.onMediaButtonEvent = _parseintvalue;
        this.onPlayFromMediaId = currentQuery;
        this.onPause = convertnumbertolong instanceof _truncate;
        this.onPlayFromUri = _convertBigDecimalToBigInteger.RemoteActionCompatParcelizer.read();
    }

    public /* synthetic */ getTokenLineNr(convertNumberToLong convertnumbertolong, _closeInput _closeinput, CurrentQuery currentQuery, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(convertnumbertolong, _closeinput, (i & 4) != 0 ? null : currentQuery);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final convertNumberToLong getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final releaseTokenBuffer getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final resetFloat getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final _parseIntValue getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    private final boolean onPlay() {
        return this.onMediaButtonEvent.onRemoveQueueItemAt();
    }

    @Override // kotlin._reportMissingRootWS
    public final boolean MediaMetadataCompat() {
        return this.onMediaButtonEvent.getOnRemoveQueueItem();
    }

    @Override // kotlin.createChildArrayContext
    public final boolean IconCompatParcelizer() {
        return this.onPlay == 3;
    }

    @Override // kotlin.createChildArrayContext
    public final void IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0) {
        boolean zOnCommand = onCommand();
        onPause();
        if (zOnCommand) {
            AudioAttributesImplApi21Parcelizer(p0);
        } else {
            AudioAttributesImplApi26Parcelizer(p0);
        }
    }

    @Override // kotlin.InterfaceC0163contentReference
    public final void read(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0) {
        onCommand();
        onPause();
        AudioAttributesImplApi21Parcelizer(p0);
    }

    @Override // kotlin.toBigDecimalRec
    public final getInputCodeLatin1 RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0) {
        return read(onCommand(), p0);
    }

    @Override // kotlin.toBigDecimalRec
    public final getInputCodeLatin1 write(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0) {
        onCommand();
        onPause();
        return read(true, p0);
    }

    public final void RemoteActionCompatParcelizer(setButtonDrawable<constructReadConstrainedTextBuffer> p0) {
        this.onCustomAction = null;
        if (p0 != null) {
            this.onFastForward.RemoteActionCompatParcelizer(p0);
            this.onPlay = 2;
        }
    }

    private final void AudioAttributesImplApi26Parcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0) {
        this.onPlayFromUri = p0;
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this, p0);
    }

    private final getInputCodeLatin1 read(boolean p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
        if (this.onCustomAction != null) {
            getInputCodeUtf8JsNames.read("A pausable composition is in progress");
        }
        copyHexChars copyhexchars = new copyHexChars(this, this.AudioAttributesCompatParcelizer, this.onMediaButtonEvent, this.write, p1, p0, this.read, this.RemoteActionCompatParcelizer);
        this.onCustomAction = copyhexchars;
        return copyhexchars;
    }

    private final void AudioAttributesImplApi21Parcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0) {
        this.onMediaButtonEvent.ParcelableVolumeInfo();
        AudioAttributesImplApi26Parcelizer(p0);
        this.onMediaButtonEvent.onPrepareFromUri();
    }

    private final void onPause() {
        String str;
        int i = this.onPlay;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i == 2) {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            } else if (i == 3) {
                str = "The composition is disposed";
            } else {
                str = "";
            }
            getInputCodeUtf8JsNames.read(str);
        }
        if (this.onCustomAction == null) {
            return;
        }
        getInputCodeUtf8JsNames.read("A pausable composition is in progress");
    }

    private final boolean onCommand() {
        boolean z;
        synchronized (this.RemoteActionCompatParcelizer) {
            z = this.onPlay == 1;
            if (z) {
                this.onPlay = 0;
            }
        }
        return z;
    }

    private final void onAddQueueItem() {
        Object andSet = this.IconCompatParcelizer.getAndSet(getTokenCharacterOffset.RemoteActionCompatParcelizer);
        if (andSet != null) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(andSet, getTokenCharacterOffset.RemoteActionCompatParcelizer)) {
                _validJsonValueList.RemoteActionCompatParcelizer("pending composition has not been applied");
                throw new PlanDetailsCreator();
            }
            if (andSet instanceof Set) {
                IconCompatParcelizer((Set) andSet, true);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    IconCompatParcelizer(set, true);
                }
                return;
            }
            StringBuilder sb = new StringBuilder("corrupt pendingModifications drain: ");
            sb.append(this.IconCompatParcelizer);
            _validJsonValueList.RemoteActionCompatParcelizer(sb.toString());
            throw new PlanDetailsCreator();
        }
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        Object andSet = this.IconCompatParcelizer.getAndSet(null);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(andSet, getTokenCharacterOffset.RemoteActionCompatParcelizer)) {
            return;
        }
        if (andSet instanceof Set) {
            IconCompatParcelizer((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                IconCompatParcelizer(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.onCustomAction == null) {
                _validJsonValueList.AudioAttributesCompatParcelizer("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            StringBuilder sb = new StringBuilder("corrupt pendingModifications drain: ");
            sb.append(this.IconCompatParcelizer);
            _validJsonValueList.RemoteActionCompatParcelizer(sb.toString());
            throw new PlanDetailsCreator();
        }
    }

    private final void onPlayFromMediaId() {
        Object andSet = this.IconCompatParcelizer.getAndSet(getKycMessage.read());
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(andSet, getTokenCharacterOffset.RemoteActionCompatParcelizer) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            IconCompatParcelizer((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                IconCompatParcelizer(set, false);
            }
            return;
        }
        StringBuilder sb = new StringBuilder("corrupt pendingModifications drain: ");
        sb.append(this.IconCompatParcelizer);
        _validJsonValueList.RemoteActionCompatParcelizer(sb.toString());
        throw new PlanDetailsCreator();
    }

    @Override // kotlin._reportMissingRootWS
    public final void AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0) {
        try {
            synchronized (this.RemoteActionCompatParcelizer) {
                onAddQueueItem();
                setKeyListener<Object, Object> setkeylistenerOnMediaButtonEvent = onMediaButtonEvent();
                try {
                    this.onMediaButtonEvent.write(setkeylistenerOnMediaButtonEvent, p0, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                } catch (Throwable th) {
                    this.MediaDescriptionCompat = setkeylistenerOnMediaButtonEvent;
                    throw th;
                }
            }
            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
        } catch (Throwable th2) {
            try {
                if (!this.write.isEmpty()) {
                    toFftVector tofftvector = this.onFastForward;
                    try {
                        tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
                        tofftvector.read();
                        tofftvector.IconCompatParcelizer();
                    } catch (Throwable th3) {
                        tofftvector.IconCompatParcelizer();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                write();
                throw th4;
            }
        }
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        synchronized (this.RemoteActionCompatParcelizer) {
            onPlayFromMediaId();
            setKeyListener<Object, Object> setkeylistenerOnMediaButtonEvent = onMediaButtonEvent();
            try {
                this.onMediaButtonEvent.AudioAttributesCompatParcelizer(setkeylistenerOnMediaButtonEvent);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            } catch (Throwable th) {
                this.MediaDescriptionCompat = setkeylistenerOnMediaButtonEvent;
                throw th;
            }
        }
    }

    @Override // kotlin.createChildArrayContext
    public final void RemoteActionCompatParcelizer() {
        synchronized (this.RemoteActionCompatParcelizer) {
            if (this.onMediaButtonEvent.getOnRemoveQueueItem()) {
                getInputCodeUtf8JsNames.read("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (this.onPlay != 3) {
                this.onPlay = 3;
                this.onPlayFromUri = _convertBigDecimalToBigInteger.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                _full3 _full3VarOnSetShuffleMode = this.onMediaButtonEvent.getSetSessionImpl();
                if (_full3VarOnSetShuffleMode != null) {
                    read(_full3VarOnSetShuffleMode);
                }
                boolean z = this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer() > 0;
                if (z || !this.write.isEmpty()) {
                    toFftVector tofftvector = this.onFastForward;
                    try {
                        tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
                        if (z) {
                            this.read.AudioAttributesImplApi21Parcelizer();
                            setEncoding setencodingOnAddQueueItem = this.AudioAttributesImplBaseParcelizer.onAddQueueItem();
                            try {
                                _validJsonValueList.RemoteActionCompatParcelizer(setencodingOnAddQueueItem, this.onFastForward);
                                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                                setencodingOnAddQueueItem.read(true);
                                this.read.AudioAttributesCompatParcelizer();
                                this.read.MediaBrowserCompatItemReceiver();
                                tofftvector.RemoteActionCompatParcelizer();
                            } catch (Throwable th) {
                                setencodingOnAddQueueItem.read(false);
                                throw th;
                            }
                        }
                        tofftvector.read();
                    } finally {
                        tofftvector.IconCompatParcelizer();
                    }
                }
                this.onMediaButtonEvent.onSeekTo();
            }
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.createChildArrayContext
    public final boolean AudioAttributesCompatParcelizer() {
        boolean z;
        synchronized (this.RemoteActionCompatParcelizer) {
            z = getAndClear.RemoteActionCompatParcelizer(this.MediaDescriptionCompat) > 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin._reportMissingRootWS
    public final void write(Set<? extends Object> p0) {
        Object obj;
        Object objIconCompatParcelizer;
        do {
            obj = this.IconCompatParcelizer.get();
            if (obj == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, getTokenCharacterOffset.RemoteActionCompatParcelizer)) {
                objIconCompatParcelizer = p0;
            } else if (obj instanceof Set) {
                objIconCompatParcelizer = new Set[]{obj, p0};
            } else {
                if (!(obj instanceof Object[])) {
                    StringBuilder sb = new StringBuilder("corrupt pendingModifications: ");
                    sb.append(this.IconCompatParcelizer);
                    throw new IllegalStateException(sb.toString().toString());
                }
                toMagicModuleMetaRepoModel.read(obj, "");
                objIconCompatParcelizer = getOrderDetails.IconCompatParcelizer((Set<? extends Object>[]) obj, p0);
            }
        } while (!setBackInvokedCallbackEnabled.read(this.IconCompatParcelizer, obj, objIconCompatParcelizer));
        if (obj == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                handleMediaPlayPauseIfPendingOnHandler();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
    }

    @Override // kotlin._reportMissingRootWS
    public final void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        this.onMediaButtonEvent.IconCompatParcelizer(p0);
    }

    private final void read(Object p0, boolean p1) {
        Object objAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(p0);
        if (objAudioAttributesImplApi26Parcelizer == null) {
            return;
        }
        if (objAudioAttributesImplApi26Parcelizer instanceof setEmojiCompatEnabled) {
            setEmojiCompatEnabled setemojicompatenabled = (setEmojiCompatEnabled) objAudioAttributesImplApi26Parcelizer;
            Object[] objArr = setemojicompatenabled.write;
            long[] jArr = setemojicompatenabled.AudioAttributesCompatParcelizer;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            rawReference rawreference = (rawReference) objArr[(i << 3) + i3];
                            if (!getAndClear.RemoteActionCompatParcelizer(this.RatingCompat, p0, rawreference) && rawreference.AudioAttributesCompatParcelizer(p0) != _includeScalar.RemoteActionCompatParcelizer) {
                                if (rawreference.MediaDescriptionCompat() && !p1) {
                                    this.MediaBrowserCompatCustomActionResultReceiver.write(rawreference);
                                } else {
                                    this.AudioAttributesImplApi21Parcelizer.write(rawreference);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            rawReference rawreference2 = (rawReference) objAudioAttributesImplApi26Parcelizer;
            if (getAndClear.RemoteActionCompatParcelizer(this.RatingCompat, p0, rawreference2) || rawreference2.AudioAttributesCompatParcelizer(p0) == _includeScalar.RemoteActionCompatParcelizer) {
                return;
            }
            if (rawreference2.MediaDescriptionCompat() && !p1) {
                this.MediaBrowserCompatCustomActionResultReceiver.write(rawreference2);
            } else {
                this.AudioAttributesImplApi21Parcelizer.write(rawreference2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7 A[PHI: r24 r25 r26
      0x00e7: PHI (r24v6 long[]) = (r24v5 long[]), (r24v9 long[]) binds: [B:38:0x00e5, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r25v4 int) = (r25v3 int), (r25v7 int) binds: [B:38:0x00e5, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r26v4 int) = (r26v3 int), (r26v7 int) binds: [B:38:0x00e5, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onCustomAction() {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenLineNr.onCustomAction():void");
    }

    @Override // kotlin._reportMissingRootWS, kotlin._append
    public final void IconCompatParcelizer(Object p0) {
        rawReference rawreferenceOnSetRating;
        long[] jArr;
        long[] jArr2;
        int i;
        if (onPlay() || (rawreferenceOnSetRating = this.onMediaButtonEvent.onSetRating()) == null) {
            return;
        }
        rawreferenceOnSetRating.AudioAttributesImplApi21Parcelizer(true);
        boolean zIconCompatParcelizer = rawreferenceOnSetRating.IconCompatParcelizer(p0);
        _matchNull _matchnullOnFastForward = onFastForward();
        if (_matchnullOnFastForward != null) {
            _matchnullOnFastForward.RemoteActionCompatParcelizer(rawreferenceOnSetRating, p0);
        }
        if (zIconCompatParcelizer) {
            return;
        }
        if (p0 instanceof constructParser) {
            DoubleToDecimal.Companion companion = DoubleToDecimal.INSTANCE;
            ((constructParser) p0).RemoteActionCompatParcelizer(DoubleToDecimal.AudioAttributesCompatParcelizer(1));
        }
        getAndClear.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, p0, rawreferenceOnSetRating);
        if (p0 instanceof reportInvalidNumber) {
            reportInvalidNumber<?> reportinvalidnumber = (reportInvalidNumber) p0;
            reportInvalidNumber.IconCompatParcelizer<?> iconCompatParcelizerAudioAttributesCompatParcelizer = reportinvalidnumber.AudioAttributesCompatParcelizer();
            getAndClear.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, p0);
            setSupportBackgroundTintMode<tryMatch> setsupportbackgroundtintmodeWrite = iconCompatParcelizerAudioAttributesCompatParcelizer.write();
            Object[] objArr = setsupportbackgroundtintmodeWrite.AudioAttributesCompatParcelizer;
            long[] jArr3 = setsupportbackgroundtintmodeWrite.RemoteActionCompatParcelizer;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j & 255) < 128) {
                                tryMatch trymatch = (tryMatch) objArr[(i2 << 3) + i5];
                                if (trymatch instanceof constructParser) {
                                    DoubleToDecimal.Companion companion2 = DoubleToDecimal.INSTANCE;
                                    jArr2 = jArr3;
                                    ((constructParser) trymatch).RemoteActionCompatParcelizer(DoubleToDecimal.AudioAttributesCompatParcelizer(1));
                                } else {
                                    jArr2 = jArr3;
                                }
                                getAndClear.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, trymatch, p0);
                                i = 8;
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
            rawreferenceOnSetRating.read(reportinvalidnumber, iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer());
        }
    }

    private final void RemoteActionCompatParcelizer(Object p0) {
        Object objAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer(p0);
        if (objAudioAttributesImplApi26Parcelizer == null) {
            return;
        }
        if (objAudioAttributesImplApi26Parcelizer instanceof setEmojiCompatEnabled) {
            setEmojiCompatEnabled setemojicompatenabled = (setEmojiCompatEnabled) objAudioAttributesImplApi26Parcelizer;
            Object[] objArr = setemojicompatenabled.write;
            long[] jArr = setemojicompatenabled.AudioAttributesCompatParcelizer;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            rawReference rawreference = (rawReference) objArr[(i << 3) + i3];
                            if (rawreference.AudioAttributesCompatParcelizer(p0) == _includeScalar.write) {
                                getAndClear.IconCompatParcelizer(this.RatingCompat, p0, rawreference);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            rawReference rawreference2 = (rawReference) objAudioAttributesImplApi26Parcelizer;
            if (rawreference2.AudioAttributesCompatParcelizer(p0) == _includeScalar.write) {
                getAndClear.IconCompatParcelizer(this.RatingCompat, p0, rawreference2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    @Override // kotlin._reportMissingRootWS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.RemoteActionCompatParcelizer
            monitor-enter(r0)
            r14.RemoteActionCompatParcelizer(r15)     // Catch: java.lang.Throwable -> L64
            o.setKeyListener<java.lang.Object, java.lang.Object> r1 = r14.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L64
            java.lang.Object r15 = r1.AudioAttributesImplApi26Parcelizer(r15)     // Catch: java.lang.Throwable -> L64
            if (r15 == 0) goto L60
            boolean r1 = r15 instanceof kotlin.setEmojiCompatEnabled
            if (r1 == 0) goto L5b
            o.setEmojiCompatEnabled r15 = (kotlin.setEmojiCompatEnabled) r15     // Catch: java.lang.Throwable -> L64
            o.setButtonDrawable r15 = (kotlin.setButtonDrawable) r15     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r1 = r15.write     // Catch: java.lang.Throwable -> L64
            long[] r15 = r15.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L64
            int r2 = r15.length     // Catch: java.lang.Throwable -> L64
            int r2 = r2 + (-2)
            if (r2 < 0) goto L60
            r3 = 0
            r4 = r3
        L21:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L64
            long r7 = ~r5     // Catch: java.lang.Throwable -> L64
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L56
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L64
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L3b:
            if (r9 >= r7) goto L54
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L50
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L64
            o.reportInvalidNumber r10 = (kotlin.reportInvalidNumber) r10     // Catch: java.lang.Throwable -> L64
            r14.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L64
        L50:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L3b
        L54:
            if (r7 != r8) goto L60
        L56:
            if (r4 == r2) goto L60
            int r4 = r4 + 1
            goto L21
        L5b:
            o.reportInvalidNumber r15 = (kotlin.reportInvalidNumber) r15     // Catch: java.lang.Throwable -> L64
            r14.RemoteActionCompatParcelizer(r15)     // Catch: java.lang.Throwable -> L64
        L60:
            o.getShowPopup r14 = kotlin.getShowPopup.INSTANCE     // Catch: java.lang.Throwable -> L64
            monitor-exit(r0)
            return
        L64:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenLineNr.write(java.lang.Object):void");
    }

    @Override // kotlin._reportMissingRootWS
    public final boolean MediaBrowserCompatMediaItem() {
        synchronized (this.RemoteActionCompatParcelizer) {
            copyHexChars copyhexchars = this.onCustomAction;
            if (copyhexchars != null && !copyhexchars.MediaBrowserCompatCustomActionResultReceiver()) {
                copyhexchars.MediaBrowserCompatItemReceiver();
                copyhexchars.write().RemoteActionCompatParcelizer();
                return false;
            }
            onAddQueueItem();
            try {
                try {
                    boolean zRemoteActionCompatParcelizer = this.onMediaButtonEvent.RemoteActionCompatParcelizer(onMediaButtonEvent(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    if (!zRemoteActionCompatParcelizer) {
                        handleMediaPlayPauseIfPendingOnHandler();
                    }
                    return zRemoteActionCompatParcelizer;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (!this.write.isEmpty()) {
                        toFftVector tofftvector = this.onFastForward;
                        try {
                            tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
                            tofftvector.read();
                            tofftvector.IconCompatParcelizer();
                        } catch (Throwable th2) {
                            tofftvector.IconCompatParcelizer();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    write();
                    throw th3;
                }
            }
        }
    }

    @Override // kotlin._reportMissingRootWS
    public final void RemoteActionCompatParcelizer(checkValue p0) {
        toFftVector tofftvector = this.onFastForward;
        try {
            tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
            setEncoding setencodingOnAddQueueItem = p0.getIconCompatParcelizer().onAddQueueItem();
            try {
                _validJsonValueList.RemoteActionCompatParcelizer(setencodingOnAddQueueItem, this.onFastForward);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                setencodingOnAddQueueItem.read(true);
                tofftvector.RemoteActionCompatParcelizer();
            } catch (Throwable th) {
                setencodingOnAddQueueItem.read(false);
                throw th;
            }
        } finally {
            tofftvector.IconCompatParcelizer();
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void read(_full3 p0) throws Throwable {
        String str;
        toFftVector tofftvectorAudioAttributesCompatParcelizer;
        Object obj;
        Object obj2;
        long[] jArr;
        long[] jArr2;
        int i;
        char c;
        long j;
        int i2;
        long[] jArr3;
        long[] jArr4;
        allocNameCopyBuffer<Object> allocnamecopybufferWrite;
        getTokenLineNr gettokenlinenr = this;
        gettokenlinenr.onFastForward.RemoteActionCompatParcelizer(gettokenlinenr.write, gettokenlinenr.onMediaButtonEvent.onSetCaptioningEnabled());
        try {
            if (!p0.write()) {
                copyHexChars copyhexchars = gettokenlinenr.onCustomAction;
                allocNameCopyBuffer<Object> allocnamecopybuffer = (copyhexchars == null || (allocnamecopybufferWrite = copyhexchars.write()) == null) ? gettokenlinenr.read : allocnamecopybufferWrite;
                copyHexChars copyhexchars2 = gettokenlinenr.onCustomAction;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(allocnamecopybuffer, copyhexchars2 != null ? copyhexchars2.write() : null)) {
                    str = "Compose:recordChanges";
                } else {
                    str = "Compose:applyChanges";
                }
                Object objIconCompatParcelizer = multiplyConjugate.INSTANCE.IconCompatParcelizer(str);
                try {
                    copyHexChars copyhexchars3 = gettokenlinenr.onCustomAction;
                    if (copyhexchars3 == null || (tofftvectorAudioAttributesCompatParcelizer = copyhexchars3.getMediaDescriptionCompat()) == null) {
                        tofftvectorAudioAttributesCompatParcelizer = gettokenlinenr.onFastForward;
                    }
                    allocnamecopybuffer.AudioAttributesImplApi21Parcelizer();
                    setEncoding setencodingOnAddQueueItem = gettokenlinenr.AudioAttributesImplBaseParcelizer.onAddQueueItem();
                    int i3 = 0;
                    try {
                        p0.write(allocnamecopybuffer, setencodingOnAddQueueItem, tofftvectorAudioAttributesCompatParcelizer, gettokenlinenr.onMediaButtonEvent.onSetCaptioningEnabled());
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        setencodingOnAddQueueItem.read(true);
                        allocnamecopybuffer.MediaBrowserCompatItemReceiver();
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                        multiplyConjugate.INSTANCE.write(objIconCompatParcelizer);
                        gettokenlinenr.onFastForward.RemoteActionCompatParcelizer();
                        gettokenlinenr.onFastForward.write();
                        if (gettokenlinenr.MediaBrowserCompatMediaItem) {
                            try {
                                Object objIconCompatParcelizer2 = multiplyConjugate.INSTANCE.IconCompatParcelizer("Compose:unobserve");
                                try {
                                    gettokenlinenr.MediaBrowserCompatMediaItem = false;
                                    setKeyListener<Object, Object> setkeylistener = gettokenlinenr.AudioAttributesImplApi26Parcelizer;
                                    long[] jArr5 = setkeylistener.RemoteActionCompatParcelizer;
                                    int length = jArr5.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            try {
                                                long j2 = jArr5[i4];
                                                char c2 = 7;
                                                long j3 = -9187201950435737472L;
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = i3;
                                                    while (i7 < i6) {
                                                        if ((j2 & 255) < 128) {
                                                            int i8 = (i4 << 3) + i7;
                                                            Object obj3 = setkeylistener.IconCompatParcelizer[i8];
                                                            Object obj4 = setkeylistener.MediaBrowserCompatItemReceiver[i8];
                                                            if (obj4 instanceof setEmojiCompatEnabled) {
                                                                toMagicModuleMetaRepoModel.read(obj4, "");
                                                                setEmojiCompatEnabled setemojicompatenabled = (setEmojiCompatEnabled) obj4;
                                                                Object[] objArr = setemojicompatenabled.write;
                                                                long[] jArr6 = setemojicompatenabled.AudioAttributesCompatParcelizer;
                                                                int length2 = jArr6.length - 2;
                                                                if (length2 >= 0) {
                                                                    obj2 = objIconCompatParcelizer2;
                                                                    int i9 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j4 = jArr6[i9];
                                                                            jArr2 = jArr5;
                                                                            i = length;
                                                                            c = 7;
                                                                            j = -9187201950435737472L;
                                                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                                                int i11 = 0;
                                                                                while (i11 < i10) {
                                                                                    if ((j4 & 255) < 128) {
                                                                                        jArr4 = jArr6;
                                                                                        int i12 = (i9 << 3) + i11;
                                                                                        if (!((rawReference) objArr[i12]).MediaBrowserCompatSearchResultReceiver()) {
                                                                                            setemojicompatenabled.read(i12);
                                                                                        }
                                                                                    } else {
                                                                                        jArr4 = jArr6;
                                                                                    }
                                                                                    j4 >>= 8;
                                                                                    i11++;
                                                                                    jArr6 = jArr4;
                                                                                }
                                                                                jArr3 = jArr6;
                                                                                if (i10 != 8) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr6;
                                                                            }
                                                                            if (i9 == length2) {
                                                                                break;
                                                                            }
                                                                            i9++;
                                                                            jArr5 = jArr2;
                                                                            length = i;
                                                                            jArr6 = jArr3;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            obj = obj2;
                                                                            multiplyConjugate.INSTANCE.write(obj);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    obj2 = objIconCompatParcelizer2;
                                                                    jArr2 = jArr5;
                                                                    i = length;
                                                                    c = c2;
                                                                    j = -9187201950435737472L;
                                                                }
                                                                if (setemojicompatenabled.IconCompatParcelizer()) {
                                                                    setkeylistener.AudioAttributesCompatParcelizer(i8);
                                                                }
                                                                i2 = 8;
                                                            } else {
                                                                obj2 = objIconCompatParcelizer2;
                                                                jArr2 = jArr5;
                                                                i = length;
                                                                c = c2;
                                                                j = -9187201950435737472L;
                                                                toMagicModuleMetaRepoModel.read(obj4, "");
                                                                if (!((rawReference) obj4).MediaBrowserCompatSearchResultReceiver()) {
                                                                    setkeylistener.AudioAttributesCompatParcelizer(i8);
                                                                }
                                                                i2 = 8;
                                                            }
                                                        } else {
                                                            obj2 = objIconCompatParcelizer2;
                                                            jArr2 = jArr5;
                                                            i = length;
                                                            c = c2;
                                                            j = j3;
                                                            i2 = i5;
                                                        }
                                                        j2 >>= i2;
                                                        i7++;
                                                        i5 = i2;
                                                        j3 = j;
                                                        c2 = c;
                                                        objIconCompatParcelizer2 = obj2;
                                                        jArr5 = jArr2;
                                                        length = i;
                                                    }
                                                    obj2 = objIconCompatParcelizer2;
                                                    jArr = jArr5;
                                                    int i13 = length;
                                                    if (i6 != i5) {
                                                        break;
                                                    } else {
                                                        length = i13;
                                                    }
                                                } else {
                                                    obj2 = objIconCompatParcelizer2;
                                                    jArr = jArr5;
                                                }
                                                if (i4 == length) {
                                                    break;
                                                }
                                                i4++;
                                                i3 = 0;
                                                objIconCompatParcelizer2 = obj2;
                                                jArr5 = jArr;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj2 = objIconCompatParcelizer2;
                                                obj = obj2;
                                                multiplyConjugate.INSTANCE.write(obj);
                                                throw th;
                                            }
                                        }
                                    } else {
                                        obj2 = objIconCompatParcelizer2;
                                    }
                                    onCustomAction();
                                    getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                                    multiplyConjugate.INSTANCE.write(obj2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = objIconCompatParcelizer2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                gettokenlinenr = this;
                                try {
                                    if (gettokenlinenr.MediaMetadataCompat.write() && gettokenlinenr.onCustomAction == null) {
                                        gettokenlinenr.onFastForward.read();
                                    }
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        gettokenlinenr = this;
                        try {
                            if (gettokenlinenr.MediaMetadataCompat.write() && gettokenlinenr.onCustomAction == null) {
                                gettokenlinenr.onFastForward.read();
                            }
                        } finally {
                        }
                    } catch (Throwable th5) {
                        setencodingOnAddQueueItem.read(false);
                        throw th5;
                    }
                } catch (Throwable th6) {
                    multiplyConjugate.INSTANCE.write(objIconCompatParcelizer);
                    throw th6;
                }
            } else {
                try {
                    if (gettokenlinenr.MediaMetadataCompat.write() && gettokenlinenr.onCustomAction == null) {
                        gettokenlinenr.onFastForward.read();
                    }
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // kotlin._reportMissingRootWS
    public final void read() {
        synchronized (this.RemoteActionCompatParcelizer) {
            try {
                read(this.MediaBrowserCompatSearchResultReceiver);
                handleMediaPlayPauseIfPendingOnHandler();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.write.isEmpty()) {
                        toFftVector tofftvector = this.onFastForward;
                        try {
                            tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
                            tofftvector.read();
                            tofftvector.IconCompatParcelizer();
                        } catch (Throwable th2) {
                            tofftvector.IconCompatParcelizer();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    this.write();
                    throw th3;
                }
            }
        }
    }

    @Override // kotlin._reportMissingRootWS
    public final void AudioAttributesImplApi26Parcelizer() {
        synchronized (this.RemoteActionCompatParcelizer) {
            try {
                if (this.MediaMetadataCompat.IconCompatParcelizer()) {
                    read(this.MediaMetadataCompat);
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.write.isEmpty()) {
                        toFftVector tofftvector = this.onFastForward;
                        try {
                            tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
                            tofftvector.read();
                            tofftvector.IconCompatParcelizer();
                        } catch (Throwable th2) {
                            tofftvector.IconCompatParcelizer();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    this.write();
                    throw th3;
                }
            }
        }
    }

    @Override // kotlin._reportMissingRootWS
    public final void AudioAttributesImplBaseParcelizer() {
        toFftVector tofftvector;
        synchronized (this.RemoteActionCompatParcelizer) {
            try {
                this.onMediaButtonEvent.onRemoveQueueItem();
                if (!this.write.isEmpty()) {
                    tofftvector = this.onFastForward;
                    try {
                        tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
                        tofftvector.read();
                        tofftvector.IconCompatParcelizer();
                    } finally {
                    }
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.write.isEmpty()) {
                        tofftvector = this.onFastForward;
                        try {
                            tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
                            tofftvector.read();
                            tofftvector.IconCompatParcelizer();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    write();
                    throw th2;
                }
            }
        }
    }

    @Override // kotlin._reportMissingRootWS
    public final void write() {
        this.IconCompatParcelizer.set(null);
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
        this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        if (this.write.isEmpty()) {
            return;
        }
        toFftVector tofftvector = this.onFastForward;
        try {
            tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
            tofftvector.read();
        } finally {
            tofftvector.IconCompatParcelizer();
        }
    }

    @Override // kotlin._reportMissingRootWS
    public final void RatingCompat() {
        synchronized (this.RemoteActionCompatParcelizer) {
            for (Object obj : this.AudioAttributesImplBaseParcelizer.getMediaBrowserCompatCustomActionResultReceiver()) {
                rawReference rawreference = obj instanceof rawReference ? (rawReference) obj : null;
                if (rawreference != null) {
                    rawreference.AudioAttributesCompatParcelizer();
                }
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    @Override // kotlin._reportMissingRootWS
    public final <R> R IconCompatParcelizer(_reportMissingRootWS p0, int p1, getCreatedOnDateMs<? extends R> p2) {
        if (p0 != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this) && p1 >= 0) {
            this.handleMediaPlayPauseIfPendingOnHandler = (getTokenLineNr) p0;
            this.onAddQueueItem = p1;
            try {
                return p2.invoke();
            } finally {
                this.handleMediaPlayPauseIfPendingOnHandler = null;
                this.onAddQueueItem = 0;
            }
        }
        return p2.invoke();
    }

    @Override // kotlin._reportMissingRootWS
    public final isResourceManaged IconCompatParcelizer(isResourceManaged p0) {
        isResourceManaged isresourcemanaged = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p0;
        return isresourcemanaged;
    }

    @Override // kotlin._append
    public final _includeScalar AudioAttributesCompatParcelizer(rawReference p0, Object p1) {
        _matchNull _matchnullOnFastForward;
        getTokenLineNr gettokenlinenr;
        if (p0.read()) {
            p0.RemoteActionCompatParcelizer(true);
        }
        _parseSlowFloat remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == null || !remoteActionCompatParcelizer.write()) {
            return _includeScalar.RemoteActionCompatParcelizer;
        }
        if (this.AudioAttributesImplBaseParcelizer.read(remoteActionCompatParcelizer)) {
            if (!p0.write()) {
                return _includeScalar.RemoteActionCompatParcelizer;
            }
            _includeScalar _includescalarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, remoteActionCompatParcelizer, p1);
            if (_includescalarAudioAttributesCompatParcelizer != _includeScalar.RemoteActionCompatParcelizer && (_matchnullOnFastForward = onFastForward()) != null) {
                _matchnullOnFastForward.write(p0, p1);
            }
            return _includescalarAudioAttributesCompatParcelizer;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            gettokenlinenr = this.handleMediaPlayPauseIfPendingOnHandler;
        }
        if (gettokenlinenr != null && gettokenlinenr.read(p0, p1)) {
            return _includeScalar.write;
        }
        return _includeScalar.RemoteActionCompatParcelizer;
    }

    @Override // kotlin._append
    public final void RemoteActionCompatParcelizer(rawReference p0) {
        this.MediaBrowserCompatMediaItem = true;
        _matchNull _matchnullOnFastForward = onFastForward();
        if (_matchnullOnFastForward != null) {
            _matchnullOnFastForward.RemoteActionCompatParcelizer(p0);
        }
    }

    private final boolean read(rawReference p0, Object p1) {
        return MediaMetadataCompat() && this.onMediaButtonEvent.IconCompatParcelizer(p0, p1);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1 A[Catch: all -> 0x00c2, EDGE_INSN: B:64:0x00a1->B:48:0x00a1 BREAK  A[LOOP:0: B:29:0x005a->B:44:0x0099], EDGE_INSN: B:65:0x00a1->B:48:0x00a1 BREAK  A[LOOP:0: B:29:0x005a->B:44:0x0099], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:11:0x001e, B:13:0x0024, B:17:0x002a, B:21:0x0037, B:22:0x0040, B:26:0x004c, B:29:0x005a, B:31:0x006a, B:33:0x0076, B:35:0x0080, B:40:0x008f, B:44:0x0099, B:45:0x009c, B:48:0x00a1), top: B:62:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin._includeScalar AudioAttributesCompatParcelizer(kotlin.rawReference r21, kotlin._parseSlowFloat r22, java.lang.Object r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            monitor-enter(r4)
            o.getTokenLineNr r5 = r0.handleMediaPlayPauseIfPendingOnHandler     // Catch: java.lang.Throwable -> Lc2
            r6 = 0
            if (r5 == 0) goto L1b
            o.releaseTokenBuffer r7 = r0.AudioAttributesImplBaseParcelizer     // Catch: java.lang.Throwable -> Lc2
            int r8 = r0.onAddQueueItem     // Catch: java.lang.Throwable -> Lc2
            boolean r7 = r7.read(r8, r2)     // Catch: java.lang.Throwable -> Lc2
            if (r7 == 0) goto L1b
            goto L1c
        L1b:
            r5 = r6
        L1c:
            if (r5 != 0) goto La6
            boolean r6 = r0.read(r1, r3)     // Catch: java.lang.Throwable -> Lc2
            if (r6 == 0) goto L28
            o._includeScalar r0 = kotlin._includeScalar.write     // Catch: java.lang.Throwable -> Lc2
            monitor-exit(r4)
            return r0
        L28:
            if (r3 != 0) goto L33
            o.setKeyListener<java.lang.Object, java.lang.Object> r6 = r0.MediaDescriptionCompat     // Catch: java.lang.Throwable -> Lc2
            o.getEncoding r7 = kotlin.getEncoding.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            kotlin.getAndClear.AudioAttributesCompatParcelizer(r6, r1, r7)     // Catch: java.lang.Throwable -> Lc2
            goto La6
        L33:
            boolean r6 = r3 instanceof kotlin.reportInvalidNumber
            if (r6 != 0) goto L40
            o.setKeyListener<java.lang.Object, java.lang.Object> r6 = r0.MediaDescriptionCompat     // Catch: java.lang.Throwable -> Lc2
            o.getEncoding r7 = kotlin.getEncoding.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            kotlin.getAndClear.AudioAttributesCompatParcelizer(r6, r1, r7)     // Catch: java.lang.Throwable -> Lc2
            goto La6
        L40:
            o.setKeyListener<java.lang.Object, java.lang.Object> r6 = r0.MediaDescriptionCompat     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r6 = r6.AudioAttributesImplApi26Parcelizer(r1)     // Catch: java.lang.Throwable -> Lc2
            if (r6 == 0) goto La1
            boolean r7 = r6 instanceof kotlin.setEmojiCompatEnabled
            if (r7 == 0) goto L9c
            o.setEmojiCompatEnabled r6 = (kotlin.setEmojiCompatEnabled) r6     // Catch: java.lang.Throwable -> Lc2
            o.setButtonDrawable r6 = (kotlin.setButtonDrawable) r6     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object[] r7 = r6.write     // Catch: java.lang.Throwable -> Lc2
            long[] r6 = r6.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Lc2
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lc2
            int r8 = r8 + (-2)
            if (r8 < 0) goto La1
            r10 = 0
        L5a:
            r11 = r6[r10]     // Catch: java.lang.Throwable -> Lc2
            long r13 = ~r11     // Catch: java.lang.Throwable -> Lc2
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L97
            int r13 = r10 - r8
            int r13 = ~r13     // Catch: java.lang.Throwable -> Lc2
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L74:
            if (r15 >= r13) goto L94
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L8e
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]     // Catch: java.lang.Throwable -> Lc2
            o.getEncoding r14 = kotlin.getEncoding.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            if (r9 != r14) goto L8b
            goto La6
        L8b:
            r9 = 8
            goto L8f
        L8e:
            r9 = r14
        L8f:
            long r11 = r11 >> r9
            int r15 = r15 + 1
            r14 = r9
            goto L74
        L94:
            r9 = r14
            if (r13 != r9) goto La1
        L97:
            if (r10 == r8) goto La1
            int r10 = r10 + 1
            goto L5a
        L9c:
            o.getEncoding r7 = kotlin.getEncoding.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            if (r6 != r7) goto La1
            goto La6
        La1:
            o.setKeyListener<java.lang.Object, java.lang.Object> r6 = r0.MediaDescriptionCompat     // Catch: java.lang.Throwable -> Lc2
            kotlin.getAndClear.IconCompatParcelizer(r6, r1, r3)     // Catch: java.lang.Throwable -> Lc2
        La6:
            monitor-exit(r4)
            if (r5 == 0) goto Lae
            o._includeScalar r0 = r5.AudioAttributesCompatParcelizer(r1, r2, r3)
            return r0
        Lae:
            o.convertNumberToLong r1 = r0.AudioAttributesCompatParcelizer
            r2 = r0
            o._reportMissingRootWS r2 = (kotlin._reportMissingRootWS) r2
            r1.AudioAttributesCompatParcelizer(r2)
            boolean r0 = r20.MediaMetadataCompat()
            if (r0 == 0) goto Lbf
            o._includeScalar r0 = kotlin._includeScalar.read
            return r0
        Lbf:
            o._includeScalar r0 = kotlin._includeScalar.AudioAttributesCompatParcelizer
            return r0
        Lc2:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenLineNr.AudioAttributesCompatParcelizer(o.rawReference, o._parseSlowFloat, java.lang.Object):o._includeScalar");
    }

    public final void read(Object p0, rawReference p1) {
        getAndClear.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, p0, p1);
    }

    public final void AudioAttributesCompatParcelizer(reportInvalidNumber<?> p0) {
        if (getAndClear.read(this.AudioAttributesImplApi26Parcelizer, p0)) {
            return;
        }
        getAndClear.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, p0);
    }

    private final setKeyListener<Object, Object> onMediaButtonEvent() {
        setKeyListener<Object, Object> setkeylistener = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = getAndClear.IconCompatParcelizer((setKeyListener) null, 1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        return setkeylistener;
    }

    private final _matchNull onFastForward() {
        return this.onCommand.IconCompatParcelizer();
    }

    @Override // kotlin.InterfaceC0163contentReference
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (this.RemoteActionCompatParcelizer) {
            if (this.onCustomAction != null) {
                getInputCodeUtf8JsNames.read("Deactivate is not supported while pausable composition is in progress");
            }
            boolean z = this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer() > 0;
            if (z || !this.write.isEmpty()) {
                Object objIconCompatParcelizer = multiplyConjugate.INSTANCE.IconCompatParcelizer("Compose:deactivate");
                try {
                    toFftVector tofftvector = this.onFastForward;
                    try {
                        tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
                        if (z) {
                            this.read.AudioAttributesImplApi21Parcelizer();
                            setEncoding setencodingOnAddQueueItem = this.AudioAttributesImplBaseParcelizer.onAddQueueItem();
                            try {
                                convertNumberToBigDecimal.IconCompatParcelizer(setencodingOnAddQueueItem, this.onFastForward);
                                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                                setencodingOnAddQueueItem.read(true);
                                this.read.MediaBrowserCompatItemReceiver();
                                tofftvector.RemoteActionCompatParcelizer();
                            } catch (Throwable th) {
                                setencodingOnAddQueueItem.read(false);
                                throw th;
                            }
                        }
                        tofftvector.read();
                        tofftvector.IconCompatParcelizer();
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    } catch (Throwable th2) {
                        tofftvector.IconCompatParcelizer();
                        throw th2;
                    }
                } finally {
                    multiplyConjugate.INSTANCE.write(objIconCompatParcelizer);
                }
            }
            getAndClear.write(this.AudioAttributesImplApi26Parcelizer);
            getAndClear.write(this.MediaBrowserCompatItemReceiver);
            getAndClear.write(this.MediaDescriptionCompat);
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
            this.MediaMetadataCompat.RemoteActionCompatParcelizer();
            this.onMediaButtonEvent.onRewind();
            this.onPlay = 1;
            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // kotlin._reportMissingRootWS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(java.util.Set<? extends java.lang.Object> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof kotlin.loadMore
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            o.loadMore r15 = (kotlin.loadMore) r15
            o.setButtonDrawable r15 = r15.RemoteActionCompatParcelizer()
            java.lang.Object[] r0 = r15.write
            long[] r15 = r15.AudioAttributesCompatParcelizer
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            o.setKeyListener<java.lang.Object, java.lang.Object> r11 = r14.AudioAttributesImplApi26Parcelizer
            boolean r11 = kotlin.getAndClear.read(r11, r10)
            if (r11 != 0) goto L50
            o.setKeyListener<java.lang.Object, java.lang.Object> r11 = r14.MediaBrowserCompatItemReceiver
            boolean r10 = kotlin.getAndClear.read(r11, r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            o.setKeyListener<java.lang.Object, java.lang.Object> r3 = r14.AudioAttributesImplApi26Parcelizer
            boolean r3 = kotlin.getAndClear.read(r3, r0)
            if (r3 != 0) goto L7c
            o.setKeyListener<java.lang.Object, java.lang.Object> r3 = r14.MediaBrowserCompatItemReceiver
            boolean r0 = kotlin.getAndClear.read(r3, r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenLineNr.read(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0293 A[PHI: r16 r25 r33 r34
      0x0293: PHI (r16v13 long[]) = (r16v12 long[]), (r16v12 long[]), (r16v14 long[]) binds: [B:116:0x028a, B:118:0x0290, B:113:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r25v4 long) = (r25v3 long), (r25v3 long), (r25v6 long) binds: [B:116:0x028a, B:118:0x0290, B:113:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r33v13 int) = (r33v12 int), (r33v12 int), (r33v15 int) binds: [B:116:0x028a, B:118:0x0290, B:113:0x0276] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r34v13 int) = (r34v12 int), (r34v12 int), (r34v15 int) binds: [B:116:0x028a, B:118:0x0290, B:113:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void IconCompatParcelizer(java.util.Set<? extends java.lang.Object> r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenLineNr.IconCompatParcelizer(java.util.Set, boolean):void");
    }

    @Override // kotlin._reportMissingRootWS
    public final void RemoteActionCompatParcelizer(List<Pair<getFilter, getFilter>> p0) {
        int size = p0.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.get(i).write().getRead(), this)) {
                    _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
                    break;
                }
                i++;
            }
        }
        try {
            this.onMediaButtonEvent.RemoteActionCompatParcelizer(p0);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } catch (Throwable th) {
            try {
                if (!this.write.isEmpty()) {
                    toFftVector tofftvector = this.onFastForward;
                    try {
                        tofftvector.RemoteActionCompatParcelizer(this.write, this.onMediaButtonEvent.onSetCaptioningEnabled());
                        tofftvector.read();
                        tofftvector.IconCompatParcelizer();
                    } catch (Throwable th2) {
                        tofftvector.IconCompatParcelizer();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                this.write();
                throw th3;
            }
        }
    }
}
