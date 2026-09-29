package kotlin;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class moveMediaItems extends RecyclerView.MediaMetadataCompat {
    private final SparseArray<Queue<RecyclerView.onMediaButtonEvent>> write = new SparseArray<>();

    @Override // androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat
    public final void AudioAttributesCompatParcelizer() {
        this.write.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat
    public final RecyclerView.onMediaButtonEvent IconCompatParcelizer(int i) {
        Queue<RecyclerView.onMediaButtonEvent> queue = this.write.get(i);
        if (queue != null) {
            return queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaMetadataCompat
    public final void AudioAttributesCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        toMagicModuleMetaRepoModel.write(onmediabuttonevent, "");
        AudioAttributesCompatParcelizer(onmediabuttonevent.getItemViewType()).add(onmediabuttonevent);
    }

    private final Queue<RecyclerView.onMediaButtonEvent> AudioAttributesCompatParcelizer(int i) {
        Queue<RecyclerView.onMediaButtonEvent> queue = this.write.get(i);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        this.write.put(i, linkedList);
        return linkedList;
    }
}
