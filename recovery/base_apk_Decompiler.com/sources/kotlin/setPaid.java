package kotlin;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class setPaid extends setPublishedTime {
    public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(0);
    public static final setPaid IconCompatParcelizer = new setPaid(1, 0, 7);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPaid(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        toMagicModuleMetaRepoModel.write(iArr, "");
    }

    public final boolean IconCompatParcelizer() {
        return read(IconCompatParcelizer);
    }

    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public static setPaid AudioAttributesCompatParcelizer(InputStream inputStream) {
            toMagicModuleMetaRepoModel.write(inputStream, "");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            newEncryptedObject newencryptedobject = new newEncryptedObject(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobject, 10));
            Iterator<Integer> it = newencryptedobject.iterator();
            while (it.hasNext()) {
                ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer((Collection<Integer>) arrayList);
            return new setPaid(Arrays.copyOf(iArrIconCompatParcelizer, iArrIconCompatParcelizer.length));
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }

    static {
        new setPaid(new int[0]);
    }
}
