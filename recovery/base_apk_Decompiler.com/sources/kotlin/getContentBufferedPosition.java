package kotlin;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getContentBufferedPosition implements getTotalBufferedDuration {
    private static final int DELAY_TO_CHECK_ADAPTER_COUNT_MS = 3000;
    private final getCurrentPosition adapter;
    private final Runnable buildModelsRunnable;
    private getCurrentMediaItemIndex debugObserver;
    private volatile boolean filterDuplicates;
    private volatile boolean hasBuiltModelsEver;
    private final getApplicationLooper helper;
    private final List<AudioAttributesCompatParcelizer> interceptors;
    private final Handler modelBuildHandler;
    private List<write> modelInterceptorCallbacks;
    private verifyApplicationThread modelsBeingBuilt;
    private int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    private getCurrentPeriodIndex<?> stagedModel;
    private volatile Thread threadBuildingModels;
    private removeListener timer;
    private static final removeListener NO_OP_TIMER = new isLoading();
    public static Handler defaultModelBuildingHandler = getSeekBackIncrement.read.IconCompatParcelizer;
    public static Handler defaultDiffingHandler = getSeekBackIncrement.read.IconCompatParcelizer;
    private static boolean filterDuplicatesDefault = false;
    private static boolean globalDebugLoggingEnabled = false;
    private static read globalExceptionHandler = new read() { // from class: o.getContentBufferedPosition.3
    };

    public interface AudioAttributesCompatParcelizer {
    }

    public interface read {
    }

    interface write {
        void RemoteActionCompatParcelizer();

        void read();
    }

    protected abstract void buildModels();

    public boolean isStickyHeader(int i) {
        return false;
    }

    protected void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    protected void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    protected void onExceptionSwallowed(RuntimeException runtimeException) {
    }

    protected void onModelBound(getMaxSeekToPreviousPosition getmaxseektopreviousposition, getCurrentPeriodIndex<?> getcurrentperiodindex, int i, getCurrentPeriodIndex<?> getcurrentperiodindex2) {
    }

    protected void onModelUnbound(getMaxSeekToPreviousPosition getmaxseektopreviousposition, getCurrentPeriodIndex<?> getcurrentperiodindex) {
    }

    protected void onViewAttachedToWindow(getMaxSeekToPreviousPosition getmaxseektopreviousposition, getCurrentPeriodIndex<?> getcurrentperiodindex) {
    }

    protected void onViewDetachedFromWindow(getMaxSeekToPreviousPosition getmaxseektopreviousposition, getCurrentPeriodIndex<?> getcurrentperiodindex) {
    }

    public void setupStickyHeaderView(View view) {
    }

    public void teardownStickyHeaderView(View view) {
    }

    public getContentBufferedPosition() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    public getContentBufferedPosition(Handler handler, Handler handler2) {
        this.recyclerViewAttachCount = 0;
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        this.helper = getAvailableCommands.read(this);
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new Runnable() { // from class: o.getContentBufferedPosition.2
            @Override // java.lang.Runnable
            public final void run() {
                getContentBufferedPosition.this.threadBuildingModels = Thread.currentThread();
                getContentBufferedPosition.this.cancelPendingModelBuild();
                getContentBufferedPosition.this.helper.resetAutoModels();
                getContentBufferedPosition.this.modelsBeingBuilt = new verifyApplicationThread(getContentBufferedPosition.this.getExpectedModelCount());
                getContentBufferedPosition.this.timer.AudioAttributesCompatParcelizer("Models built");
                try {
                    getContentBufferedPosition.this.buildModels();
                    getContentBufferedPosition.this.addCurrentlyStagedModelIfExists();
                    getContentBufferedPosition.this.timer.write();
                    getContentBufferedPosition.this.runInterceptors();
                    getContentBufferedPosition getcontentbufferedposition = getContentBufferedPosition.this;
                    getcontentbufferedposition.filterDuplicatesIfNeeded(getcontentbufferedposition.modelsBeingBuilt);
                    getContentBufferedPosition.this.modelsBeingBuilt.AudioAttributesCompatParcelizer();
                    getContentBufferedPosition.this.timer.AudioAttributesCompatParcelizer("Models diffed");
                    getContentBufferedPosition.this.adapter.write(getContentBufferedPosition.this.modelsBeingBuilt);
                    getContentBufferedPosition.this.timer.write();
                    getContentBufferedPosition.this.modelsBeingBuilt = null;
                    getContentBufferedPosition.this.hasBuiltModelsEver = true;
                    getContentBufferedPosition.this.threadBuildingModels = null;
                } catch (Throwable th) {
                    getContentBufferedPosition.this.timer.write();
                    getContentBufferedPosition.this.modelsBeingBuilt = null;
                    getContentBufferedPosition.this.hasBuiltModelsEver = true;
                    getContentBufferedPosition.this.threadBuildingModels = null;
                    getContentBufferedPosition.this.stagedModel = null;
                    throw th;
                }
            }
        };
        this.adapter = new getCurrentPosition(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new getPlaylistMetadata("Cannot call `requestModelBuild` from inside `buildModels`");
        }
        if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    public boolean hasPendingModelBuild() {
        return (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.AudioAttributesImplBaseParcelizer()) ? false : true;
    }

    public void addModelBuildListener(lambdanew0comgoogleandroidexoplayer2ExoPlayerImpl lambdanew0comgoogleandroidexoplayer2exoplayerimpl) {
        this.adapter.RemoteActionCompatParcelizer(lambdanew0comgoogleandroidexoplayer2exoplayerimpl);
    }

    public void removeModelBuildListener(lambdanew0comgoogleandroidexoplayer2ExoPlayerImpl lambdanew0comgoogleandroidexoplayer2exoplayerimpl) {
        this.adapter.AudioAttributesCompatParcelizer(lambdanew0comgoogleandroidexoplayer2exoplayerimpl);
    }

    public void requestDelayedModelBuild(int i) {
        synchronized (this) {
            if (isBuildingModels()) {
                throw new getPlaylistMetadata("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
            }
            if (this.requestedModelBuildType == 2) {
                cancelPendingModelBuild();
            } else if (this.requestedModelBuildType == 1) {
                return;
            }
            this.requestedModelBuildType = i == 0 ? 1 : 2;
            this.modelBuildHandler.postDelayed(this.buildModelsRunnable, i);
        }
    }

    public void cancelPendingModelBuild() {
        synchronized (this) {
            if (this.requestedModelBuildType != 0) {
                this.requestedModelBuildType = 0;
                this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpectedModelCount() {
        int itemCount = this.adapter.getItemCount();
        if (itemCount != 0) {
            return itemCount;
        }
        return 25;
    }

    int getFirstIndexOfModelInBuildingList(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i = 0; i < size; i++) {
            if (this.modelsBeingBuilt.get(i) == getcurrentperiodindex) {
                return i;
            }
        }
        return -1;
    }

    boolean isModelAddedMultipleTimes(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.modelsBeingBuilt.get(i2) == getcurrentperiodindex) {
                i++;
            }
        }
        return i > 1;
    }

    void addAfterInterceptorCallback(write writeVar) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(writeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<write> list = this.modelInterceptorCallbacks;
            if (list != null) {
                Iterator<write> it = list.iterator();
                while (it.hasNext()) {
                    it.next().read();
                }
            }
            this.timer.AudioAttributesCompatParcelizer("Interceptors executed");
            for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : this.interceptors) {
            }
            this.timer.write();
            List<write> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                Iterator<write> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().RemoteActionCompatParcelizer();
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public void addInterceptor(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.interceptors.add(audioAttributesCompatParcelizer);
    }

    public void removeInterceptor(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.interceptors.remove(audioAttributesCompatParcelizer);
    }

    protected int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new getPlaylistMetadata("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new getPlaylistMetadata("Cannot call this from inside `buildModels`");
        }
    }

    @Override // kotlin.getTotalBufferedDuration
    public void add(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        getcurrentperiodindex.write(this);
    }

    protected void add(getCurrentPeriodIndex<?>... getcurrentperiodindexArr) {
        verifyApplicationThread verifyapplicationthread = this.modelsBeingBuilt;
        verifyapplicationthread.ensureCapacity(verifyapplicationthread.size() + getcurrentperiodindexArr.length);
        for (getCurrentPeriodIndex<?> getcurrentperiodindex : getcurrentperiodindexArr) {
            add(getcurrentperiodindex);
        }
    }

    protected void add(List<? extends getCurrentPeriodIndex<?>> list) {
        verifyApplicationThread verifyapplicationthread = this.modelsBeingBuilt;
        verifyapplicationthread.ensureCapacity(verifyapplicationthread.size() + list.size());
        Iterator<? extends getCurrentPeriodIndex<?>> it = list.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    void addInternal(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        assertIsBuildingModels();
        if (getcurrentperiodindex.write()) {
            throw new getPlaylistMetadata("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        }
        if (!getcurrentperiodindex.AudioAttributesImplApi21Parcelizer()) {
            throw new getPlaylistMetadata("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
        clearModelFromStaging(getcurrentperiodindex);
        getcurrentperiodindex.IconCompatParcelizer = null;
        this.modelsBeingBuilt.add(getcurrentperiodindex);
    }

    void setStagedModel(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        if (getcurrentperiodindex != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = getcurrentperiodindex;
    }

    void addCurrentlyStagedModelIfExists() {
        getCurrentPeriodIndex<?> getcurrentperiodindex = this.stagedModel;
        if (getcurrentperiodindex != null) {
            getcurrentperiodindex.write(this);
        }
        this.stagedModel = null;
    }

    void clearModelFromStaging(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        if (this.stagedModel != getcurrentperiodindex) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    protected boolean isBuildingModels() {
        return this.threadBuildingModels == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterDuplicatesIfNeeded(List<getCurrentPeriodIndex<?>> list) {
        if (this.filterDuplicates) {
            this.timer.AudioAttributesCompatParcelizer("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator<getCurrentPeriodIndex<?>> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                getCurrentPeriodIndex<?> next = listIterator.next();
                if (!hashSet.add(Long.valueOf(next.AudioAttributesCompatParcelizer()))) {
                    int iPreviousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int iFindPositionOfDuplicate = findPositionOfDuplicate(list, next);
                    getCurrentPeriodIndex<?> getcurrentperiodindex = list.get(iFindPositionOfDuplicate);
                    if (iPreviousIndex <= iFindPositionOfDuplicate) {
                        iFindPositionOfDuplicate++;
                    }
                    StringBuilder sb = new StringBuilder("Two models have the same ID. ID's must be unique!\nOriginal has position ");
                    sb.append(iFindPositionOfDuplicate);
                    sb.append(":\n");
                    sb.append(getcurrentperiodindex);
                    sb.append("\nDuplicate has position ");
                    sb.append(iPreviousIndex);
                    sb.append(":\n");
                    sb.append(next);
                    onExceptionSwallowed(new getPlaylistMetadata(sb.toString()));
                }
            }
            this.timer.write();
        }
    }

    private int findPositionOfDuplicate(List<getCurrentPeriodIndex<?>> list, getCurrentPeriodIndex<?> getcurrentperiodindex) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).AudioAttributesCompatParcelizer() == getcurrentperiodindex.AudioAttributesCompatParcelizer()) {
                return i;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    public void setFilterDuplicates(boolean z) {
        this.filterDuplicates = z;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z) {
        filterDuplicatesDefault = z;
    }

    public void setDebugLoggingEnabled(boolean z) {
        assertNotBuildingModels();
        if (z) {
            this.timer = new addListener(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new getCurrentMediaItemIndex(getClass().getSimpleName());
            }
            this.adapter.registerAdapterDataObserver(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        getCurrentMediaItemIndex getcurrentmediaitemindex = this.debugObserver;
        if (getcurrentmediaitemindex != null) {
            this.adapter.unregisterAdapterDataObserver(getcurrentmediaitemindex);
        }
    }

    public boolean isDebugLoggingEnabled() {
        return this.timer != NO_OP_TIMER;
    }

    public static void setGlobalDebugLoggingEnabled(boolean z) {
        globalDebugLoggingEnabled = z;
    }

    public void moveModel(int i, int i2) {
        assertNotBuildingModels();
        this.adapter.IconCompatParcelizer(i, i2);
        requestDelayedModelBuild(500);
    }

    public void notifyModelChanged(int i) {
        assertNotBuildingModels();
        this.adapter.read(i);
    }

    public getCurrentPosition getAdapter() {
        return this.adapter;
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.adapter.IconCompatParcelizer(bundle);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.adapter.RemoteActionCompatParcelizer(bundle);
    }

    public GridLayoutManager.IconCompatParcelizer getSpanSizeLookup() {
        return this.adapter.read();
    }

    public void setSpanCount(int i) {
        this.adapter.IconCompatParcelizer(i);
    }

    public int getSpanCount() {
        return this.adapter.IconCompatParcelizer();
    }

    public boolean isMultiSpan() {
        return this.adapter.AudioAttributesImplApi26Parcelizer();
    }

    public static void setGlobalExceptionHandler(read readVar) {
        globalExceptionHandler = readVar;
    }

    void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i;
        if (i > 1) {
            getSeekBackIncrement.read.IconCompatParcelizer.postDelayed(new Runnable() { // from class: o.getContentBufferedPosition.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (getContentBufferedPosition.this.recyclerViewAttachCount > 1) {
                        getContentBufferedPosition.this.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
                    }
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }
}
