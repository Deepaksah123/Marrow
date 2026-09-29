package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class RepresentationMultiSegmentRepresentation implements getApplicationLabel {
    public final CustomButton AudioAttributesCompatParcelizer;
    private final ScrollView AudioAttributesImplApi21Parcelizer;
    public final CustomTextView IconCompatParcelizer;
    public final ImageView RemoteActionCompatParcelizer;
    public final LinearLayout read;
    public final CustomTextView write;

    private RepresentationMultiSegmentRepresentation(ScrollView scrollView, CustomButton customButton, CustomTextView customTextView, ImageView imageView, CustomTextView customTextView2, LinearLayout linearLayout) {
        this.AudioAttributesImplApi21Parcelizer = scrollView;
        this.AudioAttributesCompatParcelizer = customButton;
        this.write = customTextView;
        this.RemoteActionCompatParcelizer = imageView;
        this.IconCompatParcelizer = customTextView2;
        this.read = linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ScrollView IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static RepresentationMultiSegmentRepresentation IconCompatParcelizer(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater);
    }

    private static RepresentationMultiSegmentRepresentation AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater.inflate(R.layout.dialog_casting_error, (ViewGroup) null, false));
    }

    private static RepresentationMultiSegmentRepresentation write(View view) {
        int i = R.id.dialog_alert_highlight_button;
        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_alert_highlight_button);
        if (customButton != null) {
            i = R.id.dialog_alert_msg;
            CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_alert_msg);
            if (customTextView != null) {
                i = R.id.dialog_casting_app_icon;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_casting_app_icon);
                if (imageView != null) {
                    i = R.id.dialog_casting_app_title;
                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_casting_app_title);
                    if (customTextView2 != null) {
                        i = R.id.ll_alert_diag_icon;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ll_alert_diag_icon);
                        if (linearLayout != null) {
                            return new RepresentationMultiSegmentRepresentation((ScrollView) view, customButton, customTextView, imageView, customTextView2, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
