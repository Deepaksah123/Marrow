package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/postOrRun;", "", "<init>", "()V", "Landroid/widget/ImageView;", "p0", "", "p1", "", "p2", "", "p3", "", "p4", "", "RemoteActionCompatParcelizer", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Landroid/widget/TextView;", "read", "(Landroid/widget/TextView;Ljava/lang/String;)V", "", "IconCompatParcelizer", "(Landroid/widget/TextView;Ljava/lang/String;F)Landroid/widget/TextView;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class postOrRun {
    public static final postOrRun INSTANCE = new postOrRun();

    private postOrRun() {
    }

    public static void RemoteActionCompatParcelizer(ImageView imageView, final String str) {
        toMagicModuleMetaRepoModel.write(imageView, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (imageView.getId() != -1) {
            Resources resources = imageView.getResources();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources, "");
            if (VideoRendererEventListenerEventDispatcherExternalSyntheticLambda8.read(resources, R.drawable.ic_arrow_back)) {
                imageView.animate().cancel();
                final WeakReference weakReference = new WeakReference(imageView);
                final boolean z = false;
                final long j = 200;
                final int i = R.drawable.ic_arrow_back;
                imageView.post(new Runnable(weakReference, z, j, i, str) { // from class: o.removeRange
                    private /* synthetic */ String IconCompatParcelizer;
                    private /* synthetic */ WeakReference write;
                    private /* synthetic */ boolean read = false;
                    private /* synthetic */ long AudioAttributesCompatParcelizer = 200;
                    private /* synthetic */ int RemoteActionCompatParcelizer = R.drawable.ic_arrow_back;

                    {
                        this.IconCompatParcelizer = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        postOrRun.IconCompatParcelizer(this.write, this.read, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(WeakReference weakReference, boolean z, long j, int i, String str) {
        Float fValueOf;
        Float fValueOf2;
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView == null || imageView.getHeight() == 0) {
            return;
        }
        float height = imageView.getHeight() / 2.0f;
        if (z) {
            fValueOf = Float.valueOf(height);
            fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        } else {
            fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            fValueOf2 = Float.valueOf(-height);
        }
        Pair pairWrite = setAction.write(fValueOf, fValueOf2);
        float fFloatValue = ((Number) pairWrite.RemoteActionCompatParcelizer()).floatValue();
        float fFloatValue2 = ((Number) pairWrite.read()).floatValue();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.TRANSLATION_Y, fFloatValue, fFloatValue2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.TRANSLATION_Y, -fFloatValue2, fFloatValue);
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator(1.1f));
        objectAnimatorOfFloat.addListener(new write(weakReference, i, str, objectAnimatorOfFloat2, fFloatValue));
        objectAnimatorOfFloat2.addListener(new IconCompatParcelizer(weakReference, fFloatValue, i, str));
        objectAnimatorOfFloat.start();
    }

    public static final class write extends AnimatorListenerAdapter {
        private /* synthetic */ WeakReference<ImageView> AudioAttributesCompatParcelizer;
        private /* synthetic */ ObjectAnimator IconCompatParcelizer;
        private /* synthetic */ float RemoteActionCompatParcelizer;
        private /* synthetic */ int read;
        private /* synthetic */ String write;

        write(WeakReference<ImageView> weakReference, int i, String str, ObjectAnimator objectAnimator, float f) {
            this.AudioAttributesCompatParcelizer = weakReference;
            this.read = i;
            this.write = str;
            this.IconCompatParcelizer = objectAnimator;
            this.RemoteActionCompatParcelizer = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ImageView imageView = this.AudioAttributesCompatParcelizer.get();
            if (imageView != null) {
                int i = this.read;
                String str = this.write;
                ObjectAnimator objectAnimator = this.IconCompatParcelizer;
                imageView.setImageResource(i);
                imageView.setTag(str);
                objectAnimator.start();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ImageView imageView = this.AudioAttributesCompatParcelizer.get();
            if (imageView != null) {
                float f = this.RemoteActionCompatParcelizer;
                int i = this.read;
                String str = this.write;
                imageView.setTranslationY(f);
                imageView.setImageResource(i);
                imageView.setTag(str);
            }
        }
    }

    public static final class IconCompatParcelizer extends AnimatorListenerAdapter {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ int IconCompatParcelizer;
        private /* synthetic */ WeakReference<ImageView> read;
        private /* synthetic */ float write;

        IconCompatParcelizer(WeakReference<ImageView> weakReference, float f, int i, String str) {
            this.read = weakReference;
            this.write = f;
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ImageView imageView = this.read.get();
            if (imageView != null) {
                float f = this.write;
                int i = this.IconCompatParcelizer;
                String str = this.AudioAttributesCompatParcelizer;
                imageView.setTranslationY(f);
                imageView.setImageResource(i);
                imageView.setTag(str);
            }
        }
    }

    public final void read(final TextView textView, final String str) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        toMagicModuleMetaRepoModel.write(textView, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) textView.getText(), (Object) str)) {
            return;
        }
        ViewParent parent = textView.getParent();
        getShowPopup getshowpopup = null;
        final ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            textView.animate().cancel();
            WeakReference weakReference = new WeakReference(IconCompatParcelizer(textView, textView.getText().toString(), 1.0f));
            final WeakReference weakReference2 = new WeakReference(IconCompatParcelizer(textView, str, BitmapDescriptorFactory.HUE_RED));
            FrameLayout frameLayout = new FrameLayout(textView.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            TextView textView2 = (TextView) weakReference.get();
            if (textView2 != null) {
                frameLayout.addView(textView2);
            }
            TextView textView3 = (TextView) weakReference2.get();
            if (textView3 != null) {
                frameLayout.addView(textView3);
            }
            final FrameLayout frameLayout2 = (FrameLayout) new WeakReference(frameLayout).get();
            if (frameLayout2 != null) {
                viewGroup.addView(frameLayout2, viewGroup.indexOfChild(textView));
                textView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                TextView textView4 = (TextView) weakReference.get();
                if (textView4 != null && (viewPropertyAnimatorAnimate = textView4.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(BitmapDescriptorFactory.HUE_RED)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(150L)) != null && (interpolator = duration.setInterpolator(new AccelerateDecelerateInterpolator())) != null) {
                    final long j = 300;
                    ViewPropertyAnimator viewPropertyAnimatorWithEndAction = interpolator.withEndAction(new Runnable(weakReference2, j, textView, str, viewGroup, frameLayout2) { // from class: o.requestExternalStoragePermission
                        private /* synthetic */ TextView AudioAttributesCompatParcelizer;
                        private /* synthetic */ FrameLayout AudioAttributesImplBaseParcelizer;
                        private /* synthetic */ String IconCompatParcelizer;
                        private /* synthetic */ WeakReference RemoteActionCompatParcelizer;
                        private /* synthetic */ ViewGroup read;
                        private /* synthetic */ long write = 300;

                        {
                            this.AudioAttributesCompatParcelizer = textView;
                            this.IconCompatParcelizer = str;
                            this.read = viewGroup;
                            this.AudioAttributesImplBaseParcelizer = frameLayout2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            postOrRun.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read, this.AudioAttributesImplBaseParcelizer);
                        }
                    });
                    if (viewPropertyAnimatorWithEndAction != null) {
                        viewPropertyAnimatorWithEndAction.start();
                        getshowpopup = getShowPopup.INSTANCE;
                    }
                }
                if (getshowpopup != null) {
                    return;
                }
            }
            textView.setText(str);
            textView.setAlpha(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(WeakReference weakReference, long j, final TextView textView, final String str, final ViewGroup viewGroup, final FrameLayout frameLayout) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        TextView textView2 = (TextView) weakReference.get();
        if (textView2 == null || (viewPropertyAnimatorAnimate = textView2.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(j / 2)) == null || (interpolator = duration.setInterpolator(new AccelerateDecelerateInterpolator())) == null || (viewPropertyAnimatorWithEndAction = interpolator.withEndAction(new Runnable() { // from class: o.recursiveDelete
            @Override // java.lang.Runnable
            public final void run() {
                postOrRun.write(textView, str, viewGroup, frameLayout);
            }
        })) == null) {
            return;
        }
        viewPropertyAnimatorWithEndAction.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(TextView textView, String str, ViewGroup viewGroup, FrameLayout frameLayout) {
        textView.setText(str);
        textView.setAlpha(1.0f);
        viewGroup.removeView(frameLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.widget.TextView IconCompatParcelizer(android.widget.TextView r6, java.lang.String r7, float r8) {
        /*
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            if (r1 == 0) goto L25
            boolean r2 = r1 instanceof android.view.ViewGroup.LayoutParams
            r3 = 0
            if (r2 != 0) goto L15
            r1 = r3
        L15:
            if (r1 == 0) goto L20
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            int r2 = r1.width
            int r1 = r1.height
            r3.<init>(r2, r1)
        L20:
            if (r3 == 0) goto L25
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            goto L2e
        L25:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r3 = r1
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
        L2e:
            r0.setLayoutParams(r3)
            float r1 = r6.getTextSize()
            r2 = 0
            r0.setTextSize(r2, r1)
            android.graphics.Typeface r1 = r6.getTypeface()
            r0.setTypeface(r1)
            int r1 = r6.getGravity()
            r0.setGravity(r1)
            int r1 = r6.getPaddingLeft()
            int r3 = r6.getPaddingTop()
            int r4 = r6.getPaddingRight()
            int r5 = r6.getPaddingBottom()
            r0.setPadding(r1, r3, r4, r5)
            int r1 = r6.getCurrentTextColor()
            r0.setTextColor(r1)
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            r0.setBackground(r1)
            int r1 = r6.getTextAlignment()
            r0.setTextAlignment(r1)
            float r1 = r6.getLetterSpacing()
            r0.setLetterSpacing(r1)
            float r1 = r6.getLineSpacingExtra()
            float r3 = r6.getLineSpacingMultiplier()
            r0.setLineSpacing(r1, r3)
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawables()
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r6, r1)
            r1 = r6[r2]
            r2 = 1
            r2 = r6[r2]
            r3 = 2
            r3 = r6[r3]
            r4 = 3
            r6 = r6[r4]
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r6)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0.setText(r7)
            r0.setAlpha(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.postOrRun.IconCompatParcelizer(android.widget.TextView, java.lang.String, float):android.widget.TextView");
    }
}
