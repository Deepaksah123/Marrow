package kotlin;

import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HashAccumulator {
    private final Integer AudioAttributesCompatParcelizer;
    private final Integer AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer = R.string.new_edition_highlights_label;
    private final Integer read;
    private final int write;

    public HashAccumulator(int i, int i2, Integer num, int i3, Integer num2, Integer num3, boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.write = i2;
        this.read = num;
        this.IconCompatParcelizer = i3;
        this.AudioAttributesImplApi21Parcelizer = num2;
        this.AudioAttributesCompatParcelizer = num3;
        this.AudioAttributesImplApi26Parcelizer = z;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int write() {
        return this.write;
    }

    public final Integer RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Integer AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final Integer read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HashAccumulator)) {
            return false;
        }
        HashAccumulator hashAccumulator = (HashAccumulator) obj;
        return this.MediaBrowserCompatCustomActionResultReceiver == hashAccumulator.MediaBrowserCompatCustomActionResultReceiver && this.RemoteActionCompatParcelizer == hashAccumulator.RemoteActionCompatParcelizer && this.write == hashAccumulator.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, hashAccumulator.read) && this.IconCompatParcelizer == hashAccumulator.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, hashAccumulator.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, hashAccumulator.AudioAttributesCompatParcelizer) && this.AudioAttributesImplApi26Parcelizer == hashAccumulator.AudioAttributesImplApi26Parcelizer;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode2 = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode3 = Integer.hashCode(this.write);
        Integer num = this.read;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = Integer.hashCode(this.IconCompatParcelizer);
        Integer num2 = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.AudioAttributesCompatParcelizer;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num3 != null ? num3.hashCode() : 0)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
    }

    public final String toString() {
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.write;
        Integer num = this.read;
        int i4 = this.IconCompatParcelizer;
        Integer num2 = this.AudioAttributesImplApi21Parcelizer;
        Integer num3 = this.AudioAttributesCompatParcelizer;
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("NewEditionContent(titleRes=");
        sb.append(i);
        sb.append(", highlightsLabelRes=");
        sb.append(i2);
        sb.append(", highlightsRes=");
        sb.append(i3);
        sb.append(", noteRes=");
        sb.append(num);
        sb.append(", primaryCtaRes=");
        sb.append(i4);
        sb.append(", switchBackNoteRes=");
        sb.append(num2);
        sb.append(", stayActionRes=");
        sb.append(num3);
        sb.append(", switchesEdition=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
