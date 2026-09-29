package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseUrlTemplate implements getApplicationLabel {
    private FrameLayout AudioAttributesCompatParcelizer;
    private final FrameLayout read;

    private parseUrlTemplate(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.read = frameLayout;
        this.AudioAttributesCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static parseUrlTemplate read(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static parseUrlTemplate write(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.activity_selected_college_signup, (ViewGroup) null, false));
    }

    private static parseUrlTemplate write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseUrlTemplate(frameLayout, frameLayout);
    }
}
