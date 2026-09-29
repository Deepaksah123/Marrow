package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0014"}, d2 = {"Lo/deliverCancellation;", "", "<init>", "()V", "", "p0", "p1", "Lo/deliverCancellation$RemoteActionCompatParcelizer;", "write", "(II)Lo/deliverCancellation$RemoteActionCompatParcelizer;", "", "IconCompatParcelizer", "(Lo/deliverCancellation$RemoteActionCompatParcelizer;)V", "", "read", "()Z", "Lo/UTF32Reader;", "AudioAttributesCompatParcelizer", "Lo/UTF32Reader;", "RemoteActionCompatParcelizer", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class deliverCancellation {
    public static final int IconCompatParcelizer = UTF32Reader.read;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer = new UTF32Reader<>(new RemoteActionCompatParcelizer[16], 0);

    public final RemoteActionCompatParcelizer write(int p0, int p1) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(p0, p1);
        this.RemoteActionCompatParcelizer.read(remoteActionCompatParcelizer);
        return remoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(RemoteActionCompatParcelizer p0) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(p0);
    }

    public final boolean read() {
        return this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() != 0;
    }

    public final int write() {
        int iconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer().getIconCompatParcelizer();
        UTF32Reader<RemoteActionCompatParcelizer> uTF32Reader = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = remoteActionCompatParcelizerArr[i];
            if (remoteActionCompatParcelizer.getIconCompatParcelizer() < iconCompatParcelizer) {
                iconCompatParcelizer = remoteActionCompatParcelizer.getIconCompatParcelizer();
            }
        }
        if (iconCompatParcelizer < 0) {
            getRootStableInsets.RemoteActionCompatParcelizer("negative minIndex");
        }
        return iconCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        int audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer().getAudioAttributesCompatParcelizer();
        UTF32Reader<RemoteActionCompatParcelizer> uTF32Reader = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer2 = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer2; i++) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = remoteActionCompatParcelizerArr[i];
            if (remoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() > audioAttributesCompatParcelizer) {
                audioAttributesCompatParcelizer = remoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
            }
        }
        return audioAttributesCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b"}, d2 = {"Lo/deliverCancellation$RemoteActionCompatParcelizer;", "", "", "p0", "p1", "<init>", "(II)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int IconCompatParcelizer;

        public RemoteActionCompatParcelizer(int i, int i2) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
            if (i < 0) {
                getRootStableInsets.RemoteActionCompatParcelizer("negative start index");
            }
            if (i2 >= i) {
                return;
            }
            getRootStableInsets.RemoteActionCompatParcelizer("end index greater than start");
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return this.IconCompatParcelizer == remoteActionCompatParcelizer.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (Integer.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
