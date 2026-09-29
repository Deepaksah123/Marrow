package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPlaylist1 implements getApplicationLabel {
    private final LinearLayout IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;

    private HlsMediaPlaylist1(LinearLayout linearLayout, TextView textView) {
        this.IconCompatParcelizer = linearLayout;
        this.RemoteActionCompatParcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static HlsMediaPlaylist1 write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.view_know_more_points_revamp, viewGroup, false));
    }

    private static HlsMediaPlaylist1 IconCompatParcelizer(View view) {
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPointText);
        if (textView != null) {
            return new HlsMediaPlaylist1((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvPointText)));
    }
}
