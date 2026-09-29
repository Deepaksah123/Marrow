package kotlin;

import java.io.IOException;
import java.util.Arrays;
import kotlin.getRetryDelayMillis;

/* JADX INFO: loaded from: classes3.dex */
public final class onWaitingForRequirementsChanged {
    private static final onWaitingForRequirementsChanged IconCompatParcelizer = new onWaitingForRequirementsChanged(0, new int[0], new Object[0], false);
    private int AudioAttributesCompatParcelizer;
    private int[] MediaBrowserCompatItemReceiver;
    private Object[] RemoteActionCompatParcelizer;
    private boolean read;
    private int write;

    public static onWaitingForRequirementsChanged IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    static onWaitingForRequirementsChanged write(onWaitingForRequirementsChanged onwaitingforrequirementschanged, onWaitingForRequirementsChanged onwaitingforrequirementschanged2) {
        int i = onwaitingforrequirementschanged.write + onwaitingforrequirementschanged2.write;
        int[] iArrCopyOf = Arrays.copyOf(onwaitingforrequirementschanged.MediaBrowserCompatItemReceiver, i);
        System.arraycopy(onwaitingforrequirementschanged2.MediaBrowserCompatItemReceiver, 0, iArrCopyOf, onwaitingforrequirementschanged.write, onwaitingforrequirementschanged2.write);
        Object[] objArrCopyOf = Arrays.copyOf(onwaitingforrequirementschanged.RemoteActionCompatParcelizer, i);
        System.arraycopy(onwaitingforrequirementschanged2.RemoteActionCompatParcelizer, 0, objArrCopyOf, onwaitingforrequirementschanged.write, onwaitingforrequirementschanged2.write);
        return new onWaitingForRequirementsChanged(i, iArrCopyOf, objArrCopyOf, true);
    }

    private onWaitingForRequirementsChanged() {
        this(0, new int[8], new Object[8], true);
    }

    private onWaitingForRequirementsChanged(int i, int[] iArr, Object[] objArr, boolean z) {
        this.AudioAttributesCompatParcelizer = -1;
        this.write = i;
        this.MediaBrowserCompatItemReceiver = iArr;
        this.RemoteActionCompatParcelizer = objArr;
        this.read = z;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read = false;
    }

    private void write() {
        if (!this.read) {
            throw new UnsupportedOperationException();
        }
    }

