package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import com.marrow.ui.views.LottieRatingBar;

/* JADX INFO: loaded from: classes3.dex */
public final class getCipherInstance implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final LottieRatingBar AudioAttributesImplApi21Parcelizer;
    public final CustomTextView AudioAttributesImplApi26Parcelizer;
    public final CustomTextView AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final RecyclerView MediaBrowserCompatItemReceiver;
    private final LinearLayout MediaBrowserCompatMediaItem;
    private CustomTextView MediaDescriptionCompat;
    private TextView MediaMetadataCompat;
    public final View RemoteActionCompatParcelizer;
    public final formatsMatch read;
    public final CustomButton write;

    private getCipherInstance(LinearLayout linearLayout, CustomTextView customTextView, View view, CustomButton customButton, ImageView imageView, formatsMatch formatsmatch, LinearLayout linearLayout2, LinearLayout linearLayout3, LottieRatingBar lottieRatingBar, CustomTextView customTextView2, CustomTextView customTextView3, RecyclerView recyclerView, TextView textView) {
        this.MediaBrowserCompatMediaItem = linearLayout;
        this.MediaDescriptionCompat = customTextView;
        this.RemoteActionCompatParcelizer = view;
        this.write = customButton;
        this.IconCompatParcelizer = imageView;
        this.read = formatsmatch;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout3;
        this.AudioAttributesImplApi21Parcelizer = lottieRatingBar;
        this.AudioAttributesImplApi26Parcelizer = customTextView2;
        this.AudioAttributesImplBaseParcelizer = customTextView3;
        this.MediaBrowserCompatItemReceiver = recyclerView;
        this.MediaMetadataCompat = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public static getCipherInstance RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.dialog_video_completed, viewGroup, false));
    }

    private static getCipherInstance read(View view) {
        int i = R.id.active_recall_header;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.active_recall_header);
        if (customTextView != null) {
            i = R.id.divider;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
            if (viewIconCompatParcelizer != null) {
                i = R.id.done;
                CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.done);
                if (customButton != null) {
                    i = R.id.iv_close;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.iv_close);
                    if (imageView != null) {
                        i = R.id.layoutActiveRecall;
                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutActiveRecall);
                        if (viewIconCompatParcelizer2 != null) {
                            formatsMatch formatsmatchRemoteActionCompatParcelizer = formatsMatch.RemoteActionCompatParcelizer(viewIconCompatParcelizer2);
                            i = R.id.ll_active_recall;
                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ll_active_recall);
                            if (linearLayout != null) {
                                i = R.id.ll_related_module;
                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ll_related_module);
                                if (linearLayout2 != null) {
                                    i = R.id.lottieRatingBar;
                                    LottieRatingBar lottieRatingBar = (LottieRatingBar) getApplicationIcon.IconCompatParcelizer(view, R.id.lottieRatingBar);
                                    if (lottieRatingBar != null) {
                                        i = R.id.rating_msg_title;
                                        CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.rating_msg_title);
                                        if (customTextView2 != null) {
                                            i = R.id.related_module_header;
                                            CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.related_module_header);
                                            if (customTextView3 != null) {
                                                i = R.id.rv_related_modules;
                                                RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rv_related_modules);
                                                if (recyclerView != null) {
                                                    i = R.id.textreviewTitleId;
                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.textreviewTitleId);
                                                    if (textView != null) {
                                                        return new getCipherInstance((LinearLayout) view, customTextView, viewIconCompatParcelizer, customButton, imageView, formatsmatchRemoteActionCompatParcelizer, linearLayout, linearLayout2, lottieRatingBar, customTextView2, customTextView3, recyclerView, textView);
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
