package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSegmentTimeline implements getApplicationLabel {
    private FrameLayout IconCompatParcelizer;
    private final FrameLayout read;

    private parseSegmentTimeline(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.read = frameLayout;
        this.IconCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static parseSegmentTimeline AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return read(layoutInflater);
    }

    private static parseSegmentTimeline read(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.activity_phone_login, (ViewGroup) null, false));
    }

    private static parseSegmentTimeline AudioAttributesCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseSegmentTimeline(frameLayout, frameLayout);
    }
}
