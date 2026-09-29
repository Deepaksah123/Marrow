package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.BinarySearchSeekerBinarySearchSeekMap;
import kotlin.BlockingViewModel_HiltModulesKeyModule;
import kotlin.InvalidTypeIdException;
import kotlin.isSeekable;
import kotlin.skipInputUntilPosition;
import kotlin.timeUsToTargetTime;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayout extends ViewGroup implements BinarySearchSeekerBinarySearchSeekMap {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private List<skipInputUntilPosition> AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private isSeekable.read MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private isSeekable MediaBrowserCompatMediaItem;
    private int[] MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private SparseIntArray RatingCompat;
    private Drawable RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onCustomAction;
    private int read;
    private Drawable write;

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final void AudioAttributesCompatParcelizer(int i, View view) {
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int IconCompatParcelizer(View view) {
        return 0;
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaDescriptionCompat = -1;
        this.MediaBrowserCompatMediaItem = new isSeekable(this);
        this.AudioAttributesImplApi26Parcelizer = new ArrayList();
        this.MediaBrowserCompatCustomActionResultReceiver = new isSeekable.read();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout, i, 0);
        this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_flexDirection, 0);
        this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_flexWrap, 0);
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_justifyContent, 0);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_alignItems, 0);
        this.read = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_alignContent, 0);
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.onCustomAction = i2;
            this.handleMediaPlayPauseIfPendingOnHandler = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.onCustomAction = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.handleMediaPlayPauseIfPendingOnHandler = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.RatingCompat == null) {
            this.RatingCompat = new SparseIntArray(getChildCount());
        }
        if (this.MediaBrowserCompatMediaItem.read(this.RatingCompat)) {
            this.MediaBrowserCompatSearchResultReceiver = this.MediaBrowserCompatMediaItem.write(this.RatingCompat);
        }
        int i3 = this.AudioAttributesImplBaseParcelizer;
        if (i3 == 0 || i3 == 1) {
            RemoteActionCompatParcelizer(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            IconCompatParcelizer(i, i2);
        } else {
            StringBuilder sb = new StringBuilder("Invalid value for the flex direction is set: ");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int AudioAttributesCompatParcelizer() {
        return getChildCount();
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final View AudioAttributesCompatParcelizer(int i) {
        return getChildAt(i);
    }

    private View MediaBrowserCompatItemReceiver(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        if (i < iArr.length) {
            return getChildAt(iArr[i]);
        }
        return null;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final View IconCompatParcelizer(int i) {
        return MediaBrowserCompatItemReceiver(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.RatingCompat == null) {
            this.RatingCompat = new SparseIntArray(getChildCount());
        }
        this.MediaBrowserCompatSearchResultReceiver = this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(view, i, layoutParams, this.RatingCompat);
        super.addView(view, i, layoutParams);
    }

    private void RemoteActionCompatParcelizer(int i, int i2) {
        this.AudioAttributesImplApi26Parcelizer.clear();
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatMediaItem.write(this.MediaBrowserCompatCustomActionResultReceiver, i, i2);
        this.AudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i, i2);
        if (this.IconCompatParcelizer == 3) {
            for (skipInputUntilPosition skipinputuntilposition : this.AudioAttributesImplApi26Parcelizer) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < skipinputuntilposition.AudioAttributesImplApi26Parcelizer; i3++) {
                    View viewMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(skipinputuntilposition.MediaBrowserCompatItemReceiver + i3);
                    if (viewMediaBrowserCompatItemReceiver != null && viewMediaBrowserCompatItemReceiver.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewMediaBrowserCompatItemReceiver.getLayoutParams();
                        if (this.MediaBrowserCompatItemReceiver != 2) {
                            int iMax2 = Math.max(skipinputuntilposition.MediaBrowserCompatSearchResultReceiver - viewMediaBrowserCompatItemReceiver.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            iMax = Math.max(iMax, viewMediaBrowserCompatItemReceiver.getMeasuredHeight() + iMax2 + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        } else {
                            iMax = Math.max(iMax, viewMediaBrowserCompatItemReceiver.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((skipinputuntilposition.MediaBrowserCompatSearchResultReceiver - viewMediaBrowserCompatItemReceiver.getMeasuredHeight()) + viewMediaBrowserCompatItemReceiver.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                }
                skipinputuntilposition.write = iMax;
            }
        }
        this.MediaBrowserCompatMediaItem.read(i, i2, getPaddingTop() + getPaddingBottom());
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, i, i2, this.MediaBrowserCompatCustomActionResultReceiver.read);
    }

    private void IconCompatParcelizer(int i, int i2) {
        this.AudioAttributesImplApi26Parcelizer.clear();
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, i, i2);
        this.AudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i, i2);
        this.MediaBrowserCompatMediaItem.read(i, i2, getPaddingLeft() + getPaddingRight());
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, i, i2, this.MediaBrowserCompatCustomActionResultReceiver.read);
    }

    private void IconCompatParcelizer(int i, int i2, int i3, int i4) {
        int iMediaDescriptionCompat;
        int iAudioAttributesImplBaseParcelizer;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            iMediaDescriptionCompat = MediaDescriptionCompat() + getPaddingTop() + getPaddingBottom();
            iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        } else if (i == 2 || i == 3) {
            iMediaDescriptionCompat = AudioAttributesImplBaseParcelizer();
            iAudioAttributesImplBaseParcelizer = MediaDescriptionCompat() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < iAudioAttributesImplBaseParcelizer) {
                i4 = View.combineMeasuredStates(i4, BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = iAudioAttributesImplBaseParcelizer;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(iAudioAttributesImplBaseParcelizer, i2, i4);
        } else if (mode == 1073741824) {
            if (size < iAudioAttributesImplBaseParcelizer) {
                i4 = View.combineMeasuredStates(i4, BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < iMediaDescriptionCompat) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = iMediaDescriptionCompat;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(iMediaDescriptionCompat, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < iMediaDescriptionCompat) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int AudioAttributesImplBaseParcelizer() {
        Iterator<skipInputUntilPosition> it = this.AudioAttributesImplApi26Parcelizer.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().RatingCompat);
        }
        return iMax;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int MediaDescriptionCompat() {
        int i;
        int i2;
        int size = this.AudioAttributesImplApi26Parcelizer.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            skipInputUntilPosition skipinputuntilposition = this.AudioAttributesImplApi26Parcelizer.get(i4);
            if (read(i4)) {
                if (MediaBrowserCompatMediaItem()) {
                    i2 = this.AudioAttributesCompatParcelizer;
                } else {
                    i2 = this.AudioAttributesImplApi21Parcelizer;
                }
                i3 += i2;
            }
            if (write(i4)) {
                if (MediaBrowserCompatMediaItem()) {
                    i = this.AudioAttributesCompatParcelizer;
                } else {
                    i = this.AudioAttributesImplApi21Parcelizer;
                }
                i3 += i;
            }
            i3 += skipinputuntilposition.write;
        }
        return i3;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final boolean MediaBrowserCompatMediaItem() {
        int i = this.AudioAttributesImplBaseParcelizer;
        return i == 0 || i == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int iMediaBrowserCompatMediaItem = InvalidTypeIdException.MediaBrowserCompatMediaItem(this);
        int i5 = this.AudioAttributesImplBaseParcelizer;
        if (i5 == 0) {
            IconCompatParcelizer(iMediaBrowserCompatMediaItem == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            IconCompatParcelizer(iMediaBrowserCompatMediaItem != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = iMediaBrowserCompatMediaItem == 1;
            write(this.MediaBrowserCompatItemReceiver == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = iMediaBrowserCompatMediaItem == 1;
            write(this.MediaBrowserCompatItemReceiver == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            StringBuilder sb = new StringBuilder("Invalid flex direction is set: ");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.IconCompatParcelizer(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(boolean r29, boolean r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.write(boolean, boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.RemoteActionCompatParcelizer == null && this.write == null) {
            return;
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler == 0 && this.onCustomAction == 0) {
            return;
        }
        int iMediaBrowserCompatMediaItem = InvalidTypeIdException.MediaBrowserCompatMediaItem(this);
        int i = this.AudioAttributesImplBaseParcelizer;
        if (i == 0) {
            AudioAttributesCompatParcelizer(canvas, iMediaBrowserCompatMediaItem == 1, this.MediaBrowserCompatItemReceiver == 2);
            return;
        }
        if (i == 1) {
            AudioAttributesCompatParcelizer(canvas, iMediaBrowserCompatMediaItem != 1, this.MediaBrowserCompatItemReceiver == 2);
            return;
        }
        if (i == 2) {
            boolean z = iMediaBrowserCompatMediaItem == 1;
            if (this.MediaBrowserCompatItemReceiver == 2) {
                z = !z;
            }
            RemoteActionCompatParcelizer(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iMediaBrowserCompatMediaItem == 1;
        if (this.MediaBrowserCompatItemReceiver == 2) {
            z2 = !z2;
        }
        RemoteActionCompatParcelizer(canvas, z2, true);
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.AudioAttributesImplApi26Parcelizer.size();
        for (int i3 = 0; i3 < size; i3++) {
            skipInputUntilPosition skipinputuntilposition = this.AudioAttributesImplApi26Parcelizer.get(i3);
            for (int i4 = 0; i4 < skipinputuntilposition.AudioAttributesImplApi26Parcelizer; i4++) {
                int i5 = skipinputuntilposition.MediaBrowserCompatItemReceiver + i4;
                View viewMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i5);
                if (viewMediaBrowserCompatItemReceiver != null && viewMediaBrowserCompatItemReceiver.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewMediaBrowserCompatItemReceiver.getLayoutParams();
                    if (AudioAttributesCompatParcelizer(i5, i4)) {
                        if (z) {
                            left = viewMediaBrowserCompatItemReceiver.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        } else {
                            left = (viewMediaBrowserCompatItemReceiver.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.AudioAttributesImplApi21Parcelizer;
                        }
                        write(canvas, left, skipinputuntilposition.handleMediaPlayPauseIfPendingOnHandler, skipinputuntilposition.write);
                    }
                    if (i4 == skipinputuntilposition.AudioAttributesImplApi26Parcelizer - 1 && (this.onCustomAction & 4) > 0) {
                        if (z) {
                            right = (viewMediaBrowserCompatItemReceiver.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.AudioAttributesImplApi21Parcelizer;
                        } else {
                            right = viewMediaBrowserCompatItemReceiver.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                        write(canvas, right, skipinputuntilposition.handleMediaPlayPauseIfPendingOnHandler, skipinputuntilposition.write);
                    }
                }
            }
            if (read(i3)) {
                if (z2) {
                    i2 = skipinputuntilposition.IconCompatParcelizer;
                } else {
                    i2 = skipinputuntilposition.handleMediaPlayPauseIfPendingOnHandler - this.AudioAttributesCompatParcelizer;
                }
                AudioAttributesCompatParcelizer(canvas, paddingLeft, i2, iMax);
            }
            if (write(i3) && (this.handleMediaPlayPauseIfPendingOnHandler & 4) > 0) {
                if (z2) {
                    i = skipinputuntilposition.handleMediaPlayPauseIfPendingOnHandler - this.AudioAttributesCompatParcelizer;
                } else {
                    i = skipinputuntilposition.IconCompatParcelizer;
                }
                AudioAttributesCompatParcelizer(canvas, paddingLeft, i, iMax);
            }
        }
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.AudioAttributesImplApi26Parcelizer.size();
        for (int i3 = 0; i3 < size; i3++) {
            skipInputUntilPosition skipinputuntilposition = this.AudioAttributesImplApi26Parcelizer.get(i3);
            for (int i4 = 0; i4 < skipinputuntilposition.AudioAttributesImplApi26Parcelizer; i4++) {
                int i5 = skipinputuntilposition.MediaBrowserCompatItemReceiver + i4;
                View viewMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i5);
                if (viewMediaBrowserCompatItemReceiver != null && viewMediaBrowserCompatItemReceiver.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewMediaBrowserCompatItemReceiver.getLayoutParams();
                    if (AudioAttributesCompatParcelizer(i5, i4)) {
                        if (z2) {
                            top = viewMediaBrowserCompatItemReceiver.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        } else {
                            top = (viewMediaBrowserCompatItemReceiver.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.AudioAttributesCompatParcelizer;
                        }
                        AudioAttributesCompatParcelizer(canvas, skipinputuntilposition.MediaDescriptionCompat, top, skipinputuntilposition.write);
                    }
                    if (i4 == skipinputuntilposition.AudioAttributesImplApi26Parcelizer - 1 && (this.handleMediaPlayPauseIfPendingOnHandler & 4) > 0) {
                        if (z2) {
                            bottom = (viewMediaBrowserCompatItemReceiver.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.AudioAttributesCompatParcelizer;
                        } else {
                            bottom = viewMediaBrowserCompatItemReceiver.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        AudioAttributesCompatParcelizer(canvas, skipinputuntilposition.MediaDescriptionCompat, bottom, skipinputuntilposition.write);
                    }
                }
            }
            if (read(i3)) {
                if (z) {
                    i2 = skipinputuntilposition.MediaBrowserCompatMediaItem;
                } else {
                    i2 = skipinputuntilposition.MediaDescriptionCompat - this.AudioAttributesImplApi21Parcelizer;
                }
                write(canvas, i2, paddingTop, iMax);
            }
            if (write(i3) && (this.onCustomAction & 4) > 0) {
                if (z) {
                    i = skipinputuntilposition.MediaDescriptionCompat - this.AudioAttributesImplApi21Parcelizer;
                } else {
                    i = skipinputuntilposition.MediaBrowserCompatMediaItem;
                }
                write(canvas, i, paddingTop, iMax);
            }
        }
    }

    private void write(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.AudioAttributesImplApi21Parcelizer + i, i3 + i2);
        this.RemoteActionCompatParcelizer.draw(canvas);
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.write;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.AudioAttributesCompatParcelizer + i2);
        this.write.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public void setFlexDirection(int i) {
        if (this.AudioAttributesImplBaseParcelizer != i) {
            this.AudioAttributesImplBaseParcelizer = i;
            requestLayout();
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public void setFlexWrap(int i) {
        if (this.MediaBrowserCompatItemReceiver != i) {
            this.MediaBrowserCompatItemReceiver = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.MediaMetadataCompat != i) {
            this.MediaMetadataCompat = i;
            requestLayout();
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public void setAlignItems(int i) {
        if (this.IconCompatParcelizer != i) {
            this.IconCompatParcelizer = i;
            requestLayout();
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int write() {
        return this.read;
    }

    public void setAlignContent(int i) {
        if (this.read != i) {
            this.read = i;
            requestLayout();
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int MediaBrowserCompatSearchResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public void setMaxLine(int i) {
        if (this.MediaDescriptionCompat != i) {
            this.MediaDescriptionCompat = i;
            requestLayout();
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int IconCompatParcelizer(View view, int i, int i2) {
        int i3;
        int i4;
        if (MediaBrowserCompatMediaItem()) {
            i3 = AudioAttributesCompatParcelizer(i, i2) ? this.AudioAttributesImplApi21Parcelizer : 0;
            if ((this.onCustomAction & 4) <= 0) {
                return i3;
            }
            i4 = this.AudioAttributesImplApi21Parcelizer;
        } else {
            i3 = AudioAttributesCompatParcelizer(i, i2) ? this.AudioAttributesCompatParcelizer : 0;
            if ((this.handleMediaPlayPauseIfPendingOnHandler & 4) <= 0) {
                return i3;
            }
            i4 = this.AudioAttributesCompatParcelizer;
        }
        return i3 + i4;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final void IconCompatParcelizer(skipInputUntilPosition skipinputuntilposition) {
        if (MediaBrowserCompatMediaItem()) {
            if ((this.onCustomAction & 4) > 0) {
                skipinputuntilposition.RatingCompat += this.AudioAttributesImplApi21Parcelizer;
                skipinputuntilposition.RemoteActionCompatParcelizer += this.AudioAttributesImplApi21Parcelizer;
                return;
            }
            return;
        }
        if ((this.handleMediaPlayPauseIfPendingOnHandler & 4) > 0) {
            skipinputuntilposition.RatingCompat += this.AudioAttributesCompatParcelizer;
            skipinputuntilposition.RemoteActionCompatParcelizer += this.AudioAttributesCompatParcelizer;
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final int write(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final void RemoteActionCompatParcelizer(View view, int i, int i2, skipInputUntilPosition skipinputuntilposition) {
        if (AudioAttributesCompatParcelizer(i, i2)) {
            if (MediaBrowserCompatMediaItem()) {
                skipinputuntilposition.RatingCompat += this.AudioAttributesImplApi21Parcelizer;
                skipinputuntilposition.RemoteActionCompatParcelizer += this.AudioAttributesImplApi21Parcelizer;
            } else {
                skipinputuntilposition.RatingCompat += this.AudioAttributesCompatParcelizer;
                skipinputuntilposition.RemoteActionCompatParcelizer += this.AudioAttributesCompatParcelizer;
            }
        }
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public void setFlexLines(List<skipInputUntilPosition> list) {
        this.AudioAttributesImplApi26Parcelizer = list;
    }

    @Override // kotlin.BinarySearchSeekerBinarySearchSeekMap
    public final List<skipInputUntilPosition> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.write) {
            return;
        }
        this.write = drawable;
        if (drawable != null) {
            this.AudioAttributesCompatParcelizer = drawable.getIntrinsicHeight();
        } else {
            this.AudioAttributesCompatParcelizer = 0;
        }
        read();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.RemoteActionCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer = drawable;
        if (drawable != null) {
            this.AudioAttributesImplApi21Parcelizer = drawable.getIntrinsicWidth();
        } else {
            this.AudioAttributesImplApi21Parcelizer = 0;
        }
        read();
        requestLayout();
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.onCustomAction) {
            this.onCustomAction = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.handleMediaPlayPauseIfPendingOnHandler) {
            this.handleMediaPlayPauseIfPendingOnHandler = i;
            requestLayout();
        }
    }

    private void read() {
        if (this.write == null && this.RemoteActionCompatParcelizer == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean AudioAttributesCompatParcelizer(int i, int i2) {
        return read(i, i2) ? MediaBrowserCompatMediaItem() ? (this.onCustomAction & 1) != 0 : (this.handleMediaPlayPauseIfPendingOnHandler & 1) != 0 : MediaBrowserCompatMediaItem() ? (this.onCustomAction & 2) != 0 : (this.handleMediaPlayPauseIfPendingOnHandler & 2) != 0;
    }

    private boolean read(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i - i3);
            if (viewMediaBrowserCompatItemReceiver != null && viewMediaBrowserCompatItemReceiver.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean read(int i) {
        if (i >= 0 && i < this.AudioAttributesImplApi26Parcelizer.size()) {
            if (RemoteActionCompatParcelizer(i)) {
                return MediaBrowserCompatMediaItem() ? (this.handleMediaPlayPauseIfPendingOnHandler & 1) != 0 : (this.onCustomAction & 1) != 0;
            }
            if (MediaBrowserCompatMediaItem()) {
                return (this.handleMediaPlayPauseIfPendingOnHandler & 2) != 0;
            }
            if ((this.onCustomAction & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean RemoteActionCompatParcelizer(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.AudioAttributesImplApi26Parcelizer.get(i2).write() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean write(int i) {
        if (i >= 0 && i < this.AudioAttributesImplApi26Parcelizer.size()) {
            for (int i2 = i + 1; i2 < this.AudioAttributesImplApi26Parcelizer.size(); i2++) {
                if (this.AudioAttributesImplApi26Parcelizer.get(i2).write() > 0) {
                    return false;
                }
            }
            if (MediaBrowserCompatMediaItem()) {
                return (this.handleMediaPlayPauseIfPendingOnHandler & 4) != 0;
            }
            if ((this.onCustomAction & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LayoutParams createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LayoutParams[] newArray(int i) {
                return IconCompatParcelizer(i);
            }

            private static LayoutParams AudioAttributesCompatParcelizer(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            private static LayoutParams[] IconCompatParcelizer(int i) {
                return new LayoutParams[i];
            }
        };
        private int AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private float IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private float read;
        private float write;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.MediaBrowserCompatCustomActionResultReceiver = 1;
            this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.write = 1.0f;
            this.RemoteActionCompatParcelizer = -1;
            this.read = -1.0f;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.AudioAttributesImplBaseParcelizer = 16777215;
            this.AudioAttributesCompatParcelizer = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout);
            this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_order, 1);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_flexGrow, BitmapDescriptorFactory.HUE_RED);
            this.write = typedArrayObtainStyledAttributes.getFloat(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.read = typedArrayObtainStyledAttributes.getFraction(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_minWidth, -1);
            this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getDimensionPixelSize(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_minHeight, -1);
            this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getBoolean(timeUsToTargetTime.AudioAttributesCompatParcelizer.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.MediaBrowserCompatCustomActionResultReceiver = 1;
            this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.write = 1.0f;
            this.RemoteActionCompatParcelizer = -1;
            this.read = -1.0f;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.AudioAttributesImplBaseParcelizer = 16777215;
            this.AudioAttributesCompatParcelizer = 16777215;
            this.MediaBrowserCompatCustomActionResultReceiver = layoutParams.MediaBrowserCompatCustomActionResultReceiver;
            this.IconCompatParcelizer = layoutParams.IconCompatParcelizer;
            this.write = layoutParams.write;
            this.RemoteActionCompatParcelizer = layoutParams.RemoteActionCompatParcelizer;
            this.read = layoutParams.read;
            this.AudioAttributesImplApi26Parcelizer = layoutParams.AudioAttributesImplApi26Parcelizer;
            this.MediaBrowserCompatItemReceiver = layoutParams.MediaBrowserCompatItemReceiver;
            this.AudioAttributesImplBaseParcelizer = layoutParams.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesCompatParcelizer = layoutParams.AudioAttributesCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = layoutParams.AudioAttributesImplApi21Parcelizer;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.MediaBrowserCompatCustomActionResultReceiver = 1;
            this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.write = 1.0f;
            this.RemoteActionCompatParcelizer = -1;
            this.read = -1.0f;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.AudioAttributesImplBaseParcelizer = 16777215;
            this.AudioAttributesCompatParcelizer = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.MediaBrowserCompatCustomActionResultReceiver = 1;
            this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.write = 1.0f;
            this.RemoteActionCompatParcelizer = -1;
            this.read = -1.0f;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.AudioAttributesImplBaseParcelizer = 16777215;
            this.AudioAttributesCompatParcelizer = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaMetadataCompat() {
            return ((ViewGroup.LayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int read() {
            return ((ViewGroup.LayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float write() {
            return this.write;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaDescriptionCompat() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void write(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int RatingCompat() {
            return this.MediaBrowserCompatItemReceiver;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void RemoteActionCompatParcelizer(int i) {
            this.MediaBrowserCompatItemReceiver = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatSearchResultReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean onCommand() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float IconCompatParcelizer() {
            return this.read;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int AudioAttributesImplApi21Parcelizer() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int AudioAttributesImplApi26Parcelizer() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int AudioAttributesImplBaseParcelizer() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.MediaBrowserCompatCustomActionResultReceiver);
            parcel.writeFloat(this.IconCompatParcelizer);
            parcel.writeFloat(this.write);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeFloat(this.read);
            parcel.writeInt(this.AudioAttributesImplApi26Parcelizer);
            parcel.writeInt(this.MediaBrowserCompatItemReceiver);
            parcel.writeInt(this.AudioAttributesImplBaseParcelizer);
            parcel.writeInt(this.AudioAttributesCompatParcelizer);
            parcel.writeByte(this.AudioAttributesImplApi21Parcelizer ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.LayoutParams) this).height);
            parcel.writeInt(((ViewGroup.LayoutParams) this).width);
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.MediaBrowserCompatCustomActionResultReceiver = 1;
            this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.write = 1.0f;
            this.RemoteActionCompatParcelizer = -1;
            this.read = -1.0f;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.AudioAttributesImplBaseParcelizer = 16777215;
            this.AudioAttributesCompatParcelizer = 16777215;
            this.MediaBrowserCompatCustomActionResultReceiver = parcel.readInt();
            this.IconCompatParcelizer = parcel.readFloat();
            this.write = parcel.readFloat();
            this.RemoteActionCompatParcelizer = parcel.readInt();
            this.read = parcel.readFloat();
            this.AudioAttributesImplApi26Parcelizer = parcel.readInt();
            this.MediaBrowserCompatItemReceiver = parcel.readInt();
            this.AudioAttributesImplBaseParcelizer = parcel.readInt();
            this.AudioAttributesCompatParcelizer = parcel.readInt();
            this.AudioAttributesImplApi21Parcelizer = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.LayoutParams) this).height = parcel.readInt();
            ((ViewGroup.LayoutParams) this).width = parcel.readInt();
        }
    }
}
