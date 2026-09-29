package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0011\u0010\u0015"}, d2 = {"Lo/ExperimentalBandwidthMeterExternalSyntheticLambda0;", "", "", "Lo/ExponentialWeightedAverageStatistic;", "p0", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Ljava/util/List;", "()Ljava/util/List;", "IconCompatParcelizer", "(Ljava/util/List;)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExperimentalBandwidthMeterExternalSyntheticLambda0 {
    private static int RemoteActionCompatParcelizer = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private List<ExponentialWeightedAverageStatistic> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<ExponentialWeightedAverageStatistic> AudioAttributesCompatParcelizer;

    private ExperimentalBandwidthMeterExternalSyntheticLambda0(@JsonProperty("acceptable") List<ExponentialWeightedAverageStatistic> list, @JsonProperty("unacceptable") List<ExponentialWeightedAverageStatistic> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.AudioAttributesCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = list2;
    }

    public /* synthetic */ ExperimentalBandwidthMeterExternalSyntheticLambda0(List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2);
    }

    public final void IconCompatParcelizer(List<ExponentialWeightedAverageStatistic> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = list;
    }

    public final List<ExponentialWeightedAverageStatistic> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<ExponentialWeightedAverageStatistic> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(List<ExponentialWeightedAverageStatistic> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExperimentalBandwidthMeterExternalSyntheticLambda0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ExperimentalBandwidthMeterExternalSyntheticLambda0)) {
            return false;
        }
        ExperimentalBandwidthMeterExternalSyntheticLambda0 experimentalBandwidthMeterExternalSyntheticLambda0 = (ExperimentalBandwidthMeterExternalSyntheticLambda0) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, experimentalBandwidthMeterExternalSyntheticLambda0.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, experimentalBandwidthMeterExternalSyntheticLambda0.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        List<ExponentialWeightedAverageStatistic> list = this.AudioAttributesCompatParcelizer;
        List<ExponentialWeightedAverageStatistic> list2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ExperimentalBandwidthMeterExternalSyntheticLambda0(AudioAttributesCompatParcelizer=");
        sb.append(list);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        write(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        if (this != this.AudioAttributesCompatParcelizer) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 62);
            ExponentialWeightedAverageTimeToFirstByteEstimatorFixedSizeLinkedHashMap exponentialWeightedAverageTimeToFirstByteEstimatorFixedSizeLinkedHashMap = new ExponentialWeightedAverageTimeToFirstByteEstimatorFixedSizeLinkedHashMap();
            List<ExponentialWeightedAverageStatistic> list = this.AudioAttributesCompatParcelizer;
            sendSetRequirements.write(setdownloadingstatestoqueued, exponentialWeightedAverageTimeToFirstByteEstimatorFixedSizeLinkedHashMap, list).read(downloadHelper2, list);
        }
        if (this != this.RemoteActionCompatParcelizer) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 114);
            ExponentialWeightedAverageTimeToFirstByteEstimator exponentialWeightedAverageTimeToFirstByteEstimator = new ExponentialWeightedAverageTimeToFirstByteEstimator();
            List<ExponentialWeightedAverageStatistic> list2 = this.RemoteActionCompatParcelizer;
            sendSetRequirements.write(setdownloadingstatestoqueued, exponentialWeightedAverageTimeToFirstByteEstimator, list2).read(downloadHelper2, list2);
        }
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 117) {
            if (z) {
                this.AudioAttributesCompatParcelizer = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new ExponentialWeightedAverageTimeToFirstByteEstimatorFixedSizeLinkedHashMap()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.AudioAttributesCompatParcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i != 132) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
        } else if (z) {
            this.RemoteActionCompatParcelizer = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new ExponentialWeightedAverageTimeToFirstByteEstimator()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
        } else {
            this.RemoteActionCompatParcelizer = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        }
    }
}
