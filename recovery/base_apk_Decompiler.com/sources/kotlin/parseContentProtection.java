package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseContentProtection implements getApplicationLabel {
    private FrameLayout RemoteActionCompatParcelizer;
    private final FrameLayout read;

    private parseContentProtection(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.read = frameLayout;
        this.RemoteActionCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static parseContentProtection AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return read(layoutInflater);
    }

    private static parseContentProtection read(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.activity_email_signup_v2, (ViewGroup) null, false));
    }

    private static parseContentProtection write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseContentProtection(frameLayout, frameLayout);
    }
}
