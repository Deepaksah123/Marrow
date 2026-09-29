package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class attemptMerge implements getApplicationLabel {
    public final EditText AudioAttributesCompatParcelizer;
    public final ImageView IconCompatParcelizer;
    public final ProgressBar MediaBrowserCompatCustomActionResultReceiver;
    private final LinearLayout MediaBrowserCompatItemReceiver;
    public final CustomButton RemoteActionCompatParcelizer;
    public final CustomTextView read;
    public final TextView write;

    private attemptMerge(LinearLayout linearLayout, ImageView imageView, EditText editText, CustomButton customButton, TextView textView, CustomTextView customTextView, ProgressBar progressBar) {
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.IconCompatParcelizer = imageView;
        this.AudioAttributesCompatParcelizer = editText;
        this.RemoteActionCompatParcelizer = customButton;
        this.write = textView;
        this.read = customTextView;
        this.MediaBrowserCompatCustomActionResultReceiver = progressBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static attemptMerge IconCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater);
    }

    private static attemptMerge RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return read(layoutInflater.inflate(R.layout.dialog_add_new_coupon, (ViewGroup) null, false));
    }

    private static attemptMerge read(View view) {
        int i = R.id.action_clear;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.action_clear);
        if (imageView != null) {
            i = R.id.coupon_text_view;
            EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.coupon_text_view);
            if (editText != null) {
                i = R.id.dialog_confirmation_highlight_button;
                CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_highlight_button);
                if (customButton != null) {
                    i = R.id.dialog_confirmation_msg;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_msg);
                    if (textView != null) {
                        i = R.id.dialog_confirmation_neglect_button;
                        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_confirmation_neglect_button);
                        if (customTextView != null) {
                            i = R.id.image_loading_indicator;
                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.image_loading_indicator);
                            if (progressBar != null) {
                                return new attemptMerge((LinearLayout) view, imageView, editText, customButton, textView, customTextView, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
