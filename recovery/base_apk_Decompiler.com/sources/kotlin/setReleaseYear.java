package kotlin;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setReleaseYear {
    private final setSubtitleConfigurations AudioAttributesCompatParcelizer;
    private final List<ImageHeaderParser> read;

    public static IllegalSeekPositionException<InputStream, Drawable> RemoteActionCompatParcelizer(List<ImageHeaderParser> list, setSubtitleConfigurations setsubtitleconfigurations) {
        return new RemoteActionCompatParcelizer(new setReleaseYear(list, setsubtitleconfigurations));
    }

    public static IllegalSeekPositionException<ByteBuffer, Drawable> AudioAttributesCompatParcelizer(List<ImageHeaderParser> list, setSubtitleConfigurations setsubtitleconfigurations) {
        return new read(new setReleaseYear(list, setsubtitleconfigurations));
    }

    private setReleaseYear(List<ImageHeaderParser> list, setSubtitleConfigurations setsubtitleconfigurations) {
        this.read = list;
        this.AudioAttributesCompatParcelizer = setsubtitleconfigurations;
    }

    final boolean read(ByteBuffer byteBuffer) throws IOException {
        return write(isHeart.AudioAttributesCompatParcelizer(this.read, byteBuffer));
    }

    final boolean AudioAttributesCompatParcelizer(InputStream inputStream) throws IOException {
        return write(isHeart.IconCompatParcelizer(this.read, inputStream, this.AudioAttributesCompatParcelizer));
    }

    private static boolean write(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    static setMimeType<Drawable> write(ImageDecoder.Source source, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new MediaItemSubtitleConfigurationBuilder(i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk));
        if (!(drawableDecodeDrawable instanceof AnimatedImageDrawable)) {
            throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(drawableDecodeDrawable)));
        }
        return new IconCompatParcelizer((AnimatedImageDrawable) drawableDecodeDrawable);
    }

    static final class IconCompatParcelizer implements setMimeType<Drawable> {
        private final AnimatedImageDrawable write;

        IconCompatParcelizer(AnimatedImageDrawable animatedImageDrawable) {
            this.write = animatedImageDrawable;
        }

        @Override // kotlin.setMimeType
        public final Class<Drawable> read() {
            return Drawable.class;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setMimeType
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable RemoteActionCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.setMimeType
        public final int write() {
            return ((this.write.getIntrinsicWidth() * this.write.getIntrinsicHeight()) * moveMediaSourceRange.read(Bitmap.Config.ARGB_8888)) << 1;
        }

        @Override // kotlin.setMimeType
        public final void MediaBrowserCompatCustomActionResultReceiver() {
            this.write.stop();
            this.write.clearAnimationCallbacks();
        }
    }

    static final class RemoteActionCompatParcelizer implements IllegalSeekPositionException<InputStream, Drawable> {
        private final setReleaseYear AudioAttributesCompatParcelizer;

        @Override // kotlin.IllegalSeekPositionException
        public final /* synthetic */ boolean RemoteActionCompatParcelizer(InputStream inputStream, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
            return read(inputStream);
        }

        RemoteActionCompatParcelizer(setReleaseYear setreleaseyear) {
            this.AudioAttributesCompatParcelizer = setreleaseyear;
        }

        private boolean read(InputStream inputStream) throws IOException {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.IllegalSeekPositionException
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public setMimeType<Drawable> AudioAttributesCompatParcelizer(InputStream inputStream, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
            return setReleaseYear.write(ImageDecoder.createSource(maybeReleaseChildSource.read(inputStream)), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
        }
    }

    static final class read implements IllegalSeekPositionException<ByteBuffer, Drawable> {
        private final setReleaseYear read;

        @Override // kotlin.IllegalSeekPositionException
        public final /* synthetic */ boolean RemoteActionCompatParcelizer(ByteBuffer byteBuffer, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
            return write(byteBuffer);
        }

        read(setReleaseYear setreleaseyear) {
            this.read = setreleaseyear;
        }

        private boolean write(ByteBuffer byteBuffer) throws IOException {
            return this.read.read(byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.IllegalSeekPositionException
        public setMimeType<Drawable> AudioAttributesCompatParcelizer(ByteBuffer byteBuffer, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
            return setReleaseYear.write(ImageDecoder.createSource(byteBuffer), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
        }
    }
}
