package kotlin;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* JADX INFO: loaded from: classes2.dex */
public final class BooleanSerializerAsNumber {
    private final SparseArray<MinimalClassNameIdResolver> write = new SparseArray<>();

    public final MinimalClassNameIdResolver read(int i) {
        MinimalClassNameIdResolver minimalClassNameIdResolver = this.write.get(i);
        if (minimalClassNameIdResolver != null) {
            return minimalClassNameIdResolver;
        }
        MinimalClassNameIdResolver minimalClassNameIdResolver2 = new MinimalClassNameIdResolver(TimestampAdjuster.MODE_SHARED);
        this.write.put(i, minimalClassNameIdResolver2);
        return minimalClassNameIdResolver2;
    }

    public final void IconCompatParcelizer() {
        this.write.clear();
    }
}
