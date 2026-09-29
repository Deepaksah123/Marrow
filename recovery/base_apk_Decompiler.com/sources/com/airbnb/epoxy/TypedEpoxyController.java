package com.airbnb.epoxy;

import android.os.Handler;
import kotlin.getContentBufferedPosition;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypedEpoxyController<T> extends getContentBufferedPosition {
    private boolean allowModelBuildRequests;
    private T currentData;

    protected abstract void buildModels(T t);

    public TypedEpoxyController() {
    }

    public TypedEpoxyController(Handler handler, Handler handler2) {
        super(handler, handler2);
    }

    public final void setData(T t) {
        this.currentData = t;
        this.allowModelBuildRequests = true;
        requestModelBuild();
        this.allowModelBuildRequests = false;
    }

    @Override // kotlin.getContentBufferedPosition
    public final void requestModelBuild() {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestModelBuild();
    }

    @Override // kotlin.getContentBufferedPosition
    public void moveModel(int i, int i2) {
        this.allowModelBuildRequests = true;
        super.moveModel(i, i2);
        this.allowModelBuildRequests = false;
    }

    @Override // kotlin.getContentBufferedPosition
    public void requestDelayedModelBuild(int i) {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestDelayedModelBuild(i);
    }

    public final T getCurrentData() {
        return this.currentData;
    }

    @Override // kotlin.getContentBufferedPosition
    public final void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        buildModels(this.currentData);
    }
}
