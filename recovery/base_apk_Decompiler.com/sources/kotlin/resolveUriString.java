package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class resolveUriString implements getApplicationLabel {
    private final CardView IconCompatParcelizer;
    private RecyclerView RemoteActionCompatParcelizer;
    public final CardView read;
    private TextView write;

    private resolveUriString(CardView cardView, RecyclerView recyclerView, CardView cardView2, TextView textView) {
        this.IconCompatParcelizer = cardView;
        this.RemoteActionCompatParcelizer = recyclerView;
        this.read = cardView2;
        this.write = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public CardView IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static resolveUriString AudioAttributesCompatParcelizer(View view) {
        int i = R.id.rlPreviousNeetRanges;
        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rlPreviousNeetRanges);
        if (recyclerView != null) {
            CardView cardView = (CardView) view;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPreviousNeetDescription);
            if (textView != null) {
                return new resolveUriString(cardView, recyclerView, cardView, textView);
            }
            i = R.id.tvPreviousNeetDescription;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
