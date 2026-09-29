package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomEditView;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class getInitializationUri implements getApplicationLabel {
    public final CustomEditView AudioAttributesCompatParcelizer;
    private LinearLayout AudioAttributesImplApi21Parcelizer;
    private final LinearLayout AudioAttributesImplBaseParcelizer;
    public final CustomTextView IconCompatParcelizer;
    public final CustomTextView MediaBrowserCompatCustomActionResultReceiver;
    public final CustomEditView RemoteActionCompatParcelizer;
    public final CustomTextView read;
    public final CustomButton write;

    private getInitializationUri(LinearLayout linearLayout, CustomButton customButton, CustomEditView customEditView, CustomEditView customEditView2, LinearLayout linearLayout2, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3) {
        this.AudioAttributesImplBaseParcelizer = linearLayout;
        this.write = customButton;
        this.RemoteActionCompatParcelizer = customEditView;
        this.AudioAttributesCompatParcelizer = customEditView2;
        this.AudioAttributesImplApi21Parcelizer = linearLayout2;
        this.read = customTextView;
        this.IconCompatParcelizer = customTextView2;
        this.MediaBrowserCompatCustomActionResultReceiver = customTextView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static getInitializationUri AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static getInitializationUri write(LayoutInflater layoutInflater) {
        return read(layoutInflater.inflate(R.layout.dialog_callback, (ViewGroup) null, false));
    }

    private static getInitializationUri read(View view) {
        int i = R.id.callback_button;
        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.callback_button);
        if (customButton != null) {
            i = R.id.callback_phone_number;
            CustomEditView customEditView = (CustomEditView) getApplicationIcon.IconCompatParcelizer(view, R.id.callback_phone_number);
            if (customEditView != null) {
                i = R.id.country_code;
                CustomEditView customEditView2 = (CustomEditView) getApplicationIcon.IconCompatParcelizer(view, R.id.country_code);
                if (customEditView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.slot1;
                    CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.slot1);
                    if (customTextView != null) {
                        i = R.id.slot2;
                        CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.slot2);
                        if (customTextView2 != null) {
                            i = R.id.slot3;
                            CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.slot3);
                            if (customTextView3 != null) {
                                return new getInitializationUri(linearLayout, customButton, customEditView, customEditView2, linearLayout, customTextView, customTextView2, customTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
