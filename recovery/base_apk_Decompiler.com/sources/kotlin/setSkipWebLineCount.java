package kotlin;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes2.dex */
public class setSkipWebLineCount implements setEntryLabelColor {
    private final SQLiteProgram AudioAttributesCompatParcelizer;

    public setSkipWebLineCount(SQLiteProgram sQLiteProgram) {
        toMagicModuleMetaRepoModel.write(sQLiteProgram, "");
        this.AudioAttributesCompatParcelizer = sQLiteProgram;
    }

    @Override // kotlin.setEntryLabelColor
    public final void read(int i) {
        this.AudioAttributesCompatParcelizer.bindNull(i);
    }

    @Override // kotlin.setEntryLabelColor
    public final void IconCompatParcelizer(int i, long j) {
        this.AudioAttributesCompatParcelizer.bindLong(i, j);
    }

    @Override // kotlin.setEntryLabelColor
    public final void AudioAttributesCompatParcelizer(int i, double d) {
        this.AudioAttributesCompatParcelizer.bindDouble(i, d);
    }

    @Override // kotlin.setEntryLabelColor
    public final void read(int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer.bindString(i, str);
    }

    @Override // kotlin.setEntryLabelColor
    public final void write(int i, byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        this.AudioAttributesCompatParcelizer.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.AudioAttributesCompatParcelizer.close();
    }
}
