package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.FlowLayout;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.hasSuperClassStartingWith;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.sniff;

/* JADX INFO: loaded from: classes3.dex */
public class ChipGroup extends FlowLayout {
    private static final int AudioAttributesCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_ChipGroup;
    private RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final sniff<Chip> IconCompatParcelizer;
    private final read MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;
    private int read;
    private int write;

    /* JADX INFO: loaded from: classes5.dex */
    public interface RemoteActionCompatParcelizer {
        void RemoteActionCompatParcelizer();
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Deprecated
    public interface write {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams() {
            super(-2, -2);
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.chipGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = AudioAttributesCompatParcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        sniff<Chip> sniffVar = new sniff<>();
        this.IconCompatParcelizer = sniffVar;
        read readVar = new read(this, (byte) 0);
        this.MediaBrowserCompatItemReceiver = readVar;
        TypedArray typedArrayWrite = readId3Metadata.write(getContext(), attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.ChipGroup_selectionRequired, false));
        this.RemoteActionCompatParcelizer = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.ChipGroup_checkedChip, -1);
        typedArrayWrite.recycle();
        sniffVar.IconCompatParcelizer(new sniff.RemoteActionCompatParcelizer() { // from class: com.google.android.material.chip.ChipGroup.3
            @Override // o.sniff.RemoteActionCompatParcelizer
            public final void write() {
                if (ChipGroup.this.AudioAttributesImplApi26Parcelizer != null) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = ChipGroup.this.AudioAttributesImplApi26Parcelizer;
                    ChipGroup.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(ChipGroup.this);
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                }
            }
        });
        super.setOnHierarchyChangeListener(readVar);
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hasSuperClassStartingWith.write(accessibilityNodeInfo).RemoteActionCompatParcelizer(hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(), write() ? IconCompatParcelizer() : -1, false, AudioAttributesCompatParcelizer() ? 1 : 2));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer = onHierarchyChangeListener;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.RemoteActionCompatParcelizer;
        if (i != -1) {
            this.IconCompatParcelizer.read(i);
        }
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public final int read() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Deprecated
    public void setOnCheckedChangeListener(final write writeVar) {
        if (writeVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new RemoteActionCompatParcelizer() { // from class: com.google.android.material.chip.ChipGroup.1
                @Override // com.google.android.material.chip.ChipGroup.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer() {
                    if (ChipGroup.this.IconCompatParcelizer.IconCompatParcelizer()) {
                        ChipGroup.this.read();
                    }
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
    }

    private int IconCompatParcelizer() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && write(i2)) {
                i++;
            }
        }
        return i;
    }

    final int AudioAttributesCompatParcelizer(View view) {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && write(i2)) {
                if (((Chip) childAt) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    private boolean write(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.read != i) {
            this.read = i;
            IconCompatParcelizer(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.write != i) {
            this.write = i;
            read(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean write() {
        return super.write();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public void setSingleSelection(boolean z) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSelectionRequired(boolean z) {
        this.IconCompatParcelizer.read(z);
    }

    class read implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener AudioAttributesCompatParcelizer;

        private read() {
        }

        /* synthetic */ read(ChipGroup chipGroup, byte b) {
            this();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(InvalidTypeIdException.read());
                }
                ChipGroup.this.IconCompatParcelizer.IconCompatParcelizer((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.AudioAttributesCompatParcelizer;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.IconCompatParcelizer.AudioAttributesCompatParcelizer((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.AudioAttributesCompatParcelizer;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }
}
