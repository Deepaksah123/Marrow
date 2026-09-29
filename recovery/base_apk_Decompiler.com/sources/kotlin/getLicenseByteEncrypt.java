package kotlin;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public final class getLicenseByteEncrypt {
    public static final <T> Object RemoteActionCompatParcelizer(Task<T> task, SampleVideos<? super T> sampleVideos) {
        return IconCompatParcelizer(task, sampleVideos);
    }

    private static final <T> Object IconCompatParcelizer(Task<T> task, SampleVideos<? super T> sampleVideos) throws Exception {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(task);
                    sb.append(" was cancelled normally.");
                    throw new CancellationException(sb.toString());
                }
                return task.getResult();
            }
            throw exception;
        }
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        task.addOnCompleteListener(setLastQueuedTimeMs.INSTANCE, new write(setstatesolvedcount));
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer;
    }

    static final class write<TResult> implements OnCompleteListener {
        private /* synthetic */ setStateRank<T> RemoteActionCompatParcelizer;

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception == null) {
                boolean zIsCanceled = task.isCanceled();
                setStateRank<T> setstaterank = this.RemoteActionCompatParcelizer;
                if (zIsCanceled) {
                    setstaterank.write((Throwable) null);
                    return;
                } else {
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                    setstaterank.resumeWith(C0177getRfBanners.read(task.getResult()));
                    return;
                }
            }
            SampleVideos sampleVideos = this.RemoteActionCompatParcelizer;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            sampleVideos.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(exception)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        write(setStateRank<? super T> setstaterank) {
            this.RemoteActionCompatParcelizer = setstaterank;
        }
    }
}
