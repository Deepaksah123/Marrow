package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class isPublished implements getApplicationLabel {
    public final processSample AudioAttributesCompatParcelizer;
    public final buildTrackOutput AudioAttributesImplApi21Parcelizer;
    public final createBundles AudioAttributesImplApi26Parcelizer;
    private FrameLayout AudioAttributesImplBaseParcelizer;
    public final ConstraintLayout IconCompatParcelizer;
    public final Toolbar MediaBrowserCompatCustomActionResultReceiver;
    private final ConstraintLayout MediaBrowserCompatItemReceiver;
    public final ViewFlipper RemoteActionCompatParcelizer;
    public final ProgressBar read;
    public final addMediaPlaylistDataSpecs write;

    private isPublished(ConstraintLayout constraintLayout, processSample processsample, ViewFlipper viewFlipper, addMediaPlaylistDataSpecs addmediaplaylistdataspecs, FrameLayout frameLayout, ProgressBar progressBar, ConstraintLayout constraintLayout2, buildTrackOutput buildtrackoutput, createBundles createbundles, Toolbar toolbar) {
        this.MediaBrowserCompatItemReceiver = constraintLayout;
        this.AudioAttributesCompatParcelizer = processsample;
        this.RemoteActionCompatParcelizer = viewFlipper;
        this.write = addmediaplaylistdataspecs;
        this.AudioAttributesImplBaseParcelizer = frameLayout;
        this.read = progressBar;
        this.IconCompatParcelizer = constraintLayout2;
        this.AudioAttributesImplApi21Parcelizer = buildtrackoutput;
        this.AudioAttributesImplApi26Parcelizer = createbundles;
        this.MediaBrowserCompatCustomActionResultReceiver = toolbar;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static isPublished read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_sign_in, viewGroup, false));
    }

    private static isPublished AudioAttributesCompatParcelizer(View view) {
        int i = R.id.emailView;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.emailView);
        if (viewIconCompatParcelizer != null) {
            processSample processsampleIconCompatParcelizer = processSample.IconCompatParcelizer(viewIconCompatParcelizer);
            i = R.id.emailViewFlipper;
            ViewFlipper viewFlipper = (ViewFlipper) getApplicationIcon.IconCompatParcelizer(view, R.id.emailViewFlipper);
            if (viewFlipper != null) {
                i = R.id.forgotPasswordView;
                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.forgotPasswordView);
                if (viewIconCompatParcelizer2 != null) {
                    addMediaPlaylistDataSpecs addmediaplaylistdataspecs = addMediaPlaylistDataSpecs.read(viewIconCompatParcelizer2);
                    i = R.id.fragment_container;
                    FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fragment_container);
                    if (frameLayout != null) {
                        i = R.id.loadingContainer;
                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                        if (progressBar != null) {
                            i = R.id.mainLayout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.mainLayout);
                            if (constraintLayout != null) {
                                i = R.id.otpView;
                                View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.otpView);
                                if (viewIconCompatParcelizer3 != null) {
                                    buildTrackOutput buildtrackoutput = buildTrackOutput.read(viewIconCompatParcelizer3);
                                    i = R.id.passwordView;
                                    View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.passwordView);
                                    if (viewIconCompatParcelizer4 != null) {
                                        createBundles createbundlesRemoteActionCompatParcelizer = createBundles.RemoteActionCompatParcelizer(viewIconCompatParcelizer4);
                                        i = R.id.toolbar;
                                        Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                        if (toolbar != null) {
                                            return new isPublished((ConstraintLayout) view, processsampleIconCompatParcelizer, viewFlipper, addmediaplaylistdataspecs, frameLayout, progressBar, constraintLayout, buildtrackoutput, createbundlesRemoteActionCompatParcelizer, toolbar);
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
