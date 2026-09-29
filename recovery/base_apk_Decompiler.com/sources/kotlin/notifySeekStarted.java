package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class notifySeekStarted {
    private final String AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final String MediaBrowserCompatItemReceiver;
    private final long RemoteActionCompatParcelizer;
    private final long read;
    private final String write;

    public notifySeekStarted(String str, String str2, long j, long j2, int i, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.write = str;
        this.MediaBrowserCompatItemReceiver = str2;
        this.RemoteActionCompatParcelizer = j;
        this.read = j2;
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = str3;
    }

    public final long IconCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof notifySeekStarted)) {
            return false;
        }
        notifySeekStarted notifyseekstarted = (notifySeekStarted) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) notifyseekstarted.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) notifyseekstarted.MediaBrowserCompatItemReceiver) && this.RemoteActionCompatParcelizer == notifyseekstarted.RemoteActionCompatParcelizer && this.read == notifyseekstarted.read && this.IconCompatParcelizer == notifyseekstarted.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) notifyseekstarted.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((((this.write.hashCode() * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Long.hashCode(this.read)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserEventLog(eventName=");
        sb.append(this.write);
        sb.append(", normalizedEventName=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", firstTs=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", lastTs=");
        sb.append(this.read);
        sb.append(", countOfEvents=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", deviceID=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
