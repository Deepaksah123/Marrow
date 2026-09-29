package kotlin;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class constructUsingToString extends _isIntType {
    @Override // kotlin._isIntType
    public final androidx.media3.common.Metadata AudioAttributesCompatParcelizer(_enumDefault _enumdefault, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return IconCompatParcelizer(new AsExternalTypeSerializer(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static androidx.media3.common.Metadata IconCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) {
        asExternalTypeSerializer.write(12);
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(12);
        int iRemoteActionCompatParcelizer = asExternalTypeSerializer.RemoteActionCompatParcelizer();
        asExternalTypeSerializer.write(44);
        asExternalTypeSerializer.MediaBrowserCompatCustomActionResultReceiver(asExternalTypeSerializer.IconCompatParcelizer(12));
        asExternalTypeSerializer.write(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strAudioAttributesCompatParcelizer = null;
            if (asExternalTypeSerializer.RemoteActionCompatParcelizer() >= (iRemoteActionCompatParcelizer + iIconCompatParcelizer) - 4) {
                break;
            }
            asExternalTypeSerializer.write(48);
            int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(8);
            asExternalTypeSerializer.write(4);
            int iRemoteActionCompatParcelizer2 = asExternalTypeSerializer.RemoteActionCompatParcelizer() + asExternalTypeSerializer.IconCompatParcelizer(12);
            String strAudioAttributesCompatParcelizer2 = null;
            while (asExternalTypeSerializer.RemoteActionCompatParcelizer() < iRemoteActionCompatParcelizer2) {
                int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(8);
                int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(8);
                int iRemoteActionCompatParcelizer3 = asExternalTypeSerializer.RemoteActionCompatParcelizer() + iIconCompatParcelizer4;
                if (iIconCompatParcelizer3 == 2) {
                    int iIconCompatParcelizer5 = asExternalTypeSerializer.IconCompatParcelizer(16);
                    asExternalTypeSerializer.write(8);
                    if (iIconCompatParcelizer5 == 3) {
                        while (asExternalTypeSerializer.RemoteActionCompatParcelizer() < iRemoteActionCompatParcelizer3) {
                            strAudioAttributesCompatParcelizer = asExternalTypeSerializer.AudioAttributesCompatParcelizer(asExternalTypeSerializer.IconCompatParcelizer(8), parseMdtaFromMeta.RemoteActionCompatParcelizer);
                            int iIconCompatParcelizer6 = asExternalTypeSerializer.IconCompatParcelizer(8);
                            for (int i = 0; i < iIconCompatParcelizer6; i++) {
                                asExternalTypeSerializer.MediaBrowserCompatCustomActionResultReceiver(asExternalTypeSerializer.IconCompatParcelizer(8));
                            }
                        }
                    }
                } else if (iIconCompatParcelizer3 == 21) {
                    strAudioAttributesCompatParcelizer2 = asExternalTypeSerializer.AudioAttributesCompatParcelizer(iIconCompatParcelizer4, parseMdtaFromMeta.RemoteActionCompatParcelizer);
                }
                asExternalTypeSerializer.read(iRemoteActionCompatParcelizer3 << 3);
            }
            asExternalTypeSerializer.read(iRemoteActionCompatParcelizer2 << 3);
            if (strAudioAttributesCompatParcelizer != null && strAudioAttributesCompatParcelizer2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(strAudioAttributesCompatParcelizer);
                sb.append(strAudioAttributesCompatParcelizer2);
                arrayList.add(new AppInfoTable(iIconCompatParcelizer2, sb.toString()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(arrayList);
    }
}
