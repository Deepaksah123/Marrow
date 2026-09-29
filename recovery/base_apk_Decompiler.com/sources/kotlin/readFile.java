package kotlin;

import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import com.marrow.data.models.mcq.bookmark.MultiBookmarkCounter;
import com.marrow.data.models.pearl.PearlListItem;
import com.marrow.data.models.pearl.PearlMini;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class readFile implements readCachedContent {
    private final maybeThrowManifestError write;

    @setSdkPayload
    public readFile(maybeThrowManifestError maybethrowmanifesterror) {
        toMagicModuleMetaRepoModel.write(maybethrowmanifesterror, "");
        this.write = maybethrowmanifesterror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List IconCompatParcelizer(readFile readfile, String str, List list) {
        FilterItemRecord[] filterItemRecordArrWrite = readfile.write.write(str, (List<String>) list);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(filterItemRecordArrWrite, "");
        return getBytes.write(filterItemRecordArrWrite);
    }

    @Override // kotlin.readCachedContent
    public final Object read(final String str, final List<String> list) {
        return CmcdHeadersFactoryCmcdObjectBuilder.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.hashCachedContent
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return readFile.IconCompatParcelizer(this.RemoteActionCompatParcelizer, str, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List write(readFile readfile, String str, boolean z, int i, String str2) {
        PearlListItem[] pearlListItemArr = readfile.write.read(str, z, i, str2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pearlListItemArr, "");
        return getBytes.RemoteActionCompatParcelizer(pearlListItemArr);
    }

    @Override // kotlin.readCachedContent
    public final Object RemoteActionCompatParcelizer(final String str, final boolean z, final int i, final String str2) {
        return CmcdHeadersFactoryCmcdObjectBuilder.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.CachedContentIndexLegacyStorage
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return readFile.write(this.RemoteActionCompatParcelizer, str, z, i, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List write(readFile readfile, String str) {
        MultiBookmarkCounter[] multiBookmarkCounterArrAudioAttributesImplBaseParcelizer = readfile.write.AudioAttributesImplBaseParcelizer(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(multiBookmarkCounterArrAudioAttributesImplBaseParcelizer, "");
        return getBytes.AudioAttributesCompatParcelizer(multiBookmarkCounterArrAudioAttributesImplBaseParcelizer);
    }

    @Override // kotlin.readCachedContent
    public final Object read(final String str) {
        return CmcdHeadersFactoryCmcdObjectBuilder.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.writeCachedContent
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return readFile.write(this.read, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List read(readFile readfile, String str, boolean z, int i) {
        String[][] strArrIconCompatParcelizer = readfile.write.IconCompatParcelizer("html", str, z, i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strArrIconCompatParcelizer, "");
        return getBytes.read(strArrIconCompatParcelizer);
    }

    @Override // kotlin.readCachedContent
    public final Object IconCompatParcelizer(final String str, final boolean z, final int i) {
        return CmcdHeadersFactoryCmcdObjectBuilder.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.ContentMetadata
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return readFile.read(this.IconCompatParcelizer, str, z, i);
            }
        });
    }

    @Override // kotlin.readCachedContent
    public final Object AudioAttributesCompatParcelizer(String str) {
        PearlMini pearlMiniMediaBrowserCompatCustomActionResultReceiver = this.write.MediaBrowserCompatCustomActionResultReceiver(str);
        if (pearlMiniMediaBrowserCompatCustomActionResultReceiver != null) {
            return setContentLength.read(pearlMiniMediaBrowserCompatCustomActionResultReceiver);
        }
        return null;
    }
}
