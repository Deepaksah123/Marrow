package kotlin;

import android.database.sqlite.SQLiteDatabase;
import kotlin.setWebLineWidthInner;

/* JADX INFO: loaded from: classes2.dex */
public final class RadarChart implements setDrawHoleEnabled {
    private final SQLiteDatabase RemoteActionCompatParcelizer;

    public RadarChart(SQLiteDatabase sQLiteDatabase) {
        toMagicModuleMetaRepoModel.write(sQLiteDatabase, "");
        this.RemoteActionCompatParcelizer = sQLiteDatabase;
    }

    public final SQLiteDatabase IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setDrawHoleEnabled
    public final setDrawEntryLabels IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (this.RemoteActionCompatParcelizer.isOpen()) {
            setWebLineWidthInner.Companion companion = setWebLineWidthInner.INSTANCE;
            return setWebLineWidthInner.Companion.IconCompatParcelizer(this.RemoteActionCompatParcelizer, str);
        }
        setDrawCenterText.write(21, "connection is closed");
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.setDrawHoleEnabled, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.close();
    }
}
