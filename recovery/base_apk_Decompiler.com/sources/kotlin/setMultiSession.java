package kotlin;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class setMultiSession implements MediaItemLocalConfigurationExternalSyntheticLambda0<File, ByteBuffer> {
    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(File file) {
        return true;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* bridge */ /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<ByteBuffer> write(File file, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return write(file);
    }

    private static MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<ByteBuffer> write(File file) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(file), new RemoteActionCompatParcelizer(file));
    }

    public static class write implements setTargetOffsetMs<File, ByteBuffer> {
        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<File, ByteBuffer> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setMultiSession();
        }
    }

    static final class RemoteActionCompatParcelizer implements fromUri<ByteBuffer> {
        private final File AudioAttributesCompatParcelizer;

        @Override // kotlin.fromUri
        public final void AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.fromUri
        public final void read() {
        }

        RemoteActionCompatParcelizer(File file) {
            this.AudioAttributesCompatParcelizer = file;
        }

        @Override // kotlin.fromUri
        public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super ByteBuffer> audioAttributesCompatParcelizer) {
            try {
                audioAttributesCompatParcelizer.write(maybeReleaseChildSource.read(this.AudioAttributesCompatParcelizer));
            } catch (IOException e) {
                audioAttributesCompatParcelizer.IconCompatParcelizer(e);
            }
        }

        @Override // kotlin.fromUri
        public final Class<ByteBuffer> write() {
            return ByteBuffer.class;
        }

        @Override // kotlin.fromUri
        public final onTracksChanged IconCompatParcelizer() {
            return onTracksChanged.LOCAL;
        }
    }
}
