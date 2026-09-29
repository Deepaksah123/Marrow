package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.onRequestPermissionsResult;

/* JADX INFO: loaded from: classes5.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int AudioAttributesCompatParcelizer;
    private final List<Integer> AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    public BottomNavigationMenuView(Context context) {
        super(context);
        this.AudioAttributesImplBaseParcelizer = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.write = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.design_bottom_navigation_item_max_width);
        this.read = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.design_bottom_navigation_item_min_width);
        this.IconCompatParcelizer = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.design_bottom_navigation_active_item_max_width);
        this.AudioAttributesCompatParcelizer = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        onRequestPermissionsResult onrequestpermissionsresultAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int size = View.MeasureSpec.getSize(i);
        int size2 = onrequestpermissionsresultAudioAttributesImplApi26Parcelizer.MediaDescriptionCompat().size();
        int childCount = getChildCount();
        this.AudioAttributesImplBaseParcelizer.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer(), size2) && read()) {
            View childAt = getChildAt(MediaBrowserCompatItemReceiver());
            int iMax = this.AudioAttributesCompatParcelizer;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.IconCompatParcelizer, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i5 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.read * i5), Math.min(iMax, this.IconCompatParcelizer));
            int i6 = size - iMin;
            int iMin2 = Math.min(i6 / (i5 != 0 ? i5 : 1), this.write);
            int i7 = i6 - (i5 * iMin2);
            int i8 = 0;
            while (i8 < childCount) {
                if (getChildAt(i8).getVisibility() != 8) {
                    i4 = i8 == MediaBrowserCompatItemReceiver() ? iMin : iMin2;
                    if (i7 > 0) {
                        i4++;
                        i7--;
                    }
                } else {
                    i4 = 0;
                }
                this.AudioAttributesImplBaseParcelizer.add(Integer.valueOf(i4));
                i8++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), this.IconCompatParcelizer);
            int i9 = size - (size2 * iMin3);
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getVisibility() == 8) {
                    i3 = 0;
                } else if (i9 > 0) {
                    i3 = iMin3 + 1;
                    i9--;
                } else {
                    i3 = iMin3;
                }
                this.AudioAttributesImplBaseParcelizer.add(Integer.valueOf(i3));
            }
        }
        int measuredWidth = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.AudioAttributesImplBaseParcelizer.get(i11).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i4 - i2;
        int measuredWidth = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                if (InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1) {
                    int i7 = (i3 - i) - measuredWidth;
                    childAt.layout(i7 - childAt.getMeasuredWidth(), 0, i7, i5);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i5);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView read(Context context) {
        return new BottomNavigationItemView(context);
    }
}
