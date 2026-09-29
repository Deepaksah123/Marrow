package kotlin;

import com.marrow.data.models.pearl.Pearl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class exists implements deleteRow {
    private final storeIncremental IconCompatParcelizer;
    private final readCachedContent RemoteActionCompatParcelizer;
    private final getRedirectedUri write;

    @setSdkPayload
    public exists(storeIncremental storeincremental, readCachedContent readcachedcontent, getRedirectedUri getredirecteduri) {
        toMagicModuleMetaRepoModel.write(storeincremental, "");
        toMagicModuleMetaRepoModel.write(readcachedcontent, "");
        toMagicModuleMetaRepoModel.write(getredirecteduri, "");
        this.IconCompatParcelizer = storeincremental;
        this.RemoteActionCompatParcelizer = readcachedcontent;
        this.write = getredirecteduri;
    }

    @Override // kotlin.deleteRow
    public final void read(List<? extends Pearl> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer.read(list);
    }

    @Override // kotlin.deleteRow
    public final Object read(String str, List<String> list) {
        return this.RemoteActionCompatParcelizer.read(str, list);
    }

    @Override // kotlin.deleteRow
    public final Object AudioAttributesImplApi26Parcelizer(String str) {
        new String[]{str};
        return this.IconCompatParcelizer.read();
    }

    @Override // kotlin.deleteRow
    public final Object read(String str, boolean z, int i, String str2) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, z, i, str2);
    }

    @Override // kotlin.deleteRow
    public final Object write(String str) {
        return this.RemoteActionCompatParcelizer.read(str);
    }

    @Override // kotlin.deleteRow
    public final Object IconCompatParcelizer(String str, int i) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(str, i);
    }

    @Override // kotlin.deleteRow
    public final Object IconCompatParcelizer(String str, boolean z, int i) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, z, i);
    }

    @Override // kotlin.deleteRow
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super isMetadataEqual> sampleVideos) {
        return this.IconCompatParcelizer.IconCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.deleteRow
    public final Object read(String str) {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(str);
    }

    @Override // kotlin.deleteRow
    public final Object IconCompatParcelizer(String str) {
        return this.write.IconCompatParcelizer(str);
    }

    @Override // kotlin.deleteRow
    public final Object AudioAttributesCompatParcelizer(String str) {
        return this.write.RemoteActionCompatParcelizer(str);
    }

    @Override // kotlin.deleteRow
    public final Object RemoteActionCompatParcelizer(String str) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str);
    }
}
