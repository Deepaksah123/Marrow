package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import kotlin.BinarySearchSeekerSeekTimestampConverter;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.overestimatedResult;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> RemoteActionCompatParcelizer;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected final FabTransformationBehavior.IconCompatParcelizer read(Context context, boolean z) {
        int i;
        if (z) {
            i = calculateNextSearchBytePosition.RemoteActionCompatParcelizer.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = calculateNextSearchBytePosition.RemoteActionCompatParcelizer.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.IconCompatParcelizer iconCompatParcelizer = new FabTransformationBehavior.IconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer = BinarySearchSeekerSeekTimestampConverter.write(context, i);
        iconCompatParcelizer.RemoteActionCompatParcelizer = new overestimatedResult();
        return iconCompatParcelizer;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected final boolean AudioAttributesCompatParcelizer(View view, View view2, boolean z, boolean z2) {
        read(view2, z);
        return super.AudioAttributesCompatParcelizer(view, view2, z, z2);
    }

    private void read(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.RemoteActionCompatParcelizer = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.RemoteActionCompatParcelizer) && (((CoordinatorLayout.RemoteActionCompatParcelizer) childAt.getLayoutParams()).write() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.RemoteActionCompatParcelizer;
                        if (map != null && map.containsKey(childAt)) {
                            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(childAt, this.RemoteActionCompatParcelizer.get(childAt).intValue());
                        }
                    } else {
                        this.RemoteActionCompatParcelizer.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(childAt, 4);
                    }
                }
            }
            if (z) {
                return;
            }
            this.RemoteActionCompatParcelizer = null;
        }
    }
}
