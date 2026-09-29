package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class recreate implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    private final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final ImageButton RemoteActionCompatParcelizer;
    public final EditText read;
    public final Button write;

    private recreate(LinearLayout linearLayout, ImageButton imageButton, Button button, TextView textView, EditText editText, LinearLayout linearLayout2, TextView textView2) {
        this.AudioAttributesImplApi26Parcelizer = linearLayout;
        this.RemoteActionCompatParcelizer = imageButton;
        this.write = button;
        this.AudioAttributesCompatParcelizer = textView;
        this.read = editText;
        this.IconCompatParcelizer = linearLayout2;
        this.AudioAttributesImplApi21Parcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static recreate read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_additional_feedback, viewGroup, false));
    }

    private static recreate write(View view) {
        int i = R.id.btnBackAdditionalFeedback;
        ImageButton imageButton = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnBackAdditionalFeedback);
        if (imageButton != null) {
            i = R.id.btnSubmitAdditionalFeedback;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSubmitAdditionalFeedback);
            if (button != null) {
                i = R.id.character_count_text;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.character_count_text);
                if (textView != null) {
                    i = R.id.etAdditionalFeedback;
                    EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etAdditionalFeedback);
                    if (editText != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = R.id.tvAdditionalFeedbackHeader;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAdditionalFeedbackHeader);
                        if (textView2 != null) {
                            return new recreate(linearLayout, imageButton, button, textView, editText, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
