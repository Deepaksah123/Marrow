package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010"}, d2 = {"Lo/accessfilterOutSingleStringCallables;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "<init>", "(IIZIII)V", "RemoteActionCompatParcelizer", "Z", "read", "AudioAttributesCompatParcelizer", "I", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "write", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class accessfilterOutSingleStringCallables {
    public final int AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    public final int write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final int IconCompatParcelizer;

    private accessfilterOutSingleStringCallables(int i, int i2, boolean z, int i3, int i4, int i5) {
        this.write = i;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.read = z;
        this.AudioAttributesCompatParcelizer = i3;
        this.RemoteActionCompatParcelizer = i4;
        this.IconCompatParcelizer = i5;
        if (!z && i2 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i4 == Integer.MAX_VALUE || i4 >= (i2 << 1) + i) {
            if (i5 != Integer.MIN_VALUE && i5 <= 0) {
                throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
            }
        } else {
            StringBuilder sb = new StringBuilder("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=");
            sb.append(i);
            sb.append(", prefetchDist=");
            sb.append(i2);
            sb.append(", maxSize=");
            sb.append(i4);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public /* synthetic */ accessfilterOutSingleStringCallables(int i, int i2, boolean z, int i3, int i4, int i5, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, (i6 & 2) != 0 ? i : i2, (i6 & 4) != 0 ? true : z, (i6 & 8) != 0 ? i * 3 : i3, (i6 & 16) != 0 ? Integer.MAX_VALUE : i4, (i6 & 32) != 0 ? Integer.MIN_VALUE : i5);
    }
}
