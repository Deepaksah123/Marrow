package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.ActionBarContextView;
import kotlin.setSplitBackground;
import kotlin.setStackedBackground;
import kotlin.setTransitioning;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final setTransitioning MediaBrowserCompatItemReceiver;
    private static final int[] RemoteActionCompatParcelizer = {R.attr.colorBackground};
    final Rect AudioAttributesCompatParcelizer;
    private final setStackedBackground AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    final Rect IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    int read;
    int write;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        setSplitBackground setsplitbackground = new setSplitBackground();
        MediaBrowserCompatItemReceiver = setsplitbackground;
        setsplitbackground.RemoteActionCompatParcelizer();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ActionBarContextView.RemoteActionCompatParcelizer.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.IconCompatParcelizer = rect;
        this.AudioAttributesCompatParcelizer = new Rect();
        setStackedBackground setstackedbackground = new setStackedBackground() { // from class: androidx.cardview.widget.CardView.5
            private Drawable AudioAttributesCompatParcelizer;

            @Override // kotlin.setStackedBackground
            public final void read(Drawable drawable) {
                this.AudioAttributesCompatParcelizer = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // kotlin.setStackedBackground
            public final boolean IconCompatParcelizer() {
                return CardView.this.AudioAttributesImplApi21Parcelizer();
            }

            @Override // kotlin.setStackedBackground
            public final boolean read() {
                return CardView.this.MediaBrowserCompatItemReceiver();
            }

            @Override // kotlin.setStackedBackground
            public final void write(int i2, int i3, int i4, int i5) {
                CardView.this.AudioAttributesCompatParcelizer.set(i2, i3, i4, i5);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i2 + cardView.IconCompatParcelizer.left, i3 + CardView.this.IconCompatParcelizer.top, i4 + CardView.this.IconCompatParcelizer.right, i5 + CardView.this.IconCompatParcelizer.bottom);
            }

            @Override // kotlin.setStackedBackground
            public final Drawable RemoteActionCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            @Override // kotlin.setStackedBackground
            public final View write() {
                return CardView.this;
            }
        };
        this.AudioAttributesImplApi21Parcelizer = setstackedbackground;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ActionBarContextView.AudioAttributesCompatParcelizer.CardView, i, ActionBarContextView.read.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(RemoteActionCompatParcelizer);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(ActionBarContextView.IconCompatParcelizer.cardview_light_background);
            } else {
                color = getResources().getColor(ActionBarContextView.IconCompatParcelizer.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_cardCornerRadius, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_cardElevation, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_cardMaxElevation, BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getBoolean(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_cardUseCompatPadding, false);
        this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getBoolean(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.read = typedArrayObtainStyledAttributes.getDimensionPixelSize(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_android_minWidth, 0);
        this.write = typedArrayObtainStyledAttributes.getDimensionPixelSize(ActionBarContextView.AudioAttributesCompatParcelizer.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        MediaBrowserCompatItemReceiver.IconCompatParcelizer(setstackedbackground, context, colorStateList, dimension, dimension2, f);
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != z) {
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi21Parcelizer);
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.IconCompatParcelizer.set(i, i2, i3, i4);
        MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!(MediaBrowserCompatItemReceiver instanceof setSplitBackground)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.read = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.write = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, colorStateList);
    }

    public ColorStateList T_() {
        return MediaBrowserCompatItemReceiver.read(this.AudioAttributesImplApi21Parcelizer);
    }

    public int V_() {
        return this.IconCompatParcelizer.left;
    }

    public int W_() {
        return this.IconCompatParcelizer.right;
    }

    public int AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer.top;
    }

    public int U_() {
        return this.IconCompatParcelizer.bottom;
    }

    public void setRadius(float f) {
        MediaBrowserCompatItemReceiver.write(this.AudioAttributesImplApi21Parcelizer, f);
    }

    public float MediaBrowserCompatCustomActionResultReceiver() {
        return MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplApi21Parcelizer);
    }

    public void setCardElevation(float f) {
        MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, f);
    }

    public final float X_() {
        return MediaBrowserCompatItemReceiver.write(this.AudioAttributesImplApi21Parcelizer);
    }

    public void setMaxCardElevation(float f) {
        MediaBrowserCompatItemReceiver.read(this.AudioAttributesImplApi21Parcelizer, f);
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplApi26Parcelizer = z;
            MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(this.AudioAttributesImplApi21Parcelizer);
        }
    }
}
