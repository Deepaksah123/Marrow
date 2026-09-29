package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class Aes128DataSource implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    private final ScrollView IconCompatParcelizer;
    private CustomTextView RemoteActionCompatParcelizer;
    public final CustomButton read;
    public final CustomButton write;

    private Aes128DataSource(ScrollView scrollView, CustomTextView customTextView, CustomButton customButton, CustomButton customButton2, CustomTextView customTextView2) {
        this.IconCompatParcelizer = scrollView;
        this.AudioAttributesCompatParcelizer = customTextView;
        this.read = customButton;
        this.write = customButton2;
        this.RemoteActionCompatParcelizer = customTextView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ScrollView IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static Aes128DataSource write(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater);
    }

    private static Aes128DataSource AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.dialog_show_pro, (ViewGroup) null, false));
    }

    private static Aes128DataSource IconCompatParcelizer(View view) {
        int i = R.id.btnDismiss;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnDismiss);
        if (customTextView != null) {
            i = R.id.btnLearnMore;
            CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnLearnMore);
            if (customButton != null) {
                i = R.id.btnViewPlans;
                CustomButton customButton2 = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnViewPlans);
                if (customButton2 != null) {
                    i = R.id.dialog_msg;
                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_msg);
                    if (customTextView2 != null) {
                        return new Aes128DataSource((ScrollView) view, customTextView, customButton, customButton2, customTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
