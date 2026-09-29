package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsExtractorFactory implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final FrameLayout AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final NestedScrollView MediaBrowserCompatCustomActionResultReceiver;
    public final RecyclerView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final LinearLayout MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final Toolbar RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    private LinearLayout onAddQueueItem;
    public final TextView onCommand;
    private final ConstraintLayout onCustomAction;
    public final ImageView read;
    public final Button write;

    private HlsExtractorFactory(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, FrameLayout frameLayout, NestedScrollView nestedScrollView, LinearLayout linearLayout4, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout5, TextView textView2, Toolbar toolbar, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.onCustomAction = constraintLayout;
        this.write = button;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.onAddQueueItem = linearLayout;
        this.read = imageView;
        this.IconCompatParcelizer = linearLayout2;
        this.AudioAttributesCompatParcelizer = linearLayout3;
        this.AudioAttributesImplApi26Parcelizer = frameLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = nestedScrollView;
        this.AudioAttributesImplApi21Parcelizer = linearLayout4;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.MediaBrowserCompatItemReceiver = recyclerView;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout5;
        this.MediaMetadataCompat = textView2;
        this.RatingCompat = toolbar;
        this.MediaBrowserCompatMediaItem = textView3;
        this.MediaDescriptionCompat = textView4;
        this.onCommand = textView5;
        this.handleMediaPlayPauseIfPendingOnHandler = textView6;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onCustomAction;
    }

    public static HlsExtractorFactory AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_plan_validity_screen, viewGroup, false));
    }

    private static HlsExtractorFactory read(View view) {
        int i = R.id.btnViewAllPlans;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnViewAllPlans);
        if (button != null) {
            i = R.id.clMainLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clMainLayout);
            if (constraintLayout != null) {
                i = R.id.containerSubjectPlans;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.containerSubjectPlans);
                if (linearLayout != null) {
                    i = R.id.imgExpandArrow;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgExpandArrow);
                    if (imageView != null) {
                        i = R.id.llBtnLayout;
                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llBtnLayout);
                        if (linearLayout2 != null) {
                            i = R.id.llTopLevelPlanModules;
                            LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llTopLevelPlanModules);
                            if (linearLayout3 != null) {
                                i = R.id.loading_container;
                                FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.loading_container);
                                if (frameLayout != null) {
                                    i = R.id.nsvContainer;
                                    NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.nsvContainer);
                                    if (nestedScrollView != null) {
                                        i = R.id.otherPlanModule;
                                        LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.otherPlanModule);
                                        if (linearLayout4 != null) {
                                            i = R.id.qbankExpiryData;
                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.qbankExpiryData);
                                            if (textView != null) {
                                                i = R.id.rvPurchasedPlans;
                                                RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvPurchasedPlans);
                                                if (recyclerView != null) {
                                                    i = R.id.subjectPlanModuleHeading;
                                                    LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.subjectPlanModuleHeading);
                                                    if (linearLayout5 != null) {
                                                        i = R.id.testExpiryData;
                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.testExpiryData);
                                                        if (textView2 != null) {
                                                            i = R.id.toolbar;
                                                            Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                            if (toolbar != null) {
                                                                i = R.id.tv_qbank_expiring_soon;
                                                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_qbank_expiring_soon);
                                                                if (textView3 != null) {
                                                                    i = R.id.tv_test_expiring_soon;
                                                                    TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_test_expiring_soon);
                                                                    if (textView4 != null) {
                                                                        i = R.id.tv_video_expiring_soon;
                                                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_video_expiring_soon);
                                                                        if (textView5 != null) {
                                                                            i = R.id.videoExpiryData;
                                                                            TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.videoExpiryData);
                                                                            if (textView6 != null) {
                                                                                return new HlsExtractorFactory((ConstraintLayout) view, button, constraintLayout, linearLayout, imageView, linearLayout2, linearLayout3, frameLayout, nestedScrollView, linearLayout4, textView, recyclerView, linearLayout5, textView2, toolbar, textView3, textView4, textView5, textView6);
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
