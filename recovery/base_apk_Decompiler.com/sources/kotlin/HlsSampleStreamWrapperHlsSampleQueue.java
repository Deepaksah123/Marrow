package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsSampleStreamWrapperHlsSampleQueue implements getApplicationLabel {
    private LinearLayout AudioAttributesCompatParcelizer;
    private final LinearLayout read;
    public final CustomTextView write;

    private HlsSampleStreamWrapperHlsSampleQueue(LinearLayout linearLayout, LinearLayout linearLayout2, CustomTextView customTextView) {
        this.read = linearLayout;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.write = customTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.read;
    }

    public static HlsSampleStreamWrapperHlsSampleQueue RemoteActionCompatParcelizer(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectTitle);
        if (customTextView != null) {
            return new HlsSampleStreamWrapperHlsSampleQueue(linearLayout, linearLayout, customTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvSubjectTitle)));
    }
}
