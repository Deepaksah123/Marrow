package kotlin;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.BookReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setNotesCount implements BookReference {
    private int RemoteActionCompatParcelizer = 0;

    public final void read(OutputStream outputStream) throws IOException {
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        setResumeExplanation setresumeexplanation = setResumeExplanation.read(outputStream, setResumeExplanation.AudioAttributesCompatParcelizer(setResumeExplanation.write(iAudioAttributesImplApi21Parcelizer) + iAudioAttributesImplApi21Parcelizer));
        setresumeexplanation.MediaMetadataCompat(iAudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer(setresumeexplanation);
        setresumeexplanation.IconCompatParcelizer();
    }

    static isAnswerSkipped onSkipToNext() {
        return new isAnswerSkipped();
    }

    public static abstract class write<BuilderType extends write> implements BookReference.write {
        @Override // 
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public abstract BuilderType clone();

        @Override // o.BookReference.write
        public abstract BuilderType read(setSlidesCount setslidescount, setStepType setsteptype) throws IOException;

        static final class RemoteActionCompatParcelizer extends FilterInputStream {
            private int write;

            RemoteActionCompatParcelizer(InputStream inputStream, int i) {
                super(inputStream);
                this.write = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws IOException {
                return Math.min(super.available(), this.write);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.write <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.write--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.write;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.write -= i4;
                }
                return i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.write));
                if (jSkip >= 0) {
                    this.write = (int) (((long) this.write) - jSkip);
                }
                return jSkip;
            }
        }

        protected static isAnswerSkipped MediaBrowserCompatMediaItem() {
            return new isAnswerSkipped();
        }
    }
}
