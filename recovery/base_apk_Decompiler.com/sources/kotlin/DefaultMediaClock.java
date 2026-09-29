package kotlin;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.getChildPeriodUidFromConcatenatedUid;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultMediaClock {
    private static final void read(hasPrevious hasprevious, String str) {
        WorkDatabase workDatabaseAudioAttributesImplApi26Parcelizer = hasprevious.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(workDatabaseAudioAttributesImplApi26Parcelizer, "");
        write(workDatabaseAudioAttributesImplApi26Parcelizer, str);
        handlePlatformAudioFocusChange handleplatformaudiofocuschangeIconCompatParcelizer = hasprevious.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(handleplatformaudiofocuschangeIconCompatParcelizer, "");
        handleplatformaudiofocuschangeIconCompatParcelizer.RemoteActionCompatParcelizer(str);
        Iterator<willPauseWhenDucked> it = hasprevious.RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(str);
        }
    }

    private static final void IconCompatParcelizer(hasPrevious hasprevious) {
        setAudioFocusState.write(hasprevious.AudioAttributesCompatParcelizer(), hasprevious.AudioAttributesImplApi26Parcelizer(), hasprevious.RemoteActionCompatParcelizer());
    }

    private static final void write(WorkDatabase workDatabase, String str) {
        CVolumeFlags cVolumeFlagsOnMediaButtonEvent = workDatabase.onMediaButtonEvent();
        fromBundle frombundleMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = workDatabase.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        List listWrite = IntermediateLoginResponseBody.write(str);
        while (!listWrite.isEmpty()) {
            String str2 = (String) IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(listWrite);
            getChildPeriodUidFromConcatenatedUid.write writeVarRemoteActionCompatParcelizer = cVolumeFlagsOnMediaButtonEvent.RemoteActionCompatParcelizer(str2);
            if (writeVarRemoteActionCompatParcelizer != getChildPeriodUidFromConcatenatedUid.write.AudioAttributesImplBaseParcelizer && writeVarRemoteActionCompatParcelizer != getChildPeriodUidFromConcatenatedUid.write.read) {
                cVolumeFlagsOnMediaButtonEvent.MediaBrowserCompatCustomActionResultReceiver(str2);
            }
            listWrite.addAll(frombundleMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(str2));
        }
    }

    public static final onTransact AudioAttributesCompatParcelizer(final UUID uuid, final hasPrevious hasprevious) {
        toMagicModuleMetaRepoModel.write(uuid, "");
        toMagicModuleMetaRepoModel.write(hasprevious, "");
        getConcatenatedUid onFastForward = hasprevious.AudioAttributesCompatParcelizer().getOnFastForward();
        setMediaCodecSelector setmediacodecselector = hasprevious.MediaBrowserCompatCustomActionResultReceiver().read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setmediacodecselector, "");
        return q.RemoteActionCompatParcelizer(onFastForward, "CancelWorkById", setmediacodecselector, new getCreatedOnDateMs() { // from class: o.onRendererDisabled
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return DefaultMediaClock.read(hasprevious, uuid);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(final hasPrevious hasprevious, final UUID uuid) {
        WorkDatabase workDatabaseAudioAttributesImplApi26Parcelizer = hasprevious.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(workDatabaseAudioAttributesImplApi26Parcelizer, "");
        workDatabaseAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(new Runnable() { // from class: o.setPlaybackParameters
            @Override // java.lang.Runnable
            public final void run() {
                DefaultMediaClock.RemoteActionCompatParcelizer(hasprevious, uuid);
            }
        });
        IconCompatParcelizer(hasprevious);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(hasPrevious hasprevious, UUID uuid) {
        String string = uuid.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        read(hasprevious, string);
    }

    public static final onTransact read(final String str, final hasPrevious hasprevious) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(hasprevious, "");
        getConcatenatedUid onFastForward = hasprevious.AudioAttributesCompatParcelizer().getOnFastForward();
        String strConcat = "CancelWorkByName_".concat(String.valueOf(str));
        setMediaCodecSelector setmediacodecselector = hasprevious.MediaBrowserCompatCustomActionResultReceiver().read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setmediacodecselector, "");
        return q.RemoteActionCompatParcelizer(onFastForward, strConcat, setmediacodecselector, new getCreatedOnDateMs() { // from class: o.getPositionUs
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return DefaultMediaClock.write(str, hasprevious);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, hasPrevious hasprevious) {
        RemoteActionCompatParcelizer(str, hasprevious);
        IconCompatParcelizer(hasprevious);
        return getShowPopup.INSTANCE;
    }

    public static final void RemoteActionCompatParcelizer(final String str, final hasPrevious hasprevious) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(hasprevious, "");
        final WorkDatabase workDatabaseAudioAttributesImplApi26Parcelizer = hasprevious.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(workDatabaseAudioAttributesImplApi26Parcelizer, "");
        workDatabaseAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(new Runnable() { // from class: o.setTargetBufferBytes
            @Override // java.lang.Runnable
            public final void run() {
                DefaultMediaClock.RemoteActionCompatParcelizer(workDatabaseAudioAttributesImplApi26Parcelizer, str, hasprevious);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(WorkDatabase workDatabase, String str, hasPrevious hasprevious) {
        Iterator<String> it = workDatabase.onMediaButtonEvent().read(str).iterator();
        while (it.hasNext()) {
            read(hasprevious, it.next());
        }
    }

    public static final onTransact AudioAttributesCompatParcelizer(final hasPrevious hasprevious) {
        toMagicModuleMetaRepoModel.write(hasprevious, "");
        getConcatenatedUid onFastForward = hasprevious.AudioAttributesCompatParcelizer().getOnFastForward();
        setMediaCodecSelector setmediacodecselector = hasprevious.MediaBrowserCompatCustomActionResultReceiver().read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setmediacodecselector, "");
        return q.RemoteActionCompatParcelizer(onFastForward, "CancelAllWork", setmediacodecselector, new getCreatedOnDateMs() { // from class: o.getPlaybackParameters
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return DefaultMediaClock.read(hasprevious);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(final hasPrevious hasprevious) {
        final WorkDatabase workDatabaseAudioAttributesImplApi26Parcelizer = hasprevious.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(workDatabaseAudioAttributesImplApi26Parcelizer, "");
        workDatabaseAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(new Runnable() { // from class: o.onRendererEnabled
            @Override // java.lang.Runnable
            public final void run() {
                DefaultMediaClock.write(workDatabaseAudioAttributesImplApi26Parcelizer, hasprevious);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(WorkDatabase workDatabase, hasPrevious hasprevious) {
        Iterator<String> it = workDatabase.onMediaButtonEvent().RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            read(hasprevious, it.next());
        }
        new forceDisableMediaCodecAsynchronousQueueing(workDatabase).read(hasprevious.AudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer().read());
    }
}
