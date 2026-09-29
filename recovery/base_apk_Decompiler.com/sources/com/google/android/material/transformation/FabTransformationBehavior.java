package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.BinarySearchSeekerSeekTimestampConverter;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getCeilingBytePosition;
import kotlin.getFlacExtractorConstructor;
import kotlin.getFloorBytePosition;
import kotlin.getMidiExtractorConstructor;
import kotlin.getNextSearchBytePosition;
import kotlin.getSeekTimeUs;
import kotlin.overestimatedResult;
import kotlin.r8lambdaG_Md6muwNF8PWrfJHUJdX20yxC0;
import kotlin.readVorbisCommentMetadataBlock;
import kotlin.updateSeekCeiling;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final int[] AudioAttributesCompatParcelizer;
    private final RectF AudioAttributesImplApi26Parcelizer;
    private final RectF IconCompatParcelizer;
    private float RemoteActionCompatParcelizer;
    private final Rect read;
    private float write;

    protected abstract IconCompatParcelizer read(Context context, boolean z);

    public FabTransformationBehavior() {
        this.read = new Rect();
        this.IconCompatParcelizer = new RectF();
        this.AudioAttributesImplApi26Parcelizer = new RectF();
        this.AudioAttributesCompatParcelizer = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = new Rect();
        this.IconCompatParcelizer = new RectF();
        this.AudioAttributesImplApi26Parcelizer = new RectF();
        this.AudioAttributesCompatParcelizer = new int[2];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int iRemoteActionCompatParcelizer = ((FloatingActionButton) view2).RemoteActionCompatParcelizer();
        return iRemoteActionCompatParcelizer == 0 || iRemoteActionCompatParcelizer == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void IconCompatParcelizer(CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer == 0) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected final AnimatorSet IconCompatParcelizer(final View view, final View view2, final boolean z, boolean z2) {
        IconCompatParcelizer iconCompatParcelizer = read(view2.getContext(), z);
        if (z) {
            this.RemoteActionCompatParcelizer = view.getTranslationX();
            this.write = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        IconCompatParcelizer(view, view2, z, z2, iconCompatParcelizer, arrayList);
        RectF rectF = this.IconCompatParcelizer;
        AudioAttributesCompatParcelizer(view, view2, z, z2, iconCompatParcelizer, arrayList, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        IconCompatParcelizer(view, view2, z, iconCompatParcelizer, arrayList);
        AudioAttributesCompatParcelizer(view, view2, z, z2, iconCompatParcelizer, arrayList, arrayList2);
        IconCompatParcelizer(view, view2, z, z2, iconCompatParcelizer, fWidth, fHeight, arrayList, arrayList2);
        write(view, view2, z, z2, iconCompatParcelizer, arrayList);
        IconCompatParcelizer(view2, z, z2, iconCompatParcelizer, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        getCeilingBytePosition.IconCompatParcelizer(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                    view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    view.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                view2.setVisibility(4);
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        });
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    private static void IconCompatParcelizer(View view, View view2, boolean z, boolean z2, IconCompatParcelizer iconCompatParcelizer, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat;
        float fAudioAttributesImplBaseParcelizer = InvalidTypeIdException.AudioAttributesImplBaseParcelizer(view2) - InvalidTypeIdException.AudioAttributesImplBaseParcelizer(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fAudioAttributesImplBaseParcelizer);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, BitmapDescriptorFactory.HUE_RED);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fAudioAttributesImplBaseParcelizer);
        }
        iconCompatParcelizer.AudioAttributesCompatParcelizer.read("elevation").read(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    private void IconCompatParcelizer(View view, View view2, boolean z, IconCompatParcelizer iconCompatParcelizer, List<Animator> list) {
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view, view2, iconCompatParcelizer.RemoteActionCompatParcelizer);
        float f = read(view, view2, iconCompatParcelizer.RemoteActionCompatParcelizer);
        Pair<updateSeekCeiling, updateSeekCeiling> pairWrite = write(fRemoteActionCompatParcelizer, f, z, iconCompatParcelizer);
        updateSeekCeiling updateseekceiling = (updateSeekCeiling) pairWrite.first;
        updateSeekCeiling updateseekceiling2 = (updateSeekCeiling) pairWrite.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            fRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fRemoteActionCompatParcelizer);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            f = this.write;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f);
        updateseekceiling.read(objectAnimatorOfFloat);
        updateseekceiling2.read(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void AudioAttributesCompatParcelizer(View view, View view2, boolean z, boolean z2, IconCompatParcelizer iconCompatParcelizer, List<Animator> list, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view, view2, iconCompatParcelizer.RemoteActionCompatParcelizer);
        float f = read(view, view2, iconCompatParcelizer.RemoteActionCompatParcelizer);
        Pair<updateSeekCeiling, updateSeekCeiling> pairWrite = write(fRemoteActionCompatParcelizer, f, z, iconCompatParcelizer);
        updateSeekCeiling updateseekceiling = (updateSeekCeiling) pairWrite.first;
        updateSeekCeiling updateseekceiling2 = (updateSeekCeiling) pairWrite.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fRemoteActionCompatParcelizer);
                view2.setTranslationY(-f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, BitmapDescriptorFactory.HUE_RED);
            AudioAttributesCompatParcelizer(view2, iconCompatParcelizer, updateseekceiling, updateseekceiling2, -fRemoteActionCompatParcelizer, -f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fRemoteActionCompatParcelizer);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -f);
        }
        updateseekceiling.read(objectAnimatorOfFloat);
        updateseekceiling2.read(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void AudioAttributesCompatParcelizer(View view, final View view2, boolean z, boolean z2, IconCompatParcelizer iconCompatParcelizer, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof getMidiExtractorConstructor) && (view instanceof ImageView)) {
            final getMidiExtractorConstructor getmidiextractorconstructor = (getMidiExtractorConstructor) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, getSeekTimeUs.RemoteActionCompatParcelizer, 0);
                } else {
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, getSeekTimeUs.RemoteActionCompatParcelizer, 255);
                }
                objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transformation.FabTransformationBehavior.5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view2.invalidate();
                    }
                });
                iconCompatParcelizer.AudioAttributesCompatParcelizer.read("iconFade").read(objectAnimatorOfInt);
                list.add(objectAnimatorOfInt);
                list2.add(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        getmidiextractorconstructor.setCircularRevealOverlayDrawable(drawable);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        getmidiextractorconstructor.setCircularRevealOverlayDrawable(null);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void IconCompatParcelizer(View view, View view2, boolean z, boolean z2, IconCompatParcelizer iconCompatParcelizer, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorRemoteActionCompatParcelizer;
        float f3;
        float f4;
        if (view2 instanceof getMidiExtractorConstructor) {
            final getMidiExtractorConstructor getmidiextractorconstructor = (getMidiExtractorConstructor) view2;
            float fWrite = write(view, view2, iconCompatParcelizer.RemoteActionCompatParcelizer);
            float fIconCompatParcelizer = IconCompatParcelizer(view, view2, iconCompatParcelizer.RemoteActionCompatParcelizer);
            ((FloatingActionButton) view).read(this.read);
            float fWidth = this.read.width() / 2.0f;
            updateSeekCeiling updateseekceiling = iconCompatParcelizer.AudioAttributesCompatParcelizer.read("expansion");
            if (z) {
                if (!z2) {
                    getmidiextractorconstructor.setRevealInfo(new getMidiExtractorConstructor.read(fWrite, fIconCompatParcelizer, fWidth));
                }
                if (z2) {
                    f4 = f2;
                    fWidth = getmidiextractorconstructor.write().RemoteActionCompatParcelizer;
                    f3 = f;
                } else {
                    f3 = f;
                    f4 = f2;
                }
                animatorRemoteActionCompatParcelizer = r8lambdaG_Md6muwNF8PWrfJHUJdX20yxC0.RemoteActionCompatParcelizer(getmidiextractorconstructor, fWrite, fIconCompatParcelizer, readVorbisCommentMetadataBlock.IconCompatParcelizer(fWrite, fIconCompatParcelizer, f3, f4));
                animatorRemoteActionCompatParcelizer.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        getMidiExtractorConstructor.read readVarWrite = getmidiextractorconstructor.write();
                        readVarWrite.RemoteActionCompatParcelizer = Float.MAX_VALUE;
                        getmidiextractorconstructor.setRevealInfo(readVarWrite);
                    }
                });
                write(view2, updateseekceiling.AudioAttributesCompatParcelizer(), (int) fWrite, (int) fIconCompatParcelizer, fWidth, list);
            } else {
                float f5 = getmidiextractorconstructor.write().RemoteActionCompatParcelizer;
                Animator animatorRemoteActionCompatParcelizer2 = r8lambdaG_Md6muwNF8PWrfJHUJdX20yxC0.RemoteActionCompatParcelizer(getmidiextractorconstructor, fWrite, fIconCompatParcelizer, fWidth);
                int i = (int) fWrite;
                int i2 = (int) fIconCompatParcelizer;
                write(view2, updateseekceiling.AudioAttributesCompatParcelizer(), i, i2, f5, list);
                write(view2, updateseekceiling.AudioAttributesCompatParcelizer(), updateseekceiling.write(), iconCompatParcelizer.AudioAttributesCompatParcelizer.read(), i, i2, fWidth, list);
                animatorRemoteActionCompatParcelizer = animatorRemoteActionCompatParcelizer2;
            }
            updateseekceiling.read(animatorRemoteActionCompatParcelizer);
            list.add(animatorRemoteActionCompatParcelizer);
            list2.add(r8lambdaG_Md6muwNF8PWrfJHUJdX20yxC0.write(getmidiextractorconstructor));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void write(View view, View view2, boolean z, boolean z2, IconCompatParcelizer iconCompatParcelizer, List<Animator> list) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof getMidiExtractorConstructor) {
            getMidiExtractorConstructor getmidiextractorconstructor = (getMidiExtractorConstructor) view2;
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(view);
            if (z) {
                if (!z2) {
                    getmidiextractorconstructor.setCircularRevealScrimColor(iAudioAttributesCompatParcelizer);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(getmidiextractorconstructor, getMidiExtractorConstructor.write.read, iAudioAttributesCompatParcelizer & 16777215);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(getmidiextractorconstructor, getMidiExtractorConstructor.write.read, iAudioAttributesCompatParcelizer);
            }
            objectAnimatorOfInt.setEvaluator(getFloorBytePosition.AudioAttributesCompatParcelizer());
            iconCompatParcelizer.AudioAttributesCompatParcelizer.read(TtmlNode.ATTR_TTS_COLOR).read(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void IconCompatParcelizer(View view, boolean z, boolean z2, IconCompatParcelizer iconCompatParcelizer, List<Animator> list) {
        ViewGroup viewGroupRemoteActionCompatParcelizer;
        ObjectAnimator objectAnimatorOfFloat;
        if (view instanceof ViewGroup) {
            if (((view instanceof getMidiExtractorConstructor) && getFlacExtractorConstructor.RemoteActionCompatParcelizer == 0) || (viewGroupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    getNextSearchBytePosition.read.set(viewGroupRemoteActionCompatParcelizer, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupRemoteActionCompatParcelizer, getNextSearchBytePosition.read, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupRemoteActionCompatParcelizer, getNextSearchBytePosition.read, BitmapDescriptorFactory.HUE_RED);
            }
            iconCompatParcelizer.AudioAttributesCompatParcelizer.read("contentFade").read(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    private static Pair<updateSeekCeiling, updateSeekCeiling> write(float f, float f2, boolean z, IconCompatParcelizer iconCompatParcelizer) {
        updateSeekCeiling updateseekceiling;
        updateSeekCeiling updateseekceiling2;
        if (f == BitmapDescriptorFactory.HUE_RED || f2 == BitmapDescriptorFactory.HUE_RED) {
            updateseekceiling = iconCompatParcelizer.AudioAttributesCompatParcelizer.read("translationXLinear");
            updateseekceiling2 = iconCompatParcelizer.AudioAttributesCompatParcelizer.read("translationYLinear");
        } else if ((z && f2 < BitmapDescriptorFactory.HUE_RED) || (!z && f2 > BitmapDescriptorFactory.HUE_RED)) {
            updateseekceiling = iconCompatParcelizer.AudioAttributesCompatParcelizer.read("translationXCurveUpwards");
            updateseekceiling2 = iconCompatParcelizer.AudioAttributesCompatParcelizer.read("translationYCurveUpwards");
        } else {
            updateseekceiling = iconCompatParcelizer.AudioAttributesCompatParcelizer.read("translationXCurveDownwards");
            updateseekceiling2 = iconCompatParcelizer.AudioAttributesCompatParcelizer.read("translationYCurveDownwards");
        }
        return new Pair<>(updateseekceiling, updateseekceiling2);
    }

    private float RemoteActionCompatParcelizer(View view, View view2, overestimatedResult overestimatedresult) {
        float fCenterX;
        float fCenterX2;
        float f;
        RectF rectF = this.IconCompatParcelizer;
        RectF rectF2 = this.AudioAttributesImplApi26Parcelizer;
        IconCompatParcelizer(view, rectF);
        RemoteActionCompatParcelizer(view2, rectF2);
        int i = overestimatedresult.AudioAttributesCompatParcelizer & 7;
        if (i == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else if (i == 5) {
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
            return f + overestimatedresult.read;
        }
        f = fCenterX - fCenterX2;
        return f + overestimatedresult.read;
    }

    private float read(View view, View view2, overestimatedResult overestimatedresult) {
        float fCenterY;
        float fCenterY2;
        float f;
        RectF rectF = this.IconCompatParcelizer;
        RectF rectF2 = this.AudioAttributesImplApi26Parcelizer;
        IconCompatParcelizer(view, rectF);
        RemoteActionCompatParcelizer(view2, rectF2);
        int i = overestimatedresult.AudioAttributesCompatParcelizer & 112;
        if (i == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else if (i == 80) {
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
            return f + overestimatedresult.write;
        }
        f = fCenterY - fCenterY2;
        return f + overestimatedresult.write;
    }

    private void RemoteActionCompatParcelizer(View view, RectF rectF) {
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.AudioAttributesCompatParcelizer);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void IconCompatParcelizer(View view, RectF rectF) {
        RemoteActionCompatParcelizer(view, rectF);
        rectF.offset(this.RemoteActionCompatParcelizer, this.write);
    }

    private float write(View view, View view2, overestimatedResult overestimatedresult) {
        RectF rectF = this.IconCompatParcelizer;
        RectF rectF2 = this.AudioAttributesImplApi26Parcelizer;
        IconCompatParcelizer(view, rectF);
        RemoteActionCompatParcelizer(view2, rectF2);
        rectF2.offset(-RemoteActionCompatParcelizer(view, view2, overestimatedresult), BitmapDescriptorFactory.HUE_RED);
        return rectF.centerX() - rectF2.left;
    }

    private float IconCompatParcelizer(View view, View view2, overestimatedResult overestimatedresult) {
        RectF rectF = this.IconCompatParcelizer;
        RectF rectF2 = this.AudioAttributesImplApi26Parcelizer;
        IconCompatParcelizer(view, rectF);
        RemoteActionCompatParcelizer(view2, rectF2);
        rectF2.offset(BitmapDescriptorFactory.HUE_RED, -read(view, view2, overestimatedresult));
        return rectF.centerY() - rectF2.top;
    }

    private void AudioAttributesCompatParcelizer(View view, IconCompatParcelizer iconCompatParcelizer, updateSeekCeiling updateseekceiling, updateSeekCeiling updateseekceiling2, float f, float f2, RectF rectF) {
        float fIconCompatParcelizer = IconCompatParcelizer(iconCompatParcelizer, updateseekceiling, f, BitmapDescriptorFactory.HUE_RED);
        float fIconCompatParcelizer2 = IconCompatParcelizer(iconCompatParcelizer, updateseekceiling2, f2, BitmapDescriptorFactory.HUE_RED);
        Rect rect = this.read;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.IconCompatParcelizer;
        rectF2.set(rect);
        RectF rectF3 = this.AudioAttributesImplApi26Parcelizer;
        RemoteActionCompatParcelizer(view, rectF3);
        rectF3.offset(fIconCompatParcelizer, fIconCompatParcelizer2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private static float IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, updateSeekCeiling updateseekceiling, float f, float f2) {
        long jAudioAttributesCompatParcelizer = updateseekceiling.AudioAttributesCompatParcelizer();
        long jWrite = updateseekceiling.write();
        updateSeekCeiling updateseekceiling2 = iconCompatParcelizer.AudioAttributesCompatParcelizer.read("expansion");
        return BinarySearchSeekerSeekOperationParams.read(f, BitmapDescriptorFactory.HUE_RED, updateseekceiling.read().getInterpolation((((updateseekceiling2.AudioAttributesCompatParcelizer() + updateseekceiling2.write()) + 17) - jAudioAttributesCompatParcelizer) / jWrite));
    }

    private static ViewGroup RemoteActionCompatParcelizer(View view) {
        View viewFindViewById = view.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_child_content_container);
        if (viewFindViewById != null) {
            return IconCompatParcelizer(viewFindViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return IconCompatParcelizer(((ViewGroup) view).getChildAt(0));
        }
        return IconCompatParcelizer(view);
    }

    private static ViewGroup IconCompatParcelizer(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    private static int AudioAttributesCompatParcelizer(View view) {
        ColorStateList colorStateListWrite = InvalidTypeIdException.write(view);
        if (colorStateListWrite != null) {
            return colorStateListWrite.getColorForState(view.getDrawableState(), colorStateListWrite.getDefaultColor());
        }
        return 0;
    }

    private static void write(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j);
            list.add(animatorCreateCircularReveal);
        }
    }

    private static void write(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(j4);
            animatorCreateCircularReveal.setDuration(j3 - j4);
            list.add(animatorCreateCircularReveal);
        }
    }

    protected static class IconCompatParcelizer {
        public BinarySearchSeekerSeekTimestampConverter AudioAttributesCompatParcelizer;
        public overestimatedResult RemoteActionCompatParcelizer;

        protected IconCompatParcelizer() {
        }
    }
}
