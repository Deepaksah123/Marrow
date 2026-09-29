package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
interface setFolderType {
    Bitmap IconCompatParcelizer(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType IconCompatParcelizer() throws IOException;

    void RemoteActionCompatParcelizer();

    int read() throws IOException;

    public static final class read implements setFolderType {
        private final List<ImageHeaderParser> AudioAttributesCompatParcelizer;
        private final ByteBuffer IconCompatParcelizer;
        private final setSubtitleConfigurations RemoteActionCompatParcelizer;

        @Override // kotlin.setFolderType
        public final void RemoteActionCompatParcelizer() {
        }

        read(ByteBuffer byteBuffer, List<ImageHeaderParser> list, setSubtitleConfigurations setsubtitleconfigurations) {
            this.IconCompatParcelizer = byteBuffer;
            this.AudioAttributesCompatParcelizer = list;
            this.RemoteActionCompatParcelizer = setsubtitleconfigurations;
        }

        @Override // kotlin.setFolderType
        public final Bitmap IconCompatParcelizer(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(AudioAttributesCompatParcelizer(), null, options);
        }

        @Override // kotlin.setFolderType
        public final ImageHeaderParser.ImageType IconCompatParcelizer() throws IOException {
            return isHeart.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, maybeReleaseChildSource.write(this.IconCompatParcelizer));
        }

        @Override // kotlin.setFolderType
        public final int read() throws IOException {
            return isHeart.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, maybeReleaseChildSource.write(this.IconCompatParcelizer), this.RemoteActionCompatParcelizer);
        }

        private InputStream AudioAttributesCompatParcelizer() {
            return maybeReleaseChildSource.RemoteActionCompatParcelizer(maybeReleaseChildSource.write(this.IconCompatParcelizer));
        }
    }

    public static final class IconCompatParcelizer implements setFolderType {
        private final List<ImageHeaderParser> AudioAttributesCompatParcelizer;
        private final setSubtitleConfigurations read;
        private final r8lambdadCi6oJEm_9YlC4rxMqZ6EISWjY0 write;

        IconCompatParcelizer(InputStream inputStream, List<ImageHeaderParser> list, setSubtitleConfigurations setsubtitleconfigurations) {
            this.read = (setSubtitleConfigurations) moveMediaSource.AudioAttributesCompatParcelizer(setsubtitleconfigurations);
            this.AudioAttributesCompatParcelizer = (List) moveMediaSource.AudioAttributesCompatParcelizer(list);
            this.write = new r8lambdadCi6oJEm_9YlC4rxMqZ6EISWjY0(inputStream, setsubtitleconfigurations);
        }

        @Override // kotlin.setFolderType
        public final Bitmap IconCompatParcelizer(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.write.IconCompatParcelizer(), null, options);
        }

        @Override // kotlin.setFolderType
        public final ImageHeaderParser.ImageType IconCompatParcelizer() throws IOException {
            return isHeart.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write.IconCompatParcelizer(), this.read);
        }

        @Override // kotlin.setFolderType
        public final int read() throws IOException {
            return isHeart.write(this.AudioAttributesCompatParcelizer, this.write.IconCompatParcelizer(), this.read);
        }

        @Override // kotlin.setFolderType
        public final void RemoteActionCompatParcelizer() {
            this.write.AudioAttributesCompatParcelizer();
        }
    }

    public static final class AudioAttributesCompatParcelizer implements setFolderType {
        private final ParcelFileDescriptorRewinder RemoteActionCompatParcelizer;
        private final setSubtitleConfigurations read;
        private final List<ImageHeaderParser> write;

        @Override // kotlin.setFolderType
        public final void RemoteActionCompatParcelizer() {
        }

        AudioAttributesCompatParcelizer(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, setSubtitleConfigurations setsubtitleconfigurations) {
            this.read = (setSubtitleConfigurations) moveMediaSource.AudioAttributesCompatParcelizer(setsubtitleconfigurations);
            this.write = (List) moveMediaSource.AudioAttributesCompatParcelizer(list);
            this.RemoteActionCompatParcelizer = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // kotlin.setFolderType
        public final Bitmap IconCompatParcelizer(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getFileDescriptor(), null, options);
        }

        @Override // kotlin.setFolderType
        public final ImageHeaderParser.ImageType IconCompatParcelizer() throws IOException {
            return isHeart.IconCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, this.read);
        }

        @Override // kotlin.setFolderType
        public final int read() throws IOException {
            return isHeart.read(this.write, this.RemoteActionCompatParcelizer, this.read);
        }
    }
}
