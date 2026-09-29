package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setVisibleYRange {
    public final int RemoteActionCompatParcelizer;
    public final int read;

    public setVisibleYRange(int i, int i2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public void AudioAttributesCompatParcelizer(setDrawSliceText setdrawslicetext) {
        toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void AudioAttributesCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        if (setdrawholeenabled instanceof setScaleMinima) {
            AudioAttributesCompatParcelizer(((setScaleMinima) setdrawholeenabled).read());
            return;
        }
        throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
