package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseProfiles implements getApplicationLabel {
    private final FrameLayout IconCompatParcelizer;
    private FrameLayout RemoteActionCompatParcelizer;

    private parseProfiles(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.IconCompatParcelizer = frameLayout;
        this.RemoteActionCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static parseProfiles AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static parseProfiles write(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.activity_password_signup, (ViewGroup) null, false));
    }

    private static parseProfiles AudioAttributesCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseProfiles(frameLayout, frameLayout);
    }
}
