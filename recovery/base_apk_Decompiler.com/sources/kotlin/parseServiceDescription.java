package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseServiceDescription implements getApplicationLabel {
    private FrameLayout AudioAttributesCompatParcelizer;
    private final FrameLayout read;

    private parseServiceDescription(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.read = frameLayout;
        this.AudioAttributesCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static parseServiceDescription write(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater);
    }

    private static parseServiceDescription RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.activity_sign_in, (ViewGroup) null, false));
    }

    private static parseServiceDescription IconCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseServiceDescription(frameLayout, frameLayout);
    }
}
