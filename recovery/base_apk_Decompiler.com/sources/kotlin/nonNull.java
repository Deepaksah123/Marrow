package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public final class nonNull implements isCollectionMapOrArray {
    private final long AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public nonNull() {
        this(C.TIME_UNSET);
    }

    private nonNull(long j) {
        this.IconCompatParcelizer = C.TIME_UNSET;
        this.AudioAttributesCompatParcelizer = 0L;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        return new isCollectionMapOrArray.read(new isLocalType(j, this.AudioAttributesCompatParcelizer));
    }
}
