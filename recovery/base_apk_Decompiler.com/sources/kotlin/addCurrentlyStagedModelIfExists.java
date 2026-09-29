package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0017\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0018\u0010\u001c\u001a\u00020\u000b*\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001b"}, d2 = {"Lo/addCurrentlyStagedModelIfExists;", "Lo/clearModelFromStaging;", "", "p0", "Lkotlin/Function0;", "Lo/isAbstract;", "p1", "Lo/deserializeFromNumber;", "p2", "<init>", "(JLo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V", "", "IconCompatParcelizer", "()I", "AudioAttributesImplBaseParcelizer", "J", "read", "AudioAttributesCompatParcelizer", "Lo/getCreatedOnDateMs;", "RemoteActionCompatParcelizer", "", "Lo/SynchronizedObject;", "Ljava/lang/Object;", "write", "Lo/deserializeFromNumber;", "I", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/deserializeFromNumber;)I", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addCurrentlyStagedModelIfExists implements clearModelFromStaging {
    private final getCreatedOnDateMs<isAbstract> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final long read;
    private final getCreatedOnDateMs<deserializeFromNumber> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private deserializeFromNumber IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Object write = this;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public addCurrentlyStagedModelIfExists(long j, getCreatedOnDateMs<? extends isAbstract> getcreatedondatems, getCreatedOnDateMs<deserializeFromNumber> getcreatedondatems2) {
        this.read = j;
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
        this.RemoteActionCompatParcelizer = getcreatedondatems2;
    }

    private final int RemoteActionCompatParcelizer(deserializeFromNumber deserializefromnumber) {
        int i;
        int iAudioAttributesImplBaseParcelizer;
        synchronized (this.write) {
            if (this.IconCompatParcelizer != deserializefromnumber) {
                if (!deserializefromnumber.write() || deserializefromnumber.getWrite().getRemoteActionCompatParcelizer()) {
                    iAudioAttributesImplBaseParcelizer = deserializefromnumber.AudioAttributesImplBaseParcelizer() - 1;
                } else {
                    int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer(deserializefromnumber.read((int) deserializefromnumber.getRead()), deserializefromnumber.AudioAttributesImplBaseParcelizer() - 1);
                    while (iRemoteActionCompatParcelizer >= 0 && deserializefromnumber.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer) >= ((int) deserializefromnumber.getRead())) {
                        iRemoteActionCompatParcelizer--;
                    }
                    iAudioAttributesImplBaseParcelizer = getQues.write(iRemoteActionCompatParcelizer, 0);
                }
                this.MediaBrowserCompatCustomActionResultReceiver = deserializefromnumber.write(iAudioAttributesImplBaseParcelizer, true);
                this.IconCompatParcelizer = deserializefromnumber;
            }
            i = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return i;
    }

    @Override // kotlin.clearModelFromStaging
    public final int IconCompatParcelizer() {
        deserializeFromNumber deserializefromnumberInvoke = this.RemoteActionCompatParcelizer.invoke();
        if (deserializefromnumberInvoke == null) {
            return 0;
        }
        return RemoteActionCompatParcelizer(deserializefromnumberInvoke);
    }
}
