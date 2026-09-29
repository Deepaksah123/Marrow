package kotlin;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.setVideoAspectRatio;

/* JADX INFO: loaded from: classes4.dex */
final class MagicModuleTimeline extends setVideoAspectRatio {
    protected final byte[] IconCompatParcelizer;
    private int read = 0;

    private static int RatingCompat() {
        return 0;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final int IconCompatParcelizer() {
        return 0;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final boolean RemoteActionCompatParcelizer() {
        return true;
    }

    @Override // kotlin.setVideoAspectRatio, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return iterator();
    }

    MagicModuleTimeline(byte[] bArr) {
        this.IconCompatParcelizer = bArr;
    }

    @Override // kotlin.setVideoAspectRatio
    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer.length;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final void write(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.IconCompatParcelizer, i, bArr, i2, i3);
    }

    @Override // kotlin.setVideoAspectRatio
    final void AudioAttributesCompatParcelizer(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.IconCompatParcelizer, RatingCompat() + i, i2);
    }

    @Override // kotlin.setVideoAspectRatio
    public final String read(String str) throws UnsupportedEncodingException {
        return new String(this.IconCompatParcelizer, RatingCompat(), MediaBrowserCompatCustomActionResultReceiver(), str);
    }

    @Override // kotlin.setVideoAspectRatio
    public final boolean read() {
        return hasChangeDiff.RemoteActionCompatParcelizer(this.IconCompatParcelizer, 0, MediaBrowserCompatCustomActionResultReceiver());
    }

    @Override // kotlin.setVideoAspectRatio
    protected final int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        int iRatingCompat = RatingCompat() + i2;
        return hasChangeDiff.write(i, this.IconCompatParcelizer, iRatingCompat, i3 + iRatingCompat);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setVideoAspectRatio) || MediaBrowserCompatCustomActionResultReceiver() != ((setVideoAspectRatio) obj).MediaBrowserCompatCustomActionResultReceiver()) {
            return false;
        }
        if (MediaBrowserCompatCustomActionResultReceiver() == 0) {
            return true;
        }
        if (obj instanceof MagicModuleTimeline) {
            return write((MagicModuleTimeline) obj, 0, MediaBrowserCompatCustomActionResultReceiver());
        }
        if (obj instanceof getFirstAnswer) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(String.valueOf(obj.getClass()));
        StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(strValueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    final boolean write(MagicModuleTimeline magicModuleTimeline, int i, int i2) {
        if (i2 > magicModuleTimeline.MediaBrowserCompatCustomActionResultReceiver()) {
            int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(iMediaBrowserCompatCustomActionResultReceiver);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 > magicModuleTimeline.MediaBrowserCompatCustomActionResultReceiver()) {
            int iMediaBrowserCompatCustomActionResultReceiver2 = magicModuleTimeline.MediaBrowserCompatCustomActionResultReceiver();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(iMediaBrowserCompatCustomActionResultReceiver2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.IconCompatParcelizer;
        byte[] bArr2 = magicModuleTimeline.IconCompatParcelizer;
        int iRatingCompat = RatingCompat();
        int iRatingCompat2 = RatingCompat() + i;
        while (iRatingCompat < i2) {
            if (bArr[iRatingCompat] != bArr2[iRatingCompat2]) {
                return false;
            }
            iRatingCompat++;
            iRatingCompat2++;
        }
        return true;
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = this.read;
        if (iAudioAttributesCompatParcelizer == 0) {
            int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iMediaBrowserCompatCustomActionResultReceiver, 0, iMediaBrowserCompatCustomActionResultReceiver);
            if (iAudioAttributesCompatParcelizer == 0) {
                iAudioAttributesCompatParcelizer = 1;
            }
            this.read = iAudioAttributesCompatParcelizer;
        }
        return iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final int AudioAttributesImplBaseParcelizer() {
        return this.read;
    }

    @Override // kotlin.setVideoAspectRatio
    protected final int AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        return read(i, this.IconCompatParcelizer, RatingCompat() + i2, i3);
    }

    private static int read(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // kotlin.setVideoAspectRatio
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver */
    public final setVideoAspectRatio.AudioAttributesCompatParcelizer iterator() {
        return new IconCompatParcelizer(this, (byte) 0);
    }

    class IconCompatParcelizer implements setVideoAspectRatio.AudioAttributesCompatParcelizer {
        private int read;
        private final int write;

        /* synthetic */ IconCompatParcelizer(MagicModuleTimeline magicModuleTimeline, byte b) {
            this();
        }

        private IconCompatParcelizer() {
            this.read = 0;
            this.write = MagicModuleTimeline.this.MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.read < this.write;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(AudioAttributesCompatParcelizer());
        }

        @Override // o.setVideoAspectRatio.AudioAttributesCompatParcelizer
        public final byte AudioAttributesCompatParcelizer() {
            try {
                byte[] bArr = MagicModuleTimeline.this.IconCompatParcelizer;
                int i = this.read;
                this.read = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
