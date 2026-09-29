package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0 implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    private ProgressBar AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final Toolbar AudioAttributesImplBaseParcelizer;
    public final RelativeLayout IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    private LinearLayout MediaBrowserCompatItemReceiver;
    private TextView MediaBrowserCompatSearchResultReceiver;
    private TextView MediaMetadataCompat;
    public final Button RemoteActionCompatParcelizer;
    public final TextView read;
    public final ScrollView write;

    private DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, ProgressBar progressBar, ConstraintLayout constraintLayout2, RelativeLayout relativeLayout, TextView textView, ScrollView scrollView, Toolbar toolbar, TextView textView2, TextView textView3, TextView textView4) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.RemoteActionCompatParcelizer = button;
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.AudioAttributesImplApi21Parcelizer = progressBar;
        this.AudioAttributesCompatParcelizer = constraintLayout2;
        this.IconCompatParcelizer = relativeLayout;
        this.read = textView;
        this.write = scrollView;
        this.AudioAttributesImplBaseParcelizer = toolbar;
        this.MediaBrowserCompatCustomActionResultReceiver = textView2;
        this.MediaMetadataCompat = textView3;
        this.MediaBrowserCompatSearchResultReceiver = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0 RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.screen_login_alternate_number, viewGroup, false));
    }

    private static DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0 write(View view) {
        int i = R.id.btnEmailLogin;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnEmailLogin);
        if (button != null) {
            i = R.id.llPhoneNumber;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llPhoneNumber);
            if (linearLayout != null) {
                i = R.id.loadingContainer;
                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                if (progressBar != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.phoneEditLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.phoneEditLayout);
                    if (relativeLayout != null) {
                        i = R.id.phone_number_view;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.phone_number_view);
                        if (textView != null) {
                            i = R.id.svMain;
                            ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.svMain);
                            if (scrollView != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                if (toolbar != null) {
                                    i = R.id.tvCreateNewAccount;
                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCreateNewAccount);
                                    if (textView2 != null) {
                                        i = R.id.tvEdit;
                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEdit);
                                        if (textView3 != null) {
                                            i = R.id.tvNewToMarrow;
                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNewToMarrow);
                                            if (textView4 != null) {
                                                return new DefaultHlsPlaylistTrackerMediaPlaylistBundleExternalSyntheticLambda0(constraintLayout, button, linearLayout, progressBar, constraintLayout, relativeLayout, textView, scrollView, toolbar, textView2, textView3, textView4);
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
