package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class loadPlaylist implements getApplicationLabel {
    private final ConstraintLayout AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    private ConstraintLayout read;

    private loadPlaylist(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.read = constraintLayout2;
        this.IconCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static loadPlaylist read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.row_text_expand_all, viewGroup, false));
    }

    private static loadPlaylist AudioAttributesCompatParcelizer(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLabelName);
        if (textView != null) {
            return new loadPlaylist(constraintLayout, constraintLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvLabelName)));
    }
}
