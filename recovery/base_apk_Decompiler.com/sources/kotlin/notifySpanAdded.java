package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/marrow2/data/pref/constant/LessonConfigConstantSourceImpl;", "Lcom/marrow2/data/pref/constant/LessonConfigConstantSource;", "<init>", "()V", "getTabList", "", "", "Lcom/marrow2/data/lesson/local/model/QBankTabLSModel;", "filter", "isSubscribedGlobally", "", "isSubjectSubscribed", "(IZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class notifySpanAdded implements createUid {
    public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);
    public static int IconCompatParcelizer = -1;
    public static int write = 3;
    private static final List<Integer> read = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{-1, 1, 2, 0, Integer.valueOf(write)});
    private static final List<Integer> AudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{Integer.valueOf(IconCompatParcelizer), Integer.valueOf(write), 1, 2, 0});
    private static final List<Integer> AudioAttributesImplBaseParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{Integer.valueOf(IconCompatParcelizer), 1, 2, 0});

    @setSdkPayload
    public notifySpanAdded() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Lo/notifySpanAdded$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "", "read", "Ljava/util/List;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.createUid
    public final Object IconCompatParcelizer(int i, boolean z, boolean z2) {
        if (i != 2) {
            return read;
        }
        if (z2 | z) {
            return AudioAttributesImplBaseParcelizer;
        }
        return AudioAttributesCompatParcelizer;
    }
}
