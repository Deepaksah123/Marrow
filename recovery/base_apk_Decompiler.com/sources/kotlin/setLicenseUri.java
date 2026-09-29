package kotlin;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class setLicenseUri<Data> implements MediaItemLocalConfigurationExternalSyntheticLambda0<File, Data> {
    private final write<Data> AudioAttributesCompatParcelizer;

    public interface write<Data> {
        Data IconCompatParcelizer(File file) throws FileNotFoundException;

        Class<Data> read();

        void write(Data data) throws IOException;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(File file) {
        return true;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer write(File file, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return read2(file);
    }

    public setLicenseUri(write<Data> writeVar) {
        this.AudioAttributesCompatParcelizer = writeVar;
    }

    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<Data> read2(File file) {
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(file), new read(file, this.AudioAttributesCompatParcelizer));
    }

    static final class read<Data> implements fromUri<Data> {
        private Data AudioAttributesCompatParcelizer;
        private final write<Data> IconCompatParcelizer;
        private final File RemoteActionCompatParcelizer;

        @Override // kotlin.fromUri
        public final void AudioAttributesCompatParcelizer() {
        }

        read(File file, write<Data> writeVar) {
            this.RemoteActionCompatParcelizer = file;
            this.IconCompatParcelizer = writeVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [Data, java.lang.Object] */
        @Override // kotlin.fromUri
        public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super Data> audioAttributesCompatParcelizer) {
            try {
                Data dataIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
                this.AudioAttributesCompatParcelizer = dataIconCompatParcelizer;
                audioAttributesCompatParcelizer.write(dataIconCompatParcelizer);
            } catch (FileNotFoundException e) {
                audioAttributesCompatParcelizer.IconCompatParcelizer(e);
            }
        }

        @Override // kotlin.fromUri
        public final void read() {
            Data data = this.AudioAttributesCompatParcelizer;
            if (data != null) {
                try {
                    this.IconCompatParcelizer.write(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // kotlin.fromUri
        public final Class<Data> write() {
            return this.IconCompatParcelizer.read();
        }

        @Override // kotlin.fromUri
        public final onTracksChanged IconCompatParcelizer() {
            return onTracksChanged.LOCAL;
        }
    }

    public static class AudioAttributesCompatParcelizer<Data> implements setTargetOffsetMs<File, Data> {
        private final write<Data> write;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        public AudioAttributesCompatParcelizer(write<Data> writeVar) {
            this.write = writeVar;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<File, Data> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setLicenseUri(this.write);
        }
    }

    public static class RemoteActionCompatParcelizer extends AudioAttributesCompatParcelizer<InputStream> {
        public RemoteActionCompatParcelizer() {
            super(new write<InputStream>() { // from class: o.setLicenseUri.RemoteActionCompatParcelizer.3
                @Override // o.setLicenseUri.write
                public final /* synthetic */ InputStream IconCompatParcelizer(File file) throws FileNotFoundException {
                    return RemoteActionCompatParcelizer(file);
                }

                @Override // o.setLicenseUri.write
                public final /* synthetic */ void write(InputStream inputStream) throws IOException {
                    IconCompatParcelizer(inputStream);
                }

                private static InputStream RemoteActionCompatParcelizer(File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }

                private static void IconCompatParcelizer(InputStream inputStream) throws IOException {
                    inputStream.close();
                }

                @Override // o.setLicenseUri.write
                public final Class<InputStream> read() {
                    return InputStream.class;
                }
            });
        }
    }

    public static class IconCompatParcelizer extends AudioAttributesCompatParcelizer<ParcelFileDescriptor> {
        public IconCompatParcelizer() {
            super(new write<ParcelFileDescriptor>() { // from class: o.setLicenseUri.IconCompatParcelizer.3
                @Override // o.setLicenseUri.write
                public final /* synthetic */ ParcelFileDescriptor IconCompatParcelizer(File file) throws FileNotFoundException {
                    return write(file);
                }

                @Override // o.setLicenseUri.write
                public final /* synthetic */ void write(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                    AudioAttributesCompatParcelizer(parcelFileDescriptor);
                }

                private static ParcelFileDescriptor write(File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file, 268435456);
                }

                private static void AudioAttributesCompatParcelizer(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                    parcelFileDescriptor.close();
                }

                @Override // o.setLicenseUri.write
                public final Class<ParcelFileDescriptor> read() {
                    return ParcelFileDescriptor.class;
                }
            });
        }
    }
}
