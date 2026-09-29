package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createFakeTrackOutput implements getApplicationLabel {
    public final CardView AudioAttributesCompatParcelizer;
    private TextView IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    private final CardView read;
    private TextView write;

    private createFakeTrackOutput(CardView cardView, CardView cardView2, TextView textView, TextView textView2, TextView textView3) {
        this.read = cardView;
        this.AudioAttributesCompatParcelizer = cardView2;
        this.RemoteActionCompatParcelizer = textView;
        this.IconCompatParcelizer = textView2;
        this.write = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.read;
    }

    public static createFakeTrackOutput RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.item_type_qbank_schema, viewGroup, false));
    }

    private static createFakeTrackOutput read(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.tvSchemaCount;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSchemaCount);
        if (textView != null) {
            i = R.id.tvSchemaDescription;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSchemaDescription);
            if (textView2 != null) {
                i = R.id.tvSchemaTitle;
                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSchemaTitle);
                if (textView3 != null) {
                    return new createFakeTrackOutput(cardView, cardView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
