package kotlin;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.CVideoChangeFrameRateStrategy;
import kotlin.getChildIndexByWindowIndex;
import kotlin.getChildPeriodUidFromConcatenatedUid;

/* JADX INFO: loaded from: classes2.dex */
public final class isCurrentMediaItemSeekable {
    private static final getChildIndexByWindowIndex.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(handlePlatformAudioFocusChange handleplatformaudiofocuschange, final WorkDatabase workDatabase, b bVar, final List<? extends willPauseWhenDucked> list, final CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, final Set<String> set) {
        final String str = cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer;
        final CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer = workDatabase.onMediaButtonEvent().AudioAttributesCompatParcelizer(str);
        if (cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("Worker with ");
            sb.append(str);
            sb.append(" doesn't exist");
            throw new IllegalArgumentException(sb.toString());
        }
        if (cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer.onCommand.AudioAttributesCompatParcelizer()) {
            return getChildIndexByWindowIndex.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
        if (cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer.MediaDescriptionCompat() ^ cVideoChangeFrameRateStrategy.MediaDescriptionCompat()) {
            getAnswerMap getanswermap = new getAnswerMap() { // from class: o.isCurrentMediaItemDynamic
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return isCurrentMediaItemSeekable.RemoteActionCompatParcelizer((CVideoChangeFrameRateStrategy) obj);
                }
            };
            StringBuilder sb2 = new StringBuilder("Can't update ");
            sb2.append((String) getanswermap.invoke(cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer));
            sb2.append(" Worker to ");
            sb2.append((String) getanswermap.invoke(cVideoChangeFrameRateStrategy));
            sb2.append(" Worker. Update operation must preserve worker's type.");
            throw new UnsupportedOperationException(sb2.toString());
        }
        final boolean zIconCompatParcelizer = handleplatformaudiofocuschange.IconCompatParcelizer(str);
        if (!zIconCompatParcelizer) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((willPauseWhenDucked) it.next()).AudioAttributesCompatParcelizer(str);
            }
        }
        workDatabase.AudioAttributesCompatParcelizer(new Runnable() { // from class: o.hasPreviousWindow
            @Override // java.lang.Runnable
            public final void run() {
                isCurrentMediaItemSeekable.read(workDatabase, cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer, cVideoChangeFrameRateStrategy, list, str, set, zIconCompatParcelizer);
            }
        });
        if (!zIconCompatParcelizer) {
            setAudioFocusState.write(bVar, workDatabase, list);
        }
        return zIconCompatParcelizer ? getChildIndexByWindowIndex.RemoteActionCompatParcelizer.read : getChildIndexByWindowIndex.RemoteActionCompatParcelizer.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RemoteActionCompatParcelizer(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        return cVideoChangeFrameRateStrategy.MediaDescriptionCompat() ? "Periodic" : "OneTime";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(WorkDatabase workDatabase, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy2, List list, String str, Set set, boolean z) {
        CVolumeFlags cVolumeFlagsOnMediaButtonEvent = workDatabase.onMediaButtonEvent();
        shouldStartPlayback shouldstartplaybackOnPrepareFromMediaId = workDatabase.onPrepareFromMediaId();
        CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategyWrite = CVideoChangeFrameRateStrategy.write(cVideoChangeFrameRateStrategy2, null, cVideoChangeFrameRateStrategy.onCommand, null, null, null, null, 0L, 0L, 0L, null, cVideoChangeFrameRateStrategy.onAddQueueItem, null, 0L, cVideoChangeFrameRateStrategy.RatingCompat, 0L, 0L, false, null, cVideoChangeFrameRateStrategy.getOnPlayFromMediaId(), cVideoChangeFrameRateStrategy.getOnPlay() + 1, cVideoChangeFrameRateStrategy.getOnFastForward(), cVideoChangeFrameRateStrategy.getOnPause(), 0, null, null, 29613053);
        if (cVideoChangeFrameRateStrategy2.getOnPause() == 1) {
            cVideoChangeFrameRateStrategyWrite.read(cVideoChangeFrameRateStrategy2.getOnFastForward());
            cVideoChangeFrameRateStrategyWrite.read(cVideoChangeFrameRateStrategyWrite.getOnPause() + 1);
        }
        cVolumeFlagsOnMediaButtonEvent.AudioAttributesCompatParcelizer(onPlaybackParametersChanged.write(list, cVideoChangeFrameRateStrategyWrite));
        shouldstartplaybackOnPrepareFromMediaId.RemoteActionCompatParcelizer(str);
        shouldstartplaybackOnPrepareFromMediaId.RemoteActionCompatParcelizer(str, set);
        if (z) {
            return;
        }
        cVolumeFlagsOnMediaButtonEvent.AudioAttributesCompatParcelizer(str, -1L);
        workDatabase.onPlayFromMediaId().read(str);
    }

    public static final onTransact read(final hasPrevious hasprevious, final String str, final getChildIndexByChildUid getchildindexbychilduid) {
        toMagicModuleMetaRepoModel.write(hasprevious, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getchildindexbychilduid, "");
        getConcatenatedUid onFastForward = hasprevious.AudioAttributesCompatParcelizer().getOnFastForward();
        String strConcat = "enqueueUniquePeriodic_".concat(String.valueOf(str));
        setMediaCodecSelector setmediacodecselector = hasprevious.MediaBrowserCompatCustomActionResultReceiver().read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setmediacodecselector, "");
        return q.RemoteActionCompatParcelizer(onFastForward, strConcat, setmediacodecselector, new getCreatedOnDateMs() { // from class: o.moveMediaItem
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isCurrentMediaItemSeekable.RemoteActionCompatParcelizer(hasprevious, str, getchildindexbychilduid);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final hasPrevious hasprevious, final String str, final getChildIndexByChildUid getchildindexbychilduid) {
        getCreatedOnDateMs getcreatedondatems = new getCreatedOnDateMs() { // from class: o.isPlaying
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isCurrentMediaItemSeekable.write(getchildindexbychilduid, hasprevious, str);
            }
        };
        CVolumeFlags cVolumeFlagsOnMediaButtonEvent = hasprevious.AudioAttributesImplApi26Parcelizer().onMediaButtonEvent();
        List<CVideoChangeFrameRateStrategy.write> listAudioAttributesImplApi26Parcelizer = cVolumeFlagsOnMediaButtonEvent.AudioAttributesImplApi26Parcelizer(str);
        if (listAudioAttributesImplApi26Parcelizer.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        CVideoChangeFrameRateStrategy.write writeVar = (CVideoChangeFrameRateStrategy.write) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) listAudioAttributesImplApi26Parcelizer);
        if (writeVar == null) {
            getcreatedondatems.invoke();
            return getShowPopup.INSTANCE;
        }
        CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer = cVolumeFlagsOnMediaButtonEvent.AudioAttributesCompatParcelizer(writeVar.AudioAttributesCompatParcelizer);
        if (cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder("WorkSpec with ");
            sb.append(writeVar.AudioAttributesCompatParcelizer);
            sb.append(", that matches a name \"");
            sb.append(str);
            sb.append("\", wasn't found");
            throw new IllegalStateException(sb.toString());
        }
        if (!cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer.MediaDescriptionCompat()) {
            throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (writeVar.RemoteActionCompatParcelizer == getChildPeriodUidFromConcatenatedUid.write.IconCompatParcelizer) {
            cVolumeFlagsOnMediaButtonEvent.write(writeVar.AudioAttributesCompatParcelizer);
            getcreatedondatems.invoke();
            return getShowPopup.INSTANCE;
        }
        CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategyWrite = CVideoChangeFrameRateStrategy.write(getchildindexbychilduid.getRead(), writeVar.AudioAttributesCompatParcelizer, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554430);
        handlePlatformAudioFocusChange handleplatformaudiofocuschangeIconCompatParcelizer = hasprevious.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(handleplatformaudiofocuschangeIconCompatParcelizer, "");
        WorkDatabase workDatabaseAudioAttributesImplApi26Parcelizer = hasprevious.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(workDatabaseAudioAttributesImplApi26Parcelizer, "");
        b bVarAudioAttributesCompatParcelizer = hasprevious.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bVarAudioAttributesCompatParcelizer, "");
        List<willPauseWhenDucked> listRemoteActionCompatParcelizer = hasprevious.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer, "");
        AudioAttributesCompatParcelizer(handleplatformaudiofocuschangeIconCompatParcelizer, workDatabaseAudioAttributesImplApi26Parcelizer, bVarAudioAttributesCompatParcelizer, listRemoteActionCompatParcelizer, cVideoChangeFrameRateStrategyWrite, getchildindexbychilduid.IconCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getChildIndexByChildUid getchildindexbychilduid, hasPrevious hasprevious, String str) {
        DefaultRenderersFactory.AudioAttributesCompatParcelizer(new AudioFocusManagerPlayerControl(hasprevious, str, g2.read, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(getchildindexbychilduid)));
        return getShowPopup.INSTANCE;
    }
}
