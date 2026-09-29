package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseAdaptationSetChild implements getApplicationLabel {
    private final FrameLayout IconCompatParcelizer;
    private FrameLayout read;

    private parseAdaptationSetChild(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.IconCompatParcelizer = frameLayout;
        this.read = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static parseAdaptationSetChild RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static parseAdaptationSetChild write(LayoutInflater layoutInflater) {
        return read(layoutInflater.inflate(R.layout.activity_course_signup, (ViewGroup) null, false));
    }

    private static parseAdaptationSetChild read(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseAdaptationSetChild(frameLayout, frameLayout);
    }
}
