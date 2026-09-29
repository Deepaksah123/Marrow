package kotlin;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import kotlin.findSubtypesCheckRepeatedNames;

/* JADX INFO: loaded from: classes2.dex */
final class ObjectIdInfo {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075 A[Catch: RuntimeException -> 0x007b, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x007b, blocks: (B:32:0x006f, B:34:0x0075), top: B:45:0x006f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static o.ObjectIdInfo.RemoteActionCompatParcelizer write(android.content.Context r4, androidx.fragment.app.Fragment r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.getNextTransition()
            int r7 = IconCompatParcelizer(r5, r6, r7)
            r1 = 0
            r5.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.mContainer
            r2 = 0
            if (r1 == 0) goto L22
            android.view.ViewGroup r1 = r5.mContainer
            int r3 = o.findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.visible_removing_fragment_view_tag
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L22
            android.view.ViewGroup r1 = r5.mContainer
            int r3 = o.findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.visible_removing_fragment_view_tag
            r1.setTag(r3, r2)
        L22:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L2f
            android.view.ViewGroup r1 = r5.mContainer
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L2f
            return r2
        L2f:
            android.view.animation.Animation r1 = r5.onCreateAnimation(r0, r6, r7)
            if (r1 == 0) goto L3b
            o.ObjectIdInfo$RemoteActionCompatParcelizer r4 = new o.ObjectIdInfo$RemoteActionCompatParcelizer
            r4.<init>(r1)
            return r4
        L3b:
            android.animation.Animator r5 = r5.onCreateAnimator(r0, r6, r7)
            if (r5 == 0) goto L47
            o.ObjectIdInfo$RemoteActionCompatParcelizer r4 = new o.ObjectIdInfo$RemoteActionCompatParcelizer
            r4.<init>(r5)
            return r4
        L47:
            if (r7 != 0) goto L4f
            if (r0 == 0) goto L4f
            int r7 = read(r4, r0, r6)
        L4f:
            if (r7 == 0) goto L8b
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L6f
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L6d java.lang.RuntimeException -> L6f
            if (r6 == 0) goto L8b
            o.ObjectIdInfo$RemoteActionCompatParcelizer r0 = new o.ObjectIdInfo$RemoteActionCompatParcelizer     // Catch: android.content.res.Resources.NotFoundException -> L6d java.lang.RuntimeException -> L6f
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L6d java.lang.RuntimeException -> L6f
            return r0
        L6d:
            r4 = move-exception
            throw r4
        L6f:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L7b
            if (r6 == 0) goto L8b
            o.ObjectIdInfo$RemoteActionCompatParcelizer r0 = new o.ObjectIdInfo$RemoteActionCompatParcelizer     // Catch: java.lang.RuntimeException -> L7b
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L7b
            return r0
        L7b:
            r6 = move-exception
            if (r5 != 0) goto L8a
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L8b
            o.ObjectIdInfo$RemoteActionCompatParcelizer r5 = new o.ObjectIdInfo$RemoteActionCompatParcelizer
            r5.<init>(r4)
            return r5
        L8a:
            throw r6
        L8b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ObjectIdInfo.write(android.content.Context, androidx.fragment.app.Fragment, boolean, boolean):o.ObjectIdInfo$RemoteActionCompatParcelizer");
    }

    private static int IconCompatParcelizer(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        }
        if (z) {
            return fragment.getEnterAnim();
        }
        return fragment.getExitAnim();
    }

    private static int read(Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? findSubtypesCheckRepeatedNames.read.fragment_open_enter : findSubtypesCheckRepeatedNames.read.fragment_open_exit;
        }
        if (i == 8194) {
            return z ? findSubtypesCheckRepeatedNames.read.fragment_close_enter : findSubtypesCheckRepeatedNames.read.fragment_close_exit;
        }
        if (i == 8197) {
            if (z) {
                return AudioAttributesCompatParcelizer(context, R.attr.activityCloseEnterAnimation);
            }
            return AudioAttributesCompatParcelizer(context, R.attr.activityCloseExitAnimation);
        }
        if (i == 4099) {
            return z ? findSubtypesCheckRepeatedNames.read.fragment_fade_enter : findSubtypesCheckRepeatedNames.read.fragment_fade_exit;
        }
        if (i != 4100) {
            return -1;
        }
        if (z) {
            return AudioAttributesCompatParcelizer(context, R.attr.activityOpenEnterAnimation);
        }
        return AudioAttributesCompatParcelizer(context, R.attr.activityOpenExitAnimation);
    }

    private static int AudioAttributesCompatParcelizer(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    static class RemoteActionCompatParcelizer {
        public final Animation read;
        public final AnimatorSet write;

        RemoteActionCompatParcelizer(Animation animation) {
            this.read = animation;
            this.write = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        RemoteActionCompatParcelizer(Animator animator) {
            this.read = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.write = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class write extends AnimationSet implements Runnable {
        private boolean AudioAttributesCompatParcelizer;
        private final ViewGroup IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private boolean read;
        private final View write;

        write(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.RemoteActionCompatParcelizer = true;
            this.IconCompatParcelizer = viewGroup;
            this.write = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.RemoteActionCompatParcelizer = true;
            if (this.AudioAttributesCompatParcelizer) {
                return !this.read;
            }
            if (!super.getTransformation(j, transformation)) {
                this.AudioAttributesCompatParcelizer = true;
                childArray.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.RemoteActionCompatParcelizer = true;
            if (this.AudioAttributesCompatParcelizer) {
                return !this.read;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.AudioAttributesCompatParcelizer = true;
                childArray.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer = false;
                this.IconCompatParcelizer.post(this);
            } else {
                this.IconCompatParcelizer.endViewTransition(this.write);
                this.read = true;
            }
        }
    }
}
