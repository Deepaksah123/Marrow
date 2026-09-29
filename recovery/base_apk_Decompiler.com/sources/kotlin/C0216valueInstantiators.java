package kotlin;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.valueInstantiators, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\n\u001a\u00020\u0014\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u0015J$\u0010\u0010\u001a\u00020\u0016\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0017J\u000f\u0010\u000e\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u000e\u0010\u0018J\u0017\u0010\u0010\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R,\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050$8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R*\u0010%\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010)R\"\u0010\u001a\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010+R \u0010\u000e\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010,8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010-R\"\u0010\u0010\u001a\u00020\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u0018\"\u0004\b\u0010\u00100R\"\u00101\u001a\u00020\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010.\u001a\u0004\b\n\u0010\u0018\"\u0004\b\u001a\u00100"}, d2 = {"Lo/valueInstantiators;", "Lo/getConfigOverride;", "", "", "Lo/MapperConfig;", "", "<init>", "()V", "T", "p0", "write", "(Lo/MapperConfig;)Ljava/lang/Object;", "Lkotlin/Function0;", "p1", "IconCompatParcelizer", "(Lo/MapperConfig;Lo/getCreatedOnDateMs;)Ljava/lang/Object;", "read", "", "iterator", "()Ljava/util/Iterator;", "", "(Lo/MapperConfig;Ljava/lang/Object;)V", "", "(Lo/MapperConfig;)Z", "()Z", "(Lo/valueInstantiators;)V", "AudioAttributesCompatParcelizer", "()Lo/valueInstantiators;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/setKeyListener;", "RemoteActionCompatParcelizer", "Lo/setKeyListener;", "()Lo/setKeyListener;", "", "Ljava/util/Map;", "Lo/setEmojiCompatEnabled;", "Lo/setEmojiCompatEnabled;", "Lo/setButtonDrawable;", "()Lo/setButtonDrawable;", "Z", "MediaBrowserCompatItemReceiver", "(Z)V", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0216valueInstantiators implements getConfigOverride, Iterable<Map.Entry<? extends MapperConfig<?>, ? extends Object>>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Map<MapperConfig<?>, ? extends Object> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setKeyListener<MapperConfig<?>, Object> write = setAutoSizeTextTypeUniformWithPresetSizes.read();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setEmojiCompatEnabled<MapperConfig<?>> AudioAttributesCompatParcelizer;

    public final setKeyListener<MapperConfig<?>, Object> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final setButtonDrawable<MapperConfig<?>> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final <T> T write(MapperConfig<T> p0) {
        T t = (T) this.write.AudioAttributesImplApi26Parcelizer(p0);
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("Key not present: ");
        sb.append(p0);
        sb.append(" - consider getOrElse or getOrNull");
        throw new IllegalStateException(sb.toString());
    }

    public final <T> T IconCompatParcelizer(MapperConfig<T> p0, getCreatedOnDateMs<? extends T> p1) {
        T t = (T) this.write.AudioAttributesImplApi26Parcelizer(p0);
        return t == null ? p1.invoke() : t;
    }

    public final <T> T read(MapperConfig<T> p0, getCreatedOnDateMs<? extends T> p1) {
        T t = (T) this.write.AudioAttributesImplApi26Parcelizer(p0);
        return t == null ? p1.invoke() : t;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends MapperConfig<?>, ? extends Object>> iterator() {
        Map<MapperConfig<?>, ? extends Object> mapIconCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (mapIconCompatParcelizer == null) {
            mapIconCompatParcelizer = this.write.IconCompatParcelizer();
            this.RemoteActionCompatParcelizer = mapIconCompatParcelizer;
        }
        return mapIconCompatParcelizer.entrySet().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getConfigOverride
    public final <T> void write(MapperConfig<T> p0, T p1) {
        if ((p1 instanceof defaultFeatures) && read(p0)) {
            Object objAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer(p0);
            toMagicModuleMetaRepoModel.read(objAudioAttributesImplApi26Parcelizer, "");
            defaultFeatures defaultfeatures = (defaultFeatures) objAudioAttributesImplApi26Parcelizer;
            setKeyListener<MapperConfig<?>, Object> setkeylistener = this.write;
            defaultFeatures defaultfeatures2 = (defaultFeatures) p1;
            String remoteActionCompatParcelizer = defaultfeatures2.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer = defaultfeatures.getRemoteActionCompatParcelizer();
            }
            setRenewGrpId setrenewgrpidRemoteActionCompatParcelizer = defaultfeatures2.RemoteActionCompatParcelizer();
            if (setrenewgrpidRemoteActionCompatParcelizer == null) {
                setrenewgrpidRemoteActionCompatParcelizer = defaultfeatures.RemoteActionCompatParcelizer();
            }
            setkeylistener.RemoteActionCompatParcelizer(p0, new defaultFeatures(remoteActionCompatParcelizer, setrenewgrpidRemoteActionCompatParcelizer));
        } else {
            this.write.RemoteActionCompatParcelizer(p0, p1);
        }
        if (p0.getRemoteActionCompatParcelizer() != null) {
            if (this.AudioAttributesCompatParcelizer == null) {
                this.AudioAttributesCompatParcelizer = setSupportAllCaps.AudioAttributesCompatParcelizer();
            }
            setEmojiCompatEnabled<MapperConfig<?>> setemojicompatenabled = this.AudioAttributesCompatParcelizer;
            if (setemojicompatenabled != null) {
                setemojicompatenabled.write(p0);
            }
        }
    }

    public final <T> boolean read(MapperConfig<T> p0) {
        return this.write.RemoteActionCompatParcelizer(p0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean IconCompatParcelizer() {
        /*
            r14 = this;
            o.setKeyListener<o.MapperConfig<?>, java.lang.Object> r14 = r14.write
            o.AppCompatButton r14 = (kotlin.AppCompatButton) r14
            java.lang.Object[] r0 = r14.IconCompatParcelizer
            java.lang.Object[] r1 = r14.MediaBrowserCompatItemReceiver
            long[] r14 = r14.RemoteActionCompatParcelizer
            int r2 = r14.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L52
            r4 = r3
        L11:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2b:
            if (r9 >= r7) goto L4b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L47
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r1[r10]
            o.MapperConfig r11 = (kotlin.MapperConfig) r11
            boolean r10 = r11.getRead()
            if (r10 == 0) goto L47
            r14 = 1
            return r14
        L47:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2b
        L4b:
            if (r7 != r8) goto L52
        L4d:
            if (r4 == r2) goto L52
            int r4 = r4 + 1
            goto L11
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C0216valueInstantiators.IconCompatParcelizer():boolean");
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final void read(boolean z) {
        this.read = z;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void read(C0216valueInstantiators p0) {
        setKeyListener<MapperConfig<?>, Object> setkeylistener = p0.write;
        Object[] objArr = setkeylistener.IconCompatParcelizer;
        Object[] objArr2 = setkeylistener.MediaBrowserCompatItemReceiver;
        long[] jArr = setkeylistener.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        MapperConfig<?> mapperConfig = (MapperConfig) obj;
                        Object objAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer(mapperConfig);
                        toMagicModuleMetaRepoModel.read(mapperConfig, "");
                        Object objAudioAttributesCompatParcelizer = mapperConfig.AudioAttributesCompatParcelizer(objAudioAttributesImplApi26Parcelizer, obj2);
                        if (objAudioAttributesCompatParcelizer != null) {
                            this.write.RemoteActionCompatParcelizer(mapperConfig, objAudioAttributesCompatParcelizer);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(C0216valueInstantiators p0) {
        if (p0.read) {
            this.read = true;
        }
        if (p0.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer = true;
        }
        setKeyListener<MapperConfig<?>, Object> setkeylistener = p0.write;
        Object[] objArr = setkeylistener.IconCompatParcelizer;
        Object[] objArr2 = setkeylistener.MediaBrowserCompatItemReceiver;
        long[] jArr = setkeylistener.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        MapperConfig<?> mapperConfig = (MapperConfig) obj;
                        if (!this.write.read(mapperConfig)) {
                            this.write.RemoteActionCompatParcelizer(mapperConfig, obj2);
                        } else if (obj2 instanceof defaultFeatures) {
                            Object objAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer(mapperConfig);
                            toMagicModuleMetaRepoModel.read(objAudioAttributesImplApi26Parcelizer, "");
                            defaultFeatures defaultfeatures = (defaultFeatures) objAudioAttributesImplApi26Parcelizer;
                            setKeyListener<MapperConfig<?>, Object> setkeylistener2 = this.write;
                            String remoteActionCompatParcelizer = defaultfeatures.getRemoteActionCompatParcelizer();
                            if (remoteActionCompatParcelizer == null) {
                                remoteActionCompatParcelizer = ((defaultFeatures) obj2).getRemoteActionCompatParcelizer();
                            }
                            String str = remoteActionCompatParcelizer;
                            setRenewGrpId setrenewgrpidRemoteActionCompatParcelizer = defaultfeatures.RemoteActionCompatParcelizer();
                            if (setrenewgrpidRemoteActionCompatParcelizer == null) {
                                setrenewgrpidRemoteActionCompatParcelizer = ((defaultFeatures) obj2).RemoteActionCompatParcelizer();
                            }
                            setkeylistener2.RemoteActionCompatParcelizer(mapperConfig, new defaultFeatures(str, setrenewgrpidRemoteActionCompatParcelizer));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final C0216valueInstantiators AudioAttributesCompatParcelizer() {
        C0216valueInstantiators c0216valueInstantiators = new C0216valueInstantiators();
        c0216valueInstantiators.read = this.read;
        c0216valueInstantiators.AudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi21Parcelizer;
        c0216valueInstantiators.write.AudioAttributesCompatParcelizer((AppCompatButton<MapperConfig<?>, Object>) this.write);
        return c0216valueInstantiators;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof C0216valueInstantiators)) {
            return false;
        }
        C0216valueInstantiators c0216valueInstantiators = (C0216valueInstantiators) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, c0216valueInstantiators.write) && this.read == c0216valueInstantiators.read && this.AudioAttributesImplApi21Parcelizer == c0216valueInstantiators.AudioAttributesImplApi21Parcelizer;
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[PHI: r2
      0x007b: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x0042, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.read
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.AudioAttributesImplApi21Parcelizer
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            o.setKeyListener<o.MapperConfig<?>, java.lang.Object> r4 = r0.write
            o.AppCompatButton r4 = (kotlin.AppCompatButton) r4
            java.lang.Object[] r5 = r4.IconCompatParcelizer
            java.lang.Object[] r6 = r4.MediaBrowserCompatItemReceiver
            long[] r4 = r4.RemoteActionCompatParcelizer
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L80
            r8 = 0
            r9 = r8
        L34:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L7b
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L4e:
            if (r14 >= r12) goto L79
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L75
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            o.MapperConfig r16 = (kotlin.MapperConfig) r16
            r1.append(r2)
            java.lang.String r2 = r16.getIconCompatParcelizer()
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L75:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4e
        L79:
            if (r12 != r13) goto L80
        L7b:
            if (r9 == r7) goto L80
            int r9 = r9 + 1
            goto L34
        L80:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.lang.String r0 = kotlin.C0164converter.write(r0, r3)
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C0216valueInstantiators.toString():java.lang.String");
    }
}
