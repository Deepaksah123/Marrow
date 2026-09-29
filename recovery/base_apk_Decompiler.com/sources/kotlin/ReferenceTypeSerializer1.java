package kotlin;

import com.google.android.exoplayer2.C;
import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
public final class ReferenceTypeSerializer1 implements UUIDSerializer {
    private long read;
    private final initExtraTracks<IconCompatParcelizer> write;

    public ReferenceTypeSerializer1(List<? extends UUIDSerializer> list, List<List<Integer>> list2) {
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        buildTypeSerializer.IconCompatParcelizer(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new IconCompatParcelizer(list.get(i), list2.get(i)));
        }
        this.write = iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        this.read = C.TIME_UNSET;
    }

    @Override // kotlin.UUIDSerializer
    public final long read() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i = 0; i < this.write.size(); i++) {
            IconCompatParcelizer iconCompatParcelizer = this.write.get(i);
            long j = iconCompatParcelizer.read();
            if ((iconCompatParcelizer.RemoteActionCompatParcelizer().contains(1) || iconCompatParcelizer.RemoteActionCompatParcelizer().contains(2) || iconCompatParcelizer.RemoteActionCompatParcelizer().contains(4)) && j != Long.MIN_VALUE) {
                jMin = Math.min(jMin, j);
            }
            if (j != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, j);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.read = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j2 = this.read;
        return j2 != C.TIME_UNSET ? j2 : jMin2;
    }

    @Override // kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.write.size(); i++) {
            long jAudioAttributesCompatParcelizer = this.write.get(i).AudioAttributesCompatParcelizer();
            if (jAudioAttributesCompatParcelizer != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jAudioAttributesCompatParcelizer);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
        for (int i = 0; i < this.write.size(); i++) {
            this.write.get(i).RemoteActionCompatParcelizer(j);
        }
    }

    @Override // kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        boolean zRemoteActionCompatParcelizer;
        boolean z = false;
        do {
            long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (jAudioAttributesCompatParcelizer == Long.MIN_VALUE) {
                return z;
            }
            zRemoteActionCompatParcelizer = false;
            for (int i = 0; i < this.write.size(); i++) {
                long jAudioAttributesCompatParcelizer2 = this.write.get(i).AudioAttributesCompatParcelizer();
                boolean z2 = jAudioAttributesCompatParcelizer2 != Long.MIN_VALUE && jAudioAttributesCompatParcelizer2 <= _putVar.write;
                if (jAudioAttributesCompatParcelizer2 == jAudioAttributesCompatParcelizer || z2) {
                    zRemoteActionCompatParcelizer |= this.write.get(i).RemoteActionCompatParcelizer(_putVar);
                }
            }
            z |= zRemoteActionCompatParcelizer;
        } while (zRemoteActionCompatParcelizer);
        return z;
    }

    @Override // kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        for (int i = 0; i < this.write.size(); i++) {
            if (this.write.get(i).IconCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    static final class IconCompatParcelizer implements UUIDSerializer {
        private final UUIDSerializer IconCompatParcelizer;
        private final initExtraTracks<Integer> write;

        public IconCompatParcelizer(UUIDSerializer uUIDSerializer, List<Integer> list) {
            this.IconCompatParcelizer = uUIDSerializer;
            this.write = initExtraTracks.write(list);
        }

        public final initExtraTracks<Integer> RemoteActionCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.UUIDSerializer
        public final long read() {
            return this.IconCompatParcelizer.read();
        }

        @Override // kotlin.UUIDSerializer
        public final long AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.UUIDSerializer
        public final boolean RemoteActionCompatParcelizer(_put _putVar) {
            return this.IconCompatParcelizer.RemoteActionCompatParcelizer(_putVar);
        }

        @Override // kotlin.UUIDSerializer
        public final boolean IconCompatParcelizer() {
            return this.IconCompatParcelizer.IconCompatParcelizer();
        }

        @Override // kotlin.UUIDSerializer
        public final void RemoteActionCompatParcelizer(long j) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(j);
        }
    }
}
