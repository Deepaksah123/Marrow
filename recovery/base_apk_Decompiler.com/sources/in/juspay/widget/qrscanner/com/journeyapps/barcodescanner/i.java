package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

/* JADX INFO: loaded from: classes4.dex */
public class i implements Comparable<i> {
    public final int a;
    public final int b;

    public i(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        int i = this.b * this.a;
        int i2 = iVar.b * iVar.a;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public i a() {
        return new i(this.b, this.a);
    }

    public i b(i iVar) {
        int i = this.a;
        int i2 = iVar.b;
        int i3 = i * i2;
        int i4 = iVar.a;
        int i5 = this.b;
        int i6 = i4 * i5;
        return i3 <= i6 ? new i(i4, i6 / i) : new i(i3 / i5, i2);
    }

    public i c(i iVar) {
        int i = this.a;
        int i2 = iVar.b;
        int i3 = i * i2;
        int i4 = iVar.a;
        int i5 = this.b;
        int i6 = i4 * i5;
        return i3 >= i6 ? new i(i4, i6 / i) : new i(i3 / i5, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }
}
