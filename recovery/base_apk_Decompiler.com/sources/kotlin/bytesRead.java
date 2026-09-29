package kotlin;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.marrow.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bytesRead {
    public static final void RemoteActionCompatParcelizer(List<? extends View> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }

    public static final void AudioAttributesCompatParcelizer(List<? extends View> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
    }

    public static final void AudioAttributesImplApi21Parcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setVisibility(0);
    }

    public static final void MediaBrowserCompatCustomActionResultReceiver(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setVisibility(8);
    }

    public static final void MediaBrowserCompatItemReceiver(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setVisibility(4);
    }

    public static final void IconCompatParcelizer(View view, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: o.checkOpened
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bytesRead.IconCompatParcelizer(getcreatedondatems);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
    }

    public static final void IconCompatParcelizer(View view, boolean z) {
        toMagicModuleMetaRepoModel.write(view, "");
        if (z) {
            read(view);
        } else {
            AudioAttributesCompatParcelizer(view);
        }
    }

    public static final void write(View view, boolean z) {
        toMagicModuleMetaRepoModel.write(view, "");
        if (z) {
            AudioAttributesImplApi21Parcelizer(view);
        } else {
            MediaBrowserCompatItemReceiver(view);
        }
    }

    public static final void read(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setClickable(true);
        view.setEnabled(true);
        view.setAlpha(1.0f);
    }

    public static final void AudioAttributesCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setClickable(false);
        view.setEnabled(false);
        view.setAlpha(0.6f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(TextView textView, int i, int i2, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(textView, "");
        textView.setCompoundDrawablesWithIntrinsicBounds(i != -1 ? _isNaN.getDrawable(textView.getContext(), i) : null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static final void AudioAttributesCompatParcelizer(Context context, View view) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(view, "");
        int i = context.getResources().getConfiguration().orientation;
        double d = updateNavigation.read(context);
        int i2 = getOnline.read(0.18d * d);
        int i3 = getOnline.read(d * 0.07d);
        if (i == 2) {
            view.setPadding(i2, 0, i2, 0);
        } else {
            view.setPadding(i3, 0, i3, 0);
        }
    }

    public static final void IconCompatParcelizer(Context context, View view) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(view, "");
        int i = PlayerControlViewExternalSyntheticLambda1.read(context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i4 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i5 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        toMagicModuleMetaRepoModel.read(layoutParams5, "");
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.setMarginStart(i2 + i);
        marginLayoutParams5.setMarginEnd(i + i4);
        marginLayoutParams5.topMargin = i3;
        marginLayoutParams5.bottomMargin = i5;
        view.setLayoutParams(marginLayoutParams5);
    }

    public static final void write(Context context, View view) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(view, "");
        int i = context.getResources().getConfiguration().orientation;
        double d = updateNavigation.read(context);
        int i2 = getOnline.read(0.18d * d);
        int i3 = getOnline.read(d * 0.07d);
        if (i == 2) {
            view.setPadding(i2, view.getPaddingTop(), i2, view.getPaddingBottom());
        } else {
            view.setPadding(i3, view.getPaddingTop(), i3, view.getPaddingBottom());
        }
    }

    public static final void AudioAttributesCompatParcelizer(Context context, List<? extends View> list) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer(context, (View) it.next());
        }
    }

    public static final void IconCompatParcelizer(Context context, List<? extends View> list) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IconCompatParcelizer(context, (View) it.next());
        }
    }

    public static final void read(TextView textView, int i) {
        toMagicModuleMetaRepoModel.write(textView, "");
        TypedValue typedValue = new TypedValue();
        if (textView.getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            textView.setTextAppearance(typedValue.data);
        }
    }

    public static final void read(View view, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        view.clearAnimation();
        getcreatedondatems.invoke();
    }

    public static final void AudioAttributesCompatParcelizer(ProgressBar progressBar, int i) {
        toMagicModuleMetaRepoModel.write(progressBar, "");
        Animation animation = progressBar.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        if (progressBar.isAttachedToWindow()) {
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", 0, i);
            objectAnimatorOfInt.setDuration(1000L);
            objectAnimatorOfInt.start();
        }
    }

    public static final Pair<Integer, Integer> AudioAttributesImplBaseParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return setAction.write(Integer.valueOf(iArr[0] + view.getWidth()), Integer.valueOf(iArr[1] + view.getHeight()));
    }

    public static final Pair<Integer, Integer> AudioAttributesImplApi26Parcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return setAction.write(Integer.valueOf(iArr[0] + view.getWidth()), Integer.valueOf(iArr[1]));
    }

    public static final void write(final Window window) {
        toMagicModuleMetaRepoModel.write(window, "");
        _IsXOfY.write(window, false);
        final findNameForMutator findnameformutator = new findNameForMutator(window, window.getDecorView());
        findnameformutator.IconCompatParcelizer(2);
        findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
        window.getDecorView().setSystemUiVisibility(5894);
        InvalidTypeIdException.read(window.getDecorView(), new finishBranchObject() { // from class: o.DataSourceInputStream
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return bytesRead.read(findnameformutator, window, view, windowInsetsCompat);
            }
        });
        window.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: o.closeQuietly
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i) {
                bytesRead.AudioAttributesCompatParcelizer(findnameformutator, window);
            }
        });
        window.getDecorView().setOnTouchListener(new View.OnTouchListener() { // from class: o.readToEnd
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return bytesRead.read(findnameformutator, window, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat read(findNameForMutator findnameformutator, Window window, View view, WindowInsetsCompat windowInsetsCompat) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(windowInsetsCompat, "");
        if (!windowInsetsCompat.AudioAttributesCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer())) {
            return windowInsetsCompat;
        }
        findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility());
        return WindowInsetsCompat.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(findNameForMutator findnameformutator, Window window) {
        findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(findNameForMutator findnameformutator, Window window, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesCompatParcelizer(View view, int i, final getAnswerMap<? super View, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        final int i2 = 1;
        view.setOnClickListener(new View.OnClickListener() { // from class: o.DataSpec
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bytesRead.write(i2, getanswermap, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(int i, getAnswerMap getanswermap, View view) {
        view.performHapticFeedback(i);
        toMagicModuleMetaRepoModel.write(view);
        getanswermap.invoke(view);
    }

    public static final class write implements Animation.AnimationListener {
        private /* synthetic */ View read;

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }

        write(View view) {
            this.read = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            this.read.setVisibility(8);
        }
    }

    public static final void write(final View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: o.DataSourceException
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                bytesRead.MediaMetadataCompat(view2);
            }
        };
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        view.post(new Runnable() { // from class: o.isCausedByPositionOutOfRange
            @Override // java.lang.Runnable
            public final void run() {
                bytesRead.RatingCompat(view);
            }
        });
        view.addOnAttachStateChangeListener(new read(onLayoutChangeListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(View view) {
        view.setSystemGestureExclusionRects(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new Rect(0, 0, view.getWidth(), view.getHeight())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RatingCompat(View view) {
        view.setSystemGestureExclusionRects(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new Rect(0, 0, view.getWidth(), view.getHeight())));
    }

    public static final class read implements View.OnAttachStateChangeListener {
        private /* synthetic */ View.OnLayoutChangeListener RemoteActionCompatParcelizer;

        read(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.RemoteActionCompatParcelizer = onLayoutChangeListener;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            view.removeOnLayoutChangeListener(this.RemoteActionCompatParcelizer);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
        }
    }

    public static final void IconCompatParcelizer(View... viewArr) {
        toMagicModuleMetaRepoModel.write(viewArr, "");
        for (View view : viewArr) {
            view.setVisibility(0);
        }
    }

    public static final void read(View... viewArr) {
        toMagicModuleMetaRepoModel.write(viewArr, "");
        for (View view : viewArr) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(View view, long j) {
        toMagicModuleMetaRepoModel.write(view, "");
        if (view.getVisibility() == 0) {
            return;
        }
        view.clearAnimation();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_up_fade_in);
        animationLoadAnimation.setDuration(400L);
        view.setVisibility(0);
        view.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void read(View view, long j) {
        toMagicModuleMetaRepoModel.write(view, "");
        if (view.getVisibility() == 0) {
            view.clearAnimation();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_down_fade_out);
            animationLoadAnimation.setDuration(400L);
            animationLoadAnimation.setAnimationListener(new write(view));
            view.startAnimation(animationLoadAnimation);
        }
    }
}
