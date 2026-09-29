package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003Bo\u00122\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0007\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001eR@\u0010\u0018\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R(\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010&R$\u0010*\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b\u0018\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010+8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010,R\u0014\u0010#\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0017"}, d2 = {"Lo/getDeserializer;", "T", "R", "Lo/PropertyBasedObjectIdGenerator;", "Lkotlin/Function4;", "Lo/JsonReadFeature;", "", "p0", "", "", "", "p1", "", "p2", "<init>", "(Lo/getMagicModuleStat;Ljava/util/Map;Ljava/util/Map;)V", "", "Lo/appendReferring;", "IconCompatParcelizer", "(Lo/JsonReadFeature;ILjava/util/List;)Lo/appendReferring;", "", "AudioAttributesCompatParcelizer", "(Lo/JsonReadFeature;)V", "()Lo/JsonReadFeature;", "RemoteActionCompatParcelizer", "(I)Lo/JsonReadFeature;", "Lo/PropertyValue;", "write", "(Ljava/lang/String;)Lo/PropertyValue;", "", "(Lo/JsonReadFeature;)Z", "Lo/getMagicModuleStat;", "Ljava/util/Map;", "read", "Lo/setCardContent;", "AudioAttributesImplBaseParcelizer", "Lo/setCardContent;", "I", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Lo/appendReferring;", "()Lo/appendReferring;", "AudioAttributesImplApi21Parcelizer", "Lo/PropertyBasedCreatorCaseInsensitiveMap;", "()Lo/PropertyBasedCreatorCaseInsensitiveMap;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getDeserializer<T, R> implements PropertyBasedObjectIdGenerator {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, Object> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;
    private final Map<JsonReadFeature, List<R>> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getMagicModuleStat<JsonReadFeature, PropertyBasedObjectIdGenerator, List<? extends T>, List<? extends R>, T> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setCardContent<JsonReadFeature> IconCompatParcelizer = new setCardContent<>();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private appendReferring AudioAttributesImplApi21Parcelizer = startBuilding.IconCompatParcelizer();

    /* JADX WARN: Multi-variable type inference failed */
    public getDeserializer(getMagicModuleStat<? super JsonReadFeature, ? super PropertyBasedObjectIdGenerator, ? super List<? extends T>, ? super List<? extends R>, ? extends T> getmagicmodulestat, Map<String, Object> map, Map<JsonReadFeature, List<R>> map2) {
        this.RemoteActionCompatParcelizer = getmagicmodulestat;
        this.write = map;
        this.read = map2;
    }

    public final appendReferring IconCompatParcelizer(JsonReadFeature p0, int p1, List<T> p2) {
        appendReferring appendreferringRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        appendReferring appendreferringIconCompatParcelizer = startBuilding.IconCompatParcelizer();
        AudioAttributesCompatParcelizer(p0);
        int i = 0;
        for (JsonReadFeature jsonReadFeature : p0.read()) {
            appendreferringIconCompatParcelizer = startBuilding.RemoteActionCompatParcelizer(appendreferringIconCompatParcelizer, IconCompatParcelizer(jsonReadFeature, i, arrayList));
            if (write(jsonReadFeature)) {
                i++;
            }
        }
        Object objIconCompatParcelizer = p0.IconCompatParcelizer();
        List<R> listRemoteActionCompatParcelizer = null;
        isEnumImplType isenumimpltype = objIconCompatParcelizer instanceof isEnumImplType ? (isEnumImplType) objIconCompatParcelizer : null;
        if (isenumimpltype != null && (appendreferringRemoteActionCompatParcelizer = startBuilding.RemoteActionCompatParcelizer(isenumimpltype)) != null) {
            appendreferringIconCompatParcelizer = appendreferringRemoteActionCompatParcelizer;
        }
        this.AudioAttributesCompatParcelizer = p1;
        this.AudioAttributesImplApi21Parcelizer = appendreferringIconCompatParcelizer;
        Map<JsonReadFeature, List<R>> map = this.read;
        if (map != null) {
            if (map.isEmpty()) {
                map = null;
            }
            if (map != null) {
                listRemoteActionCompatParcelizer = map.remove(p0);
            }
        }
        getMagicModuleStat<JsonReadFeature, PropertyBasedObjectIdGenerator, List<? extends T>, List<? extends R>, T> getmagicmodulestat = this.RemoteActionCompatParcelizer;
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        T tWrite = getmagicmodulestat.write(p0, this, arrayList, listRemoteActionCompatParcelizer);
        if (tWrite != null) {
            p2.add(tWrite);
        }
        AudioAttributesCompatParcelizer();
        return appendreferringIconCompatParcelizer;
    }

    @Override // kotlin.PropertyBasedObjectIdGenerator
    public final String IconCompatParcelizer() {
        int i;
        String strAudioAttributesImplBaseParcelizer = read().AudioAttributesImplBaseParcelizer();
        if (strAudioAttributesImplBaseParcelizer == null) {
            return null;
        }
        if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strAudioAttributesImplBaseParcelizer, "CC(")) {
            i = TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strAudioAttributesImplBaseParcelizer, "C(") ? 2 : 3;
            return null;
        }
        int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) strAudioAttributesImplBaseParcelizer, ')', 0, false, 6);
        if (iIconCompatParcelizer > 2) {
            String strSubstring = strAudioAttributesImplBaseParcelizer.substring(i, iIconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            return strSubstring;
        }
        return null;
    }

    @Override // kotlin.PropertyBasedObjectIdGenerator
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final appendReferring getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.PropertyBasedObjectIdGenerator
    public final PropertyBasedCreatorCaseInsensitiveMap write() {
        String strAudioAttributesImplBaseParcelizer;
        PropertyValue propertyValueWrite;
        String strAudioAttributesImplBaseParcelizer2;
        JsonReadFeature jsonReadFeatureRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1);
        if (jsonReadFeatureRemoteActionCompatParcelizer == null || (strAudioAttributesImplBaseParcelizer = jsonReadFeatureRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer()) == null || (propertyValueWrite = write(strAudioAttributesImplBaseParcelizer)) == null) {
            return null;
        }
        PropertyValue propertyValueWrite2 = propertyValueWrite;
        for (int i = 2; i < this.IconCompatParcelizer.size(); i++) {
            if ((propertyValueWrite2 != null ? propertyValueWrite2.getAudioAttributesCompatParcelizer() : null) != null) {
                break;
            }
            JsonReadFeature jsonReadFeatureRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i);
            propertyValueWrite2 = (jsonReadFeatureRemoteActionCompatParcelizer2 == null || (strAudioAttributesImplBaseParcelizer2 = jsonReadFeatureRemoteActionCompatParcelizer2.AudioAttributesImplBaseParcelizer()) == null) ? null : write(strAudioAttributesImplBaseParcelizer2);
        }
        return propertyValueWrite.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, propertyValueWrite2);
    }

    private final void AudioAttributesCompatParcelizer(JsonReadFeature p0) {
        this.IconCompatParcelizer.addLast(p0);
    }

    private final JsonReadFeature AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.removeLast();
    }

    private final JsonReadFeature read() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private final JsonReadFeature RemoteActionCompatParcelizer(int p0) {
        if (this.IconCompatParcelizer.size() <= p0) {
            return null;
        }
        return this.IconCompatParcelizer.get((r1.size() - p0) - 1);
    }

    private final PropertyValue write(String p0) {
        Map<String, Object> map = this.write;
        Object objIconCompatParcelizer$default = map.get(p0);
        if (objIconCompatParcelizer$default == null) {
            objIconCompatParcelizer$default = startBuilding.IconCompatParcelizer$default(p0, null, 2, null);
            map.put(p0, objIconCompatParcelizer$default);
        }
        if (objIconCompatParcelizer$default instanceof PropertyValue) {
            return (PropertyValue) objIconCompatParcelizer$default;
        }
        return null;
    }

    private final boolean write(JsonReadFeature p0) {
        String strAudioAttributesImplBaseParcelizer = p0.AudioAttributesImplBaseParcelizer();
        if (strAudioAttributesImplBaseParcelizer != null) {
            return TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strAudioAttributesImplBaseParcelizer, "C");
        }
        return false;
    }
}
