package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.setCurrentLength;

/* JADX INFO: loaded from: classes3.dex */
public final class CmcdHeadersFactoryObjectType {
    /* JADX INFO: Access modifiers changed from: private */
    public static _handleOddName read(_handleOddName _handleoddname, final long j, final float f, final float f2, final float f3, final float f4) {
        toMagicModuleMetaRepoModel.write(_handleoddname, "");
        return WriterBasedJsonGenerator.read(_handleoddname, new getAnswerMap() { // from class: o.CmcdHeadersFactoryStreamingFormat
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CmcdHeadersFactoryObjectType.read(j, f, f2, f3, f4, (findSetterInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(long j, float f, float f2, float f3, float f4, findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
        float fAudioAttributesCompatParcelizer = findsetterinfo.AudioAttributesCompatParcelizer(f);
        long j2 = -1;
        findSetterInfo.RemoteActionCompatParcelizer$default(findsetterinfo, j, 0L, 0L, TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fAudioAttributesCompatParcelizer)) << 32) | (((long) Float.floatToRawIntBits(fAudioAttributesCompatParcelizer)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))))), new findValueInstantiator(findsetterinfo.AudioAttributesCompatParcelizer(f2), BitmapDescriptorFactory.HUE_RED, 0, 0, setCurrentLength.Companion.write$default(setCurrentLength.INSTANCE, new float[]{findsetterinfo.AudioAttributesCompatParcelizer(f3), findsetterinfo.AudioAttributesCompatParcelizer(f4)}, BitmapDescriptorFactory.HUE_RED, 2, null), 14, null), BitmapDescriptorFactory.HUE_RED, null, 0, 230, null);
        return getShowPopup.INSTANCE;
    }
}
