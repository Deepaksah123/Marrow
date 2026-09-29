package kotlin;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class setAudioFocusState {
    static {
        n.write("Schedulers");
    }

    public static void RemoteActionCompatParcelizer(final List<willPauseWhenDucked> list, handlePlatformAudioFocusChange handleplatformaudiofocuschange, final Executor executor, final WorkDatabase workDatabase, final b bVar) {
        handleplatformaudiofocuschange.IconCompatParcelizer(new AudioBecomingNoisyManagerAudioBecomingNoisyReceiver() { // from class: o.getFocusListener
            @Override // kotlin.AudioBecomingNoisyManagerAudioBecomingNoisyReceiver
            public final void RemoteActionCompatParcelizer(CProjection cProjection, boolean z) {
                executor.execute(new Runnable() { // from class: o.shouldAbandonAudioFocusIfHeld
                    @Override // java.lang.Runnable
                    public final void run() {
                        setAudioFocusState.write(list, cProjection, bVar, workDatabase);
                    }
                });
            }
        });
    }

    static /* synthetic */ void write(List list, CProjection cProjection, b bVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((willPauseWhenDucked) it.next()).AudioAttributesCompatParcelizer(cProjection.AudioAttributesCompatParcelizer());
        }
        write(bVar, workDatabase, list);
    }

    public static void write(b bVar, WorkDatabase workDatabase, List<willPauseWhenDucked> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        CVolumeFlags cVolumeFlagsOnMediaButtonEvent = workDatabase.onMediaButtonEvent();
        workDatabase.read();
        try {
            List<CVideoChangeFrameRateStrategy> listWrite = cVolumeFlagsOnMediaButtonEvent.write();
            read(cVolumeFlagsOnMediaButtonEvent, bVar.getAudioAttributesCompatParcelizer(), listWrite);
            List<CVideoChangeFrameRateStrategy> listRemoteActionCompatParcelizer = cVolumeFlagsOnMediaButtonEvent.RemoteActionCompatParcelizer(bVar.getHandleMediaPlayPauseIfPendingOnHandler());
            read(cVolumeFlagsOnMediaButtonEvent, bVar.getAudioAttributesCompatParcelizer(), listRemoteActionCompatParcelizer);
            if (listWrite != null) {
                listRemoteActionCompatParcelizer.addAll(listWrite);
            }
            List<CVideoChangeFrameRateStrategy> listAudioAttributesCompatParcelizer = cVolumeFlagsOnMediaButtonEvent.AudioAttributesCompatParcelizer();
            workDatabase.onCustomAction();
            workDatabase.AudioAttributesImplApi21Parcelizer();
            if (listRemoteActionCompatParcelizer.size() > 0) {
                CVideoChangeFrameRateStrategy[] cVideoChangeFrameRateStrategyArr = (CVideoChangeFrameRateStrategy[]) listRemoteActionCompatParcelizer.toArray(new CVideoChangeFrameRateStrategy[listRemoteActionCompatParcelizer.size()]);
                for (willPauseWhenDucked willpausewhenducked : list) {
                    if (willpausewhenducked.IconCompatParcelizer()) {
                        willpausewhenducked.read(cVideoChangeFrameRateStrategyArr);
                    }
                }
            }
            if (listAudioAttributesCompatParcelizer.size() > 0) {
                CVideoChangeFrameRateStrategy[] cVideoChangeFrameRateStrategyArr2 = (CVideoChangeFrameRateStrategy[]) listAudioAttributesCompatParcelizer.toArray(new CVideoChangeFrameRateStrategy[listAudioAttributesCompatParcelizer.size()]);
                for (willPauseWhenDucked willpausewhenducked2 : list) {
                    if (!willpausewhenducked2.IconCompatParcelizer()) {
                        willpausewhenducked2.read(cVideoChangeFrameRateStrategyArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.AudioAttributesImplApi21Parcelizer();
            throw th;
        }
    }

    static willPauseWhenDucked read(Context context, WorkDatabase workDatabase, b bVar) {
        seekToNextWindow seektonextwindow = new seekToNextWindow(context, workDatabase, bVar);
        buildVideoRenderers.RemoteActionCompatParcelizer(context, SystemJobService.class, true);
        n.write();
        return seektonextwindow;
    }

    private static void read(CVolumeFlags cVolumeFlags, setInstallerPackageName setinstallerpackagename, List<CVideoChangeFrameRateStrategy> list) {
        if (list.size() > 0) {
            long j = setinstallerpackagename.read();
            Iterator<CVideoChangeFrameRateStrategy> it = list.iterator();
            while (it.hasNext()) {
                cVolumeFlags.AudioAttributesCompatParcelizer(it.next().AudioAttributesImplApi21Parcelizer, j);
            }
        }
    }
}
