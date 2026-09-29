package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMultivariantPlaylistVariant implements getApplicationLabel {
    private ImageView AudioAttributesCompatParcelizer;
    private ConstraintLayout AudioAttributesImplApi26Parcelizer;
    private final ConstraintLayout IconCompatParcelizer;
    public final CustomTextView RemoteActionCompatParcelizer;
    public final ProgressBar read;
    public final CustomTextView write;

    private HlsMultivariantPlaylistVariant(ConstraintLayout constraintLayout, ImageView imageView, CustomTextView customTextView, ProgressBar progressBar, ConstraintLayout constraintLayout2, CustomTextView customTextView2) {
        this.IconCompatParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = imageView;
        this.write = customTextView;
        this.read = progressBar;
        this.AudioAttributesImplApi26Parcelizer = constraintLayout2;
        this.RemoteActionCompatParcelizer = customTextView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static HlsMultivariantPlaylistVariant read(View view) {
        int i = R.id.btnSuggestedCard;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSuggestedCard);
        if (imageView != null) {
            i = R.id.lessonTitle;
            CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lessonTitle);
            if (customTextView != null) {
                i = R.id.suggestedLessonProgress;
                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.suggestedLessonProgress);
                if (progressBar != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.tvLessonAttemptStatus;
                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonAttemptStatus);
                    if (customTextView2 != null) {
                        return new HlsMultivariantPlaylistVariant(constraintLayout, imageView, customTextView, progressBar, constraintLayout, customTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
