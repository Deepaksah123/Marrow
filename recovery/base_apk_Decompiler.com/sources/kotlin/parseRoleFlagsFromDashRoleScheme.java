package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseRoleFlagsFromDashRoleScheme implements getApplicationLabel {
    private final FrameLayout AudioAttributesCompatParcelizer;
    private FrameLayout RemoteActionCompatParcelizer;

    private parseRoleFlagsFromDashRoleScheme(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.AudioAttributesCompatParcelizer = frameLayout;
        this.RemoteActionCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static parseRoleFlagsFromDashRoleScheme write(LayoutInflater layoutInflater) {
        return read(layoutInflater);
    }

    private static parseRoleFlagsFromDashRoleScheme read(LayoutInflater layoutInflater) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.activity_pearl_detail, (ViewGroup) null, false));
    }

    private static parseRoleFlagsFromDashRoleScheme RemoteActionCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseRoleFlagsFromDashRoleScheme(frameLayout, frameLayout);
    }
}
