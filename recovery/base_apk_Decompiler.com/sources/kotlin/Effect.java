package kotlin;

import com.marrow.data.models.tag.Tag;
import com.marrow2.data.tag.local.model.TagLSModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Effect implements onFrameAvailable {
    private final resolveCacheKey IconCompatParcelizer;

    @setSdkPayload
    public Effect(resolveCacheKey resolvecachekey) {
        toMagicModuleMetaRepoModel.write(resolvecachekey, "");
        this.IconCompatParcelizer = resolvecachekey;
    }

    @Override // kotlin.onFrameAvailable
    public final Object write(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.write("_group =? ", new String[]{str}));
    }

    @Override // kotlin.onFrameAvailable
    public final Object IconCompatParcelizer(String str) {
        return AudioAttributesCompatParcelizer(str);
    }

    private final List<TagLSModel> AudioAttributesCompatParcelizer(String str) {
        List<Tag> listAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer("_group", IntermediateLoginResponseBody.RemoteActionCompatParcelizer(str));
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        for (Tag tag : listAudioAttributesCompatParcelizer) {
            String str2 = tag.id;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            int i = tag.sortOrder;
            String str3 = tag.title;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
            String str4 = tag.group;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
            arrayList.add(new TagLSModel(str2, i, str3, str4));
        }
        return arrayList;
    }

    @Override // kotlin.onFrameAvailable
    public final Object write(List<TagLSModel> list, String str) {
        this.IconCompatParcelizer.read("_group", str);
        this.IconCompatParcelizer.IconCompatParcelizer(read(list).toArray(new Tag[0]));
        return getShowPopup.INSTANCE;
    }

    private static List<Tag> read(List<TagLSModel> list) {
        List<TagLSModel> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (TagLSModel tagLSModel : list2) {
            Tag tag = new Tag();
            tag.id = tagLSModel.getId();
            tag.sortOrder = tagLSModel.getSortOrder();
            tag.title = tagLSModel.getTitle();
            tag.group = tagLSModel.getGroup();
            arrayList.add(tag);
        }
        return arrayList;
    }
}
