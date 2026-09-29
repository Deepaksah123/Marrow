package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000f\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0011\u0010\nR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\nR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0010\u0010\nR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0016\u0010\nR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\nR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u001d\u0010\nR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b!\u0010\nR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b\u001e\u0010\nR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b$\u0010\nR \u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b%\u0010\nR \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b(\u0010\nR \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b*\u0010\nR \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b&\u0010\nR \u0010$\u001a\b\u0012\u0004\u0012\u00020-0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0012\u0010\nR \u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\nR \u0010*\u001a\b\u0012\u0004\u0012\u0002000\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b\u001a\u0010\nR \u0010)\u001a\b\u0012\u0004\u0012\u0002010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\b\u001a\u0004\b3\u0010\nR \u00105\u001a\b\u0012\u0004\u0012\u0002040\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b#\u0010\nR \u0010%\u001a\b\u0012\u0004\u0012\u0002040\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\b\u001a\u0004\b2\u0010\nR \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b7\u0010\nR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b)\u0010\nR \u00107\u001a\b\u0012\u0004\u0012\u0002080\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0014\u0010\nR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\b\u001a\u0004\b:\u0010\nR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b'\u0010\nR&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b9\u0010\nR \u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b\f\u0010\nR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\b\u001a\u0004\b5\u0010\nR \u0010=\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b/\u0010\nR \u0010>\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u0007\u0010\nR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020?0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\b\u001a\u0004\bA\u0010\nR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020B0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b+\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\b\u001a\u0004\b>\u0010\nR \u0010@\u001a\b\u0012\u0004\u0012\u00020C0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\b@\u0010\nR \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\b\u001a\u0004\b<\u0010\nR \u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u0018\u0010\nR,\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020F0E0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b\u001b\u0010\nR \u00109\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b,\u0010\nR \u00103\u001a\b\u0012\u0004\u0012\u00020F0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b \u0010\nR \u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\b\u001a\u0004\b=\u0010\n"}, d2 = {"Lo/_this;", "", "<init>", "()V", "Lo/MapperConfig;", "", "", "AudioAttributesImplApi26Parcelizer", "Lo/MapperConfig;", "IconCompatParcelizer", "()Lo/MapperConfig;", "write", "onSetShuffleMode", "onRemoveQueueItemAt", "Lo/hasValueInstantiators;", "onPlayFromUri", "AudioAttributesCompatParcelizer", "onPrepare", "RemoteActionCompatParcelizer", "", "onRemoveQueueItem", "onSeekTo", "read", "Lo/deserializerModifiers;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/deserializers;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "Lo/hasAbstractTypeResolvers;", "onPlayFromSearch", "onPrepareFromSearch", "", "RatingCompat", "onCommand", "onPause", "MediaBrowserCompatSearchResultReceiver", "onFastForward", "onPlayFromMediaId", "onCustomAction", "onAddQueueItem", "MediaDescriptionCompat", "handleMediaPlayPauseIfPendingOnHandler", "Lo/_writeQuotedInt;", "Lo/_writeQuotedRaw;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/_writeStringSegment;", "", "onSkipToPrevious", "setSessionImpl", "Lo/withAdditionalKeyDeserializers;", "onMediaButtonEvent", "onSkipToQueueItem", "onPlay", "Lo/keyDeserializers;", "onSetRating", "onSetPlaybackSpeed", "Lo/AbstractDeserializer;", "onPrepareFromMediaId", "onRewind", "onPrepareFromUri", "Lo/findProperty;", "onSetRepeatMode", "onSetCaptioningEnabled", "Lo/ResolvableDeserializer;", "Lo/MutableCoercionConfig;", "onStop", "Lkotlin/Function1;", "", "Lo/findAndAddVirtualProperties;", "onSkipToNext"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _this {
    public static final _this INSTANCE = new _this();

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private static final MapperConfig<List<String>> write = new MapperConfig<>("ContentDescription", true, AnonymousClass1.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private static final MapperConfig<String> IconCompatParcelizer = new MapperConfig<>("StateDescription", true);

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private static final MapperConfig<hasValueInstantiators> AudioAttributesCompatParcelizer = new MapperConfig<>("ProgressBarRangeInfo", true);

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private static final MapperConfig<String> RemoteActionCompatParcelizer = new MapperConfig<>("PaneTitle", true, AnonymousClass8.IconCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private static final MapperConfig<getShowPopup> read = new MapperConfig<>("SelectableGroup", true);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final MapperConfig<deserializerModifiers> MediaBrowserCompatCustomActionResultReceiver = new MapperConfig<>("CollectionInfo", true);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final MapperConfig<C0168deserializers> AudioAttributesImplApi21Parcelizer = new MapperConfig<>("CollectionItemInfo", true);

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private static final MapperConfig<getShowPopup> MediaBrowserCompatItemReceiver = new MapperConfig<>("Heading", true);

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private static final MapperConfig<getShowPopup> AudioAttributesImplBaseParcelizer = new MapperConfig<>("Disabled", true);

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private static final MapperConfig<hasAbstractTypeResolvers> AudioAttributesImplApi26Parcelizer = new MapperConfig<>("LiveRegion", true);

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private static final MapperConfig<Boolean> MediaMetadataCompat = new MapperConfig<>("Focused", true);

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private static final MapperConfig<Boolean> MediaBrowserCompatMediaItem = new MapperConfig<>("IsContainer", true);

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private static final MapperConfig<Boolean> MediaBrowserCompatSearchResultReceiver = new MapperConfig<>("IsTraversalGroup", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private static final MapperConfig<Boolean> RatingCompat = new MapperConfig<>("IsSensitiveData", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private static final MapperConfig<getShowPopup> MediaDescriptionCompat = new MapperConfig<>("InvisibleToUser", AnonymousClass10.read);

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private static final MapperConfig<getShowPopup> handleMediaPlayPauseIfPendingOnHandler = new MapperConfig<>("HideFromAccessibility", AnonymousClass5.AudioAttributesCompatParcelizer);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private static final MapperConfig<_writeQuotedInt> onCommand = new MapperConfig<>("ContentType", AnonymousClass2.read);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final MapperConfig<_writeQuotedRaw> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new MapperConfig<>("ContentDataType", AnonymousClass4.RemoteActionCompatParcelizer);

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private static final MapperConfig<_writeStringSegment> onAddQueueItem = new MapperConfig<>("FillableData", AnonymousClass3.IconCompatParcelizer);

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private static final MapperConfig<Float> onCustomAction = new MapperConfig<>("TraversalIndex", AnonymousClass14.read);

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private static final MapperConfig<withAdditionalKeyDeserializers> onMediaButtonEvent = new MapperConfig<>("HorizontalScrollAxisRange", true);

    /* JADX INFO: renamed from: onSkipToQueueItem, reason: from kotlin metadata */
    private static final MapperConfig<withAdditionalKeyDeserializers> onPause = new MapperConfig<>("VerticalScrollAxisRange", true);

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private static final MapperConfig<getShowPopup> onFastForward = new MapperConfig<>("IsPopup", true, AnonymousClass9.RemoteActionCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private static final MapperConfig<getShowPopup> onPlayFromMediaId = new MapperConfig<>("IsDialog", true, AnonymousClass7.write, null, 8, null);

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private static final MapperConfig<C0184keyDeserializers> onPlay = new MapperConfig<>("Role", true, AnonymousClass12.write, null, 8, null);

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private static final MapperConfig<String> onPlayFromSearch = new MapperConfig<>("TestTag", false, AnonymousClass15.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private static final MapperConfig<getShowPopup> onPrepareFromSearch = new MapperConfig<>("LinkTestMarker", false, AnonymousClass6.RemoteActionCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private static final MapperConfig<List<AbstractDeserializer>> onPrepare = new MapperConfig<>("Text", true, AnonymousClass11.write, null, 8, null);

    /* JADX INFO: renamed from: setSessionImpl, reason: from kotlin metadata */
    private static final MapperConfig<AbstractDeserializer> onPrepareFromMediaId = new MapperConfig<>("TextSubstitution", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private static final MapperConfig<Boolean> onPlayFromUri = new MapperConfig<>("IsShowingTextSubstitution", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private static final MapperConfig<AbstractDeserializer> onRewind = new MapperConfig<>("InputText", true);

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private static final MapperConfig<AbstractDeserializer> onPrepareFromUri = new MapperConfig<>("EditableText", true);

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private static final MapperConfig<findProperty> onRemoveQueueItem = new MapperConfig<>("TextSelectionRange", true);

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private static final MapperConfig<ResolvableDeserializer> onSeekTo = new MapperConfig<>("ImeAction", true);

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private static final MapperConfig<Boolean> onRemoveQueueItemAt = new MapperConfig<>("Selected", true);

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private static final MapperConfig<MutableCoercionConfig> onSetRepeatMode = new MapperConfig<>("ToggleableState", true);

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private static final MapperConfig<getShowPopup> onSetCaptioningEnabled = new MapperConfig<>("Password", true);

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private static final MapperConfig<String> onSetPlaybackSpeed = new MapperConfig<>("Error", true);

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private static final MapperConfig<getAnswerMap<Object, Integer>> onSetShuffleMode = new MapperConfig<>("IndexForKey", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private static final MapperConfig<Boolean> onSetRating = new MapperConfig<>("IsEditable", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private static final MapperConfig<Integer> setSessionImpl = new MapperConfig<>("MaxTextLength", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private static final MapperConfig<findAndAddVirtualProperties> onSkipToNext = new MapperConfig<>("Shape", false, AnonymousClass13.AudioAttributesCompatParcelizer, null, 8, null);
    public static final int read = 8;

    private _this() {
    }

    public final MapperConfig<List<String>> IconCompatParcelizer() {
        return write;
    }

    /* JADX INFO: renamed from: o._this$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "p0", "p1", "AudioAttributesCompatParcelizer", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final AnonymousClass1 AudioAttributesCompatParcelizer = new AnonymousClass1();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(List<String> list, List<String> list2) {
            if (list == null) {
                return list2;
            }
            List<String> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) list);
            listMediaBrowserCompatItemReceiver.addAll(list2);
            return listMediaBrowserCompatItemReceiver;
        }

        AnonymousClass1() {
            super(2);
        }
    }

    public final MapperConfig<String> onRemoveQueueItemAt() {
        return IconCompatParcelizer;
    }

    public final MapperConfig<hasValueInstantiators> onPlayFromUri() {
        return AudioAttributesCompatParcelizer;
    }

    public final MapperConfig<String> onPrepare() {
        return RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: o._this$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass8 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<String, String, String> {
        public static final AnonymousClass8 IconCompatParcelizer = new AnonymousClass8();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }

        AnonymousClass8() {
            super(2);
        }
    }

    public final MapperConfig<getShowPopup> onSeekTo() {
        return read;
    }

    public final MapperConfig<deserializerModifiers> AudioAttributesCompatParcelizer() {
        return MediaBrowserCompatCustomActionResultReceiver;
    }

    public final MapperConfig<C0168deserializers> read() {
        return AudioAttributesImplApi21Parcelizer;
    }

    public final MapperConfig<getShowPopup> MediaMetadataCompat() {
        return MediaBrowserCompatItemReceiver;
    }

    public final MapperConfig<getShowPopup> MediaBrowserCompatItemReceiver() {
        return AudioAttributesImplBaseParcelizer;
    }

    public final MapperConfig<hasAbstractTypeResolvers> onPrepareFromSearch() {
        return AudioAttributesImplApi26Parcelizer;
    }

    public final MapperConfig<Boolean> AudioAttributesImplBaseParcelizer() {
        return MediaMetadataCompat;
    }

    public final MapperConfig<Boolean> onCommand() {
        return MediaBrowserCompatMediaItem;
    }

    public final MapperConfig<Boolean> onPause() {
        return MediaBrowserCompatSearchResultReceiver;
    }

    public final MapperConfig<Boolean> onPlayFromMediaId() {
        return RatingCompat;
    }

    public final MapperConfig<getShowPopup> onAddQueueItem() {
        return MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: o._this$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "read", "(Lo/getShowPopup;Lo/getShowPopup;)Lo/getShowPopup;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass10 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<getShowPopup, getShowPopup, getShowPopup> {
        public static final AnonymousClass10 read = new AnonymousClass10();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final getShowPopup invoke(getShowPopup getshowpopup, getShowPopup getshowpopup2) {
            return getshowpopup;
        }

        AnonymousClass10() {
            super(2);
        }
    }

    public final MapperConfig<getShowPopup> MediaBrowserCompatSearchResultReceiver() {
        return handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: o._this$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "AudioAttributesCompatParcelizer", "(Lo/getShowPopup;Lo/getShowPopup;)Lo/getShowPopup;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<getShowPopup, getShowPopup, getShowPopup> {
        public static final AnonymousClass5 AudioAttributesCompatParcelizer = new AnonymousClass5();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final getShowPopup invoke(getShowPopup getshowpopup, getShowPopup getshowpopup2) {
            return getshowpopup;
        }

        AnonymousClass5() {
            super(2);
        }
    }

    public final MapperConfig<_writeQuotedInt> RemoteActionCompatParcelizer() {
        return onCommand;
    }

    /* JADX INFO: renamed from: o._this$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_writeQuotedInt;", "p0", "p1", "write", "(Lo/_writeQuotedInt;Lo/_writeQuotedInt;)Lo/_writeQuotedInt;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_writeQuotedInt, _writeQuotedInt, _writeQuotedInt> {
        public static final AnonymousClass2 read = new AnonymousClass2();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final _writeQuotedInt invoke(_writeQuotedInt _writequotedint, _writeQuotedInt _writequotedint2) {
            return _writequotedint;
        }

        AnonymousClass2() {
            super(2);
        }
    }

    public final MapperConfig<_writeQuotedRaw> write() {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: o._this$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_writeQuotedRaw;", "p0", "p1", "read", "(Lo/_writeQuotedRaw;Lo/_writeQuotedRaw;)Lo/_writeQuotedRaw;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_writeQuotedRaw, _writeQuotedRaw, _writeQuotedRaw> {
        public static final AnonymousClass4 RemoteActionCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final _writeQuotedRaw invoke(_writeQuotedRaw _writequotedraw, _writeQuotedRaw _writequotedraw2) {
            return _writequotedraw;
        }

        AnonymousClass4() {
            super(2);
        }
    }

    public final MapperConfig<_writeStringSegment> AudioAttributesImplApi21Parcelizer() {
        return onAddQueueItem;
    }

    /* JADX INFO: renamed from: o._this$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_writeStringSegment;", "p0", "p1", "RemoteActionCompatParcelizer", "(Lo/_writeStringSegment;Lo/_writeStringSegment;)Lo/_writeStringSegment;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_writeStringSegment, _writeStringSegment, _writeStringSegment> {
        public static final AnonymousClass3 IconCompatParcelizer = new AnonymousClass3();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _writeStringSegment invoke(_writeStringSegment _writestringsegment, _writeStringSegment _writestringsegment2) {
            return _writestringsegment;
        }

        AnonymousClass3() {
            super(2);
        }
    }

    public final MapperConfig<Float> setSessionImpl() {
        return onCustomAction;
    }

    /* JADX INFO: renamed from: o._this$14, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/Float;F)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass14 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<Float, Float, Float> {
        public static final AnonymousClass14 read = new AnonymousClass14();

        public final Float AudioAttributesCompatParcelizer(Float f, float f2) {
            return f;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Float invoke(Float f, Float f2) {
            return AudioAttributesCompatParcelizer(f, f2.floatValue());
        }

        AnonymousClass14() {
            super(2);
        }
    }

    public final MapperConfig<withAdditionalKeyDeserializers> RatingCompat() {
        return onMediaButtonEvent;
    }

    public final MapperConfig<withAdditionalKeyDeserializers> onSkipToPrevious() {
        return onPause;
    }

    public final MapperConfig<getShowPopup> onPlay() {
        return onFastForward;
    }

    /* JADX INFO: renamed from: o._this$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "RemoteActionCompatParcelizer", "(Lo/getShowPopup;Lo/getShowPopup;)Lo/getShowPopup;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass9 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<getShowPopup, getShowPopup, getShowPopup> {
        public static final AnonymousClass9 RemoteActionCompatParcelizer = new AnonymousClass9();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final getShowPopup invoke(getShowPopup getshowpopup, getShowPopup getshowpopup2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }

        AnonymousClass9() {
            super(2);
        }
    }

    public final MapperConfig<getShowPopup> onCustomAction() {
        return onPlayFromMediaId;
    }

    /* JADX INFO: renamed from: o._this$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "write", "(Lo/getShowPopup;Lo/getShowPopup;)Lo/getShowPopup;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass7 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<getShowPopup, getShowPopup, getShowPopup> {
        public static final AnonymousClass7 write = new AnonymousClass7();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final getShowPopup invoke(getShowPopup getshowpopup, getShowPopup getshowpopup2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }

        AnonymousClass7() {
            super(2);
        }
    }

    /* JADX INFO: renamed from: o._this$12, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/keyDeserializers;", "p0", "p1", "AudioAttributesCompatParcelizer", "(Lo/keyDeserializers;I)Lo/keyDeserializers;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass12 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<C0184keyDeserializers, C0184keyDeserializers, C0184keyDeserializers> {
        public static final AnonymousClass12 write = new AnonymousClass12();

        public final C0184keyDeserializers AudioAttributesCompatParcelizer(C0184keyDeserializers c0184keyDeserializers, int i) {
            return c0184keyDeserializers;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ C0184keyDeserializers invoke(C0184keyDeserializers c0184keyDeserializers, C0184keyDeserializers c0184keyDeserializers2) {
            return AudioAttributesCompatParcelizer(c0184keyDeserializers, c0184keyDeserializers2.getWrite());
        }

        AnonymousClass12() {
            super(2);
        }
    }

    public final MapperConfig<C0184keyDeserializers> onRemoveQueueItem() {
        return onPlay;
    }

    public final MapperConfig<String> onSetPlaybackSpeed() {
        return onPlayFromSearch;
    }

    /* JADX INFO: renamed from: o._this$15, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass15 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<String, String, String> {
        public static final AnonymousClass15 AudioAttributesCompatParcelizer = new AnonymousClass15();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }

        AnonymousClass15() {
            super(2);
        }
    }

    public final MapperConfig<getShowPopup> onFastForward() {
        return onPrepareFromSearch;
    }

    /* JADX INFO: renamed from: o._this$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "p1", "RemoteActionCompatParcelizer", "(Lo/getShowPopup;Lo/getShowPopup;)Lo/getShowPopup;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass6 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<getShowPopup, getShowPopup, getShowPopup> {
        public static final AnonymousClass6 RemoteActionCompatParcelizer = new AnonymousClass6();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final getShowPopup invoke(getShowPopup getshowpopup, getShowPopup getshowpopup2) {
            return getshowpopup;
        }

        AnonymousClass6() {
            super(2);
        }
    }

    public final MapperConfig<List<AbstractDeserializer>> onSetRating() {
        return onPrepare;
    }

    /* JADX INFO: renamed from: o._this$11, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo/AbstractDeserializer;", "p0", "p1", "IconCompatParcelizer", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass11 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<List<? extends AbstractDeserializer>, List<? extends AbstractDeserializer>, List<? extends AbstractDeserializer>> {
        public static final AnonymousClass11 write = new AnonymousClass11();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final List<AbstractDeserializer> invoke(List<AbstractDeserializer> list, List<AbstractDeserializer> list2) {
            if (list == null) {
                return list2;
            }
            List<AbstractDeserializer> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) list);
            listMediaBrowserCompatItemReceiver.addAll(list2);
            return listMediaBrowserCompatItemReceiver;
        }

        AnonymousClass11() {
            super(2);
        }
    }

    public final MapperConfig<AbstractDeserializer> onSetShuffleMode() {
        return onPrepareFromMediaId;
    }

    public final MapperConfig<Boolean> onMediaButtonEvent() {
        return onPlayFromUri;
    }

    public final MapperConfig<AbstractDeserializer> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return onRewind;
    }

    public final MapperConfig<AbstractDeserializer> AudioAttributesImplApi26Parcelizer() {
        return onPrepareFromUri;
    }

    public final MapperConfig<findProperty> onSetCaptioningEnabled() {
        return onRemoveQueueItem;
    }

    public final MapperConfig<ResolvableDeserializer> MediaDescriptionCompat() {
        return onSeekTo;
    }

    public final MapperConfig<Boolean> onPrepareFromUri() {
        return onRemoveQueueItemAt;
    }

    public final MapperConfig<MutableCoercionConfig> onSetRepeatMode() {
        return onSetRepeatMode;
    }

    public final MapperConfig<getShowPopup> onPrepareFromMediaId() {
        return onSetCaptioningEnabled;
    }

    public final MapperConfig<String> MediaBrowserCompatCustomActionResultReceiver() {
        return onSetPlaybackSpeed;
    }

    public final MapperConfig<getAnswerMap<Object, Integer>> MediaBrowserCompatMediaItem() {
        return onSetShuffleMode;
    }

    public final MapperConfig<Boolean> handleMediaPlayPauseIfPendingOnHandler() {
        return onSetRating;
    }

    public final MapperConfig<Integer> onPlayFromSearch() {
        return setSessionImpl;
    }

    public final MapperConfig<findAndAddVirtualProperties> onRewind() {
        return onSkipToNext;
    }

    /* JADX INFO: renamed from: o._this$13, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/findAndAddVirtualProperties;", "p0", "p1", "write", "(Lo/findAndAddVirtualProperties;Lo/findAndAddVirtualProperties;)Lo/findAndAddVirtualProperties;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass13 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<findAndAddVirtualProperties, findAndAddVirtualProperties, findAndAddVirtualProperties> {
        public static final AnonymousClass13 AudioAttributesCompatParcelizer = new AnonymousClass13();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final findAndAddVirtualProperties invoke(findAndAddVirtualProperties findandaddvirtualproperties, findAndAddVirtualProperties findandaddvirtualproperties2) {
            return findandaddvirtualproperties;
        }

        AnonymousClass13() {
            super(2);
        }
    }
}
