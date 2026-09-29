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
public final class SingleSegmentIndex implements getApplicationLabel {
    private final ConstraintLayout AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    private TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    private CardView write;

    private SingleSegmentIndex(ConstraintLayout constraintLayout, Button button, CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.IconCompatParcelizer = button;
        this.write = cardView;
        this.read = textView;
        this.MediaBrowserCompatCustomActionResultReceiver = textView2;
        this.RemoteActionCompatParcelizer = textView3;
        this.AudioAttributesImplBaseParcelizer = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static SingleSegmentIndex RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.dialog_fragment_stay_tuned, viewGroup, false));
    }

    private static SingleSegmentIndex RemoteActionCompatParcelizer(View view) {
        int i = R.id.btNotifyMe;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btNotifyMe);
        if (button != null) {
            i = R.id.cvMain;
            CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvMain);
            if (cardView != null) {
                i = R.id.tvCancel;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCancel);
                if (textView != null) {
                    i = R.id.tvSubTitle;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubTitle);
                    if (textView2 != null) {
                        i = R.id.tvTimer;
                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTimer);
                        if (textView3 != null) {
                            i = R.id.tvTitle;
                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                            if (textView4 != null) {
                                return new SingleSegmentIndex((ConstraintLayout) view, button, cardView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
