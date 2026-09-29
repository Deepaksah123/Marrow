package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class compileBooleanAttrPattern implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    private final ConstraintLayout IconCompatParcelizer;
    private ConstraintLayout RemoteActionCompatParcelizer;
    public final TextView read;
    public final CustomTextView write;

    private compileBooleanAttrPattern(ConstraintLayout constraintLayout, CustomTextView customTextView, CustomTextView customTextView2, TextView textView, ConstraintLayout constraintLayout2) {
        this.IconCompatParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = customTextView;
        this.write = customTextView2;
        this.read = textView;
        this.RemoteActionCompatParcelizer = constraintLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static compileBooleanAttrPattern IconCompatParcelizer(View view) {
        int i = R.id.tvVideoAuthorDesignation;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoAuthorDesignation);
        if (customTextView != null) {
            i = R.id.tvVideoAuthorIntro;
            CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoAuthorIntro);
            if (customTextView2 != null) {
                i = R.id.tvVideoAuthorName;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoAuthorName);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new compileBooleanAttrPattern(constraintLayout, customTextView, customTextView2, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
