package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseRoleFlagsFromRoleDescriptors implements getApplicationLabel {
    private FrameLayout RemoteActionCompatParcelizer;
    private final FrameLayout read;

    private parseRoleFlagsFromRoleDescriptors(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.read = frameLayout;
        this.RemoteActionCompatParcelizer = frameLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static parseRoleFlagsFromRoleDescriptors AudioAttributesCompatParcelizer(LayoutInflater layoutInflater) {
        return write(layoutInflater);
    }

    private static parseRoleFlagsFromRoleDescriptors write(LayoutInflater layoutInflater) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.activity_phone_alternate, (ViewGroup) null, false));
    }

    private static parseRoleFlagsFromRoleDescriptors AudioAttributesCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new parseRoleFlagsFromRoleDescriptors(frameLayout, frameLayout);
    }
}
