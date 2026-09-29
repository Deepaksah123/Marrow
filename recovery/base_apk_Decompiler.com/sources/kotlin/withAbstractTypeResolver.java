package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.MapperBuilder;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR,\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR,\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR8\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR<\u0010\u001f\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR2\u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\u0018\u0010\rR2\u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b$\u0010\rR2\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0010\u0010\rR2\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\rR>\u0010,\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0*0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b!\u0010\rR2\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b-\u0010\rR2\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b\u001d\u0010\rR2\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b+\u0010\rR,\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u001f\u0010\rR2\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010\rR,\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b\n\u0010\rR&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000bR,\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\rR,\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u001a\u0010\rR,\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b1\u0010\rR,\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b%\u0010\rR,\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0015\u0010\rR,\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b)\u0010\rR,\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b2\u0010\rR&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b\u000e\u0010\rR,\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b0\u0010\rR,\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u000b\u001a\u0004\b3\u0010\rR,\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b4\u0010\rR,\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u000b\u001a\u0004\b\u0013\u0010\rR8\u0010!\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b,\u0010\r"}, d2 = {"Lo/withAbstractTypeResolver;", "", "<init>", "()V", "Lo/MapperConfig;", "Lo/defaultFeatures;", "Lkotlin/Function1;", "", "Lo/deserializeFromNumber;", "", "MediaBrowserCompatMediaItem", "Lo/MapperConfig;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/MapperConfig;", "read", "Lkotlin/Function0;", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "RemoteActionCompatParcelizer", "onAddQueueItem", "MediaMetadataCompat", "AudioAttributesCompatParcelizer", "Lkotlin/Function2;", "", "onPause", "onFastForward", "IconCompatParcelizer", "Lo/getReferencedType;", "Lo/SampleVideos;", "onPlayFromSearch", "onPlay", "write", "", "onPlayFromUri", "MediaBrowserCompatItemReceiver", "Lo/AbstractDeserializer;", "RatingCompat", "AudioAttributesImplApi21Parcelizer", "Lo/_writeStringSegment;", "onPrepare", "onMediaButtonEvent", "AudioAttributesImplApi26Parcelizer", "Lkotlin/Function3;", "onPrepareFromSearch", "AudioAttributesImplBaseParcelizer", "onPrepareFromMediaId", "onPrepareFromUri", "onRemoveQueueItemAt", "onCustomAction", "onCommand", "onPlayFromMediaId", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "", "Lo/getDefault;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withAbstractTypeResolver {
    public static final withAbstractTypeResolver INSTANCE = new withAbstractTypeResolver();

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getAnswerMap<List<deserializeFromNumber>, Boolean>>> read = new MapperConfig<>("GetTextLayoutResult", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> RemoteActionCompatParcelizer = new MapperConfig<>("OnClick", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> AudioAttributesCompatParcelizer = new MapperConfig<>("OnLongClick", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<MagicModuleSubmissionRequestBody<Float, Float, Boolean>>> IconCompatParcelizer = new MapperConfig<>("ScrollBy", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private static final MapperConfig<MagicModuleSubmissionRequestBody<getReferencedType, SampleVideos<? super getReferencedType>, Object>> write = new MapperConfig<>("ScrollByOffset", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getAnswerMap<Integer, Boolean>>> MediaBrowserCompatItemReceiver = new MapperConfig<>("ScrollToIndex", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getAnswerMap<AbstractDeserializer, Boolean>>> AudioAttributesImplApi21Parcelizer = new MapperConfig<>("OnAutofillText", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getAnswerMap<_writeStringSegment, Boolean>>> MediaBrowserCompatCustomActionResultReceiver = new MapperConfig<>("OnFillData", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getAnswerMap<Float, Boolean>>> AudioAttributesImplApi26Parcelizer = new MapperConfig<>("SetProgress", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getModuleData<Integer, Integer, Boolean, Boolean>>> AudioAttributesImplBaseParcelizer = new MapperConfig<>("SetSelection", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getAnswerMap<AbstractDeserializer, Boolean>>> MediaDescriptionCompat = new MapperConfig<>("SetText", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getAnswerMap<AbstractDeserializer, Boolean>>> MediaMetadataCompat = new MapperConfig<>("SetTextSubstitution", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getAnswerMap<Boolean, Boolean>>> MediaBrowserCompatSearchResultReceiver = new MapperConfig<>("ShowTextSubstitution", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> MediaBrowserCompatMediaItem = new MapperConfig<>("ClearTextSubstitution", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);
    private static final MapperConfig<defaultFeatures<getAnswerMap<AbstractDeserializer, Boolean>>> RatingCompat = new MapperConfig<>("InsertTextAtCursor", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onCommand = new MapperConfig<>("PerformImeAction", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onAddQueueItem = new MapperConfig<>("PerformImeAction", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onCustomAction = new MapperConfig<>("CopyText", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new MapperConfig<>("CutText", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> handleMediaPlayPauseIfPendingOnHandler = new MapperConfig<>("PasteText", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onPlay = new MapperConfig<>("Expand", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onPlayFromMediaId = new MapperConfig<>("Collapse", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onMediaButtonEvent = new MapperConfig<>("Dismiss", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onFastForward = new MapperConfig<>("RequestFocus", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private static final MapperConfig<List<getDefault>> onPause = new MapperConfig<>("CustomActions", true, AnonymousClass5.IconCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onPrepareFromMediaId = new MapperConfig<>("PageUp", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onPlayFromSearch = new MapperConfig<>("PageLeft", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onPrepare = new MapperConfig<>("PageDown", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onPrepareFromSearch = new MapperConfig<>("PageRight", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private static final MapperConfig<defaultFeatures<getAnswerMap<List<Float>, Boolean>>> onPlayFromUri = new MapperConfig<>("GetScrollViewportLength", true, MapperBuilder.Function.AudioAttributesCompatParcelizer, null, 8, null);
    public static final int IconCompatParcelizer = 8;

    private withAbstractTypeResolver() {
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<List<deserializeFromNumber>, Boolean>>> MediaBrowserCompatCustomActionResultReceiver() {
        return read;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> MediaBrowserCompatSearchResultReceiver() {
        return RemoteActionCompatParcelizer;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> MediaMetadataCompat() {
        return AudioAttributesCompatParcelizer;
    }

    public final MapperConfig<defaultFeatures<MagicModuleSubmissionRequestBody<Float, Float, Boolean>>> onFastForward() {
        return IconCompatParcelizer;
    }

    public final MapperConfig<MagicModuleSubmissionRequestBody<getReferencedType, SampleVideos<? super getReferencedType>, Object>> onPlay() {
        return write;
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<Integer, Boolean>>> onPause() {
        return MediaBrowserCompatItemReceiver;
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<AbstractDeserializer, Boolean>>> RatingCompat() {
        return AudioAttributesImplApi21Parcelizer;
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<_writeStringSegment, Boolean>>> MediaDescriptionCompat() {
        return MediaBrowserCompatCustomActionResultReceiver;
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<Float, Boolean>>> onMediaButtonEvent() {
        return AudioAttributesImplApi26Parcelizer;
    }

    public final MapperConfig<defaultFeatures<getModuleData<Integer, Integer, Boolean, Boolean>>> onPlayFromUri() {
        return AudioAttributesImplBaseParcelizer;
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<AbstractDeserializer, Boolean>>> onPrepareFromMediaId() {
        return MediaDescriptionCompat;
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<AbstractDeserializer, Boolean>>> onPlayFromSearch() {
        return MediaMetadataCompat;
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<Boolean, Boolean>>> onPrepareFromSearch() {
        return MediaBrowserCompatSearchResultReceiver;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> write() {
        return MediaBrowserCompatMediaItem;
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<AbstractDeserializer, Boolean>>> MediaBrowserCompatItemReceiver() {
        return RatingCompat;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> MediaBrowserCompatMediaItem() {
        return onCommand;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> RemoteActionCompatParcelizer() {
        return onCustomAction;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> IconCompatParcelizer() {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onCommand() {
        return handleMediaPlayPauseIfPendingOnHandler;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> AudioAttributesImplApi21Parcelizer() {
        return onPlay;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> AudioAttributesCompatParcelizer() {
        return onPlayFromMediaId;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> AudioAttributesImplApi26Parcelizer() {
        return onMediaButtonEvent;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onPlayFromMediaId() {
        return onFastForward;
    }

    public final MapperConfig<List<getDefault>> read() {
        return onPause;
    }

    /* JADX INFO: renamed from: o.withAbstractTypeResolver$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo/getDefault;", "p0", "p1", "IconCompatParcelizer", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<List<? extends getDefault>, List<? extends getDefault>, List<? extends getDefault>> {
        public static final AnonymousClass5 IconCompatParcelizer = new AnonymousClass5();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final List<getDefault> invoke(List<getDefault> list, List<getDefault> list2) {
            if (list == null) {
                list = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) list, (Iterable) list2);
        }

        AnonymousClass5() {
            super(2);
        }
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onCustomAction() {
        return onPrepareFromMediaId;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return onPlayFromSearch;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> handleMediaPlayPauseIfPendingOnHandler() {
        return onPrepare;
    }

    public final MapperConfig<defaultFeatures<getCreatedOnDateMs<Boolean>>> onAddQueueItem() {
        return onPrepareFromSearch;
    }

    public final MapperConfig<defaultFeatures<getAnswerMap<List<Float>, Boolean>>> AudioAttributesImplBaseParcelizer() {
        return onPlayFromUri;
    }
}
