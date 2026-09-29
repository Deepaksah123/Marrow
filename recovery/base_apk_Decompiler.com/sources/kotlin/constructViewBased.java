package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class constructViewBased {
    public final int AudioAttributesCompatParcelizer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final int read;

    public constructViewBased(String str, String str2, int i, int i2) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = i;
        this.read = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof constructViewBased)) {
            return false;
        }
        constructViewBased constructviewbased = (constructViewBased) obj;
        return this.AudioAttributesCompatParcelizer == constructviewbased.AudioAttributesCompatParcelizer && this.read == constructviewbased.read && parseSmta.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, constructviewbased.IconCompatParcelizer) && parseSmta.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, constructviewbased.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return parseSmta.read(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, Integer.valueOf(this.AudioAttributesCompatParcelizer), Integer.valueOf(this.read));
    }
}
