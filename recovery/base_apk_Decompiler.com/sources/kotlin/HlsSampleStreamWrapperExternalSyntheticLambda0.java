package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsSampleStreamWrapperExternalSyntheticLambda0 implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private final CardView AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    private ImageView RemoteActionCompatParcelizer;
    public final TextView read;
    public final CardView write;

    private HlsSampleStreamWrapperExternalSyntheticLambda0(CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.AudioAttributesImplBaseParcelizer = cardView;
        this.write = cardView2;
        this.IconCompatParcelizer = imageView;
        this.RemoteActionCompatParcelizer = imageView2;
        this.read = textView;
        this.AudioAttributesCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static HlsSampleStreamWrapperExternalSyntheticLambda0 RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.layout_hc_plan_upgrade_card_m2, viewGroup, false));
    }

    private static HlsSampleStreamWrapperExternalSyntheticLambda0 write(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.ivClose;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivClose);
        if (imageView != null) {
            i = R.id.ivPlanUpgrade;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPlanUpgrade);
            if (imageView2 != null) {
                i = R.id.tvUpgradeDescription;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvUpgradeDescription);
                if (textView != null) {
                    i = R.id.tvUpgradeTitle;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvUpgradeTitle);
                    if (textView2 != null) {
                        return new HlsSampleStreamWrapperExternalSyntheticLambda0(cardView, cardView, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
