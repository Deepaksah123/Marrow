package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0016\u001a\u00020\u001a8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001c\u001a\u00020\u001a8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019R\u0014\u0010\"\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010!"}, d2 = {"Lo/_findParamName;", "Lo/_findCustomBeanDeserializer;", "Lo/AbstractDeserializer;", "p0", "Lo/deserializeWithObjectId;", "p1", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p2", "Lo/bufferMapProperty;", "p3", "Lo/_reportMissingSetter$write;", "p4", "<init>", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Ljava/util/List;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;)V", "Lo/_findCustomCollectionLikeDeserializer;", "IconCompatParcelizer", "(Lo/_findCustomCollectionLikeDeserializer;Lo/_findCustomCollectionLikeDeserializer;)Lo/_findCustomCollectionLikeDeserializer;", "read", "Lo/AbstractDeserializer;", "()Lo/AbstractDeserializer;", "write", "Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/List;", "", "Lo/RenewEligible;", "RemoteActionCompatParcelizer", "()F", "AudioAttributesCompatParcelizer", "Lo/_findCreatorsFromProperties;", "", "()Z", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _findParamName implements _findCustomBeanDeserializer {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<_findCreatorsFromProperties> AudioAttributesCompatParcelizer;
    private final AbstractDeserializer read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write = getRenewExpiresOn.write(RenewEligibleCompanion.read, new getCreatedOnDateMs() { // from class: o._addExplicitDelegatingCreator
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return Float.valueOf(_findParamName.read(this.write));
        }
    });

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.read, new getCreatedOnDateMs() { // from class: o._addExplicitFactoryCreators
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return Float.valueOf(_findParamName.RemoteActionCompatParcelizer(this.read));
        }
    });

    public _findParamName(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar) {
        this.read = abstractDeserializer;
        this.IconCompatParcelizer = list;
        _findCustomCollectionLikeDeserializer _findcustomcollectionlikedeserializerOnRemoveQueueItem = deserializewithobjectid.onRemoveQueueItem();
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomCollectionLikeDeserializer>> listAudioAttributesCompatParcelizer = withAdditionalKeySerializers.AudioAttributesCompatParcelizer(abstractDeserializer, _findcustomcollectionlikedeserializerOnRemoveQueueItem);
        ArrayList arrayList = new ArrayList(listAudioAttributesCompatParcelizer.size());
        int size = listAudioAttributesCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = arrayList;
            AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomCollectionLikeDeserializer> audioAttributesCompatParcelizer = listAudioAttributesCompatParcelizer.get(i);
            AbstractDeserializer abstractDeserializerRemoteActionCompatParcelizer = withAdditionalKeySerializers.RemoteActionCompatParcelizer(abstractDeserializer, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer());
            _findCustomCollectionLikeDeserializer _findcustomcollectionlikedeserializerIconCompatParcelizer = IconCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer(), _findcustomcollectionlikedeserializerOnRemoveQueueItem);
            String iconCompatParcelizer = abstractDeserializerRemoteActionCompatParcelizer.getIconCompatParcelizer();
            deserializeWithObjectId deserializewithobjectid2 = deserializewithobjectid.read(_findcustomcollectionlikedeserializerIconCompatParcelizer);
            List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> listWrite = abstractDeserializerRemoteActionCompatParcelizer.write();
            if (listWrite == null) {
                listWrite = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            arrayList2.add(new _findCreatorsFromProperties(_findCustomCollectionDeserializer.RemoteActionCompatParcelizer(iconCompatParcelizer, deserializewithobjectid2, listWrite, buffermapproperty, writeVar, _addImplicitConstructorCreators.write(AudioAttributesImplApi26Parcelizer(), audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer())), audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()));
        }
        this.AudioAttributesCompatParcelizer = arrayList;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final AbstractDeserializer getRead() {
        return this.read;
    }

    public final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin._findCustomBeanDeserializer
    public final float RemoteActionCompatParcelizer() {
        return ((Number) this.write.RemoteActionCompatParcelizer()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float read(_findParamName _findparamname) {
        _findCreatorsFromProperties _findcreatorsfromproperties;
        _findCustomBeanDeserializer iconCompatParcelizer;
        List<_findCreatorsFromProperties> list = _findparamname.AudioAttributesCompatParcelizer;
        if (list.isEmpty()) {
            _findcreatorsfromproperties = null;
        } else {
            _findCreatorsFromProperties _findcreatorsfromproperties2 = list.get(0);
            float fRemoteActionCompatParcelizer = _findcreatorsfromproperties2.getIconCompatParcelizer().RemoteActionCompatParcelizer();
            int iWrite = IntermediateLoginResponseBody.write((List) list);
            if (iWrite > 0) {
                int i = 1;
                while (true) {
                    _findCreatorsFromProperties _findcreatorsfromproperties3 = list.get(i);
                    float fRemoteActionCompatParcelizer2 = _findcreatorsfromproperties3.getIconCompatParcelizer().RemoteActionCompatParcelizer();
                    if (Float.compare(fRemoteActionCompatParcelizer, fRemoteActionCompatParcelizer2) < 0) {
                        _findcreatorsfromproperties2 = _findcreatorsfromproperties3;
                        fRemoteActionCompatParcelizer = fRemoteActionCompatParcelizer2;
                    }
                    if (i == iWrite) {
                        break;
                    }
                    i++;
                }
            }
            _findcreatorsfromproperties = _findcreatorsfromproperties2;
        }
        _findCreatorsFromProperties _findcreatorsfromproperties4 = _findcreatorsfromproperties;
        return (_findcreatorsfromproperties4 == null || (iconCompatParcelizer = _findcreatorsfromproperties4.getIconCompatParcelizer()) == null) ? BitmapDescriptorFactory.HUE_RED : iconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin._findCustomBeanDeserializer
    public final float write() {
        return ((Number) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RemoteActionCompatParcelizer(_findParamName _findparamname) {
        _findCreatorsFromProperties _findcreatorsfromproperties;
        _findCustomBeanDeserializer iconCompatParcelizer;
        List<_findCreatorsFromProperties> list = _findparamname.AudioAttributesCompatParcelizer;
        if (list.isEmpty()) {
            _findcreatorsfromproperties = null;
        } else {
            _findCreatorsFromProperties _findcreatorsfromproperties2 = list.get(0);
            float fWrite = _findcreatorsfromproperties2.getIconCompatParcelizer().write();
            int iWrite = IntermediateLoginResponseBody.write((List) list);
            if (iWrite > 0) {
                int i = 1;
                while (true) {
                    _findCreatorsFromProperties _findcreatorsfromproperties3 = list.get(i);
                    float fWrite2 = _findcreatorsfromproperties3.getIconCompatParcelizer().write();
                    if (Float.compare(fWrite, fWrite2) < 0) {
                        _findcreatorsfromproperties2 = _findcreatorsfromproperties3;
                        fWrite = fWrite2;
                    }
                    if (i == iWrite) {
                        break;
                    }
                    i++;
                }
            }
            _findcreatorsfromproperties = _findcreatorsfromproperties2;
        }
        _findCreatorsFromProperties _findcreatorsfromproperties4 = _findcreatorsfromproperties;
        return (_findcreatorsfromproperties4 == null || (iconCompatParcelizer = _findcreatorsfromproperties4.getIconCompatParcelizer()) == null) ? BitmapDescriptorFactory.HUE_RED : iconCompatParcelizer.write();
    }

    public final List<_findCreatorsFromProperties> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin._findCustomBeanDeserializer
    public final boolean AudioAttributesCompatParcelizer() {
        List<_findCreatorsFromProperties> list = this.AudioAttributesCompatParcelizer;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getIconCompatParcelizer().AudioAttributesCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final _findCustomCollectionLikeDeserializer IconCompatParcelizer(_findCustomCollectionLikeDeserializer p0, _findCustomCollectionLikeDeserializer p1) {
        if (withCaseInsensitivity.read(p0.getIconCompatParcelizer(), withCaseInsensitivity.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            return p0.read((509 & 1) != 0 ? p0.write : 0, (509 & 2) != 0 ? p0.IconCompatParcelizer : p1.getIconCompatParcelizer(), (509 & 4) != 0 ? p0.read : 0L, (509 & 8) != 0 ? p0.AudioAttributesCompatParcelizer : null, (509 & 16) != 0 ? p0.RemoteActionCompatParcelizer : null, (509 & 32) != 0 ? p0.AudioAttributesImplApi21Parcelizer : null, (509 & 64) != 0 ? p0.AudioAttributesImplApi26Parcelizer : 0, (509 & 128) != 0 ? p0.MediaBrowserCompatCustomActionResultReceiver : 0, (509 & 256) != 0 ? p0.AudioAttributesImplBaseParcelizer : null);
        }
        return p0;
    }
}
