package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0006\u001a\u00060\u0001j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0012"}, d2 = {"Lo/includeElement;", "", "<init>", "()V", "", "read", "AudioAttributesCompatParcelizer", "write", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/SynchronizedObject;", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "", "Lo/SampleVideos;", "IconCompatParcelizer", "Ljava/util/List;", "", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class includeElement {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer = new Object();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private List<SampleVideos<getShowPopup>> RemoteActionCompatParcelizer = new ArrayList();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private List<SampleVideos<getShowPopup>> IconCompatParcelizer = new ArrayList();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean write = true;

    public final boolean RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this.AudioAttributesCompatParcelizer) {
            z = this.write;
        }
        return z;
    }

    public final void read() {
        synchronized (this.AudioAttributesCompatParcelizer) {
            this.write = false;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (RemoteActionCompatParcelizer()) {
                return;
            }
            List<SampleVideos<getShowPopup>> list = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
            this.IconCompatParcelizer = list;
            this.write = true;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                SampleVideos<getShowPopup> sampleVideos = list.get(i);
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                sampleVideos.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
            }
            list.clear();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final Object write(SampleVideos<? super getShowPopup> sampleVideos) {
        if (RemoteActionCompatParcelizer()) {
            return getShowPopup.INSTANCE;
        }
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        synchronized (this.AudioAttributesCompatParcelizer) {
            this.RemoteActionCompatParcelizer.add(setstatesolvedcount2);
        }
        setstatesolvedcount2.write((getAnswerMap<? super Throwable, getShowPopup>) new IconCompatParcelizer(setstatesolvedcount2));
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements getAnswerMap<Throwable, getShowPopup> {
        final /* synthetic */ setStateRank<getShowPopup> RemoteActionCompatParcelizer;

        public final void IconCompatParcelizer(Throwable th) {
            Object obj = includeElement.this.AudioAttributesCompatParcelizer;
            includeElement includeelement = includeElement.this;
            setStateRank<getShowPopup> setstaterank = this.RemoteActionCompatParcelizer;
            synchronized (obj) {
                includeelement.RemoteActionCompatParcelizer.remove(setstaterank);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            IconCompatParcelizer(th);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(setStateRank<? super getShowPopup> setstaterank) {
            this.RemoteActionCompatParcelizer = setstaterank;
        }
    }
}
