package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class BookReferenceView implements setLockedFromSeek {
    private final CRC32 AudioAttributesCompatParcelizer;
    private final Inflater IconCompatParcelizer;
    private byte RemoteActionCompatParcelizer;
    private final CustomProgressMarkerView read;
    private final setBookImage write;

    public BookReferenceView(setLockedFromSeek setlockedfromseek) {
        toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
        CustomProgressMarkerView customProgressMarkerView = new CustomProgressMarkerView(setlockedfromseek);
        this.read = customProgressMarkerView;
        Inflater inflater = new Inflater(true);
        this.IconCompatParcelizer = inflater;
        this.write = new setBookImage(customProgressMarkerView, inflater);
        this.AudioAttributesCompatParcelizer = new CRC32();
    }

    @Override // kotlin.setLockedFromSeek
    public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.RemoteActionCompatParcelizer == 0) {
            AudioAttributesCompatParcelizer();
            this.RemoteActionCompatParcelizer = (byte) 1;
        }
        if (this.RemoteActionCompatParcelizer == 1) {
            long size = resetcurrentselectedposition.getSize();
            long jAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
            if (jAudioAttributesCompatParcelizer != -1) {
                read(resetcurrentselectedposition, size, jAudioAttributesCompatParcelizer);
                return jAudioAttributesCompatParcelizer;
            }
            this.RemoteActionCompatParcelizer = (byte) 2;
        }
        if (this.RemoteActionCompatParcelizer == 2) {
            IconCompatParcelizer();
            this.RemoteActionCompatParcelizer = (byte) 3;
            if (!this.read.MediaBrowserCompatCustomActionResultReceiver()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    private final void AudioAttributesCompatParcelizer() throws IOException {
        this.read.AudioAttributesImplApi26Parcelizer(10L);
        byte bIconCompatParcelizer = this.read.IconCompatParcelizer.IconCompatParcelizer(3L);
        boolean z = ((bIconCompatParcelizer >> 1) & 1) == 1;
        if (z) {
            read(this.read.IconCompatParcelizer, 0L, 10L);
        }
        RemoteActionCompatParcelizer("ID1ID2", 8075, this.read.onAddQueueItem());
        this.read.AudioAttributesImplBaseParcelizer(8L);
        if (((bIconCompatParcelizer >> 2) & 1) == 1) {
            this.read.AudioAttributesImplApi26Parcelizer(2L);
            if (z) {
                read(this.read.IconCompatParcelizer, 0L, 2L);
            }
            long jHandleMediaPlayPauseIfPendingOnHandler = this.read.IconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler() & 65535;
            this.read.AudioAttributesImplApi26Parcelizer(jHandleMediaPlayPauseIfPendingOnHandler);
            if (z) {
                read(this.read.IconCompatParcelizer, 0L, jHandleMediaPlayPauseIfPendingOnHandler);
            }
            this.read.AudioAttributesImplBaseParcelizer(jHandleMediaPlayPauseIfPendingOnHandler);
        }
        if (((bIconCompatParcelizer >> 3) & 1) == 1) {
            long jAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer();
            if (jAudioAttributesCompatParcelizer == -1) {
                throw new EOFException();
            }
            if (z) {
                read(this.read.IconCompatParcelizer, 0L, jAudioAttributesCompatParcelizer + 1);
            }
            this.read.AudioAttributesImplBaseParcelizer(jAudioAttributesCompatParcelizer + 1);
        }
        if (((bIconCompatParcelizer >> 4) & 1) == 1) {
            long jAudioAttributesCompatParcelizer2 = this.read.AudioAttributesCompatParcelizer();
            if (jAudioAttributesCompatParcelizer2 == -1) {
                throw new EOFException();
            }
            if (z) {
                read(this.read.IconCompatParcelizer, 0L, jAudioAttributesCompatParcelizer2 + 1);
            }
            this.read.AudioAttributesImplBaseParcelizer(jAudioAttributesCompatParcelizer2 + 1);
        }
        if (z) {
            RemoteActionCompatParcelizer("FHCRC", this.read.write(), (short) this.AudioAttributesCompatParcelizer.getValue());
            this.AudioAttributesCompatParcelizer.reset();
        }
    }

    private final void IconCompatParcelizer() throws IOException {
        RemoteActionCompatParcelizer("CRC", this.read.IconCompatParcelizer(), (int) this.AudioAttributesCompatParcelizer.getValue());
        RemoteActionCompatParcelizer("ISIZE", this.read.IconCompatParcelizer(), (int) this.IconCompatParcelizer.getBytesWritten());
    }

    @Override // kotlin.setLockedFromSeek
    public final CustomTextView RemoteActionCompatParcelizer() {
        return this.read.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.write.close();
    }

    private final void read(resetCurrentSelectedPosition resetcurrentselectedposition, long j, long j2) {
        getMarkerPaint getmarkerpaint = resetcurrentselectedposition.head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        while (j >= getmarkerpaint.limit - getmarkerpaint.pos) {
            j -= (long) (getmarkerpaint.limit - getmarkerpaint.pos);
            getmarkerpaint = getmarkerpaint.next;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
        }
        while (j2 > 0) {
            int i = (int) (((long) getmarkerpaint.pos) + j);
            int iMin = (int) Math.min(getmarkerpaint.limit - i, j2);
            this.AudioAttributesCompatParcelizer.update(getmarkerpaint.data, i, iMin);
            j2 -= (long) iMin;
            getmarkerpaint = getmarkerpaint.next;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            j = 0;
        }
    }

    private static void RemoteActionCompatParcelizer(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        throw new IOException(str2);
    }
}
