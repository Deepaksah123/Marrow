package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0005\u0010\n"}, d2 = {"Lo/Instantiatable;", "p0", "Lo/switchToNext;", "p1", "p2", "IconCompatParcelizer", "(Lo/Instantiatable;JJ)Lo/Instantiatable;", "Lo/CharacterEscapes;", "Lo/CharacterEscapes;", "write", "()Lo/CharacterEscapes;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setShowTimeoutMs {
    private static final CharacterEscapes<Instantiatable> IconCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer$default(null, new getCreatedOnDateMs() { // from class: o.setShowVrButton
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return setShowTimeoutMs.AudioAttributesCompatParcelizer();
        }
    }, 1, null);
    private static final CharacterEscapes<switchToNext> write = resetAsNaN.RemoteActionCompatParcelizer$default(null, read.write, 1, null);

    public static final CharacterEscapes<Instantiatable> write() {
        return IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Instantiatable AudioAttributesCompatParcelizer() {
        return new _hasOneOf(setOnFullScreenModeChangedListener.IconCompatParcelizer(), null);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements getCreatedOnDateMs<switchToNext> {
        public static final read write = new read();

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ switchToNext invoke() {
            return switchToNext.write(read());
        }

        public final long read() {
            return setOnFullScreenModeChangedListener.IconCompatParcelizer();
        }

        read() {
        }
    }

    public static final CharacterEscapes<switchToNext> IconCompatParcelizer() {
        return write;
    }

    public static final Instantiatable IconCompatParcelizer(Instantiatable instantiatable, long j, long j2) {
        return !switchToNext.RemoteActionCompatParcelizer(j, j2) ? new _hasOneOf(j, null) : instantiatable;
    }
}
