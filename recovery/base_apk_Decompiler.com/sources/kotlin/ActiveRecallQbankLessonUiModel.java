package kotlin;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class ActiveRecallQbankLessonUiModel implements setLockedFromSeek {
    private final CustomTextView IconCompatParcelizer;
    private final InputStream write;

    public ActiveRecallQbankLessonUiModel(InputStream inputStream, CustomTextView customTextView) {
        toMagicModuleMetaRepoModel.write(inputStream, "");
        toMagicModuleMetaRepoModel.write(customTextView, "");
        this.write = inputStream;
        this.IconCompatParcelizer = customTextView;
    }

    @Override // kotlin.setLockedFromSeek
    public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        try {
            this.IconCompatParcelizer.bq_();
            getMarkerPaint getmarkerpaintIconCompatParcelizer = resetcurrentselectedposition.IconCompatParcelizer(1);
            int i = this.write.read(getmarkerpaintIconCompatParcelizer.data, getmarkerpaintIconCompatParcelizer.limit, (int) Math.min(j, 8192 - getmarkerpaintIconCompatParcelizer.limit));
            if (i == -1) {
                if (getmarkerpaintIconCompatParcelizer.pos != getmarkerpaintIconCompatParcelizer.limit) {
                    return -1L;
                }
                resetcurrentselectedposition.head = getmarkerpaintIconCompatParcelizer.AudioAttributesCompatParcelizer();
                setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaintIconCompatParcelizer);
                return -1L;
            }
            getmarkerpaintIconCompatParcelizer.limit += i;
            long j2 = i;
            resetcurrentselectedposition.MediaBrowserCompatItemReceiver(resetcurrentselectedposition.getSize() + j2);
            return j2;
        } catch (AssertionError e) {
            if (CustomAppBarLayout.RemoteActionCompatParcelizer(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.write.close();
    }

    @Override // kotlin.setLockedFromSeek
    public final CustomTextView RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source(");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
