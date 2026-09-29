package kotlin;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseAsISO8601 implements isLenient {
    private static final parseTruns<pad3> write = parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer(new parseMvhd() { // from class: o.pad4
        @Override // kotlin.parseMvhd
        public final Object apply(Object obj) {
            return Long.valueOf(_parseAsISO8601.IconCompatParcelizer(((pad3) obj).IconCompatParcelizer));
        }
    });
    private final long[] IconCompatParcelizer;
    private final initExtraTracks<initExtraTracks<getDefaultImpl>> read;

    private static long IconCompatParcelizer(long j) {
        if (j == C.TIME_UNSET) {
            return 0L;
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public _parseAsISO8601(java.util.List<kotlin.pad3> r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._parseAsISO8601.<init>(java.util.List):void");
    }

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer(long j) {
        int i = LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, j, false);
        if (i < this.read.size()) {
            return i;
        }
        return -1;
    }

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer() {
        return this.read.size();
    }

    @Override // kotlin.isLenient
    public final long write(int i) {
        buildTypeSerializer.IconCompatParcelizer(i < this.read.size());
        return this.IconCompatParcelizer[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isLenient
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public initExtraTracks<getDefaultImpl> read(long j) {
        int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.IconCompatParcelizer, j, false);
        return iRemoteActionCompatParcelizer == -1 ? initExtraTracks.AudioAttributesImplApi26Parcelizer() : this.read.get(iRemoteActionCompatParcelizer);
    }
}
