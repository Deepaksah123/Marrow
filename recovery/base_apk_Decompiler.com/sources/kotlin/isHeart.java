package kotlin;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class isHeart {

    interface AudioAttributesCompatParcelizer {
        ImageHeaderParser.ImageType IconCompatParcelizer(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    interface write {
        int RemoteActionCompatParcelizer(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static ImageHeaderParser.ImageType IconCompatParcelizer(List<ImageHeaderParser> list, final InputStream inputStream, setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new setDisplayTitle(inputStream, setsubtitleconfigurations);
        }
        inputStream.mark(5242880);
        return AudioAttributesCompatParcelizer(list, new AudioAttributesCompatParcelizer() { // from class: o.isHeart.5
            @Override // o.isHeart.AudioAttributesCompatParcelizer
            public final ImageHeaderParser.ImageType IconCompatParcelizer(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.read(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType AudioAttributesCompatParcelizer(List<ImageHeaderParser> list, final ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return AudioAttributesCompatParcelizer(list, new AudioAttributesCompatParcelizer() { // from class: o.isHeart.4
            @Override // o.isHeart.AudioAttributesCompatParcelizer
            public final ImageHeaderParser.ImageType IconCompatParcelizer(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.AudioAttributesCompatParcelizer(byteBuffer);
                } finally {
                    maybeReleaseChildSource.write(byteBuffer);
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType IconCompatParcelizer(List<ImageHeaderParser> list, final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        return AudioAttributesCompatParcelizer(list, new AudioAttributesCompatParcelizer() { // from class: o.isHeart.2
            @Override // o.isHeart.AudioAttributesCompatParcelizer
            public final ImageHeaderParser.ImageType IconCompatParcelizer(ImageHeaderParser imageHeaderParser) throws Throwable {
                setDisplayTitle setdisplaytitle;
                try {
                    setdisplaytitle = new setDisplayTitle(new FileInputStream(parcelFileDescriptorRewinder.IconCompatParcelizer().getFileDescriptor()), setsubtitleconfigurations);
                    try {
                        ImageHeaderParser.ImageType imageType = imageHeaderParser.read(setdisplaytitle);
                        setdisplaytitle.write();
                        parcelFileDescriptorRewinder.IconCompatParcelizer();
                        return imageType;
                    } catch (Throwable th) {
                        th = th;
                        if (setdisplaytitle != null) {
                            setdisplaytitle.write();
                        }
                        parcelFileDescriptorRewinder.IconCompatParcelizer();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    setdisplaytitle = null;
                }
            }
        });
    }

    private static ImageHeaderParser.ImageType AudioAttributesCompatParcelizer(List<ImageHeaderParser> list, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer(list.get(i));
            if (imageTypeIconCompatParcelizer != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeIconCompatParcelizer;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int RemoteActionCompatParcelizer(List<ImageHeaderParser> list, final ByteBuffer byteBuffer, final setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return RemoteActionCompatParcelizer(list, new write() { // from class: o.isHeart.3
            @Override // o.isHeart.write
            public final int RemoteActionCompatParcelizer(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.RemoteActionCompatParcelizer(byteBuffer, setsubtitleconfigurations);
                } finally {
                    maybeReleaseChildSource.write(byteBuffer);
                }
            }
        });
    }

    public static int write(List<ImageHeaderParser> list, final InputStream inputStream, final setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new setDisplayTitle(inputStream, setsubtitleconfigurations);
        }
        inputStream.mark(5242880);
        return RemoteActionCompatParcelizer(list, new write() { // from class: o.isHeart.1
            @Override // o.isHeart.write
            public final int RemoteActionCompatParcelizer(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.write(inputStream, setsubtitleconfigurations);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static int read(List<ImageHeaderParser> list, final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        return RemoteActionCompatParcelizer(list, new write() { // from class: o.isHeart.9
            @Override // o.isHeart.write
            public final int RemoteActionCompatParcelizer(ImageHeaderParser imageHeaderParser) throws Throwable {
                setDisplayTitle setdisplaytitle;
                try {
                    setdisplaytitle = new setDisplayTitle(new FileInputStream(parcelFileDescriptorRewinder.IconCompatParcelizer().getFileDescriptor()), setsubtitleconfigurations);
                    try {
                        int iWrite = imageHeaderParser.write(setdisplaytitle, setsubtitleconfigurations);
                        setdisplaytitle.write();
                        parcelFileDescriptorRewinder.IconCompatParcelizer();
                        return iWrite;
                    } catch (Throwable th) {
                        th = th;
                        if (setdisplaytitle != null) {
                            setdisplaytitle.write();
                        }
                        parcelFileDescriptorRewinder.IconCompatParcelizer();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    setdisplaytitle = null;
                }
            }
        });
    }

    private static int RemoteActionCompatParcelizer(List<ImageHeaderParser> list, write writeVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer(list.get(i));
            if (iRemoteActionCompatParcelizer != -1) {
                return iRemoteActionCompatParcelizer;
            }
        }
        return -1;
    }
}
