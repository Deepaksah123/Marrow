package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getLoadedPlaylistDiscontinuitySequence implements getApplicationLabel {
    public final Button IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    private final LinearLayout read;
    public final Button write;

    private getLoadedPlaylistDiscontinuitySequence(LinearLayout linearLayout, TextView textView, Button button, Button button2) {
        this.read = linearLayout;
        this.RemoteActionCompatParcelizer = textView;
        this.write = button;
        this.IconCompatParcelizer = button2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.read;
    }

    public static getLoadedPlaylistDiscontinuitySequence IconCompatParcelizer(View view) {
        int i = R.id.instruction;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.instruction);
        if (textView != null) {
            i = R.id.instructionContinue;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.instructionContinue);
            if (button != null) {
                i = R.id.instructionNo;
                Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.instructionNo);
                if (button2 != null) {
                    return new getLoadedPlaylistDiscontinuitySequence((LinearLayout) view, textView, button, button2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
