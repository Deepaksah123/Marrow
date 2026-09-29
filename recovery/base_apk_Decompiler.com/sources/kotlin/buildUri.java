package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildUri implements getApplicationLabel {
    public final MaterialAutoCompleteTextView AudioAttributesCompatParcelizer;
    public final EditText AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    private final LinearLayout RatingCompat;
    public final LinearLayout RemoteActionCompatParcelizer;
    public final EditText read;
    public final TextView write;

    private buildUri(LinearLayout linearLayout, MaterialAutoCompleteTextView materialAutoCompleteTextView, LinearLayout linearLayout2, Button button, EditText editText, TextView textView, EditText editText2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6) {
        this.RatingCompat = linearLayout;
        this.AudioAttributesCompatParcelizer = materialAutoCompleteTextView;
        this.RemoteActionCompatParcelizer = linearLayout2;
        this.IconCompatParcelizer = button;
        this.read = editText;
        this.write = textView;
        this.AudioAttributesImplApi21Parcelizer = editText2;
        this.AudioAttributesImplApi26Parcelizer = linearLayout3;
        this.MediaBrowserCompatItemReceiver = linearLayout4;
        this.AudioAttributesImplBaseParcelizer = linearLayout5;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout6;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public static buildUri RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.dialog_server_selection_m2, viewGroup, false));
    }

    private static buildUri read(View view) {
        int i = R.id.autoServerSelection;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.autoServerSelection);
        if (materialAutoCompleteTextView != null) {
            i = R.id.baseUrlContainer;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.baseUrlContainer);
            if (linearLayout != null) {
                i = R.id.btnConfirm;
                Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnConfirm);
                if (button != null) {
                    i = R.id.etEndPoint;
                    EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etEndPoint);
                    if (editText != null) {
                        i = R.id.etPortNum;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.etPortNum);
                        if (textView != null) {
                            i = R.id.etScheme;
                            EditText editText2 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etScheme);
                            if (editText2 != null) {
                                i = R.id.llManualSelectionContainer;
                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llManualSelectionContainer);
                                if (linearLayout2 != null) {
                                    i = R.id.portContainer;
                                    LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.portContainer);
                                    if (linearLayout3 != null) {
                                        i = R.id.schemeContainer;
                                        LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.schemeContainer);
                                        if (linearLayout4 != null) {
                                            i = R.id.serverSelectionContainer;
                                            LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.serverSelectionContainer);
                                            if (linearLayout5 != null) {
                                                return new buildUri((LinearLayout) view, materialAutoCompleteTextView, linearLayout, button, editText, textView, editText2, linearLayout2, linearLayout3, linearLayout4, linearLayout5);
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
