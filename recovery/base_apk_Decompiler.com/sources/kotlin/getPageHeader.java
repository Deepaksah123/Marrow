package kotlin;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface getPageHeader {
    public static final getPageHeader RemoteActionCompatParcelizer = new getPageHeader() { // from class: o.peekPacketStartsWith
        @Override // kotlin.getPageHeader
        public final List write(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.RemoteActionCompatParcelizer();
        }
    };

    List<FlacReaderFlacOggSeeker<?>> write(ComponentRegistrar componentRegistrar);
}
