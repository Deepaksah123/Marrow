package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMultivariantPlaylist implements getApplicationLabel {
    private ImageView AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi21Parcelizer;
    private final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final TextView IconCompatParcelizer;
    private LinearLayout RemoteActionCompatParcelizer;
    private ConstraintLayout read;
    public final TextView write;

    private HlsMultivariantPlaylist(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.AudioAttributesImplApi26Parcelizer = linearLayout;
        this.AudioAttributesCompatParcelizer = imageView;
        this.RemoteActionCompatParcelizer = linearLayout2;
        this.read = constraintLayout;
        this.write = textView;
        this.IconCompatParcelizer = textView2;
        this.AudioAttributesImplApi21Parcelizer = textView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static HlsMultivariantPlaylist read(View view) {
        int i = R.id.ivScoreLeaf;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivScoreLeaf);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.rank_share_screenshot_root;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.rank_share_screenshot_root);
            if (constraintLayout != null) {
                i = R.id.tvRank;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRank);
                if (textView != null) {
                    i = R.id.tvRankOutOf;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRankOutOf);
                    if (textView2 != null) {
                        i = R.id.tvTextRankOnly;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTextRankOnly);
                        if (textView3 != null) {
                            return new HlsMultivariantPlaylist(linearLayout, imageView, linearLayout, constraintLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
