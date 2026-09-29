package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPlaylistPlaylistType implements getApplicationLabel {
    public final MaterialCardView AudioAttributesCompatParcelizer;
    private RelativeLayout AudioAttributesImplApi26Parcelizer;
    public final RelativeLayout AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    private final MaterialCardView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    public final ImageView write;

    private HlsMediaPlaylistPlaylistType(MaterialCardView materialCardView, MaterialCardView materialCardView2, RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout2) {
        this.MediaBrowserCompatCustomActionResultReceiver = materialCardView;
        this.AudioAttributesCompatParcelizer = materialCardView2;
        this.AudioAttributesImplApi26Parcelizer = relativeLayout;
        this.write = imageView;
        this.RemoteActionCompatParcelizer = textView;
        this.IconCompatParcelizer = textView2;
        this.read = textView3;
        this.AudioAttributesImplBaseParcelizer = relativeLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public MaterialCardView IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static HlsMediaPlaylistPlaylistType write(View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i = R.id.guessBulbContainer;
        RelativeLayout relativeLayout = (RelativeLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.guessBulbContainer);
        if (relativeLayout != null) {
            i = R.id.ivGuessCardBulb;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivGuessCardBulb);
            if (imageView != null) {
                i = R.id.tvGuessCardDesc;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvGuessCardDesc);
                if (textView != null) {
                    i = R.id.tvGuessCardScore;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvGuessCardScore);
                    if (textView2 != null) {
                        i = R.id.tvGuessCardTitle;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvGuessCardTitle);
                        if (textView3 != null) {
                            i = R.id.vGuessCardBackground;
                            RelativeLayout relativeLayout2 = (RelativeLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vGuessCardBackground);
                            if (relativeLayout2 != null) {
                                return new HlsMediaPlaylistPlaylistType(materialCardView, materialCardView, relativeLayout, imageView, textView, textView2, textView3, relativeLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
