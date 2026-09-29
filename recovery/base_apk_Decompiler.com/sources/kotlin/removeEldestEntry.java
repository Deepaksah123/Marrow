package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class removeEldestEntry implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final CheckBox IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final ConstraintLayout MediaBrowserCompatMediaItem;
    public final RecyclerView MediaBrowserCompatSearchResultReceiver;
    private TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final NestedScrollView MediaMetadataCompat;
    public final RecyclerView RatingCompat;
    public final ImageView RemoteActionCompatParcelizer;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    private final ConstraintLayout onCommand;
    public final Button read;
    public final ComposeView write;

    private removeEldestEntry(ConstraintLayout constraintLayout, Button button, CheckBox checkBox, ComposeView composeView, ImageView imageView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, RecyclerView recyclerView, RecyclerView recyclerView2, NestedScrollView nestedScrollView, ConstraintLayout constraintLayout3, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.onCommand = constraintLayout;
        this.read = button;
        this.IconCompatParcelizer = checkBox;
        this.write = composeView;
        this.RemoteActionCompatParcelizer = imageView;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.AudioAttributesImplApi26Parcelizer = constraintLayout2;
        this.AudioAttributesImplBaseParcelizer = linearLayout2;
        this.AudioAttributesImplApi21Parcelizer = linearLayout3;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout4;
        this.MediaBrowserCompatItemReceiver = textView;
        this.MediaBrowserCompatSearchResultReceiver = recyclerView;
        this.RatingCompat = recyclerView2;
        this.MediaMetadataCompat = nestedScrollView;
        this.MediaBrowserCompatMediaItem = constraintLayout3;
        this.MediaDescriptionCompat = textView2;
        this.handleMediaPlayPauseIfPendingOnHandler = textView3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView4;
        this.onAddQueueItem = textView5;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onCommand;
    }

    public static removeEldestEntry write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_downloaded_video_list, viewGroup, false));
    }

    private static removeEldestEntry write(View view) {
        int i = R.id.btnDelete;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnDelete);
        if (button != null) {
            i = R.id.cbSelectAll;
            CheckBox checkBox = (CheckBox) getApplicationIcon.IconCompatParcelizer(view, R.id.cbSelectAll);
            if (checkBox != null) {
                i = R.id.composeViewDownloadedCourses;
                ComposeView composeView = (ComposeView) getApplicationIcon.IconCompatParcelizer(view, R.id.composeViewDownloadedCourses);
                if (composeView != null) {
                    i = R.id.ivBack;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBack);
                    if (imageView != null) {
                        i = R.id.llDelete;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llDelete);
                        if (linearLayout != null) {
                            i = R.id.llDeleteDownloadedVideos;
                            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llDeleteDownloadedVideos);
                            if (constraintLayout != null) {
                                i = R.id.llDeleteSelection;
                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llDeleteSelection);
                                if (linearLayout2 != null) {
                                    i = R.id.llDownloadedVideos;
                                    LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llDownloadedVideos);
                                    if (linearLayout3 != null) {
                                        i = R.id.llDownloadingVideos;
                                        LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llDownloadingVideos);
                                        if (linearLayout4 != null) {
                                            i = R.id.menuDelete;
                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.menuDelete);
                                            if (textView != null) {
                                                i = R.id.rvDownloaded;
                                                RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvDownloaded);
                                                if (recyclerView != null) {
                                                    i = R.id.rvDownloading;
                                                    RecyclerView recyclerView2 = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvDownloading);
                                                    if (recyclerView2 != null) {
                                                        i = R.id.scrollContainer;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scrollContainer);
                                                        if (nestedScrollView != null) {
                                                            i = R.id.toolbar;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                            if (constraintLayout2 != null) {
                                                                i = R.id.tvDownloadedLabel;
                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDownloadedLabel);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvDownloadingLabel;
                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDownloadingLabel);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvSavedVideosHeader;
                                                                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSavedVideosHeader);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvSelectedVideosCount;
                                                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSelectedVideosCount);
                                                                            if (textView5 != null) {
                                                                                return new removeEldestEntry((ConstraintLayout) view, button, checkBox, composeView, imageView, linearLayout, constraintLayout, linearLayout2, linearLayout3, linearLayout4, textView, recyclerView, recyclerView2, nestedScrollView, constraintLayout2, textView2, textView3, textView4, textView5);
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
