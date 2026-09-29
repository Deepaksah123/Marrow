package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getPlaylistSnapshot implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final View IconCompatParcelizer;
    private final ConstraintLayout read;

    private getPlaylistSnapshot(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2) {
        this.read = constraintLayout;
        this.IconCompatParcelizer = view;
        this.AudioAttributesCompatParcelizer = constraintLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.read;
    }

    public static getPlaylistSnapshot AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.overlay_host_dialog, viewGroup, false));
    }

    private static getPlaylistSnapshot AudioAttributesCompatParcelizer(View view) {
        int i = R.id.border;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.border);
        if (viewIconCompatParcelizer != null) {
            i = R.id.overlay_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.overlay_container);
            if (constraintLayout != null) {
                return new getPlaylistSnapshot((ConstraintLayout) view, viewIconCompatParcelizer, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
