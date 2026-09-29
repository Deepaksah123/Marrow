package com.bumptech.glide;

import android.content.Context;
import com.marrow.MarrowAppGlideModule;
import java.util.Collections;
import java.util.Set;
import kotlin.canKeepMediaPeriodHolder;
import kotlin.onSeekBackIncrementChanged;
import kotlin.setMetadata;
import kotlin.setSelectionFlags;

/* JADX INFO: loaded from: classes2.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final MarrowAppGlideModule AudioAttributesCompatParcelizer = new MarrowAppGlideModule();

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    final /* synthetic */ canKeepMediaPeriodHolder.write AudioAttributesCompatParcelizer() {
        return read();
    }

    public GeneratedAppGlideModuleImpl(Context context) {
    }

    @Override // kotlin.getFollowingMediaPeriodInfo, kotlin.isLastInPeriod
    public final void IconCompatParcelizer(Context context, Glide glide, setSelectionFlags setselectionflags) {
        new onSeekBackIncrementChanged().IconCompatParcelizer(context, glide, setselectionflags);
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(context, glide, setselectionflags);
    }

    @Override // kotlin.getFirstMediaPeriodInfo
    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set<Class<?>> IconCompatParcelizer() {
        return Collections.emptySet();
    }

    private static setMetadata read() {
        return new setMetadata();
    }
}
