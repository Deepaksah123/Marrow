package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import coil.memory.MemoryCache;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Size;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import in.juspay.hyper.constants.LogCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.ShapeKt;
import kotlin.lambdasetRepeatMode3;
import kotlin.lambdasetShuffleModeEnabled4;
import kotlin.lambdaupdatePlaybackInfo15;
import kotlin.lambdaupdatePlaybackInfo18;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0004\u0080\u0001\u0081\u0001BË\u0002\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001c\u0010\u000e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00101\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000103\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\b\u00106\u001a\u0004\u0018\u000103\u0012\b\u00107\u001a\u0004\u0018\u000105\u0012\b\u00108\u001a\u0004\u0018\u000103\u0012\b\u00109\u001a\u0004\u0018\u000105\u0012\u0006\u0010:\u001a\u00020;\u0012\u0006\u0010<\u001a\u00020=¢\u0006\u0002\u0010>J\u0013\u0010y\u001a\u00020*2\b\u0010z\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010{\u001a\u000203H\u0016J\u0012\u0010|\u001a\u00020}2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010~\u001a\u00020\u007fH\u0016R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010+\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0011\u0010,\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u00100\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010U\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0010\u00107\u001a\u0004\u0018\u000105X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u0004\u0018\u000103X\u0082\u0004¢\u0006\u0004\n\u0002\u0010XR\u0013\u0010Y\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bZ\u0010WR\u0010\u00109\u001a\u0004\u0018\u000105X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00108\u001a\u0004\u0018\u000103X\u0082\u0004¢\u0006\u0004\n\u0002\u0010XR'\u0010\u000e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\be\u0010RR\u0011\u00101\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\bf\u0010RR\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0013\u0010i\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bj\u0010WR\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bk\u0010dR\u0012\u00102\u001a\u0004\u0018\u000103X\u0082\u0004¢\u0006\u0004\n\u0002\u0010XR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u0010-\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\bn\u0010@R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bw\u0010x¨\u0006\u0082\u0001"}, d2 = {"Lcoil/request/ImageRequest;", "", LogCategory.CONTEXT, "Landroid/content/Context;", "data", CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEM_CHILD_TARGET, "Lcoil/target/Target;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/request/ImageRequest$Listener;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "placeholderMemoryCacheKey", "colorSpace", "Landroid/graphics/ColorSpace;", "fetcher", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher;", "Ljava/lang/Class;", "decoder", "Lcoil/decode/Decoder;", "transformations", "", "Lcoil/transform/Transformation;", "headers", "Lokhttp3/Headers;", "parameters", "Lcoil/request/Parameters;", LogCategory.LIFECYCLE, "Landroidx/lifecycle/Lifecycle;", "sizeResolver", "Lcoil/size/SizeResolver;", "scale", "Lcoil/size/Scale;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "transition", "Lcoil/transition/Transition;", "precision", "Lcoil/size/Precision;", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "allowConversionToBitmap", "", "allowHardware", "allowRgb565", "premultipliedAlpha", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "placeholderResId", "", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "defined", "Lcoil/request/DefinedRequestOptions;", "defaults", "Lcoil/request/DefaultRequestOptions;", "(Landroid/content/Context;Ljava/lang/Object;Lcoil/target/Target;Lcoil/request/ImageRequest$Listener;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$Key;Landroid/graphics/ColorSpace;Lkotlin/Pair;Lcoil/decode/Decoder;Ljava/util/List;Lokhttp3/Headers;Lcoil/request/Parameters;Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZZZLcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Lcoil/request/DefinedRequestOptions;Lcoil/request/DefaultRequestOptions;)V", "getAllowConversionToBitmap", "()Z", "getAllowHardware", "getAllowRgb565", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/lang/Object;", "getDecoder", "()Lcoil/decode/Decoder;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "getDefined", "()Lcoil/request/DefinedRequestOptions;", "getDiskCachePolicy", "()Lcoil/request/CachePolicy;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "error", "getError", "()Landroid/graphics/drawable/Drawable;", "Ljava/lang/Integer;", "fallback", "getFallback", "getFetcher", "()Lkotlin/Pair;", "getHeaders", "()Lokhttp3/Headers;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getListener", "()Lcoil/request/ImageRequest$Listener;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "getMemoryCachePolicy", "getNetworkCachePolicy", "getParameters", "()Lcoil/request/Parameters;", "placeholder", "getPlaceholder", "getPlaceholderMemoryCacheKey", "getPrecision", "()Lcoil/size/Precision;", "getPremultipliedAlpha", "getScale", "()Lcoil/size/Scale;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "getTarget", "()Lcoil/target/Target;", "getTransformations", "()Ljava/util/List;", "getTransition", "()Lcoil/transition/Transition;", "equals", "other", "hashCode", "newBuilder", "Lcoil/request/ImageRequest$Builder;", "toString", "", "Builder", "Listener", "coil-base_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class lambdamaybeNotifySurfaceSizeChanged27 {
    private final Bitmap.Config AudioAttributesCompatParcelizer;
    private final getPeriodPositionUsAfterTimelineChanged AudioAttributesImplApi21Parcelizer;
    private final Object AudioAttributesImplApi26Parcelizer;
    private final ExoPlayerBuilderExternalSyntheticLambda21 AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final Context MediaBrowserCompatCustomActionResultReceiver;
    private final getCurrentPositionUsInternal MediaBrowserCompatItemReceiver;
    private final getPlatform MediaBrowserCompatMediaItem;
    private final Drawable MediaBrowserCompatSearchResultReceiver;
    private final RemoteActionCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final Integer MediaDescriptionCompat;
    private final getPlayWhenReadyChangeReason MediaMetadataCompat;
    private final Drawable RatingCompat;
    private final boolean RemoteActionCompatParcelizer;
    private final anyIgnorals handleMediaPlayPauseIfPendingOnHandler;
    private final Integer onAddQueueItem;
    private final Pair<ExoPlayerBuilderExternalSyntheticLambda9<?>, Class<?>> onCommand;
    private final ShapeKt onCustomAction;
    private final lambdasetShuffleModeEnabled4 onFastForward;
    private final Drawable onMediaButtonEvent;
    private final getPlayWhenReadyChangeReason onPause;
    private final getPlayWhenReadyChangeReason onPlay;
    private final MemoryCache.Key onPlayFromMediaId;
    private final MemoryCache.Key onPlayFromSearch;
    private final boolean onPlayFromUri;
    private final lambdaupdatePlaybackInfo16 onPrepare;
    private final Integer onPrepareFromMediaId;
    private final lambdaupdatePlaybackInfo13 onPrepareFromSearch;
    private final lambdaupdatePlaybackInfo15 onPrepareFromUri;
    private final lambdaupdatePlaybackInfo17 onRemoveQueueItemAt;
    private final List<lambdaupdatePlaybackInfo23> onRewind;
    private final maskWindowPositionMsOrGetPeriodPositionUs onSeekTo;
    private final boolean read;
    private final ColorSpace write;

    public interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Throwable th);

        void RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27);

        void RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, lambdasetRepeatMode3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

        void write(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private lambdamaybeNotifySurfaceSizeChanged27(Context context, Object obj, lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17, RemoteActionCompatParcelizer remoteActionCompatParcelizer, MemoryCache.Key key, MemoryCache.Key key2, ColorSpace colorSpace, Pair<? extends ExoPlayerBuilderExternalSyntheticLambda9<?>, ? extends Class<?>> pair, ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21, List<? extends lambdaupdatePlaybackInfo23> list, ShapeKt shapeKt, lambdasetShuffleModeEnabled4 lambdasetshufflemodeenabled4, anyIgnorals anyignorals, lambdaupdatePlaybackInfo15 lambdaupdateplaybackinfo15, lambdaupdatePlaybackInfo16 lambdaupdateplaybackinfo16, getPlatform getplatform, maskWindowPositionMsOrGetPeriodPositionUs maskwindowpositionmsorgetperiodpositionus, lambdaupdatePlaybackInfo13 lambdaupdateplaybackinfo13, Bitmap.Config config, boolean z, boolean z2, boolean z3, boolean z4, getPlayWhenReadyChangeReason getplaywhenreadychangereason, getPlayWhenReadyChangeReason getplaywhenreadychangereason2, getPlayWhenReadyChangeReason getplaywhenreadychangereason3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, getPeriodPositionUsAfterTimelineChanged getperiodpositionusaftertimelinechanged, getCurrentPositionUsInternal getcurrentpositionusinternal) {
        this.MediaBrowserCompatCustomActionResultReceiver = context;
        this.AudioAttributesImplApi26Parcelizer = obj;
        this.onRemoveQueueItemAt = lambdaupdateplaybackinfo17;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = remoteActionCompatParcelizer;
        this.onPlayFromMediaId = key;
        this.onPlayFromSearch = key2;
        this.write = colorSpace;
        this.onCommand = pair;
        this.AudioAttributesImplBaseParcelizer = exoPlayerBuilderExternalSyntheticLambda21;
        this.onRewind = list;
        this.onCustomAction = shapeKt;
        this.onFastForward = lambdasetshufflemodeenabled4;
        this.handleMediaPlayPauseIfPendingOnHandler = anyignorals;
        this.onPrepareFromUri = lambdaupdateplaybackinfo15;
        this.onPrepare = lambdaupdateplaybackinfo16;
        this.MediaBrowserCompatMediaItem = getplatform;
        this.onSeekTo = maskwindowpositionmsorgetperiodpositionus;
        this.onPrepareFromSearch = lambdaupdateplaybackinfo13;
        this.AudioAttributesCompatParcelizer = config;
        this.read = z;
        this.IconCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.onPlayFromUri = z4;
        this.onPause = getplaywhenreadychangereason;
        this.MediaMetadataCompat = getplaywhenreadychangereason2;
        this.onPlay = getplaywhenreadychangereason3;
        this.onPrepareFromMediaId = num;
        this.onMediaButtonEvent = drawable;
        this.MediaDescriptionCompat = num2;
        this.MediaBrowserCompatSearchResultReceiver = drawable2;
        this.onAddQueueItem = num3;
        this.RatingCompat = drawable3;
        this.AudioAttributesImplApi21Parcelizer = getperiodpositionusaftertimelinechanged;
        this.MediaBrowserCompatItemReceiver = getcurrentpositionusinternal;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final Context getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final Object getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
    public final lambdaupdatePlaybackInfo17 getOnRemoveQueueItemAt() {
        return this.onRemoveQueueItemAt;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final RemoteActionCompatParcelizer getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final MemoryCache.Key getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final MemoryCache.Key getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final ColorSpace getWrite() {
        return this.write;
    }

    public final Pair<ExoPlayerBuilderExternalSyntheticLambda9<?>, Class<?>> MediaBrowserCompatMediaItem() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final ExoPlayerBuilderExternalSyntheticLambda21 getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<lambdaupdatePlaybackInfo23> onPrepareFromSearch() {
        return this.onRewind;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final ShapeKt getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final lambdasetShuffleModeEnabled4 getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final anyIgnorals getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
    public final lambdaupdatePlaybackInfo15 getOnPrepareFromUri() {
        return this.onPrepareFromUri;
    }

    /* JADX INFO: renamed from: onPrepare, reason: from getter */
    public final lambdaupdatePlaybackInfo16 getOnPrepare() {
        return this.onPrepare;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final getPlatform getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from getter */
    public final maskWindowPositionMsOrGetPeriodPositionUs getOnSeekTo() {
        return this.onSeekTo;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final lambdaupdatePlaybackInfo13 getOnPrepareFromSearch() {
        return this.onPrepareFromSearch;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Bitmap.Config getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final boolean getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final getPlayWhenReadyChangeReason getOnPause() {
        return this.onPause;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final getPlayWhenReadyChangeReason getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final getPlayWhenReadyChangeReason getOnPlay() {
        return this.onPlay;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final getPeriodPositionUsAfterTimelineChanged getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final getCurrentPositionUsInternal getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final Drawable onFastForward() {
        return periodPositionUsToWindowPositionUs.IconCompatParcelizer(this, this.onMediaButtonEvent, this.onPrepareFromMediaId, this.MediaBrowserCompatItemReceiver.getAudioAttributesImplApi26Parcelizer());
    }

    public final Drawable MediaBrowserCompatSearchResultReceiver() {
        return periodPositionUsToWindowPositionUs.IconCompatParcelizer(this, this.MediaBrowserCompatSearchResultReceiver, this.MediaDescriptionCompat, this.MediaBrowserCompatItemReceiver.getAudioAttributesImplApi21Parcelizer());
    }

    public final Drawable MediaDescriptionCompat() {
        return periodPositionUsToWindowPositionUs.IconCompatParcelizer(this, this.RatingCompat, this.onAddQueueItem, this.MediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public read IconCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return new read(this, context);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof lambdamaybeNotifySurfaceSizeChanged27)) {
            return false;
        }
        lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27 = (lambdamaybeNotifySurfaceSizeChanged27) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, lambdamaybenotifysurfacesizechanged27.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, lambdamaybenotifysurfacesizechanged27.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onRemoveQueueItemAt, lambdamaybenotifysurfacesizechanged27.onRemoveQueueItemAt) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, lambdamaybenotifysurfacesizechanged27.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlayFromMediaId, lambdamaybenotifysurfacesizechanged27.onPlayFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlayFromSearch, lambdamaybenotifysurfacesizechanged27.onPlayFromSearch) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, lambdamaybenotifysurfacesizechanged27.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCommand, lambdamaybenotifysurfacesizechanged27.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, lambdamaybenotifysurfacesizechanged27.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onRewind, lambdamaybenotifysurfacesizechanged27.onRewind) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCustomAction, lambdamaybenotifysurfacesizechanged27.onCustomAction) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onFastForward, lambdamaybenotifysurfacesizechanged27.onFastForward) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, lambdamaybenotifysurfacesizechanged27.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPrepareFromUri, lambdamaybenotifysurfacesizechanged27.onPrepareFromUri) && this.onPrepare == lambdamaybenotifysurfacesizechanged27.onPrepare && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, lambdamaybenotifysurfacesizechanged27.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSeekTo, lambdamaybenotifysurfacesizechanged27.onSeekTo) && this.onPrepareFromSearch == lambdamaybenotifysurfacesizechanged27.onPrepareFromSearch && this.AudioAttributesCompatParcelizer == lambdamaybenotifysurfacesizechanged27.AudioAttributesCompatParcelizer && this.read == lambdamaybenotifysurfacesizechanged27.read && this.IconCompatParcelizer == lambdamaybenotifysurfacesizechanged27.IconCompatParcelizer && this.RemoteActionCompatParcelizer == lambdamaybenotifysurfacesizechanged27.RemoteActionCompatParcelizer && this.onPlayFromUri == lambdamaybenotifysurfacesizechanged27.onPlayFromUri && this.onPause == lambdamaybenotifysurfacesizechanged27.onPause && this.MediaMetadataCompat == lambdamaybenotifysurfacesizechanged27.MediaMetadataCompat && this.onPlay == lambdamaybenotifysurfacesizechanged27.onPlay && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPrepareFromMediaId, lambdamaybenotifysurfacesizechanged27.onPrepareFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onMediaButtonEvent, lambdamaybenotifysurfacesizechanged27.onMediaButtonEvent) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, lambdamaybenotifysurfacesizechanged27.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, lambdamaybenotifysurfacesizechanged27.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onAddQueueItem, lambdamaybenotifysurfacesizechanged27.onAddQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RatingCompat, lambdamaybenotifysurfacesizechanged27.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, lambdamaybenotifysurfacesizechanged27.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, lambdamaybenotifysurfacesizechanged27.MediaBrowserCompatItemReceiver);
    }

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        int iHashCode2 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17 = this.onRemoveQueueItemAt;
        int iHashCode3 = lambdaupdateplaybackinfo17 == null ? 0 : lambdaupdateplaybackinfo17.hashCode();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int iHashCode4 = remoteActionCompatParcelizer == null ? 0 : remoteActionCompatParcelizer.hashCode();
        MemoryCache.Key key = this.onPlayFromMediaId;
        int iHashCode5 = key == null ? 0 : key.hashCode();
        MemoryCache.Key key2 = this.onPlayFromSearch;
        int iHashCode6 = key2 == null ? 0 : key2.hashCode();
        ColorSpace colorSpace = this.write;
        int iHashCode7 = colorSpace == null ? 0 : colorSpace.hashCode();
        Pair<ExoPlayerBuilderExternalSyntheticLambda9<?>, Class<?>> pair = this.onCommand;
        int iHashCode8 = pair == null ? 0 : pair.hashCode();
        ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21 = this.AudioAttributesImplBaseParcelizer;
        int iHashCode9 = exoPlayerBuilderExternalSyntheticLambda21 == null ? 0 : exoPlayerBuilderExternalSyntheticLambda21.hashCode();
        int iHashCode10 = this.onRewind.hashCode();
        int iHashCode11 = this.onCustomAction.hashCode();
        int iHashCode12 = this.onFastForward.hashCode();
        int iHashCode13 = this.handleMediaPlayPauseIfPendingOnHandler.hashCode();
        int iHashCode14 = this.onPrepareFromUri.hashCode();
        int iHashCode15 = this.onPrepare.hashCode();
        int iHashCode16 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode17 = this.onSeekTo.hashCode();
        int iHashCode18 = this.onPrepareFromSearch.hashCode();
        int iHashCode19 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode20 = Boolean.hashCode(this.read);
        int iHashCode21 = Boolean.hashCode(this.IconCompatParcelizer);
        int iHashCode22 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode23 = Boolean.hashCode(this.onPlayFromUri);
        int iHashCode24 = this.onPause.hashCode();
        int iHashCode25 = this.MediaMetadataCompat.hashCode();
        int iHashCode26 = this.onPlay.hashCode();
        Integer num = this.onPrepareFromMediaId;
        int iIntValue = num == null ? 0 : num.intValue();
        Drawable drawable = this.onMediaButtonEvent;
        int iHashCode27 = drawable == null ? 0 : drawable.hashCode();
        Integer num2 = this.MediaDescriptionCompat;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Drawable drawable2 = this.MediaBrowserCompatSearchResultReceiver;
        int iHashCode28 = drawable2 == null ? 0 : drawable2.hashCode();
        Integer num3 = this.onAddQueueItem;
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Drawable drawable3 = this.RatingCompat;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iIntValue) * 31) + iHashCode27) * 31) + iIntValue2) * 31) + iHashCode28) * 31) + iIntValue3) * 31) + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageRequest(context=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", data=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", target=");
        sb.append(this.onRemoveQueueItemAt);
        sb.append(", listener=");
        sb.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        sb.append(", memoryCacheKey=");
        sb.append(this.onPlayFromMediaId);
        sb.append(", placeholderMemoryCacheKey=");
        sb.append(this.onPlayFromSearch);
        sb.append(", colorSpace=");
        sb.append(this.write);
        sb.append(", fetcher=");
        sb.append(this.onCommand);
        sb.append(", decoder=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", transformations=");
        sb.append(this.onRewind);
        sb.append(", headers=");
        sb.append(this.onCustomAction);
        sb.append(", parameters=");
        sb.append(this.onFastForward);
        sb.append(", lifecycle=");
        sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
        sb.append(", sizeResolver=");
        sb.append(this.onPrepareFromUri);
        sb.append(", scale=");
        sb.append(this.onPrepare);
        sb.append(", dispatcher=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", transition=");
        sb.append(this.onSeekTo);
        sb.append(", precision=");
        sb.append(this.onPrepareFromSearch);
        sb.append(", bitmapConfig=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", allowConversionToBitmap=");
        sb.append(this.read);
        sb.append(", allowHardware=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", allowRgb565=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", premultipliedAlpha=");
        sb.append(this.onPlayFromUri);
        sb.append(", memoryCachePolicy=");
        sb.append(this.onPause);
        sb.append(", diskCachePolicy=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", networkCachePolicy=");
        sb.append(this.onPlay);
        sb.append(", placeholderResId=");
        sb.append(this.onPrepareFromMediaId);
        sb.append(", placeholderDrawable=");
        sb.append(this.onMediaButtonEvent);
        sb.append(", errorResId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", errorDrawable=");
        sb.append(this.MediaBrowserCompatSearchResultReceiver);
        sb.append(", fallbackResId=");
        sb.append(this.onAddQueueItem);
        sb.append(", fallbackDrawable=");
        sb.append(this.RatingCompat);
        sb.append(", defined=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", defaults=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ lambdamaybeNotifySurfaceSizeChanged27(Context context, Object obj, lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17, RemoteActionCompatParcelizer remoteActionCompatParcelizer, MemoryCache.Key key, MemoryCache.Key key2, ColorSpace colorSpace, Pair pair, ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21, List list, ShapeKt shapeKt, lambdasetShuffleModeEnabled4 lambdasetshufflemodeenabled4, anyIgnorals anyignorals, lambdaupdatePlaybackInfo15 lambdaupdateplaybackinfo15, lambdaupdatePlaybackInfo16 lambdaupdateplaybackinfo16, getPlatform getplatform, maskWindowPositionMsOrGetPeriodPositionUs maskwindowpositionmsorgetperiodpositionus, lambdaupdatePlaybackInfo13 lambdaupdateplaybackinfo13, Bitmap.Config config, boolean z, boolean z2, boolean z3, boolean z4, getPlayWhenReadyChangeReason getplaywhenreadychangereason, getPlayWhenReadyChangeReason getplaywhenreadychangereason2, getPlayWhenReadyChangeReason getplaywhenreadychangereason3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, getPeriodPositionUsAfterTimelineChanged getperiodpositionusaftertimelinechanged, getCurrentPositionUsInternal getcurrentpositionusinternal, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, obj, lambdaupdateplaybackinfo17, remoteActionCompatParcelizer, key, key2, colorSpace, pair, exoPlayerBuilderExternalSyntheticLambda21, list, shapeKt, lambdasetshufflemodeenabled4, anyignorals, lambdaupdateplaybackinfo15, lambdaupdateplaybackinfo16, getplatform, maskwindowpositionmsorgetperiodpositionus, lambdaupdateplaybackinfo13, config, z, z2, z3, z4, getplaywhenreadychangereason, getplaywhenreadychangereason2, getplaywhenreadychangereason3, num, drawable, num2, drawable2, num3, drawable3, getperiodpositionusaftertimelinechanged, getcurrentpositionusinternal);
    }

    @Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0011\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u000b\u0010\u0017J\u000f\u0010\u000e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u000e\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018¢\u0006\u0004\b\u000e\u0010\u001dJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001e¢\u0006\u0004\b\u0011\u0010\u001fJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001a¢\u0006\u0004\b\u000b\u0010 J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020!¢\u0006\u0004\b\u0011\u0010\"J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u0011\u0010$J!\u0010\t\u001a\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%\"\u00020&¢\u0006\u0004\b\t\u0010'J\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020&0(¢\u0006\u0004\b\u000b\u0010)R\u0016\u0010\t\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0018\u0010\u0011\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0018\u0010\u000b\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0018\u0010\u0014\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010.R\u0018\u0010\u000e\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00100R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00106R\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u00108\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010=\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010DR,\u0010K\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030G\u0012\b\u0012\u0006\u0012\u0002\b\u00030H\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010I\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010P\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010SR\u0018\u0010M\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010;R\u0018\u0010Y\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010;R\u0018\u0010X\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010[R\u0018\u0010V\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010BR\u0018\u0010\\\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010UR\u0018\u0010^\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010DR\u0018\u0010a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010]\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010+R\u0018\u0010_\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010QR\u0018\u0010b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u0010g\u001a\b\u0012\u0004\u0012\u00020&0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010n"}, d2 = {"Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Lo/lambdamaybeNotifySurfaceSizeChanged27;", "p1", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Landroid/content/Context;)V", "RemoteActionCompatParcelizer", "()Lo/lambdamaybeNotifySurfaceSizeChanged27;", "read", "(Ljava/lang/Object;)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "Lo/getCurrentPositionUsInternal;", "write", "(Lo/getCurrentPositionUsInternal;)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "Lo/lambdaupdatePlaybackInfo13;", "AudioAttributesCompatParcelizer", "(Lo/lambdaupdatePlaybackInfo13;)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "", "IconCompatParcelizer", "()V", "Lo/anyIgnorals;", "()Lo/anyIgnorals;", "Lo/lambdaupdatePlaybackInfo16;", "()Lo/lambdaupdatePlaybackInfo16;", "Lo/lambdaupdatePlaybackInfo15;", "AudioAttributesImplApi26Parcelizer", "()Lo/lambdaupdatePlaybackInfo15;", "(Lo/lambdaupdatePlaybackInfo16;)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "Lcoil/size/Size;", "(Lcoil/size/Size;)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "(Lo/lambdaupdatePlaybackInfo15;)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "", "(II)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "Lo/lambdaupdatePlaybackInfo17;", "(Lo/lambdaupdatePlaybackInfo17;)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "", "Lo/lambdaupdatePlaybackInfo23;", "([Lo/lambdaupdatePlaybackInfo23;)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "", "(Ljava/util/List;)Lo/lambdamaybeNotifySurfaceSizeChanged27$read;", "", "Z", "Ljava/lang/Boolean;", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/ColorSpace;", "Landroid/graphics/ColorSpace;", "AudioAttributesImplApi21Parcelizer", "Landroid/content/Context;", "Ljava/lang/Object;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/ExoPlayerBuilderExternalSyntheticLambda21;", "Lo/ExoPlayerBuilderExternalSyntheticLambda21;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "Lo/getCurrentPositionUsInternal;", "Lo/getPlayWhenReadyChangeReason;", "Lo/getPlayWhenReadyChangeReason;", "Lo/getPlatform;", "MediaBrowserCompatSearchResultReceiver", "Lo/getPlatform;", "MediaMetadataCompat", "Landroid/graphics/drawable/Drawable;", "MediaBrowserCompatMediaItem", "Landroid/graphics/drawable/Drawable;", "RatingCompat", "Ljava/lang/Integer;", "MediaDescriptionCompat", "Lo/getSubscriptionExpiresOn;", "Lo/ExoPlayerBuilderExternalSyntheticLambda9;", "Ljava/lang/Class;", "onCustomAction", "Lo/getSubscriptionExpiresOn;", "onAddQueueItem", "Lo/ShapeKt$RemoteActionCompatParcelizer;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/ShapeKt$RemoteActionCompatParcelizer;", "onCommand", "handleMediaPlayPauseIfPendingOnHandler", "Lo/anyIgnorals;", "Lo/lambdamaybeNotifySurfaceSizeChanged27$RemoteActionCompatParcelizer;", "Lo/lambdamaybeNotifySurfaceSizeChanged27$RemoteActionCompatParcelizer;", "Lcoil/memory/MemoryCache$Key;", "Lcoil/memory/MemoryCache$Key;", "onMediaButtonEvent", "onPlay", "onPlayFromMediaId", "onFastForward", "Lo/lambdasetShuffleModeEnabled4$AudioAttributesCompatParcelizer;", "Lo/lambdasetShuffleModeEnabled4$AudioAttributesCompatParcelizer;", "onPause", "onPrepare", "onPrepareFromSearch", "onPrepareFromMediaId", "Lo/lambdaupdatePlaybackInfo13;", "onPlayFromSearch", "onPlayFromUri", "Lo/lambdaupdatePlaybackInfo16;", "onRemoveQueueItem", "Lo/lambdaupdatePlaybackInfo15;", "onSeekTo", "onPrepareFromUri", "onRemoveQueueItemAt", "onRewind", "Lo/lambdaupdatePlaybackInfo17;", "Ljava/util/List;", "Lo/maskWindowPositionMsOrGetPeriodPositionUs;", "onSetRepeatMode", "Lo/maskWindowPositionMsOrGetPeriodPositionUs;", "onSetRating"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class read {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private boolean RemoteActionCompatParcelizer;
        private final Context AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private Object MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private getCurrentPositionUsInternal AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private ColorSpace write;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private ExoPlayerBuilderExternalSyntheticLambda21 MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private getPlayWhenReadyChangeReason AudioAttributesImplBaseParcelizer;
        private Drawable MediaBrowserCompatMediaItem;

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
        private getPlatform MediaMetadataCompat;

        /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
        private ShapeKt.RemoteActionCompatParcelizer onCommand;

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private Drawable RatingCompat;

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
        private Integer MediaDescriptionCompat;

        /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
        private Integer MediaBrowserCompatSearchResultReceiver;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private Bitmap.Config IconCompatParcelizer;

        /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
        private anyIgnorals onCustomAction;

        /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
        private RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;

        /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
        private MemoryCache.Key MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

        /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
        private Pair<? extends ExoPlayerBuilderExternalSyntheticLambda9<?>, ? extends Class<?>> onAddQueueItem;

        /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
        private Drawable onMediaButtonEvent;

        /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
        private getPlayWhenReadyChangeReason onPlay;
        private MemoryCache.Key onPause;

        /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
        private lambdasetShuffleModeEnabled4.AudioAttributesCompatParcelizer onPlayFromMediaId;

        /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
        private getPlayWhenReadyChangeReason onFastForward;

        /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
        private boolean onPrepare;
        private lambdaupdatePlaybackInfo16 onPlayFromUri;

        /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
        private Integer onPrepareFromSearch;

        /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
        private lambdaupdatePlaybackInfo13 onPlayFromSearch;

        /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
        private anyIgnorals onPrepareFromMediaId;

        /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
        private lambdaupdatePlaybackInfo16 onRemoveQueueItemAt;

        /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
        private lambdaupdatePlaybackInfo15 onSeekTo;

        /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
        private List<? extends lambdaupdatePlaybackInfo23> onPrepareFromUri;
        private lambdaupdatePlaybackInfo17 onRewind;

        /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
        private lambdaupdatePlaybackInfo15 onRemoveQueueItem;

        /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
        private maskWindowPositionMsOrGetPeriodPositionUs onSetRating;
        private Boolean read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private Boolean AudioAttributesCompatParcelizer;

        public read(Context context) {
            toMagicModuleMetaRepoModel.write(context, "");
            this.AudioAttributesImplApi21Parcelizer = context;
            this.AudioAttributesImplApi26Parcelizer = getCurrentPositionUsInternal.write;
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            this.onRewind = null;
            this.handleMediaPlayPauseIfPendingOnHandler = null;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
            this.onPause = null;
            this.write = null;
            this.onAddQueueItem = null;
            this.MediaBrowserCompatItemReceiver = null;
            this.onPrepareFromUri = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            this.onCommand = null;
            this.onPlayFromMediaId = null;
            this.onCustomAction = null;
            this.onRemoveQueueItem = null;
            this.onRemoveQueueItemAt = null;
            this.MediaMetadataCompat = null;
            this.onSetRating = null;
            this.onPlayFromSearch = null;
            this.IconCompatParcelizer = null;
            this.AudioAttributesCompatParcelizer = null;
            this.read = null;
            this.onPrepare = true;
            this.RemoteActionCompatParcelizer = true;
            this.onPlay = null;
            this.AudioAttributesImplBaseParcelizer = null;
            this.onFastForward = null;
            this.onPrepareFromSearch = null;
            this.onMediaButtonEvent = null;
            this.MediaBrowserCompatSearchResultReceiver = null;
            this.MediaBrowserCompatMediaItem = null;
            this.MediaDescriptionCompat = null;
            this.RatingCompat = null;
            this.onPrepareFromMediaId = null;
            this.onSeekTo = null;
            this.onPlayFromUri = null;
        }

        public read(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Context context) {
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(context, "");
            this.AudioAttributesImplApi21Parcelizer = context;
            this.AudioAttributesImplApi26Parcelizer = lambdamaybenotifysurfacesizechanged27.getMediaBrowserCompatItemReceiver();
            this.MediaBrowserCompatCustomActionResultReceiver = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi26Parcelizer();
            this.onRewind = lambdamaybenotifysurfacesizechanged27.getOnRemoveQueueItemAt();
            this.handleMediaPlayPauseIfPendingOnHandler = lambdamaybenotifysurfacesizechanged27.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = lambdamaybenotifysurfacesizechanged27.getOnPlayFromMediaId();
            this.onPause = lambdamaybenotifysurfacesizechanged27.getOnPlayFromSearch();
            this.write = lambdamaybenotifysurfacesizechanged27.getWrite();
            this.onAddQueueItem = lambdamaybenotifysurfacesizechanged27.MediaBrowserCompatMediaItem();
            this.MediaBrowserCompatItemReceiver = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplBaseParcelizer();
            this.onPrepareFromUri = lambdamaybenotifysurfacesizechanged27.onPrepareFromSearch();
            this.onCommand = lambdamaybenotifysurfacesizechanged27.getOnCustomAction().AudioAttributesCompatParcelizer();
            this.onPlayFromMediaId = lambdamaybenotifysurfacesizechanged27.getOnFastForward().IconCompatParcelizer();
            this.onCustomAction = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().AudioAttributesImplBaseParcelizer();
            this.onRemoveQueueItem = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().MediaDescriptionCompat();
            this.onRemoveQueueItemAt = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver();
            this.MediaMetadataCompat = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().IconCompatParcelizer();
            this.onSetRating = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().MediaMetadataCompat();
            this.onPlayFromSearch = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer();
            this.IconCompatParcelizer = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
            this.AudioAttributesCompatParcelizer = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().write();
            this.read = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            this.onPrepare = lambdamaybenotifysurfacesizechanged27.getOnPlayFromUri();
            this.RemoteActionCompatParcelizer = lambdamaybenotifysurfacesizechanged27.getRead();
            this.onPlay = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplBaseParcelizer = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().read();
            this.onFastForward = lambdamaybenotifysurfacesizechanged27.getAudioAttributesImplApi21Parcelizer().AudioAttributesImplApi26Parcelizer();
            this.onPrepareFromSearch = lambdamaybenotifysurfacesizechanged27.onPrepareFromMediaId;
            this.onMediaButtonEvent = lambdamaybenotifysurfacesizechanged27.onMediaButtonEvent;
            this.MediaBrowserCompatSearchResultReceiver = lambdamaybenotifysurfacesizechanged27.MediaDescriptionCompat;
            this.MediaBrowserCompatMediaItem = lambdamaybenotifysurfacesizechanged27.MediaBrowserCompatSearchResultReceiver;
            this.MediaDescriptionCompat = lambdamaybenotifysurfacesizechanged27.onAddQueueItem;
            this.RatingCompat = lambdamaybenotifysurfacesizechanged27.RatingCompat;
            if (lambdamaybenotifysurfacesizechanged27.getMediaBrowserCompatCustomActionResultReceiver() == context) {
                this.onPrepareFromMediaId = lambdamaybenotifysurfacesizechanged27.getHandleMediaPlayPauseIfPendingOnHandler();
                this.onSeekTo = lambdamaybenotifysurfacesizechanged27.getOnPrepareFromUri();
                this.onPlayFromUri = lambdamaybenotifysurfacesizechanged27.getOnPrepare();
            } else {
                this.onPrepareFromMediaId = null;
                this.onSeekTo = null;
                this.onPlayFromUri = null;
            }
        }

        public final read read(Object p0) {
            this.MediaBrowserCompatCustomActionResultReceiver = p0;
            return this;
        }

        public final read RemoteActionCompatParcelizer(lambdaupdatePlaybackInfo23... p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return read(getOrderDetails.onCommand(p0));
        }

        private read read(List<? extends lambdaupdatePlaybackInfo23> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.onPrepareFromUri = IntermediateLoginResponseBody.onPlay(p0);
            return this;
        }

        public final read AudioAttributesCompatParcelizer(int p0, int p1) {
            return AudioAttributesCompatParcelizer(new PixelSize(p0, p1));
        }

        public final read AudioAttributesCompatParcelizer(Size p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            lambdaupdatePlaybackInfo15.Companion companion = lambdaupdatePlaybackInfo15.INSTANCE;
            return read(lambdaupdatePlaybackInfo15.Companion.read(p0));
        }

        private read read(lambdaupdatePlaybackInfo15 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.onRemoveQueueItem = p0;
            AudioAttributesCompatParcelizer();
            return this;
        }

        public final read write(lambdaupdatePlaybackInfo16 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.onRemoveQueueItemAt = p0;
            return this;
        }

        public final read AudioAttributesCompatParcelizer(lambdaupdatePlaybackInfo13 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.onPlayFromSearch = p0;
            return this;
        }

        public final read AudioAttributesCompatParcelizer(lambdaupdatePlaybackInfo17 p0) {
            this.onRewind = p0;
            AudioAttributesCompatParcelizer();
            return this;
        }

        public final read write(getCurrentPositionUsInternal p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.AudioAttributesImplApi26Parcelizer = p0;
            IconCompatParcelizer();
            return this;
        }

        public final lambdamaybeNotifySurfaceSizeChanged27 RemoteActionCompatParcelizer() {
            Context context = this.AudioAttributesImplApi21Parcelizer;
            Object obj = this.MediaBrowserCompatCustomActionResultReceiver;
            if (obj == null) {
                obj = lambdarelease5.INSTANCE;
            }
            Object obj2 = obj;
            lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17 = this.onRewind;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler;
            MemoryCache.Key key = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            MemoryCache.Key key2 = this.onPause;
            ColorSpace colorSpace = this.write;
            Pair<? extends ExoPlayerBuilderExternalSyntheticLambda9<?>, ? extends Class<?>> pair = this.onAddQueueItem;
            ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21 = this.MediaBrowserCompatItemReceiver;
            List<? extends lambdaupdatePlaybackInfo23> list = this.onPrepareFromUri;
            ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onCommand;
            ShapeKt shapeKtWrite = sendRendererMessage.write(remoteActionCompatParcelizer2 == null ? null : remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer());
            lambdasetShuffleModeEnabled4.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onPlayFromMediaId;
            lambdasetShuffleModeEnabled4 lambdasetshufflemodeenabled4IconCompatParcelizer = sendRendererMessage.IconCompatParcelizer(audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() : null);
            anyIgnorals anyignorals = this.onCustomAction;
            if (anyignorals == null && (anyignorals = this.onPrepareFromMediaId) == null) {
                anyignorals = read();
            }
            anyIgnorals anyignorals2 = anyignorals;
            lambdaupdatePlaybackInfo15 lambdaupdateplaybackinfo15AudioAttributesImplApi26Parcelizer = this.onRemoveQueueItem;
            if (lambdaupdateplaybackinfo15AudioAttributesImplApi26Parcelizer == null && (lambdaupdateplaybackinfo15AudioAttributesImplApi26Parcelizer = this.onSeekTo) == null) {
                lambdaupdateplaybackinfo15AudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            }
            lambdaupdatePlaybackInfo15 lambdaupdateplaybackinfo15 = lambdaupdateplaybackinfo15AudioAttributesImplApi26Parcelizer;
            lambdaupdatePlaybackInfo16 lambdaupdateplaybackinfo16Write = this.onRemoveQueueItemAt;
            if (lambdaupdateplaybackinfo16Write == null && (lambdaupdateplaybackinfo16Write = this.onPlayFromUri) == null) {
                lambdaupdateplaybackinfo16Write = write();
            }
            lambdaupdatePlaybackInfo16 lambdaupdateplaybackinfo16 = lambdaupdateplaybackinfo16Write;
            getPlatform getplatformWrite = this.MediaMetadataCompat;
            if (getplatformWrite == null) {
                getplatformWrite = this.AudioAttributesImplApi26Parcelizer.getWrite();
            }
            getPlatform getplatform = getplatformWrite;
            maskWindowPositionMsOrGetPeriodPositionUs maskwindowpositionmsorgetperiodpositionusMediaMetadataCompat = this.onSetRating;
            if (maskwindowpositionmsorgetperiodpositionusMediaMetadataCompat == null) {
                maskwindowpositionmsorgetperiodpositionusMediaMetadataCompat = this.AudioAttributesImplApi26Parcelizer.getMediaBrowserCompatMediaItem();
            }
            maskWindowPositionMsOrGetPeriodPositionUs maskwindowpositionmsorgetperiodpositionus = maskwindowpositionmsorgetperiodpositionusMediaMetadataCompat;
            lambdaupdatePlaybackInfo13 lambdaupdateplaybackinfo13MediaDescriptionCompat = this.onPlayFromSearch;
            if (lambdaupdateplaybackinfo13MediaDescriptionCompat == null) {
                lambdaupdateplaybackinfo13MediaDescriptionCompat = this.AudioAttributesImplApi26Parcelizer.getMediaDescriptionCompat();
            }
            lambdaupdatePlaybackInfo13 lambdaupdateplaybackinfo13 = lambdaupdateplaybackinfo13MediaDescriptionCompat;
            Bitmap.Config configRemoteActionCompatParcelizer = this.IconCompatParcelizer;
            if (configRemoteActionCompatParcelizer == null) {
                configRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.getIconCompatParcelizer();
            }
            Bitmap.Config config = configRemoteActionCompatParcelizer;
            boolean z = this.RemoteActionCompatParcelizer;
            Boolean bool = this.AudioAttributesCompatParcelizer;
            boolean zIconCompatParcelizer = bool == null ? this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer() : bool.booleanValue();
            Boolean bool2 = this.read;
            boolean zBooleanValue = bool2 == null ? this.AudioAttributesImplApi26Parcelizer.getRead() : bool2.booleanValue();
            boolean z2 = this.onPrepare;
            getPlayWhenReadyChangeReason getplaywhenreadychangereasonMediaBrowserCompatCustomActionResultReceiver = this.onPlay;
            if (getplaywhenreadychangereasonMediaBrowserCompatCustomActionResultReceiver == null) {
                getplaywhenreadychangereasonMediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi26Parcelizer.getMediaBrowserCompatCustomActionResultReceiver();
            }
            getPlayWhenReadyChangeReason getplaywhenreadychangereason = getplaywhenreadychangereasonMediaBrowserCompatCustomActionResultReceiver;
            getPlayWhenReadyChangeReason getplaywhenreadychangereasonAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
            if (getplaywhenreadychangereasonAudioAttributesCompatParcelizer == null) {
                getplaywhenreadychangereasonAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer();
            }
            getPlayWhenReadyChangeReason getplaywhenreadychangereason2 = getplaywhenreadychangereasonAudioAttributesCompatParcelizer;
            getPlayWhenReadyChangeReason getplaywhenreadychangereasonAudioAttributesImplApi26Parcelizer = this.onFastForward;
            if (getplaywhenreadychangereasonAudioAttributesImplApi26Parcelizer == null) {
                getplaywhenreadychangereasonAudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.getAudioAttributesImplBaseParcelizer();
            }
            getPlayWhenReadyChangeReason getplaywhenreadychangereason3 = getplaywhenreadychangereasonAudioAttributesImplApi26Parcelizer;
            getPeriodPositionUsAfterTimelineChanged getperiodpositionusaftertimelinechanged = new getPeriodPositionUsAfterTimelineChanged(this.onCustomAction, this.onRemoveQueueItem, this.onRemoveQueueItemAt, this.MediaMetadataCompat, this.onSetRating, this.onPlayFromSearch, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.onPlay, this.AudioAttributesImplBaseParcelizer, this.onFastForward);
            getCurrentPositionUsInternal getcurrentpositionusinternal = this.AudioAttributesImplApi26Parcelizer;
            Integer num = this.onPrepareFromSearch;
            Drawable drawable = this.onMediaButtonEvent;
            Integer num2 = this.MediaBrowserCompatSearchResultReceiver;
            Drawable drawable2 = this.MediaBrowserCompatMediaItem;
            Integer num3 = this.MediaDescriptionCompat;
            Drawable drawable3 = this.RatingCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(shapeKtWrite, "");
            return new lambdamaybeNotifySurfaceSizeChanged27(context, obj2, lambdaupdateplaybackinfo17, remoteActionCompatParcelizer, key, key2, colorSpace, pair, exoPlayerBuilderExternalSyntheticLambda21, list, shapeKtWrite, lambdasetshufflemodeenabled4IconCompatParcelizer, anyignorals2, lambdaupdateplaybackinfo15, lambdaupdateplaybackinfo16, getplatform, maskwindowpositionmsorgetperiodpositionus, lambdaupdateplaybackinfo13, config, z, zIconCompatParcelizer, zBooleanValue, z2, getplaywhenreadychangereason, getplaywhenreadychangereason2, getplaywhenreadychangereason3, num, drawable, num2, drawable2, num3, drawable3, getperiodpositionusaftertimelinechanged, getcurrentpositionusinternal, null);
        }

        private final void AudioAttributesCompatParcelizer() {
            this.onPrepareFromMediaId = null;
            this.onSeekTo = null;
            this.onPlayFromUri = null;
        }

        private final void IconCompatParcelizer() {
            this.onPlayFromUri = null;
        }

        private final anyIgnorals read() {
            lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17 = this.onRewind;
            anyIgnorals anyignoralsWrite = lambdaupdatePlaybackInfo25.write(lambdaupdateplaybackinfo17 instanceof lambdaupdatePlaybackInfo21 ? ((lambdaupdatePlaybackInfo21) lambdaupdateplaybackinfo17).IconCompatParcelizer().getContext() : this.AudioAttributesImplApi21Parcelizer);
            return anyignoralsWrite == null ? initializeKeepSessionIdAudioTrack.INSTANCE : anyignoralsWrite;
        }

        private final lambdaupdatePlaybackInfo15 AudioAttributesImplApi26Parcelizer() {
            ImageView.ScaleType scaleType;
            lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17 = this.onRewind;
            if (lambdaupdateplaybackinfo17 instanceof lambdaupdatePlaybackInfo21) {
                View viewIconCompatParcelizer = ((lambdaupdatePlaybackInfo21) lambdaupdateplaybackinfo17).IconCompatParcelizer();
                if ((viewIconCompatParcelizer instanceof ImageView) && ((scaleType = ((ImageView) viewIconCompatParcelizer).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) {
                    lambdaupdatePlaybackInfo15.Companion companion = lambdaupdatePlaybackInfo15.INSTANCE;
                    return lambdaupdatePlaybackInfo15.Companion.read(OriginalSize.INSTANCE);
                }
                lambdaupdatePlaybackInfo18.read readVar = lambdaupdatePlaybackInfo18.RemoteActionCompatParcelizer;
                return lambdaupdatePlaybackInfo18.read.RemoteActionCompatParcelizer(viewIconCompatParcelizer, true);
            }
            return new lambdaupdatePlaybackInfo12(this.AudioAttributesImplApi21Parcelizer);
        }

        private final lambdaupdatePlaybackInfo16 write() {
            lambdaupdatePlaybackInfo15 lambdaupdateplaybackinfo15 = this.onRemoveQueueItem;
            if (lambdaupdateplaybackinfo15 instanceof lambdaupdatePlaybackInfo18) {
                View viewWrite = ((lambdaupdatePlaybackInfo18) lambdaupdateplaybackinfo15).write();
                if (viewWrite instanceof ImageView) {
                    return sendRendererMessage.AudioAttributesCompatParcelizer((ImageView) viewWrite);
                }
            }
            lambdaupdatePlaybackInfo17 lambdaupdateplaybackinfo17 = this.onRewind;
            if (lambdaupdateplaybackinfo17 instanceof lambdaupdatePlaybackInfo21) {
                View viewIconCompatParcelizer = ((lambdaupdatePlaybackInfo21) lambdaupdateplaybackinfo17).IconCompatParcelizer();
                if (viewIconCompatParcelizer instanceof ImageView) {
                    return sendRendererMessage.AudioAttributesCompatParcelizer((ImageView) viewIconCompatParcelizer);
                }
            }
            return lambdaupdatePlaybackInfo16.FILL;
        }
    }
}
