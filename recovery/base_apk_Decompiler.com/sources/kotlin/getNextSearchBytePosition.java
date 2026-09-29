package kotlin;

import android.util.Property;
import android.view.ViewGroup;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class getNextSearchBytePosition extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> read = new getNextSearchBytePosition("childrenAlpha");

    @Override // android.util.Property
    public final /* synthetic */ Float get(ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(viewGroup);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(ViewGroup viewGroup, Float f) {
        write(viewGroup, f);
    }

    private getNextSearchBytePosition(String str) {
        super(Float.class, str);
    }

    private static Float AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    private static void write(ViewGroup viewGroup, Float f) {
        float fFloatValue = f.floatValue();
        viewGroup.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
