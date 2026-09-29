package kotlin;

import kotlin.Metadata;
import kotlin.square;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\r\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"T", "Lo/hexToChar;", "Lo/getTokenColumnNr;", "p0", "", "write", "(Lo/hexToChar;Lo/getTokenColumnNr;)Z", "read", "(Lo/hexToChar;Lo/getTokenColumnNr;)Ljava/lang/Object;", "", "Lo/ContentReference;", "p1", "p2", "RemoteActionCompatParcelizer", "([Lo/ContentReference;Lo/hexToChar;Lo/hexToChar;)Lo/hexToChar;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class resetInt {
    public static final <T> boolean write(hexToChar hextochar, getTokenColumnNr<T> gettokencolumnnr) {
        toMagicModuleMetaRepoModel.read(gettokencolumnnr, "");
        return hextochar.containsKey(gettokencolumnnr);
    }

    public static final <T> T read(hexToChar hextochar, getTokenColumnNr<T> gettokencolumnnr) {
        toMagicModuleMetaRepoModel.read(gettokencolumnnr, "");
        _leading3 _leading3VarIconCompatParcelizer = hextochar.get(gettokencolumnnr);
        if (_leading3VarIconCompatParcelizer == null) {
            _leading3VarIconCompatParcelizer = gettokencolumnnr.IconCompatParcelizer();
        }
        return (T) _leading3VarIconCompatParcelizer.AudioAttributesCompatParcelizer(hextochar);
    }

    public static /* synthetic */ hexToChar RemoteActionCompatParcelizer$default(ContentReference[] contentReferenceArr, hexToChar hextochar, hexToChar hextochar2, int i, Object obj) {
        if ((i & 4) != 0) {
            hextochar2 = imagIdx.write();
        }
        return RemoteActionCompatParcelizer(contentReferenceArr, hextochar, hextochar2);
    }

    public static final hexToChar RemoteActionCompatParcelizer(ContentReference<?>[] contentReferenceArr, hexToChar hextochar, hexToChar hextochar2) {
        square.write writeVarRatingCompat = imagIdx.write().IconCompatParcelizer();
        hexToChar hextochar3 = hextochar2;
        for (ContentReference<?> contentReference : contentReferenceArr) {
            getTokenColumnNr<?> gettokencolumnnrWrite = contentReference.write();
            toMagicModuleMetaRepoModel.read(gettokencolumnnrWrite, "");
            CharacterEscapes characterEscapes = (CharacterEscapes) gettokencolumnnrWrite;
            if (contentReference.getMediaBrowserCompatCustomActionResultReceiver() || !write(hextochar, characterEscapes)) {
                _leading3 _leading3Var = (_leading3) hextochar3.get(characterEscapes);
                toMagicModuleMetaRepoModel.read(contentReference, "");
                writeVarRatingCompat.put(characterEscapes, characterEscapes.IconCompatParcelizer(contentReference, _leading3Var));
            }
        }
        return writeVarRatingCompat.RemoteActionCompatParcelizer();
    }
}
