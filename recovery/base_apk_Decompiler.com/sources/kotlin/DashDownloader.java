package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DashDownloader implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final TextInputLayout AudioAttributesImplApi26Parcelizer;
    public final Button AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    private final ScrollView MediaBrowserCompatSearchResultReceiver;
    private TextView MediaDescriptionCompat;
    private LinearLayout MediaMetadataCompat;
    public final LinearLayout RemoteActionCompatParcelizer;
    public final TextView read;
    public final TextInputEditText write;

    private DashDownloader(ScrollView scrollView, TextView textView, TextView textView2, LinearLayout linearLayout, TextInputEditText textInputEditText, LinearLayout linearLayout2, TextView textView3, TextView textView4, Button button, TextView textView5, TextInputLayout textInputLayout, TextView textView6, TextView textView7) {
        this.MediaBrowserCompatSearchResultReceiver = scrollView;
        this.AudioAttributesCompatParcelizer = textView;
        this.read = textView2;
        this.MediaMetadataCompat = linearLayout;
        this.write = textInputEditText;
        this.RemoteActionCompatParcelizer = linearLayout2;
        this.IconCompatParcelizer = textView3;
        this.AudioAttributesImplApi21Parcelizer = textView4;
        this.AudioAttributesImplBaseParcelizer = button;
        this.MediaBrowserCompatCustomActionResultReceiver = textView5;
        this.AudioAttributesImplApi26Parcelizer = textInputLayout;
        this.MediaDescriptionCompat = textView6;
        this.MediaBrowserCompatItemReceiver = textView7;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public static DashDownloader RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnRequestWhatsappOtp;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnRequestWhatsappOtp);
        if (textView != null) {
            i = R.id.changeNumber;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.changeNumber);
            if (textView2 != null) {
                i = R.id.dialog_root;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_root);
                if (linearLayout != null) {
                    i = R.id.etOtp1;
                    TextInputEditText textInputEditText = (TextInputEditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etOtp1);
                    if (textInputEditText != null) {
                        i = R.id.llWhatsappOtp;
                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llWhatsappOtp);
                        if (linearLayout2 != null) {
                            i = R.id.opt2Title;
                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.opt2Title);
                            if (textView3 != null) {
                                i = R.id.phoneNumberInfoView;
                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.phoneNumberInfoView);
                                if (textView4 != null) {
                                    i = R.id.submit_button;
                                    Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.submit_button);
                                    if (button != null) {
                                        i = R.id.timerCallbackView;
                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.timerCallbackView);
                                        if (textView5 != null) {
                                            i = R.id.tlOtp1;
                                            TextInputLayout textInputLayout = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tlOtp1);
                                            if (textInputLayout != null) {
                                                i = R.id.tvSmsNotReceived;
                                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSmsNotReceived);
                                                if (textView6 != null) {
                                                    i = R.id.tvWhatsappOtpStatus;
                                                    TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvWhatsappOtpStatus);
                                                    if (textView7 != null) {
                                                        return new DashDownloader((ScrollView) view, textView, textView2, linearLayout, textInputEditText, linearLayout2, textView3, textView4, button, textView5, textInputLayout, textView6, textView7);
                                                    }
                                                }
                                            }
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
