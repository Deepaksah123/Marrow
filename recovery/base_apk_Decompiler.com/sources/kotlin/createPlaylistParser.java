package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createPlaylistParser implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    private final FrameLayout MediaBrowserCompatItemReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final Button read;
    public final LinearLayout write;

    private createPlaylistParser(FrameLayout frameLayout, Button button, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.MediaBrowserCompatItemReceiver = frameLayout;
        this.read = button;
        this.IconCompatParcelizer = linearLayout;
        this.write = linearLayout2;
        this.AudioAttributesCompatParcelizer = textView;
        this.RemoteActionCompatParcelizer = textView2;
        this.AudioAttributesImplBaseParcelizer = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static createPlaylistParser IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.layout_signup_college, viewGroup, false));
    }

    private static createPlaylistParser IconCompatParcelizer(View view) {
        int i = R.id.btnConfirmCollege;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnConfirmCollege);
        if (button != null) {
            i = R.id.llMainLayout;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMainLayout);
            if (linearLayout != null) {
                i = R.id.llSelectCollege;
                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llSelectCollege);
                if (linearLayout2 != null) {
                    i = R.id.title;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
                    if (textView != null) {
                        i = R.id.tvCollegeChangeDisclaimer;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCollegeChangeDisclaimer);
                        if (textView2 != null) {
                            i = R.id.tvSelectedCollege;
                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSelectedCollege);
                            if (textView3 != null) {
                                return new createPlaylistParser((FrameLayout) view, button, linearLayout, linearLayout2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
