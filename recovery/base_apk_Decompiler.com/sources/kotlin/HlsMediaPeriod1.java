package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes5.dex */
public final class HlsMediaPeriod1 implements getApplicationLabel {
    private final NestedScrollView AudioAttributesCompatParcelizer;
    public final RecyclerView IconCompatParcelizer;
    private NestedScrollView MediaBrowserCompatItemReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final getMappedTrackOutput read;
    public final HlsDownloader write;

    private HlsMediaPeriod1(NestedScrollView nestedScrollView, TextView textView, HlsDownloader hlsDownloader, getMappedTrackOutput getmappedtrackoutput, RecyclerView recyclerView, NestedScrollView nestedScrollView2) {
        this.AudioAttributesCompatParcelizer = nestedScrollView;
        this.RemoteActionCompatParcelizer = textView;
        this.write = hlsDownloader;
        this.read = getmappedtrackoutput;
        this.IconCompatParcelizer = recyclerView;
        this.MediaBrowserCompatItemReceiver = nestedScrollView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final NestedScrollView IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static HlsMediaPeriod1 RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_video_timelines_sidesheet, viewGroup, false));
    }

    private static HlsMediaPeriod1 write(View view) {
        int i = R.id.btnExapandTimeline;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnExapandTimeline);
        if (textView != null) {
            i = R.id.header;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.header);
            if (viewIconCompatParcelizer != null) {
                HlsDownloader hlsDownloaderRemoteActionCompatParcelizer = HlsDownloader.RemoteActionCompatParcelizer(viewIconCompatParcelizer);
                i = R.id.lytActiveRecall;
                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.lytActiveRecall);
                if (viewIconCompatParcelizer2 != null) {
                    getMappedTrackOutput getmappedtrackoutputIconCompatParcelizer = getMappedTrackOutput.IconCompatParcelizer(viewIconCompatParcelizer2);
                    i = R.id.rvVideoTimelines;
                    RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvVideoTimelines);
                    if (recyclerView != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                        return new HlsMediaPeriod1(nestedScrollView, textView, hlsDownloaderRemoteActionCompatParcelizer, getmappedtrackoutputIconCompatParcelizer, recyclerView, nestedScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
