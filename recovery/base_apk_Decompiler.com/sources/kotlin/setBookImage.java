package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class setBookImage implements setLockedFromSeek {
    private final LessonCompletedDialog AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private boolean read;
    private final Inflater write;

    public setBookImage(LessonCompletedDialog lessonCompletedDialog, Inflater inflater) {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        toMagicModuleMetaRepoModel.write(inflater, "");
        this.AudioAttributesCompatParcelizer = lessonCompletedDialog;
        this.write = inflater;
    }

    @Override // kotlin.setLockedFromSeek
    public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        do {
            long jIconCompatParcelizer = IconCompatParcelizer(resetcurrentselectedposition, j);
            if (jIconCompatParcelizer > 0) {
                return jIconCompatParcelizer;
            }
            if (this.write.finished() || this.write.needsDictionary()) {
                return -1L;
            }
        } while (!this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        throw new EOFException("source exhausted prematurely");
    }

    private long IconCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        if (this.read) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            getMarkerPaint getmarkerpaintIconCompatParcelizer = resetcurrentselectedposition.IconCompatParcelizer(1);
            int iMin = (int) Math.min(j, 8192 - getmarkerpaintIconCompatParcelizer.limit);
            read();
            int iInflate = this.write.inflate(getmarkerpaintIconCompatParcelizer.data, getmarkerpaintIconCompatParcelizer.limit, iMin);
            AudioAttributesCompatParcelizer();
            if (iInflate > 0) {
                getmarkerpaintIconCompatParcelizer.limit += iInflate;
                long j2 = iInflate;
                resetcurrentselectedposition.MediaBrowserCompatItemReceiver(resetcurrentselectedposition.getSize() + j2);
                return j2;
            }
            if (getmarkerpaintIconCompatParcelizer.pos == getmarkerpaintIconCompatParcelizer.limit) {
                resetcurrentselectedposition.head = getmarkerpaintIconCompatParcelizer.AudioAttributesCompatParcelizer();
                setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaintIconCompatParcelizer);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    private boolean read() throws IOException {
        if (!this.write.needsInput()) {
            return false;
        }
        if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            return true;
        }
        getMarkerPaint getmarkerpaint = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().head;
        toMagicModuleMetaRepoModel.write(getmarkerpaint);
        this.IconCompatParcelizer = getmarkerpaint.limit - getmarkerpaint.pos;
        this.write.setInput(getmarkerpaint.data, getmarkerpaint.pos, this.IconCompatParcelizer);
        return false;
    }

    private final void AudioAttributesCompatParcelizer() throws IOException {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return;
        }
        int remaining = i - this.write.getRemaining();
        this.IconCompatParcelizer -= remaining;
        this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(remaining);
    }

    @Override // kotlin.setLockedFromSeek
    public final CustomTextView RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.read) {
            return;
        }
        this.write.end();
        this.read = true;
        this.AudioAttributesCompatParcelizer.close();
    }
}
