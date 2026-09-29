package kotlin;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public abstract class readNalUnitData {
    public abstract File AudioAttributesCompatParcelizer();

    public abstract String IconCompatParcelizer();

    public abstract fillBufferWithAtLeastOnePacket RemoteActionCompatParcelizer();

    public static readNalUnitData write(fillBufferWithAtLeastOnePacket fillbufferwithatleastonepacket, String str, File file) {
        return new startNalUnit(fillbufferwithatleastonepacket, str, file);
    }
}
