package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultTrackSelectorParameters {
    public static getCount IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws Download {
        boolean z;
        try {
            try {
                downloadHelperExternalSyntheticLambda4.onCustomAction();
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return replaceTrackSelections.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
            } catch (EOFException e2) {
                e = e2;
                z = false;
                if (z) {
                    return DefaultDownloaderFactory.read;
                }
                throw new getPercentDownloaded(e);
            }
        } catch (NumberFormatException e3) {
            throw new getPercentDownloaded(e3);
        } catch (DownloadHelperExternalSyntheticLambda6 e4) {
            throw new getPercentDownloaded(e4);
        } catch (IOException e5) {
            throw new getDownloaderConstructor(e5);
        }
    }

    public static void AudioAttributesCompatParcelizer(getCount getcount, DownloadHelper2 downloadHelper2) throws IOException {
        replaceTrackSelections.handleMediaPlayPauseIfPendingOnHandler.read(downloadHelper2, getcount);
    }

    public static Writer AudioAttributesCompatParcelizer(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new read(appendable);
    }

    static final class read extends Writer {
        private final write AudioAttributesCompatParcelizer = new write(0);
        private final Appendable write;

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
            return append(charSequence);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            return append(charSequence, i, i2);
        }

        read(Appendable appendable) {
            this.write = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws IOException {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(cArr);
            this.write.append(this.AudioAttributesCompatParcelizer, i, i2 + i);
        }

        @Override // java.io.Writer
        public final void write(int i) throws IOException {
            this.write.append((char) i);
        }

        @Override // java.io.Writer
        public final void write(String str, int i, int i2) throws IOException {
            Objects.requireNonNull(str);
            this.write.append(str, i, i2 + i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence) throws IOException {
            this.write.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence, int i, int i2) throws IOException {
            this.write.append(charSequence, i, i2);
            return this;
        }

        static class write implements CharSequence {
            private char[] AudioAttributesCompatParcelizer;
            private String IconCompatParcelizer;

            private write() {
            }

            /* synthetic */ write(byte b) {
                this();
            }

            final void IconCompatParcelizer(char[] cArr) {
                this.AudioAttributesCompatParcelizer = cArr;
                this.IconCompatParcelizer = null;
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.AudioAttributesCompatParcelizer.length;
            }

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.AudioAttributesCompatParcelizer[i];
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i, int i2) {
                return new String(this.AudioAttributesCompatParcelizer, i, i2 - i);
            }

            @Override // java.lang.CharSequence
            public final String toString() {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = new String(this.AudioAttributesCompatParcelizer);
                }
                return this.IconCompatParcelizer;
            }
        }
    }
}
