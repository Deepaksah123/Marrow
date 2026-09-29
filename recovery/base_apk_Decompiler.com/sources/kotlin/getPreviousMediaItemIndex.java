package kotlin;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.asBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class getPreviousMediaItemIndex {
    private static /* synthetic */ hasPrevious AudioAttributesCompatParcelizer(Context context, b bVar) {
        DeviceInfo deviceInfo = new DeviceInfo(bVar.getIconCompatParcelizer());
        WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
        setMediaCodecSelector setmediacodecselector = deviceInfo.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setmediacodecselector, "");
        WorkDatabase workDatabaseIconCompatParcelizer = WorkDatabase.Companion.IconCompatParcelizer(applicationContext, setmediacodecselector, bVar.getAudioAttributesCompatParcelizer(), context.getResources().getBoolean(asBinder.RemoteActionCompatParcelizer.workmanager_test_configuration));
        Context applicationContext2 = context.getApplicationContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext2, "");
        return RemoteActionCompatParcelizer(context, bVar, deviceInfo, workDatabaseIconCompatParcelizer, new Bundleable(applicationContext2, deviceInfo, null, null, null, null, 60, null), new handlePlatformAudioFocusChange(context.getApplicationContext(), bVar, deviceInfo, workDatabaseIconCompatParcelizer), IconCompatParcelizer.IconCompatParcelizer);
    }

    static final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements markComplete<Context, b, setEnableDecoderFallback, WorkDatabase, Bundleable, handlePlatformAudioFocusChange, List<? extends willPauseWhenDucked>> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: avoid collision after fix types in other method */
        private static List<willPauseWhenDucked> AudioAttributesCompatParcelizer2(Context context, b bVar, setEnableDecoderFallback setenabledecoderfallback, WorkDatabase workDatabase, Bundleable bundleable, handlePlatformAudioFocusChange handleplatformaudiofocuschange) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(bVar, "");
            toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
            toMagicModuleMetaRepoModel.write(workDatabase, "");
            toMagicModuleMetaRepoModel.write(bundleable, "");
            toMagicModuleMetaRepoModel.write(handleplatformaudiofocuschange, "");
            return getPreviousMediaItemIndex.RemoteActionCompatParcelizer(context, bVar, setenabledecoderfallback, workDatabase, bundleable, handleplatformaudiofocuschange);
        }

        @Override // kotlin.markComplete
        public final /* bridge */ /* synthetic */ List<? extends willPauseWhenDucked> AudioAttributesCompatParcelizer(Context context, b bVar, setEnableDecoderFallback setenabledecoderfallback, WorkDatabase workDatabase, Bundleable bundleable, handlePlatformAudioFocusChange handleplatformaudiofocuschange) {
            return AudioAttributesCompatParcelizer2(context, bVar, setenabledecoderfallback, workDatabase, bundleable, handleplatformaudiofocuschange);
        }

        IconCompatParcelizer() {
            super(6, getPreviousMediaItemIndex.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }
    }

    private static hasPrevious RemoteActionCompatParcelizer(Context context, b bVar, setEnableDecoderFallback setenabledecoderfallback, WorkDatabase workDatabase, Bundleable bundleable, handlePlatformAudioFocusChange handleplatformaudiofocuschange, markComplete<? super Context, ? super b, ? super setEnableDecoderFallback, ? super WorkDatabase, ? super Bundleable, ? super handlePlatformAudioFocusChange, ? extends List<? extends willPauseWhenDucked>> markcomplete) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bVar, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
        toMagicModuleMetaRepoModel.write(workDatabase, "");
        toMagicModuleMetaRepoModel.write(bundleable, "");
        toMagicModuleMetaRepoModel.write(handleplatformaudiofocuschange, "");
        toMagicModuleMetaRepoModel.write(markcomplete, "");
        return new hasPrevious(context.getApplicationContext(), bVar, setenabledecoderfallback, workDatabase, markcomplete.AudioAttributesCompatParcelizer(context, bVar, setenabledecoderfallback, workDatabase, bundleable, handleplatformaudiofocuschange), handleplatformaudiofocuschange, bundleable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<willPauseWhenDucked> RemoteActionCompatParcelizer(Context context, b bVar, setEnableDecoderFallback setenabledecoderfallback, WorkDatabase workDatabase, Bundleable bundleable, handlePlatformAudioFocusChange handleplatformaudiofocuschange) {
        willPauseWhenDucked willpausewhenducked = setAudioFocusState.read(context, workDatabase, bVar);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(willpausewhenducked, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new willPauseWhenDucked[]{willpausewhenducked, new removeMediaItem(context, bVar, bundleable, handleplatformaudiofocuschange, new hasPreviousMediaItem(handleplatformaudiofocuschange, setenabledecoderfallback), setenabledecoderfallback)});
    }

    public static final TopUserCompanion read(setEnableDecoderFallback setenabledecoderfallback) {
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
        getPlatform getplatformRemoteActionCompatParcelizer = setenabledecoderfallback.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplatformRemoteActionCompatParcelizer, "");
        return College.AudioAttributesCompatParcelizer(getplatformRemoteActionCompatParcelizer);
    }

    public static final hasPrevious IconCompatParcelizer(Context context, b bVar) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bVar, "");
        return AudioAttributesCompatParcelizer(context, bVar);
    }
}
