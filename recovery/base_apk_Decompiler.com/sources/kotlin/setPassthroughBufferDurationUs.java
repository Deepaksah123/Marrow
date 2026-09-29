package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setPassthroughBufferDurationUs {
    public volatile String AudioAttributesCompatParcelizer;
    public volatile Long AudioAttributesImplApi21Parcelizer;
    public volatile Long AudioAttributesImplApi26Parcelizer;
    public volatile Long AudioAttributesImplBaseParcelizer;
    public volatile String IconCompatParcelizer;
    public volatile Long MediaBrowserCompatCustomActionResultReceiver;
    public volatile Long MediaBrowserCompatItemReceiver;
    public volatile Integer RemoteActionCompatParcelizer;
    public volatile int read;
    public volatile Long write;

    public setPassthroughBufferDurationUs(String str, String str2, Integer num, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        l2 = (i & 32) != 0 ? null : l2;
        l3 = (i & 64) != 0 ? null : l3;
        l4 = (i & 128) != 0 ? null : l4;
        l5 = (i & 256) != 0 ? null : l5;
        l6 = (i & 512) != 0 ? null : l6;
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = num;
        this.read = 0;
        this.write = l;
        this.AudioAttributesImplApi26Parcelizer = l2;
        this.AudioAttributesImplApi21Parcelizer = l3;
        this.MediaBrowserCompatCustomActionResultReceiver = l4;
        this.AudioAttributesImplBaseParcelizer = l5;
        this.MediaBrowserCompatItemReceiver = l6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPassthroughBufferDurationUs)) {
            return false;
        }
        setPassthroughBufferDurationUs setpassthroughbufferdurationus = (setPassthroughBufferDurationUs) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setpassthroughbufferdurationus.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setpassthroughbufferdurationus.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setpassthroughbufferdurationus.RemoteActionCompatParcelizer) && this.read == setpassthroughbufferdurationus.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, setpassthroughbufferdurationus.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, setpassthroughbufferdurationus.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, setpassthroughbufferdurationus.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, setpassthroughbufferdurationus.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, setpassthroughbufferdurationus.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, setpassthroughbufferdurationus.MediaBrowserCompatItemReceiver);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer == null ? 0 : this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer == null ? 0 : this.IconCompatParcelizer.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer == null ? 0 : this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode4 = Integer.hashCode(this.read);
        int iHashCode5 = this.write == null ? 0 : this.write.hashCode();
        int iHashCode6 = this.AudioAttributesImplApi26Parcelizer == null ? 0 : this.AudioAttributesImplApi26Parcelizer.hashCode();
        int iHashCode7 = this.AudioAttributesImplApi21Parcelizer == null ? 0 : this.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode8 = this.MediaBrowserCompatCustomActionResultReceiver == null ? 0 : this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        return ((((((((((((iHashCode4 + (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31)) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (this.AudioAttributesImplBaseParcelizer == null ? 0 : this.AudioAttributesImplBaseParcelizer.hashCode())) * 31) + (this.MediaBrowserCompatItemReceiver != null ? this.MediaBrowserCompatItemReceiver.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
