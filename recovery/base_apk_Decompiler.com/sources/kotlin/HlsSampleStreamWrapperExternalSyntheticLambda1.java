package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsSampleStreamWrapperExternalSyntheticLambda1 implements getApplicationLabel {
    public final MaterialCardView AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi21Parcelizer;
    public final TextView IconCompatParcelizer;
    private final MaterialCardView RemoteActionCompatParcelizer;
    public final ProgressBar read;
    private ImageView write;

    private HlsSampleStreamWrapperExternalSyntheticLambda1(MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.RemoteActionCompatParcelizer = materialCardView;
        this.AudioAttributesCompatParcelizer = materialCardView2;
        this.write = imageView;
        this.read = progressBar;
        this.AudioAttributesImplApi21Parcelizer = textView;
        this.IconCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final MaterialCardView IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static HlsSampleStreamWrapperExternalSyntheticLambda1 read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.layout_hc_pearl, viewGroup, false));
    }

    private static HlsSampleStreamWrapperExternalSyntheticLambda1 RemoteActionCompatParcelizer(View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i = R.id.ivPearl;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPearl);
        if (imageView != null) {
            i = R.id.pbPearlSync;
            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbPearlSync);
            if (progressBar != null) {
                i = R.id.tvPearls;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPearls);
                if (textView != null) {
                    i = R.id.tvPearlsCount;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPearlsCount);
                    if (textView2 != null) {
                        return new HlsSampleStreamWrapperExternalSyntheticLambda1(materialCardView, materialCardView, imageView, progressBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
