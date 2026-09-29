package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class loadPlaylistImmediately implements getApplicationLabel {
    public final TextView read;
    private final LinearLayout write;

    private loadPlaylistImmediately(LinearLayout linearLayout, TextView textView) {
        this.write = linearLayout;
        this.read = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static loadPlaylistImmediately write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.row_no_test_revamp_month, viewGroup, false));
    }

    private static loadPlaylistImmediately write(View view) {
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTestEmptyState);
        if (textView != null) {
            return new loadPlaylistImmediately((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvTestEmptyState)));
    }
}
