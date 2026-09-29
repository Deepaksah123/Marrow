package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class durationUsToSampleCount {
    private final String IconCompatParcelizer;
    private final List<String> RemoteActionCompatParcelizer;
    private final String read;
    private final int write;

    public durationUsToSampleCount(String str, List<String> list, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = list;
        this.IconCompatParcelizer = str2;
        this.write = i;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final int read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof durationUsToSampleCount)) {
            return false;
        }
        durationUsToSampleCount durationustosamplecount = (durationUsToSampleCount) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) durationustosamplecount.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, durationustosamplecount.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) durationustosamplecount.IconCompatParcelizer) && this.write == durationustosamplecount.write;
    }

    public final int hashCode() {
        return (((((this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        String str = this.read;
        List<String> list = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        int i = this.write;
        StringBuilder sb = new StringBuilder("GTNudgeContentUCModel(title=");
        sb.append(str);
        sb.append(", descriptions=");
        sb.append(list);
        sb.append(", defaultTestId=");
        sb.append(str2);
        sb.append(", nudgeType=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
