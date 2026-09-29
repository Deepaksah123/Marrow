package kotlin;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getFollowingMediaPeriodInfoOfCurrentPeriod implements toRendererTime {
    private final Set<MediaSourceInfoHolder<?>> RemoteActionCompatParcelizer = Collections.newSetFromMap(new WeakHashMap());

    public final void write(MediaSourceInfoHolder<?> mediaSourceInfoHolder) {
        this.RemoteActionCompatParcelizer.add(mediaSourceInfoHolder);
    }

    public final void RemoteActionCompatParcelizer(MediaSourceInfoHolder<?> mediaSourceInfoHolder) {
        this.RemoteActionCompatParcelizer.remove(mediaSourceInfoHolder);
    }

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi21Parcelizer() {
        Iterator it = moveMediaSourceRange.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((MediaSourceInfoHolder) it.next()).AudioAttributesImplApi21Parcelizer();
        }
    }

    @Override // kotlin.toRendererTime
    public final void MediaBrowserCompatItemReceiver() {
        Iterator it = moveMediaSourceRange.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((MediaSourceInfoHolder) it.next()).MediaBrowserCompatItemReceiver();
        }
    }

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi26Parcelizer() {
        Iterator it = moveMediaSourceRange.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((MediaSourceInfoHolder) it.next()).AudioAttributesImplApi26Parcelizer();
        }
    }

    public final List<MediaSourceInfoHolder<?>> AudioAttributesCompatParcelizer() {
        return moveMediaSourceRange.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final void write() {
        this.RemoteActionCompatParcelizer.clear();
    }
}
