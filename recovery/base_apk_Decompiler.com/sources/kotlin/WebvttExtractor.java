package kotlin;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttExtractor implements getApplicationLabel {
    private final ConstraintLayout AudioAttributesCompatParcelizer;
    public final TextView read;
    public final RecyclerView write;

    private WebvttExtractor(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView) {
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.write = recyclerView;
        this.read = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static WebvttExtractor IconCompatParcelizer(View view) {
        int i = R.id.rv_related_modules;
        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rv_related_modules);
        if (recyclerView != null) {
            i = R.id.tv_label;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_label);
            if (textView != null) {
                return new WebvttExtractor((ConstraintLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
