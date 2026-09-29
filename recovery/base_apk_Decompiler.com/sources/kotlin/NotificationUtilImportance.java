package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationUtilImportance {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String write;

    public NotificationUtilImportance(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = str3;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.write;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationUtilImportance)) {
            return false;
        }
        NotificationUtilImportance notificationUtilImportance = (NotificationUtilImportance) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) notificationUtilImportance.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) notificationUtilImportance.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) notificationUtilImportance.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        String str3 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqVideoMedia(url=");
        sb.append(str);
        sb.append(", fallbackUrl=");
        sb.append(str2);
        sb.append(", thumbnailUrl=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
