package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.isTrafficRestricted;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/marrow2/ui/video/downloaded_videos/model/DownloadedVideosAdapterDataModel;", "", "totalItems", "", "Lcom/marrow2/domain/video/lesson_list/SealedVideoDetailsModel$DownloadModel;", "selectedList", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getTotalItems", "()Ljava/util/List;", "getSelectedList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setSelectedTabIndicator {
    private final List<String> RemoteActionCompatParcelizer;
    private final List<isTrafficRestricted.RemoteActionCompatParcelizer> read;
    public static final read write = new read(null);
    private static final setSelectedTabIndicator IconCompatParcelizer = new setSelectedTabIndicator(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());

    private setSelectedTabIndicator(List<isTrafficRestricted.RemoteActionCompatParcelizer> list, List<String> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.read = list;
        this.RemoteActionCompatParcelizer = list2;
    }

    public final List<isTrafficRestricted.RemoteActionCompatParcelizer> write() {
        return this.read;
    }

    public final List<String> read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setSelectedTabIndicator$read;", "", "<init>", "()V", "Lo/setSelectedTabIndicator;", "IconCompatParcelizer", "Lo/setSelectedTabIndicator;", "RemoteActionCompatParcelizer", "()Lo/setSelectedTabIndicator;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public static setSelectedTabIndicator RemoteActionCompatParcelizer() {
            return setSelectedTabIndicator.IconCompatParcelizer;
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static /* synthetic */ setSelectedTabIndicator RemoteActionCompatParcelizer(setSelectedTabIndicator setselectedtabindicator, List list, List list2, int i) {
        if ((i & 1) != 0) {
            list = setselectedtabindicator.read;
        }
        if ((i & 2) != 0) {
            list2 = setselectedtabindicator.RemoteActionCompatParcelizer;
        }
        return AudioAttributesCompatParcelizer(list, list2);
    }

    public static setSelectedTabIndicator AudioAttributesCompatParcelizer(List<isTrafficRestricted.RemoteActionCompatParcelizer> list, List<String> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        return new setSelectedTabIndicator(list, list2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setSelectedTabIndicator)) {
            return false;
        }
        setSelectedTabIndicator setselectedtabindicator = (setSelectedTabIndicator) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, setselectedtabindicator.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setselectedtabindicator.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        List<isTrafficRestricted.RemoteActionCompatParcelizer> list = this.read;
        List<String> list2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("DownloadedVideosAdapterDataModel(totalItems=");
        sb.append(list);
        sb.append(", selectedList=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
