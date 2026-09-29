package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeExcludeTrack implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final HlsDownloader RemoteActionCompatParcelizer;
    public final RecyclerView read;
    private final LinearLayout write;

    private maybeExcludeTrack(LinearLayout linearLayout, HlsDownloader hlsDownloader, RecyclerView recyclerView, LinearLayout linearLayout2) {
        this.write = linearLayout;
        this.RemoteActionCompatParcelizer = hlsDownloader;
        this.read = recyclerView;
        this.AudioAttributesCompatParcelizer = linearLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static maybeExcludeTrack write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_option_sheet, viewGroup, false));
    }

    private static maybeExcludeTrack AudioAttributesCompatParcelizer(View view) {
        int i = R.id.header;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.header);
        if (viewIconCompatParcelizer != null) {
            HlsDownloader hlsDownloaderRemoteActionCompatParcelizer = HlsDownloader.RemoteActionCompatParcelizer(viewIconCompatParcelizer);
            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.list);
            if (recyclerView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new maybeExcludeTrack(linearLayout, hlsDownloaderRemoteActionCompatParcelizer, recyclerView, linearLayout);
            }
            i = R.id.list;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
