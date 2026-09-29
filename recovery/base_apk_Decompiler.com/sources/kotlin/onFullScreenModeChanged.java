package kotlin;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.setPreferImmediatelyAvailableCredentials;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0015\u0010\u000f"}, d2 = {"Lo/onFullScreenModeChanged;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class onFullScreenModeChanged {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~(i8 | i)) | i7;
        int i10 = ~i;
        int i11 = ~(i8 | i10 | i5);
        int i12 = (~(i | i7)) | i8 | (~(i10 | i5));
        int i13 = i5 + i2 + i6 + (325770565 * i3) + ((-1284996642) * i4);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i5) - 1205338112) + ((-1364710777) * i2) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i6) + ((-667418624) * i3) + ((-145752064) * i4) + (1116340224 * i14);
        int i16 = (i5 * (-1991011123)) + 595473426 + (i2 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + (i6 * (-1991010217)) + (i3 * (-1223611789)) + (i4 * (-291900814)) + (i14 * (-1931083776));
        int i17 = i15 + (i16 * i16 * (-1558839296));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr) : write(objArr) : read(objArr);
    }

    private onFullScreenModeChanged(String str, String str2, String str3) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ onFullScreenModeChanged(String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = read;
            int i3 = i2 & 89;
            int i4 = i3 + ((i2 ^ 89) | i3);
            int i5 = i4 % 128;
            AudioAttributesCompatParcelizer = i5;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i5 ^ 89;
            int i7 = (i5 & 89) << 1;
            int i8 = (i6 & i7) + (i7 | i6);
            read = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i11 = AudioAttributesCompatParcelizer + 53;
            read = i11 % 128;
            if (i11 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i12 = 2 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i13 = read;
            int i14 = ((i13 | 7) << 1) - (i13 ^ 7);
            AudioAttributesCompatParcelizer = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((i13 ^ 113) | (i13 & 113)) << 1;
            int i17 = -(((~i13) & 113) | (i13 & (-114)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            AudioAttributesCompatParcelizer = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 2 % 2;
            str3 = null;
        }
        this(str, str2, str3);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        onFullScreenModeChanged onfullscreenmodechanged = (onFullScreenModeChanged) objArr[0];
        int i = 2 % 2;
        setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        String str = onfullscreenmodechanged.RemoteActionCompatParcelizer;
        int i2 = (-2) - ((read + 118) ^ (-1));
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        onFullScreenModeChanged onfullscreenmodechanged = (onFullScreenModeChanged) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 & 47;
        int i4 = -(-((i2 ^ 47) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        AudioAttributesCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        String str = onfullscreenmodechanged.IconCompatParcelizer;
        int i7 = i2 & 89;
        int i8 = -(-((i2 ^ 89) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        AudioAttributesCompatParcelizer = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        onFullScreenModeChanged onfullscreenmodechanged = (onFullScreenModeChanged) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = (i2 & 77) + (i2 | 77);
        read = i3 % 128;
        int i4 = i3 % 2;
        String str = onfullscreenmodechanged.read;
        if (i4 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public onFullScreenModeChanged() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object p0) {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i2 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return ((Boolean) RemoteActionCompatParcelizer(i, 675276990, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), -675276986, new Object[]{this, p0}, i2)).booleanValue();
    }

    public final String write() {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i2 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return (String) RemoteActionCompatParcelizer(i, -1664579190, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 1664579192, new Object[]{this}, i2);
    }

    public final String AudioAttributesCompatParcelizer() {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i2 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return (String) RemoteActionCompatParcelizer(i, -2013641384, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 2013641387, new Object[]{this}, i2);
    }

    public final String read() {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i2 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return (String) RemoteActionCompatParcelizer(i, -381761314, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 381761314, new Object[]{this}, i2);
    }

    public final int hashCode() {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i2 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return ((Integer) RemoteActionCompatParcelizer(i, 1754704246, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), -1754704245, new Object[]{this}, i2)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = ((i2 ^ 39) | (i2 & 39)) << 1;
        int i4 = -(((~i2) & 39) | (i2 & (-40)));
        int i5 = (i3 & i4) + (i4 | i3);
        AudioAttributesCompatParcelizer = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.read;
        StringBuilder sb = new StringBuilder("onFullScreenModeChanged(RemoteActionCompatParcelizer=");
        sb.append(str);
        int i6 = AudioAttributesCompatParcelizer;
        int i7 = (i6 & (-58)) | ((~i6) & 57);
        int i8 = (i6 & 57) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        read = i9 % 128;
        int i10 = i9 % 2;
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        if (i10 != 0) {
            sb.append(", timeline=");
            sb.append(str3);
            throw null;
        }
        sb.append(", read=");
        sb.append(str3);
        int i11 = (-2) - ((AudioAttributesCompatParcelizer + 60) ^ (-1));
        read = i11 % 128;
        int i12 = i11 % 2;
        sb.append(")");
        String string = sb.toString();
        int i13 = read;
        int i14 = (i13 & 63) + (i13 | 63);
        AudioAttributesCompatParcelizer = i14 % 128;
        if (i14 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        write(downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void write(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 17);
        downloadHelper2.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 102);
        downloadHelper2.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 122);
        downloadHelper2.AudioAttributesCompatParcelizer(this.read);
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            RemoteActionCompatParcelizer(downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 48) {
            if (!z) {
                this.RemoteActionCompatParcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.RemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.RemoteActionCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 77) {
            if (!z) {
                this.IconCompatParcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.IconCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.IconCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i != 93) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.read = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.read = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.read = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        String str;
        int iHashCode;
        int iHashCode2;
        int i;
        int i2;
        int i3;
        int iHashCode3 = 0;
        onFullScreenModeChanged onfullscreenmodechanged = (onFullScreenModeChanged) objArr[0];
        int i4 = 2 % 2;
        int i5 = AudioAttributesCompatParcelizer;
        int i6 = (-2) - (((i5 ^ 42) + ((i5 & 42) << 1)) ^ (-1));
        int i7 = i6 % 128;
        read = i7;
        if (i6 % 2 == 0 ? (str = onfullscreenmodechanged.RemoteActionCompatParcelizer) != null : (str = onfullscreenmodechanged.RemoteActionCompatParcelizer) != null) {
            iHashCode = str.hashCode();
            int i8 = AudioAttributesCompatParcelizer;
            int i9 = i8 | 5;
            int i10 = (i9 << 1) - ((~(i8 & 5)) & i9);
            read = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = i7 + 63;
            int i13 = i12 % 128;
            AudioAttributesCompatParcelizer = i13;
            int i14 = i12 % 2;
            int i15 = ((i13 ^ 22) + ((i13 & 22) << 1)) - 1;
            read = i15 % 128;
            int i16 = i15 % 2;
            iHashCode = 0;
        }
        String str2 = onfullscreenmodechanged.IconCompatParcelizer;
        if (str2 == null) {
            int i17 = read;
            int i18 = i17 & 99;
            int i19 = -(-((i17 ^ 99) | i18));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            int i21 = i20 % 128;
            AudioAttributesCompatParcelizer = i21;
            iHashCode2 = i20 % 2 == 0 ? 1 : 0;
            int i22 = i21 ^ 17;
            int i23 = (i21 & 17) << 1;
            int i24 = (i22 & i23) + (i23 | i22);
            read = i24 % 128;
            int i25 = i24 % 2;
        } else {
            iHashCode2 = str2.hashCode();
            int i26 = read + 29;
            AudioAttributesCompatParcelizer = i26 % 128;
            int i27 = i26 % 2;
        }
        String str3 = onfullscreenmodechanged.read;
        if (str3 != null) {
            int i28 = AudioAttributesCompatParcelizer + 111;
            read = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 34 / 0;
                iHashCode3 = str3.hashCode();
            } else {
                iHashCode3 = str3.hashCode();
            }
            int i30 = AudioAttributesCompatParcelizer + 117;
            read = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = iHashCode * 31;
        int iIdentityHashCode = System.identityHashCode(onfullscreenmodechanged);
        int i33 = read;
        int i34 = i33 & 43;
        int i35 = ((((i33 ^ 43) | i34) << 1) - (~(-((~i34) & (i33 | 43))))) - 1;
        AudioAttributesCompatParcelizer = i35 % 128;
        int i36 = i35 % 2;
        int i37 = iHashCode2 * (-433);
        int i38 = -(-(iHashCode * (-6696)));
        int i39 = (i37 & i38) + (i38 | i37);
        int i40 = (((i33 | 106) << 1) - (i33 ^ 106)) - 1;
        AudioAttributesCompatParcelizer = i40 % 128;
        Object obj = null;
        if (i40 % 2 == 0) {
            throw null;
        }
        int i41 = ~iHashCode2;
        int i42 = ~iIdentityHashCode;
        int i43 = ~((i41 & i42) | ((~i42) & i41) | ((~i41) & i42));
        int i44 = i33 & 25;
        int i45 = ((((i33 ^ 25) | i44) << 1) - (~(-((~i44) & (i33 | 25))))) - 1;
        AudioAttributesCompatParcelizer = i45 % 128;
        if (i45 % 2 == 0) {
            int i46 = (~i32) & ((~i32) | i32);
            int i47 = ~((i46 & iIdentityHashCode) | ((~iIdentityHashCode) & i46) | ((~i46) & iIdentityHashCode));
            i = i39 >> (217 / ((i43 & i47) | (i43 ^ i47)));
        } else {
            int i48 = ~i32;
            int i49 = i48 ^ iIdentityHashCode;
            int i50 = i48 & iIdentityHashCode;
            int i51 = ~((i50 & i49) | (i49 ^ i50));
            i = (((i43 & i51) | (i43 ^ i51)) * 217) + i39;
        }
        int i52 = iHashCode2 ^ (-1);
        int i53 = ~i32;
        int i54 = ~((i52 & i53) | (i52 ^ i53));
        int i55 = ~iHashCode2;
        int i56 = (i55 & iIdentityHashCode) | (i55 ^ iIdentityHashCode);
        int i57 = (i33 | 69) << 1;
        int i58 = -(i33 ^ 69);
        int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
        int i60 = i59 % 128;
        AudioAttributesCompatParcelizer = i60;
        if (i59 % 2 == 0) {
            int i61 = (i56 | (~i56)) & (~i56);
            i2 = i << (217 << ((i54 & i61) | (i54 ^ i61)));
            i3 = (i32 | i53) & (~i32);
        } else {
            int i62 = ~i56;
            int i63 = ((~i62) & i54) | ((~i54) & i62);
            int i64 = i54 & i62;
            int i65 = -(~(((i64 & i63) | (i63 ^ i64)) * 217));
            i2 = (((i | i65) << 1) - (i ^ i65)) - 1;
            i3 = ~i32;
        }
        int i66 = ~iIdentityHashCode;
        int i67 = (i66 & i3) | (i3 ^ i66);
        int i68 = (i67 | (~i67)) & (~i67);
        int i69 = (i2 + (217 * ((i68 & iHashCode2) | (iHashCode2 ^ i68)))) * 31;
        int i70 = -(-iHashCode3);
        int i71 = (((~i70) & i69) | ((~i69) & i70)) + ((i70 & i69) << 1);
        int i72 = i60 & 37;
        int i73 = ((i60 ^ 37) | i72) << 1;
        int i74 = -((~i72) & (i60 | 37));
        int i75 = ((i73 | i74) << 1) - (i73 ^ i74);
        read = i75 % 128;
        if (i75 % 2 == 0) {
            return Integer.valueOf(i71);
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        onFullScreenModeChanged onfullscreenmodechanged = (onFullScreenModeChanged) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 & 45;
        int i4 = i3 + ((i2 ^ 45) | i3);
        int i5 = i4 % 128;
        AudioAttributesCompatParcelizer = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (onfullscreenmodechanged == obj) {
            int i6 = (i2 & 105) + (i2 | 105);
            AudioAttributesCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof onFullScreenModeChanged)) {
            int i8 = ((i5 & 36) + (i5 | 36)) - 1;
            int i9 = i8 % 128;
            read = i9;
            int i10 = i8 % 2;
            int i11 = i9 & 5;
            int i12 = -(-(i9 | 5));
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            AudioAttributesCompatParcelizer = i13 % 128;
            if (i13 % 2 != 0) {
                return false;
            }
            throw null;
        }
        onFullScreenModeChanged onfullscreenmodechanged2 = (onFullScreenModeChanged) obj;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) onfullscreenmodechanged.RemoteActionCompatParcelizer, (Object) onfullscreenmodechanged2.RemoteActionCompatParcelizer)) {
            int i14 = read;
            int i15 = i14 + 14;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            AudioAttributesCompatParcelizer = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((i14 | 79) << 1) - (i14 ^ 79);
            AudioAttributesCompatParcelizer = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) onfullscreenmodechanged.IconCompatParcelizer, (Object) onfullscreenmodechanged2.IconCompatParcelizer)) {
            int i20 = read;
            int i21 = i20 & 67;
            int i22 = ((i20 ^ 67) | i21) << 1;
            int i23 = -((~i21) & (i20 | 67));
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            AudioAttributesCompatParcelizer = i24 % 128;
            int i25 = i24 % 2;
            int i26 = (-2) - ((i20 + 66) ^ (-1));
            AudioAttributesCompatParcelizer = i26 % 128;
            if (i26 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) onfullscreenmodechanged.read, (Object) onfullscreenmodechanged2.read))) {
            int i27 = read;
            int i28 = (-2) - ((((i27 | 42) << 1) - (i27 ^ 42)) ^ (-1));
            AudioAttributesCompatParcelizer = i28 % 128;
            int i29 = i28 % 2;
            return true;
        }
        int i30 = read;
        int i31 = (-2) - (((i30 ^ 120) + ((i30 & 120) << 1)) ^ (-1));
        int i32 = i31 % 128;
        AudioAttributesCompatParcelizer = i32;
        int i33 = i31 % 2;
        int i34 = (((i32 | 54) << 1) - (i32 ^ 54)) - 1;
        read = i34 % 128;
        int i35 = i34 % 2;
        return false;
    }
}
