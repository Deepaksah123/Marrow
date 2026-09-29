package kotlin;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.SequenceSerializer;
import kotlin.updatePlaybackInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class getCurrentPosition extends updatePriorityTaskManagerForIsLoadingChange implements updatePlaybackInfo.write {
    private static final SequenceSerializer.RemoteActionCompatParcelizer<getCurrentPeriodIndex<?>> IconCompatParcelizer = new SequenceSerializer.RemoteActionCompatParcelizer<getCurrentPeriodIndex<?>>() { // from class: o.getCurrentPosition.2
        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* synthetic */ boolean RemoteActionCompatParcelizer(getCurrentPeriodIndex<?> getcurrentperiodindex, getCurrentPeriodIndex<?> getcurrentperiodindex2) {
            return IconCompatParcelizer(getcurrentperiodindex, getcurrentperiodindex2);
        }

        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* synthetic */ boolean read(getCurrentPeriodIndex<?> getcurrentperiodindex, getCurrentPeriodIndex<?> getcurrentperiodindex2) {
            return write2(getcurrentperiodindex, getcurrentperiodindex2);
        }

        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* synthetic */ Object write(getCurrentPeriodIndex<?> getcurrentperiodindex, getCurrentPeriodIndex<?> getcurrentperiodindex2) {
            return RemoteActionCompatParcelizer(getcurrentperiodindex);
        }

        private static boolean IconCompatParcelizer(getCurrentPeriodIndex<?> getcurrentperiodindex, getCurrentPeriodIndex<?> getcurrentperiodindex2) {
            return getcurrentperiodindex.AudioAttributesCompatParcelizer() == getcurrentperiodindex2.AudioAttributesCompatParcelizer();
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        private static boolean write2(getCurrentPeriodIndex<?> getcurrentperiodindex, getCurrentPeriodIndex<?> getcurrentperiodindex2) {
            return getcurrentperiodindex.equals(getcurrentperiodindex2);
        }

        private static Object RemoteActionCompatParcelizer(getCurrentPeriodIndex<?> getcurrentperiodindex) {
            return new getCurrentAdIndexInAdGroup(getcurrentperiodindex);
        }
    };
    private final updatePlaybackInfo AudioAttributesCompatParcelizer;
    private final getSurfaceSize AudioAttributesImplApi26Parcelizer;
    private int RemoteActionCompatParcelizer;
    private final getContentBufferedPosition read;
    private final List<lambdanew0comgoogleandroidexoplayer2ExoPlayerImpl> write;

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    final boolean write() {
        return true;
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange, androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        onViewAttachedToWindow((getMaxSeekToPreviousPosition) onmediabuttonevent);
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange, androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ void onViewDetachedFromWindow(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        onViewDetachedFromWindow((getMaxSeekToPreviousPosition) onmediabuttonevent);
    }

    getCurrentPosition(getContentBufferedPosition getcontentbufferedposition, Handler handler) {
        getSurfaceSize getsurfacesize = new getSurfaceSize();
        this.AudioAttributesImplApi26Parcelizer = getsurfacesize;
        this.write = new ArrayList();
        this.read = getcontentbufferedposition;
        this.AudioAttributesCompatParcelizer = new updatePlaybackInfo(handler, this, IconCompatParcelizer);
        registerAdapterDataObserver(getsurfacesize);
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    protected final void read(RuntimeException runtimeException) {
        this.read.onExceptionSwallowed(runtimeException);
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    final List<? extends getCurrentPeriodIndex<?>> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange, androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer;
    }

    final void write(verifyApplicationThread verifyapplicationthread) {
        List<? extends getCurrentPeriodIndex<?>> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (!listAudioAttributesCompatParcelizer.isEmpty()) {
            if (listAudioAttributesCompatParcelizer.get(0).MediaBrowserCompatItemReceiver()) {
                for (int i = 0; i < listAudioAttributesCompatParcelizer.size(); i++) {
                    listAudioAttributesCompatParcelizer.get(i).write("The model was changed between being bound and when models were rebuilt", i);
                }
            }
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(verifyapplicationthread);
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer.write();
    }

    @Override // o.updatePlaybackInfo.write
    public final void read(getContentPosition getcontentposition) {
        this.RemoteActionCompatParcelizer = getcontentposition.AudioAttributesCompatParcelizer.size();
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        getcontentposition.IconCompatParcelizer(this);
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
        for (int size = this.write.size() - 1; size >= 0; size--) {
            this.write.get(size);
        }
    }

    public final void RemoteActionCompatParcelizer(lambdanew0comgoogleandroidexoplayer2ExoPlayerImpl lambdanew0comgoogleandroidexoplayer2exoplayerimpl) {
        this.write.add(lambdanew0comgoogleandroidexoplayer2exoplayerimpl);
    }

    public final void AudioAttributesCompatParcelizer(lambdanew0comgoogleandroidexoplayer2ExoPlayerImpl lambdanew0comgoogleandroidexoplayer2exoplayerimpl) {
        this.write.remove(lambdanew0comgoogleandroidexoplayer2exoplayerimpl);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.read.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange, androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.read.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    /* JADX INFO: renamed from: read */
    public final void onViewAttachedToWindow(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        super.onViewAttachedToWindow(getmaxseektopreviousposition);
        this.read.onViewAttachedToWindow(getmaxseektopreviousposition, getmaxseektopreviousposition.write());
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final void onViewDetachedFromWindow(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        super.onViewDetachedFromWindow(getmaxseektopreviousposition);
        this.read.onViewDetachedFromWindow(getmaxseektopreviousposition, getmaxseektopreviousposition.write());
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    protected final void RemoteActionCompatParcelizer(getMaxSeekToPreviousPosition getmaxseektopreviousposition, getCurrentPeriodIndex<?> getcurrentperiodindex, int i, getCurrentPeriodIndex<?> getcurrentperiodindex2) {
        this.read.onModelBound(getmaxseektopreviousposition, getcurrentperiodindex, i, getcurrentperiodindex2);
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    protected final void read(getMaxSeekToPreviousPosition getmaxseektopreviousposition, getCurrentPeriodIndex<?> getcurrentperiodindex) {
        this.read.onModelUnbound(getmaxseektopreviousposition, getcurrentperiodindex);
    }

    public final List<getCurrentPeriodIndex<?>> MediaBrowserCompatCustomActionResultReceiver() {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    public final int write(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        int size = AudioAttributesCompatParcelizer().size();
        for (int i = 0; i < size; i++) {
            if (AudioAttributesCompatParcelizer().get(i).AudioAttributesCompatParcelizer() == getcurrentperiodindex.AudioAttributesCompatParcelizer()) {
                return i;
            }
        }
        return -1;
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    public final updateWakeAndWifiLock RemoteActionCompatParcelizer() {
        return super.RemoteActionCompatParcelizer();
    }

    final void IconCompatParcelizer(int i, int i2) {
        ArrayList arrayList = new ArrayList(AudioAttributesCompatParcelizer());
        arrayList.add(i2, arrayList.remove(i));
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        notifyItemMoved(i, i2);
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
        if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(arrayList)) {
            this.read.requestModelBuild();
        }
    }

    final void read(int i) {
        ArrayList arrayList = new ArrayList(AudioAttributesCompatParcelizer());
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        notifyItemChanged(i);
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
        if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(arrayList)) {
            this.read.requestModelBuild();
        }
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    public final boolean RemoteActionCompatParcelizer(int i) {
        return this.read.isStickyHeader(i);
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    public final void RemoteActionCompatParcelizer(View view) {
        this.read.setupStickyHeaderView(view);
    }

    @Override // kotlin.updatePriorityTaskManagerForIsLoadingChange
    public final void write(View view) {
        this.read.teardownStickyHeaderView(view);
    }
}
