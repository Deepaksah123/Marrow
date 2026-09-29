package com.marrow.di.app.data;

import android.app.Application;
import kotlin.DashMediaSource1;
import kotlin.DashMediaSourceExternalSyntheticLambda0;
import kotlin.DashMediaSourceExternalSyntheticLambda1;
import kotlin.DashMediaSourceManifestCallback;
import kotlin.DashMediaSourceUtcTimestampCallback;
import kotlin.DashMediaSourceXsDateTimeParser;
import kotlin.DashSegmentIndex;
import kotlin.DashWrappingSegmentIndex;
import kotlin.DefaultDashChunkSource;
import kotlin.DefaultDashChunkSourceFactory;
import kotlin.DefaultDashChunkSourceRepresentationHolder;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.copyWithNewRepresentation;
import kotlin.copyWithNewSelectedBaseUrl;
import kotlin.createFallbackOptions;
import kotlin.getAdjustedWindowDefaultStartPositionUs;
import kotlin.getAvailableSegmentCount;
import kotlin.getFirstAvailableSegmentNum;
import kotlin.getFirstRepresentation;
import kotlin.getFirstSegmentNum;
import kotlin.getLastAvailableSegmentNum;
import kotlin.getMagicModuleMeta;
import kotlin.getNowPeriodTimeUs;
import kotlin.getPlanOldPrice;
import kotlin.getRepresentations;
import kotlin.getSegmentNum;
import kotlin.getSegmentUrl;
import kotlin.getStreamPositionUsForContent;
import kotlin.isExplicit;
import kotlin.isIndexExplicit;
import kotlin.isMovingLiveWindow;
import kotlin.loadInitializationData;
import kotlin.loadManifest;
import kotlin.loadSampleFormat;
import kotlin.maybeThrowManifestError;
import kotlin.newChunkExtractor;
import kotlin.newInitializationChunk;
import kotlin.newMediaChunk;
import kotlin.onDashManifestPublishTimeExpired;
import kotlin.onInitializationFailed;
import kotlin.onManifestLoadCompleted;
import kotlin.onManifestLoadError;
import kotlin.onUtcTimestampLoadCompleted;
import kotlin.onUtcTimestampResolved;
import kotlin.processManifest;
import kotlin.replaceManifestUri;
import kotlin.resolveCacheKey;
import kotlin.resolveUtcTimingElementDirect;
import kotlin.resolveUtcTimingElementHttp;
import kotlin.scheduleManifestRefresh;
import kotlin.setCompositeSequenceableLoaderFactory;
import kotlin.setManifestParser;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateSelectedBaseUrl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/data/TableModule;", "", "<init>", "()V", "Lo/resolveUtcTimingElementHttp;", "p0", "Lo/resolveUtcTimingElementDirect;", "RemoteActionCompatParcelizer", "(Lo/resolveUtcTimingElementHttp;)Lo/resolveUtcTimingElementDirect;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TableModule {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @getPlanOldPrice
    public abstract resolveUtcTimingElementDirect RemoteActionCompatParcelizer(resolveUtcTimingElementHttp p0);

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final processManifest write(Application application) {
        return INSTANCE.write(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final onUtcTimestampResolved AudioAttributesCompatParcelizer(Application application) {
        return INSTANCE.AudioAttributesCompatParcelizer(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DefaultDashChunkSource RemoteActionCompatParcelizer(Application application) {
        return INSTANCE.IconCompatParcelizer(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DashMediaSource1 IconCompatParcelizer(Application application) {
        return INSTANCE.RemoteActionCompatParcelizer(application);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.TableModule$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001b\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0018\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010&J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b7\u00108J\u001f\u0010#\u001a\u0002092\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b#\u0010:J)\u0010\f\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010=J\u0017\u0010?\u001a\u00020>2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020A2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010+\u001a\u00020D2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010EJ\u0017\u0010G\u001a\u00020F2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020L2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020O2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bP\u0010QJ\u001f\u00104\u001a\u00020R2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b4\u0010SJ\u0017\u0010\f\u001a\u00020T2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010UJ\u0017\u0010\u001e\u001a\u00020V2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010WJ\u0017\u0010Y\u001a\u00020X2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020[2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020^2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b_\u0010`J\u0017\u00101\u001a\u00020a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010bJ\u0017\u0010d\u001a\u00020c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020i2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020l2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020o2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bs\u0010tJ\u001f\u0010m\u001a\u00020u2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bm\u0010vJ\u0017\u0010x\u001a\u00020w2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020z2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b{\u0010|J\u0017\u0010\u000f\u001a\u00020}2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010~J\u0018\u0010(\u001a\u00020\u007f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0005\b(\u0010\u0080\u0001J\u001b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0019\u0010B\u001a\u00030\u008a\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0005\bB\u0010\u008b\u0001"}, d2 = {"Lcom/marrow/di/app/data/TableModule$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/app/Application;", "p0", "Lo/getAvailableSegmentCount;", "MediaBrowserCompatSearchResultReceiver", "(Landroid/app/Application;)Lo/getAvailableSegmentCount;", "Lo/getStreamPositionUsForContent;", "p1", "Lo/onDashManifestPublishTimeExpired;", "write", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/onDashManifestPublishTimeExpired;", "Lo/isIndexExplicit;", "RemoteActionCompatParcelizer", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/isIndexExplicit;", "Lo/getFirstSegmentNum;", "onPlay", "(Landroid/app/Application;)Lo/getFirstSegmentNum;", "Lo/loadSampleFormat;", "onCustomAction", "(Landroid/app/Application;)Lo/loadSampleFormat;", "Lo/getNowPeriodTimeUs;", "MediaBrowserCompatCustomActionResultReceiver", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/getNowPeriodTimeUs;", "Lo/DashWrappingSegmentIndex;", "AudioAttributesImplApi21Parcelizer", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/DashWrappingSegmentIndex;", "Lo/onUtcTimestampLoadCompleted;", "AudioAttributesImplApi26Parcelizer", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/onUtcTimestampLoadCompleted;", "Lo/onInitializationFailed;", "(Landroid/app/Application;)Lo/onInitializationFailed;", "Lo/newMediaChunk;", "MediaBrowserCompatItemReceiver", "(Landroid/app/Application;)Lo/newMediaChunk;", "Lo/setManifestParser;", "(Landroid/app/Application;)Lo/setManifestParser;", "Lo/setCompositeSequenceableLoaderFactory;", "IconCompatParcelizer", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/setCompositeSequenceableLoaderFactory;", "Lo/maybeThrowManifestError;", "AudioAttributesCompatParcelizer", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/maybeThrowManifestError;", "Lo/getRepresentations;", "handleMediaPlayPauseIfPendingOnHandler", "(Landroid/app/Application;)Lo/getRepresentations;", "Lo/DashSegmentIndex;", "AudioAttributesImplBaseParcelizer", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/DashSegmentIndex;", "Lo/DashMediaSourceXsDateTimeParser;", "MediaDescriptionCompat", "(Landroid/app/Application;)Lo/DashMediaSourceXsDateTimeParser;", "Lo/getFirstAvailableSegmentNum;", "MediaBrowserCompatMediaItem", "(Landroid/app/Application;)Lo/getFirstAvailableSegmentNum;", "Lo/newChunkExtractor;", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/newChunkExtractor;", "p2", "Lo/getSegmentUrl;", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;Lo/onDashManifestPublishTimeExpired;)Lo/getSegmentUrl;", "Lo/copyWithNewSelectedBaseUrl;", "onMediaButtonEvent", "(Landroid/app/Application;)Lo/copyWithNewSelectedBaseUrl;", "Lo/isMovingLiveWindow;", "read", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/isMovingLiveWindow;", "Lo/onUtcTimestampResolved;", "(Landroid/app/Application;)Lo/onUtcTimestampResolved;", "Lo/resolveCacheKey;", "onPrepare", "(Landroid/app/Application;)Lo/resolveCacheKey;", "Lo/DashMediaSourceExternalSyntheticLambda1;", "onFastForward", "(Landroid/app/Application;)Lo/DashMediaSourceExternalSyntheticLambda1;", "Lo/getSegmentNum;", "onPlayFromSearch", "(Landroid/app/Application;)Lo/getSegmentNum;", "Lo/getFirstRepresentation;", "onPrepareFromMediaId", "(Landroid/app/Application;)Lo/getFirstRepresentation;", "Lo/loadInitializationData;", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/loadInitializationData;", "Lo/processManifest;", "(Landroid/app/Application;)Lo/processManifest;", "Lo/resolveUtcTimingElementHttp;", "(Landroid/app/Application;)Lo/resolveUtcTimingElementHttp;", "Lo/createFallbackOptions;", "onPrepareFromUri", "(Landroid/app/Application;)Lo/createFallbackOptions;", "Lo/DashMediaSourceUtcTimestampCallback;", "onRemoveQueueItem", "(Landroid/app/Application;)Lo/DashMediaSourceUtcTimestampCallback;", "Lo/newInitializationChunk;", "onSeekTo", "(Landroid/app/Application;)Lo/newInitializationChunk;", "Lo/scheduleManifestRefresh;", "(Landroid/app/Application;)Lo/scheduleManifestRefresh;", "Lo/copyWithNewRepresentation;", "onPlayFromMediaId", "(Landroid/app/Application;)Lo/copyWithNewRepresentation;", "Lo/DashMediaSourceExternalSyntheticLambda0;", "onAddQueueItem", "(Landroid/app/Application;)Lo/DashMediaSourceExternalSyntheticLambda0;", "Lo/onManifestLoadError;", "onCommand", "(Landroid/app/Application;)Lo/onManifestLoadError;", "Lo/onManifestLoadCompleted;", "MediaMetadataCompat", "(Landroid/app/Application;)Lo/onManifestLoadCompleted;", "Lo/replaceManifestUri;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "(Landroid/app/Application;)Lo/replaceManifestUri;", "Lo/getAdjustedWindowDefaultStartPositionUs;", "RatingCompat", "(Landroid/app/Application;)Lo/getAdjustedWindowDefaultStartPositionUs;", "Lo/updateSelectedBaseUrl;", "(Landroid/app/Application;Lo/getStreamPositionUsForContent;)Lo/updateSelectedBaseUrl;", "Lo/DefaultDashChunkSourceRepresentationHolder;", "onPause", "(Landroid/app/Application;)Lo/DefaultDashChunkSourceRepresentationHolder;", "Lo/getLastAvailableSegmentNum;", "onRemoveQueueItemAt", "(Landroid/app/Application;)Lo/getLastAvailableSegmentNum;", "Lo/DashMediaSource1;", "(Landroid/app/Application;)Lo/DashMediaSource1;", "Lo/DefaultDashChunkSource;", "(Landroid/app/Application;)Lo/DefaultDashChunkSource;", "Lo/DefaultDashChunkSourceFactory;", "onRewind", "(Landroid/app/Application;)Lo/DefaultDashChunkSourceFactory;", "Lo/loadManifest;", "onPlayFromUri", "(Landroid/app/Application;)Lo/loadManifest;", "Lo/isExplicit;", "onPrepareFromSearch", "(Landroid/app/Application;)Lo/isExplicit;", "Lo/DashMediaSourceManifestCallback;", "(Landroid/app/Application;)Lo/DashMediaSourceManifestCallback;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getAvailableSegmentCount MediaBrowserCompatSearchResultReceiver(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getAvailableSegmentCount(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final onDashManifestPublishTimeExpired write(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new onDashManifestPublishTimeExpired(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final isIndexExplicit RemoteActionCompatParcelizer(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new isIndexExplicit(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getFirstSegmentNum onPlay(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getFirstSegmentNum(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final loadSampleFormat onCustomAction(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new loadSampleFormat(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getNowPeriodTimeUs MediaBrowserCompatCustomActionResultReceiver(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new getNowPeriodTimeUs(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DashWrappingSegmentIndex AudioAttributesImplApi21Parcelizer(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new DashWrappingSegmentIndex(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final onUtcTimestampLoadCompleted AudioAttributesImplApi26Parcelizer(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new onUtcTimestampLoadCompleted(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final onInitializationFailed AudioAttributesImplApi21Parcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new onInitializationFailed(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final newMediaChunk MediaBrowserCompatItemReceiver(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new newMediaChunk(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final setManifestParser MediaBrowserCompatCustomActionResultReceiver(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new setManifestParser(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final setCompositeSequenceableLoaderFactory IconCompatParcelizer(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new setCompositeSequenceableLoaderFactory(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final maybeThrowManifestError AudioAttributesCompatParcelizer(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new maybeThrowManifestError(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getRepresentations handleMediaPlayPauseIfPendingOnHandler(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getRepresentations(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DashSegmentIndex AudioAttributesImplBaseParcelizer(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new DashSegmentIndex(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DashMediaSourceXsDateTimeParser MediaDescriptionCompat(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DashMediaSourceXsDateTimeParser(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getFirstAvailableSegmentNum MediaBrowserCompatMediaItem(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getFirstAvailableSegmentNum(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final newChunkExtractor MediaBrowserCompatItemReceiver(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new newChunkExtractor(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getSegmentUrl write(Application p0, getStreamPositionUsForContent p1, onDashManifestPublishTimeExpired p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new getSegmentUrl(p0, p1, p2);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final copyWithNewSelectedBaseUrl onMediaButtonEvent(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new copyWithNewSelectedBaseUrl(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final isMovingLiveWindow read(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new isMovingLiveWindow(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final onUtcTimestampResolved AudioAttributesCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new onUtcTimestampResolved(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final resolveCacheKey onPrepare(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new resolveCacheKey(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DashMediaSourceExternalSyntheticLambda1 onFastForward(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DashMediaSourceExternalSyntheticLambda1(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getSegmentNum onPlayFromSearch(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getSegmentNum(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getFirstRepresentation onPrepareFromMediaId(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getFirstRepresentation(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final loadInitializationData MediaDescriptionCompat(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new loadInitializationData(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final processManifest write(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new processManifest(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final resolveUtcTimingElementHttp AudioAttributesImplApi26Parcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new resolveUtcTimingElementHttp(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final createFallbackOptions onPrepareFromUri(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new createFallbackOptions(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DashMediaSourceUtcTimestampCallback onRemoveQueueItem(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DashMediaSourceUtcTimestampCallback(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final newInitializationChunk onSeekTo(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new newInitializationChunk(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final scheduleManifestRefresh AudioAttributesImplBaseParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new scheduleManifestRefresh(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final copyWithNewRepresentation onPlayFromMediaId(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new copyWithNewRepresentation(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DashMediaSourceExternalSyntheticLambda0 onAddQueueItem(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DashMediaSourceExternalSyntheticLambda0(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final onManifestLoadError onCommand(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new onManifestLoadError(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final onManifestLoadCompleted MediaMetadataCompat(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new onManifestLoadCompleted(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final replaceManifestUri MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new replaceManifestUri(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getAdjustedWindowDefaultStartPositionUs RatingCompat(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getAdjustedWindowDefaultStartPositionUs(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final updateSelectedBaseUrl MediaMetadataCompat(Application p0, getStreamPositionUsForContent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new updateSelectedBaseUrl(p0, p1);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DefaultDashChunkSourceRepresentationHolder onPause(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DefaultDashChunkSourceRepresentationHolder(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final getLastAvailableSegmentNum onRemoveQueueItemAt(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getLastAvailableSegmentNum(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DashMediaSource1 RemoteActionCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DashMediaSource1(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DefaultDashChunkSource IconCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DefaultDashChunkSource(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DefaultDashChunkSourceFactory onRewind(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DefaultDashChunkSourceFactory(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final loadManifest onPlayFromUri(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new loadManifest(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final isExplicit onPrepareFromSearch(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new isExplicit(p0);
        }

        @getMagicModuleMeta
        @getPlanOldPrice
        public final DashMediaSourceManifestCallback read(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DashMediaSourceManifestCallback(p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DashMediaSourceManifestCallback read(Application application) {
        return INSTANCE.read(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final isIndexExplicit write(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.RemoteActionCompatParcelizer(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final newMediaChunk MediaBrowserCompatItemReceiver(Application application) {
        return INSTANCE.MediaBrowserCompatItemReceiver(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final scheduleManifestRefresh AudioAttributesImplApi21Parcelizer(Application application) {
        return INSTANCE.AudioAttributesImplBaseParcelizer(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final resolveUtcTimingElementHttp AudioAttributesImplApi26Parcelizer(Application application) {
        return INSTANCE.AudioAttributesImplApi26Parcelizer(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final onDashManifestPublishTimeExpired IconCompatParcelizer(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.write(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final onInitializationFailed MediaBrowserCompatCustomActionResultReceiver(Application application) {
        return INSTANCE.AudioAttributesImplApi21Parcelizer(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final setManifestParser AudioAttributesImplBaseParcelizer(Application application) {
        return INSTANCE.MediaBrowserCompatCustomActionResultReceiver(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final setCompositeSequenceableLoaderFactory read(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.IconCompatParcelizer(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getAdjustedWindowDefaultStartPositionUs MediaBrowserCompatSearchResultReceiver(Application application) {
        return INSTANCE.RatingCompat(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final isMovingLiveWindow AudioAttributesCompatParcelizer(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.read(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final maybeThrowManifestError RemoteActionCompatParcelizer(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.AudioAttributesCompatParcelizer(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DashMediaSourceXsDateTimeParser MediaDescriptionCompat(Application application) {
        return INSTANCE.MediaDescriptionCompat(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DashSegmentIndex AudioAttributesImplApi26Parcelizer(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.AudioAttributesImplBaseParcelizer(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getFirstAvailableSegmentNum MediaMetadataCompat(Application application) {
        return INSTANCE.MediaBrowserCompatMediaItem(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getAvailableSegmentCount MediaBrowserCompatMediaItem(Application application) {
        return INSTANCE.MediaBrowserCompatSearchResultReceiver(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final onManifestLoadCompleted RatingCompat(Application application) {
        return INSTANCE.MediaMetadataCompat(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final onManifestLoadError handleMediaPlayPauseIfPendingOnHandler(Application application) {
        return INSTANCE.onCommand(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final replaceManifestUri onCustomAction(Application application) {
        return INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final onUtcTimestampLoadCompleted AudioAttributesImplBaseParcelizer(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.AudioAttributesImplApi26Parcelizer(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getSegmentUrl RemoteActionCompatParcelizer(Application application, getStreamPositionUsForContent getstreampositionusforcontent, onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired) {
        return INSTANCE.write(application, getstreampositionusforcontent, ondashmanifestpublishtimeexpired);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final newChunkExtractor MediaBrowserCompatItemReceiver(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.MediaBrowserCompatItemReceiver(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DashMediaSourceExternalSyntheticLambda0 MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Application application) {
        return INSTANCE.onAddQueueItem(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DashWrappingSegmentIndex MediaBrowserCompatCustomActionResultReceiver(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.AudioAttributesImplApi21Parcelizer(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final loadSampleFormat onCommand(Application application) {
        return INSTANCE.onCustomAction(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getNowPeriodTimeUs AudioAttributesImplApi21Parcelizer(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.MediaBrowserCompatCustomActionResultReceiver(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getRepresentations onAddQueueItem(Application application) {
        return INSTANCE.handleMediaPlayPauseIfPendingOnHandler(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DefaultDashChunkSourceRepresentationHolder onPause(Application application) {
        return INSTANCE.onPause(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final copyWithNewRepresentation onPlayFromMediaId(Application application) {
        return INSTANCE.onPlayFromMediaId(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getFirstSegmentNum onPlay(Application application) {
        return INSTANCE.onPlay(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final copyWithNewSelectedBaseUrl onMediaButtonEvent(Application application) {
        return INSTANCE.onMediaButtonEvent(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final updateSelectedBaseUrl RatingCompat(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.MediaMetadataCompat(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DashMediaSourceExternalSyntheticLambda1 onFastForward(Application application) {
        return INSTANCE.onFastForward(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getSegmentNum onPrepareFromSearch(Application application) {
        return INSTANCE.onPlayFromSearch(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final isExplicit onPrepare(Application application) {
        return INSTANCE.onPrepareFromSearch(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getFirstRepresentation onPlayFromSearch(Application application) {
        return INSTANCE.onPrepareFromMediaId(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final loadInitializationData MediaBrowserCompatMediaItem(Application application, getStreamPositionUsForContent getstreampositionusforcontent) {
        return INSTANCE.MediaDescriptionCompat(application, getstreampositionusforcontent);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final resolveCacheKey onPlayFromUri(Application application) {
        return INSTANCE.onPrepare(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final loadManifest onPrepareFromMediaId(Application application) {
        return INSTANCE.onPlayFromUri(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DashMediaSourceUtcTimestampCallback onPrepareFromUri(Application application) {
        return INSTANCE.onRemoveQueueItem(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final createFallbackOptions onRemoveQueueItemAt(Application application) {
        return INSTANCE.onPrepareFromUri(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final DefaultDashChunkSourceFactory onRemoveQueueItem(Application application) {
        return INSTANCE.onRewind(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final newInitializationChunk onSeekTo(Application application) {
        return INSTANCE.onSeekTo(application);
    }

    @getMagicModuleMeta
    @getPlanOldPrice
    public static final getLastAvailableSegmentNum onRewind(Application application) {
        return INSTANCE.onRemoveQueueItemAt(application);
    }
}
