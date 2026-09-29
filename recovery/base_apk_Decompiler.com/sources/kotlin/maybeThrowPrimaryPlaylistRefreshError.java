package kotlin;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeThrowPrimaryPlaylistRefreshError implements getApplicationLabel {
    private CustomTextView AudioAttributesCompatParcelizer;
    private ImageView IconCompatParcelizer;
    private ImageView RemoteActionCompatParcelizer;
    private final ConstraintLayout read;
    private CustomTextView write;

    private maybeThrowPrimaryPlaylistRefreshError(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, CustomTextView customTextView, CustomTextView customTextView2) {
        this.read = constraintLayout;
        this.RemoteActionCompatParcelizer = imageView;
        this.IconCompatParcelizer = imageView2;
        this.write = customTextView;
        this.AudioAttributesCompatParcelizer = customTextView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.read;
    }

    public static maybeThrowPrimaryPlaylistRefreshError write(View view) {
        int i = R.id.iv_close;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_close);
        if (imageView != null) {
            i = R.id.iv_plan_upgrade;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_plan_upgrade);
            if (imageView2 != null) {
                i = R.id.tv_upgrade_description;
                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_upgrade_description);
                if (customTextView != null) {
                    i = R.id.tv_upgrade_title;
                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_upgrade_title);
                    if (customTextView2 != null) {
                        return new maybeThrowPrimaryPlaylistRefreshError((ConstraintLayout) view, imageView, imageView2, customTextView, customTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
