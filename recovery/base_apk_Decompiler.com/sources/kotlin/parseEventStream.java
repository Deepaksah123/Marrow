package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseEventStream implements getApplicationLabel {
    private final FrameLayout IconCompatParcelizer;
    private FrameLayout write;

    private parseEventStream(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.IconCompatParcelizer = frameLayout;
        this.write = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static parseEventStream IconCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater);
    }

    private static parseEventStream RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.activity_lesson_feedback_v2, (ViewGroup) null, false));
    }

    private static parseEventStream RemoteActionCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseEventStream(frameLayout, frameLayout);
    }
}
