package kotlin;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR(\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000e\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b"}, d2 = {"Lo/lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer;", "", "", "p0", "", "p1", "", "p2", "Landroid/location/Location;", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Landroid/location/Location;Ljava/lang/String;)V", "Lo/SimpleBasePlayerExternalSyntheticLambda13;", "write", "(Ljava/lang/String;)Lo/SimpleBasePlayerExternalSyntheticLambda13;", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/util/List;", "", "RemoteActionCompatParcelizer", "()Z", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/String;)Ljava/lang/Object;", "read", "Ljava/lang/String;", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/util/Map;", "()Ljava/util/Map;", "Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "Landroid/location/Location;", "()Landroid/location/Location;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<Map<String, Object>> write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Location read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, String> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, Object> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer(String str, Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list, Location location, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = map;
        this.write = list;
        this.read = location;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesImplApi26Parcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("CT App Version", "Version"), setAction.write("ct_app_version", "Version"), setAction.write("CT Latitude", "Latitude"), setAction.write("ct_latitude", "Latitude"), setAction.write("CT Longitude", "Longitude"), setAction.write("ct_longitude", "Longitude"), setAction.write("CT OS Version", "OS Version"), setAction.write("ct_os_version", "OS Version"), setAction.write("CT SDK Version", "SDK Version"), setAction.write("ct_sdk_version", "SDK Version"), setAction.write("CT Network Carrier", "Carrier"), setAction.write("ct_network_carrier", "Carrier"), setAction.write("CT Network Type", "Radio"), setAction.write("ct_network_type", "Radio"), setAction.write("CT Connected To WiFi", "wifi"), setAction.write("ct_connected_to_wifi", "wifi"), setAction.write("CT Bluetooth Version", "BluetoothVersion"), setAction.write("ct_bluetooth_version", "BluetoothVersion"), setAction.write("CT Bluetooth Enabled", "BluetoothEnabled"), setAction.write("ct_bluetooth_enabled", "BluetoothEnabled"), setAction.write("CT App Name", "appnId"));
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Map<String, Object> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer(String str, Map map, List list, Location location, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, map, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 8) != 0 ? null : location, (i & 16) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Location getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final SimpleBasePlayerExternalSyntheticLambda13 write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new SimpleBasePlayerExternalSyntheticLambda13(RemoteActionCompatParcelizer(p0), null, 2, null);
    }

    public final List<SimpleBasePlayerExternalSyntheticLambda13> IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        List<Map> listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((Iterable) this.write);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesImplApi26Parcelizer, 10));
        for (Map map : listAudioAttributesImplApi26Parcelizer) {
            Object obj = map.get(p0);
            if (obj == null) {
                obj = map.get(RendererCapabilitiesListener.AudioAttributesCompatParcelizer(p0));
            }
            if (obj == null) {
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList2.add(setAction.write(RendererCapabilitiesListener.AudioAttributesCompatParcelizer((String) entry.getKey()), entry.getValue()));
                }
                obj = VideoTimelineResponseBody.read(arrayList2).get(RendererCapabilitiesListener.AudioAttributesCompatParcelizer(p0));
            }
            arrayList.add(new SimpleBasePlayerExternalSyntheticLambda13(obj, null, 2, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((SimpleBasePlayerExternalSyntheticLambda13) obj2).getRemoteActionCompatParcelizer() != null) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) "Charged");
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer != null;
    }

    private Object RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = read(p0);
        if (obj != null) {
            return obj;
        }
        switch (p0.hashCode()) {
            case -543370741:
                if (p0.equals("Campaign id")) {
                    return read("wzrk_id");
                }
                break;
            case 1035561631:
                if (p0.equals("wzrk_pivot")) {
                    return read("Variant");
                }
                break;
            case 1840075742:
                if (p0.equals("wzrk_id")) {
                    return read("Campaign id");
                }
                break;
            case 1901439077:
                if (p0.equals("Variant")) {
                    return read("wzrk_pivot");
                }
                break;
        }
        String str = this.AudioAttributesImplApi26Parcelizer.get(p0);
        if (str != null) {
            return read(str);
        }
        return null;
    }

    private final Object read(String p0) {
        Object obj = this.IconCompatParcelizer.get(p0);
        if (obj == null) {
            obj = this.IconCompatParcelizer.get(RendererCapabilitiesListener.AudioAttributesCompatParcelizer(p0));
        }
        if (obj != null) {
            return obj;
        }
        Map<String, Object> map = this.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            arrayList.add(setAction.write(RendererCapabilitiesListener.AudioAttributesCompatParcelizer(entry.getKey()), entry.getValue()));
        }
        return VideoTimelineResponseBody.read(arrayList).get(RendererCapabilitiesListener.AudioAttributesCompatParcelizer(p0));
    }
}
