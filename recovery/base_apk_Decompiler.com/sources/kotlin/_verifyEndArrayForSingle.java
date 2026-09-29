package kotlin;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class _verifyEndArrayForSingle {
    public static final _verifyEndArrayForSingle RemoteActionCompatParcelizer = new _verifyEndArrayForSingle(0, 0, 0, 0);
    public final int AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int read;
    public final int write;

    private _verifyEndArrayForSingle(int i, int i2, int i3, int i4) {
        this.read = i;
        this.write = i2;
        this.IconCompatParcelizer = i3;
        this.AudioAttributesCompatParcelizer = i4;
    }

    public static _verifyEndArrayForSingle read(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return RemoteActionCompatParcelizer;
        }
        return new _verifyEndArrayForSingle(i, i2, i3, i4);
    }

    public static _verifyEndArrayForSingle read(Rect rect) {
        return read(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static _verifyEndArrayForSingle RemoteActionCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle, _verifyEndArrayForSingle _verifyendarrayforsingle2) {
        return read(Math.max(_verifyendarrayforsingle.read, _verifyendarrayforsingle2.read), Math.max(_verifyendarrayforsingle.write, _verifyendarrayforsingle2.write), Math.max(_verifyendarrayforsingle.IconCompatParcelizer, _verifyendarrayforsingle2.IconCompatParcelizer), Math.max(_verifyendarrayforsingle.AudioAttributesCompatParcelizer, _verifyendarrayforsingle2.AudioAttributesCompatParcelizer));
    }

    public static _verifyEndArrayForSingle IconCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle, _verifyEndArrayForSingle _verifyendarrayforsingle2) {
        return read(Math.min(_verifyendarrayforsingle.read, _verifyendarrayforsingle2.read), Math.min(_verifyendarrayforsingle.write, _verifyendarrayforsingle2.write), Math.min(_verifyendarrayforsingle.IconCompatParcelizer, _verifyendarrayforsingle2.IconCompatParcelizer), Math.min(_verifyendarrayforsingle.AudioAttributesCompatParcelizer, _verifyendarrayforsingle2.AudioAttributesCompatParcelizer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        _verifyEndArrayForSingle _verifyendarrayforsingle = (_verifyEndArrayForSingle) obj;
        return this.AudioAttributesCompatParcelizer == _verifyendarrayforsingle.AudioAttributesCompatParcelizer && this.read == _verifyendarrayforsingle.read && this.IconCompatParcelizer == _verifyendarrayforsingle.IconCompatParcelizer && this.write == _verifyendarrayforsingle.write;
    }

    public final int hashCode() {
        int i = this.read;
        return (((((i * 31) + this.write) * 31) + this.IconCompatParcelizer) * 31) + this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.read);
        sb.append(", top=");
        sb.append(this.write);
        sb.append(", right=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bottom=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }

    public static _verifyEndArrayForSingle write(Insets insets) {
        return read(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets RemoteActionCompatParcelizer() {
        return write.RemoteActionCompatParcelizer(this.read, this.write, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class write {
        static Insets RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }
}
