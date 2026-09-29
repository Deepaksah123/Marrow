package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class maskTimelineAndPosition {
    public static final Object write(ComponentRegistry componentRegistry, Object obj) {
        toMagicModuleMetaRepoModel.write(componentRegistry, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        List<Pair<setDeviceVolume<? extends Object, ?>, Class<? extends Object>>> listRemoteActionCompatParcelizer = componentRegistry.RemoteActionCompatParcelizer();
        int size = listRemoteActionCompatParcelizer.size() - 1;
        if (size < 0) {
            return obj;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Pair<setDeviceVolume<? extends Object, ?>, Class<? extends Object>> pair = listRemoteActionCompatParcelizer.get(i);
            setDeviceVolume<? extends Object, ?> setdevicevolumeRemoteActionCompatParcelizer = pair.RemoteActionCompatParcelizer();
            if (pair.read().isAssignableFrom(obj.getClass()) && setdevicevolumeRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj)) {
                obj = setdevicevolumeRemoteActionCompatParcelizer.write(obj);
            }
            if (i2 > size) {
                return obj;
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ExoPlayerBuilderExternalSyntheticLambda9<T> RemoteActionCompatParcelizer(ComponentRegistry componentRegistry, T t) {
        Pair<ExoPlayerBuilderExternalSyntheticLambda9<? extends Object>, Class<? extends Object>> pair;
        toMagicModuleMetaRepoModel.write(componentRegistry, "");
        toMagicModuleMetaRepoModel.write(t, "");
        List<Pair<ExoPlayerBuilderExternalSyntheticLambda9<? extends Object>, Class<? extends Object>>> listIconCompatParcelizer = componentRegistry.IconCompatParcelizer();
        int size = listIconCompatParcelizer.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                pair = listIconCompatParcelizer.get(i);
                Pair<ExoPlayerBuilderExternalSyntheticLambda9<? extends Object>, Class<? extends Object>> pair2 = pair;
                ExoPlayerBuilderExternalSyntheticLambda9<? extends Object> exoPlayerBuilderExternalSyntheticLambda9RemoteActionCompatParcelizer = pair2.RemoteActionCompatParcelizer();
                if (!pair2.read().isAssignableFrom(t.getClass()) || !exoPlayerBuilderExternalSyntheticLambda9RemoteActionCompatParcelizer.write(t)) {
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                } else {
                    break;
                }
            }
            pair = null;
        } else {
            pair = null;
        }
        Pair<ExoPlayerBuilderExternalSyntheticLambda9<? extends Object>, Class<? extends Object>> pair3 = pair;
        if (pair3 == null) {
            throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Unable to fetch data. No fetcher supports: ", (Object) t).toString());
        }
        return (ExoPlayerBuilderExternalSyntheticLambda9) pair3.write();
    }

    public static final <T> ExoPlayerBuilderExternalSyntheticLambda21 AudioAttributesCompatParcelizer(ComponentRegistry componentRegistry, T t, LessonCompletedDialog lessonCompletedDialog) {
        ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21;
        toMagicModuleMetaRepoModel.write(componentRegistry, "");
        toMagicModuleMetaRepoModel.write(t, "");
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        List<ExoPlayerBuilderExternalSyntheticLambda21> listWrite = componentRegistry.write();
        int size = listWrite.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                exoPlayerBuilderExternalSyntheticLambda21 = listWrite.get(i);
                if (!exoPlayerBuilderExternalSyntheticLambda21.read(lessonCompletedDialog)) {
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                } else {
                    break;
                }
            }
            exoPlayerBuilderExternalSyntheticLambda21 = null;
        } else {
            exoPlayerBuilderExternalSyntheticLambda21 = null;
        }
        ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda212 = exoPlayerBuilderExternalSyntheticLambda21;
        if (exoPlayerBuilderExternalSyntheticLambda212 != null) {
            return exoPlayerBuilderExternalSyntheticLambda212;
        }
        throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Unable to decode data. No decoder supports: ", (Object) t).toString());
    }
}
