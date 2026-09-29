package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.onRequestPermissionsResult;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.peekAvailableContext;
import kotlin.registerForActivityResult;
import kotlin.setChecked;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements onRequestPermissionsResult.AudioAttributesCompatParcelizer, registerForActivityResult {
    private peekAvailableContext.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private onRequestPermissionsResult AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    onRequestPermissionsResult.RemoteActionCompatParcelizer IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private Context MediaBrowserCompatItemReceiver;
    private ActionMenuPresenter MediaBrowserCompatMediaItem;
    private boolean RatingCompat;
    RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private boolean read;
    private int write;

    public interface RemoteActionCompatParcelizer {
        boolean write(MenuItem menuItem);
    }

    public interface write {
        boolean AudioAttributesCompatParcelizer();

        boolean RemoteActionCompatParcelizer();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public /* synthetic */ LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return write(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: b_ */
    public /* synthetic */ LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        return MediaBrowserCompatMediaItem();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return MediaBrowserCompatMediaItem();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return write(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.AudioAttributesImplBaseParcelizer = (int) (56.0f * f);
        this.AudioAttributesImplApi26Parcelizer = (int) (f * 4.0f);
        this.MediaBrowserCompatItemReceiver = context;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
    }

    public void setPopupTheme(int i) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != i) {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            if (i == 0) {
                this.MediaBrowserCompatItemReceiver = getContext();
            } else {
                this.MediaBrowserCompatItemReceiver = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.MediaBrowserCompatMediaItem = actionMenuPresenter;
        actionMenuPresenter.IconCompatParcelizer(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.MediaBrowserCompatMediaItem;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.AudioAttributesCompatParcelizer(false);
            if (this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer()) {
                this.MediaBrowserCompatMediaItem.write();
                this.MediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver();
            }
        }
    }

    public void setOnMenuItemClickListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        onRequestPermissionsResult onrequestpermissionsresult;
        boolean z = this.read;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.read = z2;
        if (z != z2) {
            this.write = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.read && (onrequestpermissionsresult = this.AudioAttributesImplApi21Parcelizer) != null && size != this.write) {
            this.write = size;
            onrequestpermissionsresult.read(true);
        }
        int childCount = getChildCount();
        if (this.read && childCount > 0) {
            read(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v16 */
    private void read(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i9 = size - (paddingLeft + paddingRight);
        int i10 = this.AudioAttributesImplBaseParcelizer;
        int i11 = i9 / i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i12 = i10 + ((i9 % i10) / i11);
        int childCount = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        int iMax2 = 0;
        long j = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i16 = size2;
            int i17 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z4 = childAt instanceof ActionMenuItemView;
                int i18 = i15 + 1;
                if (z4) {
                    int i19 = this.AudioAttributesImplApi26Parcelizer;
                    i8 = i18;
                    r14 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i8 = i18;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.RemoteActionCompatParcelizer = r14;
                layoutParams.write = r14;
                layoutParams.IconCompatParcelizer = r14;
                layoutParams.AudioAttributesCompatParcelizer = r14;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = r14;
                layoutParams.AudioAttributesImplApi21Parcelizer = z4 && ((ActionMenuItemView) childAt).read();
                int iWrite = write(childAt, i12, layoutParams.read ? 1 : i11, childMeasureSpec, paddingTop);
                iMax = Math.max(iMax, iWrite);
                if (layoutParams.AudioAttributesCompatParcelizer) {
                    i13++;
                }
                if (layoutParams.read) {
                    z3 = true;
                }
                i11 -= iWrite;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (iWrite == 1) {
                    j |= (long) (1 << i14);
                }
                i15 = i8;
            }
            i14++;
            size2 = i16;
            i9 = i17;
        }
        int i20 = i9;
        int i21 = size2;
        int i22 = iMax2;
        boolean z5 = z3 && i15 == 2;
        boolean z6 = false;
        while (i13 > 0 && i11 > 0) {
            int i23 = Integer.MAX_VALUE;
            z = z6;
            int i24 = 0;
            int i25 = 0;
            long j2 = 0;
            while (i24 < childCount) {
                int i26 = i22;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i24).getLayoutParams();
                int i27 = i13;
                if (layoutParams2.AudioAttributesCompatParcelizer) {
                    if (layoutParams2.IconCompatParcelizer < i23) {
                        j2 = 1 << i24;
                        i23 = layoutParams2.IconCompatParcelizer;
                        i25 = 1;
                    } else if (layoutParams2.IconCompatParcelizer == i23) {
                        j2 |= 1 << i24;
                        i25++;
                    }
                }
                i24++;
                i13 = i27;
                i22 = i26;
            }
            i4 = i22;
            int i28 = i13;
            j |= j2;
            if (i25 > i11) {
                i3 = mode;
                break;
            }
            int i29 = 0;
            while (i29 < childCount) {
                View childAt2 = getChildAt(i29);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i30 = mode;
                int i31 = childCount;
                int i32 = iMax;
                long j3 = 1 << i29;
                if ((j2 & j3) == 0) {
                    if (layoutParams3.IconCompatParcelizer == i23 + 1) {
                        j |= j3;
                    }
                } else {
                    if (z5 && layoutParams3.AudioAttributesImplApi21Parcelizer && i11 == 1) {
                        int i33 = this.AudioAttributesImplApi26Parcelizer;
                        childAt2.setPadding(i33 + i12, 0, i33, 0);
                    }
                    layoutParams3.IconCompatParcelizer++;
                    layoutParams3.RemoteActionCompatParcelizer = true;
                    i11--;
                }
                i29++;
                childCount = i31;
                mode = i30;
                iMax = i32;
            }
            i13 = i28;
            i22 = i4;
            z6 = true;
        }
        i3 = mode;
        z = z6;
        i4 = i22;
        int i34 = childCount;
        int i35 = iMax;
        boolean z7 = !z3 && i15 == 1;
        if (i11 <= 0 || j == 0 || (i11 >= i15 - 1 && !z7 && i35 <= 1)) {
            i5 = 0;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (z7) {
                i5 = 0;
            } else {
                if ((j & 1) != 0) {
                    i5 = 0;
                    if (!((LayoutParams) getChildAt(0).getLayoutParams()).AudioAttributesImplApi21Parcelizer) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i5 = 0;
                }
                int i36 = i34 - 1;
                if ((((long) (1 << i36)) & j) != 0 && !((LayoutParams) getChildAt(i36).getLayoutParams()).AudioAttributesImplApi21Parcelizer) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > BitmapDescriptorFactory.HUE_RED ? (int) ((i11 * i12) / fBitCount) : i5;
            boolean z8 = z;
            for (int i38 = i5; i38 < i34; i38++) {
                if ((((long) (1 << i38)) & j) != 0) {
                    View childAt3 = getChildAt(i38);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.write = i37;
                        layoutParams4.RemoteActionCompatParcelizer = true;
                        if (i38 == 0 && !layoutParams4.AudioAttributesImplApi21Parcelizer) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (-i37) / 2;
                        }
                        z8 = true;
                    } else if (layoutParams4.read) {
                        layoutParams4.write = i37;
                        layoutParams4.RemoteActionCompatParcelizer = true;
                        ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (-i37) / 2;
                        z8 = true;
                    } else {
                        if (i38 != 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = i37 / 2;
                        }
                        if (i38 != i34 - 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z2 = z8;
        }
        if (z2) {
            for (int i39 = i5; i39 < i34; i39++) {
                View childAt4 = getChildAt(i39);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.RemoteActionCompatParcelizer) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.IconCompatParcelizer * i12) + layoutParams5.write, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i3 == 1073741824) {
            i7 = i21;
            i6 = i20;
        } else {
            i6 = i20;
            i7 = i4;
        }
        setMeasuredDimension(i6, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int write(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.read()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.read
            if (r7 != 0) goto L55
            if (r9 != 0) goto L54
            goto L55
        L54:
            r1 = r2
        L55:
            r0.AudioAttributesCompatParcelizer = r1
            r0.IconCompatParcelizer = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.write(android.view.View, int, int, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.read) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int iRatingCompat = RatingCompat();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zAudioAttributesCompatParcelizer = setChecked.AudioAttributesCompatParcelizer(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.read) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (read(i9)) {
                        measuredWidth += iRatingCompat;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zAudioAttributesCompatParcelizer) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    read(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zAudioAttributesCompatParcelizer) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.read) {
                    int i15 = width2 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.read) {
                int i18 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = i18 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin + iMax;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RemoteActionCompatParcelizer();
    }

    public void setOverflowIcon(Drawable drawable) {
        read();
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(drawable);
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.RatingCompat;
    }

    public void setOverflowReserved(boolean z) {
        this.RatingCompat = z;
    }

    private static LayoutParams MediaBrowserCompatMediaItem() {
        LayoutParams layoutParams = new LayoutParams();
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected static LayoutParams write(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return MediaBrowserCompatMediaItem();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public static LayoutParams write() {
        LayoutParams layoutParamsMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        layoutParamsMediaBrowserCompatMediaItem.read = true;
        return layoutParamsMediaBrowserCompatMediaItem;
    }

    @Override // o.onRequestPermissionsResult.AudioAttributesCompatParcelizer
    public final boolean RemoteActionCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(onretainnonconfigurationinstance, 0);
    }

    @Override // kotlin.registerForActivityResult
    public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult) {
        this.AudioAttributesImplApi21Parcelizer = onrequestpermissionsresult;
    }

    public final Menu read() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            Context context = getContext();
            onRequestPermissionsResult onrequestpermissionsresult = new onRequestPermissionsResult(context);
            this.AudioAttributesImplApi21Parcelizer = onrequestpermissionsresult;
            onrequestpermissionsresult.IconCompatParcelizer(new read());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.MediaBrowserCompatMediaItem = actionMenuPresenter;
            actionMenuPresenter.MediaBrowserCompatMediaItem();
            ActionMenuPresenter actionMenuPresenter2 = this.MediaBrowserCompatMediaItem;
            peekAvailableContext.AudioAttributesCompatParcelizer iconCompatParcelizer = this.AudioAttributesCompatParcelizer;
            if (iconCompatParcelizer == null) {
                iconCompatParcelizer = new IconCompatParcelizer();
            }
            actionMenuPresenter2.read(iconCompatParcelizer);
            this.AudioAttributesImplApi21Parcelizer.write(this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public void setMenuCallbacks(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, onRequestPermissionsResult.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
    }

    public final onRequestPermissionsResult AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        ActionMenuPresenter actionMenuPresenter = this.MediaBrowserCompatMediaItem;
        return actionMenuPresenter != null && actionMenuPresenter.MediaBrowserCompatSearchResultReceiver();
    }

    public final boolean AudioAttributesCompatParcelizer() {
        ActionMenuPresenter actionMenuPresenter = this.MediaBrowserCompatMediaItem;
        return actionMenuPresenter != null && actionMenuPresenter.write();
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        ActionMenuPresenter actionMenuPresenter = this.MediaBrowserCompatMediaItem;
        return actionMenuPresenter != null && actionMenuPresenter.AudioAttributesImplBaseParcelizer();
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        ActionMenuPresenter actionMenuPresenter = this.MediaBrowserCompatMediaItem;
        return actionMenuPresenter != null && actionMenuPresenter.MediaBrowserCompatItemReceiver();
    }

    public final void RemoteActionCompatParcelizer() {
        ActionMenuPresenter actionMenuPresenter = this.MediaBrowserCompatMediaItem;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.RemoteActionCompatParcelizer();
        }
    }

    private boolean read(int i) {
        boolean zRemoteActionCompatParcelizer = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof write)) {
            zRemoteActionCompatParcelizer = ((write) childAt).RemoteActionCompatParcelizer();
        }
        return (i <= 0 || !(childAt2 instanceof write)) ? zRemoteActionCompatParcelizer : ((write) childAt2).AudioAttributesCompatParcelizer() | zRemoteActionCompatParcelizer;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(z);
    }

    class read implements onRequestPermissionsResult.RemoteActionCompatParcelizer {
        read() {
        }

        @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
        public final boolean write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
            return ActionMenuView.this.RemoteActionCompatParcelizer != null && ActionMenuView.this.RemoteActionCompatParcelizer.write(menuItem);
        }

        @Override // o.onRequestPermissionsResult.RemoteActionCompatParcelizer
        public final void read(onRequestPermissionsResult onrequestpermissionsresult) {
            if (ActionMenuView.this.IconCompatParcelizer != null) {
                ActionMenuView.this.IconCompatParcelizer.read(onrequestpermissionsresult);
            }
        }
    }

    static class IconCompatParcelizer implements peekAvailableContext.AudioAttributesCompatParcelizer {
        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
        }

        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final boolean read(onRequestPermissionsResult onrequestpermissionsresult) {
            return false;
        }

        IconCompatParcelizer() {
        }
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public boolean AudioAttributesCompatParcelizer;

        @ViewDebug.ExportedProperty
        public boolean AudioAttributesImplApi21Parcelizer;

        @ViewDebug.ExportedProperty
        public int IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;

        @ViewDebug.ExportedProperty
        public boolean read;

        @ViewDebug.ExportedProperty
        public int write;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.read = layoutParams.read;
        }

        public LayoutParams() {
            super(-2, -2);
            this.read = false;
        }
    }
}
