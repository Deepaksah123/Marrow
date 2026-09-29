package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class setSamplerTexId {
    private final String AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private final Long MediaBrowserCompatCustomActionResultReceiver;
    private final String RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    public setSamplerTexId(String str, String str2, String str3, int i, int i2, int i3, Long l) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.read = i;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.IconCompatParcelizer = i3;
        this.MediaBrowserCompatCustomActionResultReceiver = l;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final int write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int read() {
        return this.IconCompatParcelizer;
    }

    public final Long AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSamplerTexId)) {
            return false;
        }
        setSamplerTexId setsamplertexid = (setSamplerTexId) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) setsamplertexid.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) setsamplertexid.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setsamplertexid.AudioAttributesCompatParcelizer) && this.read == setsamplertexid.read && this.AudioAttributesImplBaseParcelizer == setsamplertexid.AudioAttributesImplBaseParcelizer && this.IconCompatParcelizer == setsamplertexid.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, setsamplertexid.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode4 = Integer.hashCode(this.read);
        int iHashCode5 = Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode6 = Integer.hashCode(this.IconCompatParcelizer);
        Long l = this.MediaBrowserCompatCustomActionResultReceiver;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        String str3 = this.AudioAttributesCompatParcelizer;
        int i = this.read;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int i3 = this.IconCompatParcelizer;
        Long l = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder("TestGroupRepoModel(id=");
        sb.append(str);
        sb.append(", parentId=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", questionCount=");
        sb.append(i);
        sb.append(", sectionTimeInSec=");
        sb.append(i2);
        sb.append(", cutOffTimeInSec=");
        sb.append(i3);
        sb.append(", skippedTimestampMs=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }
}
