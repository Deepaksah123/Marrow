package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
public final class isHdr10PlusOutOfBandMetadataSupported implements Closeable {
    private final URL AudioAttributesCompatParcelizer;
    private Task<Bitmap> read;
    private volatile Future<?> write;

    public static isHdr10PlusOutOfBandMetadataSupported IconCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new isHdr10PlusOutOfBandMetadataSupported(new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private isHdr10PlusOutOfBandMetadataSupported(URL url) {
        this.AudioAttributesCompatParcelizer = url;
    }

    public final void RemoteActionCompatParcelizer(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.write = executorService.submit(new Runnable() { // from class: o.isSeamlessAdaptationSupported
            @Override // java.lang.Runnable
            public final void run() {
                this.write.IconCompatParcelizer(taskCompletionSource);
            }
        });
        this.read = taskCompletionSource.getTask();
    }

    final /* synthetic */ void IconCompatParcelizer(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(write());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public final Task<Bitmap> read() {
        return (Task) Preconditions.checkNotNull(this.read);
    }

    private Bitmap write() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Objects.toString(this.AudioAttributesCompatParcelizer);
        }
        byte[] bArrIconCompatParcelizer = IconCompatParcelizer();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrIconCompatParcelizer, 0, bArrIconCompatParcelizer.length);
        if (bitmapDecodeByteArray == null) {
            StringBuilder sb = new StringBuilder("Failed to decode image: ");
            sb.append(this.AudioAttributesCompatParcelizer);
            throw new IOException(sb.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(this.AudioAttributesCompatParcelizer);
        }
        return bitmapDecodeByteArray;
    }

    private byte[] IconCompatParcelizer() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.AudioAttributesCompatParcelizer.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArr = estimateLegacyVp9ProfileLevels.read(estimateLegacyVp9ProfileLevels.RemoteActionCompatParcelizer(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArr.length;
                Objects.toString(this.AudioAttributesCompatParcelizer);
            }
            if (bArr.length <= 1048576) {
                return bArr;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.write.cancel(true);
    }
}
