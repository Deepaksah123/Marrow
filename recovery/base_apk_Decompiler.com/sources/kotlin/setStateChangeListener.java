package kotlin;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class setStateChangeListener implements setCompoundDrawablesWithIntrinsicBoundsCompatdefault {
    private final OutputStream AudioAttributesCompatParcelizer;
    private final CustomTextView IconCompatParcelizer;

    public setStateChangeListener(OutputStream outputStream, CustomTextView customTextView) {
        toMagicModuleMetaRepoModel.write(outputStream, "");
        toMagicModuleMetaRepoModel.write(customTextView, "");
        this.AudioAttributesCompatParcelizer = outputStream;
        this.IconCompatParcelizer = customTextView;
    }

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
    public final void IconCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        isConciseModeOn.write(resetcurrentselectedposition.getSize(), 0L, j);
        while (j > 0) {
            this.IconCompatParcelizer.bq_();
            getMarkerPaint getmarkerpaint = resetcurrentselectedposition.head;
            toMagicModuleMetaRepoModel.write(getmarkerpaint);
            int iMin = (int) Math.min(j, getmarkerpaint.limit - getmarkerpaint.pos);
            this.AudioAttributesCompatParcelizer.write(getmarkerpaint.data, getmarkerpaint.pos, iMin);
            getmarkerpaint.pos += iMin;
            long j2 = iMin;
            j -= j2;
            resetcurrentselectedposition.MediaBrowserCompatItemReceiver(resetcurrentselectedposition.getSize() - j2);
            if (getmarkerpaint.pos == getmarkerpaint.limit) {
                resetcurrentselectedposition.head = getmarkerpaint.AudioAttributesCompatParcelizer();
                setMarkerPaint.RemoteActionCompatParcelizer(getmarkerpaint);
            }
        }
    }

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
    public final void flush() throws IOException {
        this.AudioAttributesCompatParcelizer.flush();
    }

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.AudioAttributesCompatParcelizer.close();
    }

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
    public final CustomTextView RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("sink(");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
