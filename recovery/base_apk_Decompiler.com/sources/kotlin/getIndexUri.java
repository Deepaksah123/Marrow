package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes.dex */
public final class getIndexUri implements getApplicationLabel {
    public final CustomButton AudioAttributesCompatParcelizer;
    public final CustomTextView AudioAttributesImplApi21Parcelizer;
    public final CustomTextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final CustomTextView IconCompatParcelizer;
    public final CustomTextView MediaBrowserCompatCustomActionResultReceiver;
    public final CustomTextView MediaBrowserCompatItemReceiver;
    public final CustomTextView MediaBrowserCompatMediaItem;
    public final ViewFlipper MediaBrowserCompatSearchResultReceiver;
    private ConstraintLayout MediaDescriptionCompat;
    public final CustomTextView MediaMetadataCompat;
    private ConstraintLayout RatingCompat;
    public final CustomTextView RemoteActionCompatParcelizer;
    private final ViewFlipper onAddQueueItem;
    private ImageView onCommand;
    private View onCustomAction;
    public final Toolbar read;
    public final CustomButton write;

    private getIndexUri(ViewFlipper viewFlipper, CustomButton customButton, CustomButton customButton2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, Toolbar toolbar, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5, TextView textView, CustomTextView customTextView6, CustomTextView customTextView7, CustomTextView customTextView8, ViewFlipper viewFlipper2, View view) {
        this.onAddQueueItem = viewFlipper;
        this.AudioAttributesCompatParcelizer = customButton;
        this.write = customButton2;
        this.MediaDescriptionCompat = constraintLayout;
        this.RatingCompat = constraintLayout2;
        this.onCommand = imageView;
        this.read = toolbar;
        this.RemoteActionCompatParcelizer = customTextView;
        this.IconCompatParcelizer = customTextView2;
        this.AudioAttributesImplApi26Parcelizer = customTextView3;
        this.AudioAttributesImplApi21Parcelizer = customTextView4;
        this.MediaBrowserCompatItemReceiver = customTextView5;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.MediaBrowserCompatCustomActionResultReceiver = customTextView6;
        this.MediaMetadataCompat = customTextView7;
        this.MediaBrowserCompatMediaItem = customTextView8;
        this.MediaBrowserCompatSearchResultReceiver = viewFlipper2;
        this.onCustomAction = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ViewFlipper IconCompatParcelizer() {
        return this.onAddQueueItem;
    }

    public static getIndexUri read(View view) {
        int i = R.id.btnBlockProceed;
        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnBlockProceed);
        if (customButton != null) {
            i = R.id.btnBlockSubmit;
            CustomButton customButton2 = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnBlockSubmit);
            if (customButton2 != null) {
                i = R.id.clFirstBlockView;
                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clFirstBlockView);
                if (constraintLayout != null) {
                    i = R.id.clSecondBlockView;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clSecondBlockView);
                    if (constraintLayout2 != null) {
                        i = R.id.imgBlocked;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgBlocked);
                        if (imageView != null) {
                            i = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                            if (toolbar != null) {
                                i = R.id.tvBlockBullets;
                                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBlockBullets);
                                if (customTextView != null) {
                                    i = R.id.tvBlockDesc;
                                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBlockDesc);
                                    if (customTextView2 != null) {
                                        i = R.id.tvBlockHeading;
                                        CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBlockHeading);
                                        if (customTextView3 != null) {
                                            i = R.id.tvBlockInitialBullets;
                                            CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBlockInitialBullets);
                                            if (customTextView4 != null) {
                                                i = R.id.tvBlockInitialDesc;
                                                CustomTextView customTextView5 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBlockInitialDesc);
                                                if (customTextView5 != null) {
                                                    i = R.id.tvCheckbox;
                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCheckbox);
                                                    if (textView != null) {
                                                        i = R.id.tvHeading;
                                                        CustomTextView customTextView6 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvHeading);
                                                        if (customTextView6 != null) {
                                                            i = R.id.tvMarrowTnC;
                                                            CustomTextView customTextView7 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMarrowTnC);
                                                            if (customTextView7 != null) {
                                                                i = R.id.tvNoteWarning;
                                                                CustomTextView customTextView8 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNoteWarning);
                                                                if (customTextView8 != null) {
                                                                    ViewFlipper viewFlipper = (ViewFlipper) view;
                                                                    i = R.id.viewLine;
                                                                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.viewLine);
                                                                    if (viewIconCompatParcelizer != null) {
                                                                        return new getIndexUri(viewFlipper, customButton, customButton2, constraintLayout, constraintLayout2, imageView, toolbar, customTextView, customTextView2, customTextView3, customTextView4, customTextView5, textView, customTextView6, customTextView7, customTextView8, viewFlipper, viewIconCompatParcelizer);
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
