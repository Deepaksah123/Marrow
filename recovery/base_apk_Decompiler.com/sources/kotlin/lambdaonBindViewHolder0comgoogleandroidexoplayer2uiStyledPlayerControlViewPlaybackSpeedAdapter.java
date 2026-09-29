package kotlin;

import com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda19;
import java.io.IOException;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0015"}, d2 = {"Lo/lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "Lo/StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "read", "RemoteActionCompatParcelizer", "write", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;", "()Lo/StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter {
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatItemReceiver = 1;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplApi21Parcelizer;
    private String read;
    private String write;

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i4 | i5);
        int i8 = (~i6) | (~i5);
        int i9 = (~i8) | i4;
        int i10 = (~(i5 | i6)) | (~((~i4) | i6)) | (~(i8 | i4));
        int i11 = i6 + i4 + i + ((-101282902) * i3) + ((-829309908) * i2);
        int i12 = i11 * i11;
        int i13 = ((i6 * 42798203) - 224002048) + (42798203 * i4) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i) + (1710751744 * i3) + ((-1643118592) * i2) + ((-1134166016) * i12);
        int i14 = (i6 * 1745018779) + 1790267665 + (i4 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i * 1745018721) + (i3 * (-1587019414)) + (i2 * (-1871011668)) + (i12 * 1017511936);
        switch (i13 + (i14 * i14 * (-1139146752))) {
            case 1:
                return read(objArr);
            case 2:
                return IconCompatParcelizer(objArr);
            case 3:
                return AudioAttributesCompatParcelizer(objArr);
            case 4:
                return RemoteActionCompatParcelizer(objArr);
            case 5:
                return MediaBrowserCompatItemReceiver(objArr);
            case 6:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 7:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 8:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 9:
                return AudioAttributesImplApi26Parcelizer(objArr);
            default:
                return write(objArr);
        }
    }

    private lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter(String str, String str2, String str3, String str4, String str5, String str6, StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, String str7) {
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.AudioAttributesImplBaseParcelizer = str6;
        this.MediaBrowserCompatCustomActionResultReceiver = styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;
        this.AudioAttributesImplApi21Parcelizer = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter(String str, String str2, String str3, String str4, String str5, String str6, StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, String str7, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda02;
        String str14 = null;
        if ((i & 1) != 0) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver;
            int i3 = i2 & 65;
            int i4 = i3 + ((i2 ^ 65) | i3);
            MediaBrowserCompatItemReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                str14.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            str8 = null;
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            int i6 = MediaBrowserCompatCustomActionResultReceiver;
            int i7 = ((i6 | 79) << 1) - (i6 ^ 79);
            MediaBrowserCompatItemReceiver = i7 % 128;
            int i8 = i7 % 2;
            int i9 = ((i6 & 89) - (~(-(-(i6 | 89))))) - 1;
            MediaBrowserCompatItemReceiver = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            str9 = null;
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            int i11 = MediaBrowserCompatItemReceiver;
            int i12 = i11 & 39;
            int i13 = i11 | 39;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            int i15 = i14 % 128;
            MediaBrowserCompatCustomActionResultReceiver = i15;
            int i16 = i14 % 2;
            int i17 = i15 + 107;
            MediaBrowserCompatItemReceiver = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 3 / 2;
            } else {
                int i19 = 2 % 2;
            }
            str10 = null;
        } else {
            str10 = str3;
        }
        if ((i & 8) != 0) {
            int i20 = MediaBrowserCompatCustomActionResultReceiver;
            int i21 = (i20 & 81) + (i20 | 81);
            int i22 = i21 % 128;
            MediaBrowserCompatItemReceiver = i22;
            int i23 = i21 % 2;
            int i24 = i22 & 13;
            int i25 = (i24 - (~((i22 ^ 13) | i24))) - 1;
            MediaBrowserCompatCustomActionResultReceiver = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 2 % 2;
            }
            str11 = null;
        } else {
            str11 = str4;
        }
        if ((i & 16) != 0) {
            int i27 = MediaBrowserCompatItemReceiver;
            int i28 = (((i27 ^ 75) | (i27 & 75)) << 1) - (((~i27) & 75) | (i27 & (-76)));
            MediaBrowserCompatCustomActionResultReceiver = i28 % 128;
            if (i28 % 2 != 0) {
                str14.hashCode();
                throw null;
            }
            int i29 = 2 % 2;
            str12 = null;
        } else {
            str12 = str5;
        }
        if ((i & 32) != 0) {
            int i30 = MediaBrowserCompatCustomActionResultReceiver + 11;
            MediaBrowserCompatItemReceiver = i30 % 128;
            if (i30 % 2 == 0) {
                int i31 = 72 / 0;
            }
            int i32 = 2 % 2;
            str13 = null;
        } else {
            str13 = str6;
        }
        if ((i & 64) != 0) {
            int i33 = MediaBrowserCompatCustomActionResultReceiver;
            int i34 = i33 & 121;
            int i35 = (((i33 | 121) & (~i34)) - (~(i34 << 1))) - 1;
            MediaBrowserCompatItemReceiver = i35 % 128;
            if (i35 % 2 == 0) {
                throw null;
            }
            int i36 = 2 % 2;
            styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda02 = null;
        } else {
            styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda02 = styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;
        }
        if ((i & 128) != 0) {
            int i37 = MediaBrowserCompatItemReceiver;
            int i38 = (((i37 & (-124)) | ((~i37) & 123)) - (~((i37 & 123) << 1))) - 1;
            MediaBrowserCompatCustomActionResultReceiver = i38 % 128;
            int i39 = i38 % 2;
            int i40 = (-2) - ((((i37 | 118) << 1) - (i37 ^ 118)) ^ (-1));
            MediaBrowserCompatCustomActionResultReceiver = i40 % 128;
            int i41 = i40 % 2;
            int i42 = 2 % 2;
        } else {
            str14 = str7;
        }
        this(str8, str9, str10, str11, str12, str13, styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda02, str14);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = ((((i2 ^ 19) | (i2 & 19)) << 1) - (~(-(((~i2) & 19) | (i2 & (-20)))))) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        String str = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesCompatParcelizer;
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = (-2) - ((MediaBrowserCompatCustomActionResultReceiver + 104) ^ (-1));
        int i3 = i2 % 128;
        MediaBrowserCompatItemReceiver = i3;
        int i4 = i2 % 2;
        String str = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.read;
        int i5 = i3 & 29;
        int i6 = ((i3 ^ 29) | i5) << 1;
        int i7 = -((i3 | 29) & (~i5));
        int i8 = (i6 & i7) + (i6 | i7);
        MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 & 65;
        int i4 = ((i2 ^ 65) | i3) << 1;
        int i5 = -((i2 | 65) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        MediaBrowserCompatItemReceiver = i7;
        int i8 = i6 % 2;
        String str = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.write;
        int i9 = (i7 ^ 11) + ((i7 & 11) << 1);
        MediaBrowserCompatCustomActionResultReceiver = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = (((i2 | 38) << 1) - (i2 ^ 38)) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        String str = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.IconCompatParcelizer;
        int i5 = (i2 & 97) + (i2 | 97);
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = (i2 ^ 111) + ((i2 & 111) << 1);
        int i4 = i3 % 128;
        MediaBrowserCompatItemReceiver = i4;
        int i5 = i3 % 2;
        String str = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.RemoteActionCompatParcelizer;
        int i6 = i4 + 17;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 & 79;
        int i4 = (i3 - (~((i2 ^ 79) | i3))) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        String str = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesImplBaseParcelizer;
        int i6 = i2 & 65;
        int i7 = -(-((i2 ^ 65) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 92 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 & 39;
        int i4 = (i2 ^ 39) | i3;
        int i5 = (i3 & i4) + (i3 | i4);
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.MediaBrowserCompatCustomActionResultReceiver;
        int i7 = (((i2 | 37) << 1) - (~(-(i2 ^ 37)))) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
        if (i7 % 2 == 0) {
            return styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;
        }
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 & 103;
        int i4 = (i3 - (~(-(-((i2 ^ 103) | i3))))) - 1;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        String str = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesImplApi21Parcelizer;
        if (i5 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object p0) {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return ((Boolean) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this, p0}, iRemoteActionCompatParcelizer3, 817865454, iRemoteActionCompatParcelizer, -817865449)).booleanValue();
    }

    public final String AudioAttributesCompatParcelizer() {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, -76570058, iRemoteActionCompatParcelizer, 76570061);
    }

    public final String RemoteActionCompatParcelizer() {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, -1083521343, iRemoteActionCompatParcelizer, 1083521350);
    }

    public final String IconCompatParcelizer() {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, 228726344, iRemoteActionCompatParcelizer, -228726335);
    }

    public final String write() {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, -818269708, iRemoteActionCompatParcelizer, 818269708);
    }

    public final String read() {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, -706132044, iRemoteActionCompatParcelizer, 706132048);
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, -1939427458, iRemoteActionCompatParcelizer, 1939427460);
    }

    public final StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 AudioAttributesImplApi21Parcelizer() {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return (StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, -2021133927, iRemoteActionCompatParcelizer, 2021133928);
    }

    public final String MediaBrowserCompatItemReceiver() {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return (String) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, -194583858, iRemoteActionCompatParcelizer, 194583864);
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        return ((Integer) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, 413512249, iRemoteActionCompatParcelizer, -413512241)).intValue();
    }

    public final String toString() {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = (i2 & (-104)) | ((~i2) & 103);
        int i4 = -(-((i2 & 103) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        String str3 = this.AudioAttributesCompatParcelizer;
        String str4 = this.read;
        if (i6 != 0) {
            str = this.write;
            str2 = this.IconCompatParcelizer;
            int i7 = 82 / 0;
        } else {
            str = this.write;
            str2 = this.IconCompatParcelizer;
        }
        String str5 = this.RemoteActionCompatParcelizer;
        String str6 = this.AudioAttributesImplBaseParcelizer;
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str7 = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter(AudioAttributesCompatParcelizer=");
        int i8 = MediaBrowserCompatItemReceiver + 91;
        MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
        int i9 = i8 % 2;
        sb.append(str3);
        if (i9 != 0) {
            sb.append(", bandwidth=");
            sb.append(str4);
            sb.append(", codecs=");
            int i10 = 30 / 0;
        } else {
            sb.append(", read=");
            sb.append(str4);
            sb.append(", write=");
        }
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(", RemoteActionCompatParcelizer=");
        int i11 = MediaBrowserCompatItemReceiver;
        int i12 = i11 & 3;
        int i13 = (((i11 | 3) & (~i12)) - (~(i12 << 1))) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i13 % 128;
        int i14 = i13 % 2;
        sb.append(str5);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(str6);
        int i15 = MediaBrowserCompatItemReceiver;
        int i16 = (i15 & (-28)) | ((~i15) & 27);
        int i17 = (i15 & 27) << 1;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        MediaBrowserCompatCustomActionResultReceiver = i18 % 128;
        int i19 = i18 % 2;
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(str7);
        int i20 = MediaBrowserCompatItemReceiver;
        int i21 = i20 & 69;
        int i22 = (i21 - (~(-(-((i20 ^ 69) | i21))))) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i22 % 128;
        int i23 = i22 % 2;
        sb.append(")");
        String string = sb.toString();
        int i24 = MediaBrowserCompatCustomActionResultReceiver;
        int i25 = (i24 ^ 123) + ((i24 & 123) << 1);
        MediaBrowserCompatItemReceiver = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 16 / 0;
        }
        return string;
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 133);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 96);
        downloadHelper2.AudioAttributesCompatParcelizer(this.read);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 41);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 159);
        downloadHelper2.AudioAttributesCompatParcelizer(this.write);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 92);
        downloadHelper2.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 47);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        if (this != this.MediaBrowserCompatCustomActionResultReceiver) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 35);
            StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = this.MediaBrowserCompatCustomActionResultReceiver;
            sendSetRequirements.write(setdownloadingstatestoqueued, StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.class, styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0).read(downloadHelper2, styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 58);
        downloadHelper2.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        if (i == 5) {
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
        if (i == 59) {
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
        if (i == 73) {
            if (!z) {
                this.AudioAttributesImplBaseParcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.AudioAttributesImplBaseParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                return;
            } else {
                this.AudioAttributesImplBaseParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                return;
            }
        }
        if (i == 99) {
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
        if (i == 139) {
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
        if (i == 159) {
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
        if (i == 171) {
            if (z) {
                this.MediaBrowserCompatCustomActionResultReceiver = (StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0) setdownloadingstatestoqueued.read(StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                return;
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                return;
            }
        }
        if (i != 175) {
            downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
            return;
        }
        if (!z) {
            this.AudioAttributesImplApi21Parcelizer = null;
            downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
        } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
            this.AudioAttributesImplApi21Parcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
        } else {
            this.AudioAttributesImplApi21Parcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 ^ 103;
        int i4 = -(-((i2 & 103) << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        int i6 = i5 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i6;
        int i7 = i5 % 2;
        if (lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter == obj) {
            int i8 = i2 ^ 87;
            int i9 = ((i2 & 87) | i8) << 1;
            int i10 = -i8;
            int i11 = (i9 & i10) + (i10 | i9);
            MediaBrowserCompatCustomActionResultReceiver = i11 % 128;
            return Boolean.valueOf(i11 % 2 == 0);
        }
        if (!(obj instanceof lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter)) {
            int i12 = i6 & 53;
            int i13 = i6 | 53;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            int i15 = i14 % 128;
            MediaBrowserCompatItemReceiver = i15;
            int i16 = i14 % 2;
            int i17 = i15 ^ 15;
            int i18 = (i15 & 15) << 1;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            MediaBrowserCompatCustomActionResultReceiver = i19 % 128;
            int i20 = i19 % 2;
            return false;
        }
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter2 = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) obj;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesCompatParcelizer, (Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter2.AudioAttributesCompatParcelizer)) {
            int i21 = MediaBrowserCompatCustomActionResultReceiver;
            int i22 = i21 ^ 53;
            int i23 = (i21 & 53) << 1;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            MediaBrowserCompatItemReceiver = i24 % 128;
            int i25 = i24 % 2;
            return false;
        }
        Object obj2 = null;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.read, (Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter2.read)) {
            int i26 = MediaBrowserCompatCustomActionResultReceiver + 121;
            int i27 = i26 % 128;
            MediaBrowserCompatItemReceiver = i27;
            int i28 = i26 % 2;
            int i29 = ((i27 | 23) << 1) - (i27 ^ 23);
            MediaBrowserCompatCustomActionResultReceiver = i29 % 128;
            if (i29 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.write, (Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter2.write)) {
            int i30 = MediaBrowserCompatItemReceiver;
            int i31 = ((i30 & 64) + (i30 | 64)) - 1;
            MediaBrowserCompatCustomActionResultReceiver = i31 % 128;
            int i32 = i31 % 2;
            int i33 = (i30 & (-12)) | ((~i30) & 11);
            int i34 = (i30 & 11) << 1;
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            MediaBrowserCompatCustomActionResultReceiver = i35 % 128;
            if (i35 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.IconCompatParcelizer, (Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter2.IconCompatParcelizer)) {
            int i36 = MediaBrowserCompatItemReceiver + 91;
            int i37 = i36 % 128;
            MediaBrowserCompatCustomActionResultReceiver = i37;
            int i38 = i36 % 2;
            int i39 = i37 & 105;
            int i40 = i39 + ((i37 ^ 105) | i39);
            MediaBrowserCompatItemReceiver = i40 % 128;
            int i41 = i40 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.RemoteActionCompatParcelizer, (Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter2.RemoteActionCompatParcelizer)) {
            int i42 = MediaBrowserCompatItemReceiver;
            int i43 = i42 & 103;
            int i44 = (i43 - (~((i42 ^ 103) | i43))) - 1;
            MediaBrowserCompatCustomActionResultReceiver = i44 % 128;
            int i45 = i44 % 2;
            int i46 = (i42 ^ 51) + ((i42 & 51) << 1);
            MediaBrowserCompatCustomActionResultReceiver = i46 % 128;
            if (i46 % 2 != 0) {
                int i47 = 74 / 0;
            }
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesImplBaseParcelizer, (Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter2.AudioAttributesImplBaseParcelizer)) {
            int i48 = MediaBrowserCompatCustomActionResultReceiver;
            int i49 = ((i48 ^ 126) + ((i48 & 126) << 1)) - 1;
            int i50 = i49 % 128;
            MediaBrowserCompatItemReceiver = i50;
            int i51 = i49 % 2;
            int i52 = i50 & 35;
            int i53 = ((i50 | 35) & (~i52)) + (i52 << 1);
            MediaBrowserCompatCustomActionResultReceiver = i53 % 128;
            int i54 = i53 % 2;
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.MediaBrowserCompatCustomActionResultReceiver, lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter2.MediaBrowserCompatCustomActionResultReceiver)) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesImplApi21Parcelizer, (Object) lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter2.AudioAttributesImplApi21Parcelizer)) {
                int i55 = MediaBrowserCompatItemReceiver + 29;
                MediaBrowserCompatCustomActionResultReceiver = i55 % 128;
                int i56 = i55 % 2;
                return false;
            }
            int i57 = MediaBrowserCompatItemReceiver;
            int i58 = ((i57 | 109) << 1) - (i57 ^ 109);
            MediaBrowserCompatCustomActionResultReceiver = i58 % 128;
            if (i58 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i59 = MediaBrowserCompatItemReceiver;
        int i60 = i59 & 59;
        int i61 = ((i59 ^ 59) | i60) << 1;
        int i62 = -((i59 | 59) & (~i60));
        int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
        int i64 = i63 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i64;
        int i65 = i63 % 2;
        int i66 = i64 + 107;
        MediaBrowserCompatItemReceiver = i66 % 128;
        if (i66 % 2 == 0) {
            int i67 = 48 / 0;
        }
        return false;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        String str;
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i2;
        int iHashCode7;
        int iHashCode8;
        int i3;
        int i4;
        int i5;
        int i6;
        int iRemoteActionCompatParcelizer;
        int i7;
        int i8;
        int i9;
        int i10;
        lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter = (lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter) objArr[0];
        int i11 = 2 % 2;
        int i12 = MediaBrowserCompatCustomActionResultReceiver;
        int i13 = (i12 ^ 123) + ((i12 & 123) << 1);
        MediaBrowserCompatItemReceiver = i13 % 128;
        if (i13 % 2 == 0) {
            str = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesCompatParcelizer;
            if (str == null) {
                i = 1;
                int i14 = ((i12 & 4) + (i12 | 4)) - 1;
                MediaBrowserCompatItemReceiver = i14 % 128;
                int i15 = i14 % 2;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = str.hashCode();
                int i16 = MediaBrowserCompatCustomActionResultReceiver;
                int i17 = (i16 ^ 109) + ((i16 & 109) << 1);
                MediaBrowserCompatItemReceiver = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            str = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesCompatParcelizer;
            if (str == null) {
                i = 0;
                int i142 = ((i12 & 4) + (i12 | 4)) - 1;
                MediaBrowserCompatItemReceiver = i142 % 128;
                int i152 = i142 % 2;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = str.hashCode();
                int i162 = MediaBrowserCompatCustomActionResultReceiver;
                int i172 = (i162 ^ 109) + ((i162 & 109) << 1);
                MediaBrowserCompatItemReceiver = i172 % 128;
                int i182 = i172 % 2;
            }
        }
        String str2 = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.read;
        if (str2 == null) {
            int i19 = MediaBrowserCompatCustomActionResultReceiver;
            int i20 = i19 & 59;
            int i21 = -(-(i19 | 59));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            int i23 = i22 % 128;
            MediaBrowserCompatItemReceiver = i23;
            int i24 = i22 % 2;
            int i25 = i23 + 93;
            MediaBrowserCompatCustomActionResultReceiver = i25 % 128;
            int i26 = i25 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
            System.identityHashCode(lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter);
            SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
        }
        String str3 = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.write;
        if (str3 == null) {
            int i27 = MediaBrowserCompatItemReceiver + 25;
            int i28 = i27 % 128;
            MediaBrowserCompatCustomActionResultReceiver = i28;
            int i29 = i27 % 2;
            int i30 = i28 & 47;
            int i31 = (i28 | 47) & (~i30);
            int i32 = -(-(i30 << 1));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            MediaBrowserCompatItemReceiver = i33 % 128;
            int i34 = i33 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str3.hashCode();
            int iIdentityHashCode = System.identityHashCode(lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter);
            int i35 = ~iIdentityHashCode;
            int i36 = -(-((((-402661403) & i35) | ((-402661403) ^ i35)) * 494));
            int i37 = ((-1715633583) & i36) + (i36 | (-1715633583));
            int i38 = (iIdentityHashCode | i35) & (~iIdentityHashCode);
            int i39 = i38 & (-429259327);
            int i40 = (i38 | (-429259327)) & (~i39);
            int i41 = (i40 & i39) | (i40 ^ i39);
            int i42 = (i41 | (~i41)) & (~i41);
            int i43 = (i42 & (-467532800)) | ((~i42) & (-467532800)) | (467532799 & i42);
            int i44 = i43 & 26597924;
            int i45 = (i43 | 26597924) & (~i44);
            int i46 = -(-(((i45 & i44) | (i45 ^ i44)) * 494));
            int i47 = (i37 ^ i46) + ((i46 & i37) << 1);
            int iRemoteActionCompatParcelizer2 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int i48 = ~iRemoteActionCompatParcelizer2;
            int i49 = ~((i48 & (-1343627388)) | ((~i48) & (-1343627388)) | (i48 & 1343627387));
            int i50 = 981532335 - (~(-(-(((i49 & (-1544130680)) | ((-1544130680) ^ i49)) * 226))));
            int i51 = 1544130679 & iRemoteActionCompatParcelizer2;
            int i52 = (~i51) & (1544130679 | iRemoteActionCompatParcelizer2);
            int i53 = ~iRemoteActionCompatParcelizer2;
            int i54 = ~((i52 ^ i51) | (i51 & i52));
            int i55 = ((-1545580672) ^ i54) | (i54 & (-1545580672));
            int i56 = (~iRemoteActionCompatParcelizer2) & (i53 | iRemoteActionCompatParcelizer2);
            int i57 = (-1343627388) & i56;
            int i58 = (i56 | (-1343627388)) & (~i57);
            int i59 = (i57 & i58) | (i58 ^ i57);
            int i60 = i59 & (-1544130680);
            int i61 = ~(((i59 | (-1544130680)) & (~i60)) | i60);
            int i62 = i55 & i61;
            int i63 = (i55 | i61) & (~i62);
            int i64 = -(-(((i63 & i62) | (i63 ^ i62)) * (-113)));
            int i65 = i50 & i64;
            int i66 = -(-((i64 ^ i50) | i65));
            int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
            int i68 = ((-1343627388) & i53) | (1343627387 & iRemoteActionCompatParcelizer2);
            int i69 = (-1343627388) & iRemoteActionCompatParcelizer2;
            int i70 = (~((i68 & i69) | (i68 ^ i69))) * 113;
            int i71 = i67 ^ i70;
            int i72 = (i70 & i67) << 1;
            if (i47 > ((i71 | i72) << 1) - (i72 ^ i71)) {
                int i73 = 3 / 5;
            }
        }
        String str4 = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.IconCompatParcelizer;
        if (str4 == null) {
            int i74 = MediaBrowserCompatCustomActionResultReceiver + 81;
            int i75 = i74 % 128;
            MediaBrowserCompatItemReceiver = i75;
            int i76 = i74 % 2;
            int i77 = i75 ^ 63;
            int i78 = ((i75 & 63) | i77) << 1;
            int i79 = -i77;
            int i80 = (i78 & i79) + (i79 | i78);
            MediaBrowserCompatCustomActionResultReceiver = i80 % 128;
            int i81 = i80 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str4.hashCode();
            int i82 = MediaBrowserCompatCustomActionResultReceiver;
            int i83 = (i82 & 61) + (i82 | 61);
            MediaBrowserCompatItemReceiver = i83 % 128;
            int i84 = i83 % 2;
        }
        String str5 = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.RemoteActionCompatParcelizer;
        if (str5 == null) {
            int i85 = MediaBrowserCompatCustomActionResultReceiver;
            int i86 = i85 & 109;
            int i87 = (i85 | 109) & (~i86);
            int i88 = -(-(i86 << 1));
            int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
            int i90 = i89 % 128;
            MediaBrowserCompatItemReceiver = i90;
            int i91 = i89 % 2;
            int i92 = ((i90 & 8) + (i90 | 8)) - 1;
            MediaBrowserCompatCustomActionResultReceiver = i92 % 128;
            int i93 = i92 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str5.hashCode();
            int i94 = MediaBrowserCompatItemReceiver;
            int i95 = ((i94 ^ 29) | (i94 & 29)) << 1;
            int i96 = -(((~i94) & 29) | (i94 & (-30)));
            int i97 = (i95 & i96) + (i96 | i95);
            MediaBrowserCompatCustomActionResultReceiver = i97 % 128;
            int i98 = i97 % 2;
        }
        String str6 = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesImplBaseParcelizer;
        if (str6 == null) {
            int i99 = MediaBrowserCompatItemReceiver;
            int i100 = i99 ^ 57;
            int i101 = ((((i99 & 57) | i100) << 1) - (~(-i100))) - 1;
            MediaBrowserCompatCustomActionResultReceiver = i101 % 128;
            int i102 = i101 % 2;
            int i103 = i99 & 103;
            int i104 = (i99 | 103) & (~i103);
            int i105 = -(-(i103 << 1));
            int i106 = (i104 ^ i105) + ((i104 & i105) << 1);
            MediaBrowserCompatCustomActionResultReceiver = i106 % 128;
            i2 = 2;
            int i107 = i106 % 2;
            iHashCode7 = 0;
        } else {
            i2 = 2;
            iHashCode7 = str6.hashCode();
            int i108 = MediaBrowserCompatCustomActionResultReceiver + 121;
            MediaBrowserCompatItemReceiver = i108 % 128;
            int i109 = i108 % 2;
        }
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.MediaBrowserCompatCustomActionResultReceiver;
        if (styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 == null) {
            int i110 = MediaBrowserCompatItemReceiver + 123;
            MediaBrowserCompatCustomActionResultReceiver = i110 % 128;
            int i111 = i110 % i2;
            iHashCode8 = 0;
        } else {
            iHashCode8 = styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.hashCode();
            int i112 = MediaBrowserCompatCustomActionResultReceiver;
            int i113 = i112 & 45;
            int i114 = (i112 | 45) & (~i113);
            int i115 = i113 << 1;
            int i116 = (i114 & i115) + (i114 | i115);
            MediaBrowserCompatItemReceiver = i116 % 128;
            int i117 = i116 % 2;
        }
        String str7 = lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter.AudioAttributesImplApi21Parcelizer;
        if (str7 != null) {
            int i118 = MediaBrowserCompatItemReceiver;
            int i119 = i118 & 73;
            int i120 = i119 + ((i118 ^ 73) | i119);
            MediaBrowserCompatCustomActionResultReceiver = i120 % 128;
            int i121 = i120 % 2;
            iHashCode = str7.hashCode();
            if (i121 != 0) {
                int i122 = 59 / 0;
            }
            int i123 = MediaBrowserCompatCustomActionResultReceiver;
            int i124 = (i123 & 37) + (i123 | 37);
            MediaBrowserCompatItemReceiver = i124 % 128;
            int i125 = i124 % 2;
        }
        int i126 = iHashCode2 * 31;
        int i127 = ((i126 & iHashCode3) + (i126 | iHashCode3)) * 31;
        int i128 = ((((~iHashCode4) & i127) | ((~i127) & iHashCode4)) - (~((i127 & iHashCode4) << 1))) - 1;
        int i129 = i128 * 31;
        int iIdentityHashCode2 = System.identityHashCode(lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter);
        int i130 = iHashCode5 * (-419);
        int i131 = i128 * 13051;
        int i132 = MediaBrowserCompatCustomActionResultReceiver;
        int i133 = (i132 & 5) + (i132 | 5);
        int i134 = i133 % 128;
        MediaBrowserCompatItemReceiver = i134;
        if (i133 % 2 == 0) {
            int i135 = i130 / i131;
            int i136 = (i129 ^ iIdentityHashCode2) | (i129 & iIdentityHashCode2);
            int i137 = i135 << (UnixStat.DEFAULT_FILE_PERM / ((i136 | (~i136)) & (~i136)));
            int i138 = ~iHashCode5;
            int i139 = i129 & i138;
            int i140 = (~i139) & (i129 | i138);
            int i141 = -(-((i139 & i140) | (i140 ^ i139)));
            int i143 = i141 & (-420);
            i3 = i137 >> ((i143 - (~((i141 ^ (-420)) | i143))) - 1);
            int i144 = (iHashCode5 | i138) & (~iHashCode5);
            int i145 = (~i129) & ((~i129) | i129);
            int i146 = i144 ^ i145;
            int i147 = i144 & i145;
            i4 = (i147 & i146) | (i146 ^ i147);
        } else {
            int i148 = -(~(-(-i131)));
            int i149 = (-2) - (((i130 ^ i148) + ((i148 & i130) << 1)) ^ (-1));
            int i150 = (i129 ^ iIdentityHashCode2) | (i129 & iIdentityHashCode2);
            int i151 = -(-(((i150 | (~i150)) & (~i150)) * UnixStat.DEFAULT_FILE_PERM));
            int i153 = ((i149 & i151) - (~(-(-(i149 | i151))))) - 1;
            int i154 = ~iHashCode5;
            int i155 = i129 & i154;
            int i156 = -(-((i155 | ((~i155) & (i129 | i154))) * (-420)));
            int i157 = i153 & i156;
            int i158 = (i156 ^ i153) | i157;
            i3 = ((i158 & i157) << 1) + (i157 ^ i158);
            int i159 = (~i129) & ((~i129) | i129);
            int i160 = i154 & i159;
            i4 = ((i154 | i159) & (~i160)) | i160;
        }
        int i161 = ~i4;
        int i163 = ~iIdentityHashCode2;
        int i164 = i134 + 1;
        MediaBrowserCompatCustomActionResultReceiver = i164 % 128;
        if (i164 % 2 != 0) {
            int i165 = ~((i129 & i163) | (i163 ^ i129));
            int i166 = i161 & i165;
            int i167 = i3 % (UnixStat.DEFAULT_FILE_PERM / (((i161 | i165) & (~i166)) | i166));
            i5 = (((i167 | 48) << 1) - (i167 ^ 48)) - 1;
            iRemoteActionCompatParcelizer = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            i6 = (615 % iHashCode6) >>> ((-613) >> i5);
        } else {
            int i168 = i163 & i129;
            int i169 = (i129 | i163) & (~i168);
            int i170 = (i3 - (~(-(~(UnixStat.DEFAULT_FILE_PERM * (i161 | (~((i169 & i168) | (i169 ^ i168))))))))) - 2;
            i5 = i170 * 31;
            int iRemoteActionCompatParcelizer3 = SimpleBasePlayer$$ExternalSyntheticLambda19.RemoteActionCompatParcelizer();
            int i171 = iHashCode6 * 615;
            int i173 = -(-(i170 * (-19003)));
            int i174 = i171 & i173;
            int i175 = (i173 | i171) & (~i174);
            int i176 = -(-(i174 << 1));
            i6 = ((i175 | i176) << 1) - (i175 ^ i176);
            iRemoteActionCompatParcelizer = iRemoteActionCompatParcelizer3;
        }
        int i177 = ~iHashCode6;
        int i178 = ~i5;
        int i179 = (i177 & i178) | ((~i177) & i5);
        int i180 = i177 & i5;
        int i181 = ~((i179 & i180) | (i179 ^ i180));
        int i183 = (i181 & iRemoteActionCompatParcelizer) | (iRemoteActionCompatParcelizer ^ i181);
        int i184 = ~i5;
        int i185 = i178 | i5;
        int i186 = i184 & i185;
        int i187 = ~(((~i186) & iHashCode6) | (i186 & i177) | (i186 & iHashCode6));
        int i188 = ((~i187) & i183) | ((~i183) & i187);
        int i189 = i187 & i183;
        int i190 = -(-(((i189 & i188) | (i188 ^ i189)) * 614));
        int i191 = i6 & i190;
        int i192 = -(-(i6 | i190));
        int i193 = ((i191 | i192) << 1) - (i192 ^ i191);
        int i194 = (~iHashCode6) & (i177 | iHashCode6);
        int i195 = ~iRemoteActionCompatParcelizer;
        int i196 = ~((i194 ^ i195) | (i194 & i195));
        int i197 = ~((i177 & i178) | ((~i177) & i5) | (i177 & i5));
        int i198 = iHashCode;
        int i199 = iHashCode8;
        int i200 = ((~i197) & i196) | ((~i196) & i197);
        int i201 = i196 & i197;
        int i202 = (i200 & i201) | (i200 ^ i201);
        int i203 = MediaBrowserCompatCustomActionResultReceiver;
        int i204 = (((i203 | 39) << 1) - (~(-((i203 & (-40)) | ((~i203) & 39))))) - 1;
        MediaBrowserCompatItemReceiver = i204 % 128;
        if (i204 % 2 == 0) {
            int i205 = (iRemoteActionCompatParcelizer | (~iRemoteActionCompatParcelizer)) & i195;
            int i206 = ~((i205 & i178) | ((~i205) & i5) | (i205 & i5));
            int i207 = -((i202 & i206) | (i202 ^ i206));
            int i208 = i207 & (-1228);
            i7 = i193 / (((i207 | (-1228)) & (~i208)) + (i208 << 1));
            int i209 = ((~i178) & i177) | ((~i177) & i178);
            int i210 = i177 & i178;
            int i211 = (i209 & i210) | (i209 ^ i210);
            i8 = ~((i211 & i195) | ((~i195) & i211) | ((~i211) & i195));
            int i212 = i205 & iHashCode6;
            int i213 = ((iHashCode6 | i205) & (~i212)) | i212;
            int i214 = i213 & i5;
            int i215 = (i5 | i213) & (~i214);
            int i216 = (i215 & i214) | (i215 ^ i214);
            i9 = (i216 | (~i216)) & (~i216);
        } else {
            int i217 = i195 ^ i5;
            int i218 = i195 & i5;
            int i219 = ~((i217 & i218) | (i217 ^ i218));
            int i220 = i202 & i219;
            int i221 = (i202 | i219) & (~i220);
            int i222 = -(-(((i221 & i220) | (i221 ^ i220)) * (-1228)));
            int i223 = i193 ^ i222;
            i7 = (((i222 & i193) | i223) << 1) - i223;
            int i224 = i184 & i185;
            int i225 = (i224 & i194) | ((~i224) & i194) | ((~i194) & i224);
            int i226 = i225 ^ i195;
            int i227 = i225 & i195;
            i8 = ~((i227 & i226) | (i226 ^ i227));
            int i228 = ~iRemoteActionCompatParcelizer;
            int i229 = (i228 & i177) | ((~i228) & iHashCode6);
            int i230 = iHashCode6 & i228;
            int i231 = (i230 & i229) | (i229 ^ i230);
            int i232 = i231 ^ i5;
            int i233 = i5 & i231;
            i9 = ~((i233 & i232) | (i232 ^ i233));
        }
        int i234 = i8 & i9;
        int i235 = (i9 | i8) & (~i234);
        int i236 = -(-(614 * ((i235 & i234) | (i235 ^ i234))));
        int i237 = ((i7 ^ i236) | (i7 & i236)) << 1;
        int i238 = -((i236 & (~i7)) | ((~i236) & i7));
        int i239 = ((i237 | i238) << 1) - (i238 ^ i237);
        int i240 = i239 * 31;
        int iIdentityHashCode3 = System.identityHashCode(lambdaonbindviewholder0comgoogleandroidexoplayer2uistyledplayercontrolviewplaybackspeedadapter);
        int i241 = iHashCode7 * 471;
        int i242 = -(~(-(-(i239 * 14601))));
        int i243 = (i241 & i242) + (i241 | i242);
        int i244 = (i243 ^ (-1)) + (i243 << 1);
        int i245 = MediaBrowserCompatCustomActionResultReceiver;
        int i246 = i245 & 33;
        int i247 = (((i245 ^ 33) | i246) << 1) - ((~i246) & (i245 | 33));
        int i248 = i247 % 128;
        MediaBrowserCompatItemReceiver = i248;
        int i249 = i247 % 2;
        int i250 = iHashCode7 & i240;
        int i251 = (~i250) & (iHashCode7 | i240);
        int i252 = ~i240;
        int i253 = ((i250 & i251) | (i251 ^ i250)) * (-470);
        int i254 = (((i244 ^ i253) | (i244 & i253)) << 1) - (((~i244) & i253) | ((~i253) & i244));
        int i255 = (~iHashCode7) & ((~iHashCode7) | iHashCode7);
        int i256 = ~i240;
        int i257 = i252 | i240;
        int i258 = i256 & i257;
        int i259 = i255 & i258;
        int i260 = (i255 | i258) & (~i259);
        int i261 = ~((i260 & i259) | (i260 ^ i259));
        int i262 = i256 & i257;
        int i263 = ~iIdentityHashCode3;
        int i264 = (i262 & i263) | ((~i262) & iIdentityHashCode3);
        int i265 = i262 & iIdentityHashCode3;
        int i266 = ~((i265 & i264) | (i264 ^ i265));
        int i267 = i261 & i266;
        int i268 = ((i261 | i266) & (~i267)) | i267;
        int i269 = (~iIdentityHashCode3) & (i263 | iIdentityHashCode3);
        int i270 = i269 ^ iHashCode7;
        int i271 = i269 & iHashCode7;
        int i272 = ~((i271 & i270) | (i270 ^ i271) | i240);
        int i273 = i268 ^ i272;
        int i274 = i268 & i272;
        int i275 = ((i274 & i273) | (i273 ^ i274)) * (-470);
        int i276 = i254 & i275;
        int i277 = -(-((i275 ^ i254) | i276));
        int i278 = (i276 & i277) + (i277 | i276);
        int i279 = i248 ^ 69;
        int i280 = ((i248 & 69) | i279) << 1;
        int i281 = -i279;
        int i282 = ((i280 | i281) << 1) - (i281 ^ i280);
        MediaBrowserCompatCustomActionResultReceiver = i282 % 128;
        if (i282 % 2 != 0) {
            int i283 = (~i240) & i257;
            int i284 = (i283 & iHashCode7) | (i283 ^ iHashCode7);
            int i285 = i284 ^ iIdentityHashCode3;
            int i286 = iIdentityHashCode3 & i284;
            int i287 = (i286 & i285) | (i285 ^ i286);
            int i288 = (i287 | (~i287)) & (~i287);
            int i289 = i263 & iHashCode7;
            int i290 = (~i289) & (i263 | iHashCode7);
            int i291 = (i289 & i290) | (i290 ^ i289);
            int i292 = i291 & i240;
            int i293 = ~(((i240 | i291) & (~i292)) | i292);
            int i294 = i278 % (470 % ((i293 & i288) | (i288 ^ i293)));
            int i295 = (((i294 ^ 24) + ((i294 & 24) << 1)) << i199) << 26;
            int i296 = i295 & i198;
            int i297 = -(-((i295 ^ i198) | i296));
            i10 = (i296 & i297) + (i297 | i296);
        } else {
            int i298 = (i252 ^ iHashCode7) | (i252 & iHashCode7);
            int i299 = i298 ^ iIdentityHashCode3;
            int i300 = iIdentityHashCode3 & i298;
            int i301 = ~((i300 & i299) | (i299 ^ i300));
            int i302 = i263 | iHashCode7;
            int i303 = i302 & i240;
            int i304 = (i240 | i302) & (~i303);
            int i305 = (i304 & i303) | (i304 ^ i303);
            int i306 = (i305 | (~i305)) & (~i305);
            int i307 = i301 ^ i306;
            int i308 = i306 & i301;
            int i309 = -(-(((i308 & i307) | (i307 ^ i308)) * 470));
            int i310 = (i278 | i309) << 1;
            int i311 = -(i309 ^ i278);
            int i312 = (((i310 | i311) << 1) - (i311 ^ i310)) * 31;
            int i313 = -(-i199);
            int i314 = i312 & i313;
            int i315 = -(-((i313 ^ i312) | i314));
            i10 = ((((i314 ^ i315) + ((i315 & i314) << 1)) * 31) - (~(-(-i198)))) - 1;
        }
        return Integer.valueOf(i10);
    }
}
