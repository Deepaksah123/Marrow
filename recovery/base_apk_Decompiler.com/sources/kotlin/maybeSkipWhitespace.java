package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeSkipWhitespace {
    private final int AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final int IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public maybeSkipWhitespace(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.read = i;
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.IconCompatParcelizer = i3;
        this.RemoteActionCompatParcelizer = i4;
        this.AudioAttributesImplApi21Parcelizer = i5;
        this.AudioAttributesCompatParcelizer = i6;
        this.write = i7;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int read() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maybeSkipWhitespace)) {
            return false;
        }
        maybeSkipWhitespace maybeskipwhitespace = (maybeSkipWhitespace) obj;
        return this.read == maybeskipwhitespace.read && this.AudioAttributesImplApi26Parcelizer == maybeskipwhitespace.AudioAttributesImplApi26Parcelizer && this.IconCompatParcelizer == maybeskipwhitespace.IconCompatParcelizer && this.RemoteActionCompatParcelizer == maybeskipwhitespace.RemoteActionCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == maybeskipwhitespace.AudioAttributesImplApi21Parcelizer && this.AudioAttributesCompatParcelizer == maybeskipwhitespace.AudioAttributesCompatParcelizer && this.write == maybeskipwhitespace.write;
    }

    public final int hashCode() {
        return (((((((((((Integer.hashCode(this.read) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        int i = this.read;
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        int i3 = this.IconCompatParcelizer;
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = this.AudioAttributesImplApi21Parcelizer;
        int i6 = this.AudioAttributesCompatParcelizer;
        int i7 = this.write;
        StringBuilder sb = new StringBuilder("PipLayoutConfig(dockWidthPx=");
        sb.append(i);
        sb.append(", verticalDockMarginPx=");
        sb.append(i2);
        sb.append(", horizontalPaddingPx=");
        sb.append(i3);
        sb.append(", bottomPaddingPx=");
        sb.append(i4);
        sb.append(", statusbarInsetHeight=");
        sb.append(i5);
        sb.append(", screenWidth=");
        sb.append(i6);
        sb.append(", screenHeight=");
        sb.append(i7);
        sb.append(")");
        return sb.toString();
    }
}
