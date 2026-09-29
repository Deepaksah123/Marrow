package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class emptyIterator {
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;

    public static emptyIterator RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        String str;
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int i = iOnPlayFromMediaId >> 1;
        int iOnPlayFromMediaId2 = ((asPropertyTypeDeserializer.onPlayFromMediaId() >> 3) & 31) | ((iOnPlayFromMediaId & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iOnPlayFromMediaId2 >= 10 ? "." : ".0");
        sb.append(iOnPlayFromMediaId2);
        return new emptyIterator(i, iOnPlayFromMediaId2, sb.toString());
    }

    private emptyIterator(int i, int i2, String str) {
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.IconCompatParcelizer = str;
    }
}
