package kotlin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class drmSessionAcquired {
    private static int AudioAttributesImplApi26Parcelizer = 8000;
    private static DisplayMetrics MediaBrowserCompatItemReceiver = null;
    private static int RatingCompat = 50;
    public static final float IconCompatParcelizer = Float.intBitsToFloat(1);
    private static Rect read = new Rect();
    private static Paint.FontMetrics AudioAttributesImplBaseParcelizer = new Paint.FontMetrics();
    private static Rect RemoteActionCompatParcelizer = new Rect();
    private static DefaultDrmSessionResponseHandler AudioAttributesCompatParcelizer = IconCompatParcelizer();
    private static Rect MediaBrowserCompatCustomActionResultReceiver = new Rect();
    private static Rect write = new Rect();
    private static Paint.FontMetrics AudioAttributesImplApi21Parcelizer = new Paint.FontMetrics();

    public static float IconCompatParcelizer(float f) {
        while (f < BitmapDescriptorFactory.HUE_RED) {
            f += 360.0f;
        }
        return f % 360.0f;
    }

    public static void IconCompatParcelizer(Context context) {
        if (context == null) {
            RatingCompat = ViewConfiguration.getMinimumFlingVelocity();
            AudioAttributesImplApi26Parcelizer = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            RatingCompat = viewConfiguration.getScaledMinimumFlingVelocity();
            AudioAttributesImplApi26Parcelizer = viewConfiguration.getScaledMaximumFlingVelocity();
            MediaBrowserCompatItemReceiver = context.getResources().getDisplayMetrics();
        }
    }

    public static float write(float f) {
        DisplayMetrics displayMetrics = MediaBrowserCompatItemReceiver;
        return displayMetrics == null ? f : f * displayMetrics.density;
    }

    public static int read(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static int AudioAttributesCompatParcelizer(Paint paint, String str) {
        Rect rect = read;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float IconCompatParcelizer(Paint paint) {
        return read(paint, AudioAttributesImplBaseParcelizer);
    }

    public static float read(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float read(Paint paint) {
        return AudioAttributesCompatParcelizer(paint, AudioAttributesImplBaseParcelizer);
    }

    public static float AudioAttributesCompatParcelizer(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static DrmSessionEventListener write(Paint paint, String str) {
        DrmSessionEventListener drmSessionEventListenerIconCompatParcelizer = DrmSessionEventListener.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        AudioAttributesCompatParcelizer(paint, str, drmSessionEventListenerIconCompatParcelizer);
        return drmSessionEventListenerIconCompatParcelizer;
    }

    private static void AudioAttributesCompatParcelizer(Paint paint, String str, DrmSessionEventListener drmSessionEventListener) {
        Rect rect = RemoteActionCompatParcelizer;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        drmSessionEventListener.RemoteActionCompatParcelizer = rect.width();
        drmSessionEventListener.IconCompatParcelizer = rect.height();
    }

    private static DefaultDrmSessionResponseHandler IconCompatParcelizer() {
        return new onReferenceCountDecremented(1);
    }

    public static DefaultDrmSessionResponseHandler write() {
        return AudioAttributesCompatParcelizer;
    }

    public static float write(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d == 0.0d) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return Math.round(d * ((double) r0)) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d < 0.0d ? -d : d)))));
    }

    public static int read(float f) {
        float fWrite = write(f);
        if (Float.isInfinite(fWrite)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10(fWrite))) + 2;
    }

    public static double AudioAttributesCompatParcelizer(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1L : -1L));
    }

    public static void read(lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, float f, float f2, lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2) {
        double d = f;
        double d2 = f2;
        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.IconCompatParcelizer = (float) (((double) lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer) + (Math.cos(Math.toRadians(d2)) * d));
        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.write = (float) (((double) lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write) + (d * Math.sin(Math.toRadians(d2))));
    }

    public static void read(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, AudioAttributesImplApi26Parcelizer);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (i != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < BitmapDescriptorFactory.HUE_RED) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    public static void IconCompatParcelizer(View view) {
        view.postInvalidateOnAnimation();
    }

    public static int AudioAttributesCompatParcelizer() {
        return RatingCompat;
    }

    public static int read() {
        return AudioAttributesImplApi26Parcelizer;
    }

    public static void write(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.IconCompatParcelizer();
        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer = i - (i3 / 2);
        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write = i2 - (i4 / 2);
        drawable.copyBounds(MediaBrowserCompatCustomActionResultReceiver);
        drawable.setBounds(MediaBrowserCompatCustomActionResultReceiver.left, MediaBrowserCompatCustomActionResultReceiver.top, MediaBrowserCompatCustomActionResultReceiver.left + i3, MediaBrowserCompatCustomActionResultReceiver.top + i3);
        int iSave = canvas.save();
        canvas.translate(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public static void write(Canvas canvas, String str, float f, float f2, Paint paint, lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, float f3) {
        float fontMetrics = paint.getFontMetrics(AudioAttributesImplApi21Parcelizer);
        paint.getTextBounds(str, 0, str.length(), write);
        float fWidth = BitmapDescriptorFactory.HUE_RED - write.left;
        float f4 = (-AudioAttributesImplApi21Parcelizer.ascent) + BitmapDescriptorFactory.HUE_RED;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            float fWidth2 = write.width();
            if (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer != 0.5f || lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write != 0.5f) {
                DrmSessionEventListener drmSessionEventListenerWrite = write(write.width(), fontMetrics, f3);
                f -= drmSessionEventListenerWrite.RemoteActionCompatParcelizer * (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer - 0.5f);
                f2 -= drmSessionEventListenerWrite.IconCompatParcelizer * (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write - 0.5f);
                DrmSessionEventListener.IconCompatParcelizer(drmSessionEventListenerWrite);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, fWidth - (fWidth2 * 0.5f), f4 - (fontMetrics * 0.5f), paint);
            canvas.restore();
        } else {
            if (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer != BitmapDescriptorFactory.HUE_RED || lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write != BitmapDescriptorFactory.HUE_RED) {
                fWidth -= write.width() * lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer;
                f4 -= fontMetrics * lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write;
            }
            canvas.drawText(str, fWidth + f, f4 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static DrmSessionEventListener write(float f, float f2, float f3) {
        return AudioAttributesCompatParcelizer(f, f2, f3 * 0.017453292f);
    }

    private static DrmSessionEventListener AudioAttributesCompatParcelizer(float f, float f2, float f3) {
        double d = f3;
        return DrmSessionEventListener.IconCompatParcelizer(Math.abs(((float) Math.cos(d)) * f) + Math.abs(((float) Math.sin(d)) * f2), Math.abs(f * ((float) Math.sin(d))) + Math.abs(f2 * ((float) Math.cos(d))));
    }

    public static int RemoteActionCompatParcelizer() {
        return Build.VERSION.SDK_INT;
    }
}
