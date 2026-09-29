package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class deriveAudioFormat implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    public final RecyclerView AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final ProgressBar AudioAttributesImplBaseParcelizer;
    public final LinearLayoutCompat IconCompatParcelizer;
    public final TabLayout MediaBrowserCompatCustomActionResultReceiver;
    public final RecyclerView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    private final ConstraintLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private ImageView MediaDescriptionCompat;
    public final ConstraintLayout MediaMetadataCompat;
    private ImageView RatingCompat;
    public final Group RemoteActionCompatParcelizer;
    private TextView onAddQueueItem;
    public final Group read;
    public final View write;

    private deriveAudioFormat(ConstraintLayout constraintLayout, Group group, Group group2, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayoutCompat linearLayoutCompat, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, RecyclerView recyclerView2, TabLayout tabLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = constraintLayout;
        this.read = group;
        this.RemoteActionCompatParcelizer = group2;
        this.write = view;
        this.AudioAttributesCompatParcelizer = imageView;
        this.MediaDescriptionCompat = imageView2;
        this.RatingCompat = imageView3;
        this.IconCompatParcelizer = linearLayoutCompat;
        this.AudioAttributesImplApi26Parcelizer = linearLayout;
        this.AudioAttributesImplBaseParcelizer = progressBar;
        this.AudioAttributesImplApi21Parcelizer = recyclerView;
        this.MediaBrowserCompatItemReceiver = recyclerView2;
        this.MediaBrowserCompatCustomActionResultReceiver = tabLayout;
        this.MediaMetadataCompat = constraintLayout2;
        this.MediaBrowserCompatSearchResultReceiver = textView;
        this.onAddQueueItem = textView2;
        this.MediaBrowserCompatMediaItem = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public static deriveAudioFormat AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_video_lesson_list, viewGroup, false));
    }

    private static deriveAudioFormat read(View view) {
        int i = R.id.emptyStateGroup;
        Group group = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.emptyStateGroup);
        if (group != null) {
            i = R.id.indexGroup;
            Group group2 = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.indexGroup);
            if (group2 != null) {
                i = R.id.indexOverlay;
                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.indexOverlay);
                if (viewIconCompatParcelizer != null) {
                    i = R.id.ivBack;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBack);
                    if (imageView != null) {
                        i = R.id.ivEmptyState;
                        ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivEmptyState);
                        if (imageView2 != null) {
                            i = R.id.ivIndex;
                            ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivIndex);
                            if (imageView3 != null) {
                                i = R.id.llIndex;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) getApplicationIcon.IconCompatParcelizer(view, R.id.llIndex);
                                if (linearLayoutCompat != null) {
                                    i = R.id.llInternModeRibbon;
                                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInternModeRibbon);
                                    if (linearLayout != null) {
                                        i = R.id.progressLoadList;
                                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressLoadList);
                                        if (progressBar != null) {
                                            i = R.id.rvIndex;
                                            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvIndex);
                                            if (recyclerView != null) {
                                                i = R.id.rvVideoList;
                                                RecyclerView recyclerView2 = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvVideoList);
                                                if (recyclerView2 != null) {
                                                    i = R.id.tabs;
                                                    TabLayout tabLayout = (TabLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tabs);
                                                    if (tabLayout != null) {
                                                        i = R.id.toolbar;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                        if (constraintLayout != null) {
                                                            i = R.id.tvEmptyState;
                                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmptyState);
                                                            if (textView != null) {
                                                                i = R.id.tvIndex;
                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvIndex);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvSubjectTitle;
                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectTitle);
                                                                    if (textView3 != null) {
                                                                        return new deriveAudioFormat((ConstraintLayout) view, group, group2, viewIconCompatParcelizer, imageView, imageView2, imageView3, linearLayoutCompat, linearLayout, progressBar, recyclerView, recyclerView2, tabLayout, constraintLayout, textView, textView2, textView3);
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
