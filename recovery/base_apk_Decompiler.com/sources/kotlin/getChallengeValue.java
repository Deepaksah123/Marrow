package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\r\u001a\u00060\u0004j\u0002`\u0005J\u0013\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/marrow2/ui/qbank/lesson_list/model/TabState;", "", "tabs", "", "", "Lcom/marrow2/ui/qbank/lesson_list/model/QBankTabUIModel;", "currentTabPosition", "<init>", "(Ljava/util/List;I)V", "getTabs", "()Ljava/util/List;", "getCurrentTabPosition", "()I", "getCurrentTabType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getChallengeValue {
    private final List<Integer> read;
    private final int write;

    private getChallengeValue(List<Integer> list, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = list;
        this.write = i;
    }

    public /* synthetic */ getChallengeValue(List list, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 2) != 0 ? 0 : i);
    }

    public final List<Integer> write() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public final int AudioAttributesCompatParcelizer() {
        List<Integer> list = this.read;
        int i = this.write;
        return ((i < 0 || i >= list.size()) ? -1 : list.get(i)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getChallengeValue() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ getChallengeValue read(getChallengeValue getchallengevalue, List list, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = getchallengevalue.read;
        }
        if ((i2 & 2) != 0) {
            i = getchallengevalue.write;
        }
        return RemoteActionCompatParcelizer(list, i);
    }

    private static getChallengeValue RemoteActionCompatParcelizer(List<Integer> list, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new getChallengeValue(list, i);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getChallengeValue)) {
            return false;
        }
        getChallengeValue getchallengevalue = (getChallengeValue) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getchallengevalue.read) && this.write == getchallengevalue.write;
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        List<Integer> list = this.read;
        int i = this.write;
        StringBuilder sb = new StringBuilder("TabState(tabs=");
        sb.append(list);
        sb.append(", currentTabPosition=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
