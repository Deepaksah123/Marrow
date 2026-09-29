package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class withUri {
    private final int AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public withUri(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.read = i;
        this.MediaBrowserCompatItemReceiver = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.write = i4;
        this.RemoteActionCompatParcelizer = i5;
        this.AudioAttributesImplApi26Parcelizer = i6;
        this.IconCompatParcelizer = i7;
        this.MediaBrowserCompatCustomActionResultReceiver = i8;
    }

    public final int read() {
        return this.read + this.MediaBrowserCompatItemReceiver;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer + this.write;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer + this.AudioAttributesImplApi26Parcelizer;
    }

    public final int write() {
        return this.IconCompatParcelizer + this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof withUri)) {
            return false;
        }
        withUri withuri = (withUri) obj;
        return this.read == withuri.read && this.MediaBrowserCompatItemReceiver == withuri.MediaBrowserCompatItemReceiver && this.AudioAttributesCompatParcelizer == withuri.AudioAttributesCompatParcelizer && this.write == withuri.write && this.RemoteActionCompatParcelizer == withuri.RemoteActionCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == withuri.AudioAttributesImplApi26Parcelizer && this.IconCompatParcelizer == withuri.IconCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == withuri.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int hashCode() {
        return (((((((((((((Integer.hashCode(this.read) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final String toString() {
        int i = this.read;
        int i2 = this.MediaBrowserCompatItemReceiver;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = this.write;
        int i5 = this.RemoteActionCompatParcelizer;
        int i6 = this.AudioAttributesImplApi26Parcelizer;
        int i7 = this.IconCompatParcelizer;
        int i8 = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder("InsetsAccumulator(initialTop=");
        sb.append(i);
        sb.append(", insetTop=");
        sb.append(i2);
        sb.append(", initialBottom=");
        sb.append(i3);
        sb.append(", insetBottom=");
        sb.append(i4);
        sb.append(", initialLeft=");
        sb.append(i5);
        sb.append(", insetLeft=");
        sb.append(i6);
        sb.append(", initialRight=");
        sb.append(i7);
        sb.append(", insetRight=");
        sb.append(i8);
        sb.append(")");
        return sb.toString();
    }
}
