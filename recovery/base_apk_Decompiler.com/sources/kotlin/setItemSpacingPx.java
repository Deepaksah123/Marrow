package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lo/setLayoutParams;", "", "p0", "", "write", "(Lo/setLayoutParams;J)Z", "Lo/CharacterEscapes;", "IconCompatParcelizer", "Lo/CharacterEscapes;", "RemoteActionCompatParcelizer", "()Lo/CharacterEscapes;", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setItemSpacingPx {
    private static final CharacterEscapes<setLayoutParams> IconCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer$default(null, new getCreatedOnDateMs() { // from class: o.setItemSpacingRes
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return setItemSpacingPx.read();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final setLayoutParams read() {
        return null;
    }

    public static final boolean write(setLayoutParams setlayoutparams, long j) {
        setOverflowIcon<getFirstIndexOfModelInBuildingList> setoverflowicon;
        if (setlayoutparams == null || (setoverflowicon = setlayoutparams.read()) == null) {
            return false;
        }
        return setoverflowicon.RemoteActionCompatParcelizer(j);
    }

    public static final CharacterEscapes<setLayoutParams> RemoteActionCompatParcelizer() {
        return IconCompatParcelizer;
    }
}
