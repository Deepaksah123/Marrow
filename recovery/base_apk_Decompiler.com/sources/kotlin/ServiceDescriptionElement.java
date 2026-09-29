package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ServiceDescriptionElement implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    public final CustomTextView IconCompatParcelizer;
    public final ImageView RemoteActionCompatParcelizer;
    public final CustomTextView read;
    private final FrameLayout write;

    private ServiceDescriptionElement(FrameLayout frameLayout, CustomTextView customTextView, ImageView imageView, CustomTextView customTextView2, CustomTextView customTextView3) {
        this.write = frameLayout;
        this.IconCompatParcelizer = customTextView;
        this.RemoteActionCompatParcelizer = imageView;
        this.read = customTextView2;
        this.AudioAttributesCompatParcelizer = customTextView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public FrameLayout IconCompatParcelizer() {
        return this.write;
    }

    public static ServiceDescriptionElement IconCompatParcelizer(LayoutInflater layoutInflater) {
        return read(layoutInflater);
    }

    private static ServiceDescriptionElement read(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.dialog_info, (ViewGroup) null, false));
    }

    private static ServiceDescriptionElement AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnHightlight;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnHightlight);
        if (customTextView != null) {
            i = R.id.ivLogo;
            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLogo);
            if (imageView != null) {
                i = R.id.tvContent;
                CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvContent);
                if (customTextView2 != null) {
                    i = R.id.tvTitle;
                    CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTitle);
                    if (customTextView3 != null) {
                        return new ServiceDescriptionElement((FrameLayout) view, customTextView, imageView, customTextView2, customTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
