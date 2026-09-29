package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseEventObject implements getApplicationLabel {
    private final ConstraintLayout RemoteActionCompatParcelizer;
    private FrameLayout write;

    private parseEventObject(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.write = frameLayout;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static parseEventObject read(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static parseEventObject IconCompatParcelizer(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.activity_empty_fragment, (ViewGroup) null, false));
    }

    private static parseEventObject IconCompatParcelizer(View view) {
        FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container);
        if (frameLayout != null) {
            return new parseEventObject((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.container)));
    }
}
