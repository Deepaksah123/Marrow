package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac4Util extends DefaultAudioSinkApi31 {
    public final Object RemoteActionCompatParcelizer;

    public Ac4Util(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Ac4Util.class == obj.getClass() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((Ac4Util) obj).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ok(");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
