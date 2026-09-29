package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getLatestPlaylistSnapshot implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplApi21Parcelizer;
    public final RecyclerView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final Button RemoteActionCompatParcelizer;
    public final CardView read;
    public final TextView write;

    private getLatestPlaylistSnapshot(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, TextView textView, TextView textView2, CardView cardView, RecyclerView recyclerView, LinearLayout linearLayout2, TextView textView3) {
        this.AudioAttributesImplApi21Parcelizer = constraintLayout;
        this.RemoteActionCompatParcelizer = button;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.write = textView;
        this.IconCompatParcelizer = textView2;
        this.read = cardView;
        this.AudioAttributesImplApi26Parcelizer = recyclerView;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout2;
        this.AudioAttributesImplBaseParcelizer = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static getLatestPlaylistSnapshot read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.layout_signup_year, viewGroup, false));
    }

    private static getLatestPlaylistSnapshot write(View view) {
        int i = R.id.btnYearNext;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnYearNext);
        if (button != null) {
            i = R.id.llMainLayout;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMainLayout);
            if (linearLayout != null) {
                i = R.id.title;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
                if (textView != null) {
                    i = R.id.tvYearDisclaimer;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvYearDisclaimer);
                    if (textView2 != null) {
                        i = R.id.yearItemContainer;
                        CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.yearItemContainer);
                        if (cardView != null) {
                            i = R.id.yearItemList;
                            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.yearItemList);
                            if (recyclerView != null) {
                                i = R.id.yearSelectSpinnerContainer;
                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.yearSelectSpinnerContainer);
                                if (linearLayout2 != null) {
                                    i = R.id.yearSelectText;
                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.yearSelectText);
                                    if (textView3 != null) {
                                        return new getLatestPlaylistSnapshot((ConstraintLayout) view, button, linearLayout, textView, textView2, cardView, recyclerView, linearLayout2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
