package kotlin;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class JsonValueSerializerTypeSerializerRerouter implements _orderEntries {
    private Handler AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private final HandlerThread AudioAttributesImplBaseParcelizer;
    private final typeIdVisibility IconCompatParcelizer;
    private final AtomicReference<RuntimeException> MediaBrowserCompatItemReceiver;
    private final MediaCodec read;
    private static final ArrayDeque<read> write = new ArrayDeque<>();
    private static final Object RemoteActionCompatParcelizer = new Object();

    public JsonValueSerializerTypeSerializerRerouter(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new typeIdVisibility());
    }

    private JsonValueSerializerTypeSerializerRerouter(MediaCodec mediaCodec, HandlerThread handlerThread, typeIdVisibility typeidvisibility) {
        this.read = mediaCodec;
        this.AudioAttributesImplBaseParcelizer = handlerThread;
        this.IconCompatParcelizer = typeidvisibility;
        this.MediaBrowserCompatItemReceiver = new AtomicReference<>();
    }

    @Override // kotlin._orderEntries
    public final void read() {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer.start();
        this.AudioAttributesCompatParcelizer = new Handler(this.AudioAttributesImplBaseParcelizer.getLooper()) { // from class: o.JsonValueSerializerTypeSerializerRerouter.3
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                JsonValueSerializerTypeSerializerRerouter.this.write(message);
            }
        };
        this.AudioAttributesImplApi26Parcelizer = true;
    }

    @Override // kotlin._orderEntries
    public final void AudioAttributesCompatParcelizer(int i, int i2, int i3, long j, int i4) {
        AudioAttributesCompatParcelizer();
        read readVarAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        readVarAudioAttributesImplBaseParcelizer.read(i, 0, i3, j, i4);
        ((Handler) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).obtainMessage(1, readVarAudioAttributesImplBaseParcelizer).sendToTarget();
    }

    @Override // kotlin._orderEntries
    public final void RemoteActionCompatParcelizer(int i, int i2, TypeSerializerBase typeSerializerBase, long j, int i3) {
        AudioAttributesCompatParcelizer();
        read readVarAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        readVarAudioAttributesImplBaseParcelizer.read(i, 0, 0, j, i3);
        RemoteActionCompatParcelizer(typeSerializerBase, readVarAudioAttributesImplBaseParcelizer.write);
        ((Handler) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).obtainMessage(2, readVarAudioAttributesImplBaseParcelizer).sendToTarget();
    }

    @Override // kotlin._orderEntries
    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        AudioAttributesCompatParcelizer();
        ((Handler) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // kotlin._orderEntries
    public final void RemoteActionCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer) {
            try {
                AudioAttributesImplApi26Parcelizer();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // kotlin._orderEntries
    public final void IconCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer) {
            RemoteActionCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer.quit();
        }
        this.AudioAttributesImplApi26Parcelizer = false;
    }

    @Override // kotlin._orderEntries
    public final void AudioAttributesCompatParcelizer() {
        RuntimeException andSet = this.MediaBrowserCompatItemReceiver.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private void AudioAttributesImplApi26Parcelizer() throws InterruptedException {
        ((Handler) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).removeCallbacksAndMessages(null);
        write();
    }

    private void write() throws InterruptedException {
        this.IconCompatParcelizer.IconCompatParcelizer();
        ((Handler) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).obtainMessage(3).sendToTarget();
        this.IconCompatParcelizer.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(Message message) {
        read readVar;
        int i = message.what;
        if (i == 1) {
            readVar = (read) message.obj;
            RemoteActionCompatParcelizer(readVar.read, readVar.AudioAttributesCompatParcelizer, readVar.MediaBrowserCompatCustomActionResultReceiver, readVar.RemoteActionCompatParcelizer, readVar.IconCompatParcelizer);
        } else if (i != 2) {
            readVar = null;
            if (i == 3) {
                this.IconCompatParcelizer.read();
            } else if (i == 4) {
                IconCompatParcelizer((Bundle) message.obj);
            } else {
                setBackInvokedCallbackEnabled.read(this.MediaBrowserCompatItemReceiver, null, new IllegalStateException(String.valueOf(message.what)));
            }
        } else {
            readVar = (read) message.obj;
            IconCompatParcelizer(readVar.read, readVar.AudioAttributesCompatParcelizer, readVar.write, readVar.RemoteActionCompatParcelizer, readVar.IconCompatParcelizer);
        }
        if (readVar != null) {
            IconCompatParcelizer(readVar);
        }
    }

    private void RemoteActionCompatParcelizer(int i, int i2, int i3, long j, int i4) {
        try {
            this.read.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            setBackInvokedCallbackEnabled.read(this.MediaBrowserCompatItemReceiver, null, e);
        }
    }

    private void IconCompatParcelizer(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (RemoteActionCompatParcelizer) {
                this.read.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            setBackInvokedCallbackEnabled.read(this.MediaBrowserCompatItemReceiver, null, e);
        }
    }

    private void IconCompatParcelizer(Bundle bundle) {
        try {
            this.read.setParameters(bundle);
        } catch (RuntimeException e) {
            setBackInvokedCallbackEnabled.read(this.MediaBrowserCompatItemReceiver, null, e);
        }
    }

    private static read AudioAttributesImplBaseParcelizer() {
        ArrayDeque<read> arrayDeque = write;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new read();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static void IconCompatParcelizer(read readVar) {
        ArrayDeque<read> arrayDeque = write;
        synchronized (arrayDeque) {
            arrayDeque.add(readVar);
        }
    }

    static class read {
        public int AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public int MediaBrowserCompatCustomActionResultReceiver;
        public long RemoteActionCompatParcelizer;
        public int read;
        public final MediaCodec.CryptoInfo write = new MediaCodec.CryptoInfo();

        read() {
        }

        public final void read(int i, int i2, int i3, long j, int i4) {
            this.read = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.MediaBrowserCompatCustomActionResultReceiver = i3;
            this.RemoteActionCompatParcelizer = j;
            this.IconCompatParcelizer = i4;
        }
    }

    private static void RemoteActionCompatParcelizer(TypeSerializerBase typeSerializerBase, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = typeSerializerBase.MediaBrowserCompatItemReceiver;
        cryptoInfo.numBytesOfClearData = write(typeSerializerBase.MediaBrowserCompatCustomActionResultReceiver, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = write(typeSerializerBase.AudioAttributesImplBaseParcelizer, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) buildTypeSerializer.IconCompatParcelizer(RemoteActionCompatParcelizer(typeSerializerBase.RemoteActionCompatParcelizer, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) buildTypeSerializer.IconCompatParcelizer(RemoteActionCompatParcelizer(typeSerializerBase.AudioAttributesCompatParcelizer, cryptoInfo.iv));
        cryptoInfo.mode = typeSerializerBase.write;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(typeSerializerBase.IconCompatParcelizer, typeSerializerBase.read));
        }
    }

    private static int[] write(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private static byte[] RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
