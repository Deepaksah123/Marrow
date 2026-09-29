package kotlin;

import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.e1;

/* JADX INFO: loaded from: classes2.dex */
public final class onPlaybackParametersChanged {
    public static final void RemoteActionCompatParcelizer(WorkDatabase workDatabase, b bVar, AudioFocusManagerPlayerControl audioFocusManagerPlayerControl) {
        int i;
        toMagicModuleMetaRepoModel.write(workDatabase, "");
        toMagicModuleMetaRepoModel.write(bVar, "");
        toMagicModuleMetaRepoModel.write(audioFocusManagerPlayerControl, "");
        List listWrite = IntermediateLoginResponseBody.write(audioFocusManagerPlayerControl);
        int i2 = 0;
        while (!listWrite.isEmpty()) {
            AudioFocusManagerPlayerControl audioFocusManagerPlayerControl2 = (AudioFocusManagerPlayerControl) IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(listWrite);
            List<? extends getChildIndexByChildUid> listAudioAttributesImplApi26Parcelizer = audioFocusManagerPlayerControl2.AudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesImplApi26Parcelizer, "");
            List<? extends getChildIndexByChildUid> list = listAudioAttributesImplApi26Parcelizer;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((getChildIndexByChildUid) it.next()).getRead().AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() && (i = i + 1) < 0) {
                        IntermediateLoginResponseBody.write();
                    }
                }
            }
            i2 += i;
            List<AudioFocusManagerPlayerControl> listRemoteActionCompatParcelizer = audioFocusManagerPlayerControl2.RemoteActionCompatParcelizer();
            if (listRemoteActionCompatParcelizer != null) {
                listWrite.addAll(listRemoteActionCompatParcelizer);
            }
        }
        if (i2 != 0) {
            int i3 = workDatabase.onMediaButtonEvent().read();
            int onCustomAction = bVar.getOnCustomAction();
            if (i3 + i2 <= onCustomAction) {
                return;
            }
            StringBuilder sb = new StringBuilder("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ");
            sb.append(onCustomAction);
            sb.append(";\nalready enqueued count: ");
            sb.append(i3);
            sb.append(";\ncurrent enqueue operation count: ");
            sb.append(i2);
            sb.append(".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static CVideoChangeFrameRateStrategy write(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        boolean zRemoteActionCompatParcelizer = cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zRemoteActionCompatParcelizer2 = cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zRemoteActionCompatParcelizer3 = cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zRemoteActionCompatParcelizer || !zRemoteActionCompatParcelizer2 || !zRemoteActionCompatParcelizer3) {
            return cVideoChangeFrameRateStrategy;
        }
        return CVideoChangeFrameRateStrategy.write(cVideoChangeFrameRateStrategy, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new e1.IconCompatParcelizer().RemoteActionCompatParcelizer(cVideoChangeFrameRateStrategy.AudioAttributesImplBaseParcelizer).AudioAttributesCompatParcelizer("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", cVideoChangeFrameRateStrategy.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).IconCompatParcelizer(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411);
    }

    public static final CVideoChangeFrameRateStrategy write(List<? extends willPauseWhenDucked> list, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        return write(cVideoChangeFrameRateStrategy);
    }
}
