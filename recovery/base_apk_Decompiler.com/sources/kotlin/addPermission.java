package kotlin;

import android.graphics.Matrix;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
class addPermission {
    private static Field AudioAttributesCompatParcelizer = null;
    private static boolean IconCompatParcelizer = false;
    private static boolean RemoteActionCompatParcelizer = false;
    private static Method read = null;
    private static boolean write = true;
    private float[] AudioAttributesImplApi21Parcelizer;

    public void AudioAttributesCompatParcelizer(View view) {
    }

    public void RemoteActionCompatParcelizer(View view) {
    }

    addPermission() {
    }

    public void AudioAttributesCompatParcelizer(View view, float f) {
        if (write) {
            try {
                RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                write = false;
            }
        }
        view.setAlpha(f);
    }

    public float IconCompatParcelizer(View view) {
        if (write) {
            try {
                return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(view);
            } catch (NoSuchMethodError unused) {
                write = false;
            }
        }
        return view.getAlpha();
    }

    public void IconCompatParcelizer(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            IconCompatParcelizer((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void AudioAttributesCompatParcelizer(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            AudioAttributesCompatParcelizer((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    public void RemoteActionCompatParcelizer(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float[] fArr = this.AudioAttributesImplApi21Parcelizer;
        if (fArr == null) {
            fArr = new float[9];
            this.AudioAttributesImplApi21Parcelizer = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f * f))) * (fArr[0] < BitmapDescriptorFactory.HUE_RED ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f, fSqrt));
        float f2 = fArr[0] / fSqrt;
        float f3 = fArr[4] / fSqrt;
        float f4 = fArr[2];
        float f5 = fArr[5];
        view.setPivotX(BitmapDescriptorFactory.HUE_RED);
        view.setPivotY(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        view.setRotation(degrees);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    public void write(View view, int i, int i2, int i3, int i4) {
        AudioAttributesCompatParcelizer();
        Method method = read;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public void write(View view, int i) {
        if (!IconCompatParcelizer) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                AudioAttributesCompatParcelizer = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            IconCompatParcelizer = true;
        }
        Field field = AudioAttributesCompatParcelizer;
        if (field != null) {
            try {
                AudioAttributesCompatParcelizer.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    private void AudioAttributesCompatParcelizer() {
        if (RemoteActionCompatParcelizer) {
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            read = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        RemoteActionCompatParcelizer = true;
    }

    static class RemoteActionCompatParcelizer {
        static void AudioAttributesCompatParcelizer(View view, float f) {
            view.setTransitionAlpha(f);
        }

        static float AudioAttributesCompatParcelizer(View view) {
            return view.getTransitionAlpha();
        }
    }
}
