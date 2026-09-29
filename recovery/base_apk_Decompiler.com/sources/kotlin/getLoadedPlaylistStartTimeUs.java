package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class getLoadedPlaylistStartTimeUs implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    public final CustomTextView AudioAttributesImplApi21Parcelizer;
    public final View IconCompatParcelizer;
    public final CustomTextView MediaBrowserCompatCustomActionResultReceiver;
    private final LinearLayout MediaBrowserCompatItemReceiver;
    public final CustomTextView RemoteActionCompatParcelizer;
    public final View read;
    public final CustomTextView write;

    private getLoadedPlaylistStartTimeUs(LinearLayout linearLayout, View view, View view2, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5) {
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.read = view;
        this.IconCompatParcelizer = view2;
        this.RemoteActionCompatParcelizer = customTextView;
        this.write = customTextView2;
        this.AudioAttributesCompatParcelizer = customTextView3;
        this.AudioAttributesImplApi21Parcelizer = customTextView4;
        this.MediaBrowserCompatCustomActionResultReceiver = customTextView5;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static getLoadedPlaylistStartTimeUs read(View view) {
        int i = R.id.callback_divider;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.callback_divider);
        if (viewIconCompatParcelizer != null) {
            i = R.id.faq_divider;
            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.faq_divider);
            if (viewIconCompatParcelizer2 != null) {
                i = R.id.plan_faq;
                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.plan_faq);
                if (customTextView != null) {
                    i = R.id.plan_get_callback;
                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.plan_get_callback);
                    if (customTextView2 != null) {
                        i = R.id.plan_privacy_policy;
                        CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.plan_privacy_policy);
                        if (customTextView3 != null) {
                            i = R.id.plan_refund_policy;
                            CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.plan_refund_policy);
                            if (customTextView4 != null) {
                                i = R.id.plan_support;
                                CustomTextView customTextView5 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.plan_support);
                                if (customTextView5 != null) {
                                    return new getLoadedPlaylistStartTimeUs((LinearLayout) view, viewIconCompatParcelizer, viewIconCompatParcelizer2, customTextView, customTextView2, customTextView3, customTextView4, customTextView5);
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
