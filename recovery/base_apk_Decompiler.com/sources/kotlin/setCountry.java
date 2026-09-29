package kotlin;

import kotlin.CurrentQuery;
import kotlin.getTestPattern;

/* JADX INFO: loaded from: classes4.dex */
public final class setCountry {

    static final class write extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return setCountry.RemoteActionCompatParcelizer(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<?> r4) {
        /*
            boolean r0 = r4 instanceof o.setCountry.write
            if (r0 == 0) goto L14
            r0 = r4
            o.setCountry$write r0 = (o.setCountry.write) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r4 = r0.RemoteActionCompatParcelizer
            int r4 = r4 + r2
            r0.RemoteActionCompatParcelizer = r4
            goto L19
        L14:
            o.setCountry$write r0 = new o.setCountry$write
            r0.<init>(r4)
        L19:
            java.lang.Object r4 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r4)
            goto L58
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r4)
            r0.RemoteActionCompatParcelizer = r3
            o.SampleVideos r0 = (kotlin.SampleVideos) r0
            o.setStateSolvedCount r4 = new o.setStateSolvedCount
            o.SampleVideos r2 = kotlin.getYear.IconCompatParcelizer(r0)
            r4.<init>(r2, r3)
            r4.MediaBrowserCompatCustomActionResultReceiver()
            r2 = r4
            o.setStateRank r2 = (kotlin.setStateRank) r2
            java.lang.Object r4 = r4.AudioAttributesCompatParcelizer()
            java.lang.Object r2 = kotlin.getYear.IconCompatParcelizer()
            if (r4 != r2) goto L55
            kotlin.getAnsweredMcqCount.write(r0)
        L55:
            if (r4 != r1) goto L58
            return r1
        L58:
            o.PlanDetailsCreator r4 = new o.PlanDetailsCreator
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCountry.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    public static final Object IconCompatParcelizer(long j, SampleVideos<? super getShowPopup> sampleVideos) {
        if (j <= 0) {
            return getShowPopup.INSTANCE;
        }
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        if (j < Long.MAX_VALUE) {
            read(setstatesolvedcount2.getWrite()).write(j, setstatesolvedcount2);
        }
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    public static final Object RemoteActionCompatParcelizer(long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = IconCompatParcelizer(write(j), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    public static final getCurrentYear read(CurrentQuery currentQuery) {
        CurrentQuery.write writeVar = currentQuery.get(getPlaybackInterval.INSTANCE);
        getCurrentYear getcurrentyear = writeVar instanceof getCurrentYear ? (getCurrentYear) writeVar : null;
        return getcurrentyear == null ? getVerifiedOn.AudioAttributesCompatParcelizer() : getcurrentyear;
    }

    public static final long write(long j) {
        boolean zAudioAttributesImplApi26Parcelizer = getTestPattern.AudioAttributesImplApi26Parcelizer(j);
        if (zAudioAttributesImplApi26Parcelizer) {
            getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
            return getTestPattern.read(getTestPattern.RemoteActionCompatParcelizer(j, getUserSubmissionTimestamp.read(999999L, isAnonymous.read)));
        }
        if (zAudioAttributesImplApi26Parcelizer) {
            throw new RenewEligibleCreator();
        }
        return 0L;
    }
}
