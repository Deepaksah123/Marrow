package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class deriveVideoFormat implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    public final CustomTextView IconCompatParcelizer;
    public final CustomButton read;
    private final LinearLayout write;

    private deriveVideoFormat(LinearLayout linearLayout, CustomTextView customTextView, CustomTextView customTextView2, CustomButton customButton) {
        this.write = linearLayout;
        this.IconCompatParcelizer = customTextView;
        this.AudioAttributesCompatParcelizer = customTextView2;
        this.read = customButton;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static deriveVideoFormat IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_video_pro_user, viewGroup, false));
    }

    private static deriveVideoFormat AudioAttributesCompatParcelizer(View view) {
        int i = R.id.go_back;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.go_back);
        if (customTextView != null) {
            i = R.id.tvContent;
            CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvContent);
            if (customTextView2 != null) {
                i = R.id.view_plans;
                CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.view_plans);
                if (customButton != null) {
                    return new deriveVideoFormat((LinearLayout) view, customTextView, customTextView2, customButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
