package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes2.dex */
public final class setEncoderPadding {
    public static final Matrix write = new Matrix();
    private static final ThreadLocal<PathMeasure> RemoteActionCompatParcelizer = new ThreadLocal<PathMeasure>() { // from class: o.setEncoderPadding.4
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ PathMeasure initialValue() {
            return AudioAttributesCompatParcelizer();
        }

        private static PathMeasure AudioAttributesCompatParcelizer() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> AudioAttributesCompatParcelizer = new ThreadLocal<Path>() { // from class: o.setEncoderPadding.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Path initialValue() {
            return write();
        }

        private static Path write() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> AudioAttributesImplApi21Parcelizer = new ThreadLocal<Path>() { // from class: o.setEncoderPadding.2
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Path initialValue() {
            return AudioAttributesCompatParcelizer();
        }

        private static Path AudioAttributesCompatParcelizer() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> read = new ThreadLocal<float[]>() { // from class: o.setEncoderPadding.5
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ float[] initialValue() {
            return RemoteActionCompatParcelizer();
        }

        private static float[] RemoteActionCompatParcelizer() {
            return new float[4];
        }
    };
    private static final float IconCompatParcelizer = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int read(float f, float f2, float f3, float f4) {
        int i = f != BitmapDescriptorFactory.HUE_RED ? (int) (f * 527.0f) : 17;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (i * 31 * f3);
        }
        return f4 != BitmapDescriptorFactory.HUE_RED ? (int) (i * 31 * f4) : i;
    }

    public static int write(int i, int i2) {
        return (int) ((((i / 255.0f) * i2) / 255.0f) * 255.0f);
    }

    public static boolean write(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    public static Path read(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != BitmapDescriptorFactory.HUE_RED || pointF4.length() != BitmapDescriptorFactory.HUE_RED)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void read(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float read(Matrix matrix) {
        float[] fArr = read.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = IconCompatParcelizer;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean write(Matrix matrix) {
        float[] fArr = read.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void IconCompatParcelizer(Path path, ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6) {
        if (exoPlayerImplComponentListenerExternalSyntheticLambda6 == null || exoPlayerImplComponentListenerExternalSyntheticLambda6.MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        read(path, ((onCameraMotion) exoPlayerImplComponentListenerExternalSyntheticLambda6.IconCompatParcelizer()).MediaBrowserCompatMediaItem() / 100.0f, ((onCameraMotion) exoPlayerImplComponentListenerExternalSyntheticLambda6.write()).MediaBrowserCompatMediaItem() / 100.0f, ((onCameraMotion) exoPlayerImplComponentListenerExternalSyntheticLambda6.read()).MediaBrowserCompatMediaItem() / 360.0f);
    }

    public static void read(Path path, float f, float f2, float f3) {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        PathMeasure pathMeasure = RemoteActionCompatParcelizer.get();
        Path path2 = AudioAttributesCompatParcelizer.get();
        Path path3 = AudioAttributesImplApi21Parcelizer.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == BitmapDescriptorFactory.HUE_RED) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = setColorInfo.AudioAttributesCompatParcelizer(fMin, length);
            fMax = setColorInfo.AudioAttributesCompatParcelizer(fMax, length);
        }
        if (fMin < BitmapDescriptorFactory.HUE_RED) {
            fMin = setColorInfo.AudioAttributesCompatParcelizer(fMin, length);
        }
        if (fMax < BitmapDescriptorFactory.HUE_RED) {
            fMax = setColorInfo.AudioAttributesCompatParcelizer(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < BitmapDescriptorFactory.HUE_RED) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    public static float IconCompatParcelizer() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float AudioAttributesCompatParcelizer(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap read(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean write(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void RemoteActionCompatParcelizer(Canvas canvas, RectF rectF, Paint paint) {
        IconCompatParcelizer(canvas, rectF, paint);
    }

    public static void IconCompatParcelizer(Canvas canvas, RectF rectF, Paint paint) {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        canvas.saveLayer(rectF, paint);
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }
}
