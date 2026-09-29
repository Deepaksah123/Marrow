package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getSegmentBaseList implements getApplicationLabel {
    private final ConstraintLayout RemoteActionCompatParcelizer;
    public final FrameLayout write;

    private getSegmentBaseList(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.write = frameLayout;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static getSegmentBaseList RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_kyc_parent, viewGroup, false));
    }

    private static getSegmentBaseList AudioAttributesCompatParcelizer(View view) {
        FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fragment_container);
        if (frameLayout != null) {
            return new getSegmentBaseList((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.fragment_container)));
    }
}
