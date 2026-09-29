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
import kotlin.sendRemoveDownload;
import kotlin.sendSetRequirements;
import kotlin.sendSetStopReason;
import kotlin.setDownloadingStatesToQueued;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ$\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/marrow/data/api/models/response/video/ConfigMinPlayback;", "", "", "p0", "p1", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "component1", "()J", "component2", "copy", "(JJ)Lcom/marrow/data/api/models/response/video/ConfigMinPlayback;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", VideoPlaybackConfiguration._C0, "J", "getC0", VideoPlaybackConfiguration._C3, "getC3"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfigMinPlayback {
    private long C0;
    private long C3;

    public ConfigMinPlayback(@JsonProperty(VideoPlaybackConfiguration._C0) long j, @JsonProperty(VideoPlaybackConfiguration._C3) long j2) {
        this.C0 = j;
        this.C3 = j2;
    }

    public /* synthetic */ ConfigMinPlayback(long j, long j2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? 300L : j, (i & 2) != 0 ? 300L : j2);
    }

    public final long getC0() {
        return this.C0;
    }

    public final long getC3() {
        return this.C3;
    }

    public final String toString() {
        long j = this.C0;
        long j2 = this.C3;
        StringBuilder sb = new StringBuilder("\nCO : ");
        sb.append(j);
        sb.append(" \nC3: : ");
        sb.append(j2);
        return sb.toString();
    }

    public ConfigMinPlayback() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ ConfigMinPlayback copy$default(ConfigMinPlayback configMinPlayback, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = configMinPlayback.C0;
        }
        if ((i & 2) != 0) {
            j2 = configMinPlayback.C3;
        }
        return configMinPlayback.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getC0() {
        return this.C0;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getC3() {
        return this.C3;
    }

    public final ConfigMinPlayback copy(@JsonProperty(VideoPlaybackConfiguration._C0) long p0, @JsonProperty(VideoPlaybackConfiguration._C3) long p1) {
        return new ConfigMinPlayback(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ConfigMinPlayback)) {
            return false;
        }
        ConfigMinPlayback configMinPlayback = (ConfigMinPlayback) p0;
        return this.C0 == configMinPlayback.C0 && this.C3 == configMinPlayback.C3;
    }

    public final int hashCode() {
        return (Long.hashCode(this.C0) * 31) + Long.hashCode(this.C3);
    }

    public final /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 186);
        Class cls = Long.TYPE;
        Long lValueOf = Long.valueOf(this.C0);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls, lValueOf).read(downloadHelper2, lValueOf);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 69);
        Class cls2 = Long.TYPE;
        Long lValueOf2 = Long.valueOf(this.C3);
        sendSetRequirements.write(setdownloadingstatestoqueued, cls2, lValueOf2).read(downloadHelper2, lValueOf2);
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            write(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 28) {
            if (z) {
                this.C0 = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                return;
            } else {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i != 107) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
        } else if (z) {
            this.C3 = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
        } else {
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        }
    }
}
