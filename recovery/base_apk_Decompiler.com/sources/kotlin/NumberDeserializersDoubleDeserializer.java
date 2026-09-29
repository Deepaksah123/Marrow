package kotlin;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NumberDeserializersDoubleDeserializer extends _deserializeFromOther {
    public abstract void IconCompatParcelizer(View view, float f);

    public static NumberDeserializersDoubleDeserializer read(String str, SparseArray<StackTraceElementDeserializer> sparseArray) {
        return new RemoteActionCompatParcelizer(str, sparseArray);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.NumberDeserializersDoubleDeserializer IconCompatParcelizer(java.lang.String r1) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NumberDeserializersDoubleDeserializer.IconCompatParcelizer(java.lang.String):o.NumberDeserializersDoubleDeserializer");
    }

    static class IconCompatParcelizer extends NumberDeserializersDoubleDeserializer {
        IconCompatParcelizer() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setElevation(AudioAttributesCompatParcelizer(f));
        }
    }

    static class AudioAttributesCompatParcelizer extends NumberDeserializersDoubleDeserializer {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setAlpha(AudioAttributesCompatParcelizer(f));
        }
    }

    static class AudioAttributesImplBaseParcelizer extends NumberDeserializersDoubleDeserializer {
        AudioAttributesImplBaseParcelizer() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setRotation(AudioAttributesCompatParcelizer(f));
        }
    }

    static class AudioAttributesImplApi26Parcelizer extends NumberDeserializersDoubleDeserializer {
        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setRotationX(AudioAttributesCompatParcelizer(f));
        }
    }

    static class MediaBrowserCompatItemReceiver extends NumberDeserializersDoubleDeserializer {
        MediaBrowserCompatItemReceiver() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setRotationY(AudioAttributesCompatParcelizer(f));
        }
    }

    static class write extends NumberDeserializersDoubleDeserializer {
        write() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setPivotX(AudioAttributesCompatParcelizer(f));
        }
    }

    static class AudioAttributesImplApi21Parcelizer extends NumberDeserializersDoubleDeserializer {
        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setPivotY(AudioAttributesCompatParcelizer(f));
        }
    }

    public static class read extends NumberDeserializersDoubleDeserializer {
        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
        }

        public final void write(View view, float f, double d, double d2) {
            view.setRotation(AudioAttributesCompatParcelizer(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    static class RatingCompat extends NumberDeserializersDoubleDeserializer {
        RatingCompat() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setScaleX(AudioAttributesCompatParcelizer(f));
        }
    }

    static class MediaBrowserCompatMediaItem extends NumberDeserializersDoubleDeserializer {
        MediaBrowserCompatMediaItem() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setScaleY(AudioAttributesCompatParcelizer(f));
        }
    }

    static class MediaDescriptionCompat extends NumberDeserializersDoubleDeserializer {
        MediaDescriptionCompat() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setTranslationX(AudioAttributesCompatParcelizer(f));
        }
    }

    static class MediaBrowserCompatSearchResultReceiver extends NumberDeserializersDoubleDeserializer {
        MediaBrowserCompatSearchResultReceiver() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setTranslationY(AudioAttributesCompatParcelizer(f));
        }
    }

    static class MediaMetadataCompat extends NumberDeserializersDoubleDeserializer {
        MediaMetadataCompat() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            view.setTranslationZ(AudioAttributesCompatParcelizer(f));
        }
    }

    public static class RemoteActionCompatParcelizer extends NumberDeserializersDoubleDeserializer {
        private String AudioAttributesCompatParcelizer;
        private float[] RemoteActionCompatParcelizer;
        private SparseArray<StackTraceElementDeserializer> write;

        public RemoteActionCompatParcelizer(String str, SparseArray<StackTraceElementDeserializer> sparseArray) {
            this.AudioAttributesCompatParcelizer = str.split(",")[1];
            this.write = sparseArray;
        }

        @Override // kotlin._deserializeFromOther
        public final void write(int i) {
            int size = this.write.size();
            int iRemoteActionCompatParcelizer = this.write.valueAt(0).RemoteActionCompatParcelizer();
            double[] dArr = new double[size];
            this.RemoteActionCompatParcelizer = new float[iRemoteActionCompatParcelizer];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iRemoteActionCompatParcelizer);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.write.keyAt(i2);
                StackTraceElementDeserializer stackTraceElementDeserializerValueAt = this.write.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                stackTraceElementDeserializerValueAt.write(this.RemoteActionCompatParcelizer);
                int i3 = 0;
                while (true) {
                    if (i3 < this.RemoteActionCompatParcelizer.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.read = _deserializeUsingProperties.AudioAttributesCompatParcelizer(i, dArr, dArr2);
        }

        @Override // kotlin._deserializeFromOther
        public final void IconCompatParcelizer(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public final void read(int i, StackTraceElementDeserializer stackTraceElementDeserializer) {
            this.write.append(i, stackTraceElementDeserializer);
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            this.read.AudioAttributesCompatParcelizer(f, this.RemoteActionCompatParcelizer);
            NumberDeserializersCharacterDeserializer.IconCompatParcelizer(this.write.valueAt(0), view, this.RemoteActionCompatParcelizer);
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver extends NumberDeserializersDoubleDeserializer {
        private boolean IconCompatParcelizer = false;

        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // kotlin.NumberDeserializersDoubleDeserializer
        public final void IconCompatParcelizer(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(AudioAttributesCompatParcelizer(f));
                return;
            }
            if (this.IconCompatParcelizer) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.IconCompatParcelizer = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(AudioAttributesCompatParcelizer(f)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }
}
