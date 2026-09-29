package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class isVariantUrl implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final ImageView AudioAttributesImplApi21Parcelizer;
    public final ImageView AudioAttributesImplApi26Parcelizer;
    public final ImageView AudioAttributesImplBaseParcelizer;
    public final ConstraintLayout IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    private Barrier MediaBrowserCompatSearchResultReceiver;
    private View MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private ConstraintLayout MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    private final CardView RatingCompat;
    public final ImageView RemoteActionCompatParcelizer;
    private View onCommand;
    private View onCustomAction;
    public final ConstraintLayout read;
    public final ConstraintLayout write;

    private isVariantUrl(CardView cardView, Barrier barrier, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, View view, View view2, View view3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.RatingCompat = cardView;
        this.MediaBrowserCompatSearchResultReceiver = barrier;
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.IconCompatParcelizer = constraintLayout2;
        this.read = constraintLayout3;
        this.write = constraintLayout4;
        this.MediaDescriptionCompat = constraintLayout5;
        this.RemoteActionCompatParcelizer = imageView;
        this.AudioAttributesImplApi21Parcelizer = imageView2;
        this.AudioAttributesImplBaseParcelizer = imageView3;
        this.AudioAttributesImplApi26Parcelizer = imageView4;
        this.onCustomAction = view;
        this.onCommand = view2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = view3;
        this.MediaBrowserCompatCustomActionResultReceiver = textView;
        this.MediaBrowserCompatItemReceiver = textView2;
        this.MediaMetadataCompat = textView3;
        this.MediaBrowserCompatMediaItem = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public static isVariantUrl read(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater);
    }

    private static isVariantUrl AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.layout_video_subject_sort_filter, (ViewGroup) null, false));
    }

    private static isVariantUrl AudioAttributesCompatParcelizer(View view) {
        int i = R.id.barrier;
        Barrier barrier = (Barrier) getApplicationIcon.IconCompatParcelizer(view, R.id.barrier);
        if (barrier != null) {
            i = R.id.clDefaultSort;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clDefaultSort);
            if (constraintLayout != null) {
                i = R.id.clLastOpenedSort;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clLastOpenedSort);
                if (constraintLayout2 != null) {
                    i = R.id.clLeastCompletedSort;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clLeastCompletedSort);
                    if (constraintLayout3 != null) {
                        i = R.id.clMostCompletedSort;
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clMostCompletedSort);
                        if (constraintLayout4 != null) {
                            i = R.id.clSortRoot;
                            ConstraintLayout constraintLayout5 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clSortRoot);
                            if (constraintLayout5 != null) {
                                i = R.id.ivDefaultSortSelection;
                                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivDefaultSortSelection);
                                if (imageView != null) {
                                    i = R.id.ivLastOpenedSortSelection;
                                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLastOpenedSortSelection);
                                    if (imageView2 != null) {
                                        i = R.id.ivLeastCompletedSortSelection;
                                        ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLeastCompletedSortSelection);
                                        if (imageView3 != null) {
                                            i = R.id.ivMostCompletedSortSelection;
                                            ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivMostCompletedSortSelection);
                                            if (imageView4 != null) {
                                                i = R.id.sortDefaultTypeDivider;
                                                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.sortDefaultTypeDivider);
                                                if (viewIconCompatParcelizer != null) {
                                                    i = R.id.sortLastOpenedTypeDivider;
                                                    View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.sortLastOpenedTypeDivider);
                                                    if (viewIconCompatParcelizer2 != null) {
                                                        i = R.id.sortMostCompletedTypeDivider;
                                                        View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.sortMostCompletedTypeDivider);
                                                        if (viewIconCompatParcelizer3 != null) {
                                                            i = R.id.tvDefaultSortType;
                                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDefaultSortType);
                                                            if (textView != null) {
                                                                i = R.id.tvLastOpenedSortType;
                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLastOpenedSortType);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvLeastCompletedSortType;
                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLeastCompletedSortType);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvMostCompletedSortType;
                                                                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMostCompletedSortType);
                                                                        if (textView4 != null) {
                                                                            return new isVariantUrl((CardView) view, barrier, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, imageView, imageView2, imageView3, imageView4, viewIconCompatParcelizer, viewIconCompatParcelizer2, viewIconCompatParcelizer3, textView, textView2, textView3, textView4);
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
