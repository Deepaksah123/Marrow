package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class excludeMediaPlaylist implements getApplicationLabel {
    private final LinearLayout AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    public final RecyclerView write;

    private excludeMediaPlaylist(LinearLayout linearLayout, TextView textView, RecyclerView recyclerView) {
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.IconCompatParcelizer = textView;
        this.write = recyclerView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static excludeMediaPlaylist AudioAttributesCompatParcelizer(View view) {
        int i = R.id.expandText;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.expandText);
        if (textView != null) {
            i = R.id.topicsRecycler;
            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.topicsRecycler);
            if (recyclerView != null) {
                return new excludeMediaPlaylist((LinearLayout) view, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
