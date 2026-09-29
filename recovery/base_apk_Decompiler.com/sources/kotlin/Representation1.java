package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class Representation1 implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private ConstraintLayout IconCompatParcelizer;
    private final ConstraintLayout MediaBrowserCompatItemReceiver;
    public final CustomButton RemoteActionCompatParcelizer;
    public final ImageView read;
    private CustomTextView write;

    private Representation1(ConstraintLayout constraintLayout, CustomTextView customTextView, CustomButton customButton, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView) {
        this.MediaBrowserCompatItemReceiver = constraintLayout;
        this.write = customTextView;
        this.RemoteActionCompatParcelizer = customButton;
        this.IconCompatParcelizer = constraintLayout2;
        this.read = imageView;
        this.AudioAttributesCompatParcelizer = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static Representation1 read(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static Representation1 IconCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.dialog_bookmark_deleted_popup, (ViewGroup) null, false));
    }

    private static Representation1 RemoteActionCompatParcelizer(View view) {
        int i = R.id.body;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.body);
        if (customTextView != null) {
            i = R.id.btnGotIt;
            CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnGotIt);
            if (customButton != null) {
                i = R.id.dialog_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_container);
                if (constraintLayout != null) {
                    i = R.id.imgCloseDiag;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgCloseDiag);
                    if (imageView != null) {
                        i = R.id.title;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
                        if (textView != null) {
                            return new Representation1((ConstraintLayout) view, customTextView, customButton, constraintLayout, imageView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
