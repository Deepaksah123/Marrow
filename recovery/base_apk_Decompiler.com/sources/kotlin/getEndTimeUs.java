package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getEndTimeUs implements getApplicationLabel {
    public final FrameLayout AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    private ConstraintLayout MediaBrowserCompatItemReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final ImageView read;
    public final CardView write;

    private getEndTimeUs(ConstraintLayout constraintLayout, Button button, CardView cardView, FrameLayout frameLayout, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.IconCompatParcelizer = button;
        this.write = cardView;
        this.AudioAttributesCompatParcelizer = frameLayout;
        this.read = imageView;
        this.MediaBrowserCompatItemReceiver = constraintLayout2;
        this.RemoteActionCompatParcelizer = textView;
        this.AudioAttributesImplBaseParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static getEndTimeUs RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnInternModeToolTipDone;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnInternModeToolTipDone);
        if (button != null) {
            i = R.id.cardInternModeTooltip;
            CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cardInternModeTooltip);
            if (cardView != null) {
                i = R.id.container;
                FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container);
                if (frameLayout != null) {
                    i = R.id.ivTooltip;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivTooltip);
                    if (imageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.tvLearnMore;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLearnMore);
                        if (textView != null) {
                            i = R.id.txtToolTipBody;
                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtToolTipBody);
                            if (textView2 != null) {
                                return new getEndTimeUs(constraintLayout, button, cardView, frameLayout, imageView, constraintLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
