package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class createTracker implements getApplicationLabel {
    private final CustomTextView IconCompatParcelizer;
    public final CustomTextView write;

    private createTracker(CustomTextView customTextView, CustomTextView customTextView2) {
        this.IconCompatParcelizer = customTextView;
        this.write = customTextView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final CustomTextView IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static createTracker read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.plan_upgrade_question, viewGroup, false));
    }

    private static createTracker write(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CustomTextView customTextView = (CustomTextView) view;
        return new createTracker(customTextView, customTextView);
    }
}
