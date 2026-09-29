package kotlin;

import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class _findEnumCaseInsensitive {
    private final DataOutputStream IconCompatParcelizer;
    private final ByteArrayOutputStream write;

    public _findEnumCaseInsensitive() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.write = byteArrayOutputStream;
        this.IconCompatParcelizer = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] IconCompatParcelizer(EventMessage eventMessage) {
        this.write.reset();
        try {
            RemoteActionCompatParcelizer(this.IconCompatParcelizer, eventMessage.AudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer(this.IconCompatParcelizer, eventMessage.RemoteActionCompatParcelizer != null ? eventMessage.RemoteActionCompatParcelizer : "");
            this.IconCompatParcelizer.writeLong(eventMessage.IconCompatParcelizer);
            this.IconCompatParcelizer.writeLong(eventMessage.read);
            this.IconCompatParcelizer.write(eventMessage.write);
            this.IconCompatParcelizer.flush();
            return this.write.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void RemoteActionCompatParcelizer(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
