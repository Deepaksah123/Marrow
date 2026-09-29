package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J/\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0006\u0010\u000eJi\u0010\u0006\u001a\u00020\u00162\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0017J9\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0018H&¢\u0006\u0004\b\u0006\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getSharedElementTargetNames;", "", "Lo/_parser;", "", "IconCompatParcelizer", "(Lo/_parser;)I", "write", "p0", "", "p1", "p2", "Lo/withContentValueHandler;", "p3", "", "(I[I[ILo/withContentValueHandler;)V", "", "p4", "p5", "p6", "p7", "p8", "p9", "Lo/withHandlersFrom;", "([Lo/_parser;Lo/withContentValueHandler;I[III[IIII)Lo/withHandlersFrom;", "", "Lo/PropertyValueAny;", "(IIIIZ)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getSharedElementTargetNames {
    int IconCompatParcelizer(_parser _parserVar);

    int write(_parser _parserVar);

    long write(int p0, int p1, int p2, int p3, boolean p4);

    withHandlersFrom write(_parser[] p0, withContentValueHandler p1, int p2, int[] p3, int p4, int p5, int[] p6, int p7, int p8, int p9);

    void write(int p0, int[] p1, int[] p2, withContentValueHandler p3);

    static /* synthetic */ long write$default(getSharedElementTargetNames getsharedelementtargetnames, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if ((i5 & 16) != 0) {
            z = false;
        }
        return getsharedelementtargetnames.write(i, i2, i3, i4, z);
    }
}
