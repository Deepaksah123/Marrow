package com.airbnb.epoxy;

import java.util.List;
import kotlin.getContentBufferedPosition;
import kotlin.getCurrentPeriodIndex;
import kotlin.getPlaylistMetadata;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleEpoxyController extends getContentBufferedPosition {
    private List<? extends getCurrentPeriodIndex<?>> currentModels;
    private boolean insideSetModels;

    public void setModels(List<? extends getCurrentPeriodIndex<?>> list) {
        this.currentModels = list;
        this.insideSetModels = true;
        requestModelBuild();
        this.insideSetModels = false;
    }

    @Override // kotlin.getContentBufferedPosition
    public final void requestModelBuild() {
        if (!this.insideSetModels) {
            throw new getPlaylistMetadata("You cannot call `requestModelBuild` directly. Call `setModels` instead.");
        }
        super.requestModelBuild();
    }

    @Override // kotlin.getContentBufferedPosition
    public final void buildModels() {
        if (!isBuildingModels()) {
            throw new getPlaylistMetadata("You cannot call `buildModels` directly. Call `setModels` instead.");
        }
        add(this.currentModels);
    }
}
