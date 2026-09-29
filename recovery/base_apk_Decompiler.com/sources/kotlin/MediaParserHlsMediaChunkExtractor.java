package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaParserHlsMediaChunkExtractor implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private LinearLayout AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    private ConstraintLayout IconCompatParcelizer;
    public final Button RemoteActionCompatParcelizer;
    public final TextView read;
    private TextView write;

    private MediaParserHlsMediaChunkExtractor(ConstraintLayout constraintLayout, TextView textView, Button button, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2, LinearLayout linearLayout) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = textView;
        this.RemoteActionCompatParcelizer = button;
        this.read = textView2;
        this.write = textView3;
        this.IconCompatParcelizer = constraintLayout2;
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static MediaParserHlsMediaChunkExtractor RemoteActionCompatParcelizer(View view) {
        int i = R.id.base_price;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.base_price);
        if (textView != null) {
            i = R.id.btnBuyNow;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnBuyNow);
            if (button != null) {
                i = R.id.discounted_price;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.discounted_price);
                if (textView2 != null) {
                    i = R.id.gst_shipping_text;
                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.gst_shipping_text);
                    if (textView3 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.price_section;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.price_section);
                        if (linearLayout != null) {
                            return new MediaParserHlsMediaChunkExtractor(constraintLayout, textView, button, textView2, textView3, constraintLayout, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
