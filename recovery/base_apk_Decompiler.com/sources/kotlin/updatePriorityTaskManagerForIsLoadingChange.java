package kotlin;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class updatePriorityTaskManagerForIsLoadingChange extends RecyclerView.IconCompatParcelizer<getMaxSeekToPreviousPosition> {
    private final GridLayoutManager.IconCompatParcelizer write;
    private int read = 1;
    private final setPlayWhenReady AudioAttributesCompatParcelizer = new setPlayWhenReady();
    private final updateWakeAndWifiLock IconCompatParcelizer = new updateWakeAndWifiLock();
    private ViewHolderState RemoteActionCompatParcelizer = new ViewHolderState();

    abstract List<? extends getCurrentPeriodIndex<?>> AudioAttributesCompatParcelizer();

    public void RemoteActionCompatParcelizer(View view) {
    }

    void RemoteActionCompatParcelizer(getMaxSeekToPreviousPosition getmaxseektopreviousposition, getCurrentPeriodIndex<?> getcurrentperiodindex, int i, getCurrentPeriodIndex<?> getcurrentperiodindex2) {
    }

    public boolean RemoteActionCompatParcelizer(int i) {
        return false;
    }

    protected void read(RuntimeException runtimeException) {
    }

    protected void read(getMaxSeekToPreviousPosition getmaxseektopreviousposition, getCurrentPeriodIndex<?> getcurrentperiodindex) {
    }

    public void write(View view) {
    }

    boolean write() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public /* synthetic */ boolean onFailedToRecycleView(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        return RemoteActionCompatParcelizer((getMaxSeekToPreviousPosition) onmediabuttonevent);
    }

    public updatePriorityTaskManagerForIsLoadingChange() {
        GridLayoutManager.IconCompatParcelizer iconCompatParcelizer = new GridLayoutManager.IconCompatParcelizer() { // from class: o.updatePriorityTaskManagerForIsLoadingChange.4
            @Override // androidx.recyclerview.widget.GridLayoutManager.IconCompatParcelizer
            public final int IconCompatParcelizer(int i) {
                try {
                    getCurrentPeriodIndex<?> getcurrentperiodindexAudioAttributesCompatParcelizer = updatePriorityTaskManagerForIsLoadingChange.this.AudioAttributesCompatParcelizer(i);
                    int unused = updatePriorityTaskManagerForIsLoadingChange.this.read;
                    updatePriorityTaskManagerForIsLoadingChange.this.getItemCount();
                    return getcurrentperiodindexAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                } catch (IndexOutOfBoundsException e) {
                    updatePriorityTaskManagerForIsLoadingChange.this.read(e);
                    return 1;
                }
            }
        };
        this.write = iconCompatParcelizer;
        setHasStableIds(true);
        iconCompatParcelizer.read();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public int getItemCount() {
        return AudioAttributesCompatParcelizer().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public long getItemId(int i) {
        return AudioAttributesCompatParcelizer().get(i).AudioAttributesCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public int getItemViewType(int i) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public getMaxSeekToPreviousPosition onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new getMaxSeekToPreviousPosition(viewGroup, this.AudioAttributesCompatParcelizer.read(this, i).AudioAttributesCompatParcelizer(viewGroup), getCurrentPeriodIndex.AudioAttributesImplApi26Parcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(getMaxSeekToPreviousPosition getmaxseektopreviousposition, int i) {
        onBindViewHolder(getmaxseektopreviousposition, i, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(getMaxSeekToPreviousPosition getmaxseektopreviousposition, int i, List<Object> list) {
        getCurrentPeriodIndex<?> getcurrentperiodindexAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        getCurrentPeriodIndex<?> getcurrentperiodindex = write() ? getCurrentAdIndexInAdGroup.read(list, getItemId(i)) : null;
        getmaxseektopreviousposition.RemoteActionCompatParcelizer(getcurrentperiodindexAudioAttributesCompatParcelizer, getcurrentperiodindex, list, i);
        if (list.isEmpty()) {
            ViewHolderState.IconCompatParcelizer(getmaxseektopreviousposition);
        }
        this.IconCompatParcelizer.write(getmaxseektopreviousposition);
        if (write()) {
            RemoteActionCompatParcelizer(getmaxseektopreviousposition, getcurrentperiodindexAudioAttributesCompatParcelizer, i, getcurrentperiodindex);
        }
    }

    protected updateWakeAndWifiLock RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    final getCurrentPeriodIndex<?> AudioAttributesCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer().get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        ViewHolderState.write(getmaxseektopreviousposition);
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(getmaxseektopreviousposition);
        getCurrentPeriodIndex<?> getcurrentperiodindexWrite = getmaxseektopreviousposition.write();
        getmaxseektopreviousposition.read();
        read(getmaxseektopreviousposition, getcurrentperiodindexWrite);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer = null;
    }

    private static boolean RemoteActionCompatParcelizer(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        return getmaxseektopreviousposition.write().AudioAttributesCompatParcelizer(getmaxseektopreviousposition.RemoteActionCompatParcelizer());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        getmaxseektopreviousposition.write();
        getmaxseektopreviousposition.RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        getmaxseektopreviousposition.write();
        getmaxseektopreviousposition.RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(Bundle bundle) {
        Iterator<getMaxSeekToPreviousPosition> it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ViewHolderState.write(it.next());
        }
        if (this.RemoteActionCompatParcelizer.write() > 0 && !hasStableIds()) {
            throw new IllegalStateException("Must have stable ids when saving view holder state");
        }
        bundle.putParcelable("saved_state_view_holders", this.RemoteActionCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        if (this.IconCompatParcelizer.read() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        }
        if (bundle != null) {
            ViewHolderState viewHolderState = (ViewHolderState) bundle.getParcelable("saved_state_view_holders");
            this.RemoteActionCompatParcelizer = viewHolderState;
            if (viewHolderState == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }

    protected int write(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        int size = AudioAttributesCompatParcelizer().size();
        for (int i = 0; i < size; i++) {
            if (getcurrentperiodindex == AudioAttributesCompatParcelizer().get(i)) {
                return i;
            }
        }
        return -1;
    }

    public final GridLayoutManager.IconCompatParcelizer read() {
        return this.write;
    }

    public final void IconCompatParcelizer(int i) {
        this.read = i;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.read > 1;
    }
}
