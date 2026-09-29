package kotlin;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes.dex */
public final class parseEvent implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    public final CustomButton IconCompatParcelizer;
    private final MaterialCardView RemoteActionCompatParcelizer;
    public final AppCompatTextView read;
    public final FrameLayout write;

    private parseEvent(MaterialCardView materialCardView, CustomButton customButton, FrameLayout frameLayout, CustomTextView customTextView, AppCompatTextView appCompatTextView) {
        this.RemoteActionCompatParcelizer = materialCardView;
        this.IconCompatParcelizer = customButton;
        this.write = frameLayout;
        this.AudioAttributesCompatParcelizer = customTextView;
        this.read = appCompatTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public MaterialCardView IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static parseEvent RemoteActionCompatParcelizer(View view) {
        int i = R.id.btn_ok;
        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btn_ok);
        if (customButton != null) {
            i = R.id.loading_container;
            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.loading_container);
            if (frameLayout != null) {
                i = R.id.msg_title;
                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.msg_title);
                if (customTextView != null) {
                    i = R.id.tv_secondary_cta;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_secondary_cta);
                    if (appCompatTextView != null) {
                        return new parseEvent((MaterialCardView) view, customButton, frameLayout, customTextView, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
