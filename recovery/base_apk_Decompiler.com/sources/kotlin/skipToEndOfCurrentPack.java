package kotlin;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class skipToEndOfCurrentPack {
    private final PesReader AudioAttributesCompatParcelizer;
    private final H264ReaderSampleReaderSliceHeaderData IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer(false);
    private final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer(true);
    private final AtomicMarkableReference<String> MediaBrowserCompatCustomActionResultReceiver = new AtomicMarkableReference<>(null, false);

    public static String write(String str, isStartOfTsPacket isstartoftspacket) {
        return new PesReader(isstartoftspacket).AudioAttributesCompatParcelizer(str);
    }

    public static skipToEndOfCurrentPack AudioAttributesCompatParcelizer(String str, isStartOfTsPacket isstartoftspacket, H264ReaderSampleReaderSliceHeaderData h264ReaderSampleReaderSliceHeaderData) {
        PesReader pesReader = new PesReader(isstartoftspacket);
        skipToEndOfCurrentPack skiptoendofcurrentpack = new skipToEndOfCurrentPack(str, isstartoftspacket, h264ReaderSampleReaderSliceHeaderData);
        skiptoendofcurrentpack.write.AudioAttributesCompatParcelizer.getReference().write(pesReader.AudioAttributesCompatParcelizer(str, false));
        skiptoendofcurrentpack.read.AudioAttributesCompatParcelizer.getReference().write(pesReader.AudioAttributesCompatParcelizer(str, true));
        skiptoendofcurrentpack.MediaBrowserCompatCustomActionResultReceiver.set(pesReader.AudioAttributesCompatParcelizer(str), false);
        return skiptoendofcurrentpack;
    }

    public skipToEndOfCurrentPack(String str, isStartOfTsPacket isstartoftspacket, H264ReaderSampleReaderSliceHeaderData h264ReaderSampleReaderSliceHeaderData) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = new PesReader(isstartoftspacket);
        this.IconCompatParcelizer = h264ReaderSampleReaderSliceHeaderData;
    }

    private String IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver.getReference();
    }

    public final void read(String str) {
        String strIconCompatParcelizer = parseHeaderExtension.IconCompatParcelizer(str, 1024);
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            if (putSps.RemoteActionCompatParcelizer(strIconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver.getReference())) {
                return;
            }
            this.MediaBrowserCompatCustomActionResultReceiver.set(strIconCompatParcelizer, true);
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(new Callable() { // from class: o.searchForScrValueInBuffer
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.read.RemoteActionCompatParcelizer();
                }
            });
        }
    }

    final /* synthetic */ Object RemoteActionCompatParcelizer() throws Exception {
        write();
        return null;
    }

    public final Map<String, String> read() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    public final boolean write(String str, String str2) {
        return this.write.RemoteActionCompatParcelizer(str, str2);
    }

    public final Map<String, String> AudioAttributesCompatParcelizer() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    public final boolean read(String str, String str2) {
        return this.read.RemoteActionCompatParcelizer(str, str2);
    }

    private void write() throws Throwable {
        boolean z;
        String strIconCompatParcelizer;
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            z = false;
            if (this.MediaBrowserCompatCustomActionResultReceiver.isMarked()) {
                strIconCompatParcelizer = IconCompatParcelizer();
                this.MediaBrowserCompatCustomActionResultReceiver.set(strIconCompatParcelizer, false);
                z = true;
            } else {
                strIconCompatParcelizer = null;
            }
        }
        if (z) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, strIconCompatParcelizer);
        }
    }

    class RemoteActionCompatParcelizer {
        final AtomicMarkableReference<parseHeaderExtension> AudioAttributesCompatParcelizer;
        private final AtomicReference<Callable<Void>> IconCompatParcelizer = new AtomicReference<>(null);
        private final boolean write;

        public RemoteActionCompatParcelizer(boolean z) {
            this.write = z;
            this.AudioAttributesCompatParcelizer = new AtomicMarkableReference<>(new parseHeaderExtension(z ? 8192 : 1024), false);
        }

        public final Map<String, String> AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.getReference().read();
        }

        public final boolean RemoteActionCompatParcelizer(String str, String str2) {
            synchronized (this) {
                if (!this.AudioAttributesCompatParcelizer.getReference().read(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<parseHeaderExtension> atomicMarkableReference = this.AudioAttributesCompatParcelizer;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                RemoteActionCompatParcelizer();
                return true;
            }
        }

        private void RemoteActionCompatParcelizer() {
            Callable callable = new Callable() { // from class: o.checkMarkerBits
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.IconCompatParcelizer.read();
                }
            };
            if (setBackInvokedCallbackEnabled.read(this.IconCompatParcelizer, null, callable)) {
                skipToEndOfCurrentPack.this.IconCompatParcelizer.RemoteActionCompatParcelizer(callable);
            }
        }

        final /* synthetic */ Void read() throws Exception {
            this.IconCompatParcelizer.set(null);
            write();
            return null;
        }

        private void write() throws Throwable {
            Map<String, String> map;
            synchronized (this) {
                if (this.AudioAttributesCompatParcelizer.isMarked()) {
                    map = this.AudioAttributesCompatParcelizer.getReference().read();
                    AtomicMarkableReference<parseHeaderExtension> atomicMarkableReference = this.AudioAttributesCompatParcelizer;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                skipToEndOfCurrentPack.this.AudioAttributesCompatParcelizer.write(skipToEndOfCurrentPack.this.RemoteActionCompatParcelizer, map, this.write);
            }
        }
    }
}
