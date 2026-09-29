package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class resetAndStart implements nullOrToString {
    public final int RemoteActionCompatParcelizer;
    public final parseStandardGenreAttribute write;

    public resetAndStart(int i, int[] iArr) {
        parseStandardGenreAttribute parsestandardgenreattributeWrite;
        this.RemoteActionCompatParcelizer = i;
        if (iArr != null) {
            parsestandardgenreattributeWrite = parseStandardGenreAttribute.write(iArr);
        } else {
            parsestandardgenreattributeWrite = parseStandardGenreAttribute.write();
        }
        this.write = parsestandardgenreattributeWrite;
    }
}
