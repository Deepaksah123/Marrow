package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0007\fB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e"}, d2 = {"Lo/getEndTimestamp;", "", "", "Lo/setMoney;", "p0", "<init>", "(Ljava/util/List;)V", "IconCompatParcelizer", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "read", "write", "Lo/getEndTimestamp$IconCompatParcelizer;", "Lo/getEndTimestamp$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getEndTimestamp {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<setMoney> read;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getEndTimestamp$IconCompatParcelizer;", "Lo/getEndTimestamp;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends getEndTimestamp {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), null);
        }
    }

    private getEndTimestamp(List<setMoney> list) {
        this.read = list;
    }

    public final List<setMoney> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public static final class write extends getEndTimestamp {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(List<setMoney> list) {
            super(list, null);
            toMagicModuleMetaRepoModel.write(list, "");
        }
    }

    public /* synthetic */ getEndTimestamp(List list, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(list);
    }
}
