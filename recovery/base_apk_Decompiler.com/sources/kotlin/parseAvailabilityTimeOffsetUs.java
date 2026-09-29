package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseAvailabilityTimeOffsetUs implements getApplicationLabel {
    private FrameLayout IconCompatParcelizer;
    private final FrameLayout write;

    private parseAvailabilityTimeOffsetUs(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.write = frameLayout;
        this.IconCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.write;
    }

    public static parseAvailabilityTimeOffsetUs RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static parseAvailabilityTimeOffsetUs write(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.activity_custom_module_creation, (ViewGroup) null, false));
    }

    private static parseAvailabilityTimeOffsetUs IconCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseAvailabilityTimeOffsetUs(frameLayout, frameLayout);
    }
}
