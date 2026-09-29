package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getInitialStartTimeUs implements getApplicationLabel {
    private final CardView AudioAttributesCompatParcelizer;
    private CardView IconCompatParcelizer;
    public final TextView read;

    private getInitialStartTimeUs(CardView cardView, CardView cardView2, TextView textView) {
        this.AudioAttributesCompatParcelizer = cardView;
        this.IconCompatParcelizer = cardView2;
        this.read = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static getInitialStartTimeUs read(View view) {
        CardView cardView = (CardView) view;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTagLabel);
        if (textView != null) {
            return new getInitialStartTimeUs(cardView, cardView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvTagLabel)));
    }
}
