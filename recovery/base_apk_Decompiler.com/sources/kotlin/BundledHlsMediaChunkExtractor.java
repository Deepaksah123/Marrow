package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class BundledHlsMediaChunkExtractor implements getApplicationLabel {
    private ConstraintLayout AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    private TextView RemoteActionCompatParcelizer;
    private final ConstraintLayout read;
    public final Button write;

    private BundledHlsMediaChunkExtractor(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.read = constraintLayout;
        this.write = button;
        this.AudioAttributesCompatParcelizer = constraintLayout2;
        this.IconCompatParcelizer = textView;
        this.RemoteActionCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.read;
    }

    public static BundledHlsMediaChunkExtractor AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_api_block_action, viewGroup, false));
    }

    private static BundledHlsMediaChunkExtractor write(View view) {
        int i = R.id.btnAction;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnAction);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.tvDescription;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDescription);
            if (textView != null) {
                i = R.id.tvTitle;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                if (textView2 != null) {
                    return new BundledHlsMediaChunkExtractor(constraintLayout, button, constraintLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
