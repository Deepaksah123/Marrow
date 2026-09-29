package kotlin;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes2.dex */
public final class setRotationEnabled extends setSkipWebLineCount implements setEntryLabelTypeface {
    private final SQLiteStatement RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setRotationEnabled(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        toMagicModuleMetaRepoModel.write(sQLiteStatement, "");
        this.RemoteActionCompatParcelizer = sQLiteStatement;
    }

    @Override // kotlin.setEntryLabelTypeface
    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.execute();
    }

    @Override // kotlin.setEntryLabelTypeface
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.executeUpdateDelete();
    }
}
