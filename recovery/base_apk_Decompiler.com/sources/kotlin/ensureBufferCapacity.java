package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ensureBufferCapacity implements getApplicationLabel {
    private final ConstraintLayout AudioAttributesCompatParcelizer;
    private MaterialCardView IconCompatParcelizer;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    private View read;
    private TextView write;

    private ensureBufferCapacity(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ConstraintLayout constraintLayout2, TextView textView, View view) {
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.IconCompatParcelizer = materialCardView;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.write = textView;
        this.read = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static ensureBufferCapacity RemoteActionCompatParcelizer(View view) {
        int i = R.id.cardView2;
        MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cardView2);
        if (materialCardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.tvInfo;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvInfo);
            if (textView != null) {
                i = R.id.viewTriangularTip;
                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.viewTriangularTip);
                if (viewIconCompatParcelizer != null) {
                    return new ensureBufferCapacity(constraintLayout, materialCardView, constraintLayout, textView, viewIconCompatParcelizer);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
