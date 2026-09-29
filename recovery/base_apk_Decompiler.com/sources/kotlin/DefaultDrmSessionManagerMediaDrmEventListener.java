package kotlin;

import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;

/* JADX INFO: loaded from: classes2.dex */
public interface DefaultDrmSessionManagerMediaDrmEventListener<T extends Entry> extends onEvent<T> {
    int onSetCaptioningEnabled();

    int onSetPlaybackSpeed();

    Drawable onSetShuffleMode();

    float onSkipToQueueItem();

    boolean setSessionImpl();
}
