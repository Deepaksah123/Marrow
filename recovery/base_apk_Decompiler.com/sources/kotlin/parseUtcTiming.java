package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseUtcTiming implements getApplicationLabel {
    private FrameLayout IconCompatParcelizer;
    private final FrameLayout write;

    private parseUtcTiming(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.write = frameLayout;
        this.IconCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.write;
    }

    public static parseUtcTiming IconCompatParcelizer(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater);
    }

    private static parseUtcTiming AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.activity_recent_updates2, (ViewGroup) null, false));
    }

    private static parseUtcTiming write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseUtcTiming(frameLayout, frameLayout);
    }
}
