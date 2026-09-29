package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Typed3EpoxyController;
import kotlin.parseDigitsRecursive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u0010\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u001aJ\u0010\u0010\u0015\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u0015\u0010\u001bJ\u001d\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0000¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010\u0015\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u001aJ\u000f\u0010!\u001a\u00020\nH\u0000¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\b\u001a\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\u001aJ\u001b\u0010 \u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b \u0010#J\u001b\u0010\u0015\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020$H\u0000¢\u0006\u0004\b\u0010\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010'J\u0011\u0010\f\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b\f\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0000¢\u0006\u0004\b+\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\b\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\b\u0010,J\u0017\u0010\u0017\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010.J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020/H\u0000¢\u0006\u0004\b\u0015\u00100J\u0017\u00101\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\u0011J\u000f\u00102\u001a\u00020\u0007H\u0000¢\u0006\u0004\b2\u0010\u0013J\u0011\u00103\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b3\u0010'J\u000f\u00104\u001a\u00020\u0007H\u0000¢\u0006\u0004\b4\u0010\u0013J\u000f\u00105\u001a\u00020\nH\u0000¢\u0006\u0004\b5\u0010\u001aJ\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J?\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u0002092\u0006\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010@J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020AH\u0002¢\u0006\u0004\b\b\u0010BJ\u001f\u0010 \u001a\u0002092\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010CR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010\u0015\u001a\u00020F8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\b\u0015\u0010KR.\u0010\b\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00070L8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\b\b\u0010QR$\u0010 \u001a\u0004\u0018\u00010R8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\b\b\u0010WR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002090X8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010\u0019\u001a\u0002092\u0006\u0010\u0003\u001a\u0002098A@AX\u0080\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b\b\u0010]R\u0016\u0010!\u001a\u0004\u0018\u00010$8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010*R\u001c\u0010\u000e\u001a\u00020^8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b_\u0010`\"\u0004\b\u0010\u0010aR$\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010b8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\bc\u0010d\"\u0004\b \u0010eR$\u0010)\u001a\u0004\u0018\u00010f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010g\u001a\u0004\bh\u0010i\"\u0004\b\u0015\u0010jR$\u0010p\u001a\u0004\u0018\u00010k8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010l\u001a\u0004\bm\u0010n\"\u0004\b\u0010\u0010oR$\u00101\u001a\u0004\u0018\u00010q8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\b\u0015\u0010vR$\u0010\u0012\u001a\u0004\u0018\u00010w8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010x\u001a\u0004\bD\u0010y\"\u0004\b \u0010zR$\u0010h\u001a\u0004\u0018\u00010{8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bm\u0010|\u001a\u0004\bM\u0010}\"\u0004\b\u0015\u0010~R(\u0010m\u001a\u0004\u0018\u00010\u007f8\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0005\bp\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0005\b\b\u0010\u0083\u0001R,\u0010G\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0013\n\u0004\b)\u0010Z\u001a\u0005\b\u0084\u0001\u0010\u001a\"\u0004\b\u000e\u0010\u0011R,\u0010\u0081\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010Z\u001a\u0004\br\u0010\u001a\"\u0004\b\u0019\u0010\u0011R\u0017\u0010M\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0010\u0010\u0085\u0001R\u001a\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0086\u0001R\u0017\u0010r\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b!\u0010\u0085\u0001R3\u0010c\u001a\u0005\u0018\u00010\u0087\u00012\t\u0010\u0003\u001a\u0005\u0018\u00010\u0087\u00018G@CX\u0087\u008e\u0002¢\u0006\u0014\n\u0004\b\u0019\u0010Z\u001a\u0005\bG\u0010\u0088\u0001\"\u0005\b\u0015\u0010\u0089\u0001R0\u0010O\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u00148G@CX\u0087\u008e\u0002¢\u0006\u0013\n\u0004\b\b\u0010Z\u001a\u0005\b1\u0010\u008a\u0001\"\u0004\b \u0010\u0016R\u0019\u0010t\u001a\u00030\u008b\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u008c\u0001R\u0018\u0010I\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u008d\u0001R\u001a\u0010S\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bO\u0010\u008f\u0001R&\u0010U\u001a\u0004\u0018\u00010\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0014\n\u0005\b\u0012\u0010\u0086\u0001\u001a\u0005\bS\u0010\u0090\u0001\"\u0004\b \u0010\tR,\u0010_\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8C@CX\u0083\u008e\u0002¢\u0006\u0013\n\u0004\b1\u0010Z\u001a\u0005\b\u0091\u0001\u0010\u001a\"\u0004\b!\u0010\u0011R\u0018\u0010Y\u001a\u00030\u0092\u00018\u0000@\u0000X\u0081\f¢\u0006\u0007\n\u0005\b \u0010\u0093\u0001R\u0014\u0010\u0096\u0001\u001a\u00030\u0094\u00018G¢\u0006\u0007\u001a\u0005\bp\u0010\u0095\u0001R\u001c\u0010D\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\u000e\n\u0005\bU\u0010\u0097\u0001\u001a\u0005\b\u0096\u0001\u0010\u000fR\u001d\u00105\u001a\u00030\u0098\u00018\u0001X\u0081\u0004¢\u0006\u000e\n\u0005\bh\u0010\u0099\u0001\u001a\u0005\bc\u0010\u009a\u0001R\u001d\u0010[\u001a\u00020\n8\u0000@\u0001X\u0081\u000e¢\u0006\r\n\u0005\bI\u0010\u009b\u0001\"\u0004\b)\u0010\u0011R\u0014\u00104\u001a\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u001aR\u0015\u0010&\u001a\u00020\n8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\u001aR\u0015\u0010+\u001a\u00020\n8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u001a"}, d2 = {"Lo/Typed3EpoxyController;", "", "Lo/setStateRestorationPolicy;", "p0", "<init>", "(Lo/setStateRestorationPolicy;)V", "Lo/findProperty;", "", "read", "(Lo/findProperty;)V", "", "Lo/MediaRouteButton;", "AudioAttributesImplBaseParcelizer", "(Z)Lo/MediaRouteButton;", "AudioAttributesImplApi21Parcelizer", "()Lo/MediaRouteButton;", "AudioAttributesCompatParcelizer", "(Z)V", "MediaMetadataCompat", "()V", "Lo/getReferencedType;", "IconCompatParcelizer", "(Lo/getReferencedType;)V", "RemoteActionCompatParcelizer", "(J)V", "AudioAttributesImplApi26Parcelizer", "()Z", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getSubscriptionExpiresOn;", "", "onSetShuffleMode", "()Lo/getSubscriptionExpiresOn;", "write", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setPassingYear;", "(Z)Lo/setPassingYear;", "Lo/AbstractDeserializer;", "(Z)Lo/AbstractDeserializer;", "onRemoveQueueItemAt", "()Lo/setPassingYear;", "(Lo/AbstractDeserializer;)V", "MediaBrowserCompatItemReceiver", "()Lo/AbstractDeserializer;", "onRewind", "(Z)J", "", "(Z)F", "Lo/bufferMapProperty;", "(Lo/bufferMapProperty;)J", "MediaBrowserCompatMediaItem", "onSetRating", "onSkipToNext", "onSeekTo", "onPrepareFromUri", "Lo/WritableTypeIdInclusion;", "onSetRepeatMode", "()Lo/WritableTypeIdInclusion;", "Lo/hasValueTypeDeserializer;", "p1", "p2", "p3", "Lo/getModelCountBuiltSoFar;", "p4", "p5", "(Lo/hasValueTypeDeserializer;JZZLo/getModelCountBuiltSoFar;Z)J", "Lo/lambdaonImageAvailable1androidxmedia3uiPlayerView;", "(Lo/lambdaonImageAvailable1androidxmedia3uiPlayerView;)V", "(Lo/AbstractDeserializer;J)Lo/hasValueTypeDeserializer;", "onPrepareFromSearch", "Lo/setStateRestorationPolicy;", "Lo/SettableBeanProperty;", "onCommand", "Lo/SettableBeanProperty;", "onPlayFromMediaId", "()Lo/SettableBeanProperty;", "(Lo/SettableBeanProperty;)V", "Lkotlin/Function1;", "onAddQueueItem", "Lo/getAnswerMap;", "onPlay", "()Lo/getAnswerMap;", "(Lo/getAnswerMap;)V", "Lo/setImageDisplayMode;", "onMediaButtonEvent", "Lo/setImageDisplayMode;", "onPlayFromSearch", "()Lo/setImageDisplayMode;", "(Lo/setImageDisplayMode;)V", "Lo/InputAccessor;", "onPrepareFromMediaId", "Lo/InputAccessor;", "onRemoveQueueItem", "()Lo/hasValueTypeDeserializer;", "(Lo/hasValueTypeDeserializer;)V", "Lo/addUnresolvedId;", "onPrepare", "Lo/addUnresolvedId;", "(Lo/addUnresolvedId;)V", "Lkotlin/Function0;", "onPause", "Lo/getCreatedOnDateMs;", "(Lo/getCreatedOnDateMs;)V", "Lo/findNullKeySerializer;", "Lo/findNullKeySerializer;", "MediaDescriptionCompat", "()Lo/findNullKeySerializer;", "(Lo/findNullKeySerializer;)V", "Lo/TopUserCompanion;", "Lo/TopUserCompanion;", "RatingCompat", "()Lo/TopUserCompanion;", "(Lo/TopUserCompanion;)V", "MediaBrowserCompatSearchResultReceiver", "Lo/setGlobalExceptionHandler;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/setGlobalExceptionHandler;", "onFastForward", "()Lo/setGlobalExceptionHandler;", "(Lo/setGlobalExceptionHandler;)V", "Lo/getHandlerInstantiator;", "Lo/getHandlerInstantiator;", "()Lo/getHandlerInstantiator;", "(Lo/getHandlerInstantiator;)V", "Lo/depositSchemaProperty;", "Lo/depositSchemaProperty;", "()Lo/depositSchemaProperty;", "(Lo/depositSchemaProperty;)V", "Lo/secondaryCount;", "Lo/secondaryCount;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/secondaryCount;", "(Lo/secondaryCount;)V", "onCustomAction", "J", "Lo/findProperty;", "Lo/onContentAspectRatioChanged;", "()Lo/onContentAspectRatioChanged;", "(Lo/onContentAspectRatioChanged;)V", "()Lo/getReferencedType;", "", "I", "Lo/hasValueTypeDeserializer;", "Lo/setStagedModel;", "Lo/setStagedModel;", "()Lo/findProperty;", "onSetCaptioningEnabled", "Lo/getFillAlpha;", "Lo/getFillAlpha;", "Lo/_handleOddName;", "()Lo/_handleOddName;", "onPlayFromUri", "Lo/MediaRouteButton;", "Lo/add;", "Lo/add;", "()Lo/add;", "Z", "onSkipToPrevious", "onSetPlaybackSpeed"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Typed3EpoxyController {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long onAddQueueItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private findProperty onCustomAction;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final InputAccessor onPause;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final InputAccessor MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private findNullKeySerializer MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final InputAccessor onCommand;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final InputAccessor onPrepare;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private secondaryCount RatingCompat;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private int onFastForward;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final add onPrepareFromUri;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private findProperty onPlayFromSearch;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private depositSchemaProperty MediaDescriptionCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private TopUserCompanion MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private setGlobalExceptionHandler MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> read;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private SettableBeanProperty IconCompatParcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private hasValueTypeDeserializer onPlayFromMediaId;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private getHandlerInstantiator MediaMetadataCompat;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private setImageDisplayMode write;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private setStagedModel onMediaButtonEvent;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private boolean onRemoveQueueItem;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final MediaRouteButton onPrepareFromSearch;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private addUnresolvedId AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final InputAccessor<hasValueTypeDeserializer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final setStateRestorationPolicy AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final InputAccessor onPlay;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public getFillAlpha onPrepareFromMediaId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatMediaItem extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return Typed3EpoxyController.this.IconCompatParcelizer(this);
        }
    }

    public Typed3EpoxyController(setStateRestorationPolicy setstaterestorationpolicy) {
        this.AudioAttributesCompatParcelizer = setstaterestorationpolicy;
        this.IconCompatParcelizer = createPayloadsIfNeeded.IconCompatParcelizer();
        this.read = new getAnswerMap() { // from class: o.Typed2EpoxyController
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Typed3EpoxyController.write((hasValueTypeDeserializer) obj);
            }
        };
        this.RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(new hasValueTypeDeserializer((String) null, 0L, (findProperty) null, 7, (MagicModuleRepositoryImplExternalSyntheticLambda0) null), null, 2, null);
        this.AudioAttributesImplApi21Parcelizer = addUnresolvedId.INSTANCE.write();
        Boolean bool = Boolean.TRUE;
        this.onCommand = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.onAddQueueItem = getReferencedType.INSTANCE.write();
        this.handleMediaPlayPauseIfPendingOnHandler = getReferencedType.INSTANCE.write();
        this.onPause = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.onPlay = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.onFastForward = -1;
        this.onPlayFromMediaId = new hasValueTypeDeserializer((String) null, 0L, (findProperty) null, 7, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        this.onPrepare = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
        this.onPrepareFromMediaId = new TransitionSet();
        this.onPrepareFromSearch = new RatingCompat();
        this.onPrepareFromUri = new AudioAttributesImplApi26Parcelizer();
    }

    public /* synthetic */ Typed3EpoxyController(setStateRestorationPolicy setstaterestorationpolicy, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : setstaterestorationpolicy);
    }

    public final void IconCompatParcelizer(SettableBeanProperty settableBeanProperty) {
        this.IconCompatParcelizer = settableBeanProperty;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final SettableBeanProperty getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(hasValueTypeDeserializer hasvaluetypedeserializer) {
        return getShowPopup.INSTANCE;
    }

    public final getAnswerMap<hasValueTypeDeserializer, getShowPopup> onPlay() {
        return this.read;
    }

    public final void read(getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> getanswermap) {
        this.read = getanswermap;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final setImageDisplayMode getWrite() {
        return this.write;
    }

    public final void read(setImageDisplayMode setimagedisplaymode) {
        this.write = setimagedisplaymode;
    }

    public final hasValueTypeDeserializer onRemoveQueueItem() {
        return this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    public final void read(hasValueTypeDeserializer hasvaluetypedeserializer) {
        this.RemoteActionCompatParcelizer.write(hasvaluetypedeserializer);
        this.onPlayFromSearch = findProperty.AudioAttributesCompatParcelizer(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
    }

    public final AbstractDeserializer onPrepareFromMediaId() {
        WebViewSubtitleOutput webViewSubtitleOutputOnPlay;
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode == null || (webViewSubtitleOutputOnPlay = setimagedisplaymode.getIconCompatParcelizer()) == null) {
            return null;
        }
        return webViewSubtitleOutputOnPlay.getIconCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(addUnresolvedId addunresolvedid) {
        this.AudioAttributesImplApi21Parcelizer = addunresolvedid;
    }

    public final void write(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.AudioAttributesImplBaseParcelizer = getcreatedondatems;
    }

    public final void IconCompatParcelizer(findNullKeySerializer findnullkeyserializer) {
        this.MediaBrowserCompatItemReceiver = findnullkeyserializer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final findNullKeySerializer getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void AudioAttributesCompatParcelizer(TopUserCompanion topUserCompanion) {
        this.MediaBrowserCompatSearchResultReceiver = topUserCompanion;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final TopUserCompanion getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void IconCompatParcelizer(setGlobalExceptionHandler setglobalexceptionhandler) {
        this.MediaBrowserCompatMediaItem = setglobalexceptionhandler;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final setGlobalExceptionHandler getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from getter */
    public final getHandlerInstantiator getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final void write(getHandlerInstantiator gethandlerinstantiator) {
        this.MediaMetadataCompat = gethandlerinstantiator;
    }

    public final void IconCompatParcelizer(depositSchemaProperty depositschemaproperty) {
        this.MediaDescriptionCompat = depositschemaproperty;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final depositSchemaProperty getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final secondaryCount getRatingCompat() {
        return this.RatingCompat;
    }

    public final void read(secondaryCount secondarycount) {
        this.RatingCompat = secondarycount;
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.onCommand.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCustomAction() {
        return ((Boolean) this.onCommand.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return ((Boolean) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(onContentAspectRatioChanged oncontentaspectratiochanged) {
        this.onPause.write(oncontentaspectratiochanged);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final onContentAspectRatioChanged onCommand() {
        return (onContentAspectRatioChanged) this.onPause.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(getReferencedType getreferencedtype) {
        this.onPlay.write(getreferencedtype);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getReferencedType MediaBrowserCompatMediaItem() {
        return (getReferencedType) this.onPlay.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final findProperty getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    public final void write(findProperty findproperty) {
        this.onPlayFromSearch = findproperty;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        this.onPrepare.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean onSetCaptioningEnabled() {
        return ((Boolean) this.onPrepare.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final _handleOddName MediaBrowserCompatSearchResultReceiver() {
        return !handleMediaPlayPauseIfPendingOnHandler() ? _handleOddName.INSTANCE : Fade.read(ChangeClipBounds.read(_handleOddName.INSTANCE, new RemoteActionCompatParcelizer(null)), this.onPrepareFromMediaId, new write(null), new IconCompatParcelizer(null), new getAnswerMap() { // from class: o.setData
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Typed3EpoxyController.AudioAttributesCompatParcelizer(this.write, (isAbstract) obj);
            }
        });
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "clickLocation", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getReferencedType, SampleVideos<? super getShowPopup>, Object> {
        /* synthetic */ long AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        
            if (r6.AudioAttributesCompatParcelizer(r5, r8, r10, r12) == r0) goto L22;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r12.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto L66
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L1a:
                long r3 = r12.AudioAttributesCompatParcelizer
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto L35
            L20:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                long r4 = r12.AudioAttributesCompatParcelizer
                o.Typed3EpoxyController r13 = kotlin.Typed3EpoxyController.this
                r1 = r12
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r12.AudioAttributesCompatParcelizer = r4
                r12.IconCompatParcelizer = r3
                java.lang.Object r13 = r13.IconCompatParcelizer(r1)
                if (r13 == r0) goto L69
                r3 = r4
            L35:
                o.Typed3EpoxyController r13 = kotlin.Typed3EpoxyController.this
                o.getSubscriptionExpiresOn r13 = kotlin.Typed3EpoxyController.write(r13)
                if (r13 == 0) goto L66
                o.Typed3EpoxyController r1 = kotlin.Typed3EpoxyController.this
                java.lang.Object r5 = r13.RemoteActionCompatParcelizer()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r13 = r13.read()
                o.findProperty r13 = (kotlin.findProperty) r13
                long r8 = r13.getIconCompatParcelizer()
                o.setGlobalExceptionHandler r6 = r1.getMediaBrowserCompatMediaItem()
                if (r6 == 0) goto L66
                r7 = r5
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                o.getReferencedType r10 = kotlin.getReferencedType.read(r3)
                r12.IconCompatParcelizer = r2
                r11 = r12
                java.lang.Object r12 = r6.AudioAttributesCompatParcelizer(r7, r8, r10, r11)
                if (r12 != r0) goto L66
                goto L69
            L66:
                o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
                return r12
            L69:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Typed3EpoxyController.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = Typed3EpoxyController.this.new RemoteActionCompatParcelizer(sampleVideos);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = ((getReferencedType) obj).getWrite();
            return remoteActionCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(getReferencedType getreferencedtype, SampleVideos<? super getShowPopup> sampleVideos) {
            return IconCompatParcelizer(getreferencedtype.getWrite(), sampleVideos);
        }

        public final Object IconCompatParcelizer(long j, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(getReferencedType.read(j), sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r8.IconCompatParcelizer(r4, r5, r7) == r0) goto L21;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r7.AudioAttributesCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L59
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L2e
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                o.Typed3EpoxyController r8 = kotlin.Typed3EpoxyController.this
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.AudioAttributesCompatParcelizer = r3
                java.lang.Object r8 = r8.IconCompatParcelizer(r1)
                if (r8 == r0) goto L61
            L2e:
                o.Typed3EpoxyController r8 = kotlin.Typed3EpoxyController.this
                o.getSubscriptionExpiresOn r8 = kotlin.Typed3EpoxyController.write(r8)
                if (r8 == 0) goto L59
                o.Typed3EpoxyController r1 = kotlin.Typed3EpoxyController.this
                java.lang.Object r4 = r8.RemoteActionCompatParcelizer()
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r8 = r8.read()
                o.findProperty r8 = (kotlin.findProperty) r8
                long r5 = r8.getIconCompatParcelizer()
                o.setGlobalExceptionHandler r8 = r1.getMediaBrowserCompatMediaItem()
                if (r8 == 0) goto L59
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r7.AudioAttributesCompatParcelizer = r2
                java.lang.Object r8 = r8.IconCompatParcelizer(r4, r5, r7)
                if (r8 != r0) goto L59
                goto L61
            L59:
                o.Typed3EpoxyController r7 = kotlin.Typed3EpoxyController.this
                r7.MediaBrowserCompatItemReceiver(r3)
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L61:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Typed3EpoxyController.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return Typed3EpoxyController.this.new write(sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.IconCompatParcelizer != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            Typed3EpoxyController.this.MediaBrowserCompatItemReceiver(false);
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return Typed3EpoxyController.this.new IconCompatParcelizer(sampleVideos);
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableTypeIdInclusion AudioAttributesCompatParcelizer(Typed3EpoxyController typed3EpoxyController, isAbstract isabstract) {
        isAbstract isabstractMediaBrowserCompatCustomActionResultReceiver;
        WritableTypeIdInclusion writableTypeIdInclusionOnSetRepeatMode = typed3EpoxyController.onSetRepeatMode();
        setImageDisplayMode setimagedisplaymode = typed3EpoxyController.write;
        if (setimagedisplaymode == null || (isabstractMediaBrowserCompatCustomActionResultReceiver = setimagedisplaymode.MediaBrowserCompatCustomActionResultReceiver()) == null) {
            return null;
        }
        return Fade.RemoteActionCompatParcelizer(writableTypeIdInclusionOnSetRepeatMode, isabstractMediaBrowserCompatCustomActionResultReceiver, isabstract);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\bR\u0016\u0010\u0005\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013"}, d2 = {"Lo/Typed3EpoxyController$RatingCompat;", "Lo/MediaRouteButton;", "Lo/getReferencedType;", "p0", "", "AudioAttributesCompatParcelizer", "(J)V", "IconCompatParcelizer", "()V", "Lo/getModelCountBuiltSoFar;", "p1", "(JLo/getModelCountBuiltSoFar;)V", "write", "RemoteActionCompatParcelizer", "", "Z", "Lo/findProperty;", "read", "Lo/findProperty;", "Lo/getModelCountBuiltSoFar;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RatingCompat implements MediaRouteButton {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private findProperty IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private boolean AudioAttributesCompatParcelizer = true;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private getModelCountBuiltSoFar RemoteActionCompatParcelizer = getModelCountBuiltSoFar.INSTANCE.read();

        @Override // kotlin.MediaRouteButton
        public final void AudioAttributesCompatParcelizer(long p0) {
        }

        @Override // kotlin.MediaRouteButton
        public final void IconCompatParcelizer() {
        }

        RatingCompat() {
        }

        @Override // kotlin.MediaRouteButton
        public final void AudioAttributesCompatParcelizer(long p0, getModelCountBuiltSoFar p1) {
            hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
            hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer2;
            if (Typed3EpoxyController.this.handleMediaPlayPauseIfPendingOnHandler() && Typed3EpoxyController.this.onCommand() == null) {
                Typed3EpoxyController.this.IconCompatParcelizer(onContentAspectRatioChanged.AudioAttributesCompatParcelizer);
                Typed3EpoxyController.this.onFastForward = -1;
                this.AudioAttributesCompatParcelizer = true;
                this.RemoteActionCompatParcelizer = p1;
                Typed3EpoxyController.this.onSeekTo();
                setImageDisplayMode write = Typed3EpoxyController.this.getWrite();
                if (write == null || (hasstableidsAudioAttributesImplApi26Parcelizer2 = write.AudioAttributesImplApi26Parcelizer()) == null || !hasstableidsAudioAttributesImplApi26Parcelizer2.IconCompatParcelizer(p0)) {
                    setImageDisplayMode write2 = Typed3EpoxyController.this.getWrite();
                    if (write2 != null && (hasstableidsAudioAttributesImplApi26Parcelizer = write2.AudioAttributesImplApi26Parcelizer()) != null) {
                        Typed3EpoxyController typed3EpoxyController = Typed3EpoxyController.this;
                        int iWrite = typed3EpoxyController.getIconCompatParcelizer().write(hasStableIds.RemoteActionCompatParcelizer$default(hasstableidsAudioAttributesImplApi26Parcelizer, p0, false, 2, null));
                        hasValueTypeDeserializer hasvaluetypedeserializerWrite = typed3EpoxyController.write(typed3EpoxyController.onRemoveQueueItem().getRead(), getValueInstantiator.write(iWrite, iWrite));
                        typed3EpoxyController.AudioAttributesCompatParcelizer(false);
                        depositSchemaProperty mediaDescriptionCompat = typed3EpoxyController.getMediaDescriptionCompat();
                        if (mediaDescriptionCompat != null) {
                            mediaDescriptionCompat.AudioAttributesCompatParcelizer(isNonStaticInnerClass.INSTANCE.AudioAttributesImplApi21Parcelizer());
                        }
                        typed3EpoxyController.onPlay().invoke(hasvaluetypedeserializerWrite);
                        typed3EpoxyController.write(findProperty.AudioAttributesCompatParcelizer(hasvaluetypedeserializerWrite.getAudioAttributesCompatParcelizer()));
                    }
                    this.AudioAttributesCompatParcelizer = false;
                } else {
                    if (Typed3EpoxyController.this.onRemoveQueueItem().AudioAttributesCompatParcelizer().length() == 0) {
                        return;
                    }
                    Typed3EpoxyController.this.AudioAttributesCompatParcelizer(false);
                    Typed3EpoxyController typed3EpoxyController2 = Typed3EpoxyController.this;
                    long jRemoteActionCompatParcelizer = typed3EpoxyController2.RemoteActionCompatParcelizer(hasValueTypeDeserializer.AudioAttributesCompatParcelizer$default(typed3EpoxyController2.onRemoveQueueItem(), null, findProperty.INSTANCE.AudioAttributesCompatParcelizer(), null, 5, null), p0, true, false, this.RemoteActionCompatParcelizer, true);
                    Typed3EpoxyController.this.onCustomAction = findProperty.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
                    this.IconCompatParcelizer = findProperty.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
                }
                Typed3EpoxyController.this.read(lambdaonImageAvailable1androidxmedia3uiPlayerView.IconCompatParcelizer);
                Typed3EpoxyController.this.onAddQueueItem = p0;
                Typed3EpoxyController typed3EpoxyController3 = Typed3EpoxyController.this;
                typed3EpoxyController3.write(getReferencedType.read(typed3EpoxyController3.onAddQueueItem));
                Typed3EpoxyController.this.handleMediaPlayPauseIfPendingOnHandler = getReferencedType.INSTANCE.write();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
        @Override // kotlin.MediaRouteButton
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void IconCompatParcelizer(long r10) {
            /*
                Method dump skipped, instruction units count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Typed3EpoxyController.RatingCompat.IconCompatParcelizer(long):void");
        }

        @Override // kotlin.MediaRouteButton
        public final void write() {
            AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.MediaRouteButton
        public final void RemoteActionCompatParcelizer() {
            AudioAttributesCompatParcelizer();
        }

        private final void AudioAttributesCompatParcelizer() {
            Typed3EpoxyController.this.IconCompatParcelizer((onContentAspectRatioChanged) null);
            Typed3EpoxyController.this.write((getReferencedType) null);
            this.RemoteActionCompatParcelizer = getModelCountBuiltSoFar.INSTANCE.read();
            Typed3EpoxyController.this.MediaBrowserCompatMediaItem(true);
            findProperty findproperty = this.IconCompatParcelizer;
            boolean zWrite = findProperty.write(findproperty != null ? findproperty.getIconCompatParcelizer() : Typed3EpoxyController.this.onRemoveQueueItem().getAudioAttributesCompatParcelizer());
            Typed3EpoxyController.this.read(zWrite ? lambdaonImageAvailable1androidxmedia3uiPlayerView.write : lambdaonImageAvailable1androidxmedia3uiPlayerView.RemoteActionCompatParcelizer);
            setImageDisplayMode write = Typed3EpoxyController.this.getWrite();
            if (write != null) {
                write.AudioAttributesImplApi21Parcelizer(!zWrite && setApplyingOpacityToLayersEnabled.IconCompatParcelizer(Typed3EpoxyController.this, true));
            }
            setImageDisplayMode write2 = Typed3EpoxyController.this.getWrite();
            if (write2 != null) {
                write2.MediaBrowserCompatItemReceiver(!zWrite && setApplyingOpacityToLayersEnabled.IconCompatParcelizer(Typed3EpoxyController.this, false));
            }
            setImageDisplayMode write3 = Typed3EpoxyController.this.getWrite();
            if (write3 != null) {
                write3.AudioAttributesCompatParcelizer(zWrite && setApplyingOpacityToLayersEnabled.IconCompatParcelizer(Typed3EpoxyController.this, true));
            }
            if (this.AudioAttributesCompatParcelizer) {
                Typed3EpoxyController typed3EpoxyController = Typed3EpoxyController.this;
                typed3EpoxyController.read(typed3EpoxyController.onCustomAction);
            }
            Typed3EpoxyController.this.onCustomAction = null;
        }
    }

    /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
    public final MediaRouteButton getOnPrepareFromSearch() {
        return this.onPrepareFromSearch;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0005\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\u0012J\u000f\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\r\u0010\u0018"}, d2 = {"Lo/Typed3EpoxyController$AudioAttributesImplApi26Parcelizer;", "Lo/add;", "Lo/getReferencedType;", "p0", "", "AudioAttributesCompatParcelizer", "(J)Z", "IconCompatParcelizer", "Lo/getModelCountBuiltSoFar;", "p1", "", "p2", "(JLo/getModelCountBuiltSoFar;I)Z", "write", "(JLo/getModelCountBuiltSoFar;)Z", "Lo/hasValueTypeDeserializer;", "p3", "Lo/findProperty;", "(Lo/hasValueTypeDeserializer;JZLo/getModelCountBuiltSoFar;)J", "", "()V", "read", "Z", "RemoteActionCompatParcelizer", "Lo/findProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer implements add {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public boolean RemoteActionCompatParcelizer = true;
        public findProperty write;

        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // kotlin.add
        public final boolean AudioAttributesCompatParcelizer(long p0) {
            setImageDisplayMode write = Typed3EpoxyController.this.getWrite();
            if (write == null || write.AudioAttributesImplApi26Parcelizer() == null || !Typed3EpoxyController.this.handleMediaPlayPauseIfPendingOnHandler()) {
                return false;
            }
            Typed3EpoxyController.this.onFastForward = -1;
            secondaryCount ratingCompat = Typed3EpoxyController.this.getRatingCompat();
            if (ratingCompat != null) {
                secondaryCount.RemoteActionCompatParcelizer$default(ratingCompat, 0, 1, null);
            }
            AudioAttributesCompatParcelizer(Typed3EpoxyController.this.onRemoveQueueItem(), p0, false, getModelCountBuiltSoFar.INSTANCE.read());
            return true;
        }

        @Override // kotlin.add
        public final boolean IconCompatParcelizer(long p0) {
            setImageDisplayMode write;
            if (!Typed3EpoxyController.this.handleMediaPlayPauseIfPendingOnHandler() || Typed3EpoxyController.this.onRemoveQueueItem().AudioAttributesCompatParcelizer().length() == 0 || (write = Typed3EpoxyController.this.getWrite()) == null || write.AudioAttributesImplApi26Parcelizer() == null) {
                return false;
            }
            AudioAttributesCompatParcelizer(Typed3EpoxyController.this.onRemoveQueueItem(), p0, false, getModelCountBuiltSoFar.INSTANCE.read());
            return true;
        }

        @Override // kotlin.add
        public final boolean AudioAttributesCompatParcelizer(long p0, getModelCountBuiltSoFar p1, int p2) {
            setImageDisplayMode write;
            if (!Typed3EpoxyController.this.handleMediaPlayPauseIfPendingOnHandler() || Typed3EpoxyController.this.onRemoveQueueItem().AudioAttributesCompatParcelizer().length() == 0 || (write = Typed3EpoxyController.this.getWrite()) == null || write.AudioAttributesImplApi26Parcelizer() == null) {
                return false;
            }
            secondaryCount ratingCompat = Typed3EpoxyController.this.getRatingCompat();
            if (ratingCompat != null) {
                secondaryCount.RemoteActionCompatParcelizer$default(ratingCompat, 0, 1, null);
            }
            Typed3EpoxyController.this.onAddQueueItem = p0;
            Typed3EpoxyController.this.onFastForward = -1;
            Typed3EpoxyController.AudioAttributesCompatParcelizer$default(Typed3EpoxyController.this, false, 1, null);
            long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(Typed3EpoxyController.this.onRemoveQueueItem(), Typed3EpoxyController.this.onAddQueueItem, true, p1);
            if (p2 >= 2) {
                this.RemoteActionCompatParcelizer = true;
                this.write = findProperty.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer);
            }
            return true;
        }

        @Override // kotlin.add
        public final boolean write(long p0, getModelCountBuiltSoFar p1) {
            setImageDisplayMode write;
            if (!Typed3EpoxyController.this.handleMediaPlayPauseIfPendingOnHandler() || Typed3EpoxyController.this.onRemoveQueueItem().AudioAttributesCompatParcelizer().length() == 0 || (write = Typed3EpoxyController.this.getWrite()) == null || write.AudioAttributesImplApi26Parcelizer() == null) {
                return false;
            }
            AudioAttributesCompatParcelizer(Typed3EpoxyController.this.onRemoveQueueItem(), p0, false, p1);
            return true;
        }

        public final long AudioAttributesCompatParcelizer(hasValueTypeDeserializer p0, long p1, boolean p2, getModelCountBuiltSoFar p3) {
            long jRemoteActionCompatParcelizer = Typed3EpoxyController.this.RemoteActionCompatParcelizer(p0, p1, p2, false, p3, false);
            if (!findProperty.AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer, this.write)) {
                this.RemoteActionCompatParcelizer = false;
            }
            Typed3EpoxyController.this.read(findProperty.write(jRemoteActionCompatParcelizer) ? lambdaonImageAvailable1androidxmedia3uiPlayerView.write : lambdaonImageAvailable1androidxmedia3uiPlayerView.RemoteActionCompatParcelizer);
            return jRemoteActionCompatParcelizer;
        }

        @Override // kotlin.add
        public final void AudioAttributesCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer) {
                Typed3EpoxyController.this.read(this.write);
            }
        }
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final add getOnPrepareFromUri() {
        return this.onPrepareFromUri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(findProperty p0) {
        setGlobalExceptionHandler setglobalexceptionhandler;
        AbstractDeserializer abstractDeserializerOnPrepareFromMediaId;
        String iconCompatParcelizer;
        TopUserCompanion topUserCompanion;
        if (p0 == null || (setglobalexceptionhandler = this.MediaBrowserCompatMediaItem) == null || (abstractDeserializerOnPrepareFromMediaId = onPrepareFromMediaId()) == null || (iconCompatParcelizer = abstractDeserializerOnPrepareFromMediaId.getIconCompatParcelizer()) == null) {
            return;
        }
        SettableBeanProperty settableBeanProperty = this.IconCompatParcelizer;
        long jWrite = getValueInstantiator.write(settableBeanProperty.RemoteActionCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(p0.getIconCompatParcelizer())), settableBeanProperty.RemoteActionCompatParcelizer(findProperty.read(p0.getIconCompatParcelizer())));
        if (iconCompatParcelizer.length() <= 0 || findProperty.write(jWrite) || (topUserCompanion = this.MediaBrowserCompatSearchResultReceiver) == null) {
            return;
        }
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new MediaBrowserCompatCustomActionResultReceiver(setglobalexceptionhandler, iconCompatParcelizer, jWrite, p0, this, settableBeanProperty, null), 3);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ String AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ Typed3EpoxyController AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ findProperty IconCompatParcelizer;
        final /* synthetic */ long RemoteActionCompatParcelizer;
        final /* synthetic */ SettableBeanProperty read;
        final /* synthetic */ setGlobalExceptionHandler write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesImplApi21Parcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesImplApi21Parcelizer = 1;
                obj = this.write.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            findProperty findproperty = (findProperty) obj;
            if (findproperty != null) {
                SettableBeanProperty settableBeanProperty = this.read;
                long iconCompatParcelizer = findproperty.getIconCompatParcelizer();
                long jWrite = getValueInstantiator.write(settableBeanProperty.write(findProperty.AudioAttributesImplBaseParcelizer(iconCompatParcelizer)), settableBeanProperty.write(findProperty.read(iconCompatParcelizer)));
                if (!findProperty.AudioAttributesCompatParcelizer(jWrite, this.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer.onRemoveQueueItem().AudioAttributesCompatParcelizer(), (Object) this.AudioAttributesCompatParcelizer) && this.read == this.AudioAttributesImplApi26Parcelizer.getIconCompatParcelizer()) {
                    getAnswerMap<hasValueTypeDeserializer, getShowPopup> getanswermapOnPlay = this.AudioAttributesImplApi26Parcelizer.onPlay();
                    Typed3EpoxyController typed3EpoxyController = this.AudioAttributesImplApi26Parcelizer;
                    getanswermapOnPlay.invoke(typed3EpoxyController.write(typed3EpoxyController.onRemoveQueueItem().getRead(), jWrite));
                    this.AudioAttributesImplApi26Parcelizer.write(findProperty.AudioAttributesCompatParcelizer(jWrite));
                }
                return getShowPopup.INSTANCE;
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(setGlobalExceptionHandler setglobalexceptionhandler, String str, long j, findProperty findproperty, Typed3EpoxyController typed3EpoxyController, SettableBeanProperty settableBeanProperty, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.write = setglobalexceptionhandler;
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = j;
            this.IconCompatParcelizer = findproperty;
            this.AudioAttributesImplApi26Parcelizer = typed3EpoxyController;
            this.read = settableBeanProperty;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatCustomActionResultReceiver(this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\b"}, d2 = {"Lo/Typed3EpoxyController$AudioAttributesImplApi21Parcelizer;", "Lo/MediaRouteButton;", "Lo/getReferencedType;", "p0", "", "AudioAttributesCompatParcelizer", "(J)V", "IconCompatParcelizer", "()V", "Lo/getModelCountBuiltSoFar;", "p1", "(JLo/getModelCountBuiltSoFar;)V", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer implements MediaRouteButton {
        final /* synthetic */ boolean RemoteActionCompatParcelizer;

        @Override // kotlin.MediaRouteButton
        public final void AudioAttributesCompatParcelizer(long p0, getModelCountBuiltSoFar p1) {
        }

        @Override // kotlin.MediaRouteButton
        public final void RemoteActionCompatParcelizer() {
        }

        AudioAttributesImplApi21Parcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }

        @Override // kotlin.MediaRouteButton
        public final void AudioAttributesCompatParcelizer(long p0) {
            hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
            Typed3EpoxyController.this.IconCompatParcelizer(this.RemoteActionCompatParcelizer ? onContentAspectRatioChanged.IconCompatParcelizer : onContentAspectRatioChanged.AudioAttributesCompatParcelizer);
            long j = setDebugLoggingEnabled.read(Typed3EpoxyController.this.read(this.RemoteActionCompatParcelizer));
            setImageDisplayMode write = Typed3EpoxyController.this.getWrite();
            if (write == null || (hasstableidsAudioAttributesImplApi26Parcelizer = write.AudioAttributesImplApi26Parcelizer()) == null) {
                return;
            }
            long j2 = hasstableidsAudioAttributesImplApi26Parcelizer.read(j);
            Typed3EpoxyController.this.onAddQueueItem = j2;
            Typed3EpoxyController.this.write(getReferencedType.read(j2));
            Typed3EpoxyController.this.handleMediaPlayPauseIfPendingOnHandler = getReferencedType.INSTANCE.write();
            Typed3EpoxyController.this.onFastForward = -1;
            setImageDisplayMode write2 = Typed3EpoxyController.this.getWrite();
            if (write2 != null) {
                write2.write(true);
            }
            Typed3EpoxyController.this.MediaBrowserCompatMediaItem(false);
        }

        @Override // kotlin.MediaRouteButton
        public final void IconCompatParcelizer() {
            Typed3EpoxyController.this.IconCompatParcelizer((onContentAspectRatioChanged) null);
            Typed3EpoxyController.this.write((getReferencedType) null);
            Typed3EpoxyController.this.MediaBrowserCompatMediaItem(true);
        }

        @Override // kotlin.MediaRouteButton
        public final void IconCompatParcelizer(long p0) {
            Typed3EpoxyController typed3EpoxyController = Typed3EpoxyController.this;
            typed3EpoxyController.handleMediaPlayPauseIfPendingOnHandler = getReferencedType.RemoteActionCompatParcelizer(typed3EpoxyController.handleMediaPlayPauseIfPendingOnHandler, p0);
            Typed3EpoxyController typed3EpoxyController2 = Typed3EpoxyController.this;
            typed3EpoxyController2.write(getReferencedType.read(getReferencedType.RemoteActionCompatParcelizer(typed3EpoxyController2.onAddQueueItem, Typed3EpoxyController.this.handleMediaPlayPauseIfPendingOnHandler)));
            Typed3EpoxyController typed3EpoxyController3 = Typed3EpoxyController.this;
            hasValueTypeDeserializer hasvaluetypedeserializerOnRemoveQueueItem = typed3EpoxyController3.onRemoveQueueItem();
            getReferencedType getreferencedtypeMediaBrowserCompatMediaItem = Typed3EpoxyController.this.MediaBrowserCompatMediaItem();
            toMagicModuleMetaRepoModel.write(getreferencedtypeMediaBrowserCompatMediaItem);
            typed3EpoxyController3.RemoteActionCompatParcelizer(hasvaluetypedeserializerOnRemoveQueueItem, getreferencedtypeMediaBrowserCompatMediaItem.getWrite(), false, this.RemoteActionCompatParcelizer, getModelCountBuiltSoFar.INSTANCE.RemoteActionCompatParcelizer(), true);
            Typed3EpoxyController.this.MediaBrowserCompatMediaItem(false);
        }

        @Override // kotlin.MediaRouteButton
        public final void write() {
            Typed3EpoxyController.this.IconCompatParcelizer((onContentAspectRatioChanged) null);
            Typed3EpoxyController.this.write((getReferencedType) null);
            Typed3EpoxyController.this.MediaBrowserCompatMediaItem(true);
        }
    }

    public final MediaRouteButton AudioAttributesImplBaseParcelizer(boolean p0) {
        return new AudioAttributesImplApi21Parcelizer(p0);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\b"}, d2 = {"Lo/Typed3EpoxyController$read;", "Lo/MediaRouteButton;", "Lo/getReferencedType;", "p0", "", "AudioAttributesCompatParcelizer", "(J)V", "IconCompatParcelizer", "()V", "Lo/getModelCountBuiltSoFar;", "p1", "(JLo/getModelCountBuiltSoFar;)V", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements MediaRouteButton {
        @Override // kotlin.MediaRouteButton
        public final void AudioAttributesCompatParcelizer(long p0) {
        }

        @Override // kotlin.MediaRouteButton
        public final void RemoteActionCompatParcelizer() {
        }

        read() {
        }

        @Override // kotlin.MediaRouteButton
        public final void IconCompatParcelizer() {
            Typed3EpoxyController.this.IconCompatParcelizer((onContentAspectRatioChanged) null);
            Typed3EpoxyController.this.write((getReferencedType) null);
        }

        @Override // kotlin.MediaRouteButton
        public final void AudioAttributesCompatParcelizer(long p0, getModelCountBuiltSoFar p1) {
            hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
            long j = setDebugLoggingEnabled.read(Typed3EpoxyController.this.read(true));
            setImageDisplayMode write = Typed3EpoxyController.this.getWrite();
            if (write == null || (hasstableidsAudioAttributesImplApi26Parcelizer = write.AudioAttributesImplApi26Parcelizer()) == null) {
                return;
            }
            long j2 = hasstableidsAudioAttributesImplApi26Parcelizer.read(j);
            Typed3EpoxyController.this.onAddQueueItem = j2;
            Typed3EpoxyController.this.write(getReferencedType.read(j2));
            Typed3EpoxyController.this.handleMediaPlayPauseIfPendingOnHandler = getReferencedType.INSTANCE.write();
            Typed3EpoxyController.this.IconCompatParcelizer(onContentAspectRatioChanged.write);
            Typed3EpoxyController.this.MediaBrowserCompatMediaItem(false);
        }

        @Override // kotlin.MediaRouteButton
        public final void IconCompatParcelizer(long p0) {
            hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
            depositSchemaProperty mediaDescriptionCompat;
            Typed3EpoxyController typed3EpoxyController = Typed3EpoxyController.this;
            typed3EpoxyController.handleMediaPlayPauseIfPendingOnHandler = getReferencedType.RemoteActionCompatParcelizer(typed3EpoxyController.handleMediaPlayPauseIfPendingOnHandler, p0);
            setImageDisplayMode write = Typed3EpoxyController.this.getWrite();
            if (write == null || (hasstableidsAudioAttributesImplApi26Parcelizer = write.AudioAttributesImplApi26Parcelizer()) == null) {
                return;
            }
            Typed3EpoxyController typed3EpoxyController2 = Typed3EpoxyController.this;
            typed3EpoxyController2.write(getReferencedType.read(getReferencedType.RemoteActionCompatParcelizer(typed3EpoxyController2.onAddQueueItem, typed3EpoxyController2.handleMediaPlayPauseIfPendingOnHandler)));
            SettableBeanProperty iconCompatParcelizer = typed3EpoxyController2.getIconCompatParcelizer();
            getReferencedType getreferencedtypeMediaBrowserCompatMediaItem = typed3EpoxyController2.MediaBrowserCompatMediaItem();
            toMagicModuleMetaRepoModel.write(getreferencedtypeMediaBrowserCompatMediaItem);
            int iWrite = iconCompatParcelizer.write(hasStableIds.RemoteActionCompatParcelizer$default(hasstableidsAudioAttributesImplApi26Parcelizer, getreferencedtypeMediaBrowserCompatMediaItem.getWrite(), false, 2, null));
            long jWrite = getValueInstantiator.write(iWrite, iWrite);
            if (findProperty.IconCompatParcelizer(jWrite, typed3EpoxyController2.onRemoveQueueItem().getAudioAttributesCompatParcelizer())) {
                return;
            }
            setImageDisplayMode write2 = typed3EpoxyController2.getWrite();
            if ((write2 == null || write2.onPause()) && (mediaDescriptionCompat = typed3EpoxyController2.getMediaDescriptionCompat()) != null) {
                mediaDescriptionCompat.AudioAttributesCompatParcelizer(isNonStaticInnerClass.INSTANCE.AudioAttributesImplApi21Parcelizer());
            }
            typed3EpoxyController2.onPlay().invoke(typed3EpoxyController2.write(typed3EpoxyController2.onRemoveQueueItem().getRead(), jWrite));
            typed3EpoxyController2.write(findProperty.AudioAttributesCompatParcelizer(jWrite));
        }

        @Override // kotlin.MediaRouteButton
        public final void write() {
            Typed3EpoxyController.this.IconCompatParcelizer((onContentAspectRatioChanged) null);
            Typed3EpoxyController.this.write((getReferencedType) null);
        }
    }

    public final MediaRouteButton AudioAttributesImplApi21Parcelizer() {
        return new read();
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer$default(Typed3EpoxyController typed3EpoxyController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        typed3EpoxyController.AudioAttributesCompatParcelizer(z);
    }

    public final void AudioAttributesCompatParcelizer(boolean p0) {
        secondaryCount secondarycount;
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode != null && !setimagedisplaymode.AudioAttributesCompatParcelizer() && (secondarycount = this.RatingCompat) != null) {
            secondaryCount.RemoteActionCompatParcelizer$default(secondarycount, 0, 1, null);
        }
        this.onPlayFromMediaId = onRemoveQueueItem();
        MediaBrowserCompatMediaItem(p0);
        read(lambdaonImageAvailable1androidxmedia3uiPlayerView.RemoteActionCompatParcelizer);
    }

    public final void MediaMetadataCompat() {
        MediaBrowserCompatMediaItem(false);
        read(lambdaonImageAvailable1androidxmedia3uiPlayerView.IconCompatParcelizer);
    }

    public static /* synthetic */ void IconCompatParcelizer$default(Typed3EpoxyController typed3EpoxyController, getReferencedType getreferencedtype, int i, Object obj) {
        if ((i & 1) != 0) {
            getreferencedtype = null;
        }
        typed3EpoxyController.IconCompatParcelizer(getreferencedtype);
    }

    public final void IconCompatParcelizer(getReferencedType p0) {
        int iAudioAttributesImplApi26Parcelizer;
        if (!findProperty.write(onRemoveQueueItem().getAudioAttributesCompatParcelizer())) {
            setImageDisplayMode setimagedisplaymode = this.write;
            hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode != null ? setimagedisplaymode.AudioAttributesImplApi26Parcelizer() : null;
            if (p0 != null && hasstableidsAudioAttributesImplApi26Parcelizer != null) {
                iAudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.write(hasStableIds.RemoteActionCompatParcelizer$default(hasstableidsAudioAttributesImplApi26Parcelizer, p0.getWrite(), false, 2, null));
            } else {
                iAudioAttributesImplApi26Parcelizer = findProperty.AudioAttributesImplApi26Parcelizer(onRemoveQueueItem().getAudioAttributesCompatParcelizer());
            }
            hasValueTypeDeserializer hasvaluetypedeserializerAudioAttributesCompatParcelizer$default = hasValueTypeDeserializer.AudioAttributesCompatParcelizer$default(onRemoveQueueItem(), null, getValueInstantiator.IconCompatParcelizer(iAudioAttributesImplApi26Parcelizer), null, 5, null);
            this.read.invoke(hasvaluetypedeserializerAudioAttributesCompatParcelizer$default);
            this.onPlayFromSearch = findProperty.AudioAttributesCompatParcelizer(hasvaluetypedeserializerAudioAttributesCompatParcelizer$default.getAudioAttributesCompatParcelizer());
        }
        read((p0 == null || onRemoveQueueItem().AudioAttributesCompatParcelizer().length() <= 0) ? lambdaonImageAvailable1androidxmedia3uiPlayerView.IconCompatParcelizer : lambdaonImageAvailable1androidxmedia3uiPlayerView.write);
        MediaBrowserCompatMediaItem(false);
    }

    public final void RemoteActionCompatParcelizer(long p0) {
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode != null) {
            setimagedisplaymode.read(p0);
        }
        setImageDisplayMode setimagedisplaymode2 = this.write;
        if (setimagedisplaymode2 != null) {
            setimagedisplaymode2.IconCompatParcelizer(findProperty.INSTANCE.AudioAttributesCompatParcelizer());
        }
        if (findProperty.write(p0)) {
            return;
        }
        MediaMetadataCompat();
    }

    public final void read(long p0) {
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode != null) {
            setimagedisplaymode.IconCompatParcelizer(p0);
        }
        setImageDisplayMode setimagedisplaymode2 = this.write;
        if (setimagedisplaymode2 != null) {
            setimagedisplaymode2.read(findProperty.INSTANCE.AudioAttributesCompatParcelizer());
        }
        if (findProperty.write(p0)) {
            return;
        }
        MediaMetadataCompat();
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode != null) {
            setimagedisplaymode.IconCompatParcelizer(findProperty.INSTANCE.AudioAttributesCompatParcelizer());
        }
        setImageDisplayMode setimagedisplaymode2 = this.write;
        if (setimagedisplaymode2 != null) {
            setimagedisplaymode2.read(findProperty.INSTANCE.AudioAttributesCompatParcelizer());
        }
    }

    public final void MediaBrowserCompatItemReceiver(boolean z) {
        this.onRemoveQueueItem = z;
    }

    public final boolean onPrepare() {
        if (getDesignInfoListui_tooling.RemoteActionCompatParcelizer) {
            return this.onRemoveQueueItem;
        }
        getHandlerInstantiator gethandlerinstantiator = this.MediaMetadataCompat;
        return (gethandlerinstantiator != null ? gethandlerinstantiator.getIconCompatParcelizer() : null) == getTypeResolverBuilder.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onSkipToPrevious() {
        return this.AudioAttributesImplApi21Parcelizer instanceof deserializeWith;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onSetPlaybackSpeed() {
        return !findProperty.write(onRemoveQueueItem().getAudioAttributesCompatParcelizer());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.Typed3EpoxyController.MediaBrowserCompatMediaItem
            if (r0 == 0) goto L14
            r0 = r5
            o.Typed3EpoxyController$MediaBrowserCompatMediaItem r0 = (o.Typed3EpoxyController.MediaBrowserCompatMediaItem) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.read
            int r5 = r5 + r2
            r0.read = r5
            goto L19
        L14:
            o.Typed3EpoxyController$MediaBrowserCompatMediaItem r0 = new o.Typed3EpoxyController$MediaBrowserCompatMediaItem
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            o.Typed3EpoxyController r4 = (kotlin.Typed3EpoxyController) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L4e
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.findNullKeySerializer r5 = r4.MediaBrowserCompatItemReceiver
            if (r5 == 0) goto L57
            boolean r5 = kotlin.setStableInsets.write(r5)
            if (r5 != r3) goto L57
            r0.RemoteActionCompatParcelizer = r4
            r0.read = r3
            java.lang.Object r5 = kotlin.setApplyingOpacityToLayersEnabled.AudioAttributesCompatParcelizer(r4, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r4.MediaBrowserCompatCustomActionResultReceiver(r5)
        L57:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Typed3EpoxyController.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, findProperty> onSetShuffleMode() {
        String iconCompatParcelizer;
        findProperty findproperty;
        AbstractDeserializer abstractDeserializerOnPrepareFromMediaId = onPrepareFromMediaId();
        if (abstractDeserializerOnPrepareFromMediaId == null || (iconCompatParcelizer = abstractDeserializerOnPrepareFromMediaId.getIconCompatParcelizer()) == null || (findproperty = this.onPlayFromSearch) == null) {
            return null;
        }
        long iconCompatParcelizer2 = findproperty.getIconCompatParcelizer();
        return new Pair<>(iconCompatParcelizer, findProperty.AudioAttributesCompatParcelizer(getValueInstantiator.write(this.IconCompatParcelizer.RemoteActionCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(iconCompatParcelizer2)), this.IconCompatParcelizer.RemoteActionCompatParcelizer(findProperty.read(iconCompatParcelizer2)))));
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return findProperty.RemoteActionCompatParcelizer(onRemoveQueueItem().getAudioAttributesCompatParcelizer()) != onRemoveQueueItem().AudioAttributesCompatParcelizer().length();
    }

    public final boolean read() {
        return onCustomAction() && findProperty.write(onRemoveQueueItem().getAudioAttributesCompatParcelizer());
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ boolean RemoteActionCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                AbstractDeserializer abstractDeserializerIconCompatParcelizer = Typed3EpoxyController.this.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
                if (abstractDeserializerIconCompatParcelizer == null) {
                    return getShowPopup.INSTANCE;
                }
                findNullKeySerializer mediaBrowserCompatItemReceiver = Typed3EpoxyController.this.getMediaBrowserCompatItemReceiver();
                if (mediaBrowserCompatItemReceiver != null) {
                    this.read = 1;
                    if (mediaBrowserCompatItemReceiver.read(setStableInsets.IconCompatParcelizer(abstractDeserializerIconCompatParcelizer), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(boolean z, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return Typed3EpoxyController.this.new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static /* synthetic */ setPassingYear write$default(Typed3EpoxyController typed3EpoxyController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return typed3EpoxyController.write(z);
    }

    public final setPassingYear write(boolean p0) {
        TopUserCompanion topUserCompanion = this.MediaBrowserCompatSearchResultReceiver;
        if (topUserCompanion != null) {
            return C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, getCollegeName.AudioAttributesCompatParcelizer, new AudioAttributesCompatParcelizer(p0, null), 1);
        }
        return null;
    }

    public static /* synthetic */ AbstractDeserializer IconCompatParcelizer$default(Typed3EpoxyController typed3EpoxyController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return typed3EpoxyController.IconCompatParcelizer(z);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        
            if (r5 == r0) goto L23;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L44
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L34
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                o.Typed3EpoxyController r5 = kotlin.Typed3EpoxyController.this
                o.findNullKeySerializer r5 = r5.getMediaBrowserCompatItemReceiver()
                if (r5 == 0) goto L51
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.RemoteActionCompatParcelizer = r3
                java.lang.Object r5 = r5.write(r1)
                if (r5 == r0) goto L50
            L34:
                o.findNullValueSerializer r5 = (kotlin.findNullValueSerializer) r5
                if (r5 == 0) goto L51
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.RemoteActionCompatParcelizer = r2
                java.lang.Object r5 = kotlin.setStableInsets.RemoteActionCompatParcelizer(r5, r1)
                if (r5 != r0) goto L44
                goto L50
            L44:
                o.AbstractDeserializer r5 = (kotlin.AbstractDeserializer) r5
                if (r5 == 0) goto L51
                o.Typed3EpoxyController r4 = kotlin.Typed3EpoxyController.this
                r4.AudioAttributesCompatParcelizer(r5)
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            L50:
                return r0
            L51:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Typed3EpoxyController.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return Typed3EpoxyController.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final setPassingYear onRemoveQueueItemAt() {
        TopUserCompanion topUserCompanion = this.MediaBrowserCompatSearchResultReceiver;
        if (topUserCompanion != null) {
            return C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, getCollegeName.AudioAttributesCompatParcelizer, new MediaBrowserCompatItemReceiver(null), 1);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                AbstractDeserializer abstractDeserializerAudioAttributesImplBaseParcelizer = Typed3EpoxyController.this.AudioAttributesImplBaseParcelizer();
                if (abstractDeserializerAudioAttributesImplBaseParcelizer == null) {
                    return getShowPopup.INSTANCE;
                }
                findNullKeySerializer mediaBrowserCompatItemReceiver = Typed3EpoxyController.this.getMediaBrowserCompatItemReceiver();
                if (mediaBrowserCompatItemReceiver != null) {
                    this.AudioAttributesCompatParcelizer = 1;
                    if (mediaBrowserCompatItemReceiver.read(setStableInsets.IconCompatParcelizer(abstractDeserializerAudioAttributesImplBaseParcelizer), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return Typed3EpoxyController.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final setPassingYear MediaBrowserCompatItemReceiver() {
        TopUserCompanion topUserCompanion = this.MediaBrowserCompatSearchResultReceiver;
        if (topUserCompanion != null) {
            return C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, getCollegeName.AudioAttributesCompatParcelizer, new AudioAttributesImplBaseParcelizer(null), 1);
        }
        return null;
    }

    public final void onRewind() {
        hasValueTypeDeserializer hasvaluetypedeserializerWrite = write(onRemoveQueueItem().getRead(), getValueInstantiator.write(0, onRemoveQueueItem().AudioAttributesCompatParcelizer().length()));
        this.read.invoke(hasvaluetypedeserializerWrite);
        this.onPlayFromSearch = findProperty.AudioAttributesCompatParcelizer(hasvaluetypedeserializerWrite.getAudioAttributesCompatParcelizer());
        this.onPlayFromMediaId = hasValueTypeDeserializer.AudioAttributesCompatParcelizer$default(this.onPlayFromMediaId, null, hasvaluetypedeserializerWrite.getAudioAttributesCompatParcelizer(), null, 5, null);
        AudioAttributesCompatParcelizer(true);
    }

    public final void RemoteActionCompatParcelizer() {
        getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.AudioAttributesImplBaseParcelizer;
        if (getcreatedondatems != null) {
            getcreatedondatems.invoke();
        }
    }

    public final long read(boolean p0) {
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
        deserializeFromNumber audioAttributesCompatParcelizer;
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode == null || (hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer()) == null || (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) == null) {
            return getReferencedType.INSTANCE.read();
        }
        AbstractDeserializer abstractDeserializerOnPrepareFromMediaId = onPrepareFromMediaId();
        if (abstractDeserializerOnPrepareFromMediaId == null) {
            return getReferencedType.INSTANCE.read();
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) abstractDeserializerOnPrepareFromMediaId.getIconCompatParcelizer(), (Object) audioAttributesCompatParcelizer.getIconCompatParcelizer().getWrite().getIconCompatParcelizer())) {
            return getReferencedType.INSTANCE.read();
        }
        long audioAttributesCompatParcelizer2 = onRemoveQueueItem().getAudioAttributesCompatParcelizer();
        return setMaintainOriginalImageBounds.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0 ? findProperty.AudioAttributesImplBaseParcelizer(audioAttributesCompatParcelizer2) : findProperty.read(audioAttributesCompatParcelizer2)), p0, findProperty.AudioAttributesImplApi21Parcelizer(onRemoveQueueItem().getAudioAttributesCompatParcelizer()));
    }

    public final float RemoteActionCompatParcelizer(boolean p0) {
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
        deserializeFromNumber audioAttributesCompatParcelizer;
        int iAudioAttributesImplBaseParcelizer = p0 ? findProperty.AudioAttributesImplBaseParcelizer(onRemoveQueueItem().getAudioAttributesCompatParcelizer()) : findProperty.read(onRemoveQueueItem().getAudioAttributesCompatParcelizer());
        setImageDisplayMode setimagedisplaymode = this.write;
        return (setimagedisplaymode == null || (hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer()) == null || (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) == null) ? BitmapDescriptorFactory.HUE_RED : findRelativeAdapterPositionIn.read(audioAttributesCompatParcelizer, iAudioAttributesImplBaseParcelizer);
    }

    public final long IconCompatParcelizer(bufferMapProperty p0) {
        int iRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(onRemoveQueueItem().getAudioAttributesCompatParcelizer()));
        setImageDisplayMode setimagedisplaymode = this.write;
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode != null ? setimagedisplaymode.AudioAttributesImplApi26Parcelizer() : null;
        toMagicModuleMetaRepoModel.write(hasstableidsAudioAttributesImplApi26Parcelizer);
        deserializeFromNumber audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer();
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer(getQues.write(iRemoteActionCompatParcelizer, 0, audioAttributesCompatParcelizer.getIconCompatParcelizer().getWrite().length()));
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(writableTypeIdInclusionIconCompatParcelizer.getIconCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(writableTypeIdInclusionIconCompatParcelizer.getAudioAttributesCompatParcelizer() + (p0.AudioAttributesCompatParcelizer(setOnClickListener.RemoteActionCompatParcelizer()) / 2.0f))) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem(boolean p0) {
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode != null) {
            setimagedisplaymode.AudioAttributesImplBaseParcelizer(p0);
        }
        if (p0) {
            onSetRating();
        } else {
            onSeekTo();
        }
    }

    public final void onSetRating() {
        setImageDisplayMode setimagedisplaymode;
        parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
        parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
        getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
        parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
        try {
            if (handleMediaPlayPauseIfPendingOnHandler() && ((setimagedisplaymode = this.write) == null || setimagedisplaymode.onPause())) {
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                if (getDesignInfoListui_tooling.RemoteActionCompatParcelizer) {
                    this.onPrepareFromMediaId.RemoteActionCompatParcelizer();
                } else {
                    onSkipToNext();
                }
            }
        } finally {
            companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (Typed3EpoxyController.this.IconCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            final Typed3EpoxyController typed3EpoxyController = Typed3EpoxyController.this;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                getCreatedOnDateMs<getShowPopup> getcreatedondatems = typed3EpoxyController.AudioAttributesCompatParcelizer() ? new getCreatedOnDateMs() { // from class: o.Typed4EpoxyController
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Typed3EpoxyController.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer(typed3EpoxyController);
                    }
                } : null;
                getCreatedOnDateMs<getShowPopup> getcreatedondatems2 = typed3EpoxyController.IconCompatParcelizer() ? new getCreatedOnDateMs() { // from class: o.SimpleEpoxyController
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Typed3EpoxyController.MediaMetadataCompat.AudioAttributesImplApi21Parcelizer(typed3EpoxyController);
                    }
                } : null;
                getCreatedOnDateMs<getShowPopup> getcreatedondatems3 = typed3EpoxyController.write() ? new getCreatedOnDateMs() { // from class: o.ViewHolderState
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Typed3EpoxyController.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver(typed3EpoxyController);
                    }
                } : null;
                getCreatedOnDateMs<getShowPopup> getcreatedondatems4 = typed3EpoxyController.MediaBrowserCompatCustomActionResultReceiver() ? new getCreatedOnDateMs() { // from class: o.StickyHeaderLinearLayoutManager
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Typed3EpoxyController.MediaMetadataCompat.MediaBrowserCompatItemReceiver(typed3EpoxyController);
                    }
                } : null;
                getCreatedOnDateMs<getShowPopup> getcreatedondatems5 = typed3EpoxyController.read() ? new getCreatedOnDateMs() { // from class: o.TypedEpoxyController
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Typed3EpoxyController.MediaMetadataCompat.AudioAttributesImplBaseParcelizer(typed3EpoxyController);
                    }
                } : null;
                getHandlerInstantiator mediaMetadataCompat = typed3EpoxyController.getMediaMetadataCompat();
                if (mediaMetadataCompat != null) {
                    mediaMetadataCompat.RemoteActionCompatParcelizer(typed3EpoxyController.onSetRepeatMode(), getcreatedondatems, getcreatedondatems3, getcreatedondatems2, getcreatedondatems4, getcreatedondatems5);
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                return getShowPopup.INSTANCE;
            } catch (Throwable th) {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                throw th;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            int IconCompatParcelizer;
            final /* synthetic */ Typed3EpoxyController write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                if (this.IconCompatParcelizer != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                Typed3EpoxyController.write$default(this.write, false, 1, null);
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            RemoteActionCompatParcelizer(Typed3EpoxyController typed3EpoxyController, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.write = typed3EpoxyController;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new RemoteActionCompatParcelizer(this.write, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesImplApi26Parcelizer(Typed3EpoxyController typed3EpoxyController) {
            TopUserCompanion mediaBrowserCompatSearchResultReceiver = typed3EpoxyController.getMediaBrowserCompatSearchResultReceiver();
            if (mediaBrowserCompatSearchResultReceiver != null) {
                C0201setMcqCount.IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver, null, getCollegeName.AudioAttributesCompatParcelizer, new RemoteActionCompatParcelizer(typed3EpoxyController, null), 1);
            }
            typed3EpoxyController.onSeekTo();
            return getShowPopup.INSTANCE;
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            int read;
            final /* synthetic */ Typed3EpoxyController write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                if (this.read != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write.MediaBrowserCompatItemReceiver();
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IconCompatParcelizer(Typed3EpoxyController typed3EpoxyController, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.write = typed3EpoxyController;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new IconCompatParcelizer(this.write, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesImplApi21Parcelizer(Typed3EpoxyController typed3EpoxyController) {
            TopUserCompanion mediaBrowserCompatSearchResultReceiver = typed3EpoxyController.getMediaBrowserCompatSearchResultReceiver();
            if (mediaBrowserCompatSearchResultReceiver != null) {
                C0201setMcqCount.IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver, null, getCollegeName.AudioAttributesCompatParcelizer, new IconCompatParcelizer(typed3EpoxyController, null), 1);
            }
            typed3EpoxyController.onSeekTo();
            return getShowPopup.INSTANCE;
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ Typed3EpoxyController RemoteActionCompatParcelizer;
            int read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                if (this.read != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer.onRemoveQueueItemAt();
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            read(Typed3EpoxyController typed3EpoxyController, SampleVideos<? super read> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = typed3EpoxyController;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new read(this.RemoteActionCompatParcelizer, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(Typed3EpoxyController typed3EpoxyController) {
            TopUserCompanion mediaBrowserCompatSearchResultReceiver = typed3EpoxyController.getMediaBrowserCompatSearchResultReceiver();
            if (mediaBrowserCompatSearchResultReceiver != null) {
                C0201setMcqCount.IconCompatParcelizer(mediaBrowserCompatSearchResultReceiver, null, getCollegeName.AudioAttributesCompatParcelizer, new read(typed3EpoxyController, null), 1);
            }
            typed3EpoxyController.onSeekTo();
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup MediaBrowserCompatItemReceiver(Typed3EpoxyController typed3EpoxyController) {
            typed3EpoxyController.onRewind();
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesImplBaseParcelizer(Typed3EpoxyController typed3EpoxyController) {
            typed3EpoxyController.RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return Typed3EpoxyController.this.new MediaMetadataCompat(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final setPassingYear onSkipToNext() {
        TopUserCompanion topUserCompanion = this.MediaBrowserCompatSearchResultReceiver;
        if (topUserCompanion != null) {
            return C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, getCollegeName.AudioAttributesCompatParcelizer, new MediaMetadataCompat(null), 1);
        }
        return null;
    }

    public final void onSeekTo() {
        getHandlerInstantiator gethandlerinstantiator;
        if (getDesignInfoListui_tooling.RemoteActionCompatParcelizer) {
            this.onPrepareFromMediaId.AudioAttributesCompatParcelizer();
            return;
        }
        getHandlerInstantiator gethandlerinstantiator2 = this.MediaMetadataCompat;
        if ((gethandlerinstantiator2 != null ? gethandlerinstantiator2.getIconCompatParcelizer() : null) != getTypeResolverBuilder.AudioAttributesCompatParcelizer || (gethandlerinstantiator = this.MediaMetadataCompat) == null) {
            return;
        }
        gethandlerinstantiator.IconCompatParcelizer();
    }

    public final boolean onPrepareFromUri() {
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromMediaId.AudioAttributesCompatParcelizer(), (Object) onRemoveQueueItem().AudioAttributesCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableTypeIdInclusion onSetRepeatMode() {
        long j;
        float fIntBitsToFloat;
        isAbstract isabstractMediaBrowserCompatCustomActionResultReceiver;
        deserializeFromNumber audioAttributesCompatParcelizer;
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer;
        isAbstract isabstractMediaBrowserCompatCustomActionResultReceiver2;
        deserializeFromNumber audioAttributesCompatParcelizer2;
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer2;
        isAbstract isabstractMediaBrowserCompatCustomActionResultReceiver3;
        isAbstract isabstractMediaBrowserCompatCustomActionResultReceiver4;
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode != null) {
            if (setimagedisplaymode.getOnCommand()) {
                setimagedisplaymode = null;
            }
            if (setimagedisplaymode != null) {
                int iRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(onRemoveQueueItem().getAudioAttributesCompatParcelizer()));
                int iRemoteActionCompatParcelizer2 = this.IconCompatParcelizer.RemoteActionCompatParcelizer(findProperty.read(onRemoveQueueItem().getAudioAttributesCompatParcelizer()));
                setImageDisplayMode setimagedisplaymode2 = this.write;
                long jWrite = (setimagedisplaymode2 == null || (isabstractMediaBrowserCompatCustomActionResultReceiver4 = setimagedisplaymode2.MediaBrowserCompatCustomActionResultReceiver()) == null) ? getReferencedType.INSTANCE.write() : isabstractMediaBrowserCompatCustomActionResultReceiver4.IconCompatParcelizer(read(true));
                setImageDisplayMode setimagedisplaymode3 = this.write;
                long jWrite2 = (setimagedisplaymode3 == null || (isabstractMediaBrowserCompatCustomActionResultReceiver3 = setimagedisplaymode3.MediaBrowserCompatCustomActionResultReceiver()) == null) ? getReferencedType.INSTANCE.write() : isabstractMediaBrowserCompatCustomActionResultReceiver3.IconCompatParcelizer(read(false));
                setImageDisplayMode setimagedisplaymode4 = this.write;
                float fIntBitsToFloat2 = BitmapDescriptorFactory.HUE_RED;
                if (setimagedisplaymode4 == null || (isabstractMediaBrowserCompatCustomActionResultReceiver2 = setimagedisplaymode4.MediaBrowserCompatCustomActionResultReceiver()) == null) {
                    j = jWrite2;
                    fIntBitsToFloat = 0.0f;
                } else {
                    hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
                    j = jWrite2;
                    long j2 = -1;
                    fIntBitsToFloat = Float.intBitsToFloat((int) isabstractMediaBrowserCompatCustomActionResultReceiver2.IconCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits((hasstableidsAudioAttributesImplApi26Parcelizer == null || (audioAttributesCompatParcelizer2 = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) == null || (writableTypeIdInclusionIconCompatParcelizer2 = audioAttributesCompatParcelizer2.IconCompatParcelizer(iRemoteActionCompatParcelizer)) == null) ? 0.0f : writableTypeIdInclusionIconCompatParcelizer2.getRemoteActionCompatParcelizer()))) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32))));
                }
                setImageDisplayMode setimagedisplaymode5 = this.write;
                if (setimagedisplaymode5 != null && (isabstractMediaBrowserCompatCustomActionResultReceiver = setimagedisplaymode5.MediaBrowserCompatCustomActionResultReceiver()) != null) {
                    hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer2 = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
                    long j3 = -1;
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) isabstractMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits((hasstableidsAudioAttributesImplApi26Parcelizer2 == null || (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer2.getAudioAttributesCompatParcelizer()) == null || (writableTypeIdInclusionIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer(iRemoteActionCompatParcelizer2)) == null) ? 0.0f : writableTypeIdInclusionIconCompatParcelizer.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))))));
                }
                int i = (int) (jWrite >> 32);
                int i2 = (int) (j >> 32);
                return new WritableTypeIdInclusion(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat((int) jWrite), Float.intBitsToFloat((int) j)) + (assignParameter.IconCompatParcelizer(25.0f) * setimagedisplaymode.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer().getRead()));
            }
        }
        return WritableTypeIdInclusion.INSTANCE.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long RemoteActionCompatParcelizer(hasValueTypeDeserializer p0, long p1, boolean p2, boolean p3, getModelCountBuiltSoFar p4, boolean p5) {
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer;
        depositSchemaProperty depositschemaproperty;
        int i;
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode == null || (hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer()) == null) {
            return findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        }
        long jWrite = getValueInstantiator.write(this.IconCompatParcelizer.RemoteActionCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(p0.getAudioAttributesCompatParcelizer())), this.IconCompatParcelizer.RemoteActionCompatParcelizer(findProperty.read(p0.getAudioAttributesCompatParcelizer())));
        boolean z = false;
        int iRemoteActionCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(p1, false);
        int iAudioAttributesImplBaseParcelizer = (p3 || p2) ? iRemoteActionCompatParcelizer : findProperty.AudioAttributesImplBaseParcelizer(jWrite);
        int i2 = (!p3 || p2) ? iRemoteActionCompatParcelizer : findProperty.read(jWrite);
        setStagedModel setstagedmodel = this.onMediaButtonEvent;
        int i3 = -1;
        if (!p2 && setstagedmodel != null && (i = this.onFastForward) != -1) {
            i3 = i;
        }
        setStagedModel setstagedmodelIconCompatParcelizer = setSpanCount.IconCompatParcelizer(hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer(), iAudioAttributesImplBaseParcelizer, i2, i3, jWrite, p2, p3);
        if (!setstagedmodelIconCompatParcelizer.IconCompatParcelizer(setstagedmodel)) {
            return p0.getAudioAttributesCompatParcelizer();
        }
        this.onMediaButtonEvent = setstagedmodelIconCompatParcelizer;
        this.onFastForward = iRemoteActionCompatParcelizer;
        getFirstIndexOfModelInBuildingList getfirstindexofmodelinbuildinglistAudioAttributesCompatParcelizer = p4.AudioAttributesCompatParcelizer(setstagedmodelIconCompatParcelizer);
        long jWrite2 = getValueInstantiator.write(this.IconCompatParcelizer.write(getfirstindexofmodelinbuildinglistAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().getRead()), this.IconCompatParcelizer.write(getfirstindexofmodelinbuildinglistAudioAttributesCompatParcelizer.getIconCompatParcelizer().getRead()));
        if (findProperty.IconCompatParcelizer(jWrite2, p0.getAudioAttributesCompatParcelizer())) {
            return p0.getAudioAttributesCompatParcelizer();
        }
        boolean z2 = findProperty.AudioAttributesImplApi21Parcelizer(jWrite2) != findProperty.AudioAttributesImplApi21Parcelizer(p0.getAudioAttributesCompatParcelizer()) && findProperty.IconCompatParcelizer(getValueInstantiator.write(findProperty.read(jWrite2), findProperty.AudioAttributesImplBaseParcelizer(jWrite2)), p0.getAudioAttributesCompatParcelizer());
        boolean z3 = findProperty.write(jWrite2) && findProperty.write(p0.getAudioAttributesCompatParcelizer());
        if (p5 && p0.AudioAttributesCompatParcelizer().length() > 0 && !z2 && !z3 && (depositschemaproperty = this.MediaDescriptionCompat) != null) {
            depositschemaproperty.AudioAttributesCompatParcelizer(isNonStaticInnerClass.INSTANCE.AudioAttributesImplApi21Parcelizer());
        }
        this.read.invoke(write(p0.getRead(), jWrite2));
        this.onPlayFromSearch = findProperty.AudioAttributesCompatParcelizer(jWrite2);
        if (!p5) {
            MediaBrowserCompatMediaItem(!findProperty.write(jWrite2));
        }
        setImageDisplayMode setimagedisplaymode2 = this.write;
        if (setimagedisplaymode2 != null) {
            setimagedisplaymode2.write(p5);
        }
        setImageDisplayMode setimagedisplaymode3 = this.write;
        if (setimagedisplaymode3 != null) {
            setimagedisplaymode3.AudioAttributesImplApi21Parcelizer(!findProperty.write(jWrite2) && setApplyingOpacityToLayersEnabled.IconCompatParcelizer(this, true));
        }
        setImageDisplayMode setimagedisplaymode4 = this.write;
        if (setimagedisplaymode4 != null) {
            setimagedisplaymode4.MediaBrowserCompatItemReceiver(!findProperty.write(jWrite2) && setApplyingOpacityToLayersEnabled.IconCompatParcelizer(this, false));
        }
        setImageDisplayMode setimagedisplaymode5 = this.write;
        if (setimagedisplaymode5 != null) {
            if (findProperty.write(jWrite2) && setApplyingOpacityToLayersEnabled.IconCompatParcelizer(this, true)) {
                z = true;
            }
            setimagedisplaymode5.AudioAttributesCompatParcelizer(z);
        }
        return jWrite2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(lambdaonImageAvailable1androidxmedia3uiPlayerView p0) {
        setImageDisplayMode setimagedisplaymode = this.write;
        if (setimagedisplaymode != null) {
            if (setimagedisplaymode.IconCompatParcelizer() == p0) {
                setimagedisplaymode = null;
            }
            if (setimagedisplaymode != null) {
                setimagedisplaymode.write(p0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hasValueTypeDeserializer write(AbstractDeserializer p0, long p1) {
        return new hasValueTypeDeserializer(p0, p1, (findProperty) null, 4, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        findNullKeySerializer findnullkeyserializer;
        return onSetPlaybackSpeed() && !onSkipToPrevious() && (findnullkeyserializer = this.MediaBrowserCompatItemReceiver) != null && setStableInsets.RemoteActionCompatParcelizer(findnullkeyserializer);
    }

    public final boolean write() {
        findNullKeySerializer findnullkeyserializer;
        return onCustomAction() && onSetCaptioningEnabled() && (findnullkeyserializer = this.MediaBrowserCompatItemReceiver) != null && setStableInsets.write(findnullkeyserializer);
    }

    public final boolean IconCompatParcelizer() {
        findNullKeySerializer findnullkeyserializer;
        return onSetPlaybackSpeed() && onCustomAction() && !onSkipToPrevious() && (findnullkeyserializer = this.MediaBrowserCompatItemReceiver) != null && setStableInsets.RemoteActionCompatParcelizer(findnullkeyserializer);
    }

    public final AbstractDeserializer IconCompatParcelizer(boolean p0) {
        if (!onSetPlaybackSpeed() || onSkipToPrevious()) {
            return null;
        }
        AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer = _with.RemoteActionCompatParcelizer(onRemoveQueueItem());
        if (!p0) {
            return abstractDeserializerRemoteActionCompatParcelizer;
        }
        int iAudioAttributesImplApi26Parcelizer = findProperty.AudioAttributesImplApi26Parcelizer(onRemoveQueueItem().getAudioAttributesCompatParcelizer());
        this.read.invoke(write(onRemoveQueueItem().getRead(), getValueInstantiator.write(iAudioAttributesImplApi26Parcelizer, iAudioAttributesImplApi26Parcelizer)));
        read(lambdaonImageAvailable1androidxmedia3uiPlayerView.IconCompatParcelizer);
        return abstractDeserializerRemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(AbstractDeserializer p0) {
        if (onCustomAction()) {
            AbstractDeserializer abstractDeserializerAudioAttributesCompatParcelizer = _with.read(onRemoveQueueItem(), onRemoveQueueItem().AudioAttributesCompatParcelizer().length()).AudioAttributesCompatParcelizer(p0).AudioAttributesCompatParcelizer(_with.IconCompatParcelizer(onRemoveQueueItem(), onRemoveQueueItem().AudioAttributesCompatParcelizer().length()));
            int iMediaBrowserCompatCustomActionResultReceiver = findProperty.MediaBrowserCompatCustomActionResultReceiver(onRemoveQueueItem().getAudioAttributesCompatParcelizer()) + p0.length();
            this.read.invoke(write(abstractDeserializerAudioAttributesCompatParcelizer, getValueInstantiator.write(iMediaBrowserCompatCustomActionResultReceiver, iMediaBrowserCompatCustomActionResultReceiver)));
            read(lambdaonImageAvailable1androidxmedia3uiPlayerView.IconCompatParcelizer);
            setStateRestorationPolicy setstaterestorationpolicy = this.AudioAttributesCompatParcelizer;
            if (setstaterestorationpolicy != null) {
                setstaterestorationpolicy.write();
            }
        }
    }

    public final AbstractDeserializer AudioAttributesImplBaseParcelizer() {
        if (!onSetPlaybackSpeed() || !onCustomAction() || onSkipToPrevious()) {
            return null;
        }
        AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer = _with.RemoteActionCompatParcelizer(onRemoveQueueItem());
        AbstractDeserializer abstractDeserializerAudioAttributesCompatParcelizer = _with.read(onRemoveQueueItem(), onRemoveQueueItem().AudioAttributesCompatParcelizer().length()).AudioAttributesCompatParcelizer(_with.IconCompatParcelizer(onRemoveQueueItem(), onRemoveQueueItem().AudioAttributesCompatParcelizer().length()));
        int iMediaBrowserCompatCustomActionResultReceiver = findProperty.MediaBrowserCompatCustomActionResultReceiver(onRemoveQueueItem().getAudioAttributesCompatParcelizer());
        this.read.invoke(write(abstractDeserializerAudioAttributesCompatParcelizer, getValueInstantiator.write(iMediaBrowserCompatCustomActionResultReceiver, iMediaBrowserCompatCustomActionResultReceiver)));
        read(lambdaonImageAvailable1androidxmedia3uiPlayerView.IconCompatParcelizer);
        setStateRestorationPolicy setstaterestorationpolicy = this.AudioAttributesCompatParcelizer;
        if (setstaterestorationpolicy != null) {
            setstaterestorationpolicy.write();
        }
        return abstractDeserializerRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Typed3EpoxyController() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
