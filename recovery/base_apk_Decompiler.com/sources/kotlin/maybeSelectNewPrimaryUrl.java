package kotlin;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeSelectNewPrimaryUrl implements getApplicationLabel {
    private FrameLayout AudioAttributesCompatParcelizer;
    public final LinearLayout IconCompatParcelizer;
    private final FrameLayout RemoteActionCompatParcelizer;
    private ImageView read;
    public final CustomTextView write;

    private maybeSelectNewPrimaryUrl(FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout2, CustomTextView customTextView) {
        this.RemoteActionCompatParcelizer = frameLayout;
        this.IconCompatParcelizer = linearLayout;
        this.read = imageView;
        this.AudioAttributesCompatParcelizer = frameLayout2;
        this.write = customTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public FrameLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static maybeSelectNewPrimaryUrl write(View view) {
        int i = R.id.emptyState;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.emptyState);
        if (linearLayout != null) {
            i = R.id.ivEmptyState;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivEmptyState);
            if (imageView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = R.id.tvEmptyState;
                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmptyState);
                if (customTextView != null) {
                    return new maybeSelectNewPrimaryUrl(frameLayout, linearLayout, imageView, frameLayout, customTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
