package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeu {
    private final boolean AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final List<zzex> RemoteActionCompatParcelizer;
    private final boolean write;

    /* JADX WARN: Multi-variable type inference failed */
    public zzeu(String str, List<? extends zzex> list, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = z;
        this.write = z2;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final List<zzex> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeu)) {
            return false;
        }
        zzeu zzeuVar = (zzeu) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zzeuVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, zzeuVar.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == zzeuVar.AudioAttributesCompatParcelizer && this.write == zzeuVar.write;
    }

    public final int hashCode() {
        return (((((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        List<zzex> list = this.RemoteActionCompatParcelizer;
        boolean z = this.AudioAttributesCompatParcelizer;
        boolean z2 = this.write;
        StringBuilder sb = new StringBuilder("CalendarDataModel(month=");
        sb.append(str);
        sb.append(", data=");
        sb.append(list);
        sb.append(", hasNextMonth=");
        sb.append(z);
        sb.append(", hasPreviousMonth=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
