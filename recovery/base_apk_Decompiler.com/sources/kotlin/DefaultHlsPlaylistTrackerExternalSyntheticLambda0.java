package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsPlaylistTrackerExternalSyntheticLambda0 implements getApplicationLabel {
    public final CustomTextView RemoteActionCompatParcelizer;
    private final CustomTextView write;

    private DefaultHlsPlaylistTrackerExternalSyntheticLambda0(CustomTextView customTextView, CustomTextView customTextView2) {
        this.write = customTextView;
        this.RemoteActionCompatParcelizer = customTextView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final CustomTextView IconCompatParcelizer() {
        return this.write;
    }

    public static DefaultHlsPlaylistTrackerExternalSyntheticLambda0 AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.plan_upgrade_content_points, viewGroup, false));
    }

    private static DefaultHlsPlaylistTrackerExternalSyntheticLambda0 AudioAttributesCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CustomTextView customTextView = (CustomTextView) view;
        return new DefaultHlsPlaylistTrackerExternalSyntheticLambda0(customTextView, customTextView);
    }
}
