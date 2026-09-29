package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\fR\u001c\u0010\u000f\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000e"}, d2 = {"Lo/ExponentialWeightedAverageStatistic;", "", "", "p0", "", "p1", "<init>", "(ILjava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "I", "write", "IconCompatParcelizer", "read", "Ljava/lang/String;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExponentialWeightedAverageStatistic {
    private static int AudioAttributesCompatParcelizer = 8;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    public ExponentialWeightedAverageStatistic(@JsonProperty("val") int i, @JsonProperty("title") String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ ExponentialWeightedAverageStatistic(int i, String str, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExponentialWeightedAverageStatistic() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ExponentialWeightedAverageStatistic)) {
            return false;
        }
        ExponentialWeightedAverageStatistic exponentialWeightedAverageStatistic = (ExponentialWeightedAverageStatistic) p0;
        return this.IconCompatParcelizer == exponentialWeightedAverageStatistic.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) exponentialWeightedAverageStatistic.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.IconCompatParcelizer) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.IconCompatParcelizer;
        String str = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ExponentialWeightedAverageStatistic(IconCompatParcelizer=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void IconCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 50);
        downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.IconCompatParcelizer));
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 73);
        downloadHelper2.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            read(downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void read(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 13) {
            if (!z) {
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
            try {
                this.IconCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                return;
            } catch (NumberFormatException e) {
                throw new getPercentDownloaded(e);
            }
        }
        if (i != 130) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.RemoteActionCompatParcelizer = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.RemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.RemoteActionCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }
}
