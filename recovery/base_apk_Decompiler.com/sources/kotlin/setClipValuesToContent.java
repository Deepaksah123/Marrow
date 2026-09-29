package kotlin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class setClipValuesToContent {
    private final String AudioAttributesCompatParcelizer;
    private FileChannel RemoteActionCompatParcelizer;

    public setClipValuesToContent(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".lck");
        this.AudioAttributesCompatParcelizer = sb.toString();
    }

    public final void read() throws IOException {
        if (this.RemoteActionCompatParcelizer == null) {
            try {
                File file = new File(this.AudioAttributesCompatParcelizer);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.RemoteActionCompatParcelizer = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = this.RemoteActionCompatParcelizer;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.RemoteActionCompatParcelizer = null;
                StringBuilder sb = new StringBuilder("Unable to lock file: '");
                sb.append(this.AudioAttributesCompatParcelizer);
                sb.append("'.");
                throw new IllegalStateException(sb.toString(), th);
            }
        }
    }

    public final void IconCompatParcelizer() {
        FileChannel fileChannel = this.RemoteActionCompatParcelizer;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.RemoteActionCompatParcelizer = null;
        }
    }
}
