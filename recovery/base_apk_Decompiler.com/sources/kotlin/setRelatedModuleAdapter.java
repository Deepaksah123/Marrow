package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setRelatedModuleAdapter implements setLockedFromSeek {
    private final setLockedFromSeek AudioAttributesCompatParcelizer;

    public setRelatedModuleAdapter(setLockedFromSeek setlockedfromseek) {
        toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
        this.AudioAttributesCompatParcelizer = setlockedfromseek;
    }

    public final setLockedFromSeek read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setLockedFromSeek
    public long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
    }

    @Override // kotlin.setLockedFromSeek
    public final CustomTextView RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.AudioAttributesCompatParcelizer.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
