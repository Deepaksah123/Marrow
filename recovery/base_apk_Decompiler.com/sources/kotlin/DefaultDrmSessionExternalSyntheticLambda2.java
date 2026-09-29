package kotlin;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultDrmSessionExternalSyntheticLambda2 extends onMediaDrmEvent<setKeyRequestParameters<? extends Entry>> {
    private getCryptoConfig AudioAttributesImplApi26Parcelizer;
    private DefaultDrmSessionRequestHandler MediaBrowserCompatMediaItem;
    private onProvisionError MediaDescriptionCompat;
    private DefaultDrmSessionExternalSyntheticLambda1 MediaMetadataCompat;
    private queryKeyStatus RatingCompat;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.requiresSecureDecoder
    public final void RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer == 0) {
            this.IconCompatParcelizer = new ArrayList();
        }
        this.IconCompatParcelizer.clear();
        this.MediaBrowserCompatItemReceiver = -3.4028235E38f;
        this.AudioAttributesImplBaseParcelizer = Float.MAX_VALUE;
        this.MediaBrowserCompatCustomActionResultReceiver = -3.4028235E38f;
        this.AudioAttributesImplApi21Parcelizer = Float.MAX_VALUE;
        this.AudioAttributesCompatParcelizer = -3.4028235E38f;
        this.RemoteActionCompatParcelizer = Float.MAX_VALUE;
        this.read = -3.4028235E38f;
        this.write = Float.MAX_VALUE;
        for (onMediaDrmEvent onmediadrmevent : AudioAttributesCompatParcelizer()) {
            onmediadrmevent.RemoteActionCompatParcelizer();
            this.IconCompatParcelizer.addAll((Collection<? extends T>) onmediadrmevent.IconCompatParcelizer());
            if (onmediadrmevent.AudioAttributesImplApi26Parcelizer() > this.MediaBrowserCompatItemReceiver) {
                this.MediaBrowserCompatItemReceiver = onmediadrmevent.AudioAttributesImplApi26Parcelizer();
            }
            if (onmediadrmevent.MediaBrowserCompatItemReceiver() < this.AudioAttributesImplBaseParcelizer) {
                this.AudioAttributesImplBaseParcelizer = onmediadrmevent.MediaBrowserCompatItemReceiver();
            }
            if (onmediadrmevent.AudioAttributesImplApi21Parcelizer() > this.MediaBrowserCompatCustomActionResultReceiver) {
                this.MediaBrowserCompatCustomActionResultReceiver = onmediadrmevent.AudioAttributesImplApi21Parcelizer();
            }
            if (onmediadrmevent.MediaBrowserCompatCustomActionResultReceiver() < this.AudioAttributesImplApi21Parcelizer) {
                this.AudioAttributesImplApi21Parcelizer = onmediadrmevent.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (onmediadrmevent.AudioAttributesCompatParcelizer > this.AudioAttributesCompatParcelizer) {
                this.AudioAttributesCompatParcelizer = onmediadrmevent.AudioAttributesCompatParcelizer;
            }
            if (onmediadrmevent.RemoteActionCompatParcelizer < this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer = onmediadrmevent.RemoteActionCompatParcelizer;
            }
            if (onmediadrmevent.read > this.read) {
                this.read = onmediadrmevent.read;
            }
            if (onmediadrmevent.write < this.write) {
                this.write = onmediadrmevent.write;
            }
        }
    }

    public final onProvisionError MediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final DefaultDrmSessionExternalSyntheticLambda1 MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public final getCryptoConfig MediaBrowserCompatMediaItem() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final DefaultDrmSessionRequestHandler onCustomAction() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final queryKeyStatus handleMediaPlayPauseIfPendingOnHandler() {
        return this.RatingCompat;
    }

    public final List<onMediaDrmEvent> AudioAttributesCompatParcelizer() {
        return new ArrayList();
    }

    private onMediaDrmEvent IconCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer().get(i);
    }

    @Override // kotlin.requiresSecureDecoder
    public final void MediaBrowserCompatSearchResultReceiver() {
        RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [o.setPlayClearSamplesWithoutKeys] */
    @Override // kotlin.requiresSecureDecoder
    public final Entry IconCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        if (createandacquiresessionwithretry.write() >= AudioAttributesCompatParcelizer().size()) {
            return null;
        }
        onMediaDrmEvent onmediadrmeventIconCompatParcelizer = IconCompatParcelizer(createandacquiresessionwithretry.write());
        if (createandacquiresessionwithretry.RemoteActionCompatParcelizer() >= onmediadrmeventIconCompatParcelizer.read()) {
            return null;
        }
        for (Entry entry : onmediadrmeventIconCompatParcelizer.RemoteActionCompatParcelizer(createandacquiresessionwithretry.RemoteActionCompatParcelizer()).read(createandacquiresessionwithretry.MediaBrowserCompatCustomActionResultReceiver())) {
            if (entry.read() == createandacquiresessionwithretry.MediaBrowserCompatItemReceiver() || Float.isNaN(createandacquiresessionwithretry.MediaBrowserCompatItemReceiver())) {
                return entry;
            }
        }
        return null;
    }

    public final setKeyRequestParameters<? extends Entry> read(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        if (createandacquiresessionwithretry.write() >= AudioAttributesCompatParcelizer().size()) {
            return null;
        }
        onMediaDrmEvent onmediadrmeventIconCompatParcelizer = IconCompatParcelizer(createandacquiresessionwithretry.write());
        if (createandacquiresessionwithretry.RemoteActionCompatParcelizer() >= onmediadrmeventIconCompatParcelizer.read()) {
            return null;
        }
        return (setKeyRequestParameters) onmediadrmeventIconCompatParcelizer.IconCompatParcelizer().get(createandacquiresessionwithretry.RemoteActionCompatParcelizer());
    }
}
