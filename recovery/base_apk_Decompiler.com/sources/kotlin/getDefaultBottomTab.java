package kotlin;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface getDefaultBottomTab<M extends Member> {
    Type AudioAttributesCompatParcelizer();

    List<Type> IconCompatParcelizer();

    Object RemoteActionCompatParcelizer(Object[] objArr);

    M write();

    public static final class AudioAttributesCompatParcelizer {
        public static <M extends Member> void read(getDefaultBottomTab<? extends M> getdefaultbottomtab, Object[] objArr) {
            toMagicModuleMetaRepoModel.write(objArr, "");
            if (getGtAnalyticsCard.RemoteActionCompatParcelizer(getdefaultbottomtab) == objArr.length) {
                return;
            }
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(getGtAnalyticsCard.RemoteActionCompatParcelizer(getdefaultbottomtab));
            sb.append(" arguments, but ");
            sb.append(objArr.length);
            sb.append(" were provided.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
