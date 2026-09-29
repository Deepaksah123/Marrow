package kotlin;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultDrmSessionExternalSyntheticLambda4<T extends Entry> extends onProvisionCompleted<T> implements onEvent<T> {
    private boolean AudioAttributesCompatParcelizer;
    private DashPathEffect RemoteActionCompatParcelizer;
    private boolean read;
    private float write;

    public DefaultDrmSessionExternalSyntheticLambda4(List<T> list, String str) {
        super(list, str);
        this.AudioAttributesCompatParcelizer = true;
        this.read = true;
        this.write = 0.5f;
        this.RemoteActionCompatParcelizer = null;
        this.write = drmSessionAcquired.write(0.5f);
    }

    private void write(boolean z) {
        this.read = false;
    }

    private void IconCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer = false;
    }

    public final void MediaSessionCompatToken() {
        IconCompatParcelizer(false);
        write(false);
    }

    @Override // kotlin.onEvent
    public final boolean ParcelableVolumeInfo() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.onEvent
    public final boolean MediaSessionCompatQueueItem() {
        return this.read;
    }

    @Override // kotlin.onEvent
    public final float onSkipToPrevious() {
        return this.write;
    }

    @Override // kotlin.onEvent
    public final DashPathEffect onStop() {
        return this.RemoteActionCompatParcelizer;
    }
}
