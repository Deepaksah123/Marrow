package kotlin;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
final class setPytMcqIds extends getDecoderName<setTimelineId<?>> {
    private final AtomicReference<Object> read = new AtomicReference<>(null);

    @Override // kotlin.getDecoderName
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(setTimelineId<?> settimelineid) {
        return write();
    }

    @Override // kotlin.getDecoderName
    public final /* bridge */ /* synthetic */ SampleVideos[] read(setTimelineId<?> settimelineid) {
        return read();
    }

    private boolean write() {
        if (getPortraitDurationMs.RemoteActionCompatParcelizer(this.read) != null) {
            return false;
        }
        getPortraitDurationMs.AudioAttributesCompatParcelizer(this.read, setStartTime.write);
        return true;
    }

    private SampleVideos<getShowPopup>[] read() {
        getPortraitDurationMs.AudioAttributesCompatParcelizer(this.read, null);
        return getFirstBufferDurationMs.read;
    }

    public final void RemoteActionCompatParcelizer() {
        AtomicReference<Object> atomicReference = this.read;
        while (true) {
            Object objRemoteActionCompatParcelizer = getPortraitDurationMs.RemoteActionCompatParcelizer(atomicReference);
            if (objRemoteActionCompatParcelizer == null || objRemoteActionCompatParcelizer == setStartTime.read) {
                return;
            }
            if (objRemoteActionCompatParcelizer == setStartTime.write) {
                if (setBackInvokedCallbackEnabled.read(this.read, objRemoteActionCompatParcelizer, setStartTime.read)) {
                    return;
                }
            } else if (setBackInvokedCallbackEnabled.read(this.read, objRemoteActionCompatParcelizer, setStartTime.write)) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                ((setStateSolvedCount) objRemoteActionCompatParcelizer).resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
                return;
            }
        }
    }

    public final boolean IconCompatParcelizer() {
        Object andSet = this.read.getAndSet(setStartTime.write);
        toMagicModuleMetaRepoModel.write(andSet);
        getCollegeId.write();
        return andSet == setStartTime.read;
    }

    public final Object write(SampleVideos<? super getShowPopup> sampleVideos) {
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        getCollegeId.write();
        if (!setBackInvokedCallbackEnabled.read(this.read, setStartTime.write, setstatesolvedcount2)) {
            getCollegeId.write();
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstatesolvedcount2.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
        }
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }
}
