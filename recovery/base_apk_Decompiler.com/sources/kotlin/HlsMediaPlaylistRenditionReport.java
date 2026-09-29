package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPlaylistRenditionReport implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    private final LinearLayout read;

    private HlsMediaPlaylistRenditionReport(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.read = linearLayout;
        this.AudioAttributesCompatParcelizer = textView;
        this.RemoteActionCompatParcelizer = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.read;
    }

    public static HlsMediaPlaylistRenditionReport read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.view_know_more_special_revamp, viewGroup, false));
    }

    private static HlsMediaPlaylistRenditionReport read(View view) {
        int i = R.id.tvSpecialDesc;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSpecialDesc);
        if (textView != null) {
            i = R.id.tvSpecialTitle;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSpecialTitle);
            if (textView2 != null) {
                return new HlsMediaPlaylistRenditionReport((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
