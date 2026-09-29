package kotlin;

import java.util.List;
import kotlin.RegexDeserializer;

/* JADX INFO: loaded from: classes2.dex */
final class deserializexfHcF5w {
    final read read;

    interface read {
        RegexDeserializer.IconCompatParcelizer AudioAttributesCompatParcelizer(int i, int i2, int i3, Object obj);

        void AudioAttributesCompatParcelizer(RegexDeserializer.IconCompatParcelizer iconCompatParcelizer);
    }

    deserializexfHcF5w(read readVar) {
        this.read = readVar;
    }

    final void AudioAttributesCompatParcelizer(List<RegexDeserializer.IconCompatParcelizer> list) {
        while (true) {
            int i = read(list);
            if (i == -1) {
                return;
            } else {
                RemoteActionCompatParcelizer(list, i, i + 1);
            }
        }
    }

    private void RemoteActionCompatParcelizer(List<RegexDeserializer.IconCompatParcelizer> list, int i, int i2) {
        RegexDeserializer.IconCompatParcelizer iconCompatParcelizer = list.get(i);
        RegexDeserializer.IconCompatParcelizer iconCompatParcelizer2 = list.get(i2);
        int i3 = iconCompatParcelizer2.read;
        if (i3 == 1) {
            IconCompatParcelizer(list, i, iconCompatParcelizer, i2, iconCompatParcelizer2);
        } else if (i3 == 2) {
            read(list, i, iconCompatParcelizer, i2, iconCompatParcelizer2);
        } else {
            if (i3 != 4) {
                return;
            }
            AudioAttributesCompatParcelizer(list, i, iconCompatParcelizer, i2, iconCompatParcelizer2);
        }
    }

