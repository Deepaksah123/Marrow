package kotlin;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class onInterleavedBinaryDataReceived {
    private addMessageLine IconCompatParcelizer;
    private final List<RtspMessageChannelMessageListener> RemoteActionCompatParcelizer;
    public processMPEG4FmtpAttribute write;
    private int read = -1;
    private boolean AudioAttributesCompatParcelizer = true;

    private onInterleavedBinaryDataReceived(List<RtspMessageChannelMessageListener> list) {
        this.RemoteActionCompatParcelizer = list;
    }

    public final List<RtspMessageChannelMessageListener> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final addMessageLine AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public static onInterleavedBinaryDataReceived write(List<RtspMessageChannelMessageListener> list) {
        onInterleavedBinaryDataReceived oninterleavedbinarydatareceived = new onInterleavedBinaryDataReceived(list);
        oninterleavedbinarydatareceived.read = list.get(0).write();
        Iterator<RtspMessageChannelMessageListener> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().MediaBrowserCompatCustomActionResultReceiver() < 3) {
                oninterleavedbinarydatareceived.read = -1;
                break;
            }
        }
        RtspMessageChannelMessageListener rtspMessageChannelMessageListener = list.get(list.size() - 1);
        processMPEG4FmtpAttribute processmpeg4fmtpattributeIconCompatParcelizer = rtspMessageChannelMessageListener.IconCompatParcelizer();
        if (processmpeg4fmtpattributeIconCompatParcelizer != null) {
            oninterleavedbinarydatareceived.write = processmpeg4fmtpattributeIconCompatParcelizer;
            oninterleavedbinarydatareceived.IconCompatParcelizer = processmpeg4fmtpattributeIconCompatParcelizer.AudioAttributesCompatParcelizer();
            oninterleavedbinarydatareceived.AudioAttributesCompatParcelizer = processmpeg4fmtpattributeIconCompatParcelizer.RemoteActionCompatParcelizer() == 0;
            return oninterleavedbinarydatareceived;
        }
        throw new parseNextLine(2, rtspMessageChannelMessageListener.read());
    }
}
