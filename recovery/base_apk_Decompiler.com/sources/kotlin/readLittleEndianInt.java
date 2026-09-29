package kotlin;

import com.marrow2.data.user.remote.model.Countries;
import com.marrow2.data.user.remote.model.Institutes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class readLittleEndianInt {
    public static final isBt2020PqExtensionSupported AudioAttributesCompatParcelizer(readDelimiterTerminatedString readdelimiterterminatedstring) {
        toMagicModuleMetaRepoModel.write(readdelimiterterminatedstring, "");
        return new isBt2020PqExtensionSupported(readdelimiterterminatedstring.getAudioAttributesCompatParcelizer(), null, null, 6, null);
    }

    public static final hasMessages RemoteActionCompatParcelizer(readInt24 readint24) {
        toMagicModuleMetaRepoModel.write(readint24, "");
        return new hasMessages(readint24.getRead(), readint24.getIconCompatParcelizer(), readint24.getWrite(), readint24.getRemoteActionCompatParcelizer());
    }

    public static final List<peekUnsignedByte> AudioAttributesCompatParcelizer(List<Institutes> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<Institutes> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (Institutes institutes : list2) {
            arrayList.add(new peekUnsignedByte(institutes.getStateId(), institutes.getInstituteId(), institutes.getInstituteName()));
        }
        return arrayList;
    }

    public static final List<ensureCapacity> read(List<Countries> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<Countries> listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) list, (Comparator) new write());
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        for (Countries countries : listAudioAttributesCompatParcelizer) {
            arrayList.add(new ensureCapacity(countries.getTitle(), countries.getId()));
        }
        return arrayList;
    }

    public static final class write<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(((Countries) t).getTitle(), ((Countries) t2).getTitle());
        }
    }
}
