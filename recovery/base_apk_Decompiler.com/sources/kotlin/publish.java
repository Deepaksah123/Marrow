package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class publish implements getApplicationLabel {
    public final EditText AudioAttributesCompatParcelizer;
    private LinearLayout AudioAttributesImplApi26Parcelizer;
    public final Toolbar AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final ScrollView MediaBrowserCompatCustomActionResultReceiver;
    private final ConstraintLayout MediaBrowserCompatItemReceiver;
    public final Button RemoteActionCompatParcelizer;
    public final ProgressBar read;
    public final CardView write;

    private publish(ConstraintLayout constraintLayout, Button button, CardView cardView, EditText editText, LinearLayout linearLayout, ProgressBar progressBar, LinearLayout linearLayout2, ScrollView scrollView, Toolbar toolbar) {
        this.MediaBrowserCompatItemReceiver = constraintLayout;
        this.RemoteActionCompatParcelizer = button;
        this.write = cardView;
        this.AudioAttributesCompatParcelizer = editText;
        this.IconCompatParcelizer = linearLayout;
        this.read = progressBar;
        this.AudioAttributesImplApi26Parcelizer = linearLayout2;
        this.MediaBrowserCompatCustomActionResultReceiver = scrollView;
        this.AudioAttributesImplBaseParcelizer = toolbar;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static publish IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_signup_email, viewGroup, false));
    }

    private static publish AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnEmailNext;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnEmailNext);
        if (button != null) {
            i = R.id.btnSignInGoogle;
            CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSignInGoogle);
            if (cardView != null) {
                i = R.id.etEmail;
                EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etEmail);
                if (editText != null) {
                    i = R.id.llMainLayout;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMainLayout);
                    if (linearLayout != null) {
                        i = R.id.loadingContainer;
                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                        if (progressBar != null) {
                            i = R.id.orContainer;
                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.orContainer);
                            if (linearLayout2 != null) {
                                i = R.id.svMain;
                                ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.svMain);
                                if (scrollView != null) {
                                    i = R.id.toolbar;
                                    Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                    if (toolbar != null) {
                                        return new publish((ConstraintLayout) view, button, cardView, editText, linearLayout, progressBar, linearLayout2, scrollView, toolbar);
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
