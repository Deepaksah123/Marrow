package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildSegmentTimelineElement implements getApplicationLabel {
    private FrameLayout AudioAttributesCompatParcelizer;
    private final FrameLayout write;

    private buildSegmentTimelineElement(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.write = frameLayout;
        this.AudioAttributesCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.write;
    }

    public static buildSegmentTimelineElement IconCompatParcelizer(LayoutInflater layoutInflater) {
        return read(layoutInflater);
    }

    private static buildSegmentTimelineElement read(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.activity_account_selection, (ViewGroup) null, false));
    }

    private static buildSegmentTimelineElement write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new buildSegmentTimelineElement(frameLayout, frameLayout);
    }
}
