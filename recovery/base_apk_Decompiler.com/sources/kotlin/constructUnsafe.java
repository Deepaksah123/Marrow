package kotlin;

import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
final class constructUnsafe implements ReferenceType {
    private static final parseTruns<pad3> RemoteActionCompatParcelizer = parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer(new parseMvhd() { // from class: o._classSignature
        @Override // kotlin.parseMvhd
        public final Object apply(Object obj) {
            return Long.valueOf(((pad3) obj).IconCompatParcelizer);
        }
    }).write(parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(new parseMvhd() { // from class: o.SimpleType
        @Override // kotlin.parseMvhd
        public final Object apply(Object obj) {
            return Long.valueOf(((pad3) obj).AudioAttributesCompatParcelizer);
        }
    }));
    private final List<pad3> IconCompatParcelizer = new ArrayList();

    @Override // kotlin.ReferenceType
    public final boolean IconCompatParcelizer(pad3 pad3Var, long j) {
        buildTypeSerializer.IconCompatParcelizer(pad3Var.IconCompatParcelizer != C.TIME_UNSET);
        buildTypeSerializer.IconCompatParcelizer(pad3Var.AudioAttributesCompatParcelizer != C.TIME_UNSET);
        boolean z = pad3Var.IconCompatParcelizer <= j && j < pad3Var.RemoteActionCompatParcelizer;
        for (int size = this.IconCompatParcelizer.size() - 1; size >= 0; size--) {
            if (pad3Var.IconCompatParcelizer >= this.IconCompatParcelizer.get(size).IconCompatParcelizer) {
                this.IconCompatParcelizer.add(size + 1, pad3Var);
                return z;
            }
        }
        this.IconCompatParcelizer.add(0, pad3Var);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ReferenceType
    public final initExtraTracks<getDefaultImpl> write(long j) {
        if (!this.IconCompatParcelizer.isEmpty()) {
            if (j >= this.IconCompatParcelizer.get(0).IconCompatParcelizer) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
                    pad3 pad3Var = this.IconCompatParcelizer.get(i);
                    if (j >= pad3Var.IconCompatParcelizer && j < pad3Var.RemoteActionCompatParcelizer) {
                        arrayList.add(pad3Var);
                    }
                    if (j < pad3Var.IconCompatParcelizer) {
                        break;
                    }
                }
                initExtraTracks initextratracksWrite = initExtraTracks.write(RemoteActionCompatParcelizer, arrayList);
                initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
                for (int i2 = 0; i2 < initextratracksWrite.size(); i2++) {
                    iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(((pad3) initextratracksWrite.get(i2)).read);
                }
                return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            }
        }
        return initExtraTracks.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.ReferenceType
    public final void RemoteActionCompatParcelizer(long j) {
        int i = 0;
        while (i < this.IconCompatParcelizer.size()) {
            long j2 = this.IconCompatParcelizer.get(i).IconCompatParcelizer;
            if (j > j2 && j > this.IconCompatParcelizer.get(i).RemoteActionCompatParcelizer) {
                this.IconCompatParcelizer.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // kotlin.ReferenceType
    public final long AudioAttributesCompatParcelizer(long j) {
        if (this.IconCompatParcelizer.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j < this.IconCompatParcelizer.get(0).IconCompatParcelizer) {
            return C.TIME_UNSET;
        }
        long jMax = this.IconCompatParcelizer.get(0).IconCompatParcelizer;
        for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
            long j2 = this.IconCompatParcelizer.get(i).IconCompatParcelizer;
            long j3 = this.IconCompatParcelizer.get(i).RemoteActionCompatParcelizer;
            if (j3 <= j) {
                jMax = Math.max(jMax, j3);
            } else {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            }
        }
        return jMax;
    }

    @Override // kotlin.ReferenceType
    public final long read(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i >= this.IconCompatParcelizer.size()) {
                break;
            }
            long j2 = this.IconCompatParcelizer.get(i).IconCompatParcelizer;
            long j3 = this.IconCompatParcelizer.get(i).RemoteActionCompatParcelizer;
            if (j < j2) {
                jMin = jMin != C.TIME_UNSET ? Math.min(jMin, j2) : j2;
            } else {
                if (j < j3) {
                    jMin = jMin == C.TIME_UNSET ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // kotlin.ReferenceType
    public final void read() {
        this.IconCompatParcelizer.clear();
    }
}
