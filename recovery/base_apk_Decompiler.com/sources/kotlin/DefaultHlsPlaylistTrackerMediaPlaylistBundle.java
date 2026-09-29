package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsPlaylistTrackerMediaPlaylistBundle implements getApplicationLabel {
    public final LinearLayout IconCompatParcelizer;
    private final CardView RemoteActionCompatParcelizer;
    public final TextView read;
    public final ImageButton write;

    private DefaultHlsPlaylistTrackerMediaPlaylistBundle(CardView cardView, ImageButton imageButton, LinearLayout linearLayout, TextView textView) {
        this.RemoteActionCompatParcelizer = cardView;
        this.write = imageButton;
        this.IconCompatParcelizer = linearLayout;
        this.read = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static DefaultHlsPlaylistTrackerMediaPlaylistBundle write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.row_gt_nudge_banner, viewGroup, false));
    }

    private static DefaultHlsPlaylistTrackerMediaPlaylistBundle IconCompatParcelizer(View view) {
        int i = R.id.ibDismissNudge;
        ImageButton imageButton = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.ibDismissNudge);
        if (imageButton != null) {
            i = R.id.rootNudgeBanner;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.rootNudgeBanner);
            if (linearLayout != null) {
                i = R.id.tvNudgeTitle;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNudgeTitle);
                if (textView != null) {
                    return new DefaultHlsPlaylistTrackerMediaPlaylistBundle((CardView) view, imageButton, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
