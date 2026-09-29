package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes5.dex */
public final class buildSegmentList implements getApplicationLabel {
    private ImageView AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    private ConstraintLayout RemoteActionCompatParcelizer;
    public final TextView read;
    public final Button write;

    private buildSegmentList(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.AudioAttributesImplBaseParcelizer = constraintLayout;
        this.write = button;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.AudioAttributesCompatParcelizer = imageView;
        this.IconCompatParcelizer = textView;
        this.read = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static buildSegmentList AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static buildSegmentList IconCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.action_required_dialog, (ViewGroup) null, false));
    }

    private static buildSegmentList RemoteActionCompatParcelizer(View view) {
        int i = R.id.button_okay;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.button_okay);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.image_icon;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.image_icon);
            if (imageView != null) {
                i = R.id.text_caption;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.text_caption);
                if (textView != null) {
                    i = R.id.text_top;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.text_top);
                    if (textView2 != null) {
                        return new buildSegmentList(constraintLayout, button, constraintLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
