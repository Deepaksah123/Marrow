package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getMediaPlaylistUriForReload implements getApplicationLabel {
    private final LinearLayout IconCompatParcelizer;
    private View RemoteActionCompatParcelizer;
    public final TextView read;
    private LinearLayout write;

    private getMediaPlaylistUriForReload(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, View view) {
        this.IconCompatParcelizer = linearLayout;
        this.write = linearLayout2;
        this.read = textView;
        this.RemoteActionCompatParcelizer = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static getMediaPlaylistUriForReload IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.row_previous_revamp_year, viewGroup, false));
    }

    private static getMediaPlaylistUriForReload AudioAttributesCompatParcelizer(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.tvYear;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvYear);
        if (textView != null) {
            i = R.id.viewDivider;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.viewDivider);
            if (viewIconCompatParcelizer != null) {
                return new getMediaPlaylistUriForReload(linearLayout, linearLayout, textView, viewIconCompatParcelizer);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
