package kotlin;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Process;
import java.io.IOException;
import java.io.InputStream;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;

/* JADX INFO: loaded from: classes2.dex */
public final class setScheme<DataT> implements MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, DataT> {
    public static int AudioAttributesCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    private final read<DataT> read;
    private final Context write;

    interface read<DataT> {
        Class<DataT> AudioAttributesCompatParcelizer();

        DataT AudioAttributesCompatParcelizer(Resources.Theme theme, Resources resources, int i);

        void AudioAttributesCompatParcelizer(DataT datat) throws IOException;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ boolean read(Integer num) {
        return true;
    }

    @Override // kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0
    public final /* synthetic */ MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer write(Integer num, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return IconCompatParcelizer(num, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    public static setTargetOffsetMs<Integer, InputStream> IconCompatParcelizer(Context context) {
        return new write(context);
    }

    public static setTargetOffsetMs<Integer, AssetFileDescriptor> write(Context context) {
        return new RemoteActionCompatParcelizer(context);
    }

    public static setTargetOffsetMs<Integer, Drawable> RemoteActionCompatParcelizer(Context context) {
        return new IconCompatParcelizer(context);
    }

    setScheme(Context context, read<DataT> readVar) {
        this.write = context.getApplicationContext();
        this.read = readVar;
    }

    private MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<DataT> IconCompatParcelizer(Integer num, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        Resources resources;
        Resources.Theme theme = (Resources.Theme) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(setTotalDiscCount.IconCompatParcelizer);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.write.getResources();
        }
        return new MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<>(new getWindowIndexForChildWindowIndex(num), new AudioAttributesCompatParcelizer(theme, resources, this.read, num.intValue()));
    }

    public static int IconCompatParcelizer() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 9108758;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int iMyPid = Process.myPid();
        RemoteActionCompatParcelizer = iMyPid;
        return iMyPid;
    }

    static final class RemoteActionCompatParcelizer implements setTargetOffsetMs<Integer, AssetFileDescriptor>, read<AssetFileDescriptor> {
        private final Context read;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // o.setScheme.read
        public final /* synthetic */ AssetFileDescriptor AudioAttributesCompatParcelizer(Resources.Theme theme, Resources resources, int i) {
            return write(resources, i);
        }

        @Override // o.setScheme.read
        public final /* synthetic */ void AudioAttributesCompatParcelizer(AssetFileDescriptor assetFileDescriptor) throws IOException {
            read(assetFileDescriptor);
        }

        RemoteActionCompatParcelizer(Context context) {
            this.read = context;
        }

        private static AssetFileDescriptor write(Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }

        private static void read(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // o.setScheme.read
        public final Class<AssetFileDescriptor> AudioAttributesCompatParcelizer() {
            return AssetFileDescriptor.class;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, AssetFileDescriptor> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setScheme(this.read, this);
        }
    }

    static final class write implements setTargetOffsetMs<Integer, InputStream>, read<InputStream> {
        private final Context AudioAttributesCompatParcelizer;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // o.setScheme.read
        public final /* bridge */ /* synthetic */ InputStream AudioAttributesCompatParcelizer(Resources.Theme theme, Resources resources, int i) {
            return AudioAttributesCompatParcelizer(resources, i);
        }

        @Override // o.setScheme.read
        public final /* synthetic */ void AudioAttributesCompatParcelizer(InputStream inputStream) throws IOException {
            IconCompatParcelizer(inputStream);
        }

        write(Context context) {
            this.AudioAttributesCompatParcelizer = context;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, InputStream> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setScheme(this.AudioAttributesCompatParcelizer, this);
        }

        private static InputStream AudioAttributesCompatParcelizer(Resources resources, int i) {
            return resources.openRawResource(i);
        }

        private static void IconCompatParcelizer(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // o.setScheme.read
        public final Class<InputStream> AudioAttributesCompatParcelizer() {
            return InputStream.class;
        }
    }

    static final class IconCompatParcelizer implements setTargetOffsetMs<Integer, Drawable>, read<Drawable> {
        private final Context write;

        @Override // kotlin.setTargetOffsetMs
        public final void read() {
        }

        @Override // o.setScheme.read
        public final /* synthetic */ Drawable AudioAttributesCompatParcelizer(Resources.Theme theme, Resources resources, int i) {
            return RemoteActionCompatParcelizer(theme, i);
        }

        @Override // o.setScheme.read
        public final /* synthetic */ void AudioAttributesCompatParcelizer(Drawable drawable) throws IOException {
        }

        IconCompatParcelizer(Context context) {
            this.write = context;
        }

        private Drawable RemoteActionCompatParcelizer(Resources.Theme theme, int i) {
            return setReleaseMonth.read(this.write, i, theme);
        }

        @Override // o.setScheme.read
        public final Class<Drawable> AudioAttributesCompatParcelizer() {
            return Drawable.class;
        }

        @Override // kotlin.setTargetOffsetMs
        public final MediaItemLocalConfigurationExternalSyntheticLambda0<Integer, Drawable> write(MediaItemRequestMetadataExternalSyntheticLambda0 mediaItemRequestMetadataExternalSyntheticLambda0) {
            return new setScheme(this.write, this);
        }
    }

    static final class AudioAttributesCompatParcelizer<DataT> implements fromUri<DataT> {
        private final Resources AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private DataT RemoteActionCompatParcelizer;
        private final read<DataT> read;
        private final Resources.Theme write;

        @Override // kotlin.fromUri
        public final void AudioAttributesCompatParcelizer() {
        }

        AudioAttributesCompatParcelizer(Resources.Theme theme, Resources resources, read<DataT> readVar, int i) {
            this.write = theme;
            this.AudioAttributesCompatParcelizer = resources;
            this.read = readVar;
            this.IconCompatParcelizer = i;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [DataT, java.lang.Object] */
        @Override // kotlin.fromUri
        public final void write(setSampleRate setsamplerate, fromUri.AudioAttributesCompatParcelizer<? super DataT> audioAttributesCompatParcelizer) {
            try {
                DataT datatAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = datatAudioAttributesCompatParcelizer;
                audioAttributesCompatParcelizer.write(datatAudioAttributesCompatParcelizer);
            } catch (Resources.NotFoundException e) {
                audioAttributesCompatParcelizer.IconCompatParcelizer(e);
            }
        }

        @Override // kotlin.fromUri
        public final void read() {
            DataT datat = this.RemoteActionCompatParcelizer;
            if (datat != null) {
                try {
                    this.read.AudioAttributesCompatParcelizer(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // kotlin.fromUri
        public final Class<DataT> write() {
            return this.read.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.fromUri
        public final onTracksChanged IconCompatParcelizer() {
            return onTracksChanged.LOCAL;
        }
    }
}
