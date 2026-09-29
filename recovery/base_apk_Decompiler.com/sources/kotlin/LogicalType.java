package kotlin;

import kotlin.CollectionType;

/* JADX INFO: loaded from: classes2.dex */
public final class LogicalType implements CollectionType.write {
    private final int[] AudioAttributesCompatParcelizer;
    private final visitIntFormat[] RemoteActionCompatParcelizer;

    public LogicalType(int[] iArr, visitIntFormat[] visitintformatArr) {
        this.AudioAttributesCompatParcelizer = iArr;
        this.RemoteActionCompatParcelizer = visitintformatArr;
    }

    @Override // o.CollectionType.write
    public final nonNullString RemoteActionCompatParcelizer(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.AudioAttributesCompatParcelizer;
            if (i2 < iArr.length) {
                if (i == iArr[i2]) {
                    return this.RemoteActionCompatParcelizer[i2];
                }
                i2++;
            } else {
                prune.AudioAttributesCompatParcelizer("BaseMediaChunkOutput", "Unmatched track of type: ".concat(String.valueOf(i)));
                return new exceptionMessage();
            }
        }
    }

    public final int[] AudioAttributesCompatParcelizer() {
        int[] iArr = new int[this.RemoteActionCompatParcelizer.length];
        int i = 0;
        while (true) {
            visitIntFormat[] visitintformatArr = this.RemoteActionCompatParcelizer;
            if (i >= visitintformatArr.length) {
                return iArr;
            }
            iArr[i] = visitintformatArr[i].AudioAttributesImplBaseParcelizer();
            i++;
        }
    }

    public final void RemoteActionCompatParcelizer(long j) {
        for (visitIntFormat visitintformat : this.RemoteActionCompatParcelizer) {
            visitintformat.write(j);
        }
    }
}
