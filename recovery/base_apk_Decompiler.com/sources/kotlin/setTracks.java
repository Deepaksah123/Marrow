package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000fJ%\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u001f\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Lo/setTracks;", "Lo/setMaxSeekToPreviousPositionMs;", "Lo/containsType;", "p0", "<init>", "(Lo/containsType;)V", "", "", "", "write", "(Ljava/lang/String;)Ljava/util/List;", "p1", "", "read", "(Ljava/lang/String;J)V", "(Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/util/List;)V", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "Lo/containsType;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTracks implements setMaxSeekToPreviousPositionMs {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final containsType AudioAttributesCompatParcelizer;

    public setTracks(containsType containstype) {
        toMagicModuleMetaRepoModel.write(containstype, "");
        this.AudioAttributesCompatParcelizer = containstype;
    }

    public final List<Long> write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return IconCompatParcelizer("__impressions_".concat(String.valueOf(p0)));
    }

    public final void read(String p0, long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        List<Long> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) write(p0));
        listMediaBrowserCompatItemReceiver.add(Long.valueOf(p1));
        AudioAttributesCompatParcelizer("__impressions_".concat(String.valueOf(p0)), listMediaBrowserCompatItemReceiver);
    }

    public final void read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer("__impressions_".concat(String.valueOf(p0)));
    }

    private final void AudioAttributesCompatParcelizer(String p0, List<Long> p1) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(p1, ",", null, null, 0, null, null, 62));
    }

    private final List<Long> IconCompatParcelizer(String p0) {
        String strWrite = this.AudioAttributesCompatParcelizer.write(p0, "");
        if (strWrite == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) strWrite)) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List listWrite = TestGroupLSModel.write(strWrite, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listWrite.iterator();
        while (it.hasNext()) {
            Long lMediaBrowserCompatCustomActionResultReceiver = TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver((String) it.next());
            if (lMediaBrowserCompatCustomActionResultReceiver != null) {
                arrayList.add(lMediaBrowserCompatCustomActionResultReceiver);
            }
        }
        return arrayList;
    }

    @Override // kotlin.setMaxSeekToPreviousPositionMs
    public final void write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        RendererCapabilitiesDecoderSupport.read.write();
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(RendererCapabilitiesDecoderSupport.RemoteActionCompatParcelizer(2, p0, p1));
    }
}
