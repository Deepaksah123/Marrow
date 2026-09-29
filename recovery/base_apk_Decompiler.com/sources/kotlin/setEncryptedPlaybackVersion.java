package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setEncryptedPlaybackVersion {
    private static final accessgetVideoConfigurationC2cp IconCompatParcelizer = new accessgetVideoConfigurationC2cp("UNDEFINED");
    public static final accessgetVideoConfigurationC2cp write = new accessgetVideoConfigurationC2cp("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[Catch: all -> 0x00b4, DONT_GENERATE, TryCatch #0 {all -> 0x00b4, blocks: (B:13:0x0046, B:15:0x0056, B:17:0x005c, B:28:0x00a0, B:18:0x0078, B:20:0x0088, B:25:0x0097, B:27:0x009d, B:33:0x00aa, B:36:0x00b3, B:35:0x00b0, B:23:0x008e), top: B:46:0x0046, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void read(kotlin.SampleVideos<? super T> r7, java.lang.Object r8) {
        /*
            boolean r0 = r7 instanceof kotlin.setInternetConnected
            if (r0 == 0) goto Lc1
            o.setInternetConnected r7 = (kotlin.setInternetConnected) r7
            java.lang.Object r0 = kotlin.setUserStartedTimestampMs.write(r8)
            o.getPlatform r1 = r7.AudioAttributesCompatParcelizer
            o.CurrentQuery r2 = r7.getWrite()
            boolean r1 = r1.IconCompatParcelizer(r2)
            r2 = 1
            if (r1 == 0) goto L27
            r7.write = r0
            r7.RemoteActionCompatParcelizer = r2
            o.getPlatform r8 = r7.AudioAttributesCompatParcelizer
            o.CurrentQuery r0 = r7.getWrite()
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r8.RemoteActionCompatParcelizer(r0, r7)
            return
        L27:
            kotlin.getCollegeId.write()
            o.getAddLine2 r1 = kotlin.getAddLine2.RemoteActionCompatParcelizer
            o.CollegeJsonParser r1 = kotlin.getAddLine2.read()
            boolean r3 = r1.read()
            if (r3 == 0) goto L40
            r7.write = r0
            r7.RemoteActionCompatParcelizer = r2
            o.setCollegeName r7 = (kotlin.setCollegeName) r7
            r1.RemoteActionCompatParcelizer(r7)
            return
        L40:
            r0 = r7
            o.setCollegeName r0 = (kotlin.setCollegeName) r0
            r1.read(r2)
            o.CurrentQuery r3 = r7.getWrite()     // Catch: java.lang.Throwable -> Lb4
            o.setPassingYear$write r4 = kotlin.setPassingYear.b_     // Catch: java.lang.Throwable -> Lb4
            o.CurrentQuery$IconCompatParcelizer r4 = (o.CurrentQuery.IconCompatParcelizer) r4     // Catch: java.lang.Throwable -> Lb4
            o.CurrentQuery$write r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Lb4
            o.setPassingYear r3 = (kotlin.setPassingYear) r3     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto L78
            boolean r4 = r3.read()     // Catch: java.lang.Throwable -> Lb4
            if (r4 != 0) goto L78
            java.util.concurrent.CancellationException r8 = r3.MediaBrowserCompatItemReceiver()     // Catch: java.lang.Throwable -> Lb4
            r3 = r8
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> Lb4
            r7.IconCompatParcelizer(r3)     // Catch: java.lang.Throwable -> Lb4
            o.SampleVideos r7 = (kotlin.SampleVideos) r7     // Catch: java.lang.Throwable -> Lb4
            o.getRfBanners$IconCompatParcelizer r3 = kotlin.C0177getRfBanners.IconCompatParcelizer     // Catch: java.lang.Throwable -> Lb4
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r8 = kotlin.SdkPayloadData.write(r8)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r8 = kotlin.C0177getRfBanners.read(r8)     // Catch: java.lang.Throwable -> Lb4
            r7.resumeWith(r8)     // Catch: java.lang.Throwable -> Lb4
            goto La0
        L78:
            o.SampleVideos<T> r3 = r7.read     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r4 = r7.IconCompatParcelizer     // Catch: java.lang.Throwable -> Lb4
            o.CurrentQuery r5 = r3.getWrite()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r4 = kotlin.getBufferMultiplier.RemoteActionCompatParcelizer(r5, r4)     // Catch: java.lang.Throwable -> Lb4
            o.accessgetVideoConfigurationC2cp r6 = kotlin.getBufferMultiplier.read     // Catch: java.lang.Throwable -> Lb4
            if (r4 == r6) goto L8d
            o.NestfgetmNationalNumber r3 = kotlin.TestStat.read(r3, r5, r4)     // Catch: java.lang.Throwable -> Lb4
            goto L8e
        L8d:
            r3 = 0
        L8e:
            o.SampleVideos<T> r7 = r7.read     // Catch: java.lang.Throwable -> La7
            r7.resumeWith(r8)     // Catch: java.lang.Throwable -> La7
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto L9d
            boolean r7 = r3.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Lb4
            if (r7 == 0) goto La0
        L9d:
            kotlin.getBufferMultiplier.AudioAttributesCompatParcelizer(r5, r4)     // Catch: java.lang.Throwable -> Lb4
        La0:
            boolean r7 = r1.MediaBrowserCompatCustomActionResultReceiver()     // Catch: java.lang.Throwable -> Lb4
            if (r7 != 0) goto La0
            goto Lb8
        La7:
            r7 = move-exception
            if (r3 == 0) goto Lb0
            boolean r8 = r3.AudioAttributesImplApi26Parcelizer()     // Catch: java.lang.Throwable -> Lb4
            if (r8 == 0) goto Lb3
        Lb0:
            kotlin.getBufferMultiplier.AudioAttributesCompatParcelizer(r5, r4)     // Catch: java.lang.Throwable -> Lb4
        Lb3:
            throw r7     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r7 = move-exception
            r0.RemoteActionCompatParcelizer(r7)     // Catch: java.lang.Throwable -> Lbc
        Lb8:
            r1.AudioAttributesCompatParcelizer(r2)
            return
        Lbc:
            r7 = move-exception
            r1.AudioAttributesCompatParcelizer(r2)
            throw r7
        Lc1:
            r7.resumeWith(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setEncryptedPlaybackVersion.read(o.SampleVideos, java.lang.Object):void");
    }

    public static final boolean write(setInternetConnected<? super getShowPopup> setinternetconnected) {
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        getCollegeId.write();
        getAddLine2 getaddline2 = getAddLine2.RemoteActionCompatParcelizer;
        CollegeJsonParser collegeJsonParser = getAddLine2.read();
        if (collegeJsonParser.AudioAttributesImplApi21Parcelizer()) {
            return false;
        }
        if (collegeJsonParser.read()) {
            setinternetconnected.write = getshowpopup;
            setinternetconnected.RemoteActionCompatParcelizer = 1;
            collegeJsonParser.RemoteActionCompatParcelizer((setCollegeName<?>) setinternetconnected);
            return true;
        }
        setInternetConnected<? super getShowPopup> setinternetconnected2 = setinternetconnected;
        collegeJsonParser.read(true);
        try {
            setinternetconnected.run();
            do {
            } while (collegeJsonParser.MediaBrowserCompatCustomActionResultReceiver());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
