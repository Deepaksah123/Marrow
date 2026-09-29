package kotlin;

import com.marrow.data.models.magicModule.MagicModuleTimeline;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheDataSource1 implements openNextSource {
    private final DashMediaSource1 AudioAttributesCompatParcelizer;

    @setSdkPayload
    public CacheDataSource1(DashMediaSource1 dashMediaSource1) {
        toMagicModuleMetaRepoModel.write(dashMediaSource1, "");
        this.AudioAttributesCompatParcelizer = dashMediaSource1;
    }

    @Override // kotlin.openNextSource
    public final Object RemoteActionCompatParcelizer() {
        List<MagicModuleTimeline> listWrite = this.AudioAttributesCompatParcelizer.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        List<MagicModuleTimeline> list = listWrite;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (MagicModuleTimeline magicModuleTimeline : list) {
            toMagicModuleMetaRepoModel.write(magicModuleTimeline);
            arrayList.add(notifyBytesRead.IconCompatParcelizer(magicModuleTimeline));
        }
        return arrayList;
    }

    @Override // kotlin.openNextSource
    public final Object read(List<MagicModuleTimeline> list) {
        this.AudioAttributesCompatParcelizer.ah_();
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(list.toArray(new MagicModuleTimeline[0]));
        return getShowPopup.INSTANCE;
    }
}
