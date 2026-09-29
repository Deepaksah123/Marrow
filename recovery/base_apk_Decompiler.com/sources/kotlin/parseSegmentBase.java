package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSegmentBase implements getApplicationLabel {
    private FrameLayout IconCompatParcelizer;
    private final FrameLayout read;

    private parseSegmentBase(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.read = frameLayout;
        this.IconCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static parseSegmentBase read(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static parseSegmentBase IconCompatParcelizer(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.activity_pearl_subject_list, (ViewGroup) null, false));
    }

    private static parseSegmentBase AudioAttributesCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseSegmentBase(frameLayout, frameLayout);
    }
}
