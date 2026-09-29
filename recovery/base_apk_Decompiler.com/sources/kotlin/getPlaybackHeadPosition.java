package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getPlaybackHeadPosition {
    public final Float AudioAttributesCompatParcelizer;
    public final boolean AudioAttributesImplApi21Parcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final long AudioAttributesImplBaseParcelizer;
    public final double IconCompatParcelizer;
    public final queueInputBuffer MediaBrowserCompatCustomActionResultReceiver;
    public final long MediaBrowserCompatItemReceiver;
    public final Double RemoteActionCompatParcelizer;
    public final double read;
    public final Float write;

    public getPlaybackHeadPosition(double d, double d2, Float f, Double d3, Float f2, boolean z, long j, int i, long j2, queueInputBuffer queueinputbuffer) {
        this.IconCompatParcelizer = d;
        this.read = d2;
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = d3;
        this.write = f2;
        this.AudioAttributesImplApi21Parcelizer = z;
        this.AudioAttributesImplBaseParcelizer = j;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatItemReceiver = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = queueinputbuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPlaybackHeadPosition)) {
            return false;
        }
        getPlaybackHeadPosition getplaybackheadposition = (getPlaybackHeadPosition) obj;
        return Double.compare(this.IconCompatParcelizer, getplaybackheadposition.IconCompatParcelizer) == 0 && Double.compare(this.read, getplaybackheadposition.read) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getplaybackheadposition.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getplaybackheadposition.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getplaybackheadposition.write) && this.AudioAttributesImplApi21Parcelizer == getplaybackheadposition.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplBaseParcelizer == getplaybackheadposition.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi26Parcelizer == getplaybackheadposition.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatItemReceiver == getplaybackheadposition.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, getplaybackheadposition.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.IconCompatParcelizer);
        int iHashCode2 = Double.hashCode(this.read);
        Float f = this.AudioAttributesCompatParcelizer;
        int iHashCode3 = f == null ? 0 : f.hashCode();
        Double d = this.RemoteActionCompatParcelizer;
        int iHashCode4 = d == null ? 0 : d.hashCode();
        Float f2 = this.write;
        int iHashCode5 = f2 != null ? f2.hashCode() : 0;
        int iHashCode6 = Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode7 = Long.hashCode(this.AudioAttributesImplBaseParcelizer);
        return this.MediaBrowserCompatCustomActionResultReceiver.hashCode() + ((Long.hashCode(this.MediaBrowserCompatItemReceiver) + ((Integer.hashCode(this.AudioAttributesImplApi26Parcelizer) + ((iHashCode7 + ((iHashCode6 + ((((((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
