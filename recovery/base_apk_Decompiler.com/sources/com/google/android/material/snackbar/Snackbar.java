package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import kotlin.AviStreamHeaderChunk;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes.dex */
public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] write;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final AccessibilityManager read;

    static {
        int i = calculateNextSearchBytePosition.IconCompatParcelizer.snackbarButtonStyle;
        write = new int[]{calculateNextSearchBytePosition.IconCompatParcelizer.snackbarButtonStyle, calculateNextSearchBytePosition.IconCompatParcelizer.snackbarTextViewStyle};
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class AudioAttributesCompatParcelizer extends BaseTransientBottomBar.AudioAttributesCompatParcelizer<Snackbar> {
        public void RemoteActionCompatParcelizer() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AudioAttributesCompatParcelizer
        public /* synthetic */ void write(Snackbar snackbar) {
            RemoteActionCompatParcelizer();
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, AviStreamHeaderChunk aviStreamHeaderChunk) {
        super(context, viewGroup, view, aviStreamHeaderChunk);
        this.read = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void AudioAttributesImplApi21Parcelizer() {
        super.AudioAttributesImplApi21Parcelizer();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final boolean write() {
        return super.write();
    }

    public static Snackbar IconCompatParcelizer(View view, CharSequence charSequence, int i) {
        return write(view, charSequence, i);
    }

    private static Snackbar write(View view, CharSequence charSequence, int i) {
        int i2;
        ViewGroup viewGroup = read(view);
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (write(context)) {
            i2 = calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_layout_snackbar_include;
        } else {
            i2 = calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_layout_snackbar_include;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate(i2, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        snackbar.IconCompatParcelizer(charSequence);
        snackbar.read(i);
        return snackbar;
    }

    private static boolean write(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(write);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar AudioAttributesCompatParcelizer(View view, int i) {
        return IconCompatParcelizer(view, view.getResources().getText(i), -2);
    }

    private static ViewGroup read(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Snackbar IconCompatParcelizer(CharSequence charSequence) {
        MediaMetadataCompat().setText(charSequence);
        return this;
    }

    public final Snackbar IconCompatParcelizer(int i, View.OnClickListener onClickListener) {
        return RemoteActionCompatParcelizer(read().getText(i), onClickListener);
    }

    public final Snackbar RemoteActionCompatParcelizer(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button buttonMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonMediaBrowserCompatMediaItem.setVisibility(8);
            buttonMediaBrowserCompatMediaItem.setOnClickListener(null);
            this.AudioAttributesImplApi21Parcelizer = false;
            return this;
        }
        this.AudioAttributesImplApi21Parcelizer = true;
        buttonMediaBrowserCompatMediaItem.setVisibility(0);
        buttonMediaBrowserCompatMediaItem.setText(charSequence);
        buttonMediaBrowserCompatMediaItem.setOnClickListener(new View.OnClickListener() { // from class: o.populateFrom
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.write.AudioAttributesCompatParcelizer(onClickListener, view);
            }
        });
        return this;
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        RemoteActionCompatParcelizer(1);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final int AudioAttributesCompatParcelizer() {
        int iAudioAttributesCompatParcelizer = super.AudioAttributesCompatParcelizer();
        if (iAudioAttributesCompatParcelizer == -2) {
            return -2;
        }
        return this.read.getRecommendedTimeoutMillis(iAudioAttributesCompatParcelizer, (this.AudioAttributesImplApi21Parcelizer ? 4 : 0) | 3);
    }

    public final Snackbar AudioAttributesImplApi21Parcelizer(int i) {
        MediaMetadataCompat().setTextColor(i);
        return this;
    }

    public final Snackbar IconCompatParcelizer(int i) {
        MediaBrowserCompatMediaItem().setTextColor(i);
        return this;
    }

    public final Snackbar AudioAttributesImplBaseParcelizer(int i) {
        return RemoteActionCompatParcelizer(ColorStateList.valueOf(i));
    }

    private Snackbar RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        this.IconCompatParcelizer.setBackgroundTintList(colorStateList);
        return this;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public final /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    private TextView MediaMetadataCompat() {
        return MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer();
    }

    private Button MediaBrowserCompatMediaItem() {
        return MediaBrowserCompatSearchResultReceiver().read();
    }

    private SnackbarContentLayout MediaBrowserCompatSearchResultReceiver() {
        return (SnackbarContentLayout) this.IconCompatParcelizer.getChildAt(0);
    }
}
