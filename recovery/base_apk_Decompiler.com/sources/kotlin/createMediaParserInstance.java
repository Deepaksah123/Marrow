package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createMediaParserInstance implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    private TextView MediaBrowserCompatCustomActionResultReceiver;
    private TextView MediaBrowserCompatItemReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    private Guideline write;

    private createMediaParserInstance(ConstraintLayout constraintLayout, Guideline guideline, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.write = guideline;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.AudioAttributesCompatParcelizer = textView2;
        this.MediaBrowserCompatItemReceiver = textView3;
        this.IconCompatParcelizer = textView4;
        this.AudioAttributesImplApi21Parcelizer = textView5;
        this.read = textView6;
        this.MediaBrowserCompatCustomActionResultReceiver = textView7;
        this.RemoteActionCompatParcelizer = textView8;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static createMediaParserInstance write(View view) {
        int i = R.id.guideline;
        Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.guideline);
        if (guideline != null) {
            i = R.id.tvAddressLabel;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAddressLabel);
            if (textView != null) {
                i = R.id.tvAddressValue;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAddressValue);
                if (textView2 != null) {
                    i = R.id.tvAlternatePhoneLabel;
                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAlternatePhoneLabel);
                    if (textView3 != null) {
                        i = R.id.tvAlternatePhoneValue;
                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAlternatePhoneValue);
                        if (textView4 != null) {
                            i = R.id.tvEmailLabel;
                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmailLabel);
                            if (textView5 != null) {
                                i = R.id.tvEmailValue;
                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmailValue);
                                if (textView6 != null) {
                                    i = R.id.tvPhoneLabel;
                                    TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPhoneLabel);
                                    if (textView7 != null) {
                                        i = R.id.tvPhoneValue;
                                        TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPhoneValue);
                                        if (textView8 != null) {
                                            return new createMediaParserInstance((ConstraintLayout) view, guideline, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
