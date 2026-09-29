package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdatransformFutureAsync2 {
    private final int AudioAttributesCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public lambdatransformFutureAsync2(int i, int i2, int i3, int i4) {
        this.read = i;
        this.write = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.RemoteActionCompatParcelizer = i4;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final int write() {
        return this.write;
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.read == this.write;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer == this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdatransformFutureAsync2)) {
            return false;
        }
        lambdatransformFutureAsync2 lambdatransformfutureasync2 = (lambdatransformFutureAsync2) obj;
        return this.read == lambdatransformfutureasync2.read && this.write == lambdatransformfutureasync2.write && this.AudioAttributesCompatParcelizer == lambdatransformfutureasync2.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == lambdatransformfutureasync2.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.read) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = this.read;
        int i2 = this.write;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("RevisionCompletedResultUCModel(totalVideoCount=");
        sb.append(i);
        sb.append(", completedVideoCount=");
        sb.append(i2);
        sb.append(", completedARQBankCount=");
        sb.append(i3);
        sb.append(", totalARQBankCount=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
