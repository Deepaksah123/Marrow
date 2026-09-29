package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.marrow.R;
import com.marrow.ui.views.CustomEditView;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class parseBaseUrl implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    private ImageView AudioAttributesImplApi21Parcelizer;
    private CustomEditView AudioAttributesImplApi26Parcelizer;
    private ProgressBar AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    private final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    private LinearLayout MediaBrowserCompatItemReceiver;
    private LinearLayout MediaBrowserCompatMediaItem;
    private CustomTextView RatingCompat;
    private CustomTextView RemoteActionCompatParcelizer;
    private CustomEditView read;
    public final ListView write;

    private parseBaseUrl(LinearLayout linearLayout, ImageView imageView, CustomTextView customTextView, CustomEditView customEditView, LinearLayout linearLayout2, ListView listView, ProgressBar progressBar, ImageView imageView2, CustomEditView customEditView2, LinearLayout linearLayout3, CustomTextView customTextView2, CustomTextView customTextView3) {
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout;
        this.IconCompatParcelizer = imageView;
        this.RemoteActionCompatParcelizer = customTextView;
        this.read = customEditView;
        this.MediaBrowserCompatItemReceiver = linearLayout2;
        this.write = listView;
        this.AudioAttributesImplBaseParcelizer = progressBar;
        this.AudioAttributesImplApi21Parcelizer = imageView2;
        this.AudioAttributesImplApi26Parcelizer = customEditView2;
        this.MediaBrowserCompatMediaItem = linearLayout3;
        this.AudioAttributesCompatParcelizer = customTextView2;
        this.RatingCompat = customTextView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static parseBaseUrl read(View view) {
        int i = R.id.back_button_text_view;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.back_button_text_view);
        if (imageView != null) {
            i = R.id.btnSubmit;
            CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSubmit);
            if (customTextView != null) {
                i = R.id.etInstitutionName;
                CustomEditView customEditView = (CustomEditView) getApplicationIcon.IconCompatParcelizer(view, R.id.etInstitutionName);
                if (customEditView != null) {
                    i = R.id.fmgInstituteContainer;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fmgInstituteContainer);
                    if (linearLayout != null) {
                        i = R.id.list_view;
                        ListView listView = (ListView) getApplicationIcon.IconCompatParcelizer(view, R.id.list_view);
                        if (listView != null) {
                            i = R.id.progress_bar;
                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progress_bar);
                            if (progressBar != null) {
                                i = R.id.search_close_btn;
                                ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.search_close_btn);
                                if (imageView2 != null) {
                                    i = R.id.search_edit_text;
                                    CustomEditView customEditView2 = (CustomEditView) getApplicationIcon.IconCompatParcelizer(view, R.id.search_edit_text);
                                    if (customEditView2 != null) {
                                        i = R.id.search_layout;
                                        LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.search_layout);
                                        if (linearLayout2 != null) {
                                            i = R.id.titleTextView;
                                            CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.titleTextView);
                                            if (customTextView2 != null) {
                                                i = R.id.tvFmgCountry;
                                                CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFmgCountry);
                                                if (customTextView3 != null) {
                                                    return new parseBaseUrl((LinearLayout) view, imageView, customTextView, customEditView, linearLayout, listView, progressBar, imageView2, customEditView2, linearLayout2, customTextView2, customTextView3);
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
