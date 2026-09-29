package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class addSegmentsForAdaptationSet implements getApplicationLabel {
    private final RelativeLayout IconCompatParcelizer;
    private RelativeLayout RemoteActionCompatParcelizer;
    private ProgressBar read;
    public final CustomTextView write;

    private addSegmentsForAdaptationSet(RelativeLayout relativeLayout, CustomTextView customTextView, RelativeLayout relativeLayout2, ProgressBar progressBar) {
        this.IconCompatParcelizer = relativeLayout;
        this.write = customTextView;
        this.RemoteActionCompatParcelizer = relativeLayout2;
        this.read = progressBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public RelativeLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static addSegmentsForAdaptationSet read(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater);
    }

    private static addSegmentsForAdaptationSet RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.dialog_loading, (ViewGroup) null, false));
    }

    private static addSegmentsForAdaptationSet write(View view) {
        int i = R.id.dialog_loading_msg;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_loading_msg);
        if (customTextView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progress_bar);
            if (progressBar != null) {
                return new addSegmentsForAdaptationSet(relativeLayout, customTextView, relativeLayout, progressBar);
            }
            i = R.id.progress_bar;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
