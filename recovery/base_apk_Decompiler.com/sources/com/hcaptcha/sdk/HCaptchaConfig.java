package com.hcaptcha.sdk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Locale;
import kotlin.DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda0;
import kotlin.DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4;
import kotlin.FilteringMediaSourceFilteringMediaPeriod;
import kotlin.IcyDataSourceListener;
import kotlin.LoadEventInfo;
import kotlin.LoopingMediaSourceLoopingTimeline;
import kotlin.open;

/* JADX INFO: loaded from: classes3.dex */
public class HCaptchaConfig implements Serializable {

    @JsonIgnore
    @Deprecated
    private String apiEndpoint;
    private String assethost;
    private String customTheme;
    private Boolean diagnosticLog;
    private Boolean disableHardwareAcceleration;
    private String endpoint;
    private Boolean hideDialog;
    private String host;
    private String imghost;
    private String jsSrc;
    private Boolean loading;
    private String locale;
    private IcyDataSourceListener orientation;
    private String reportapi;

    @Deprecated
    private Boolean resetOnTimeout;

    @JsonIgnore
    private LoopingMediaSourceLoopingTimeline retryPredicate;
    private String rqdata;
    private Boolean sentry;
    private String siteKey;
    private open size;
    private LoadEventInfo theme;
    private long tokenExpiration;

    public static class RemoteActionCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private Boolean AudioAttributesImplApi21Parcelizer;
        private String AudioAttributesImplApi26Parcelizer;
        private Boolean AudioAttributesImplBaseParcelizer;
        private String IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private Boolean MediaBrowserCompatMediaItem;
        private boolean MediaBrowserCompatSearchResultReceiver;
        private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private String MediaDescriptionCompat;
        private boolean MediaMetadataCompat;
        private String RatingCompat;
        private String RemoteActionCompatParcelizer;
        private String handleMediaPlayPauseIfPendingOnHandler;
        private boolean onAddQueueItem;
        private Boolean onCommand;
        private boolean onCustomAction;
        private boolean onFastForward;
        private String onMediaButtonEvent;
        private boolean onPause;
        private String onPlay;
        private IcyDataSourceListener onPlayFromMediaId;
        private LoopingMediaSourceLoopingTimeline onPlayFromSearch;
        private String onPlayFromUri;
        private boolean onPrepare;
        private Boolean onPrepareFromMediaId;
        private boolean onPrepareFromSearch;
        private boolean onPrepareFromUri;
        private boolean onRemoveQueueItem;
        private String onRemoveQueueItemAt;
        private Boolean onRewind;
        private open onSeekTo;
        private long onSetPlaybackSpeed;
        private LoadEventInfo onSetRepeatMode;
        private boolean onSetShuffleMode;
        private boolean read;
        private String write;

        @Deprecated
        public final RemoteActionCompatParcelizer write(String str) {
            AudioAttributesImplApi26Parcelizer(str);
            return this;
        }

        public final RemoteActionCompatParcelizer read(String str) {
            this.write = str;
            return this;
        }

