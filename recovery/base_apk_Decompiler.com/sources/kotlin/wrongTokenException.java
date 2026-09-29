package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u0004\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001a\u0010\f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\n"}, d2 = {"Lo/weirdNumberException;", "", "p0", "p1", "write", "(Lo/weirdNumberException;II)I", "Lo/getInterfaces;", "AudioAttributesCompatParcelizer", "Lo/getInterfaces;", "RemoteActionCompatParcelizer", "()Lo/getInterfaces;", "IconCompatParcelizer", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class wrongTokenException {
    private static final getInterfaces AudioAttributesCompatParcelizer = new getInterfaces(IconCompatParcelizer.RemoteActionCompatParcelizer);
    private static final getInterfaces RemoteActionCompatParcelizer = new getInterfaces(RemoteActionCompatParcelizer.write);

    public static final int write(weirdNumberException weirdnumberexception, int i, int i2) {
        return weirdnumberexception.AudioAttributesCompatParcelizer().invoke(Integer.valueOf(i), Integer.valueOf(i2)).intValue();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, Integer, Integer> {
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer();

        public final Integer IconCompatParcelizer(int i, int i2) {
            return Integer.valueOf(Math.min(i, i2));
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return IconCompatParcelizer(num.intValue(), num2.intValue());
        }

        IconCompatParcelizer() {
            super(2, getOnline.class, "min", "min(II)I", 1);
        }
    }

    public static final getInterfaces RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Integer, Integer, Integer> {
        public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer();

        public final Integer AudioAttributesCompatParcelizer(int i, int i2) {
            return Integer.valueOf(Math.max(i, i2));
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return AudioAttributesCompatParcelizer(num.intValue(), num2.intValue());
        }

        RemoteActionCompatParcelizer() {
            super(2, getOnline.class, "max", "max(II)I", 1);
        }
    }

    public static final getInterfaces IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }
}
