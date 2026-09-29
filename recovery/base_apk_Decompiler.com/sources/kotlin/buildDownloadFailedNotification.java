package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class buildDownloadFailedNotification {
    private final int AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final long read;

    public buildDownloadFailedNotification(int i, String str, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
        this.read = j;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buildDownloadFailedNotification)) {
            return false;
        }
        buildDownloadFailedNotification builddownloadfailednotification = (buildDownloadFailedNotification) obj;
        return this.AudioAttributesCompatParcelizer == builddownloadfailednotification.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) builddownloadfailednotification.RemoteActionCompatParcelizer) && this.read == builddownloadfailednotification.read;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Long.hashCode(this.read);
    }

    public final String toString() {
        int i = this.AudioAttributesCompatParcelizer;
        String str = this.RemoteActionCompatParcelizer;
        long j = this.read;
        StringBuilder sb = new StringBuilder("FontOutput(loadState=");
        sb.append(i);
        sb.append(", hash=");
        sb.append(str);
        sb.append(", runtimeMs=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
