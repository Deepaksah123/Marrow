package kotlin;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeOutputFormat implements VorbisUtilVorbisIdHeader {
    private final float read;

    private static float read(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public maybeOutputFormat(float f) {
        this.read = f;
    }

    @Override // kotlin.VorbisUtilVorbisIdHeader
    public final float IconCompatParcelizer(RectF rectF) {
        return this.read * read(rectF);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof maybeOutputFormat) && this.read == ((maybeOutputFormat) obj).read;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.read)});
    }
}
