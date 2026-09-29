package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class isFmp4Variant implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    private final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final CardView AudioAttributesImplApi26Parcelizer;
    public final RadioButton AudioAttributesImplBaseParcelizer;
    public final ConstraintLayout IconCompatParcelizer;
    public final RadioButton MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final Button RemoteActionCompatParcelizer;
    public final Button read;
    public final CardView write;

    private isFmp4Variant(LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2, CardView cardView, ConstraintLayout constraintLayout, RadioButton radioButton, RadioButton radioButton2, CardView cardView2, TextView textView) {
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.read = button;
        this.RemoteActionCompatParcelizer = button2;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.write = cardView;
        this.IconCompatParcelizer = constraintLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = radioButton;
        this.AudioAttributesImplBaseParcelizer = radioButton2;
        this.AudioAttributesImplApi26Parcelizer = cardView2;
        this.MediaBrowserCompatItemReceiver = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static isFmp4Variant AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_custom_module_test_mode_selection, viewGroup, false));
    }

    private static isFmp4Variant write(View view) {
        int i = R.id.btnNext;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnNext);
        if (button != null) {
            i = R.id.btnPrevious;
            Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnPrevious);
            if (button2 != null) {
                i = R.id.container;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container);
                if (linearLayout != null) {
                    i = R.id.examCardView;
                    CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.examCardView);
                    if (cardView != null) {
                        i = R.id.llPrevNext;
                        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llPrevNext);
                        if (constraintLayout != null) {
                            i = R.id.rbExamMode;
                            RadioButton radioButton = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rbExamMode);
                            if (radioButton != null) {
                                i = R.id.rbRegularMode;
                                RadioButton radioButton2 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rbRegularMode);
                                if (radioButton2 != null) {
                                    i = R.id.regularCardView;
                                    CardView cardView2 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.regularCardView);
                                    if (cardView2 != null) {
                                        i = R.id.tvCMDisclaimer;
                                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCMDisclaimer);
                                        if (textView != null) {
                                            return new isFmp4Variant((LinearLayout) view, button, button2, linearLayout, cardView, constraintLayout, radioButton, radioButton2, cardView2, textView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
