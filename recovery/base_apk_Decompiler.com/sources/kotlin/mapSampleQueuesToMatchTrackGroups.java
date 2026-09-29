package kotlin;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class mapSampleQueuesToMatchTrackGroups implements getApplicationLabel {
    private final ConstraintLayout IconCompatParcelizer;
    public final CustomTextView read;
    public final CustomTextView write;

    private mapSampleQueuesToMatchTrackGroups(ConstraintLayout constraintLayout, CustomTextView customTextView, CustomTextView customTextView2) {
        this.IconCompatParcelizer = constraintLayout;
        this.read = customTextView;
        this.write = customTextView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static mapSampleQueuesToMatchTrackGroups RemoteActionCompatParcelizer(View view) {
        int i = R.id.download_radio;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.download_radio);
        if (customTextView != null) {
            i = R.id.download_size;
            CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.download_size);
            if (customTextView2 != null) {
                return new mapSampleQueuesToMatchTrackGroups((ConstraintLayout) view, customTextView, customTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
