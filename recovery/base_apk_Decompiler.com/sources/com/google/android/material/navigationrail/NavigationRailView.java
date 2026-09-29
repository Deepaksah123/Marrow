package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin._verifyEndArrayForSingle;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.readId3Metadata;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationRailView extends NavigationBarView {
    private final int AudioAttributesCompatParcelizer;
    private Boolean IconCompatParcelizer;
    private Boolean RemoteActionCompatParcelizer;
    private Boolean read;
    private View write;

    @Override // com.google.android.material.navigation.NavigationBarView
    public final int RemoteActionCompatParcelizer() {
        return 7;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final /* synthetic */ NavigationBarMenuView read(Context context) {
        return RemoteActionCompatParcelizer(context);
    }

    public NavigationRailView(Context context) {
        this(context, null);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_NavigationRailView);
    }

    private NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.read = null;
        this.RemoteActionCompatParcelizer = null;
        this.IconCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_navigation_rail_margin);
        Context context2 = getContext();
        setTitle settitle = readId3Metadata.read(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView, i, i2, new int[0]);
        int iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_headerLayout, 0);
        if (iMediaBrowserCompatItemReceiver != 0) {
            IconCompatParcelizer(iMediaBrowserCompatItemReceiver);
        }
        setMenuGravity(settitle.read(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_menuGravity, 49));
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_itemMinHeight)) {
            setItemMinimumHeight(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_itemMinHeight, -1));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.read = Boolean.valueOf(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.RemoteActionCompatParcelizer = Boolean.valueOf(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.IconCompatParcelizer = Boolean.valueOf(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fRemoteActionCompatParcelizer = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.3f, 1.0f, SeekMap.read(context2) - 1.0f);
        float fRemoteActionCompatParcelizer2 = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(), dimensionPixelOffset, fRemoteActionCompatParcelizer);
        float fRemoteActionCompatParcelizer3 = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(IconCompatParcelizer(), dimensionPixelOffset2, fRemoteActionCompatParcelizer);
        setItemPaddingTop(Math.round(fRemoteActionCompatParcelizer2));
        setItemPaddingBottom(Math.round(fRemoteActionCompatParcelizer3));
        settitle.write();
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        checkAndPeekStreamMarker.IconCompatParcelizer(this, new checkAndPeekStreamMarker.RemoteActionCompatParcelizer() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // o.checkAndPeekStreamMarker.RemoteActionCompatParcelizer
            public final WindowInsetsCompat RemoteActionCompatParcelizer(View view, WindowInsetsCompat windowInsetsCompat, checkAndPeekStreamMarker.write writeVar) {
                _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
                NavigationRailView navigationRailView = NavigationRailView.this;
                if (navigationRailView.read(navigationRailView.read)) {
                    writeVar.write += _verifyendarrayforsingle.write;
                }
                NavigationRailView navigationRailView2 = NavigationRailView.this;
                if (navigationRailView2.read(navigationRailView2.RemoteActionCompatParcelizer)) {
                    writeVar.IconCompatParcelizer += _verifyendarrayforsingle.AudioAttributesCompatParcelizer;
                }
                NavigationRailView navigationRailView3 = NavigationRailView.this;
                if (navigationRailView3.read(navigationRailView3.IconCompatParcelizer)) {
                    writeVar.read += checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(view) ? _verifyendarrayforsingle.IconCompatParcelizer : _verifyendarrayforsingle.read;
                }
                writeVar.IconCompatParcelizer(view);
                return windowInsetsCompat;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean read(Boolean bool) {
        return bool != null ? bool.booleanValue() : InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int iWrite = write(i);
        super.onMeasure(iWrite, i2);
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            measureChild(AudioAttributesImplApi21Parcelizer(), iWrite, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.write.getMeasuredHeight()) - this.AudioAttributesCompatParcelizer, Integer.MIN_VALUE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            com.google.android.material.navigationrail.NavigationRailMenuView r1 = r0.AudioAttributesImplApi21Parcelizer()
            boolean r2 = r0.MediaBrowserCompatCustomActionResultReceiver()
            if (r2 == 0) goto L1e
            android.view.View r2 = r0.write
            int r2 = r2.getBottom()
            int r0 = r0.AudioAttributesCompatParcelizer
            int r2 = r2 + r0
            int r0 = r1.getTop()
            if (r0 >= r2) goto L27
            int r2 = r2 - r0
            goto L28
        L1e:
            boolean r2 = r1.read()
            if (r2 == 0) goto L27
            int r2 = r0.AudioAttributesCompatParcelizer
            goto L28
        L27:
            r2 = 0
        L28:
            if (r2 <= 0) goto L3f
            int r0 = r1.getLeft()
            int r3 = r1.getTop()
            int r4 = r1.getRight()
            int r5 = r1.getBottom()
            int r3 = r3 + r2
            int r5 = r5 + r2
            r1.layout(r0, r3, r4, r5)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailView.onLayout(boolean, int, int, int, int):void");
    }

    private void IconCompatParcelizer(int i) {
        IconCompatParcelizer(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    private void IconCompatParcelizer(View view) {
        AudioAttributesImplApi26Parcelizer();
        this.write = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.AudioAttributesCompatParcelizer;
        addView(view, 0, layoutParams);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        View view = this.write;
        if (view != null) {
            removeView(view);
            this.write = null;
        }
    }

    public void setMenuGravity(int i) {
        AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(i);
    }

    public void setItemMinimumHeight(int i) {
        ((NavigationRailMenuView) write()).setItemMinimumHeight(i);
    }

    private NavigationRailMenuView AudioAttributesImplApi21Parcelizer() {
        return (NavigationRailMenuView) write();
    }

    private static NavigationRailMenuView RemoteActionCompatParcelizer(Context context) {
        return new NavigationRailMenuView(context);
    }

    private int write(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        View view = this.write;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }
}
