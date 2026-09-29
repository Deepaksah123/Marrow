package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes.dex */
public final class buildSingleSegmentBase implements getApplicationLabel {
    private final ConstraintLayout AudioAttributesCompatParcelizer;
    private ConstraintLayout RemoteActionCompatParcelizer;

    private buildSingleSegmentBase(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.RemoteActionCompatParcelizer = constraintLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static buildSingleSegmentBase AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static buildSingleSegmentBase IconCompatParcelizer(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.activity_api_block_action, (ViewGroup) null, false));
    }

    private static buildSingleSegmentBase IconCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new buildSingleSegmentBase(constraintLayout, constraintLayout);
    }
}
