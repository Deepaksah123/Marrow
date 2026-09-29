package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import kotlin._usesExternalId;

/* JADX INFO: loaded from: classes2.dex */
final class _deserializeTypedUsingDefaultImpl implements _usesExternalId {
    private static final List<write> RemoteActionCompatParcelizer = new ArrayList(50);
    private final Handler AudioAttributesCompatParcelizer;

    public _deserializeTypedUsingDefaultImpl(Handler handler) {
        this.AudioAttributesCompatParcelizer = handler;
    }

    @Override // kotlin._usesExternalId
    public final Looper IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getLooper();
    }

    @Override // kotlin._usesExternalId
    public final boolean write() {
        buildTypeSerializer.IconCompatParcelizer(true);
        return this.AudioAttributesCompatParcelizer.hasMessages(1);
    }

    @Override // kotlin._usesExternalId
    public final _usesExternalId.AudioAttributesCompatParcelizer write(int i) {
        return AudioAttributesCompatParcelizer().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.obtainMessage(i), this);
    }

    @Override // kotlin._usesExternalId
    public final _usesExternalId.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i, Object obj) {
        return AudioAttributesCompatParcelizer().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.obtainMessage(i, obj), this);
    }

    @Override // kotlin._usesExternalId
    public final _usesExternalId.AudioAttributesCompatParcelizer IconCompatParcelizer(int i, int i2, int i3) {
        return AudioAttributesCompatParcelizer().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.obtainMessage(i, i2, i3), this);
    }

    @Override // kotlin._usesExternalId
    public final _usesExternalId.AudioAttributesCompatParcelizer IconCompatParcelizer(int i, int i2, int i3, Object obj) {
        return AudioAttributesCompatParcelizer().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // kotlin._usesExternalId
    public final boolean RemoteActionCompatParcelizer(_usesExternalId.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return ((write) audioAttributesCompatParcelizer).write(this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin._usesExternalId
    public final boolean AudioAttributesCompatParcelizer(int i) {
        return this.AudioAttributesCompatParcelizer.sendEmptyMessage(i);
    }

    @Override // kotlin._usesExternalId
    public final boolean RemoteActionCompatParcelizer(long j) {
        return this.AudioAttributesCompatParcelizer.sendEmptyMessageAtTime(2, j);
    }

    @Override // kotlin._usesExternalId
    public final void RemoteActionCompatParcelizer(int i) {
        buildTypeSerializer.IconCompatParcelizer(i != 0);
        this.AudioAttributesCompatParcelizer.removeMessages(i);
    }

    @Override // kotlin._usesExternalId
    public final void read() {
        this.AudioAttributesCompatParcelizer.removeCallbacksAndMessages(null);
    }

    @Override // kotlin._usesExternalId
    public final boolean IconCompatParcelizer(Runnable runnable) {
        return this.AudioAttributesCompatParcelizer.post(runnable);
    }

    private static write AudioAttributesCompatParcelizer() {
        write writeVarRemove;
        List<write> list = RemoteActionCompatParcelizer;
        synchronized (list) {
            if (list.isEmpty()) {
                writeVarRemove = new write((byte) 0);
            } else {
                writeVarRemove = list.remove(list.size() - 1);
            }
        }
        return writeVarRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(write writeVar) {
        List<write> list = RemoteActionCompatParcelizer;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(writeVar);
            }
        }
    }

    static final class write implements _usesExternalId.AudioAttributesCompatParcelizer {
        private _deserializeTypedUsingDefaultImpl AudioAttributesCompatParcelizer;
        private Message write;

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        public final write IconCompatParcelizer(Message message, _deserializeTypedUsingDefaultImpl _deserializetypedusingdefaultimpl) {
            this.write = message;
            this.AudioAttributesCompatParcelizer = _deserializetypedusingdefaultimpl;
            return this;
        }

        public final boolean write(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) buildTypeSerializer.IconCompatParcelizer(this.write));
            RemoteActionCompatParcelizer();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // o._usesExternalId.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            ((Message) buildTypeSerializer.IconCompatParcelizer(this.write)).sendToTarget();
            RemoteActionCompatParcelizer();
        }

        private void RemoteActionCompatParcelizer() {
            this.write = null;
            this.AudioAttributesCompatParcelizer = null;
            _deserializeTypedUsingDefaultImpl.RemoteActionCompatParcelizer(this);
        }
    }
}
