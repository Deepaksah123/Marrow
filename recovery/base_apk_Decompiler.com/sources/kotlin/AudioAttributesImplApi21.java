package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/AudioAttributesImplApi21;", "", "", "p0", "p1", "", "IconCompatParcelizer", "(ILjava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)V", "RemoteActionCompatParcelizer", "(I)Ljava/lang/Object;", "write", "(Ljava/lang/Object;)I", "read", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AudioAttributesImplApi21 {
    void IconCompatParcelizer(int i, Object obj, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2);

    default Object RemoteActionCompatParcelizer(int p0) {
        return null;
    }

    int read();

    default int write(Object p0) {
        return -1;
    }

    default Object IconCompatParcelizer(int p0) {
        return prepare.AudioAttributesCompatParcelizer(p0);
    }
}
