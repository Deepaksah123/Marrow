package kotlin;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes4.dex */
public final class getPreviousWindowIndex implements setVisibleXRangeMaximum {
    @Override // kotlin.setVisibleXRangeMaximum
    public final void read(setDrawSliceText setdrawslicetext) {
        toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        setdrawslicetext.AudioAttributesCompatParcelizer("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        setdrawslicetext.write("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
