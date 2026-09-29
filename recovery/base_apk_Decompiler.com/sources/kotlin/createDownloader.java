package kotlin;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class createDownloader extends getCount {
    private final DownloadHelper<String, getCount> RemoteActionCompatParcelizer = new DownloadHelper<>((byte) 0);

    public final void RemoteActionCompatParcelizer(String str, getCount getcount) {
        DownloadHelper<String, getCount> downloadHelper = this.RemoteActionCompatParcelizer;
        if (getcount == null) {
            getcount = DefaultDownloaderFactory.read;
        }
        downloadHelper.put(str, getcount);
    }

    public final Set<Map.Entry<String, getCount>> RatingCompat() {
        return this.RemoteActionCompatParcelizer.entrySet();
    }

    public final getCount AudioAttributesCompatParcelizer(String str) {
        return this.RemoteActionCompatParcelizer.get(str);
    }

    public final createDownloader IconCompatParcelizer(String str) {
        return (createDownloader) this.RemoteActionCompatParcelizer.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof createDownloader) && ((createDownloader) obj).RemoteActionCompatParcelizer.equals(this.RemoteActionCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }
}
