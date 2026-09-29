package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class canDiscardUpstreamMediaChunksFromIndex implements getApplicationLabel {
    private final LinearLayout AudioAttributesCompatParcelizer;
    private View IconCompatParcelizer;

    private canDiscardUpstreamMediaChunksFromIndex(LinearLayout linearLayout, View view) {
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.IconCompatParcelizer = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static canDiscardUpstreamMediaChunksFromIndex IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.item_type_qbank_divider, viewGroup, false));
    }

    private static canDiscardUpstreamMediaChunksFromIndex IconCompatParcelizer(View view) {
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.dvHeader);
        if (viewIconCompatParcelizer != null) {
            return new canDiscardUpstreamMediaChunksFromIndex((LinearLayout) view, viewIconCompatParcelizer);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.dvHeader)));
    }
}
