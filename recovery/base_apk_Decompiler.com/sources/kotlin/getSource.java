package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u000e\u001a\u00020\u0014*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0015J3\u0010\u0006\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0017J'\u0010\u0012\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0019H&¢\u0006\u0004\b\u0010\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e"}, d2 = {"Lo/getSource;", "", "<init>", "()V", "", "Lo/JsonGeneratorImpl;", "RemoteActionCompatParcelizer", "()Ljava/util/List;", "", "p0", "Lo/filterFinishObject;", "p1", "p2", "", "IconCompatParcelizer", "(ILo/filterFinishObject;Ljava/lang/Object;)V", "read", "(ILo/filterFinishObject;Ljava/lang/Object;)Lo/JsonGeneratorImpl;", "write", "(Ljava/lang/Object;)Lo/filterFinishObject;", "", "(Lo/filterFinishObject;)Z", "p3", "(ILjava/lang/Object;Lo/filterFinishObject;Ljava/lang/Object;)V", "(ILo/filterFinishObject;Ljava/lang/Object;)Z", "Lo/_parseSlowFloat;", "(Lo/_parseSlowFloat;)Lo/filterFinishObject;", "AudioAttributesCompatParcelizer", "(Lo/_parseSlowFloat;)I", "", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getSource {
    private final List<JsonGeneratorImpl> read = new ArrayList();

    public abstract int AudioAttributesCompatParcelizer(_parseSlowFloat p0);

    public abstract filterFinishObject read(_parseSlowFloat p0);

    public final List<JsonGeneratorImpl> RemoteActionCompatParcelizer() {
        return this.read;
    }

    private final void IconCompatParcelizer(int p0, filterFinishObject p1, Object p2) {
        JsonGeneratorImpl jsonGeneratorImpl = read(p0, p1, p2);
        if (jsonGeneratorImpl != null) {
            this.read.add(jsonGeneratorImpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.JsonGeneratorImpl read(int r12, kotlin.filterFinishObject r13, java.lang.Object r14) {
        /*
            r11 = this;
            r0 = 0
            if (r13 == 0) goto Le
            java.lang.String r1 = r13.getMediaBrowserCompatCustomActionResultReceiver()
            if (r1 == 0) goto Le
            o._skipCComment r1 = kotlin._skipAfterComma2.write(r1)
            goto Lf
        Le:
            r1 = r0
        Lf:
            if (r1 == 0) goto La1
            if (r14 != 0) goto L19
            o.JsonGeneratorImpl r11 = new o.JsonGeneratorImpl
            r11.<init>(r12, r1, r0)
            return r11
        L19:
            java.util.ArrayList r13 = r13.RemoteActionCompatParcelizer()
            r2 = 0
            if (r13 == 0) goto L97
            r3 = r13
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r2
            r5 = r4
        L29:
            if (r4 >= r3) goto L96
            java.lang.Object r6 = r13.get(r4)
            boolean r7 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r6, r14)
            if (r7 != 0) goto L96
            o.filterFinishObject r7 = r11.write(r6)
            r8 = 1
            if (r7 == 0) goto L89
            int r9 = r7.getRemoteActionCompatParcelizer()
            r10 = -127(0xffffffffffffff81, float:NaN)
            if (r9 == r10) goto L56
            int r9 = r7.getRemoteActionCompatParcelizer()
            if (r9 != 0) goto L89
            boolean r9 = r6 instanceof kotlin._parseSlowFloat
            if (r9 == 0) goto L89
            o._parseSlowFloat r6 = (kotlin._parseSlowFloat) r6
            int r6 = r11.AudioAttributesCompatParcelizer(r6)
            if (r6 != r10) goto L89
        L56:
            if (r7 == 0) goto L5d
            java.lang.String r6 = r7.getMediaBrowserCompatCustomActionResultReceiver()
            goto L5e
        L5d:
            r6 = r0
        L5e:
            if (r6 != 0) goto L89
            if (r7 == 0) goto L93
            java.util.ArrayList r6 = r7.RemoteActionCompatParcelizer()
            if (r6 == 0) goto L93
            java.util.List r6 = (java.util.List) r6
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r9 = r2
        L72:
            if (r9 >= r7) goto L93
            java.lang.Object r10 = r6.get(r9)
            o.filterFinishObject r10 = r11.write(r10)
            if (r10 == 0) goto L86
            boolean r10 = r11.IconCompatParcelizer(r10)
            if (r10 != r8) goto L86
            int r5 = r5 + 1
        L86:
            int r9 = r9 + 1
            goto L72
        L89:
            if (r7 == 0) goto L93
            boolean r6 = r11.IconCompatParcelizer(r7)
            if (r6 != r8) goto L93
            int r5 = r5 + 1
        L93:
            int r4 = r4 + 1
            goto L29
        L96:
            r2 = r5
        L97:
            o.JsonGeneratorImpl r11 = new o.JsonGeneratorImpl
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r11.<init>(r12, r1, r13)
            return r11
        La1:
            o.JsonGeneratorImpl r11 = new o.JsonGeneratorImpl
            r11.<init>(r12, r0, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSource.read(int, o.filterFinishObject, java.lang.Object):o.JsonGeneratorImpl");
    }

    private final filterFinishObject write(Object p0) {
        if (p0 instanceof _parseSlowFloat) {
            return read((_parseSlowFloat) p0);
        }
        if (p0 instanceof filterFinishObject) {
            return (filterFinishObject) p0;
        }
        throw new IllegalStateException("Unexpected child source info ".concat(String.valueOf(p0)).toString());
    }

    private final boolean IconCompatParcelizer(filterFinishObject filterfinishobject) {
        String mediaBrowserCompatCustomActionResultReceiver = filterfinishobject.getMediaBrowserCompatCustomActionResultReceiver();
        return mediaBrowserCompatCustomActionResultReceiver != null && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(mediaBrowserCompatCustomActionResultReceiver, "C");
    }

    public final void RemoteActionCompatParcelizer(int p0, Object p1, filterFinishObject p2, Object p3) {
        if (p2 != null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer())) {
            if (p3 == null || p2 == null) {
                IconCompatParcelizer(p0, p2, null);
            } else {
                if (write(p0, p2, p3) || p2.getAudioAttributesCompatParcelizer()) {
                    return;
                }
                IconCompatParcelizer(p0, p2, p3);
            }
        }
    }

    private final boolean write(int p0, filterFinishObject p1, Object p2) {
        ArrayList<Object> arrayListRemoteActionCompatParcelizer = p1.RemoteActionCompatParcelizer();
        boolean z = false;
        if (arrayListRemoteActionCompatParcelizer == null) {
            if (!p1.getAudioAttributesCompatParcelizer()) {
                IconCompatParcelizer(p0, p1, null);
                return true;
            }
            int iconCompatParcelizer = p1.getIconCompatParcelizer();
            int read = p1.getRead();
            boolean z2 = p2 instanceof Integer;
            if (z2) {
                Number number = (Number) p2;
                int iIntValue = number.intValue();
                if ((iconCompatParcelizer <= iIntValue && iIntValue < read) || (iconCompatParcelizer == read && z2 && iconCompatParcelizer == number.intValue())) {
                    z = true;
                }
                if (z) {
                    IconCompatParcelizer(p1.getRemoteActionCompatParcelizer(), p1, null);
                    return true;
                }
            }
            return z;
        }
        ArrayList<Object> arrayList = arrayListRemoteActionCompatParcelizer;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof _parseSlowFloat) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, p2)) {
                    IconCompatParcelizer(p1.getRemoteActionCompatParcelizer(), p1, obj);
                    return true;
                }
            } else if (obj instanceof filterFinishObject) {
                if (write(p0, (filterFinishObject) obj, p2)) {
                    IconCompatParcelizer(p1.getRemoteActionCompatParcelizer(), p1, obj);
                    return true;
                }
            } else {
                throw new IllegalStateException("Unexpected child source info ".concat(String.valueOf(obj)).toString());
            }
        }
        return false;
    }
}
