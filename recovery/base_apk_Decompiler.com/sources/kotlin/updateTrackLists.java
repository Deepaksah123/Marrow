package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.source.rtsp.RtpDataLoadable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010 R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010 R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b&\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010 R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b)\u0010 R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b*\u0010 R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b#\u0010 R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b,\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b/\u0010 R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010 R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b$\u00104R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b.\u0010 R\u001c\u0010-\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u00105\u001a\u0004\b-\u00106R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b'\u00104R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b0\u0010 "}, d2 = {"Lo/updateTrackLists;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "", "Lo/StyledPlayerControlViewExternalSyntheticLambda0;", "p11", "p12", "Lo/StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;", "p13", "Lo/lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter;", "p14", "p15", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lo/StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;Ljava/util/List;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write", "IconCompatParcelizer", "RatingCompat", "MediaDescriptionCompat", "read", "MediaMetadataCompat", "MediaBrowserCompatMediaItem", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "handleMediaPlayPauseIfPendingOnHandler", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Ljava/util/List;", "()Ljava/util/List;", "Lo/StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;", "()Lo/StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;", "onAddQueueItem"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class updateTrackLists {
    private static int onCommand = 0;
    private static int onCustomAction = 1;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplApi26Parcelizer;
    private String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private String onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private String MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private List<lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private String RatingCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<StyledPlayerControlViewExternalSyntheticLambda0> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~((~i4) | i3 | i);
        int i8 = ~((~i3) | i4);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i4));
        int i11 = ~(i9 | i3);
        int i12 = i4 + i3 + i5 + ((-1568348280) * i2) + (1617068012 * i6);
        int i13 = i12 * i12;
        int i14 = (((-430874860) * i4) - 739508224) + (1544986862 * i3) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i5) + ((-1885339648) * i2) + (1743781888 * i6) + (858456064 * i13);
        int i15 = (i4 * (-973781596)) + 539565670 + (i3 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i5 * (-973780651)) + (i2 * 424585256) + (i6 * 537576796) + (i13 * 1078394880);
        switch (i14 + (i15 * i15 * 192741376)) {
            case 1:
                return RemoteActionCompatParcelizer(objArr);
            case 2:
                return write(objArr);
            case 3:
                return read(objArr);
            case 4:
                return IconCompatParcelizer(objArr);
            case 5:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 6:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 7:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 8:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 9:
                return MediaBrowserCompatItemReceiver(objArr);
            case 10:
                return MediaDescriptionCompat(objArr);
            case 11:
                return MediaMetadataCompat(objArr);
            case 12:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 13:
                return RatingCompat(objArr);
            case 14:
                return MediaBrowserCompatMediaItem(objArr);
            case 15:
                return onAddQueueItem(objArr);
            case 16:
                return onCommand(objArr);
            case 17:
                return handleMediaPlayPauseIfPendingOnHandler(objArr);
            default:
                return AudioAttributesCompatParcelizer(objArr);
        }
    }

    private updateTrackLists(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<StyledPlayerControlViewExternalSyntheticLambda0> list, String str12, StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, List<lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter> list2, String str13) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = str4;
        this.write = str5;
        this.MediaBrowserCompatItemReceiver = str6;
        this.MediaBrowserCompatCustomActionResultReceiver = str7;
        this.AudioAttributesImplApi26Parcelizer = str8;
        this.AudioAttributesImplApi21Parcelizer = str9;
        this.AudioAttributesImplBaseParcelizer = str10;
        this.RatingCompat = str11;
        this.MediaBrowserCompatMediaItem = list;
        this.MediaMetadataCompat = str12;
        this.MediaBrowserCompatSearchResultReceiver = styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;
        this.MediaDescriptionCompat = list2;
        this.onAddQueueItem = str13;
    }

    public /* synthetic */ updateTrackLists(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0, List list2, String str13, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        ArrayList arrayList;
        String str25;
        String str26;
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda02;
        List list3;
        List list4;
        String str27;
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onCustomAction;
            int i3 = i2 & 21;
            int i4 = ((i2 | 21) & (~i3)) + (i3 << 1);
            int i5 = i4 % 128;
            onCommand = i5;
            int i6 = i4 % 2;
            int i7 = i5 & 31;
            int i8 = (((i5 ^ 31) | i7) << 1) - ((i5 | 31) & (~i7));
            onCustomAction = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            str14 = null;
        } else {
            str14 = str;
        }
        if ((i & 2) != 0) {
            int i10 = onCommand;
            int i11 = i10 & 17;
            int i12 = ((i10 ^ 17) | i11) << 1;
            int i13 = -((i10 | 17) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            onCustomAction = i14 % 128;
            if (i14 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i15 = 2 % 2;
            str15 = null;
        } else {
            str15 = str2;
        }
        if ((i & 4) != 0) {
            int i16 = onCommand;
            int i17 = i16 & 53;
            int i18 = -(-((i16 ^ 53) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            onCustomAction = i19 % 128;
            if (i19 % 2 == 0) {
                throw null;
            }
            int i20 = 2 % 2;
            str16 = null;
        } else {
            str16 = str3;
        }
        if ((i & 8) != 0) {
            int i21 = onCommand + 7;
            onCustomAction = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
            int i22 = 2 % 2;
            str17 = null;
        } else {
            str17 = str4;
        }
        if ((i & 16) != 0) {
            int i23 = onCommand;
            int i24 = i23 & 79;
            int i25 = (i23 ^ 79) | i24;
            int i26 = (i24 & i25) + (i24 | i25);
            onCustomAction = i26 % 128;
            int i27 = i26 % 2;
            int i28 = (i23 ^ 91) + ((i23 & 91) << 1);
            onCustomAction = i28 % 128;
            int i29 = i28 % 2;
            int i30 = 2 % 2;
            str18 = null;
        } else {
            str18 = str5;
        }
        if ((i & 32) != 0) {
            int i31 = onCommand + 5;
            onCustomAction = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 16 / 0;
            }
            int i33 = 2 % 2;
            str19 = null;
        } else {
            str19 = str6;
        }
        if ((i & 64) != 0) {
            int i34 = onCustomAction + 109;
            onCommand = i34 % 128;
            if (i34 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i35 = 2 % 2;
            str20 = null;
        } else {
            str20 = str7;
        }
        if ((i & 128) != 0) {
            int i36 = onCommand;
            int i37 = i36 & 19;
            int i38 = (i36 ^ 19) | i37;
            int i39 = (i37 & i38) + (i38 | i37);
            int i40 = i39 % 128;
            onCustomAction = i40;
            int i41 = i39 % 2;
            int i42 = i40 & 123;
            int i43 = (i40 ^ 123) | i42;
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            onCommand = i44 % 128;
            if (i44 % 2 == 0) {
                int i45 = 2 % 2;
            }
            str21 = null;
        } else {
            str21 = str8;
        }
        if ((i & 256) != 0) {
            int i46 = onCommand;
            int i47 = (((i46 | 32) << 1) - (i46 ^ 32)) - 1;
            int i48 = i47 % 128;
            onCustomAction = i48;
            int i49 = i47 % 2;
            int i50 = i48 & 81;
            int i51 = ((i48 | 81) & (~i50)) + (i50 << 1);
            onCommand = i51 % 128;
            int i52 = i51 % 2;
            int i53 = 2 % 2;
            str22 = null;
        } else {
            str22 = str9;
        }
        if ((i & 512) != 0) {
            int i54 = onCustomAction;
            int i55 = ((i54 & (-38)) | ((~i54) & 37)) + ((i54 & 37) << 1);
            int i56 = i55 % 128;
            onCommand = i56;
            int i57 = i55 % 2;
            int i58 = i56 + 31;
            onCustomAction = i58 % 128;
            int i59 = i58 % 2;
            int i60 = 2 % 2;
            str23 = null;
        } else {
            str23 = str10;
        }
        if ((i & 1024) != 0) {
            int i61 = onCommand;
            int i62 = i61 ^ 21;
            int i63 = (i61 & 21) << 1;
            int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
            onCustomAction = i64 % 128;
            int i65 = i64 % 2;
            int i66 = i61 & 17;
            int i67 = -(-((i61 ^ 17) | i66));
            int i68 = (i66 & i67) + (i66 | i67);
            onCustomAction = i68 % 128;
            if (i68 % 2 != 0) {
                int i69 = 2 % 2;
            }
            str24 = null;
        } else {
            str24 = str11;
        }
        if ((i & 2048) != 0) {
            arrayList = new ArrayList();
            int i70 = onCustomAction;
            int i71 = i70 & 91;
            int i72 = i70 | 91;
            int i73 = ((i71 | i72) << 1) - (i71 ^ i72);
            onCommand = i73 % 128;
            if (i73 % 2 == 0) {
                int i74 = 2 % 2;
            }
        } else {
            arrayList = list;
        }
        if ((i & 4096) != 0) {
            int i75 = onCustomAction;
            int i76 = i75 & 33;
            int i77 = ((i75 ^ 33) | i76) << 1;
            int i78 = -((~i76) & (i75 | 33));
            int i79 = (i77 & i78) + (i78 | i77);
            onCommand = i79 % 128;
            if (i79 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i80 = i75 + 19;
            onCommand = i80 % 128;
            if (i80 % 2 == 0) {
                int i81 = 2 % 2;
            }
            str25 = null;
        } else {
            str25 = str12;
        }
        if ((i & 8192) != 0) {
            int i82 = onCustomAction;
            int i83 = ((i82 | 119) << 1) - (i82 ^ 119);
            int i84 = i83 % 128;
            onCommand = i84;
            int i85 = i83 % 2;
            int i86 = i84 & 29;
            str26 = str25;
            int i87 = (i84 | 29) & (~i86);
            int i88 = i86 << 1;
            int i89 = (i87 & i88) + (i87 | i88);
            onCustomAction = i89 % 128;
            int i90 = i89 % 2;
            int i91 = 2 % 2;
            styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda02 = null;
        } else {
            str26 = str25;
            styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda02 = styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;
        }
        if ((i & 16384) != 0) {
            ArrayList arrayList2 = new ArrayList();
            int i92 = onCustomAction;
            int i93 = i92 & 37;
            int i94 = i93 + ((i92 ^ 37) | i93);
            onCommand = i94 % 128;
            int i95 = i94 % 2;
            int i96 = 2 % 2;
            list3 = arrayList2;
        } else {
            list3 = list2;
        }
        if ((i & 32768) != 0) {
            int i97 = onCustomAction;
            int i98 = ((i97 | 31) << 1) - (i97 ^ 31);
            list4 = list3;
            onCommand = i98 % 128;
            int i99 = i98 % 2;
            int i100 = ((i97 ^ 69) - (~(-(-((i97 & 69) << 1))))) - 1;
            onCommand = i100 % 128;
            if (i100 % 2 == 0) {
                int i101 = 2 % 2;
            }
            str27 = null;
        } else {
            list4 = list3;
            str27 = str13;
        }
        this(str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, arrayList, str26, styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda02, list4, str27);
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = (-2) - ((onCustomAction + 8) ^ (-1));
        int i3 = i2 % 128;
        onCommand = i3;
        int i4 = i2 % 2;
        String str = updatetracklists.AudioAttributesCompatParcelizer;
        int i5 = i3 & 33;
        int i6 = (i3 | 33) & (~i5);
        int i7 = i5 << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        onCustomAction = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 58 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onAddQueueItem(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand + 83;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        String str = updatetracklists.IconCompatParcelizer;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = ((i2 ^ 91) | (i2 & 91)) << 1;
        int i4 = -(((~i2) & 91) | (i2 & (-92)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        onCustomAction = i6;
        int i7 = i5 % 2;
        String str = updatetracklists.RemoteActionCompatParcelizer;
        int i8 = i6 & 49;
        int i9 = ((i6 | 49) & (~i8)) + (i8 << 1);
        onCommand = i9 % 128;
        if (i9 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 ^ 123;
        int i4 = ((i2 & 123) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        onCommand = i6 % 128;
        int i7 = i6 % 2;
        String str = updatetracklists.read;
        int i8 = i2 & 103;
        int i9 = (i2 | 103) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        onCommand = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 4 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = (i2 & 117) + (i2 | 117);
        onCommand = i3 % 128;
        int i4 = i3 % 2;
        String str = updatetracklists.write;
        int i5 = (i2 | 101) << 1;
        int i6 = -(((~i2) & 101) | (i2 & (-102)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        onCommand = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 3 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand + 57;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        String str = updatetracklists.MediaBrowserCompatItemReceiver;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = (i2 & 15) + (i2 | 15);
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        String str = updatetracklists.MediaBrowserCompatCustomActionResultReceiver;
        int i5 = (i2 & 53) + (i2 | 53);
        onCustomAction = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onCommand(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = ((i2 | 51) << 1) - (i2 ^ 51);
        int i4 = i3 % 128;
        onCustomAction = i4;
        int i5 = i3 % 2;
        String str = updatetracklists.AudioAttributesImplApi26Parcelizer;
        if (i5 == 0) {
            throw null;
        }
        int i6 = ((i4 | 29) << 1) - (i4 ^ 29);
        onCommand = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = (i2 ^ 87) + ((i2 & 87) << 1);
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        String str = updatetracklists.AudioAttributesImplApi21Parcelizer;
        int i5 = (-2) - ((((i2 | 94) << 1) - (i2 ^ 94)) ^ (-1));
        onCustomAction = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = i2 & 83;
        int i4 = ((((i2 ^ 83) | i3) << 1) - (~(-((~i3) & (i2 | 83))))) - 1;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        String str = updatetracklists.AudioAttributesImplBaseParcelizer;
        int i6 = (i2 & 89) + (i2 | 89);
        onCustomAction = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object handleMediaPlayPauseIfPendingOnHandler(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = i2 & 9;
        int i4 = (~i3) & (i2 | 9);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        onCustomAction = i6 % 128;
        int i7 = i6 % 2;
        String str = updatetracklists.RatingCompat;
        if (i7 == 0) {
            throw null;
        }
        int i8 = i2 & 77;
        int i9 = ((((i2 ^ 77) | i8) << 1) - (~(-((i2 | 77) & (~i8))))) - 1;
        onCustomAction = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = (-2) - ((((i2 | 52) << 1) - (i2 ^ 52)) ^ (-1));
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        List<StyledPlayerControlViewExternalSyntheticLambda0> list = updatetracklists.MediaBrowserCompatMediaItem;
        if (i4 == 0) {
            int i5 = 81 / 0;
        }
        int i6 = ((i2 & (-98)) | ((~i2) & 97)) + ((i2 & 97) << 1);
        onCustomAction = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction + 9;
        int i3 = i2 % 128;
        onCommand = i3;
        int i4 = i2 % 2;
        String str = updatetracklists.MediaMetadataCompat;
        int i5 = i3 & 55;
        int i6 = (i5 - (~(-(-((i3 ^ 55) | i5))))) - 1;
        onCustomAction = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 & 21;
        int i4 = (~i3) & (i2 | 21);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        onCommand = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = updatetracklists.MediaBrowserCompatSearchResultReceiver;
        if (i7 != 0) {
            throw null;
        }
        int i8 = (i2 ^ 113) + ((i2 & 113) << 1);
        onCommand = i8 % 128;
        if (i8 % 2 == 0) {
            return styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = ((i2 & 80) + (i2 | 80)) - 1;
        int i4 = i3 % 128;
        onCustomAction = i4;
        int i5 = i3 % 2;
        List<lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter> list = updatetracklists.MediaDescriptionCompat;
        int i6 = i4 + 117;
        onCommand = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 ^ 93;
        int i4 = ((i2 & 93) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        onCommand = i6 % 128;
        int i7 = i6 % 2;
        String str = updatetracklists.onAddQueueItem;
        int i8 = i2 + 43;
        onCommand = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public updateTrackLists() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public final boolean equals(Object p0) {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return ((Boolean) IconCompatParcelizer(i, RtpDataLoadable.read(), -1339682457, 1339682462, new Object[]{this, p0}, i2, RtpDataLoadable.read())).booleanValue();
    }

    public final String IconCompatParcelizer() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), 1895510063, -1895510060, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String AudioAttributesCompatParcelizer() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), -36277101, 36277117, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final List<StyledPlayerControlViewExternalSyntheticLambda0> RemoteActionCompatParcelizer() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (List) IconCompatParcelizer(i, RtpDataLoadable.read(), 2044895185, -2044895179, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String read() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), 706335075, -706335062, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String write() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), 1294839498, -1294839483, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String AudioAttributesImplBaseParcelizer() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), -761041284, 761041291, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), 280463891, -280463882, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), 2108714477, -2108714469, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), 475165900, -475165890, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String MediaBrowserCompatItemReceiver() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), -425082617, 425082629, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String MediaMetadataCompat() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), 1533914961, -1533914957, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String MediaDescriptionCompat() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), 1668646586, -1668646586, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final List<lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter> RatingCompat() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (List) IconCompatParcelizer(i, RtpDataLoadable.read(), -630250661, 630250662, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), -190193358, 190193360, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 MediaBrowserCompatSearchResultReceiver() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0) IconCompatParcelizer(i, RtpDataLoadable.read(), 2108213751, -2108213740, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return (String) IconCompatParcelizer(i, RtpDataLoadable.read(), 1143315317, -1143315300, new Object[]{this}, i2, RtpDataLoadable.read());
    }

    public final int hashCode() {
        int i = RtpDataLoadable.read();
        int i2 = RtpDataLoadable.read();
        return ((Integer) IconCompatParcelizer(i, RtpDataLoadable.read(), -1851624389, 1851624403, new Object[]{this}, i2, RtpDataLoadable.read())).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = ((i2 & 80) + (i2 | 80)) - 1;
        int i4 = i3 % 128;
        onCustomAction = i4;
        int i5 = i3 % 2;
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.RemoteActionCompatParcelizer;
        String str4 = this.read;
        String str5 = this.write;
        String str6 = this.MediaBrowserCompatItemReceiver;
        int i6 = (i4 ^ 13) + ((i4 & 13) << 1);
        onCommand = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        String str7 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str8 = this.AudioAttributesImplApi26Parcelizer;
        String str9 = this.AudioAttributesImplApi21Parcelizer;
        String str10 = this.AudioAttributesImplBaseParcelizer;
        String str11 = this.RatingCompat;
        List<StyledPlayerControlViewExternalSyntheticLambda0> list = this.MediaBrowserCompatMediaItem;
        String str12 = this.MediaMetadataCompat;
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = this.MediaBrowserCompatSearchResultReceiver;
        List<lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter> list2 = this.MediaDescriptionCompat;
        String str13 = this.onAddQueueItem;
        StringBuilder sb = new StringBuilder("updateTrackLists(AudioAttributesCompatParcelizer=");
        int i7 = onCustomAction;
        int i8 = i7 & 45;
        int i9 = -(-((i7 ^ 45) | i8));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        onCommand = i10 % 128;
        int i11 = i10 % 2;
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str3);
        sb.append(", read=");
        sb.append(str4);
        int i12 = onCommand;
        int i13 = i12 & 49;
        int i14 = (i13 - (~(-(-((i12 ^ 49) | i13))))) - 1;
        onCustomAction = i14 % 128;
        int i15 = i14 % 2;
        sb.append(", write=");
        sb.append(str5);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(str6);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str7);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        int i16 = onCommand;
        int i17 = ((i16 ^ 33) - (~(-(-((i16 & 33) << 1))))) - 1;
        onCustomAction = i17 % 128;
        int i18 = i17 % 2;
        sb.append(str8);
        if (i18 == 0) {
            sb.append(", maxWidth=");
            sb.append(str9);
            sb.append(", maxHeight=");
            sb.append(str10);
            sb.append(", startWithSAP=");
            sb.append(str11);
            int i19 = 56 / 0;
        } else {
            sb.append(", AudioAttributesImplApi21Parcelizer=");
            sb.append(str9);
            sb.append(", AudioAttributesImplBaseParcelizer=");
            sb.append(str10);
            sb.append(", RatingCompat=");
            sb.append(str11);
        }
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(list);
        sb.append(", MediaMetadataCompat=");
        sb.append(str12);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0);
        sb.append(", MediaDescriptionCompat=");
        int i20 = onCommand + 55;
        onCustomAction = i20 % 128;
        if (i20 % 2 == 0) {
            sb.append(list2);
            sb.append(", lang=");
            sb.append(str13);
            sb.append(")");
            sb.toString();
            throw null;
        }
        sb.append(list2);
        sb.append(", onAddQueueItem=");
        sb.append(str13);
        sb.append(")");
        String string = sb.toString();
        int i21 = onCommand;
        int i22 = i21 & 113;
        int i23 = -(-((i21 ^ 113) | i22));
        int i24 = (i22 & i23) + (i23 | i22);
        onCustomAction = i24 % 128;
        int i25 = i24 % 2;
        return string;
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        write(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void write(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 150);
        downloadHelper2.AudioAttributesCompatParcelizer(this.read);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 159);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        if (this != this.MediaBrowserCompatMediaItem) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 118);
            updateSettingsButton updatesettingsbutton = new updateSettingsButton();
            List<StyledPlayerControlViewExternalSyntheticLambda0> list = this.MediaBrowserCompatMediaItem;
            sendSetRequirements.write(setdownloadingstatestoqueued, updatesettingsbutton, list).read(downloadHelper2, list);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 22);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 11);
        downloadHelper2.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 47);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 166);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 2);
        downloadHelper2.AudioAttributesCompatParcelizer(this.onAddQueueItem);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 103);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 57);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 56);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 119);
        downloadHelper2.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        if (this != this.MediaDescriptionCompat) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 39);
            getShowSubtitleButton getshowsubtitlebutton = new getShowSubtitleButton();
            List<lambdaonBindViewHolder0comgoogleandroidexoplayer2uiStyledPlayerControlViewPlaybackSpeedAdapter> list2 = this.MediaDescriptionCompat;
            sendSetRequirements.write(setdownloadingstatestoqueued, getshowsubtitlebutton, list2).read(downloadHelper2, list2);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 115);
        downloadHelper2.AudioAttributesCompatParcelizer(this.write);
        if (this != this.MediaBrowserCompatSearchResultReceiver) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 35);
            StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = this.MediaBrowserCompatSearchResultReceiver;
            sendSetRequirements.write(setdownloadingstatestoqueued, StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.class, styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0).read(downloadHelper2, styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 76);
        downloadHelper2.AudioAttributesCompatParcelizer(this.RatingCompat);
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            IconCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void IconCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        switch (i) {
            case 34:
                if (!z) {
                    this.IconCompatParcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.IconCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.IconCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 70:
                if (!z) {
                    this.MediaMetadataCompat = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.MediaMetadataCompat = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.MediaMetadataCompat = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 84:
                if (!z) {
                    this.MediaBrowserCompatItemReceiver = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.MediaBrowserCompatItemReceiver = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.MediaBrowserCompatItemReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 86:
                if (!z) {
                    this.RatingCompat = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.RatingCompat = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.RatingCompat = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 91:
                if (!z) {
                    this.AudioAttributesImplApi21Parcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.AudioAttributesImplApi21Parcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.AudioAttributesImplApi21Parcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 100:
                if (!z) {
                    this.write = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.write = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.write = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 126:
                if (!z) {
                    this.MediaDescriptionCompat = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else {
                    this.MediaDescriptionCompat = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new getShowSubtitleButton()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                }
                break;
            case 139:
                if (!z) {
                    this.AudioAttributesImplApi26Parcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.AudioAttributesImplApi26Parcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.AudioAttributesImplApi26Parcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 144:
                if (!z) {
                    this.AudioAttributesImplBaseParcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.AudioAttributesImplBaseParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.AudioAttributesImplBaseParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case TarConstants.CHKSUM_OFFSET /* 148 */:
                if (!z) {
                    this.RemoteActionCompatParcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.RemoteActionCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.RemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 153:
                if (!z) {
                    this.MediaBrowserCompatMediaItem = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else {
                    this.MediaBrowserCompatMediaItem = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new updateSettingsButton()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                }
                break;
            case 159:
                if (!z) {
                    this.AudioAttributesCompatParcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.AudioAttributesCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.AudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 160:
                if (!z) {
                    this.onAddQueueItem = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.onAddQueueItem = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.onAddQueueItem = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 171:
                if (!z) {
                    this.MediaBrowserCompatSearchResultReceiver = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else {
                    this.MediaBrowserCompatSearchResultReceiver = (StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0) setdownloadingstatestoqueued.read(StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                }
                break;
            case 176:
                if (!z) {
                    this.MediaBrowserCompatCustomActionResultReceiver = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.MediaBrowserCompatCustomActionResultReceiver = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.MediaBrowserCompatCustomActionResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 178:
                if (!z) {
                    this.read = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.read = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.read = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            default:
                downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                break;
        }
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        boolean z;
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = (((i2 & (-60)) | ((~i2) & 59)) - (~(-(-((i2 & 59) << 1))))) - 1;
        int i4 = i3 % 128;
        onCommand = i4;
        int i5 = i3 % 2;
        if (updatetracklists == obj) {
            int i6 = i4 & 41;
            int i7 = i6 + ((i4 ^ 41) | i6);
            int i8 = i7 % 128;
            onCustomAction = i8;
            int i9 = i7 % 2;
            int i10 = i8 & 101;
            int i11 = (i10 - (~(-(-((i8 ^ 101) | i10))))) - 1;
            onCommand = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 21 / 0;
            }
            return true;
        }
        if (!(obj instanceof updateTrackLists)) {
            int i13 = i4 & 17;
            int i14 = i13 + ((i4 ^ 17) | i13);
            onCustomAction = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i4 + 71;
            onCustomAction = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 23 / 0;
            }
            return false;
        }
        updateTrackLists updatetracklists2 = (updateTrackLists) obj;
        String str = updatetracklists.AudioAttributesCompatParcelizer;
        String str2 = updatetracklists2.AudioAttributesCompatParcelizer;
        int i18 = i4 ^ 85;
        int i19 = ((i4 & 85) | i18) << 1;
        int i20 = -i18;
        int i21 = (i19 & i20) + (i19 | i20);
        onCustomAction = i21 % 128;
        int i22 = i21 % 2;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2)) {
            int i23 = onCommand;
            int i24 = i23 | 41;
            int i25 = i24 << 1;
            int i26 = -(i24 & (~(i23 & 41)));
            int i27 = (i25 & i26) + (i26 | i25);
            onCustomAction = i27 % 128;
            int i28 = i27 % 2;
            int i29 = ((i23 & 12) + (i23 | 12)) - 1;
            onCustomAction = i29 % 128;
            int i30 = i29 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.IconCompatParcelizer, (Object) updatetracklists2.IconCompatParcelizer)) {
            int i31 = onCommand;
            int i32 = (i31 & (-102)) | ((~i31) & 101);
            int i33 = -(-((i31 & 101) << 1));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            onCustomAction = i34 % 128;
            return Boolean.valueOf(!(i34 % 2 != 0));
        }
        Object obj2 = null;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.RemoteActionCompatParcelizer, (Object) updatetracklists2.RemoteActionCompatParcelizer)) {
            int i35 = onCommand;
            int i36 = (((i35 | 66) << 1) - (i35 ^ 66)) - 1;
            int i37 = i36 % 128;
            onCustomAction = i37;
            int i38 = i36 % 2;
            int i39 = i37 + 71;
            onCommand = i39 % 128;
            if (i39 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.read, (Object) updatetracklists2.read)) {
            int i40 = onCommand;
            int i41 = i40 & 77;
            int i42 = i41 + ((i40 ^ 77) | i41);
            onCustomAction = i42 % 128;
            int i43 = i42 % 2;
            System.identityHashCode(updatetracklists);
            System.identityHashCode(updatetracklists);
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.write, (Object) updatetracklists2.write)) {
            int i44 = onCustomAction;
            int i45 = i44 + 55;
            onCommand = i45 % 128;
            int i46 = i45 % 2;
            int i47 = (((i44 ^ 111) | (i44 & 111)) << 1) - (((~i44) & 111) | (i44 & (-112)));
            onCommand = i47 % 128;
            int i48 = i47 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.MediaBrowserCompatItemReceiver, (Object) updatetracklists2.MediaBrowserCompatItemReceiver)) {
            int i49 = onCommand;
            int i50 = i49 ^ 59;
            int i51 = ((i49 & 59) | i50) << 1;
            int i52 = -i50;
            int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
            int i54 = i53 % 128;
            onCustomAction = i54;
            z = i53 % 2 == 0;
            int i55 = (i54 & 25) + (i54 | 25);
            onCommand = i55 % 128;
            int i56 = i55 % 2;
            return Boolean.valueOf(z);
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.MediaBrowserCompatCustomActionResultReceiver, (Object) updatetracklists2.MediaBrowserCompatCustomActionResultReceiver)) {
            int i57 = onCommand;
            int i58 = (-2) - (((i57 & 122) + (i57 | 122)) ^ (-1));
            int i59 = i58 % 128;
            onCustomAction = i59;
            z = i58 % 2 == 0;
            int i60 = (((i59 & (-70)) | ((~i59) & 69)) - (~((i59 & 69) << 1))) - 1;
            onCommand = i60 % 128;
            int i61 = i60 % 2;
            return Boolean.valueOf(z);
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.AudioAttributesImplApi26Parcelizer, (Object) updatetracklists2.AudioAttributesImplApi26Parcelizer)) {
            int i62 = onCommand;
            int i63 = (i62 & 40) + (i62 | 40);
            int i64 = (i63 ^ (-1)) + (i63 << 1);
            onCustomAction = i64 % 128;
            z = i64 % 2 == 0;
            int i65 = i62 ^ 103;
            int i66 = (i62 & 103) << 1;
            int i67 = (i65 & i66) + (i66 | i65);
            onCustomAction = i67 % 128;
            if (i67 % 2 != 0) {
                return Boolean.valueOf(z);
            }
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.AudioAttributesImplApi21Parcelizer, (Object) updatetracklists2.AudioAttributesImplApi21Parcelizer)) {
            int i68 = onCommand;
            int i69 = ((i68 ^ 114) + ((i68 & 114) << 1)) - 1;
            int i70 = i69 % 128;
            onCustomAction = i70;
            z = i69 % 2 == 0;
            int i71 = i70 + 85;
            onCommand = i71 % 128;
            int i72 = i71 % 2;
            return Boolean.valueOf(z);
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.AudioAttributesImplBaseParcelizer, (Object) updatetracklists2.AudioAttributesImplBaseParcelizer)) {
            int i73 = onCustomAction;
            int i74 = ((i73 ^ 4) + ((i73 & 4) << 1)) - 1;
            onCommand = i74 % 128;
            int i75 = i74 % 2;
            int i76 = i73 & 25;
            int i77 = (i73 ^ 25) | i76;
            int i78 = (i76 & i77) + (i77 | i76);
            onCommand = i78 % 128;
            int i79 = i78 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.RatingCompat, (Object) updatetracklists2.RatingCompat)) {
            int i80 = onCustomAction;
            int i81 = i80 | 61;
            int i82 = ((i81 << 1) - (~(-((~(i80 & 61)) & i81)))) - 1;
            int i83 = i82 % 128;
            onCommand = i83;
            int i84 = i82 % 2;
            int i85 = i83 & 61;
            int i86 = (i83 | 61) & (~i85);
            int i87 = -(-(i85 << 1));
            int i88 = (i86 & i87) + (i86 | i87);
            onCustomAction = i88 % 128;
            int i89 = i88 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(updatetracklists.MediaBrowserCompatMediaItem, updatetracklists2.MediaBrowserCompatMediaItem)) {
            int i90 = onCommand;
            int i91 = i90 ^ 45;
            int i92 = ((i90 & 45) | i91) << 1;
            int i93 = -i91;
            int i94 = (i92 & i93) + (i92 | i93);
            onCustomAction = i94 % 128;
            int i95 = i94 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.MediaMetadataCompat, (Object) updatetracklists2.MediaMetadataCompat)) {
            int i96 = onCustomAction;
            int i97 = (i96 ^ 1) + ((i96 & 1) << 1);
            onCommand = i97 % 128;
            int i98 = i97 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(updatetracklists.MediaBrowserCompatSearchResultReceiver, updatetracklists2.MediaBrowserCompatSearchResultReceiver)) {
            System.identityHashCode(updatetracklists);
            RtpDataLoadable.read();
            RtpDataLoadable.read();
            System.identityHashCode(updatetracklists);
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(updatetracklists.MediaDescriptionCompat, updatetracklists2.MediaDescriptionCompat)) {
            int i99 = onCommand;
            int i100 = i99 ^ 55;
            int i101 = (i99 & 55) << 1;
            int i102 = (i100 & i101) + (i101 | i100);
            onCustomAction = i102 % 128;
            return Boolean.valueOf(i102 % 2 == 0);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) updatetracklists.onAddQueueItem, (Object) updatetracklists2.onAddQueueItem)) {
            int i103 = onCustomAction;
            int i104 = (((i103 | 64) << 1) - (i103 ^ 64)) - 1;
            onCommand = i104 % 128;
            int i105 = i104 % 2;
            return true;
        }
        int i106 = onCustomAction;
        int i107 = (i106 & 39) + (i106 | 39);
        int i108 = i107 % 128;
        onCommand = i108;
        int i109 = i107 % 2;
        int i110 = (i108 | 87) << 1;
        int i111 = -(((~i108) & 87) | (i108 & (-88)));
        int i112 = (i110 & i111) + (i111 | i110);
        onCustomAction = i112 % 128;
        int i113 = i112 % 2;
        return false;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        String str;
        int i;
        int i2;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        int iHashCode10;
        int iHashCode11;
        int iHashCode12;
        int i3;
        int i4;
        int i5;
        int iHashCode13;
        updateTrackLists updatetracklists = (updateTrackLists) objArr[0];
        int i6 = 2 % 2;
        int i7 = onCommand;
        int i8 = (i7 ^ 105) + ((i7 & 105) << 1);
        int i9 = i8 % 128;
        onCustomAction = i9;
        if (i8 % 2 == 0) {
            str = updatetracklists.AudioAttributesCompatParcelizer;
            if (str == null) {
                i2 = 1;
                int i10 = ((i9 | 25) << 1) - (i9 ^ 25);
                onCommand = i10 % 128;
                int i11 = i10 % 2;
                i = i2;
                iHashCode = 0;
            } else {
                i = 1;
                iHashCode = str.hashCode();
            }
        } else {
            str = updatetracklists.AudioAttributesCompatParcelizer;
            if (str == null) {
                i2 = 0;
                int i102 = ((i9 | 25) << 1) - (i9 ^ 25);
                onCommand = i102 % 128;
                int i112 = i102 % 2;
                i = i2;
                iHashCode = 0;
            } else {
                i = 0;
                iHashCode = str.hashCode();
            }
        }
        String str2 = updatetracklists.IconCompatParcelizer;
        if (str2 == null) {
            int i12 = onCustomAction;
            int i13 = i12 & 15;
            int i14 = -(-((i12 ^ 15) | i13));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            onCommand = i15 % 128;
            iHashCode2 = i15 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i16 = onCommand;
            int i17 = ((i16 | 115) << 1) - (i16 ^ 115);
            onCustomAction = i17 % 128;
            int i18 = i17 % 2;
        }
        String str3 = updatetracklists.RemoteActionCompatParcelizer;
        if (str3 == null) {
            int i19 = onCommand;
            int i20 = (i19 & 99) + (i19 | 99);
            onCustomAction = i20 % 128;
            int i21 = i20 % 2;
            int i22 = ((((i19 ^ 57) | (i19 & 57)) << 1) - (~(-(((~i19) & 57) | (i19 & (-58)))))) - 1;
            onCustomAction = i22 % 128;
            int i23 = i22 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
            int i24 = onCustomAction;
            int i25 = i24 & 75;
            int i26 = (i25 - (~(-(-((i24 ^ 75) | i25))))) - 1;
            onCommand = i26 % 128;
            int i27 = i26 % 2;
        }
        String str4 = updatetracklists.read;
        if (str4 == null) {
            int i28 = onCommand;
            int i29 = (((i28 | 83) << 1) - (~(-(((~i28) & 83) | (i28 & (-84)))))) - 1;
            onCustomAction = i29 % 128;
            int i30 = i29 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
            int i31 = onCommand;
            int i32 = i31 & 69;
            int i33 = (i31 | 69) & (~i32);
            int i34 = -(-(i32 << 1));
            int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
            onCustomAction = i35 % 128;
            int i36 = i35 % 2;
        }
        String str5 = updatetracklists.write;
        if (str5 == null) {
            RtpDataLoadable.read();
            RtpDataLoadable.read();
            int i37 = onCommand;
            int i38 = i37 & 19;
            int i39 = ((((i37 ^ 19) | i38) << 1) - (~(-((i37 | 19) & (~i38))))) - 1;
            onCustomAction = i39 % 128;
            int i40 = i39 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str5.hashCode();
            System.identityHashCode(updatetracklists);
            RtpDataLoadable.read();
        }
        String str6 = updatetracklists.MediaBrowserCompatItemReceiver;
        if (str6 == null) {
            int i41 = onCommand;
            int i42 = (((i41 | 78) << 1) - (i41 ^ 78)) - 1;
            int i43 = i42 % 128;
            onCustomAction = i43;
            int i44 = i42 % 2;
            int i45 = i43 & 123;
            int i46 = (i43 | 123) & (~i45);
            int i47 = -(-(i45 << 1));
            int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
            onCommand = i48 % 128;
            int i49 = i48 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str6.hashCode();
            int i50 = onCommand;
            int i51 = (i50 & 91) + (i50 | 91);
            onCustomAction = i51 % 128;
            if (i51 % 2 == 0) {
                int i52 = 4 / 5;
            }
        }
        String str7 = updatetracklists.MediaBrowserCompatCustomActionResultReceiver;
        if (str7 == null) {
            RtpDataLoadable.read();
            RtpDataLoadable.read();
            int i53 = onCustomAction;
            int i54 = ((i53 | 34) << 1) - (i53 ^ 34);
            int i55 = (i54 ^ (-1)) + (i54 << 1);
            onCommand = i55 % 128;
            int i56 = i55 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = str7.hashCode();
            int i57 = onCustomAction;
            int i58 = (i57 & (-90)) | (89 & (~i57));
            int i59 = -(-((i57 & 89) << 1));
            int i60 = (i58 & i59) + (i59 | i58);
            onCommand = i60 % 128;
            int i61 = i60 % 2;
        }
        String str8 = updatetracklists.AudioAttributesImplApi26Parcelizer;
        if (str8 == null) {
            int i62 = onCommand;
            int i63 = i62 & 73;
            int i64 = (i63 - (~(-(-((i62 ^ 73) | i63))))) - 1;
            onCustomAction = i64 % 128;
            int i65 = i64 % 2;
            iHashCode8 = 0;
        } else {
            iHashCode8 = str8.hashCode();
            int i66 = onCustomAction;
            int i67 = ((((~i66) & 39) | (i66 & (-40))) - (~((i66 & 39) << 1))) - 1;
            onCommand = i67 % 128;
            int i68 = i67 % 2;
        }
        String str9 = updatetracklists.AudioAttributesImplApi21Parcelizer;
        if (str9 == null) {
            int i69 = onCommand;
            int i70 = (((i69 | 22) << 1) - (i69 ^ 22)) - 1;
            int i71 = i70 % 128;
            onCustomAction = i71;
            iHashCode9 = i70 % 2 == 0 ? 1 : 0;
            int i72 = i71 + 29;
            onCommand = i72 % 128;
            int i73 = i72 % 2;
        } else {
            iHashCode9 = str9.hashCode();
            int i74 = onCommand;
            int i75 = ((~i74) & 31) | (i74 & (-32));
            int i76 = (i74 & 31) << 1;
            int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
            onCustomAction = i77 % 128;
            int i78 = i77 % 2;
        }
        String str10 = updatetracklists.AudioAttributesImplBaseParcelizer;
        if (str10 == null) {
            int i79 = onCustomAction;
            int i80 = i79 & 83;
            int i81 = i80 + ((i79 ^ 83) | i80);
            int i82 = i81 % 128;
            onCommand = i82;
            int i83 = i81 % 2;
            int i84 = i82 ^ 9;
            int i85 = ((((i82 & 9) | i84) << 1) - (~(-i84))) - 1;
            onCustomAction = i85 % 128;
            int i86 = i85 % 2;
            iHashCode10 = 0;
        } else {
            iHashCode10 = str10.hashCode();
        }
        String str11 = updatetracklists.RatingCompat;
        if (str11 == null) {
            int i87 = onCommand;
            int i88 = i87 & 101;
            int i89 = (i87 ^ 101) | i88;
            int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
            onCustomAction = i90 % 128;
            int i91 = i90 % 2;
            int i92 = (i87 | 113) << 1;
            int i93 = -(((~i87) & 113) | (i87 & (-114)));
            int i94 = (i92 & i93) + (i93 | i92);
            onCustomAction = i94 % 128;
            int i95 = i94 % 2;
            iHashCode11 = 0;
        } else {
            iHashCode11 = str11.hashCode();
        }
        int iHashCode14 = updatetracklists.MediaBrowserCompatMediaItem.hashCode();
        String str12 = updatetracklists.MediaMetadataCompat;
        int i96 = onCommand;
        int i97 = (-2) - (((i96 ^ 92) + ((i96 & 92) << 1)) ^ (-1));
        int i98 = i;
        onCustomAction = i97 % 128;
        int i99 = i97 % 2;
        if (str12 == null) {
            int i100 = (((i96 | 116) << 1) - (i96 ^ 116)) - 1;
            onCustomAction = i100 % 128;
            iHashCode12 = i100 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode12 = str12.hashCode();
            System.identityHashCode(updatetracklists);
            RtpDataLoadable.read();
        }
        StyledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 = updatetracklists.MediaBrowserCompatSearchResultReceiver;
        if (styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0 == null) {
            int i101 = onCustomAction;
            int i103 = i101 ^ 3;
            int i104 = -(-((i101 & 3) << 1));
            int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
            onCommand = i105 % 128;
            int i106 = i105 % 2;
            i3 = 0;
        } else {
            int iHashCode15 = styledPlayerControlViewPlaybackSpeedAdapterExternalSyntheticLambda0.hashCode();
            int i107 = onCommand;
            int i108 = (i107 & 66) + (i107 | 66);
            int i109 = (i108 ^ (-1)) + (i108 << 1);
            i3 = iHashCode15;
            onCustomAction = i109 % 128;
            int i110 = i109 % 2;
        }
        int iHashCode16 = updatetracklists.MediaDescriptionCompat.hashCode();
        String str13 = updatetracklists.onAddQueueItem;
        if (str13 != null) {
            int i111 = onCommand;
            i5 = iHashCode16;
            int i113 = i111 & 101;
            i4 = iHashCode12;
            int i114 = (~i113) & (i111 | 101);
            int i115 = -(-(i113 << 1));
            int i116 = (i114 & i115) + (i114 | i115);
            onCustomAction = i116 % 128;
            if (i116 % 2 == 0) {
                str13.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode13 = str13.hashCode();
            int i117 = (-2) - ((onCommand + 64) ^ (-1));
            onCustomAction = i117 % 128;
            int i118 = i117 % 2;
        } else {
            i4 = iHashCode12;
            i5 = iHashCode16;
            iHashCode13 = i98;
        }
        int i119 = iHashCode * 31;
        int i120 = -(-iHashCode2);
        int i121 = i119 & i120;
        int i122 = ((i119 | i120) & (~i121)) + (i121 << 1);
        int i123 = i122 * 31;
        int iIdentityHashCode = System.identityHashCode(updatetracklists);
        int i124 = ((iHashCode3 * (-947)) - (~(i122 * 29419))) - 1;
        int i125 = ~iHashCode3;
        int i126 = iHashCode13;
        int i127 = ~i123;
        int i128 = ~i123;
        int i129 = i128 | i123;
        int i130 = i127 & i129;
        int i131 = iHashCode11;
        int i132 = i130 & iIdentityHashCode;
        int i133 = iHashCode10;
        int i134 = (~i132) & (i130 | iIdentityHashCode);
        int i135 = ~((i134 & i132) | (i134 ^ i132));
        int i136 = ((~i135) & i125) | ((~i125) & i135);
        int i137 = i135 & i125;
        int i138 = -(-(((i137 & i136) | (i136 ^ i137)) * (-948)));
        int i139 = (i124 ^ i138) + ((i138 & i124) << 1);
        int i140 = ~iHashCode3;
        int i141 = ~iHashCode3;
        int i142 = i140 & (i141 | iHashCode3);
        int i143 = ((~i128) & i142) | ((~i142) & i128);
        int i144 = i142 & i128;
        int i145 = (i144 & i143) | (i143 ^ i144);
        int i146 = ~iIdentityHashCode;
        int i147 = (~((i145 & i146) | (i145 ^ i146))) * (-948);
        int i148 = (((i139 ^ i147) | (i139 & i147)) << 1) - ((i147 & (~i139)) | ((~i147) & i139));
        int i149 = (~i123) & i129;
        int i150 = ((~i149) & iHashCode3) | (i141 & i149);
        int i151 = i149 & iHashCode3;
        int i152 = -(-(((i151 & i150) | (i150 ^ i151)) * 948));
        int i153 = i148 & i152;
        int i154 = i152 | i148;
        int i155 = (i153 & i154) + (i154 | i153);
        int i156 = i155 * 31;
        RtpDataLoadable.read();
        RtpDataLoadable.read();
        int i157 = RtpDataLoadable.read();
        int i158 = ((iHashCode4 * 193) - (~(-(~(i155 * 5983))))) - 2;
        int i159 = ~i157;
        int i160 = ~i159;
        int i161 = ~iHashCode4;
        int i162 = ~iHashCode4;
        int i163 = i161 & (i162 | iHashCode4);
        int i164 = ~i156;
        int i165 = iHashCode9;
        int i166 = (i163 & i164) | ((~i163) & i156);
        int i167 = i163 & i156;
        int i168 = ~((i166 ^ i167) | (i166 & i167));
        int i169 = ((i168 & i159) | (i159 ^ i168)) * (-192);
        int i170 = iHashCode8;
        int i171 = ((((i158 ^ i169) | (i158 & i169)) << 1) - (~(-(((~i158) & i169) | ((~i169) & i158))))) - 1;
        int i172 = ~i156;
        int i173 = (i164 | i156) & i172;
        int i174 = i163 & i173;
        int i175 = iHashCode7;
        int i176 = (i163 | i173) & (~i174);
        int i177 = (i176 & i174) | (i176 ^ i174);
        int i178 = (i177 | (~i177)) & (~i177);
        int i179 = (~i157) & (i159 | i157);
        int i180 = i172 & i179;
        int i181 = (i172 | i179) & (~i180);
        int i182 = (i181 & i180) | (i181 ^ i180);
        int i183 = (i182 | (~i182)) & (~i182);
        int i184 = -(-(((i183 & i178) | (i178 ^ i183)) * (-384)));
        int i185 = (((i171 ^ i184) | (i171 & i184)) << 1) - ((i184 & (~i171)) | ((~i184) & i171));
        int i186 = ~((i162 ^ i164) | (i162 & i164) | i157);
        int i187 = ~i156;
        int i188 = onCustomAction;
        int i189 = i188 ^ 91;
        int i190 = (i188 & 91) << 1;
        int i191 = (i189 & i190) + (i190 | i189);
        onCommand = i191 % 128;
        int i192 = i191 % 2;
        int i193 = (i160 & i187) | ((~i187) & i159);
        int i194 = i159 & i187;
        int i195 = (i194 & i193) | (i193 ^ i194);
        int i196 = ~((i195 & iHashCode4) | (i195 ^ iHashCode4));
        int i197 = ((~i196) & i186) | ((~i186) & i196);
        int i198 = i196 & i186;
        int i199 = (i198 & i197) | (i197 ^ i198);
        int i200 = i156 | iHashCode4;
        int i201 = i200 & i157;
        int i202 = (i200 | i157) & (~i201);
        int i203 = (i202 & i201) | (i202 ^ i201);
        int i204 = (i203 | (~i203)) & (~i203);
        int i205 = -(-(PsExtractor.AUDIO_STREAM * ((i204 & i199) | (i199 ^ i204))));
        int i206 = i185 & i205;
        int i207 = ((((i185 ^ i205) | i206) << 1) - (~(-((i205 | i185) & (~i206))))) - 1;
        int i208 = i207 * 31;
        int i209 = RtpDataLoadable.read();
        int i210 = ((iHashCode5 * (-500)) - (~(-(-(i207 * (-15500)))))) - 1;
        int i211 = ~i208;
        int i212 = i211 & iHashCode5;
        int i213 = ~(((i211 | iHashCode5) & (~i212)) | i212);
        int i214 = ~iHashCode5;
        int i215 = i214 & i208;
        int i216 = (~i215) & (i214 | i208);
        int i217 = ~i208;
        int i218 = (i215 & i216) | (i216 ^ i215);
        int i219 = ~i209;
        int i220 = ~((i218 & i209) | (i218 & i219) | ((~i218) & i209));
        int i221 = -(-(((i213 & i220) | (i213 ^ i220)) * 501));
        int i222 = i210 & i221;
        int i223 = ((((i210 ^ i221) | i222) << 1) - (~(-((i221 | i210) & (~i222))))) - 1;
        int i224 = ((~iHashCode5) | iHashCode5) & i214;
        int i225 = ((~i217) & i224) | ((~i224) & i217);
        int i226 = i224 & i217;
        int i227 = (~((i225 & i226) | (i225 ^ i226))) * 1002;
        int i228 = i223 & i227;
        int i229 = (((i223 ^ i227) | i228) << 1) - ((i227 | i223) & (~i228));
        int i230 = onCommand;
        int i231 = ((i230 | 79) << 1) - (i230 ^ 79);
        onCustomAction = i231 % 128;
        int i232 = i231 % 2;
        int i233 = (i209 | i219) & (~i209);
        int i234 = (i224 & i233) | (i224 ^ i233);
        int i235 = i234 & i208;
        int i236 = (i208 | i234) & (~i235);
        int i237 = -(~(501 * (~((i236 & i235) | (i236 ^ i235)))));
        int i238 = ((i229 ^ i237) + ((i237 & i229) << 1)) - 1;
        int i239 = i238 * 31;
        int iIdentityHashCode2 = System.identityHashCode(updatetracklists);
        int i240 = iHashCode6 * 784;
        int i241 = -(~(-(-(i238 * (-24242)))));
        int i242 = ((i240 ^ i241) + ((i241 & i240) << 1)) - 1;
        int i243 = -(-((~i239) * (-783)));
        int i244 = i242 & i243;
        int i245 = ((((i242 ^ i243) | i244) << 1) - (~(-((i243 | i242) & (~i244))))) - 1;
        int i246 = (~iHashCode6) & ((~iHashCode6) | iHashCode6);
        int i247 = ~iIdentityHashCode2;
        int i248 = (iIdentityHashCode2 | (~iIdentityHashCode2)) & i247;
        int i249 = (i246 & i248) | (i246 ^ i248);
        int i250 = i249 ^ i239;
        int i251 = i249 & i239;
        int i252 = -(-((~((i251 & i250) | (i250 ^ i251))) * (-783)));
        int i253 = (i245 ^ i252) + ((i252 & i245) << 1);
        int i254 = ~iHashCode6;
        int i255 = i247 & i239;
        int i256 = (i239 | i247) & (~i255);
        int i257 = ~((i256 & i255) | (i256 ^ i255));
        int i258 = ((~i257) & i254) | ((~i254) & i257);
        int i259 = i257 & i254;
        int i260 = ((i259 & i258) | (i258 ^ i259)) * 783;
        int i261 = i253 & i260;
        int i262 = i261 + ((i260 ^ i253) | i261);
        int i263 = onCustomAction;
        int i264 = i263 & 51;
        int i265 = ((((i263 ^ 51) | i264) << 1) - (~(-((i263 | 51) & (~i264))))) - 1;
        onCommand = i265 % 128;
        int i266 = i265 % 2;
        int i267 = i262 * 31;
        int i268 = -(-i175);
        int i269 = i267 ^ i268;
        int i270 = (i267 & i268) << 1;
        int i271 = ((i269 & i270) + (i270 | i269)) * 31;
        int i272 = i271 ^ i170;
        int i273 = ((((i271 & i170) | i272) << 1) - i272) * 31;
        int i274 = -(~i165);
        int i275 = ((i273 & i274) + (i274 | i273)) - 1;
        int i276 = i275 * 31;
        int i277 = RtpDataLoadable.read();
        int i278 = i133 * (-523);
        int i279 = i275 * 8153;
        int i280 = i278 & i279;
        int i281 = ((i279 | i278) & (~i280)) + (i280 << 1);
        int i282 = ~i133;
        int i283 = i282 ^ i276;
        int i284 = ~i276;
        int i285 = i282 & i276;
        int i286 = ~((i283 & i285) | (i283 ^ i285));
        int i287 = ~i276;
        int i288 = i287 ^ i133;
        int i289 = i287 & i133;
        int i290 = (i288 & i289) | (i288 ^ i289);
        int i291 = (i290 | (~i290)) & (~i290);
        int i292 = i286 & i291;
        int i293 = (i286 | i291) & (~i292);
        int i294 = (i293 & i292) | (i293 ^ i292);
        int i295 = i287 ^ i277;
        int i296 = i287 & i277;
        int i297 = (i295 & i296) | (i295 ^ i296);
        int i298 = (i297 | (~i297)) & (~i297);
        int i299 = i294 & i298;
        int i300 = (i294 | i298) & (~i299);
        int i301 = -(-(((i300 & i299) | (i300 ^ i299)) * 262));
        int i302 = i281 & i301;
        int i303 = ((i281 ^ i301) | i302) << 1;
        int i304 = -((i281 | i301) & (~i302));
        int i305 = (i303 & i304) + (i304 | i303);
        int i306 = i284 | i276;
        int i307 = (~i276) & i306;
        int i308 = (i307 & i282) | ((~i307) & i133);
        int i309 = i307 & i133;
        int i310 = (~((i309 & i308) | (i308 ^ i309))) * (-786);
        int i311 = ((i305 | i310) << 1) - (i310 ^ i305);
        int i312 = onCustomAction;
        int i313 = i312 & 5;
        int i314 = ((i312 ^ 5) | i313) << 1;
        int i315 = -((i312 | 5) & (~i313));
        int i316 = (i314 ^ i315) + ((i315 & i314) << 1);
        onCommand = i316 % 128;
        int i317 = i316 % 2;
        int i318 = i287 & i306;
        int i319 = ~i277;
        int i320 = ((~i319) & i318) | ((~i318) & i319);
        int i321 = i318 & i319;
        int i322 = ~((i321 & i320) | (i320 ^ i321));
        int i323 = ~((i276 & i282) | (i282 ^ i276));
        int i324 = i322 & i323;
        int i325 = ((i323 | i322) & (~i324)) | i324;
        int i326 = i284 & i133;
        int i327 = (~i326) & (i133 | i284);
        int i328 = ~((i326 & i327) | (i327 ^ i326));
        int i329 = ((i311 - (~(-(-(((i325 & i328) | (i325 ^ i328)) * 262))))) - 1) * 31;
        int i330 = -(-i131);
        int i331 = i329 & i330;
        int i332 = (i330 ^ i329) | i331;
        int i333 = (i331 & i332) + (i332 | i331);
        int i334 = i333 * 31;
        int iIdentityHashCode3 = System.identityHashCode(updatetracklists);
        int i335 = (iHashCode14 * (-523)) + (i333 * 8153);
        int i336 = ~iHashCode14;
        int i337 = (i336 ^ i334) | (i336 & i334);
        int i338 = (i337 | (~i337)) & (~i337);
        int i339 = ~i334;
        int i340 = i339 & iHashCode14;
        int i341 = (~i340) & (i339 | iHashCode14);
        int i342 = ~((i340 & i341) | (i341 ^ i340));
        int i343 = (i338 & i342) | ((~i342) & i338) | ((~i338) & i342);
        int i344 = onCustomAction;
        int i345 = ((i344 | 14) << 1) - (i344 ^ 14);
        int i346 = (i345 ^ (-1)) + (i345 << 1);
        onCommand = i346 % 128;
        int i347 = i346 % 2;
        int i348 = ~i334;
        int i349 = ~i334;
        int i350 = i348 & (i349 | i334);
        int i351 = i350 & iIdentityHashCode3;
        int i352 = (i350 | iIdentityHashCode3) & (~i351);
        int i353 = ~iIdentityHashCode3;
        int i354 = ~(i352 | i351);
        int i355 = i343 & i354;
        int i356 = (i343 | i354) & (~i355);
        int i357 = -(-(((i356 & i355) | (i356 ^ i355)) * 262));
        int i358 = i335 & i357;
        int i359 = (i335 | i357) & (~i358);
        int i360 = -(-(i358 << 1));
        int i361 = (i359 & i360) + (i359 | i360);
        int i362 = (~((i349 ^ iHashCode14) | (i349 & iHashCode14))) * (-786);
        int i363 = i361 & i362;
        int i364 = i362 | i361;
        int i365 = (i363 ^ i364) + ((i364 & i363) << 1);
        int i366 = i339 ^ i353;
        int i367 = i353 & i339;
        int i368 = (i367 & i366) | (i366 ^ i367);
        int i369 = (i368 | (~i368)) & (~i368);
        int i370 = ~((i334 & i336) | (i336 ^ i334));
        int i371 = (i370 & i369) | (i369 ^ i370);
        int i372 = ~(i339 | iHashCode14);
        int i373 = ((i371 & i372) | ((~i372) & i371) | ((~i371) & i372)) * 262;
        int i374 = ((~i373) & i365) | ((~i365) & i373);
        int i375 = -(-((i373 & i365) << 1));
        int i376 = (((i374 | i375) << 1) - (i375 ^ i374)) * 31;
        int i377 = i376 & i4;
        int i378 = (i376 | i4) & (~i377);
        int i379 = i377 << 1;
        int i380 = (((i378 | i379) << 1) - (i379 ^ i378)) * 31;
        int i381 = i380 & i3;
        int i382 = (i380 ^ i3) | i381;
        int i383 = ((i381 ^ i382) + ((i381 & i382) << 1)) * 31;
        int i384 = -(-i5);
        int i385 = ((i383 | i384) << 1) - (i384 ^ i383);
        int i386 = i385 * 31;
        int i387 = RtpDataLoadable.read();
        int i388 = onCustomAction + 37;
        onCommand = i388 % 128;
        int i389 = i388 % 2;
        int i390 = ((i126 * 55) - (~(-(~(i385 * (-3317)))))) - 1;
        int i391 = (i390 ^ (-1)) + (i390 << 1);
        int i392 = ~i126;
        int i393 = ~i386;
        int i394 = ~((i392 & i386) | (i392 ^ i386));
        int i395 = ~i387;
        int i396 = (i395 & i393) | ((~i395) & i386);
        int i397 = i395 & i386;
        int i398 = (i396 & i397) | (i396 ^ i397);
        int i399 = (i398 | (~i398)) & (~i398);
        int i400 = i394 & i399;
        int i401 = (i394 | i399) & (~i400);
        int i402 = ((i401 & i400) | (i401 ^ i400)) * (-108);
        int i403 = (i391 & i402) + (i402 | i391);
        int i404 = ~i126;
        int i405 = i404 & i387;
        int i406 = ~(i405 | ((~i405) & (i404 | i387)));
        int i407 = (i404 & i393) | ((~i393) & i126);
        int i408 = i393 & i126;
        int i409 = ~((i407 & i408) | (i407 ^ i408));
        int i410 = (i409 & i406) | (i406 ^ i409);
        int i411 = i395 & i126;
        int i412 = (i395 | i126) & (~i411);
        int i413 = ~((i411 & i412) | (i412 ^ i411));
        int i414 = i410 & i413;
        int i415 = (i410 | i413) & (~i414);
        int i416 = -(-(((i415 & i414) | (i415 ^ i414)) * 54));
        int i417 = i403 | i416;
        int i418 = i417 << 1;
        int i419 = -((~(i416 & i403)) & i417);
        int i420 = ((i418 | i419) << 1) - (i419 ^ i418);
        int i421 = ~i386;
        int i422 = i421 & i126;
        int i423 = (i421 | i126) & (~i422);
        int i424 = ~((i423 & i422) | (i423 ^ i422));
        int i425 = i387 & i424;
        int i426 = (i424 | i387) & (~i425);
        return Integer.valueOf((i420 - (~(-(~(-(-(((i426 & i425) | (i426 ^ i425)) * 54))))))) - 2);
    }
}
