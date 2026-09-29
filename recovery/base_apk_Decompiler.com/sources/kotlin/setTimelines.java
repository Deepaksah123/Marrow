package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setTimelines {
    private static final char[] write = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final char[] RemoteActionCompatParcelizer() {
        return write;
    }

    public static final void IconCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter, resetCurrentSelectedPosition resetcurrentselectedposition, int i, int i2) {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        resetcurrentselectedposition.AudioAttributesCompatParcelizer(getrelatedmoduleadapter.getData(), 0, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int write(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
        }
        return c - '7';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0186, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f5, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int IconCompatParcelizer(byte[] r17, int r18) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTimelines.IconCompatParcelizer(byte[], int):int");
    }
}
