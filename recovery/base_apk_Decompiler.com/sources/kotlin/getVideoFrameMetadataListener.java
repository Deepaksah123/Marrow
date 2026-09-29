package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface getVideoFrameMetadataListener {

    public static final class IconCompatParcelizer implements getVideoFrameMetadataListener {
        private final int RemoteActionCompatParcelizer;
        private final int read;

        public IconCompatParcelizer(int i, int i2) {
            this.RemoteActionCompatParcelizer = i;
            this.read = i2;
        }

        public final int write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getVideoFrameMetadataListener$read;", "Lo/getVideoFrameMetadataListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read implements getVideoFrameMetadataListener {
        public static final read INSTANCE = new read();

        private read() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getVideoFrameMetadataListener$RemoteActionCompatParcelizer;", "Lo/getVideoFrameMetadataListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements getVideoFrameMetadataListener {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getVideoFrameMetadataListener$AudioAttributesCompatParcelizer;", "Lo/getVideoFrameMetadataListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements getVideoFrameMetadataListener {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getVideoFrameMetadataListener$write;", "Lo/getVideoFrameMetadataListener;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write implements getVideoFrameMetadataListener {
        public static final write INSTANCE = new write();

        private write() {
        }
    }
}
