package kotlin;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.ripple.RippleContainer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/inset;", "p0", "", "p1", "Lo/assignParameter;", "p2", "Lo/MinimalPrettyPrinter;", "p3", "Lkotlin/Function0;", "Lo/setCurrentValue;", "p4", "Lo/Module;", "write", "(Lo/inset;ZFLo/MinimalPrettyPrinter;Lo/getCreatedOnDateMs;)Lo/Module;", "Landroid/view/ViewGroup;", "Landroidx/compose/material/ripple/RippleContainer;", "read", "(Landroid/view/ViewGroup;)Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/View;", "AudioAttributesCompatParcelizer", "(Landroid/view/View;)Landroid/view/ViewGroup;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setSchema {
    public static final Module write(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter, getCreatedOnDateMs<setCurrentValue> getcreatedondatems) {
        return new getFeatureMask(insetVar, z, f, minimalPrettyPrinter, getcreatedondatems, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleContainer read(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RippleContainer) {
                return (RippleContainer) childAt;
            }
        }
        RippleContainer rippleContainer = new RippleContainer(viewGroup.getContext());
        viewGroup.addView(rippleContainer);
        return rippleContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup AudioAttributesCompatParcelizer(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                StringBuilder sb = new StringBuilder("Couldn't find a valid parent for ");
                sb.append(obj);
                sb.append(". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
