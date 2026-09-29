package kotlin;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class amrSignatureNb implements VorbisUtilVorbisIdHeader {
    private final float write;

    public amrSignatureNb(float f) {
        this.write = f;
    }

    @Override // kotlin.VorbisUtilVorbisIdHeader
    public final float IconCompatParcelizer(RectF rectF) {
        return this.write;
    }

    public final float write() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amrSignatureNb) && this.write == ((amrSignatureNb) obj).write;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.write)});
    }
}
