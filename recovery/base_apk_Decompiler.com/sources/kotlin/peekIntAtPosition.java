package kotlin;

import com.google.android.exoplayer2.C;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class peekIntAtPosition {
    private static final write AudioAttributesCompatParcelizer = new write(0);
    private final isStartOfTsPacket IconCompatParcelizer;
    private PsBinarySearchSeeker1 RemoteActionCompatParcelizer;

    public peekIntAtPosition(isStartOfTsPacket isstartoftspacket) {
        this.IconCompatParcelizer = isstartoftspacket;
        this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer;
    }

    public peekIntAtPosition(isStartOfTsPacket isstartoftspacket, String str) {
        this(isstartoftspacket);
        write(str);
    }

    public final void write(String str) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer;
        if (str == null) {
            return;
        }
        write(IconCompatParcelizer(str));
    }

    public final void IconCompatParcelizer(long j, String str) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(j, str);
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    private void write(File file) {
        this.RemoteActionCompatParcelizer = new PsDurationReader(file, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    private File IconCompatParcelizer(String str) {
        return this.IconCompatParcelizer.read(str, "userlog");
    }

    static final class write implements PsBinarySearchSeeker1 {
        @Override // kotlin.PsBinarySearchSeeker1
        public final void AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.PsBinarySearchSeeker1
        public final String IconCompatParcelizer() {
            return null;
        }

        @Override // kotlin.PsBinarySearchSeeker1
        public final void IconCompatParcelizer(long j, String str) {
        }

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }
    }
}
