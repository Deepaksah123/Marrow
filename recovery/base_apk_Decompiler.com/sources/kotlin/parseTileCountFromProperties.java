package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseTileCountFromProperties implements getApplicationLabel {
    private FrameLayout RemoteActionCompatParcelizer;
    private final FrameLayout read;

    private parseTileCountFromProperties(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.read = frameLayout;
        this.RemoteActionCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static parseTileCountFromProperties RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static parseTileCountFromProperties IconCompatParcelizer(LayoutInflater layoutInflater) {
        return read(layoutInflater.inflate(R.layout.activity_referral_coupon, (ViewGroup) null, false));
    }

    private static parseTileCountFromProperties read(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseTileCountFromProperties(frameLayout, frameLayout);
    }
}
