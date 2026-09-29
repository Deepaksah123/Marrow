package kotlin;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSelectionFlagsFromDashRoleScheme implements getApplicationLabel {
    public final HlsMediaPlaylist AudioAttributesCompatParcelizer;
    public final FrameLayout IconCompatParcelizer;
    private final LinearLayout RemoteActionCompatParcelizer;

    private parseSelectionFlagsFromDashRoleScheme(LinearLayout linearLayout, FrameLayout frameLayout, HlsMediaPlaylist hlsMediaPlaylist) {
        this.RemoteActionCompatParcelizer = linearLayout;
        this.IconCompatParcelizer = frameLayout;
        this.AudioAttributesCompatParcelizer = hlsMediaPlaylist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static parseSelectionFlagsFromDashRoleScheme IconCompatParcelizer(View view) {
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
            if (viewIconCompatParcelizer != null) {
                return new parseSelectionFlagsFromDashRoleScheme((LinearLayout) view, frameLayout, HlsMediaPlaylist.IconCompatParcelizer(viewIconCompatParcelizer));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
