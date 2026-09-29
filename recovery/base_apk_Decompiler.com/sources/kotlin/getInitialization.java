package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class getInitialization implements getApplicationLabel {
    private final FrameLayout AudioAttributesCompatParcelizer;
    public final CustomTextView IconCompatParcelizer;
    public final CustomTextView RemoteActionCompatParcelizer;
    private CustomTextView read;
    public final CustomTextView write;

    private getInitialization(FrameLayout frameLayout, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4) {
        this.AudioAttributesCompatParcelizer = frameLayout;
        this.write = customTextView;
        this.IconCompatParcelizer = customTextView2;
        this.read = customTextView3;
        this.RemoteActionCompatParcelizer = customTextView4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public FrameLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static getInitialization read(LayoutInflater layoutInflater) {
        return IconCompatParcelizer(layoutInflater);
    }

    private static getInitialization IconCompatParcelizer(LayoutInflater layoutInflater) {
        return read(layoutInflater.inflate(R.layout.dialog_developer_options_enabled, (ViewGroup) null, false));
    }

    private static getInitialization read(View view) {
        int i = R.id.btnCancel;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnCancel);
        if (customTextView != null) {
            i = R.id.btnSettings;
            CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSettings);
            if (customTextView2 != null) {
                i = R.id.tvContent;
                CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvContent);
                if (customTextView3 != null) {
                    i = R.id.tvReferBlog;
                    CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvReferBlog);
                    if (customTextView4 != null) {
                        return new getInitialization((FrameLayout) view, customTextView, customTextView2, customTextView3, customTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
