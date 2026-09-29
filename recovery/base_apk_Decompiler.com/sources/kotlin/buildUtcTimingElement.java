package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildUtcTimingElement implements getApplicationLabel {
    private final FrameLayout IconCompatParcelizer;
    private FrameLayout write;

    private buildUtcTimingElement(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.IconCompatParcelizer = frameLayout;
        this.write = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static buildUtcTimingElement RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static buildUtcTimingElement write(LayoutInflater layoutInflater) {
        return read(layoutInflater.inflate(R.layout.activity_custom_module_introduction, (ViewGroup) null, false));
    }

    private static buildUtcTimingElement read(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new buildUtcTimingElement(frameLayout, frameLayout);
    }
}
