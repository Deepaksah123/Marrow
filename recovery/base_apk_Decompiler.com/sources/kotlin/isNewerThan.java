package kotlin;

import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class isNewerThan implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    public final View IconCompatParcelizer;
    private Space RemoteActionCompatParcelizer;
    private final ConstraintLayout read;
    public final HlsSampleStreamWrapperEmsgUnwrappingTrackOutput write;

    private isNewerThan(ConstraintLayout constraintLayout, Space space, HlsSampleStreamWrapperEmsgUnwrappingTrackOutput hlsSampleStreamWrapperEmsgUnwrappingTrackOutput, CustomTextView customTextView, View view) {
        this.read = constraintLayout;
        this.RemoteActionCompatParcelizer = space;
        this.write = hlsSampleStreamWrapperEmsgUnwrappingTrackOutput;
        this.AudioAttributesCompatParcelizer = customTextView;
        this.IconCompatParcelizer = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.read;
    }

    public static isNewerThan write(View view) {
        int i = R.id.bottom_space;
        Space space = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.bottom_space);
        if (space != null) {
            i = R.id.lesson_card_root_view;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_card_root_view);
            if (viewIconCompatParcelizer != null) {
                HlsSampleStreamWrapperEmsgUnwrappingTrackOutput hlsSampleStreamWrapperEmsgUnwrappingTrackOutputAudioAttributesCompatParcelizer = HlsSampleStreamWrapperEmsgUnwrappingTrackOutput.AudioAttributesCompatParcelizer(viewIconCompatParcelizer);
                i = R.id.lesson_position_view;
                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_position_view);
                if (customTextView != null) {
                    i = R.id.view_dashed_line;
                    View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.view_dashed_line);
                    if (viewIconCompatParcelizer2 != null) {
                        return new isNewerThan((ConstraintLayout) view, space, hlsSampleStreamWrapperEmsgUnwrappingTrackOutputAudioAttributesCompatParcelizer, customTextView, viewIconCompatParcelizer2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
