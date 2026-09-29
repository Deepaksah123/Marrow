package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\f\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\f\"\u001a\u0010\u000f\u001a\u00020\u000e8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011"}, d2 = {"Lo/addUnresolvedId;", "Lo/AbstractDeserializer;", "p0", "Lo/withDelegate;", "write", "(Lo/addUnresolvedId;Lo/AbstractDeserializer;)Lo/withDelegate;", "", "p1", "", "read", "(Lo/withDelegate;II)V", "p2", "(III)V", "RemoteActionCompatParcelizer", "Lo/SettableBeanProperty;", "IconCompatParcelizer", "Lo/SettableBeanProperty;", "()Lo/SettableBeanProperty;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class createPayloadsIfNeeded {
    private static final SettableBeanProperty IconCompatParcelizer = new addFlags(SettableBeanProperty.INSTANCE.RemoteActionCompatParcelizer(), 0, 0);

    public static final SettableBeanProperty IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static final withDelegate write(addUnresolvedId addunresolvedid, AbstractDeserializer abstractDeserializer) {
        withDelegate withdelegateAudioAttributesCompatParcelizer = addunresolvedid.AudioAttributesCompatParcelizer(abstractDeserializer);
        read$default(withdelegateAudioAttributesCompatParcelizer, abstractDeserializer.length(), 0, 2, null);
        return new withDelegate(withdelegateAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), new addFlags(withdelegateAudioAttributesCompatParcelizer.getRead(), abstractDeserializer.length(), withdelegateAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().length()));
    }

    public static /* synthetic */ void read$default(withDelegate withdelegate, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 100;
        }
        read(withdelegate, i, i2);
    }

    public static final void read(withDelegate withdelegate, int i, int i2) {
        int length = withdelegate.getAudioAttributesCompatParcelizer().length();
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            RemoteActionCompatParcelizer(withdelegate.getRead().RemoteActionCompatParcelizer(i3), length, i3);
        }
        RemoteActionCompatParcelizer(withdelegate.getRead().RemoteActionCompatParcelizer(i), length, i);
        int iMin2 = Math.min(length, i2);
        for (int i4 = 0; i4 < iMin2; i4++) {
            write(withdelegate.getRead().write(i4), i, i4);
        }
        write(withdelegate.getRead().write(length), i, length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            sb.append(i3);
            sb.append(" -> ");
            sb.append(i);
            sb.append(" is not in range of original text [0, ");
            sb.append(i2);
            sb.append(']');
            getRootStableInsets.AudioAttributesCompatParcelizer(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
            sb.append(i3);
            sb.append(" -> ");
            sb.append(i);
            sb.append(" is not in range of transformed text [0, ");
            sb.append(i2);
            sb.append(']');
            getRootStableInsets.AudioAttributesCompatParcelizer(sb.toString());
        }
    }
}
