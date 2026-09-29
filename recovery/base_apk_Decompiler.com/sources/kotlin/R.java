package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/CharacterEscapes;", "Lo/switchToNext;", "read", "Lo/CharacterEscapes;", "RemoteActionCompatParcelizer", "()Lo/CharacterEscapes;", "write"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class R {
    private static final CharacterEscapes<switchToNext> read = resetAsNaN.RemoteActionCompatParcelizer$default(null, R.RemoteActionCompatParcelizer.IconCompatParcelizer, 1, null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements getCreatedOnDateMs<switchToNext> {
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

        public final long RemoteActionCompatParcelizer() {
            return switchToNext.INSTANCE.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ switchToNext invoke() {
            return switchToNext.write(RemoteActionCompatParcelizer());
        }

        RemoteActionCompatParcelizer() {
        }
    }

    public static final CharacterEscapes<switchToNext> RemoteActionCompatParcelizer() {
        return read;
    }
}
