package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseAdaptationSet implements getApplicationLabel {
    private FrameLayout AudioAttributesCompatParcelizer;
    private final ConstraintLayout RemoteActionCompatParcelizer;

    private parseAdaptationSet(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = frameLayout;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static parseAdaptationSet RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return read(layoutInflater);
    }

    private static parseAdaptationSet read(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.activity_course_switch, (ViewGroup) null, false));
    }

    private static parseAdaptationSet IconCompatParcelizer(View view) {
        FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container);
        if (frameLayout != null) {
            return new parseAdaptationSet((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.container)));
    }
}
