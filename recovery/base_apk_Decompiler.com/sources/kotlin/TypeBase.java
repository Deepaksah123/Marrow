package kotlin;

import com.google.android.exoplayer2.C;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class TypeBase implements ReferenceType {
    private final ArrayList<pad3> write = new ArrayList<>();

    @Override // kotlin.ReferenceType
    public final boolean IconCompatParcelizer(pad3 pad3Var, long j) {
        buildTypeSerializer.IconCompatParcelizer(pad3Var.IconCompatParcelizer != C.TIME_UNSET);
        boolean z = pad3Var.IconCompatParcelizer <= j && (pad3Var.RemoteActionCompatParcelizer == C.TIME_UNSET || j < pad3Var.RemoteActionCompatParcelizer);
        for (int size = this.write.size() - 1; size >= 0; size--) {
            if (pad3Var.IconCompatParcelizer >= this.write.get(size).IconCompatParcelizer) {
                this.write.add(size + 1, pad3Var);
                return z;
            }
            if (this.write.get(size).IconCompatParcelizer <= j) {
                z = false;
            }
        }
        this.write.add(0, pad3Var);
        return z;
    }

    @Override // kotlin.ReferenceType
    public final initExtraTracks<getDefaultImpl> write(long j) {
        int iIconCompatParcelizer = IconCompatParcelizer(j);
        if (iIconCompatParcelizer == 0) {
            return initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        pad3 pad3Var = this.write.get(iIconCompatParcelizer - 1);
        if (pad3Var.RemoteActionCompatParcelizer == C.TIME_UNSET || j < pad3Var.RemoteActionCompatParcelizer) {
            return pad3Var.read;
        }
        return initExtraTracks.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.ReferenceType
    public final void RemoteActionCompatParcelizer(long j) {
        int iIconCompatParcelizer = IconCompatParcelizer(j);
        if (iIconCompatParcelizer > 0) {
            this.write.subList(0, iIconCompatParcelizer).clear();
        }
    }

    @Override // kotlin.ReferenceType
    public final long AudioAttributesCompatParcelizer(long j) {
        if (this.write.isEmpty() || j < this.write.get(0).IconCompatParcelizer) {
            return C.TIME_UNSET;
        }
        for (int i = 1; i < this.write.size(); i++) {
            long j2 = this.write.get(i).IconCompatParcelizer;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                pad3 pad3Var = this.write.get(i - 1);
                if (pad3Var.RemoteActionCompatParcelizer != C.TIME_UNSET && pad3Var.RemoteActionCompatParcelizer <= j) {
                    return pad3Var.RemoteActionCompatParcelizer;
                }
                return pad3Var.IconCompatParcelizer;
            }
        }
        pad3 pad3Var2 = (pad3) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(this.write);
        if (pad3Var2.RemoteActionCompatParcelizer == C.TIME_UNSET || j < pad3Var2.RemoteActionCompatParcelizer) {
            return pad3Var2.IconCompatParcelizer;
        }
        return pad3Var2.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.ReferenceType
    public final long read(long j) {
        if (this.write.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.write.get(0).IconCompatParcelizer) {
            return this.write.get(0).IconCompatParcelizer;
        }
        for (int i = 1; i < this.write.size(); i++) {
            pad3 pad3Var = this.write.get(i);
            if (j < pad3Var.IconCompatParcelizer) {
                pad3 pad3Var2 = this.write.get(i - 1);
                if (pad3Var2.RemoteActionCompatParcelizer != C.TIME_UNSET && pad3Var2.RemoteActionCompatParcelizer > j && pad3Var2.RemoteActionCompatParcelizer < pad3Var.IconCompatParcelizer) {
                    return pad3Var2.RemoteActionCompatParcelizer;
                }
                return pad3Var.IconCompatParcelizer;
            }
        }
        pad3 pad3Var3 = (pad3) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(this.write);
        if (pad3Var3.RemoteActionCompatParcelizer == C.TIME_UNSET || j >= pad3Var3.RemoteActionCompatParcelizer) {
            return Long.MIN_VALUE;
        }
        return pad3Var3.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.ReferenceType
    public final void read() {
        this.write.clear();
    }

    private int IconCompatParcelizer(long j) {
        for (int i = 0; i < this.write.size(); i++) {
            if (j < this.write.get(i).IconCompatParcelizer) {
                return i;
            }
        }
        return this.write.size();
    }
}
