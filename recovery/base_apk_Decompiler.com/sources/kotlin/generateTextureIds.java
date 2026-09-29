package kotlin;

import com.marrow2.data.tag.local.model.TagLSModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class generateTextureIds implements getDefaultDisplay {
    private final onFrameAvailable RemoteActionCompatParcelizer;

    @setSdkPayload
    public generateTextureIds(onFrameAvailable onframeavailable) {
        toMagicModuleMetaRepoModel.write(onframeavailable, "");
        this.RemoteActionCompatParcelizer = onframeavailable;
    }

    @Override // kotlin.getDefaultDisplay
    public final Object write(String str) {
        return this.RemoteActionCompatParcelizer.write(str);
    }

    @Override // kotlin.getDefaultDisplay
    public final Object IconCompatParcelizer(String str) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(str);
    }

    @Override // kotlin.getDefaultDisplay
    public final Object write(List<TagLSModel> list, String str) {
        this.RemoteActionCompatParcelizer.write(list, str);
        getYear.IconCompatParcelizer();
        return getShowPopup.INSTANCE;
    }
}
