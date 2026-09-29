package kotlin;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class addTrackSelection extends DownloadHelper2 {
    private final List<getCount> AudioAttributesCompatParcelizer;
    private getCount RemoteActionCompatParcelizer;
    private String write;
    private static final Writer read = new Writer() { // from class: o.addTrackSelection.1
        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }
    };
    private static final createDownloaderConstructors IconCompatParcelizer = new createDownloaderConstructors("closed");

    @Override // kotlin.DownloadHelper2, java.io.Flushable
    public final void flush() throws IOException {
    }

    public addTrackSelection() {
        super(read);
        this.AudioAttributesCompatParcelizer = new ArrayList();
        this.RemoteActionCompatParcelizer = DefaultDownloaderFactory.read;
    }

    public final getCount read() {
        if (!this.AudioAttributesCompatParcelizer.isEmpty()) {
            StringBuilder sb = new StringBuilder("Expected one JSON element but was ");
            sb.append(this.AudioAttributesCompatParcelizer);
            throw new IllegalStateException(sb.toString());
        }
        return this.RemoteActionCompatParcelizer;
    }

    private getCount MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesCompatParcelizer.get(r1.size() - 1);
    }

    private void read(getCount getcount) {
        if (this.write != null) {
            if (!getcount.MediaMetadataCompat() || AudioAttributesImplApi21Parcelizer()) {
                ((createDownloader) MediaBrowserCompatItemReceiver()).RemoteActionCompatParcelizer(this.write, getcount);
            }
            this.write = null;
            return;
        }
        if (this.AudioAttributesCompatParcelizer.isEmpty()) {
            this.RemoteActionCompatParcelizer = getcount;
            return;
        }
        getCount getcountMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (getcountMediaBrowserCompatItemReceiver instanceof moveToPosition) {
            ((moveToPosition) getcountMediaBrowserCompatItemReceiver).IconCompatParcelizer(getcount);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 write() throws IOException {
        moveToPosition movetoposition = new moveToPosition();
        read(movetoposition);
        this.AudioAttributesCompatParcelizer.add(movetoposition);
        return this;
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 AudioAttributesCompatParcelizer() throws IOException {
        if (this.AudioAttributesCompatParcelizer.isEmpty() || this.write != null) {
            throw new IllegalStateException();
        }
        if (MediaBrowserCompatItemReceiver() instanceof moveToPosition) {
            this.AudioAttributesCompatParcelizer.remove(r0.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 RemoteActionCompatParcelizer() throws IOException {
        createDownloader createdownloader = new createDownloader();
        read(createdownloader);
        this.AudioAttributesCompatParcelizer.add(createdownloader);
        return this;
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 IconCompatParcelizer() throws IOException {
        if (this.AudioAttributesCompatParcelizer.isEmpty() || this.write != null) {
            throw new IllegalStateException();
        }
        if (MediaBrowserCompatItemReceiver() instanceof createDownloader) {
            this.AudioAttributesCompatParcelizer.remove(r0.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 read(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.AudioAttributesCompatParcelizer.isEmpty() || this.write != null) {
            throw new IllegalStateException();
        }
        if (MediaBrowserCompatItemReceiver() instanceof createDownloader) {
            this.write = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 AudioAttributesCompatParcelizer(String str) throws IOException {
        if (str == null) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        read(new createDownloaderConstructors(str));
        return this;
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 MediaBrowserCompatCustomActionResultReceiver() throws IOException {
        read(DefaultDownloaderFactory.read);
        return this;
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 write(boolean z) throws IOException {
        read(new createDownloaderConstructors(Boolean.valueOf(z)));
        return this;
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 AudioAttributesCompatParcelizer(Boolean bool) throws IOException {
        if (bool == null) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        read(new createDownloaderConstructors(bool));
        return this;
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 IconCompatParcelizer(double d) throws IOException {
        if (!AudioAttributesImplBaseParcelizer() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(d)));
        }
        read(new createDownloaderConstructors(Double.valueOf(d)));
        return this;
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 write(long j) throws IOException {
        read(new createDownloaderConstructors(Long.valueOf(j)));
        return this;
    }

    @Override // kotlin.DownloadHelper2
    public final DownloadHelper2 AudioAttributesCompatParcelizer(Number number) throws IOException {
        if (number == null) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        if (!AudioAttributesImplBaseParcelizer()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        read(new createDownloaderConstructors(number));
        return this;
    }

    @Override // kotlin.DownloadHelper2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.AudioAttributesCompatParcelizer.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.AudioAttributesCompatParcelizer.add(IconCompatParcelizer);
    }
}
