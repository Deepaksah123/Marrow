package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class containsUri implements getApplicationLabel {
    public final TextView IconCompatParcelizer;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    private final LinearLayout write;

    private containsUri(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.write = linearLayout;
        this.read = textView;
        this.IconCompatParcelizer = textView2;
        this.RemoteActionCompatParcelizer = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static containsUri IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_downloaded_video_options, viewGroup, false));
    }

    private static containsUri AudioAttributesCompatParcelizer(View view) {
        int i = R.id.tvDeleteOfflineVideo;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDeleteOfflineVideo);
        if (textView != null) {
            i = R.id.tvStreamOffline;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvStreamOffline);
            if (textView2 != null) {
                i = R.id.tvStreamOnline;
                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvStreamOnline);
                if (textView3 != null) {
                    return new containsUri((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
