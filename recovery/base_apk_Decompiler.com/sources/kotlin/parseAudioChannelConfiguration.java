package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseAudioChannelConfiguration implements getApplicationLabel {
    private FrameLayout AudioAttributesCompatParcelizer;
    private final FrameLayout write;

    private parseAudioChannelConfiguration(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.write = frameLayout;
        this.AudioAttributesCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.write;
    }

    public static parseAudioChannelConfiguration write(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static parseAudioChannelConfiguration IconCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.activity_custom_module_score, (ViewGroup) null, false));
    }

    private static parseAudioChannelConfiguration write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseAudioChannelConfiguration(frameLayout, frameLayout);
    }
}
