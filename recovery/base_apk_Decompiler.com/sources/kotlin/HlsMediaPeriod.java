package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.RadarChart;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPeriod implements getApplicationLabel {
    public final ProgressBar AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final RadarChart AudioAttributesImplApi26Parcelizer;
    public final NestedScrollView AudioAttributesImplBaseParcelizer;
    public final getMediaPlaylistUrls IconCompatParcelizer;
    public final Toolbar MediaBrowserCompatCustomActionResultReceiver;
    public final RecyclerView MediaBrowserCompatItemReceiver;
    private final CoordinatorLayout MediaBrowserCompatMediaItem;
    private LinearLayout MediaBrowserCompatSearchResultReceiver;
    private CollapsingToolbarLayout MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    private CoordinatorLayout RatingCompat;
    public final HlsMultivariantPlaylist RemoteActionCompatParcelizer;
    public final Button read;
    public final AppBarLayout write;

    private HlsMediaPeriod(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, AppBarLayout appBarLayout, Button button, CollapsingToolbarLayout collapsingToolbarLayout, HlsMultivariantPlaylist hlsMultivariantPlaylist, getMediaPlaylistUrls getmediaplaylisturls, ProgressBar progressBar, RadarChart radarChart, RecyclerView recyclerView, CoordinatorLayout coordinatorLayout2, NestedScrollView nestedScrollView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.MediaBrowserCompatMediaItem = coordinatorLayout;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout;
        this.write = appBarLayout;
        this.read = button;
        this.MediaDescriptionCompat = collapsingToolbarLayout;
        this.RemoteActionCompatParcelizer = hlsMultivariantPlaylist;
        this.IconCompatParcelizer = getmediaplaylisturls;
        this.AudioAttributesCompatParcelizer = progressBar;
        this.AudioAttributesImplApi26Parcelizer = radarChart;
        this.MediaBrowserCompatItemReceiver = recyclerView;
        this.RatingCompat = coordinatorLayout2;
        this.AudioAttributesImplBaseParcelizer = nestedScrollView;
        this.MediaBrowserCompatCustomActionResultReceiver = toolbar;
        this.AudioAttributesImplApi21Parcelizer = textView;
        this.MediaMetadataCompat = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final CoordinatorLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public static HlsMediaPeriod AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_test_analytics, viewGroup, false));
    }

    private static HlsMediaPeriod AudioAttributesCompatParcelizer(View view) {
        int i = R.id.activity_score_info_container;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.activity_score_info_container);
        if (linearLayout != null) {
            i = R.id.appBar;
            AppBarLayout appBarLayout = (AppBarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.appBar);
            if (appBarLayout != null) {
                i = R.id.btSeeYourPosition;
                Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btSeeYourPosition);
                if (button != null) {
                    i = R.id.collapsibleToolbar;
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.collapsibleToolbar);
                    if (collapsingToolbarLayout != null) {
                        i = R.id.containerRank;
                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.containerRank);
                        if (viewIconCompatParcelizer != null) {
                            HlsMultivariantPlaylist hlsMultivariantPlaylist = HlsMultivariantPlaylist.read(viewIconCompatParcelizer);
                            i = R.id.containerScoreCard;
                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.containerScoreCard);
                            if (viewIconCompatParcelizer2 != null) {
                                getMediaPlaylistUrls getmediaplaylisturlsIconCompatParcelizer = getMediaPlaylistUrls.IconCompatParcelizer(viewIconCompatParcelizer2);
                                i = R.id.progress;
                                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progress);
                                if (progressBar != null) {
                                    i = R.id.radarAnalytics;
                                    RadarChart radarChart = (RadarChart) getApplicationIcon.IconCompatParcelizer(view, R.id.radarAnalytics);
                                    if (radarChart != null) {
                                        i = R.id.rlToppers;
                                        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rlToppers);
                                        if (recyclerView != null) {
                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                                            i = R.id.scroll_view;
                                            NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scroll_view);
                                            if (nestedScrollView != null) {
                                                i = R.id.toolbar;
                                                Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                if (toolbar != null) {
                                                    i = R.id.tvPerformance;
                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPerformance);
                                                    if (textView != null) {
                                                        i = R.id.tvRadarAnalyticsDesc;
                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRadarAnalyticsDesc);
                                                        if (textView2 != null) {
                                                            return new HlsMediaPeriod(coordinatorLayout, linearLayout, appBarLayout, button, collapsingToolbarLayout, hlsMultivariantPlaylist, getmediaplaylisturlsIconCompatParcelizer, progressBar, radarChart, recyclerView, coordinatorLayout, nestedScrollView, toolbar, textView, textView2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
