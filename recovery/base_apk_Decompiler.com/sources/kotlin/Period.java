package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes.dex */
public final class Period implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi26Parcelizer;
    private TextView IconCompatParcelizer;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    private ImageView read;
    private ConstraintLayout write;

    private Period(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = button;
        this.write = constraintLayout2;
        this.read = imageView;
        this.IconCompatParcelizer = textView;
        this.AudioAttributesImplApi26Parcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static Period IconCompatParcelizer(View view) {
        int i = R.id.btnVerifyKyc;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnVerifyKyc);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.imgIcon;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgIcon);
            if (imageView != null) {
                i = R.id.tvKyc;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKyc);
                if (textView != null) {
                    i = R.id.tvKycSubText;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycSubText);
                    if (textView2 != null) {
                        return new Period(constraintLayout, button, constraintLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
