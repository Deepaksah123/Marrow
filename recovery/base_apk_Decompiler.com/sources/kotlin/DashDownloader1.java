package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class DashDownloader1 implements getApplicationLabel {
    public final CustomButton AudioAttributesCompatParcelizer;
    private final ScrollView AudioAttributesImplApi26Parcelizer;
    private CustomTextView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final CustomTextView MediaBrowserCompatCustomActionResultReceiver;
    public final CustomTextView RemoteActionCompatParcelizer;
    public final CustomTextView read;
    public final CustomTextView write;

    private DashDownloader1(ScrollView scrollView, CustomButton customButton, LinearLayout linearLayout, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5) {
        this.AudioAttributesImplApi26Parcelizer = scrollView;
        this.AudioAttributesCompatParcelizer = customButton;
        this.IconCompatParcelizer = linearLayout;
        this.write = customTextView;
        this.RemoteActionCompatParcelizer = customTextView2;
        this.read = customTextView3;
        this.MediaBrowserCompatCustomActionResultReceiver = customTextView4;
        this.AudioAttributesImplBaseParcelizer = customTextView5;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static DashDownloader1 IconCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static DashDownloader1 write(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater.inflate(R.layout.dialog_video_error, (ViewGroup) null, false));
    }

    private static DashDownloader1 IconCompatParcelizer(View view) {
        int i = R.id.button_ok;
        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.button_ok);
        if (customButton != null) {
            i = R.id.container_resolution_fix;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container_resolution_fix);
            if (linearLayout != null) {
                i = R.id.tvNetworkChangeMsg;
                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNetworkChangeMsg);
                if (customTextView != null) {
                    i = R.id.tvTroubleshootHeading;
                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTroubleshootHeading);
                    if (customTextView2 != null) {
                        i = R.id.tvVideoErrorContactSupport;
                        CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoErrorContactSupport);
                        if (customTextView3 != null) {
                            i = R.id.tvVideoErrorDlgCode;
                            CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoErrorDlgCode);
                            if (customTextView4 != null) {
                                i = R.id.tvVideoErrorDlgTitle;
                                CustomTextView customTextView5 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoErrorDlgTitle);
                                if (customTextView5 != null) {
                                    return new DashDownloader1((ScrollView) view, customButton, linearLayout, customTextView, customTextView2, customTextView3, customTextView4, customTextView5);
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
