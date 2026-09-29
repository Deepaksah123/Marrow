package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class Representation implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    public final CustomButton IconCompatParcelizer;
    private final ScrollView write;

    private Representation(ScrollView scrollView, CustomButton customButton, CustomTextView customTextView) {
        this.write = scrollView;
        this.IconCompatParcelizer = customButton;
        this.AudioAttributesCompatParcelizer = customTextView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ScrollView IconCompatParcelizer() {
        return this.write;
    }

    public static Representation AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater);
    }

    private static Representation RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.dialog_alert, (ViewGroup) null, false));
    }

    private static Representation RemoteActionCompatParcelizer(View view) {
        int i = R.id.dialog_alert_highlight_button;
        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_alert_highlight_button);
        if (customButton != null) {
            i = R.id.dialog_alert_msg;
            CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_alert_msg);
            if (customTextView != null) {
                return new Representation((ScrollView) view, customButton, customTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
