package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildDataSource implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    public final RecyclerView AudioAttributesImplApi21Parcelizer;
    public final ProgressBar AudioAttributesImplApi26Parcelizer;
    public final RecyclerView AudioAttributesImplBaseParcelizer;
    public final createTrackGroupArrayWithDrmInfo IconCompatParcelizer;
    public final TabLayout MediaBrowserCompatCustomActionResultReceiver;
    public final RecyclerView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    private TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final View MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final ConstraintLayout RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    private ImageView handleMediaPlayPauseIfPendingOnHandler;
    private ConstraintLayout onAddQueueItem;
    private TextView onCommand;
    private final ConstraintLayout onCustomAction;
    public final LinearLayoutCompat read;
    public final ImageView write;

    private buildDataSource(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, LinearLayoutCompat linearLayoutCompat, createTrackGroupArrayWithDrmInfo createtrackgrouparraywithdrminfo, ProgressBar progressBar, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, TabLayout tabLayout, ConstraintLayout constraintLayout4, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view) {
        this.onCustomAction = constraintLayout;
        this.onAddQueueItem = constraintLayout2;
        this.RemoteActionCompatParcelizer = constraintLayout3;
        this.AudioAttributesCompatParcelizer = imageView;
        this.write = imageView2;
        this.handleMediaPlayPauseIfPendingOnHandler = imageView3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView;
        this.read = linearLayoutCompat;
        this.IconCompatParcelizer = createtrackgrouparraywithdrminfo;
        this.AudioAttributesImplApi26Parcelizer = progressBar;
        this.AudioAttributesImplBaseParcelizer = recyclerView;
        this.MediaBrowserCompatItemReceiver = recyclerView2;
        this.AudioAttributesImplApi21Parcelizer = recyclerView3;
        this.MediaBrowserCompatCustomActionResultReceiver = tabLayout;
        this.RatingCompat = constraintLayout4;
        this.MediaBrowserCompatMediaItem = textView2;
        this.onCommand = textView3;
        this.MediaMetadataCompat = textView4;
        this.MediaBrowserCompatSearchResultReceiver = textView5;
        this.MediaDescriptionCompat = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onCustomAction;
    }

    public static buildDataSource RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_qbank_lesson_list, viewGroup, false));
    }

    private static buildDataSource write(View view) {
        int i = R.id.clMain;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clMain);
        if (constraintLayout != null) {
            i = R.id.clSort;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clSort);
            if (constraintLayout2 != null) {
                i = R.id.ivBack;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBack);
                if (imageView != null) {
                    i = R.id.ivEmptyState;
                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivEmptyState);
                    if (imageView2 != null) {
                        i = R.id.ivIndex;
                        ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivIndex);
                        if (imageView3 != null) {
                            i = R.id.lblSortBy;
                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lblSortBy);
                            if (textView != null) {
                                i = R.id.llIndex;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) getApplicationIcon.IconCompatParcelizer(view, R.id.llIndex);
                                if (linearLayoutCompat != null) {
                                    i = R.id.lytQbankSuggestion;
                                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.lytQbankSuggestion);
                                    if (viewIconCompatParcelizer != null) {
                                        createTrackGroupArrayWithDrmInfo createtrackgrouparraywithdrminfo = createTrackGroupArrayWithDrmInfo.read(viewIconCompatParcelizer);
                                        i = R.id.progressLoadList;
                                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressLoadList);
                                        if (progressBar != null) {
                                            i = R.id.rvLessonFilter;
                                            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvLessonFilter);
                                            if (recyclerView != null) {
                                                i = R.id.rvLessonList;
                                                RecyclerView recyclerView2 = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvLessonList);
                                                if (recyclerView2 != null) {
                                                    i = R.id.rvLessonSortFilter;
                                                    RecyclerView recyclerView3 = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvLessonSortFilter);
                                                    if (recyclerView3 != null) {
                                                        i = R.id.tabs;
                                                        TabLayout tabLayout = (TabLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tabs);
                                                        if (tabLayout != null) {
                                                            i = R.id.toolbar;
                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                            if (constraintLayout3 != null) {
                                                                i = R.id.tvEmptyState;
                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmptyState);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvIndex;
                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvIndex);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvSortItemTitle;
                                                                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSortItemTitle);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvSubjectTitle;
                                                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectTitle);
                                                                            if (textView5 != null) {
                                                                                i = R.id.viewDark;
                                                                                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewDark);
                                                                                if (viewIconCompatParcelizer2 != null) {
                                                                                    return new buildDataSource((ConstraintLayout) view, constraintLayout, constraintLayout2, imageView, imageView2, imageView3, textView, linearLayoutCompat, createtrackgrouparraywithdrminfo, progressBar, recyclerView, recyclerView2, recyclerView3, tabLayout, constraintLayout3, textView2, textView3, textView4, textView5, viewIconCompatParcelizer2);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
