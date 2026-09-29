package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Size;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J+\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/lambdaupdatePlaybackInfo19;", "Lo/lambdaupdatePlaybackInfo23;", "", "p0", "<init>", "(B)V", "p1", "p2", "p3", "(FFFF)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "IconCompatParcelizer", "()Ljava/lang/String;", "toString", "Lo/setDeviceVolumeControlEnabled;", "Landroid/graphics/Bitmap;", "Lcoil/size/Size;", "read", "(Lo/setDeviceVolumeControlEnabled;Landroid/graphics/Bitmap;Lcoil/size/Size;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "F", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class lambdaupdatePlaybackInfo19 implements lambdaupdatePlaybackInfo23 {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    private lambdaupdatePlaybackInfo19(float f, float f2, float f3, float f4) {
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.read = f3;
        this.AudioAttributesCompatParcelizer = f4;
        if (f < BitmapDescriptorFactory.HUE_RED || f2 < BitmapDescriptorFactory.HUE_RED || f3 < BitmapDescriptorFactory.HUE_RED || f4 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("All radii must be >= 0.".toString());
        }
    }

    public /* synthetic */ lambdaupdatePlaybackInfo19(float f, float f2, float f3, float f4, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public lambdaupdatePlaybackInfo19(byte b) {
        this(2.0f, 2.0f, 2.0f, 2.0f);
    }

    @Override // kotlin.lambdaupdatePlaybackInfo23
    public final String IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) lambdaupdatePlaybackInfo19.class.getName());
        sb.append('-');
        sb.append(this.IconCompatParcelizer);
        sb.append(',');
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(',');
        sb.append(this.read);
        sb.append(',');
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    @Override // kotlin.lambdaupdatePlaybackInfo23
    public final Object read(setDeviceVolumeControlEnabled p0, Bitmap p1, Size p2) {
        int width;
        int height;
        Paint paint = new Paint(3);
        if (p2 instanceof PixelSize) {
            ExoPlayerBuilderExternalSyntheticLambda22 exoPlayerBuilderExternalSyntheticLambda22 = ExoPlayerBuilderExternalSyntheticLambda22.INSTANCE;
            PixelSize pixelSize = (PixelSize) p2;
            double d = ExoPlayerBuilderExternalSyntheticLambda22.read(p1.getWidth(), p1.getHeight(), pixelSize.getRead(), pixelSize.getWrite(), lambdaupdatePlaybackInfo16.FILL);
            width = getOnline.read(((double) pixelSize.getRead()) / d);
            height = getOnline.read(((double) pixelSize.getWrite()) / d);
        } else if (p2 instanceof OriginalSize) {
            width = p1.getWidth();
            height = p1.getHeight();
        } else {
            throw new RenewEligibleCreator();
        }
        Bitmap bitmap = p0.read(width, height, maybeNotifySurfaceSizeChanged.AudioAttributesCompatParcelizer(p1));
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        matrix.setTranslate((width - p1.getWidth()) / 2.0f, (height - p1.getHeight()) / 2.0f);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(p1, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f = this.IconCompatParcelizer;
        float f2 = this.RemoteActionCompatParcelizer;
        float f3 = this.AudioAttributesCompatParcelizer;
        float f4 = this.read;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmap;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof lambdaupdatePlaybackInfo19)) {
            return false;
        }
        lambdaupdatePlaybackInfo19 lambdaupdateplaybackinfo19 = (lambdaupdatePlaybackInfo19) p0;
        return this.IconCompatParcelizer == lambdaupdateplaybackinfo19.IconCompatParcelizer && this.RemoteActionCompatParcelizer == lambdaupdateplaybackinfo19.RemoteActionCompatParcelizer && this.read == lambdaupdateplaybackinfo19.read && this.AudioAttributesCompatParcelizer == lambdaupdateplaybackinfo19.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.IconCompatParcelizer);
        return (((((iHashCode * 31) + Float.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Float.hashCode(this.read)) * 31) + Float.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornersTransformation(topLeft=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", topRight=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", bottomLeft=");
        sb.append(this.read);
        sb.append(", bottomRight=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public lambdaupdatePlaybackInfo19() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15, null);
    }
}
