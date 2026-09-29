package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b \u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u0018R \u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b!\u0010%"}, d2 = {"Lo/isFullyVisible;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "", "Lo/updateSelectedIndex;", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "read", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class isFullyVisible {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private String IconCompatParcelizer;
    private String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private List<updateSelectedIndex> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i2);
        int i9 = ~i2;
        int i10 = ~(i9 | i);
        int i11 = ~((~i4) | i2);
        int i12 = i10 | i11;
        int i13 = i11 | (~(i7 | i9));
        int i14 = i2 + i + i3 + ((-1232316077) * i6) + ((-263306238) * i5);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i2) - 1785593856) + (933837065 * i) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i3) + (1319895040 * i6) + (1514668032 * i5) + (1334968320 * i15);
        int i17 = ((i2 * (-2046307327)) - 1888090795) + (i * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i3 * (-2046307883)) + (i6 * 1526207759) + (i5 * (-1095616598)) + (i15 * 1719271424);
        switch (i16 + (i17 * i17 * 2111700992)) {
            case 1:
                return read(objArr);
            case 2:
                return AudioAttributesCompatParcelizer(objArr);
            case 3:
                return RemoteActionCompatParcelizer(objArr);
            case 4:
                return IconCompatParcelizer(objArr);
            case 5:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 6:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 7:
                return MediaBrowserCompatItemReceiver(objArr);
            case 8:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 9:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 10:
                return RatingCompat(objArr);
            case 11:
                return MediaDescriptionCompat(objArr);
            default:
                return write(objArr);
        }
    }

    private isFullyVisible(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<updateSelectedIndex> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.AudioAttributesImplApi26Parcelizer = str6;
        this.AudioAttributesImplApi21Parcelizer = str7;
        this.MediaBrowserCompatCustomActionResultReceiver = str8;
        this.MediaBrowserCompatItemReceiver = str9;
        this.AudioAttributesImplBaseParcelizer = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ isFullyVisible(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        List listRemoteActionCompatParcelizer;
        String str18 = null;
        if ((i & 1) != 0) {
            int i2 = MediaMetadataCompat;
            int i3 = ((i2 ^ 5) - (~((i2 & 5) << 1))) - 1;
            RatingCompat = i3 % 128;
            if (i3 % 2 != 0) {
                str18.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            str10 = null;
        } else {
            str10 = str;
        }
        if ((i & 2) != 0) {
            int i5 = RatingCompat;
            int i6 = (i5 ^ 17) + ((i5 & 17) << 1);
            int i7 = i6 % 128;
            MediaMetadataCompat = i7;
            if (i6 % 2 == 0) {
                throw null;
            }
            int i8 = (((i7 & (-12)) | ((~i7) & 11)) - (~((i7 & 11) << 1))) - 1;
            RatingCompat = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 3;
            } else {
                int i10 = 2 % 2;
            }
            str11 = null;
        } else {
            str11 = str2;
        }
        if ((i & 4) != 0) {
            int i11 = MediaMetadataCompat;
            int i12 = (i11 ^ 33) + ((i11 & 33) << 1);
            int i13 = i12 % 128;
            RatingCompat = i13;
            if (i12 % 2 != 0) {
                str18.hashCode();
                throw null;
            }
            int i14 = (i13 ^ 52) + ((i13 & 52) << 1);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            MediaMetadataCompat = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            str12 = null;
        } else {
            str12 = str3;
        }
        if ((i & 8) != 0) {
            int i18 = MediaMetadataCompat;
            int i19 = (-2) - ((((i18 | 56) << 1) - (i18 ^ 56)) ^ (-1));
            int i20 = i19 % 128;
            RatingCompat = i20;
            if (i19 % 2 != 0) {
                str18.hashCode();
                throw null;
            }
            int i21 = ((i20 & 118) + (i20 | 118)) - 1;
            MediaMetadataCompat = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 2 % 2;
            str13 = null;
        } else {
            str13 = str4;
        }
        if ((i & 16) != 0) {
            int i24 = RatingCompat;
            int i25 = i24 ^ 99;
            int i26 = (i24 & 99) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            int i28 = i27 % 128;
            MediaMetadataCompat = i28;
            int i29 = i27 % 2;
            int i30 = (i28 | 1) << 1;
            int i31 = -(i28 ^ 1);
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            RatingCompat = i32 % 128;
            if (i32 % 2 != 0) {
                int i33 = 4 % 5;
            } else {
                int i34 = 2 % 2;
            }
            str14 = null;
        } else {
            str14 = str5;
        }
        if ((i & 32) != 0) {
            int i35 = RatingCompat;
            int i36 = (i35 & 100) + (i35 | 100);
            int i37 = (i36 ^ (-1)) + (i36 << 1);
            MediaMetadataCompat = i37 % 128;
            if (i37 % 2 == 0) {
                int i38 = 90 / 0;
            }
            int i39 = 2 % 2;
            str15 = null;
        } else {
            str15 = str6;
        }
        if ((i & 64) != 0) {
            int i40 = RatingCompat;
            int i41 = (i40 & (-74)) | ((~i40) & 73);
            int i42 = (i40 & 73) << 1;
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            int i44 = i43 % 128;
            MediaMetadataCompat = i44;
            int i45 = i43 % 2;
            int i46 = i44 ^ 43;
            int i47 = (i44 & 43) << 1;
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            RatingCompat = i48 % 128;
            int i49 = i48 % 2;
            int i50 = 2 % 2;
            str16 = null;
        } else {
            str16 = str7;
        }
        if ((i & 128) != 0) {
            int i51 = MediaMetadataCompat;
            int i52 = (i51 & (-28)) | ((~i51) & 27);
            int i53 = (i51 & 27) << 1;
            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
            int i55 = i54 % 128;
            RatingCompat = i55;
            int i56 = i54 % 2;
            int i57 = (i55 & 65) + (i55 | 65);
            MediaMetadataCompat = i57 % 128;
            if (i57 % 2 == 0) {
                int i58 = 5 / 4;
            } else {
                int i59 = 2 % 2;
            }
            str17 = null;
        } else {
            str17 = str8;
        }
        if ((i & 256) != 0) {
            int i60 = MediaMetadataCompat;
            int i61 = ((((i60 ^ 23) | (i60 & 23)) << 1) - (~(-(((~i60) & 23) | (i60 & (-24)))))) - 1;
            RatingCompat = i61 % 128;
            if (i61 % 2 != 0) {
                int i62 = 21 / 0;
            }
            int i63 = 2 % 2;
        } else {
            str18 = str9;
        }
        if ((i & 512) != 0) {
            int i64 = RatingCompat;
            int i65 = ((i64 ^ 17) - (~(-(-((i64 & 17) << 1))))) - 1;
            MediaMetadataCompat = i65 % 128;
            int i66 = i65 % 2;
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            int i67 = RatingCompat + 37;
            MediaMetadataCompat = i67 % 128;
            if (i67 % 2 != 0) {
                int i68 = 2 % 2;
            }
        } else {
            listRemoteActionCompatParcelizer = list;
        }
        this(str10, str11, str12, str13, str14, str15, str16, str17, str18, listRemoteActionCompatParcelizer);
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 ^ 43;
        int i4 = (((i2 & 43) | i3) << 1) - i3;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        String str = isfullyvisible.read;
        if (i5 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = (-2) - (((i2 ^ 76) + ((i2 & 76) << 1)) ^ (-1));
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        String str = isfullyvisible.IconCompatParcelizer;
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 & 91;
        int i4 = ((((i2 ^ 91) | i3) << 1) - (~(-((i2 | 91) & (~i3))))) - 1;
        int i5 = i4 % 128;
        MediaMetadataCompat = i5;
        int i6 = i4 % 2;
        String str = isfullyvisible.write;
        if (i6 == 0) {
            int i7 = 58 / 0;
        }
        int i8 = i5 + 103;
        RatingCompat = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 13;
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
        String str = isfullyvisible.RemoteActionCompatParcelizer;
        int i5 = i2 & 95;
        int i6 = (((i2 ^ 95) | i5) << 1) - ((i2 | 95) & (~i5));
        MediaMetadataCompat = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = (-2) - (((i2 & 32) + (i2 | 32)) ^ (-1));
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
        String str = isfullyvisible.AudioAttributesCompatParcelizer;
        int i5 = (-2) - ((i2 + 94) ^ (-1));
        MediaMetadataCompat = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 & 125;
        int i4 = (((i2 ^ 125) | i3) << 1) - ((i2 | 125) & (~i3));
        int i5 = i4 % 128;
        MediaMetadataCompat = i5;
        int i6 = i4 % 2;
        String str = isfullyvisible.AudioAttributesImplApi26Parcelizer;
        int i7 = (-2) - ((((i5 | 60) << 1) - (i5 ^ 60)) ^ (-1));
        RatingCompat = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 ^ 43;
        int i4 = (i2 & 43) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        MediaMetadataCompat = i6;
        int i7 = i5 % 2;
        String str = isfullyvisible.AudioAttributesImplApi21Parcelizer;
        int i8 = i6 + 117;
        RatingCompat = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 94 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 & 119;
        int i4 = (((i2 | 119) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        int i5 = i4 % 128;
        MediaMetadataCompat = i5;
        int i6 = i4 % 2;
        String str = isfullyvisible.MediaBrowserCompatCustomActionResultReceiver;
        int i7 = (i5 & (-122)) | ((~i5) & 121);
        int i8 = -(-((i5 & 121) << 1));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        RatingCompat = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 24 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = ((i2 ^ 7) - (~(-(-((i2 & 7) << 1))))) - 1;
        int i4 = i3 % 128;
        RatingCompat = i4;
        int i5 = i3 % 2;
        String str = isfullyvisible.MediaBrowserCompatItemReceiver;
        int i6 = (((i4 | 84) << 1) - (i4 ^ 84)) - 1;
        MediaMetadataCompat = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 81;
        int i3 = i2 % 128;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        List<updateSelectedIndex> list = isfullyvisible.AudioAttributesImplBaseParcelizer;
        int i5 = ((i3 | 9) << 1) - (i3 ^ 9);
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public isFullyVisible() {
        this(null, null, null, null, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    public final boolean equals(Object p0) {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return ((Boolean) write(816965204, -816965195, i2, i, getHasMultipleThemes.read(), new Object[]{this, p0}, i3)).booleanValue();
    }

    public final String AudioAttributesCompatParcelizer() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (String) write(-2017376204, 2017376214, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final String write() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (String) write(-1870742996, 1870743001, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final List<updateSelectedIndex> RemoteActionCompatParcelizer() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (List) write(-1390053422, 1390053424, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final String read() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (String) write(-899762990, 899762991, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final String IconCompatParcelizer() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (String) write(1741567785, -1741567781, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final String MediaBrowserCompatItemReceiver() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (String) write(1124611137, -1124611131, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (String) write(1791917002, -1791916994, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final String AudioAttributesImplBaseParcelizer() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (String) write(934738568, -934738568, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (String) write(-108197224, 108197235, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return (String) write(-427768901, 427768908, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3);
    }

    public final int hashCode() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        int i3 = getHasMultipleThemes.read();
        return ((Integer) write(-1501040764, 1501040767, i2, i, getHasMultipleThemes.read(), new Object[]{this}, i3)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        MediaMetadataCompat = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.read;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.write;
        String str4 = this.RemoteActionCompatParcelizer;
        String str5 = this.AudioAttributesCompatParcelizer;
        String str6 = this.AudioAttributesImplApi26Parcelizer;
        String str7 = this.AudioAttributesImplApi21Parcelizer;
        String str8 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str9 = this.MediaBrowserCompatItemReceiver;
        List<updateSelectedIndex> list = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("isFullyVisible(read=");
        int i4 = RatingCompat + 71;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        sb.append(str);
        if (i5 == 0) {
            sb.append(", xmlns_xsi=");
            sb.append(str2);
            sb.append(", profiles=");
            sb.append(str3);
            throw null;
        }
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(", write=");
        sb.append(str3);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str4);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str5);
        int i6 = MediaMetadataCompat;
        int i7 = (((i6 | 69) << 1) - (~(-(i6 ^ 69)))) - 1;
        RatingCompat = i7 % 128;
        int i8 = i7 % 2;
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(str6);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(str7);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        int i9 = RatingCompat;
        int i10 = i9 & 89;
        int i11 = ((i9 | 89) & (~i10)) + (i10 << 1);
        MediaMetadataCompat = i11 % 128;
        int i12 = i11 % 2;
        sb.append(str8);
        if (i12 == 0) {
            sb.append(", minBufferTime=");
            sb.append(str9);
            sb.append(", period=");
            throw null;
        }
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(str9);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        int i13 = MediaMetadataCompat;
        int i14 = (i13 ^ 91) + ((i13 & 91) << 1);
        RatingCompat = i14 % 128;
        int i15 = i14 % 2;
        sb.append(list);
        sb.append(")");
        String string = sb.toString();
        int i16 = RatingCompat + 7;
        MediaMetadataCompat = i16 % 128;
        if (i16 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public final /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        IconCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 157);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 169);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        if (this != this.AudioAttributesImplBaseParcelizer) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 156);
            isAnimationEnabled isanimationenabled = new isAnimationEnabled();
            List<updateSelectedIndex> list = this.AudioAttributesImplBaseParcelizer;
            sendSetRequirements.write(setdownloadingstatestoqueued, isanimationenabled, list).read(downloadHelper2, list);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 119);
        downloadHelper2.AudioAttributesCompatParcelizer(this.write);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 5);
        downloadHelper2.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 27);
        downloadHelper2.AudioAttributesCompatParcelizer(this.read);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, TsExtractor.TS_STREAM_TYPE_AC4);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 125);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 174);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 66);
        downloadHelper2.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            RemoteActionCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 38) {
            if (!z) {
                this.MediaBrowserCompatItemReceiver = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.MediaBrowserCompatItemReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.MediaBrowserCompatItemReceiver = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 51) {
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
        if (i == 61) {
            if (!z) {
                this.AudioAttributesCompatParcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.AudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.AudioAttributesCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 74) {
            if (!z) {
                this.MediaBrowserCompatCustomActionResultReceiver = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.MediaBrowserCompatCustomActionResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 148) {
            if (!z) {
                this.write = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.write = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.write = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 181) {
            if (z) {
                this.AudioAttributesImplBaseParcelizer = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new isAnimationEnabled()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.AudioAttributesImplBaseParcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i == 115) {
            if (!z) {
                this.AudioAttributesImplApi21Parcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.AudioAttributesImplApi21Parcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.AudioAttributesImplApi21Parcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 116) {
            if (!z) {
                this.AudioAttributesImplApi26Parcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.AudioAttributesImplApi26Parcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.AudioAttributesImplApi26Parcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 157) {
            if (!z) {
                this.read = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.read = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.read = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i != 158) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.RemoteActionCompatParcelizer = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.RemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.RemoteActionCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 59;
        MediaMetadataCompat = i3 % 128;
        if (i3 % 2 != 0 ? (str = isfullyvisible.read) != null : (str = isfullyvisible.read) != null) {
            iHashCode = str.hashCode();
            int i4 = MediaMetadataCompat;
            int i5 = (((i4 ^ 69) | (i4 & 69)) << 1) - (((~i4) & 69) | (i4 & (-70)));
            RatingCompat = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = (i2 & 122) + (i2 | 122);
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            MediaMetadataCompat = i8 % 128;
            iHashCode = i8 % 2 == 0 ? 1 : 0;
            int i9 = i2 ^ 111;
            int i10 = -(-((i2 & 111) << 1));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            MediaMetadataCompat = i11 % 128;
            int i12 = i11 % 2;
        }
        String str2 = isfullyvisible.IconCompatParcelizer;
        if (str2 == null) {
            int i13 = RatingCompat;
            int i14 = i13 | 81;
            int i15 = i14 << 1;
            int i16 = -(i14 & (~(i13 & 81)));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            MediaMetadataCompat = i17 % 128;
            iHashCode2 = i17 % 2 == 0 ? 1 : 0;
            int i18 = (i13 ^ 9) + ((i13 & 9) << 1);
            MediaMetadataCompat = i18 % 128;
            int i19 = i18 % 2;
        } else {
            iHashCode2 = str2.hashCode();
            int i20 = RatingCompat;
            int i21 = i20 & 107;
            int i22 = (i20 | 107) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            MediaMetadataCompat = i24 % 128;
            int i25 = i24 % 2;
        }
        String str3 = isfullyvisible.write;
        if (str3 == null) {
            int i26 = RatingCompat;
            int i27 = i26 & 49;
            int i28 = (i26 ^ 49) | i27;
            int i29 = (i27 & i28) + (i27 | i28);
            MediaMetadataCompat = i29 % 128;
            int i30 = i29 % 2;
            int i31 = i26 & 5;
            int i32 = -(-(i26 | 5));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            MediaMetadataCompat = i33 % 128;
            int i34 = i33 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
            int i35 = MediaMetadataCompat;
            int i36 = ((i35 | 52) << 1) - (i35 ^ 52);
            int i37 = (i36 ^ (-1)) + (i36 << 1);
            RatingCompat = i37 % 128;
            int i38 = i37 % 2;
        }
        String str4 = isfullyvisible.RemoteActionCompatParcelizer;
        if (str4 == null) {
            int i39 = RatingCompat;
            int i40 = i39 & 125;
            int i41 = ((i39 | 125) & (~i40)) + (i40 << 1);
            MediaMetadataCompat = i41 % 128;
            iHashCode4 = i41 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = str4.hashCode();
            int i42 = MediaMetadataCompat;
            int i43 = (i42 & (-48)) | ((~i42) & 47);
            int i44 = -(-((i42 & 47) << 1));
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            RatingCompat = i45 % 128;
            int i46 = i45 % 2;
        }
        String str5 = isfullyvisible.AudioAttributesCompatParcelizer;
        if (str5 == null) {
            int i47 = RatingCompat;
            int i48 = i47 & 65;
            int i49 = ((~i48) & (i47 | 65)) + (i48 << 1);
            MediaMetadataCompat = i49 % 128;
            int i50 = i49 % 2;
            int i51 = i47 & 115;
            int i52 = ((i47 ^ 115) | i51) << 1;
            int i53 = -((i47 | 115) & (~i51));
            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
            MediaMetadataCompat = i54 % 128;
            int i55 = i54 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str5.hashCode();
            int i56 = RatingCompat + 121;
            MediaMetadataCompat = i56 % 128;
            int i57 = i56 % 2;
        }
        String str6 = isfullyvisible.AudioAttributesImplApi26Parcelizer;
        if (str6 == null) {
            int i58 = RatingCompat + 121;
            int i59 = i58 % 128;
            MediaMetadataCompat = i59;
            int i60 = i58 % 2;
            int i61 = i59 ^ 101;
            int i62 = ((i59 & 101) | i61) << 1;
            int i63 = -i61;
            int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
            RatingCompat = i64 % 128;
            int i65 = i64 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str6.hashCode();
            int i66 = RatingCompat;
            int i67 = ((i66 | 29) << 1) - (i66 ^ 29);
            MediaMetadataCompat = i67 % 128;
            int i68 = i67 % 2;
        }
        String str7 = isfullyvisible.AudioAttributesImplApi21Parcelizer;
        if (str7 == null) {
            int i69 = MediaMetadataCompat;
            int i70 = ((i69 | 67) << 1) - (i69 ^ 67);
            RatingCompat = i70 % 128;
            int i71 = i70 % 2;
            int i72 = i69 & 31;
            int i73 = i72 + ((i69 ^ 31) | i72);
            RatingCompat = i73 % 128;
            if (i73 % 2 != 0) {
                int i74 = 2 / 4;
            }
            iHashCode7 = 0;
        } else {
            iHashCode7 = str7.hashCode();
            int i75 = MediaMetadataCompat + 93;
            RatingCompat = i75 % 128;
            int i76 = i75 % 2;
        }
        String str8 = isfullyvisible.MediaBrowserCompatCustomActionResultReceiver;
        if (str8 == null) {
            int i77 = RatingCompat;
            int i78 = ((i77 | 39) << 1) - (i77 ^ 39);
            int i79 = i78 % 128;
            MediaMetadataCompat = i79;
            int i80 = i78 % 2;
            int i81 = i79 & 77;
            int i82 = -(-((i79 ^ 77) | i81));
            int i83 = (i81 & i82) + (i82 | i81);
            RatingCompat = i83 % 128;
            int i84 = i83 % 2;
            iHashCode8 = 0;
        } else {
            iHashCode8 = str8.hashCode();
            int i85 = RatingCompat;
            int i86 = (-2) - ((((i85 | 116) << 1) - (i85 ^ 116)) ^ (-1));
            MediaMetadataCompat = i86 % 128;
            int i87 = i86 % 2;
        }
        String str9 = isfullyvisible.MediaBrowserCompatItemReceiver;
        if (str9 != null) {
            int i88 = getHasMultipleThemes.read();
            int i89 = ~i88;
            int i90 = 1901759327 & i89;
            int i91 = (~i90) & (1901759327 | i89);
            int i92 = ~((i90 & i91) | (i91 ^ i90));
            int i93 = (-2078252928) & i92;
            int i94 = (i92 | (-2078252928)) & (~i93);
            int i95 = ((i94 & i93) | (i94 ^ i93)) * (-241);
            int i96 = (((-1394741928) ^ i95) + ((i95 & (-1394741928)) << 1)) - 2066012664;
            int i97 = ~i88;
            int i98 = (1901759327 & i97) | (1901759327 ^ i97);
            int i99 = i98 & (-1268225892);
            int i100 = (i98 | (-1268225892)) & (~i99);
            int i101 = ~((i100 & i99) | (i100 ^ i99));
            int i102 = ((i101 & 810027036) | (810027036 ^ i101)) * 241;
            int i103 = i96 & i102;
            int i104 = i103 + ((i102 ^ i96) | i103);
            int iIdentityHashCode = System.identityHashCode(isfullyvisible);
            int i105 = (iIdentityHashCode & (-2120256961)) | ((-2120256961) ^ iIdentityHashCode);
            int i106 = ~i105;
            int i107 = i105 | (~i105);
            int i108 = i106 & i107;
            int i109 = (241209895 & (~i108)) | (i108 & (-241209896));
            int i110 = 241209895 & i108;
            int i111 = -(-(((i109 ^ i110) | (i110 & i109)) * (-658)));
            int i112 = ((499448469 | i111) << 1) - (i111 ^ 499448469);
            int i113 = i112 & (-200736768);
            int i114 = i113 + ((i112 ^ (-200736768)) | i113);
            int i115 = i107 & i106;
            int i116 = 241205248 & i115;
            int i117 = (i115 | 241205248) & (~i116);
            if (i104 <= (i114 - (~(((i117 & i116) | (i117 ^ i116)) * 658))) - 1) {
                str9.hashCode();
                throw null;
            }
            iHashCode9 = str9.hashCode();
            int i118 = MediaMetadataCompat;
            int i119 = i118 & 73;
            int i120 = -(-((i118 ^ 73) | i119));
            int i121 = (i119 ^ i120) + ((i120 & i119) << 1);
            RatingCompat = i121 % 128;
            int i122 = i121 % 2;
        } else {
            iHashCode9 = 0;
        }
        int i123 = iHashCode * 31;
        int i124 = i123 ^ iHashCode2;
        int i125 = ((i123 & iHashCode2) | i124) << 1;
        int i126 = -i124;
        int i127 = (((i125 | i126) << 1) - (i126 ^ i125)) * 31;
        int i128 = -(-iHashCode3);
        int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
        int i130 = i129 * 31;
        int i131 = getHasMultipleThemes.read();
        int i132 = iHashCode4 * 70;
        int i133 = -(-(i129 * (-2108)));
        int i134 = (i132 & i133) + (i133 | i132);
        int i135 = ~iHashCode4;
        int i136 = ~i130;
        int i137 = i135 ^ i136;
        int i138 = i135 & i136;
        int i139 = (i138 & i137) | (i137 ^ i138);
        int i140 = ~((i139 & i131) | (i139 ^ i131));
        int i141 = RatingCompat;
        int i142 = (((i141 & (-16)) | ((~i141) & 15)) - (~((i141 & 15) << 1))) - 1;
        int i143 = i142 % 128;
        MediaMetadataCompat = i143;
        int i144 = i142 % 2;
        int i145 = ~i130;
        int i146 = ~iHashCode4;
        int i147 = (iHashCode4 & i145) | (i130 & i146);
        int i148 = iHashCode4 & i130;
        int i149 = (i147 ^ i148) | (i147 & i148);
        int i150 = iHashCode9;
        int i151 = i149 & i131;
        int i152 = iHashCode8;
        int i153 = (~i151) & (i149 | i131);
        int i154 = ~((i151 & i153) | (i153 ^ i151));
        int i155 = ((i154 & i140) | (i140 ^ i154)) * 69;
        int i156 = i134 ^ i155;
        int i157 = (((i155 & i134) | i156) << 1) - i156;
        int i158 = ~iHashCode4;
        int i159 = (i158 & i130) | (i158 & i145) | ((~i158) & i130);
        int i160 = (i159 | (~i159)) & (~i159);
        int i161 = ~i131;
        int i162 = ~((i146 ^ i131) | (i146 & i131));
        int i163 = i160 & i162;
        int i164 = iHashCode7;
        int i165 = (i160 | i162) & (~i163);
        int i166 = (i165 & i163) | (i165 ^ i163);
        int i167 = (i130 & i161) | (i131 & i145);
        int i168 = i131 & i130;
        int i169 = ~((i168 & i167) | (i167 ^ i168));
        int i170 = (i157 - (~(-(~(-(-(((i166 & i169) | (((~i169) & i166) | ((~i166) & i169))) * (-69)))))))) - 2;
        int i171 = (i130 | i145) & i136;
        int i172 = (i171 & i146) | ((~i171) & iHashCode4);
        int i173 = i171 & iHashCode4;
        int i174 = (i173 & i172) | (i172 ^ i173);
        int i175 = i143 & 55;
        int i176 = ((i143 ^ 55) | i175) << 1;
        int i177 = -((~i175) & (i143 | 55));
        int i178 = ((i176 | i177) << 1) - (i176 ^ i177);
        RatingCompat = i178 % 128;
        int i179 = i178 % 2;
        int i180 = -(-(69 * (~i174)));
        int i181 = ((i170 ^ i180) + ((i170 & i180) << 1)) * 31;
        int i182 = ((i181 & iHashCode5) + (i181 | iHashCode5)) * 31;
        int i183 = -(-iHashCode6);
        int i184 = ((i182 ^ i183) | (i182 & i183)) << 1;
        int i185 = -(((~i182) & i183) | ((~i183) & i182));
        int i186 = (i184 ^ i185) + ((i185 & i184) << 1);
        int i187 = i186 * 31;
        int iIdentityHashCode2 = System.identityHashCode(isfullyvisible);
        int i188 = ((i164 * (-575)) - (~(-(-(i186 * (-17825)))))) - 1;
        int i189 = RatingCompat;
        int i190 = ((i189 ^ 50) + ((i189 & 50) << 1)) - 1;
        int i191 = i190 % 128;
        MediaMetadataCompat = i191;
        int i192 = i190 % 2;
        int i193 = ~i164;
        int i194 = ~i193;
        int i195 = ~i187;
        int i196 = ~((i193 ^ i195) | (i193 & i195));
        int i197 = ~(i195 | iIdentityHashCode2);
        int i198 = (i188 - (~(-(-(((i196 & i197) | (((~i197) & i196) | ((~i196) & i197))) * 576))))) - 1;
        int i199 = ~((i193 & i187) | (i194 & i187) | (i193 & i195));
        int i200 = (~i187) & (i195 | i187);
        int i201 = ~iIdentityHashCode2;
        int i202 = (i201 & i200) | (i200 ^ i201);
        int i203 = (i202 & i164) | (i202 ^ i164);
        int i204 = (i203 | (~i203)) & (~i203);
        int i205 = ((~i204) & i199) | ((~i199) & i204);
        int i206 = i204 & i199;
        int i207 = ((i206 & i205) | (i205 ^ i206)) * 576;
        int i208 = i198 & i207;
        int i209 = i208 + ((i207 ^ i198) | i208);
        int i210 = (i191 ^ 19) + ((i191 & 19) << 1);
        RatingCompat = i210 % 128;
        int i211 = i210 % 2;
        int i212 = ~i164;
        int i213 = ~i187;
        int i214 = i212 ^ i213;
        int i215 = i213 & i212;
        int i216 = -(-(576 * (~((i215 & i214) | (i214 ^ i215)))));
        int i217 = ((((i209 | i216) << 1) - (i216 ^ i209)) * 31) - (~i152);
        int i218 = (i217 ^ (-1)) + (i217 << 1);
        int i219 = i218 * 31;
        int i220 = getHasMultipleThemes.read();
        int i221 = i150 * 46;
        int i222 = -(~(i218 * 1426));
        int i223 = (((i221 | i222) << 1) - (i222 ^ i221)) - 1;
        int i224 = ~i219;
        int i225 = RatingCompat;
        int i226 = i225 & 3;
        int i227 = (i225 | 3) & (~i226);
        int i228 = -(-(i226 << 1));
        int i229 = (i227 & i228) + (i227 | i228);
        int i230 = i229 % 128;
        MediaMetadataCompat = i230;
        int i231 = i229 % 2;
        int i232 = ~((i220 ^ (-1)) | i224);
        int i233 = i150 & (~i232);
        int i234 = ~i150;
        int i235 = i233 | (i232 & i234);
        int i236 = i232 & i150;
        int i237 = -(~((-90) * ((i236 & i235) | (i235 ^ i236))));
        int i238 = ((i223 ^ i237) + ((i223 & i237) << 1)) - 1;
        int i239 = (~i219) & (i224 | i219);
        int i240 = i239 & i220;
        int i241 = ~(((i239 | i220) & (~i240)) | i240);
        int i242 = (i150 & i224) | (i219 & i234);
        int i243 = i219 & i150;
        int i244 = ~((i243 & i242) | (i242 ^ i243));
        int i245 = i241 & i244;
        int i246 = (i244 | i241) & (~i245);
        int i247 = ((i246 & i245) | (i246 ^ i245)) * (-45);
        int i248 = i238 & i247;
        int i249 = i247 | i238;
        int i250 = ((i248 | i249) << 1) - (i249 ^ i248);
        int i251 = (~i150) & (i234 | i150);
        int i252 = i251 & i220;
        int i253 = (i251 | i220) & (~i252);
        int i254 = ~i220;
        int i255 = ~(i253 | i252);
        int i256 = (i224 & i255) | (i224 ^ i255);
        int i257 = ~((i254 ^ i150) | (i254 & i150));
        int i258 = (i230 ^ 117) + ((i230 & 117) << 1);
        RatingCompat = i258 % 128;
        int i259 = i258 % 2;
        int i260 = ((~i257) & i256) | ((~i256) & i257);
        int i261 = i256 & i257;
        int i262 = i250 + (45 * ((i261 & i260) | (i260 ^ i261)));
        int i263 = i262 * 31;
        int iHashCode10 = isfullyvisible.AudioAttributesImplBaseParcelizer.hashCode();
        int i264 = getHasMultipleThemes.read();
        int i265 = iHashCode10 * (-209);
        int i266 = -(-(i262 * (-6479)));
        int i267 = i265 & i266;
        int i268 = (((i265 | i266) & (~i267)) - (~(i267 << 1))) - 1;
        int i269 = ~iHashCode10;
        int i270 = ~i263;
        int i271 = (~((i270 & i269) | (i269 ^ i270))) * 210;
        int i272 = ((i268 | i271) << 1) - (((~i268) & i271) | ((~i271) & i268));
        int i273 = RatingCompat;
        int i274 = i273 & 65;
        int i275 = ((i273 | 65) & (~i274)) + (i274 << 1);
        int i276 = i275 % 128;
        MediaMetadataCompat = i276;
        int i277 = i275 % 2;
        int i278 = ~i263;
        int i279 = ~i264;
        int i280 = ~i264;
        int i281 = i279 & (i280 | i264);
        int i282 = i278 ^ i281;
        int i283 = i281 & i278;
        int i284 = ~((i283 & i282) | (i282 ^ i283));
        int i285 = ~iHashCode10;
        int i286 = ~iHashCode10;
        int i287 = i285 & (i286 | iHashCode10);
        int i288 = (i287 & i264) | (i287 ^ i264);
        int i289 = (i288 | (~i288)) & (~i288);
        int i290 = -(~(-(-(((i284 & i289) | (i284 ^ i289)) * 210))));
        int i291 = (((i272 | i290) << 1) - (i290 ^ i272)) - 1;
        int i292 = i269 ^ i280;
        int i293 = i269 & i280;
        int i294 = (i293 & i292) | (i292 ^ i293);
        int i295 = i294 & i263;
        int i296 = ~(((i263 | i294) & (~i295)) | i295);
        int i297 = (i278 & i286) | ((~i278) & iHashCode10);
        int i298 = iHashCode10 & i278;
        int i299 = (i298 & i297) | (i297 ^ i298);
        int i300 = (i299 & i264) | (i299 ^ i264);
        int i301 = (i300 | (~i300)) & (~i300);
        int i302 = i296 & i301;
        int i303 = (i296 | i301) & (~i302);
        int i304 = ((i303 & i302) | (i303 ^ i302)) * 210;
        int i305 = i291 & i304;
        int i306 = i304 | i291;
        int i307 = (i305 ^ i306) + ((i306 & i305) << 1);
        int i308 = i276 + 99;
        RatingCompat = i308 % 128;
        if (i308 % 2 == 0) {
            return Integer.valueOf(i307);
        }
        int i309 = 67 / 0;
        return Integer.valueOf(i307);
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        isFullyVisible isfullyvisible = (isFullyVisible) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = (((i2 & (-78)) | ((~i2) & 77)) - (~((i2 & 77) << 1))) - 1;
        MediaMetadataCompat = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (isfullyvisible == obj) {
            int i4 = i2 ^ 83;
            int i5 = -(-((i2 & 83) << 1));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            MediaMetadataCompat = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 74 / 0;
            }
            return true;
        }
        if (!(obj instanceof isFullyVisible)) {
            int i8 = i2 + 37;
            MediaMetadataCompat = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i2 & 93;
            int i11 = -(-((i2 ^ 93) | i10));
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            MediaMetadataCompat = i12 % 128;
            if (i12 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        isFullyVisible isfullyvisible2 = (isFullyVisible) obj;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isfullyvisible.read, (Object) isfullyvisible2.read)) {
            int i13 = MediaMetadataCompat + 31;
            RatingCompat = i13 % 128;
            int i14 = i13 % 2;
            int iIdentityHashCode = System.identityHashCode(isfullyvisible);
            int i15 = ~iIdentityHashCode;
            int i16 = ~((i15 & 1862204910) | (1862204910 ^ i15));
            int i17 = i16 ^ 1223345504;
            int i18 = i16 & 1223345504;
            int i19 = 1600629982 + (((i18 & i17) | (i17 ^ i18)) * (-591));
            int i20 = (1291507182 | iIdentityHashCode) & 1794043232;
            int i21 = (i19 - (~(-(-((((iIdentityHashCode | 1862204910) & (~i20)) | i20) * 591))))) - 1;
            int iIdentityHashCode2 = System.identityHashCode(isfullyvisible);
            int i22 = ~iIdentityHashCode2;
            int i23 = (1788326375 & i22) | ((-1788326376) & iIdentityHashCode2);
            int i24 = 1788326375 & iIdentityHashCode2;
            int i25 = ~((i24 & i23) | (i23 ^ i24));
            int i26 = 545259715 & i25;
            int i27 = (i25 | 545259715) & (~i26);
            int i28 = ((i27 & i26) | (i27 ^ i26)) * 501;
            int i29 = ((1943923876 & i28) + (i28 | 1943923876)) - 1031139416;
            int i30 = (iIdentityHashCode2 | i22) & (~iIdentityHashCode2);
            int i31 = 713470435 ^ i30;
            int i32 = i30 & 713470435;
            int i33 = (i32 & i31) | (i31 ^ i32);
            int i34 = ((-1620115656) & i33) | ((~i33) & 1620115655);
            int i35 = i33 & 1620115655;
            int i36 = (~((i35 & i34) | (i34 ^ i35))) * 501;
            int i37 = i29 & i36;
            if (i21 <= ((i36 | i29) & (~i37)) + (i37 << 1)) {
                int i38 = 85 / 0;
            }
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isfullyvisible.IconCompatParcelizer, (Object) isfullyvisible2.IconCompatParcelizer)) {
            int i39 = RatingCompat;
            int i40 = ((i39 | 125) << 1) - (i39 ^ 125);
            MediaMetadataCompat = i40 % 128;
            int i41 = i40 % 2;
            int i42 = (-2) - ((i39 + 86) ^ (-1));
            MediaMetadataCompat = i42 % 128;
            if (i42 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isfullyvisible.write, (Object) isfullyvisible2.write)) {
            int i43 = MediaMetadataCompat;
            int i44 = ((i43 | 85) << 1) - (i43 ^ 85);
            int i45 = i44 % 128;
            RatingCompat = i45;
            int i46 = i44 % 2;
            int i47 = i45 + 5;
            MediaMetadataCompat = i47 % 128;
            if (i47 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isfullyvisible.RemoteActionCompatParcelizer, (Object) isfullyvisible2.RemoteActionCompatParcelizer)) {
            int i48 = MediaMetadataCompat;
            int i49 = i48 + 67;
            RatingCompat = i49 % 128;
            int i50 = i49 % 2;
            int i51 = i48 + 53;
            RatingCompat = i51 % 128;
            if (i51 % 2 != 0) {
                int i52 = 29 / 0;
            }
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isfullyvisible.AudioAttributesCompatParcelizer, (Object) isfullyvisible2.AudioAttributesCompatParcelizer)) {
            int i53 = RatingCompat;
            int i54 = (((i53 ^ 67) | (i53 & 67)) << 1) - ((i53 & (-68)) | ((~i53) & 67));
            MediaMetadataCompat = i54 % 128;
            int i55 = i54 % 2;
            int i56 = i53 & 69;
            int i57 = (i53 ^ 69) | i56;
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            MediaMetadataCompat = i58 % 128;
            if (i58 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isfullyvisible.AudioAttributesImplApi26Parcelizer, (Object) isfullyvisible2.AudioAttributesImplApi26Parcelizer)) {
            int i59 = MediaMetadataCompat;
            int i60 = i59 & 45;
            int i61 = (i60 - (~((i59 ^ 45) | i60))) - 1;
            RatingCompat = i61 % 128;
            int i62 = i61 % 2;
            return false;
        }
        if (!(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isfullyvisible.AudioAttributesImplApi21Parcelizer, (Object) isfullyvisible2.AudioAttributesImplApi21Parcelizer))) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isfullyvisible.MediaBrowserCompatCustomActionResultReceiver, (Object) isfullyvisible2.MediaBrowserCompatCustomActionResultReceiver)) {
                int i63 = RatingCompat;
                int i64 = (i63 & 55) + (i63 | 55);
                MediaMetadataCompat = i64 % 128;
                int i65 = i64 % 2;
                int i66 = (i63 & 35) + (i63 | 35);
                MediaMetadataCompat = i66 % 128;
                if (i66 % 2 != 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isfullyvisible.MediaBrowserCompatItemReceiver, (Object) isfullyvisible2.MediaBrowserCompatItemReceiver)) {
                int i67 = RatingCompat;
                int i68 = (i67 ^ 53) + ((i67 & 53) << 1);
                MediaMetadataCompat = i68 % 128;
                int i69 = i68 % 2;
                return false;
            }
            if (!(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isfullyvisible.AudioAttributesImplBaseParcelizer, isfullyvisible2.AudioAttributesImplBaseParcelizer))) {
                int i70 = RatingCompat;
                int i71 = (-2) - (((i70 & 8) + (i70 | 8)) ^ (-1));
                MediaMetadataCompat = i71 % 128;
                int i72 = i71 % 2;
                return true;
            }
            int i73 = RatingCompat;
            int i74 = i73 & 125;
            int i75 = i74 + ((i73 ^ 125) | i74);
            int i76 = i75 % 128;
            MediaMetadataCompat = i76;
            int i77 = i75 % 2;
            int i78 = i76 & 51;
            int i79 = (((i76 ^ 51) | i78) << 1) - ((i76 | 51) & (~i78));
            RatingCompat = i79 % 128;
            if (i79 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i80 = RatingCompat + 49;
        MediaMetadataCompat = i80 % 128;
        int i81 = i80 % 2;
        int iIdentityHashCode3 = System.identityHashCode(isfullyvisible);
        int i82 = ~iIdentityHashCode3;
        int i83 = (148696062 & i82) | ((~i82) & (-148696063));
        int i84 = i82 & (-148696063);
        int i85 = -(~(((i83 & i84) | (i83 ^ i84)) * 1324));
        int i86 = (((948831374 | i85) << 1) - (i85 ^ 948831374)) - 1;
        int i87 = (i82 & (-142904279)) | (142904278 & iIdentityHashCode3);
        int i88 = (-142904279) & iIdentityHashCode3;
        int i89 = ~((i87 & i88) | (i87 ^ i88));
        int i90 = iIdentityHashCode3 | (-14475519);
        int i91 = (i90 | (~i90)) & (~i90);
        int i92 = i89 & i91;
        int i93 = (i91 | i89) & (~i92);
        int i94 = -(-(((i93 & i92) | (i93 ^ i92)) * (-1324)));
        int i95 = i86 & i94;
        int i96 = (i94 | i86) & (~i95);
        int i97 = i95 << 1;
        int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
        int i99 = i98 ^ (-1801119376);
        int i100 = -(-(((-1801119376) & i98) << 1));
        int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
        int i102 = getHasMultipleThemes.read();
        int i103 = ~i102;
        int i104 = (-1116620180) & i103;
        int i105 = (~i104) & ((-1116620180) | i103);
        int i106 = ~((i104 & i105) | (i105 ^ i104));
        int i107 = (i106 & 1074004224) | ((~i106) & 1074004224) | ((-1074004225) & i106);
        int i108 = ((-223449613) & i103) | (i102 & 223449612) | ((-223449613) & i102);
        int i109 = (i108 | (~i108)) & (~i108);
        int i110 = ((i107 & i109) | (i107 ^ i109)) * (-252);
        int i111 = (441951783 & i110) + (i110 | 441951783);
        int i112 = ((i111 | 474727628) << 1) - (474727628 ^ i111);
        int i113 = (~i102) & (i103 | i102);
        int i114 = (-1116620180) ^ i113;
        int i115 = (-1116620180) & i113;
        int i116 = (i115 & i114) | (i114 ^ i115);
        int i117 = i116 & (-266065568);
        int i118 = (i116 | (-266065568)) & (~i117);
        int i119 = (i102 & (-223449613)) | (i103 & (-223449613)) | (i102 & 223449612);
        int i120 = -(-((((i119 | (~i119)) & (~i119)) | (~((i118 & i117) | (i118 ^ i117)))) * 252));
        int i121 = i112 & i120;
        int i122 = -(-((i120 ^ i112) | i121));
        if (i101 <= ((i121 | i122) << 1) - (i122 ^ i121)) {
            return false;
        }
        throw null;
    }
}
