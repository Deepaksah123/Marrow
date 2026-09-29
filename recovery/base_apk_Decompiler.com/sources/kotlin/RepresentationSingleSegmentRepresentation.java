package kotlin;

import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class RepresentationSingleSegmentRepresentation implements getApplicationLabel {
    public final View AudioAttributesCompatParcelizer;
    private TextInputLayout AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    private final ScrollView AudioAttributesImplBaseParcelizer;
    public final MaterialButton IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    private TextView MediaBrowserCompatSearchResultReceiver;
    private TextView MediaDescriptionCompat;
    public final ProgressBar RemoteActionCompatParcelizer;
    public final EditText read;
    public final MaterialButton write;

    private RepresentationSingleSegmentRepresentation(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, View view, EditText editText, ProgressBar progressBar, TextInputLayout textInputLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.AudioAttributesImplBaseParcelizer = scrollView;
        this.write = materialButton;
        this.IconCompatParcelizer = materialButton2;
        this.AudioAttributesCompatParcelizer = view;
        this.read = editText;
        this.RemoteActionCompatParcelizer = progressBar;
        this.AudioAttributesImplApi21Parcelizer = textInputLayout;
        this.AudioAttributesImplApi26Parcelizer = textView;
        this.MediaDescriptionCompat = textView2;
        this.MediaBrowserCompatSearchResultReceiver = textView3;
        this.MediaBrowserCompatItemReceiver = textView4;
        this.MediaBrowserCompatCustomActionResultReceiver = textView5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ScrollView IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static RepresentationSingleSegmentRepresentation RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.btnEnterCode;
            MaterialButton materialButton2 = (MaterialButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnEnterCode);
            if (materialButton2 != null) {
                i = R.id.dividerQuota;
                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.dividerQuota);
                if (viewIconCompatParcelizer != null) {
                    i = R.id.etCmShareCode;
                    EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etCmShareCode);
                    if (editText != null) {
                        i = R.id.pbCmJoin;
                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbCmJoin);
                        if (progressBar != null) {
                            i = R.id.tilEtCmShareCode;
                            TextInputLayout textInputLayout = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tilEtCmShareCode);
                            if (textInputLayout != null) {
                                i = R.id.tvCmQuota;
                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCmQuota);
                                if (textView != null) {
                                    i = R.id.tvCmShareDiagBody;
                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCmShareDiagBody);
                                    if (textView2 != null) {
                                        i = R.id.tvCmShareDiagTitle;
                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCmShareDiagTitle);
                                        if (textView3 != null) {
                                            i = R.id.tvCodeStatus;
                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCodeStatus);
                                            if (textView4 != null) {
                                                i = R.id.tvTextExpired;
                                                TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTextExpired);
                                                if (textView5 != null) {
                                                    return new RepresentationSingleSegmentRepresentation((ScrollView) view, materialButton, materialButton2, viewIconCompatParcelizer, editText, progressBar, textInputLayout, textView, textView2, textView3, textView4, textView5);
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
