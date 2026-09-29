package kotlin;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/getPracticalItems;", "Lo/getDefaultBottomTab;", "", "<init>", "()V", "", "p0", "", "RemoteActionCompatParcelizer", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/reflect/Type;", "IconCompatParcelizer", "()Ljava/util/List;", "write", "AudioAttributesCompatParcelizer", "()Ljava/lang/reflect/Type;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getPracticalItems implements getDefaultBottomTab {
    public static final getPracticalItems INSTANCE = new getPracticalItems();

    @Override // kotlin.getDefaultBottomTab
    public final /* synthetic */ Member write() {
        return null;
    }

    private getPracticalItems() {
    }

    @Override // kotlin.getDefaultBottomTab
    public final List<Type> IconCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getDefaultBottomTab
    public final Type AudioAttributesCompatParcelizer() {
        Class cls = Void.TYPE;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
        return cls;
    }

    @Override // kotlin.getDefaultBottomTab
    public final Object RemoteActionCompatParcelizer(Object[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }
}
