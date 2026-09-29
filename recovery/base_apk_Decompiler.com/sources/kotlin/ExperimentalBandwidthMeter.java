package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentalBandwidthMeter {
    private final List<getBandwidthEstimate> read;
    private final String write;

    public ExperimentalBandwidthMeter(String str, List<getBandwidthEstimate> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = str;
        this.read = list;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final List<getBandwidthEstimate> write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExperimentalBandwidthMeter)) {
            return false;
        }
        ExperimentalBandwidthMeter experimentalBandwidthMeter = (ExperimentalBandwidthMeter) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) experimentalBandwidthMeter.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, experimentalBandwidthMeter.read);
    }

    public final int hashCode() {
        String str = this.write;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.write;
        List<getBandwidthEstimate> list = this.read;
        StringBuilder sb = new StringBuilder("RecentUpdatesRepoModel(nextPage=");
        sb.append(str);
        sb.append(", data=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