        public final HCaptchaConfig RemoteActionCompatParcelizer() {
            Boolean bool$default$sentry = this.onRewind;
            if (!this.onPrepare) {
                bool$default$sentry = HCaptchaConfig.$default$sentry();
            }
            Boolean bool = bool$default$sentry;
            Boolean bool$default$loading = this.onCommand;
            if (!this.onAddQueueItem) {
                bool$default$loading = HCaptchaConfig.$default$loading();
            }
            Boolean bool2 = bool$default$loading;
            Boolean bool$default$hideDialog = this.MediaBrowserCompatMediaItem;
            if (!this.MediaMetadataCompat) {
                bool$default$hideDialog = HCaptchaConfig.$default$hideDialog();
            }
            Boolean bool3 = bool$default$hideDialog;
            String str$default$apiEndpoint = HCaptchaConfig.$default$apiEndpoint();
            String str$default$jsSrc = this.handleMediaPlayPauseIfPendingOnHandler;
            if (!this.onCustomAction) {
                str$default$jsSrc = HCaptchaConfig.$default$jsSrc();
            }
            String str = str$default$jsSrc;
            String str$default$locale = this.onMediaButtonEvent;
            if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                str$default$locale = HCaptchaConfig.$default$locale();
            }
            String str2 = str$default$locale;
            open openVar$default$size = this.onSeekTo;
            if (!this.onRemoveQueueItem) {
                openVar$default$size = HCaptchaConfig.$default$size();
            }
            open openVar = openVar$default$size;
            IcyDataSourceListener icyDataSourceListener$default$orientation = this.onPlayFromMediaId;
            if (!this.onPause) {
                icyDataSourceListener$default$orientation = HCaptchaConfig.$default$orientation();
            }
            IcyDataSourceListener icyDataSourceListener = icyDataSourceListener$default$orientation;
            LoadEventInfo loadEventInfo$default$theme = this.onSetRepeatMode;
            if (!this.onPrepareFromUri) {
                loadEventInfo$default$theme = HCaptchaConfig.$default$theme();
            }
            LoadEventInfo loadEventInfo = loadEventInfo$default$theme;
            String str$default$host = this.RatingCompat;
            if (!this.MediaBrowserCompatSearchResultReceiver) {
                str$default$host = HCaptchaConfig.$default$host();
            }
            String str3 = str$default$host;
            String str$default$customTheme = this.RemoteActionCompatParcelizer;
            if (!this.read) {
                str$default$customTheme = HCaptchaConfig.$default$customTheme();
            }
            String str4 = str$default$customTheme;
            Boolean bool$default$resetOnTimeout = this.onPrepareFromMediaId;
            if (!this.onFastForward) {
                bool$default$resetOnTimeout = HCaptchaConfig.$default$resetOnTimeout();
            }
            Boolean bool4 = bool$default$resetOnTimeout;
            LoopingMediaSourceLoopingTimeline loopingMediaSourceLoopingTimeline$default$retryPredicate = this.onPlayFromSearch;
            if (!this.onPrepareFromSearch) {
                loopingMediaSourceLoopingTimeline$default$retryPredicate = HCaptchaConfig.$default$retryPredicate();
            }
            LoopingMediaSourceLoopingTimeline loopingMediaSourceLoopingTimeline = loopingMediaSourceLoopingTimeline$default$retryPredicate;
            long j$default$tokenExpiration = this.onSetPlaybackSpeed;
            if (!this.onSetShuffleMode) {
                j$default$tokenExpiration = HCaptchaConfig.$default$tokenExpiration();
            }
            long j = j$default$tokenExpiration;
            Boolean bool$default$diagnosticLog = this.AudioAttributesImplBaseParcelizer;
            if (!this.MediaBrowserCompatItemReceiver) {
                bool$default$diagnosticLog = HCaptchaConfig.$default$diagnosticLog();
            }
            Boolean bool5 = bool$default$diagnosticLog;
            Boolean bool$default$disableHardwareAcceleration = this.AudioAttributesImplApi21Parcelizer;
            if (!this.MediaBrowserCompatCustomActionResultReceiver) {
                bool$default$disableHardwareAcceleration = HCaptchaConfig.$default$disableHardwareAcceleration();
            }
            return new HCaptchaConfig(this.onRemoveQueueItemAt, bool, bool2, bool3, this.onPlayFromUri, str$default$apiEndpoint, str, this.AudioAttributesImplApi26Parcelizer, this.onPlay, this.write, this.MediaDescriptionCompat, str2, openVar, icyDataSourceListener, loadEventInfo, str3, str4, bool4, loopingMediaSourceLoopingTimeline, j, bool5, bool$default$disableHardwareAcceleration);
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer = str;
            this.read = true;
            return this;
        }

        public final RemoteActionCompatParcelizer read(Boolean bool) {
            this.AudioAttributesImplBaseParcelizer = bool;
            this.MediaBrowserCompatItemReceiver = true;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(Boolean bool) {
            if (bool == null) {
                throw new NullPointerException("disableHardwareAcceleration is marked non-null but is null");
            }
            this.AudioAttributesImplApi21Parcelizer = bool;
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.AudioAttributesImplApi26Parcelizer = str;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(Boolean bool) {
            this.MediaBrowserCompatMediaItem = bool;
            this.MediaMetadataCompat = true;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            this.RatingCompat = str;
            this.MediaBrowserCompatSearchResultReceiver = true;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(String str) {
            this.MediaDescriptionCompat = str;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer(String str) {
            this.handleMediaPlayPauseIfPendingOnHandler = str;
            this.onCustomAction = true;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(Boolean bool) {
            this.onCommand = bool;
            this.onAddQueueItem = true;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver(String str) {
            this.onMediaButtonEvent = str;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
            return this;
        }

        public final RemoteActionCompatParcelizer write(IcyDataSourceListener icyDataSourceListener) {
            this.onPlayFromMediaId = icyDataSourceListener;
            this.onPause = true;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer(String str) {
            this.onPlay = str;
            return this;
        }

        @Deprecated
        public final RemoteActionCompatParcelizer write(Boolean bool) {
            this.onPrepareFromMediaId = bool;
            this.onFastForward = true;
            return this;
        }

        @JsonIgnore
        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(LoopingMediaSourceLoopingTimeline loopingMediaSourceLoopingTimeline) {
            this.onPlayFromSearch = loopingMediaSourceLoopingTimeline;
            this.onPrepareFromSearch = true;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer(String str) {
            this.onPlayFromUri = str;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer(Boolean bool) {
            this.onRewind = bool;
            this.onPrepare = true;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaMetadataCompat(String str) {
            if (str == null) {
                throw new NullPointerException("siteKey is marked non-null but is null");
            }
            this.onRemoveQueueItemAt = str;
            return this;
        }

        public final RemoteActionCompatParcelizer read(open openVar) {
            this.onSeekTo = openVar;
            this.onRemoveQueueItem = true;
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(LoadEventInfo loadEventInfo) {
            this.onSetRepeatMode = loadEventInfo;
            this.onPrepareFromUri = true;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HCaptchaConfig.HCaptchaConfigBuilder(siteKey=");
            sb.append(this.onRemoveQueueItemAt);
            sb.append(", sentry$value=");
            sb.append(this.onRewind);
            sb.append(", loading$value=");
            sb.append(this.onCommand);
            sb.append(", hideDialog$value=");
            sb.append(this.MediaBrowserCompatMediaItem);
            sb.append(", rqdata=");
            sb.append(this.onPlayFromUri);
            sb.append(", apiEndpoint$value=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", jsSrc$value=");
            sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
            sb.append(", endpoint=");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(", reportapi=");
            sb.append(this.onPlay);
            sb.append(", assethost=");
            sb.append(this.write);
            sb.append(", imghost=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", locale$value=");
            sb.append(this.onMediaButtonEvent);
            sb.append(", size$value=");
            sb.append(this.onSeekTo);
            sb.append(", orientation$value=");
            sb.append(this.onPlayFromMediaId);
            sb.append(", theme$value=");
            sb.append(this.onSetRepeatMode);
            sb.append(", host$value=");
            sb.append(this.RatingCompat);
            sb.append(", customTheme$value=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", resetOnTimeout$value=");
            sb.append(this.onPrepareFromMediaId);
            sb.append(", retryPredicate$value=");
            sb.append(this.onPlayFromSearch);
            sb.append(", tokenExpiration$value=");
            sb.append(this.onSetPlaybackSpeed);
            sb.append(", diagnosticLog$value=");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            sb.append(", disableHardwareAcceleration$value=");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            sb.append(")");
            return sb.toString();
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(long j) {
            this.onSetPlaybackSpeed = j;
            this.onSetShuffleMode = true;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String $default$apiEndpoint() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String $default$customTheme() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String $default$host() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long $default$tokenExpiration() {
        return 120L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean $default$diagnosticLog() {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean $default$disableHardwareAcceleration() {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean $default$hideDialog() {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String $default$jsSrc() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean $default$loading() {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String $default$locale() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IcyDataSourceListener $default$orientation() {
        return IcyDataSourceListener.PORTRAIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean $default$resetOnTimeout() {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LoopingMediaSourceLoopingTimeline $default$retryPredicate() {
        return new DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean $default$sentry() {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static open $default$size() {
        return open.INVISIBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LoadEventInfo $default$theme() {
        return LoadEventInfo.LIGHT;
    }

    public HCaptchaConfig(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, open openVar, IcyDataSourceListener icyDataSourceListener, LoadEventInfo loadEventInfo, String str10, String str11, Boolean bool4, LoopingMediaSourceLoopingTimeline loopingMediaSourceLoopingTimeline, long j, Boolean bool5, Boolean bool6) {
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        if (bool6 == null) {
            throw new NullPointerException("disableHardwareAcceleration is marked non-null but is null");
        }
        this.siteKey = str;
        this.sentry = bool;
        this.loading = bool2;
        this.hideDialog = bool3;
        this.rqdata = str2;
        this.apiEndpoint = str3;
        this.jsSrc = str4;
        this.endpoint = str5;
        this.reportapi = str6;
        this.assethost = str7;
        this.imghost = str8;
        this.locale = str9;
        this.size = openVar;
        this.orientation = icyDataSourceListener;
        this.theme = loadEventInfo;
        this.host = str10;
        this.customTheme = str11;
        this.resetOnTimeout = bool4;
        this.retryPredicate = loopingMediaSourceLoopingTimeline;
        this.tokenExpiration = j;
        this.diagnosticLog = bool5;
        this.disableHardwareAcceleration = bool6;
    }

    public static RemoteActionCompatParcelizer builder() {
        return new RemoteActionCompatParcelizer();
    }

    public static /* synthetic */ boolean lambda$$default$retryPredicate$41a513e9$1(HCaptchaConfig hCaptchaConfig, FilteringMediaSourceFilteringMediaPeriod filteringMediaSourceFilteringMediaPeriod) {
        return Boolean.TRUE.equals(hCaptchaConfig.resetOnTimeout) && filteringMediaSourceFilteringMediaPeriod.AudioAttributesCompatParcelizer() == DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4.SESSION_TIMEOUT;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HCaptchaConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HCaptchaConfig)) {
            return false;
        }
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) obj;
        if (!hCaptchaConfig.canEqual(this) || getTokenExpiration() != hCaptchaConfig.getTokenExpiration()) {
            return false;
        }
        Boolean sentry = getSentry();
        Boolean sentry2 = hCaptchaConfig.getSentry();
        if (sentry != null ? !sentry.equals(sentry2) : sentry2 != null) {
            return false;
        }
        Boolean loading = getLoading();
        Boolean loading2 = hCaptchaConfig.getLoading();
        if (loading != null ? !loading.equals(loading2) : loading2 != null) {
            return false;
        }
        Boolean hideDialog = getHideDialog();
        Boolean hideDialog2 = hCaptchaConfig.getHideDialog();
        if (hideDialog != null ? !hideDialog.equals(hideDialog2) : hideDialog2 != null) {
            return false;
        }
        Boolean resetOnTimeout = getResetOnTimeout();
        Boolean resetOnTimeout2 = hCaptchaConfig.getResetOnTimeout();
        if (resetOnTimeout != null ? !resetOnTimeout.equals(resetOnTimeout2) : resetOnTimeout2 != null) {
            return false;
        }
        Boolean diagnosticLog = getDiagnosticLog();
        Boolean diagnosticLog2 = hCaptchaConfig.getDiagnosticLog();
        if (diagnosticLog != null ? !diagnosticLog.equals(diagnosticLog2) : diagnosticLog2 != null) {
            return false;
        }
        Boolean disableHardwareAcceleration = getDisableHardwareAcceleration();
        Boolean disableHardwareAcceleration2 = hCaptchaConfig.getDisableHardwareAcceleration();
        if (disableHardwareAcceleration != null ? !disableHardwareAcceleration.equals(disableHardwareAcceleration2) : disableHardwareAcceleration2 != null) {
            return false;
        }
        String siteKey = getSiteKey();
        String siteKey2 = hCaptchaConfig.getSiteKey();
        if (siteKey != null ? !siteKey.equals(siteKey2) : siteKey2 != null) {
            return false;
        }
        String rqdata = getRqdata();
        String rqdata2 = hCaptchaConfig.getRqdata();
        if (rqdata != null ? !rqdata.equals(rqdata2) : rqdata2 != null) {
            return false;
        }
        String apiEndpoint = getApiEndpoint();
        String apiEndpoint2 = hCaptchaConfig.getApiEndpoint();
        if (apiEndpoint != null ? !apiEndpoint.equals(apiEndpoint2) : apiEndpoint2 != null) {
            return false;
        }
        String jsSrc = getJsSrc();
        String jsSrc2 = hCaptchaConfig.getJsSrc();
        if (jsSrc != null ? !jsSrc.equals(jsSrc2) : jsSrc2 != null) {
            return false;
        }
        String endpoint = getEndpoint();
        String endpoint2 = hCaptchaConfig.getEndpoint();
        if (endpoint != null ? !endpoint.equals(endpoint2) : endpoint2 != null) {
            return false;
        }
        String reportapi = getReportapi();
        String reportapi2 = hCaptchaConfig.getReportapi();
        if (reportapi != null ? !reportapi.equals(reportapi2) : reportapi2 != null) {
            return false;
        }
        String assethost = getAssethost();
        String assethost2 = hCaptchaConfig.getAssethost();
        if (assethost != null ? !assethost.equals(assethost2) : assethost2 != null) {
            return false;
        }
        String imghost = getImghost();
        String imghost2 = hCaptchaConfig.getImghost();
        if (imghost != null ? !imghost.equals(imghost2) : imghost2 != null) {
            return false;
        }
        String locale = getLocale();
        String locale2 = hCaptchaConfig.getLocale();
        if (locale != null ? !locale.equals(locale2) : locale2 != null) {
            return false;
        }
        open size = getSize();
        open size2 = hCaptchaConfig.getSize();
        if (size != null ? !size.equals(size2) : size2 != null) {
            return false;
        }
        IcyDataSourceListener orientation = getOrientation();
        IcyDataSourceListener orientation2 = hCaptchaConfig.getOrientation();
        if (orientation != null ? !orientation.equals(orientation2) : orientation2 != null) {
            return false;
        }
        LoadEventInfo theme = getTheme();
        LoadEventInfo theme2 = hCaptchaConfig.getTheme();
        if (theme != null ? !theme.equals(theme2) : theme2 != null) {
            return false;
        }
        String host = getHost();
        String host2 = hCaptchaConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        String customTheme = getCustomTheme();
        String customTheme2 = hCaptchaConfig.getCustomTheme();
        if (customTheme != null ? !customTheme.equals(customTheme2) : customTheme2 != null) {
            return false;
        }
        LoopingMediaSourceLoopingTimeline retryPredicate = getRetryPredicate();
        LoopingMediaSourceLoopingTimeline retryPredicate2 = hCaptchaConfig.getRetryPredicate();
        return retryPredicate != null ? retryPredicate.equals(retryPredicate2) : retryPredicate2 == null;
    }

    @Deprecated
    public String getApiEndpoint() {
        return this.jsSrc;
    }

    public String getAssethost() {
        return this.assethost;
    }

    public String getCustomTheme() {
        return this.customTheme;
    }

    public Boolean getDiagnosticLog() {
        return this.diagnosticLog;
    }

    public Boolean getDisableHardwareAcceleration() {
        return this.disableHardwareAcceleration;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public Boolean getHideDialog() {
        return this.hideDialog;
    }

    public String getHost() {
        return this.host;
    }

    public String getImghost() {
        return this.imghost;
    }

    public String getJsSrc() {
        return this.jsSrc;
    }

    public Boolean getLoading() {
        return this.loading;
    }

    public String getLocale() {
        return this.locale;
    }

    public IcyDataSourceListener getOrientation() {
        return this.orientation;
    }

    public String getReportapi() {
        return this.reportapi;
    }

    @Deprecated
    public Boolean getResetOnTimeout() {
        return this.resetOnTimeout;
    }

    public LoopingMediaSourceLoopingTimeline getRetryPredicate() {
        return this.retryPredicate;
    }

    public String getRqdata() {
        return this.rqdata;
    }

    public Boolean getSentry() {
        return this.sentry;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    public open getSize() {
        return this.size;
    }

    public LoadEventInfo getTheme() {
        return this.theme;
    }

    public long getTokenExpiration() {
        return this.tokenExpiration;
    }

    public int hashCode() {
        long tokenExpiration = getTokenExpiration();
        int i = (int) (tokenExpiration ^ (tokenExpiration >>> 32));
        Boolean sentry = getSentry();
        int iHashCode = sentry == null ? 43 : sentry.hashCode();
        Boolean loading = getLoading();
        int iHashCode2 = loading == null ? 43 : loading.hashCode();
        Boolean hideDialog = getHideDialog();
        int iHashCode3 = hideDialog == null ? 43 : hideDialog.hashCode();
        Boolean resetOnTimeout = getResetOnTimeout();
        int iHashCode4 = resetOnTimeout == null ? 43 : resetOnTimeout.hashCode();
        Boolean diagnosticLog = getDiagnosticLog();
        int iHashCode5 = diagnosticLog == null ? 43 : diagnosticLog.hashCode();
        Boolean disableHardwareAcceleration = getDisableHardwareAcceleration();
        int iHashCode6 = disableHardwareAcceleration == null ? 43 : disableHardwareAcceleration.hashCode();
        String siteKey = getSiteKey();
        int iHashCode7 = siteKey == null ? 43 : siteKey.hashCode();
        String rqdata = getRqdata();
        int iHashCode8 = rqdata == null ? 43 : rqdata.hashCode();
        String apiEndpoint = getApiEndpoint();
        int iHashCode9 = apiEndpoint == null ? 43 : apiEndpoint.hashCode();
        String jsSrc = getJsSrc();
        int iHashCode10 = jsSrc == null ? 43 : jsSrc.hashCode();
        String endpoint = getEndpoint();
        int iHashCode11 = endpoint == null ? 43 : endpoint.hashCode();
        String reportapi = getReportapi();
        int iHashCode12 = reportapi == null ? 43 : reportapi.hashCode();
        String assethost = getAssethost();
        int iHashCode13 = assethost == null ? 43 : assethost.hashCode();
        String imghost = getImghost();
        int iHashCode14 = imghost == null ? 43 : imghost.hashCode();
        String locale = getLocale();
        int iHashCode15 = locale == null ? 43 : locale.hashCode();
        open size = getSize();
        int iHashCode16 = size == null ? 43 : size.hashCode();
        IcyDataSourceListener orientation = getOrientation();
        int iHashCode17 = orientation == null ? 43 : orientation.hashCode();
        LoadEventInfo theme = getTheme();
        int iHashCode18 = theme == null ? 43 : theme.hashCode();
        String host = getHost();
        int iHashCode19 = host == null ? 43 : host.hashCode();
        String customTheme = getCustomTheme();
        int iHashCode20 = customTheme == null ? 43 : customTheme.hashCode();
        LoopingMediaSourceLoopingTimeline retryPredicate = getRetryPredicate();
        return ((((((((((((((((((((((((((((((((((((((((((i + 59) * 59) + iHashCode) * 59) + iHashCode2) * 59) + iHashCode3) * 59) + iHashCode4) * 59) + iHashCode5) * 59) + iHashCode6) * 59) + iHashCode7) * 59) + iHashCode8) * 59) + iHashCode9) * 59) + iHashCode10) * 59) + iHashCode11) * 59) + iHashCode12) * 59) + iHashCode13) * 59) + iHashCode14) * 59) + iHashCode15) * 59) + iHashCode16) * 59) + iHashCode17) * 59) + iHashCode18) * 59) + iHashCode19) * 59) + iHashCode20) * 59) + (retryPredicate != null ? retryPredicate.hashCode() : 43);
    }

    @JsonIgnore
    @Deprecated
    public void setApiEndpoint(String str) {
        this.apiEndpoint = str;
    }

    public void setAssethost(String str) {
        this.assethost = str;
    }

    public void setCustomTheme(String str) {
        this.customTheme = str;
    }

    public void setDiagnosticLog(Boolean bool) {
        this.diagnosticLog = bool;
    }

    public void setDisableHardwareAcceleration(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("disableHardwareAcceleration is marked non-null but is null");
        }
        this.disableHardwareAcceleration = bool;
    }

    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    public void setHideDialog(Boolean bool) {
        this.hideDialog = bool;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setImghost(String str) {
        this.imghost = str;
    }

    public void setJsSrc(String str) {
        this.jsSrc = str;
    }

    public void setLoading(Boolean bool) {
        this.loading = bool;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setOrientation(IcyDataSourceListener icyDataSourceListener) {
        this.orientation = icyDataSourceListener;
    }

    public void setReportapi(String str) {
        this.reportapi = str;
    }

    @Deprecated
    public void setResetOnTimeout(Boolean bool) {
        this.resetOnTimeout = bool;
    }

    @JsonIgnore
    public void setRetryPredicate(LoopingMediaSourceLoopingTimeline loopingMediaSourceLoopingTimeline) {
        this.retryPredicate = loopingMediaSourceLoopingTimeline;
    }

    public void setRqdata(String str) {
        this.rqdata = str;
    }

    public void setSentry(Boolean bool) {
        this.sentry = bool;
    }

    public void setSiteKey(String str) {
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        this.siteKey = str;
    }

    public void setSize(open openVar) {
        this.size = openVar;
    }

    public void setTheme(LoadEventInfo loadEventInfo) {
        this.theme = loadEventInfo;
    }

    public void setTokenExpiration(long j) {
        this.tokenExpiration = j;
    }

    public RemoteActionCompatParcelizer toBuilder() {
        return new RemoteActionCompatParcelizer().MediaMetadataCompat(this.siteKey).AudioAttributesImplBaseParcelizer(this.sentry).IconCompatParcelizer(this.loading).AudioAttributesCompatParcelizer(this.hideDialog).AudioAttributesImplApi21Parcelizer(this.rqdata).write(this.apiEndpoint).AudioAttributesImplApi26Parcelizer(this.jsSrc).RemoteActionCompatParcelizer(this.endpoint).AudioAttributesImplBaseParcelizer(this.reportapi).read(this.assethost).MediaBrowserCompatCustomActionResultReceiver(this.imghost).MediaBrowserCompatItemReceiver(this.locale).read(this.size).write(this.orientation).IconCompatParcelizer(this.theme).AudioAttributesCompatParcelizer(this.host).IconCompatParcelizer(this.customTheme).write(this.resetOnTimeout).AudioAttributesCompatParcelizer(this.retryPredicate).IconCompatParcelizer(this.tokenExpiration).read(this.diagnosticLog).RemoteActionCompatParcelizer(this.disableHardwareAcceleration);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HCaptchaConfig(siteKey=");
        sb.append(getSiteKey());
        sb.append(", sentry=");
        sb.append(getSentry());
        sb.append(", loading=");
        sb.append(getLoading());
        sb.append(", hideDialog=");
        sb.append(getHideDialog());
        sb.append(", rqdata=");
        sb.append(getRqdata());
        sb.append(", apiEndpoint=");
        sb.append(getApiEndpoint());
        sb.append(", jsSrc=");
        sb.append(getJsSrc());
        sb.append(", endpoint=");
        sb.append(getEndpoint());
        sb.append(", reportapi=");
        sb.append(getReportapi());
        sb.append(", assethost=");
        sb.append(getAssethost());
        sb.append(", imghost=");
        sb.append(getImghost());
        sb.append(", locale=");
        sb.append(getLocale());
        sb.append(", size=");
        sb.append(getSize());
        sb.append(", orientation=");
        sb.append(getOrientation());
        sb.append(", theme=");
        sb.append(getTheme());
        sb.append(", host=");
        sb.append(getHost());
        sb.append(", customTheme=");
        sb.append(getCustomTheme());
        sb.append(", resetOnTimeout=");
        sb.append(getResetOnTimeout());
        sb.append(", retryPredicate=");
        sb.append(getRetryPredicate());
        sb.append(", tokenExpiration=");
        sb.append(getTokenExpiration());
        sb.append(", diagnosticLog=");
        sb.append(getDiagnosticLog());
        sb.append(", disableHardwareAcceleration=");
        sb.append(getDisableHardwareAcceleration());
        sb.append(")");
        return sb.toString();
    }
}
