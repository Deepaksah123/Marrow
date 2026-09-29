package com.clevertap.android.sdk.pushnotification.work;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.PlayerPlaybackSuppressionReason;
import kotlin.PlayerTimelineChangeReason;
import kotlin.RendererWakeupListener;
import kotlin.j;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\u0006\n\u0004\b\t\u0010\u000f"}, d2 = {"Lcom/clevertap/android/sdk/pushnotification/work/CTFlushPushImpressionsWork;", "Landroidx/work/Worker;", "Landroid/content/Context;", "p0", "Landroidx/work/WorkerParameters;", "p1", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lo/j$RemoteActionCompatParcelizer;", "write", "()Lo/j$RemoteActionCompatParcelizer;", "", "AudioAttributesCompatParcelizer", "()Z", "", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CTFlushPushImpressionsWork extends Worker {
    private final String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTFlushPushImpressionsWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(workerParameters, "");
        this.write = "CTFlushPushImpressionsWork";
    }

    @Override // androidx.work.Worker
    public final j.RemoteActionCompatParcelizer write() {
        RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
        RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
        Context contextIconCompatParcelizer = IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextIconCompatParcelizer, "");
        ArrayList<PlayerTimelineChangeReason> arrayListRemoteActionCompatParcelizer = PlayerTimelineChangeReason.RemoteActionCompatParcelizer(contextIconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(arrayListRemoteActionCompatParcelizer, "");
        List listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((Iterable) arrayListRemoteActionCompatParcelizer);
        ArrayList<PlayerTimelineChangeReason> arrayList = new ArrayList();
        for (Object obj : listAudioAttributesImplApi26Parcelizer) {
            if (!((PlayerTimelineChangeReason) obj).MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer().MediaMetadataCompat()) {
                arrayList.add(obj);
            }
        }
        for (PlayerTimelineChangeReason playerTimelineChangeReason : arrayList) {
            if (AudioAttributesCompatParcelizer()) {
                j.RemoteActionCompatParcelizer remoteActionCompatParcelizer = j.RemoteActionCompatParcelizer.read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, "");
                return remoteActionCompatParcelizer;
            }
            playerTimelineChangeReason.AudioAttributesImplApi26Parcelizer();
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            PlayerPlaybackSuppressionReason.write(playerTimelineChangeReason, this.write, "PI_WM", contextIconCompatParcelizer);
        }
        RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
        j.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = j.RemoteActionCompatParcelizer.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2, "");
        return remoteActionCompatParcelizer2;
    }

    private final boolean AudioAttributesCompatParcelizer() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
        }
        return MediaBrowserCompatCustomActionResultReceiver();
    }
}
