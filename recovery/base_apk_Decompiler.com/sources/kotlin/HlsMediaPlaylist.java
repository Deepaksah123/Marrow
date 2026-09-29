package kotlin;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPlaylist implements getApplicationLabel {
    private final Toolbar AudioAttributesCompatParcelizer;
    public final Toolbar write;

    private HlsMediaPlaylist(Toolbar toolbar, Toolbar toolbar2) {
        this.AudioAttributesCompatParcelizer = toolbar;
        this.write = toolbar2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final Toolbar IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static HlsMediaPlaylist IconCompatParcelizer(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Toolbar toolbar = (Toolbar) view;
        return new HlsMediaPlaylist(toolbar, toolbar);
    }
}
