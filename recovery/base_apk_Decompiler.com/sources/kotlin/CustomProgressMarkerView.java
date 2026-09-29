package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomProgressMarkerView implements LessonCompletedDialog {
    public boolean AudioAttributesCompatParcelizer;
    public final resetCurrentSelectedPosition IconCompatParcelizer;
    public final setLockedFromSeek write;

    public CustomProgressMarkerView(setLockedFromSeek setlockedfromseek) {
        toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
        this.write = setlockedfromseek;
        this.IconCompatParcelizer = new resetCurrentSelectedPosition();
    }

    @Override // kotlin.LessonCompletedDialog
    public final resetCurrentSelectedPosition AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.LessonCompletedDialog
    public final resetCurrentSelectedPosition read() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.LessonCompletedDialog
    public final String onMediaButtonEvent() {
        return write(Long.MAX_VALUE);
    }

    public final long AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer((byte) 0, 0L, Long.MAX_VALUE);
    }

    @Override // kotlin.LessonCompletedDialog
    public final long IconCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter) {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        return RemoteActionCompatParcelizer(getrelatedmoduleadapter, 0L);
    }

    @Override // kotlin.LessonCompletedDialog
    public final long RemoteActionCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter) {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        return AudioAttributesCompatParcelizer(getrelatedmoduleadapter, 0L);
    }

    public static final class write extends InputStream {
        write() {
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (CustomProgressMarkerView.this.AudioAttributesCompatParcelizer) {
                throw new IOException("closed");
            }
            if (CustomProgressMarkerView.this.IconCompatParcelizer.getSize() == 0 && CustomProgressMarkerView.this.write.AudioAttributesCompatParcelizer(CustomProgressMarkerView.this.IconCompatParcelizer, 8192L) == -1) {
                return -1;
            }
            return CustomProgressMarkerView.this.IconCompatParcelizer.MediaMetadataCompat() & 255;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            toMagicModuleMetaRepoModel.write(bArr, "");
            if (CustomProgressMarkerView.this.AudioAttributesCompatParcelizer) {
                throw new IOException("closed");
            }
            isConciseModeOn.write(bArr.length, i, i2);
            if (CustomProgressMarkerView.this.IconCompatParcelizer.getSize() == 0 && CustomProgressMarkerView.this.write.AudioAttributesCompatParcelizer(CustomProgressMarkerView.this.IconCompatParcelizer, 8192L) == -1) {
                return -1;
            }
            return CustomProgressMarkerView.this.IconCompatParcelizer.write(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            if (CustomProgressMarkerView.this.AudioAttributesCompatParcelizer) {
                throw new IOException("closed");
            }
            return (int) Math.min(CustomProgressMarkerView.this.IconCompatParcelizer.getSize(), 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            CustomProgressMarkerView.this.close();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(CustomProgressMarkerView.this);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    @Override // kotlin.LessonCompletedDialog
    public final InputStream AudioAttributesImplBaseParcelizer() {
        return new write();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setLockedFromSeek
    public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        if (this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.IconCompatParcelizer.getSize() == 0 && this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) == -1) {
            return -1L;
        }
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(resetcurrentselectedposition, Math.min(j, this.IconCompatParcelizer.getSize()));
    }

    @Override // kotlin.LessonCompletedDialog
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        if (this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("closed".toString());
        }
        return this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() && this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) == -1;
    }

    @Override // kotlin.LessonCompletedDialog
    public final void AudioAttributesImplApi26Parcelizer(long j) throws EOFException {
        if (!MediaBrowserCompatCustomActionResultReceiver(j)) {
            throw new EOFException();
        }
    }

    @Override // kotlin.LessonCompletedDialog
    public final boolean MediaBrowserCompatCustomActionResultReceiver(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        if (this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.IconCompatParcelizer.getSize() < j) {
            if (this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.LessonCompletedDialog
    public final byte MediaMetadataCompat() throws EOFException {
        AudioAttributesImplApi26Parcelizer(1L);
        return this.IconCompatParcelizer.MediaMetadataCompat();
    }

    @Override // kotlin.LessonCompletedDialog
    public final getRelatedModuleAdapter read(long j) throws EOFException {
        AudioAttributesImplApi26Parcelizer(j);
        return this.IconCompatParcelizer.read(j);
    }

    @Override // kotlin.LessonCompletedDialog
    public final int RemoteActionCompatParcelizer(Options options) throws EOFException {
        toMagicModuleMetaRepoModel.write(options, "");
        if (this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iWrite = setStatuses.write(this.IconCompatParcelizer, options, true);
            if (iWrite != -2) {
                if (iWrite == -1) {
                    return -1;
                }
                this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(options.getRead()[iWrite].MediaBrowserCompatCustomActionResultReceiver());
                return iWrite;
            }
        } while (this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) != -1);
        return -1;
    }

    @Override // kotlin.LessonCompletedDialog
    public final byte[] MediaBrowserCompatSearchResultReceiver() throws IOException {
        this.IconCompatParcelizer.write(this.write);
        return this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.LessonCompletedDialog
    public final byte[] AudioAttributesCompatParcelizer(long j) throws EOFException {
        AudioAttributesImplApi26Parcelizer(j);
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        toMagicModuleMetaRepoModel.write(byteBuffer, "");
        if (this.IconCompatParcelizer.getSize() == 0 && this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) == -1) {
            return -1;
        }
        return this.IconCompatParcelizer.read(byteBuffer);
    }

    @Override // kotlin.LessonCompletedDialog
    public final long write(setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault) throws IOException {
        toMagicModuleMetaRepoModel.write(setcompounddrawableswithintrinsicboundscompatdefault, "");
        long j = 0;
        while (this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) != -1) {
            long jWrite = this.IconCompatParcelizer.write();
            if (jWrite > 0) {
                j += jWrite;
                setcompounddrawableswithintrinsicboundscompatdefault.IconCompatParcelizer(this.IconCompatParcelizer, jWrite);
            }
        }
        if (this.IconCompatParcelizer.getSize() <= 0) {
            return j;
        }
        long size = j + this.IconCompatParcelizer.getSize();
        resetCurrentSelectedPosition resetcurrentselectedposition = this.IconCompatParcelizer;
        setcompounddrawableswithintrinsicboundscompatdefault.IconCompatParcelizer(resetcurrentselectedposition, resetcurrentselectedposition.getSize());
        return size;
    }

    @Override // kotlin.LessonCompletedDialog
    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
        this.IconCompatParcelizer.write(this.write);
        return this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // kotlin.LessonCompletedDialog
    public final String write(Charset charset) throws IOException {
        toMagicModuleMetaRepoModel.write(charset, "");
        this.IconCompatParcelizer.write(this.write);
        return this.IconCompatParcelizer.write(charset);
    }

    @Override // kotlin.LessonCompletedDialog
    public final String write(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((byte) 10, 0L, j2);
        if (jAudioAttributesCompatParcelizer != -1) {
            return setStatuses.RemoteActionCompatParcelizer(this.IconCompatParcelizer, jAudioAttributesCompatParcelizer);
        }
        if (j2 < Long.MAX_VALUE && MediaBrowserCompatCustomActionResultReceiver(j2) && this.IconCompatParcelizer.IconCompatParcelizer(j2 - 1) == 13 && MediaBrowserCompatCustomActionResultReceiver(1 + j2) && this.IconCompatParcelizer.IconCompatParcelizer(j2) == 10) {
            return setStatuses.RemoteActionCompatParcelizer(this.IconCompatParcelizer, j2);
        }
        resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
        resetCurrentSelectedPosition resetcurrentselectedposition2 = this.IconCompatParcelizer;
        resetcurrentselectedposition2.write(resetcurrentselectedposition, 0L, Math.min(32L, resetcurrentselectedposition2.getSize()));
        StringBuilder sb = new StringBuilder("\\n not found: limit=");
        sb.append(Math.min(this.IconCompatParcelizer.getSize(), j));
        sb.append(" content=");
        sb.append(resetcurrentselectedposition.MediaDescriptionCompat().RemoteActionCompatParcelizer());
        sb.append((char) 8230);
        throw new EOFException(sb.toString());
    }

    @Override // kotlin.LessonCompletedDialog
    public final short onAddQueueItem() throws EOFException {
        AudioAttributesImplApi26Parcelizer(2L);
        return this.IconCompatParcelizer.onAddQueueItem();
    }

    public final short write() throws EOFException {
        AudioAttributesImplApi26Parcelizer(2L);
        return this.IconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // kotlin.LessonCompletedDialog
    public final int onCustomAction() throws EOFException {
        AudioAttributesImplApi26Parcelizer(4L);
        return this.IconCompatParcelizer.onCustomAction();
    }

    public final int IconCompatParcelizer() throws EOFException {
        AudioAttributesImplApi26Parcelizer(4L);
        return this.IconCompatParcelizer.onCommand();
    }

    @Override // kotlin.LessonCompletedDialog
    public final long RatingCompat() throws EOFException {
        byte bIconCompatParcelizer;
        AudioAttributesImplApi26Parcelizer(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!MediaBrowserCompatCustomActionResultReceiver(j2)) {
                break;
            }
            bIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(j);
            if ((bIconCompatParcelizer < 48 || bIconCompatParcelizer > 57) && !(j == 0 && bIconCompatParcelizer == 45)) {
                break;
            }
            j = j2;
        }
        if (j == 0) {
            StringBuilder sb = new StringBuilder("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bIconCompatParcelizer, setStatusTimestamp.RemoteActionCompatParcelizer(setStatusTimestamp.RemoteActionCompatParcelizer(16)));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.IconCompatParcelizer.RatingCompat();
    }

    @Override // kotlin.LessonCompletedDialog
    public final long MediaBrowserCompatMediaItem() throws EOFException {
        byte bIconCompatParcelizer;
        AudioAttributesImplApi26Parcelizer(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!MediaBrowserCompatCustomActionResultReceiver(i2)) {
                break;
            }
            bIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(i);
            if ((bIconCompatParcelizer < 48 || bIconCompatParcelizer > 57) && ((bIconCompatParcelizer < 97 || bIconCompatParcelizer > 102) && (bIconCompatParcelizer < 65 || bIconCompatParcelizer > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bIconCompatParcelizer, setStatusTimestamp.RemoteActionCompatParcelizer(setStatusTimestamp.RemoteActionCompatParcelizer(16)));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.LessonCompletedDialog
    public final void AudioAttributesImplBaseParcelizer(long j) throws EOFException {
        if (this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.IconCompatParcelizer.getSize() == 0 && this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.IconCompatParcelizer.getSize());
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(jMin);
            j -= jMin;
        }
    }

    private long AudioAttributesCompatParcelizer(byte b, long j, long j2) {
        if (this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > j2) {
            StringBuilder sb = new StringBuilder("fromIndex=0 toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        while (j < j2) {
            long jWrite = this.IconCompatParcelizer.write(b, j, j2);
            if (jWrite != -1) {
                return jWrite;
            }
            long size = this.IconCompatParcelizer.getSize();
            if (size >= j2 || this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) == -1) {
                break;
            }
            j = Math.max(j, size);
        }
        return -1L;
    }

    private long RemoteActionCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter, long j) throws IOException {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        if (this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedmoduleadapter, j);
            if (jAudioAttributesCompatParcelizer != -1) {
                return jAudioAttributesCompatParcelizer;
            }
            long size = this.IconCompatParcelizer.getSize();
            if (this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - ((long) getrelatedmoduleadapter.MediaBrowserCompatCustomActionResultReceiver())) + 1);
        }
    }

    private long AudioAttributesCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter, long j) {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        if (this.AudioAttributesCompatParcelizer) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long j2 = this.IconCompatParcelizer.read(getrelatedmoduleadapter, j);
            if (j2 != -1) {
                return j2;
            }
            long size = this.IconCompatParcelizer.getSize();
            if (this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    @Override // kotlin.LessonCompletedDialog
    public final LessonCompletedDialog AudioAttributesImplApi21Parcelizer() {
        return CustomAppBarLayout.AudioAttributesCompatParcelizer(new CustomEditView(this));
    }

    @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer = true;
        this.write.close();
        this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.setLockedFromSeek
    public final CustomTextView RemoteActionCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
