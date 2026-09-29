package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.ConstraintLayout;
import kotlin.Guideline;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.getSystemGestureInsets;
import kotlin.setTag;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0015\u001a\u00020\u00122.\u0010\b\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010*J'\u0010\u0018\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020,2\u0006\u0010\t\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020.H\u0016¢\u0006\u0004\b\u0018\u0010/J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\b\u001a\u0002002\u0006\u0010\t\u001a\u00020-H\u0016¢\u0006\u0004\b\u0018\u00101J\u000f\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u0010*J\u000f\u00104\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u0010*J\u0018\u00108\u001a\u00020\u00122\u0006\u0010\b\u001a\u000207H\u0082@¢\u0006\u0004\b8\u00109J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001b\u0010:J\u0010\u0010\u0015\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010*JE\u0010\u0015\u001a\u00020\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010=\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010>J\u001f\u0010<\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020,2\u0006\u0010\t\u001a\u00020-H\u0002¢\u0006\u0004\b<\u0010?J\u000f\u0010@\u001a\u00020\u0012H\u0002¢\u0006\u0004\b@\u0010*J3\u0010\u001b\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020A2\u0006\u0010\t\u001a\u00020B2\b\b\u0002\u0010\u000b\u001a\u00020\u00172\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010CJ\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020BH\u0002¢\u0006\u0004\b\u0015\u0010\u0019J\u000f\u0010D\u001a\u00020\u0012H\u0002¢\u0006\u0004\bD\u0010*J'\u00108\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020A2\u0006\u0010\t\u001a\u00020B2\u0006\u0010\u000b\u001a\u00020&H\u0002¢\u0006\u0004\b8\u0010EJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020,2\u0006\u0010\t\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020FH\u0002¢\u0006\u0004\b\u0015\u0010GJ'\u0010<\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020,2\u0006\u0010\t\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020HH\u0002¢\u0006\u0004\b<\u0010IJ'\u0010\u0018\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020,2\u0006\u0010\t\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020JH\u0002¢\u0006\u0004\b\u0018\u0010KJ'\u0010<\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020,2\u0006\u0010\t\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020LH\u0002¢\u0006\u0004\b<\u0010MJ'\u0010<\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020A2\u0006\u0010\t\u001a\u00020A2\u0006\u0010\u000b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b<\u0010NJ\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020A2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010OJ\u0017\u00108\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020AH\u0002¢\u0006\u0004\b8\u0010PJ\u000f\u0010Q\u001a\u00020\u0012H\u0002¢\u0006\u0004\bQ\u0010*J\u0015\u0010<\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020#¢\u0006\u0004\b<\u0010RR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR<\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b\u0018\u0010YR$\u0010<\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bW\u0010\u001eR\"\u00108\u001a\u0004\u0018\u00010\n2\b\u0010\b\u001a\u0004\u0018\u00010\n8\u0004@BX\u0085\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\\R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010XR\u001e\u0010_\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010^R\u0018\u0010]\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010aR\u001c\u0010U\u001a\u00020\u00078\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u001d\u0010[\u001a\u0004\b_\u0010\u001eR\u0016\u00102\u001a\u00020\u00078\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b<\u0010[R\u0018\u0010W\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010bR\u0014\u0010Z\u001a\u00020F8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010cR\u0018\u0010+\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010dR\u0014\u0010g\u001a\u00020L8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0018\u0010\u001d\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010hR\u0014\u00106\u001a\u00020H8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010kR\u0014\u0010S\u001a\u00020J8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010v\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010{\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010zR\u0016\u0010|\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010uR\u0018\u0010~\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bq\u0010}"}, d2 = {"Lo/Guideline;", "Lo/addAbstractTypeResolver;", "Lo/forRootType;", "Lo/_resolveAndValidateGeneric;", "Lo/getLongMask;", "Lkotlin/Function1;", "Lo/handleWeirdNumberValue;", "", "p0", "p1", "Lo/hashCode;", "p2", "Lo/superDispatchKeyEvent;", "p3", "<init>", "(Lo/getAnswerMap;ZLo/hashCode;Lo/superDispatchKeyEvent;)V", "Lkotlin/Function2;", "Lo/setTag$AudioAttributesCompatParcelizer;", "", "Lo/SampleVideos;", "", "IconCompatParcelizer", "(Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getReferencedType;", "write", "(J)V", "Lo/setTag$write;", "AudioAttributesCompatParcelizer", "(Lo/setTag$write;)V", "MediaMetadataCompat", "()Z", "Lo/reportPropertyInputMismatch;", "onStop", "()Lo/reportPropertyInputMismatch;", "Lo/fromCursor;", "Lo/setTag;", "onSetCaptioningEnabled", "()Lo/fromCursor;", "Lo/getAccessibilityNodeProvider;", "onSkipToQueueItem", "()Lo/getAccessibilityNodeProvider;", "setSessionImpl", "()V", "MediaDescriptionCompat", "Lo/DeserializationContext;", "Lo/_shapeForToken;", "Lo/getKey;", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "Lo/DatabindContext;", "(Lo/DatabindContext;Lo/_shapeForToken;)V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/handleWeirdStringValue;", "onSetRepeatMode", "()Lo/handleWeirdStringValue;", "MediaBrowserCompatMediaItem", "Lo/setTag$IconCompatParcelizer;", "RemoteActionCompatParcelizer", "(Lo/setTag$IconCompatParcelizer;Lo/SampleVideos;)Ljava/lang/Object;", "(Lo/setTag$write;Lo/SampleVideos;)Ljava/lang/Object;", "(Lo/SampleVideos;)Ljava/lang/Object;", "read", "p4", "(Lo/getAnswerMap;ZLo/hashCode;Lo/superDispatchKeyEvent;Z)V", "(Lo/DeserializationContext;Lo/_shapeForToken;)V", "onSkipToPrevious", "Lo/getArrayBuilders;", "Lo/findClass;", "(Lo/getArrayBuilders;JJZ)V", "onSetShuffleMode", "(Lo/getArrayBuilders;JLo/getAccessibilityNodeProvider;)V", "Lo/ConstraintLayout$AudioAttributesCompatParcelizer;", "(Lo/DeserializationContext;Lo/_shapeForToken;Lo/ConstraintLayout$AudioAttributesCompatParcelizer;)V", "Lo/ConstraintLayout$write;", "(Lo/DeserializationContext;Lo/_shapeForToken;Lo/ConstraintLayout$write;)V", "Lo/ConstraintLayout$read;", "(Lo/DeserializationContext;Lo/_shapeForToken;Lo/ConstraintLayout$read;)V", "Lo/ConstraintLayout$RemoteActionCompatParcelizer;", "(Lo/DeserializationContext;Lo/_shapeForToken;Lo/ConstraintLayout$RemoteActionCompatParcelizer;)V", "(Lo/getArrayBuilders;Lo/getArrayBuilders;J)V", "(Lo/getArrayBuilders;J)V", "(Lo/getArrayBuilders;)V", "onSkipToNext", "(Lo/setTag;)V", "handleMediaPlayPauseIfPendingOnHandler", "Lo/superDispatchKeyEvent;", "MediaBrowserCompatItemReceiver", "()Lo/superDispatchKeyEvent;", "AudioAttributesImplApi26Parcelizer", "Lo/getAnswerMap;", "()Lo/getAnswerMap;", "RatingCompat", "Z", "Lo/hashCode;", "AudioAttributesImplBaseParcelizer", "Lo/fromCursor;", "AudioAttributesImplApi21Parcelizer", "Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;", "Lo/getSystemGestureInsets$AudioAttributesCompatParcelizer;", "Lo/ConstraintLayout$AudioAttributesCompatParcelizer;", "()Lo/ConstraintLayout$AudioAttributesCompatParcelizer;", "Lo/ConstraintLayout$RemoteActionCompatParcelizer;", "onSetPlaybackSpeed", "()Lo/ConstraintLayout$RemoteActionCompatParcelizer;", "MediaBrowserCompatSearchResultReceiver", "Lo/ConstraintLayout$write;", "onSetRating", "()Lo/ConstraintLayout$write;", "Lo/ConstraintLayout$read;", "onCommand", "onRewind", "()Lo/ConstraintLayout$read;", "Lo/ConstraintLayout;", "Lo/ConstraintLayout;", "onAddQueueItem", "onMediaButtonEvent", "Lo/reportPropertyInputMismatch;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "J", "onCustomAction", "Lo/getAccessibilityNodeProvider;", "onPlay", "Lo/setFitsSystemWindows;", "Lo/setFitsSystemWindows;", "onPlayFromMediaId", "onFastForward", "Lo/handleWeirdStringValue;", "onPause"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Guideline extends addAbstractTypeResolver implements forRootType, _resolveAndValidateGeneric, getLongMask {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private ConstraintLayout.read onCommand;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private ConstraintLayout onAddQueueItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super handleWeirdNumberValue, Boolean> write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private ConstraintLayout.AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private ConstraintLayout.RemoteActionCompatParcelizer MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private fromCursor<setTag> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private getSystemGestureInsets.AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private setFitsSystemWindows onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private ConstraintLayout.write MediaMetadataCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private superDispatchKeyEvent AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private handleWeirdStringValue onPause;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private getAccessibilityNodeProvider onPlay;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private reportPropertyInputMismatch MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    protected hashCode RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<handleWeirdNumberValue, Boolean> IconCompatParcelizer = new getAnswerMap() { // from class: o.ConstraintLayoutLayoutParams
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return Boolean.valueOf(Guideline.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (handleWeirdNumberValue) obj));
        }
    };

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private long onCustomAction = getReferencedType.INSTANCE.read();

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private long onFastForward = getReferencedType.INSTANCE.write();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        /* synthetic */ Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return Guideline.this.RemoteActionCompatParcelizer((setTag.IconCompatParcelizer) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[ConstraintLayout.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.values().length];
            try {
                iArr[ConstraintLayout.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            read = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object read;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return Guideline.this.IconCompatParcelizer(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object read;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return Guideline.this.AudioAttributesCompatParcelizer(null, this);
        }
    }

    public abstract void AudioAttributesCompatParcelizer(setTag.write p0);

    public abstract Object IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos);

    /* JADX INFO: renamed from: MediaMetadataCompat */
    public abstract boolean getWrite();

    public abstract void write(long p0);

    public Guideline(getAnswerMap<? super handleWeirdNumberValue, Boolean> getanswermap, boolean z, hashCode hashcode, superDispatchKeyEvent superdispatchkeyevent) {
        this.AudioAttributesCompatParcelizer = superdispatchkeyevent;
        this.write = getanswermap;
        this.read = z;
        this.RemoteActionCompatParcelizer = hashcode;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final superDispatchKeyEvent getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getAnswerMap<handleWeirdNumberValue, Boolean> write() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    protected final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(Guideline guideline, handleWeirdNumberValue handleweirdnumbervalue) {
        return guideline.write.invoke(handleweirdnumbervalue).booleanValue();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private final ConstraintLayout.AudioAttributesCompatParcelizer RatingCompat() {
        ConstraintLayout.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer;
        }
        ConstraintLayout.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new ConstraintLayout.AudioAttributesCompatParcelizer(null, false, 3, null);
        this.AudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer2;
        return audioAttributesCompatParcelizer2;
    }

    private final ConstraintLayout.RemoteActionCompatParcelizer onSetPlaybackSpeed() {
        ConstraintLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaDescriptionCompat;
        if (remoteActionCompatParcelizer != null) {
            return remoteActionCompatParcelizer;
        }
        ConstraintLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new ConstraintLayout.RemoteActionCompatParcelizer(0L, 1, null);
        this.MediaDescriptionCompat = remoteActionCompatParcelizer2;
        return remoteActionCompatParcelizer2;
    }

    private final ConstraintLayout.write onSetRating() {
        ConstraintLayout.write writeVar = this.MediaMetadataCompat;
        if (writeVar != null) {
            return writeVar;
        }
        ConstraintLayout.write writeVar2 = new ConstraintLayout.write(null, 0L, false, 7, null);
        this.MediaMetadataCompat = writeVar2;
        return writeVar2;
    }

    private final ConstraintLayout.read onRewind() {
        ConstraintLayout.read readVar = this.onCommand;
        if (readVar != null) {
            return readVar;
        }
        ConstraintLayout.read readVar2 = new ConstraintLayout.read(null, 0L, null, 7, null);
        this.onCommand = readVar2;
        return readVar2;
    }

    private final reportPropertyInputMismatch onStop() {
        reportPropertyInputMismatch reportpropertyinputmismatch = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (reportpropertyinputmismatch != null) {
            return reportpropertyinputmismatch;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.".toString());
    }

    private final fromCursor<setTag> onSetCaptioningEnabled() {
        fromCursor<setTag> fromcursor = this.AudioAttributesImplApi21Parcelizer;
        if (fromcursor != null) {
            return fromcursor;
        }
        throw new IllegalArgumentException("Events channel not initialized.".toString());
    }

    private final getAccessibilityNodeProvider onSkipToQueueItem() {
        getAccessibilityNodeProvider getaccessibilitynodeprovider = this.onPlay;
        if (getaccessibilitynodeprovider != null) {
            return getaccessibilitynodeprovider;
        }
        throw new IllegalArgumentException("Touch slop detector not initialized.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSessionImpl() {
        this.MediaBrowserCompatItemReceiver = true;
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            this.AudioAttributesImplApi21Parcelizer = getLastName.read(Integer.MAX_VALUE, null, 6);
        }
        C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new AudioAttributesImplApi21Parcelizer(null), 3);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        Object IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:38:0x00e6, B:35:0x00ca], limit reached: 52 */
        /* JADX WARN: Path cross not found for [B:40:0x00ec, B:16:0x0056], limit reached: 52 */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[PHI: r1 r3
          0x002d: PHI (r1v14 o.MagicModuleUseCaseImplWhenMappings$write) = (r1v8 o.MagicModuleUseCaseImplWhenMappings$write), (r1v16 o.MagicModuleUseCaseImplWhenMappings$write) binds: [B:11:0x002a, B:31:0x00c1] A[DONT_GENERATE, DONT_INLINE]
          0x002d: PHI (r3v9 o.TopUserCompanion) = (r3v5 o.TopUserCompanion), (r3v15 o.TopUserCompanion) binds: [B:11:0x002a, B:31:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[PHI: r1
          0x0056: PHI (r1v24 o.TopUserCompanion) = 
          (r1v2 o.TopUserCompanion)
          (r1v10 o.TopUserCompanion)
          (r1v12 o.TopUserCompanion)
          (r1v15 o.TopUserCompanion)
          (r1v15 o.TopUserCompanion)
          (r1v15 o.TopUserCompanion)
          (r1v18 o.TopUserCompanion)
          (r1v28 o.TopUserCompanion)
         binds: [B:15:0x004e, B:8:0x001e, B:45:0x0110, B:39:0x00ea, B:41:0x00fc, B:36:0x00e3, B:47:0x0113, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ca A[Catch: CancellationException -> 0x0100, TryCatch #1 {CancellationException -> 0x0100, blocks: (B:33:0x00c4, B:35:0x00ca, B:38:0x00e6, B:40:0x00ec, B:8:0x001e), top: B:53:0x001e }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e6 A[Catch: CancellationException -> 0x0100, TryCatch #1 {CancellationException -> 0x0100, blocks: (B:33:0x00c4, B:35:0x00ca, B:38:0x00e6, B:40:0x00ec, B:8:0x001e), top: B:53:0x001e }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e3 -> B:16:0x0056). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ea -> B:16:0x0056). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fc -> B:16:0x0056). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0110 -> B:16:0x0056). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0113 -> B:16:0x0056). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Guideline.AudioAttributesImplApi21Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.Guideline$AudioAttributesImplApi21Parcelizer$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "processDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "name", "dragDelta"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, ? extends getShowPopup>, SampleVideos<? super getShowPopup>, Object> {
            /* synthetic */ Object AudioAttributesCompatParcelizer;
            Object IconCompatParcelizer;
            final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<setTag> RemoteActionCompatParcelizer;
            int read;
            final /* synthetic */ Guideline write;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0051 -> B:25:0x0066). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:24:0x0063). Please report as a decompilation issue!!! */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r5.read
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r5.IconCompatParcelizer
                    o.MagicModuleUseCaseImplWhenMappings$write r1 = (o.MagicModuleUseCaseImplWhenMappings.write) r1
                    java.lang.Object r3 = r5.AudioAttributesCompatParcelizer
                    o.getAnswerMap r3 = (kotlin.getAnswerMap) r3
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L63
                L17:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1f:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    java.lang.Object r6 = r5.AudioAttributesCompatParcelizer
                    o.getAnswerMap r6 = (kotlin.getAnswerMap) r6
                    r3 = r6
                L27:
                    o.MagicModuleUseCaseImplWhenMappings$write<o.setTag> r6 = r5.RemoteActionCompatParcelizer
                    T r6 = r6.write
                    boolean r6 = r6 instanceof o.setTag.write
                    if (r6 != 0) goto L69
                    o.MagicModuleUseCaseImplWhenMappings$write<o.setTag> r6 = r5.RemoteActionCompatParcelizer
                    T r6 = r6.write
                    boolean r6 = r6 instanceof o.setTag.read
                    if (r6 != 0) goto L69
                    o.MagicModuleUseCaseImplWhenMappings$write<o.setTag> r6 = r5.RemoteActionCompatParcelizer
                    T r6 = r6.write
                    boolean r1 = r6 instanceof o.setTag.AudioAttributesCompatParcelizer
                    r4 = 0
                    if (r1 == 0) goto L43
                    o.setTag$AudioAttributesCompatParcelizer r6 = (o.setTag.AudioAttributesCompatParcelizer) r6
                    goto L44
                L43:
                    r6 = r4
                L44:
                    if (r6 == 0) goto L49
                    r3.invoke(r6)
                L49:
                    o.MagicModuleUseCaseImplWhenMappings$write<o.setTag> r1 = r5.RemoteActionCompatParcelizer
                    o.Guideline r6 = r5.write
                    o.fromCursor r6 = kotlin.Guideline.write(r6)
                    if (r6 == 0) goto L66
                    r4 = r5
                    o.SampleVideos r4 = (kotlin.SampleVideos) r4
                    r5.AudioAttributesCompatParcelizer = r3
                    r5.IconCompatParcelizer = r1
                    r5.read = r2
                    java.lang.Object r6 = r6.IconCompatParcelizer(r4)
                    if (r6 != r0) goto L63
                    return r0
                L63:
                    r4 = r6
                    o.setTag r4 = (kotlin.setTag) r4
                L66:
                    r1.write = r4
                    goto L27
                L69:
                    o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Guideline.AudioAttributesImplApi21Parcelizer.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(MagicModuleUseCaseImplWhenMappings.write<setTag> writeVar, Guideline guideline, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = writeVar;
                this.write = guideline;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
                anonymousClass3.AudioAttributesCompatParcelizer = obj;
                return anonymousClass3;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Object invoke(getAnswerMap<? super setTag.AudioAttributesCompatParcelizer, getShowPopup> getanswermap, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(getanswermap, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = Guideline.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
            audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer = obj;
            return audioAttributesImplApi21Parcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void MediaDescriptionCompat() {
        this.MediaBrowserCompatItemReceiver = false;
        read();
        this.onFastForward = getReferencedType.INSTANCE.write();
    }

    @Override // kotlin.forRootType
    public void write(DeserializationContext p0, _shapeForToken p1, long p2) {
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        if (getDesignInfoListui_tooling.MediaBrowserCompatCustomActionResultReceiver) {
            if (this.read) {
                if (this.onAddQueueItem == null) {
                    this.onAddQueueItem = RatingCompat();
                }
                read(p0, p1);
                return;
            }
            return;
        }
        if (this.read && this.onPause == null) {
            this.onPause = (handleWeirdStringValue) AudioAttributesCompatParcelizer(onSetRepeatMode());
        }
        handleWeirdStringValue handleweirdstringvalue = this.onPause;
        if (handleweirdstringvalue != null) {
            handleweirdstringvalue.write(p0, p1, p2);
        }
    }

    @Override // kotlin._resolveAndValidateGeneric
    public void write(DatabindContext p0, _shapeForToken p1) {
        if (this.read) {
            if (this.onPlayFromMediaId == null) {
                this.onPlayFromMediaId = new setFitsSystemWindows(this);
            }
            setFitsSystemWindows setfitssystemwindows = this.onPlayFromMediaId;
            if (setfitssystemwindows != null) {
                setfitssystemwindows.AudioAttributesCompatParcelizer(p0, p1);
            }
        }
    }

    @Override // kotlin._resolveAndValidateGeneric
    public void MediaBrowserCompatCustomActionResultReceiver() {
        setFitsSystemWindows setfitssystemwindows = this.onPlayFromMediaId;
        if (setfitssystemwindows != null) {
            setfitssystemwindows.RemoteActionCompatParcelizer();
        }
    }

    private final handleWeirdStringValue onSetRepeatMode() {
        return hasSomeOfFeatures.write(new write());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write implements PointerInputEventHandler {
        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(final handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            final reportPropertyInputMismatch reportpropertyinputmismatch = new reportPropertyInputMismatch();
            final MagicModuleUseCaseImplWhenMappings.read readVar = new MagicModuleUseCaseImplWhenMappings.read();
            readVar.IconCompatParcelizer = hasRawClass.MediaBrowserCompatCustomActionResultReceiver(collectLongDefaults.AudioAttributesImplApi21Parcelizer(Guideline.this));
            final Guideline guideline = Guideline.this;
            getModuleData getmoduledata = new getModuleData() { // from class: o.Constraints
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return Guideline.write.RemoteActionCompatParcelizer(guideline, reportpropertyinputmismatch, (getArrayBuilders) obj, (getArrayBuilders) obj2, (getReferencedType) obj3);
                }
            };
            final Guideline guideline2 = Guideline.this;
            getAnswerMap getanswermap = new getAnswerMap() { // from class: o.ConstraintsLayoutParams
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Guideline.write.write(reportpropertyinputmismatch, handlebadmerge, guideline2, (getArrayBuilders) obj);
                }
            };
            final Guideline guideline3 = Guideline.this;
            getCreatedOnDateMs getcreatedondatems = new getCreatedOnDateMs() { // from class: o.setGuidelineEnd
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return Guideline.write.read(guideline3);
                }
            };
            final Guideline guideline4 = Guideline.this;
            getCreatedOnDateMs getcreatedondatems2 = new getCreatedOnDateMs() { // from class: o.setGuidelineBegin
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return Boolean.valueOf(Guideline.write.AudioAttributesCompatParcelizer(guideline4));
                }
            };
            final Guideline guideline5 = Guideline.this;
            Object objIconCompatParcelizer = College.IconCompatParcelizer(new AnonymousClass1(handlebadmerge, Guideline.this, getmoduledata, getanswermap, getcreatedondatems, getcreatedondatems2, new MagicModuleSubmissionRequestBody() { // from class: o.setGuidelinePercent
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return Guideline.write.read(guideline5, readVar, reportpropertyinputmismatch, (getArrayBuilders) obj, (getReferencedType) obj2);
                }
            }, null), sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(Guideline guideline, reportPropertyInputMismatch reportpropertyinputmismatch, getArrayBuilders getarraybuilders, getArrayBuilders getarraybuilders2, getReferencedType getreferencedtype) {
            guideline.onFastForward = getReferencedType.INSTANCE.write();
            if (guideline.write().invoke(handleWeirdNumberValue.AudioAttributesCompatParcelizer(getarraybuilders.getMediaBrowserCompatItemReceiver())).booleanValue()) {
                if (!guideline.getMediaBrowserCompatItemReceiver()) {
                    guideline.setSessionImpl();
                }
                reportUnresolvedObjectId.RemoteActionCompatParcelizer(reportpropertyinputmismatch, getarraybuilders);
                long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer(getarraybuilders2.getRead(), getreferencedtype.getWrite());
                fromCursor fromcursor = guideline.AudioAttributesImplApi21Parcelizer;
                if (fromcursor != null) {
                    getNameArray.RemoteActionCompatParcelizer(fromcursor.read(new setTag.IconCompatParcelizer(jAudioAttributesCompatParcelizer, null)));
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(reportPropertyInputMismatch reportpropertyinputmismatch, handleBadMerge handlebadmerge, Guideline guideline, getArrayBuilders getarraybuilders) {
            reportUnresolvedObjectId.RemoteActionCompatParcelizer(reportpropertyinputmismatch, getarraybuilders);
            float fAudioAttributesImplApi21Parcelizer = handlebadmerge.read().AudioAttributesImplApi21Parcelizer();
            long j = reportpropertyinputmismatch.read(ValueInjector.read(fAudioAttributesImplApi21Parcelizer, fAudioAttributesImplApi21Parcelizer));
            reportpropertyinputmismatch.IconCompatParcelizer();
            fromCursor fromcursor = guideline.AudioAttributesImplApi21Parcelizer;
            if (fromcursor != null) {
                getNameArray.RemoteActionCompatParcelizer(fromcursor.read(new setTag.write(setContentId.RemoteActionCompatParcelizer(j), false, null)));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(Guideline guideline) {
            fromCursor fromcursor = guideline.AudioAttributesImplApi21Parcelizer;
            if (fromcursor != null) {
                getNameArray.RemoteActionCompatParcelizer(fromcursor.read(setTag.read.INSTANCE));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean AudioAttributesCompatParcelizer(Guideline guideline) {
            return !guideline.getWrite();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(Guideline guideline, MagicModuleUseCaseImplWhenMappings.read readVar, reportPropertyInputMismatch reportpropertyinputmismatch, getArrayBuilders getarraybuilders, getReferencedType getreferencedtype) {
            long jMediaBrowserCompatCustomActionResultReceiver = hasRawClass.MediaBrowserCompatCustomActionResultReceiver(collectLongDefaults.AudioAttributesImplApi21Parcelizer(guideline));
            if (!getReferencedType.IconCompatParcelizer(jMediaBrowserCompatCustomActionResultReceiver, readVar.IconCompatParcelizer)) {
                guideline.onFastForward = getReferencedType.RemoteActionCompatParcelizer(guideline.onFastForward, getReferencedType.AudioAttributesCompatParcelizer(jMediaBrowserCompatCustomActionResultReceiver, readVar.IconCompatParcelizer));
            }
            readVar.IconCompatParcelizer = jMediaBrowserCompatCustomActionResultReceiver;
            reportUnresolvedObjectId.AudioAttributesCompatParcelizer(reportpropertyinputmismatch, getarraybuilders, guideline.onFastForward);
            fromCursor fromcursor = guideline.AudioAttributesImplApi21Parcelizer;
            if (fromcursor != null) {
                getNameArray.RemoteActionCompatParcelizer(fromcursor.read(new setTag.AudioAttributesCompatParcelizer(getreferencedtype.getWrite(), false, null)));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.Guideline$write$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ MagicModuleSubmissionRequestBody<getArrayBuilders, getReferencedType, getShowPopup> AudioAttributesCompatParcelizer;
            final /* synthetic */ handleBadMerge AudioAttributesImplApi26Parcelizer;
            private /* synthetic */ Object AudioAttributesImplBaseParcelizer;
            final /* synthetic */ getCreatedOnDateMs<Boolean> IconCompatParcelizer;
            final /* synthetic */ Guideline MediaBrowserCompatCustomActionResultReceiver;
            int MediaBrowserCompatItemReceiver;
            final /* synthetic */ getModuleData<getArrayBuilders, getArrayBuilders, getReferencedType, getShowPopup> RemoteActionCompatParcelizer;
            final /* synthetic */ getCreatedOnDateMs<getShowPopup> read;
            final /* synthetic */ getAnswerMap<getArrayBuilders, getShowPopup> write;

            /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r12.MediaBrowserCompatItemReceiver
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r12.AudioAttributesImplBaseParcelizer
                    o.TopUserCompanion r0 = (kotlin.TopUserCompanion) r0
                    kotlin.SdkPayloadData.IconCompatParcelizer(r13)     // Catch: java.util.concurrent.CancellationException -> L13
                    goto L5f
                L13:
                    r13 = move-exception
                    goto L48
                L15:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L1d:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                    java.lang.Object r13 = r12.AudioAttributesImplBaseParcelizer
                    o.TopUserCompanion r13 = (kotlin.TopUserCompanion) r13
                    o.handleBadMerge r3 = r12.AudioAttributesImplApi26Parcelizer     // Catch: java.util.concurrent.CancellationException -> L44
                    o.Guideline r1 = r12.MediaBrowserCompatCustomActionResultReceiver     // Catch: java.util.concurrent.CancellationException -> L44
                    o.superDispatchKeyEvent r4 = r1.getAudioAttributesCompatParcelizer()     // Catch: java.util.concurrent.CancellationException -> L44
                    o.getModuleData<o.getArrayBuilders, o.getArrayBuilders, o.getReferencedType, o.getShowPopup> r5 = r12.RemoteActionCompatParcelizer     // Catch: java.util.concurrent.CancellationException -> L44
                    o.getAnswerMap<o.getArrayBuilders, o.getShowPopup> r6 = r12.write     // Catch: java.util.concurrent.CancellationException -> L44
                    o.getCreatedOnDateMs<o.getShowPopup> r7 = r12.read     // Catch: java.util.concurrent.CancellationException -> L44
                    o.getCreatedOnDateMs<java.lang.Boolean> r8 = r12.IconCompatParcelizer     // Catch: java.util.concurrent.CancellationException -> L44
                    o.MagicModuleSubmissionRequestBody<o.getArrayBuilders, o.getReferencedType, o.getShowPopup> r9 = r12.AudioAttributesCompatParcelizer     // Catch: java.util.concurrent.CancellationException -> L44
                    r10 = r12
                    o.SampleVideos r10 = (kotlin.SampleVideos) r10     // Catch: java.util.concurrent.CancellationException -> L44
                    r12.AudioAttributesImplBaseParcelizer = r13     // Catch: java.util.concurrent.CancellationException -> L44
                    r12.MediaBrowserCompatItemReceiver = r2     // Catch: java.util.concurrent.CancellationException -> L44
                    java.lang.Object r12 = kotlin.setConstraintSet.write(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L44
                    if (r12 != r0) goto L5f
                    return r0
                L44:
                    r0 = move-exception
                    r11 = r0
                    r0 = r13
                    r13 = r11
                L48:
                    o.Guideline r12 = r12.MediaBrowserCompatCustomActionResultReceiver
                    o.fromCursor r12 = kotlin.Guideline.write(r12)
                    if (r12 == 0) goto L59
                    o.setTag$read r1 = o.setTag.read.INSTANCE
                    java.lang.Object r12 = r12.read(r1)
                    kotlin.getNameArray.RemoteActionCompatParcelizer(r12)
                L59:
                    boolean r12 = kotlin.College.IconCompatParcelizer(r0)
                    if (r12 == 0) goto L62
                L5f:
                    o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
                    return r12
                L62:
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Guideline.write.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(handleBadMerge handlebadmerge, Guideline guideline, getModuleData<? super getArrayBuilders, ? super getArrayBuilders, ? super getReferencedType, getShowPopup> getmoduledata, getAnswerMap<? super getArrayBuilders, getShowPopup> getanswermap, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<Boolean> getcreatedondatems2, MagicModuleSubmissionRequestBody<? super getArrayBuilders, ? super getReferencedType, getShowPopup> magicModuleSubmissionRequestBody, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi26Parcelizer = handlebadmerge;
                this.MediaBrowserCompatCustomActionResultReceiver = guideline;
                this.RemoteActionCompatParcelizer = getmoduledata;
                this.write = getanswermap;
                this.read = getcreatedondatems;
                this.IconCompatParcelizer = getcreatedondatems2;
                this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer, this.write, this.read, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
                anonymousClass1.AudioAttributesImplBaseParcelizer = obj;
                return anonymousClass1;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        write() {
        }
    }

    @Override // kotlin.forRootType
    public void MediaBrowserCompatMediaItem() {
        handleWeirdStringValue handleweirdstringvalue = this.onPause;
        if (handleweirdstringvalue != null) {
            handleweirdstringvalue.MediaBrowserCompatMediaItem();
        }
        if (getDesignInfoListui_tooling.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatCustomActionResultReceiver) {
            onSkipToPrevious();
        }
        this.MediaBrowserCompatCustomActionResultReceiver = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(o.setTag.IconCompatParcelizer r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.Guideline.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.Guideline$AudioAttributesCompatParcelizer r0 = (o.Guideline.AudioAttributesCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.IconCompatParcelizer
            int r8 = r8 + r2
            r0.IconCompatParcelizer = r8
            goto L19
        L14:
            o.Guideline$AudioAttributesCompatParcelizer r0 = new o.Guideline$AudioAttributesCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            o.getSystemGestureInsets$AudioAttributesCompatParcelizer r7 = (o.getSystemGestureInsets.AudioAttributesCompatParcelizer) r7
            java.lang.Object r0 = r0.read
            o.setTag$IconCompatParcelizer r0 = (o.setTag.IconCompatParcelizer) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L7c
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r7 = r0.read
            o.setTag$IconCompatParcelizer r7 = (o.setTag.IconCompatParcelizer) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L61
        L45:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getSystemGestureInsets$AudioAttributesCompatParcelizer r8 = r6.AudioAttributesImplBaseParcelizer
            if (r8 == 0) goto L61
            o.hashCode r2 = r6.RemoteActionCompatParcelizer
            if (r2 == 0) goto L61
            o.getSystemGestureInsets$write r5 = new o.getSystemGestureInsets$write
            r5.<init>(r8)
            o.isRound r5 = (kotlin.isRound) r5
            r0.read = r7
            r0.IconCompatParcelizer = r4
            java.lang.Object r8 = r2.RemoteActionCompatParcelizer(r5, r0)
            if (r8 == r1) goto L79
        L61:
            o.getSystemGestureInsets$AudioAttributesCompatParcelizer r8 = new o.getSystemGestureInsets$AudioAttributesCompatParcelizer
            r8.<init>()
            o.hashCode r2 = r6.RemoteActionCompatParcelizer
            if (r2 == 0) goto L7e
            r4 = r8
            o.isRound r4 = (kotlin.isRound) r4
            r0.read = r7
            r0.RemoteActionCompatParcelizer = r8
            r0.IconCompatParcelizer = r3
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer(r4, r0)
            if (r0 != r1) goto L7a
        L79:
            return r1
        L7a:
            r0 = r7
            r7 = r8
        L7c:
            r8 = r7
            r7 = r0
        L7e:
            r6.AudioAttributesImplBaseParcelizer = r8
            long r7 = r7.getRead()
            r6.write(r7)
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Guideline.RemoteActionCompatParcelizer(o.setTag$IconCompatParcelizer, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(o.setTag.write r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.Guideline.read
            if (r0 == 0) goto L14
            r0 = r7
            o.Guideline$read r0 = (o.Guideline.read) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.Guideline$read r0 = new o.Guideline$read
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            o.setTag$write r6 = (o.setTag.write) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getSystemGestureInsets$AudioAttributesCompatParcelizer r7 = r5.AudioAttributesImplBaseParcelizer
            if (r7 == 0) goto L56
            o.hashCode r2 = r5.RemoteActionCompatParcelizer
            if (r2 == 0) goto L53
            o.getSystemGestureInsets$IconCompatParcelizer r4 = new o.getSystemGestureInsets$IconCompatParcelizer
            r4.<init>(r7)
            o.isRound r4 = (kotlin.isRound) r4
            r0.RemoteActionCompatParcelizer = r6
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r7 = r2.RemoteActionCompatParcelizer(r4, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r7 = 0
            r5.AudioAttributesImplBaseParcelizer = r7
        L56:
            r5.AudioAttributesCompatParcelizer(r6)
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Guideline.AudioAttributesCompatParcelizer(o.setTag$write, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o.Guideline.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.Guideline$RemoteActionCompatParcelizer r0 = (o.Guideline.RemoteActionCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.write
            int r7 = r7 + r2
            r0.write = r7
            goto L19
        L14:
            o.Guideline$RemoteActionCompatParcelizer r0 = new o.Guideline$RemoteActionCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getSystemGestureInsets$AudioAttributesCompatParcelizer r7 = r6.AudioAttributesImplBaseParcelizer
            if (r7 == 0) goto L50
            o.hashCode r2 = r6.RemoteActionCompatParcelizer
            if (r2 == 0) goto L4e
            o.getSystemGestureInsets$write r5 = new o.getSystemGestureInsets$write
            r5.<init>(r7)
            o.isRound r5 = (kotlin.isRound) r5
            r0.write = r4
            java.lang.Object r7 = r2.RemoteActionCompatParcelizer(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r6.AudioAttributesImplBaseParcelizer = r3
        L50:
            o.setTag$write r7 = new o.setTag$write
            o.UnsupportedTypeDeserializer$write r0 = kotlin.UnsupportedTypeDeserializer.INSTANCE
            long r0 = r0.write()
            r2 = 0
            r7.<init>(r0, r2, r3)
            r6.AudioAttributesCompatParcelizer(r7)
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Guideline.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    public final void read() {
        getSystemGestureInsets.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (audioAttributesCompatParcelizer != null) {
            hashCode hashcode = this.RemoteActionCompatParcelizer;
            if (hashcode != null) {
                hashcode.read(new getSystemGestureInsets.write(audioAttributesCompatParcelizer));
            }
            this.AudioAttributesImplBaseParcelizer = null;
        }
    }

    public final void IconCompatParcelizer(getAnswerMap<? super handleWeirdNumberValue, Boolean> p0, boolean p1, hashCode p2, superDispatchKeyEvent p3, boolean p4) {
        this.write = p0;
        if (this.read != p1) {
            this.read = p1;
            if (!p1) {
                read();
                handleWeirdStringValue handleweirdstringvalue = this.onPause;
                if (handleweirdstringvalue != null) {
                    IconCompatParcelizer(handleweirdstringvalue);
                }
                this.onPause = null;
                this.onPlayFromMediaId = null;
            }
            p4 = true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p2)) {
            read();
            this.RemoteActionCompatParcelizer = p2;
        }
        if (this.AudioAttributesCompatParcelizer != p3) {
            this.AudioAttributesCompatParcelizer = p3;
        } else if (!p4) {
            return;
        }
        if (getDesignInfoListui_tooling.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatCustomActionResultReceiver) {
            onSkipToPrevious();
        }
        setFitsSystemWindows setfitssystemwindows = this.onPlayFromMediaId;
        if (setfitssystemwindows != null) {
            setfitssystemwindows.RemoteActionCompatParcelizer();
        }
        handleWeirdStringValue handleweirdstringvalue2 = this.onPause;
        if (handleweirdstringvalue2 != null) {
            handleweirdstringvalue2.RemoteActionCompatParcelizer();
        }
    }

    private final void read(DeserializationContext p0, _shapeForToken p1) {
        ConstraintLayout constraintLayout = this.onAddQueueItem;
        if (constraintLayout == null) {
            throw new IllegalArgumentException("currentDragState should not be null".toString());
        }
        if (constraintLayout instanceof ConstraintLayout.AudioAttributesCompatParcelizer) {
            IconCompatParcelizer(p0, p1, (ConstraintLayout.AudioAttributesCompatParcelizer) constraintLayout);
            return;
        }
        if (constraintLayout instanceof ConstraintLayout.write) {
            read(p0, p1, (ConstraintLayout.write) constraintLayout);
        } else if (constraintLayout instanceof ConstraintLayout.read) {
            write(p0, p1, (ConstraintLayout.read) constraintLayout);
        } else {
            if (!(constraintLayout instanceof ConstraintLayout.RemoteActionCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            read(p0, p1, (ConstraintLayout.RemoteActionCompatParcelizer) constraintLayout);
        }
    }

    private final void onSkipToPrevious() {
        onSetShuffleMode();
        if (this.MediaBrowserCompatItemReceiver) {
            onSkipToNext();
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer$default(Guideline guideline, getArrayBuilders getarraybuilders, long j, long j2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveToAwaitTouchSlopState-aWI9W7U");
        }
        if ((i & 4) != 0) {
            j2 = getReferencedType.INSTANCE.write();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            z = false;
        }
        guideline.AudioAttributesCompatParcelizer(getarraybuilders, j, j3, z);
    }

    private final void AudioAttributesCompatParcelizer(getArrayBuilders p0, long p1, long p2, boolean p3) {
        ConstraintLayout.write writeVarOnSetRating = onSetRating();
        writeVarOnSetRating.AudioAttributesCompatParcelizer(p0);
        writeVarOnSetRating.AudioAttributesCompatParcelizer(p1);
        getAccessibilityNodeProvider getaccessibilitynodeprovider = this.onPlay;
        if (getaccessibilitynodeprovider == null) {
            this.onPlay = new getAccessibilityNodeProvider(this.AudioAttributesCompatParcelizer, 0L, 2, null);
        } else {
            if (getaccessibilitynodeprovider != null) {
                getaccessibilitynodeprovider.read(this.AudioAttributesCompatParcelizer);
            }
            getAccessibilityNodeProvider getaccessibilitynodeprovider2 = this.onPlay;
            if (getaccessibilitynodeprovider2 != null) {
                getaccessibilitynodeprovider2.IconCompatParcelizer(p2);
            }
        }
        writeVarOnSetRating.AudioAttributesCompatParcelizer(p3);
        this.onAddQueueItem = writeVarOnSetRating;
    }

    private final void IconCompatParcelizer(long p0) {
        ConstraintLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizerOnSetPlaybackSpeed = onSetPlaybackSpeed();
        remoteActionCompatParcelizerOnSetPlaybackSpeed.AudioAttributesCompatParcelizer(p0);
        this.onAddQueueItem = remoteActionCompatParcelizerOnSetPlaybackSpeed;
    }

    private final void onSetShuffleMode() {
        ConstraintLayout.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRatingCompat = RatingCompat();
        audioAttributesCompatParcelizerRatingCompat.read(ConstraintLayout.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
        audioAttributesCompatParcelizerRatingCompat.AudioAttributesCompatParcelizer(false);
        this.onAddQueueItem = audioAttributesCompatParcelizerRatingCompat;
    }

    private final void RemoteActionCompatParcelizer(getArrayBuilders p0, long p1, getAccessibilityNodeProvider p2) {
        ConstraintLayout.read readVarOnRewind = onRewind();
        readVarOnRewind.AudioAttributesCompatParcelizer(p0);
        readVarOnRewind.read(p1);
        getAccessibilityNodeProvider.IconCompatParcelizer$default(p2, 0L, 1, null);
        readVarOnRewind.RemoteActionCompatParcelizer(p2);
        this.onAddQueueItem = readVarOnRewind;
    }

    private final void IconCompatParcelizer(DeserializationContext p0, _shapeForToken p1, ConstraintLayout.AudioAttributesCompatParcelizer p2) {
        ConstraintLayout.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (p0.AudioAttributesCompatParcelizer().isEmpty() || !isSpanStillValid.write$default(p0, false, false, 2, (Object) null)) {
            return;
        }
        getArrayBuilders getarraybuilders = (getArrayBuilders) IntermediateLoginResponseBody.RatingCompat((List) p0.AudioAttributesCompatParcelizer());
        if (WhenMappings.read[p2.getRemoteActionCompatParcelizer().ordinal()] == 1) {
            if (!getWrite()) {
                remoteActionCompatParcelizer = ConstraintLayout.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer;
            } else {
                remoteActionCompatParcelizer = ConstraintLayout.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            }
        } else {
            remoteActionCompatParcelizer = p2.getRemoteActionCompatParcelizer();
        }
        p2.read(remoteActionCompatParcelizer);
        if (p1 == _shapeForToken.IconCompatParcelizer && remoteActionCompatParcelizer == ConstraintLayout.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
            getarraybuilders.RemoteActionCompatParcelizer();
            p2.AudioAttributesCompatParcelizer(true);
        }
        if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
            if (remoteActionCompatParcelizer == ConstraintLayout.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer) {
                AudioAttributesCompatParcelizer$default(this, getarraybuilders, getarraybuilders.getIconCompatParcelizer(), 0L, false, 12, null);
            } else if (p2.getRead()) {
                read(getarraybuilders, getarraybuilders, getReferencedType.INSTANCE.write());
                write(getarraybuilders, getReferencedType.INSTANCE.write());
                IconCompatParcelizer(getarraybuilders.getIconCompatParcelizer());
            }
        }
    }

    private final void read(DeserializationContext p0, _shapeForToken p1, ConstraintLayout.write p2) {
        getArrayBuilders getarraybuilders;
        getArrayBuilders getarraybuilders2;
        getArrayBuilders getarraybuilders3;
        if (p1 != _shapeForToken.IconCompatParcelizer) {
            List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            int size = listAudioAttributesCompatParcelizer.size();
            int i = 0;
            while (true) {
                getarraybuilders = null;
                if (i >= size) {
                    getarraybuilders2 = null;
                    break;
                }
                getarraybuilders2 = listAudioAttributesCompatParcelizer.get(i);
                if (findClass.AudioAttributesCompatParcelizer(getarraybuilders2.getIconCompatParcelizer(), p2.getIconCompatParcelizer())) {
                    break;
                } else {
                    i++;
                }
            }
            getArrayBuilders getarraybuilders4 = getarraybuilders2;
            if (getarraybuilders4 == null) {
                List<getArrayBuilders> listAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer();
                int size2 = listAudioAttributesCompatParcelizer2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        getarraybuilders3 = null;
                        break;
                    }
                    getarraybuilders3 = listAudioAttributesCompatParcelizer2.get(i2);
                    if (getarraybuilders3.getRemoteActionCompatParcelizer()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                getarraybuilders4 = getarraybuilders3;
                if (getarraybuilders4 == null) {
                    onSetShuffleMode();
                    return;
                }
                p2.AudioAttributesCompatParcelizer(getarraybuilders4.getIconCompatParcelizer());
            }
            if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
                if (!getarraybuilders4.MediaDescriptionCompat()) {
                    if (bufferAsCopyOfValue.AudioAttributesCompatParcelizer(getarraybuilders4)) {
                        List<getArrayBuilders> listAudioAttributesCompatParcelizer3 = p0.AudioAttributesCompatParcelizer();
                        int size3 = listAudioAttributesCompatParcelizer3.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                break;
                            }
                            getArrayBuilders getarraybuilders5 = listAudioAttributesCompatParcelizer3.get(i3);
                            if (getarraybuilders5.getRemoteActionCompatParcelizer()) {
                                getarraybuilders = getarraybuilders5;
                                break;
                            }
                            i3++;
                        }
                        getArrayBuilders getarraybuilders6 = getarraybuilders;
                        if (getarraybuilders6 == null) {
                            onSetShuffleMode();
                        } else {
                            p2.AudioAttributesCompatParcelizer(getarraybuilders6.getIconCompatParcelizer());
                        }
                    } else {
                        long jRemoteActionCompatParcelizer = onSkipToQueueItem().RemoteActionCompatParcelizer(getarraybuilders4.getRead(), getarraybuilders4.getAudioAttributesImplBaseParcelizer(), setConstraintSet.write((CoercionConfig) MappingJsonFactory.write(this, getDefaultNullValueSerializer.onAddQueueItem()), getarraybuilders4.getMediaBrowserCompatItemReceiver()));
                        if ((9223372034707292159L & jRemoteActionCompatParcelizer) != 9205357640488583168L) {
                            getarraybuilders4.RemoteActionCompatParcelizer();
                            getArrayBuilders write2 = p2.getWrite();
                            toMagicModuleMetaRepoModel.write(write2);
                            read(write2, getarraybuilders4, jRemoteActionCompatParcelizer);
                            write(getarraybuilders4, jRemoteActionCompatParcelizer);
                            IconCompatParcelizer(getarraybuilders4.getIconCompatParcelizer());
                        } else {
                            p2.AudioAttributesCompatParcelizer(true);
                        }
                    }
                } else {
                    getArrayBuilders write3 = p2.getWrite();
                    if (write3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized".toString());
                    }
                    long iconCompatParcelizer = p2.getIconCompatParcelizer();
                    getAccessibilityNodeProvider getaccessibilitynodeprovider = this.onPlay;
                    if (getaccessibilitynodeprovider != null) {
                        RemoteActionCompatParcelizer(write3, iconCompatParcelizer, getaccessibilitynodeprovider);
                    } else {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized".toString());
                    }
                }
            }
            if (p1 == _shapeForToken.read && p2.getRead()) {
                if (getarraybuilders4.MediaDescriptionCompat()) {
                    getArrayBuilders write4 = p2.getWrite();
                    if (write4 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized".toString());
                    }
                    long iconCompatParcelizer2 = p2.getIconCompatParcelizer();
                    getAccessibilityNodeProvider getaccessibilitynodeprovider2 = this.onPlay;
                    if (getaccessibilitynodeprovider2 != null) {
                        RemoteActionCompatParcelizer(write4, iconCompatParcelizer2, getaccessibilitynodeprovider2);
                        return;
                    }
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized".toString());
                }
                p2.AudioAttributesCompatParcelizer(false);
            }
        }
    }

    private final void write(DeserializationContext p0, _shapeForToken p1, ConstraintLayout.read p2) {
        boolean z;
        if (p1 == _shapeForToken.read) {
            List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            int size = listAudioAttributesCompatParcelizer.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = true;
                    break;
                } else {
                    if (listAudioAttributesCompatParcelizer.get(i2).MediaDescriptionCompat()) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            List<getArrayBuilders> listAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer();
            int size2 = listAudioAttributesCompatParcelizer2.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                if (!listAudioAttributesCompatParcelizer2.get(i).getRemoteActionCompatParcelizer()) {
                    i++;
                } else if (!p0.AudioAttributesCompatParcelizer().isEmpty()) {
                    if (z) {
                        long read2 = ((getArrayBuilders) IntermediateLoginResponseBody.RatingCompat((List) p0.AudioAttributesCompatParcelizer())).getRead();
                        getArrayBuilders read3 = p2.getRead();
                        toMagicModuleMetaRepoModel.write(read3);
                        long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer(read2, read3.getRead());
                        getArrayBuilders read4 = p2.getRead();
                        if (read4 != null) {
                            AudioAttributesCompatParcelizer$default(this, read4, p2.getIconCompatParcelizer(), jAudioAttributesCompatParcelizer, false, 8, null);
                            return;
                        }
                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.".toString());
                    }
                    return;
                }
            }
            onSetShuffleMode();
        }
    }

    private final void read(DeserializationContext p0, _shapeForToken p1, ConstraintLayout.RemoteActionCompatParcelizer p2) {
        getArrayBuilders getarraybuilders;
        getArrayBuilders getarraybuilders2;
        if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
            long audioAttributesCompatParcelizer = p2.getAudioAttributesCompatParcelizer();
            List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            int size = listAudioAttributesCompatParcelizer.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                getarraybuilders = null;
                if (i2 >= size) {
                    getarraybuilders2 = null;
                    break;
                }
                getarraybuilders2 = listAudioAttributesCompatParcelizer.get(i2);
                if (findClass.AudioAttributesCompatParcelizer(getarraybuilders2.getIconCompatParcelizer(), audioAttributesCompatParcelizer)) {
                    break;
                } else {
                    i2++;
                }
            }
            getArrayBuilders getarraybuilders3 = getarraybuilders2;
            if (getarraybuilders3 == null) {
                return;
            }
            if (bufferAsCopyOfValue.AudioAttributesCompatParcelizer(getarraybuilders3)) {
                List<getArrayBuilders> listAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer();
                int size2 = listAudioAttributesCompatParcelizer2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    getArrayBuilders getarraybuilders4 = listAudioAttributesCompatParcelizer2.get(i);
                    if (getarraybuilders4.getRemoteActionCompatParcelizer()) {
                        getarraybuilders = getarraybuilders4;
                        break;
                    }
                    i++;
                }
                getArrayBuilders getarraybuilders5 = getarraybuilders;
                if (getarraybuilders5 == null) {
                    if (!getarraybuilders3.MediaDescriptionCompat() && bufferAsCopyOfValue.AudioAttributesCompatParcelizer(getarraybuilders3)) {
                        RemoteActionCompatParcelizer(getarraybuilders3);
                    } else {
                        onSkipToNext();
                    }
                    onSetShuffleMode();
                    return;
                }
                p2.AudioAttributesCompatParcelizer(getarraybuilders5.getIconCompatParcelizer());
                return;
            }
            if (getarraybuilders3.MediaDescriptionCompat()) {
                onSkipToNext();
            } else {
                if (getReferencedType.IconCompatParcelizer(bufferAsCopyOfValue.AudioAttributesImplApi26Parcelizer(getarraybuilders3)) == BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                write(getarraybuilders3, bufferAsCopyOfValue.MediaBrowserCompatCustomActionResultReceiver(getarraybuilders3));
                getarraybuilders3.RemoteActionCompatParcelizer();
            }
        }
    }

    private final void read(getArrayBuilders p0, getArrayBuilders p1, long p2) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new reportPropertyInputMismatch();
        }
        reportUnresolvedObjectId.RemoteActionCompatParcelizer(onStop(), p0);
        long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer(p1.getRead(), p2);
        this.onFastForward = getReferencedType.INSTANCE.write();
        if (this.write.invoke(handleWeirdNumberValue.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatItemReceiver())).booleanValue()) {
            if (!this.MediaBrowserCompatItemReceiver) {
                if (this.AudioAttributesImplApi21Parcelizer == null) {
                    this.AudioAttributesImplApi21Parcelizer = getLastName.read(Integer.MAX_VALUE, null, 6);
                }
                setSessionImpl();
            }
            this.onCustomAction = hasRawClass.MediaBrowserCompatCustomActionResultReceiver(collectLongDefaults.AudioAttributesImplApi21Parcelizer(this));
            onSetCaptioningEnabled().read(new setTag.IconCompatParcelizer(jAudioAttributesCompatParcelizer, null));
        }
    }

    private final void write(getArrayBuilders p0, long p1) {
        long jMediaBrowserCompatCustomActionResultReceiver = hasRawClass.MediaBrowserCompatCustomActionResultReceiver(collectLongDefaults.AudioAttributesImplApi21Parcelizer(getRead()));
        if (!getReferencedType.IconCompatParcelizer(this.onCustomAction, getReferencedType.INSTANCE.read()) && !getReferencedType.IconCompatParcelizer(jMediaBrowserCompatCustomActionResultReceiver, this.onCustomAction)) {
            this.onFastForward = getReferencedType.RemoteActionCompatParcelizer(this.onFastForward, getReferencedType.AudioAttributesCompatParcelizer(jMediaBrowserCompatCustomActionResultReceiver, this.onCustomAction));
        }
        this.onCustomAction = jMediaBrowserCompatCustomActionResultReceiver;
        reportUnresolvedObjectId.AudioAttributesCompatParcelizer(onStop(), p0, this.onFastForward);
        onSetCaptioningEnabled().read(new setTag.AudioAttributesCompatParcelizer(p1, false, null));
    }

    private final void RemoteActionCompatParcelizer(getArrayBuilders p0) {
        reportUnresolvedObjectId.RemoteActionCompatParcelizer(onStop(), p0);
        float fAudioAttributesImplApi21Parcelizer = ((CoercionConfig) MappingJsonFactory.write(this, getDefaultNullValueSerializer.onAddQueueItem())).AudioAttributesImplApi21Parcelizer();
        long j = onStop().read(ValueInjector.read(fAudioAttributesImplApi21Parcelizer, fAudioAttributesImplApi21Parcelizer));
        onStop().IconCompatParcelizer();
        onSetCaptioningEnabled().read(new setTag.write(setContentId.RemoteActionCompatParcelizer(j), false, null));
        this.MediaBrowserCompatCustomActionResultReceiver = false;
    }

    private final void onSkipToNext() {
        onSetCaptioningEnabled().read(setTag.read.INSTANCE);
    }

    public final void read(setTag p0) {
        if ((p0 instanceof setTag.IconCompatParcelizer) && !this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatItemReceiver = true;
            setSessionImpl();
        }
        onSetCaptioningEnabled().read(p0);
    }
}
