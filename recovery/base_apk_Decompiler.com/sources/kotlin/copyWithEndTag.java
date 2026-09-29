package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class copyWithEndTag implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    private TextView IconCompatParcelizer;
    private final FrameLayout RemoteActionCompatParcelizer;
    public final FrameLayout read;
    private TextView write;

    private copyWithEndTag(FrameLayout frameLayout, TextView textView, Button button, TextView textView2, FrameLayout frameLayout2) {
        this.RemoteActionCompatParcelizer = frameLayout;
        this.write = textView;
        this.AudioAttributesCompatParcelizer = button;
        this.IconCompatParcelizer = textView2;
        this.read = frameLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public FrameLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static copyWithEndTag write(View view) {
        int i = R.id.tool_tip_body;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tool_tip_body);
        if (textView != null) {
            i = R.id.tool_tip_done;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.tool_tip_done);
            if (button != null) {
                i = R.id.tool_tip_title;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tool_tip_title);
                if (textView2 != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    return new copyWithEndTag(frameLayout, textView, button, textView2, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
