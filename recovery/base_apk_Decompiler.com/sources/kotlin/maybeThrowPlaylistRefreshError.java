package kotlin;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeThrowPlaylistRefreshError implements getApplicationLabel {
    private final FrameLayout AudioAttributesCompatParcelizer;
    public final FrameLayout RemoteActionCompatParcelizer;

    private maybeThrowPlaylistRefreshError(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.AudioAttributesCompatParcelizer = frameLayout;
        this.RemoteActionCompatParcelizer = frameLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public FrameLayout IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static maybeThrowPlaylistRefreshError IconCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new maybeThrowPlaylistRefreshError(frameLayout, frameLayout);
    }
}
