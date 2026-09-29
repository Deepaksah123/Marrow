package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes4.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        if (IconCompatParcelizer(i, i2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    private boolean IconCompatParcelizer(int i, int i2) {
        int iCombineMeasuredStates;
        int iWrite;
        int measuredHeight;
        int measuredHeight2;
        int i3;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == _init_lambda5.AudioAttributesImplBaseParcelizer.topPanel) {
                    view = childAt;
                } else if (id == _init_lambda5.AudioAttributesImplBaseParcelizer.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != _init_lambda5.AudioAttributesImplBaseParcelizer.contentPanel && id != _init_lambda5.AudioAttributesImplBaseParcelizer.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iWrite = write(view2);
            measuredHeight = view2.getMeasuredHeight() - iWrite;
            paddingTop += iWrite;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iWrite = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingTop;
        if (view2 != null) {
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                i3 = iMin + iWrite;
            } else {
                i3 = iWrite;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            paddingTop = (paddingTop - iWrite) + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i5 + measuredHeight2, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        read(childCount, i2);
        return true;
    }

    private void read(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.LayoutParams) layoutParams).width == -1) {
                    int i4 = ((ViewGroup.LayoutParams) layoutParams).height;
                    ((ViewGroup.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.LayoutParams) layoutParams).height = i4;
                }
            }
        }
    }

    private static int write(View view) {
        int iRatingCompat = InvalidTypeIdException.RatingCompat(view);
        if (iRatingCompat > 0) {
            return iRatingCompat;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return write(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r0 = r10.getPaddingRight()
            int r1 = r10.getMeasuredHeight()
            int r2 = r10.getChildCount()
            int r3 = r10.MediaDescriptionCompat()
            r4 = r3 & 112(0x70, float:1.57E-43)
            r5 = 16
            if (r4 == r5) goto L31
            r5 = 80
            if (r4 == r5) goto L28
            int r13 = r10.getPaddingTop()
            goto L3b
        L28:
            int r4 = r10.getPaddingTop()
            int r4 = r4 + r15
            int r4 = r4 - r13
            int r13 = r4 - r1
            goto L3b
        L31:
            int r4 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r1
            int r15 = r15 / 2
            int r13 = r4 + r15
        L3b:
            android.graphics.drawable.Drawable r15 = r10.MediaBrowserCompatSearchResultReceiver()
            r1 = 0
            if (r15 != 0) goto L44
            r15 = r1
            goto L48
        L44:
            int r15 = r15.getIntrinsicHeight()
        L48:
            if (r1 >= r2) goto La9
            android.view.View r4 = r10.getChildAt(r1)
            if (r4 == 0) goto La6
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto La6
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r7 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L6e
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r8 = r8 & r3
        L6e:
            int r9 = kotlin.InvalidTypeIdException.MediaBrowserCompatMediaItem(r10)
            int r8 = kotlin._clearIfStdImpl.write(r8, r9)
            r8 = r8 & 7
            r9 = 1
            if (r8 == r9) goto L88
            r9 = 5
            if (r8 == r9) goto L82
            int r8 = r7.leftMargin
            int r8 = r8 + r11
            goto L95
        L82:
            int r8 = r14 - r12
            int r8 = r8 - r5
            int r9 = r7.rightMargin
            goto L94
        L88:
            int r8 = r14 - r11
            int r8 = r8 - r0
            int r8 = r8 - r5
            int r8 = r8 / 2
            int r8 = r8 + r11
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
        L94:
            int r8 = r8 - r9
        L95:
            boolean r9 = r10.AudioAttributesCompatParcelizer(r1)
            if (r9 == 0) goto L9c
            int r13 = r13 + r15
        L9c:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            write(r4, r8, r13, r5, r6)
            int r4 = r7.bottomMargin
            int r6 = r6 + r4
            int r13 = r13 + r6
        La6:
            int r1 = r1 + 1
            goto L48
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    private static void write(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }
}
