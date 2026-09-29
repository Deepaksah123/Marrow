package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class _resolveTypePlaceholders {
    private int AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    private final _referenceType[] RemoteActionCompatParcelizer;

    public _resolveTypePlaceholders(_referenceType... _referencetypeArr) {
        this.RemoteActionCompatParcelizer = _referencetypeArr;
        this.IconCompatParcelizer = _referencetypeArr.length;
    }

    public final int hashCode() {
        if (this.AudioAttributesCompatParcelizer == 0) {
            this.AudioAttributesCompatParcelizer = Arrays.hashCode(this.RemoteActionCompatParcelizer) + 527;
        }
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.RemoteActionCompatParcelizer, ((_resolveTypePlaceholders) obj).RemoteActionCompatParcelizer);
    }
}
