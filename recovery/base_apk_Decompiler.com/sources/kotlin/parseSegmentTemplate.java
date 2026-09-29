package kotlin;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSegmentTemplate implements getApplicationLabel {
    private final ConstraintLayout RemoteActionCompatParcelizer;
    public final ComposeView read;

    private parseSegmentTemplate(ConstraintLayout constraintLayout, ComposeView composeView) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.read = composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static parseSegmentTemplate write(View view) {
        ComposeView composeView = (ComposeView) getApplicationIcon.IconCompatParcelizer(view, R.id.composeYearUpdate);
        if (composeView != null) {
            return new parseSegmentTemplate((ConstraintLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.composeYearUpdate)));
    }
}
