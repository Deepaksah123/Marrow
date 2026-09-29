package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseContentType implements getApplicationLabel {
    private final FrameLayout RemoteActionCompatParcelizer;
    private FrameLayout write;

    private parseContentType(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.RemoteActionCompatParcelizer = frameLayout;
        this.write = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static parseContentType read(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater);
    }

    private static parseContentType RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.activity_custom_module_topics_selection, (ViewGroup) null, false));
    }

    private static parseContentType AudioAttributesCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseContentType(frameLayout, frameLayout);
    }
}
