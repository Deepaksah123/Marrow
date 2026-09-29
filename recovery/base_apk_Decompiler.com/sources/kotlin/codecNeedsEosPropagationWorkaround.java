package kotlin;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class codecNeedsEosPropagationWorkaround {
    private final Executor RemoteActionCompatParcelizer;
    private final Map<String, Task<String>> write = new setTitleOptional();

    interface IconCompatParcelizer {
        Task<String> RemoteActionCompatParcelizer();
    }

    codecNeedsEosPropagationWorkaround(Executor executor) {
        this.RemoteActionCompatParcelizer = executor;
    }

    final Task<String> read(final String str, IconCompatParcelizer iconCompatParcelizer) {
        synchronized (this) {
            Task<String> task = this.write.get(str);
            if (task != null) {
                Log.isLoggable("FirebaseMessaging", 3);
                return task;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            Task taskContinueWithTask = iconCompatParcelizer.RemoteActionCompatParcelizer().continueWithTask(this.RemoteActionCompatParcelizer, new Continuation() { // from class: o.codecNeedsMonoChannelCountWorkaround
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return this.write.AudioAttributesCompatParcelizer(str, task2);
                }
            });
            this.write.put(str, (Task<String>) taskContinueWithTask);
            return taskContinueWithTask;
        }
    }

    final /* synthetic */ Task AudioAttributesCompatParcelizer(String str, Task task) throws Exception {
        synchronized (this) {
            this.write.remove(str);
        }
        return task;
    }
}
