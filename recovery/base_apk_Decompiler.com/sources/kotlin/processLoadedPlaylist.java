package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class processLoadedPlaylist implements getApplicationLabel {
    private final ConstraintLayout IconCompatParcelizer;
    public final TextView write;

    private processLoadedPlaylist(ConstraintLayout constraintLayout, TextView textView) {
        this.IconCompatParcelizer = constraintLayout;
        this.write = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static processLoadedPlaylist read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.row_text_label_revamp, viewGroup, false));
    }

    private static processLoadedPlaylist RemoteActionCompatParcelizer(View view) {
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLabelName);
        if (textView != null) {
            return new processLoadedPlaylist((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvLabelName)));
    }
}
