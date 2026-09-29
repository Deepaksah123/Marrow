package kotlin;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Cea608Decoder;
import kotlin.repositionVerticalCue;

/* JADX INFO: loaded from: classes3.dex */
public abstract class skipInput<P extends Cea608Decoder, VH extends repositionVerticalCue> extends RecyclerView.IconCompatParcelizer<VH> implements Cea608Decoder.write {
    public P read;

    public abstract VH read(ViewGroup viewGroup, int i);

    public skipInput(P p) {
        this.read = p;
        p.IconCompatParcelizer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return (VH) read(viewGroup, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(VH vh, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.read.RemoteActionCompatParcelizer(vh, i);
        buildResolutionString.IconCompatParcelizer(getClass(), "onBind", jCurrentTimeMillis, System.currentTimeMillis());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public int getItemCount() {
        return this.read.read();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public int getItemViewType(int i) {
        return this.read.AudioAttributesCompatParcelizer(i);
    }

    public final P IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.Cea608Decoder.write
    public final void RemoteActionCompatParcelizer() {
        notifyDataSetChanged();
    }

    @Override // o.Cea608Decoder.write
    public final void AudioAttributesCompatParcelizer(int i) {
        notifyItemChanged(i);
    }

    @Override // o.Cea608Decoder.write
    public final void read(int i, int i2) {
        notifyItemRangeInserted(2, i2);
    }
}
