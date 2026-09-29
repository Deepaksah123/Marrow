package kotlin;

import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class VorbisUtilMode implements VorbisUtilVorbisIdHeader {
    private final float IconCompatParcelizer;
    private final VorbisUtilVorbisIdHeader read;

    public VorbisUtilMode(float f, VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader) {
        while (vorbisUtilVorbisIdHeader instanceof VorbisUtilMode) {
            vorbisUtilVorbisIdHeader = ((VorbisUtilMode) vorbisUtilVorbisIdHeader).read;
            f += ((VorbisUtilMode) vorbisUtilVorbisIdHeader).IconCompatParcelizer;
        }
        this.read = vorbisUtilVorbisIdHeader;
        this.IconCompatParcelizer = f;
    }

    @Override // kotlin.VorbisUtilVorbisIdHeader
    public final float IconCompatParcelizer(RectF rectF) {
        return Math.max(BitmapDescriptorFactory.HUE_RED, this.read.IconCompatParcelizer(rectF) + this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VorbisUtilMode)) {
            return false;
        }
        VorbisUtilMode vorbisUtilMode = (VorbisUtilMode) obj;
        return this.read.equals(vorbisUtilMode.read) && this.IconCompatParcelizer == vorbisUtilMode.IconCompatParcelizer;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.read, Float.valueOf(this.IconCompatParcelizer)});
    }
}
