package kotlin;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda33 extends AsyncTask<String, Void, Boolean> {
    private final File AudioAttributesCompatParcelizer;
    private final String read;
    private final read write;

    public interface read {
        void read(File file);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean] */
    @Override // android.os.AsyncTask
    public final /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return null;
            }
            try {
                this = write(strArr);
                return this;
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
                return null;
            }
        } catch (Throwable th2) {
            getMinWindowSequenceNumber.read(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Boolean bool) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            try {
                write(bool.booleanValue());
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
            }
        } catch (Throwable th2) {
            getMinWindowSequenceNumber.read(th2, this);
        }
    }

    public DefaultAnalyticsCollectorExternalSyntheticLambda33(String str, File file, read readVar) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        this.read = str;
        this.AudioAttributesCompatParcelizer = file;
        this.write = readVar;
    }

    private Boolean write(String... strArr) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return null;
            }
            try {
                toMagicModuleMetaRepoModel.write(strArr, "");
                try {
                    URL url = new URL(this.read);
                    URLConnection uRLConnection = (URLConnection) getAvcProfileAndLevel.read(url.openConnection());
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uRLConnection, "");
                    int contentLength = uRLConnection.getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(getAvcProfileAndLevel.AudioAttributesCompatParcelizer(url));
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.AudioAttributesCompatParcelizer));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
                return null;
            }
        } catch (Throwable th2) {
            getMinWindowSequenceNumber.read(th2, this);
            return null;
        }
    }

    private void write(boolean z) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this) || !z) {
                return;
            }
            try {
                this.write.read(this.AudioAttributesCompatParcelizer);
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
            }
        } catch (Throwable th2) {
            getMinWindowSequenceNumber.read(th2, this);
        }
    }
}
