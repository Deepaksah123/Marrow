package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class isReusable implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final ImageView AudioAttributesImplApi26Parcelizer;
    public final ImageView AudioAttributesImplBaseParcelizer;
    public final EditText IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    private ImageView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TabLayout MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final RecyclerView RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    private ProgressBar onAddQueueItem;
    private final ConstraintLayout onCommand;
    private ImageView onCustomAction;
    public final Button read;
    public final ConstraintLayout write;

    private isReusable(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, RecyclerView recyclerView, TabLayout tabLayout, TextView textView, TextView textView2, TextView textView3) {
        this.onCommand = constraintLayout;
        this.read = button;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.AudioAttributesCompatParcelizer = constraintLayout3;
        this.write = constraintLayout4;
        this.IconCompatParcelizer = editText;
        this.onCustomAction = imageView;
        this.AudioAttributesImplBaseParcelizer = imageView2;
        this.AudioAttributesImplApi26Parcelizer = imageView3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = imageView4;
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.MediaBrowserCompatItemReceiver = linearLayout2;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout3;
        this.onAddQueueItem = progressBar;
        this.RatingCompat = recyclerView;
        this.MediaDescriptionCompat = tabLayout;
        this.MediaBrowserCompatSearchResultReceiver = textView;
        this.MediaMetadataCompat = textView2;
        this.MediaBrowserCompatMediaItem = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onCommand;
    }

    public static isReusable RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_better_search, viewGroup, false));
    }

    private static isReusable write(View view) {
        int i = R.id.btViewPlans;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btViewPlans);
        if (button != null) {
            i = R.id.clEmpty;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clEmpty);
            if (constraintLayout != null) {
                i = R.id.clProMain;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clProMain);
                if (constraintLayout2 != null) {
                    i = R.id.clProgress;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clProgress);
                    if (constraintLayout3 != null) {
                        i = R.id.etSearch;
                        EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etSearch);
                        if (editText != null) {
                            i = R.id.imgError;
                            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgError);
                            if (imageView != null) {
                                i = R.id.ivBack;
                                ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBack);
                                if (imageView2 != null) {
                                    i = R.id.ivClose;
                                    ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivClose);
                                    if (imageView3 != null) {
                                        i = R.id.ivSearch;
                                        ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivSearch);
                                        if (imageView4 != null) {
                                            i = R.id.llError;
                                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llError);
                                            if (linearLayout != null) {
                                                i = R.id.llRecentSearch;
                                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llRecentSearch);
                                                if (linearLayout2 != null) {
                                                    i = R.id.llSearch;
                                                    LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llSearch);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.pbMain;
                                                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbMain);
                                                        if (progressBar != null) {
                                                            i = R.id.rvResults;
                                                            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvResults);
                                                            if (recyclerView != null) {
                                                                i = R.id.tlFilters;
                                                                TabLayout tabLayout = (TabLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tlFilters);
                                                                if (tabLayout != null) {
                                                                    i = R.id.tvClearAll;
                                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvClearAll);
                                                                    if (textView != null) {
                                                                        i = R.id.tvInitMessage;
                                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvInitMessage);
                                                                        if (textView2 != null) {
                                                                            i = R.id.tvNoResult;
                                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNoResult);
                                                                            if (textView3 != null) {
                                                                                return new isReusable((ConstraintLayout) view, button, constraintLayout, constraintLayout2, constraintLayout3, editText, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, progressBar, recyclerView, tabLayout, textView, textView2, textView3);
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