    private void read(List<RegexDeserializer.IconCompatParcelizer> list, int i, RegexDeserializer.IconCompatParcelizer iconCompatParcelizer, int i2, RegexDeserializer.IconCompatParcelizer iconCompatParcelizer2) {
        boolean z;
        boolean z2 = false;
        if (iconCompatParcelizer.RemoteActionCompatParcelizer < iconCompatParcelizer.write) {
            if (iconCompatParcelizer2.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && iconCompatParcelizer2.write == iconCompatParcelizer.write - iconCompatParcelizer.RemoteActionCompatParcelizer) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (iconCompatParcelizer2.RemoteActionCompatParcelizer == iconCompatParcelizer.write + 1 && iconCompatParcelizer2.write == iconCompatParcelizer.RemoteActionCompatParcelizer - iconCompatParcelizer.write) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        if (iconCompatParcelizer.write < iconCompatParcelizer2.RemoteActionCompatParcelizer) {
            iconCompatParcelizer2.RemoteActionCompatParcelizer--;
        } else if (iconCompatParcelizer.write < iconCompatParcelizer2.RemoteActionCompatParcelizer + iconCompatParcelizer2.write) {
            iconCompatParcelizer2.write--;
            iconCompatParcelizer.read = 2;
            iconCompatParcelizer.write = 1;
            if (iconCompatParcelizer2.write == 0) {
                list.remove(i2);
                this.read.AudioAttributesCompatParcelizer(iconCompatParcelizer2);
                return;
            }
            return;
        }
        RegexDeserializer.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = null;
        if (iconCompatParcelizer.RemoteActionCompatParcelizer <= iconCompatParcelizer2.RemoteActionCompatParcelizer) {
            iconCompatParcelizer2.RemoteActionCompatParcelizer++;
        } else if (iconCompatParcelizer.RemoteActionCompatParcelizer < iconCompatParcelizer2.RemoteActionCompatParcelizer + iconCompatParcelizer2.write) {
            iconCompatParcelizerAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(2, iconCompatParcelizer.RemoteActionCompatParcelizer + 1, (iconCompatParcelizer2.RemoteActionCompatParcelizer + iconCompatParcelizer2.write) - iconCompatParcelizer.RemoteActionCompatParcelizer, null);
            iconCompatParcelizer2.write = iconCompatParcelizer.RemoteActionCompatParcelizer - iconCompatParcelizer2.RemoteActionCompatParcelizer;
        }
        if (z2) {
            list.set(i, iconCompatParcelizer2);
            list.remove(i2);
            this.read.AudioAttributesCompatParcelizer(iconCompatParcelizer);
            return;
        }
        if (z) {
            if (iconCompatParcelizerAudioAttributesCompatParcelizer != null) {
                if (iconCompatParcelizer.RemoteActionCompatParcelizer > iconCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
                    iconCompatParcelizer.RemoteActionCompatParcelizer -= iconCompatParcelizerAudioAttributesCompatParcelizer.write;
                }
                if (iconCompatParcelizer.write > iconCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
                    iconCompatParcelizer.write -= iconCompatParcelizerAudioAttributesCompatParcelizer.write;
                }
            }
            if (iconCompatParcelizer.RemoteActionCompatParcelizer > iconCompatParcelizer2.RemoteActionCompatParcelizer) {
                iconCompatParcelizer.RemoteActionCompatParcelizer -= iconCompatParcelizer2.write;
            }
            if (iconCompatParcelizer.write > iconCompatParcelizer2.RemoteActionCompatParcelizer) {
                iconCompatParcelizer.write -= iconCompatParcelizer2.write;
            }
        } else {
            if (iconCompatParcelizerAudioAttributesCompatParcelizer != null) {
                if (iconCompatParcelizer.RemoteActionCompatParcelizer >= iconCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
                    iconCompatParcelizer.RemoteActionCompatParcelizer -= iconCompatParcelizerAudioAttributesCompatParcelizer.write;
                }
                if (iconCompatParcelizer.write >= iconCompatParcelizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) {
                    iconCompatParcelizer.write -= iconCompatParcelizerAudioAttributesCompatParcelizer.write;
                }
            }
            if (iconCompatParcelizer.RemoteActionCompatParcelizer >= iconCompatParcelizer2.RemoteActionCompatParcelizer) {
                iconCompatParcelizer.RemoteActionCompatParcelizer -= iconCompatParcelizer2.write;
            }
            if (iconCompatParcelizer.write >= iconCompatParcelizer2.RemoteActionCompatParcelizer) {
                iconCompatParcelizer.write -= iconCompatParcelizer2.write;
            }
        }
        list.set(i, iconCompatParcelizer2);
        if (iconCompatParcelizer.RemoteActionCompatParcelizer != iconCompatParcelizer.write) {
            list.set(i2, iconCompatParcelizer);
        } else {
            list.remove(i2);
        }
        if (iconCompatParcelizerAudioAttributesCompatParcelizer != null) {
            list.add(i, iconCompatParcelizerAudioAttributesCompatParcelizer);
        }
    }

    private static void IconCompatParcelizer(List<RegexDeserializer.IconCompatParcelizer> list, int i, RegexDeserializer.IconCompatParcelizer iconCompatParcelizer, int i2, RegexDeserializer.IconCompatParcelizer iconCompatParcelizer2) {
        int i3 = iconCompatParcelizer.write < iconCompatParcelizer2.RemoteActionCompatParcelizer ? -1 : 0;
        if (iconCompatParcelizer.RemoteActionCompatParcelizer < iconCompatParcelizer2.RemoteActionCompatParcelizer) {
            i3++;
        }
        if (iconCompatParcelizer2.RemoteActionCompatParcelizer <= iconCompatParcelizer.RemoteActionCompatParcelizer) {
            iconCompatParcelizer.RemoteActionCompatParcelizer += iconCompatParcelizer2.write;
        }
        if (iconCompatParcelizer2.RemoteActionCompatParcelizer <= iconCompatParcelizer.write) {
            iconCompatParcelizer.write += iconCompatParcelizer2.write;
        }
        iconCompatParcelizer2.RemoteActionCompatParcelizer += i3;
        list.set(i, iconCompatParcelizer2);
        list.set(i2, iconCompatParcelizer);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesCompatParcelizer(java.util.List<o.RegexDeserializer.IconCompatParcelizer> r8, int r9, o.RegexDeserializer.IconCompatParcelizer r10, int r11, o.RegexDeserializer.IconCompatParcelizer r12) {
        /*
            r7 = this;
            int r0 = r10.write
            int r1 = r12.RemoteActionCompatParcelizer
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Lf
            int r0 = r12.RemoteActionCompatParcelizer
            int r0 = r0 - r3
            r12.RemoteActionCompatParcelizer = r0
            goto L28
        Lf:
            int r0 = r10.write
            int r1 = r12.RemoteActionCompatParcelizer
            int r5 = r12.write
            int r1 = r1 + r5
            if (r0 >= r1) goto L28
            int r0 = r12.write
            int r0 = r0 - r3
            r12.write = r0
            o.deserializexfHcF5w$read r0 = r7.read
            int r1 = r10.RemoteActionCompatParcelizer
            java.lang.Object r5 = r12.AudioAttributesCompatParcelizer
            o.RegexDeserializer$IconCompatParcelizer r0 = r0.AudioAttributesCompatParcelizer(r2, r1, r3, r5)
            goto L29
        L28:
            r0 = r4
        L29:
            int r1 = r10.RemoteActionCompatParcelizer
            int r5 = r12.RemoteActionCompatParcelizer
            if (r1 > r5) goto L35
            int r1 = r12.RemoteActionCompatParcelizer
            int r1 = r1 + r3
            r12.RemoteActionCompatParcelizer = r1
            goto L56
        L35:
            int r1 = r10.RemoteActionCompatParcelizer
            int r5 = r12.RemoteActionCompatParcelizer
            int r6 = r12.write
            int r5 = r5 + r6
            if (r1 >= r5) goto L56
            int r1 = r12.RemoteActionCompatParcelizer
            int r4 = r12.write
            int r1 = r1 + r4
            int r4 = r10.RemoteActionCompatParcelizer
            int r1 = r1 - r4
            o.deserializexfHcF5w$read r4 = r7.read
            int r5 = r10.RemoteActionCompatParcelizer
            int r5 = r5 + r3
            java.lang.Object r3 = r12.AudioAttributesCompatParcelizer
            o.RegexDeserializer$IconCompatParcelizer r4 = r4.AudioAttributesCompatParcelizer(r2, r5, r1, r3)
            int r2 = r12.write
            int r2 = r2 - r1
            r12.write = r2
        L56:
            r8.set(r11, r10)
            int r10 = r12.write
            if (r10 <= 0) goto L61
            r8.set(r9, r12)
            goto L69
        L61:
            r8.remove(r9)
            o.deserializexfHcF5w$read r7 = r7.read
            r7.AudioAttributesCompatParcelizer(r12)
        L69:
            if (r0 == 0) goto L6e
            r8.add(r9, r0)
        L6e:
            if (r4 == 0) goto L73
            r8.add(r9, r4)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.deserializexfHcF5w.AudioAttributesCompatParcelizer(java.util.List, int, o.RegexDeserializer$IconCompatParcelizer, int, o.RegexDeserializer$IconCompatParcelizer):void");
    }

    private static int read(List<RegexDeserializer.IconCompatParcelizer> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).read != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }
}
