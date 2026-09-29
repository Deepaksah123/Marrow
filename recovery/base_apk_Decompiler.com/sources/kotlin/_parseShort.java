package kotlin;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _parseShort extends _deserializeLocale {
    public abstract boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer);

    public final float read(float f, long j, View view, FromStringDeserializer fromStringDeserializer) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(f, this.RemoteActionCompatParcelizer);
        float f2 = this.RemoteActionCompatParcelizer[1];
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            this.write = false;
            return this.RemoteActionCompatParcelizer[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            this.last_cycle = fromStringDeserializer.AudioAttributesCompatParcelizer(view, this.IconCompatParcelizer);
            if (Float.isNaN(this.last_cycle)) {
                this.last_cycle = BitmapDescriptorFactory.HUE_RED;
            }
        }
        this.last_cycle = (float) ((((double) this.last_cycle) + (((j - this.last_time) * 1.0E-9d) * ((double) f2))) % 1.0d);
        fromStringDeserializer.IconCompatParcelizer(view, this.IconCompatParcelizer, this.last_cycle);
        this.last_time = j;
        float f3 = this.RemoteActionCompatParcelizer[0];
        float fWrite = write(this.last_cycle);
        float f4 = this.RemoteActionCompatParcelizer[2];
        this.write = (f3 == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) ? false : true;
        return (fWrite * f3) + f4;
    }

    public static _parseShort IconCompatParcelizer(String str, SparseArray<StackTraceElementDeserializer> sparseArray) {
        return new IconCompatParcelizer(str, sparseArray);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin._parseShort RemoteActionCompatParcelizer(java.lang.String r1) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._parseShort.RemoteActionCompatParcelizer(java.lang.String):o._parseShort");
    }

    static class write extends _parseShort {
        write() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setElevation(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    static class RemoteActionCompatParcelizer extends _parseShort {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setAlpha(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    static class AudioAttributesImplApi21Parcelizer extends _parseShort {
        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setRotation(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver extends _parseShort {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setRotationX(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    static class AudioAttributesImplBaseParcelizer extends _parseShort {
        AudioAttributesImplBaseParcelizer() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setRotationY(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    public static class read extends _parseShort {
        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            return this.write;
        }

        public final boolean RemoteActionCompatParcelizer(View view, FromStringDeserializer fromStringDeserializer, float f, long j, double d, double d2) {
            view.setRotation(read(f, j, view, fromStringDeserializer) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.write;
        }
    }

    static class AudioAttributesImplApi26Parcelizer extends _parseShort {
        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setScaleX(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    static class MediaBrowserCompatItemReceiver extends _parseShort {
        MediaBrowserCompatItemReceiver() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setScaleY(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    static class MediaDescriptionCompat extends _parseShort {
        MediaDescriptionCompat() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setTranslationX(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    static class MediaBrowserCompatSearchResultReceiver extends _parseShort {
        MediaBrowserCompatSearchResultReceiver() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setTranslationY(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    static class MediaBrowserCompatMediaItem extends _parseShort {
        MediaBrowserCompatMediaItem() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            view.setTranslationZ(read(f, j, view, fromStringDeserializer));
            return this.write;
        }
    }

    public static class IconCompatParcelizer extends _parseShort {
        private SparseArray<float[]> AudioAttributesImplApi21Parcelizer = new SparseArray<>();
        private SparseArray<StackTraceElementDeserializer> AudioAttributesImplApi26Parcelizer;
        private String AudioAttributesImplBaseParcelizer;
        private float[] MediaBrowserCompatCustomActionResultReceiver;
        private float[] MediaBrowserCompatItemReceiver;

        public IconCompatParcelizer(String str, SparseArray<StackTraceElementDeserializer> sparseArray) {
            this.AudioAttributesImplBaseParcelizer = str.split(",")[1];
            this.AudioAttributesImplApi26Parcelizer = sparseArray;
        }

        @Override // kotlin._deserializeLocale
        public final void IconCompatParcelizer(int i) {
            int size = this.AudioAttributesImplApi26Parcelizer.size();
            int iRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.valueAt(0).RemoteActionCompatParcelizer();
            double[] dArr = new double[size];
            int i2 = iRemoteActionCompatParcelizer + 2;
            this.MediaBrowserCompatItemReceiver = new float[i2];
            this.MediaBrowserCompatCustomActionResultReceiver = new float[iRemoteActionCompatParcelizer];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.AudioAttributesImplApi26Parcelizer.keyAt(i3);
                StackTraceElementDeserializer stackTraceElementDeserializerValueAt = this.AudioAttributesImplApi26Parcelizer.valueAt(i3);
                float[] fArrValueAt = this.AudioAttributesImplApi21Parcelizer.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                stackTraceElementDeserializerValueAt.write(this.MediaBrowserCompatItemReceiver);
                int i4 = 0;
                while (true) {
                    if (i4 < this.MediaBrowserCompatItemReceiver.length) {
                        dArr2[i3][i4] = r7[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iRemoteActionCompatParcelizer] = fArrValueAt[0];
                dArr3[iRemoteActionCompatParcelizer + 1] = fArrValueAt[1];
            }
            this.AudioAttributesCompatParcelizer = _deserializeUsingProperties.AudioAttributesCompatParcelizer(i, dArr, dArr2);
        }

        @Override // kotlin._deserializeLocale
        public final void read(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public final void AudioAttributesCompatParcelizer(int i, StackTraceElementDeserializer stackTraceElementDeserializer, float f, int i2, float f2) {
            this.AudioAttributesImplApi26Parcelizer.append(i, stackTraceElementDeserializer);
            this.AudioAttributesImplApi21Parcelizer.append(i, new float[]{f, f2});
            this.read = Math.max(this.read, i2);
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(f, this.MediaBrowserCompatItemReceiver);
            float[] fArr = this.MediaBrowserCompatItemReceiver;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                this.last_cycle = fromStringDeserializer.AudioAttributesCompatParcelizer(view, this.AudioAttributesImplBaseParcelizer);
                if (Float.isNaN(this.last_cycle)) {
                    this.last_cycle = BitmapDescriptorFactory.HUE_RED;
                }
            }
            this.last_cycle = (float) ((((double) this.last_cycle) + (((j - j2) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.last_time = j;
            float fWrite = write(this.last_cycle);
            this.write = false;
            for (int i = 0; i < this.MediaBrowserCompatCustomActionResultReceiver.length; i++) {
                this.write |= ((double) this.MediaBrowserCompatItemReceiver[i]) != 0.0d;
                this.MediaBrowserCompatCustomActionResultReceiver[i] = (this.MediaBrowserCompatItemReceiver[i] * fWrite) + f3;
            }
            NumberDeserializersCharacterDeserializer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.valueAt(0), view, this.MediaBrowserCompatCustomActionResultReceiver);
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                this.write = true;
            }
            return this.write;
        }
    }

    static class AudioAttributesCompatParcelizer extends _parseShort {
        private boolean MediaBrowserCompatCustomActionResultReceiver = false;

        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin._parseShort
        public final boolean read(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(read(f, j, view, fromStringDeserializer));
            } else {
                if (this.MediaBrowserCompatCustomActionResultReceiver) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.MediaBrowserCompatCustomActionResultReceiver = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(read(f, j, view, fromStringDeserializer)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.write;
        }
    }
}
