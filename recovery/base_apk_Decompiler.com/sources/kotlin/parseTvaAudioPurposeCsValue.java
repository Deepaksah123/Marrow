package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseTvaAudioPurposeCsValue implements getApplicationLabel {
    private final FrameLayout AudioAttributesCompatParcelizer;
    private FrameLayout RemoteActionCompatParcelizer;

    private parseTvaAudioPurposeCsValue(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.AudioAttributesCompatParcelizer = frameLayout;
        this.RemoteActionCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static parseTvaAudioPurposeCsValue write(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static parseTvaAudioPurposeCsValue IconCompatParcelizer(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.activity_reset_content, (ViewGroup) null, false));
    }

    private static parseTvaAudioPurposeCsValue AudioAttributesCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseTvaAudioPurposeCsValue(frameLayout, frameLayout);
    }
}
