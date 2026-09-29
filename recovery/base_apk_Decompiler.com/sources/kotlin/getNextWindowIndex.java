package kotlin;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class getNextWindowIndex {
    public abstract j read(Context context, String str, WorkerParameters workerParameters);

    private static final Class<? extends j> read(String str) {
        try {
            Class clsAsSubclass = Class.forName(str).asSubclass(j.class);
            toMagicModuleMetaRepoModel.write(clsAsSubclass);
            return clsAsSubclass;
        } catch (Throwable th) {
            n.write();
            String unused = getFirstWindowIndexByChildIndex.IconCompatParcelizer;
            throw th;
        }
    }

    private static final j IconCompatParcelizer(Context context, String str, WorkerParameters workerParameters) {
        try {
            j jVarNewInstance = read(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            toMagicModuleMetaRepoModel.write(jVarNewInstance);
            return jVarNewInstance;
        } catch (Throwable th) {
            n.write();
            String unused = getFirstWindowIndexByChildIndex.IconCompatParcelizer;
            throw th;
        }
    }

    public final j write(Context context, String str, WorkerParameters workerParameters) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(workerParameters, "");
        j jVarIconCompatParcelizer = read(context, str, workerParameters);
        if (jVarIconCompatParcelizer == null) {
            jVarIconCompatParcelizer = IconCompatParcelizer(context, str, workerParameters);
        }
        if (!jVarIconCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            return jVarIconCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("WorkerFactory (");
        sb.append(getClass().getName());
        sb.append(") returned an instance of a ListenableWorker (");
        sb.append(str);
        sb.append(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        throw new IllegalStateException(sb.toString());
    }
}
