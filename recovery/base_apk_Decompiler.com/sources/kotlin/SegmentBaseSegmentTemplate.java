package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class SegmentBaseSegmentTemplate implements getApplicationLabel {
    private final LinearLayout AudioAttributesCompatParcelizer;
    public final CustomTextView IconCompatParcelizer;
    public final RecyclerView RemoteActionCompatParcelizer;
    public final CustomTextView read;
    public final CustomTextView write;

    private SegmentBaseSegmentTemplate(LinearLayout linearLayout, CustomTextView customTextView, CustomTextView customTextView2, RecyclerView recyclerView, CustomTextView customTextView3) {
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.read = customTextView;
        this.IconCompatParcelizer = customTextView2;
        this.RemoteActionCompatParcelizer = recyclerView;
        this.write = customTextView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static SegmentBaseSegmentTemplate AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater);
    }

    private static SegmentBaseSegmentTemplate RemoteActionCompatParcelizer(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.dialog_download, (ViewGroup) null, false));
    }

    private static SegmentBaseSegmentTemplate AudioAttributesCompatParcelizer(View view) {
        int i = R.id.button_download;
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.button_download);
        if (customTextView != null) {
            i = R.id.download_max_warning_text;
            CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.download_max_warning_text);
            if (customTextView2 != null) {
                i = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.recycler_view);
                if (recyclerView != null) {
                    i = R.id.tvDownloadAvailableInLightModeNote;
                    CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDownloadAvailableInLightModeNote);
                    if (customTextView3 != null) {
                        return new SegmentBaseSegmentTemplate((LinearLayout) view, customTextView, customTextView2, recyclerView, customTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
