package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class emsgContainsExpectedWrappedFormat implements getApplicationLabel {
    private ConstraintLayout AudioAttributesCompatParcelizer;
    private final CardView IconCompatParcelizer;
    public final ImageView RemoteActionCompatParcelizer;
    public final TextView read;
    public final LinearLayout write;

    private emsgContainsExpectedWrappedFormat(CardView cardView, ImageView imageView, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView) {
        this.IconCompatParcelizer = cardView;
        this.RemoteActionCompatParcelizer = imageView;
        this.write = linearLayout;
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.read = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static emsgContainsExpectedWrappedFormat RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.layout_know_more_promo_card_revamp, viewGroup, false));
    }

    private static emsgContainsExpectedWrappedFormat IconCompatParcelizer(View view) {
        int i = R.id.icPromo;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.icPromo);
        if (imageView != null) {
            i = R.id.llPointsContainer;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llPointsContainer);
            if (linearLayout != null) {
                i = R.id.llPromoContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llPromoContainer);
                if (constraintLayout != null) {
                    i = R.id.tvPromoTitle;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPromoTitle);
                    if (textView != null) {
                        return new emsgContainsExpectedWrappedFormat((CardView) view, imageView, linearLayout, constraintLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
