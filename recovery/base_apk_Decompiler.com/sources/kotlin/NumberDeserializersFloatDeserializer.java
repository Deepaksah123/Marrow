package kotlin;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NumberDeserializersFloatDeserializer extends types {
    public abstract void read(View view, float f);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.NumberDeserializersFloatDeserializer AudioAttributesCompatParcelizer(java.lang.String r1) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NumberDeserializersFloatDeserializer.AudioAttributesCompatParcelizer(java.lang.String):o.NumberDeserializersFloatDeserializer");
    }

    static class read extends NumberDeserializersFloatDeserializer {
        read() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setElevation(AudioAttributesCompatParcelizer(f));
        }
    }

    static class AudioAttributesCompatParcelizer extends NumberDeserializersFloatDeserializer {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setAlpha(AudioAttributesCompatParcelizer(f));
        }
    }

    static class AudioAttributesImplApi26Parcelizer extends NumberDeserializersFloatDeserializer {
        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setRotation(AudioAttributesCompatParcelizer(f));
        }
    }

    static class AudioAttributesImplBaseParcelizer extends NumberDeserializersFloatDeserializer {
        AudioAttributesImplBaseParcelizer() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setRotationX(AudioAttributesCompatParcelizer(f));
        }
    }

    static class MediaBrowserCompatItemReceiver extends NumberDeserializersFloatDeserializer {
        MediaBrowserCompatItemReceiver() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setRotationY(AudioAttributesCompatParcelizer(f));
        }
    }

    public static class RemoteActionCompatParcelizer extends NumberDeserializersFloatDeserializer {
        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
        }

        public final void IconCompatParcelizer(View view, float f, double d, double d2) {
            view.setRotation(AudioAttributesCompatParcelizer(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    static class AudioAttributesImplApi21Parcelizer extends NumberDeserializersFloatDeserializer {
        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setScaleX(AudioAttributesCompatParcelizer(f));
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver extends NumberDeserializersFloatDeserializer {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setScaleY(AudioAttributesCompatParcelizer(f));
        }
    }

    static class MediaBrowserCompatSearchResultReceiver extends NumberDeserializersFloatDeserializer {
        MediaBrowserCompatSearchResultReceiver() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setTranslationX(AudioAttributesCompatParcelizer(f));
        }
    }

    static class MediaDescriptionCompat extends NumberDeserializersFloatDeserializer {
        MediaDescriptionCompat() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setTranslationY(AudioAttributesCompatParcelizer(f));
        }
    }

    static class RatingCompat extends NumberDeserializersFloatDeserializer {
        RatingCompat() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            view.setTranslationZ(AudioAttributesCompatParcelizer(f));
        }
    }

    static class IconCompatParcelizer extends NumberDeserializersFloatDeserializer {
        private StackTraceElementDeserializer IconCompatParcelizer;
        private float[] read = new float[1];

        IconCompatParcelizer() {
        }

        @Override // kotlin.types
        public final void IconCompatParcelizer(Object obj) {
            this.IconCompatParcelizer = (StackTraceElementDeserializer) obj;
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            this.read[0] = AudioAttributesCompatParcelizer(f);
            NumberDeserializersCharacterDeserializer.IconCompatParcelizer(this.IconCompatParcelizer, view, this.read);
        }
    }

    static class write extends NumberDeserializersFloatDeserializer {
        private boolean read = false;

        write() {
        }

        @Override // kotlin.NumberDeserializersFloatDeserializer
        public final void read(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(AudioAttributesCompatParcelizer(f));
                return;
            }
            if (this.read) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.read = true;
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
