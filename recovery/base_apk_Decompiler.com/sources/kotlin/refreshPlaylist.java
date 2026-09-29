package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class refreshPlaylist implements getApplicationLabel {
    private CardView AudioAttributesCompatParcelizer;
    private ImageView IconCompatParcelizer;
    public final Button RemoteActionCompatParcelizer;
    private final ConstraintLayout read;
    private TextView write;

    private refreshPlaylist(ConstraintLayout constraintLayout, Button button, CardView cardView, ImageView imageView, TextView textView) {
        this.read = constraintLayout;
        this.RemoteActionCompatParcelizer = button;
        this.AudioAttributesCompatParcelizer = cardView;
        this.IconCompatParcelizer = imageView;
        this.write = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.read;
    }

    public static refreshPlaylist write(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater);
    }

    private static refreshPlaylist AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.popup_magic_module, (ViewGroup) null, false));
    }

    private static refreshPlaylist RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnMagicModuleToolTipDone;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnMagicModuleToolTipDone);
        if (button != null) {
            i = R.id.cv_magic_module_popup;
            CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cv_magic_module_popup);
            if (cardView != null) {
                i = R.id.ivTooltip;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivTooltip);
                if (imageView != null) {
                    i = R.id.txtToolTipTitle;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.txtToolTipTitle);
                    if (textView != null) {
                        return new refreshPlaylist((ConstraintLayout) view, button, cardView, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
