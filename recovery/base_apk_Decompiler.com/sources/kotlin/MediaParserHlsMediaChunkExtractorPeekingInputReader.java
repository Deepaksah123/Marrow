package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaParserHlsMediaChunkExtractorPeekingInputReader implements getApplicationLabel {
    public final Button IconCompatParcelizer;
    public final TextView read;
    private final ConstraintLayout write;

    private MediaParserHlsMediaChunkExtractorPeekingInputReader(ConstraintLayout constraintLayout, Button button, TextView textView) {
        this.write = constraintLayout;
        this.IconCompatParcelizer = button;
        this.read = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.write;
    }

    public static MediaParserHlsMediaChunkExtractorPeekingInputReader write(View view) {
        int i = R.id.btn_track_order;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btn_track_order);
        if (button != null) {
            i = R.id.tv_message;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_message);
            if (textView != null) {
                return new MediaParserHlsMediaChunkExtractorPeekingInputReader((ConstraintLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
