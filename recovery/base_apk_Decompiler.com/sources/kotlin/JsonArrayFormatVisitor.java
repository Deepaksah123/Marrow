package kotlin;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonArrayFormatVisitor<D> extends JsonFormatVisitable<D> {
    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncTaskLoader";
    private volatile JsonArrayFormatVisitor<D>.AudioAttributesCompatParcelizer mCancellingTask;
    private Executor mExecutor;
    private Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile JsonArrayFormatVisitor<D>.AudioAttributesCompatParcelizer mTask;
    private long mUpdateThrottle;

    public void cancelLoadInBackground() {
    }

    public abstract D loadInBackground();

    public void onCanceled(D d) {
    }

    final class AudioAttributesCompatParcelizer extends expectAnyFormat<D> implements Runnable {
        boolean RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.expectAnyFormat
        protected final D read() {
            try {
                return (D) JsonArrayFormatVisitor.this.onLoadInBackground();
            } catch (_findStringConstructor e) {
                if (this.IconCompatParcelizer()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // kotlin.expectAnyFormat
        protected final void IconCompatParcelizer(D d) {
            JsonArrayFormatVisitor.this.dispatchOnLoadComplete(this, d);
        }

        @Override // kotlin.expectAnyFormat
        protected final void read(D d) {
            JsonArrayFormatVisitor.this.dispatchOnCancelled(this, d);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.RemoteActionCompatParcelizer = false;
            JsonArrayFormatVisitor.this.executePendingTask();
        }
    }

    public JsonArrayFormatVisitor(Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    @Override // kotlin.JsonFormatVisitable
    protected void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new AudioAttributesCompatParcelizer();
        executePendingTask();
    }

    @Override // kotlin.JsonFormatVisitable
    protected boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.RemoteActionCompatParcelizer) {
                this.mTask.RemoteActionCompatParcelizer = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.RemoteActionCompatParcelizer) {
            this.mTask.RemoteActionCompatParcelizer = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zRemoteActionCompatParcelizer = this.mTask.RemoteActionCompatParcelizer(false);
        if (zRemoteActionCompatParcelizer) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zRemoteActionCompatParcelizer;
    }

    void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.RemoteActionCompatParcelizer) {
            this.mTask.RemoteActionCompatParcelizer = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.RemoteActionCompatParcelizer = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        } else {
            if (this.mExecutor == null) {
                this.mExecutor = getExecutor();
            }
            this.mTask.write(this.mExecutor);
        }
    }

    void dispatchOnCancelled(JsonArrayFormatVisitor<D>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, D d) {
        onCanceled(d);
        if (this.mCancellingTask == audioAttributesCompatParcelizer) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(JsonArrayFormatVisitor<D>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, D d) {
        if (this.mTask != audioAttributesCompatParcelizer) {
            dispatchOnCancelled(audioAttributesCompatParcelizer, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d);
    }

    protected D onLoadInBackground() {
        return loadInBackground();
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    protected Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    @Override // kotlin.JsonFormatVisitable
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.RemoteActionCompatParcelizer);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.RemoteActionCompatParcelizer);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            printWriter.print(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(this.mUpdateThrottle)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.mLastLoadCompleteTime == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.mLastLoadCompleteTime));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }
}
