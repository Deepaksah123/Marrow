package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.mikephil.charting.charts.PieChart;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPlaylistServerControl implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    private View MediaBrowserCompatSearchResultReceiver;
    private final LinearLayout MediaDescriptionCompat;
    private View RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    public final PieChart write;

    private HlsMediaPlaylistServerControl(LinearLayout linearLayout, TextView textView, View view, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView2, PieChart pieChart, TextView textView3, TextView textView4, View view2, TextView textView5, TextView textView6, TextView textView7) {
        this.MediaDescriptionCompat = linearLayout;
        this.read = textView;
        this.RatingCompat = view;
        this.IconCompatParcelizer = linearLayout2;
        this.AudioAttributesCompatParcelizer = linearLayout3;
        this.RemoteActionCompatParcelizer = textView2;
        this.write = pieChart;
        this.AudioAttributesImplApi21Parcelizer = textView3;
        this.AudioAttributesImplApi26Parcelizer = textView4;
        this.MediaBrowserCompatSearchResultReceiver = view2;
        this.MediaBrowserCompatCustomActionResultReceiver = textView5;
        this.MediaBrowserCompatItemReceiver = textView6;
        this.AudioAttributesImplBaseParcelizer = textView7;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public static HlsMediaPlaylistServerControl RemoteActionCompatParcelizer(View view) {
        int i = R.id.attemptedModuleCount;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.attemptedModuleCount);
        if (textView != null) {
            i = R.id.bottomDivider;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.bottomDivider);
            if (viewIconCompatParcelizer != null) {
                i = R.id.llModuleChart;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llModuleChart);
                if (linearLayout != null) {
                    i = R.id.llModuleStats;
                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llModuleStats);
                    if (linearLayout2 != null) {
                        i = R.id.mcqCountForRevision;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.mcqCountForRevision);
                        if (textView2 != null) {
                            i = R.id.pieChartModuleScore;
                            PieChart pieChart = (PieChart) getApplicationIcon.IconCompatParcelizer(view, R.id.pieChartModuleScore);
                            if (pieChart != null) {
                                i = R.id.revisedMcqCount;
                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.revisedMcqCount);
                                if (textView3 != null) {
                                    i = R.id.statsHeader;
                                    TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.statsHeader);
                                    if (textView4 != null) {
                                        i = R.id.topDivider;
                                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.topDivider);
                                        if (viewIconCompatParcelizer2 != null) {
                                            i = R.id.tvNeedsRevisionMcqCount;
                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNeedsRevisionMcqCount);
                                            if (textView5 != null) {
                                                i = R.id.tvRevisedMcqCount;
                                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRevisedMcqCount);
                                                if (textView6 != null) {
                                                    i = R.id.tvTotalMcqCount;
                                                    TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTotalMcqCount);
                                                    if (textView7 != null) {
                                                        return new HlsMediaPlaylistServerControl((LinearLayout) view, textView, viewIconCompatParcelizer, linearLayout, linearLayout2, textView2, pieChart, textView3, textView4, viewIconCompatParcelizer2, textView5, textView6, textView7);
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
