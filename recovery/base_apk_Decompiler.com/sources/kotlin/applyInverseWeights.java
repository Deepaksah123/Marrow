package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016"}, d2 = {"Lo/applyInverseWeights;", "", "", "p0", "", "p1", "", "p2", "<init>", "(I[J[Ljava/lang/Object;)V", "", "write", "(J)Ljava/lang/Object;", "", "read", "(JLjava/lang/Object;)Z", "(JLjava/lang/Object;)Lo/applyInverseWeights;", "RemoteActionCompatParcelizer", "(J)I", "I", "[J", "IconCompatParcelizer", "[Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class applyInverseWeights {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object[] read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long[] IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    public applyInverseWeights(int i, long[] jArr, Object[] objArr) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = jArr;
        this.read = objArr;
    }

    public final Object write(long p0) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
        if (iRemoteActionCompatParcelizer >= 0) {
            return this.read[iRemoteActionCompatParcelizer];
        }
        return null;
    }

    public final boolean read(long p0, Object p1) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
        if (iRemoteActionCompatParcelizer < 0) {
            return false;
        }
        this.read[iRemoteActionCompatParcelizer] = p1;
        return true;
    }

    public final applyInverseWeights write(long p0, Object p1) {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : this.read) {
            if (obj != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j = this.IconCompatParcelizer[i5];
                Object obj2 = this.read[i5];
                if (j > p0) {
                    jArr[i2] = p0;
                    objArr[i2] = p1;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j;
                    objArr[i2] = obj2;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr[i3] = p0;
                objArr[i3] = p1;
            } else {
                while (i2 < i4) {
                    long j2 = this.IconCompatParcelizer[i5];
                    Object obj3 = this.read[i5];
                    if (obj3 != null) {
                        jArr[i2] = j2;
                        objArr[i2] = obj3;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr[0] = p0;
            objArr[0] = p1;
        }
        return new applyInverseWeights(i4, jArr, objArr);
    }

    private final int RemoteActionCompatParcelizer(long p0) {
        int i = this.RemoteActionCompatParcelizer - 1;
        if (i != -1) {
            int i2 = 0;
            if (i != 0) {
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    long j = this.IconCompatParcelizer[i3] - p0;
                    if (j < 0) {
                        i2 = i3 + 1;
                    } else {
                        if (j <= 0) {
                            return i3;
                        }
                        i = i3 - 1;
                    }
                }
                return -(i2 + 1);
            }
            long j2 = this.IconCompatParcelizer[0];
            if (j2 == p0) {
                return 0;
            }
            if (j2 > p0) {
                return -2;
            }
        }
        return -1;
    }
}
