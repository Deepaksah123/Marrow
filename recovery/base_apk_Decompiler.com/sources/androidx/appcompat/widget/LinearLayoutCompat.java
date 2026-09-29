package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;
import kotlin.setChecked;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private int AudioAttributesCompatParcelizer;
    private int[] AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private Drawable IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int[] MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int RatingCompat;
    private int RemoteActionCompatParcelizer;
    private int read;
    private boolean write;

    int IconCompatParcelizer(View view, int i) {
        return 0;
    }

    int RemoteActionCompatParcelizer(int i) {
        return 0;
    }

    int RemoteActionCompatParcelizer(View view) {
        return 0;
    }

    int read(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.write = true;
        this.RemoteActionCompatParcelizer = -1;
        this.read = 0;
        this.AudioAttributesImplBaseParcelizer = 8388659;
        setTitle settitle = setTitle.read(context, attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat, i, 0);
        InvalidTypeIdException.IconCompatParcelizer(this, context, _init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat, attributeSet, settitle.AudioAttributesCompatParcelizer(), i, 0);
        int i2 = settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean zAudioAttributesCompatParcelizer = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat_android_baselineAligned, true);
        if (!zAudioAttributesCompatParcelizer) {
            setBaselineAligned(zAudioAttributesCompatParcelizer);
        }
        this.MediaBrowserCompatMediaItem = settitle.MediaBrowserCompatCustomActionResultReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat_android_weightSum);
        this.RemoteActionCompatParcelizer = settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.MediaDescriptionCompat = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(settitle.IconCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat_divider));
        this.MediaMetadataCompat = settitle.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat_showDividers, 0);
        this.MediaBrowserCompatCustomActionResultReceiver = settitle.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.LinearLayoutCompat_dividerPadding, 0);
        settitle.write();
    }

    public void setShowDividers(int i) {
        if (i != this.MediaMetadataCompat) {
            requestLayout();
        }
        this.MediaMetadataCompat = i;
    }

    public Drawable MediaBrowserCompatSearchResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = drawable;
        if (drawable != null) {
            this.AudioAttributesImplApi26Parcelizer = drawable.getIntrinsicWidth();
            this.AudioAttributesCompatParcelizer = drawable.getIntrinsicHeight();
        } else {
            this.AudioAttributesImplApi26Parcelizer = 0;
            this.AudioAttributesCompatParcelizer = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    public int RatingCompat() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.IconCompatParcelizer == null) {
            return;
        }
        if (this.RatingCompat == 1) {
            write(canvas);
        } else {
            RemoteActionCompatParcelizer(canvas);
        }
    }

    void write(Canvas canvas) {
        int bottom;
        int iMediaMetadataCompat = MediaMetadataCompat();
        for (int i = 0; i < iMediaMetadataCompat; i++) {
            View viewIconCompatParcelizer = IconCompatParcelizer(i);
            if (viewIconCompatParcelizer != null && viewIconCompatParcelizer.getVisibility() != 8 && AudioAttributesCompatParcelizer(i)) {
                write(canvas, (viewIconCompatParcelizer.getTop() - ((ViewGroup.MarginLayoutParams) ((LayoutParams) viewIconCompatParcelizer.getLayoutParams())).topMargin) - this.AudioAttributesCompatParcelizer);
            }
        }
        if (AudioAttributesCompatParcelizer(iMediaMetadataCompat)) {
            View viewIconCompatParcelizer2 = IconCompatParcelizer(iMediaMetadataCompat - 1);
            if (viewIconCompatParcelizer2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.AudioAttributesCompatParcelizer;
            } else {
                bottom = viewIconCompatParcelizer2.getBottom() + ((ViewGroup.MarginLayoutParams) ((LayoutParams) viewIconCompatParcelizer2.getLayoutParams())).bottomMargin;
            }
            write(canvas, bottom);
        }
    }

    void RemoteActionCompatParcelizer(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int iMediaMetadataCompat = MediaMetadataCompat();
        boolean zAudioAttributesCompatParcelizer = setChecked.AudioAttributesCompatParcelizer(this);
        for (int i2 = 0; i2 < iMediaMetadataCompat; i2++) {
            View viewIconCompatParcelizer = IconCompatParcelizer(i2);
            if (viewIconCompatParcelizer != null && viewIconCompatParcelizer.getVisibility() != 8 && AudioAttributesCompatParcelizer(i2)) {
                LayoutParams layoutParams = (LayoutParams) viewIconCompatParcelizer.getLayoutParams();
                if (zAudioAttributesCompatParcelizer) {
                    left2 = viewIconCompatParcelizer.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                } else {
                    left2 = (viewIconCompatParcelizer.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.AudioAttributesImplApi26Parcelizer;
                }
                RemoteActionCompatParcelizer(canvas, left2);
            }
        }
        if (AudioAttributesCompatParcelizer(iMediaMetadataCompat)) {
            View viewIconCompatParcelizer2 = IconCompatParcelizer(iMediaMetadataCompat - 1);
            if (viewIconCompatParcelizer2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) viewIconCompatParcelizer2.getLayoutParams();
                if (zAudioAttributesCompatParcelizer) {
                    left = viewIconCompatParcelizer2.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                    i = this.AudioAttributesImplApi26Parcelizer;
                    right = left - i;
                } else {
                    right = viewIconCompatParcelizer2.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                }
            } else if (zAudioAttributesCompatParcelizer) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.AudioAttributesImplApi26Parcelizer;
                right = left - i;
            }
            RemoteActionCompatParcelizer(canvas, right);
        }
    }

    void write(Canvas canvas, int i) {
        Drawable drawable = this.IconCompatParcelizer;
        int paddingLeft = getPaddingLeft();
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int width = getWidth();
        int paddingRight = getPaddingRight();
        drawable.setBounds(paddingLeft + i2, i, (width - paddingRight) - this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer + i);
        this.IconCompatParcelizer.draw(canvas);
    }

    void RemoteActionCompatParcelizer(Canvas canvas, int i) {
        this.IconCompatParcelizer.setBounds(i, getPaddingTop() + this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer + i, (getHeight() - getPaddingBottom()) - this.MediaBrowserCompatCustomActionResultReceiver);
        this.IconCompatParcelizer.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.write = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.RemoteActionCompatParcelizer < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.RemoteActionCompatParcelizer;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.RemoteActionCompatParcelizer == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.read;
        if (this.RatingCompat == 1 && (i = this.AudioAttributesImplBaseParcelizer & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.MediaBrowserCompatSearchResultReceiver) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.MediaBrowserCompatSearchResultReceiver;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.RemoteActionCompatParcelizer = i;
    }

    View IconCompatParcelizer(int i) {
        return getChildAt(i);
    }

    int MediaMetadataCompat() {
        return getChildCount();
    }

    public void setWeightSum(float f) {
        this.MediaBrowserCompatMediaItem = Math.max(BitmapDescriptorFactory.HUE_RED, f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.RatingCompat == 1) {
            write(i, i2);
        } else {
            AudioAttributesCompatParcelizer(i, i2);
        }
    }

    protected boolean AudioAttributesCompatParcelizer(int i) {
        if (i == 0) {
            return (this.MediaMetadataCompat & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.MediaMetadataCompat & 4) != 0;
        }
        if ((this.MediaMetadataCompat & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    void write(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        int iMediaMetadataCompat = MediaMetadataCompat();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i18 = this.RemoteActionCompatParcelizer;
        boolean z2 = this.MediaDescriptionCompat;
        int iMax2 = 0;
        int iMax3 = 0;
        int i19 = 0;
        int i20 = 0;
        int iMax4 = 0;
        int iIconCompatParcelizer = 0;
        boolean z3 = false;
        boolean z4 = false;
        float f = 0.0f;
        boolean z5 = true;
        while (true) {
            int i21 = 8;
            int i22 = i20;
            if (iIconCompatParcelizer < iMediaMetadataCompat) {
                View viewIconCompatParcelizer = IconCompatParcelizer(iIconCompatParcelizer);
                if (viewIconCompatParcelizer == null) {
                    this.MediaBrowserCompatSearchResultReceiver += RemoteActionCompatParcelizer(iIconCompatParcelizer);
                    i9 = iMax2;
                } else {
                    i9 = iMax2;
                    if (viewIconCompatParcelizer.getVisibility() == 8) {
                        iIconCompatParcelizer += IconCompatParcelizer(viewIconCompatParcelizer, iIconCompatParcelizer);
                    } else {
                        if (AudioAttributesCompatParcelizer(iIconCompatParcelizer)) {
                            this.MediaBrowserCompatSearchResultReceiver += this.AudioAttributesCompatParcelizer;
                        }
                        LayoutParams layoutParams = (LayoutParams) viewIconCompatParcelizer.getLayoutParams();
                        float f2 = f + ((LinearLayout.LayoutParams) layoutParams).weight;
                        if (mode2 == 1073741824 && ((ViewGroup.LayoutParams) layoutParams).height == 0 && ((LinearLayout.LayoutParams) layoutParams).weight > BitmapDescriptorFactory.HUE_RED) {
                            int i23 = this.MediaBrowserCompatSearchResultReceiver;
                            this.MediaBrowserCompatSearchResultReceiver = Math.max(i23, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + i23 + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            i12 = i19;
                            i17 = iIconCompatParcelizer;
                            i15 = iMediaMetadataCompat;
                            z3 = true;
                            i16 = i9;
                            i11 = iMax3;
                            i13 = mode2;
                            i14 = i22;
                        } else {
                            int i24 = iMax3;
                            if (((ViewGroup.LayoutParams) layoutParams).height != 0 || ((LinearLayout.LayoutParams) layoutParams).weight <= BitmapDescriptorFactory.HUE_RED) {
                                i10 = Integer.MIN_VALUE;
                            } else {
                                ((ViewGroup.LayoutParams) layoutParams).height = -2;
                                i10 = 0;
                            }
                            int i25 = i10;
                            i11 = i24;
                            i12 = i19;
                            i13 = mode2;
                            i14 = i22;
                            i15 = iMediaMetadataCompat;
                            int i26 = iMax4;
                            i16 = i9;
                            i17 = iIconCompatParcelizer;
                            IconCompatParcelizer(viewIconCompatParcelizer, iIconCompatParcelizer, i, 0, i2, f2 == BitmapDescriptorFactory.HUE_RED ? this.MediaBrowserCompatSearchResultReceiver : 0);
                            if (i25 != Integer.MIN_VALUE) {
                                ((ViewGroup.LayoutParams) layoutParams).height = i25;
                            }
                            int measuredHeight = viewIconCompatParcelizer.getMeasuredHeight();
                            int i27 = this.MediaBrowserCompatSearchResultReceiver;
                            viewIconCompatParcelizer = viewIconCompatParcelizer;
                            this.MediaBrowserCompatSearchResultReceiver = Math.max(i27, i27 + measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + RemoteActionCompatParcelizer(viewIconCompatParcelizer));
                            iMax4 = z2 ? Math.max(measuredHeight, i26) : i26;
                        }
                        if (i18 >= 0 && i18 == i17 + 1) {
                            this.read = this.MediaBrowserCompatSearchResultReceiver;
                        }
                        if (i17 < i18 && ((LinearLayout.LayoutParams) layoutParams).weight > BitmapDescriptorFactory.HUE_RED) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (mode == 1073741824 || ((ViewGroup.LayoutParams) layoutParams).width != -1) {
                            z = false;
                        } else {
                            z = true;
                            z4 = true;
                        }
                        int i28 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        int measuredWidth = viewIconCompatParcelizer.getMeasuredWidth() + i28;
                        int iMax5 = Math.max(i14, measuredWidth);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i12, viewIconCompatParcelizer.getMeasuredState());
                        z5 = z5 && ((ViewGroup.LayoutParams) layoutParams).width == -1;
                        if (((LinearLayout.LayoutParams) layoutParams).weight > BitmapDescriptorFactory.HUE_RED) {
                            if (!z) {
                                i28 = measuredWidth;
                            }
                            iMax2 = Math.max(i16, i28);
                            iMax3 = i11;
                        } else {
                            int i29 = i16;
                            if (!z) {
                                i28 = measuredWidth;
                            }
                            iMax3 = Math.max(i11, i28);
                            iMax2 = i29;
                        }
                        int iIconCompatParcelizer2 = IconCompatParcelizer(viewIconCompatParcelizer, i17) + i17;
                        i20 = iMax5;
                        i19 = iCombineMeasuredStates;
                        iIconCompatParcelizer = iIconCompatParcelizer2;
                        f = f2;
                        iIconCompatParcelizer++;
                        iMediaMetadataCompat = i15;
                        mode2 = i13;
                    }
                }
                i15 = iMediaMetadataCompat;
                i20 = i22;
                iMax2 = i9;
                i13 = mode2;
                iIconCompatParcelizer++;
                iMediaMetadataCompat = i15;
                mode2 = i13;
            } else {
                int i30 = i19;
                int i31 = iMediaMetadataCompat;
                int i32 = mode2;
                int iMax6 = i22;
                int i33 = iMax4;
                if (this.MediaBrowserCompatSearchResultReceiver > 0) {
                    i3 = i31;
                    if (AudioAttributesCompatParcelizer(i3)) {
                        this.MediaBrowserCompatSearchResultReceiver += this.AudioAttributesCompatParcelizer;
                    }
                } else {
                    i3 = i31;
                }
                if (z2 && (i32 == Integer.MIN_VALUE || i32 == 0)) {
                    this.MediaBrowserCompatSearchResultReceiver = 0;
                    int iIconCompatParcelizer3 = 0;
                    while (iIconCompatParcelizer3 < i3) {
                        View viewIconCompatParcelizer2 = IconCompatParcelizer(iIconCompatParcelizer3);
                        if (viewIconCompatParcelizer2 == null) {
                            this.MediaBrowserCompatSearchResultReceiver += RemoteActionCompatParcelizer(iIconCompatParcelizer3);
                        } else if (viewIconCompatParcelizer2.getVisibility() == i21) {
                            iIconCompatParcelizer3 += IconCompatParcelizer(viewIconCompatParcelizer2, iIconCompatParcelizer3);
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) viewIconCompatParcelizer2.getLayoutParams();
                            int i34 = this.MediaBrowserCompatSearchResultReceiver;
                            this.MediaBrowserCompatSearchResultReceiver = Math.max(i34, i34 + i33 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + RemoteActionCompatParcelizer(viewIconCompatParcelizer2));
                        }
                        iIconCompatParcelizer3++;
                        i21 = 8;
                    }
                }
                int paddingTop = this.MediaBrowserCompatSearchResultReceiver + getPaddingTop() + getPaddingBottom();
                this.MediaBrowserCompatSearchResultReceiver = paddingTop;
                int iCombineMeasuredStates2 = i30;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i35 = (16777215 & iResolveSizeAndState) - this.MediaBrowserCompatSearchResultReceiver;
                if (z3 || (i35 != 0 && f > BitmapDescriptorFactory.HUE_RED)) {
                    float f3 = this.MediaBrowserCompatMediaItem;
                    if (f3 > BitmapDescriptorFactory.HUE_RED) {
                        f = f3;
                    }
                    this.MediaBrowserCompatSearchResultReceiver = 0;
                    int i36 = i35;
                    int i37 = 0;
                    while (i37 < i3) {
                        View viewIconCompatParcelizer3 = IconCompatParcelizer(i37);
                        if (viewIconCompatParcelizer3.getVisibility() == 8) {
                            i6 = i3;
                        } else {
                            LayoutParams layoutParams3 = (LayoutParams) viewIconCompatParcelizer3.getLayoutParams();
                            float f4 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                            if (f4 > BitmapDescriptorFactory.HUE_RED) {
                                int i38 = (int) ((i36 * f4) / f);
                                float f5 = f - f4;
                                int i39 = i36 - i38;
                                i6 = i3;
                                int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, ((ViewGroup.LayoutParams) layoutParams3).width);
                                if (((ViewGroup.LayoutParams) layoutParams3).height == 0) {
                                    i8 = 1073741824;
                                    if (i32 == 1073741824) {
                                        if (i38 <= 0) {
                                            i38 = 0;
                                        }
                                        viewIconCompatParcelizer3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                                    }
                                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewIconCompatParcelizer3.getMeasuredState() & (-256));
                                    f = f5;
                                    i36 = i39;
                                } else {
                                    i8 = 1073741824;
                                }
                                int measuredHeight2 = viewIconCompatParcelizer3.getMeasuredHeight() + i38;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                viewIconCompatParcelizer3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i8));
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewIconCompatParcelizer3.getMeasuredState() & (-256));
                                f = f5;
                                i36 = i39;
                            } else {
                                i6 = i3;
                            }
                            int i40 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                            int measuredWidth2 = viewIconCompatParcelizer3.getMeasuredWidth() + i40;
                            iMax6 = Math.max(iMax6, measuredWidth2);
                            float f6 = f;
                            if (mode != 1073741824) {
                                i7 = -1;
                                if (((ViewGroup.LayoutParams) layoutParams3).width == -1) {
                                    measuredWidth2 = i40;
                                }
                            } else {
                                i7 = -1;
                            }
                            int iMax7 = Math.max(iMax3, measuredWidth2);
                            boolean z6 = z5 && ((ViewGroup.LayoutParams) layoutParams3).width == i7;
                            int i41 = this.MediaBrowserCompatSearchResultReceiver;
                            this.MediaBrowserCompatSearchResultReceiver = Math.max(i41, viewIconCompatParcelizer3.getMeasuredHeight() + i41 + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + RemoteActionCompatParcelizer(viewIconCompatParcelizer3));
                            z5 = z6;
                            iMax3 = iMax7;
                            f = f6;
                        }
                        i37++;
                        i3 = i6;
                    }
                    i4 = i;
                    i5 = i3;
                    this.MediaBrowserCompatSearchResultReceiver += getPaddingTop() + getPaddingBottom();
                    iMax = iMax3;
                } else {
                    iMax = Math.max(iMax3, iMax2);
                    if (z2 && i32 != 1073741824) {
                        for (int i42 = 0; i42 < i3; i42++) {
                            View viewIconCompatParcelizer4 = IconCompatParcelizer(i42);
                            if (viewIconCompatParcelizer4 != null && viewIconCompatParcelizer4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) viewIconCompatParcelizer4.getLayoutParams())).weight > BitmapDescriptorFactory.HUE_RED) {
                                viewIconCompatParcelizer4.measure(View.MeasureSpec.makeMeasureSpec(viewIconCompatParcelizer4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i33, 1073741824));
                            }
                        }
                    }
                    i4 = i;
                    i5 = i3;
                }
                int i43 = iCombineMeasuredStates2;
                int i44 = iMax6;
                if (z5 || mode == 1073741824) {
                    iMax = i44;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, i43), iResolveSizeAndState);
                if (z4) {
                    IconCompatParcelizer(i5, i2);
                    return;
                }
                return;
            }
        }
    }

    private void IconCompatParcelizer(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewIconCompatParcelizer = IconCompatParcelizer(i3);
            if (viewIconCompatParcelizer.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewIconCompatParcelizer.getLayoutParams();
                if (((ViewGroup.LayoutParams) layoutParams).width == -1) {
                    int i4 = ((ViewGroup.LayoutParams) layoutParams).height;
                    ((ViewGroup.LayoutParams) layoutParams).height = viewIconCompatParcelizer.getMeasuredHeight();
                    measureChildWithMargins(viewIconCompatParcelizer, iMakeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.LayoutParams) layoutParams).height = i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x045c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void AudioAttributesCompatParcelizer(int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.AudioAttributesCompatParcelizer(int, int):void");
    }

    private void read(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewIconCompatParcelizer = IconCompatParcelizer(i3);
            if (viewIconCompatParcelizer.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewIconCompatParcelizer.getLayoutParams();
                if (((ViewGroup.LayoutParams) layoutParams).height == -1) {
                    int i4 = ((ViewGroup.LayoutParams) layoutParams).width;
                    ((ViewGroup.LayoutParams) layoutParams).width = viewIconCompatParcelizer.getMeasuredWidth();
                    measureChildWithMargins(viewIconCompatParcelizer, i2, 0, iMakeMeasureSpec, 0);
                    ((ViewGroup.LayoutParams) layoutParams).width = i4;
                }
            }
        }
    }

    void IconCompatParcelizer(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.RatingCompat == 1) {
            IconCompatParcelizer(i, i2, i3, i4);
        } else {
            write(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void IconCompatParcelizer(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.IconCompatParcelizer(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void write(int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.write(int, int, int, int):void");
    }

    private void write(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.RatingCompat != i) {
            this.RatingCompat = i;
            requestLayout();
        }
    }

    public void setGravity(int i) {
        if (this.AudioAttributesImplBaseParcelizer != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.AudioAttributesImplBaseParcelizer = i;
            requestLayout();
        }
    }

    public int MediaDescriptionCompat() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.AudioAttributesImplBaseParcelizer;
        if ((8388615 & i3) != i2) {
            this.AudioAttributesImplBaseParcelizer = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.AudioAttributesImplBaseParcelizer;
        if ((i3 & 112) != i2) {
            this.AudioAttributesImplBaseParcelizer = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b_, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.RatingCompat;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
