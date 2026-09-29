package kotlin;

import com.github.mikephil.charting.data.Entry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class provisionRequired extends requiresSecureDecoder<setSessionKeepaliveMs> {
    public provisionRequired() {
    }

    public provisionRequired(setSessionKeepaliveMs setsessionkeepalivems) {
        super(setsessionkeepalivems);
    }

    public final setSessionKeepaliveMs AudioAttributesCompatParcelizer() {
        return (setSessionKeepaliveMs) this.IconCompatParcelizer.get(0);
    }

    @Override // kotlin.requiresSecureDecoder
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final setSessionKeepaliveMs RemoteActionCompatParcelizer(int i) {
        if (i == 0) {
            return AudioAttributesCompatParcelizer();
        }
        return null;
    }

    @Override // kotlin.requiresSecureDecoder
    public final Entry IconCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        return AudioAttributesCompatParcelizer().IconCompatParcelizer((int) createandacquiresessionwithretry.MediaBrowserCompatCustomActionResultReceiver());
    }

    public final float MediaBrowserCompatMediaItem() {
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < AudioAttributesCompatParcelizer().onMediaButtonEvent(); i++) {
            f += AudioAttributesCompatParcelizer().IconCompatParcelizer(i).read();
        }
        return f;
    }
}
