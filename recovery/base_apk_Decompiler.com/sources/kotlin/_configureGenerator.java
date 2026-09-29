package kotlin;

import android.view.View;
import kotlin.Metadata;
import kotlin._parser;
import kotlin._reportMissingSetter;
import kotlin.deserializeAndSet;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000 \t2\u00020\u0001:\u0002\t\u0010J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011H&¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\u0015J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0016H&¢\u0006\u0004\b\u0013\u0010\u0017J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\u0018JE\u0010\u000f\u001a\u00020\u001d2\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\b0\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u000f\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020!H&¢\u0006\u0004\b\u0010\u0010\"J\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020!H&¢\u0006\u0004\b\u000f\u0010\"J\u001b\u0010\u000f\u001a\u00020\b2\n\u0010\u0003\u001a\u00060#j\u0002`$H&¢\u0006\u0004\b\u000f\u0010%J\u001d\u0010\u0010\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH&¢\u0006\u0004\b\u0010\u0010&J\u000f\u0010'\u001a\u00020\bH&¢\u0006\u0004\b'\u0010 J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020(H&¢\u0006\u0004\b\u000f\u0010)J4\u0010\u000b\u001a\u00020,2\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+\u0012\u0006\u0012\u0004\u0018\u00010-0\u0019H¦@¢\u0006\u0004\b\u000b\u0010.J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020/H&¢\u0006\u0004\b\u000b\u00100J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0011H&¢\u0006\u0004\b\u000f\u00101R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u0010\u000f\u001a\u0002048'X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u0002078'X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020:8'X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010\u0010\u001a\u00020=8'X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010\u0014\u001a\u00020@8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010AR\u0014\u0010D\u001a\u00020B8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010CR\u0014\u0010\r\u001a\u00020E8'X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010>\u001a\u00020H8'X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8'X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010P\u001a\u0004\u0018\u00010N8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010OR\u0016\u0010F\u001a\u0004\u0018\u00010Q8'X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010RR\u0014\u0010U\u001a\u00020S8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010TR\u0014\u0010Y\u001a\u00020V8'X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8'X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u00108\u001a\u00020^8'X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8'X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010g\u001a\u00020e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010fR\u0014\u0010k\u001a\u00020h8'X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010;\u001a\u00020l8'X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020o8'X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u00102\u001a\u00020s8'X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010tR\u0014\u0010m\u001a\u00020u8'X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010vR\u0014\u0010p\u001a\u00020w8'X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010xR\u001c\u0010_\u001a\u00020\u00048'@'X¦\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010\u0015R\u0014\u0010b\u001a\u00020|8'X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8'X¦\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u00105\u001a\u00030\u0082\u00018'X¦\u0004¢\u0006\u0007\u001a\u0005\bd\u0010\u0083\u0001R\u0017\u0010W\u001a\u00030\u0084\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010[\u001a\u00030\u0087\u00018WX\u0096\u0004¢\u0006\u0007\u001a\u0005\br\u0010\u0088\u0001R\u0016\u0010'\u001a\u00030\u0089\u00018'X¦\u0004¢\u0006\u0007\u001a\u0005\bU\u0010\u008a\u0001R\u0018\u0010\u001f\u001a\u0005\u0018\u00010\u008b\u00018WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bk\u0010\u008c\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_configureGenerator;", "Lo/handleWeirdKey;", "Lo/_assertNotNull;", "p0", "", "p1", "p2", "p3", "", "RemoteActionCompatParcelizer", "(Lo/_assertNotNull;ZZZ)V", "write", "(Lo/_assertNotNull;ZZ)V", "AudioAttributesImplApi21Parcelizer", "(Lo/_assertNotNull;)V", "read", "IconCompatParcelizer", "Lo/getReferencedType;", "(J)J", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "(Z)V", "Lo/PropertyValueAny;", "(Lo/_assertNotNull;J)V", "(Lo/_assertNotNull;Z)V", "Lkotlin/Function2;", "Lo/JsonParserDelegate;", "Lo/hasAnyGetter;", "Lkotlin/Function0;", "Lo/_reportUnkownFormat;", "(Lo/MagicModuleSubmissionRequestBody;Lo/getCreatedOnDateMs;Lo/hasAnyGetter;)Lo/_reportUnkownFormat;", "onPrepareFromUri", "()V", "", "(Lo/_assertNotNull;I)V", "Landroid/view/View;", "Lo/write;", "(Landroid/view/View;)V", "(Lo/getCreatedOnDateMs;)V", "onSeekTo", "Lo/_configureGenerator$IconCompatParcelizer;", "(Lo/_configureGenerator$IconCompatParcelizer;)V", "Lo/typing;", "Lo/SampleVideos;", "", "", "(Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "", "(F)V", "(J)V", "onFastForward", "()Lo/_assertNotNull;", "Lo/_readMapAndClose;", "onPrepareFromMediaId", "()Lo/_readMapAndClose;", "Lo/depositSchemaProperty;", "onAddQueueItem", "()Lo/depositSchemaProperty;", "Lo/getMember;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/getMember;", "Lo/findValueSerializer;", "MediaBrowserCompatItemReceiver", "()Lo/findValueSerializer;", "Lo/findNullKeySerializer;", "()Lo/findNullKeySerializer;", "Lo/internSimpleName;", "()Lo/internSimpleName;", "AudioAttributesImplBaseParcelizer", "Lo/buf;", "MediaMetadataCompat", "()Lo/buf;", "Lo/getHandlerInstantiator;", "onRewind", "()Lo/getHandlerInstantiator;", "Lo/_writeGenericEscape;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/_writeGenericEscape;", "Lo/_handleLongCustomEscape;", "()Lo/_handleLongCustomEscape;", "RatingCompat", "Lo/_writeCustomStringSegment2;", "()Lo/_writeCustomStringSegment2;", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "MediaBrowserCompatSearchResultReceiver", "Lo/setViews;", "onPlayFromUri", "()Lo/setViews;", "MediaDescriptionCompat", "Lo/BaseSettings;", "onPlayFromSearch", "()Lo/BaseSettings;", "MediaBrowserCompatMediaItem", "Lo/findContextualValueDeserializer;", "onMediaButtonEvent", "()Lo/findContextualValueDeserializer;", "Lo/typeIdResolverInstance;", "onPrepareFromSearch", "()Lo/typeIdResolverInstance;", "onCustomAction", "Lo/nukeSymbols;", "()Lo/nukeSymbols;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/ConfigFeature;", "onRemoveQueueItemAt", "()Lo/ConfigFeature;", "onCommand", "Lo/timesTwoToThe;", "onPlayFromMediaId", "()Lo/timesTwoToThe;", "Lo/getAttributes;", "onPlay", "()Lo/getAttributes;", "onPause", "Lo/deserializeAndSet$RemoteActionCompatParcelizer;", "()Lo/deserializeAndSet$RemoteActionCompatParcelizer;", "Lo/_reportMissingSetter$write;", "()Lo/_reportMissingSetter$write;", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "Lo/CoercionConfig;", "onRemoveQueueItem", "()Lo/CoercionConfig;", "Lo/PropertyMetadata;", "onPrepare", "()Lo/PropertyMetadata;", "Lo/isEmpty;", "()Lo/isEmpty;", "Lo/CurrentQuery;", "getCoroutineContext", "()Lo/CurrentQuery;", "Lo/_parser$IconCompatParcelizer;", "()Lo/_parser$IconCompatParcelizer;", "Lo/_decodeUtf8_3fast;", "()Lo/_decodeUtf8_3fast;", "Lo/_new;", "()Lo/_new;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _configureGenerator extends handleWeirdKey {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_configureGenerator$IconCompatParcelizer;", "", "", "s_", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface IconCompatParcelizer {
        void s_();
    }

    long AudioAttributesCompatParcelizer(long p0);

    internSimpleName AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(_assertNotNull p0);

    void AudioAttributesCompatParcelizer(_assertNotNull p0, long p1);

    bufferMapProperty AudioAttributesImplApi21Parcelizer();

    void AudioAttributesImplApi21Parcelizer(_assertNotNull p0);

    findNullKeySerializer AudioAttributesImplApi26Parcelizer();

    void AudioAttributesImplApi26Parcelizer(_assertNotNull p0);

    _writeCustomStringSegment2 AudioAttributesImplBaseParcelizer();

    void IconCompatParcelizer(_assertNotNull p0);

    default void IconCompatParcelizer(_assertNotNull p0, int p1) {
    }

    void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0);

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver */
    _writeGenericEscape getOnCommand();

    findValueSerializer MediaBrowserCompatItemReceiver();

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem */
    nukeSymbols getOnPlayFromSearch();

    _decodeUtf8_3fast MediaBrowserCompatSearchResultReceiver();

    getMember MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

    _reportMissingSetter.write MediaDescriptionCompat();

    /* JADX INFO: renamed from: MediaMetadataCompat */
    buf getOnSetCaptioningEnabled();

    /* JADX INFO: renamed from: RatingCompat */
    deserializeAndSet.RemoteActionCompatParcelizer getOnSeekTo();

    _handleLongCustomEscape RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(_assertNotNull p0);

    void RemoteActionCompatParcelizer(_assertNotNull p0, boolean p1);

    void RemoteActionCompatParcelizer(_assertNotNull p0, boolean p1, boolean p2, boolean p3);

    void RemoteActionCompatParcelizer(boolean p0);

    CurrentQuery getCoroutineContext();

    boolean getShowLayoutBounds();

    tryToResolveUnresolved handleMediaPlayPauseIfPendingOnHandler();

    /* JADX INFO: renamed from: onAddQueueItem */
    depositSchemaProperty getOnSetRepeatMode();

    default _new onCommand() {
        return null;
    }

    /* JADX INFO: renamed from: onCustomAction */
    isEmpty getR8lambdaKUbBm7ckfqTc9QCgukC86fguu4();

    /* JADX INFO: renamed from: onFastForward */
    _assertNotNull getAddMenuProvider();

    /* JADX INFO: renamed from: onMediaButtonEvent */
    findContextualValueDeserializer get_init_lambda4();

    /* JADX INFO: renamed from: onPlay */
    getAttributes getAddObserverForBackInvokerlambda7();

    /* JADX INFO: renamed from: onPlayFromMediaId */
    timesTwoToThe getAddObserverForBackInvoker();

    /* JADX INFO: renamed from: onPlayFromSearch */
    BaseSettings getAddOnConfigurationChangedListener();

    /* JADX INFO: renamed from: onPlayFromUri */
    setViews getGetDefaultViewModelProviderFactory();

    /* JADX INFO: renamed from: onPrepare */
    PropertyMetadata getAddOnNewIntentListener();

    /* JADX INFO: renamed from: onPrepareFromMediaId */
    _readMapAndClose getAddOnMultiWindowModeChangedListener();

    /* JADX INFO: renamed from: onPrepareFromSearch */
    typeIdResolverInstance getAddContentView();

    void onPrepareFromUri();

    /* JADX INFO: renamed from: onRemoveQueueItem */
    CoercionConfig getGetLastCustomNonConfigurationInstance();

    ConfigFeature onRemoveQueueItemAt();

    /* JADX INFO: renamed from: onRewind */
    getHandlerInstantiator getAddOnUserLeaveHintListener();

    void onSeekTo();

    _reportUnkownFormat read(MagicModuleSubmissionRequestBody<? super JsonParserDelegate, ? super hasAnyGetter, getShowPopup> p0, getCreatedOnDateMs<getShowPopup> p1, hasAnyGetter p2);

    default void read(long p0) {
    }

    void read(View p0);

    void read(_assertNotNull p0);

    default void read(_assertNotNull p0, int p1) {
    }

    void read(IconCompatParcelizer p0);

    void setShowLayoutBounds(boolean z);

    long write(long p0);

    Object write(MagicModuleSubmissionRequestBody<? super typing, ? super SampleVideos<?>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<?> sampleVideos);

    default void write(float p0) {
    }

    void write(_assertNotNull p0);

    void write(_assertNotNull p0, boolean p1, boolean p2);

    static /* synthetic */ void RemoteActionCompatParcelizer$default(_configureGenerator _configuregenerator, _assertNotNull _assertnotnull, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        _configuregenerator.RemoteActionCompatParcelizer(_assertnotnull, z, z2, z3);
    }

    static /* synthetic */ void write$default(_configureGenerator _configuregenerator, _assertNotNull _assertnotnull, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        _configuregenerator.write(_assertnotnull, z, z2);
    }

    static /* synthetic */ void RemoteActionCompatParcelizer$default(_configureGenerator _configuregenerator, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        _configuregenerator.RemoteActionCompatParcelizer(z);
    }

    static /* synthetic */ void RemoteActionCompatParcelizer$default(_configureGenerator _configuregenerator, _assertNotNull _assertnotnull, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        _configuregenerator.RemoteActionCompatParcelizer(_assertnotnull, z);
    }

    static /* synthetic */ _reportUnkownFormat read$default(_configureGenerator _configuregenerator, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getCreatedOnDateMs getcreatedondatems, hasAnyGetter hasanygetter, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i & 4) != 0) {
            hasanygetter = null;
        }
        return _configuregenerator.read(magicModuleSubmissionRequestBody, getcreatedondatems, hasanygetter);
    }

    default _parser.IconCompatParcelizer onPause() {
        return fromUnexpectedIOE.IconCompatParcelizer(this);
    }

    /* JADX INFO: renamed from: o._configureGenerator$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u00020\u00048\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/_configureGenerator$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "read", "Z", "write", "()Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private static boolean AudioAttributesCompatParcelizer;

        private Companion() {
        }

        public final boolean write() {
            return AudioAttributesCompatParcelizer;
        }
    }
}
