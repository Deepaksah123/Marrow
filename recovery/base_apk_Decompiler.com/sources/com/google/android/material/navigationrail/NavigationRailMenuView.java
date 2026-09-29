package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import kotlin.getSampleNumber;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    private final FrameLayout.LayoutParams IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;

    public NavigationRailMenuView(Context context) {
        super(context);
        this.RemoteActionCompatParcelizer = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.IconCompatParcelizer = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        MediaMetadataCompat();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iWrite;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = AudioAttributesImplApi26Parcelizer().MediaDescriptionCompat().size();
        if (size2 > 1 && AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer(), size2)) {
            iWrite = write(i, size, size2);
        } else {
            iWrite = write(i, size, size2, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(iWrite, i2, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i5;
                childAt.layout(0, i5, i3 - i, measuredHeight);
                i5 = measuredHeight;
            }
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public final NavigationBarItemView read(Context context) {
        return new getSampleNumber(context);
    }

    private int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        int iMax = i2 / Math.max(1, i3);
        int size = this.RemoteActionCompatParcelizer;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private int write(int i, int i2, int i3) {
        int iAudioAttributesCompatParcelizer;
        View childAt = getChildAt(MediaBrowserCompatItemReceiver());
        if (childAt != null) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(childAt, i, RemoteActionCompatParcelizer(i, i2, i3));
            i2 -= iAudioAttributesCompatParcelizer;
            i3--;
        } else {
            iAudioAttributesCompatParcelizer = 0;
        }
        return iAudioAttributesCompatParcelizer + write(i, i2, i3, childAt);
    }

    private int write(int i, int i2, int i3, View view) {
        int iMakeMeasureSpec;
        if (view == null) {
            iMakeMeasureSpec = RemoteActionCompatParcelizer(i, i2, i3);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int iAudioAttributesCompatParcelizer = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != view) {
                iAudioAttributesCompatParcelizer += AudioAttributesCompatParcelizer(childAt, i, iMakeMeasureSpec);
            }
        }
        return iAudioAttributesCompatParcelizer;
    }

    private static int AudioAttributesCompatParcelizer(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    final void IconCompatParcelizer(int i) {
        if (this.IconCompatParcelizer.gravity != i) {
            this.IconCompatParcelizer.gravity = i;
            setLayoutParams(this.IconCompatParcelizer);
        }
    }

    public void setItemMinimumHeight(int i) {
        if (this.RemoteActionCompatParcelizer != i) {
            this.RemoteActionCompatParcelizer = i;
            requestLayout();
        }
    }

    final boolean read() {
        return (this.IconCompatParcelizer.gravity & 112) == 48;
    }
}
