package kotlin;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultDrmSessionReferenceCountListener<T extends Entry> extends DefaultDrmSessionExternalSyntheticLambda4<T> implements DefaultDrmSessionManagerMediaDrmEventListener<T> {
    private float AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private Drawable read;
    private int write;

    public DefaultDrmSessionReferenceCountListener(List<T> list, String str) {
        super(list, str);
        this.RemoteActionCompatParcelizer = Color.rgb(140, 234, 255);
        this.write = 85;
        this.AudioAttributesCompatParcelizer = 2.5f;
        this.IconCompatParcelizer = false;
    }

    @Override // kotlin.DefaultDrmSessionManagerMediaDrmEventListener
    public final int onSetPlaybackSpeed() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.DefaultDrmSessionManagerMediaDrmEventListener
    public final Drawable onSetShuffleMode() {
        return this.read;
    }

    public final void read(Drawable drawable) {
        this.read = drawable;
    }

    @Override // kotlin.DefaultDrmSessionManagerMediaDrmEventListener
    public final int onSetCaptioningEnabled() {
        return this.write;
    }

    @Override // kotlin.DefaultDrmSessionManagerMediaDrmEventListener
    public final float onSkipToQueueItem() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void onSkipToNext() {
        this.IconCompatParcelizer = true;
    }

    @Override // kotlin.DefaultDrmSessionManagerMediaDrmEventListener
    public final boolean setSessionImpl() {
        return this.IconCompatParcelizer;
    }
}
