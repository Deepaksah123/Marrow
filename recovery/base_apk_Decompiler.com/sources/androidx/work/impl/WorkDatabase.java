package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.AudioBecomingNoisyManager;
import kotlin.AudioBecomingNoisyManagerEventListener;
import kotlin.AudioFocusManager;
import kotlin.CAudioFlags;
import kotlin.CColorRange;
import kotlin.CRoleFlags;
import kotlin.CStreamType;
import kotlin.CVolumeFlags;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.ValueClassSerializerCompanion;
import kotlin.ValueClassSerializerStaticJsonValue;
import kotlin.abandonAudioFocusDefault;
import kotlin.abandonAudioFocusIfHeld;
import kotlin.abandonAudioFocusV26;
import kotlin.convertAudioAttributesToFocusGain;
import kotlin.fromBundle;
import kotlin.getMagicModuleMeta;
import kotlin.getTimelineByChildIndex;
import kotlin.getVolumeMultiplier;
import kotlin.getWindow;
import kotlin.isCommandAvailable;
import kotlin.onAudioBecomingNoisy;
import kotlin.requestAudioFocusV26;
import kotlin.setEntryLabelTextSize;
import kotlin.setInstallerPackageName;
import kotlin.setRotationAngle;
import kotlin.shouldStartPlayback;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lo/ValueClassSerializerStaticJsonValue;", "<init>", "()V", "Lo/CVolumeFlags;", "onMediaButtonEvent", "()Lo/CVolumeFlags;", "Lo/fromBundle;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/fromBundle;", "Lo/shouldStartPlayback;", "onPrepareFromMediaId", "()Lo/shouldStartPlayback;", "Lo/CColorRange;", "onPause", "()Lo/CColorRange;", "Lo/CRoleFlags;", "onFastForward", "()Lo/CRoleFlags;", "Lo/CStreamType;", "onPlayFromMediaId", "()Lo/CStreamType;", "Lo/CAudioFlags;", "onPlay", "()Lo/CAudioFlags;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class WorkDatabase extends ValueClassSerializerStaticJsonValue {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract fromBundle MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

    public abstract CRoleFlags onFastForward();

    public abstract CVolumeFlags onMediaButtonEvent();

    public abstract CColorRange onPause();

    public abstract CAudioFlags onPlay();

    public abstract CStreamType onPlayFromMediaId();

    public abstract shouldStartPlayback onPrepareFromMediaId();

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lo/setInstallerPackageName;", "p2", "", "p3", "Landroidx/work/impl/WorkDatabase;", "IconCompatParcelizer", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lo/setInstallerPackageName;Z)Landroidx/work/impl/WorkDatabase;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static WorkDatabase IconCompatParcelizer(final Context p0, Executor p1, setInstallerPackageName p2, boolean p3) {
            ValueClassSerializerStaticJsonValue.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            if (p3) {
                remoteActionCompatParcelizer = ValueClassSerializerCompanion.RemoteActionCompatParcelizer(p0, WorkDatabase.class).read();
            } else {
                remoteActionCompatParcelizer = ValueClassSerializerCompanion.write(p0, WorkDatabase.class, "androidx.work.workdb").read(new setEntryLabelTextSize.AudioAttributesCompatParcelizer() { // from class: o.AudioFocusManagerAudioFocusListenerExternalSyntheticLambda0
                    @Override // o.setEntryLabelTextSize.AudioAttributesCompatParcelizer
                    public final setEntryLabelTextSize AudioAttributesCompatParcelizer(setEntryLabelTextSize.write writeVar) {
                        return WorkDatabase.Companion.RemoteActionCompatParcelizer(p0, writeVar);
                    }
                });
            }
            return (WorkDatabase) remoteActionCompatParcelizer.RemoteActionCompatParcelizer(p1).RemoteActionCompatParcelizer(new getTimelineByChildIndex(p2)).read(abandonAudioFocusIfHeld.INSTANCE).read(new getVolumeMultiplier(p0, 2, 3)).read(convertAudioAttributesToFocusGain.INSTANCE).read(abandonAudioFocusV26.INSTANCE).read(new getVolumeMultiplier(p0, 5, 6)).read(abandonAudioFocusDefault.INSTANCE).read(AudioFocusManager.INSTANCE).read(requestAudioFocusV26.INSTANCE).read(new isCommandAvailable(p0)).read(new getVolumeMultiplier(p0, 10, 11)).read(AudioBecomingNoisyManager.INSTANCE).read(AudioBecomingNoisyManagerEventListener.INSTANCE).read(onAudioBecomingNoisy.INSTANCE).read(getWindow.INSTANCE).read(new getVolumeMultiplier(p0, 21, 22)).AudioAttributesCompatParcelizer().write();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final setEntryLabelTextSize RemoteActionCompatParcelizer(Context context, setEntryLabelTextSize.write writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            setEntryLabelTextSize.write.Companion companion = setEntryLabelTextSize.write.INSTANCE;
            setEntryLabelTextSize.write.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = setEntryLabelTextSize.write.Companion.RemoteActionCompatParcelizer(context);
            iconCompatParcelizerRemoteActionCompatParcelizer.write(writeVar.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(writeVar.read).AudioAttributesCompatParcelizer().read();
            return new setRotationAngle().AudioAttributesCompatParcelizer(iconCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
