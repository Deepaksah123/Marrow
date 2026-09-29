package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.setSubtitleConfigurations;

/* JADX INFO: loaded from: classes2.dex */
public interface ImageHeaderParser {
    ImageType AudioAttributesCompatParcelizer(ByteBuffer byteBuffer) throws IOException;

    int RemoteActionCompatParcelizer(ByteBuffer byteBuffer, setSubtitleConfigurations setsubtitleconfigurations) throws IOException;

    ImageType read(InputStream inputStream) throws IOException;

    int write(InputStream inputStream, setSubtitleConfigurations setsubtitleconfigurations) throws IOException;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean AudioAttributesCompatParcelizer;

        ImageType(boolean z) {
            this.AudioAttributesCompatParcelizer = z;
        }

        public final boolean hasAlpha() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean isWebp() {
            int i = AnonymousClass5.write[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.ImageHeaderParser$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[ImageType.values().length];
            write = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
