package kotlin;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
final class toPeriodTime implements setRendererOffset, findExplicitNames {
    private final Set<toRendererTime> AudioAttributesCompatParcelizer = new HashSet();
    private final anyIgnorals RemoteActionCompatParcelizer;

    toPeriodTime(anyIgnorals anyignorals) {
        this.RemoteActionCompatParcelizer = anyignorals;
        anyignorals.IconCompatParcelizer(this);
    }

    @withMember(read = anyIgnorals.read.ON_START)
    public final void onStart(hasGetter hasgetter) {
        Iterator it = moveMediaSourceRange.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((toRendererTime) it.next()).AudioAttributesImplApi21Parcelizer();
        }
    }

    @withMember(read = anyIgnorals.read.ON_STOP)
    public final void onStop(hasGetter hasgetter) {
        Iterator it = moveMediaSourceRange.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((toRendererTime) it.next()).MediaBrowserCompatItemReceiver();
        }
    }

    @withMember(read = anyIgnorals.read.ON_DESTROY)
    public final void onDestroy(hasGetter hasgetter) {
        Iterator it = moveMediaSourceRange.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((toRendererTime) it.next()).AudioAttributesImplApi26Parcelizer();
        }
        hasgetter.getLifecycle().AudioAttributesCompatParcelizer(this);
    }

    @Override // kotlin.setRendererOffset
    public final void write(toRendererTime torenderertime) {
        this.AudioAttributesCompatParcelizer.add(torenderertime);
        if (this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer() == anyIgnorals.write.AudioAttributesCompatParcelizer) {
            torenderertime.AudioAttributesImplApi26Parcelizer();
        } else if (this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(anyIgnorals.write.RemoteActionCompatParcelizer)) {
            torenderertime.AudioAttributesImplApi21Parcelizer();
        } else {
            torenderertime.MediaBrowserCompatItemReceiver();
        }
    }

    @Override // kotlin.setRendererOffset
    public final void read(toRendererTime torenderertime) {
        this.AudioAttributesCompatParcelizer.remove(torenderertime);
    }
}
