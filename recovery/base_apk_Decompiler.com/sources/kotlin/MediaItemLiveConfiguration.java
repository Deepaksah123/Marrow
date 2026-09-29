package kotlin;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemLiveConfiguration<Model, Data> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Model, Data> {
    private final write<Data> RemoteActionCompatParcelizer;

    public interface write<Data> {
        Data AudioAttributesCompatParcelizer(String str) throws IllegalArgumentException;

        void read(Data data) throws IOException;

        Class<Data> write();
    }

    public MediaItemLiveConfiguration(write<Data> writeVar) {
        this.RemoteActionCompatParcelizer = writeVar;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> write(Model model, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(model), new RemoteActionCompatParcelizer(model.toString(), this.RemoteActionCompatParcelizer));
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final boolean read(Model model) {
        return model.toString().startsWith("data:image");
    }

    static final class RemoteActionCompatParcelizer<Data> implements fromUri<Data> {
        private final write<Data> AudioAttributesCompatParcelizer;
        private Data IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        @Override // kotlin.fromUri
        public final void AudioAttributesCompatParcelizer() {
        }

        RemoteActionCompatParcelizer(String str, write<Data> writeVar) {
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = writeVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [Data, java.lang.Object] */
        @Override // kotlin.fromUri
        public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super Data> audioAttributesCompatParcelizer) {
            try {
                Data dataAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
                this.IconCompatParcelizer = dataAudioAttributesCompatParcelizer;
                audioAttributesCompatParcelizer.write(dataAudioAttributesCompatParcelizer);
            } catch (IllegalArgumentException e) {
                audioAttributesCompatParcelizer.IconCompatParcelizer(e);
            }
        }

        @Override // kotlin.fromUri
        public final void read() {
            try {
                this.AudioAttributesCompatParcelizer.read(this.IconCompatParcelizer);
            } catch (IOException unused) {
            }
        }

        @Override // kotlin.fromUri
        public final Class<Data> write() {
            return this.AudioAttributesCompatParcelizer.write();
        }

        @Override // kotlin.fromUri
        public final onTracksChanged IconCompatParcelizer() {
            return onTracksChanged.LOCAL;
        }
    }

    public static final class IconCompatParcelizer<Model> implements setTargetOffsetMs<Model, InputStream> {
        private final write<InputStream> AudioAttributesCompatParcelizer = new write<InputStream>() { // from class: o.MediaItemLiveConfiguration.IconCompatParcelizer.2
            @Override // o.MediaItemLiveConfiguration.write
            public final /* synthetic */ InputStream AudioAttributesCompatParcelizer(String str) throws IllegalArgumentException {
                return write(str);
            }

            @Override // o.MediaItemLiveConfiguration.write
            public final /* synthetic */ void read(InputStream inputStream) throws IOException {
                write(inputStream);
            }

            private static InputStream write(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
                return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            }

            private static void write(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // o.MediaItemLiveConfiguration.write
            public final Class<InputStream> write() {
                return InputStream.class;
            }
        };

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Model, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new MediaItemLiveConfiguration(this.AudioAttributesCompatParcelizer);
        }
    }
}
