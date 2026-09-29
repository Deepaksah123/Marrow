package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getElapsedRealtimeOffsetMs {
    private final List<isCancelled> AudioAttributesCompatParcelizer;
    private final String write;

    public getElapsedRealtimeOffsetMs(String str, List<isCancelled> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = list;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final List<isCancelled> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getElapsedRealtimeOffsetMs)) {
            return false;
        }
        getElapsedRealtimeOffsetMs getelapsedrealtimeoffsetms = (getElapsedRealtimeOffsetMs) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getelapsedrealtimeoffsetms.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getelapsedrealtimeoffsetms.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        List<isCancelled> list = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("RecentUpdatesUCModel(nextPage=");
        sb.append(str);
        sb.append(", data=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
