package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle implements getApplicationLabel {
    public final getAdjuster AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final ViewFlipper AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    private final ConstraintLayout MediaBrowserCompatCustomActionResultReceiver;
    public final Toolbar MediaBrowserCompatItemReceiver;
    public final ProgressBar RemoteActionCompatParcelizer;
    public final LinearLayout read;
    public final TimestampAdjusterProvider write;

    private lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, ProgressBar progressBar, TimestampAdjusterProvider timestampAdjusterProvider, getAdjuster getadjuster, ViewFlipper viewFlipper, Toolbar toolbar, TextView textView2, TextView textView3) {
        this.MediaBrowserCompatCustomActionResultReceiver = constraintLayout;
        this.IconCompatParcelizer = textView;
        this.read = linearLayout;
        this.RemoteActionCompatParcelizer = progressBar;
        this.write = timestampAdjusterProvider;
        this.AudioAttributesCompatParcelizer = getadjuster;
        this.AudioAttributesImplBaseParcelizer = viewFlipper;
        this.MediaBrowserCompatItemReceiver = toolbar;
        this.AudioAttributesImplApi21Parcelizer = textView2;
        this.AudioAttributesImplApi26Parcelizer = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.screen_login_phone, viewGroup, false));
    }

    private static lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnRequestWhatsappOtp;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnRequestWhatsappOtp);
        if (textView != null) {
            i = R.id.llWhatsappOtp;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llWhatsappOtp);
            if (linearLayout != null) {
                i = R.id.loadingContainer;
                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                if (progressBar != null) {
                    i = R.id.phoneNumberLayout;
                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.phoneNumberLayout);
                    if (viewIconCompatParcelizer != null) {
                        TimestampAdjusterProvider timestampAdjusterProvider = TimestampAdjusterProvider.read(viewIconCompatParcelizer);
                        i = R.id.phoneOtpLayout;
                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.phoneOtpLayout);
                        if (viewIconCompatParcelizer2 != null) {
                            getAdjuster getadjusterIconCompatParcelizer = getAdjuster.IconCompatParcelizer(viewIconCompatParcelizer2);
                            i = R.id.phoneViewFlipper;
                            ViewFlipper viewFlipper = (ViewFlipper) getApplicationIcon.IconCompatParcelizer(view, R.id.phoneViewFlipper);
                            if (viewFlipper != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                if (toolbar != null) {
                                    i = R.id.tvSmsNotReceived;
                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSmsNotReceived);
                                    if (textView2 != null) {
                                        i = R.id.tvWhatsAppOtpDeliveredMessage;
                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvWhatsAppOtpDeliveredMessage);
                                        if (textView3 != null) {
                                            return new lambdaloadPlaylistInternal0comgoogleandroidexoplayer2sourcehlsplaylistDefaultHlsPlaylistTrackerMediaPlaylistBundle((ConstraintLayout) view, textView, linearLayout, progressBar, timestampAdjusterProvider, getadjusterIconCompatParcelizer, viewFlipper, toolbar, textView2, textView3);
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
