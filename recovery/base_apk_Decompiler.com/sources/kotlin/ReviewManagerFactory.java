package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/marrow2/ui/video/lesson_list/model/VideoTabsState;", "", "currentTabPosition", "", "tabList", "", "<init>", "(ILjava/util/List;)V", "getCurrentTabPosition", "()I", "getTabList", "()Ljava/util/List;", "currentTabType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReviewManagerFactory {
    private final List<Integer> AudioAttributesCompatParcelizer;
    private final int write;

    private ReviewManagerFactory(int i, List<Integer> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = i;
        this.AudioAttributesCompatParcelizer = list;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public /* synthetic */ ReviewManagerFactory(int i, List list, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final List<Integer> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int write() {
        List<Integer> list = this.AudioAttributesCompatParcelizer;
        int i = this.write;
        return ((i < 0 || i >= list.size()) ? -1 : list.get(i)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewManagerFactory() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReviewManagerFactory AudioAttributesCompatParcelizer(ReviewManagerFactory reviewManagerFactory, int i, List list, int i2) {
        if ((i2 & 1) != 0) {
            i = reviewManagerFactory.write;
        }
        if ((i2 & 2) != 0) {
            list = reviewManagerFactory.AudioAttributesCompatParcelizer;
        }
        return write(i, list);
    }

    private static ReviewManagerFactory write(int i, List<Integer> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new ReviewManagerFactory(i, list);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewManagerFactory)) {
            return false;
        }
        ReviewManagerFactory reviewManagerFactory = (ReviewManagerFactory) other;
        return this.write == reviewManagerFactory.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, reviewManagerFactory.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.write) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.write;
        List<Integer> list = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoTabsState(currentTabPosition=");
        sb.append(i);
        sb.append(", tabList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
