package kotlin;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class JsonFormatVisitable<D> {
    private Context mContext;
    private int mId;
    private RemoteActionCompatParcelizer<D> mListener;
    private IconCompatParcelizer<D> mOnLoadCanceledListener;
    private boolean mStarted = false;
    private boolean mAbandoned = false;
    private boolean mReset = true;
    private boolean mContentChanged = false;
    private boolean mProcessingChange = false;

    public interface IconCompatParcelizer<D> {
        void RemoteActionCompatParcelizer(JsonFormatVisitable<D> jsonFormatVisitable);
    }

    public interface RemoteActionCompatParcelizer<D> {
        void RemoteActionCompatParcelizer(JsonFormatVisitable<D> jsonFormatVisitable, D d);
    }

    protected void onAbandon() {
    }

    protected boolean onCancelLoad() {
        return false;
    }

    protected void onForceLoad() {
    }

    protected void onReset() {
    }

    protected void onStartLoading() {
    }

    protected void onStopLoading() {
    }

    public JsonFormatVisitable(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void deliverResult(D d) {
        RemoteActionCompatParcelizer<D> remoteActionCompatParcelizer = this.mListener;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(this, d);
        }
    }

    public void deliverCancellation() {
        IconCompatParcelizer<D> iconCompatParcelizer = this.mOnLoadCanceledListener;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(this);
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public void registerListener(int i, RemoteActionCompatParcelizer<D> remoteActionCompatParcelizer) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = remoteActionCompatParcelizer;
        this.mId = i;
    }

    public void unregisterListener(RemoteActionCompatParcelizer<D> remoteActionCompatParcelizer) {
        RemoteActionCompatParcelizer<D> remoteActionCompatParcelizer2 = this.mListener;
        if (remoteActionCompatParcelizer2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (remoteActionCompatParcelizer2 != remoteActionCompatParcelizer) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    public void registerOnLoadCanceledListener(IconCompatParcelizer<D> iconCompatParcelizer) {
        if (this.mOnLoadCanceledListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mOnLoadCanceledListener = iconCompatParcelizer;
    }

    public void unregisterOnLoadCanceledListener(IconCompatParcelizer<D> iconCompatParcelizer) {
        IconCompatParcelizer<D> iconCompatParcelizer2 = this.mOnLoadCanceledListener;
        if (iconCompatParcelizer2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (iconCompatParcelizer2 != iconCompatParcelizer) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mOnLoadCanceledListener = null;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void forceLoad() {
        onForceLoad();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public String dataToString(D d) {
        StringBuilder sb = new StringBuilder(64);
        if (d == null) {
            sb.append("null");
        } else {
            Class<?> cls = d.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }
}