    final void AudioAttributesCompatParcelizer(getRetryDelayMillis getretrydelaymillis) throws IOException {
        if (getretrydelaymillis.AudioAttributesCompatParcelizer() == getRetryDelayMillis.read.DESCENDING) {
            for (int i = this.write - 1; i >= 0; i--) {
                getretrydelaymillis.write(DownloadRequest.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver[i]), this.RemoteActionCompatParcelizer[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.write; i2++) {
            getretrydelaymillis.write(DownloadRequest.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver[i2]), this.RemoteActionCompatParcelizer[i2]);
        }
    }

    public final void RemoteActionCompatParcelizer(getRetryDelayMillis getretrydelaymillis) throws IOException {
        if (this.write != 0) {
            if (getretrydelaymillis.AudioAttributesCompatParcelizer() == getRetryDelayMillis.read.ASCENDING) {
                for (int i = 0; i < this.write; i++) {
                    IconCompatParcelizer(this.MediaBrowserCompatItemReceiver[i], this.RemoteActionCompatParcelizer[i], getretrydelaymillis);
                }
                return;
            }
            for (int i2 = this.write - 1; i2 >= 0; i2--) {
                IconCompatParcelizer(this.MediaBrowserCompatItemReceiver[i2], this.RemoteActionCompatParcelizer[i2], getretrydelaymillis);
            }
        }
    }

    private static void IconCompatParcelizer(int i, Object obj, getRetryDelayMillis getretrydelaymillis) throws IOException {
        int iAudioAttributesCompatParcelizer = DownloadRequest.AudioAttributesCompatParcelizer(i);
        int iRemoteActionCompatParcelizer = DownloadRequest.RemoteActionCompatParcelizer(i);
        if (iRemoteActionCompatParcelizer == 0) {
            getretrydelaymillis.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, ((Long) obj).longValue());
            return;
        }
        if (iRemoteActionCompatParcelizer == 1) {
            getretrydelaymillis.RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, ((Long) obj).longValue());
            return;
        }
        if (iRemoteActionCompatParcelizer == 2) {
            getretrydelaymillis.IconCompatParcelizer(iAudioAttributesCompatParcelizer, (DownloadIndex) obj);
            return;
        }
        if (iRemoteActionCompatParcelizer != 3) {
            if (iRemoteActionCompatParcelizer == 5) {
                getretrydelaymillis.read(iAudioAttributesCompatParcelizer, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(getMaxParallelDownloads.write());
        }
        if (getretrydelaymillis.AudioAttributesCompatParcelizer() == getRetryDelayMillis.read.ASCENDING) {
            getretrydelaymillis.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
            ((onWaitingForRequirementsChanged) obj).RemoteActionCompatParcelizer(getretrydelaymillis);
            getretrydelaymillis.read(iAudioAttributesCompatParcelizer);
        } else {
            getretrydelaymillis.read(iAudioAttributesCompatParcelizer);
            ((onWaitingForRequirementsChanged) obj).RemoteActionCompatParcelizer(getretrydelaymillis);
            getretrydelaymillis.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
        }
    }

    public final int read() {
        int i = this.AudioAttributesCompatParcelizer;
        if (i != -1) {
            return i;
        }
        int iRemoteActionCompatParcelizer = 0;
        for (int i2 = 0; i2 < this.write; i2++) {
            iRemoteActionCompatParcelizer += DownloadManager.RemoteActionCompatParcelizer(DownloadRequest.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver[i2]), (DownloadIndex) this.RemoteActionCompatParcelizer[i2]);
        }
        this.AudioAttributesCompatParcelizer = iRemoteActionCompatParcelizer;
        return iRemoteActionCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        int iAudioAttributesCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.write; i3++) {
            int i4 = this.MediaBrowserCompatItemReceiver[i3];
            int iAudioAttributesCompatParcelizer2 = DownloadRequest.AudioAttributesCompatParcelizer(i4);
            int iRemoteActionCompatParcelizer = DownloadRequest.RemoteActionCompatParcelizer(i4);
            if (iRemoteActionCompatParcelizer == 0) {
                iAudioAttributesCompatParcelizer = DownloadManager.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer2, ((Long) this.RemoteActionCompatParcelizer[i3]).longValue());
            } else if (iRemoteActionCompatParcelizer == 1) {
                iAudioAttributesCompatParcelizer = DownloadManager.read(iAudioAttributesCompatParcelizer2);
            } else if (iRemoteActionCompatParcelizer == 2) {
                iAudioAttributesCompatParcelizer = DownloadManager.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer2, (DownloadIndex) this.RemoteActionCompatParcelizer[i3]);
            } else if (iRemoteActionCompatParcelizer == 3) {
                iAudioAttributesCompatParcelizer = (DownloadManager.MediaBrowserCompatSearchResultReceiver(iAudioAttributesCompatParcelizer2) << 1) + ((onWaitingForRequirementsChanged) this.RemoteActionCompatParcelizer[i3]).RemoteActionCompatParcelizer();
            } else if (iRemoteActionCompatParcelizer == 5) {
                iAudioAttributesCompatParcelizer = DownloadManager.RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer2);
            } else {
                throw new IllegalStateException(getMaxParallelDownloads.write());
            }
            i2 += iAudioAttributesCompatParcelizer;
        }
        this.AudioAttributesCompatParcelizer = i2;
        return i2;
    }

    private static boolean RemoteActionCompatParcelizer(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof onWaitingForRequirementsChanged)) {
            return false;
        }
        onWaitingForRequirementsChanged onwaitingforrequirementschanged = (onWaitingForRequirementsChanged) obj;
        int i = this.write;
        return i == onwaitingforrequirementschanged.write && RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, onwaitingforrequirementschanged.MediaBrowserCompatItemReceiver, i) && RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, onwaitingforrequirementschanged.RemoteActionCompatParcelizer, this.write);
    }

    private static int IconCompatParcelizer(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int write(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public final int hashCode() {
        int i = this.write;
        return ((((i + 527) * 31) + IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, i)) * 31) + write(this.RemoteActionCompatParcelizer, this.write);
    }

    final void read(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.write; i2++) {
            canDownloadsRun.AudioAttributesCompatParcelizer(sb, i, String.valueOf(DownloadRequest.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver[i2])), this.RemoteActionCompatParcelizer[i2]);
        }
    }

    private void RemoteActionCompatParcelizer(int i) {
        int[] iArr = this.MediaBrowserCompatItemReceiver;
        if (i > iArr.length) {
            int i2 = this.write;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.MediaBrowserCompatItemReceiver = Arrays.copyOf(iArr, i);
            this.RemoteActionCompatParcelizer = Arrays.copyOf(this.RemoteActionCompatParcelizer, i);
        }
    }

    final onWaitingForRequirementsChanged RemoteActionCompatParcelizer(onWaitingForRequirementsChanged onwaitingforrequirementschanged) {
        if (onwaitingforrequirementschanged.equals(IconCompatParcelizer())) {
            return this;
        }
        write();
        int i = this.write + onwaitingforrequirementschanged.write;
        RemoteActionCompatParcelizer(i);
        System.arraycopy(onwaitingforrequirementschanged.MediaBrowserCompatItemReceiver, 0, this.MediaBrowserCompatItemReceiver, this.write, onwaitingforrequirementschanged.write);
        System.arraycopy(onwaitingforrequirementschanged.RemoteActionCompatParcelizer, 0, this.RemoteActionCompatParcelizer, this.write, onwaitingforrequirementschanged.write);
        this.write = i;
        return this;
    }
}
