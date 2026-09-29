package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaSource1 implements getApplicationLabel {
    public final CardView AudioAttributesCompatParcelizer;
    private final LinearLayout IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;

    private HlsMediaSource1(LinearLayout linearLayout, CardView cardView, TextView textView, TextView textView2) {
        this.IconCompatParcelizer = linearLayout;
        this.AudioAttributesCompatParcelizer = cardView;
        this.RemoteActionCompatParcelizer = textView;
        this.read = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static HlsMediaSource1 AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.item_calendar_child, viewGroup, false));
    }

    private static HlsMediaSource1 read(View view) {
        int i = R.id.card;
        CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.card);
        if (cardView != null) {
            i = R.id.date;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.date);
            if (textView != null) {
                i = R.id.moduleCompleted;
                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.moduleCompleted);
                if (textView2 != null) {
                    return new HlsMediaSource1((LinearLayout) view, cardView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
