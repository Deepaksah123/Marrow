package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FilteringHlsPlaylistParserFactory implements getApplicationLabel {
    private final LinearLayout AudioAttributesCompatParcelizer;
    public final LinearLayout IconCompatParcelizer;

    private FilteringHlsPlaylistParserFactory(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.IconCompatParcelizer = linearLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static FilteringHlsPlaylistParserFactory read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.view_analytics_expand_list, viewGroup, false));
    }

    private static FilteringHlsPlaylistParserFactory write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new FilteringHlsPlaylistParserFactory(linearLayout, linearLayout);
    }
}
