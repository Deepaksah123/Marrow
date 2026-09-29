package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.AdWordsRemarketingReporter;
import kotlin.CandleEntry;
import kotlin.GoogleConversionReporter1;
import kotlin.InvalidTypeIdException;
import kotlin.PieEntry;
import kotlin.Rstring;
import kotlin._parseLongPrimitive;
import kotlin.ab;
import kotlin.disableAutomatedUsageReporting;
import kotlin.recordRemarketingPing;
import kotlin.registerReferrer;
import kotlin.reportWithConversionId;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public class ChangeTransform extends Transition {
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaDescriptionCompat;
    private Matrix RatingCompat;
    private static final String[] MediaBrowserCompatSearchResultReceiver = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<RemoteActionCompatParcelizer, float[]> RemoteActionCompatParcelizer = new Property<RemoteActionCompatParcelizer, float[]>(float[].class, "nonTranslations") { // from class: androidx.transition.ChangeTransform.4
        @Override // android.util.Property
        public final /* synthetic */ float[] get(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(RemoteActionCompatParcelizer remoteActionCompatParcelizer, float[] fArr) {
            RemoteActionCompatParcelizer(remoteActionCompatParcelizer, fArr);
        }

        private static void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, float[] fArr) {
            remoteActionCompatParcelizer.read(fArr);
        }
    };
    private static final Property<RemoteActionCompatParcelizer, PointF> MediaMetadataCompat = new Property<RemoteActionCompatParcelizer, PointF>(PointF.class, "translations") { // from class: androidx.transition.ChangeTransform.2
        @Override // android.util.Property
        public final /* synthetic */ PointF get(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return null;
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(RemoteActionCompatParcelizer remoteActionCompatParcelizer, PointF pointF) {
            write(remoteActionCompatParcelizer, pointF);
        }

        private static void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer, PointF pointF) {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(pointF);
        }
    };
    private static final boolean AudioAttributesImplApi21Parcelizer = true;

    public ChangeTransform() {
        this.MediaBrowserCompatMediaItem = true;
        this.MediaDescriptionCompat = true;
        this.RatingCompat = new Matrix();
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatMediaItem = true;
        this.MediaDescriptionCompat = true;
        this.RatingCompat = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, recordRemarketingPing.IconCompatParcelizer);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.MediaBrowserCompatMediaItem = _parseLongPrimitive.read(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.MediaDescriptionCompat = _parseLongPrimitive.read(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    public final String[] write() {
        return MediaBrowserCompatSearchResultReceiver;
    }

    private void AudioAttributesCompatParcelizer(Rstring rstring) {
        View view = rstring.AudioAttributesCompatParcelizer;
        if (view.getVisibility() != 8) {
            rstring.read.put("android:changeTransform:parent", view.getParent());
            rstring.read.put("android:changeTransform:transforms", new read(view));
            Matrix matrix = view.getMatrix();
            rstring.read.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.MediaDescriptionCompat) {
                Matrix matrix2 = new Matrix();
                ab.IconCompatParcelizer((ViewGroup) view.getParent(), matrix2);
                matrix2.preTranslate(-r1.getScrollX(), -r1.getScrollY());
                rstring.read.put("android:changeTransform:parentMatrix", matrix2);
                rstring.read.put("android:changeTransform:intermediateMatrix", view.getTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_transform));
                rstring.read.put("android:changeTransform:intermediateParentMatrix", view.getTag(reportWithConversionId.RemoteActionCompatParcelizer.parent_matrix));
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void read(Rstring rstring) {
        AudioAttributesCompatParcelizer(rstring);
        if (AudioAttributesImplApi21Parcelizer) {
            return;
        }
        ((ViewGroup) rstring.AudioAttributesCompatParcelizer.getParent()).startViewTransition(rstring.AudioAttributesCompatParcelizer);
    }

    @Override // androidx.transition.Transition
    public final void RemoteActionCompatParcelizer(Rstring rstring) {
        AudioAttributesCompatParcelizer(rstring);
    }

    @Override // androidx.transition.Transition
    public final Animator read(ViewGroup viewGroup, Rstring rstring, Rstring rstring2) {
        if (rstring == null || rstring2 == null || !rstring.read.containsKey("android:changeTransform:parent") || !rstring2.read.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) rstring.read.get("android:changeTransform:parent");
        boolean z = this.MediaDescriptionCompat && !write(viewGroup2, (ViewGroup) rstring2.read.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) rstring.read.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            rstring.read.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) rstring.read.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            rstring.read.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            AudioAttributesCompatParcelizer(rstring, rstring2);
        }
        ObjectAnimator objectAnimatorWrite = write(rstring, rstring2, z);
        if (z && objectAnimatorWrite != null && this.MediaBrowserCompatMediaItem) {
            write(viewGroup, rstring, rstring2);
            return objectAnimatorWrite;
        }
        if (!AudioAttributesImplApi21Parcelizer) {
            viewGroup2.endViewTransition(rstring.AudioAttributesCompatParcelizer);
        }
        return objectAnimatorWrite;
    }

    private ObjectAnimator write(Rstring rstring, Rstring rstring2, boolean z) {
        Matrix matrix = (Matrix) rstring.read.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) rstring2.read.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = registerReferrer.write;
        }
        if (matrix2 == null) {
            matrix2 = registerReferrer.write;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        read readVar = (read) rstring2.read.get("android:changeTransform:transforms");
        View view = rstring2.AudioAttributesCompatParcelizer;
        write(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(view, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(remoteActionCompatParcelizer, PropertyValuesHolder.ofObject(RemoteActionCompatParcelizer, new CandleEntry(new float[9]), fArr, fArr2), AdWordsRemarketingReporter.IconCompatParcelizer(MediaMetadataCompat, MediaDescriptionCompat().write(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(view, readVar, remoteActionCompatParcelizer, matrix3, z, this.MediaBrowserCompatMediaItem);
        objectAnimatorOfPropertyValuesHolder.addListener(iconCompatParcelizer);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(iconCompatParcelizer);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private boolean write(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (!read(viewGroup) || !read(viewGroup2)) {
            return viewGroup == viewGroup2;
        }
        Rstring rstringIconCompatParcelizer = IconCompatParcelizer((View) viewGroup, true);
        return rstringIconCompatParcelizer != null && viewGroup2 == rstringIconCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.transition.Transition] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    private void write(ViewGroup viewGroup, Rstring rstring, Rstring rstring2) {
        View view = rstring2.AudioAttributesCompatParcelizer;
        Matrix matrix = new Matrix((Matrix) rstring2.read.get("android:changeTransform:parentMatrix"));
        ab.AudioAttributesCompatParcelizer(viewGroup, matrix);
        PieEntry pieEntry = disableAutomatedUsageReporting.read(view, viewGroup, matrix);
        if (pieEntry != null) {
            pieEntry.IconCompatParcelizer((ViewGroup) rstring.read.get("android:changeTransform:parent"), rstring.AudioAttributesCompatParcelizer);
            ?? r3 = this;
            while (r3.MediaBrowserCompatCustomActionResultReceiver != null) {
                r3 = r3.MediaBrowserCompatCustomActionResultReceiver;
            }
            r3.RemoteActionCompatParcelizer(new write(view, pieEntry));
            if (AudioAttributesImplApi21Parcelizer) {
                if (rstring.AudioAttributesCompatParcelizer != rstring2.AudioAttributesCompatParcelizer) {
                    ab.write(rstring.AudioAttributesCompatParcelizer, BitmapDescriptorFactory.HUE_RED);
                }
                ab.write(view, 1.0f);
            }
        }
    }

    private void AudioAttributesCompatParcelizer(Rstring rstring, Rstring rstring2) {
        Matrix matrix = (Matrix) rstring2.read.get("android:changeTransform:parentMatrix");
        rstring2.AudioAttributesCompatParcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.parent_matrix, matrix);
        Matrix matrix2 = this.RatingCompat;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) rstring.read.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            rstring.read.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) rstring.read.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    static void write(View view) {
        RemoteActionCompatParcelizer(view, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    static void RemoteActionCompatParcelizer(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        InvalidTypeIdException.IconCompatParcelizer(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    static class read {
        final float AudioAttributesCompatParcelizer;
        final float AudioAttributesImplApi26Parcelizer;
        final float IconCompatParcelizer;
        final float MediaBrowserCompatCustomActionResultReceiver;
        final float MediaBrowserCompatItemReceiver;
        final float RemoteActionCompatParcelizer;
        final float read;
        final float write;

        read(View view) {
            this.MediaBrowserCompatCustomActionResultReceiver = view.getTranslationX();
            this.AudioAttributesImplApi26Parcelizer = view.getTranslationY();
            this.MediaBrowserCompatItemReceiver = InvalidTypeIdException.onPlay(view);
            this.RemoteActionCompatParcelizer = view.getScaleX();
            this.IconCompatParcelizer = view.getScaleY();
            this.read = view.getRotationX();
            this.write = view.getRotationY();
            this.AudioAttributesCompatParcelizer = view.getRotation();
        }

        public final void IconCompatParcelizer(View view) {
            ChangeTransform.RemoteActionCompatParcelizer(view, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this.write, this.AudioAttributesCompatParcelizer);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return readVar.MediaBrowserCompatCustomActionResultReceiver == this.MediaBrowserCompatCustomActionResultReceiver && readVar.AudioAttributesImplApi26Parcelizer == this.AudioAttributesImplApi26Parcelizer && readVar.MediaBrowserCompatItemReceiver == this.MediaBrowserCompatItemReceiver && readVar.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && readVar.IconCompatParcelizer == this.IconCompatParcelizer && readVar.read == this.read && readVar.write == this.write && readVar.AudioAttributesCompatParcelizer == this.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            float f = this.MediaBrowserCompatCustomActionResultReceiver;
            int iFloatToIntBits = f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0;
            float f2 = this.AudioAttributesImplApi26Parcelizer;
            int iFloatToIntBits2 = f2 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f2) : 0;
            float f3 = this.MediaBrowserCompatItemReceiver;
            int iFloatToIntBits3 = f3 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f3) : 0;
            float f4 = this.RemoteActionCompatParcelizer;
            int iFloatToIntBits4 = f4 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f4) : 0;
            float f5 = this.IconCompatParcelizer;
            int iFloatToIntBits5 = f5 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f5) : 0;
            float f6 = this.read;
            int iFloatToIntBits6 = f6 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f6) : 0;
            float f7 = this.write;
            int iFloatToIntBits7 = f7 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f7) : 0;
            float f8 = this.AudioAttributesCompatParcelizer;
            return (((((((((((((iFloatToIntBits * 31) + iFloatToIntBits2) * 31) + iFloatToIntBits3) * 31) + iFloatToIntBits4) * 31) + iFloatToIntBits5) * 31) + iFloatToIntBits6) * 31) + iFloatToIntBits7) * 31) + (f8 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f8) : 0);
        }
    }

    static class write extends GoogleConversionReporter1 {
        private PieEntry IconCompatParcelizer;
        private View RemoteActionCompatParcelizer;

        write(View view, PieEntry pieEntry) {
            this.RemoteActionCompatParcelizer = view;
            this.IconCompatParcelizer = pieEntry;
        }

        @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void read(Transition transition) {
            transition.AudioAttributesCompatParcelizer(this);
            disableAutomatedUsageReporting.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_transform, null);
            this.RemoteActionCompatParcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.parent_matrix, null);
        }

        @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
            this.IconCompatParcelizer.setVisibility(4);
        }

        @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer.setVisibility(0);
        }
    }

    static class RemoteActionCompatParcelizer {
        private final View AudioAttributesCompatParcelizer;
        private float IconCompatParcelizer;
        private float RemoteActionCompatParcelizer;
        private final Matrix read = new Matrix();
        private final float[] write;

        RemoteActionCompatParcelizer(View view, float[] fArr) {
            this.AudioAttributesCompatParcelizer = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.write = fArr2;
            this.RemoteActionCompatParcelizer = fArr2[2];
            this.IconCompatParcelizer = fArr2[5];
            read();
        }

        final void read(float[] fArr) {
            System.arraycopy(fArr, 0, this.write, 0, fArr.length);
            read();
        }

        final void AudioAttributesCompatParcelizer(PointF pointF) {
            this.RemoteActionCompatParcelizer = pointF.x;
            this.IconCompatParcelizer = pointF.y;
            read();
        }

        private void read() {
            float[] fArr = this.write;
            fArr[2] = this.RemoteActionCompatParcelizer;
            fArr[5] = this.IconCompatParcelizer;
            this.read.setValues(fArr);
            ab.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read);
        }

        final Matrix RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    static class IconCompatParcelizer extends AnimatorListenerAdapter {
        private final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        private final View AudioAttributesImplApi26Parcelizer;
        private final boolean AudioAttributesImplBaseParcelizer;
        private final Matrix IconCompatParcelizer;
        private final read MediaBrowserCompatCustomActionResultReceiver;
        private final boolean RemoteActionCompatParcelizer;
        private final Matrix read = new Matrix();
        private boolean write;

        IconCompatParcelizer(View view, read readVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer, Matrix matrix, boolean z, boolean z2) {
            this.RemoteActionCompatParcelizer = z;
            this.AudioAttributesImplBaseParcelizer = z2;
            this.AudioAttributesImplApi26Parcelizer = view;
            this.MediaBrowserCompatCustomActionResultReceiver = readVar;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            this.IconCompatParcelizer = matrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.write = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.write) {
                if (this.RemoteActionCompatParcelizer && this.AudioAttributesImplBaseParcelizer) {
                    write(this.IconCompatParcelizer);
                } else {
                    this.AudioAttributesImplApi26Parcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_transform, null);
                    this.AudioAttributesImplApi26Parcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.parent_matrix, null);
                }
            }
            ab.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, null);
            this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            write(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            ChangeTransform.write(this.AudioAttributesImplApi26Parcelizer);
        }

        private void write(Matrix matrix) {
            this.read.set(matrix);
            this.AudioAttributesImplApi26Parcelizer.setTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_transform, this.read);
            this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }
    }
}
