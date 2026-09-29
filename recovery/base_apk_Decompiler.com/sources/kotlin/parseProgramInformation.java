package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseProgramInformation implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplBaseParcelizer;
    public final Toolbar IconCompatParcelizer;
    private TextView MediaBrowserCompatItemReceiver;
    public final LinearLayout RemoteActionCompatParcelizer;
    public final ProgressBar read;
    public final FrameLayout write;

    private parseProgramInformation(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, LinearLayout linearLayout, ProgressBar progressBar, Toolbar toolbar, TextView textView) {
        this.AudioAttributesImplBaseParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = button;
        this.write = frameLayout;
        this.RemoteActionCompatParcelizer = linearLayout;
        this.read = progressBar;
        this.IconCompatParcelizer = toolbar;
        this.MediaBrowserCompatItemReceiver = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static parseProgramInformation read(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static parseProgramInformation write(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.activity_notes_purchase, (ViewGroup) null, false));
    }

    private static parseProgramInformation IconCompatParcelizer(View view) {
        int i = R.id.btnRetry;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnRetry);
        if (button != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container);
            if (frameLayout != null) {
                i = R.id.llErrorContainer;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llErrorContainer);
                if (linearLayout != null) {
                    i = R.id.pbLoader;
                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbLoader);
                    if (progressBar != null) {
                        i = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                        if (toolbar != null) {
                            i = R.id.tvErrorMessage;
                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvErrorMessage);
                            if (textView != null) {
                                return new parseProgramInformation((ConstraintLayout) view, button, frameLayout, linearLayout, progressBar, toolbar, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
