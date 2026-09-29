package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class updateTimelineSelection implements setCompoundDrawablesWithIntrinsicBoundsCompatdefault {
    private final setCompoundDrawablesWithIntrinsicBoundsCompatdefault IconCompatParcelizer;

    public updateTimelineSelection(setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault) {
        toMagicModuleMetaRepoModel.write(setcompounddrawableswithintrinsicboundscompatdefault, "");
        this.IconCompatParcelizer = setcompounddrawableswithintrinsicboundscompatdefault;
    }

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
    public void IconCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        this.IconCompatParcelizer.IconCompatParcelizer(resetcurrentselectedposition, j);
    }

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
    public void flush() throws IOException {
        this.IconCompatParcelizer.flush();
    }

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
    public final CustomTextView RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.IconCompatParcelizer.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
