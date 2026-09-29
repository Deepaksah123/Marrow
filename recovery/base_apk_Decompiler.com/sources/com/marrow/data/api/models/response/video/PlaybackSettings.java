package com.marrow.data.api.models.response.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.video.VideoPlaybackConfiguration;
import java.io.IOException;
import kotlin.DownloadHelper2;
import kotlin.DownloadHelperExternalSyntheticLambda2;
import kotlin.DownloadHelperExternalSyntheticLambda4;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getPercentDownloaded;
import kotlin.sendRemoveDownload;
import kotlin.sendSetRequirements;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0001=BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0011JV\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0019R\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010\u0015R\u001a\u00101\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001cR\u001a\u00104\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001eR\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b8\u0010\u0011R\"\u00109\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010-\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u0010<"}, d2 = {"Lcom/marrow/data/api/models/response/video/PlaybackSettings;", "", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "Lcom/marrow/data/api/models/response/video/ConfigMinPlayback;", "p5", "p6", "<init>", "(Ljava/lang/String;JIJDLcom/marrow/data/api/models/response/video/ConfigMinPlayback;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getMinimumPlaybackMs", "(Ljava/lang/String;)J", "getLastNDays", "()J", "component1", "component2", "component3", "()I", "component4", "component5", "()D", "component6", "()Lcom/marrow/data/api/models/response/video/ConfigMinPlayback;", "component7", "copy", "(Ljava/lang/String;JIJDLcom/marrow/data/api/models/response/video/ConfigMinPlayback;Ljava/lang/String;)Lcom/marrow/data/api/models/response/video/PlaybackSettings;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "configPref", "Ljava/lang/String;", "getConfigPref", "configExpirySeconds", "J", "getConfigExpirySeconds", "maxErrorCount", "I", "getMaxErrorCount", "queryDurationSeconds", "getQueryDurationSeconds", "underrunThreshold", "D", "getUnderrunThreshold", "configMinPlaybackSeconds", "Lcom/marrow/data/api/models/response/video/ConfigMinPlayback;", "getConfigMinPlaybackSeconds", "wvSecurityLevel", "getWvSecurityLevel", "decoderLevel", "getDecoderLevel", "setDecoderLevel", "(I)V", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaybackSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ONE_DAY_MS = 86400000;
    private static final long ONE_DAY_SEC = 86400;
    private static final long ONE_SEC_MS = 1000;
    private static final long ONE_WEEK_IN_SEC = 604800;
    private long configExpirySeconds;
    private ConfigMinPlayback configMinPlaybackSeconds;
    private String configPref;
    private int decoderLevel;
    private int maxErrorCount;
    private long queryDurationSeconds;
    private double underrunThreshold;
    private String wvSecurityLevel;

    public PlaybackSettings(@JsonProperty("config_pref") String str, @JsonProperty("expires_in_sec") long j, @JsonProperty("max_error_count") int i, @JsonProperty("query_duration_sec") long j2, @JsonProperty("underrun_threshold") double d, @JsonProperty("min_playback_sec") ConfigMinPlayback configMinPlayback, @JsonProperty("wv_sec_level") String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(configMinPlayback, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.configPref = str;
        this.configExpirySeconds = j;
        this.maxErrorCount = i;
        this.queryDurationSeconds = j2;
        this.underrunThreshold = d;
        this.configMinPlaybackSeconds = configMinPlayback;
        this.wvSecurityLevel = str2;
        this.decoderLevel = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) VideoPlaybackConfiguration.WIDEVINE_LVL_L3) ? 3 : 0;
    }

    public final String getConfigPref() {
        return this.configPref;
    }

    public final long getConfigExpirySeconds() {
        return this.configExpirySeconds;
    }

    public final int getMaxErrorCount() {
        return this.maxErrorCount;
    }

    public final long getQueryDurationSeconds() {
        return this.queryDurationSeconds;
    }

    public final double getUnderrunThreshold() {
        return this.underrunThreshold;
    }

    public final ConfigMinPlayback getConfigMinPlaybackSeconds() {
        return this.configMinPlaybackSeconds;
    }

    public final String getWvSecurityLevel() {
        return this.wvSecurityLevel;
    }

    public final int getDecoderLevel() {
        return this.decoderLevel;
    }

    public final void setDecoderLevel(int i) {
        this.decoderLevel = i;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0083T¢\u0006\u0006\n\u0004\b\f\u0010\t"}, d2 = {"Lcom/marrow/data/api/models/response/video/PlaybackSettings$Companion;", "", "<init>", "()V", "Lcom/marrow/data/api/models/response/video/PlaybackSettings;", "getLocalDefaultPlaybackSettings", "()Lcom/marrow/data/api/models/response/video/PlaybackSettings;", "", "ONE_SEC_MS", "J", "ONE_DAY_MS", "ONE_DAY_SEC", "ONE_WEEK_IN_SEC"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PlaybackSettings getLocalDefaultPlaybackSettings() {
            return new PlaybackSettings(VideoPlaybackConfiguration._C0, PlaybackSettings.ONE_DAY_SEC, 20, PlaybackSettings.ONE_WEEK_IN_SEC, 0.12d, new ConfigMinPlayback(300L, 300L), VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        String str = this.configPref;
        long j = this.configExpirySeconds;
        int i = this.maxErrorCount;
        long j2 = this.queryDurationSeconds;
        double d = this.underrunThreshold;
        ConfigMinPlayback configMinPlayback = this.configMinPlaybackSeconds;
        StringBuilder sb = new StringBuilder("configPref ");
        sb.append(str);
        sb.append(", \n configExpirySeconds ");
        sb.append(j);
        sb.append(", maxErrorCount: ");
        sb.append(i);
        sb.append(", queryDurationSeconds : ");
        sb.append(j2);
        sb.append(", \n underrun_threshold : ");
        sb.append(d);
        sb.append(" \n configMinPlaybackSeconds : ");
        sb.append(configMinPlayback);
        return sb.toString();
    }

    public final long getMinimumPlaybackMs(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) VideoPlaybackConfiguration._C3) ? this.configMinPlaybackSeconds.getC3() : this.configMinPlaybackSeconds.getC0()) * 1000;
    }

    public final long getLastNDays() {
        return (System.currentTimeMillis() / ONE_DAY_MS) - (this.queryDurationSeconds / ONE_DAY_SEC);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConfigPref() {
        return this.configPref;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getConfigExpirySeconds() {
        return this.configExpirySeconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxErrorCount() {
        return this.maxErrorCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getQueryDurationSeconds() {
        return this.queryDurationSeconds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getUnderrunThreshold() {
        return this.underrunThreshold;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ConfigMinPlayback getConfigMinPlaybackSeconds() {
        return this.configMinPlaybackSeconds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWvSecurityLevel() {
        return this.wvSecurityLevel;
    }

    public final PlaybackSettings copy(@JsonProperty("config_pref") String p0, @JsonProperty("expires_in_sec") long p1, @JsonProperty("max_error_count") int p2, @JsonProperty("query_duration_sec") long p3, @JsonProperty("underrun_threshold") double p4, @JsonProperty("min_playback_sec") ConfigMinPlayback p5, @JsonProperty("wv_sec_level") String p6) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        return new PlaybackSettings(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlaybackSettings)) {
            return false;
        }
        PlaybackSettings playbackSettings = (PlaybackSettings) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.configPref, (Object) playbackSettings.configPref) && this.configExpirySeconds == playbackSettings.configExpirySeconds && this.maxErrorCount == playbackSettings.maxErrorCount && this.queryDurationSeconds == playbackSettings.queryDurationSeconds && Double.compare(this.underrunThreshold, playbackSettings.underrunThreshold) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.configMinPlaybackSeconds, playbackSettings.configMinPlaybackSeconds) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.wvSecurityLevel, (Object) playbackSettings.wvSecurityLevel);
    }

    public final int hashCode() {
        return (((((((((((this.configPref.hashCode() * 31) + Long.hashCode(this.configExpirySeconds)) * 31) + Integer.hashCode(this.maxErrorCount)) * 31) + Long.hashCode(this.queryDurationSeconds)) * 31) + Double.hashCode(this.underrunThreshold)) * 31) + this.configMinPlaybackSeconds.hashCode()) * 31) + this.wvSecurityLevel.hashCode();
    }

    public final /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 86);
        Class cls = Long.TYPE;
        Long lValueOf = Long.valueOf(this.configExpirySeconds);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls, lValueOf).read(downloadHelper2, lValueOf);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 162);
        ConfigMinPlayback configMinPlayback = this.configMinPlaybackSeconds;
        sendSetRequirements.write(setdownloadingstatestoqueued, ConfigMinPlayback.class, configMinPlayback).read(downloadHelper2, configMinPlayback);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 88);
        downloadHelper2.AudioAttributesCompatParcelizer(this.configPref);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 187);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.decoderLevel));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 163);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.maxErrorCount));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 94);
        Class cls2 = Long.TYPE;
        Long lValueOf2 = Long.valueOf(this.queryDurationSeconds);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls2, lValueOf2).read(downloadHelper2, lValueOf2);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 48);
        Class cls3 = Double.TYPE;
        Double dValueOf = Double.valueOf(this.underrunThreshold);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls3, dValueOf).read(downloadHelper2, dValueOf);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 179);
        downloadHelper2.AudioAttributesCompatParcelizer(this.wvSecurityLevel);
    }

    public /* synthetic */ PlaybackSettings() {
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            IconCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 83) {
            if (!z) {
                this.configPref = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.configPref = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.configPref = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 85) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.maxErrorCount = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e) {
                throw new getPercentDownloaded(e);
            }
        }
        if (i == 103) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.decoderLevel = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e2) {
                throw new getPercentDownloaded(e2);
            }
        }
        if (i == 118) {
            if (z) {
                this.queryDurationSeconds = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 140) {
            if (z) {
                this.underrunThreshold = ((Double) setdownloadingstatestoqueued.read(Double.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).doubleValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 141) {
            if (z) {
                this.configExpirySeconds = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 151) {
            if (z) {
                this.configMinPlaybackSeconds = (ConfigMinPlayback) setdownloadingstatestoqueued.read(ConfigMinPlayback.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.configMinPlaybackSeconds = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i != 152) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.wvSecurityLevel = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.wvSecurityLevel = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.wvSecurityLevel = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
