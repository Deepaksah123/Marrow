package kotlin;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class setExtraLeftOffset implements setDrawEntryLabels {
    private final setDrawEntryLabels AudioAttributesCompatParcelizer;
    private final Map<String, Integer> read;

    public final int write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Integer num = this.read.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // kotlin.setDrawEntryLabels
    public final void read(int i, byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        this.AudioAttributesCompatParcelizer.read(i, bArr);
    }

    @Override // kotlin.setDrawEntryLabels
    public final void IconCompatParcelizer(int i, long j) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i, j);
    }

    @Override // kotlin.setDrawEntryLabels
    public final void read(int i) {
        this.AudioAttributesCompatParcelizer.read(i);
    }

    @Override // kotlin.setDrawEntryLabels
    public final void RemoteActionCompatParcelizer(int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, str);
    }

    @Override // kotlin.setDrawEntryLabels, java.lang.AutoCloseable
    public final void close() {
        this.AudioAttributesCompatParcelizer.close();
    }

    @Override // kotlin.setDrawEntryLabels
    public final byte[] RemoteActionCompatParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
    }

    @Override // kotlin.setDrawEntryLabels
    public final boolean MediaBrowserCompatItemReceiver(int i) {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(i);
    }

    @Override // kotlin.setDrawEntryLabels
    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.setDrawEntryLabels
    public final String write(int i) {
        return this.AudioAttributesCompatParcelizer.write(i);
    }

    @Override // kotlin.setDrawEntryLabels
    public final long IconCompatParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
    }

    @Override // kotlin.setDrawEntryLabels
    public final String AudioAttributesCompatParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin.setDrawEntryLabels
    public final boolean AudioAttributesImplBaseParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(i);
    }

    @Override // kotlin.setDrawEntryLabels
    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setDrawEntryLabels
    public final boolean write() {
        return this.AudioAttributesCompatParcelizer.write();
    }
}
