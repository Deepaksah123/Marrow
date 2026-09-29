package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin._init_lambda5;
import kotlin.getFullyDrawnReporter;
import kotlin.setItemInvoker;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    protected final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private Spinner AudioAttributesImplBaseParcelizer;
    Runnable IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    int RemoteActionCompatParcelizer;
    LinearLayoutCompat read;
    protected ViewPropertyAnimator write;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        setHorizontalScrollBarEnabled(false);
        getFullyDrawnReporter getfullydrawnreporterRemoteActionCompatParcelizer = getFullyDrawnReporter.RemoteActionCompatParcelizer(context);
        setContentHeight(getfullydrawnreporterRemoteActionCompatParcelizer.IconCompatParcelizer());
        this.AudioAttributesImplApi26Parcelizer = getfullydrawnreporterRemoteActionCompatParcelizer.write();
        LinearLayoutCompat linearLayoutCompatIconCompatParcelizer = IconCompatParcelizer();
        this.read = linearLayoutCompatIconCompatParcelizer;
        addView(linearLayoutCompatIconCompatParcelizer, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.read.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.RemoteActionCompatParcelizer = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.RemoteActionCompatParcelizer = View.MeasureSpec.getSize(i) / 2;
            }
            this.RemoteActionCompatParcelizer = Math.min(this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
        } else {
            this.RemoteActionCompatParcelizer = -1;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.AudioAttributesImplApi21Parcelizer, 1073741824);
        if (!z && this.MediaBrowserCompatItemReceiver) {
            this.read.measure(0, iMakeMeasureSpec);
            if (this.read.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                read();
            } else {
                write();
            }
        } else {
            write();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private boolean AudioAttributesCompatParcelizer() {
        Spinner spinner = this.AudioAttributesImplBaseParcelizer;
        return spinner != null && spinner.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    private void read() {
        if (AudioAttributesCompatParcelizer()) {
            return;
        }
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer();
        }
        removeView(this.read);
        addView(this.AudioAttributesImplBaseParcelizer, new ViewGroup.LayoutParams(-2, -1));
        if (this.AudioAttributesImplBaseParcelizer.getAdapter() == null) {
            this.AudioAttributesImplBaseParcelizer.setAdapter((SpinnerAdapter) new write());
        }
        Runnable runnable = this.IconCompatParcelizer;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.IconCompatParcelizer = null;
        }
        this.AudioAttributesImplBaseParcelizer.setSelection(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private boolean write() {
        if (!AudioAttributesCompatParcelizer()) {
            return false;
        }
        removeView(this.AudioAttributesImplBaseParcelizer);
        addView(this.read, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.AudioAttributesImplBaseParcelizer.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        int childCount = this.read.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.read.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                AudioAttributesCompatParcelizer(i);
            }
            i2++;
        }
        Spinner spinner = this.AudioAttributesImplBaseParcelizer;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }

    public void setContentHeight(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        requestLayout();
    }

    private LinearLayoutCompat IconCompatParcelizer() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, _init_lambda5.read.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    private Spinner RemoteActionCompatParcelizer() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, _init_lambda5.read.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getFullyDrawnReporter getfullydrawnreporterRemoteActionCompatParcelizer = getFullyDrawnReporter.RemoteActionCompatParcelizer(getContext());
        setContentHeight(getfullydrawnreporterRemoteActionCompatParcelizer.IconCompatParcelizer());
        this.AudioAttributesImplApi26Parcelizer = getfullydrawnreporterRemoteActionCompatParcelizer.write();
    }

    private void AudioAttributesCompatParcelizer(int i) {
        final View childAt = this.read.getChildAt(i);
        Runnable runnable = this.IconCompatParcelizer;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: androidx.appcompat.widget.ScrollingTabContainerView.5
            @Override // java.lang.Runnable
            public final void run() {
                ScrollingTabContainerView.this.smoothScrollTo(childAt.getLeft() - ((ScrollingTabContainerView.this.getWidth() - childAt.getWidth()) / 2), 0);
                ScrollingTabContainerView.this.IconCompatParcelizer = null;
            }
        };
        this.IconCompatParcelizer = runnable2;
        post(runnable2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.IconCompatParcelizer;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.IconCompatParcelizer;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(ActionBar.write writeVar) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(getContext(), writeVar, true);
        remoteActionCompatParcelizer.setBackgroundDrawable(null);
        remoteActionCompatParcelizer.setLayoutParams(new AbsListView.LayoutParams(-1, this.AudioAttributesImplApi21Parcelizer));
        return remoteActionCompatParcelizer;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((RemoteActionCompatParcelizer) view).RemoteActionCompatParcelizer();
    }

    class RemoteActionCompatParcelizer extends LinearLayout {
        private View AudioAttributesCompatParcelizer;
        private ImageView IconCompatParcelizer;
        private TextView MediaBrowserCompatCustomActionResultReceiver;
        private ActionBar.write RemoteActionCompatParcelizer;
        private final int[] write;

        public RemoteActionCompatParcelizer(Context context, ActionBar.write writeVar, boolean z) {
            super(context, null, _init_lambda5.read.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.write = iArr;
            this.RemoteActionCompatParcelizer = writeVar;
            setTitle settitle = setTitle.read(context, null, iArr, _init_lambda5.read.actionBarTabStyle, 0);
            if (settitle.AudioAttributesImplApi26Parcelizer(0)) {
                setBackgroundDrawable(settitle.IconCompatParcelizer(0));
            }
            settitle.write();
            setGravity(8388627);
            AudioAttributesCompatParcelizer();
        }

        public final void IconCompatParcelizer(ActionBar.write writeVar) {
            this.RemoteActionCompatParcelizer = writeVar;
            AudioAttributesCompatParcelizer();
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.RemoteActionCompatParcelizer <= 0 || getMeasuredWidth() <= ScrollingTabContainerView.this.RemoteActionCompatParcelizer) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ScrollingTabContainerView.this.RemoteActionCompatParcelizer, 1073741824), i2);
        }

        private void AudioAttributesCompatParcelizer() {
            ActionBar.write writeVar = this.RemoteActionCompatParcelizer;
            View viewAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer();
            if (viewAudioAttributesCompatParcelizer != null) {
                ViewParent parent = viewAudioAttributesCompatParcelizer.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewAudioAttributesCompatParcelizer);
                    }
                    addView(viewAudioAttributesCompatParcelizer);
                }
                this.AudioAttributesCompatParcelizer = viewAudioAttributesCompatParcelizer;
                TextView textView = this.MediaBrowserCompatCustomActionResultReceiver;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.IconCompatParcelizer;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.IconCompatParcelizer.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.AudioAttributesCompatParcelizer;
            if (view != null) {
                removeView(view);
                this.AudioAttributesCompatParcelizer = null;
            }
            Drawable drawableRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer();
            CharSequence charSequenceIconCompatParcelizer = writeVar.IconCompatParcelizer();
            if (drawableRemoteActionCompatParcelizer != null) {
                if (this.IconCompatParcelizer == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.IconCompatParcelizer = appCompatImageView;
                }
                this.IconCompatParcelizer.setImageDrawable(drawableRemoteActionCompatParcelizer);
                this.IconCompatParcelizer.setVisibility(0);
            } else {
                ImageView imageView2 = this.IconCompatParcelizer;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.IconCompatParcelizer.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceIconCompatParcelizer);
            if (!zIsEmpty) {
                if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, _init_lambda5.read.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.MediaBrowserCompatCustomActionResultReceiver = appCompatTextView;
                }
                this.MediaBrowserCompatCustomActionResultReceiver.setText(charSequenceIconCompatParcelizer);
                this.MediaBrowserCompatCustomActionResultReceiver.setVisibility(0);
            } else {
                TextView textView2 = this.MediaBrowserCompatCustomActionResultReceiver;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.MediaBrowserCompatCustomActionResultReceiver.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.IconCompatParcelizer;
            if (imageView3 != null) {
                imageView3.setContentDescription(writeVar.write());
            }
            setItemInvoker.AudioAttributesCompatParcelizer(this, zIsEmpty ? writeVar.write() : null);
        }

        public final ActionBar.write RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    class write extends BaseAdapter {
        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        write() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return ScrollingTabContainerView.this.read.getChildCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return ((RemoteActionCompatParcelizer) ScrollingTabContainerView.this.read.getChildAt(i)).RemoteActionCompatParcelizer();
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.AudioAttributesCompatParcelizer((ActionBar.write) getItem(i));
            }
            ((RemoteActionCompatParcelizer) view).IconCompatParcelizer((ActionBar.write) getItem(i));
            return view;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    protected class AudioAttributesCompatParcelizer extends AnimatorListenerAdapter {
        private boolean IconCompatParcelizer = false;
        private int RemoteActionCompatParcelizer;

        protected AudioAttributesCompatParcelizer() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.IconCompatParcelizer = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.IconCompatParcelizer) {
                return;
            }
            ScrollingTabContainerView.this.write = null;
            ScrollingTabContainerView.this.setVisibility(this.RemoteActionCompatParcelizer);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.IconCompatParcelizer = true;
        }
    }
}
