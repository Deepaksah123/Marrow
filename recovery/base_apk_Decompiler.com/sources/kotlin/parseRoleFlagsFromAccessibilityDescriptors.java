package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseRoleFlagsFromAccessibilityDescriptors implements getApplicationLabel {
    private final FrameLayout RemoteActionCompatParcelizer;
    private FrameLayout write;

    private parseRoleFlagsFromAccessibilityDescriptors(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.RemoteActionCompatParcelizer = frameLayout;
        this.write = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static parseRoleFlagsFromAccessibilityDescriptors read(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static parseRoleFlagsFromAccessibilityDescriptors write(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.activity_main_settings, (ViewGroup) null, false));
    }

    private static parseRoleFlagsFromAccessibilityDescriptors write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseRoleFlagsFromAccessibilityDescriptors(frameLayout, frameLayout);
    }
}
