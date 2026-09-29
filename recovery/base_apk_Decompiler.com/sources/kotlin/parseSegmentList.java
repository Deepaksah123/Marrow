package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSegmentList implements getApplicationLabel {
    public final ProgressBar AudioAttributesCompatParcelizer;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    private ConstraintLayout read;

    private parseSegmentList(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.read = constraintLayout2;
        this.AudioAttributesCompatParcelizer = progressBar;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static parseSegmentList IconCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater);
    }

    private static parseSegmentList RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.activity_payment, (ViewGroup) null, false));
    }

    private static parseSegmentList RemoteActionCompatParcelizer(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbLoader);
        if (progressBar != null) {
            return new parseSegmentList(constraintLayout, constraintLayout, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.pbLoader)));
    }
}
