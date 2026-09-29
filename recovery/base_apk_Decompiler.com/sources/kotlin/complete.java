package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001d\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b&\u0010)R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b*\u0010\u0016"}, d2 = {"Lo/complete;", "", "", "p0", "", "p1", "Lo/appendReferring;", "p2", "Lo/PropertyBasedCreatorCaseInsensitiveMap;", "p3", "", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;ILo/appendReferring;Lo/PropertyBasedCreatorCaseInsensitiveMap;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)V", "", "AudioAttributesImplApi21Parcelizer", "()Z", "write", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer", "I", "MediaBrowserCompatCustomActionResultReceiver", "Lo/appendReferring;", "()Lo/appendReferring;", "Lo/PropertyBasedCreatorCaseInsensitiveMap;", "MediaBrowserCompatItemReceiver", "()Lo/PropertyBasedCreatorCaseInsensitiveMap;", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class complete {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<complete> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final PropertyBasedCreatorCaseInsensitiveMap AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final appendReferring write;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Object AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String read;

    public complete(String str, int i, appendReferring appendreferring, PropertyBasedCreatorCaseInsensitiveMap propertyBasedCreatorCaseInsensitiveMap, List<complete> list, Object obj, String str2) {
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
        this.write = appendreferring;
        this.AudioAttributesCompatParcelizer = propertyBasedCreatorCaseInsensitiveMap;
        this.IconCompatParcelizer = list;
        this.AudioAttributesImplApi21Parcelizer = obj;
        this.MediaBrowserCompatCustomActionResultReceiver = str2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final appendReferring getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final PropertyBasedCreatorCaseInsensitiveMap getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<complete> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Object getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return (this.write.getIconCompatParcelizer() == 0 || this.write.getAudioAttributesCompatParcelizer() == 0) ? false : true;
    }

    public final List<complete> write() {
        List<complete> list = this.IconCompatParcelizer;
        List<complete> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) ((complete) it.next()).write());
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) list2, (Iterable) arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.String r2 = r4.read
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r2 = r4.RemoteActionCompatParcelizer
            r0.append(r2)
            java.lang.String r2 = ",\n            |bounds=(top="
            r0.append(r2)
            o.appendReferring r2 = r4.write
            int r2 = r2.getWrite()
            r0.append(r2)
            java.lang.String r2 = ", left="
            r0.append(r2)
            o.appendReferring r2 = r4.write
            int r2 = r2.getRead()
            r0.append(r2)
            java.lang.String r2 = ",\n            |location="
            r0.append(r2)
            o.PropertyBasedCreatorCaseInsensitiveMap r2 = r4.AudioAttributesCompatParcelizer
            if (r2 == 0) goto L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            int r1 = r2.getRemoteActionCompatParcelizer()
            r3.append(r1)
            r1 = 76
            r3.append(r1)
            int r1 = r2.getIconCompatParcelizer()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r1 != 0) goto L5b
        L59:
            java.lang.String r1 = "<none>"
        L5b:
            r0.append(r1)
            java.lang.String r1 = "\n            |bottom="
            r0.append(r1)
            o.appendReferring r1 = r4.write
            int r1 = r1.getIconCompatParcelizer()
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            o.appendReferring r1 = r4.write
            int r1 = r1.getAudioAttributesCompatParcelizer()
            r0.append(r1)
            java.lang.String r1 = "),\n            |childrenCount="
            r0.append(r1)
            java.util.List<o.complete> r4 = r4.IconCompatParcelizer
            int r4 = r4.size()
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = kotlin.TestGroupLSModel.IconCompatParcelizer(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.complete.toString():java.lang.String");
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof complete)) {
            return false;
        }
        complete completeVar = (complete) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) completeVar.read) && this.RemoteActionCompatParcelizer == completeVar.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, completeVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, completeVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, completeVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, completeVar.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) completeVar.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode3 = this.write.hashCode();
        PropertyBasedCreatorCaseInsensitiveMap propertyBasedCreatorCaseInsensitiveMap = this.AudioAttributesCompatParcelizer;
        int iHashCode4 = propertyBasedCreatorCaseInsensitiveMap == null ? 0 : propertyBasedCreatorCaseInsensitiveMap.hashCode();
        int iHashCode5 = this.IconCompatParcelizer.hashCode();
        Object obj = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode6 = obj == null ? 0 : obj.hashCode();
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str != null ? str.hashCode() : 0);
    }
}
