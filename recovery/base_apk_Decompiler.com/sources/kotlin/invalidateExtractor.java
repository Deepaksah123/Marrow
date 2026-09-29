package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class invalidateExtractor implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private final FrameLayout AudioAttributesImplBaseParcelizer;
    public final ProgressBar IconCompatParcelizer;
    private LinearLayout RemoteActionCompatParcelizer;
    public final TextView read;
    public final RecyclerView write;

    private invalidateExtractor(FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, TextView textView2) {
        this.AudioAttributesImplBaseParcelizer = frameLayout;
        this.AudioAttributesCompatParcelizer = textView;
        this.RemoteActionCompatParcelizer = linearLayout;
        this.IconCompatParcelizer = progressBar;
        this.write = recyclerView;
        this.read = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static invalidateExtractor IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_select_state, viewGroup, false));
    }

    private static invalidateExtractor AudioAttributesCompatParcelizer(View view) {
        int i = R.id.description;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.description);
        if (textView != null) {
            i = R.id.llMainLayout;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llMainLayout);
            if (linearLayout != null) {
                i = R.id.loadingContainer;
                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                if (progressBar != null) {
                    i = R.id.rvCountriesStates;
                    RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvCountriesStates);
                    if (recyclerView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
                        if (textView2 != null) {
                            return new invalidateExtractor((FrameLayout) view, textView, linearLayout, progressBar, recyclerView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
