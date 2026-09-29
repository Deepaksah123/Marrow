package kotlin;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionCacheBooleanTriStateEmpty implements UByteKeyDeserializer {
    private final RecyclerView.IconCompatParcelizer write;

    public ReflectionCacheBooleanTriStateEmpty(RecyclerView.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    @Override // kotlin.UByteKeyDeserializer
    public final void read(int i, int i2) {
        this.write.notifyItemRangeInserted(i, i2);
    }

    @Override // kotlin.UByteKeyDeserializer
    public final void write(int i, int i2) {
        this.write.notifyItemRangeRemoved(i, i2);
    }

    @Override // kotlin.UByteKeyDeserializer
    public final void RemoteActionCompatParcelizer(int i, int i2) {
        this.write.notifyItemMoved(i, i2);
    }

    @Override // kotlin.UByteKeyDeserializer
    public final void IconCompatParcelizer(int i, int i2, Object obj) {
        this.write.notifyItemRangeChanged(i, i2, obj);
    }
}
