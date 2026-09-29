package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
final class getProLimit {
    private final Executor RemoteActionCompatParcelizer = Executors.newSingleThreadExecutor();

    interface read {
        void read(SharedPreferences sharedPreferences);
    }

    public final Future<SharedPreferences> read(Context context, String str, read readVar) {
        FutureTask futureTask = new FutureTask(new AudioAttributesCompatParcelizer(context, str, readVar));
        this.RemoteActionCompatParcelizer.execute(futureTask);
        return futureTask;
    }

    static class AudioAttributesCompatParcelizer implements Callable<SharedPreferences> {
        private final Context AudioAttributesCompatParcelizer;
        private final read IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(Context context, String str, read readVar) {
            this.AudioAttributesCompatParcelizer = context;
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = readVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public SharedPreferences call() {
            SharedPreferences sharedPreferences = this.AudioAttributesCompatParcelizer.getSharedPreferences(this.RemoteActionCompatParcelizer, 0);
            read readVar = this.IconCompatParcelizer;
            if (readVar != null) {
                readVar.read(sharedPreferences);
            }
            return sharedPreferences;
        }
    }
}
