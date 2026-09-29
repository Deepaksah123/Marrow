package kotlin;

import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class getAnswerPointer extends getMagicLine<List<? extends getMagicLine<?>>> {
    public static int AudioAttributesCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    private final getAnswerMap<getTopSection, getLink> read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public getAnswerPointer(List<? extends getMagicLine<?>> list, getAnswerMap<? super getTopSection, ? extends getLink> getanswermap) {
        super(list);
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.read = getanswermap;
    }

    @Override // kotlin.getMagicLine
    public final getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        getLink getlinkInvoke = this.read.invoke(gettopsection);
        if (!getTestTabItems.RemoteActionCompatParcelizer(getlinkInvoke) && !getTestTabItems.MediaBrowserCompatCustomActionResultReceiver(getlinkInvoke)) {
            getTestTabItems.MediaBrowserCompatSearchResultReceiver(getlinkInvoke);
        }
        return getlinkInvoke;
    }

    public static int read() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 6694198;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int iNextInt = new Random().nextInt(2000743534);
        RemoteActionCompatParcelizer = iNextInt;
        return iNextInt;
    }
}
