package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class prepareExtraction implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    public final RecyclerView AudioAttributesImplApi21Parcelizer;
    public final ImageView AudioAttributesImplApi26Parcelizer;
    public final MaterialToolbar AudioAttributesImplBaseParcelizer;
    public final ProgressBar IconCompatParcelizer;
    public final ConstraintLayout MediaBrowserCompatCustomActionResultReceiver;
    public final RecyclerView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    private LinearLayout MediaBrowserCompatSearchResultReceiver;
    private final ConstraintLayout MediaDescriptionCompat;
    private RelativeLayout MediaMetadataCompat;
    private TextView RatingCompat;
    public final CardView RemoteActionCompatParcelizer;
    public final View read;
    public final ImageView write;

    private prepareExtraction(ConstraintLayout constraintLayout, CardView cardView, RelativeLayout relativeLayout, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, View view, ProgressBar progressBar, ConstraintLayout constraintLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, ImageView imageView3, TextView textView, MaterialToolbar materialToolbar, TextView textView2) {
        this.MediaDescriptionCompat = constraintLayout;
        this.RemoteActionCompatParcelizer = cardView;
        this.MediaMetadataCompat = relativeLayout;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout;
        this.write = imageView;
        this.AudioAttributesCompatParcelizer = imageView2;
        this.read = view;
        this.IconCompatParcelizer = progressBar;
        this.MediaBrowserCompatCustomActionResultReceiver = constraintLayout2;
        this.MediaBrowserCompatItemReceiver = recyclerView;
        this.AudioAttributesImplApi21Parcelizer = recyclerView2;
        this.AudioAttributesImplApi26Parcelizer = imageView3;
        this.RatingCompat = textView;
        this.AudioAttributesImplBaseParcelizer = materialToolbar;
        this.MediaBrowserCompatMediaItem = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public static prepareExtraction RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static prepareExtraction write(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.fragment_recent_update_list, (ViewGroup) null, false));
    }

    private static prepareExtraction RemoteActionCompatParcelizer(View view) {
        int i = R.id.cv_filters;
        CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cv_filters);
        if (cardView != null) {
            i = R.id.filterIconView;
            RelativeLayout relativeLayout = (RelativeLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.filterIconView);
            if (relativeLayout != null) {
                i = R.id.filter_tv;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.filter_tv);
                if (linearLayout != null) {
                    i = R.id.iv_filter;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_filter);
                    if (imageView != null) {
                        i = R.id.ivFilterAppliedIndicator;
                        ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivFilterAppliedIndicator);
                        if (imageView2 != null) {
                            i = R.id.no_click_view;
                            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.no_click_view);
                            if (viewIconCompatParcelizer != null) {
                                i = R.id.progress_bar_load_more;
                                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progress_bar_load_more);
                                if (progressBar != null) {
                                    i = R.id.progress_bar_main;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.progress_bar_main);
                                    if (constraintLayout != null) {
                                        i = R.id.rv_subject_list;
                                        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rv_subject_list);
                                        if (recyclerView != null) {
                                            i = R.id.rv_update_list;
                                            RecyclerView recyclerView2 = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rv_update_list);
                                            if (recyclerView2 != null) {
                                                i = R.id.tip;
                                                ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.tip);
                                                if (imageView3 != null) {
                                                    i = R.id.title;
                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
                                                    if (textView != null) {
                                                        i = R.id.toolbar;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                        if (materialToolbar != null) {
                                                            i = R.id.tv_no_data;
                                                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_no_data);
                                                            if (textView2 != null) {
                                                                return new prepareExtraction((ConstraintLayout) view, cardView, relativeLayout, linearLayout, imageView, imageView2, viewIconCompatParcelizer, progressBar, constraintLayout, recyclerView, recyclerView2, imageView3, textView, materialToolbar, textView2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
