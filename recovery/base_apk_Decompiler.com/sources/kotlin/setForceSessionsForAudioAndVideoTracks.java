package kotlin;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class setForceSessionsForAudioAndVideoTracks<Data> implements MediaItemLocalConfigurationExternalSyntheticLambda0<byte[], Data> {
    private final read<Data> IconCompatParcelizer;

    public interface read<Data> {
        Data AudioAttributesCompatParcelizer(byte[] bArr);

        Class<Data> write();
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(byte[] bArr) {
        return true;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer write(byte[] bArr, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return AudioAttributesCompatParcelizer(bArr);
    }

    public setForceSessionsForAudioAndVideoTracks(read<Data> readVar) {
        this.IconCompatParcelizer = readVar;
    }

    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> AudioAttributesCompatParcelizer(byte[] bArr) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(bArr), new RemoteActionCompatParcelizer(bArr, this.IconCompatParcelizer));
    }

    static class RemoteActionCompatParcelizer<Data> implements fromUri<Data> {
        private final byte[] AudioAttributesCompatParcelizer;
        private final read<Data> RemoteActionCompatParcelizer;

        @Override // kotlin.fromUri
        public final void AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.fromUri
        public final void read() {
        }

        RemoteActionCompatParcelizer(byte[] bArr, read<Data> readVar) {
            this.AudioAttributesCompatParcelizer = bArr;
            this.RemoteActionCompatParcelizer = readVar;
        }

        @Override // kotlin.fromUri
        public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super Data> audioAttributesCompatParcelizer) {
            audioAttributesCompatParcelizer.write(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
        }

        @Override // kotlin.fromUri
        public final Class<Data> write() {
            return this.RemoteActionCompatParcelizer.write();
        }

        @Override // kotlin.fromUri
        public final onTracksChanged IconCompatParcelizer() {
            return onTracksChanged.LOCAL;
        }
    }

    public static class AudioAttributesCompatParcelizer implements setTargetOffsetMs<byte[], ByteBuffer> {
        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<byte[], ByteBuffer> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setForceSessionsForAudioAndVideoTracks(new read<ByteBuffer>() { // from class: o.setForceSessionsForAudioAndVideoTracks.AudioAttributesCompatParcelizer.4
                @Override // o.setForceSessionsForAudioAndVideoTracks.read
                public final /* synthetic */ ByteBuffer AudioAttributesCompatParcelizer(byte[] bArr) {
                    return IconCompatParcelizer(bArr);
                }

                private static ByteBuffer IconCompatParcelizer(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }

                @Override // o.setForceSessionsForAudioAndVideoTracks.read
                public final Class<ByteBuffer> write() {
                    return ByteBuffer.class;
                }
            });
        }
    }

    public static class write implements setTargetOffsetMs<byte[], InputStream> {
        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<byte[], InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setForceSessionsForAudioAndVideoTracks(new read<InputStream>() { // from class: o.setForceSessionsForAudioAndVideoTracks.write.1
                @Override // o.setForceSessionsForAudioAndVideoTracks.read
                public final /* synthetic */ InputStream AudioAttributesCompatParcelizer(byte[] bArr) {
                    return write(bArr);
                }

                private static InputStream write(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }

                @Override // o.setForceSessionsForAudioAndVideoTracks.read
                public final Class<InputStream> write() {
                    return InputStream.class;
                }
            });
        }
    }
}
