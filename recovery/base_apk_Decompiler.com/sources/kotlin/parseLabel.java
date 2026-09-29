package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseLabel implements getApplicationLabel {
    private final FrameLayout IconCompatParcelizer;
    private FrameLayout RemoteActionCompatParcelizer;

    private parseLabel(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.IconCompatParcelizer = frameLayout;
        this.RemoteActionCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static parseLabel RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater);
    }

    private static parseLabel AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.activity_home_test, (ViewGroup) null, false));
    }

    private static parseLabel IconCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseLabel(frameLayout, frameLayout);
    }
}
