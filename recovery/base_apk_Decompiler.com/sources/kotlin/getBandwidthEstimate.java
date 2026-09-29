package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001bR\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001f\u0010#R\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00058\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#R\u001a\u0010\u001c\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001bR\u001a\u0010$\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b)\u0010\u001bR\u001c\u0010(\u001a\u00020\u000f8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b!\u0010.R\"\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b'\u0010#"}, d2 = {"Lo/getBandwidthEstimate;", "", "", "p0", "p1", "", "p2", "", "p3", "", "p4", "p5", "Lo/BandwidthStatistic;", "p6", "p7", "Lo/onNetworkTypeChange;", "p8", "Lo/CombinedParallelSampleBandwidthEstimator1;", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLjava/lang/String;Lo/BandwidthStatistic;Ljava/lang/String;Lo/onNetworkTypeChange;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read", "Ljava/util/List;", "()Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "J", "()J", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/BandwidthStatistic;", "MediaBrowserCompatItemReceiver", "()Lo/BandwidthStatistic;", "Lo/onNetworkTypeChange;", "()Lo/onNetworkTypeChange;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getBandwidthEstimate {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private onNetworkTypeChange AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private List<CombinedParallelSampleBandwidthEstimator1> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final BandwidthStatistic AudioAttributesImplApi26Parcelizer;
    private final String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<Integer> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private List<String> RemoteActionCompatParcelizer;

    public getBandwidthEstimate(String str, String str2, List<String> list, List<Integer> list2, long j, String str3, BandwidthStatistic bandwidthStatistic, String str4, onNetworkTypeChange onnetworktypechange, List<CombinedParallelSampleBandwidthEstimator1> list3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(bandwidthStatistic, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(onnetworktypechange, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = list;
        this.write = list2;
        this.IconCompatParcelizer = j;
        this.MediaBrowserCompatCustomActionResultReceiver = str3;
        this.AudioAttributesImplApi26Parcelizer = bandwidthStatistic;
        this.MediaBrowserCompatItemReceiver = str4;
        this.AudioAttributesImplApi21Parcelizer = onnetworktypechange;
        this.AudioAttributesImplBaseParcelizer = list3;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    public final List<String> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<Integer> RemoteActionCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final BandwidthStatistic getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final onNetworkTypeChange getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final List<CombinedParallelSampleBandwidthEstimator1> AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getBandwidthEstimate)) {
            return false;
        }
        getBandwidthEstimate getbandwidthestimate = (getBandwidthEstimate) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getbandwidthestimate.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getbandwidthestimate.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getbandwidthestimate.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getbandwidthestimate.write) && this.IconCompatParcelizer == getbandwidthestimate.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) getbandwidthestimate.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, getbandwidthestimate.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) getbandwidthestimate.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, getbandwidthestimate.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, getbandwidthestimate.AudioAttributesImplBaseParcelizer);
    }

    public final int hashCode() {
        return (((((((((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        List<String> list = this.RemoteActionCompatParcelizer;
        List<Integer> list2 = this.write;
        long j = this.IconCompatParcelizer;
        String str3 = this.MediaBrowserCompatCustomActionResultReceiver;
        BandwidthStatistic bandwidthStatistic = this.AudioAttributesImplApi26Parcelizer;
        String str4 = this.MediaBrowserCompatItemReceiver;
        onNetworkTypeChange onnetworktypechange = this.AudioAttributesImplApi21Parcelizer;
        List<CombinedParallelSampleBandwidthEstimator1> list3 = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("getBandwidthEstimate(AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(list);
        sb.append(", write=");
        sb.append(list2);
        sb.append(", IconCompatParcelizer=");
        sb.append(j);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str3);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(bandwidthStatistic);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(str4);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(onnetworktypechange);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
