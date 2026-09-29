package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.getTappableElementInsets;
import kotlin.isVisible;
import kotlin.setOverriddenInsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lo/writeFieldName;", "", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "p4", "<init>", "(FFFFFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "Lo/inset;", "Lo/parseDouble;", "RemoteActionCompatParcelizer", "(ZLo/inset;Lo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;", "AudioAttributesCompatParcelizer", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "read", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class writeFieldName {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float IconCompatParcelizer;
    private final float write;

    private writeFieldName(float f, float f2, float f3, float f4, float f5) {
        this.read = f;
        this.RemoteActionCompatParcelizer = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.write = f4;
        this.IconCompatParcelizer = f5;
    }

    public final parseDouble<assignParameter> RemoteActionCompatParcelizer(boolean z, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-2045116089, i, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:939)");
        }
        parseDouble<assignParameter> parsedoubleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(z, insetVar, _handleunrecognizedcharacterescape, i & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedoubleAudioAttributesCompatParcelizer;
    }

    private final parseDouble<assignParameter> AudioAttributesCompatParcelizer(boolean z, inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        float f;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1312510462, i, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:947)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = _qbuf.write();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objOnPause;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(insetVar)) || (i & 48) == 32;
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (z3 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = (MagicModuleSubmissionRequestBody) new write(insetVar, snapshotStateList, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        StreamReadException.IconCompatParcelizer(insetVar, (MagicModuleSubmissionRequestBody) objOnPause2, _handleunrecognizedcharacterescape, (i >> 3) & 14);
        isRound isround = (isRound) IntermediateLoginResponseBody.MediaMetadataCompat((List) snapshotStateList);
        if (!z) {
            f = this.IconCompatParcelizer;
        } else if (isround instanceof setOverriddenInsets.read) {
            f = this.RemoteActionCompatParcelizer;
        } else if (isround instanceof isVisible.read) {
            f = this.write;
        } else {
            f = isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer ? this.AudioAttributesCompatParcelizer : this.read;
        }
        float f2 = f;
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = new LinearLayoutCompat(assignParameter.read(f2), hitCount.write(assignParameter.INSTANCE), null, null, 12, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objOnPause3;
        assignParameter assignparameter = assignParameter.read(f2);
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(linearLayoutCompat);
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(f2);
        boolean z4 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z)) || (i & 6) == 4;
        if ((((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) <= 256 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(this)) && (i & RendererCapabilities.MODE_SUPPORT_MASK) != 256) {
            z2 = false;
        }
        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isround);
        Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer | zIconCompatParcelizer2 | z4 | z2 | zIconCompatParcelizer3) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause4 = (MagicModuleSubmissionRequestBody) new IconCompatParcelizer(linearLayoutCompat, f2, z, this, isround, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
        }
        StreamReadException.IconCompatParcelizer(assignparameter, (MagicModuleSubmissionRequestBody) objOnPause4, _handleunrecognizedcharacterescape, 0);
        parseDouble<assignParameter> parsedouble = linearLayoutCompat.read();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedouble;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ SnapshotStateList<isRound> AudioAttributesCompatParcelizer;
        final /* synthetic */ inset IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<isRound> newNumberOtpResendRequestAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
                final SnapshotStateList<isRound> snapshotStateList = this.AudioAttributesCompatParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.writeFieldName.write.2
                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                    public final Object IconCompatParcelizer(isRound isround, SampleVideos<? super getShowPopup> sampleVideos) {
                        if (isround instanceof isVisible.read) {
                            snapshotStateList.add(isround);
                        } else if (isround instanceof isVisible.IconCompatParcelizer) {
                            snapshotStateList.remove(((isVisible.IconCompatParcelizer) isround).getWrite());
                        } else if (isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer) {
                            snapshotStateList.add(isround);
                        } else if (isround instanceof getTappableElementInsets.AudioAttributesCompatParcelizer) {
                            snapshotStateList.remove(((getTappableElementInsets.AudioAttributesCompatParcelizer) isround).getRemoteActionCompatParcelizer());
                        } else if (isround instanceof setOverriddenInsets.read) {
                            snapshotStateList.add(isround);
                        } else if (isround instanceof setOverriddenInsets.write) {
                            snapshotStateList.remove(((setOverriddenInsets.write) isround).getRead());
                        } else if (isround instanceof setOverriddenInsets.IconCompatParcelizer) {
                            snapshotStateList.remove(((setOverriddenInsets.IconCompatParcelizer) isround).getRemoteActionCompatParcelizer());
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(inset insetVar, SnapshotStateList<isRound> snapshotStateList, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = insetVar;
            this.AudioAttributesCompatParcelizer = snapshotStateList;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ float IconCompatParcelizer;
        final /* synthetic */ writeFieldName MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ isRound RemoteActionCompatParcelizer;
        final /* synthetic */ LinearLayoutCompat<assignParameter, setHoverListener> read;
        final /* synthetic */ boolean write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            if (r6.read.read(kotlin.assignParameter.read(r6.IconCompatParcelizer), r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
        
            if (kotlin.writeObjectFieldValueSeparator.IconCompatParcelizer(r6.read, r6.IconCompatParcelizer, r3, r6.RemoteActionCompatParcelizer, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
        
            return r0;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.AudioAttributesCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto Lae
            L1c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r7 = r6.read
                java.lang.Object r7 = r7.write()
                o.assignParameter r7 = (kotlin.assignParameter) r7
                float r7 = r7.getRemoteActionCompatParcelizer()
                float r1 = r6.IconCompatParcelizer
                boolean r7 = kotlin.assignParameter.IconCompatParcelizer(r7, r1)
                if (r7 != 0) goto Lae
                boolean r7 = r6.write
                if (r7 != 0) goto L4b
                o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r7 = r6.read
                float r1 = r6.IconCompatParcelizer
                o.assignParameter r1 = kotlin.assignParameter.read(r1)
                r2 = r6
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r6.AudioAttributesCompatParcelizer = r3
                java.lang.Object r6 = r7.read(r1, r2)
                if (r6 != r0) goto Lae
                goto Lad
            L4b:
                o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r7 = r6.read
                java.lang.Object r7 = r7.write()
                o.assignParameter r7 = (kotlin.assignParameter) r7
                float r7 = r7.getRemoteActionCompatParcelizer()
                o.writeFieldName r1 = r6.MediaBrowserCompatCustomActionResultReceiver
                float r1 = kotlin.writeFieldName.RemoteActionCompatParcelizer(r1)
                boolean r1 = kotlin.assignParameter.IconCompatParcelizer(r7, r1)
                r3 = 0
                if (r1 == 0) goto L73
                o.setOverriddenInsets$read r7 = new o.setOverriddenInsets$read
                o.getReferencedType$RemoteActionCompatParcelizer r1 = kotlin.getReferencedType.INSTANCE
                long r4 = r1.write()
                r7.<init>(r4, r3)
                r3 = r7
                o.isRound r3 = (kotlin.isRound) r3
                goto L9c
            L73:
                o.writeFieldName r1 = r6.MediaBrowserCompatCustomActionResultReceiver
                float r1 = kotlin.writeFieldName.write(r1)
                boolean r1 = kotlin.assignParameter.IconCompatParcelizer(r7, r1)
                if (r1 == 0) goto L88
                o.isVisible$read r7 = new o.isVisible$read
                r7.<init>()
                r3 = r7
                o.isRound r3 = (kotlin.isRound) r3
                goto L9c
            L88:
                o.writeFieldName r1 = r6.MediaBrowserCompatCustomActionResultReceiver
                float r1 = kotlin.writeFieldName.AudioAttributesCompatParcelizer(r1)
                boolean r7 = kotlin.assignParameter.IconCompatParcelizer(r7, r1)
                if (r7 == 0) goto L9c
                o.getTappableElementInsets$RemoteActionCompatParcelizer r7 = new o.getTappableElementInsets$RemoteActionCompatParcelizer
                r7.<init>()
                r3 = r7
                o.isRound r3 = (kotlin.isRound) r3
            L9c:
                o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r7 = r6.read
                float r1 = r6.IconCompatParcelizer
                o.isRound r4 = r6.RemoteActionCompatParcelizer
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.AudioAttributesCompatParcelizer = r2
                java.lang.Object r6 = kotlin.writeObjectFieldValueSeparator.IconCompatParcelizer(r7, r1, r3, r4, r5)
                if (r6 != r0) goto Lae
            Lad:
                return r0
            Lae:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.writeFieldName.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(LinearLayoutCompat<assignParameter, setHoverListener> linearLayoutCompat, float f, boolean z, writeFieldName writefieldname, isRound isround, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = linearLayoutCompat;
            this.IconCompatParcelizer = f;
            this.write = z;
            this.MediaBrowserCompatCustomActionResultReceiver = writefieldname;
            this.RemoteActionCompatParcelizer = isround;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.read, this.IconCompatParcelizer, this.write, this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof writeFieldName)) {
            return false;
        }
        writeFieldName writefieldname = (writeFieldName) p0;
        return assignParameter.IconCompatParcelizer(this.read, writefieldname.read) && assignParameter.IconCompatParcelizer(this.RemoteActionCompatParcelizer, writefieldname.RemoteActionCompatParcelizer) && assignParameter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, writefieldname.AudioAttributesCompatParcelizer) && assignParameter.IconCompatParcelizer(this.write, writefieldname.write) && assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, writefieldname.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.read);
        int iAudioAttributesCompatParcelizer2 = assignParameter.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        return (((((((iAudioAttributesCompatParcelizer * 31) + iAudioAttributesCompatParcelizer2) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.write)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public /* synthetic */ writeFieldName(float f, float f2, float f3, float f4, float f5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4, f5);
    }
}
