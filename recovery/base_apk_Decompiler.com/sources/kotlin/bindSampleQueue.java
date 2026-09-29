package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class bindSampleQueue implements getApplicationLabel {
    private final ConstraintLayout IconCompatParcelizer;
    private ImageView RemoteActionCompatParcelizer;
    public final TextView write;

    private bindSampleQueue(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.IconCompatParcelizer = constraintLayout;
        this.RemoteActionCompatParcelizer = imageView;
        this.write = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static bindSampleQueue RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.item_pearl_subject_row_item_revamp, viewGroup, false));
    }

    private static bindSampleQueue write(View view) {
        int i = R.id.imgNextArrow;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgNextArrow);
        if (imageView != null) {
            i = R.id.txtSubjectName;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtSubjectName);
            if (textView != null) {
                return new bindSampleQueue((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
