package kotlin;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class skipBook {
    private int AudioAttributesImplApi21Parcelizer;
    private final Paint AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final Path MediaBrowserCompatCustomActionResultReceiver;
    private final Paint MediaBrowserCompatItemReceiver;
    private final Paint MediaBrowserCompatSearchResultReceiver;
    private int MediaMetadataCompat;
    private final Paint write;
    private static final int[] IconCompatParcelizer = new int[3];
    private static final float[] AudioAttributesCompatParcelizer = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    private static final int[] RemoteActionCompatParcelizer = new int[4];
    private static final float[] read = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    public skipBook() {
        this((byte) 0);
    }

    private skipBook(byte b) {
        this.MediaBrowserCompatCustomActionResultReceiver = new Path();
        Paint paint = new Paint();
        this.MediaBrowserCompatSearchResultReceiver = paint;
        this.AudioAttributesImplApi26Parcelizer = new Paint();
        read(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.write = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.MediaBrowserCompatItemReceiver = new Paint(paint2);
    }

    public final void read(int i) {
        this.MediaMetadataCompat = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i, 68);
        this.AudioAttributesImplBaseParcelizer = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i, 20);
        this.AudioAttributesImplApi21Parcelizer = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i, 0);
        this.AudioAttributesImplApi26Parcelizer.setColor(this.MediaMetadataCompat);
    }

    public final void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(BitmapDescriptorFactory.HUE_RED, -i);
        int[] iArr = IconCompatParcelizer;
        iArr[0] = this.AudioAttributesImplApi21Parcelizer;
        iArr[1] = this.AudioAttributesImplBaseParcelizer;
        iArr[2] = this.MediaMetadataCompat;
        this.MediaBrowserCompatItemReceiver.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, AudioAttributesCompatParcelizer, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.MediaBrowserCompatItemReceiver);
        canvas.restore();
    }

    public final void AudioAttributesCompatParcelizer(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < BitmapDescriptorFactory.HUE_RED;
        Path path = this.MediaBrowserCompatCustomActionResultReceiver;
        if (z) {
            int[] iArr = RemoteActionCompatParcelizer;
            iArr[0] = 0;
            iArr[1] = this.AudioAttributesImplApi21Parcelizer;
            iArr[2] = this.AudioAttributesImplBaseParcelizer;
            iArr[3] = this.MediaMetadataCompat;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = RemoteActionCompatParcelizer;
            iArr2[0] = 0;
            iArr2[1] = this.MediaMetadataCompat;
            iArr2[2] = this.AudioAttributesImplBaseParcelizer;
            iArr2[3] = this.AudioAttributesImplApi21Parcelizer;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = read;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.write.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, RemoteActionCompatParcelizer, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.MediaBrowserCompatSearchResultReceiver);
        }
        canvas.drawArc(rectF, f, f2, true, this.write);
        canvas.restore();
    }

    public final Paint IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }
}
