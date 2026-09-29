package com.clevertap.android.sdk.pushnotification.amp;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.PlayerTimelineChangeReason;
import kotlin.RendererWakeupListener;
import kotlin.j;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/clevertap/android/sdk/pushnotification/amp/CTPushAmpWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "p0", "Landroidx/work/WorkerParameters;", "p1", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lo/j$RemoteActionCompatParcelizer;", "write", "()Lo/j$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CTPushAmpWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTPushAmpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public final j.RemoteActionCompatParcelizer write() {
        RendererWakeupListener.MediaMetadataCompat();
        PlayerTimelineChangeReason.IconCompatParcelizer(IconCompatParcelizer());
        j.RemoteActionCompatParcelizer remoteActionCompatParcelizer = j.RemoteActionCompatParcelizer.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, "");
        return remoteActionCompatParcelizer;
    }
}
