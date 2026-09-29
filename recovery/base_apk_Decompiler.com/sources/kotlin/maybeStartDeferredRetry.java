package kotlin;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.request.video.UserDeviceInfoModel;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.common.AttestationResponseBody;
import com.marrow.data.api.models.response.common.FIDResponseBody;
import com.marrow.data.api.models.response.common.SecurityResponseBody;
import com.marrow.data.api.models.response.firebase.BuyNowPromoResponse;
import com.marrow.data.api.models.response.firebase.FirebaseSyncResponse;
import com.marrow.data.api.models.response.firebase.VideoDownloadLimitResponse;
import com.marrow.data.api.models.response.firebase.WoqMarrowthon;
import com.marrow.data.api.models.response.plan.UpgradePlanResponse;
import com.marrow.data.api.models.response.security.playintegrity.PlayIntegrityResponseBody;
import com.marrow.data.api.models.response.video.PlaybackSettings;
import com.marrow.data.models.home.RecentUpdatesLastSyncedModel;
import com.marrow.data.models.tag.Tag;
import com.marrow.data.models.user.FIDStatus;
import com.marrow.data.models.user.UserConfigResponse;
import com.marrow2.data.user.remote.model.ImageTokenRSModel;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.InteractiveVideoElementLSModel;
import kotlin.getLatestBitrateEstimate;
import kotlin.getSampleFormats;
import kotlin.parseCea708AccessibilityChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeStartDeferredRetry {
    private static final long read = TimeUnit.HOURS.toMillis(24);
    private final onRebuffer AudioAttributesCompatParcelizer;
    private final isUnused AudioAttributesImplApi21Parcelizer;
    private final MediaParserChunkExtractorExternalSyntheticLambda0 AudioAttributesImplApi26Parcelizer;
    private final DashManifestStaleException AudioAttributesImplBaseParcelizer;
    private final isSeekPending IconCompatParcelizer;
    private final peekChar MediaBrowserCompatCustomActionResultReceiver;
    private final withAdState MediaBrowserCompatItemReceiver;
    private final getStreamPositionUsForContent MediaBrowserCompatMediaItem;
    private final Object MediaBrowserCompatSearchResultReceiver;
    private final getIds MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final getSampleFormats MediaDescriptionCompat;
    private final Cea608DecoderCueBuilderCueStyle MediaMetadataCompat;
    private final getNextChunkIndex RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private final Map<String, AudioAttributesCompatParcelizer> handleMediaPlayPauseIfPendingOnHandler = new AnonymousClass5();
    private final onChunkLoadCompleted onAddQueueItem;
    private final getDataHolder onCommand;
    private final getIds write;

    @FunctionalInterface
    interface AudioAttributesCompatParcelizer {
        void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource);
    }

    protected interface write<T> {
        void read(T t);
    }

    @setSdkPayload
    public maybeStartDeferredRetry(Context context, getIds getids, getIds getids2, onChunkLoadCompleted onchunkloadcompleted, getStreamPositionUsForContent getstreampositionusforcontent, isUnused isunused, withAdState withadstate, getSampleFormats getsampleformats, getNextChunkIndex getnextchunkindex, Cea608DecoderCueBuilderCueStyle cea608DecoderCueBuilderCueStyle, onRebuffer onrebuffer, MediaParserChunkExtractorExternalSyntheticLambda0 mediaParserChunkExtractorExternalSyntheticLambda0, getDataHolder getdataholder, peekChar peekchar, DashManifestStaleException dashManifestStaleException, isSeekPending isseekpending, Object obj) {
        this.MediaBrowserCompatMediaItem = getstreampositionusforcontent;
        this.AudioAttributesImplBaseParcelizer = dashManifestStaleException;
        this.AudioAttributesImplApi26Parcelizer = mediaParserChunkExtractorExternalSyntheticLambda0;
        this.RatingCompat = getnextchunkindex;
        this.MediaMetadataCompat = cea608DecoderCueBuilderCueStyle;
        this.write = getids;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getids2;
        this.onAddQueueItem = onchunkloadcompleted;
        this.AudioAttributesImplApi21Parcelizer = isunused;
        this.MediaBrowserCompatItemReceiver = withadstate;
        this.AudioAttributesCompatParcelizer = onrebuffer;
        this.onCommand = getdataholder;
        this.IconCompatParcelizer = isseekpending;
        this.MediaDescriptionCompat = getsampleformats;
        this.MediaBrowserCompatCustomActionResultReceiver = peekchar;
        this.MediaBrowserCompatSearchResultReceiver = obj;
        this.RemoteActionCompatParcelizer = context;
    }

    public final void read(ByteArrayDataSource byteArrayDataSource) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.get(byteArrayDataSource.IconCompatParcelizer());
        if (audioAttributesCompatParcelizer != null) {
            StringBuilder sb = new StringBuilder("executeSync - ");
            sb.append(byteArrayDataSource.IconCompatParcelizer());
            buildResolutionString.IconCompatParcelizer("SyncLogger", sb.toString());
            audioAttributesCompatParcelizer.IconCompatParcelizer(byteArrayDataSource);
            return;
        }
        StringBuilder sb2 = new StringBuilder("No fallback found for: ");
        sb2.append(byteArrayDataSource.IconCompatParcelizer());
        buildResolutionString.IconCompatParcelizer("executeIndividualSyncFallback", sb2.toString());
    }

    public final void MediaDescriptionCompat() {
        read(this.MediaMetadataCompat.AudioAttributesCompatParcelizer(), "security_audit", new write() { // from class: o.postAppend
            @Override // o.maybeStartDeferredRetry.write
            public final void read(Object obj) {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer((SecurityResponseBody) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AudioAttributesCompatParcelizer(SecurityResponseBody securityResponseBody) {
        String strAudioAttributesImplBaseParcelizer = this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer();
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            getLatestBitrateEstimate.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(strAudioAttributesImplBaseParcelizer);
            this.IconCompatParcelizer.write("security_suspicious_activity", StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12.RemoteActionCompatParcelizer("AppLaunch"), MediaPeriodCallback.RemoteActionCompatParcelizer(new Object[]{updateLoadingFinished.IconCompatParcelizer}));
        }
        int i = securityResponseBody.fidRequirementStatus;
        if (i == FIDStatus.REQUIRED_TO_REGISTER.getValue()) {
            IconCompatParcelizer(securityResponseBody.fidKey);
        }
        buildResolutionString.IconCompatParcelizer("SecurityAudit", "FID Status:".concat(String.valueOf(i)));
    }

    private boolean handleMediaPlayPauseIfPendingOnHandler() {
        return DownloadNotificationHelper.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final void MediaBrowserCompatMediaItem() {
        final getStreamPositionUsForContent getstreampositionusforcontent = this.MediaBrowserCompatMediaItem;
        Objects.requireNonNull(getstreampositionusforcontent);
        getEmptyState.IconCompatParcelizer(new Callable() { // from class: o.readToBuffer
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(getstreampositionusforcontent.onSkipToPrevious());
            }
        }).IconCompatParcelizer(this.write).IconCompatParcelizer(new getHasPyt() { // from class: o.discardDownstreamTo
            @Override // kotlin.getHasPyt
            public final boolean IconCompatParcelizer(Object obj) {
                return maybeStartDeferredRetry.write((Long) obj);
            }
        }).RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.getTotalBytesWritten
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return this.RemoteActionCompatParcelizer.onCustomAction();
            }
        }).read(this.write).AudioAttributesCompatParcelizer(new getTimelineId() { // from class: o.peekToBuffer
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((MarrowResponse) obj);
            }
        }, new getTimelineId() { // from class: o.suppressRead
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                this.write.MediaMetadataCompat((Throwable) obj);
            }
        });
    }

    static /* synthetic */ boolean write(Long l) throws Exception {
        return System.currentTimeMillis() >= l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InteractiveVideoElementUiModelCompanion onCustomAction() throws Exception {
        return this.MediaMetadataCompat.write().IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AudioAttributesCompatParcelizer(MarrowResponse marrowResponse) throws Exception {
        if (marrowResponse instanceof Success) {
            ImageTokenRSModel imageTokenRSModel = (ImageTokenRSModel) ((Success) marrowResponse).getData();
            if (imageTokenRSModel != null) {
                this.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem(imageTokenRSModel.getToken());
                this.MediaBrowserCompatMediaItem.write(imageTokenRSModel.getExpiryTimestamp());
                return;
            }
            return;
        }
        if (marrowResponse instanceof MarrowError) {
            MediaMetadataCompat(((MarrowError) marrowResponse).getThrowable());
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() throws Throwable {
        try {
            boolean zAccessonBackPresseds1027565324 = this.MediaBrowserCompatMediaItem.accessonBackPresseds1027565324();
            boolean zCreateFullyDrawnExecutor = this.MediaBrowserCompatMediaItem.createFullyDrawnExecutor();
            boolean z = !zAccessonBackPresseds1027565324 || zCreateFullyDrawnExecutor;
            StringBuilder sb = new StringBuilder("isTokenAccepted=");
            sb.append(zAccessonBackPresseds1027565324);
            sb.append(", isTimeExpired=");
            sb.append(zCreateFullyDrawnExecutor);
            sb.append(", shouldGenerate=");
            sb.append(z);
            buildResolutionString.IconCompatParcelizer("logPlayIntegrity", sb.toString());
            if (!z) {
                buildResolutionString.IconCompatParcelizer("logPlayIntegrity", "Skipped: token still valid");
                return;
            }
            Object obj = this.MediaBrowserCompatSearchResultReceiver;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1241837958);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + 24194, 11 - View.getDefaultSize(0, 0), -877475089, false, "IconCompatParcelizer", new Class[0]);
                }
                LessonDynamicResponseBody lessonDynamicResponseBody = (LessonDynamicResponseBody) ((Method) objRemoteActionCompatParcelizer).invoke(obj, null);
                final Cea608DecoderCueBuilderCueStyle cea608DecoderCueBuilderCueStyle = this.MediaMetadataCompat;
                Objects.requireNonNull(cea608DecoderCueBuilderCueStyle);
                read(lessonDynamicResponseBody.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.setLoadPosition
                    @Override // kotlin.getSubjectTitle
                    public final Object apply(Object obj2) {
                        return cea608DecoderCueBuilderCueStyle.RemoteActionCompatParcelizer((String) obj2);
                    }
                }), "pit", new write() { // from class: o.clearAllocationNodes
                    @Override // o.maybeStartDeferredRetry.write
                    public final void read(Object obj2) {
                        this.RemoteActionCompatParcelizer.IconCompatParcelizer((PlayIntegrityResponseBody) obj2);
                    }
                });
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("[Exception] executePlayIntegrityTokenCheck() \n");
            sb2.append(e.getMessage());
            buildResolutionString.IconCompatParcelizer("logPlayIntegrity", sb2.toString());
            RemoteActionCompatParcelizer(e, "pit");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void IconCompatParcelizer(PlayIntegrityResponseBody playIntegrityResponseBody) {
        StringBuilder sb = new StringBuilder("Accepted: ");
        sb.append(playIntegrityResponseBody.isAccepted);
        buildResolutionString.IconCompatParcelizer("logPlayIntegrity", sb.toString());
        this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer(playIntegrityResponseBody.isAccepted);
        StringBuilder sb2 = new StringBuilder("[Saving] Accepted : ");
        sb2.append(playIntegrityResponseBody.isAccepted);
        buildResolutionString.IconCompatParcelizer("logPlayIntegrity", sb2.toString());
        StringBuilder sb3 = new StringBuilder("[Local DB] isAccepted : ");
        sb3.append(this.MediaBrowserCompatMediaItem.accessonBackPresseds1027565324());
        buildResolutionString.IconCompatParcelizer("logPlayIntegrity", sb3.toString());
        if (playIntegrityResponseBody.isAccepted) {
            long jCurrentTimeMillis = System.currentTimeMillis() + read;
            this.MediaBrowserCompatMediaItem.MediaMetadataCompat(jCurrentTimeMillis);
            buildResolutionString.IconCompatParcelizer("logPlayIntegrity", "[Saving] Expire Time : ".concat(String.valueOf(jCurrentTimeMillis)));
            StringBuilder sb4 = new StringBuilder("[Local DB] isExpired : ");
            sb4.append(this.MediaBrowserCompatMediaItem.createFullyDrawnExecutor());
            buildResolutionString.IconCompatParcelizer("logPlayIntegrity", sb4.toString());
        }
    }

    public final void AudioAttributesImplBaseParcelizer() {
        final getStreamPositionUsForContent getstreampositionusforcontent = this.MediaBrowserCompatMediaItem;
        Objects.requireNonNull(getstreampositionusforcontent);
        read(getEmptyState.IconCompatParcelizer(new Callable() { // from class: o.getAllocation
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(getstreampositionusforcontent.accessensureViewModelStore());
            }
        }).IconCompatParcelizer(new getHasPyt() { // from class: o.SampleQueue
            @Override // kotlin.getHasPyt
            public final boolean IconCompatParcelizer(Object obj) {
                return maybeStartDeferredRetry.write((Boolean) obj);
            }
        }).write(new getSubjectTitle() { // from class: o.translateOffset
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return this.AudioAttributesCompatParcelizer.onAddQueueItem();
            }
        }).IconCompatParcelizer(getEmptyState.IconCompatParcelizer(new Callable() { // from class: o.attemptSplice
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return maybeStartDeferredRetry.read();
            }
        })).RemoteActionCompatParcelizer(), "attr", new write() { // from class: o.SampleDataQueueAllocationNode
            @Override // o.maybeStartDeferredRetry.write
            public final void read(Object obj) {
                this.AudioAttributesCompatParcelizer.write((AttestationResponseBody) obj);
            }
        });
    }

    static /* synthetic */ boolean write(Boolean bool) throws Exception {
        return !bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MarrowResponse onAddQueueItem() throws Exception {
        return this.MediaMetadataCompat.IconCompatParcelizer().AudioAttributesCompatParcelizer();
    }

    static /* synthetic */ Success read() throws Exception {
        return new Success(new AttestationResponseBody(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void write(AttestationResponseBody attestationResponseBody) {
        StringBuilder sb = new StringBuilder("Accepted:");
        sb.append(attestationResponseBody.isAccepted());
        buildResolutionString.IconCompatParcelizer("logAttestation", sb.toString());
        if (attestationResponseBody.isAccepted()) {
            this.MediaBrowserCompatMediaItem.addOnContextAvailableListener();
        }
    }

    private void IconCompatParcelizer(String str) {
        read(this.MediaMetadataCompat.IconCompatParcelizer(str), "fid_failure", new write() { // from class: o.ProgressiveMediaPeriodExternalSyntheticLambda3
            @Override // o.maybeStartDeferredRetry.write
            public final void read(Object obj) {
                maybeStartDeferredRetry.RemoteActionCompatParcelizer((FIDResponseBody) obj);
            }
        });
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(FIDResponseBody fIDResponseBody) {
        StringBuilder sb = new StringBuilder("Output FID:");
        sb.append(fIDResponseBody.fidRequirementStatus);
        buildResolutionString.IconCompatParcelizer("SecurityAudit", sb.toString());
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (System.currentTimeMillis() - this.MediaBrowserCompatMediaItem.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() >= 86400000) {
            accessgetEmptyStatecp accessgetemptystatecpAudioAttributesCompatParcelizer = parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.lambdaonLengthKnown2comgoogleandroidexoplayer2sourceProgressiveMediaPeriod
                @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
                public final Object write() {
                    return maybeStartDeferredRetry.RemoteActionCompatParcelizer();
                }
            });
            final onChunkLoadCompleted onchunkloadcompleted = this.onAddQueueItem;
            Objects.requireNonNull(onchunkloadcompleted);
            accessgetemptystatecpAudioAttributesCompatParcelizer.write(new getSubjectTitle() { // from class: o.lambdanew0comgoogleandroidexoplayer2sourceProgressiveMediaPeriod
                @Override // kotlin.getSubjectTitle
                public final Object apply(Object obj) {
                    return onchunkloadcompleted.RemoteActionCompatParcelizer((String[]) obj);
                }
            }).RemoteActionCompatParcelizer(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).IconCompatParcelizer(new getTimelineId() { // from class: o.lambdaseekMap1comgoogleandroidexoplayer2sourceProgressiveMediaPeriod
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.write.read((ApiResponse) obj);
                }
            }, new getTimelineId() { // from class: o.ProgressiveMediaPeriodExternalSyntheticLambda2
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem((Throwable) obj);
                }
            });
        }
    }

    static /* synthetic */ String[] RemoteActionCompatParcelizer() {
        return new String[]{"mcq", "rating_tags"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void read(ApiResponse apiResponse) throws Exception {
        if (apiResponse.hasData()) {
            this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer(System.currentTimeMillis());
            this.onAddQueueItem.RemoteActionCompatParcelizer((Tag[]) apiResponse.data.data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void MediaBrowserCompatMediaItem(Throwable th) throws Exception {
        RemoteActionCompatParcelizer(th, "TAGS_SYNC");
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        if (write("last_firebase_sync_v2")) {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().write(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).RemoteActionCompatParcelizer(new getTimelineId() { // from class: o.ProgressiveMediaPeriodExternalSyntheticLambda1
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.IconCompatParcelizer.write((FirebaseSyncResponse) obj);
                }
            }, new getTimelineId() { // from class: o.onUpstreamFormatChanged
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.RemoteActionCompatParcelizer.read((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void write(FirebaseSyncResponse firebaseSyncResponse) throws Exception {
        if (firebaseSyncResponse.isSuccess) {
            this.MediaBrowserCompatItemReceiver.write(firebaseSyncResponse);
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer("last_firebase_sync_v2", System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void read(Throwable th) throws Exception {
        RemoteActionCompatParcelizer(th, "FIREBASE_SYNC");
    }

    public final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        if (write("last_firebase_config_sync_2")) {
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer().RemoteActionCompatParcelizer(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).IconCompatParcelizer(new getTimelineId() { // from class: o.ProgressiveMediaPeriodListener
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.read.read((VideoDownloadLimitResponse) obj);
                }
            }, new getTimelineId() { // from class: o.ProgressiveMediaSourceFactory
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.IconCompatParcelizer.IconCompatParcelizer((Throwable) obj);
                }
            });
            accessgetEmptyStatecp<BuyNowPromoResponse> accessgetemptystatecpAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.read().RemoteActionCompatParcelizer(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            final withAdState withadstate = this.MediaBrowserCompatItemReceiver;
            Objects.requireNonNull(withadstate);
            accessgetemptystatecpAudioAttributesCompatParcelizer.IconCompatParcelizer(new getTimelineId() { // from class: o.ProgressiveMediaSourceFactoryExternalSyntheticLambda0
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws JsonProcessingException {
                    withadstate.write((BuyNowPromoResponse) obj);
                }
            }, new getTimelineId() { // from class: o.setContinueLoadingCheckIntervalBytes
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.RemoteActionCompatParcelizer.write((Throwable) obj);
                }
            });
            accessgetEmptyStatecp<WoqMarrowthon[]> accessgetemptystatecpAudioAttributesCompatParcelizer2 = this.MediaBrowserCompatItemReceiver.write().RemoteActionCompatParcelizer(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            final withAdState withadstate2 = this.MediaBrowserCompatItemReceiver;
            Objects.requireNonNull(withadstate2);
            accessgetemptystatecpAudioAttributesCompatParcelizer2.IconCompatParcelizer(new getTimelineId() { // from class: o.ProgressiveMediaSource1
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws JsonProcessingException {
                    withadstate2.RemoteActionCompatParcelizer((WoqMarrowthon[]) obj);
                }
            }, new getTimelineId() { // from class: o.getNodeContainingPosition
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.read.RemoteActionCompatParcelizer((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void read(VideoDownloadLimitResponse videoDownloadLimitResponse) throws Exception {
        if (videoDownloadLimitResponse.getFreeLimit().intValue() > 0 || videoDownloadLimitResponse.getProLimit().intValue() > 0) {
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(videoDownloadLimitResponse);
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer("last_firebase_config_sync_2", System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void IconCompatParcelizer(Throwable th) throws Exception {
        RemoteActionCompatParcelizer(th, "FIREBASE_CONFIG_SYNC");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void write(Throwable th) throws Exception {
        RemoteActionCompatParcelizer(th, "FIREBASE_PROMO_CONFIG_SYNC");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void RemoteActionCompatParcelizer(Throwable th) throws Exception {
        RemoteActionCompatParcelizer(th, "FIREBASE_WOQ_SYNC");
    }

    private boolean write(String str) {
        long jMediaBrowserCompatItemReceiver = this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - jMediaBrowserCompatItemReceiver >= 43200000 || parseEac3SupplementalProperties.RemoteActionCompatParcelizer(jMediaBrowserCompatItemReceiver, jCurrentTimeMillis);
    }

    public final void MediaBrowserCompatItemReceiver() {
        getSampleFormats getsampleformats = this.MediaDescriptionCompat;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        if (getsampleformats.AudioAttributesCompatParcelizer(getSampleFormats.Companion.MediaBrowserCompatSearchResultReceiver())) {
            if (parseEac3SupplementalProperties.RemoteActionCompatParcelizer(System.currentTimeMillis(), this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver("last_upgrade_plan_sync"))) {
                this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).IconCompatParcelizer(new getTimelineId() { // from class: o.preAppend
                    @Override // kotlin.getTimelineId
                    public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                        this.read.RemoteActionCompatParcelizer((ApiResponse) obj);
                    }
                }, new getTimelineId() { // from class: o.SampleDataQueue
                    @Override // kotlin.getTimelineId
                    public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                        this.write.AudioAttributesImplApi21Parcelizer((Throwable) obj);
                    }
                });
                return;
            }
            return;
        }
        this.MediaBrowserCompatMediaItem.onCommand(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void RemoteActionCompatParcelizer(ApiResponse apiResponse) throws Exception {
        if (apiResponse.isSuccessful()) {
            this.MediaBrowserCompatMediaItem.onCommand(((UpgradePlanResponse) apiResponse.data.data).toJSON());
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer("last_upgrade_plan_sync", System.currentTimeMillis());
        } else if (apiResponse.getError().getErrorCode() == 1500) {
            this.MediaBrowserCompatMediaItem.onCommand(null);
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer("last_upgrade_plan_sync", System.currentTimeMillis());
        } else {
            this.MediaBrowserCompatMediaItem.onCommand(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AudioAttributesImplApi21Parcelizer(Throwable th) throws Exception {
        this.MediaBrowserCompatMediaItem.onCommand(null);
        RemoteActionCompatParcelizer(th, "PLAN_UPGRADE_SYNC");
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        getSampleFormats getsampleformats = this.MediaDescriptionCompat;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        if (getsampleformats.AudioAttributesCompatParcelizer(getSampleFormats.Companion.RatingCompat())) {
            if (parseEac3SupplementalProperties.RemoteActionCompatParcelizer(System.currentTimeMillis(), this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver("last_upgrade_plan_sync_v2"))) {
                this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).IconCompatParcelizer(new getTimelineId() { // from class: o.ProgressiveMediaPeriodTrackId
                    @Override // kotlin.getTimelineId
                    public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                        this.AudioAttributesCompatParcelizer.write((MarrowResponse) obj);
                    }
                }, new getTimelineId() { // from class: o.ProgressiveMediaSource
                    @Override // kotlin.getTimelineId
                    public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                        this.read.AudioAttributesImplApi26Parcelizer((Throwable) obj);
                    }
                });
                return;
            }
            return;
        }
        this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer((String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void write(MarrowResponse marrowResponse) throws Exception {
        if (marrowResponse instanceof Success) {
            getLatestBitrateEstimate.read();
            this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer(new setDownloadingStatesToQueued().AudioAttributesCompatParcelizer(((Success) marrowResponse).getData()));
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer("last_upgrade_plan_sync_v2", System.currentTimeMillis());
        } else if ((marrowResponse instanceof Failed) && ((Failed) marrowResponse).getErrorCode() == 1500) {
            this.MediaBrowserCompatMediaItem.onCommand(null);
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer("last_upgrade_plan_sync_v2", System.currentTimeMillis());
        } else {
            this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer((String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AudioAttributesImplApi26Parcelizer(Throwable th) throws Exception {
        this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer((String) null);
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer("last_upgrade_plan_sync_v2", 0);
        RemoteActionCompatParcelizer(th, "PLAN_B_UPGRADE_SYNC");
    }

    public final void write() {
        if (parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(System.currentTimeMillis(), this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver("recent_updates_last_sync"))) {
            this.RatingCompat.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).IconCompatParcelizer(new getTimelineId() { // from class: o.icyTrack
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((MarrowResponse) obj);
                }
            }, new getTimelineId() { // from class: o.buildDataSpec
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void RemoteActionCompatParcelizer(MarrowResponse marrowResponse) throws Exception {
        if (marrowResponse instanceof Success) {
            this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(((RecentUpdatesLastSyncedModel) ((Success) marrowResponse).getData()).getLastUpdated());
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer("recent_updates_last_sync", System.currentTimeMillis());
        } else if (marrowResponse instanceof MarrowError) {
            RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "RECENT_UPDATE_CHECK_SYNC");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AudioAttributesCompatParcelizer(Throwable th) throws Exception {
        RemoteActionCompatParcelizer(th, "RECENT_UPDATE_CHECK_SYNC");
    }

    public final void RatingCompat() {
        long jMediaBrowserCompatItemReceiver = this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver("video_config_last_sync");
        PlaybackSettings playbackSettings_init_lambda5 = this.MediaBrowserCompatMediaItem._init_lambda5();
        fromAdPlaybackState fromadplaybackstate = fromAdPlaybackState.read;
        if (fromAdPlaybackState.AudioAttributesCompatParcelizer(jMediaBrowserCompatItemReceiver, playbackSettings_init_lambda5.getConfigExpirySeconds())) {
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(new UserDeviceInfoModel()).write(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).RemoteActionCompatParcelizer(new getTimelineId() { // from class: o.notifySourceInfoRefreshed
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.write.IconCompatParcelizer((MarrowResponse) obj);
                }
            }, new getTimelineId() { // from class: o.discardUpstreamSampleBytes
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.read.MediaBrowserCompatItemReceiver((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void IconCompatParcelizer(MarrowResponse marrowResponse) throws Exception {
        if (marrowResponse instanceof Success) {
            PlaybackSettings playbackSettings = (PlaybackSettings) ((Success) marrowResponse).getData();
            buildResolutionString.IconCompatParcelizer("playbackSettings ---", playbackSettings.toString());
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(playbackSettings);
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer("video_config_last_sync", System.currentTimeMillis());
            return;
        }
        if ((marrowResponse instanceof Failed) || !(marrowResponse instanceof MarrowError)) {
            return;
        }
        RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "playback_settings");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void MediaBrowserCompatItemReceiver(Throwable th) throws Exception {
        RemoteActionCompatParcelizer(th, "playback_settings");
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        if (parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(System.currentTimeMillis(), this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver("userConfigLastSYnc"))) {
            this.RatingCompat.read().write(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).RemoteActionCompatParcelizer(new getTimelineId() { // from class: o.onLoaderReleased
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.read.read((MarrowResponse) obj);
                }
            }, new getTimelineId() { // from class: o.ProgressiveMediaPeriodExternalSyntheticLambda0
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.read.MediaBrowserCompatCustomActionResultReceiver((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void read(MarrowResponse marrowResponse) throws Exception {
        if (marrowResponse instanceof Success) {
            this.onCommand.read((UserConfigResponse) ((Success) marrowResponse).getData());
        } else if (marrowResponse instanceof MarrowError) {
            RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "USER_CONFIG_SYNC");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver(Throwable th) throws Exception {
        RemoteActionCompatParcelizer(th, "USER_CONFIG_SYNC");
    }

    public final void MediaMetadataCompat() {
        long jResultReceiver = this.MediaBrowserCompatMediaItem.ResultReceiver();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zAudioAttributesCompatParcelizer = parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(jCurrentTimeMillis, jResultReceiver);
        InteractiveVideoElementLSModel.Companion companion = InteractiveVideoElementLSModel.INSTANCE;
        boolean zAudioAttributesCompatParcelizer2 = InteractiveVideoElementLSModel.Companion.AudioAttributesCompatParcelizer();
        if (zAudioAttributesCompatParcelizer && zAudioAttributesCompatParcelizer2) {
            this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(this.write).AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).IconCompatParcelizer(new getTimelineId() { // from class: o.ProgressiveMediaPeriodSampleStreamImpl
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.RemoteActionCompatParcelizer.write(jCurrentTimeMillis);
                }
            }, new getTimelineId() { // from class: o.ProgressiveMediaPeriodTrackState
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void write(long j) throws Exception {
        this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AudioAttributesImplBaseParcelizer(Throwable th) throws Exception {
        RemoteActionCompatParcelizer(th, "sync_config");
    }

    private <T> void read(LessonDynamicResponseBody<MarrowResponse<T>> lessonDynamicResponseBody, final String str, final write<T> writeVar) {
        lessonDynamicResponseBody.write(this.write).AudioAttributesCompatParcelizer(this.write).RemoteActionCompatParcelizer(new getTimelineId() { // from class: o.ProgressiveMediaPeriodExtractingLoadable
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                this.IconCompatParcelizer.write(writeVar, str, (MarrowResponse) obj);
            }
        }, new getTimelineId() { // from class: o.load
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(str, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void write(write writeVar, String str, MarrowResponse marrowResponse) throws Exception {
        if (marrowResponse instanceof Success) {
            writeVar.read(((Success) marrowResponse).getData());
        } else if (marrowResponse instanceof MarrowError) {
            RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public void RemoteActionCompatParcelizer(Throwable th, String str) {
        new getPlaylistProtectionSchemes(this.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(th, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaMetadataCompat(Throwable th) {
        HashMap map = new HashMap();
        map.put("sync", "true");
        new getPlaylistProtectionSchemes(this.AudioAttributesCompatParcelizer).read(th, "image_token_fetch", map);
    }

    /* JADX INFO: renamed from: o.maybeStartDeferredRetry$5, reason: invalid class name */
    final class AnonymousClass5 extends HashMap<String, AudioAttributesCompatParcelizer> {
        AnonymousClass5() {
            put(ByteArrayDataSource.MediaMetadataCompat.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.discardSampleMetadataTo
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.IconCompatParcelizer.write();
                }
            });
            put(ByteArrayDataSource.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.getRelativeIndex
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.write.AudioAttributesCompatParcelizer();
                }
            });
            put(ByteArrayDataSource.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.commitSample
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                }
            });
            put(ByteArrayDataSource.write.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.createWithoutDrm
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.write.MediaBrowserCompatItemReceiver();
                }
            });
            put(ByteArrayDataSource.RemoteActionCompatParcelizer.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.createWithDrm
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
                }
            });
            put(ByteArrayDataSource.read.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.discardSamples
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                }
            });
            put(ByteArrayDataSource.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.countUnreadSamplesBefore
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.IconCompatParcelizer.MediaDescriptionCompat();
                }
            });
            put(ByteArrayDataSource.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.getLargestTimestamp
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.write.MediaBrowserCompatSearchResultReceiver();
                }
            });
            put(ByteArrayDataSource.MediaBrowserCompatMediaItem.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.discardUpstreamSampleMetadata
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
                }
            });
            put(ByteArrayDataSource.MediaBrowserCompatItemReceiver.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.findSampleBefore
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.read.MediaMetadataCompat();
                }
            });
            put(ByteArrayDataSource.MediaDescriptionCompat.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.discardSampleMetadataToEnd
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.read.read();
                }
            });
            put(ByteArrayDataSource.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.hasNextSample
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.read.IconCompatParcelizer();
                }
            });
            put(ByteArrayDataSource.AudioAttributesCompatParcelizer.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.peekSampleMetadata
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) {
                    this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                }
            });
            put(ByteArrayDataSource.RatingCompat.IconCompatParcelizer(), new AudioAttributesCompatParcelizer() { // from class: o.mayReadSample
                @Override // o.maybeStartDeferredRetry.AudioAttributesCompatParcelizer
                public final void IconCompatParcelizer(ByteArrayDataSource byteArrayDataSource) throws Throwable {
                    this.write.AudioAttributesImplApi26Parcelizer();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void write() {
            maybeStartDeferredRetry.this.MediaDescriptionCompat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void AudioAttributesCompatParcelizer() {
            maybeStartDeferredRetry.this.AudioAttributesImplBaseParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver() {
            maybeStartDeferredRetry.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void MediaBrowserCompatItemReceiver() {
            maybeStartDeferredRetry.this.AudioAttributesImplApi26Parcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void AudioAttributesImplBaseParcelizer() {
            maybeStartDeferredRetry.this.AudioAttributesCompatParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void AudioAttributesImplApi21Parcelizer() {
            maybeStartDeferredRetry.this.IconCompatParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void MediaDescriptionCompat() {
            maybeStartDeferredRetry.this.MediaBrowserCompatItemReceiver();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void MediaBrowserCompatSearchResultReceiver() {
            maybeStartDeferredRetry.this.MediaBrowserCompatCustomActionResultReceiver();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void MediaBrowserCompatMediaItem() {
            maybeStartDeferredRetry.this.write();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void MediaMetadataCompat() {
            maybeStartDeferredRetry.this.RatingCompat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void read() {
            maybeStartDeferredRetry.this.MediaBrowserCompatSearchResultReceiver();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void IconCompatParcelizer() {
            maybeStartDeferredRetry.this.MediaMetadataCompat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void RemoteActionCompatParcelizer() {
            maybeStartDeferredRetry.this.MediaBrowserCompatMediaItem();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void AudioAttributesImplApi26Parcelizer() throws Throwable {
            maybeStartDeferredRetry.this.AudioAttributesImplApi21Parcelizer();
        }
    }
}
