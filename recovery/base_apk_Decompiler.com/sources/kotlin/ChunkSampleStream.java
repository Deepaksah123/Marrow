package kotlin;

import android.database.Cursor;
import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.models.common.ApplicationData;
import java.util.TreeSet;
import kotlin.ChunkHolder;

/* JADX INFO: loaded from: classes3.dex */
public final class ChunkSampleStream implements ChunkHolder.read {
    private ApplicationData IconCompatParcelizer;
    private newChunkExtractor read;

    @setSdkPayload
    public ChunkSampleStream(newChunkExtractor newchunkextractor, ApplicationData applicationData) {
        this.read = newchunkextractor;
        this.IconCompatParcelizer = applicationData;
    }

    @Override // o.ChunkHolder.read
    public final boolean read(String str, String str2) {
        return this.read.AudioAttributesImplApi21Parcelizer(str, str2);
    }

    @Override // o.ChunkHolder.read
    public final boolean AudioAttributesCompatParcelizer(String str) {
        return this.read.AudioAttributesImplApi26Parcelizer(str);
    }

    @Override // o.ChunkHolder.read
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.read.RemoteActionCompatParcelizer(System.currentTimeMillis());
    }

    @Override // o.ChunkHolder.read
    public final boolean AudioAttributesImplBaseParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        Cursor cursorRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer("SELECT count(content_type) from _subscription WHERE content_type not in ('video', 'test', 'mcq') and content_type like '%subj' and expires_on >".concat(String.valueOf(sb.toString())));
        if (cursorRemoteActionCompatParcelizer == null) {
            return false;
        }
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                return cursorRemoteActionCompatParcelizer.getInt(0) > 0;
            }
            return false;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    @Override // o.ChunkHolder.read
    public final String[][] read() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        return this.read.write(new String[]{DownloadService.KEY_CONTENT_ID, "content_type", "expires_on", "content_name_for_event"}, "expires_on>=?", new String[]{sb.toString()}, null);
    }

    @Override // o.ChunkHolder.read
    public final String[][] IconCompatParcelizer() {
        return this.read.write(new String[]{DownloadService.KEY_CONTENT_ID, "content_type", "expires_on", "content_name_for_event"}, null, null, null);
    }

    @Override // o.ChunkHolder.read
    public final String AudioAttributesCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        if (AudioAttributesCompatParcelizer("test")) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("test");
        }
        if (AudioAttributesCompatParcelizer("mcq")) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("mcq");
        }
        if (AudioAttributesCompatParcelizer("video")) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("video");
        }
        if (sb.length() == 0) {
            sb.append("free");
        }
        return sb.toString();
    }

    @Override // o.ChunkHolder.read
    public final String write() {
        String[][] strArr = read();
        TreeSet treeSet = new TreeSet();
        for (String[] strArr2 : strArr) {
            if (strArr2.length > 1) {
                treeSet.add(strArr2[1].trim());
            }
        }
        if (treeSet.size() == 0) {
            return "free";
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr3 = (String[]) treeSet.toArray(new String[0]);
        for (int i = 0; i < strArr3.length; i++) {
            sb.append(strArr3[i]);
            if (i != strArr3.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    @Override // o.ChunkHolder.read
    public final int RemoteActionCompatParcelizer() {
        return this.read.read(System.currentTimeMillis());
    }
}
