package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsPlaylistTracker1 implements getApplicationLabel {
    private final ConstraintLayout RemoteActionCompatParcelizer;
    public final CustomTextView write;

    private DefaultHlsPlaylistTracker1(ConstraintLayout constraintLayout, CustomTextView customTextView) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.write = customTextView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static DefaultHlsPlaylistTracker1 AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.plan_upgrade_answer, viewGroup, false));
    }

    private static DefaultHlsPlaylistTracker1 AudioAttributesCompatParcelizer(View view) {
        CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_answer);
        if (customTextView != null) {
            return new DefaultHlsPlaylistTracker1((ConstraintLayout) view, customTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_answer)));
    }
}
