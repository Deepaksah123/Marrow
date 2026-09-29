package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class SegmentBaseSegmentTimelineElement implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    private CardView IconCompatParcelizer;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    public final TextView read;
    private TextView write;

    private SegmentBaseSegmentTimelineElement(ConstraintLayout constraintLayout, Button button, CardView cardView, TextView textView, TextView textView2) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = button;
        this.IconCompatParcelizer = cardView;
        this.read = textView;
        this.write = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static SegmentBaseSegmentTimelineElement IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.dialog_fragment_payment_failed, viewGroup, false));
    }

    private static SegmentBaseSegmentTimelineElement RemoteActionCompatParcelizer(View view) {
        int i = R.id.btRetry;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btRetry);
        if (button != null) {
            i = R.id.cvMain;
            CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvMain);
            if (cardView != null) {
                i = R.id.tvSubTitle;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubTitle);
                if (textView != null) {
                    i = R.id.tvTitle;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                    if (textView2 != null) {
                        return new SegmentBaseSegmentTimelineElement((ConstraintLayout) view, button, cardView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
