package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.deserializeUsingCustom;
import kotlin.hasSuperClassStartingWith;
import kotlin.modifyFieldName;
import kotlin.readFrames;

/* JADX INFO: loaded from: classes5.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int AudioAttributesCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Material3_BottomSheet_DragHandle;
    private final String AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private BottomSheetBehavior<?> IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final AccessibilityManager RemoteActionCompatParcelizer;
    private final BottomSheetBehavior.write read;
    private boolean write;

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, AudioAttributesCompatParcelizer), attributeSet, i);
        this.AudioAttributesImplBaseParcelizer = getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.bottomsheet_action_expand);
        this.MediaBrowserCompatCustomActionResultReceiver = getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.bottomsheet_action_collapse);
        this.AudioAttributesImplApi21Parcelizer = getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.bottomsheet_drag_handle_clicked);
        this.read = new BottomSheetBehavior.write() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.4
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
            public final void onSlide(View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
            public final void onStateChanged(View view, int i2) {
                BottomSheetDragHandleView.this.write(i2);
            }
        };
        this.RemoteActionCompatParcelizer = (AccessibilityManager) getContext().getSystemService("accessibility");
        write();
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, new deserializeUsingCustom() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.5
            @Override // kotlin.deserializeUsingCustom
            public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView.this.read();
                }
            }
        });
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioAttributesCompatParcelizer(IconCompatParcelizer());
        AccessibilityManager accessibilityManager = this.RemoteActionCompatParcelizer;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.RemoteActionCompatParcelizer.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.RemoteActionCompatParcelizer;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        AudioAttributesCompatParcelizer(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.write = z;
        write();
    }

    private void AudioAttributesCompatParcelizer(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.IconCompatParcelizer;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.RemoteActionCompatParcelizer(this.read);
            this.IconCompatParcelizer.write((View) null);
        }
        this.IconCompatParcelizer = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.write(this);
            write(this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer());
            this.IconCompatParcelizer.read(this.read);
        }
        write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(int i) {
        if (i == 4) {
            this.MediaBrowserCompatItemReceiver = true;
        } else if (i == 3) {
            this.MediaBrowserCompatItemReceiver = false;
        }
        InvalidTypeIdException.IconCompatParcelizer(this, hasSuperClassStartingWith.read.write, this.MediaBrowserCompatItemReceiver ? this.AudioAttributesImplBaseParcelizer : this.MediaBrowserCompatCustomActionResultReceiver, new modifyFieldName() { // from class: o.CeaUtil
            @Override // kotlin.modifyFieldName
            public final boolean read(View view) {
                return this.write.read();
            }
        });
    }

    private void write() {
        this.AudioAttributesImplApi26Parcelizer = this.write && this.IconCompatParcelizer != null;
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, this.IconCompatParcelizer == null ? 2 : 1);
        setClickable(this.AudioAttributesImplApi26Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean read() {
        /*
            r6 = this;
            boolean r0 = r6.AudioAttributesImplApi26Parcelizer
            if (r0 != 0) goto L6
            r6 = 0
            return r6
        L6:
            java.lang.String r0 = r6.AudioAttributesImplApi21Parcelizer
            r6.IconCompatParcelizer(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r6.IconCompatParcelizer
            boolean r0 = r0.MediaBrowserCompatItemReceiver()
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r2 = r6.IconCompatParcelizer
            int r2 = r2.AudioAttributesImplBaseParcelizer()
            r3 = 6
            r4 = 3
            r5 = 4
            if (r2 != r5) goto L21
            if (r0 == 0) goto L2c
            goto L2d
        L21:
            if (r2 != r4) goto L26
            if (r0 == 0) goto L2a
            goto L2d
        L26:
            boolean r0 = r6.MediaBrowserCompatItemReceiver
            if (r0 != 0) goto L2c
        L2a:
            r3 = r5
            goto L2d
        L2c:
            r3 = r4
        L2d:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r6 = r6.IconCompatParcelizer
            r6.IconCompatParcelizer(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.read():boolean");
    }

    private void IconCompatParcelizer(String str) {
        if (this.RemoteActionCompatParcelizer == null) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.getText().add(str);
        this.RemoteActionCompatParcelizer.sendAccessibilityEvent(accessibilityEventObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.material.bottomsheet.BottomSheetDragHandleView] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    private BottomSheetBehavior<?> IconCompatParcelizer() {
        while (true) {
            this = IconCompatParcelizer((View) this);
            if (this == 0) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.RemoteActionCompatParcelizer) {
                CoordinatorLayout.Behavior behaviorWrite = ((CoordinatorLayout.RemoteActionCompatParcelizer) layoutParams).write();
                if (behaviorWrite instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) behaviorWrite;
                }
            }
        }
    }

    private static View IconCompatParcelizer(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
