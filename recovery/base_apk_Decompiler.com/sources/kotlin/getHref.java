package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getHref extends PlanAddOnsCompanion implements TaxPercentInfoCompanion, getValueInt {
    public abstract getHref read(getGroupDescription getgroupdescription);

    public abstract getHref write(boolean z);

    public getHref() {
        super((byte) 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<dummyEditor> it = RemoteActionCompatParcelizer().iterator();
        while (it.hasNext()) {
            TestGroupLSModel.IconCompatParcelizer(sb, "[", setGuessed.RemoteActionCompatParcelizer.IconCompatParcelizer(it.next(), null), "] ");
        }
        sb.append(AudioAttributesImplApi21Parcelizer());
        if (!bb_().isEmpty()) {
            IntermediateLoginResponseBody.write(bb_(), sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) != 0 ? "" : ">", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (ba_()) {
            sb.append("?");
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
