package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseRepresentation implements getApplicationLabel {
    private FrameLayout RemoteActionCompatParcelizer;
    private final FrameLayout read;

    private parseRepresentation(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.read = frameLayout;
        this.RemoteActionCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static parseRepresentation RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static parseRepresentation write(LayoutInflater layoutInflater) {
        return read(layoutInflater.inflate(R.layout.activity_name_signup, (ViewGroup) null, false));
    }

    private static parseRepresentation read(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseRepresentation(frameLayout, frameLayout);
    }
}
