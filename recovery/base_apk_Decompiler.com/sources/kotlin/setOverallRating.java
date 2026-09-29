package kotlin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class setOverallRating {
    private static final Paint AudioAttributesCompatParcelizer = new Paint(6);
    private static final Lock RemoteActionCompatParcelizer;

    public static int AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static boolean RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    static {
        new Paint(7);
        RemoteActionCompatParcelizer = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new AudioAttributesCompatParcelizer();
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Lock read() {
        return RemoteActionCompatParcelizer;
    }

    public static Bitmap AudioAttributesCompatParcelizer(access3900 access3900Var, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width2 = bitmap.getWidth() * i2;
        int height2 = bitmap.getHeight() * i;
        float width3 = BitmapDescriptorFactory.HUE_RED;
        if (width2 > height2) {
            width = i2 / bitmap.getHeight();
            width3 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width3 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapWrite = access3900Var.write(i, i2, write(bitmap));
        RemoteActionCompatParcelizer(bitmap, bitmapWrite);
        IconCompatParcelizer(bitmap, bitmapWrite, matrix);
        return bitmapWrite;
    }

    public static Bitmap write(access3900 access3900Var, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            return bitmap;
        }
        Bitmap bitmapWrite = access3900Var.write((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), write(bitmap));
        RemoteActionCompatParcelizer(bitmap, bitmapWrite);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapWrite.getWidth();
            bitmapWrite.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        IconCompatParcelizer(bitmap, bitmapWrite, matrix);
        return bitmapWrite;
    }

    public static Bitmap RemoteActionCompatParcelizer(access3900 access3900Var, Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? write(access3900Var, bitmap, i, i2) : bitmap;
    }

    private static void RemoteActionCompatParcelizer(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap IconCompatParcelizer(access3900 access3900Var, Bitmap bitmap, int i) {
        if (!RemoteActionCompatParcelizer(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        write(i, matrix);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapWrite = access3900Var.write(Math.round(rectF.width()), Math.round(rectF.height()), write(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapWrite.setHasAlpha(bitmap.hasAlpha());
        IconCompatParcelizer(bitmap, bitmapWrite, matrix);
        return bitmapWrite;
    }

    private static void IconCompatParcelizer(Canvas canvas) {
        canvas.setBitmap(null);
    }

    private static Bitmap.Config write(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    private static void IconCompatParcelizer(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = RemoteActionCompatParcelizer;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, AudioAttributesCompatParcelizer);
            IconCompatParcelizer(canvas);
            lock.unlock();
        } catch (Throwable th) {
            RemoteActionCompatParcelizer.unlock();
            throw th;
        }
    }

    private static void write(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    static final class AudioAttributesCompatParcelizer implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }

        AudioAttributesCompatParcelizer() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }
    }
}
