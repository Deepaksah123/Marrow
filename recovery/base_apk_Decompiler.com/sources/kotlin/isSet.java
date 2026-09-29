package kotlin;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.onFlushCompleted;

/* JADX INFO: loaded from: classes.dex */
public final class isSet implements DefaultTsPayloadReaderFactoryFlags {
    private static final checkNextByte AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(0);
    private final AtomicReference<DefaultTsPayloadReaderFactoryFlags> RemoteActionCompatParcelizer = new AtomicReference<>(null);
    private final onFlushCompleted<DefaultTsPayloadReaderFactoryFlags> write;

    public isSet(onFlushCompleted<DefaultTsPayloadReaderFactoryFlags> onflushcompleted) {
        this.write = onflushcompleted;
        onflushcompleted.write(new onFlushCompleted.AudioAttributesCompatParcelizer() { // from class: o.H262Reader
            @Override // o.onFlushCompleted.AudioAttributesCompatParcelizer
            public final void read(onInputBufferAvailable oninputbufferavailable) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(oninputbufferavailable);
            }
        });
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(onInputBufferAvailable oninputbufferavailable) {
        DvbSubtitleReader.read().IconCompatParcelizer("Crashlytics native component now available.");
        this.RemoteActionCompatParcelizer.set((DefaultTsPayloadReaderFactoryFlags) oninputbufferavailable.write());
    }

    @Override // kotlin.DefaultTsPayloadReaderFactoryFlags
    public final boolean RemoteActionCompatParcelizer() {
        DefaultTsPayloadReaderFactoryFlags defaultTsPayloadReaderFactoryFlags = this.RemoteActionCompatParcelizer.get();
        return defaultTsPayloadReaderFactoryFlags != null && defaultTsPayloadReaderFactoryFlags.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.DefaultTsPayloadReaderFactoryFlags
    public final boolean IconCompatParcelizer(String str) {
        DefaultTsPayloadReaderFactoryFlags defaultTsPayloadReaderFactoryFlags = this.RemoteActionCompatParcelizer.get();
        return defaultTsPayloadReaderFactoryFlags != null && defaultTsPayloadReaderFactoryFlags.IconCompatParcelizer(str);
    }

    @Override // kotlin.DefaultTsPayloadReaderFactoryFlags
    public final void write(final String str, final String str2, final long j, final access108 access108Var) {
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Deferring native open session: ".concat(String.valueOf(str)));
        this.write.write(new onFlushCompleted.AudioAttributesCompatParcelizer() { // from class: o.ElementaryStreamReader
            @Override // o.onFlushCompleted.AudioAttributesCompatParcelizer
            public final void read(onInputBufferAvailable oninputbufferavailable) {
                ((DefaultTsPayloadReaderFactoryFlags) oninputbufferavailable.write()).write(str, str2, j, access108Var);
            }
        });
    }

    @Override // kotlin.DefaultTsPayloadReaderFactoryFlags
    public final checkNextByte RemoteActionCompatParcelizer(String str) {
        DefaultTsPayloadReaderFactoryFlags defaultTsPayloadReaderFactoryFlags = this.RemoteActionCompatParcelizer.get();
        if (defaultTsPayloadReaderFactoryFlags == null) {
            return AudioAttributesCompatParcelizer;
        }
        return defaultTsPayloadReaderFactoryFlags.RemoteActionCompatParcelizer(str);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class AudioAttributesCompatParcelizer implements checkNextByte {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }
}
