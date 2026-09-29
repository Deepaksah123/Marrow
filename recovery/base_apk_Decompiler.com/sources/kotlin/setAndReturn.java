package kotlin;

import java.util.List;
import kotlin.BuilderBasedDeserializer1;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "Lo/deserializeAndSet;", "Lo/_createDeserializer;", "p0", "Lo/BuilderBasedDeserializer1;", "p1", "Lo/_unwrapAndDeserialize;", "p2", "Lkotlin/Function1;", "", "p3", "Lo/getSubscriptionExpiresOn;", "AudioAttributesCompatParcelizer", "(Ljava/util/List;Lo/_createDeserializer;Lo/BuilderBasedDeserializer1;Lo/_unwrapAndDeserialize;Lo/getAnswerMap;)Lo/getSubscriptionExpiresOn;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setAndReturn {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<List<deserializeAndSet>, Object> AudioAttributesCompatParcelizer(List<? extends deserializeAndSet> list, _createDeserializer _createdeserializer, BuilderBasedDeserializer1 builderBasedDeserializer1, _unwrapAndDeserialize _unwrapanddeserialize, getAnswerMap<? super _createDeserializer, ? extends Object> getanswermap) {
        Object objInvoke;
        deserializeAndSet deserializeandset;
        Object iconCompatParcelizer;
        deserializeAndSet deserializeandset2;
        int size = list.size();
        List listWrite = null;
        for (int i = 0; i < size; i++) {
            deserializeAndSet deserializeandset3 = list.get(i);
            int iconCompatParcelizer2 = deserializeandset3.getIconCompatParcelizer();
            if (DataFormatReaders.read(iconCompatParcelizer2, DataFormatReaders.INSTANCE.IconCompatParcelizer())) {
                synchronized (builderBasedDeserializer1.IconCompatParcelizer) {
                    BuilderBasedDeserializer1.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new BuilderBasedDeserializer1.RemoteActionCompatParcelizer(deserializeandset3, _unwrapanddeserialize.getRemoteActionCompatParcelizer());
                    BuilderBasedDeserializer1.write writeVar = (BuilderBasedDeserializer1.write) builderBasedDeserializer1.write.get(remoteActionCompatParcelizer);
                    if (writeVar == null) {
                        writeVar = (BuilderBasedDeserializer1.write) builderBasedDeserializer1.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(remoteActionCompatParcelizer);
                    }
                    if (writeVar != null) {
                        objInvoke = writeVar.getIconCompatParcelizer();
                        deserializeandset = deserializeandset3;
                    } else {
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        try {
                            objInvoke = _unwrapanddeserialize.RemoteActionCompatParcelizer(deserializeandset3);
                        } catch (Exception unused) {
                            objInvoke = getanswermap.invoke(_createdeserializer);
                        }
                        deserializeandset = deserializeandset3;
                        BuilderBasedDeserializer1.RemoteActionCompatParcelizer$default(builderBasedDeserializer1, deserializeandset3, _unwrapanddeserialize, objInvoke, false, 8, null);
                    }
                }
                if (objInvoke == null) {
                    objInvoke = getanswermap.invoke(_createdeserializer);
                }
                return setAction.write(listWrite, withNullProvider.read(_createdeserializer.getRemoteActionCompatParcelizer(), objInvoke, deserializeandset, _createdeserializer.getAudioAttributesCompatParcelizer(), _createdeserializer.getIconCompatParcelizer()));
            }
            if (DataFormatReaders.read(iconCompatParcelizer2, DataFormatReaders.INSTANCE.RemoteActionCompatParcelizer())) {
                synchronized (builderBasedDeserializer1.IconCompatParcelizer) {
                    BuilderBasedDeserializer1.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new BuilderBasedDeserializer1.RemoteActionCompatParcelizer(deserializeandset3, _unwrapanddeserialize.getRemoteActionCompatParcelizer());
                    BuilderBasedDeserializer1.write writeVar2 = (BuilderBasedDeserializer1.write) builderBasedDeserializer1.write.get(remoteActionCompatParcelizer2);
                    if (writeVar2 == null) {
                        writeVar2 = (BuilderBasedDeserializer1.write) builderBasedDeserializer1.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(remoteActionCompatParcelizer2);
                    }
                    if (writeVar2 != null) {
                        iconCompatParcelizer = writeVar2.getIconCompatParcelizer();
                        deserializeandset2 = deserializeandset3;
                    } else {
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                        try {
                            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
                            iconCompatParcelizer = C0177getRfBanners.read(_unwrapanddeserialize.RemoteActionCompatParcelizer(deserializeandset3));
                        } catch (Throwable th) {
                            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer4 = C0177getRfBanners.IconCompatParcelizer;
                            iconCompatParcelizer = C0177getRfBanners.read(SdkPayloadData.write(th));
                        }
                        if (C0177getRfBanners.RemoteActionCompatParcelizer(iconCompatParcelizer)) {
                            iconCompatParcelizer = null;
                        }
                        deserializeandset2 = deserializeandset3;
                        BuilderBasedDeserializer1.RemoteActionCompatParcelizer$default(builderBasedDeserializer1, deserializeandset3, _unwrapanddeserialize, iconCompatParcelizer, false, 8, null);
                    }
                }
                if (iconCompatParcelizer != null) {
                    return setAction.write(listWrite, withNullProvider.read(_createdeserializer.getRemoteActionCompatParcelizer(), iconCompatParcelizer, deserializeandset2, _createdeserializer.getAudioAttributesCompatParcelizer(), _createdeserializer.getIconCompatParcelizer()));
                }
            } else {
                if (!DataFormatReaders.read(iconCompatParcelizer2, DataFormatReaders.INSTANCE.write())) {
                    throw new IllegalStateException("Unknown font type ".concat(String.valueOf(deserializeandset3)));
                }
                BuilderBasedDeserializer1.write writeVarIconCompatParcelizer = builderBasedDeserializer1.IconCompatParcelizer(deserializeandset3, _unwrapanddeserialize);
                if (writeVarIconCompatParcelizer != null) {
                    if (!BuilderBasedDeserializer1.write.RemoteActionCompatParcelizer(writeVarIconCompatParcelizer.getIconCompatParcelizer()) && writeVarIconCompatParcelizer.getIconCompatParcelizer() != null) {
                        return setAction.write(listWrite, withNullProvider.read(_createdeserializer.getRemoteActionCompatParcelizer(), writeVarIconCompatParcelizer.getIconCompatParcelizer(), deserializeandset3, _createdeserializer.getAudioAttributesCompatParcelizer(), _createdeserializer.getIconCompatParcelizer()));
                    }
                } else if (listWrite == null) {
                    listWrite = IntermediateLoginResponseBody.write(deserializeandset3);
                } else {
                    listWrite.add(deserializeandset3);
                }
            }
        }
        return setAction.write(listWrite, getanswermap.invoke(_createdeserializer));
    }
}
