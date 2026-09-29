package kotlin;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.readSourceOmittingSampleData;

/* JADX INFO: loaded from: classes3.dex */
final class initCodec extends Binder {
    private final read RemoteActionCompatParcelizer;

    interface read {
        Task<Void> write(Intent intent);
    }

    initCodec(read readVar) {
        this.RemoteActionCompatParcelizer = readVar;
    }

    final void write(final readSourceOmittingSampleData.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        this.RemoteActionCompatParcelizer.write(remoteActionCompatParcelizer.RemoteActionCompatParcelizer).addOnCompleteListener(new ObjectIdWriter(), new OnCompleteListener() { // from class: o.reinitializeCodec
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                remoteActionCompatParcelizer.write();
            }
        });
    }
}
