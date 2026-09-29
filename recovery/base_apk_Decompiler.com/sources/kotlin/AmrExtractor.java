package kotlin;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class AmrExtractor implements VorbisUtilVorbisIdHeader {
    private final float write;

    public static AmrExtractor RemoteActionCompatParcelizer(amrSignatureNb amrsignaturenb) {
        return new AmrExtractor(amrsignaturenb.write());
    }

    private static float RemoteActionCompatParcelizer(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    private AmrExtractor(float f) {
        this.write = f;
    }

    @Override // kotlin.VorbisUtilVorbisIdHeader
    public final float IconCompatParcelizer(RectF rectF) {
        return Math.min(this.write, RemoteActionCompatParcelizer(rectF));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmrExtractor) && this.write == ((AmrExtractor) obj).write;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.write)});
    }
}
