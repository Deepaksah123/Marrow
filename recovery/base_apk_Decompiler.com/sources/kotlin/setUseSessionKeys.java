package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setUseSessionKeys implements getApplicationLabel {
    private final LinearLayout AudioAttributesCompatParcelizer;
    public final RadioButton IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    public final LinearLayout read;

    private setUseSessionKeys(LinearLayout linearLayout, TextView textView, RadioButton radioButton, LinearLayout linearLayout2) {
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.RemoteActionCompatParcelizer = textView;
        this.IconCompatParcelizer = radioButton;
        this.read = linearLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static setUseSessionKeys read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.item_radio_option, viewGroup, false));
    }

    private static setUseSessionKeys write(View view) {
        int i = R.id.label;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.label);
        if (textView != null) {
            i = R.id.radio;
            RadioButton radioButton = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.radio);
            if (radioButton != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new setUseSessionKeys(linearLayout, textView, radioButton, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
