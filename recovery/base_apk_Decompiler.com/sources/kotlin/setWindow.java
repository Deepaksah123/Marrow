package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class setWindow {
    private final String RemoteActionCompatParcelizer;
    private final String read;

    public setWindow(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setWindow)) {
            return false;
        }
        setWindow setwindow = (setWindow) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) setwindow.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) setwindow.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("PearlIdUIModel(pearlId=");
        sb.append(str);
        sb.append(", pearlDisplayId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
