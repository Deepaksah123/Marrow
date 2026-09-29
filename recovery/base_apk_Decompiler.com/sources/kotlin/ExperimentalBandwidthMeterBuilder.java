package kotlin;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marrow2.data.inapprating.remote.model.InAppRatingThreshHoldRemoteModel;
import java.util.List;
import java.util.Map;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin.SntpClientNtpTimeCallback;
import kotlin.getSampleFormats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\b2\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\r\u0010\u0014J-\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\bH\u0096@¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b&\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010'H\u0096@¢\u0006\u0004\b(\u0010$J\u0010\u0010\r\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010!J\u0010\u0010\u0012\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0012\u0010!J\u0010\u0010&\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b&\u0010!J\u0010\u0010(\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b+\u0010!J\u0010\u0010#\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b#\u0010!J\u0010\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020,H\u0096@¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b1\u0010!J\u001a\u0010(\u001a\u0004\u0018\u0001022\u0006\u0010\u0003\u001a\u00020,H\u0096@¢\u0006\u0004\b(\u00103J\u0010\u00104\u001a\u00020,H\u0096@¢\u0006\u0004\b4\u0010!J\u0010\u00105\u001a\u00020\bH\u0096@¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b6\u0010!J\u0010\u00107\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b7\u0010!J\u0010\u0010\r\u001a\u000208H\u0096@¢\u0006\u0004\b\r\u0010$J\u0010\u00109\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b9\u0010!J\u0010\u0010:\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b:\u0010!J\u0010\u0010;\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b;\u0010!R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010="}, d2 = {"Lo/ExperimentalBandwidthMeterBuilder;", "Lo/r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc;", "Lo/setMinBytesTransferred;", "p0", "Lo/getPlatform;", "p1", "<init>", "(Lo/setMinBytesTransferred;Lo/getPlatform;)V", "", "Lkotlin/Function1;", "Lo/setBandwidthEstimator;", "", "", "IconCompatParcelizer", "(JLo/getAnswerMap;)V", "AudioAttributesImplApi26Parcelizer", "()V", "", "write", "(Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;)Z", "", "", "Lo/writeTimestamp;", "onCommand", "()Ljava/util/Map;", "MediaBrowserCompatMediaItem", "()Z", "RatingCompat", "()Ljava/lang/String;", "onAddQueueItem", "onPlay", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/Object;", "Lo/ExperimentalBandwidthMeterExternalSyntheticLambda0;", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/SlidingPercentileBandwidthStatisticSample;", "read", "Lo/PercentileTimeToFirstByteEstimator;", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onFastForward", "MediaMetadataCompat", "MediaDescriptionCompat", "onPlayFromMediaId", "Lo/resolveReportedUri;", "(I)Ljava/lang/Object;", "handleMediaPlayPauseIfPendingOnHandler", "onCustomAction", "onMediaButtonEvent", "MediaBrowserCompatItemReceiver", "Lo/setTimeToFirstByteEstimator;", "onPause", "onPrepareFromMediaId", "onPrepareFromSearch", "Lo/setMinBytesTransferred;", "Lo/getPlatform;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExperimentalBandwidthMeterBuilder implements r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setMinBytesTransferred IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getPlatform AudioAttributesCompatParcelizer;
    private static final String read = "yoa_start_year";
    private static final String IconCompatParcelizer = "KYC_document_type";
    private static final String AudioAttributesCompatParcelizer = "apprating_threshold";

    @setSdkPayload
    public ExperimentalBandwidthMeterBuilder(setMinBytesTransferred setminbytestransferred, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(setminbytestransferred, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.IconCompatParcelizer = setminbytestransferred;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final void IconCompatParcelizer(long p0, getAnswerMap<? super setBandwidthEstimator<Boolean>, getShowPopup> p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        this.IconCompatParcelizer.write(p0, p1);
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final void AudioAttributesImplApi26Parcelizer() {
        this.IconCompatParcelizer.write();
    }

    public final String write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.IconCompatParcelizer.read(p0);
    }

    public final boolean IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.IconCompatParcelizer.write(p0);
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Map<String, Map<String, List<writeTimestamp>>> onCommand() {
        if (IconCompatParcelizer("Marrow2Configuration")) {
            SntpClientNtpTimeCallback.Companion companion = SntpClientNtpTimeCallback.INSTANCE;
            return SntpClientNtpTimeCallback.Companion.IconCompatParcelizer(write("Marrow2Configuration"));
        }
        return VideoTimelineResponseBody.read();
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final boolean MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer("disable_feedback");
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final String RatingCompat() {
        return this.IconCompatParcelizer.read("disable_msg");
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final String onAddQueueItem() {
        return this.IconCompatParcelizer.read("disable_tiel");
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final String onPlay() {
        return this.IconCompatParcelizer.read(read);
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object MediaBrowserCompatSearchResultReceiver() {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer("eoi_callback_restriction"));
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super ExperimentalBandwidthMeterExternalSyntheticLambda0>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (ExperimentalBandwidthMeterBuilder.this.IconCompatParcelizer(ExperimentalBandwidthMeterBuilder.IconCompatParcelizer)) {
                SntpClientNtpTimeCallback.Companion companion = SntpClientNtpTimeCallback.INSTANCE;
                return SntpClientNtpTimeCallback.Companion.write(ExperimentalBandwidthMeterBuilder.this.write(ExperimentalBandwidthMeterBuilder.IconCompatParcelizer));
            }
            return new ExperimentalBandwidthMeterExternalSyntheticLambda0(null, null, 3, null);
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ExperimentalBandwidthMeterBuilder.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super ExperimentalBandwidthMeterExternalSyntheticLambda0> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super ExperimentalBandwidthMeterExternalSyntheticLambda0> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new IconCompatParcelizer(null), sampleVideos);
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super SlidingPercentileBandwidthStatisticSample>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (ExperimentalBandwidthMeterBuilder.this.IconCompatParcelizer("revisionSubjectConfig")) {
                SntpClientNtpTimeCallback.Companion companion = SntpClientNtpTimeCallback.INSTANCE;
                return SntpClientNtpTimeCallback.Companion.read(ExperimentalBandwidthMeterBuilder.this.write("revisionSubjectConfig"));
            }
            return new SlidingPercentileBandwidthStatisticSample(false, null, 3, null);
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ExperimentalBandwidthMeterBuilder.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super SlidingPercentileBandwidthStatisticSample> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object read(SampleVideos<? super SlidingPercentileBandwidthStatisticSample> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new AudioAttributesImplApi26Parcelizer(null), sampleVideos);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super PercentileTimeToFirstByteEstimator>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (!ExperimentalBandwidthMeterBuilder.this.IconCompatParcelizer("notes_unavailable_config")) {
                return null;
            }
            SntpClientNtpTimeCallback.Companion companion = SntpClientNtpTimeCallback.INSTANCE;
            return SntpClientNtpTimeCallback.Companion.AudioAttributesCompatParcelizer(ExperimentalBandwidthMeterBuilder.this.write("notes_unavailable_config"));
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ExperimentalBandwidthMeterBuilder.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super PercentileTimeToFirstByteEstimator> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super PercentileTimeToFirstByteEstimator> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new write(null), sampleVideos);
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object IconCompatParcelizer() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.AudioAttributesCompatParcelizer(setminbytestransferred.RemoteActionCompatParcelizer(getSampleFormats.Companion.onMediaButtonEvent()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object write() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.AudioAttributesCompatParcelizer(setminbytestransferred.RemoteActionCompatParcelizer(getSampleFormats.Companion.onFastForward()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object read() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.AudioAttributesCompatParcelizer(setminbytestransferred.RemoteActionCompatParcelizer(getSampleFormats.Companion.onCustomAction()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object RemoteActionCompatParcelizer() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.AudioAttributesCompatParcelizer(setminbytestransferred.RemoteActionCompatParcelizer(getSampleFormats.Companion.handleMediaPlayPauseIfPendingOnHandler()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object AudioAttributesImplBaseParcelizer() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.AudioAttributesCompatParcelizer(setminbytestransferred.RemoteActionCompatParcelizer(getSampleFormats.Companion.onCommand()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object MediaBrowserCompatCustomActionResultReceiver() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.AudioAttributesCompatParcelizer(setminbytestransferred.RemoteActionCompatParcelizer(getSampleFormats.Companion.RatingCompat()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object AudioAttributesImplApi21Parcelizer() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.AudioAttributesCompatParcelizer(setminbytestransferred.RemoteActionCompatParcelizer(getSampleFormats.Companion.MediaBrowserCompatSearchResultReceiver()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object AudioAttributesCompatParcelizer() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.AudioAttributesCompatParcelizer(setminbytestransferred.RemoteActionCompatParcelizer(getSampleFormats.Companion.AudioAttributesCompatParcelizer()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.RemoteActionCompatParcelizer(setminbytestransferred.AudioAttributesCompatParcelizer(getSampleFormats.Companion.AudioAttributesImplApi21Parcelizer()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object onFastForward() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return setminbytestransferred.read(getSampleFormats.Companion.AudioAttributesImplApi26Parcelizer());
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object MediaMetadataCompat() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.AudioAttributesCompatParcelizer(setminbytestransferred.RemoteActionCompatParcelizer(getSampleFormats.Companion.RemoteActionCompatParcelizer()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object MediaDescriptionCompat() {
        setMinBytesTransferred setminbytestransferred = this.IconCompatParcelizer;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        return QBankStatsResponse.RemoteActionCompatParcelizer(setminbytestransferred.AudioAttributesCompatParcelizer(getSampleFormats.Companion.IconCompatParcelizer()));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object onPlayFromMediaId() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer("is_playstore_install_enforced"));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object RemoteActionCompatParcelizer(int p0) throws Throwable {
        Map map;
        InAppRatingThreshHoldRemoteModel inAppRatingThreshHoldRemoteModel;
        try {
            map = (Map) new ObjectMapper().readValue(this.IconCompatParcelizer.read(AudioAttributesCompatParcelizer), new read());
        } catch (Exception e) {
            buildResolutionString.read(e);
            map = null;
        }
        if (map == null || (inAppRatingThreshHoldRemoteModel = (InAppRatingThreshHoldRemoteModel) map.getOrDefault(String.valueOf(p0), null)) == null) {
            return null;
        }
        return resolveDataSpec.write(inAppRatingThreshHoldRemoteModel);
    }

    public static final class read extends TypeReference<Map<String, ? extends InAppRatingThreshHoldRemoteModel>> {
        read() {
        }
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object handleMediaPlayPauseIfPendingOnHandler() {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.AudioAttributesCompatParcelizer("notification_permission_snackbar_duration"));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object onCustomAction() {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer("notification_permission_trigger_days"));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object onMediaButtonEvent() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer("wor_interactive_mcq_nudge"));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object MediaBrowserCompatItemReceiver() {
        return this.IconCompatParcelizer.read("cadaveric_subject_id");
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super setTimeToFirstByteEstimator>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (!ExperimentalBandwidthMeterBuilder.this.IconCompatParcelizer("mcq_video_logging_config")) {
                return new setTimeToFirstByteEstimator(false, false, 3, null);
            }
            ExperimentalBandwidthMeterBuilder experimentalBandwidthMeterBuilder = ExperimentalBandwidthMeterBuilder.this;
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                SntpClientNtpTimeCallback.Companion companion = SntpClientNtpTimeCallback.INSTANCE;
                obj2 = C0177getRfBanners.read(SntpClientNtpTimeCallback.Companion.RemoteActionCompatParcelizer(experimentalBandwidthMeterBuilder.write("mcq_video_logging_config")));
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                obj2 = C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            return C0177getRfBanners.RemoteActionCompatParcelizer(obj2) ? new setTimeToFirstByteEstimator(false, false, 3, null) : obj2;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = ExperimentalBandwidthMeterBuilder.this.new AudioAttributesCompatParcelizer(sampleVideos);
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = obj;
            return audioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super setTimeToFirstByteEstimator> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object IconCompatParcelizer(SampleVideos<? super setTimeToFirstByteEstimator> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new AudioAttributesCompatParcelizer(null), sampleVideos);
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object onPause() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer("ed8_5_zen_area_enabled"));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object onPrepareFromMediaId() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer("zen_water_ripple_enabled"));
    }

    @Override // kotlin.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc
    public final Object onPrepareFromSearch() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer("zen_water_ripple_sound_enabled"));
    }
}
