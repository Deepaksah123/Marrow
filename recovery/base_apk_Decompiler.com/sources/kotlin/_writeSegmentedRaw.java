package kotlin;

import android.view.ViewStructure;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroid/view/ViewStructure;", "Lo/namingStrategyInstance;", "p0", "Landroid/view/autofill/AutofillId;", "p1", "", "p2", "Lo/getAttributes;", "p3", "", "RemoteActionCompatParcelizer", "(Landroid/view/ViewStructure;Lo/namingStrategyInstance;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lo/getAttributes;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _writeSegmentedRaw {
    /* JADX WARN: Removed duplicated region for block: B:105:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(android.view.ViewStructure r36, kotlin.namingStrategyInstance r37, android.view.autofill.AutofillId r38, java.lang.String r39, kotlin.getAttributes r40) {
        /*
            Method dump skipped, instruction units count: 1049
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._writeSegmentedRaw.RemoteActionCompatParcelizer(android.view.ViewStructure, o.namingStrategyInstance, android.view.autofill.AutofillId, java.lang.String, o.getAttributes):void");
    }

    /* JADX INFO: renamed from: o._writeSegmentedRaw$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "p0", "p1", "p2", "p3", "", "read", "(IIII)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getMagicModuleStat<Integer, Integer, Integer, Integer, getShowPopup> {
        final /* synthetic */ ViewStructure $RemoteActionCompatParcelizer;
        final /* synthetic */ _outputMultiByteChar $write;

        @Override // kotlin.getMagicModuleStat
        public final /* synthetic */ getShowPopup write(Integer num, Integer num2, Integer num3, Integer num4) {
            read(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(int i, int i2, int i3, int i4) {
            this.$write.write(this.$RemoteActionCompatParcelizer, i, i2, 0, 0, i3 - i, i4 - i2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(_outputMultiByteChar _outputmultibytechar, ViewStructure viewStructure) {
            super(4);
            this.$write = _outputmultibytechar;
            this.$RemoteActionCompatParcelizer = viewStructure;
        }
    }
}
