package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import in.juspay.widget.qrscanner.com.google.zxing.PlanarYUVLuminanceSource;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class j {
    private byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private Rect f;

    public j(byte[] bArr, int i, int i2, int i3, int i4) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.e = i4;
        this.d = i3;
        if (i * i2 <= bArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Image data does not match the resolution. ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append(" > ");
        sb.append(bArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    private Bitmap a(Rect rect, int i) {
        if (b()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.a, this.d, this.b, this.c, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.e == 0) {
            return bitmapDecodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.e);
        return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
    }

    public static byte[] a(int i, byte[] bArr, int i2, int i3) {
        return i != 90 ? i != 180 ? i != 270 ? bArr : b(bArr, i2, i3) : a(bArr, i2, i3) : c(bArr, i2, i3);
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4] = bArr[i5];
            i4--;
        }
        return bArr2;
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i6 * i) + i5];
                i4--;
            }
        }
        return bArr2;
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
                bArr2[i3] = bArr[(i5 * i) + i4];
                i3++;
            }
        }
        return bArr2;
    }

    public Bitmap a(int i) {
        return a(this.f, i);
    }

    public PlanarYUVLuminanceSource a() {
        byte[] bArrA = a(this.e, this.a, this.b, this.c);
        if (b()) {
            int i = this.c;
            int i2 = this.b;
            Rect rect = this.f;
            return new PlanarYUVLuminanceSource(bArrA, i, i2, rect.left, rect.top, rect.width(), this.f.height(), false);
        }
        int i3 = this.b;
        int i4 = this.c;
        Rect rect2 = this.f;
        return new PlanarYUVLuminanceSource(bArrA, i3, i4, rect2.left, rect2.top, rect2.width(), this.f.height(), false);
    }

    public void a(Rect rect) {
        this.f = rect;
    }

    public boolean b() {
        return this.e % 180 != 0;
    }
}
