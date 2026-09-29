package kotlin;

import com.marrow2.ui.schema.listing.SchemaListViewModel;
import kotlin.VideoSizeExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseDataSource {
    private static int read = 0;
    private static int write = 1;
    private final getStreamPositionUsForContent AudioAttributesCompatParcelizer;
    private final getPlatform IconCompatParcelizer;
    private final crc32 RemoteActionCompatParcelizer;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i8 | i5));
        int i10 = ~i5;
        int i11 = i9 | (~(i10 | i4 | i6));
        int i12 = i4 | i6;
        int i13 = i10 | i12;
        int i14 = (~(i5 | i4)) | (~i12);
        int i15 = i4 + i6 + i + (1068639271 * i2) + ((-1919980423) * i3);
        int i16 = i15 * i15;
        int i17 = ((i4 * 1648758371) - 594280448) + (1648758371 * i6) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i) + ((-1693188096) * i2) + (611057664 * i3) + ((-810221568) * i16);
        int i18 = (i4 * 982247175) + 1844138806 + (i6 * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i * 982246413) + (i2 * 1533776379) + (i3 * 1016546853) + (i16 * (-1070530560));
        int i19 = i17 + (i18 * i18 * 1708326912);
        return i19 != 1 ? i19 != 2 ? write(objArr) : RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    @setSdkPayload
    public BaseDataSource(getStreamPositionUsForContent getstreampositionusforcontent, crc32 crc32Var, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.AudioAttributesCompatParcelizer = getstreampositionusforcontent;
        this.RemoteActionCompatParcelizer = crc32Var;
        this.IconCompatParcelizer = getplatform;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        BaseDataSource baseDataSource = (BaseDataSource) objArr[0];
        int i = 2 % 2;
        int i2 = read + 31;
        write = i2 % 128;
        int i3 = i2 % 2;
        getStreamPositionUsForContent getstreampositionusforcontent = baseDataSource.AudioAttributesCompatParcelizer;
        if (i3 != 0) {
            return getstreampositionusforcontent;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        BaseDataSource baseDataSource = (BaseDataSource) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 & 5;
        int i4 = ((i2 | 5) & (~i3)) + (i3 << 1);
        write = i4 % 128;
        int i5 = i4 % 2;
        crc32 crc32Var = baseDataSource.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            return crc32Var;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        r1 = 78 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        r8 = kotlin.getShowPopup.INSTANCE;
        r0 = kotlin.BaseDataSource.write;
        r1 = r0 & 63;
        r1 = (r1 - (~((r0 ^ 63) | r1))) - 1;
        kotlin.BaseDataSource.read = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r8 == kotlin.getYear.IconCompatParcelizer()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r8 == kotlin.getYear.IconCompatParcelizer()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r1 = kotlin.BaseDataSource.read + 23;
        kotlin.BaseDataSource.write = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesCompatParcelizer(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            o.BaseDataSource r1 = (kotlin.BaseDataSource) r1
            r2 = 1
            r3 = r8[r2]
            o.AllocatorAllocationNode r3 = (kotlin.AllocatorAllocationNode) r3
            r4 = 2
            r8 = r8[r4]
            o.SampleVideos r8 = (kotlin.SampleVideos) r8
            int r5 = r4 % r4
            o.getPlatform r5 = r1.IconCompatParcelizer
            o.CurrentQuery r5 = (kotlin.CurrentQuery) r5
            o.BaseDataSource$IconCompatParcelizer r6 = new o.BaseDataSource$IconCompatParcelizer
            r7 = 0
            r6.<init>(r3, r1, r7)
            int r1 = kotlin.BaseDataSource.write
            r3 = r1 & 3
            r1 = r1 ^ 3
            r1 = r1 | r3
            r7 = r3 & r1
            r1 = r1 | r3
            int r7 = r7 + r1
            int r1 = r7 % 128
            kotlin.BaseDataSource.read = r1
            int r7 = r7 % r4
            o.MagicModuleSubmissionRequestBody r6 = (kotlin.MagicModuleSubmissionRequestBody) r6
            java.lang.Object r8 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r5, r6, r8)
            if (r7 == 0) goto L3d
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            r3 = 58
            int r3 = r3 / r0
            if (r8 != r1) goto L52
            goto L43
        L3d:
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            if (r8 != r1) goto L52
        L43:
            int r1 = kotlin.BaseDataSource.read
            int r1 = r1 + 23
            int r2 = r1 % 128
            kotlin.BaseDataSource.write = r2
            int r1 = r1 % r4
            if (r1 != 0) goto L51
            r1 = 78
            int r1 = r1 / r0
        L51:
            return r8
        L52:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            int r0 = kotlin.BaseDataSource.write
            r1 = r0 & 63
            r0 = r0 ^ 63
            r0 = r0 | r1
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r0 = r1 % 128
            kotlin.BaseDataSource.read = r0
            int r1 = r1 % r4
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BaseDataSource.AudioAttributesCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    public static final /* synthetic */ getStreamPositionUsForContent read(BaseDataSource baseDataSource) {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        return (getStreamPositionUsForContent) write(VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 128313130, iWrite, -128313128, new Object[]{baseDataSource});
    }

    public static final /* synthetic */ crc32 RemoteActionCompatParcelizer(BaseDataSource baseDataSource) {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        return (crc32) write(VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), -487669199, iWrite, 487669199, new Object[]{baseDataSource});
    }

    public final Object read(AllocatorAllocationNode allocatorAllocationNode, SampleVideos<? super getShowPopup> sampleVideos) {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        return write(VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 2114146145, iWrite, -2114146144, new Object[]{this, allocatorAllocationNode, sampleVideos});
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;
        private /* synthetic */ BaseDataSource AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ AllocatorAllocationNode write;

        public static final /* synthetic */ class RemoteActionCompatParcelizer {
            public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
            private static int RemoteActionCompatParcelizer = 0;
            private static int read = 1;

            static {
                int[] iArr = new int[AllocatorAllocationNode.values().length];
                try {
                    int iOrdinal = AllocatorAllocationNode.write.ordinal();
                    int i = RemoteActionCompatParcelizer;
                    int i2 = i & 75;
                    int i3 = -(-((i ^ 75) | i2));
                    int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
                    read = i4 % 128;
                    int i5 = i4 % 2;
                    iArr[iOrdinal] = 1;
                    int i6 = i & 97;
                    int i7 = (i | 97) & (~i6);
                    int i8 = -(-(i6 << 1));
                    int i9 = (i7 & i8) + (i8 | i7);
                    read = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 4 / 5;
                    } else {
                        int i11 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AllocatorAllocationNode.AudioAttributesImplBaseParcelizer.ordinal()] = 2;
                    int i12 = RemoteActionCompatParcelizer + 23;
                    read = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 4 / 4;
                    } else {
                        int i14 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AllocatorAllocationNode.MediaBrowserCompatMediaItem.ordinal()] = 3;
                    int i15 = RemoteActionCompatParcelizer;
                    int i16 = ((((i15 ^ 75) | (i15 & 75)) << 1) - (~(-(((~i15) & 75) | (i15 & (-76)))))) - 1;
                    read = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AllocatorAllocationNode.MediaBrowserCompatSearchResultReceiver.ordinal()] = 4;
                    int i19 = read;
                    int i20 = (i19 & 78) + (i19 | 78);
                    int i21 = (i20 ^ (-1)) + (i20 << 1);
                    RemoteActionCompatParcelizer = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AllocatorAllocationNode.RemoteActionCompatParcelizer.ordinal()] = 5;
                    int i23 = read;
                    int i24 = ((((i23 ^ 107) | (i23 & 107)) << 1) - (~(-(((~i23) & 107) | (i23 & (-108)))))) - 1;
                    RemoteActionCompatParcelizer = i24 % 128;
                    if (i24 % 2 == 0) {
                        int i25 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AllocatorAllocationNode.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 6;
                    int i26 = read;
                    int i27 = (i26 ^ 93) + ((i26 & 93) << 1);
                    RemoteActionCompatParcelizer = i27 % 128;
                    int i28 = i27 % 2;
                    int i29 = 2 % 2;
                } catch (NoSuchFieldError unused6) {
                }
                AudioAttributesCompatParcelizer = iArr;
                int i30 = read;
                int i31 = ((i30 | 5) << 1) - (i30 ^ 5);
                RemoteActionCompatParcelizer = i31 % 128;
                int i32 = i31 % 2;
            }
        }

        public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i2;
            int i8 = ~i3;
            int i9 = i4 | i7 | i8;
            int i10 = (~(i7 | i3)) | (~(i8 | i4));
            int i11 = (~(i3 | i4)) | (~(i7 | (~i4) | i8));
            int i12 = i4 + i2 + i6 + ((-160716491) * i5) + (1883135422 * i);
            int i13 = i12 * i12;
            int i14 = (((-1835184368) * i4) - 666828800) + ((-962678542) * i2) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i6) + ((-1967783936) * i5) + ((-2092695552) * i) + ((-870252544) * i13);
            int i15 = (i4 * 1975847376) + 750996803 + (i2 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i6 * 1975846509) + (i5 * (-526956143)) + (i * 972447206) + (i13 * (-1341325312));
            int i16 = i14 + (i15 * i15 * 1929838592);
            return i16 != 1 ? i16 != 2 ? i16 != 3 ? write(objArr) : AudioAttributesCompatParcelizer(objArr) : IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0191, code lost:
        
            if (r1 == r6) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0198, code lost:
        
            if (r3.IconCompatParcelizer(r7) == r6) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x019a, code lost:
        
            r0 = o.BaseDataSource.IconCompatParcelizer.read + 105;
            o.BaseDataSource.IconCompatParcelizer.RemoteActionCompatParcelizer = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x01a3, code lost:
        
            return r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[PHI: r6
          0x005d: PHI (r6v9 java.lang.Object) = (r6v5 java.lang.Object), (r6v22 java.lang.Object) binds: [B:8:0x0038, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0391  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x04c9  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r7
          0x003a: PHI (r7v2 int) = (r7v1 int), (r7v56 int) binds: [B:8:0x0038, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r25) {
            /*
                Method dump skipped, instruction units count: 1310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BaseDataSource.IconCompatParcelizer.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(AllocatorAllocationNode allocatorAllocationNode, BaseDataSource baseDataSource, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = allocatorAllocationNode;
            this.AudioAttributesCompatParcelizer = baseDataSource;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            int i = SchemaListViewModel.onCommand.read();
            int i2 = SchemaListViewModel.onCommand.read();
            int i3 = SchemaListViewModel.onCommand.read();
            return (SampleVideos) IconCompatParcelizer(SchemaListViewModel.onCommand.read(), 190134789, i, -190134787, i3, new Object[]{this, obj, sampleVideos}, i2);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int i = SchemaListViewModel.onCommand.read();
            int i2 = SchemaListViewModel.onCommand.read();
            int i3 = SchemaListViewModel.onCommand.read();
            return IconCompatParcelizer(SchemaListViewModel.onCommand.read(), -1083287538, i, 1083287541, i3, new Object[]{this, topUserCompanion, sampleVideos}, i2);
        }

        private Object read(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int i = SchemaListViewModel.onCommand.read();
            int i2 = SchemaListViewModel.onCommand.read();
            int i3 = SchemaListViewModel.onCommand.read();
            return IconCompatParcelizer(SchemaListViewModel.onCommand.read(), 189202162, i, -189202162, i3, new Object[]{this, topUserCompanion, sampleVideos}, i2);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int i = SchemaListViewModel.onCommand.read();
            int i2 = SchemaListViewModel.onCommand.read();
            int i3 = SchemaListViewModel.onCommand.read();
            return IconCompatParcelizer(SchemaListViewModel.onCommand.read(), -1767638945, i, 1767638946, i3, new Object[]{this, obj}, i2);
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            getShowPopup getshowpopup;
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            TopUserCompanion topUserCompanion = (TopUserCompanion) objArr[1];
            SampleVideos<?> sampleVideos = (SampleVideos) objArr[2];
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 & 107;
            int i4 = (i2 ^ 107) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            read = i5 % 128;
            int i6 = i5 % 2;
            IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) iconCompatParcelizer.create(topUserCompanion, sampleVideos);
            if (i6 != 0) {
                getshowpopup = getShowPopup.INSTANCE;
                int i7 = 93 / 0;
            } else {
                getshowpopup = getShowPopup.INSTANCE;
            }
            int i8 = SchemaListViewModel.onCommand.read();
            int i9 = SchemaListViewModel.onCommand.read();
            int i10 = SchemaListViewModel.onCommand.read();
            Object objIconCompatParcelizer = IconCompatParcelizer(SchemaListViewModel.onCommand.read(), -1767638945, i8, 1767638946, i10, new Object[]{iconCompatParcelizer2, getshowpopup}, i9);
            int i11 = read;
            int i12 = i11 & 103;
            int i13 = -(-((i11 ^ 103) | i12));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            RemoteActionCompatParcelizer = i14 % 128;
            int i15 = i14 % 2;
            return objIconCompatParcelizer;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(iconCompatParcelizer.write, iconCompatParcelizer.AudioAttributesCompatParcelizer, (SampleVideos) objArr[2]);
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 & 87;
            int i4 = -(-(i2 | 87));
            int i5 = (i3 & i4) + (i3 | i4);
            read = i5 % 128;
            IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer2;
            if (i5 % 2 != 0) {
                int i6 = 86 / 0;
            }
            int i7 = ((i2 & (-8)) | ((~i2) & 7)) + ((i2 & 7) << 1);
            read = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 16 / 0;
            }
            return iconCompatParcelizer3;
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 & 7;
            int i4 = (i2 | 7) & (~i3);
            int i5 = i3 << 1;
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            int i8 = SchemaListViewModel.onCommand.read();
            int i9 = SchemaListViewModel.onCommand.read();
            int i10 = SchemaListViewModel.onCommand.read();
            Object objIconCompatParcelizer = IconCompatParcelizer(SchemaListViewModel.onCommand.read(), 189202162, i8, -189202162, i10, new Object[]{iconCompatParcelizer, (TopUserCompanion) obj, (SampleVideos) obj2}, i9);
            int i11 = RemoteActionCompatParcelizer;
            int i12 = (i11 & 71) + (i11 | 71);
            read = i12 % 128;
            int i13 = i12 % 2;
            return objIconCompatParcelizer;
        }
    }
}
