package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class SegmentBaseMultiSegmentBase implements getApplicationLabel {
    public final CustomTextView IconCompatParcelizer;
    public final CustomButton RemoteActionCompatParcelizer;
    public final CustomButton read;
    private final ScrollView write;

    private SegmentBaseMultiSegmentBase(ScrollView scrollView, CustomButton customButton, CustomButton customButton2, CustomTextView customTextView) {
        this.write = scrollView;
        this.read = customButton;
        this.RemoteActionCompatParcelizer = customButton2;
        this.IconCompatParcelizer = customTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ScrollView IconCompatParcelizer() {
        return this.write;
    }

    public static SegmentBaseMultiSegmentBase write(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater);
    }

    private static SegmentBaseMultiSegmentBase RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return read(layoutInflater.inflate(R.layout.dialog_drm_not_supported, (ViewGroup) null, false));
    }

    private static SegmentBaseMultiSegmentBase read(View view) {
        int i = R.id.button_ok;
        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.button_ok);
        if (customButton != null) {
            i = R.id.read_more;
            CustomButton customButton2 = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.read_more);
            if (customButton2 != null) {
                i = R.id.tvDrmError;
                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDrmError);
                if (customTextView != null) {
                    return new SegmentBaseMultiSegmentBase((ScrollView) view, customButton, customButton2, customTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
