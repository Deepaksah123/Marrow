package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s implements getApplicationLabel {
    public final View AudioAttributesCompatParcelizer;
    private ConstraintLayout IconCompatParcelizer;
    public final RadioButton RemoteActionCompatParcelizer;
    private final ConstraintLayout read;

    private r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s(ConstraintLayout constraintLayout, View view, RadioButton radioButton, ConstraintLayout constraintLayout2) {
        this.read = constraintLayout;
        this.AudioAttributesCompatParcelizer = view;
        this.RemoteActionCompatParcelizer = radioButton;
        this.IconCompatParcelizer = constraintLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.read;
    }

    public static r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.item_subject_filter1, viewGroup, false));
    }

    private static r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s read(View view) {
        int i = R.id.divider;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
        if (viewIconCompatParcelizer != null) {
            i = R.id.rd_subject;
            RadioButton radioButton = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rd_subject);
            if (radioButton != null) {
                i = R.id.rd_subject_cl;
                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.rd_subject_cl);
                if (constraintLayout != null) {
                    return new r8lambdaNHXR3M3hRpDAuqCoI6TpK2QA5s((ConstraintLayout) view, viewIconCompatParcelizer, radioButton, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
