package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\"\u001c B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B-\b\u0017\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\nJ5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u0014\u0010\u0018R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0001@\u0000X\u0080\f¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0010\u0010\u001bR$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR$\u0010\"\u001a\u0004\u0018\u00010!8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$\"\u0004\b\u0010\u0010%R\u001c\u0010\u001c\u001a\u00020\u000b8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b&\u0010'\"\u0004\b\"\u0010(R\"\u0010&\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010'\u001a\u0004\b\u001c\u0010)\"\u0004\b\u001c\u0010(R\u001c\u0010*\u001a\u00020\u000b8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b\"\u0010)"}, d2 = {"Lo/getCurrentTrackSelections;", "", "<init>", "()V", "Lo/setPriority;", "p0", "Lkotlin/Function1;", "Lo/setForegroundMode;", "", "p1", "(Lo/setPriority;Lo/getAnswerMap;)V", "", "Lo/PropertyValueAny;", "Lo/getCurrentTrackSelections$write;", "p2", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "(IJLo/getAnswerMap;)Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "", "p3", "IconCompatParcelizer", "(IJZLo/getAnswerMap;)Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "", "Lo/setPauseAtEndOfMediaItems;", "()Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "Lo/setPriority;", "()Lo/setPriority;", "write", "Lo/getAnswerMap;", "Lo/setMediaSources;", "Lo/setMediaSources;", "read", "Lo/setAudioSessionId;", "RemoteActionCompatParcelizer", "Lo/setAudioSessionId;", "()Lo/setAudioSessionId;", "(Lo/setAudioSessionId;)V", "AudioAttributesImplApi21Parcelizer", "I", "(I)V", "()I", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getCurrentTrackSelections {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private setPriority IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setMediaSources read;
    private setAudioSessionId RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getAnswerMap<? super setForegroundMode, getShowPopup> AudioAttributesCompatParcelizer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "", "", "AudioAttributesCompatParcelizer", "()V", "write", "Lo/onLoadInBackground;", "Lo/setAudioSessionId$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer();

        void write();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b\u0082\u0001\u0001\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getCurrentTrackSelections$write;", "", "", "p0", "Lo/getKey;", "AudioAttributesCompatParcelizer", "(I)J", "RemoteActionCompatParcelizer", "()I", "IconCompatParcelizer", "read", "Lo/setAudioSessionId$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface write {
        long AudioAttributesCompatParcelizer(int p0);

        /* JADX INFO: renamed from: IconCompatParcelizer */
        int getRead();

        int RemoteActionCompatParcelizer();
    }

    public getCurrentTrackSelections() {
        this.read = new setMediaSources();
        this.write = -1;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    @getRenewGrpId
    public getCurrentTrackSelections(setPriority setpriority, getAnswerMap<? super setForegroundMode, getShowPopup> getanswermap) {
        this();
        this.IconCompatParcelizer = setpriority;
        this.AudioAttributesCompatParcelizer = getanswermap;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final setPriority getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(setAudioSessionId setaudiosessionid) {
        this.RemoteActionCompatParcelizer = setaudiosessionid;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final setAudioSessionId getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.write = i;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void write(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteActionCompatParcelizer AudioAttributesCompatParcelizer$default(getCurrentTrackSelections getcurrenttrackselections, int i, long j, getAnswerMap getanswermap, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            getanswermap = null;
        }
        return getcurrenttrackselections.AudioAttributesCompatParcelizer(i, j, getanswermap);
    }

    public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int p0, long p1, getAnswerMap<? super write, getShowPopup> p2) {
        return IconCompatParcelizer(p0, p1, true, p2);
    }

    public final RemoteActionCompatParcelizer IconCompatParcelizer(int p0, long p1, boolean p2, getAnswerMap<? super write, getShowPopup> p3) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer;
        setAudioSessionId setaudiosessionid = this.RemoteActionCompatParcelizer;
        return (setaudiosessionid == null || (remoteActionCompatParcelizerIconCompatParcelizer = setaudiosessionid.IconCompatParcelizer(p0, p1, this.read, p2, p3)) == null) ? onLoadInBackground.INSTANCE : remoteActionCompatParcelizerIconCompatParcelizer;
    }

    public final List<setPauseAtEndOfMediaItems> IconCompatParcelizer() {
        getAnswerMap<? super setForegroundMode, getShowPopup> getanswermap = this.AudioAttributesCompatParcelizer;
        if (getanswermap == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        read readVar = new read(this.write);
        getanswermap.invoke(readVar);
        List<setPauseAtEndOfMediaItems> listIconCompatParcelizer = readVar.IconCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = listIconCompatParcelizer.size();
        return listIconCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011"}, d2 = {"Lo/getCurrentTrackSelections$read;", "Lo/setForegroundMode;", "", "p0", "<init>", "(Lo/getCurrentTrackSelections;I)V", "", "IconCompatParcelizer", "(I)V", "read", "I", "write", "()I", "", "Lo/setPauseAtEndOfMediaItems;", "()Ljava/util/List;", "", "Ljava/util/List;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class read implements setForegroundMode {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final List<setPauseAtEndOfMediaItems> AudioAttributesCompatParcelizer = new ArrayList();

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int write;

        public read(int i) {
            this.write = i;
        }

        @Override // kotlin.setForegroundMode
        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getWrite() {
            return this.write;
        }

        public final List<setPauseAtEndOfMediaItems> IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.setForegroundMode
        public final void IconCompatParcelizer(int p0) {
            setAudioSessionId remoteActionCompatParcelizer = getCurrentTrackSelections.this.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer == null) {
                return;
            }
            this.AudioAttributesCompatParcelizer.add(remoteActionCompatParcelizer.read(p0, getCurrentTrackSelections.this.read));
        }
    }
}
